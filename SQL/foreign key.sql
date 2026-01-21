
USE test_db;

CREATE TABLE dept(
	id INT PRIMARY KEY,
    name VARCHAR(50)
);
SELECT * FROM dept;

CREATE TABLE teacher (
    roll_num INT PRIMARY KEY,
    name VARCHAR(50),
    dept_id INT NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES dept(id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

INSERT INTO dept
VALUES
(103,"Sammy");

SELECT * FROM dept;
SELECT * FROM teacher;

INSERT INTO teacher 
VALUES
(1,"Boomsie",101);

UPDATE dept 
SET id=106
WHERE id=101;
