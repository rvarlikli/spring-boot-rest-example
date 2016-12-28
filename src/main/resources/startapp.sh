#!/bin/bash

JAR_FILE=spring-boot-rest-example-0.0.1-SNAPSHOT.jar
BRANCH = ""

if [[ ! -z "$1"  ]]; then
    BRANCH=$1
else
    BRANCH=master
fi

URL="https://github.com/rvarlikli/spring-boot-rest-example/raw/$BRANCH/src/main/resources/spring-boot-rest-example-0.0.1-SNAPSHOT.jar"

echo "Getting the jar file from $URL"
echo "....."

wget -O /tmp/$JAR_FILE $URL

echo "$JAR_FILE downloaded from $URL"
echo "....."

echo "Starting the application from $JAR_FILE"
echo ">>>>>>>>>"

java -jar /tmp/$JAR_FILE