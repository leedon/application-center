use application_platform;
set names utf8mb4;

create table application(
  id int(10) unsigned not null AUTO_INCREMENT,
  name varchar(32) not null comment 'application name',
  code varchar(64) not null comment 'application code',
  team_code varchar(64) not null comment 'team code',
  creator varchar(32) not null comment 'creator',
  create_time datetime not null comment 'create time',
  state tinyint(4) not null comment 'application apply state',
  email_group varchar(32) not null comment 'team email group',
  developers varchar(512) not null comment 'application developer',
  PRIMARY KEY (id),
  unique key idx_team_code(team_code),
  unique key idx_code(code)
)engine=innodb default charset=utf8mb4 comment 'application table';

create table application_acl(
  id int(10) unsigned not null AUTO_INCREMENT,
  application_code varchar(64) not null comment '',
  state tinyint(4) not null comment '',
  url varchar(255) not null comment '',
  authorized_application varchar(255) not null comment '',
  authorized_ip varchar(255) not null comment '',
  PRIMARY KEY (id),
  key idx_application_code(application_code)
)engine=innodb default charset=utf8mb4 comment 'application acl table';

create table operation_log(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  operator varchar(32) not null comment '操作人',
  operate_time datetime not null comment '操作时间',
  detail text not null comment '操作详情',
  PRIMARY KEY (id)
)engine=innodb default charset=utf8 comment 'operation log table';