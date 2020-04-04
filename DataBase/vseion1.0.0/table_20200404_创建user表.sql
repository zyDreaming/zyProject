/*==============================================================*/
/* Table: SYS_USER                                              */
/*==============================================================*/
create table SYS_USER 
(
   USERID               VARCHAR2(32)         not null,
   LOGINNAME            VARCHAR2(30),
   PASSWD               VARCHAR2(32),
   USERNAME             VARCHAR2(100),
   constraint PK_SYS_USER primary key (USERID)
)

COMMENT ON COLUMN SYS_USER.USERID IS '用户ID';
COMMENT ON COLUMN SYS_USER.LOGINNAME IS '登录名称';
COMMENT ON COLUMN SYS_USER.PASSWD IS '登录密码，MD加密';
COMMENT ON COLUMN SYS_USER.USERNAME IS '操作用户名称';