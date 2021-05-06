DROP TABLE IF EXISTS Profile;
CREATE TABLE Profile(id BIGINT NOT NULL  PRIMARY KEY, profileOrigin VARCHAR(250), Name VARCHAR(250) NOT NULL,mobileNo VARCHAR(250) NOT NULL,Location VARCHAR(250),Experience FLOAT(2),skill1 VARCHAR(250),skill2 VARCHAR(250),skill3 VARCHAR(250));

INSERT INTO Profile(id,profileOrigin,Name,mobileNo,Location,Experience,skill1,skill2,skill3) 
VALUES (1,'TCS', 'P1' , '11111111','Chennai','2.00','java','angular','python'),
	(2, 'outside' , 'P2' , '222222','HYD','3.10','Angular','python','mysql');

