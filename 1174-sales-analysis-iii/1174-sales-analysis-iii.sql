# Write your MySQL query statement below
SELECT p.product_id, p.product_name FROM Product p
RIGHT OUTER JOIN  Sales s ON p.product_id = s.product_id
GROUP BY p.product_id
HAVING min(s.sale_date) >= '2019-01-01' AND max(s.sale_date) <= '2019-03-31'