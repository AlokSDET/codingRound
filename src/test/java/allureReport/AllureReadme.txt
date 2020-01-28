// Allure report:

Allure Framework is a flexible lightweight multi-language test reporting tool.
 It provides clear graphical reports and allows everyone involved in the development process 
 extract maximum of information from everyday testing process.


follow : https://www.swtestacademy.com/allure-testng/

download allure and run below command to generate the allure report 
: move in to repo
: command 1: allure serve allure-results

Maven dependency : 

add property : 
	<properties>
		<aspectj.version>1.8.10</aspectj.version>
	</properties>
	
	
add dependency:
<!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.13.1</version>
</dependency>


add argline: 
<argLine>
-javaagent:"${settings.localRepository}\org\aspectj\aspectjweaver\${aspectj.version}\aspectjweaver-${aspectj.version}.jar"
</argLine>

add in pluin : 

	<dependencies>
					<dependency>
						<groupId>org.aspectj</groupId>
						<artifactId>aspectjweaver</artifactId>
						<version>${aspectj.version}</version>
					</dependency>
	</dependencies>

			--------------------------------------------------------
			
	
			command 2: allure serve allure-results