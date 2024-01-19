# Write your MySQL query statement below
select distinct (machine_id) ,
ROUND (
(select avg(timestamp) from Activity as e where e.activity_type='end' and e.machine_id=f.machine_id ) - 
(select avg(timestamp) from Activity as s where s.activity_type='start' and s.machine_id=f.machine_id) 
,3)
as processing_time from Activity as f 