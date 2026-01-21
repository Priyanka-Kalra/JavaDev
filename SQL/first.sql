
USE college;

INSERT INTO student(rollNum,name,marks,grade,city) VALUES
(1,"Priyanka",78,"B","Delhi"),
(2,"Woomsie",85,"B","Russia"),
(3,"Boomsie",70,"C","NYC"),
(4,"Drunkoomsie",98,"A","Bengaluru"),
(5,"Floofomsie",100,"A","Delhi");

SELECT * FROM student WHERE city NOT IN("Russia","Delhi") OR marks<70;

SELECT * FROM student LIMIT 3;

SELECT * FROM student ORDER BY marks ASC;
SELECT * FROM student ORDER BY city DESC;

SELECT COUNT(marks) FROM student WHERE marks>=80;

SELECT city,name, max(marks) FROM student GROUP BY city,name ORDER BY NAME ASC;

SELECT city, AVG(marks) FROM student GROUP BY city ORDER BY AVG(marks) ASC;