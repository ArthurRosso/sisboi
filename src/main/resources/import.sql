
INSERT INTO FILE (cod, content) VALUES (1,  FILE_READ('./src/main/resources/static/img/face.png'));
INSERT INTO FILE (cod, content) VALUES (2,  FILE_READ('./src/main/resources/static/img/tio.png'));

INSERT INTO USER (username, active, email, name, password, picture_cod) VALUES ('root', TRUE, 'root@gmail.com', 'Rootson da Silva', 'root', 1);
INSERT INTO USER (username, active, email, name, password, picture_cod) VALUES ('tio', TRUE, 'tio@gmail.com', 'Usuário teste 001', 'tio', 2);

INSERT INTO ROLE (cod, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (cod, role) VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLES (user_username, roles_cod) VALUES ('root', 1);
INSERT INTO USER_ROLES (user_username, roles_cod) VALUES ('tio', 2);