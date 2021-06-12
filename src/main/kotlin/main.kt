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

    var text0:String? = "Piotr Stokłosa"

    //if(true)
    //    text0 = null

    println("Długość tekstu $text0 wynosi: ${text0?.length}")

    text0?.let{
        val newText = it.replace("Piotr","Przemysław",true)
        println(newText)
    }

    println(parseDouble("10.0"))
    val number: Double = parseDouble("10.0")

    println("sumaWynosi ${add(null,10.0)}")

}

//Zad. 1 Proszę napisać funkcję, która pobiera ciąg znaków i
// zwraca liczbę double, która jest zdefiniowana
// jeżeli parametru nie da się odczytać zwaracamy 0

fun parseDouble(text: String?):Double{
    //val textNumber:String = "2342342334.0"
    //val number = textNumber.toDoubleOrNull()

    val number0:Double? = text?.toDoubleOrNull()

    /*
    //Metoda 1
    if(number0!=null)
        return number0
    else
        return 0.0*/

    number0?.let{
        return it
    }

    return 0.0
}

fun parseDouble1(text: String):Double{
    return text.toDoubleOrNull()?:0.0
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

fun add(x:Double?, y: Double?):Double{
    return 0.0
}
