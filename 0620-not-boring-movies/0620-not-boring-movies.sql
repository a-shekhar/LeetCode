# Write your MySQL query statement below
SELECT id, movie, description, rating 
FROM Cinema
WHERE description != 'boring' AND mod(id, 2) = 1
ORDER BY rating DESC