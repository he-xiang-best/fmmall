/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : db_fmmall

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 08/07/2022 13:05:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `nickname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `realname` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `user_img` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '头像',
  `user_mobile` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `user_email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱地址',
  `user_sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别 M(男) or F(女)',
  `user_birth` date NULL DEFAULT NULL COMMENT '生日',
  `user_regtime` datetime(0) NOT NULL COMMENT '创建时间',
  `user_modtime` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户 ' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'zhangsan', 'f379eaf3c831b04de153469d1bec345e', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-15 16:10:53', '2021-04-15 16:10:53');
INSERT INTO `users` VALUES (2, 'aaaa', '1111', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 11:10:01', '2021-04-16 11:10:01');
INSERT INTO `users` VALUES (3, 'wahaha', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 15:36:52', '2021-04-16 15:36:52');
INSERT INTO `users` VALUES (4, 'heihei', '4297f44b13955235245b2497399d7a93', '二狗', NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-16 15:38:49', '2021-04-16 15:38:49');
INSERT INTO `users` VALUES (5, 'Tony', '4297f44b13955235245b2497399d7a93', '托尼', NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:25:04', '2021-04-23 10:25:04');
INSERT INTO `users` VALUES (6, 'hanmeimei', 'f379eaf3c831b04de153469d1bec345e', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:30:52', '2021-04-23 10:30:52');
INSERT INTO `users` VALUES (7, 'lilei123', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:33:03', '2021-04-23 10:33:03');
INSERT INTO `users` VALUES (8, 'tom123123', '4297f44b13955235245b2497399d7a93', NULL, NULL, 'img/default.png', NULL, NULL, NULL, NULL, '2021-04-23 10:34:49', '2021-04-23 10:34:49');

SET FOREIGN_KEY_CHECKS = 1;
