class Game {
  import Player.Character
  def main() {
    val p1 = new Character(5, 5, 15, 15, 100, 200)
    val p2 = new Character(10, 1, 1, 1, 100, 100)
    p1.isAttackingAD(p2)
  }
}
