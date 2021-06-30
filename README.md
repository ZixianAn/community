# Kafka启动与使用
1. 启动zookeeper

在一个终端窗口1进入目录`/Users/anzixian/software/kafka_2.12-2.7.0/bin`，输入以下命令：

`$ ./zookeeper-server-start.sh ../config/zookeeper.properties`

2. 启动Kafka server

另起一个终端窗口2，进入目录，输入以下命令：

`./kafka-server-start.sh ../config/server.properties`

3. 创建主题

另起一个终端窗口3，进入目录，输入以下命令：

`./kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test`

4. 查看主题是否在9092服务器创建成功

在终端3输入以下命令：

`./kafka-topics.sh --list --bootstrap-server localhost:9092`

5. 生产者发送消息

在终端3输入以下命令：

`./kafka-console-producer.sh --broker-list localhost:9092 --topic test`

然后即可发送消息

6. 消费者接收消息

另起一个终端窗口4，进入目录，输入以下命令：

`./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning`

即可接收生产者发送的消息