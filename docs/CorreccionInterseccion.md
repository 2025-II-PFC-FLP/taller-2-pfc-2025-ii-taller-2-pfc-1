# Informe de corrección función `interseccion()`


## Argumentación de corrección

Sea $f$ la función $interseccion$ de dos conjuntos difusos $S_1$ y $S_2$ que representa el valor mínimo en un punto $x$.
Definida en Scala así:

```scala
def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
  x => math.min(cd1(x), cd2(x))
}
 ```


### Definición matemática

$$
f_{S_1 \cap S_2} = \mathrm{min}(f_{S_1}, f_{S_2})
$$


### Demostración

Demostrar que, para cada $x$ la función $interseccion$ devuelve una expresión que depende solo de $cd_1(x)$ y $cd_2(x)$ ya que no existe dependencias
ni llamadas recursivas.

$\forall x\in \mathbb{Z} \to [0,1]:\;\mathrm{interseccion}(cd_1, cd_2)(x) = \mathrm{min}(cd_1(x), cd_2(x))$


**Para $x = 0$ : cumple $\mathrm{interseccion}(cd_1, cd_2)(0) = \mathrm{interseccion}(cd_1(0), cd_2(0))$**


**Hipotesis inductiva:**

$k \ge 0$, $\mathrm{interseccion}(cd_1, cd_2)(k) = \mathrm{min}(cd_1(k), cd_2(k))$

Consideremos $k + 1$ : $\mathrm{interseccion}(cd_1, cd_2)(k+1) = \mathrm{min}(cd_1(k+1), cd_2(k+1))$


**Conclusión: se cumple $\forall x\in \mathbb{Z} \to [0,1]$**


### Corrección

* Entrada: conjuntos difusos $cd_1$ y $cd_2$, funciones de tipo `Int => Double`


* Salida: $\mathbb{Z} \to [0,1]$


* Invariante: $\mathrm{I} = min(cd_1(x), cd_2(x))$, en todo momento se cumple que $\mathrm{I}$ es el minimo entre $cd_1$ y $cd_2$


* Estados: representado por la tupla: $(x,cd_1(x), cd_2(x), \mathrm{I}))$


* Estado inicial: $ S_0 = (x)$


* Estado final: $ S_f = (x, cd_1(x), cd_2(x), \mathrm{I})$


* Transformación de estados: aunque no hay bucle, se puede describir como:

    1. Calcular $cd_1(x)$
    2. Calcular $cd_2(x)$
    3. Calcular $min(cd_1(x), cd_2(x))$


**Conclusión: Después de aplicar la tercera transformación, se obtiene $\mathrm{min} = (cd_1(x), cd_2(x))$, dado que las transformaciones
son directas y exactas y no hay recursión ni bucle, se conserva la invariante $\mathrm{I}$ entonces la salida siempre será el minimo de dos valores, un entero entre 0 y 1.**
