package com.home.duck_app

class HungarianDuck(val flyBehaviour: FlyBehaviour) extends Duck {

  def this() = {
    this(new FlyWithWings)
  }
}
