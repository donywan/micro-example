## 搭建mysql数据库主从复制
下载mysql压缩包解压后在
根目录下放建立`my.ini`文件配置，配置有如下参考。
#### master
```
[mysqld]
port=33161
server-id=1
log-bin=master-bin
character_set_server=utf8
[client]
default-character-set=utf8
```
#### slave
```
[mysqld]
port=33261
server-id=2
character_set_server=utf8
[client]
default-character-set=utf8
```
查看master数据状态
```
shou master status;
```
得到如下信息

|File |Position|Binlog_Do_DB|Binlog_Ignore_DB|Executed_Gtid_Set
|- | - | - | - | -
|master-bin.000017  | 489 

在slave数据库中执行
```
CHANGE MASTER TO
    MASTER_HOST='localhost',
    MASTER_USER='root',
    MASTER_PASSWORD='root',
    Master_PORT=33161,
    MASTER_LOG_FILE='master-bin.000017',
    MASTER_LOG_POS=489;
```
启动slave数据库
```
start slave;
```
查看运行状态
```
show slave status\G;
```
|名称 | 值
|- | -
|Slave_IO_State| Waiting for master to send event
|Master_Host| 127.0.0.1
|Master_User| root
|Master_Port| 33161
|Connect_Retry| 60
|Master_Log_File| master-bin.000017
|Read_Master_Log_Pos| 489
|Relay_Log_File| DESKTOP-UA3QFA9-relay-bin.000015
|Relay_Log_Pos| 705
|Relay_Master_Log_File| master-bin.000017
|**Slave_IO_Running**| **Yes**
|**Slave_SQL_Running**| **Yes**

## Nacos注册中心
启动nacos
```
startup.cmd
```
默认注册中心地址
```
127.0.0.1:8848
```
后台地址
```
http://127.0.0.1:8848/nacos
```
进入后台新增dataId=nacos-spring的配置,格式为yaml
```
test:
  test: helloworld!
```
## 启动nacos-user项目
访问接口
```
http://127.0.0.1:2020/users
```
```
[{"id":"28ed008d-0c6d-4d38-a3d8-b18f2e4b3830","name":"wang","age":1},{"id":"593d8d5a-95b5-4d50-b281-7e5776cf40a4","name":"wangdundun","age":26}]
```
