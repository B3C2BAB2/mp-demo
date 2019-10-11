# mp-demo
MyBatis-Plus 的示例代码
- 测试用例在`MpDemoApplicationTests`
- `spring.datasource.url`,`spring.datasource.username`,`spring.datasource.password`需要自行配制

## 学习笔记
### 重要特性
- Mapper接口通过继承`BaseMapper`接口即可实现单表大部分 CRUD 操作
- 通过`@TableName`注解在实体类中标明数据库表名
- 通过`@TableId`标明数据库字段
- 实体和表的字段有出入时通过`@TableField`注解实现字段映射
- 通过`@TableLogic`注解实现逻辑删除

## 参考文档
* [MyBatis-Plus官方文档](https://mp.baomidou.com/guide/)
