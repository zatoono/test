set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_onozato;
create database logindb_onozato;
use logindb_onozato;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");