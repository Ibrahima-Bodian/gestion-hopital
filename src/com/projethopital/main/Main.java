package com.projethopital.main;
import com.projethopital.entites.Medecin;
import com.projethopital.entites.Patient;
//import com.projethopital.entites.Rdv;
import com.projethopital.gestion.Hopital;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //Je cre d'abord un hopital que je vais nommer henri_mondor
        Hopital henri_mondor=new Hopital();


        //Ensuite un patien et un medecin
        Patient prempatient=new Patient("PUCA2024", "Presty", "Viny", 21);
        Medecin medecin1=new Medecin("MUCA2024", "Bodian", "Ibra", "Dentiste");

        //j'ajoute un patien et un medecin à l'hopital
        henri_mondor.ajouterPatient(prempatient);
        henri_mondor.ajouterMedecin(medecin1);

        //maintenant je vais fixer un rendez-vous
        LocalDateTime date=LocalDateTime.of(2024, 11, 11, 10, 00, 00);
        henri_mondor.FixerRdv(prempatient, medecin1, date);

        //j'affiche les rendez-vous
        henri_mondor.afficherRdv();

        //je les modifie par simple plaisir :)
        LocalDateTime nouvellDate=LocalDateTime.of(2024, 11, 16, 10, 0);
        henri_mondor.modifierRdv(prempatient, medecin1, date, nouvellDate);

        //bon je vais afficher les rendez-vous après modification pour voir
        System.out.println("Après modification : ");
        henri_mondor.afficherRdv();

        //je vais annuler le rdv juste pour voir ce que ça donne
        henri_mondor.annulerRdv(prempatient, medecin1, nouvellDate);

        // je vais assayer d'afficher le redv annulé, pour voir s'il s'affiche
        System.out.println("Apres annulation : ");
        henri_mondor.afficherRdv();
    }
}
