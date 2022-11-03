# Test Technique Java Backend - ekWateur

L'objectif de ce test est l'écriture d'un programme purement backend. Il peut éventuellement servir de support dans le cadre 
d'un futur entretien au cours duquel il pourra être demandé de faire des évolutions fonctionelles dessus. Si certaines parties
ne te paraissent pas claires, nous t'encourageons à nous poser toutes les questions que tu juges utiles.

## Enoncé de l'exercice
Le product owner te demande de developper un programme qui permet de calculer le montant à facturer à un client d'Ekwateur pour 
un mois calendaire.

Ce programme devra gérer 2 types de clients :

A) Les clients Pro, qui ont les propriétés suivantes :
- Reference Client (EKW + 8 caractères numériques)
- N° SIRET
- Raison Sociale
- CA

B) Les particuliers, qui ont les propriétés suivantes :
- Reference Client (EKW + 8 caractères numériques)
- Civilité
- Nom
- Prénom

Un client peut consommer deux types d'énergie :
- Electricité
- Gaz

Chaque énergie est facturée au Kwh.
- Pour les particuliers, le prix du Kwh est de 0,021 € pour l'électricité et 0,015€ pour le gaz
- Pour les pro, ayant un CA supérieur à 1 000 000 €, le prix du Kwh est de 0,014 € pour l'électricité et 0,011€ pour le gaz
- Pour les pro, ayant un CA inférieur à 1 000 000 €, le prix du Kwh est de 0,018 € pour l'électricité et 0,013€ pour le gaz

## Contraintes techniques
La seule contrainte technique est l'utilisation du langage Java dans sa version 8 au minimum.

## Ce qui est attendu
Le minimum attendu est un programme fonctionnel qui puisse etre executé et testé. Il devra donc être accompagné d'un jeu de données.

## Comment soumettre ton travail
- Créer un nouveau repository public sur un espace à toi (et non un fork de ce repo' sur l'espace gitlab ekWateur)
- Rendre le projet sur la branche master de ton repository
- Enfin, nous communiquer par mail le lien de ton repository quand l'exercice est terminé
