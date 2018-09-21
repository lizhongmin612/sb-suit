
#!/usr/bin/env bash

java -Xmx80m -Xmn80m -jar ../target/sb-eureka-server-1.0-SNAPSHOT.jar --spring.prifiles.active=$1 &