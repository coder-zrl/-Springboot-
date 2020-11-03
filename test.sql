/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 03/11/2020 00:56:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`account`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('001', 'b', '123456', '10086', 'customer');
INSERT INTO `user` VALUES ('002', 'a', '123456', '10010', 'adm');
COMMIT;

-- ----------------------------
-- Table structure for veg
-- ----------------------------
DROP TABLE IF EXISTS `veg`;
CREATE TABLE `veg` (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of veg
-- ----------------------------
BEGIN;
INSERT INTO `veg` VALUES ('白菜', 1.50);
INSERT INTO `veg` VALUES ('土豆', 1.70);
INSERT INTO `veg` VALUES ('番茄', 2.00);
INSERT INTO `veg` VALUES ('c', 50.00);
INSERT INTO `veg` VALUES ('111', 12.00);
INSERT INTO `veg` VALUES ('ww', 11111.00);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
