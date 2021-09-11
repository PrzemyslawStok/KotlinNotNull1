fun main(){
    var i:Int = 10
    var j:Int? = 10

    i = add(2,10)?:0

    j = add(2,10)

    if(j!=null)
        i = j
    else
        i = 0

    i = add(2,10)!!
}

fun add(a: Int, b: Int):Int?{
    if(a>b)
        return null
    return a+b
}
