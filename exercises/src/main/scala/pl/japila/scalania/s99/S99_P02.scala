package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[T](ts: Seq[T]): Option[T] = ts match {
    case Nil => None
    case _ :: tail =>
      if (tail.length == 2) {
        Some(tail.head)
      } else {
        penultimate(tail)
      }
  }
}
