package com.projethopital.gestion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.projethopital.entites.Medecin;
import com.projethopital.entites.Patient;
import com.projethopital.entites.Rdv;
import com.projethopital.gestion.Hopital;


//cette classe Hopital gère les patients, médecins et rendez-vous de l'hôpital.
public class Hopital {
    private List<Patient>patients;
    private List<Medecin>medecins;
    public List<Rdv>rdvs;

    // je fais le constructeur de la classe hopital
    public Hopital(){
        medecins=new ArrayList<>();
        patients=new ArrayList<>();
        rdvs=new ArrayList<>();
    }

    //une methode pour ajouter un patient
    public void ajouterPatient(Patient patient){
        patients.add(patient);

    }

    //la methode pour ajouter un medecin
    public void ajouterMedecin(Medecin medecin){
        medecins.add(medecin);
    }

    // une methode pour fixer un rendez-vous
    public void FixerRdv(Patient patient, Medecin medecin, LocalDateTime date){
        Rdv rdv=new Rdv(patient, medecin, date);
        rdvs.add(rdv);
    }

    // pour afficher les patien
    public void afficherPatient(){
        System.out.println("Liste des patients :");
        for(Patient patient:patients){
            System.out.println(patient);
        }
    }

    //afficher les medecin
    public void afficherMedecin(){
        System.out.println("La liste des Medecins :");
        for(Medecin medecin:medecins){
            System.out.println(medecin);
        }
    }

    //la methode pour afficher de rendez-vous
    public void afficherRdv(){
        System.out.println("La liste des Rendez-vous : ");
        for(Rdv rdv:rdvs){
            System.out.println(rdv);
        }
    }

    //une methode pour annuler le rendez vous
    public boolean annulerRdv(Patient patient, Medecin medecin, LocalDateTime date){
        for(Rdv rdv:rdvs){
            if (rdv.getPatient().equals(patient)&& rdv.getMedecin().equals(medecin)&& rdv.getDate().equals(date)){
                rdvs.remove(rdv);
                return true;//si tout se passe bien, le rendez-vous a été annulé avec succès
            }
        }
        return false; //bon bah sinon il ne trouve pas
    }

    //methode pour modifier le rdv
    public boolean modifierRdv(Patient patient, Medecin medecin, LocalDateTime anciennDate, LocalDateTime nouvellDate){
        for(Rdv rdv:rdvs){
            if (rdv.getPatient().equals(patient)&&rdv.getMedecin().equals(medecin)&&rdv.getDate().equals(anciennDate)){
                rdv.setDate(nouvellDate); //la je met à jour la date du rendez-vous
                return true; //si la modification réussie
            }
        }
        return false; //si le rdv n'est pas trouvé
    }

    // public String toString(){
    //     return
    // }
}

