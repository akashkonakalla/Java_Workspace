/*
Mysql
1.Display employees whose name starts with 'S' and ends with 'H'.
2.Display employees whose second letter is 'A'.
3.Display employees whose third letter is 'R'.
4.Display employees whose name contains exactly one 'A'.
5.Display employees whose name has exactly 5 characters.
*/


set autocommit=0;
select ename from emp where ename like 's%h';
savepoint sp1;
select ename from emp where ename like '_A%';
savepoint sp2;
select ename from emp where ename like '__R%';
savepoint sp3;
select ename from emp where ename like '%a%' and ename not like '%a%a%';
savepoint sp4;
rollback to sp4;
select *from emp where length(ename)=5;
select *from emp where ename like "_____";
commit;
