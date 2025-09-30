package taller

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ConjuntosDifusosTest extends AnyFunSuiteLike {
  val conjuntosDifusos = new ConjuntosDifusos()

  test("testPertenece") {
    val conjDif1 = conjuntosDifusos.grande(5, 2)
    assert(conjDif1(1001) == 1)
    assert(conjDif1(900) > 0.98)
    assert(conjDif1(5) > 0.2)
    assert(conjDif1(20) > 0.5)
    assert(conjDif1(-1001) == 0)
  }

  test("testComplemento") {
/*    val conjDif1 = conjuntosDifusos.grande(5, 2)
    assert(conjDif1(1001) == 0)
    assert(conjDif1(900) < 0.98)
    assert(conjDif1(5) < 0.2)
    assert(conjDif1(20) < 0.5)
    assert(conjDif1(-1001) == 1)*/
  }

  test("testIgualdad") {

  }

  test("testUnion") {

  }

  test("testInterseccion") {

  }

  test("testInclusion") {

  }



}
