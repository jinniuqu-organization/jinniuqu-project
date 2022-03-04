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

 Date: 04/03/2022 11:09:18
*/


-- ----------------------------
-- Table structure for legalperson_info_uni
-- ----------------------------
DROP TABLE IF EXISTS "di"."legalperson_info_uni";
CREATE TABLE "di"."legalperson_info_uni" (
  "id" int8 NOT NULL DEFAULT nextval('"di".ods_legalperson_info_id_seq'::regclass),
  "uni_scid" varchar(28) COLLATE "pg_catalog"."default",
  "org_id" varchar(19) COLLATE "pg_catalog"."default",
  "reg_id" varchar(100) COLLATE "pg_catalog"."default",
  "ent_name" varchar(200) COLLATE "pg_catalog"."default",
  "ent_olias" varchar(200) COLLATE "pg_catalog"."default",
  "ent_name_en" varchar(200) COLLATE "pg_catalog"."default",
  "ent_name_old" varchar(500) COLLATE "pg_catalog"."default",
  "ent_type" varchar(255) COLLATE "pg_catalog"."default",
  "reg_address" varchar(400) COLLATE "pg_catalog"."default",
  "reg_address_code" varchar(255) COLLATE "pg_catalog"."default",
  "business_scope" varchar(2000) COLLATE "pg_catalog"."default",
  "legal_represent" varchar(100) COLLATE "pg_catalog"."default",
  "registered_capital" numeric(10),
  "est_date" date,
  "approve_date" timestamp(6),
  "ent_state" varchar(255) COLLATE "pg_catalog"."default",
  "industry_code" varchar(255) COLLATE "pg_catalog"."default",
  "economic_code" varchar(255) COLLATE "pg_catalog"."default",
  "tel" varchar(200) COLLATE "pg_catalog"."default",
  "start_date" timestamp(6),
  "end_date" timestamp(6),
  "reg_institute" varchar(100) COLLATE "pg_catalog"."default",
  "logoff_date" timestamp(6),
  "revoke_reason" varchar(1000) COLLATE "pg_catalog"."default",
  "revoke_date" timestamp(6),
  "staff_number" varchar(20) COLLATE "pg_catalog"."default",
  "change_date" date,
  "emails" varchar(255) COLLATE "pg_catalog"."default",
  "lat" numeric(35,15),
  "lng" numeric(35,15),
  "ticker_code" varchar(20) COLLATE "pg_catalog"."default",
  "if_branch" varchar(1) COLLATE "pg_catalog"."default",
  "business" varchar(1500) COLLATE "pg_catalog"."default",
  "business_detail" varchar(300) COLLATE "pg_catalog"."default",
  "if_legalperson_change" varchar(1) COLLATE "pg_catalog"."default",
  "if_software_copyright" text COLLATE "pg_catalog"."default",
  "if_copyright" text COLLATE "pg_catalog"."default",
  "if_patent" text COLLATE "pg_catalog"."default",
  "if_abnormal" text COLLATE "pg_catalog"."default",
  "if_eviron_penalty" text COLLATE "pg_catalog"."default",
  "if_serious_illegal" text COLLATE "pg_catalog"."default",
  "if_admi_penalty" text COLLATE "pg_catalog"."default",
  "if_tax_debt" text COLLATE "pg_catalog"."default",
  "tax_price" text COLLATE "pg_catalog"."default",
  "tax_date" date,
  "tax_type" text COLLATE "pg_catalog"."default",
  "tel_real" varchar(55) COLLATE "pg_catalog"."default",
  "ent_reson" varchar(55) COLLATE "pg_catalog"."default",
  "ent_dept" varchar(25) COLLATE "pg_catalog"."default",
  "ent_dept_other" varchar(25) COLLATE "pg_catalog"."default",
  "ent_dept_date" date,
  "ent_move" varchar(25) COLLATE "pg_catalog"."default",
  "etl_time" timestamp(0),
  "source" varchar(155) COLLATE "pg_catalog"."default",
  "peo_address" varchar(55) COLLATE "pg_catalog"."default",
  "census_address" varchar(55) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "di"."legalperson_info_uni"."id" IS '自增id';
COMMENT ON COLUMN "di"."legalperson_info_uni"."uni_scid" IS '统一社会信用代码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."org_id" IS '组织机构代码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."reg_id" IS '工商注册号';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_name" IS '机构名称';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_olias" IS '机构简称';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_name_en" IS '英文名称';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_name_old" IS '历史名称';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_type" IS '机构类型';
COMMENT ON COLUMN "di"."legalperson_info_uni"."reg_address" IS '注册地址';
COMMENT ON COLUMN "di"."legalperson_info_uni"."reg_address_code" IS '注册地址行政区划代码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."business_scope" IS '经营或业务范围';
COMMENT ON COLUMN "di"."legalperson_info_uni"."legal_represent" IS '法定代表人';
COMMENT ON COLUMN "di"."legalperson_info_uni"."registered_capital" IS '注册资金(万元)';
COMMENT ON COLUMN "di"."legalperson_info_uni"."est_date" IS '成立日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."approve_date" IS '核准日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_state" IS '状态';
COMMENT ON COLUMN "di"."legalperson_info_uni"."industry_code" IS '行业分类代码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."economic_code" IS '经济类型代码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."tel" IS '电话';
COMMENT ON COLUMN "di"."legalperson_info_uni"."start_date" IS '有效期自';
COMMENT ON COLUMN "di"."legalperson_info_uni"."end_date" IS '有效期至';
COMMENT ON COLUMN "di"."legalperson_info_uni"."reg_institute" IS '登记机关';
COMMENT ON COLUMN "di"."legalperson_info_uni"."logoff_date" IS '注销/撤销日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."revoke_reason" IS '营业执照吊销原因';
COMMENT ON COLUMN "di"."legalperson_info_uni"."revoke_date" IS '营业执照吊销日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."staff_number" IS '从业人数';
COMMENT ON COLUMN "di"."legalperson_info_uni"."change_date" IS '变更日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."business" IS '业务';
COMMENT ON COLUMN "di"."legalperson_info_uni"."business_detail" IS '业务描述';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_legalperson_change" IS '是否有法人变更';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_software_copyright" IS '是否有软件著作权信息';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_patent" IS '是否有专利信息';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_abnormal" IS '是否发生经营异常信息';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_eviron_penalty" IS '是否发生环保处罚';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_admi_penalty" IS '是否发生行政处罚';
COMMENT ON COLUMN "di"."legalperson_info_uni"."if_tax_debt" IS '是否欠税';
COMMENT ON COLUMN "di"."legalperson_info_uni"."tax_price" IS '欠税金额';
COMMENT ON COLUMN "di"."legalperson_info_uni"."tax_date" IS '欠税统计截至日期';
COMMENT ON COLUMN "di"."legalperson_info_uni"."tax_type" IS '欠税税种';
COMMENT ON COLUMN "di"."legalperson_info_uni"."tel_real" IS '电话号码';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_reson" IS '失信原因';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_dept" IS '惩戒实施部门';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_dept_other" IS '惩戒联动部门';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_dept_date" IS '惩戒时间';
COMMENT ON COLUMN "di"."legalperson_info_uni"."ent_move" IS '迁入/迁出';
COMMENT ON COLUMN "di"."legalperson_info_uni"."etl_time" IS '抽取时间';
COMMENT ON COLUMN "di"."legalperson_info_uni"."source" IS '来源';
COMMENT ON COLUMN "di"."legalperson_info_uni"."peo_address" IS '法人居住住址';
COMMENT ON COLUMN "di"."legalperson_info_uni"."census_address" IS '法人户籍住址';

-- ----------------------------
-- Indexes structure for table legalperson_info_uni
-- ----------------------------
CREATE INDEX "uni_scid_index" ON "di"."legalperson_info_uni" USING btree (
  "uni_scid" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table legalperson_info_uni
-- ----------------------------
ALTER TABLE "di"."legalperson_info_uni" ADD CONSTRAINT "legalperson_info_uni_pkey" PRIMARY KEY ("id");
