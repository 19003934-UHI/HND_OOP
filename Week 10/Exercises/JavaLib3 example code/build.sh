#! /bin/sh

# javalib_3_files build script

# Prepare an output directory
mkdir -p bin

# The JAVAC command to compile java files into class files
javac -d ./bin src/javalibraries/JavaLib3Files.java

