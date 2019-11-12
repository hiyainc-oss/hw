package com.hiya.oss.hw

import org.scalatest.{FunSpec, Matchers}

class HWTests extends FunSpec with Matchers {
  describe("HW") {
    it("should have a string") {
      HW.hwString shouldBe "Hello world!"
    }
  }
}