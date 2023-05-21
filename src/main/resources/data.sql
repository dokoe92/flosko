CREATE TABLE IF NOT EXISTS orders (
    id integer AUTO_INCREMENT,
    customer_name varchar(255),
    description varchar(100),
    customer_plz integer,
    customer_street varchar(255),
    order_date date,
    status varchar(255),
    primary key (id)
    );


INSERT INTO orders (customer_name, description, customer_plz, customer_street, order_date)
VALUES ('Dominik Köberl', 'Wohnung reinigen', 3100, 'St.Pölten Straße 1', '2023-05-21');

INSERT INTO orders (customer_name, description, customer_plz, customer_street, order_date)
VALUES ('Hans ', 'Wohnung reinigen', 3100, 'St.Pölten Straße 1', '2023-05-21');

INSERT INTO orders (customer_name, description, customer_plz, customer_street, order_date)
VALUES ('Herbert', 'Wohnung reinigen', 3100, 'St.Pölten Straße 1', '2023-05-21');

