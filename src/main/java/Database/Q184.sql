SELECT
    d.name AS Department,e.name AS Employee,e.salary AS Salary
FROM
    Employee AS e,
    Department AS d
WHERE
    e.departmentId = d.id
    AND (e.departmentId,salary) IN
          (SELECT
               departmentId,
               max(Salary)
           FROM
               Employee
           GROUP BY
               departmentId)