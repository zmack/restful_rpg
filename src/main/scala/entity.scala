package com.andascarygoat.restful_rpg

trait Entity {
  def totalHitPoints:Int
  var hitPoints:Int

  def takeDamage(damage:Int) = {
    hitPoints -= damage
  }
}
