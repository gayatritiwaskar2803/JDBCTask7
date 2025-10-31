
🔹 Project Title:
Employee Management System (Java + MySQL + JDBC)

🔹 Objective:
This project demonstrates Java Database Connectivity (JDBC) by performing CRUD operations (Create, Read, Update, Delete) on an employee database using MySQL.

🔹 Features:
1. Add new employee
2. View all employees
3. Update employee salary
4. Delete an employee record
5. Exit from the program

🔹 Technologies Used:
- Java (JDK 17)
- MySQL Database
- MySQL Connector/J (JDBC Driver)

🔹 Files Included:
1. DBConnection.java – Establishes connection to MySQL database.
2. EmployeeDAO.java – Contains CRUD operations.
3. Main.java – Menu-driven main class for user interaction.
4. README.txt – Project details and setup guide.

🔹 How to Run:
1. Install and set up MySQL on your computer.
2. Create the database and table using these commands:

   CREATE DATABASE employee_db;
   USE employee_db;

   CREATE TABLE employees (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(50),
       department VARCHAR(50),
       salary DOUBLE
   );

3. Download and extract mysql-connector-j-9.5.0.
4. In your Java IDE (Eclipse or IntelliJ):
   - Right-click project → Properties → Java Build Path → Libraries → Add External JARs
   - Add mysql-connector-j-9.5.0.jar file.
5. Run Main.java file.

🔹 Sample Output:
Database Connected Successfully!

===== Employee Database Menu =====
1. Add Employee
2. View Employees
3. Update Employee Salary
4. Delete Employee
5. Exit

Enter your choice: 1
Enter name: Aditya
Enter department: Doctor
Enter salary: 120000
Employee Added Successfully!

🔹 Developed By:
Gayatri Tiwaskar
🎓 Final Year Engineering Student
💻 Java Developer Intern
