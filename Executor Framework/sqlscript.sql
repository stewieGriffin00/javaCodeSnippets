-- GOOD: Single query with JOIN
SELECT 
    o.id AS order_id,
    o.product_name,
    o.amount,
    o.order_date,
    c.id AS customer_id,
    c.name AS customer_name,
    c.email AS customer_email
FROM orders o
INNER JOIN customers c ON o.customer_id = c.id
ORDER BY o.order_date;

SELECT * FROM orders  JOIN customers ON orders.customer_id = customers.id"

-- Result (one query, 8 rows returned):
+----------+--------------+--------+------------+-------------+-----------------+------------------+
| order_id | product_name | amount | order_date | customer_id | customer_name   | customer_email   |
+----------+--------------+--------+------------+-------------+-----------------+------------------+
| 101      | Laptop       | 999.99 | 2024-03-01 | 1           | John Doe        | john@email.com   |
| 103      | Keyboard     | 79.99  | 2024-03-01 | 2           | Jane Smith      | jane@email.com   |
| 102      | Mouse        | 29.99  | 2024-03-02 | 1           | John Doe        | john@email.com   |
| 104      | Monitor      | 299.99 | 2024-03-03 | 3           | Bob Johnson     | bob@email.com    |
| 105      | Headphones   | 59.99  | 2024-03-04 | 1           | John Doe        | john@email.com   |
| 106      | Laptop       | 999.99 | 2024-03-05 | 4           | Alice Brown     | alice@email.com  |
| 107      | Mouse        | 29.99  | 2024-03-06 | 2           | Jane Smith      | jane@email.com   |
| 108      | Keyboard     | 79.99  | 2024-03-07 | 5           | Charlie Wilson  | charlie@email.com|
+----------+--------------+--------+------------+-------------+-----------------+------------------+