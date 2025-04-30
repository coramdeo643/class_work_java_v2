package com.association;

public class BaseballPlayer {

    private String name;

    private BaseballTeam bTeam;

    public BaseballPlayer(String name) {
        this.name = name;
        bTeam = null;
    }

    public void join(BaseballTeam bTeam) {
        this.bTeam = bTeam;
        System.out.println(name + " is joining to " + bTeam.getName());
    }

    public void showTeam() {
        if (this.bTeam != null) {
            System.out.println(name + " is joined in " + this.bTeam.getName());
        } else {
            System.out.println("There is no team joined");
        }
    }

    public void quit() {
        if (bTeam == null) {
            System.out.println("There is no team joined already");
        } else {
            System.out.println("Quitting the " + bTeam.getName());
            this.bTeam = null;
        }
    }

    public static void main(String[] args) {
        BaseballTeam SDP = new BaseballTeam("San Diego Padres");
        BaseballPlayer player1 = new BaseballPlayer("Lee");
        player1.join(SDP);
        player1.showTeam();
        player1.quit();
        player1.showTeam();
    }

}
