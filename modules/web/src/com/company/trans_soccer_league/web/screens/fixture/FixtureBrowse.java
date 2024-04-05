package com.company.trans_soccer_league.web.screens.fixture;

import com.haulmont.cuba.gui.screen.*;
import com.company.trans_soccer_league.entity.Fixture;
import com.company.trans_soccer_league.service.FixtureService;
import javax.inject.Inject;

@UiController("transsoccerleague_Fixture.browse")
@UiDescriptor("fixture-browse.xml")
@LookupComponent("fixturesTable")
@LoadDataBeforeShow
public class FixtureBrowse extends MasterDetailScreen<Fixture> {
    @Inject
    private FixtureService fixtureService;

    public void onGenerateFixturesClick() {
        fixtureService.generateFixtures();
        getScreenData().loadAll();
    }

    public void onUpdateLogTableClick() {

    }
}
