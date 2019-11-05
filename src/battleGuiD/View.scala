package battleGuiD

import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle}
import play.api.libs.json
import play.api.libs.json.{JsValue, Json}
import scalafx.scene.text.Text

object View extends JFXApp {
  val party1P1: Circle = new Circle {
    centerX = 50.0
    centerY = 75.0
    radius = 20.0
    fill = Color.Orange
  }
  //val t1P1: Text = new Text() {
  //  relocate(50.0,50.0)
  //  text = "p1"
  //  style = "-fx-font: 16 ariel;"
  //}
  val party1P2: Circle = new Circle {
    centerX = 50.0
    centerY = 150.0
    radius = 20.0
    fill = Color.Orange
  }
  val party1P3: Circle = new Circle {
    centerX = 50.0
    centerY = 225.0
    radius = 20.0
    fill = Color.Orange
  }
  val party1P4: Circle = new Circle {
    centerX = 50.0
    centerY = 300.0
    radius = 20.0
    fill = Color.Orange
  }
  val party2P1: Rectangle = new Rectangle {
    width = 40.0
    height = 40.0
    relocate(405.0,55.0)
    fill = Color.Purple
  }
  val party2P2: Rectangle = new Rectangle {
    width = 40.0
    height = 40.0
    relocate(405.0,130.0)
    fill = Color.Purple
  }
  val party2P3: Rectangle = new Rectangle {
    width = 40.0
    height = 40.0
    relocate(405.0,205.0)
    fill = Color.Purple
  }
  val party2P4: Rectangle = new Rectangle {
    width = 40.0
    height = 40.0
    relocate(405.0,280.0)
    fill = Color.Purple
  }
  val button1: Button = new Button {
    relocate(50.0,500.0)
    style = "-fx-font: 16 ariel;"
    text = "Attack 1"
  }
  val button2: Button = new Button {
    relocate(150.0,500.0)
    style = "-fx-font: 16 ariel;"
    text = "Attack 2"
  }
  val button3: Button = new Button {
    relocate(250.0,500.0)
    style = "-fx-font: 16 ariel;"
    text = "Attack 3"
  }
  val button4: Button = new Button {
    relocate(350.0,500.0)
    style = "-fx-font: 16 ariel;"
    text = "Attack 4"
  }

  this.stage = new PrimaryStage {
    title = "Battle Gui"
    scene = new Scene(475,550) {
      content = List(party1P1, party1P2, party1P3, party1P4, party2P1, party2P2, party2P3, party2P4, button1, button2, button3, button4)
    }
  }
  var p1: JsValue = Json.toJson({"characters":[{"name":"party1P1", "hp":50, "maxHP":70, "battleOptions": ["","","",""]}]})

  //Json.stringify(Json.toJson(jsonGameState))
  def animate(p1: String, p2: String, num: Int): Unit = {
    if(num<0){
      //p2.
    }
    if(num>0){
      //p2.
    }
    if(num==0){
      //p2.
    }
  }

}