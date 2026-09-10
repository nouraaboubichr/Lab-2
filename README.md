# Exercice 1 — Plus longue sous-séquence croissante (LIS)

* Le but est de déterminer la longueur de la plus longue suite d’éléments qui augmente strictement dans un tableau, sans que les éléments aient besoin d’être consécutifs.
* On utilise un tableau `dp` pour mémoriser, pour chaque position, la longueur de la meilleure sous-séquence qui se termine à cet endroit.
* Chaque élément peut former à lui seul une sous-séquence de longueur `1`.
* Pour améliorer `dp[i]`, on compare `t[i]` avec les éléments qui le précèdent et on prolonge une sous-séquence lorsqu’on trouve une valeur plus petite.
* La longueur maximale présente dans `dp` correspond à la réponse.
* La complexité de cette solution est **O(n²)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

# Exercice 2 — Tableau pivot

* On cherche les éléments qui peuvent être considérés comme des pivots du tableau.
* Un élément est un pivot lorsque toutes les valeurs situées avant lui sont inférieures ou égales à sa valeur et que toutes celles situées après lui sont supérieures ou égales.
* Les deux premières ou dernières positions ne sont pas prises comme pivots.
* Pour éviter de comparer chaque élément avec tout le tableau, on prépare deux tableaux auxiliaires : un pour les maximums à gauche et un autre pour les minimums à droite.
* Il suffit ensuite de vérifier ces deux conditions pour chaque position.
* Grâce à cette méthode, l'algorithme fonctionne en **O(n)** au lieu de **O(n²)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 041328.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 041341.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 041353.png" />

# Exercice 3 — Construction d’une matrice en spirale

* L’objectif est de remplir une matrice carrée avec les nombres de `1` jusqu’à `n²` en formant une spirale.
* Le remplissage commence en haut à gauche et suit quatre directions : droite, bas, gauche puis haut.
* Quatre variables permettent de connaître les limites de la partie encore vide : `top`, `bottom`, `left` et `right`.
* Après avoir rempli un côté, sa limite est déplacée vers l’intérieur afin d’éviter de remplir une case déjà utilisée.
* Le même processus est répété jusqu’à ce que toutes les cases soient remplies.
* Chaque case est visitée une seule fois, donc la complexité est **O(n²)** pour une matrice `n × n`.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 042424.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 042507.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 042525.png" />

# Exercice 4 — Plus grand rectangle composé de 1

* On travaille sur une matrice contenant uniquement des `0` et des `1` et on cherche le rectangle de `1` ayant la plus grande surface.
* Pour chaque ligne, on construit un histogramme représentant le nombre de `1` consécutifs présents verticalement dans chaque colonne.
* Cet histogramme permet de transformer le problème de la matrice en problème de plus grand rectangle dans un histogramme.
* Une pile est utilisée pour déterminer efficacement la largeur de chaque rectangle possible.
* On répète le calcul pour toutes les lignes et on conserve le rectangle ayant la plus grande surface.
* Cette technique permet d'obtenir une solution efficace en **O(R × C)** pour une matrice de `R` lignes et `C` colonnes.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 042942.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 042942.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043028.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043047.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043112.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043122.png" />

# Exercice 5 — Vérification d’une permutation circulaire

* On cherche à savoir si un tableau représente une rotation de la suite `1, 2, 3, ..., n`.
* La première étape consiste à vérifier que chaque nombre de `1` à `n` apparaît exactement une fois.
* On repère ensuite la position du nombre `1`, qui indique le début de la suite circulaire.
* À partir de cette position, on parcourt le tableau en revenant au début lorsqu’on atteint la fin.
* Les valeurs rencontrées doivent respecter l’ordre `1, 2, 3, ..., n`.
* L’utilisation de `(position + k) % n` permet de gérer facilement le passage de la dernière case vers la première.
* L'algorithme possède une complexité de **O(n)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043925.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 043948.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 044005.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 044019.png" />

# Exercice 6 — Sous-tableau de somme maximale (Kadane)

* Contrairement à la LIS, ici les éléments sélectionnés doivent être **consécutifs**.
* L'objectif est de trouver le sous-tableau dont la somme est la plus grande possible.
* On conserve deux informations : la meilleure somme qui se termine à la position courante et la meilleure somme obtenue jusqu'à présent.
* À chaque nouvel élément, on choisit entre continuer le sous-tableau actuel ou recommencer avec cet élément.
* Si continuer produit une moins bonne somme, on repart à partir de l'élément courant.
* Cette méthode permet de parcourir le tableau une seule fois.
* La complexité est donc **O(n)** avec seulement quelques variables supplémentaires.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 044639.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 044654.png" />


# Exercice 7 — Élément majoritaire

* Un élément majoritaire est une valeur qui apparaît **strictement plus de la moitié** du nombre total d'éléments.
* L'algorithme de Boyer-Moore utilise un candidat et un compteur pour rechercher efficacement cette valeur.
* Lorsque le compteur devient nul, l'élément suivant devient le nouveau candidat.
* Une valeur identique au candidat augmente le compteur, tandis qu'une valeur différente le diminue.
* Le candidat obtenu à la fin n'est pas automatiquement majoritaire : il faut effectuer un deuxième parcours pour compter réellement ses occurrences.
* Si son nombre d'apparitions dépasse `n / 2`, il est bien majoritaire.
* Cette méthode fonctionne en **O(n)** avec une utilisation de mémoire supplémentaire **O(1)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 045201.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 045220.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 045233.png" />


# Exercice 8 — Recherche des nombres absents

* On considère un tableau dont les valeurs devraient appartenir à l'ensemble `1` à `n`, mais certains nombres peuvent manquer et d'autres peuvent apparaître plusieurs fois.
* On utilise un tableau de booléens pour enregistrer les nombres déjà rencontrés.
* Lorsqu'une valeur `x` est trouvée, on marque la case correspondante comme présente.
* Après avoir parcouru le tableau, on examine les nombres de `1` à `n`.
* Chaque valeur qui n'a pas été marquée correspond à un nombre absent.
* Les doublons ne posent pas de problème, car un nombre reste simplement marqué comme présent.
* La méthode nécessite deux parcours et fonctionne en **O(n)**, avec **O(n)** mémoire supplémentaire.

# Exercice 9 — Différence entre les deux diagonales

* On travaille avec une matrice carrée et on calcule séparément les sommes de ses deux diagonales.
* La diagonale principale est formée par les éléments `m[i][i]`.
* La diagonale secondaire utilise les éléments `m[i][n - 1 - i]`.
* Un seul parcours des lignes suffit pour récupérer les éléments correspondants des deux diagonales.
* Après avoir obtenu les deux sommes, on calcule leur différence puis sa valeur absolue avec `Math.abs()`.
* Le résultat représente l'écart entre les deux diagonales.
* Comme seuls les éléments des diagonales sont parcourus, la complexité est **O(n)**.

# Exercice 10 — Vérification d’un carré magique 3×3

* Le programme doit déterminer si une matrice `3 × 3` possède la propriété d'un carré magique.
* Pour cela, on prend la somme de la première ligne comme valeur de référence.
* Les deux autres lignes sont ensuite comparées à cette somme.
* On vérifie de la même manière les trois colonnes.
* Enfin, les deux diagonales doivent également avoir exactement la même somme.
* Dès qu'une somme est différente de la référence, la matrice peut être déclarée non magique.
* Si toutes les vérifications sont réussies, la fonction retourne `true` et la matrice est considérée comme magique.
* Dans cet exercice, on vérifie uniquement l'égalité des sommes ; on n'impose pas nécessairement la présence des nombres `1` à `9` sans répétition.
