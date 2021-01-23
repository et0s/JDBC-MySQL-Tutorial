# JDBC-MySQL-Tutorial
### Requirements
- [mysql-server 8.0.23](https://dev.mysql.com/downloads/mysql/)
- [Maven](https://maven.apache.org/download.cgi)
  - Install plugin [Apache Maven Assembly Plugin](https://maven.apache.org/plugins/maven-assembly-plugin/)
---
### Running
1. Run the mysqld daemon on `localhost:3306`
2. First build the Java app: `mvn clean compile assembly:single`
3. Go to the `client/my-app` directory
4. run `java -cp my-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.mycompany.app.ConnectionTest`
