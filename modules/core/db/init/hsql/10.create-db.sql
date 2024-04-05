-- begin TRANSSOCCERLEAGUE_TEAM
create table TRANSSOCCERLEAGUE_TEAM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TRANSSOCCERLEAGUE_TEAM
-- begin TRANSSOCCERLEAGUE_FIXTURE
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
)^
-- end TRANSSOCCERLEAGUE_FIXTURE
-- begin TRANSSOCCERLEAGUE_LOG_TABLE
create table TRANSSOCCERLEAGUE_LOG_TABLE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEAM_NAME_ID varchar(36),
    WINS integer,
    LOSSES integer,
    DRAWS integer,
    GOALS_FOR integer,
    GOAL_DIFFERENCE integer,
    GOALS_AGAINST integer,
    POSITION_ integer,
    POINTS integer,
    --
    primary key (ID)
)^
-- end TRANSSOCCERLEAGUE_LOG_TABLE
