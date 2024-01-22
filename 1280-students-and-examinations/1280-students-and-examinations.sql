# Write your MySQL query statement below

select 

s.student_id ,s.student_name ,
sub.subject_name ,
(select count(e.student_id) from Examinations as e 
 where 
    e.subject_name = sub.subject_name
    and
    e.student_id  = s.student_id ) as attended_exams

from Students as s , Subjects as sub order by s.student_id,sub.subject_name ;