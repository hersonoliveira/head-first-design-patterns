package com.home.duck_app

object App {

  def main(args: Array[String]): Unit = {
    val hungarianDuck = new HungarianDuck()

    hungarianDuck.performFly
    hungarianDuck.swim

    val duckTwo = new HungarianDuck(new RocketFlying)

    duckTwo.performFly

  }

}
