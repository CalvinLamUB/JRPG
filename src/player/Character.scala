package player

abstract class Character(cAttack: Int, cDefense: Int, cmAttack: Int, cmDefense: Int, cmaxHealth: Int, cMana: Int) {
  var attack = cAttack
  var defense = cDefense
  var mAttack = cmAttack
  var mDefense = cmDefense
  var maxHealth = cmaxHealth
  var mana = cMana
  var currentHP = maxHealth
  var exp = 0
  var level = 1
  def currentHealth(currentHealth: Int): Unit={
    currentHP += currentHealth
  }
  def takeDamage(damage: Int): Int={
    currentHealth(-damage)
    currentHP
  }
  def getHealth(): Int={
    maxHealth
  }
  def getAttack(): Int ={
    attack
  }
  def getDefense(): Int={
    defense
  }
  def getMAttack(): Int={
    mAttack
  }
  def getMDefense(): Int={
    mDefense
  }
  def getMana(): Int={
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
  def isAttackingAD(defender: Character): Unit ={
    defender.takeDamage(this.getAttack()-defender.getDefense())
    println(defender.currentHP)
    println("Alive? " + isAlive())
  }
  def isAttackingMD(defender: Character): Unit={

    if(this.getMana() ==0) {}
    else{
      defender.takeDamage(this.getMAttack()-defender.getMDefense())
      println(defender.currentHP)
      println("Alive? " + isAlive())
    }
  }
  def levelUp(expEarned: Int): Unit = {
    var levelBar = (Math.pow(2,getLevel()-1)*100).toInt
    println("Exp to " + levelBar)
    var totalExp = expEarned+getExp()
    while(totalExp >= levelBar){
      totalExp -= levelBar
      level += 1
      println("Level Up.")
      this.attack += 5
      defense += 5
      mAttack += 5
      mDefense += 5
      maxHealth += 100
      mana += 100
      println("Attack " + getAttack() + "Defense " + getDefense() + "MAttack " + getMAttack() + "MDefense "+ getMDefense() + "Health " + getHealth() + "Mana " + getMana())
      levelBar = (Math.pow(2,getLevel()-1)*100).toInt
    }
    exp = totalExp
    println(exp + "/" + levelBar)
  }
  def getLevel(): Int ={
    level
  }
  def getExp(): Int={
    exp
  }
  def battleOptions(): List[String]
  def takeAction(str: String, char: Character): Unit
}
