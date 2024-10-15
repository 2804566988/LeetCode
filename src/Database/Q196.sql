DELETE FROM Person
WHERE id NOT IN(
    SELECT id FROM(
        SELECT min(id) AS id
        FROM Person
        GROUP BY email
    ) AS Temp
)
/*
   由于DELETE待更新的表和内部嵌套SELECT语句的目标表都是Person表,
   因此需要使用临时表Temp来存储每个email的最小id值，
   然后再通过NOT IN子句删除Person表中不在这个临时表中的所有行。
*/
