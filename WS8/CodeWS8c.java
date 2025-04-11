// Experiment 8.3

create database studentPortal;

use studentPortal;

-- Create students table 
CREATE TABLE students (
student_id INT PRIMARY KEY, name VARCHAR(100) NOT NULL, class VARCHAR(20),
section CHAR(1)
);
-- Create attendance table 
CREATE TABLE attendance (
id INT PRIMARY KEY AUTO_INCREMENT,
student_id INT,
date DATE NOT NULL,
status ENUM('Present', 'Absent', 'Late') NOT NULL, remarks VARCHAR(255),
 FOREIGN KEY (student_id) REFERENCES students(student_id)
);

-- Insert sample student data
INSERT INTO students VALUES (1001, 'Alex Johnson', '10', 'A'); 
INSERT INTO students VALUES (1002, 'Sophia Davis', '10', 'A'); 
INSERT INTO students VALUES (1003, 'Ethan Wilson', '10', 'B'); 
INSERT INTO students VALUES (1004, 'Olivia Martin', '10', 'B'); 
INSERT INTO students VALUES (1005, 'Noah Thompson', '10', 'A');
