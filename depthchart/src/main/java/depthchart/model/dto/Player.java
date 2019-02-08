package main.java.depthchart.model.dto;

@Entity
public class Player {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;

    @Column
    private String position;

    @Column
    private int number;

    @Column
    private String name;

    @Column
    private int depth;

    @Column
    private String team;

    @Column
    private String unit;

    @Column
    private int year;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}