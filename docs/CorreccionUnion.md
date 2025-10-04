# Informe de corrección función `union()`


## Argumentación de corrección

Sea $f$ la función de unión de dos conjuntos difusos $S_1$ y $S_2$ que representa el valor máximo en un punto $x$ de cada uno de estos mismos.
Definida en Scala así:

```scala
 def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
  x => math.max(cd1(x), cd2(x))
 }
 ```


### Definición matemática

$$
f_{S_1 \cup S_2} = \mathrm{max}(f_{S_1}, f_{S_2})
$$


### Demostración

Demostrar que, para cada $x$ la función $union$ devuelve una expresión que depende solo de $cd_1(x)$ y $cd_2(x)$ ya que no existe dependencias
ni llamadas recursivas.

$\forall x\in \mathbb{Z} \to [0,1]:\;\mathrm{union}(cd_1, cd_2)(x) = \mathrm{max}(cd_1(x), cd_2(x))$


**Para $x = 0$ : cumple $\mathrm{union}(cd_1, cd_2)(0) = \mathrm{max}(cd_1(0), cd_2(0))$**


**Hipotesis inductiva:**

$k \ge 0$ se cumple, $\mathrm{union}(cd_1, cd_2)(k) = \mathrm{max}(cd_1(k), cd_2(k))$

**Consideremos $k + 1$ : se cumple que, $\mathrm{union}(cd_1, cd_2)(k+1) = \mathrm{max}(cd_1(k+1), cd_2(k+1))$**


**Conclusión: La igualdad se cumple $\forall x\in \mathbb{Z} \to [0,1]$**


### Corrección

* Entrada: conjuntos difusos $cd_1$ y $cd_2$, funciones de tipo `Int => Double`


* Salida: $\mathbb{Z} \to [0,1]$


* Invariante: $\mathrm{I} = max(cd_1(x), cd_2(x))$, en todo momento se cumple que $\mathrm{I}$ es el máximo entre $cd_1$ y $cd_2$


* Estados: representado por la tupla: $(x,cd_1(x), cd_2(x), \mathrm{I}))$


* Estado inicial: $ S_0 = (x)$


* Estado final: $ S_f = (x, cd_1(x), cd_2(x), \mathrm{I})$


* Transformación de estados: aunque no hay bucle, se puede describir como:

  1. Calcular $cd_1(x)$
  2. Calcular $cd_2(x)$
  3. Calcular $max(cd_1(x), cd_2(x))$

    
**Conclusión: Después de aplicar la tercera transformación, se obtiene $\mathrm{max} = (cd_1(x), cd_2(x))$, dado que las transformaciiones
son directas y exactas, no hay recursión ni bucle, se conserva la invariante $\mathrm{I}$ entonces la salida siempre será el máximo de dos valores, un entero entre 0 y 1.**

