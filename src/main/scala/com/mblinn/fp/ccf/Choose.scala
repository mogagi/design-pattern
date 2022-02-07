package com.mblinn.fp.ccf

/**
 * customized control flow
 *
 * @author casa
 * @since 2022/2/6 22:03
 */
object Choose {

  def choose[E](num: Int, first: () => E, second: () => E, third: () => E) =
    if (num == 1) first()
    else if (num == 2) second()
    else if (num == 3) third()

  def test[E](expression: E) = expression

  /**
   * testTwice(println("Hi")) will print only once
   */
  def testTwice[E](expression: E) = {
    expression
    expression
  }

  /**
   * print twice actually
   */
  def printTwice[E](expression: E) {
    println(expression)
    println(expression)
  }

  /**
   * execute twice actually
   */
  def testByName[E](expression: => E) = {
    expression
    expression
  }

  def simplerChoose[E](num: Int, first: => E, second: => E, third: => E) =
    if (num == 1) first
    else if (num == 2) second
    else if (num == 3) third

  def timeRun[E](toTime: => E) = {
    val start = System.currentTimeMillis
    toTime
    System.currentTimeMillis - start
  }

  def avgTime[E](times: Int, toTime: => E) = {
    val allTimes = for (_ <- Range(0, times)) yield timeRun(toTime)
    allTimes.sum / times
  }
}