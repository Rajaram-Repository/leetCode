# Write your MySQL query statement below
select E.name as Employee from Employee E join Employee M  where E.managerId=m.ID and E.salary > M.salary

# select e.name as Employee
# from employee e join employee m
# where e.managerId = m.id and e.salary > m.salary;