package AnimalZoo.AnimalPackage;

public class Zoo {

    String zooLocation;
    String zooName;
    Animal[] animal;

    // constructor
    public Zoo() {
    }

    public Zoo(String zooLocation, String zooName) {
        this.zooLocation = zooLocation;
        this.zooName = zooName;
    }

    // getter and setter
    public String getZooLocation() {
        return zooLocation;
    }

    public void setZooLocation(String zooLocation) {
        this.zooLocation = zooLocation;
    }

    public String getzooName() {
        return zooName;
    }

    public void setzooName(String zooName) {
        this.zooName = zooName;
    }
}
