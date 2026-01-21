USE test_db1;

SELECT *
FROM student AS s
RIGHT JOIN course AS c
ON s.id=c.id;
