## Hibernate-JPA Practice Apps
This repository contains a collection of practice applications developed using Hibernate and JPA. Each application is developed to fulfill different requirements, ranging from simple CRUD operations to more complex relationships between entities.

# Requirements
+ Java 8 or higher
+ Maven 3.6.0 or higher
+ MySQL 8.0 or higher
# Setup
1. Clone the repository using the following command:
~~~ bash
git clone https://github.com/yourusername/hibernate-jpa-practice.git
~~~
2. Import the project into your preferred IDE(**STS**).

3. Open the **application.properties** file and update the following properties with your MySQL database credentials:

~~~ bash
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
~~~
# Running the Applications
Each application is contained in a separate package within the **com.example.hibernatejpapractice** package. To run an application, navigate to the package containing the application and run the **main()** method in the **Application** class.

# Contributing
If you would like to contribute to this repository, please create a pull request with your changes.
