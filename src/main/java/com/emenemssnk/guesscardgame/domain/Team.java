package com.emenems.guesscardgame.domain;

import java.util.List;

public class Team {
    TeamType teamType;
    List<Player> players;

    public Team(TeamType teamType, List<Player> players) {
        this.teamType = teamType;
        this.players = players;
    }
}
