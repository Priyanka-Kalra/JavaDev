USE test_db;

SELECT * FROM teacher;

ALTER TABLE teacher
DROP COLUMN name;

ALTER TABLE teacher
ADD COLUMN age INT DEFAULT 19;

ALTER TABLE teacher
MODIFY age VARCHAR(2);

ALTER TABLE teacher
CHANGE age student_age INT;