-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie (id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');

INSERT INTO Exposition (id , debut, intitule ,duree, organisateur_id) VALUES (1, TO_DATE('2020/12/12','YYYY/MM/DD') , 'Art Brut Contemporain', 30, 1) ; 
INSERT INTO Exposition (id, debut, intitule, duree, organisateur_id) VALUES (2, TO_DATE ('2021/02/01','YYYY/MM/DD'), 'Expressionnistes français', 20,1) ;

INSERT INTO Personne (id, nom, adresse) VALUES (1, 'M.Bastide', null);
INSERT INTO Personne (id, nom, adresse) VALUES (2, 'Cy Twombly', null);

INSERT INTO Artiste (id, biographie) VALUES (2,'XX') ; 

INSERT INTO Tableau (id, titre, support, largeur, hauteur, auteur_id) VALUES (1, 'bacchus 1st Version IV','huile sur toile', 2, 3, 2) ; 

INSERT INTO Exposition_oeuvres (accrochages_id, oeuvres_id) VALUES (1,1) ; 

INSERT INTO Transactions (id, vendu_Le, prix_Vente, client_id, lieu_de_vente_id, oeuvre_id) VALUES (1, TO_DATE ('2021/01/02','YYYY/MM/DD') ,2000000, 1 , 1, 1); 
