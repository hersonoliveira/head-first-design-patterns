package com.home.duck_app

trait FlyBehaviour {
  def fly: Unit
}

class FlyWithWings extends FlyBehaviour {
  override def fly: Unit = println("I'm flying!")
}

class RocketFlying extends FlyBehaviour {
  override def fly: Unit = println("Rocket flying!!!")
}
