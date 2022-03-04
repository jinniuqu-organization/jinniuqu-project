/*
 Navicat Premium Data Transfer

 Source Server         : 金牛区数据治理
 Source Server Type    : PostgreSQL
 Source Server Version : 100018
 Source Host           : 172.24.11.38:5432
 Source Catalog        : DAMA
 Source Schema         : di

 Target Server Type    : PostgreSQL
 Target Server Version : 100018
 File Encoding         : 65001

 Date: 04/03/2022 11:09:01
*/


-- ----------------------------
-- Table structure for dataserv_personal_label
-- ----------------------------
DROP TABLE IF EXISTS "di"."dataserv_personal_label";
CREATE TABLE "di"."dataserv_personal_label" (
  "id" int8 DEFAULT nextval('"di".dataserv_personal_label_id_seq'::regclass),
  "idcard" varchar(20) COLLATE "pg_catalog"."default",
  "idcard_real" varchar(20) COLLATE "pg_catalog"."default",
  "name" varchar(300) COLLATE "pg_catalog"."default",
  "name_real" varchar(300) COLLATE "pg_catalog"."default",
  "sex" varchar(25) COLLATE "pg_catalog"."default",
  "age" int4,
  "birthdate" varchar(500) COLLATE "pg_catalog"."default",
  "telephone" varchar(500) COLLATE "pg_catalog"."default",
  "tel_real" varchar(500) COLLATE "pg_catalog"."default",
  "birth_place_nation" varchar(255) COLLATE "pg_catalog"."default",
  "birth_place_province" varchar(255) COLLATE "pg_catalog"."default",
  "birth_addr" varchar(50) COLLATE "pg_catalog"."default",
  "native_place" varchar(400) COLLATE "pg_catalog"."default",
  "ethnic_group" varchar(255) COLLATE "pg_catalog"."default",
  "nationality" varchar(3) COLLATE "pg_catalog"."default",
  "edulevel" varchar(255) COLLATE "pg_catalog"."default",
  "polity" varchar(255) COLLATE "pg_catalog"."default",
  "marriage_type" varchar(255) COLLATE "pg_catalog"."default",
  "present_province" varchar(50) COLLATE "pg_catalog"."default",
  "present_city" varchar(400) COLLATE "pg_catalog"."default",
  "present_district" varchar(50) COLLATE "pg_catalog"."default",
  "present_street" varchar(50) COLLATE "pg_catalog"."default",
  "present_comm" varchar(50) COLLATE "pg_catalog"."default",
  "present_village" varchar(100) COLLATE "pg_catalog"."default",
  "present_buildno" varchar(50) COLLATE "pg_catalog"."default",
  "present_unit" varchar(50) COLLATE "pg_catalog"."default",
  "present_roomno" varchar(50) COLLATE "pg_catalog"."default",
  "present_address" varchar(400) COLLATE "pg_catalog"."default",
  "rpr_province" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_city" varchar(400) COLLATE "pg_catalog"."default",
  "rpr_district" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_street" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_comm" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_village" varchar(100) COLLATE "pg_catalog"."default",
  "rpr_buildno" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_unit" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_roomno" varchar(50) COLLATE "pg_catalog"."default",
  "rpr_address" varchar(400) COLLATE "pg_catalog"."default",
  "domicile" varchar(25) COLLATE "pg_catalog"."default",
  "peo_state" varchar(25) COLLATE "pg_catalog"."default",
  "peo_label" varchar(25) COLLATE "pg_catalog"."default",
  "ifHaveVaccine" varchar(25) COLLATE "pg_catalog"."default",
  "source" varchar(25) COLLATE "pg_catalog"."default",
  "etl_time" date,
  "peo_relatives" varchar(25) COLLATE "pg_catalog"."default",
  "legalperson_yes" varchar(2) COLLATE "pg_catalog"."default",
  "legalperson_name" varchar(35) COLLATE "pg_catalog"."default",
  "legalperson_addr" varchar(55) COLLATE "pg_catalog"."default",
  "rank" varchar(25) COLLATE "pg_catalog"."default",
  "own_street" varchar(25) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "di"."dataserv_personal_label"."idcard_real" IS ' 公民身份证号码';
COMMENT ON COLUMN "di"."dataserv_personal_label"."name_real" IS ' 姓名';
COMMENT ON COLUMN "di"."dataserv_personal_label"."sex" IS ' 性别';
COMMENT ON COLUMN "di"."dataserv_personal_label"."age" IS ' 年龄';
COMMENT ON COLUMN "di"."dataserv_personal_label"."birthdate" IS ' 出生日期';
COMMENT ON COLUMN "di"."dataserv_personal_label"."tel_real" IS ' 联系电话';
COMMENT ON COLUMN "di"."dataserv_personal_label"."birth_place_nation" IS ' 出生地-国家（地区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."birth_place_province" IS ' 出生地-省市县（区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."birth_addr" IS ' 出生地';
COMMENT ON COLUMN "di"."dataserv_personal_label"."native_place" IS ' 籍贯';
COMMENT ON COLUMN "di"."dataserv_personal_label"."ethnic_group" IS ' 民族';
COMMENT ON COLUMN "di"."dataserv_personal_label"."nationality" IS ' 国籍';
COMMENT ON COLUMN "di"."dataserv_personal_label"."edulevel" IS ' 最高学历';
COMMENT ON COLUMN "di"."dataserv_personal_label"."polity" IS ' 政治面貌';
COMMENT ON COLUMN "di"."dataserv_personal_label"."marriage_type" IS ' 婚姻状况';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_province" IS ' 家庭住址（省）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_city" IS ' 家庭住址（市）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_district" IS ' 家庭住址（区县）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_street" IS ' 家庭住址（街道）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_comm" IS ' 家庭住址（社区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_village" IS ' 家庭住址（小区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_buildno" IS ' 家庭住址（小区楼号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_unit" IS ' 家庭住址（单元号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_roomno" IS ' 家庭住址（房间号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."present_address" IS ' 家庭住址';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_province" IS ' 户籍登记地址（省）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_city" IS ' 户籍登记地址（市）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_district" IS ' 户籍登记地址（区县）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_street" IS ' 户籍登记地址（街道）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_comm" IS ' 户籍登记地址（社区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_village" IS ' 户籍登记地址（小区）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_buildno" IS ' 户籍登记地址（楼号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_unit" IS ' 户籍登记地址（单元号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_roomno" IS ' 户籍登记地址（房间号）';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rpr_address" IS ' 户籍登记地址';
COMMENT ON COLUMN "di"."dataserv_personal_label"."domicile" IS ' 户籍状态';
COMMENT ON COLUMN "di"."dataserv_personal_label"."peo_state" IS '人口状态';
COMMENT ON COLUMN "di"."dataserv_personal_label"."peo_label" IS '人口标签';
COMMENT ON COLUMN "di"."dataserv_personal_label"."ifHaveVaccine" IS '是否接种新冠疫苗';
COMMENT ON COLUMN "di"."dataserv_personal_label"."source" IS '数据来源';
COMMENT ON COLUMN "di"."dataserv_personal_label"."etl_time" IS '抽取时间';
COMMENT ON COLUMN "di"."dataserv_personal_label"."peo_relatives" IS '亲属人员';
COMMENT ON COLUMN "di"."dataserv_personal_label"."legalperson_yes" IS '是否法人';
COMMENT ON COLUMN "di"."dataserv_personal_label"."legalperson_name" IS '公司名称';
COMMENT ON COLUMN "di"."dataserv_personal_label"."legalperson_addr" IS '公司地址';
COMMENT ON COLUMN "di"."dataserv_personal_label"."rank" IS '排名';
COMMENT ON COLUMN "di"."dataserv_personal_label"."own_street" IS '所属街道';
COMMENT ON TABLE "di"."dataserv_personal_label" IS '人员画像—个人标签';

-- ----------------------------
-- Indexes structure for table dataserv_personal_label
-- ----------------------------
CREATE INDEX "index_id" ON "di"."dataserv_personal_label" USING btree (
  "id" "pg_catalog"."int8_ops" ASC NULLS LAST
);
