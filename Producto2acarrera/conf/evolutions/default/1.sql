# --- First database schema

# --- !Ups

create table cliente (
  id                        bigint not null,
  nombre                      varchar(255),
  apellido                      varchar(255),
  direccion                      varchar(255),
  ocupacion                      varchar(255),
  constraint pk_company primary key (id))
;



create sequence cliente_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cliente;


SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists cliente_seq;


