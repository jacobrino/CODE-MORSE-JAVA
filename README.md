Code Morse – Java
=================

Description
-----------
Projet personnel durant L1, développé en Java permettant de manipuler le code Morse
(encodage et décodage de messages).

Ce projet a été réalisé dans un cadre d’apprentissage afin de mettre en
pratique les bases du langage Java, la structuration d’un projet, ainsi que
la compilation et l’exécution en ligne de commande.

Environnement de développement
------------------------------
Le projet a été développé en Java à l’aide de l’IDE Eclipse.
Le code source est fourni de manière portable et peut être compilé et exécuté
sans dépendre d’un environnement spécifique(OS).

Structure du projet
-------------------
src/
    Contient le code source Java du projet.

bin/
    Contient les fichiers compilés (.class).
    Ce dossier est généré automatiquement lors de la compilation et n’est pas
    versionné sur GitHub.

docs/
    Contient la documentation du projet ainsi que les captures du
    fonctionnement (compilation, exécution, résultats).

Compilation
-----------
Depuis le dossier principal du projet, exécuter la commande suivante :

javac -d bin src/boublefen/*.java

Cette commande compile les fichiers Java présents dans le dossier src et place
les fichiers compilés dans le dossier bin.

Exécution
---------
Après la compilation, exécuter le programme avec la commande suivante :

java -cp bin boublefen.Main

Cette commande lance la classe principale du projet.

Aperçu du fonctionnement
------------------------
Des captures d’écran illustrant la compilation, l’exécution et les résultats
du programme sont disponibles dans le dossier :

docs/images/

Remarques
---------
- Le projet a été initialement développé avec Eclipse en 2021, puis archivé et publié
  sur GitHub en Décembre 2025 dans le cadre d’un portfolio académique.
- Le code est volontairement simple et lisible afin de mettre en avant la
  compréhension des concepts fondamentaux de Java.
