package com.franklinchen

import scala.annotation.meta.field

import javax.xml.bind.annotation._

// https://github.com/krasserm/eventsourcing-example/blob/part-2/src/main/scala/dev/example/eventsourcing/util/Binding.scala
object Binding {
  type xmlAnyElement      = XmlAnyElement @field
  type xmlAttribute       = XmlAttribute @field
  type xmlElement         = XmlElement @field
  type xmlElementRef      = XmlElementRef @field
  type xmlElementRefs     = XmlElementRefs @field
  type xmlElementWrapper  = XmlElementWrapper @field
  type xmlTransient       = XmlTransient @field
}
