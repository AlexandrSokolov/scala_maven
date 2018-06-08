package com.savdev

class Probe extends Transmitter {
  override def touchdown:String = List("Hello, New World!").head
}
