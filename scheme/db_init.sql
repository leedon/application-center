drop database if exists application_platform;
create database application_platform;

use application_platform;
set names utf8mb4;

drop table if exists application;
create table application(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  name varchar(32) not null comment '应用名称',
  code varchar(64) not null comment '应用编号',
  team_id tinyint(4) not null comment '部门编号',
  email_group varchar(32) not null comment '部门邮件组',
  creator varchar(32) not null comment '应用创建人',
  create_time datetime not null comment '应用创建时间',
  state tinyint(4) not null comment '应用申请状态',
  PRIMARY KEY (id),
  key idx_team_code(team_id),
  unique key idx_code(code)
)engine=innodb default charset=utf8mb4 comment '应用表';

drop table if exists team_dict;
create table team_dict(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  code varchar(32) not null comment '部门编号',
  name varchar(32) not null comment '部门名称',
  PRIMARY KEY (id)
)engine=innodb default charset=utf8mb4 comment '部门字典表';

drop table if exists application_apply_state_dict;
create table application_apply_state_dict(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  code varchar(32) not null comment '状态编号',
  name varchar(32) not null comment '状态名称',
  PRIMARY KEY (id)
)engine=innodb default charset=utf8mb4 comment '应用申请状态字典表';

insert into application_apply_state_dict(id, code, name) values (1, 'waiting_approval', '待审批');
insert into application_apply_state_dict(id, code, name) values (1, 'approval_pass', '审批通过');
insert into application_apply_state_dict(id, code, name) values (1, 'approval_reject', '审批拒绝');


drop table if exists application_developer;
create table application_developer(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  application_code varchar(64) not null comment '应用编号',
  developer varchar(32) not null comment '开发者名称',
  PRIMARY KEY (id),
  key idx_application_code(application_code)
)engine=innodb default charset=utf8mb4 comment '应用和开发者的关联表';


drop table if exists application_acl;
create table application_acl(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  application_code varchar(64) not null comment '应用编号',
  data_state tinyint(4) not null comment '数据状态',
  url varchar(255) not null comment 'url',
  authorized_application_codes varchar(255) not null comment '授权的应用编号,-分割',
  authorized_ip varchar(255) not null comment '授权的ip,-分割',
  PRIMARY KEY (id),
  key idx_application_code(application_code)
)engine=innodb default charset=utf8mb4 comment '应用权限控制表';

drop table if exists data_state_dict;
create table data_state_dict(
  id int(10) unsigned not null AUTO_INCREMENT comment '没有任何业务含义的主键',
  code varchar(32) not null comment '状态编号',
  name varchar(32) not null comment '状态名称',
  PRIMARY KEY (id)
)engine=innodb default charset=utf8mb4 comment '数据状态字典表';

insert into data_state_dict(id, code, name) values (1, 'enable', '启用');
insert into data_state_dict(id, code, name) values (2, 'disable', '未启用');

drop table if exists application_operation_log;
create table application_operation_log(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  application_code varchar(64) not null comment '应用编号',
  operator varchar(32) not null comment '操作人',
  operate_time datetime not null comment '操作时间',
  detail text not null comment '操作详情',
  PRIMARY KEY (id),
  key idx_application_code(application_code)
)engine=innodb default charset=utf8 comment 'operation log table';