/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云服务器
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Schema         : shoppingmall

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 20/07/2021 23:26:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sm_businessman
-- ----------------------------
DROP TABLE IF EXISTS `sm_businessman`;
CREATE TABLE `sm_businessman`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '商户id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商户名字',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商户密码',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商户联系电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_businessman
-- ----------------------------
INSERT INTO `sm_businessman` VALUES (1, '黄姥爷', '123456', '13584625791');

-- ----------------------------
-- Table structure for sm_goods
-- ----------------------------
DROP TABLE IF EXISTS `sm_goods`;
CREATE TABLE `sm_goods`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品图片地址',
  `describe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '商品描述',
  `stock` bigint NULL DEFAULT NULL COMMENT '商品库存',
  `price` double(10, 2) NULL DEFAULT 0.00 COMMENT '商品价格',
  `type` bigint NOT NULL COMMENT '商品分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_goods
-- ----------------------------
INSERT INTO `sm_goods` VALUES (1, 'HUAWEI Mate 40 Pro+', 'images/goods/1.png', '跃见非凡：5nm麒麟9000旗舰芯片，超感知徕卡电影影像', 999, 8999.00, 1);
INSERT INTO `sm_goods` VALUES (2, '华为路由H6', 'images/goods/2.png', '大户型首选路由 全屋Wi-Fi6+ 超级无缝漫游 即插即用', 999, 1999.00, 2);
INSERT INTO `sm_goods` VALUES (3, '赛力斯华为智选SF5 意向金', 'images/goods/3.png', '目前可试驾城市：上海/深圳/成都/杭州/北京/广州/重庆/天津/长沙/济南/海口/台州/宜昌/徐州 更多城市将陆续开放，敬请期待！', 999, 1000.00, 3);
INSERT INTO `sm_goods` VALUES (4, 'HUAWEI Mate 40 RS保时捷设计', 'images/goods/4.png', '致敬时代：超跑基因，全面进化；璀璨人生，卓然品味；超曲环幕，纵览天地；驭领5G，续写传奇；目光所见，皆为远见。', 999, 13999.00, 1);
INSERT INTO `sm_goods` VALUES (5, 'HUAWEI Mate X2 5G', 'images/goods/5.png', '大展想象：合，续写非凡；展，开启新篇。科技大成，艺术大作；浑然一体，无缝天成；匠心独运，得心应手；“芯”之所向，所向披靡。', 999, 18999.00, 1);
INSERT INTO `sm_goods` VALUES (6, '法国2017年拉菲庄园红葡萄酒 750ml', 'images/goods/6.png', '一级庄+好年份，酒评家一致好评，莫塞尔法国直采，专业仓库储藏', 999, 7608.00, 4);
INSERT INTO `sm_goods` VALUES (7, '华为智慧屏X65', 'images/goods/7.png', 'HarmonyOS 2 65英寸 4K HDR超高清OLED 超薄全面屏 2400万超广角AI摄像头', 999, 24999.00, 2);
INSERT INTO `sm_goods` VALUES (8, 'HUAWEI MateView', 'images/goods/8.png', '28.2英寸 原色显示器 4K+ 超高清分辨率 电影级色域 94%高屏占比 3:2 屏幕比例', 999, 3999.00, 1);
INSERT INTO `sm_goods` VALUES (9, 'HUAWEI FreeBuds 4', 'images/goods/9.png', '真无线耳机（陶瓷白）半开放主动降噪2.0 高达40kHz宽频大动圈单元 空气感舒适佩戴', 999, 999.00, 1);
INSERT INTO `sm_goods` VALUES (10, 'HUAWEI X GENTLE MONSTER Eyewear II', 'images/goods/10.png', '时尚智能眼镜 HAVANA-01（黑）高清通话 持久续航', 999, 2699.00, 1);
INSERT INTO `sm_goods` VALUES (11, 'HUAWEI WATCH GT 2 运动款', 'images/goods/11.png', '幻夜黑（42mm）', 999, 1388.00, 1);
INSERT INTO `sm_goods` VALUES (12, 'HUAWEI WATCH FIT（曜石黑） 智能运动手表', 'images/goods/12.png', '心率睡眠血氧监测 10天续航+快充 50米防水 96种运动模式', 999, 799.00, 1);
INSERT INTO `sm_goods` VALUES (13, 'HUAWEI MatePad 11', 'images/goods/13.png', '平板电脑 6+64GB Wi-Fi 曜石灰 120Hz高刷全面屏 HarmonyOS 2全新生产力 4大振幅扬声器+哈曼卡顿调音', 999, 2499.00, 1);
INSERT INTO `sm_goods` VALUES (14, '华为智选 360智能扫地机2Pro', 'images/goods/14.png', '精准地图，多雷达慧眼避障，3小时长续航，3300Pa飓风吸力，8.5cm纤薄机身，59dB低噪安静清扫，手机APP全能操控', 999, 2799.00, 2);
INSERT INTO `sm_goods` VALUES (15, '轩尼诗XO 150周年特别纪念版', 'images/goods/15.png', '普利兹克奖得主倾力设计，谱写感官华章', 999, 1980.00, 4);

-- ----------------------------
-- Table structure for sm_goodstype
-- ----------------------------
DROP TABLE IF EXISTS `sm_goodstype`;
CREATE TABLE `sm_goodstype`  (
  `typeid` bigint NOT NULL AUTO_INCREMENT COMMENT '商品类别编号',
  `typename` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品类别名称',
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_goodstype
-- ----------------------------
INSERT INTO `sm_goodstype` VALUES (1, '数码');
INSERT INTO `sm_goodstype` VALUES (2, '智能家居');
INSERT INTO `sm_goodstype` VALUES (3, '汽车及周边');
INSERT INTO `sm_goodstype` VALUES (4, '美酒饮食');

-- ----------------------------
-- Table structure for sm_order
-- ----------------------------
DROP TABLE IF EXISTS `sm_order`;
CREATE TABLE `sm_order`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `uid` bigint NULL DEFAULT NULL COMMENT '用户id',
  `gid` bigint NULL DEFAULT NULL COMMENT '商品id',
  `bid` bigint NULL DEFAULT NULL COMMENT '商户id',
  `count` int NULL DEFAULT NULL COMMENT '商品订单量',
  `date_uid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '定单编号',
  `deleted` tinyint NOT NULL DEFAULT 1 COMMENT '订单状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_order
