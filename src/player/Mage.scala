package player

class Mage extends Character(5,5,15,15,100,100){
  override def battleOptions(): List[String] ={
    if(this.getLevel() == 1) {
      List("AttackSpell", "","","")
    }
    else if(this.getLevel() == 2){
      List("AttackSpell", "RegenMana","","")
    }
    else if(this.getLevel() == 3){
      List("AttackSpell", "RegenMana","AttackSpell2","")
    }
    else {
      List("AttackSpell", "RegenMana","AttackSpell2","FinalSpell")
    }
  }
  override def takeAction(str: String, char: Character): Unit ={
    if(str == "AttackSpell" || str == "AttackSpell2" || str == "FinalSpell"){
      this.isAttackingMD(char)
    }
    if(str == "RegenMana"){
      this.isAttackingAD(char)
    }
  }

}
