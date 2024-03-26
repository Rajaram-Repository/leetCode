CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N=N-1;
  RETURN (
       Select distinct salary from employee 
      order by salary desc
      limit 1
      offset N 
  );
END