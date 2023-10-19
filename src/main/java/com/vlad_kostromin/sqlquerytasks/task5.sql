-- # Suppose that a website contains two tables, the Customers table and the Orders table.
-- # Write a SQL query to find all customers who never order anything.
-- # Table: Customers.
-- # +----+-------+
-- # | Id | Name  |
-- # +----+-------+
-- # | 1  | Joe   |
-- # | 2  | Henry |
-- # | 3  | Sam   |
-- # | 4  | Max   |
-- # +----+-------+
-- #
-- # Table: Orders.
-- # +----+------------+
-- # | Id | CustomerId |
-- # +----+------------+
-- # | 1  | 3          |
-- # | 2  | 1          |
-- # +----+------------+
-- #
-- # Using the above tables as example, return the following:
-- # +-----------+
-- # | Customers |
-- # +-----------+
-- # | Henry     |
-- # | Max       |
-- # +-----------+

Create table If Not Exists taskschema5.Customers (Id int, FirstName varchar(255));
Create table If Not Exists taskschema5.Orders (Id int, CustomerId int);
Truncate table taskschema5.Customers;
insert into taskschema5.Customers (Id, FirstName) values ('1', 'Joe');
insert into taskschema5.Customers (Id, FirstName) values ('2', 'Henry');
insert into taskschema5.Customers (Id, FirstName) values ('3', 'Sam');
insert into taskschema5.Customers (Id, FirstName) values ('4', 'Max');
Truncate table taskschema5.Orders;
insert into taskschema5.Orders (Id, CustomerId) values ('1', '3');
insert into taskschema5.Orders (Id, CustomerId) values ('2', '1');

SELECT
    c.FirstName AS CustomerName
FROM
    taskschema5.Customers c
        LEFT JOIN
    taskschema5.Orders orde ON c.Id = orde.CustomerId
WHERE
    orde.Id IS NULL;