fun collide(x: Any, y: Any) { println("Generic collide for $x,$y") }
fun collide(x: Float, y: Any) { println("Float collide1 for $x,$y") }
fun collide(x: Any, y: Float) { println("Float collide2 for $x,$y") }
fun collide(x: Float, y: Float) { println("Float collide3 for $x,$y") }

fun main(args: Array<String>) {
println("This is single dispatch:")
val a = 3
val b = 4
val c = 3.5f
collide(a, b)
collide(c, b)
collide(b, c)
collide(c, c)
}
