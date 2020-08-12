package com.home.observer

trait Observer {
  def update(temperature: Double, pressure: Double, humidity: Double): Unit
}

class CurrentConditionsDisplay extends Observer with DisplayElement {

  private var temperature: Double = _
  private var pressure: Double = _
  private var humidity: Double = _

  override def update(temperature: Double, pressure: Double, humidity: Double): Unit = {
    this.temperature = temperature
    this.pressure = pressure
    this.humidity = humidity
    display()
  }

  override def display(): Unit =
    println(("Current conditions: temperature %.1f, " +
      "humidity %.1f, pressure %.1f").format(temperature, humidity, pressure))
}
