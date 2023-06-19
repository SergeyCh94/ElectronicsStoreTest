CREATE TABLE Product (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         brand VARCHAR(255) NOT NULL,
                         price DECIMAL(10, 2) NOT NULL,
                         description TEXT,
                         available BOOLEAN NOT NULL
);