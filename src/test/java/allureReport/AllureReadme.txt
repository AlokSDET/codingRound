// Allure report:

Maven dependency : 


<!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.13.1</version>
</dependency>


<argLine>
-javaagent:"${settings.localRepository}\org\aspectj\aspectjweaver\${aspectj.version}\aspectjweaver-${aspectj.version}.jar"
</argLine>