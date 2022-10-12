# Test Technique Java Backend - ekWateur

L'objectif de ce test est l'écriture d'un programme purement backend. Il peut éventuellement servir de support dans le cadre 
d'un futur entretien au cours duquel il pourra être demandé de faire des évolutions fonctionelles dessus. Si certaines parties
ne te paraissent pas claires, nous t'encourageons à nous toutes les questions que tu juges utiles.

## Enoncé de l'exercice
Le ministère des finances vous demande de créer un programme devant permettre de calculer les impôts dus par les entreprises françaises.

Dans un premier temps, ce programme devra gérer 2 types d'entreprise :

A) Les auto-entreprises, qui ont les propriétés suivantes :
- N° SIRET
- Dénomination

B) Les SAS, qui ont les propriétés suivantes :
- N° SIRET
- Dénomination
- Adresse du siège social

Le programme sera étendu par la suite avec d'autres types d'entreprise (SASU, SARL ...)

Par ailleurs, le calcul des impôts devra respecter les règles de gestion suivantes :
- Pour les auto-entreprises : impôts = 25% du CA annuel de l'entreprise
- Pour les SAS : impôts = 33% du CA annuel de l'entreprise

## Contraintes techniques
La seule contrainte technique est l'utilisation du langage Java dans sa version 8 au minimum.

## Ce qui est attendu
Le minimum attendu est un programme fonctionnel qui puisse etre lancé en ligne de commande et qui puisse etre testé.
Il devra donc être accompagné d'un jeu de données.

## Comment soumettre ton travail
- Créer un nouveau repository public sur un espace à toi (et non un fork de ce repo' sur l'espace gitlab ekWateur)
- Rendre le projet sur la branche master de ton repository
- Enfin, nous communiquer par mail le lien de ton repository quand l'exercice est terminé
