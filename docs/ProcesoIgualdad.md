# Informe de proceso función `igualdad()`


## Definición del algoritmo

Dados $S_1$ y $S_2$ dos conjuntos difusos, la definición de igualdad está dada por:

$$
S_1 = S_2 \iff S_1 \subseteq S_2 \land S_2 \subseteq S_1
$$

Es decir, el grado de pertenencia de cada elemento a $S_1$ es menor o igual al grado de pertenencia de ese mismo elemento a $S_2$ 
y a su vez, el grado de pertenencia de cada elementos a $S_2$ es menor o igual al grado de pertenencia de ese mismo elemento a $S_1$

## Implementación en Scala


```scala
def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean = {
  inclusion(cd1, cd2) && inclusion(cd2, cd1)
}
```
