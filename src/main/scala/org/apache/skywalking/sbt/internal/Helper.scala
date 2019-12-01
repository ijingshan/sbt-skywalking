package org.apache.skywalking.sbt.internal

import java.io.{File, FilenameFilter}

object Helper {
  val jarFileFilter = new FilenameFilter {
    override def accept(dir: File, name: String): Boolean = {
      name.endsWith(".jar")
    }
  }
}
