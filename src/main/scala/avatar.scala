package com.andascarygoat.restful_rpg

import scala.collection.mutable.Map

class Avatar(val data:Map[Symbol,Int], val hitPoints:Int)
  extends Entity {

  val baseDamage:Int = data('base_damage)

  def isDead:Boolean = hitPoints == 0

}
