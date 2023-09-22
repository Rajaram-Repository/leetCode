select E.name as Employee from Employee E inner join Employee M  on E.managerId=m.ID and E.salary > M.salary
