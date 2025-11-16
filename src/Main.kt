fun Double.pow(power: Int): Double = Math.pow(this, power.toDouble())

fun main() {
    val triangle = Triangle(Point(8.0, 0.0), Point(4.0, 1.0), Point(5.0, 3.0))

    val center = triangle.circumcenter()
    val radius = triangle.circumradius()

    println("Центр описанной окружности: (${center.x}, ${center.y})")
    println("Радиус описанной окружности: $radius")
}
