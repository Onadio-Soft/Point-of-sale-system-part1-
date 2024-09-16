CREATE DATABASE UserInfo;
USE UserInfo;
CREATE TABLE admin(
adminid varchar(30),
userName varchar(30),
password varchar(60),
email varchar(80),
contact varchar(20)
);


DROP TABLE admin;
SELECT *FROM admin;
INSERT INTO admin VALUES('1','raveen006','12345678','facke1@gmail.com',0769006212);


CREATE TABLE employee
(
 accID varchar(20) primary key,
 empID varchar(30),
 userName varchar(30),
 pass varchar(20)
); 
SELECT * FROM employee;
SELECT * FROM emInfo;
DELETE FROM emInfo WHERE emID = 'e8';
INSERT INTO employee VALUES ('a002','e002','joe456','789');



CREATE TABLE Items(
ItemCode varchar(20) PRIMARY KEY,
ItemName varchar(30),
Catagory varchar(30),
UnitPrice double,
Amount int
);



SELECT *FROM Items;
CREATE TABLE Customer(
cusID varchar(20) PRIMARY KEY,
pType varchar(20),
billTot double ,
givenAmu double,
date varchar(20),
cashier varchar(20)
);



DROP TABLE Customer;
SELECT *FROM Customer;
INSERT INTO Customer VALUES('0','cash',1200,1500,'2024/7/31','kevin karter');
INSERT INTO Customer VALUES('2','cash',1200,1600,'2024/4/20','kevin karter');
DELETE FROM Customer WHERE cusID = '2';
UPDATE Customer SET cusID = '1',pType='cash',discount=0,billTot = 1200,givenAmu = 1500,date = '2024-7-31',cashier = 'kevin karter' WHERE cusID = '0';



CREATE TABLE emInfo(
emID varchar(20) PRIMARY KEY,
name varchar(40),
address varchar(50),
usName varchar(30)
);



SELECT *FROM emInfo;



CREATE TABLE shipmentOrders(
ID varchar(50) PRIMARY KEY,
shipmentID varchar(50),
serviceProvider varchar(50),
sendingLocation varchar(50),
destination varchar(50),
countryCode varchar(50),
description varchar(90),
total double
);



DELETE FROM shipmentOrders WHERE shipmentID = 'e2';
SELECT *FROM shipmentOrders;
INSERT INTO shipmentOrders VALUES('1','e1','Fedex','USA','china','2000','none',3000);



CREATE TABLE shipmentProducts(
shid int AUTO_INCREMENT PRIMARY KEY,
productID varchar(20),
shipmentOrID varchar(50),
amount double  
);



SELECT *FROM shipmentProducts;
DELETE FROM shipmentProducts WHERE shid = 2;
DROP TABLE shipmentProducts;
INSERT INTO employee VALUES ('a001','e001','raveen006','12345678');
INSERT INTO emInfo VALUES ('e001','Kevin karter','Victoria street,colombo 7','raveen006');
INSERT INTO emInfo VALUES ('e002','Joe heffly','Ants street , Mathara','joe456');
select * FROM employee;
select * FROM Items;
SELECT cusID FROM Customer WHERE cusID = (SELECT MAX(cusID) FROM Customer);


CREATE TABLE organization(
ID varchar(20) PRIMARY KEY,
name varchar(60),
address varchar(80),
contact varchar(50),
mail varchar(60)
);
INSERT INTO organization VALUES('1','test1','test1','test1','test1');
SELECT *FROM organization;

CREATE TABLE test1(
line1 varchar(20) PRIMARY KEY,
line2 varchar(20),
line3 varchar(20),
line4 varchar(20)
);
INSERT INTO test1 VALUES('e1','kavin');
INSERT INTO test1 VALUES('e2','joe');
INSERT INTO test1 VALUES('e3','Ember');
SELECT *FROM test1;
DELETE FROM test1;
DROP TABLE test1;