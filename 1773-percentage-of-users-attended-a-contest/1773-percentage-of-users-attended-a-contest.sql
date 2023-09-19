# Write your MySQL query statement below
Select contest_id,
round(((count(user_id)/ (SELECT count(user_id) FROM Users)) * 100), 2) AS percentage FROM Register GROUP BY contest_id 
ORDER BY percentage DESC, contest_id ASC