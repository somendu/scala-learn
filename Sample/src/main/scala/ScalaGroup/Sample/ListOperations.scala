package ScalaGroup.Sample

object ListOperations {
  // Trivial with builtins.
  def nthBuiltin[ A ]( n : Int, ls : List[ A ] ) : A =
    if ( n >= 0 ) ls( n )
    else throw new NoSuchElementException

  // Not that much harder without.
  def nthRecursive[ A ]( n : Int, ls : List[ A ] ) : A = ( n, ls ) match {
    case ( 0, h :: _ ) ⇒ h
    case ( n, _ :: tail ) ⇒ nthRecursive( n - 1, tail )
    case ( _, Nil ) ⇒ throw new NoSuchElementException
  }

  def main( args : Array[ String ] ) {

    println( "Please enter numbers" )

    val first = readLine().toInt
    val second = readLine().toInt
    val third = readLine().toInt
    val fourth = readLine().toInt
    val fifth = readLine().toInt

    val listInteger = List( first, second, third, fourth, fifth )
    var sum = 0

    listInteger.foreach( sum += _ )

    println( "Sum  here = " + sum )
    println( "Maximum here = " + listInteger.max )
    println( "Minimum here = " + listInteger.min )
    println( "Length of List = " + listInteger.length )
  }
}
