package emarinelli

import jep.Jep

object RunPython {
  def main(args: Array[String]) = {
    val jep = new Jep()
    jep.runScript("src/main/python/functions.py")

    {
      val i = 1
      val fn = "fn1"
      val r1 = jep.invoke(fn, i.asInstanceOf[AnyRef])
      println(s"$fn($i) = $r1")
    }

    {
      val s = "world"
      val fn = "fn2"
      val r2 = jep.invoke(fn, s.asInstanceOf[AnyRef])
      println(s"""$fn("$s") = $r2""")
    }
  }
}
