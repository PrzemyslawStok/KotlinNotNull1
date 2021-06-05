fun main() {
    var i = 10
    var name: String? = "Przemysław"

    name = null

    var z:Double? = 0.0
    z = div(10.0,0.0)
    println(z)

    val x = getNumber("10.0")
    println(x)

    var y = 10.0
    //y = x
}

fun div(x: Double, y: Double):Double?{
    if(y==0.0){
        return null
    }
    return x/y
}

fun getNumber(textNumber: String):Double?{
    return textNumber.toDoubleOrNull()
}
