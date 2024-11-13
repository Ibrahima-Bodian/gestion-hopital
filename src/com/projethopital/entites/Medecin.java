package com.projethopital.entites;

// Je fait la classe Patient qui va représenter un patient dans un hôpital
public class Medecin {
    private String idMedecin;
    private String nomMedecin;
    private String prenomMedecin;
    private String specialite;


    // Je fais un constructeur pour cette classe
    public Medecin(String idMedecin, String nomMedecin, String prenomMedecin, String specialite){
        this.idMedecin=idMedecin;
        this.nomMedecin=nomMedecin;
        this.prenomMedecin=prenomMedecin;
        this.specialite=specialite;
    }

    // Je fais les Getters
    public String getIdMedecin(){
        return idMedecin;
    }

    public String getNomMedecin(){
        return nomMedecin;
    }

    public String getPrenomMedecin(){
        return prenomMedecin;
    }

    public String getSpecialite(){
        return specialite;
    }

    public String toString(){
        return "[ID Medecin : " + idMedecin + " Nom du Medecin : "+ nomMedecin + " Prenom du Medecin : " + prenomMedecin + " Sa pécialité : " + specialite +"]";
    }
    
}
