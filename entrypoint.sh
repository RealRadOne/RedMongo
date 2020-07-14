#!/bin/sh

echo "compiling"$APP_NAME
cd /usr/local/tomcat/webapps/$APP_NAME/WEB-INF
javac -classpath .:/usr/local/tomcat/lib/servlet-api.jar -d classes src/$APP_CLASS/*
echo "Fin!"

exec "$@"