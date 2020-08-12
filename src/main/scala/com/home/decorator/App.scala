package com.home.decorator

object App {

  def main(args: Array[String]): Unit = {
    val espresso = Espresso()
    val caramelEspresso = Caramel(espresso)

    println(caramelEspresso.cost())
    println(caramelEspresso.description)
  }
}
