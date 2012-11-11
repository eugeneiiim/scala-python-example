package emarinelli

import jep.Jep

object RunPython {
  def main(args: Array[String]) = {
    val jep = new Jep()
    jep.runScript("src/main/python/functions.py")

    {
      val i = 1
      val r1 = jep.invoke("fn1", i.asInstanceOf[AnyRef])
      println(s"fn1($i) = $r1")
    }

    {
      val s = "world"
      val r2 = jep.invoke("fn2", s.asInstanceOf[AnyRef])
      println(s"""fn1("$s") = $r2""")
    }
  }
}
