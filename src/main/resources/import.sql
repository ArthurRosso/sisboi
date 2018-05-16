
INSERT INTO BREED (id, breed, description) VALUES (1, 'Angus', 'O Aberdeen Angus se destaca entre as raças taurinas por reunir um maior número de características positivas que lhe asseguram um excelente resultado econômico como gado de corte. O conjunto de suas características a tornam uma raça completa.');

INSERT INTO TYPE_ANIMAL (id, type, description) VALUES (1, 'Touro', 'Macho bovino não castrado');
INSERT INTO TYPE_ANIMAL (id, type, description) VALUES (2, 'Vaca', 'Fêmea bovina');
INSERT INTO TYPE_ANIMAL (id, type, description) VALUES (3, 'Boi', 'Macho bovino castrado');

INSERT INTO USER (username, active, email, name, password) VALUES ('ArthurRosso', TRUE, 'arthurderosso@gmail.com', 'Arthur de Rosso', 'root');
INSERT INTO USER (username, active, email, name, password) VALUES ('teste', TRUE, 'tio@gmail.com', 'Usuário teste 001', 'teste');

INSERT INTO ROLE (id, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (id, role) VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLES (user_username, roles_id) VALUES ('ArthurRosso', 1);
INSERT INTO USER_ROLES (user_username, roles_id) VALUES ('teste', 2);

INSERT INTO ANIMAL (id, active, birthday, name, breed_id, type_id, user_username) VALUES (1, TRUE, parsedatetime('23/07/2015', 'dd/MM/yyyy'), 'José', 1, 1, 'ArthurRosso');
INSERT INTO ANIMAL (id, active, birthday, name, breed_id, type_id, user_username) VALUES (2, TRUE, parsedatetime('01/02/2016', 'dd/MM/yyyy'), 'Maria', 1, 2, 'ArthurRosso');
INSERT INTO ANIMAL (id, active, birthday, name, breed_id, type_id, user_username) VALUES (3, TRUE, parsedatetime('22/01/2018', 'dd/MM/yyyy'), 'João', 1, 3, 'ArthurRosso');

INSERT INTO FILE (id, content) VALUES (1,  FILE_READ('./src/main/resources/static/img/face.png'));
INSERT INTO FILE (id, content) VALUES (2, FILE_READ('./src/main/resources/static/img/tio.png'));

INSERT INTO WEIGHT (id, date, description, weight, animal_id) VALUES (1, parsedatetime('06/04/2018', 'dd/MM/yyyy'), 'Pesagem do mês de abril', '800', 1);
INSERT INTO WEIGHT (id, date, description, weight, animal_id) VALUES (2, parsedatetime('06/04/2018', 'dd/MM/yyyy'), 'Pesagem do mês de abril', '750', 2);

INSERT INTO MEDICATION (id, date) VALUES (1, parsedatetime('12/04/2018', 'dd/MM/yyyy'));

INSERT INTO MEDICATION_ANIMAL (animal_id, medication_id) VALUES (1, 1);
INSERT INTO MEDICATION_ANIMAL (animal_id, medication_id) VALUES (2, 1);
INSERT INTO MEDICATION_ANIMAL (animal_id, medication_id) VALUES (3, 1);

INSERT INTO TYPE_MEDICINE (id, type, description) VALUES (1, 'Via oral', 'Caracterizada pela ingestão pela boca. Pode exercer efeitos locais no trato gastrointestinal ou atingir sangue e linfa provocando efeitos sistêmicos, após ser absorvido na mucosa gastrointestinal.');
INSERT INTO TYPE_MEDICINE (id, type, description) VALUES (2, 'Via intradérmica', 'A injeção intradérmica consiste na aplicação de solução na derme (área localizada entre a derme e o tecido subcutâneo.');
INSERT INTO TYPE_MEDICINE (id, type, description) VALUES (3, 'Via subcutânea', ' A injeção subcutânea consiste na aplicação de solução na região subcutânea, isto é, na hipoderme (tecido adiposo abaixo da pele).');
INSERT INTO TYPE_MEDICINE (id, type, description) VALUES (4, 'Via intramuscular', 'Consiste na aplicação de solução no tecido muscular.');

INSERT INTO MEDICINE (id, name, description, expiration, type_id) VALUES (1, 'Ourovac® Aftosa', 'Vacina contra a febre Aftosa', parsedatetime('31/12/2019', 'dd/MM/yyyy'), 3);

INSERT INTO MEDICATION_MEDICINE (medication_id, medicine_id) VALUES (1, 1);

INSERT INTO PURPOSE (id, purpose, description) VALUES (1, 'Genética', 'Animal destinado exclusivamente para gerar descendentes.');
INSERT INTO PURPOSE (id, purpose, description) VALUES (2, 'Leite', 'Animal destinado a produção de leite.');
INSERT INTO PURPOSE (id, purpose, description) VALUES (3, 'Engorda', 'Animal destinado a engorda para produção de carne.');

INSERT INTO PURPOSE_ANIMAL (purposes_id, animal_id) VALUES (1,1);
INSERT INTO PURPOSE_ANIMAL (purposes_id, animal_id) VALUES (2,2);
INSERT INTO PURPOSE_ANIMAL (purposes_id, animal_id) VALUES (3,2);
INSERT INTO PURPOSE_ANIMAL (purposes_id, animal_id) VALUES (3,3);