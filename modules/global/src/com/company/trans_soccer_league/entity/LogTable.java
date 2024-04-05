package com.company.trans_soccer_league.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TRANSSOCCERLEAGUE_LOG_TABLE")
@Entity(name = "transsoccerleague_LogTable")
public class LogTable extends StandardEntity {
    private static final long serialVersionUID = -1339954040549964825L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_NAME_ID")
    private Team teamName;

    @Column(name = "WINS")
    private Integer wins;

    @Column(name = "LOSSES")
    private Integer losses;

    @Column(name = "DRAWS")
    private Integer draws;

    @Column(name = "GOALS_FOR")
    private Integer goalsFor;

    @Column(name = "GOAL_DIFFERENCE")
    private Integer goalDifference;

    @Column(name = "GOALS_AGAINST")
    private Integer goalsAgainst;

    @Column(name = "POSITION_")
    private Integer position;

    @Column(name = "POINTS")
    private Integer points;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Team getTeamName() {
        return teamName;
    }

    public void setTeamName(Team teamName) {
        this.teamName = teamName;
    }
}