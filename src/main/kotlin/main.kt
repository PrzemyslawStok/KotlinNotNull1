class Student(val name: String, val surname: String){
    override fun toString(): String {
        return "Student(name='$name', surname='$surname')"
    }
}

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

    if(x!=null)
        y = x
    else
        y = 0.0

    y = x?:0.0

    var student0 = Student("Przemysław","Stokłosa")
    println(student0)

    for(i in 0..20){
        println(getStudent(i))
    }

    student0 = getStudent(5)?:Student("Domyślny","Student")
    println(student0)
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

fun getStudent(id: Int):Student?{
    if(id<10)
        return Student("Przemysław","Stokłosa_$id")
    else
        return null
}
