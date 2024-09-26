-- SQL to create 'users' table
CREATE TABLE users (
    id SERIAL PRIMARY KEY,     -- 'id' is the primary key and will auto-increment
    name VARCHAR(100) NOT NULL, -- 'name' will store the user's name, cannot be null
    age INT NOT NULL            -- 'age' will store the user's age, cannot be null
);
