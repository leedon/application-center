use application_platform;
set names utf8mb4;

-- 初始化部门字典表
insert into team_dict(id, code, name) values (1, 'department1', '部门1');
insert into team_dict(id, code, name) values (2, 'department2', '部门2');
insert into team_dict(id, code, name) values (3, 'department3', '部门3');
insert into team_dict(id, code, name) values (4, 'department4', '部门4');
insert into team_dict(id, code, name) values (5, 'department5', '部门5');

-- 初始化应用表
insert into application(id, name, code, team_id, email_group, creator, create_time, state) values
  (1, '应用1', 'applicationCode1', 1, 'department1@company.com', 'jack', now(), 1),
  (2, '应用2', 'applicationCode2', 2, 'department1@company.com', 'mary', now(), 2),
  (3, '应用3', 'applicationCode3', 3, 'department1@company.com', 'mark', now(), 3),
  (4, '应用4', 'applicationCode4', 4, 'department1@company.com', 'rollen', now(), 2),
  (5, '应用5', 'applicationCode5', 5, 'department1@company.com', 'linda', now(), 3),
  (6, '应用6', 'applicationCode6', 2, 'department1@company.com', 'lucy', now(), 1);

-- 初始化应用和开发者的关联表
insert into application_developer(application_code, developer) values
  ('applicationCode1', 'jack'),
  ('applicationCode2', 'mary'),
  ('applicationCode3', 'mark'),
  ('applicationCode4', 'rollen'),
  ('applicationCode5', 'linda'),
  ('applicationCode6', 'lucy');
