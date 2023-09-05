package models;

public class ListPlayer {
    private String name;
    private int age;
    private String homeTown;
    private String playerPosition;

    public ListPlayer(String name, int age, String homeTown, String playerPosition) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.playerPosition = playerPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
}
