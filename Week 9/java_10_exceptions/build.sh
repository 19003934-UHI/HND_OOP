#! /bin/sh

# java_10_exceptions build script

# Prepare an output directory
mkdir -p bin

# The JAVAC command to compile java files into class files
javac -d ./bin src/javabasics/Java10Exceptions.java

