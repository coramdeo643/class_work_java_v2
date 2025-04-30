package com.practice;

public class PlayerInfo {

    private String playerId;
    private String playerPw;
    private String playerClass;
    private int playerLv;

    PlayerInfo(String pi, String pp, String pc, int pl) {
        playerId = pi;
        playerPw = pp;
        playerClass = pc;
        playerLv = pl;
    }

    String getPlayerId() {
        return playerId;
    }

    String getPlayerPw() {
        return playerPw;
    }

    String getPlayerClass() {
        return playerClass;
    }

    int getPlayerLv() {
        return playerLv;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerPw(String playerPw) {
        this.playerPw = playerPw;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public void setPlayerLv(int playerLv) {
        this.playerLv = playerLv;
    }
}

