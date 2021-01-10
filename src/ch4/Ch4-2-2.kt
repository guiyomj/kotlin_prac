package ch4

fun main() {
    noParam { "hello" }

    oneParam { a -> "hello $a" }
    oneParam { "hello $it" }  // 파라미터가 1개일 경우 it으로 대체 가능

    moreParam { a,b -> "hello $a, $b" }  // 파라미터가 2개 이상일 경우 생략 불가
    moreParam { _,b -> "hello $b" }  // 언더바(_) 사용시 매개변수 생략 가능

    withArgs("Arg1", "Arg2", {a,b -> "Hello World! $a $b"})
    withArgs("Arg1", "Arg2") {a,b -> "Hello World! $a $b"}  // 마지막 인자가 람다식일 경우 소괄호 바깥으로 분리 가능

    twoLambda( {a,b -> "First $a $b"}, {"Second $it"} )
    twoLambda( {a,b -> "First $a $b"} ) {"Second $it"}  // 람다식 인자가 2개 이상일 경우 마지막 람다식만 소괄호 바깥으로 분리 가능
}

fun noParam(out:() -> String)  = println(out())  // 파라미터 0개

fun oneParam(out:(String) -> String)  = println(out("OneParam"))  // 파라미터 1개

fun moreParam(out:(String, String) -> String)  = println(out("OneParam","TwoParam"))  // 파라미터 2개 이상

fun withArgs(a:String, b:String, out:(String,String) -> String) {
    println(out(a,b))
}

fun twoLambda(first:(String,String) -> String, second:(String) -> String) {
    println(first("OneParam","TwoParam"))
    println(second("OneParam"))
}