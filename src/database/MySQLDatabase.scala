package database

import java.sql.{Connection, DriverManager}

class MySQLDatabase{

  val url = "jdbc:mysql://localhost/mysql?serverTimezone=UTC"
  val username = "root"
  val password = "your_password"
  var connection: Connection = DriverManager.getConnection(url, username, password)

  setupTable()

  def setupTable(): Unit = {
    val statement = connection.createStatement()
    statement.execute("CREATE TABLE IF NOT EXISTS players (username TEXT, gameState TEXT)")
  }
}
