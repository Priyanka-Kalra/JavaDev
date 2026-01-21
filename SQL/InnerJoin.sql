USE test_db1;

SELECT *
FROM student AS s
INNER JOIN course AS c
ON s.id=c.id;
