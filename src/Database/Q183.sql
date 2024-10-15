SELECT
    name AS Customers
FROM
    Customers AS c LEFT JOIN Orders AS o
ON
    c.id = o.customerId
WHERE
    -- 注意这里不能用"= null" 必须用 "is null" 来判断
    o.customerId is null