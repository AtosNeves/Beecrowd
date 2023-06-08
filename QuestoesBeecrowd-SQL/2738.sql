SELECT candidate.name, CAST((score.math*2 + score.specific*3 +score.project_plan*5)/10 
AS DECIMAL(10,2)) 
as resultado
FROM candidate INNER JOIN score 
ON candidate.id = score.candidate_id 
ORDER BY resultado DESC;
