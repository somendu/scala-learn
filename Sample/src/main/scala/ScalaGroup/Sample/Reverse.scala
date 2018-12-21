package ScalaGroup.Sample

object Reverse {

  // Pure functional
  def reverseFunctional[ A ]( ls : List[ A ] ) : List[ A ] =
    ls.foldLeft( List[ A ]() ) { ( r, h ) ⇒ h :: r }

  def main( args : Array[ String ] ) {

    println( "Please enter numbers" )
    val first = Console.readLine().toInt
    val second = readLine().toInt
    val third = readLine().toInt
    val fourth = readLine().toInt
    val fifth = readLine().toInt

    val listInteger = List( first, second, third, fourth, fifth )

    println( "Reverse of List = " + listInteger.reverse )
    println( "Reverse of List Function = " + reverseFunctional( listInteger ) )
  }
}
