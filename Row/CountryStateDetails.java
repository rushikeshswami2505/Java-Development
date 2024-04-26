package Row;

class Country {
    protected int countryCode;
    protected String countryName;
    protected int numberOfStates;

    // constructors
    Country() {
    }

    Country(int countryCode, String countryName, int numberOfStates) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.numberOfStates = numberOfStates;
        System.out.println(countryName + " is created as an object!");
    }

    // getter
    public String getCountryName() {
        return this.countryName;
    }

    public int getCountryCode() {
        return this.countryCode;
    }

    public int getNumberOfState() {
        return this.numberOfStates;
    }

    // setter
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setNumberOfState(int numberOfStates) {
        this.numberOfStates = numberOfStates;
    }
}

class State extends Country {
    private int statePopulation;
    private int stateArea;
    private String stateName;

    // constructors
    State() {
    }

    State(int countryCode, String countryName, int numberOfStates) {
        super(countryCode, countryName, numberOfStates);
    }

    State(int population, int area, String stateName, int countryCode, String countryName, int numberOfStates) {
        super(countryCode, countryName, numberOfStates);
        this.statePopulation = population;
        this.stateArea = area;
        this.stateName = stateName;
    }

    // setter
    public void setArea(int stateArea) {
        this.stateArea = stateArea;
    }

    public void setPopulation(int statePopulation) {
        this.statePopulation = statePopulation;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    // getter
    public int getArea() {
        return this.stateArea;
    }

    public int getPopulation() {
        return this.statePopulation;
    }

    public String getStateName() {
        return stateName;
    }
}

public class CountryStateDetails {
    public static void main(String[] args) {
        State maharashtra = new State(91, "India", 36);
        maharashtra.setArea(200);
        maharashtra.setPopulation(300);
        maharashtra.setStateName("Mahashtra");

        System.out.println("Details: " +
                "\nState Name: " + maharashtra.getStateName() +
                "\nState Area: " + maharashtra.getArea() +
                "\nState Population: " + maharashtra.getPopulation());
    }
}
