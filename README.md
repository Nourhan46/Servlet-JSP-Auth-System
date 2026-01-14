#  Servlet & JSP Authentication System

A raw Java Web Application demonstrating the **MVC (Model-View-Controller)** architecture, implementing a full **User Authentication** flow using standard Java technologies.

##  Project Overview
This project was built to understand the core concepts of Java Backend Development before moving to frameworks like Spring Boot. It handles HTTP requests, manages user sessions manually, and connects to a relational database using JDBC.

##  Tech Stack
* **Language:** Java 17+
* **Backend:** Java Servlets (Controller), JDBC (Data Access)
* **Frontend:** JSP (View), HTML, CSS
* **Database:** Microsoft SQL Server
* **Server:** Apache Tomcat 9/10
* **IDE:** Eclipse Enterprise

##  Key Features
* **MVC Pattern:** Clean separation between Logic (Servlet), Data (DAO), and UI (JSP).
* **Database Connectivity:** Uses JDBC to validate users against `Users_DB`.
* **Session Management:**
    * Creates HTTP Sessions upon login.
    * Implements `Logout` to invalidate sessions.
    * Prevents unauthorized access to the Welcome page.
    * Disables browser caching to secure logout (User cannot press "Back").

##  Database Setup
To run this project, create a database named `Users_DB` in MS SQL Server and run the following script:

```sql
CREATE TABLE users (
    id INT IDENTITY(1,1) PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- Insert a test user
INSERT INTO users (user_name, password) VALUES ('nour', '123456');
