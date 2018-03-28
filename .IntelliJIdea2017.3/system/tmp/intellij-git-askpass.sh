#!/bin/sh
"/usr/lib/jvm/java-8-oracle/jre/bin/java" -cp "/opt/IntelliJ/plugins/git4idea/lib/git4idea-rt.jar:/opt/IntelliJ/lib/xmlrpc-2.0.jar:/opt/IntelliJ/lib/commons-codec-1.9.jar:/opt/IntelliJ/lib/util.jar" org.jetbrains.git4idea.http.GitAskPassApp "$@"
