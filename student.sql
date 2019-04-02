/*
 Navicat Premium Data Transfer

 Source Server         : 10.36.137.43_3306
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : 10.36.137.43:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 02/04/2019 21:42:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `cid` bigint(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (1, 'java1809');
INSERT INTO `room` VALUES (2, 'java1810');
INSERT INTO `room` VALUES (3, 'H51812');
INSERT INTO `room` VALUES (4, 'java1808');
INSERT INTO `room` VALUES (5, 'UI1810');
INSERT INTO `room` VALUES (6, 'UI1811');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` bigint(20) NULL DEFAULT NULL,
  `cid` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'zs', 21, 3);
INSERT INTO `student` VALUES (2, 'ls', 22, 1);
INSERT INTO `student` VALUES (3, 'wangwu', 33, NULL);
INSERT INTO `student` VALUES (5, 'zhaoliu', 33, NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` bigint(20) NULL DEFAULT NULL,
  `cid` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, 'zs', 20, 4);
INSERT INTO `teacher` VALUES (2, 'lisi', 13, 2);
INSERT INTO `teacher` VALUES (3, 'wangwu', 18, 2);
INSERT INTO `teacher` VALUES (4, 'zhaoliu', 19, 2);

SET FOREIGN_KEY_CHECKS = 1;
