package com.mblinn.fp.fb

import scala.annotation.tailrec
import scala.collection.immutable.Map

object Selector {

  //TODO: change this all to use functions instead of methods.

  def selector(path: Symbol*): Map[Symbol, Any] => Option[Any] = {
    if (path.size <= 0) throw new IllegalArgumentException("path must not be empty")

    @tailrec
    def selectorHelper(path: Seq[Symbol], ds: Map[Symbol, Any]): Option[Any] =
      if (path.size == 1) {
        ds.get(path.head)
      } else {
        val currentPiece = ds.get(path.head)
        currentPiece match {
          case Some(currentMap: Map[Symbol, Any]) => selectorHelper(path.tail, currentMap)
          case None => None
          case _ => None
        }
      }

    (ds: Map[Symbol, Any]) => selectorHelper(path.toSeq, ds)
  }
}