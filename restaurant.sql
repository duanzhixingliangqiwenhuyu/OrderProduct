/*
Navicat MySQL Data Transfer

Source Server         : hy
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : restaurant

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-01-22 12:49:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ctable`
-- ----------------------------
DROP TABLE IF EXISTS `ctable`;
CREATE TABLE `ctable` (
  `tb_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_num` int(11) DEFAULT NULL,
  `tb_status` int(11) DEFAULT NULL,
  `user_phone` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`tb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ctable
-- ----------------------------

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` int(8) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_picture` varchar(255) DEFAULT NULL,
  `menu_recommend` varchar(255) DEFAULT NULL,
  `menu_price` int(8) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for `myorder`
-- ----------------------------
DROP TABLE IF EXISTS `myorder`;
CREATE TABLE `myorder` (
  `order_id` int(8) NOT NULL AUTO_INCREMENT,
  `order_man_num` int(8) DEFAULT NULL,
  `order_predict` varchar(255) DEFAULT NULL,
  `order_start` varchar(255) DEFAULT NULL,
  `order_end` varchar(255) DEFAULT NULL,
  `tb_id` int(8) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myorder
-- ----------------------------

-- ----------------------------
-- Table structure for `myorder_detail`
-- ----------------------------
DROP TABLE IF EXISTS `myorder_detail`;
CREATE TABLE `myorder_detail` (
  `order_detail_id` int(8) NOT NULL AUTO_INCREMENT,
  `order_id` int(8) NOT NULL DEFAULT '0',
  `menu_id` int(8) NOT NULL,
  `order_menu_num` int(8) NOT NULL,
  PRIMARY KEY (`order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myorder_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_phone` varchar(255) NOT NULL DEFAULT '',
  `user_password` varchar(255) DEFAULT NULL,
  `user_status` int(8) DEFAULT NULL,
  PRIMARY KEY (`user_phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
