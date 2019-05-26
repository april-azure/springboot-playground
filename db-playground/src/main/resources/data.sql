 -- automatic load at start --
create table person 
(
	id varchar(36) not null, 
	name varchar(255) not null, 
	birth_date timestamp, 
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, BIRTH_DATE ) 
VALUES('07166672-d88f-406b-8cce-01cde796026b',  'Ranga', sysdate());
INSERT INTO PERSON (ID, NAME, BIRTH_DATE ) 
VALUES('d5e40a79-fcf9-4cd7-9ee4-e5bc851f9888',  'James', sysdate());
INSERT INTO PERSON (ID, NAME, BIRTH_DATE ) 
VALUES('c2fa7058-cc3f-4707-b96b-2b4400df7253',  'Pieter', sysdate());
