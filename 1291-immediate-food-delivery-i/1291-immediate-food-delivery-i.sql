# Write your MySQL query statement below
SELECT round( 
    ((SELECT count(*) FROM Delivery WHERE order_date = customer_pref_delivery_date)
    / (SELECT count(*) FROM Delivery)) * 100
    , 2) AS immediate_percentage