<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>餐厅管理系统</title>

</head>

<body>

	<!--内容-->
	<a href="${ctx }/test">欢迎回来</a>
	<form action="${ctx }/reservar-form" method="post" >
		<input name="phone-number" type="text" class="form-control" placeholder="手机号"></br></br>
		<input name="people-number" type="text" class="form-control" placeholder="用餐人数"></br></br>
		<input name="estimate-time" type="text" class="form-control" placeholder="预估用餐时间"></br></br>
		<p>前方还有多少桌需等待，大约多少时间</p>
		<p>显示空间布局图选择桌号</p>
		<input name="table-number" type="text" class="form-control" placeholder="桌号">
		<button name="submit-button" class="btn" type="submit">点击预约</button>
	</form>
</body>
</html>