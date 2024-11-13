package com.projethopital.entites;

import java.time.LocalDateTime;

// La classe RendezVous pour représenter un rendez-vous entre un patient et un médecin
public class Rdv {
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime date;

    /*le constructeurn de la classe Rdv et dans ce constructeur, nous avons :
     * le paramètre -> date pour date du rendez-vous.
     * paramètre -> patient pour patient du rendez-vous.
     *  paramètre -> medecin pour médecin du rendez-vous.
     */
    public Rdv(Patient patient, Medecin medecin, LocalDateTime date){
        this.date=date;
        this.medecin=medecin;
        this.patient=patient;
    }

    // je fais les getters : pour le patient
    public Patient getPatient(){
        return patient;
    }

    //pour le medecin
    public Medecin getMedecin(){
        return medecin;
    }

    //pour le date
    public LocalDateTime getDate(){
        return date;
    }

    //le setter pour la date. j'en aurais bien besoin pour la class hopital quand je vais voiloir lmodifier les rendez-vos.
    public void setDate(LocalDateTime date) {
        this.date=date;
    }

    @Override
    public String toString(){
        return "Rendez-vous [Date : " + date + ", Patient : " + patient + ", Médecin : " + medecin + "]";
    }  
}
