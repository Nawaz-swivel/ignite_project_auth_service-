SET
sql_mode = '';

INSERT INTO role (id, name, created, updated) VALUES ('rid-2642e864-23fc-432f-8bc1-14f684c1f4ef', 'ADMIN', '2023-02-05 16:17:22', '2023-02-05 16:17:22');
INSERT INTO role (id, name, created, updated) VALUES ('rid-f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454', 'STUDENT', '2023-02-05 16:17:22', '2023-02-05 16:17:22');

INSERT INTO user (id, username, password, role_id, created, updated) VALUES ('uid-7a2e92d7-92c1-40d9-8504-e8572542a1dc','nawaz', '$2a$10$6igYXRk1Z17wEneefHAuHO7Ja767bQgJxBKJAVi5Fo59Lq5QjyxHu', 'rid-2642e864-23fc-432f-8bc1-14f684c1f4ef', '2023-02-05 16:22:00', '2023-02-05 16:22:00');
