CREATE TABLE repository (name varchar(50) PRIMARY KEY NOT NULL, owner varchar(50) NOT NULL, issues int, fork int, lastUpdate bigint default 0);
CREATE TABLE statistique (id SERIAL PRIMARY KEY ,name varchar(50) NOT NULL,entry_type varchar(50) , creationdate bigint, value int);
create table users(
	username varchar(50) not null primary key,
	password varchar(150) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

insert into users values('quentin','$2a$10$VGftShiDWhdsclJ9gpNboeYxroV3jWJA0.n13EsaSz55FEQEHezWO',true);
insert into users authorities ('quentin','professeur');