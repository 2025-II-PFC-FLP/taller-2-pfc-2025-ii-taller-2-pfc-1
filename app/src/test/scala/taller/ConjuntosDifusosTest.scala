package taller

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ConjuntosDifusosTest extends AnyFunSuiteLike {
  val conjuntosDifusos = new ConjuntosDifusos()

  test("testPertenece") {
    val conjDif1 = conjuntosDifusos.grande(100, 10)
    assert(conjDif1(1001) == 1)
    assert(conjDif1(999) < 1)
    assert(conjDif1(400) <0.5)
    assert(conjDif1(-1) == 0)
    assert(conjDif1(-1001) == 0)
  }

  test("testIgualdad") {

  }

  test("testUnion") {

  }

  test("testInterseccion") {

  }

  test("testInclusion") {

  }

  test("testComplemento") {

  }

}
