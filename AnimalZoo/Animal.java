package AnimalZoo.AnimalPackage;


public class Animal {

    String animalType;
    String animalName;
    float animalWeight;
    float animalHeight;
    int animalAge;

    public Animal() {
    }

    public Animal(String animalType, String animalName, float animalWeight, float animalHeight, int animalAge) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.animalHeight = animalHeight;
        this.animalAge = animalAge;
    }

    // getter and setter
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public float getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public float getAnimalHeight() {
        return animalHeight;
    }

    public void setAnimalHeight(float animalHeight) {
        this.animalHeight = animalHeight;
    }

    public int getanimalAge() {
        return animalAge;
    }

    public void setanimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "animalType=" + animalType + ", animalName=" + animalName + ", animalWeight=" + animalWeight
                + ", animalHeight=" + animalHeight + ", animalAge=" + animalAge;
    }
}
