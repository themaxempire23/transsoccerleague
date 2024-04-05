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
);