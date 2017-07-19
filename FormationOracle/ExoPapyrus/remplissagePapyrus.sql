/*Remplissage des tables*/

INSERT INTO PRODUIT (CODART, LIBART, STKALE, STKPHY, QTEANN, UNIMES) VALUES (PRODUIT_CODART.NEXTVAL, 'article 1', 0000001, 1000001, 2000001, 'baaaa');
INSERT INTO PRODUIT (CODART, LIBART, STKALE, STKPHY, QTEANN, UNIMES) VALUES (PRODUIT_CODART.NEXTVAL, 'article 2', 0000002, 1000002, 2000002, 'baaab');
INSERT INTO PRODUIT (CODART, LIBART, STKALE, STKPHY, QTEANN, UNIMES) VALUES (PRODUIT_CODART.NEXTVAL, 'article 3', 0000003, 1000003, 2000003, 'baaac');
INSERT INTO PRODUIT (CODART, LIBART, STKALE, STKPHY, QTEANN, UNIMES) VALUES (PRODUIT_CODART.NEXTVAL, 'article 4', 0000004, 1000004, 2000004, 'baaad');

INSERT INTO FOURNIS (NUMFOU, NOMFOU, RUEFOU, POSFOU, VILFOU, CONFOU, SATISF) VALUES (001001001, 'Fournisseur 1', 'Rue du stade', 14000, 'Caen', 'M Smith', 9);
INSERT INTO FOURNIS (NUMFOU, NOMFOU, RUEFOU, POSFOU, VILFOU, CONFOU, SATISF) VALUES (001001002, 'Fournisseur 2', 'Rue de la gare', 14010, 'Caen', 'M Bob', 8);

INSERT INTO ENTCOM (NUMCOM, OBSCOM, DATCOM, NUMFOU) VALUES (ENTCOM_NUMCOM.NEXTVAL, 'Observation 1', SYSDATE, 001001001);
INSERT INTO ENTCOM (NUMCOM, OBSCOM, DATCOM, NUMFOU) VALUES (ENTCOM_NUMCOM.NEXTVAL, 'Observation 2', SYSDATE, 001001002);

INSERT INTO LIGCOM (NUMCOM, NUMLIG, CODART, QTECDE, PRIUNI, QTELIV, DERLIV) VALUES (ENTCOM_NUMCOM.CURRVAL, 001003001, PRODUIT_CODART.CURRVAL, 12.5, 133.5, 12, 8);

INSERT INTO VENTE (CODART, NUMFOU, DELLIV, QTE1, PRIX1, QTE2, PRIX2, QTE3, PRIX3) VALUES (PRODUIT_CODART.CURRVAL, 1001001, 005002, 10, 11, 12, 13, 14, 15);
