WITH 
    vencedores as 
    (SELECT CONCAT('Podium: ',team) as resultado FROM league LIMIT 3),
    rebaixados as 
    (SELECT CONCAT('Demoted: ',team)as resultado FROM league OFFSET 13)
    
SELECT resultado FROM vencedores UNION ALL SELECT resultado FROM rebaixados;
    
