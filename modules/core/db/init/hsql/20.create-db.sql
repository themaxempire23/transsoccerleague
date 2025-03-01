-- begin TRANSSOCCERLEAGUE_TEAM
create unique index IDX_TRANSSOCCERLEAGUE_TEAM_UNIQ_NAME on TRANSSOCCERLEAGUE_TEAM (NAME)^
-- end TRANSSOCCERLEAGUE_TEAM
-- begin TRANSSOCCERLEAGUE_FIXTURE
alter table TRANSSOCCERLEAGUE_FIXTURE add constraint FK_TRANSSOCCERLEAGUE_FIXTURE_ON_TEAM1 foreign key (TEAM1_ID) references TRANSSOCCERLEAGUE_TEAM(ID)^
alter table TRANSSOCCERLEAGUE_FIXTURE add constraint FK_TRANSSOCCERLEAGUE_FIXTURE_ON_TEAM2 foreign key (TEAM2_ID) references TRANSSOCCERLEAGUE_TEAM(ID)^
create index IDX_TRANSSOCCERLEAGUE_FIXTURE_ON_TEAM1 on TRANSSOCCERLEAGUE_FIXTURE (TEAM1_ID)^
create index IDX_TRANSSOCCERLEAGUE_FIXTURE_ON_TEAM2 on TRANSSOCCERLEAGUE_FIXTURE (TEAM2_ID)^
-- end TRANSSOCCERLEAGUE_FIXTURE
-- begin TRANSSOCCERLEAGUE_LOG_TABLE
alter table TRANSSOCCERLEAGUE_LOG_TABLE add constraint FK_TRANSSOCCERLEAGUE_LOG_TABLE_ON_TEAM_NAME foreign key (TEAM_NAME_ID) references TRANSSOCCERLEAGUE_TEAM(ID)^
create index IDX_TRANSSOCCERLEAGUE_LOG_TABLE_ON_TEAM_NAME on TRANSSOCCERLEAGUE_LOG_TABLE (TEAM_NAME_ID)^
-- end TRANSSOCCERLEAGUE_LOG_TABLE
