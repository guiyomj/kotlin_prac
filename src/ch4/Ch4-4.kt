package ch4

// 함수의 범위: 최상위 함수, 지역 함수
fun a() = b()  // 최상위 함수이므로 선언 가능
fun b() = println("b")

var global = 10

fun c() {
    //fun d() = e()  // 오류(지역함수이므로)
    fun e() = println("e")
}

fun main() {
    a()
    //e()  // 지역함수이므로 c 내에서만 사용 가능

    fun localFunc1() {
        println("localFunc1")
    }

    localFunc1()

    global = 15
    val local1 = 15
    println("global = $global")
    userFunc()
    println("final - global = $global, local1 = $local1")
}

fun userFunc() {
    global = 20
    val local1 = 20
    println("userFunc - global = $global, local1 = $local1")
}

// 전역 변수: 메모리에 유지
// 지역 변수: 스택 메모리에 유지(함수 정보도 스택 메모리에 유지되며 프레임 정보라고 부름)

fun more(out: (String) -> String) {
    println(out("Hello"))
}