DELETE FROM meals;
DELETE FROM user_roles;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', 'password'),
  ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001);

INSERT INTO meals (user_id ,datetime, description, calories) VALUES
  (100000,'2020-01-30 10:00:00', 'завтрак', 500),
  (100000,'2020-01-30 14:00:00', 'обед', 1000),
  (100000,'2020-01-30 20:00:00', 'ужин', 500),
  (100000,'2020-01-31 10:00:00', 'завтрак', 1000),
  (100000,'2020-01-31 14:00:00', 'обед', 500),
  (100000,'2020-01-31 21:00:00', 'ужин', 520),
  (100001, '2020-01-01 14:00:00', 'Админ ланч', 510),
  (100001, '2020-01-01 21:00:00', 'Админ ужин', 1500);
