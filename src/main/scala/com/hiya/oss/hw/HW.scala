package com.hiya.oss.hw

trait HW {
  val hwString: String
}

object HW extends HW {
  override val hwString = "Hello world!"
}

object HWApp extends App {
  println(HW.hwString)
}
