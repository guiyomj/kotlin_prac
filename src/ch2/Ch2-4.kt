package ch2

fun main() {
    // 기본적으로 변수는 not null, null이 가능한 변수를 선언하려면 자료형 뒤에 ?를 붙여서 선언해야 함
    var str:String? = null
    val len = str?.length ?: -1  // 엘비스 연산자 -> null값 처리
    println("str: $str, length: ${str?.length}")  // . 앞에 ?을 붙여 NPE 처리, !!을 붙이면 null일 리 없다고 단정하는 것
    println("length: $len")
}