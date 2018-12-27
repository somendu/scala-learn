package ScalaGroup.Sample

/**
 * @author ${user.name}
 */
object App {
  def foo( x : Array[ String ] ) : String = x.foldLeft( "" )( ( a, b ) ⇒ a + b )

  def newMethod( variable : Array[ String ] ) : String = variable.foldLeft( "" ) ( ( str, str1 ) ⇒ str + " " + str1 )
  //

  def getDoubleValue( x : Double ) : Double = x.doubleValue()

  def main( args : Array[ String ] ) {
    println( "Hello World!" )
    //    println("concat arguments = " + foo(args))
    println( "New Arguments Added = " + newMethod( args ) )

    val a = readLine().toDouble;
    val b = readLine().toDouble;
    println( "value here =  " + getDoubleValue( a + b ) )

  }
}
