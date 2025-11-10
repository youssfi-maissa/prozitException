package tn.esprit.gestionzoo.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Âge d’animal invalide : " + age + ". L’âge ne peut pas être négatif.");
    }
}
