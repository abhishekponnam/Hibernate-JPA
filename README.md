## Hibernate-JPA Practice Apps
This repository contains a collection of practice applications developed using Hibernate and JPA. Each application is developed to fulfill different requirements, ranging from simple CRUD operations to more complex relationships between entities.

# Requirements
+ Java 8 or higher
+ Maven 3.6.0 or higher
+ MySQL 8.0 or higher
# Setup
1. Clone the repository using the following command:
~~~ bash
git clone https://github.com/abhishekponnam/Hibernate-JPA.git
~~~
2. Import the project into your preferred IDE(**STS**).

3. Open the **src/main/resources/META-INF** file and update the following properties with your MySQL database credentials:

~~~ xml
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
            <property name="javax.persistence.jdbc.url"    value="jdbc:mysql://localhost:3306/yourDataBaseName" />
            <property name="javax.persistence.jdbc.user" value="yourUserName" />
            <property name="javax.persistence.jdbc.password" value="YourPassword" />
~~~
# Running the Applications
Each application is contained in a separate package within the **com.abhishek.client** or **com.abhishek.test** package. To run an application, navigate to the package containing the application and run the **main()** method in the **Application** class.

# Contributing
If you would like to contribute to this repository, please create a pull request with your changes.
