package taller

class ConjuntosDifusos {
  type ConjDifuso = Int => Double


 def pertenece(elem: Int, s:ConjDifuso): Double = {
  s(elem)
 }

 def grande(d: Int, e: Int): ConjDifuso = {
  def evalLargeNumber(n: Int): Double ={
   if(n <= 0) 0.0
   else if (n>0 && n< 1000) Math.pow(n/(n+d),e)
   else 1.0
  }
  evalLargeNumber
 }

 def complemento(c: ConjDifuso): ConjDifuso = ???

 def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = ???

 def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = ???

 def inclusion(cd1: ConjDifuso, cd2: ConjDifuso): Boolean = ???

 def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean = ???
}
