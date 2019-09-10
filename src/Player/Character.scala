package Player

class Character(attack: Int, defense: Int, mAttack: Int, mDefense: Int, health: Int, mana: Int) {
  var currentHP = health
  def currentStats(currentHealth: Int): Int={
    currentHP += currentHealth
    currentHP
  }
  def takeDamage(damage: Int): Int={
    currentStats(-damage)
    damage
  }
  def isAlive(): Boolean={
    if(currentHP == 0){
      false
    }
    else{
      true
    }
  }
}
