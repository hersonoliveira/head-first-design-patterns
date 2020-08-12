package com.home.observer

object App {

  def main(args: Array[String]): Unit = {
    val weatherData = new WeatherData
    val ccDisplay = new CurrentConditionsDisplay

    weatherData.registerObserver(ccDisplay)
    weatherData.setMeasurements(1.0, 4.5, 6.5)
  }

}
