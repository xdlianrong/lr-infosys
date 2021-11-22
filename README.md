# lr-infosys

## 项目需求

### 用户分类：
- 个人门户：普通用户、负责人用户
- 企业门户：管理员、领导审批

### 功能模块：

- 1.公司介绍：对外公开信息共享、logo等
- 2.人事管理：员工的劳动合同、实习协议统一管理
- 3.管理制度：公司各类管理制度共享查阅
- 4.文档管理：申报的各类项目书、项目方案等以便查询（上传、查阅、一键分享、下载）
- 5.流程审批：请假、年休假申请，出差公示等（发起请假 - 审批 - 公示）
- 6.工作周报：周报各自提交
- 7.会议纪要：供员工查阅
- 8.知识产权管理：专利和软著的证书及申请的原始材料
- 9.合同管理：签订的项目合同、战略合作协议统一存档（功能选项：上传、查阅；搜索：合同编号、合同名称等）
- 10.企业资质与荣誉：资质证书、获奖证书的展示
- 11.财务报表：年报、月报（功能选项：上传、查阅）
- 12.通知公告：节假日放假安排，或公司召开会议安排（功能选项：发布通知、查看）

## 未完成的事项
- 更改message表，将其分的更细致一些
- 注册时是否要同时完成管理人员的添加
- 注册后选择继续注册还是回到home页面
- 完成前端页面的各种检查
- 为前端页面的工作、职位和部门添加select
- 完成register页面和home页面的sidebars一致的问题
- 根据register页面和home页面sidebars页面不一致的问题我们是不是可以考虑推出不同主题
- 完成人事关系的数据关系的构建
- 完成请假的后端逻辑

## 注意事项
- 修改列的编码
```
  alter table table change column column type character set utf8 collate utf8_unicode_ci not null default '';
  
  alter table employee change position position varchar(255) character set utf8 collate utf8_unicode_ci not null default '';
```
