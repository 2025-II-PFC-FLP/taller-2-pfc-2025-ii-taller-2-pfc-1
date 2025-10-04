# Informe de corrección función para la inclusion en conjuntos difusos
## Definición 
Sean $A$ y $B$ dos conjuntos difusos descritos con sus respectivas funciones de pertenecia:

$f_A :\mathbb{Z}\rightarrow[0,1], \quad f_B : \mathbb{Z}\rightarrow [0,1]$

Se dice que $A$ aw incluye en $B$ cuando:

$$
A \subseteq B \iff \forall n \in \mathbb{Z}, \ f_A(n) \leq f_B(n)
$$


## Adaptación al caso discreto
Para la implementación en Scala, el universo descrito fue limitado como el conjunto de los enteros en el rango $[0,1000]$; por ello, la inclusión se expresa como:

$$
A \subseteq B \iff \forall n \in \{0,1,2,\dots,1000\}, \ f_A(n) \leq f_B(n)
$$

donde $f_A$ y $f_B$ son funciones de tipo $Int \Rightarrow Double$ que representan los conjuntos difusos.


