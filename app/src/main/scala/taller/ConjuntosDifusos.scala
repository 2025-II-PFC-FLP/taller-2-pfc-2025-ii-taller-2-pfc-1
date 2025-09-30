package taller

class ConjuntosDifusos extends ConjDifuso {
  type ConjDifuso = Int => Double


  override def pertenece(elem: Int, s: taller.ConjDifuso): Double = ???

  override def grande(d: Int, e: Int): taller.ConjDifuso = ???

  override def complemento(c: taller.ConjDifuso): taller.ConjDifuso = ???

  override def union(cd1: taller.ConjDifuso, cd2: taller.ConjDifuso): taller.ConjDifuso = ???

  override def interseccion(cd1: taller.ConjDifuso, cd2: taller.ConjDifuso): taller.ConjDifuso = ???

  override def inclusion(cd1: taller.ConjDifuso, cd2: taller.ConjDifuso): Boolean = ???

  override def igualdad(cd1: taller.ConjDifuso, cd2: taller.ConjDifuso): Boolean = ???
}
