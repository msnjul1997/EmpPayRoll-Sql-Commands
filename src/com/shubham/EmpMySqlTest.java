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
}
