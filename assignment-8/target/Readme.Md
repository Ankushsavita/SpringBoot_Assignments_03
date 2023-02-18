# User-Management-System Application

* Framework - springBoot 3.0.2 version
* Langauge  - Java


* Data Flow --> 
* Model Class - it contains Attributes, Parameterized constructor,Getters & Setters, toString() Method etc.


* UserController Class - it contains all Build Api's which performs all CRUD(create,read,update,delete) operations and calling UserService Class Methods from here.


* UserService Class - it contains all Business logics of CRUD Operations and this class extends the IUserService Interface where all methods are abstract and these methods overriding in UserService class.


* IUserService Interface - this interface extends the another JpaRepository<User,Integer> (which contains some predefined methods which helps to write the sorter code and helps to fetch the data from Database)


* JpaRepository - it contains some predefined methods which helps to write the shorter code and helps to fetch the data from Database.


* DataBase - we are using H2 DataBase which is inMemory database or temporary database. it stores the data is RAM.


* Project Summary - We are created User Management System Application which take cares  the data of user.