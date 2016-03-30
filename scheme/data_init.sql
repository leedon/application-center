use application_platform;
set names utf8mb4;

-- 初始化部门字典表
insert into team_dict(id, code, name) values (1, 'department1', '部门1');
insert into team_dict(id, code, name) values (2, 'department2', '部门2');
insert into team_dict(id, code, name) values (3, 'department3', '部门3');
insert into team_dict(id, code, name) values (4, 'department4', '部门4');
insert into team_dict(id, code, name) values (5, 'department5', '部门5');

-- 初始化应用表
insert into application(id, name, team_id, email_group, creator, create_time, state) values
  (1, '应用1', 1, 'department1@company.com', 'jack', now(), 1),
  (2, '应用2', 2, 'department1@company.com', 'mary', now(), 2),
  (3, '应用3', 3, 'department1@company.com', 'mark', now(), 3),
  (4, '应用4', 4, 'department1@company.com', 'rollen', now(), 2),
  (5, '应用5', 5, 'department1@company.com', 'linda', now(), 3),
  (6, '应用6', 2, 'department1@company.com', 'lucy', now(), 1);

-- 初始化应用和开发者的关联表
insert into application_developer(application_id, developer) values
  (1, 'jack'),
  (2, 'mary'),
  (3, 'mark'),
  (4, 'rollen'),
  (5, 'linda'),
  (6, 'lucy');
