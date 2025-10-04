# Informe de proceso función `interseccion()`


## Definición del algoritmo

La interseccion de dos conjuntos difusos $S_1$ y $S_2$ se define como:

$$
f_{S_1 \cap S_2} = min(f_{S_1}, f_{S_2})
$$


## Implementación en Scala


```scala
def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
  x => math.min(cd1(x), cd2(x))
}
```

- La función `interseccion` recibe dos conjuntos difusos de enteros y devuelve el conjunto difuso con menor grado de pertenencia.

- Cada conjunto difuso está representado como una función de tipo abstracto de dato: `type ConjDifuso = Int => Double`
  donde la entrada es un elemento que pertenece a los numeros enteros y la salida es el grado de pertenencia de ese elemento.



## Ejemplo

```scala
val cd1 = grande(5,2)
val cd2 = grande(20, 3)
val interConjDif = interseccion(cd1, cd2)

println(interConjDif(10)) // 0.037037...
```


## Explicación paso a paso

**Paso 1.** Se reciben dos conjuntos difusos `cd1` y `cd2`

**Paso 2.** Para `x = 10`: se evalua como pertenece este numero a `cd1` y `cd2`

- `cd1(10)` = $(10/15)^2$ = 0.444444...
- `cd2(10)` = $(10/30)^3$ = 0.037037...

**Paso 3.** Se aplica `min(cd1(10), cd2(10))` compara y retorna el valor menor.
Por lo tanto, el resultado de `interConjDif(10) = 0.037037...`

Es decir que, el grado de pertenencia de 10 en la intersección es 0.037037... ya que está limitado por el conjunto donde menos pertenencia tiene.



## Llamados de pila


En esta función, se hacen llamadas anidadas a las funciones puras `cd1` y `cd2`

Ejemplo:

```scala
val cd1 = conjuntosDifusos.grande(5,2)
val cd2 = conjuntosDifusos.grande(20, 3)
val interConjDif = interseccion(cd1, cd2)
```

### Paso 1: Llamada inicial

```scala
pertenece(10, interConjDif)
```

### Paso 2: Evaluación en pertenece

```scala
interConjDif(10) // s(elem)
```

### Paso 3. Evaluación de la intersección

```scala
math.min(c1(10), c2(10))
```

### Paso 4. Evaluación del primer conjunto

```scala
cd1(10) = (10 / (10 + 5))^2 = 0.44444
```

### Paso 5. Evaluación del segundo conjunto

```scala
cd2(10) = (10 / (10 + 20))^3 = 0.037037
```

### Paso 6. Calcular el mínimo

```scala
math.min(0.444444, 0.037037)
return 0.037037
```

Las llamadas son anidadas porque se necesita invocar a otras funciones dentro de su ejecución para producir un resultado.


## Diagrama de llamados de pila

```mermaid
sequenceDiagram
    participant Main as Main/Test
    participant P as pertenece(10, interConjDif)
    participant I as interConjDif(10)
    participant C1 as cd1(10)
    participant C2 as cd2(10)
    participant Min as math.min(μ1, μ2)

    Main->>P: llamada inicial
    P->>I: invoca interConjDif(10)
    I->>C1: calcula cd1(10)
    C1-->>I: retorna μ1 = 0.444...
    I->>C2: calcula cd2(10)
    C2-->>I: retorna μ2 = 0.037...
    I->>Min: aplica math.min(μ1, μ2)
    Min-->>I: retorna 0.037...
    I-->>P: retorna 0.037...
    P-->>Main: retorna 0.037...

```