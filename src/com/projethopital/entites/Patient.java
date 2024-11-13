package com.projethopital.entites;


// La classe Patient qui va représenter un patient dans un hôpital
public class Patient {
    private String idPatient;
    private String nom;
    private String prenom;
    private int age;


    // Je fais un constructeur de la classe Patient
    public Patient(String idPatient, String nom, String prenom, int age){
        this.idPatient=idPatient;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    // Là, je fais les Getters et Setters
    public String getIdPatient(){
        return idPatient;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Patient[ID: " + idPatient + " Nom: " + nom + " Prénom: " + prenom +  " Âge: " + age + "]";
    }
}

