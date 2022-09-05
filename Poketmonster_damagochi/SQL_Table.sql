
create table join(
id varchar2(20),
pw varchar2(20) not null,
nick varchar2(20) not null,
join_date date default sysdate,
constraint join_id_pk primary key(id));



create table Poke (
id varchar2(20),
poke_name varchar2(30),
skill_name varchar2(50),
level_ number(10) default 1,
types varchar2(20),
max_hp number(10) not null,
hp number(10) not null,
exp number(10) default 0,
constraint Poke_id_fk foreign key (id) references join(id));



drop table join
drop table poke;
select * from poke;
select * from join;
desc poke
desc join;

