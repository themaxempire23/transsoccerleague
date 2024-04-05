package com.company.trans_soccer_league.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TRANSSOCCERLEAGUE_TEAM")
@Entity(name = "transsoccerleague_Team")
@NamePattern("%s|name")
public class Team extends StandardEntity {
    private static final long serialVersionUID = 3351434478664912767L;

    @Column(name = "NAME", unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}