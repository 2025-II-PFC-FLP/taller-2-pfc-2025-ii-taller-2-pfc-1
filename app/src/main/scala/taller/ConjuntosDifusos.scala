package taller

import scala.annotation.tailrec

class ConjuntosDifusos {

 type ConjDifuso = Int => Double

 def pertenece(elem: Int, s:ConjDifuso): Double = {
  s(elem)
 }

 def grande(d: Int, e: Int): ConjDifuso = {
  def evalLargeNumber(n: Int): Double = {
   //require(e > 1, "e debe ser mayor a 1")
   if(n <= 0) 0.0
   else Math.pow(n.toDouble/(n+d).toDouble,e)
  }
  evalLargeNumber
 }

 def complemento(c: ConjDifuso): ConjDifuso = {
   x => 1.0 - c(x)
 }

 def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
  x => math.max(cd1(x), cd2(x))
 }

 def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso = {
  x => math.min(cd1(x), cd2(x))
 }

 def inclusion(cd1: ConjDifuso, cd2: ConjDifuso): Boolean = {
  @tailrec
  def evalConjuntos(acc : Int) : Boolean = {
   if(acc > 1000) true
   else if (this.pertenece(acc, cd1) <= this.pertenece(acc, cd2)) evalConjuntos(acc + 1)
   else false
  }
  evalConjuntos(0)
 }

 def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean = {
   inclusion(cd1, cd2) && inclusion(cd2, cd1)
 }
}
