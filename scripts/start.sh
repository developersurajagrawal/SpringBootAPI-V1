#!/bin/bash
echo "🚀 Starting Spring Boot App"
cd /home/ec2-user/app
nohup java -jar demo-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
