--删除用户
drop user zy cascade;
--删除临时表空间
drop tablespace zy_temp including contents and datafiles;
--删除表空间
drop tablespace zy_data including contents and datafiles;

--创建临时表空间
--create temporary tablespace fmsjcbanck_temp tempfile 'D:\ORACLE\workspace\fmsjcbanck_temp.dbf'  size 200M;
--创建数据表空间
--create tablespace fmsjcbanck_data datafile 'D:\ORACLE\workspace\fmsjcbanck_data.dbf' size 200M autoextend on next 200M maxsize 2G;

create temporary tablespace zy_temp tempfile 'D:\ORACLE\workspace\zy_temp.dbf'  size 100m reuse autoextend on next 20m maxsize unlimited;
--创建数据表空间
create tablespace zy_data datafile 'D:\ORACLE\workspace\zy_data.dbf' size 100m autoextend on next 200M maxsize 600m;
--创建用户并指定表空间
create user zy identified by zy default tablespace zy_data temporary tablespace zy_temp quota unlimited on zy_data;
--给用户授予权限
grant connect,resource,create database link,create view,dba to zy;
--为辅助使用expdp命令创建directory
--create directory dump_dir as 'D:\KAYAK\oradata\orcl\';
--赋予读写权限给ast_sx
grant read,write on directory dump_dir to zy;
