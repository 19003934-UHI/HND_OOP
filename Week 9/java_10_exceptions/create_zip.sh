#! /bin/sh

rm -f ../java_10_exceptions_samplecode.zip

zip -r ../java_10_exceptions_samplecode.zip res src build.bat build.sh readme.txt run.bat run.sh .classpath .project -x "**/.DS_Store"
