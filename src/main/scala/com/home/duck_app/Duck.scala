package com.home.duck_app

trait Duck {

  val flyBehaviour: FlyBehaviour

  def swim: Unit = println("All ducks can float!")

  def performFly(): Unit = flyBehaviour.fly

}
