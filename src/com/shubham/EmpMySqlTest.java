package com.shubham;

public class EmpMySqlTest {
    create database EmpPayRoll_Sql_Commands;
    show databases;
    use EmpPayRoll_Sql_Commands;

    create table employee_payroll(
            id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
            name varchar(25),
    salary INT,
    start_date DATE NOT NULL
    );

    insert into employee_payroll(name,salary,start_date) values("Kittu",400000,"22-11-22");
    insert into employee_payroll(name,salary,start_date) values("Santhosh",600000,"20-00-02");

    select * from employee_payroll;

    SELECT * FROM employee_payroll where name = "Santhosh";
    SELECT * FROM employee_payroll where start_date BETWEEN cast("2011-04-01" AS DATE) AND DATE(now());

    ALTER TABLE employee_payroll add column gender varchar(01);
    UPDATE employee_payroll set gender = "M" where name='Kittu';

    SELECT SUM(salary) from employee_payroll where gender = "M" group by gender;
    SELECT AVG(salary) from employee_payroll where gender = "M" group by gender;
    SELECT MIN(salary) from employee_payroll where gender = "M" group by gender;
    SELECT MAX(salary) from employee_payroll where gender = "M" group by gender;
    SELECT COUNT(salary) from employee_payroll where gender = "M" group by gender;

    ALTER TABLE employee_payroll add column department varchar(20);

    ALTER TABLE employee_payroll add column Basic_Pay int, add column
    Deductions int,add column Taxable_Pay int,add column
    Income_Tax int,add column Net_Pay int;

    ALTER TABLE employee_payroll add column phone int;
    ALTER TABLE employee_payroll add column address  varchar(21);

    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terrisa",4000,"2021-11-21",'M',94942122,"Hyd",'Sales',4000,200,1000,300,2700);
    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terrisa",4000,"2021-11-21",'M',94942231,"Hyd",'Marketing',4000,200,1000,300,2700);

    SELECT * FROM employee_payroll WHERE NAME = "Terrisa";
}
