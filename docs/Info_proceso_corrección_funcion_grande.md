# Informe de proceso Algoritmo para definir si un número es grande
## Definición del Algoritmo
```Scala
 def grande(d: Int, e: Int): ConjDifuso = {
  def evalLargeNumber(n: Int): Double ={
    if(n <= 0) 0.0
    else Math.pow(n.toDouble/(n+d).toDouble,e)
  }
  evalLargeNumber
}
```
* la función `grande` recive como arametros dos enteros:
    * `d`: un número pequeño mayor o igual a 1 usado para 