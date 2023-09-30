# Write your MySQL query statement below
SELECT activity_date AS day, count(DISTINCT user_id) AS active_users FROM
Activity GROUP BY day HAVING day > DATE_SUB('2019-07-27', INTERVAL 30 DAY)
AND day <= '2019-07-27'