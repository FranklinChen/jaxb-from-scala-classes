package com.franklinchen

import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

object JMain {
  def main(args: Array[String]): Unit = {
    val customer = new JCustomer(100, "me", 29)

    val context = JAXBContext.newInstance(classOf[JCustomer])
    val marshaller = context.createMarshaller()

    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
    marshaller.marshal(customer, System.out)
  }
}
