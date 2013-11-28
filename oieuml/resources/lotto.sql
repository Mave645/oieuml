SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE GewinneSpiel77;
DROP TABLE GewinneSuper6;
DROP TABLE LottoZahlenSet;
DROP TABLE Quoten6Aus49;
DROP TABLE LottoSchein;
DROP TABLE LottoZiehung;
DROP TABLE LottoGebuehren;
DROP TABLE LottoEinsatz;
DROP TABLE QuotenSpiel77;
DROP TABLE QuotenSuper6;
DROP TABLE VerteilungsSchluessel6Aus49;




/* Create Tables */

CREATE TABLE GewinneSpiel77
(
	idGewinneSpiel77 bigint NOT NULL AUTO_INCREMENT,
	idLottoZiehung bigint NOT NULL,
	klasse1Gewinne int NOT NULL,
	klasse2Gewinne int NOT NULL,
	klasse3Gewinne int NOT NULL,
	klasse4Gewinne int NOT NULL,
	klasse5Gewinne int NOT NULL,
	klasse6Gewinne int NOT NULL,
	klasse7Gewinne int NOT NULL,
	PRIMARY KEY (idGewinneSpiel77)
);


CREATE TABLE GewinneSuper6
(
	idGewinneSpiel77 bigint NOT NULL AUTO_INCREMENT,
	idLottoZiehung bigint NOT NULL,
	klasse1Gewinne int NOT NULL,
	klasse2Gewinne int NOT NULL,
	klasse3Gewinne int NOT NULL,
	klasse4Gewinne int NOT NULL,
	klasse5Gewinne int NOT NULL,
	klasse6Gewinne int NOT NULL,
	PRIMARY KEY (idGewinneSpiel77)
);


CREATE TABLE LottoZahlenSet
(
	idLottoZahlenSet bigint NOT NULL AUTO_INCREMENT,
	lottoZahlen bigint NOT NULL,
	idLottoSchein bigint NOT NULL,
	PRIMARY KEY (idLottoZahlenSet)
);


CREATE TABLE Quoten6Aus49
(
	idQuoten6Aus49 bigint NOT NULL AUTO_INCREMENT,
	gewinnKlasse int(1) NOT NULL,
	gewinne int NOT NULL,
	quoten decimal(10,2) NOT NULL,
	idLottoZiehung bigint NOT NULL,
	PRIMARY KEY (idQuoten6Aus49),
	CONSTRAINT quoten_id_unique_constraint UNIQUE (gewinnKlasse, idLottoZiehung)
);


CREATE TABLE LottoSchein
(
	idLottoSchein bigint NOT NULL AUTO_INCREMENT,
	super6 boolean NOT NULL,
	spielScheinNummer int(7) NOT NULL,
	abgabeDatum timestamp NOT NULL,
	spiel77 boolean NOT NULL,
	gluecksSpirale boolean NOT NULL,
	ziehungsTage enum('MITTWOCH','SAMSTAG','MITTWOCH_SAMSTAG') NOT NULL,
	laufZeit enum('EINE_WOCHE','ZWEI_WOCHEN','DREI_WOCHEN','VIER_WOCHEN','FUENF_WOCHEN','DAUERHAFT') NOT NULL,
	PRIMARY KEY (idLottoSchein)
);


CREATE TABLE LottoZiehung
(
	idLottoZiehung bigint NOT NULL AUTO_INCREMENT,
	ziehungsDatum timestamp NOT NULL UNIQUE,
	gluecksSpirale int(7) NOT NULL,
	spiel77 int(7) NOT NULL,
	super6 int(6) NOT NULL,
	superZahl int(1) NOT NULL,
	gewinnZahlen bigint NOT NULL,
	jackpot6Aus49 decimal(12,2) NOT NULL,
	jackpotSpiel77 decimal(12,2) NOT NULL,
	PRIMARY KEY (idLottoZiehung)
);


CREATE TABLE LottoGebuehren
(
	idLottoGebuehren bigint NOT NULL AUTO_INCREMENT,
	gueltigAb timestamp NOT NULL UNIQUE,
	gebuehr decimal(6,2) NOT NULL,
	PRIMARY KEY (idLottoGebuehren)
);


CREATE TABLE LottoEinsatz
(
	idLottoEinsatz bigint NOT NULL AUTO_INCREMENT,
	gueltigAb timestamp NOT NULL UNIQUE,
	einsatzProKaestchen decimal(6,2) NOT NULL,
	einsatzSuper6 decimal(6,2) NOT NULL,
	einsatzSpiel77 decimal(6,2) NOT NULL,
	einsatzGluecksSpirale decimal(6,2) NOT NULL,
	PRIMARY KEY (idLottoEinsatz)
);


CREATE TABLE QuotenSpiel77
(
	idQuotenSpiel77 bigint NOT NULL AUTO_INCREMENT,
	gueltigAb timestamp NOT NULL UNIQUE,
	klasse1 decimal(10,2) NOT NULL,
	klasse2 decimal(10,2) NOT NULL,
	klasse3 decimal(10,2) NOT NULL,
	klasse4 decimal(10,2) NOT NULL,
	klasse5 decimal(10,2) NOT NULL,
	klasse6 decimal(10,2) NOT NULL,
	klasse7 decimal(10,2) NOT NULL,
	PRIMARY KEY (idQuotenSpiel77)
);


CREATE TABLE QuotenSuper6
(
	idQuotenSuper6 bigint NOT NULL AUTO_INCREMENT,
	gueltigAb timestamp NOT NULL UNIQUE,
	klasse1 decimal(10,2) NOT NULL,
	klasse2 decimal(10,2) NOT NULL,
	klasse3 decimal(10,2) NOT NULL,
	klasse4 decimal(10,2) NOT NULL,
	klasse5 decimal(10,2) NOT NULL,
	klasse6 decimal(10,2) NOT NULL,
	PRIMARY KEY (idQuotenSuper6)
);


CREATE TABLE VerteilungsSchluessel6Aus49
(
	idVerteilungsSchluessel6Aus49 bigint NOT NULL AUTO_INCREMENT,
	gueltigAb timestamp NOT NULL UNIQUE,
	ausschuettungsQuote decimal(5,2) NOT NULL,
	klasse1 decimal(6,2) NOT NULL,
	klasse2 decimal(6,2) NOT NULL,
	klasse3 decimal(6,2) NOT NULL,
	klasse4 decimal(6,2) NOT NULL,
	klasse5 decimal(6,2) NOT NULL,
	klasse6 decimal(6,2) NOT NULL,
	klasse7 decimal(6,2) NOT NULL,
	klasse8 decimal(6,2) NOT NULL,
	klasse9 decimal(6,2) NOT NULL,
	PRIMARY KEY (idVerteilungsSchluessel6Aus49)
);



/* Create Foreign Keys */

ALTER TABLE LottoZahlenSet
	ADD FOREIGN KEY (idLottoSchein)
	REFERENCES LottoSchein (idLottoSchein)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Quoten6Aus49
	ADD FOREIGN KEY (idLottoZiehung)
	REFERENCES LottoZiehung (idLottoZiehung)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE GewinneSuper6
	ADD FOREIGN KEY (idLottoZiehung)
	REFERENCES LottoZiehung (idLottoZiehung)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE GewinneSpiel77
	ADD FOREIGN KEY (idLottoZiehung)
	REFERENCES LottoZiehung (idLottoZiehung)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



