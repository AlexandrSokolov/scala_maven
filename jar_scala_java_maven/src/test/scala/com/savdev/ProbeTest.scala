package com.savdev

import org.junit.{Assert, Test}

class ProbeTest {

  val exprected = "Hello, New World!"
  val p = new Probe


  //JUnit-style assertions
  @Test def verifyTouchdownJUnit: Unit = {
    Assert.assertEquals(exprected, p.touchdown)
  }

  // Uses ScalaTest assertions
  @Test def verifyTouchdownScala = {
    assert(p.touchdown == exprected)
  }
}
