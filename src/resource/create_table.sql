CREATE TABLE teacher
(
    id         int NOT NULL AUTO_INCREMENT,
    name       varchar(255),
    age        int default null,
    address    varchar(255),
    department varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE student
(
    id         int NOT NULL AUTO_INCREMENT,
    name       varchar(255),
    age        int          default null,
    address    varchar(255) default null,
    class_name varchar(255) default null,
    gpa        float        default null,
    PRIMARY KEY (id)
);
