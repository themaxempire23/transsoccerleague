create table TRANSSOCCERLEAGUE_FIXTURE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SCORE1 integer,
    SCORE2 integer,
    TEAM1_ID varchar(36),
    TEAM2_ID varchar(36),
    FLAG varchar(255),
    --
    primary key (ID)
);