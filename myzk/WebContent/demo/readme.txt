

Demo Case Name: Layout
ZK Version: 7.0.3-Eval
Date: 2015-04-29

This demo case contains two different format of Eclipse Projects.

1. ZK Project Archive:
	DESCRIPTION:
		Followed by WTP Dynamic Web Project format(so it's okay if you got only WTP installed in your Eclipse), 
		you can use Eclipse with ZK Studio to import this project.
		For more information about how to install and use ZK Studio, please refer to this link:
		http://www.zkoss.org/documentation/zkstudio
		
	ARCHIVE FORMAT:		
		ZK-Project 
			|_ .project
			|_ .classpath
			|_ src/
				|_ [java sources]
			|_ WebContent/
				|_ [web content resources]
				|_ WEB-INF/
					|_ web.xml
					|_ zk.xml
	INSTALLATION:
		
		
		   
	   
2. Maven2Eclipse Project:
	DESCRIPTION:
		Maven 2 Eclipse is a very famous Eclipse plugin for Java Developer who use Eclipse as their default IDE.
	
	ARCHIVE FORMAT:
		Maven-Project
			|_ .project
			|_ .classpath
			|_ pom.xml
			|_src/
				|_ main/
					|_ java
					|_ resources
					|_ webapp
						|_ [web content resources]
						|_ WEB-INF/
						|_ web.xml
						|_ zk.xml
	INSTALLATION:
		