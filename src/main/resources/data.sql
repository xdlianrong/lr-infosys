/*
 先插入角色数据
 */
INSERT INTO role values (1,false,"总经理");
INSERT INTO role values (2,false,"技术总监");
INSERT INTO role values (3,false,"产品经理");
INSERT INTO role values (4,false,"质量经理");
INSERT INTO role values (5,false,"研发工程师");
INSERT INTO role values (6,false,"实习生");
INSERT INTO role values (7,false,"市场总监");
INSERT INTO role values (8,false,"行政管理");

/*
 插入保留的权限数据
 */
INSERT INTO permission values (1,false,"管理员");
INSERT INTO permission values (2,false,"访客");
INSERT INTO permission values (3,false,"总经理");
INSERT INTO permission values (4,false,"经理");
INSERT INTO permission values (5,false,"雇员");

/*
 插入管理员用户
 */

-- INSERT INTO administrator values (7,false,"市场总监");

INSERT INTO member values (1,false,"2000-10-11","技术部","zhangxiaorui@gmail.com","2000-10-11","111111200010111111","寄星","$2a$10$XH93GcODxgusdxsdS1vI2u8SAIu04d.T/R0FllYd/8UcnlLOA.ZFq","17653532570","实习生",null,"男");

/*
 向role-permissions表中插入数据
 */
insert into role_permissions values(1,3);
insert into role_permissions values(1,4);
insert into role_permissions values(2,4);
insert into role_permissions values(2,5);
insert into role_permissions values(3,4);
insert into role_permissions values(3,5);
insert into role_permissions values(4,4);
insert into role_permissions values(4,5);
insert into role_permissions values(5,5);
insert into role_permissions values(6,5);
insert into role_permissions values(7,4);
insert into role_permissions values(7,5);
insert into role_permissions values(8,5);



 /*
  向member-roles中插入数据
  */
insert into member_roles values(1,5);
insert into member_roles values(1,1);