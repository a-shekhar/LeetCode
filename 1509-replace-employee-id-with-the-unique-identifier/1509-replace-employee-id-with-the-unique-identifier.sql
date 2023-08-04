# Write your MySQL query statement below
SELECT u.unique_id, e.name
FROM Employees e LEFT OUTER JOIN EmployeeUNI u
ON e.id = u.id