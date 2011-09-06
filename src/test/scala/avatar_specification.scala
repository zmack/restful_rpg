package test.scala
import org.specs2.mutable._
import org.specs2.specification._
import com.andascarygoat.restful_rpg.Avatar

object AvatarSpecification extends Specification {
  "An avatar" should {
    "Not be dead by default" in new avatar {
      avatar.isDead should beFalse
    }

    "Have its hp at full value by default" in new avatar {
      avatar.hitPoints must be equalTo(20)
    }

    "Have its hp decreased after taking damage" in new avatar {
      avatar.takeDamage(10)
      avatar.hitPoints must be equalTo(10)
    }

    "Have a base damage" in new avatar {
      avatar.baseDamage must be equalTo(10)
    }

    "Have a name" in new avatar {
      avatar.name must be equalTo("Superbul")
    }
  }
}

trait avatar extends Scope {
  val avatar = new Avatar(
    Map(
      'base_damage -> 10
    ),
    20
  )
}


// vim: set ts=4 sw=4 et:
