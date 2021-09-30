insert into category(id, name) values
(1, 'Get Whatever You Want'),
(2, 'Books'),
(3, 'Food'),
(4, 'Clothes'),
(5, 'Drink');

insert into user(id, email, name, password, phone_number, address) values
(1, 'szymon@wp.pl','Szymon', 'szymon', '123456789' ,'Warszawa'),
(2, 'piotrek@onet.pl','Piotrek', 'piotrek','342543756' ,'Warszawa'),
(3, 'adam@interia.pl','Adam', 'adam', '234155423','Warszawa');

insert into product(id, description, name, price, stock, category_id) values
(1, 'Books for learning Java', 'Core Java', 30.00, 96, 2),
(2, 'Learn Spring', 'Spring In Action', 20.00, 187, 2),
(3, 'Java EE', 'Head First', 10.00, 200, 2),
(4, 'Java SE', 'Effective Java', 30.00, 96, 2),
(5, 'Kids Party Food', 'Chicken', 4.00, 57, 3),
(6, 'Family s', 'McDonald‘s Food', 20.00, 18, 3),
(7, 'Under Armour', 'T-shirt', 10.00, 109, 4),
(8, 'Boys Clothes', 'Shirts', 13.00, 108, 4),
(9, 'Mans', 'Coats', 22.00, 222, 4),
(10, 'Everyone likes it', 'Coca Cola', 1.00, 100, 5),
(11, 'Awesome', 'Starbucks Violet Drink', 2.00, 200, 5);

insert into user_order(id, quantity, total_cost, order_data, status, user_id) values
(1, 3, 90, '2017-10-08 16:00:00', 'New', 1),
(2, 3, 90, '2018-11-09 15:25:00', 'New', 2),
(3, 3, 90, '2019-12-10 14:45:00', 'New', 3);