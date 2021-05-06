DROP TABLE IF EXISTS Profile;
CREATE TABLE Profile(id BIGINT NOT NULL  PRIMARY KEY, profileorigin VARCHAR(250), name VARCHAR(250),mobileno VARCHAR(250),location VARCHAR(250),experience FLOAT(2),skill1 VARCHAR(250),skill2 VARCHAR(250),skill3 VARCHAR(250));

INSERT INTO Profile(id, profileorigin, name, mobileno, location, experience, skill1, skill2, skill3) 
VALUES (1,'TCS', 'P1' , '1111111111','Chennai','2.00','java','angular','python'),
	(2, 'outside' , 'P2' , '2222222222','HYD','3.10','Angular','python','mysql');

