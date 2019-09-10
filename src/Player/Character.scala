package Player

class Character(attack: Int, defense: Int, mAttack: Int, mDefense: Int, health: Int, mana: Int) {
  var currentHP = health
  def currentHealth(currentHealth: Int): Unit={
    currentHP += currentHealth
  }
  def takeDamage(damage: Int): Int={
    currentHealth(-damage)
    currentHP
  }
  def getAttack(): Int ={
    attack
  }
  def getDefense(): Int={
    defense
  }
  def getMAttack(): Int{
    mAttack
  }
  def getMDefense(): Int{
    mDefense
  }
  def getMana(): Int{
    mana
  }
  def isAlive(): Boolean={
    if(currentHP == 0){
      false
    }
    else{
      true
    }
  }
  def isAttackingAD(attacker: Character, defender: Character): Unit ={
    defender.takeDamage(attacker.getAttack()-defender.getDefense())
  }
  def isAttackingMD(attacker: Character, defender: Character): Unit={

    if(attacker.getMana() ==0) {}
    else{
      defender.takeDamage(attacker.getMAttack()-defender.getMDefense())
    }
  }
}
