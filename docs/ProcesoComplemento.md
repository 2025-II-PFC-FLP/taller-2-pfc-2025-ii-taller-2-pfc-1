# Informe de proceso Algoritmo para definir si un número es grande
## Definición del Algoritmo
```Scala
 def complemento(c: ConjDifuso): ConjDifuso = {
  x => 1.0 - c(x)
}
```
* sea el tipo ConjDifuso una función que recibe un entero y retorna un valor real.
* la función de alto orden `complemento` retorna otra función que se define de forma anonima y representa en el concepto de
conjuntos difusos, el complemento de un valor para llegar a cumplir a cabalidad con la carácteristica definida. recibe una
función como parametro.
    * `c`: es la función que se redefine en la función anónima restandole 1 para conoce el complemento del numero x a evaluar
    dentro del conjunto difuso.



## Llamados de pila
Ejemplo:
```Scala
val complementoConjDifuso = complemento(grande(2,2))
```
### Paso 1: Llamada con parámetro

```Scala
complementoConjDifuso(10)
```


## Ejemplo de uso

```Scala
val conjDifuso = grande(2,2)
println(conjDifuso(10))  // 0.6944444444
```



## Diagrama de llamados

```mermaid


```