-- ----------------------------
INSERT INTO `sm_order` VALUES (1, 1, 1, NULL, 2, NULL, 0);
INSERT INTO `sm_order` VALUES (2, 1, 2, NULL, 5, NULL, 0);
INSERT INTO `sm_order` VALUES (3, 2, 3, NULL, 8, NULL, 0);
INSERT INTO `sm_order` VALUES (4, 2, 4, NULL, 3, NULL, 0);
INSERT INTO `sm_order` VALUES (5, 2, 5, NULL, 5, NULL, 0);
INSERT INTO `sm_order` VALUES (6, 2, 6, NULL, 7, NULL, 0);
INSERT INTO `sm_order` VALUES (7, 3, 7, NULL, 9, NULL, 0);
INSERT INTO `sm_order` VALUES (8, 3, 8, NULL, 1, NULL, 0);
INSERT INTO `sm_order` VALUES (9, 3, 1, NULL, 3, NULL, 0);
INSERT INTO `sm_order` VALUES (10, 3, 2, NULL, 5, NULL, 0);
INSERT INTO `sm_order` VALUES (11, 3, 2, NULL, 4, NULL, 1);
INSERT INTO `sm_order` VALUES (12, 2, 3, NULL, 2, NULL, 1);
INSERT INTO `sm_order` VALUES (13, 2, 10, NULL, 1, NULL, 1);
INSERT INTO `sm_order` VALUES (14, 2, 1, NULL, 2, NULL, 1);
INSERT INTO `sm_order` VALUES (15, 2, 1, NULL, 2, NULL, 1);
INSERT INTO `sm_order` VALUES (16, 2, 1, NULL, 2, NULL, 1);
INSERT INTO `sm_order` VALUES (17, 2, 1, NULL, 2, NULL, 1);
INSERT INTO `sm_order` VALUES (18, 2, 1, NULL, 1, NULL, 1);
INSERT INTO `sm_order` VALUES (19, 2, 1, NULL, 1, NULL, 1);
INSERT INTO `sm_order` VALUES (20, 2, 1, NULL, 1, NULL, 1);

-- ----------------------------
-- Table structure for sm_shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `sm_shoppingcart`;
CREATE TABLE `sm_shoppingcart`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `uid` bigint NULL DEFAULT NULL COMMENT '用户id',
  `gid` bigint NULL DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_shoppingcart
-- ----------------------------
INSERT INTO `sm_shoppingcart` VALUES (1, 1, 1);
INSERT INTO `sm_shoppingcart` VALUES (4, 2, 1);

-- ----------------------------
-- Table structure for sm_user
-- ----------------------------
DROP TABLE IF EXISTS `sm_user`;
CREATE TABLE `sm_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '收货姓名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户发货地址',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户联系电话',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `sm_user_account_uindex`(`account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sm_user
-- ----------------------------
INSERT INTO `sm_user` VALUES (1, 'th123', '谭杭', 'a48ae3782681f1e4d12cbb84d14f368c', '湖北民族大学', '13123123123');
INSERT INTO `sm_user` VALUES (2, 'cr123', '常瑞', '2e1e2c7ea2a0e2eb0ac8b4ee2184bb8c', '湖北民族大学', '123123123');
INSERT INTO `sm_user` VALUES (3, 'xl123', '向磊', '13e8e0274a1ac1de26877d5a417e0e94', '湖北民族大学', '345673544');
INSERT INTO `sm_user` VALUES (4, 'tqs', '谭庆山', '21232f297a57a5a743894a0e4a801fc3', '湖北民族大学', '15997766470');
INSERT INTO `sm_user` VALUES (7, 'hc123', '', 'ae3fade6022a0f4368096351d29030fc', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
