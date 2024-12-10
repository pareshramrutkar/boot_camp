<b> Student-Subject API with Spring Boot <b> <br>

This is a Spring Boot application that manages students and subjects. It allows for student creation, subject creation, and management of student-subject relationships. The application uses MySQL for data storage, Spring Security for authentication, and supports role-based access control. <br>

Features: <br>
Student Entity: Includes name and address fields.<br>
Subject Entity: Includes a name field.<br>
A Student can enroll in multiple Subjects.

APIs:<br>
POST /students: Create a new student. <br>
POST /subjects: Create a new subject. <br>
GET /students: Get all students. <br>
GET /subjects: Get all subjects. <br>

Requirements: <br>
Java 17 (or later) <br>
Maven <br>
MySQL Database <br>

Setup Instructions: <br>
1. Clone the Repository <br>
2. Configure MySQL Database <br>
3. Build and Run the Application <br>
4. Testing the API with Authentication <br>

Dependencies: <br>
Spring Boot Starter Web: To build the REST API. <br>
Spring Data JPA: For ORM-based database operations. <br>
MySQL Connector: MySQL JDBC driver. <br>
Spring Security: For authentication and authorization. <br>
JWT (Optional): For token-based authentication. <br>
