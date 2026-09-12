use dailytasks;

delimiter $$
drop procedure if exists newRec;
create procedure newRec()
begin 
declare count int default 0;

label : loop

select *from emp;

set count=count+1;
if count =4 then
leave label;
end if;
end loop label;
end
$$
call newRec();

DELIMITER $$
CREATE FUNCTION newFunc()
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN 444;
END$$

SELECT newFunc();



