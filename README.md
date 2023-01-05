# Overwatchcounters

#Le projet a pour idée de réaliser une application "compagnon" du jeu Overwatch 2 permettant d'afficher, en fonction de votre poste, le meilleur personnage à prendre pour contrer la composition adverse. Le jeu Overwatch fonctionne de la manière suivante : c'est un jeu de type FPS en 5 contre 5 avec différents postes : Tank, healers et DPS. Dans chaque équipe, il y a 2 DPS, 2 healers et 1 tank. Il y a en tout 35 personnages à l'heure actuelle et certains personnages ont l'avantage sur d'autres. Il est donc parfois difficile de choisir le personnage idéal pour contrer l'équipe adverse. L'application que nous allons réaliser a pour but de pallier à ce problème et d'aider à la décision.

Lors du lancement de l'application, une première interface apparaîtra avec 3 boutons différents demandant le poste de l'utilisateur (tank, healer et DPS). Une fois le poste choisi, une deuxième interface apparaîtra avec 5 slots vides, avec chacun un menu déroulant affichant les différents personnages en fonction de leur poste. Il est demandé à l'utilisateur d'indiquer la composition adverse. Une fois toute la composition indiquée, l'utilisateur pourra lancer la recherche, ce qui aura pour effet d'afficher le personnage idéal à jouer contre la composition adverse.

Pour mettre ceci en place, il faudra dans un premier temps associer à chaque personnage ses counters et, lors de la recherche, il faudra que le programme analyse les counters de chaque ennemi choisi et que l'occurrence apparaissant le plus soit proposée au joueur sur la dernière interface.

