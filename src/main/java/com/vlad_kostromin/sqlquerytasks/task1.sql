-- # Write a SQL query for a report that provides the following information for
-- # each person in the Person table, regardless if there is an address for each of those people:
-- # FirstName, LastName, City, State

Create table If Not Exists taskschema.Person (PersonId int, FirstName varchar(255), LastName varchar(255));
Create table If Not Exists taskschema.Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
Truncate table taskschema.Person;
insert into taskschema.Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
Truncate table taskschema.Address;
insert into taskschema.Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');

SELECT
    P.FirstName,
    P.LastName,
    A.City,
    A.State
FROM
    taskschema.Person P
        LEFT JOIN
    taskschema.Address A ON P.PersonId = A.PersonId;

