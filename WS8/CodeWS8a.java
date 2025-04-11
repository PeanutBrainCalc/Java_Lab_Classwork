// Experiment 8.1

-- Create the database
CREATE DATABASE IF NOT EXISTS userdb;

-- Use the database
USE userdb;

-- Create users table
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Insert a sample user (password is in plain text for now)
INSERT INTO users (username, password) VALUES ('admin', 'password');
