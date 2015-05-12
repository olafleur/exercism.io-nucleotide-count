class DNA(s: String) {
  def nucleotideCounts = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> s.length)

  def count(c: Char) = s.filter(_ == c).length

}
