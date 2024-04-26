package AnimalZoo.AnimalPackage;


class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "hasTail=" + hasTail + ", teethShape=" + teethShape + ", isHarmfull="
                + isHarmfull + "]";
    }

    public void setAnimalType() {
        super.setAnimalType("Pet");
    }

    boolean hasTail;
    String teethShape;
    boolean isHarmfull;

    Dog() {
        setAnimalType();
    }

    public Dog(boolean hasTail, String teethShape, boolean isHarmfull) {
        setAnimalType();
        this.hasTail = hasTail;
        this.teethShape = teethShape;
        this.isHarmfull = isHarmfull;
    }

    public Dog(String animalName, float animalWeight, float animalHeight, int animalAge,
            boolean hasTail, String teethShape, boolean isHarmfull) {
        super("Pet", animalName, animalWeight, animalHeight, animalAge);
        this.hasTail = hasTail;
        this.teethShape = teethShape;
        this.isHarmfull = isHarmfull;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getTeethShape() {
        return teethShape;
    }

    public void setTeethShape(String teethShape) {
        this.teethShape = teethShape;
    }

    public boolean isHarmfull() {
        return isHarmfull;
    }

    public void setHarmfull(boolean isHarmfull) {
        this.isHarmfull = isHarmfull;
    }
}