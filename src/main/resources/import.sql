-- Roles
INSERT INTO roles (rol_name) VALUES ('ADMIN');
INSERT INTO roles (rol_name) VALUES ('CLIENTE');
INSERT INTO roles (rol_name) VALUES ('ACOMODADOR');


-- Vehicules
INSERT INTO vehicle_types (type_name) VALUES ('CAR');
INSERT INTO vehicle_types (type_name) VALUES ('MOTORBIKE');

-- Users
INSERT INTO users (first_name, last_name, email, password) VALUES ('Julian', 'Buitrago Charry', 'julian.buitrago3003@gmail.com', '$2a$12$TKz70D7c0PNikQ./Qcu9euw44No/iahO2TJ.e3cW4m/PQdtvXklpW');  -- Contraseña: julian.3003
INSERT INTO users (first_name, last_name, email, password) VALUES ('Yohan', 'Bustos Ruiz', 'yohan.bustos2006@gmail.com', '$2a$12$u3ZbHOyhOB5jYW9xtpQr5.5fOvQ9DGfnocReU3grMTznWUmli31Uu');     -- Contraseña: yohan.2006
INSERT INTO users (first_name, last_name, email, password) VALUES ('Nathalia', 'Avila Borrero', 'nathalia.avila77@gmail.com', '$2a$12$GgqTQO4Op.zrtGdHOlOjpuGH/mvT.bzzWXIYcdqDUwgcNeg18GyQO'); -- Contraseña: nathalia.77

-- Rol Users
INSERT INTO users_role (user_id, role_id) VALUES (1, 1);  -- Julian con rol ADMIN
INSERT INTO users_role (user_id, role_id) VALUES (2, 2);  -- Yohan con rol CLIENTE
INSERT INTO users_role (user_id, role_id) VALUES (3, 1);  -- Nathalia con rol ACOMODADOR