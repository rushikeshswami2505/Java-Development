package AnimalZoo.AnimalPackage;

public class Elephant extends Animal {

    int elephantTotalChilderns;
    int elephantTuskSize;

    public void setAnimalType() {
        super.setAnimalType("Wild");
    }

    // constructor
    Elephant() {
        setAnimalType();
    }

    public Elephant(int elephantTotalChilderns, int elephantTuskSize) {
        setAnimalType();
        this.elephantTotalChilderns = elephantTotalChilderns;
        this.elephantTuskSize = elephantTuskSize;
    }

    public Elephant(String animalName, float animalWeight,
            float animalHeight, int animalAge, int elephantTotalChilderns, int elephantTuskSize) {
        super("Wild", animalName, animalWeight, animalHeight, animalAge);
        this.elephantTotalChilderns = elephantTotalChilderns;
        this.elephantTuskSize = elephantTuskSize;
    }

    // getter and setter
    public int getElephantTuskSize() {
        return elephantTuskSize;
    }

    public void setElephantTuskSize(int elephantTuskSize) {
        this.elephantTuskSize = elephantTuskSize;
    }

    public int getElephantTotalChilderns() {
        return elephantTotalChilderns;
    }

    public void setElephantTotalChilderns(int elephantTotalChilderns) {
        this.elephantTotalChilderns = elephantTotalChilderns;
    }

    @Override
    public String toString() {
        return "Elephant [" + super.toString() + "elephantTotalChilderns=" + elephantTotalChilderns
                + ", elephantTuskSize=" + elephantTuskSize + "]";
    }

}
