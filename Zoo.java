import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Zoo {
    final int NBR_CAGES = 3; // réduit pour tester la capacité
    Animal[] animals;
    int animalCount = 0;
    private String name;
    String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.age < 0) {
            throw new InvalidAgeException(animal.age);
        }
        if (animalCount >= NBR_CAGES) {
            throw new ZooFullException();
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà : " + animal.name);
            return;
        }
        animals[animalCount++] = animal;
        System.out.println("Animal ajouté : " + animal.name);
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) return i;
        }
        return -1;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
}
