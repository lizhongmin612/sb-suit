
#!/usr/bin/env bash

nohup java -Xmx80m -Xmn80m -jar ../target/sb-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=$1 > /tmp/$1.log &
