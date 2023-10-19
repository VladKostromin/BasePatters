-- # There is a table courses with columns: student and class
-- # Please list out all classes which have more than or equal to 5 students.
-- # For example, the table:
-- # +---------+------------+
-- # | student | class      |
-- # +---------+------------+
-- # | A       | Math       |
-- # | B       | English    |
-- # | C       | Math       |
-- # | D       | Biology    |
-- # | E       | Math       |
-- # | F       | Computer   |
-- # | G       | Math       |
-- # | H       | Math       |
-- # | I       | Math       |
-- # +---------+------------+
-- #
-- # Should output:
-- # +---------+
-- # | class   |
-- # +---------+
-- # | Math    |
-- # +---------+

Create table If Not Exists taskschema6.Courses (student varchar(255), class varchar(255));
Truncate table taskschema6.Courses;
insert into taskschema6.Courses (student, class) values ('A', 'Math');
insert into taskschema6.Courses (student, class) values ('B', 'English');
insert into taskschema6.Courses (student, class) values ('C', 'Math');
insert into taskschema6.Courses (student, class) values ('D', 'Biology');
insert into taskschema6.Courses (student, class) values ('E', 'Math');
insert into taskschema6.Courses (student, class) values ('F', 'Computer');
insert into taskschema6.Courses (student, class) values ('G', 'Math');
insert into taskschema6.Courses (student, class) values ('H', 'Math');
insert into taskschema6.Courses (student, class) values ('I', 'Math');

SELECT class, COUNT(student) AS student_count FROM taskschema6.Courses GROUP BY class HAVING COUNT(student) >= 5;
