# Write your MySQL query statement below
SELECT max(num) AS num FROM MyNumbers
WHERE num NOT IN (SELECT num FROM MyNumbers GROUP BY num HAVING count(*) > 1)