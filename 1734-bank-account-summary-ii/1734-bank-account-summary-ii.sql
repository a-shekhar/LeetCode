# Write your MySQL query statement below
SELECT u.name, sum(amount) AS balance FROM Users u
RIGHT OUTER JOIN Transactions t
ON u.account = t.account
GROUP BY u.account HAVING sum(amount) > 10000 