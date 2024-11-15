Employee
	EmployeeID,
	Name,
	DeptID
	122-abc-NULL
	123-xyz -1

Dept
	DeptID,
	DeptName
	
	1-HR
	
Salary 
	empId
	Salary
	
	
	Find all employe where dept not assigned
	
	>Select employeeID, Name, DeptID  from employe where deptId is null ;
	
	>select  employeeID, Name, DeptID  from employee e left join dept d where e.deptId <> d.DeptId ;
	
	
	with a as (select s.salary, s.empid, e.deptid, e.empId from
	employee e join salary s 
	on s.empID = e.empId),
	with b as (select e.employeeID , d.deptID from employee e join dept d on e.empid = d.deptID)
	select sum(a.salary),a.deptid from a join b on a.empid=b.empId
	group by a.Deptid 
	
	
	
	
	
	
	
