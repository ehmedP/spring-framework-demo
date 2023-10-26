# Spring Framework Demo

This is a GitHub repository I created while learning Spring Framework. This repository contains information about the basic configuration of a Spring application and the libraries used.

## Configuration

The project includes the following configuration files:

- `application.properties`: A properties file that contains application configuration.
- `logback.xml`: An XML file that configures logging using the Logback library.

## Used Libraries

The project uses the following libraries:

- Spring Framework: The main library used for Spring application development.
- Spring Boot: A tool used to quickly bootstrap and configure Spring-based applications.
- Spring Data JPA: An integration of the Java Persistence API (JPA) that simplifies database operations.
- Hibernate: A library used for object-relational mapping (ORM) operations.
- Logback: A logging framework used for logging operations.
- Lombok: A library used to simplify and enhance Java classes.

## How to Run

Since the project is a Spring Boot application, you can follow these steps to run it:

1. Clone the project repository to your computer.
2. Open the project using a Java IDE (such as IntelliJ IDEA or Eclipse).
3. Locate the `DemoApplication.java` class within the project and run it.
4. Once the application is successfully started, you can view it by accessing `http://localhost:8080` in your browser.

## Prerequisites

To run this project, you will need to have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- WildFly 26.1.0

## Installing WildFly

To install WildFly, follow these steps:

1. Visit the WildFly download page at [https://www.wildfly.org/downloads/](https://www.wildfly.org/downloads/).
2. Scroll down to the "Latest Final Release" section and click on the "Download" button next to the WildFly 26.1.0 version.
3. Choose the appropriate distribution for your operating system (e.g., ZIP or TAR.GZ).
4. Once the download is complete, extract the contents of the downloaded file to a directory of your choice.
5. Open a terminal or command prompt and navigate to the directory where you extracted WildFly.
6. Start WildFly by running the following command:

```shell
   ./bin/standalone.sh
```

On Windows, use the following command instead:

```shell
   bin\standalone.bat
```

7. WildFly will start, and you can access the administration console at http://localhost:9990.
8. Deploy your Spring application to WildFly by copying the generated WAR file to the WildFly standalone/deployments directory.
9. WildFly will automatically deploy your application, and you can access it at http://localhost:8080/your-application-context, where your-application-context is the context path of your application.

Please note that these instructions are general, and you may need to adjust them based on your specific environment and requirements. Make sure to consult the WildFly documentation for more detailed information.

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork this repository to your own GitHub account.
2. Create a new branch that includes your changes.
3. Make your modifications and commit them.
4. Push the created branch to your repository.
5. Submit a pull request to this repository.
6. Your changes will be reviewed and evaluated together.

## License

This project is licensed under the Apache License 2.0. For more information, please see the [LICENSE](LICENSE) file.
