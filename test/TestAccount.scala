package tests

import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import authenticationSystem._
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

import scala.concurrent.duration._

class TestAccount() extends TestKit(ActorSystem("TestValueBank"))
  with ImplicitSender
  with WordSpecLike
  with Matchers
  with BeforeAndAfterAll {
  override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }
  "A account 1" must {
    "fail username blank" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test1")
      acc ! Register("","asd1!")
    }
  }
  "A account 2" must {
    "fail password less than 5" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test2")
      acc ! Register("name","")
    }
  }
  "A account 3" must {
    "fail password no special character" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test3")
      acc ! Register("name","asdfg")
    }
  }
  "A account 4" must {
    "fail password no special character" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test4")
      acc ! Register("name","asdf1")
    }
  }
  "A account 5" must {
    "fail password no numbers" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test5")
      acc ! Register("name","asdf!")
    }
  }
  "A account 6" must {
    "register" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test6")
      acc ! Register("name","asd1!")
    }
  }
  "A account 7" must {
    "fail username blank" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test7")
      acc ! Register("name","asd1!")
      acc ! Login("","asd1!")
    }
  }
  "A account 8" must {
    "fail password blank" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test8")
      acc ! Register("name","asd1!")
      acc ! Login("name","asd1@")
    }
  }
  "A account 9" must {
    "fail username blank" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test9")
      acc ! Register("name","asd1!")
      acc ! Login("name","")
    }
  }
  "A account 10" must {
    "register and login to an account" in {
      val acc = system.actorOf(Props(classOf[Account]))
      println("test10")
      acc ! Register("name","asd1!")
      acc ! Login("name","asd1!")
    }
  }
}
