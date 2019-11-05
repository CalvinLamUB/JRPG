package authenticationSystem

import akka.actor.Actor

class Account extends Actor{
  def receive: Receive ={
    case r: Register => if(r.username.equals("")){
      sender() ! "Already exist"
    }
    else if(r.password.length()< 5){
      sender() ! "Password does not meet criteria"
    }
    else{
      sender() ! "Account created"
    }
    case Login =>
    case SaveGame =>
  }
}

case class Register(username: String, password: String)
case class Login(username: String, password: String)
case class SaveGame(username: String, party: Json)
