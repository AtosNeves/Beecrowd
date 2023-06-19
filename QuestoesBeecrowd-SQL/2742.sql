SELECT l.name, round((l.omega*1.618),3) AS "Fator N"
FROM life_registry AS l INNER JOIN dimensions AS d 
ON l.dimensions_id = d.id 
WHERE d.name IN ('C875','C774') AND l.name LIKE 'Richard%'
ORDER BY l.omega ASC;
