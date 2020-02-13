import pandas as pd
import numpy as np
from scipy import stats
import matplotlib.pyplot as plt
import statsmodels.api as sm
import sys


from statsmodels.tsa.stattools import adfuller
from statsmodels.tsa.arima_model import ARMA, ARIMA
import datetime


# 选择数据
def select_data(a):
# 从文件读数据
    filedata = pd.read_csv("C:/Users/XX/Desktop/bishe/hour.csv")

    # 获取列数据
    data = filedata.loc[:,['AverageNumber','EatTime']]
    # 筛选符合条件的列
    if(a!='all'):
        seclect = data[data['AverageNumber'] == a].loc[:, ['EatTime']]
        # 对筛选后的结果更新索引列使其保持有序
        seclect.reset_index(drop=True, inplace=True)
    else:
        seclect = data.loc[:,['EatTime']]
    # print(seclect)
    return seclect




# ---------------------------------------------------------

# # 数组差值（日）
# data_ret = np.diff(data)
# # print(data_ret)
#
# # 对数差值
# data_log = np.log(data)
#
# data_diff = data_log.diff(1)
# data_diff.dropna(inplace=True)

# -----------------------------------------------------------

# 数据分析
# 通过绘图进行观察


def test_data(data,w,title='test_data'):
    # window为时间窗大小，rolling().mean()表示n个连续值求均值
    roll_mean = data.rolling(window = w).mean()
    # rolling().std()表示n个连续值的标准差
    roll_std = data.rolling(window=w).std()
    # ewma表示指数加权移动，但未匹配到方法，暂时注释
    # pd_ewma = pd.ewma(data,span = w)

    # 绘图
    # 清除所有轴,但是窗口打开,这样它可以被重复使用
    plt.clf()
    # 新建画图窗口
    plt.figure()
    #背景网格线（true显示false不显示）默认为true
    plt.grid()
    #画线 第一个参数为数据，color颜色，label 名字
    plt.plot(data,color = 'blue',label = 'Original')
    plt.plot(roll_mean,color = 'red',label = 'RolloingMean')
    plt.plot(roll_std, color='black', label = 'Rolling Std')
    # plt.plot(pd_ewma, color='yellow', label='EWMA')
    # 添加图例， loc表示图例位置
    plt.legend(loc='best')
    # 添加图名
    plt.title('Rolling Mean & Standard Deviation')
    # 展示
    plt.show()

# 测试方法 绘制图像
# test_data(section[1:1000],100,title='test_org')

# -------------------------------------------------

# ADF稳定性检验
def adf_test(data):
    adftest = adfuller(data)
    adf_res = pd.Series(adftest[0:4], index=['Test Statistic','p-value','Lags Used','Number of Observations Used'])
    for key, value in adftest[4].items():
        adf_res['Critical Value (%s)' % key] = value
    # print(adftest)
    # print("--------------------------------------")
    print(adf_res)
    return adf_res
# 返回的结果的参数意义
# adf：Test statistic，T检验，假设检验值。
# 	pvalue：假设检验结果。
# 	usedlag：使用的滞后阶数。
# 	nobs：用于ADF回归和计算临界值用到的观测值数目。
# 	icbest：如果autolag不是None的话，返回最大的信息准则值。
# 	resstore：将结果合并为一个dummy。
# pvalue值接近于0，拒绝原假设

# 调用方法ADF检验
# adf_test(data_log)

# -------------------------------------------------

# ACF,PACF定阶
# ACF为自相关系数PACF为偏自相关系数
# 拖尾是指序列以指数率单调递减或震荡衰减
# 截尾是指序列从某个时点变得非常小
# 从图中可以观察出，ACF为拖尾，PACF为截尾
def draw_acf_pacf(data,w):
    plt.clf()
    fig = plt.figure()
    ax1 = fig.add_subplot(211)

    sm.graphics.tsa.plot_acf(data,ax = ax1,lags = w)
    ax2 = fig.add_subplot(212)
    sm.graphics.tsa.plot_pacf(data, ax=ax2, lags=w)
    plt.show()
# 调用方法进行定阶
# draw_acf_pacf(data_log,30)

# --------------------------------------------------------

# 调用AR模型进行预测
def draw_ar(ts, w):
    arma = ARMA(ts, order=(w,0)).fit(disp=-1)
    ts_predict = arma.predict()
    # 计算预测结果的均值
    # print(ts_predict)
    print(np.mean(ts_predict))

    # 绘图展示
    plt.clf()
    plt.plot(ts_predict, label="PDT")
    plt.plot(ts, label = "ORG")
    plt.legend(loc="best")
    plt.title("AR Test %s" % w)
    plt.show()

    # plt.savefig("./PDF/test_ar_"+ str(w) +".pdf", format='pdf')
    # 置信水平分析
    # print(arma.conf_int())

# draw_ar(select_data('all'),2)

if __name__ == '__main__':

    # a = []
    # # 接收从java传来的参数
    # for i in range(1, len(sys.argv)):
    #     a.append((int(sys.argv[i])))
    # 调用方法计算推荐序列
    a=''
    a=sys.argv[1]
    # print(a)
    draw_ar(select_data(a), 2)



















