create table t_club
(
    id integer auto_increment,
    club_name varchar(100),
    full_name varchar(100),
    location varchar(100),
    owner varchar(100),
    chairman varchar(100),
    coach varchar(100),
    primary key(id)

);
create table t_player
(
    id integer auto_increment,
    firstname varchar(50),
    lastname varchar(50),
    age integer,
    salary integer,
    goals integer,
    position varchar(50),
    place_of_birth varchar(100),
    id_club integer,
    primary key(id),
    foreign key (id_club) references t_club(id)
);
create table t_user
(
  id integer auto_increment,
  username varchar(50),
  password varchar(50),
  email varchar(100),
  primary key(id)
)


