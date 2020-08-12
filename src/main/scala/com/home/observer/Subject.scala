package com.home.observer

trait Subject {

  def registerObserver(observer: Observer): Unit
  def removeObserver(observer: Observer): Unit
  def notifyObservers: Unit

}
