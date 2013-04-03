package playground

class Rational(x: Int, y: Int) {
  
  def numer = x
  def denom = y

  def +(that: Rational) = 
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def unary_- = new Rational(-numer, denom)
  
  def -(that: Rational) = this + -that

  override def toString = numer + "/" + denom
  

}
