DROP DATABASE IF EXISTS payment;
CREATE DATABASE payment;
USE payment;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for `t_payment`
-- ----------------------------
DROP TABLE IF EXISTS `t_payment`;
CREATE TABLE `t_payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `serial` varchar(200) DEFAULT NULL COMMENT '支付流水号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='支付表';