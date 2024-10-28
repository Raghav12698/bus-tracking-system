-- Insert recommendation types
INSERT INTO recommendation_type (id, type) VALUES 
    (1, 'Food Stop'), 
    (2, 'Place to Visit'), 
    (3, 'Toll'), 
    (4, 'Petrol Pump');

-- Insert recommendations
INSERT INTO recommendation (name, description, location, type_id, bus_id) VALUES
    ('Joe\'s Diner', 'Best breakfast stop on the way', 'Route A', 1, 1),
    ('Grand Canyon', 'Famous scenic viewpoint', 'Route A', 2, 1),
    ('Highway Toll', 'Toll booth near exit 22', 'Route A', 3, 1),
    ('Shell Station', '24/7 petrol station', 'Route A', 4, 1);
-- Insert recommendation types
INSERT INTO recommendation_type (id, type) VALUES 
    (1, 'Food Stop'), 
    (2, 'Place to Visit'), 
    (3, 'Toll'), 
    (4, 'Petrol Pump');

-- Insert recommendations
INSERT INTO recommendation (name, description, location, type_id, bus_id) VALUES
    ('Joe\'s Diner', 'Best breakfast stop on the way', 'Route A', 1, 1),
    ('Grand Canyon', 'Famous scenic viewpoint', 'Route A', 2, 1),
    ('Highway Toll', 'Toll booth near exit 22', 'Route A', 3, 1),
    ('Shell Station', '24/7 petrol station', 'Route A', 4, 1);
-- Create Roles Table
CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

-- Create Users Table
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role_id BIGINT,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

-- Insert Roles
INSERT INTO roles (name) VALUES ('ADMIN'), ('USER');

-- Insert Users with Hashed Passwords (for example purposes, hash these securely in real use)
INSERT INTO users (username, password, role_id) VALUES 
('admin', '{bcrypt}$2a$10$DOWq.sSS6WzDJKzGHh0FO.ZlUT9ALzYloz5.Q43OtYfUSZpzjYtFq', 1), -- password: admin123
('user', '{bcrypt}$2a$10$DOWq.sSS6WzDJKzGHh0FO.ZlUT9ALzYloz5.Q43OtYfUSZpzjYtFq', 2); -- password: user123
