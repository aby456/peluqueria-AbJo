INSERT INTO TBL_RESERVACIONES (id, HORARIOS, LUGARES, FECHAS, CANTIDAD_PERSONAS) VALUES (1, 'Dia','Quito','14/08/22', 5);
INSERT INTO TBL_RESERVACIONES (id, HORARIOS, LUGARES, FECHAS, CANTIDAD_PERSONAS) VALUES (2, 'Noche','Latacunga','01/08/21', 4);

INSERT INTO TBL_SERVICIOS (id, NOMBRE_SERVICIOS, PRECIO_SERVICIOS, TIEMPO_ESTIMADO_SERVICIOS, RESERVACION_ID) VALUES (1, 'Corte', 3.50, 1, 1);
INSERT INTO TBL_SERVICIOS (id, NOMBRE_SERVICIOS, PRECIO_SERVICIOS, TIEMPO_ESTIMADO_SERVICIOS, RESERVACION_ID) VALUES (2, 'Maquillaje', 15.0, 20, 2);
INSERT INTO TBL_SERVICIOS (id, NOMBRE_SERVICIOS, PRECIO_SERVICIOS, TIEMPO_ESTIMADO_SERVICIOS, RESERVACION_ID) VALUES (3, 'Pintado', 10, 30, 1);

INSERT INTO TBL_CATEGORIAS (id, NOMBRE_CATEGORIAS, SERVICIO_ID) VALUES (1, 'Corte de pelo', 1);
INSERT INTO TBL_CATEGORIAS (id, NOMBRE_CATEGORIAS, SERVICIO_ID) VALUES (2, 'Delinado', 2);
INSERT INTO TBL_CATEGORIAS (id, NOMBRE_CATEGORIAS, SERVICIO_ID) VALUES (3, 'Pintado de unas', 3);



INSERT INTO TBL_USERS(ID, NAMES,PASSWORDS, ENABLEDS) VALUES (1, 'Abigail', '$2a$10$sBXalkjkcM84e.OoZoJoO.EUXO7WVr9oQQc.2cXExiiKoMFqq.YVW', 1);

INSERT INTO TBL_ROLES(ID, ROLES, USER_ID) VALUES (1, 'ROLE_ADMINISTRADOR', 1); 
INSERT INTO TBL_ROLES(ID, ROLES, USER_ID) VALUES (2, 'ROLE_USUARIO', 1);


