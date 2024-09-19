
fun fibonacci(a:Int): Int{
    if (a <= 2){
        return 1 
    }
    return 0 
}



fun media_variavel(): Double{
    val lista = listOf(3,5,6,8,9,9,1,2,)
    var total = 0.0
    for (e in lista){
        total += e
    }
    return (total / lista.size)
}

fun main(){
    print(media())
}



fun media_variavel(): Double{ 
    var lista: mutablelist<Int>
=     