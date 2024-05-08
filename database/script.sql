CREATE DATABASE library;
USE library;

CREATE TABLE book
(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(256) NOT NULL,
    author VARCHAR(256) NOT NULL,
    release_date DATE NOT NULL,
    genre VARCHAR(64) NOT NULL,
    image VARCHAR(256)
);

INSERT INTO book (title, author, release_date, genre, image) VALUES
('Dom Casmurro', 'Machado de Assis', '1899-01-01', 'Novel', NULL),
('Memórias Póstumas de Brás Cubas', 'Machado de Assis', '1881-01-01', 'Satire', NULL),
('O Alienista', 'Machado de Assis', '1882-01-01', 'Psychological Fiction', NULL),
('Til', 'José de Alencar', '1872-01-01', 'Historical Fiction', NULL),
('Memórias de um Sargento de Milícias', 'Manuel Antônio de Almeida', '1854-01-01', 'Picaresque Novel', NULL),
('Grande Sertão: Veredas', 'Guimarães Rosa', '1956-01-01', 'Modernist Fiction', NULL),
('A Hora da Estrela', 'Clarice Lispector', '1977-01-01', 'Existentialism', NULL),
('Gabriela, Cravo e Canela', 'Jorge Amado', '1958-01-01', 'Magic Realism', NULL),
('Memórias Póstumas de Brás Cubas', 'Machado de Assis', '1881-01-01', 'Satire', NULL),
('O Alienista', 'Machado de Assis', '1882-01-01', 'Psychological Fiction', NULL);
