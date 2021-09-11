class zadania1 {
}

fun main(){
    var i:Int = 10
    var j:Int? = 10

    i = add(2,10)
    j = add(2,10)

    j = null

}

fun add(a: Int, b: Int):Int?{
    if(a>b)
        return null
    return a+b
}
