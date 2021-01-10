package ch4

fun sum(a:Int, b:Int) = a+b

fun mul(a:Int, b:Int):Int {
    return a*b
}

fun Func(a:Int, b:Int) = sum(a,b)

fun highOrder(sum: (Int, Int) -> Int, a:Int, b:Int):Int {
    return sum(a,b)
}

fun main() {
    val result = sum(10,10)
    val result2 = mul(sum(10,5),10)
    val result3 = Func(2,3)
    val result4 = highOrder({ x,y -> x+y }, 10, 20)

    println("result: $result, result2: $result2, result3: $result3, result4: $result4")
}