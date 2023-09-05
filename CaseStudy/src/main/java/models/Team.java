package models;

public class ListTeam {
    private String nameTeam;
    private String coach;

    public ListTeam(String nameTeam, String coach) {
        this.nameTeam = nameTeam;
        this.coach = coach;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}
