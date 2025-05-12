Inventory Console App

A simple Java console-based Inventory Management System using MySQL and JDBC. This project allows users to manage products in a database with features like adding, viewing, updating, and deleting inventory items.


Features

- Add new products
- View all products
- Update product quantity
- Delete products
- Console-based menu interface
- MySQL database integration via JDBC


Project Structure

src/
├── Main.java
├── dao/
│   ├── ProductDAO.java
├── model/
│   ├── Product.java
├── util/
│   ├── DBConnection.java


Technologies Used

- Java 8+
- MySQL
- JDBC
- IntelliJ IDEA / Eclipse

Database Setup

1. Create the database:

CREATE DATABASE inventory_db;
USE inventory_db;

2. Create the products table:

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100),
    quantity INT NOT NULL,
    price DOUBLE NOT NULL
);




