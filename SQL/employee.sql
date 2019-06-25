CREATE TABLE DEPT (DEPTNO integer primary key,DNAME varchar(14),LOC varchar(13));
INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE EMP (EMPNO integer not null,ENAME varchar(10),JOB  varchar(9),MGR  integer ,
HIREDATE DATETIME,SAL double,COMM  double,DEPTNO integer NOT NULL,
CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO)
,CONSTRAINT EMP_SELF_KEY FOREIGN KEY (MGR) REFERENCES EMP (EMPNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO)
);

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1881-09-08',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-0',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

/* ALL employees ascending order of the name*/
select * from EMP order by ENAME;

/*all employees in dept 10*/
select * from EMP where  DEPTNO=10;

/*all employees from dept 10 and 20*/
select * from EMP where  DEPTNO=10 OR DEPTNO=20;

/* display all employees  whose commision is null*/
select * from EMP where COMM IS NULL;

/*display all employees whose salary is betwwen 2000 and 5000*/
select * from EMP where  SAL BETWEEN 2000 AND 5000;

/* display emp name , salary,commision and annual ctc*/
select ENAME,SAL,COMM,(SAL+ IFNULL(COMM,0))*12 ANNUAL_CTC from EMP;

/*display emp name, hireddate and experience*/
select  ENAME,HIREDATE,date_format(from_days(datediff('2019-06-25',HIREDATE)),'%Y')+0 as EXPERIENCE from EMP;

/*select all employees who is clerk*/
select * from EMP where JOB='CLERK';

/*Display unique DEPTNO from employee table*/
select Distinct DEPTNO  from emp;


