object for_practice {

  val l = List("Peter", "Jack", "Mike")

  for (
    s <- l
  ) println(s)

  for {
    s <- l
    if (s.length < 5)
  } println(s)

  val result_for = for {
    s <- l
    s1 = s.toUpperCase()
    if (s1 != "")
  } yield (s1)

}