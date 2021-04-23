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

  it should "return the maximum hourglass sum" in {
    assert(28 == Solution0002.hourglassSum(Array(
      Array(-9,-9,-9,1,1,1), 
      Array(0,-9,0,4,3,2), 
      Array(-9,-9,-9,1,2,3), 
      Array(0,0,8,6,6,0), 
      Array(0,0,0,-2,0,0), 
      Array(0,0,1,2,4,0)
      )))
  }
}
