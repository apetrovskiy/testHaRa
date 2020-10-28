import org.scalatest.flatspec.AnyFlatSpec

class SetSpec extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

  it should "return ..." in {
    assert(1 == Solution0002.hourglassSum(Array(Array(1,2,3))))
  }
}
