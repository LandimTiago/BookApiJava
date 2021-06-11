CREATE TABLE "tb_books" (
  "id" SERIAL PRIMARY KEY,
  "user_id" int,
  "title" text,
  "description" text,
  "pages" int,
  "quantity" int
);

CREATE TABLE "tb_members" (
  "id" SERIAL PRIMARY KEY,
  "first_name" text NOT NULL,
  "last_name" text NOT NULL,
  "cellphone" text,
  "address" text,
  "address_number" int,
  "city" text
);

ALTER TABLE "tb_books" ADD FOREIGN KEY ("user_id") REFERENCES "tb_members" ("id");

INSERT INTO "tb_members" ("first_name", "last_name", "cellphone", "address", "address_number", "city") 
values ('Tiago', 'Landim', '(41) 985157750', 'Rua Riachuelo', 222, 'Curitiba')


INSERT INTO "tb_books" ("user_id", "title", "description", "pages", "quantity") 
VALUES (1, 'Harry Potter e a Pedra Filosofal', 'HP', 465, 3)

INSERT INTO "tb_books" ("user_id", "title", "description", "pages", "quantity") 
VALUES (1, 'Harry Potter e a Camara secreta', 'HP', 567, 3)

INSERT INTO "tb_books" ("user_id", "title", "description", "pages", "quantity") 
VALUES (1, 'Harry Potter e a Calice de Fogo', 'HP', 764, 3)

INSERT INTO "tb_books" ("user_id", "title", "description", "pages", "quantity") 
VALUES (1, 'Harry Potter e a Ordem da Fenix', 'HP', 568, 3)
