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

    assert(char1.battleOptions() == List("AttackSpell", "","",""))

    char1.levelUp(100)
    assert(char1.getHealth() == 200)
    assert(char1.getMana() == 200)
    assert(char1.getAttack() == 10)
    assert(char1.getDefense() == 10)
    assert(char1.getMAttack() == 20)
    assert(char1.getMDefense() == 20)

    assert(char1.battleOptions() == List("AttackSpell", "RegenMana","",""))

    char1.takeAction("AttackSpell",char1)
    assert(char1.getHealth() == 200)
  }
}
