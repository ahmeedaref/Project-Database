create database hospital 
use hospital
set dateformat dmy 
 
 create table doctor(doctor_id int primary key,f_name nvarchar(30)not null,l_name nvarchar(30)not null,speclization nvarchar(30))
 
 
 create table patient(patient_id int primary key, f_name nvarchar(30)not null,l_name nvarchar(30),date_admited date,date_checkout date )
 
 create table test(test_id int primary key,t_name nvarchar(30)not null,t_date date not null,rsult nvarchar(10)not null)
 
  
   
  
  insert into doctor values(123,'ahmed','aref','internal medican')
  insert into doctor values(124,'taha','ahmed','general surgy')
  insert into doctor values(125,'mohamed','essam','urology')
  

  
  insert into patient values(114,'ali','abdo','1/10/2000','1/2/2000')
  insert into patient values(115,'ahmed','ali','1/3/2000','15/3/2000')
  insert into patient values(116,'moahmed','ali','1/3/2000','1/6/2000')
  
  
  insert into test values(012,'SDEWD','1/2/2000','yes')
  insert into test values(013,'fds','3/4/2000','dsf')
  insert into test values(014,'dsa','2/3/2000','dsa')
  
  
  select*from doctor
  select*from patient
  select*from test
  
  update patient set l_name='aref' where patient_id=115
   
  create table perform(D_ID_fk int foreign key references doctor(doctor_id),T_ID_fk int foreign key references test(test_id))
  insert into perform values(124,012)
  insert into perform values (123,013)
  insert into perform values (125,014)
  
 create table caring(D_ID_fk int foreign key references doctor(doctor_id),P_ID_FK int foreign key references patient(patient_id)) 
 insert into caring values (124,114)
 insert into caring values (124,115)
 insert into caring values (125,114)
 
 

  
  create table associated_with(P_ID_fk int foreign key references patient(patient_id),T_ID_fk int foreign key references test(test_id))
  
  insert into associated_with values(114,012)
  insert associated_with values (116,014)
 
  select*from perform
  select*from caring
  select*from associated_with