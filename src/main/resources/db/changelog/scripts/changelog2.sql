--liquibase formatted sql

--changeset changelog2:1
CREATE TABLE IF NOT EXISTS movie_theater
(
    ID      INT          NOT NULL AUTO_INCREMENT,
    NAME    VARCHAR(255) NOT NULL,
    ADDRESS VARCHAR(255) NOT NULL,
    RATING  DOUBLE,
    PRIMARY KEY (ID)
)