
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private int goals;
    private int assists;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int total() {
        return goals + assists;
    }

    @Override
    public String toString() {
        return name;

    }

}
