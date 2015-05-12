class DNA(s: String) {
  def nucleotideCounts = Map('A' -> count('A'), 'T' -> count('T'), 'C' -> count('C'), 'G' -> count('G'))

  def count(c: Char) = s.filter(_ == c).length

}
