package taller

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ConjuntosDifusosTest extends AnyFunSuiteLike {
  val conjuntosDifusos = new ConjuntosDifusos()

  test("testPertenece") {
    val conjDif1 = conjuntosDifusos.grande(5, 2)
    assert(conjuntosDifusos.pertenece(1001, conjDif1) > 0.99)
    assert(conjuntosDifusos.pertenece(900, conjDif1) > 0.98)
    assert(conjuntosDifusos.pertenece(5, conjDif1) >= 0.25)
    assert(conjuntosDifusos.pertenece(20, conjDif1) > 0.5)
    assert(conjuntosDifusos.pertenece(-1001, conjDif1) == 0)
  }

  test("testComplemento") {
    val conjDifComplemento1 = conjuntosDifusos.complemento(conjuntosDifusos.grande(5, 2))

    assert(conjuntosDifusos.pertenece(1001, conjDifComplemento1) < 0.01)
    assert(conjuntosDifusos.pertenece(900, conjDifComplemento1) < 0.98)
    assert(conjuntosDifusos.pertenece(5, conjDifComplemento1) <= 0.75)
    assert(conjuntosDifusos.pertenece(20, conjDifComplemento1) < 0.5)
    assert(conjuntosDifusos.pertenece(-1001, conjDifComplemento1) == 1)
  }


  test("testUnion") {

  }

  test("testInterseccion") {

  }

  test("testInclusion") {
    val cDif1 = conjuntosDifusos.grande(5,2)
    val cDif2 = conjuntosDifusos.grande(5,2)
    val cDif3 = conjuntosDifusos.grande(2,2)
    val cDif4 = conjuntosDifusos.grande(0,1)
    val cDif5 = conjuntosDifusos.grande(20,3)
    val cDif6 = conjuntosDifusos.grande(150,10)

    assert(conjuntosDifusos.inclusion(cDif1, cDif2))
    assert(conjuntosDifusos.inclusion(cDif1, cDif3))
    assert(conjuntosDifusos.inclusion(cDif1, cDif4))
    assert(!conjuntosDifusos.inclusion(cDif4,cDif1))
    assert(conjuntosDifusos.inclusion(cDif6,cDif5))
  }

  test("testIgualdad") {
    val cDif1 = conjuntosDifusos.grande(5,2)
    val cDif2 = conjuntosDifusos.grande(5,2)
    val cDif3 = conjuntosDifusos.grande(2,2)
    val cDif4 = conjuntosDifusos.grande(0,1)
    val cDif5 = conjuntosDifusos.grande(20,3)
    val cDif6 = conjuntosDifusos.grande(20,3)

    assert(conjuntosDifusos.igualdad(cDif1, cDif2))
    assert(!conjuntosDifusos.igualdad(cDif1, cDif3))
    assert(!conjuntosDifusos.igualdad(cDif1, cDif4))
    assert(!conjuntosDifusos.igualdad(cDif4,cDif1))
    assert(conjuntosDifusos.igualdad(cDif6,cDif5))
  }


}
