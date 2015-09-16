package com.franklinchen

import javax.xml.bind.annotation._

import com.franklinchen.Binding._

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
case class Customer(
  @xmlAttribute id: Int,
  @xmlElement name: String,
  @xmlElement age: Int
) {
  // For JAXB only.
  private def this() = this(0, null, 0)
}
