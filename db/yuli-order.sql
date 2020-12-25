/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : yuli-order

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 25/12/2020 21:07:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编号',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (34, 'A1111', NULL, '2020-12-25 18:24:11', '2020-12-25 18:24:11', NULL);
INSERT INTO `tb_order` VALUES (36, 'A2222', NULL, '2020-12-25 18:45:07', '2020-12-25 18:45:07', NULL);

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `context` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime(0) NOT NULL,
  `log_modified` datetime(0) NOT NULL,
  `ext` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `ux_undo_log`(`xid`, `branch_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of undo_log
-- ----------------------------
INSERT INTO `undo_log` VALUES (49, 85806747709034497, '192.168.0.117:8091:85806747570622464', 'serializer=jackson', 0x7B7D, 1, '2020-12-25 18:45:23', '2020-12-25 18:45:23', NULL);
INSERT INTO `undo_log` VALUES (50, 85806747654508545, '192.168.0.117:8091:85806747570622464', 'serializer=jackson', 0x7B7D, 1, '2020-12-25 18:45:23', '2020-12-25 18:45:23', NULL);
INSERT INTO `undo_log` VALUES (54, 85807235439480833, '192.168.0.117:8091:85807232922898432', 'serializer=jackson', 0x7B7D, 1, '2020-12-25 18:47:19', '2020-12-25 18:47:19', NULL);
INSERT INTO `undo_log` VALUES (55, 85807235175239681, '192.168.0.117:8091:85807232922898432', 'serializer=jackson', 0x7B7D, 1, '2020-12-25 18:47:19', '2020-12-25 18:47:19', NULL);

SET FOREIGN_KEY_CHECKS = 1;
