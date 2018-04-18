
INSERT INTO FILE (cod, content) VALUES (1,  FILE_READ('./src/main/resources/static/img/face.png'));
INSERT INTO FILE (cod, content) VALUES (2,  FILE_READ('./src/main/resources/static/img/tio.png'));

INSERT INTO USER (username, active, email, name, password, picture_cod) VALUES ('ArthurRosso', TRUE, 'arthurderosso@gmail.com', 'Arthur de Rosso', 'root', 1);
INSERT INTO USER (username, active, email, name, password, picture_cod) VALUES ('teste', TRUE, 'tio@gmail.com', 'Usuário teste 001', 'teste', 2);

INSERT INTO ROLE (cod, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (cod, role) VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLES (user_username, roles_cod) VALUES ('ArthurRosso', 1);
INSERT INTO USER_ROLES (user_username, roles_cod) VALUES ('teste', 2);

INSERT INTO BREED (cod, breed, description) VALUES (1, 'Angus', 'O Aberdeen Angus se destaca entre as raças taurinas por reunir um maior número de características positivas que lhe asseguram um excelente resultado econômico como gado de corte. O conjunto de suas características a tornam uma raça completa.');

INSERT INTO TYPE_ANIMAL (cod, type, description) VALUES (1, 'Touro', 'Macho bovino não castrado');
INSERT INTO TYPE_ANIMAL (cod, type, description) VALUES (2, 'Vaca', 'Fêmea bovina');
INSERT INTO TYPE_ANIMAL (cod, type, description) VALUES (3, 'Boi', 'Macho bovino castrado');

INSERT INTO ANIMAL (cod, birthday, id, breed_cod, type_cod, user_username) VALUES (1, parsedatetime('23/07/2015', 'dd/MM/yyyy'), 'José', 1, 1, 'ArthurRosso');
INSERT INTO ANIMAL (cod, birthday, id, breed_cod, type_cod, user_username) VALUES (2, parsedatetime('01/02/2016', 'dd/MM/yyyy'), 'Maria', 1, 2, 'ArthurRosso');
INSERT INTO ANIMAL (cod, birthday, id, breed_cod, type_cod, user_username) VALUES (3, parsedatetime('22/01/2018', 'dd/MM/yyyy'), 'João', 1, 3, 'ArthurRosso');

INSERT INTO WEIGHT (cod, date, description, nweight, animal_cod) VALUES (1, parsedatetime('06/04/2018', 'dd/MM/yyyy'), 'Pesagem do mês de abril', '800', 1);
INSERT INTO WEIGHT (cod, date, description, nweight, animal_cod) VALUES (2, parsedatetime('06/04/2018', 'dd/MM/yyyy'), 'Pesagem do mês de abril', '750', 2);
INSERT INTO WEIGHT (cod, date, description, nweight, animal_cod) VALUES (3, parsedatetime('06/04/2018', 'dd/MM/yyyy'), 'Pesagem do mês de abril', '400', 3);

INSERT INTO MEDICATION (cod, date) VALUES (1, parsedatetime('12/04/2018', 'dd/MM/yyyy'));

INSERT INTO MEDICATION_ANIMAL (animal_cod, medication_cod) VALUES (1, 1);
INSERT INTO MEDICATION_ANIMAL (animal_cod, medication_cod) VALUES (2, 1);
INSERT INTO MEDICATION_ANIMAL (animal_cod, medication_cod) VALUES (3, 1);

INSERT INTO TYPE_MEDICINE (cod, type, description) VALUES (1, 'Via oral', 'Caracterizada pela ingestão pela boca. Pode exercer efeitos locais no trato gastrointestinal ou atingir sangue e linfa provocando efeitos sistêmicos, após ser absorvido na mucosa gastrointestinal.');
INSERT INTO TYPE_MEDICINE (cod, type, description) VALUES (2, 'Via intradérmica', 'A injeção intradérmica consiste na aplicação de solução na derme (área localizada entre a derme e o tecido subcutâneo.');
INSERT INTO TYPE_MEDICINE (cod, type, description) VALUES (3, 'Via subcutânea', ' A injeção subcutânea consiste na aplicação de solução na região subcutânea, isto é, na hipoderme (tecido adiposo abaixo da pele).');
INSERT INTO TYPE_MEDICINE (cod, type, description) VALUES (4, 'Via intramuscular', 'Consiste na aplicação de solução no tecido muscular.');

INSERT INTO MEDICINE (cod, name, description, expiration, type_cod) VALUES (1, 'Ourovac® Aftosa', 'Vacina contra a febre Aftosa', parsedatetime('31/12/2019', 'dd/MM/yyyy'), 3);

INSERT INTO MEDICATION_MEDICINE (medication_cod, medicine_cod) VALUES (1, 1);

INSERT INTO PURPOSE (cod, purpose, description) VALUES (1, 'Genética', 'Animal destinado exclusivamente para gerar descendentes.');
INSERT INTO PURPOSE (cod, purpose, description) VALUES (2, 'Leite', 'Animal destinado a produção de leite.');
INSERT INTO PURPOSE (cod, purpose, description) VALUES (3, 'Engorda', 'Animal destinado a engorda para produção de carne.');

INSERT INTO PURPOSE_ANIMAL (purpose_cod, animal_cod) VALUES (1,1);
INSERT INTO PURPOSE_ANIMAL (purpose_cod, animal_cod) VALUES (2,2);
INSERT INTO PURPOSE_ANIMAL (purpose_cod, animal_cod) VALUES (3,3);




