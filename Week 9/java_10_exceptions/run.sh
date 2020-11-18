#! /bin/sh

# Simple invocation of the Java Runtime Environment(JRE)
# Note the CLASSPATH has to be given, this is a path that the JRE will search for your application
# class files, without it it will not run properly. If you were also using classes from another
# of your own project or a THIRD-PARTY jar file you would also specify the location of these using
# the -classpath JVM parameter.
java -classpath ./bin javabasics.Java10Exceptions

