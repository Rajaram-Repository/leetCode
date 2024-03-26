Select f.name as name from employee as f 
where (select count(e.managerId) from employee as e where e.managerId=f.id)>=5