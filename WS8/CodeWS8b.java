// Experiment 8.2

create database employeeDb;

USE employeeDb;

-- Create employee table 
CREATE TABLE employees (
id INT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
position VARCHAR(100), salary DOUBLE, hire_date DATE
);

-- Insert some sample data
INSERT INTO employees VALUES (101, 'John Doe', 'Software Engineer', 75000.00, '2020-01-15'); 
INSERT INTO employees VALUES (102, 'Jane Smith', 'Project Manager', 85000.00, '2019-05-20'); 
INSERT INTO employees VALUES (103, 'Bob Johnson', 'UI/UX Designer', 70000.00, '2021-03-10');
INSERT INTO employees VALUES (104, 'Alice Williams', 'Database Administrator', 80000.00, '2018-11-05'); 
INSERT INTO employees VALUES (105, 'Charlie Brown', 'System Analyst', 72000.00, '2020-09-25');
