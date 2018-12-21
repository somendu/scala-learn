package ScalaGroup.Sample

object ReverseReadline {

  // Pure functional
  def reverseFunctional[ A ]( ls : List[ A ] ) : List[ A ] =
    ls.foldLeft( List[ A ]() ) { ( r, h ) ⇒ h :: r }

  def main( args : Array[ String ] ) {

    println( "Please enter numbers" )

    val first = readLine().toInt
    val second = readLine().toInt
    val third = readLine().toInt
    val fourth = readLine().toInt
    val fifth = readLine().toInt

    val listInteger = List( first, second, third, fourth, fifth )

    var max = listInteger.length

    listInteger.foreach( max = _ )
    listInteger.takeRight( max )
    if ( listInteger.length < max ) {
      max = listInteger.takeRight( max ).head
    }
    println( "max = " + max )
  }
}
