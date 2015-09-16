package com.franklinchen

import org.specs2._

import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

object MainSpec extends Specification {
  override def is = s2"""
    ${`marshal Customer correctly`}
  """

  val context = JAXBContext.newInstance(classOf[Customer])
  val marshaller = context.createMarshaller()

  def `marshal Customer correctly` = {
    val customer = Customer(id = 100, age = 29, name = "me")

    val writer = new java.io.StringWriter()
    marshaller.marshal(customer, writer)
    val xmlString = writer.toString

    xmlString ==== """<?xml version="1.0" encoding="UTF-8" standalone="yes"?><customer id="100"><name>me</name><age>29</age></customer>"""
  }
}
