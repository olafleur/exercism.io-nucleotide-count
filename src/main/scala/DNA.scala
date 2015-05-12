class DNA(s: String) {
  def nucleotideCounts = Map('A' -> count('A'), 'T' -> count('T'), 'C' -> count('C'), 'G' -> count('G'))

  def count(c: Char) = {
    if(c != 'A' && c != 'T' && c != 'C' && c != 'G')
      throw new IllegalArgumentException
    s.filter(_ == c).length
  }

}
