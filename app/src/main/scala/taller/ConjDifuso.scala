package taller

trait ConjDifuso {
  def pertenece(elem: Int, s: ConjDifuso): Double
  def grande(d: Int, e: Int): ConjDifuso
  def complemento(c: ConjDifuso): ConjDifuso
  def union(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso
  def interseccion(cd1: ConjDifuso, cd2: ConjDifuso): ConjDifuso
  def inclusion(cd1: ConjDifuso, cd2: ConjDifuso): Boolean
  def igualdad(cd1: ConjDifuso, cd2: ConjDifuso): Boolean
}
