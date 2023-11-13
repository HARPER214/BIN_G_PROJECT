DROP SCHEMA BINGPROJECT;
CREATE SCHEMA BINGPROJECT;
use BINGPROJECT;
create table user (
-- id VARCHAR(100) AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(300) PRIMARY KEY NOT NULL,
pw VARCHAR(300) NOT NULL,
height INT(10) NOT NULL,
weight INT(10) NOT NULL,
name VARCHAR(40) NOT NULL,
age INT(10) NOT NULL,
gender VARCHAR(10) NOT NULL
);

select * from user;

create table location(
location_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,  
location_name VARCHAR(100) NOT NULL,
longitude DECIMAL(10,7) NOT NULL,
latitude DECIMAL(10,7) NOT NULL
);


CREATE TABLE board(
board_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
community_id INT(10) NOT NULL,
num INT(10) NOT NULL,
title VARCHAR(100) NOT NULL,
writer VARCHAR(100) NOT NULL,
content TEXT NOT NULL,
reg_date DATE DEFAULT CURRENT_TIMESTAMP,
is_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
location_id INT(10) NOT NULL,
FOREIGN KEY(location_id) REFERENCES location(location_id)
);

CREATE TABLE favorite(
favorite_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL, 
user_email VARCHAR(300) NOT NULL,
location_id INT(10) NOT NULL,
FOREIGN KEY(user_email) REFERENCES user(email),
FOREIGN KEY(location_id) REFERENCES location(location_id)
);

CREATE TABLE reply (
    reply_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    board_id INT(10) NOT NULL,
    writer VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    reg_date DATE NOT NULL,
    is_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (board_id) REFERENCES board(board_id)
);

select * from reply;
