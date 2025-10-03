# Informe de proceso Algoritmo para el la operacion de complemento en conjuntos difusos
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
val conjDifuso = grande(5,2) //d=5 y e=2 Math.pow(n.toDouble/(n+5).toDouble,2)
val complementoConjDifuso = complemento(conjDifuso)
```
### Paso 1: Llamada mediante función de alto orden pertenece
```Scala
pertenece(10, complementoConjDifuso)
```
### Paso 2: Evaluación de pertenece
```Scala
complementoConjDifuso(10)
```
### Paso 3: Evaluación de función complementoConjDifuso
```Scala
1 - conjDifuso(10)
```
### Paso 4: Evaluación de función conjDifuso
```Scala
evalLargeNumber(10) // n>0
```
### Paso 5: Evaluación de función evalLargeNumber
```Scala
Math.pow(n.toDouble/(n+5).toDouble,2)
```
### Paso 6: Evaluación de función evalLargeNumber - se reemplaza n en el numerador
```Scala
Math.pow((10).toDouble/(n+5).toDouble,2)
```
### Paso 7: Evaluación de función evalLargeNumber - n del numerador pasa a ser double
```Scala
Math.pow(10.0/(n+5).toDouble,2)
```
### Paso 8: Evaluación de función evalLargeNumber - se reemplaza n del denominador
```Scala
Math.pow(10.0/(10+5).toDouble,2)
```
### Paso 9: Evaluación de función evalLargeNumber - se suman los valores del denominador
```Scala
Math.pow(10.0/(15).toDouble,2)
```
### Paso 10: Evaluación de función evalLargeNumber - el denominador pasa a ser double
```Scala
Math.pow(10.0/15.0,2)
```
### Paso 11: Evaluación de función evalLargeNumber - se resuelve la división
```Scala
Math.pow(0.6666666666666666,2)
```
### Paso 12: Evaluación de función evalLargeNumber - se resuelve la potencia
```Scala
0.4444444444444444
```
### Paso 13: Se devuelve el resultado a la evaluación de función complementoConjDifuso
```Scala
1 - 0.4444444444444444
```
### Paso 14: Se resuelve complementoConjDifuso y se retorna el resultado
```Scala
0.5555555555555556
```

## Ejemplo de uso

```Scala
val conjDifuso = grande(5,2)
val complementoConjDifuso = complemento(conjDifuso)
println(complementoConjDifuso(10))  // 0.5555555555555556
```



## Diagrama de llamados

```mermaid  
sequenceDiagram  
 participant Main as Main 
 participant pertenece as pertenece 
 participant complemento as complementoConjDifuso 
 participant grande as conjDifuso 
 participant eval as evalLargeNumber 
 participant Math as Math.pow  
 Main->>pertenece: pertenece(10, complementoConjDifuso)
 pertenece->>complemento: complementoConjDifuso(10) 
 complemento->>grande: conjDifuso(10) 
 grande->>eval: evalLargeNumber(10) 
 eval->>Math: Math.pow(10.0/(10+2).toDouble, 2) 
 Math-->>eval: 0.4444444444444444 
 eval-->>grande: 0.4444444444444444
 grande-->>complemento: 0.4444444444444444
 complemento-->>pertenece: 1 - 0.4444444444444444 = 0.5555555555555556
 pertenece-->>Main: 0.5555555555555556
```


