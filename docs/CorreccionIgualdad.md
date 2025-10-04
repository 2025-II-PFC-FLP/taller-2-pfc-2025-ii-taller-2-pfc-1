# Informe de corrección función `igualdad()`



### Definición matemática

$$
S_1 = S_2 \iff S_1 \subseteq S_2 \land S_2 \subseteq S_1
$$


### Demostración

$\mathrm{igualdad}(cd_1,cd_2) = true, \iff (cd_1 \subseteq cd_2) \land (cd_2 \subseteq cd_1)$

Dado que la inclusión difusa se definió y demostró previamente como correcta en [Correccion Inclusion](CorreccionInclusion.md).

Entonces: 

$\mathrm{igualdad}(cd_1,cd_2) = true \iff (\forall x, cd_1(x) \le  cd_2(x)) \land (\forall x, cd_2(x) \le cd_1(x))$

Se concluye que:

$\mathrm{igualdad}(cd_1,cd_2) = true \iff \forall x, cd_1(x) = cd_2(x)$


### Argumentación de corrección

* Entrada: dos conjuntos difusos $cd_1$ y $cd_2$.


* Salida: $true$ si son iguales, $false$ en otro caso.


* Estados: representado por la tupla: $(cd_1, cd_2, \mathrm{res})$


* Transformación de estados: 

$$
(cd_1, cd_2) \to \mathrm{inclusion}(cd_1,cd_2) \land \mathrm{inclusion}(cd_2,cd_1)
$$


**Conclusión: se muestra que $\forall x \le 1000$, se cumple la igualdad $cd_1(x) = cd_2(x)$.**

