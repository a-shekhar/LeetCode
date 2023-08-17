# Write your MySQL query statement below
SELECT u.name, COALESCE(sum(r.distance), 0) AS travelled_distance
FROM Users u LEFT OUTER JOIN Rides r
ON u.id = r.user_id 
GROUP BY u.id
ORDER BY travelled_distance DESC, u.name ASC