package player

class Party(list: List[Character]) {
  val party = list
  def partyAlive(): Boolean = {
    var alive: Boolean = false
    for(character <- party){
      if(character.isAlive()){
        alive = true
      }
    }
    alive
  }
  def partyFight(party2: Party): Unit = {
    if (!this.partyAlive()) {
      for (character <- party2.party) {
        character.levelUp((this.party.length*50)/party2.party.length)
      }
    }
    if (!party2.partyAlive()) {
      for (character <- this.party) {
        character.levelUp((party2.party.length*50)/this.party.length)
      }
    }
  }
}
