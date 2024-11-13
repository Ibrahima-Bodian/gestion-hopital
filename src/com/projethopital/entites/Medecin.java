package com.projethopital.entites;

// Je fait la classe Medecin qui va représenter un medecin dans un hôpital
public class Medecin {
    private String idMedecin;
    private String nomMedecin;
    private String prenomMedecin;
    private String specialite;


    
    /*Je fais un constructeur pour cette classe
     * Constructeur de la classe Medecin.
     * idmedecin qui identifie de manière unique un médecin.
     * le paramètre nomMedecin pou le nom du médecin.
     * le paramètre prenomMedecin pou le prenom du médecin.
     * leparamètre specialite pour spécialité du médecin.
     */
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

    //pour le nom du medecin
    public String getNomMedecin(){
        return nomMedecin;
    }

    //pou son prenom aussi
    public String getPrenomMedecin(){
        return prenomMedecin;
    }

    // et pour la specialité
    public String getSpecialite(){
        return specialite;
    }

    @Override
    public String toString(){
        return "[ID Médecin : " + idMedecin + ", Nom : " + nomMedecin + ", Prénom : " + prenomMedecin + ", Spécialité : " + specialite + "]";
    }


    
}
