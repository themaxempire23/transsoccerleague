package com.company.trans_soccer_league.service;

import com.company.trans_soccer_league.entity.Fixture;
import com.company.trans_soccer_league.entity.Team;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

import java.util.Collections;

@Service(FixtureService.NAME)
public class FixtureServiceBean implements FixtureService {

    @Inject
    private DataManager dataManager;

    @Override
    public void generateFixtures() {
        List<Team> teams = dataManager.load(Team.class).list();
        Collections.shuffle(teams); // Randomize the order of teams

        // Round-robin algorithm to generate fixtures
        int numberOfTeams = teams.size();
        int numberOfRounds = numberOfTeams - 1;
        int numberOfMatchesPerRound = numberOfTeams / 2;

        for (int round = 0; round < numberOfRounds; round++) {
            for (int match = 0; match < numberOfMatchesPerRound; match++) {
                int homeIndex = (round + match) % numberOfTeams;
                int awayIndex = (numberOfTeams - 1 - match + round) % numberOfTeams;

                Team homeTeam = teams.get(homeIndex);
                Team awayTeam = teams.get(awayIndex);

                if (homeIndex != awayIndex) {
                    Fixture fixture = dataManager.create(Fixture.class);
                    fixture.setTeam1(homeTeam);
                    fixture.setTeam2(awayTeam);
                    dataManager.commit(fixture);
                }
            }
        }
    }

    @Override
    public void generateFixture() {

    }
}


//    @Override
//    public void generateFixture() {
//    }

