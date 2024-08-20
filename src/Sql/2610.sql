SELECT CAST(SUM(products.price)/ (COUNT(products)) as DECIMAL(10,2)) 
as price FROM products;
