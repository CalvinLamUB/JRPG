package authenticationSystem

import akka.actor.Actor
import play.api.libs.json
import play.api.libs.json.{JsValue, Json}

class Account extends Actor{
  def receive: Receive ={
    case r: Register => if(r.username.equals("")) {
      sender() ! println("Username is blank")
    }
    else {
      if (r.password.length() < 5) {
        sender() ! println("Password does not meet criteria (length is less than 5)")
      }
      else if (!(r.password.contains("~") || r.password.contains("`") || r.password.contains("!") || r.password.contains("@") || r.password.contains("#") || r.password.contains("$") || r.password.contains("%") || r.password.contains("^") || r.password.contains("&") || r.password.contains("*") || r.password.contains("(") || r.password.contains(")") || r.password.contains("_") || r.password.contains("-"))) {
        sender() ! println("Password does not meet criteria (missing a special characters: ~`!@#$%^&*()_-)")
      }
      else if (!(r.password.contains("0") || r.password.contains("1") || r.password.contains("2") || r.password.contains("3") || r.password.contains("4") || r.password.contains("5") || r.password.contains("6") || r.password.contains("7") || r.password.contains("8") || r.password.contains("9"))) {
        sender() ! println("Password does not meet criteria (missing a numbers: 0123456789)")
      }
      else {
        if(r.username.equals("")){
          sender() ! println("Already exist")
        }
        else {
          sender() ! println("Account created")
        }
      }
    }

    case l: Login => if(l.username.equals("")){
      sender() ! println("Username is blank")
    }
    else if(!(l.username.equals("name"))){
      sender() ! println("Username is not registered")
    }
    else if(l.password.equals("")){
      sender() ! println("Password is blank")
    }
    else if(!(l.password.equals("asd1!"))){
      sender() ! println("Password does not match")
    }
    else{
      sender() ! println("Login successful")
    }
   //case s: SaveGame => s.username
  }
}
case class Register(username: String, password: String)
case class Login(username: String, password: String)
//case class SaveGame(username: String, partyJSON: Json)
