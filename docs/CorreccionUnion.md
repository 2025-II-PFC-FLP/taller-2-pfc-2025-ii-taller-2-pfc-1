# Informe de corrección función `union()`


## 1. Argumentando la corrección de programas

Sea $f$ la función de unión de dos conjuntos difusos $f_{S_1}$ y $f_{S_2}$ representa el valor máximo en un punto $x$ de cada uno de estos mismos.


### Definición matemática

$$
f_{S_1 \cup S_2} = max(f_{S_1}, f_{S_2})
$$


### Demostración inducción matemática

Demostrar que,

$\forall x\in \mathbb{Z} \to [0,1]:\;\mathrm{union}(cd_1, cd_2)(x) = \mathrm{max}(cd_1(x), cd_2(x))$


**Hipotesis inductiva:**

$k \ge 0$ se cumple, $\mathrm{union}(cd_1, cd_2)(k) = \mathrm{max}(cd_1(k), cd_2(k))$





