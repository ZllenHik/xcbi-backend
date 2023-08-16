# 星辰智能分析平台

## 项目介绍

BI：数据可视化，报表可视化系统



传统BI平台：

1. 需要人工上传数据
2. 需要人工选择分析要用到的数据-行和列以及选择图表类型
3. 生成图标并保存配置



智能BI平台：

用户只需要导入最原始的数据集，输入想要进行分析的目标数据，就能利用AI自动生成一个符合要求的图标以及结论。



## 需求分析

1. 智能分析：用户输入 目标和原始数据，就可以自动生成图表和分析结论
2. 图表管理
3. 图表生成的异步化（消息队列）
4. 使用AI能力

## 架构图

基本流程：

![image](https://github.com/ZllenHik/xcbi-backend/assets/89403161/ee14be1b-61c5-4804-bb47-1e43178369c5)


优化流程：

![image](https://github.com/ZllenHik/xcbi-backend/assets/89403161/3a4a3c7f-f5f8-414a-97eb-06c713aebbc3)


## 技术栈

### 前端

- Ant Design Pro 5.X 框架
- Ant Design 组件库
- React
- Umi 4 前端框架
- Echarts可视化库
- OpenAI 前端代码生成

### 后端

- Spring Boot
- MyBatis-Plus及Mybatis X自动生成
- MySQL数据库
- Redis + Redisson 限流
- RabbitMQ消息队列
- 鱼聪明AI SDK（AI能力）
- JDK线程池及异步化
- Easy Excel 表格数据处理
- Swagger + Knife4j接口文档生成
- Hutool、Apache Common Utils等工具库



界面：

登录注册：

![img](https://cdn.nlark.com/yuque/0/2023/png/26421384/1692176268247-eaeba9ee-b3cf-4975-ac50-edbb7596797a.png)



![img](https://cdn.nlark.com/yuque/0/2023/png/26421384/1692176570405-3c0583c9-ba12-4aa7-a566-a15607f0df9a.png)

