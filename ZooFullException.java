package tn.esprit.gestionzoo.exceptions;

public class ZooFullException extends Exception {
    public ZooFullException() {
        super("Le zoo est plein, impossible d’ajouter un nouvel animal.");
    }
}
