# Write your MySQL query statement below
SELECT name FROM Employee 
WHERE id IN (SELECT managerId FROM Employee GROUP BY managerId HAVING  managerID IS NOT NULL AND count(*) >= 5)