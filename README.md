# ExtraMile_NovaBase

## Getting Started
### Prerequisites
Technologies that need to be installed: 
* jdk-8
* mysql-server
* maven 
* jmeter
* npm 

With mysql-server installed it's necessary to create 6 databases whose names are: advbank, advactivity, advhotel, advtax, advcar and advbroker.
After reactJS is installed it's required to install the dependencies used on front-end. You can do that by execute the command in the  ```/broker-site``` directory:
```
npm install
```
## Running the tests
To run the unit tests execute the following command on the main directory: 
```
mvn clean install
```
If the goal is to execute load and stress tests you need to turn the servers and Jmeter on. You can do that by typing the following command on the ```/bin``` directory:
```
./startservers
```
On JMeter tool you need to load the tests(.jmx files) from this directory ```jmeter/tests```
```
jmeter/tests
```
If your wish is to turn them off then use: 
```
./shutdownservers
```
## Deployment


## Built With

* [ReactJS](https://reactjs.org/) - JavaScript library for building user interfaces
* [Maven](https://maven.apache.org/) - Dependency Management
* [SpringBoot](https://spring.io/projects/spring-boot) & [Thymeleaf](https://www.thymeleaf.org/) - Framework and Template engine to develop web servers using the architectural pattern MVC for web applications
* [Fénix Framework](https://fenix-framework.github.io/) - Transactional and persistent domain model
* [Apache JMeter](https://jmeter.apache.org/) - Tool used for basic load and stress testing on Web dynamic applications
* [JUnit](https://junit.org/junit5/) - Unit testing framework for the Java programming language integration testing
* [JMockit](http://jmockit.github.io/) - Library used for integration testing
 
## Authors
|   Number   |          Name           |                  Email                  |   GitHub Username  |
| ---------- | ----------------------- | --------------------------------------- | -------------------|
|   84766    |     Samuel Santos       |  samuel.c.santos@tecnico.ulisboa.pt     |    santos-samuel   |
|   84729    | João Francisco Almeida  | joao.santos.almeida@tecnico.ulisboa.pt  |     JFMSAlmeida    |
|   84704    |    Bernardo Andrade     | bernardo.andrade@tecnico.ulisboa.pt     |       Berhart      |
|   84727    |      Ivan Zarro         |       ivan.zarro@tecnico.ulisboa.pt     |     ivancivel      |
|   84842    |      José Ferrão        |       jozeus.alves@gmail.com            |       jozeus       |
|   84750    |      Nuno Bombico       |     nuno.bombico@tecnico.ulisboa.pt     |    nunoBombico1    |

## Acknowledgments

* Hat tip to anyone whose code was used
