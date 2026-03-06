_______________________________________________

=> "FileManager.java" : creer et li les fichier. 
=> "TestIcons.java" : test pour le FileManager. 
=> "FileBackup.java" : enregistrer les infos des posts 
_______________________________________________

=> "FileManage" : 
1. contient deux fonctions , une sappelle "createFile" qui est responsable de créer les fichier en donnant 
deux arguments (File fileObj , String fileContent) , et qui créer fichier d'apres son object , pour eviter les 
probblemes du paths.
2. efficace et best choice pour donner l'utilisateur la possibilitée de rechercher les postes par une petite 
subString , et aussi efficacr pout yrier les posts selon la date de création 
( post1.id > post2.id => "post2 est nouveau que post1" ).
3. le fichier contient also une autre methode , "getText(File fileObj)" , qui prend l'object d'un fichier et 
retourne les resultat String de tout le fichier(tout le contenu) => efficace aussi si on veur modifier/rechercher.
=> "FileBackup" : 
1. enregistrer les informations d'une poste (id , date , text...) sous forme de dictionnaire a utiliser aprés , 
cette methode enregistre les données dans un fichier  'proprieties'(human readable files).
2. il peuvent aussi sauvegarder les commentaires en les mettant sous form string et utilisant .split("") pour 
separer entre les createur des commentaires , les dates de création et aussi le contenu text