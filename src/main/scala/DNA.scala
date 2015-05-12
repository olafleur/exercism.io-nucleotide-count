class DNA(s: String) {
  for(c <- s) {
    if(characterInvalid(c))
      throw new IllegalArgumentException
  }

  def nucleotideCounts = Map('A' -> count('A'), 'T' -> count('T'), 'C' -> count('C'), 'G' -> count('G'))

  def count(c: Char) = {
    if(characterInvalid(c))
      throw new IllegalArgumentException
    s.filter(_ == c).length
  }

  def characterInvalid(c: Char): Boolean = {
    c != 'A' && c != 'T' && c != 'C' && c != 'G'
  }
}
