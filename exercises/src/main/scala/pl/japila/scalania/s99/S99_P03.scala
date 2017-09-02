package pl.japila.scalania.s99

object S99_P03 {
  def nth[T](n: Int, ts: Seq[T]): Option[T] =
    if (n < 0 || n >= ts.length) {
      None
    } else {
      Some(ts(n))
    }
}
