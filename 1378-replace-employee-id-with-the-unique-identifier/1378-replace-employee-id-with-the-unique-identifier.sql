# Write your MySQL query statement below
select u.unique_id,e.name from 
Employees as e 
left JOIN EmployeeUNI as u 
using (id)