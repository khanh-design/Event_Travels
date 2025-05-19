use `travels`;

create table Users (
	Id_user int auto_increment primary key not null,
    name varchar(200) not null,
    phone varchar(10) not null,
    email varchar(60) not null,
    gender varchar(25) not null,
    password varchar(100) not null
);

drop table Booking;
create table Booking (
	Id_booking int auto_increment primary key not null,
    date_book datetime,
    Tickets varchar(20),
    State varchar(30),
    Id_user int,
    Id_tour int,
    foreign key (Id_user) REFERENCES Users (Id_user),
    foreign key (Id_tour) references Tour (Id_tour)
);

create table Tour (
	Id_tour int auto_increment primary key not null,
    name_tour varchar(100),
    description varchar(200),
    address varchar(200),
    date_start datetime,
    date_end datetime,
    price_Tickets decimal(10, 2),
    Images varchar(200),
    Places int
);
alter table Tour add Images varchar(255);

create table Tickets (
	Id_tickets int auto_increment primary key not null,
    code int,
    type_tickets varchar(30),
    Id_booking int,
    foreign key (Id_booking) REFERENCES Booking (Id_booking)
);

create table Payment (
	Id_payment int auto_increment primary key not null,
    moneys decimal(10, 2),
    state varchar(100),
    date_payment datetime,
    hinh_thuc varchar(255),
    Id_booking int,
    foreign key (Id_booking) REFERENCES Booking (Id_booking)
);

-- du lieu users.
insert into Users (name, phone, email, gender) values 
('Nguyen Van A', '0909123456', 'a@gmail.com', 'Male'),
('Tran Thi B', '0912233445', 'b@yahoo.com', 'Female');

-- du lieu Tour.
insert into Tuor (Id_tour, name_tour, description, address, date_start, date_end, price_Tickets, Places) values 
(101, 'Tour Da Nang', 'Tham quan thành phố Đà Nẵng', 'Đà Nẵng', '2025-06-01', '2025-06-05', 3000000, 30),
(102, 'Tour Ha Long', 'Thăm vịnh Hạ Long', 'Quảng Ninh', '2025-07-10', '2025-07-15', 4000000, 25);

update Tour
set Images = 'Toa_thap.jpg'
where Id_tour = 101;

update Tour 
set Images = 'vinh-Ha-Long.jpg'
where Id_tour = 102;

-- du lieu booking.
insert into Booking (Id_booking, date_book, Tickets, State, Id_user, Id_tour) values 
(201,'2025-05-01', 'Tre em', 'Confirmed', 1, 101),
(202, '2025-05-02', 'Nguoi lon', 'Pending', 2, 102);

-- du lieu tickets
insert into Tickets (Id_tickets, code, type_tickets, Id_booking) values 
(301, 'TKT12345', 'Adult', 201),
(302, 'TKT12346', 'Adult', 201),
(303, 'TKT22345', 'Child', 202);

-- du lieu payment
insert into Payment (Id_payment, moneys, state, date_payment, hinh_thuc, Id_booking) values 
(401, 6000000, 'Paid', '2025-05-01', 'Credit Card', 201),
(402, 4000000, 'Unpaid', NULL, 'Cash', 202);

select * from Users;
select * from payment;
select * from tickets;
select * from Tour

delimiter $$
create procedure sp_insert_user (
	in _name varchar(100),
	in _phone varchar(10),
	in _email varchar(60),
    in _password varchar(100)
)
begin 
	insert into users (name, phone, email, password) values 
    (_name, _phone, _email, _password);
end $$
delimiter ;

call sp_insert_user ('khanh', '0922211155', 'khanh1@gmail.com', '123');