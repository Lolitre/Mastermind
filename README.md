# Presentation
Ceci est un programme crée par Moi-même pour valider le premier projet d'Openclassrooms dans le parcours Développeur d'application Java.
Il contient deux jeux Combination et MasterMind qui sont jouables à l'aide d'une IHM.
Le projet est terminé et fonctionnel.
Il a été dévellopez en JAVA sous Windows 10 avec l'utilisation de NetBeans.
# Utilisation
Vous pous téléchargez les sources et à l'aide d'un environnement de développement tel que NetBeans, Eclipse etc lancer le main ce situant dans Launch.java (JAVA est requis).
# Règles
Pour les deux jeux trois modes sont disponibles: Attack, Defend et Versus.
Attack : Vous devez trouvez la combinaison secrète de l'ordinateur
Defend: Vous devez faire devinez votre combinaison secrète à l'ordinateur.
Versus: Le mode Attack et Defend en même temps le premier qui entre le joueur et l'ordinateur trouve la combinaison secrète gagne.

Combination: La combinaison secrète est composé de chiffre. Les indices sont composés de - de + et de =. Pour trouver la combinaison l'attaquant propose un première combinaisond de son choix puis à l'aide des indices succesifs doit déduire la combinaison secrète.
Exemple:
Premier essai 75564 Réponse du défenseur +---+ Deuxième essai 93247 Réponse =-==+ Troisième essai 91248 etc

Mastermind: Les règles sont disponibles sur internet par exemple la page wikipédia (https://fr.wikipedia.org/wiki/Mastermind). Les couleurs ici seront représentés par des chiffres mais le principe reste le même.

Vous pouvez changez certains paramètres en modifiant le fichier configuration ( Attention à ne modifier que les valeurs numériques dans la tranche donnée pour celles ci)
CombinationTry : Le nombre d'essai possibles moins il y'en a plus il faut trouve la combinaison de Combination rapidement (valeur min =2)
CombinationLenght: La longuer de la combinaison de Combination (valeur min= 1 valeur max = 10)
MastermindTry: Le nombre d'essai possibles moins il y'en a plus il faut trouve la combinaison du MasterMind rapidement (valeur min =2)
MasterMindNumberofcolors Le nombre de couleurs utilisés pour la combinaison du MasterMind (valeur min =2 valeur max =10)
