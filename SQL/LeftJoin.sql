USE test_db1;

SELECT *
FROM student AS s
LEFT JOIN course AS c
ON s.id=c.id;
