CREATE TABLE foods(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    image TEXT
);