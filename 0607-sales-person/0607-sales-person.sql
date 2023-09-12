# Write your MySQL query statement below
SELECT name FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT sales_id FROM  Company c
    RIGHT OUTER JOIN  Orders o
    ON o.com_id = c.com_id
    WHERE c.name = 'RED'
)