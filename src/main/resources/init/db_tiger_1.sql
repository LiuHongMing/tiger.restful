
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for T_USER
-- ----------------------------
DROP TABLE IF EXISTS `T_USER`;
CREATE TABLE `T_USER` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(50) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for T_BOOK
-- ----------------------------
DROP TABLE IF EXISTS `T_BOOK`;
CREATE TABLE `T_BOOK` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
