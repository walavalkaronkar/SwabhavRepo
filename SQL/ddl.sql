create database swabhav;
use swabhav;
create table student (id integer primary key,name varchar(20),cgpa float,loginId varchar(10),password varchar(10));
insert into student values(101,"Onkar",10.5,"onkar","onkar");
insert into student values(102,"abhishek",10.5,"abhishek","abhishek");
insert into student values(103,"shekar",8.5,"shekar","shekar");
insert into student values(104,"mahesh",9.5,"mahesh","mahesh");
select* from student;

create table course(courseId integer primary key,courseName varchar(20),fees integer);
insert into course values(1,"java",10000);
insert into course values(2,"Angular",10000);
insert into course values(3,"Asp .Net",15000);
insert into course values(4,"python",20000);
select * from course;

ALTER TABLE student
Add courseId integer;
ALTER TABLE student
ADD FOREIGN KEY (courseId) REFERENCES course(courseId);
insert into student values(106,"mahesh",9.5,"mahe1sh","mahesh",1);


create table college (collegeId integer primary key,collegeName varchar(20), location varchar(20));
Insert into college values(101,"SJECM","Palghar");


create table student1(studentId integer primary key, studentName varchar(20),collegeId integer,FOREIGN KEY (collegeId) REFERENCES college(collegeId));
insert into student1 values(1,"abhishek",101);
insert into student1 values(2,"deepak",101);
insert into student1 values(3,"shekar",101);
insert into student1 values(4,"shekar",102);


create table Professor(professorId integer primary key, professorName varchar(20),collegeId integer,FOREIGN KEY (collegeId) REFERENCES college(collegeId));

insert into Professor values(1,"professor1",101);
insert into Professor values(2,"professor2",101);



create table Customer( customerId integer primary key auto_increment,customerName varchar(20), contactNumber integer);
insert into Customer(customerName,contactNumber) values ("abhishek",1234567890);
insert into Customer(customerName,contactNumber) values ("shekar",1234567890);
insert into Customer(customerName,contactNumber) values ("deepak",1234567890);
select * from Customer;

create table Product(productId integer primary key auto_increment,productName varchar(20));
alter table Product add price integer;
insert into Product(productName,price) values("Mobile",1000);
insert into Product(productName,price) values("Charger",1000);
insert into Product(productName,price) values("Laptops",1000);
insert into Product(productName,price) values("Mobile",1000);

select * from Product;

create table LineItem(lineItemId integer primary key auto_increment,quantity integer, productId integer, orderId integer ,
FOREIGN KEY (productId) REFERENCES Product(productId),FOREIGN KEY (orderId) REFERENCES Orders(orderId));

insert into LineItem(quantity,productId,orderId) values(3,1,1);
insert into LineItem(quantity,productId,orderId) values(4,1,2);
insert into LineItem(quantity,productId,orderId) values(2,2,1);

select * from LineItem;


create table Orders(orderId integer primary key auto_increment,customerId integer,
FOREIGN KEY (customerId) REFERENCES Customer(customerId));
insert into Orders(customerId) values(1);
insert into Orders(customerId) values(2);
insert into Orders(customerId) values(3);
select * from orders;




