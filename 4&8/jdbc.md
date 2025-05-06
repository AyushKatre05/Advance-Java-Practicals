SHOW DATABASES;

USE AK;

SHOW TABLES;

DESCRIBE users;


INSERT INTO users (name, email) VALUES ('Ayush', 'ayush@gmail.com');

INSERT INTO users (name, email) VALUES ('John', 'john@gmail.com');

SELECT * FROM users;

SELECT * FROM users WHERE name = 'Ayush';

SELECT * FROM users WHERE email = 'john@gmail.com';

UPDATE users SET name = 'Ayush Katre' WHERE email = 'ayush@gmail.com';

UPDATE users SET email = 'john.rahul@gmail.com' WHERE name = 'John';


SELECT * FROM users;

DELETE FROM users WHERE name = 'Ayush';

DELETE FROM users WHERE email = 'john@gmail.com';
