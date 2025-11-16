class Triangle(val a: Point, val b: Point, val c: Point) {

    // Функция для вычисления центра описанной окружности
    fun circumcenter(): Point {
        val d = 2 * (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y))
        val ux = ((a.x * a.x + a.y * a.y) * (b.y - c.y) + (b.x * b.x + b.y * b.y) * (c.y - a.y) + (c.x * c.x + c.y * c.y) * (a.y - b.y)) / d
        val uy = ((a.x * a.x + a.y * a.y) * (c.x - b.x) + (b.x * b.x + b.y * b.y) * (a.x - c.x) + (c.x * c.x + c.y * c.y) * (b.x - a.x)) / d
        return Point(ux, uy)
    }

    // Функция для вычисления радиуса описанной окружности
    fun circumradius(): Double {
        val center = circumcenter()
        return distance(center, a)
    }

    fun distance(p1: Point, p2: Point): Double {
        return Math.sqrt((p1.x - p2.x).pow(2) + (p1.y - p2.y).pow(2))
    }
}