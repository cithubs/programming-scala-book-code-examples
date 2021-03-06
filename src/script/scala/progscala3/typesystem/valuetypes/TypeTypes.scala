// src/script/scala/progscala3/typesystem/valuetypes/TypeTypes.scala
import progscala3.typesystem.valuetypes._

val s11 = new Service1
val s12 = new Service1

val l1: Logger = s11.logger                      // Okay
val l2: Logger = s12.logger                      // Okay

val l11: s11.logger.type = s11.logger            // Okay
val l13: s12.logger.type = s11.logger            // ERROR
val l12: s11.logger.type = s12.logger            // ERROR
