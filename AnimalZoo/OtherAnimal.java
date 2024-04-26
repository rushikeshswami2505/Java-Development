package AnimalZoo.AnimalPackage;

public class OtherAnimal extends Animal{
    @Override
    public String toString() {
        return super.toString();
    }

    OtherAnimal() {
    }

    public OtherAnimal(String animalName, float animalWeight, float animalHeight, int animalAge) {
        super("Null", animalName, animalWeight, animalHeight, animalAge);
    }
}
