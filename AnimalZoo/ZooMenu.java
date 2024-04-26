package AnimalZoo.AnimalPackage;

import java.util.*;

public class ZooMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to zoo MENU!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter zoo name: ");
        String zooName = sc.next();
        System.out.print("Enter zoo location: ");
        String zooLocation = sc.next();
        System.out.print("Enter total animals in zoo: ");
        int totalAnimals = sc.nextInt();
        Zoo zoo = new Zoo(zooLocation, zooName);
        Animal[] animals = new Animal[totalAnimals];
        int index = 0;
        while (totalAnimals > 0) {
            System.out.print("\nSelect operation: 1. Add Animal  2. Display All Animal: ");
            int choice = sc.nextInt();
            if (choice == 2) {
                DisplayAnimals(zoo, index);
                continue;
            }
            System.out.println("\nAnimal number " + (index + 1)
                    + ". Please select animal ---> 1. Elephant 2. Dog  3. Other Animal");
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    Elephant elephant = new Elephant();
                    System.out.print("Enter elephant name: ");
                    elephant.animalName = sc.next();
                    System.out.print("Enter " + elephant.getAnimalName() + " weight: ");
                    elephant.animalWeight = sc.nextInt();
                    System.out.print("Enter " + elephant.getAnimalName() + " height: ");
                    elephant.animalHeight = sc.nextInt();
                    System.out.print("Enter " + elephant.getAnimalName() + " age: ");
                    elephant.animalAge = sc.nextInt();
                    System.out.print("Enter " + elephant.getAnimalName() + " Total Childerns: ");
                    elephant.elephantTotalChilderns = sc.nextInt();
                    System.out.print("Enter " + elephant.getAnimalName() + " Tusk Size: ");
                    elephant.elephantTuskSize = sc.nextInt();
                    animals[index++] = elephant;
                    break;

                case 2:
                    Dog dog = new Dog();
                    System.out.print("Enter dog name: ");
                    dog.animalName = sc.next();
                    System.out.print("Enter " + dog.getAnimalName() + " weight: ");
                    dog.animalWeight = sc.nextInt();
                    System.out.print("Enter " + dog.getAnimalName() + " height: ");
                    dog.animalHeight = sc.nextInt();
                    System.out.print("Enter " + dog.getAnimalName() + " age: ");
                    dog.animalAge = sc.nextInt();
                    System.out.print("Enter " + dog.getAnimalName() + " teeth shape: ");
                    dog.teethShape = sc.next();
                    System.out.print("Does your " + dog.getAnimalName() + " has a tail(true/false): ");
                    dog.hasTail = sc.nextBoolean();
                    System.out.print("Is your " + dog.getAnimalName() + " is harmfull(true/false): ");
                    dog.isHarmfull = sc.nextBoolean();
                    animals[index++] = dog;
                    break;
                case 3:
                    OtherAnimal otherAnimal = new OtherAnimal();
                    System.out.print("Enter Animal name: ");
                    otherAnimal.animalName = sc.next();
                    System.out.print("Enter " + otherAnimal.getAnimalName() + " weight: ");
                    otherAnimal.animalWeight = sc.nextInt();
                    System.out.print("Enter " + otherAnimal.getAnimalName() + " height: ");
                    otherAnimal.animalHeight = sc.nextInt();
                    System.out.print("Enter " + otherAnimal.getAnimalName() + " age: ");
                    otherAnimal.animalAge = sc.nextInt();
                    animals[index++] = otherAnimal;
                    break;
            }
            zoo.animal = animals;
            totalAnimals--;
        }
        zoo.animal = animals;
        DisplayAnimals(zoo, index);
        sc.close();
    }

    public static void DisplayAnimals(Zoo zoo, int index) {
        if (index == 0) {
            System.out.println("No animls are added");
            return;
        }
        System.out.println("\n\n................All animals details...........");
        for (int i = 0; i < index; i++) {
            Animal animal = zoo.animal[i];
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println(dog.toString());
            } else if (animal instanceof Elephant) {
                Elephant elephant = (Elephant) animal;
                System.out.println(elephant.toString());
            }
        }
    }
}

// commands for running the files
// PS D:\VS code\Java\AnimalZoo> javac -d . Animal.java 
// PS D:\VS code\Java\AnimalZoo> Javac -d . *.java 
// PS D:\VS code\Java\AnimalZoo> java AnimalZoo.ZooMenu