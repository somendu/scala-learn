package ScalaGroup.Sample

/**
 * @author ${user.name}
 */
object App {
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def newMethod(variable : Array[String]) = variable.foldLeft("") ((str, str1) => str + " " + str1)
   //
  //def intMethod(x: Double) = x.foldLeft("") ((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
//    println("concat arguments = " + foo(args))
    println("New Arguments Added = " + newMethod(args))
  }
}
