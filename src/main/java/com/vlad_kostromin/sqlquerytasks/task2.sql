-- # For example, given the above Employee table, the query should return 200 as the second highest salary.
-- # If there is no second highest salary, then the query should return null.
-- # +---------------------+
-- # | SecondHighestSalary |
-- # +---------------------+
-- # | 200                 |
-- # +---------------------+

Create table If Not Exists taskschema2.Employee (Id int, Salary int);
Truncate table taskschema2.Employee ;
insert into taskschema2.Employee  (Id, Salary) values ('1', '100');
insert into taskschema2.Employee  (Id, Salary) values ('2', '200');
insert into taskschema2.Employee  (Id, Salary) values ('3', '300');

SELECT MAX(Salary) AS SecondHighestSalary
FROM taskschema2.Employee
WHERE Salary < (SELECT MAX(Salary) FROM taskschema2.Employee);
