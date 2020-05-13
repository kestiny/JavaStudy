# JavaStudy

## 工程结构

工程采取子模块结构，每个子模块都是一个或多个学习的内容

- JavaStudy
    - pom.xml  跟目录pom文件
    - mybatis  mybatis模块
        - pom.xml 子模块pom文件
        - src  源码目录

## mybatis模块

- 1.整合使用mybatis和logback进行数据库的CRUD；
- 2.Mapper.xml统一存放在resource目录下；
- 3.update语句采用动态sql，此处仅使用了set标签