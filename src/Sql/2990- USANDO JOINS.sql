SELECT empregados.cpf, empregados.enome, departamentos.dnome FROM empregados 
INNER JOIN departamentos ON empregados.dnumero = departamentos.dnumero 
LEFT JOIN trabalha ON empregados.cpf = trabalha.cpf_emp WHERE trabalha.cpf_emp IS NULL 
ORDER BY empregados.cpf;
