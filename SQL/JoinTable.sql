CREATE DATABASE test_db1;

USE test_db1;

CREATE TABLE student(
	id INT PRIMARY KEY,
    name VARCHAR(40)
);

INSERT INTO student (id, name)
VALUES
(101,"Priyanka"),
(102,"Harsh"),
(103,"Ajay");

CREATE TABLE course(
	id INT PRIMARY KEY,
    course VARCHAR(40)
);

INSERT INTO course (id, course)
VALUES
(102,"English"),
(105,"Maths"),
(103,"Science"),
(107,"Computer Science");

SELECT * FROM student;
SELECT * FROM course;