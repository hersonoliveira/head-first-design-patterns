package com.home.observer

import scala.collection.mutable.ListBuffer

/** The Observer Pattern defines a one-to-many dependency between objects so that when one
 * object changes state, all its dependents are notified and updated automatically */
class WeatherData extends Subject {

  val observers: ListBuffer[Observer] = ListBuffer[Observer]()

  private var temperature: Double = _
  private var pressure: Double = _
  private var humidity: Double = _

  def setMeasurements(temperature: Double, pressure: Double, humidity: Double): Unit = {
    this.temperature = temperature
    this.pressure = pressure
    this.humidity = humidity
    measurementsChanged
  }

  def measurementsChanged: Unit = notifyObservers

  override def registerObserver(observer: Observer): Unit = {
    observers += observer
  }

  override def removeObserver(observer: Observer): Unit = {
    val index = observers.indexOf(observer)
    observers.remove(index)
  }

  override def notifyObservers: Unit = {
    observers.foreach(_.update(temperature, pressure, humidity))
  }
}
