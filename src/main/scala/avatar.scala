package com.andascarygoat.restful_rpg

import scala.collection.immutable.Map

class Avatar(val data:Map[Symbol,Int], val totalHitPoints:Int)
  extends Entity {

  var hitPoints:Int = totalHitPoints

  val baseDamage:Int = data('base_damage)
  var name:String = "Superbul"

  def isDead:Boolean = hitPoints == 0

}
