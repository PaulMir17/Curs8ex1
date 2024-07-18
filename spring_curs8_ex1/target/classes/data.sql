create schema c6e1;
use c6e1;
drop table if exists books;

create table books(
 id int not null primary key auto_increment,
 title varchar(100) not null,
 price decimal(6,2) not null
);

INSERT into books(title, price) VALUES
('Ana Karenina' ,150.99),
('David Copperfield' , 50.99);