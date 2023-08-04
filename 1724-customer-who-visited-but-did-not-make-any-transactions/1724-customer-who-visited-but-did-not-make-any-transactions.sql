# Write your MySQL query statement below
SELECT v.customer_id, count(visit_id) AS count_no_trans FROM Visits  v
WHERE visit_id NOT IN
(SELECT visit_id FROM Transactions)
GROUP BY v.customer_id