# Overwatchcounters Teste Matys // Aubry Trefouel

#Le projet a pour idée de réaliser une application "compagnon" du jeu Overwatch 2 permettant d'afficher, en fonction de votre poste, le meilleur personnage à prendre pour contrer la composition adverse. Le jeu Overwatch fonctionne de la manière suivante : c'est un jeu de type FPS en 5 contre 5 avec différents postes : Tank, healers et DPS. Dans chaque équipe, il y a 2 DPS, 2 healers et 1 tank. Il y a en tout 35 personnages à l'heure actuelle et certains personnages ont l'avantage sur d'autres. Il est donc parfois difficile de choisir le personnage idéal pour contrer l'équipe adverse. L'application que nous allons réaliser a pour but de pallier à ce problème et d'aider à la décision.

Lors du lancement de l'application, une première interface apparaîtra avec 3 boutons différents demandant le poste de l'utilisateur (tank, healer et DPS). Une fois le poste choisi, une deuxième interface apparaîtra avec 5 slots vides, avec chacun un menu déroulant affichant les différents personnages en fonction de leur poste. Il est demandé à l'utilisateur d'indiquer la composition adverse. Une fois toute la composition indiquée, l'utilisateur pourra lancer la recherche, ce qui aura pour effet d'afficher le personnage idéal à jouer contre la composition adverse.

Pour mettre ceci en place, il faudra dans un premier temps associer à chaque personnage ses counters et, lors de la recherche, il faudra que le programme analyse les counters de chaque ennemi choisi et que l'occurrence apparaissant le plus soit proposée au joueur sur la dernière interface.

Voici la liste des counters pour chaques personnages : 

1.	Tracer - Counters: Roadhog, Winston, Zarya
2.	Winston - Counters: Cassidy, Widowmaker, Ramattra
3.	Reaper - Counters: Tracer, Winston, Roadhog
4.	Pharah - Counters: Widowmaker, Junkrat, Hanzo
5.	Cassidy - Counters: Pharah, Widowmaker, Mei
6.	Hanzo - Counters: Pharah, Sojourn, Tracer
7.	Widowmaker - Counters: Tracer, Winston, D.Va
8.	D.Va - Counters: Roadhog, Zarya, Winston
9.	Zarya - Counters: Roadhog, Reinhardt, Winston
10.	Genji - Counters: Reinhardt, Winston, Kiriko
11.	Roadhog - Counters: Tracer, Winston, Zarya
12.	Reinhardt - Counters: Pharah, Ramattra Soldat 76
13.	Torbjörn - Counters: Pharah, Cassidy, Widowmaker
14.	Symmetra - Counters: Torbjörn, Reinhardt, Pharah
15.	Bastion - Counters: Tracer, Genji, Winston
16.	Mei - Counters: Roadhog, Soldat 76, Winston
17.	Ana - Counters: Kiriko, Widowmaker, Genji
18.	Lucio - Counters: Symmetra, Bastion, Torbjörn
19.	Moira - Counters: Tracer, Reaper, Widowmaker
20.	Brigitte - Counters: Tracer, Reaper, Widowmaker
21.	Doomfist - Counters: Sojourn, Reinhardt, Roadhog
22.	Sombra - Counters: Tracer, Junker Queen, Reaper
23.	Orisa - Counters: Roadhog, Ramattra, Zarya
24.	Zenyatta - Counters: Tracer, Genji, Kiriko
25.	Mercy - Counters: Tracer, Genji, Reaper
26.	Junkrat - Counters: Sojourn, Winston, Roadhog
27.	Echo - Counters: Reaper, Cassidy, Pharah
28.	Baptiste - Counters: Tracer, Reaper, Widowmaker
29.	Ashe - Counters: Pharah, Roadhog, Reinhardt
30.	Moira - Counters: Tracer, Reaper, Widowmaker
31.	Sigma - Counters: Roadhog, Winston, Reinhardt
32.	Wrecking Ball - Counters: Roadhog, Zarya, Winston
33.	Kiriko - Counters : Widowmaker, Winston, Sombra
34.	Ramattra - Counters : Pharah, Orisa, Zenyatta
35.	Sojourn - Counters : Lucio, Zarya, Winston
36.	Junker Queen – Counters : Mei, Anna, Kiriko
37.	Soldat 76 – Counters : Genji, Ramattra, Moira

Dû à la deadline qui nous est imposée, nous allons devoir simplifier l'application en réduisant le nombre de personnages à 6 pour la présentation de mercredi. L'idée de pouvoir mettre l'entièreté de l'équipe adverse sera implémentée plus tard. Pour l'instant, nous nous limitons à afficher les counters pour chaque personnage séparément. 
