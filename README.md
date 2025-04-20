# E-Commerce Management System using Hibernate ORM Using Eclipse IDE

##  :memo: Overview

*This project presents a structured implementation of **Object-Relational Mapping (ORM)** utilizing the **Hibernate Framework**. It is designed to develop a functional  **E-Commerce Management System** that streamlines **the management of Categories, Products, Users, and Orders, with support for multiple Order Details per order**.*

### :pushpin: Technologies Used :-

- *Hibernate Framework.*
- *JDBC(Java Database Connectivity).*
- *MySQL (as the Database).*
- *Eclipse IDE (or any preferred Java IDE).*

## :pushpin: Project Features :-

- Create, update, and manage ***Categories**, **Products***, and ***Users***.
- Place ***Orders*** with corresponding ***Order Details***.
- Retrieve comprehensive ***Order*** information including linked ***Users*** and ***Products***.

## :pushpin: Setup Instructions :-

## 1. Open the Project in Your IDE :
- Import the project into ***Eclipse, IntelliJ IDEA***, or any compatible Java IDE.
- Set up the environment along with ***MySQL Workbench*** or an ***alternative MySQL client.***

## 2. Configure Project Dependencies :
- Confirm all required dependencies are listed and correctly configured in the ***'pom.xml'*** file.
- Use the ***'pom.xml'*** as a reference for managing project dependencies and libraries.

## 3. Configure the Database :
- ***Establish a local MySQL database instance***.
- Edit the ***'hibernate.cfg.xml'*** file with your specific database configuration:
- ***JDBC URL (including hostname, port, and database name)***
- ***Database credentials (username and password).***

## 4. Customize Entity Definitions :
- Modify the existing entity classes if customization is needed, or use the default structure provided.

## 5. Run the Application :
- Ensure the ***MySQL server*** is running and the configured database is created.
- Execute ***'App.java'*** to initialize the ***SessionFactory*** and automatically generate necessary tables.
- Lifecycle of the ***SessionFactory*** is managed through the ***'HibernateUtil.java' utility class***.

## 6. Verify Database and Output :
- Access ***MySQL Workbench*** or use the ***MySQL CLI*** to validate that the data is correctly stored and the tables are generated as expected.

## :pushpin: Development Highlights :-
- Domain models are annotated with JPA annotations including ***@Entity, @Table, @Id, @GeneratedValue, @OneToMany,*** and ***@ManyToOne*** for effective ORM implementation.
- Entity relationships are clearly defined using Hibernate’s cardinality annotations.
- Passwords are securely hashed using ***BCrypt*** , enhancing application security.
  
## :memo: Author

**Ankita Debnath**  
*Developer and Creator of the E-Commerce Management System using Hibernate ORM Using Eclipse IDE.*
