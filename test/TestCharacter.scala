import org.scalatest._
import player.Mage

class TestCharacter extends FunSuite {
  test("Character") {
    val char1 = new Mage
    assert(char1.getHealth() == 100)
    assert(char1.getMana() == 100)
    assert(char1.getAttack() == 5)
    assert(char1.getDefense() == 5)
    assert(char1.getMAttack() == 15)
    assert(char1.getMDefense() == 15)


  }
}
