package com.andascarygoat.restful_rpg

import scala.collection.immutable.Map

class Avatar(val name:String, val data:Map[Symbol,Int])
  extends Entity {

  val totalHitPoints:Int = data('hit_points)
  var hitPoints:Int = totalHitPoints

  val baseDamage:Int = data('base_damage)

  def isDead:Boolean = hitPoints == 0

}
