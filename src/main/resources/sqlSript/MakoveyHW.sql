Create USER helloworld IDENTIFIED BY 1234;
GRANT all privileges to helloworld;


create table HelWorld (
      id number(10,0) not null,
      message varchar2(255 char) not null,
      primary key (id)
  );