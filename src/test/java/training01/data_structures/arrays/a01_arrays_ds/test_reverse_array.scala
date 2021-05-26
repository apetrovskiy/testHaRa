import org.scalatest.funsuite.AnyFunSuite

class SetSuite extends AnyFunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

  test("Should reverse an array") {
    assert(
      Array(3, 2, 1).sameElements(Solution0001.reverseArray(Array(1, 2, 3)))
    )
  }
}
