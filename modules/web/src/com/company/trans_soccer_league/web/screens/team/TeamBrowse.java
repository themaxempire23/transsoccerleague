package com.company.trans_soccer_league.web.screens.team;

import com.haulmont.cuba.gui.screen.*;
import com.company.trans_soccer_league.entity.Team;

@UiController("transsoccerleague_Team.browse")
@UiDescriptor("team-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class TeamBrowse extends MasterDetailScreen<Team> {
}