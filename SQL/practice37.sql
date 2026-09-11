/*
*Today's Assignment*

Java-
1.Create an abstract class Account with a static method, concrete method, and abstract method. Create two subclasses and determine which methods can be accessed using the class name and which require an object.

PL/SQL-
1.Write a stored procedure that can calculate the sum of N natural numbers.
*/

delimiter $$
drop procedure if exists sumOfNatural;
create procedure sumOfNatural(in n int , out sum int)
begin
declare i int default 1;
set sum =0;

label: loop

if i>n then
leave label;
end if;
set sum=sum+i;
set i=i+1;
end loop label;
end
$$

call sumofnatural(100,@sum);
select @sum;