/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : sc

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 09/05/2022 12:51:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sc_classification
-- ----------------------------
DROP TABLE IF EXISTS `sc_classification`;
CREATE TABLE `sc_classification`  (
  `classification_id` int(0) NOT NULL AUTO_INCREMENT,
  `classification_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classification_instructions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classification_dispose` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classification_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`classification_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_classification
-- ----------------------------
INSERT INTO `sc_classification` VALUES (1, '可回收垃圾', '废纸张、废塑料、废玻璃制品、废金属、废织物等适宜回收、可循环利用的生活废弃物。', '轻投轻放；清洁干燥，避免污染；废纸尽量平整；立体包装物请清空内容物，清洁后压扁投放；有尖锐边角的，应包裹后投放', '报纸、纸箱、书本、纸袋、塑料瓶、玩具、油桶、食品保鲜盒、衣架、酒瓶、玻璃杯、易拉罐、锅、螺丝刀、衣物、包、毛绒玩具');
INSERT INTO `sc_classification` VALUES (2, '有害垃圾', '对人体健康或自然环境造成直接或潜在的危害废弃物', '充电电池、纽扣电池、蓄电池投放时应注意轻放；油漆桶、杀虫剂如有残留请密闭后投放；荧光灯、节能灯易破连带包装或包裹后投放；废药品及其包装一并投放', '电池类、荧光灯管类、过期药物、药品包装、废油漆桶、水银温度计、消毒剂、老鼠药、杀虫喷雾');
INSERT INTO `sc_classification` VALUES (3, '湿垃圾', '又称“厨余垃圾”，日常生活垃圾生产的容易腐烂的生物质废物', '餐厨垃圾应沥干水分后再投放，有包装物的应取出后分类投放；大块骨头和椰子壳、榴莲壳等不易生化降解，作为干垃圾进行投放；纯液体(如牛奶等)，可直接倒入下水口', '剩菜剩饭、面包、鸡肉、干果仁、蔬菜、动物内脏、果核果皮、鸡蛋及蛋壳、大米及豆类、中药药渣、动物饲料');
INSERT INTO `sc_classification` VALUES (4, '干垃圾', '又称“其他垃圾”，除有害垃圾、可回收物、湿垃圾以外的生活废弃物', '尽量沥干水分；难以辨别的生活垃圾应投入干垃圾容器内', '餐巾纸、纸巾、纸尿裤、烟蒂、胶带、橡皮泥、创可贴、灰土、塑料袋、防碎气泡膜');

-- ----------------------------
-- Table structure for sc_health
-- ----------------------------
DROP TABLE IF EXISTS `sc_health`;
CREATE TABLE `sc_health`  (
  `health_id` date NOT NULL,
  `health_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `health_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_temperature` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_otherstatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_istouch` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_adree` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `health_matter` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`health_id`, `health_ids`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_health
-- ----------------------------
INSERT INTO `sc_health` VALUES ('2022-04-01', '7', '张三', '38.3', '健康', '健康', '0', '86-110', '陕西省', NULL, 'TRUE,TRUE');
INSERT INTO `sc_health` VALUES ('2022-04-16', '2', '张开基', '35.6', '健康,其他', '健康,其他', '0', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '好！为了疫情防控，183269863887！', 'TRUE,TRUE');
INSERT INTO `sc_health` VALUES ('2022-04-22', '2', '张开基', '36.1', '健康', '健康', '0', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '无', 'TRUE,TRUE');

-- ----------------------------
-- Table structure for sc_order
-- ----------------------------
DROP TABLE IF EXISTS `sc_order`;
CREATE TABLE `sc_order`  (
  `order_uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_time` date NULL DEFAULT NULL,
  `order_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_state` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`order_uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_order
-- ----------------------------
INSERT INTO `sc_order` VALUES ('UUID20220427001', '张开基', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '2022-04-27', '有大量纸箱和塑料瓶，请尽快前来收购。', '0');
INSERT INTO `sc_order` VALUES ('UUID20220427002', '张开基', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '2022-01-01', '急需收废品', '0');

-- ----------------------------
-- Table structure for sc_residents
-- ----------------------------
DROP TABLE IF EXISTS `sc_residents`;
CREATE TABLE `sc_residents`  (
  `residents_id` int(0) NOT NULL,
  `residents_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_identity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_security` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `residents_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`residents_id`) USING BTREE,
  INDEX `residents_name`(`residents_name`) USING BTREE,
  INDEX `residents_password`(`residents_password`) USING BTREE,
  INDEX `residents_identity`(`residents_identity`) USING BTREE,
  CONSTRAINT `id` FOREIGN KEY (`residents_id`) REFERENCES `sc_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sc_residents_ibfk_3` FOREIGN KEY (`residents_identity`) REFERENCES `sc_user` (`user_identity`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_residents
-- ----------------------------
INSERT INTO `sc_residents` VALUES (2, '张开基', '123', '1', '陕西省岚皋县城关镇海星巷6号', '86-13512345678', 'user', '1', '2022-04-12');
INSERT INTO `sc_residents` VALUES (3, '付鑫沙', 'MiN.#0911', '1', '一单元三栋九楼902室', '86-18329863887', 'user', '0', '2022-03-01');
INSERT INTO `sc_residents` VALUES (5, 'zero01', '123', '0', '三单元二栋五楼501室', '86-188', 'user', '0', '2022-03-02');
INSERT INTO `sc_residents` VALUES (6, 'zero02', '123', '0', '九单元四栋三楼303室', '86-132', 'user', '0', '2022-03-03');
INSERT INTO `sc_residents` VALUES (7, '张三', '123', '1', '一单元一栋一楼104室', '86-173', 'user', '0', '2022-03-04');
INSERT INTO `sc_residents` VALUES (8, '李四', '123', '1', '六单元三栋十三楼1302室', '86-171', 'user', '0', '2022-03-05');
INSERT INTO `sc_residents` VALUES (9, '王五', '123', '1', '十二单元三栋二十一楼2101室', '86-123', 'user', '0', '2022-03-06');
INSERT INTO `sc_residents` VALUES (10, '赵六', '123', '1', '二十单元四栋五楼503室', '86-18329863887', 'user', '1', '2022-04-06');

-- ----------------------------
-- Table structure for sc_rubbish
-- ----------------------------
DROP TABLE IF EXISTS `sc_rubbish`;
CREATE TABLE `sc_rubbish`  (
  `rubbish_id` int(0) NOT NULL AUTO_INCREMENT,
  `rubbish_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `rubbish_fyid` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`rubbish_id`) USING BTREE,
  INDEX `垃圾分类`(`rubbish_fyid`) USING BTREE,
  CONSTRAINT `垃圾分类` FOREIGN KEY (`rubbish_fyid`) REFERENCES `sc_classification` (`classification_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_rubbish
-- ----------------------------
INSERT INTO `sc_rubbish` VALUES (1, '剩菜剩饭', 3);
INSERT INTO `sc_rubbish` VALUES (2, '苹果核', 3);
INSERT INTO `sc_rubbish` VALUES (3, '中药残渣', 3);
INSERT INTO `sc_rubbish` VALUES (4, '塑料瓶', 1);
INSERT INTO `sc_rubbish` VALUES (5, '废纸废金属', 1);
INSERT INTO `sc_rubbish` VALUES (6, '旧衣物', 1);
INSERT INTO `sc_rubbish` VALUES (7, '废电池', 2);
INSERT INTO `sc_rubbish` VALUES (8, '废油漆', 2);
INSERT INTO `sc_rubbish` VALUES (9, '过期药物', 2);
INSERT INTO `sc_rubbish` VALUES (10, '纸巾', 4);
INSERT INTO `sc_rubbish` VALUES (11, '尿不湿', 4);
INSERT INTO `sc_rubbish` VALUES (12, '烟蒂', 4);

-- ----------------------------
-- Table structure for sc_user
-- ----------------------------
DROP TABLE IF EXISTS `sc_user`;
CREATE TABLE `sc_user`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_identity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `user_name`(`user_name`) USING BTREE,
  INDEX `user_pass`(`user_pass`) USING BTREE,
  INDEX `user_identity`(`user_identity`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_user
-- ----------------------------
INSERT INTO `sc_user` VALUES (1, 'admin', 'admin', 'admin');
INSERT INTO `sc_user` VALUES (2, 'user', 'user', 'user');
INSERT INTO `sc_user` VALUES (3, '付鑫沙', 'MiN.#0911', 'user');
INSERT INTO `sc_user` VALUES (4, '张三丰', '10086', 'admin');
INSERT INTO `sc_user` VALUES (5, 'zero01', '123', 'user');
INSERT INTO `sc_user` VALUES (6, 'zero02', '123', 'user');
INSERT INTO `sc_user` VALUES (7, '张三', '123', 'user');
INSERT INTO `sc_user` VALUES (8, '李四', '123', 'user');
INSERT INTO `sc_user` VALUES (9, '王五', '123', 'user');
INSERT INTO `sc_user` VALUES (10, '赵六', '123', 'user');

-- ----------------------------
-- Table structure for sc_vaccination
-- ----------------------------
DROP TABLE IF EXISTS `sc_vaccination`;
CREATE TABLE `sc_vaccination`  (
  `vaccination_id` int(0) NOT NULL,
  `vaccination_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_first` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_firstTime` date NULL DEFAULT NULL,
  `vaccination_second` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_secondTime` date NULL DEFAULT NULL,
  `vaccination_third` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vaccination_thirdTime` date NULL DEFAULT NULL,
  PRIMARY KEY (`vaccination_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_vaccination
-- ----------------------------
INSERT INTO `sc_vaccination` VALUES (2, '张开基', '1', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '1', '2022-04-22', '1', '2022-04-22', '1', '2022-04-22');

-- ----------------------------
-- Table structure for sc_visit
-- ----------------------------
DROP TABLE IF EXISTS `sc_visit`;
CREATE TABLE `sc_visit`  (
  `visit_id` date NOT NULL,
  `visit_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `visit_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `visit_state` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`visit_id`, `visit_ids`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc_visit
-- ----------------------------
INSERT INTO `sc_visit` VALUES ('2022-01-01', '2', '张开基', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', 'user-index', '3', '0');
INSERT INTO `sc_visit` VALUES ('2022-04-13', '2', '张开基', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '疫情原因', '6', '0');
INSERT INTO `sc_visit` VALUES ('2022-04-16', '2', '张开基', '86-13512345678', '陕西省岚皋县城关镇海星巷6号', '疫情防控，志愿者', '3', '0');

SET FOREIGN_KEY_CHECKS = 1;
