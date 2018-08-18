# Presentation
Ceci est un programme crée par Moi-même pour valider le premier projet d'Openclassrooms dans le parcours Développeur d'application Java. Il contient deux jeux Combination et MasterMind qui sont jouables à l'aide d'une IHM. 
Le projet est terminé et fonctionnel.  
Il a été développez en JAVA sous Windows 10 avec l'utilisation de NetBeans.  
# Utilisation
Pour utiliser ce programme vous devez (avoir Java sur votre machine, disponible ici : https://www.java.com/fr/download/windows-64bit.jsp) téléchargez le fichier .jar et le dossier lib ( gardez les dans le même dossier par la suite). 
Lancer le .jar et le programme devrais ce lancer. Si ce n'est pas le cas (il est possible que vous ayez l'erreur « Could not find main class : program will exit) alors utilisez un cmd/shell et placez vous dans le dossier contenant le .jar puis tapez la commande suivante : Java -jar MasterMind.jar. Vous pouvez ajoutez à celle ci l'argument « devmod » pour passez le programme en mode développeur  
Vous pouvez aussi téléchargez le fichier les sources et à l'aide d'un environnement de développement tel que NetBeans, Eclipse etc lancer le main ce situant dans Launch.java .
# Règles
Pour les deux jeux trois modes sont disponibles: Attack, Defend et Versus.  
Attack : Vous devez trouvez la combinaison secrète de l'ordinateur  
Defend: Vous devez faire devinez votre combinaison secrète à l'ordinateur.  
Versus: Le mode Attack et Defend en même temps le premier qui entre le joueur et l'ordinateur trouve la combinaison secrète gagne.  

Combination: La combinaison secrète est composé de chiffre. Les indices sont composés de - de + et de =. Pour trouver la combinaison l'attaquant propose une première combinaison de son choix puis à l'aide des indices succesifs doit déduire la combinaison secrète.  
Exemple:
Premier essai 75564 Réponse du défenseur +---+ Deuxième essai 93247 Réponse =-==+ Troisième essai 91248 etc  
En mode Defend vous devez renseignez les information sous forme de + de - ou de = .  

Mastermind: Les règles sont disponibles sur internet par exemple la page wikipédia (https://fr.wikipedia.org/wiki/Mastermind). Les couleurs ici seront représentées par des chiffres mais le principe reste le même.  
En mode attaque vous devez toruvez la combinaison par déduction, vous entrez des chiffres et l'odinateur vous donnera le nombre de bonnes couleurs et de bonnes positions.  
En mode défense c'est vous qui indiquez le nombre de bonnes couleurs et de bonnes positions à l'odinateur.  

Vous pouvez changez certains paramètres en modifiant le fichier configuration ( Attention à ne modifier que les valeurs numériques dans la tranche donnée pour celles-ci)  
CT: Le nombre d'essais possibles moins il y'en a plus il faut trouver la combinaison de Combination rapidement (valeur min =2)  
CL: La longueur de la combinaison de Combination (valeur min= 1 valeur max = 10)  
MMT: Le nombre d'essais possibles moins il y'en a plus il faut trouver la combinaison du MasterMind rapidement (valeur min =2)  
MMN : Le nombre de couleurs utilisées pour la combinaison du MasterMind (valeur min =2 valeur max =10)  
MML : La longueur de la combinaison de MasterMind (valeur min= 2 valeur max = 4). La valeur 1 est possible mais cela revient juste à tester tout les chiffres à la suite, 4 reste le format le plus intéressant.  
