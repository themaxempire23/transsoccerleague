package com.company.trans_soccer_league.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TRANSSOCCERLEAGUE_FIXTURE")
@Entity(name = "transsoccerleague_Fixture")
public class Fixture extends StandardEntity {
    private static final long serialVersionUID = 3495202653392862316L;

    @Column(name = "SCORE1")
    private Integer score1;

    @Column(name = "SCORE2")
    private Integer score2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM1_ID")
    private Team team1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM2_ID")
    private Team team2;

    @Column(name = "FLAG")
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }
}