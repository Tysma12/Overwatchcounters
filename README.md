# Overwatchcounters

#Le projet a pour idée de réaliser une application "compagnon" du jeu Overwatch 2 permettant d'afficher en fonction de votre poste, le meilleur personnage a prendre pour contrer la composition adverse.
Le jeu Overwatch fonctionne de la maniere suivante : 
C'est un jeu de type FPS en 5 contre 5 avec différents postes : Tank, healer et dps. Dans chaques équipe il y a 2 dps, 2 healers et 1 tank. Il y a en tout 35 personnages à l'heure actuelle et certains personnages ont l'avantage sur d'autres. Il est donc parfois difficile de choisir le personnage idéale pour contrer l'équipe adverse. L'application que nous allons réalisé a pour but de palier à ce problème et d'aider à la décision. 

Lors du lancement de l'application, une premiere interface apparaitra avec 3 boutons différents demandant le poste de l'utilisateur (tank, healer et dps). 
Une fois le poste choisi, une deuxieme interface apparaitra avec 5 slots vide avec chacun un menu déroulant affichant les différents personnages en fonction de leur poste. Il est demandé à l'utilisateur d'indiquer la composition adverse. Une fois toute la composition indiqué, l'utilisateur pourra lancer la recherche ce qui va avoir pour effet d'afficher le personnage idéal à jouer contre la composition adverse. 

Pour mettre ceci en place dans un premier temps il faudra associer à chaque personnage ses counters et lors de la recherche il faut que le programme analyse les counters de chaque ennemies choisis et l'occurence apparaissant le plus sera proposé au joueur sur la derniere interface. 

Au niveau bdd il faudrait donc 2 tables; une table personnages avec comme attributs Nom et poste, et une deuxieme appelée interaction qui fera lien avec la premiere ayant les attributs nom et counter.

