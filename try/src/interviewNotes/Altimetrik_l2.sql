SQL - Find the top 3 customers who have spent the most money on their orders
Get customer name, email, and  total amount
 
 
You have the following tables in a retail database:
 
**Customers:**
| CustomerID | Name        | Email                 | JoinDate   |
|------------|-------------|-----------------------|------------|
| 1          | John   	| john@example.com      | 2020-01-10 |
| 2          | Jane     | jane@example.com      | 2020-05-22 |
| 3          | Sam   	| sam@example.com       | 2021-02-14 |
 
**Orders:**
| OrderID | CustomerID | OrderDate   | TotalAmount |
|---------|------------|-------------|-------------|
| 101     | 1          | 2021-03-12  | 150.00      |
| 102     | 1          | 2021-06-15  | 200.00      |
| 103     | 2          | 2021-04-10  | 300.00      |
| 104     | 3          | 2021-08-20  | 250.00      |
| 105     | 2          | 2021-12-25  | 175.00      |
 
**OrderItems:**
| OrderItemID | OrderID | ProductID | Quantity | Price   |
|-------------|---------|-----------|----------|---------|
| 1           | 101     | 201       | 2        | 50.00   |
| 2           | 101     | 202       | 1        | 50.00   |
| 3           | 102     | 203       | 4        | 50.00   |
| 4           | 103     | 201       | 3        | 100.00  |
| 5           | 104     | 204       | 5        | 50.00   |
| 6           | 105     | 202       | 7        | 25.00   |





Find the top 3 customers who have spent the most money on their orders
Get customer name, email, and  total amount


>

with a as (select CustomerID, sum(TotalAmount) as "money" 
				from orders o 
				group by CustomerID 
				order by o.money desc 
				limit 3
) 
Select C.name , C.Email,a.money from Customers C
join a on C.CustomerID = a.CustomerID






