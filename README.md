## Bienvenue dans le projet de gestion d'hôpital

Bienvenue dans ce projet Java pour la gestion des patients, des médecins, et des rendez-vous dans un hôpital. Ce guide vous aidera à configurer et à utiliser l'application, ainsi qu'à comprendre ses fonctionnalités de base.

## Présentation du Projet
Ce projet simule la gestion des différentes entités d'un hôpital, avec une organisation modulaire et des fonctionnalités clés, tellesque :
- Ajout et affichage des patients avec leurs informations personnelles.
- Gestion des médecins, incluant leur spécialité et leur disponibilité.
- Planification, modification et annulation des rendez-vous entre les patients et les médecins.

L'application a été conçue en Java avec une structure de packages pour simplifier la gestion des classes et permettre une organisation claire du code.

## Pré-requis
Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre machine :
- Java JDK 11 ou une version plus récente
- Un IDE comme Visual Studio Code avec l'extension Java ou tout autre IDE supportant Java (Eclipse, IntelliJ IDEA, etc.)

## Structure du Projet
Le projet est organisé en plusieurs packages pour une meilleure gestion et lisibilité du code.
La hierarchie est la suivante :

src/
└── com/
    └── projethopital/
        ├── entites/
        │   ├── Patient.java       # Classe représentant un patient
        │   ├── Medecin.java       # Classe représentant un médecin
        │   └── Rdv.java    # Classe représentant un rendez-vous
        ├── gestion/
        │   └── Hopital.java       # Classe principale de gestion de l'hôpital
        └── main/
            └── Main.java          # Classe principale pour lancer l'application


## Description des Classes
Patient : Contient les informations de base d'un patient (ID, nom, prénom, âge).
Medecin : Représente un médecin avec un ID, un nom, prénom et une spécialité.
RendezVous : Modélise un rendez-vous entre un patient et un médecin à une date spécifique.
Hopital : Gère les collections de patients, médecins et rendez-vous, avec des méthodes pour ajouter, afficher, fixer, modifier et annuler des rendez-vous.
Main : Point d'entrée de l'application, permettant de tester les fonctionnalités.

## Installation et Configuration
- Clonez le projet : Récupérez les fichiers du projet depuis le dépôt GitHub (ou un autre emplacement de stockage) :
git clone https://github.com/Ibrahima-Bodian/gestion-hopital.git
cd nom-du-projet/src

- Compilation : À partir du dossier src, compilez toutes les classes en utilisant les commandes suivantes :
cd src
javac com/projethopital/entites/*.java com/projethopital/gestion/*.java com/projethopital/main/Main.java


- Exécution : Lancez le programme pour tester les fonctionnalités principales :
java com.projethopital.main.Main

## Fonctionnalités de l'Application
Une fois le projet exécuté, vous pouvez :
- Ajouter de nouveaux patients et médecins.
- Créer et gérer des rendez-vous entre patients et médecins.
- Modifier ou annuler un rendez-vous en fonction de la disponibilité.
- Afficher les listes de patients, de médecins et de rendez-vous pour obtenir une vue d'ensemble des données.

## Documentation
Une documentation complète est disponible sous forme de Javadoc pour faciliter la compréhension et l'extension du code.


## Contributeurs
Ibrahim - Développeur principal

## Licence
Ce projet est sous licence MIT. Consultez le fichier LICENSE pour plus de détails.