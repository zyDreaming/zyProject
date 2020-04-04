/*==============================================================*/
/* Table: SYS_USER                                              */
/*==============================================================*/
create table SYS_USER 
(
   USERID               VARCHAR2(32)         not null,
   LOGINNAME            VARCHAR2(30),
   PASSWD               VARCHAR2(32),
   USERNAME             VARCHAR2(100),
   ORGNO                VARCHAR2(20),
   USERSTATUS           VARCHAR2(10)         default 'N',
   IDTYPE               VARCHAR2(8),
   IDNO                 VARCHAR2(30),
   SEX                  VARCHAR2(10),
   MOBILENO             VARCHAR2(30),
   OFFICENO             VARCHAR2(30),
   HOMENO               VARCHAR2(30),
   FAXNO                VARCHAR2(30),
   EMAIL                VARCHAR2(100),
   POSTCODE             VARCHAR2(30),
   ADDRESS              VARCHAR2(128),
   CREATEDATE           CHAR(8),
   MODIFYDATE           CHAR(8),
   PWDERRTIMES          NUMBER,
   PWDERRLOCKDT         VARCHAR2(15),
   PWDSETDATE           CHAR(8),
   LASTLOGINTIME        VARCHAR2(15),
   LASTLOGINSTATION     VARCHAR2(64),
   USERTYPE             VARCHAR2(10),
   CERTIFICATE          VARCHAR2(32),
   constraint PK_SYS_USER primary key (USERID)
)

COMMENT ON COLUMN SYS_USER.USERID IS '用户ID';
COMMENT ON COLUMN SYS_USER.LOGINNAME IS '登录名称';
COMMENT ON COLUMN SYS_USER.PASSWD IS '登录密码，MD加密';
COMMENT ON COLUMN SYS_USER.USERNAME IS '操作用户名称';
COMMENT ON COLUMN SYS_USER.ORGNO IS 'ORGNO';
COMMENT ON COLUMN SYS_USER.USERSTATUS IS '用户状态：N - 正常，F - 冻结，D - 注销';
COMMENT ON COLUMN SYS_USER.IDTYPE IS '证件类型';
COMMENT ON COLUMN SYS_USER.IDNO IS '证件号码';
COMMENT ON COLUMN SYS_USER.SEX IS '性别';
COMMENT ON COLUMN SYS_USER.MOBILENO IS '移动电话';
COMMENT ON COLUMN SYS_USER.OFFICENO IS '办公电话';
COMMENT ON COLUMN SYS_USER.HOMENO IS '住宅电话';
COMMENT ON COLUMN SYS_USER.FAXNO IS '传真';
COMMENT ON COLUMN SYS_USER.EMAIL IS '电子邮箱';
COMMENT ON COLUMN SYS_USER.POSTCODE IS '邮编';
COMMENT ON COLUMN SYS_USER.ADDRESS IS '地址';
COMMENT ON COLUMN SYS_USER.CREATEDATE IS '发布日期';
COMMENT ON COLUMN SYS_USER.MODIFYDATE IS '最后修改日期';
COMMENT ON COLUMN SYS_USER.PWDERRLOCKDT IS '密码输错锁定时间（格式：YYYYMMDD HHMMSS）:密码输错锁定时间（格式：yyyyMMdd hhmmss）';
COMMENT ON COLUMN SYS_USER.LASTLOGINTIME IS '最后登录时间';
COMMENT ON COLUMN SYS_USER.LASTLOGINSTATION IS '上次登录站点';
COMMENT ON COLUMN SYS_USER.USERTYPE IS '用户类型：0-管理台用户，1-柜台用户';