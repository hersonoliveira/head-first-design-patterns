package com.home.decorator

case class Caramel(beverage: Beverage) extends Beverage {
  override val description: String = s"${beverage.description} with caramel"

  override def cost(): Double = beverage.cost() + 0.20
}
