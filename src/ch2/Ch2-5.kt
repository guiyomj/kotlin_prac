package ch2

fun main() {
    // ===: 값과 참조 주소를 비교, null 가능 변수와 not-null 변수는 false -> null 가능 변수는 객체로 취급
    val a:Int = 128
    val b = a
    val c:Int? = a
    val d:Int? = a
    val e:Int? = c

    println(c == d)  // true
    println(c === d) // false
    println(c === e) // true
    // 코틀린에서는 참조형으로 선언한 변수의 값이 -128~127 사이에 있으면 캐시에 값을 저장 -> not-null 변수 === nullable 변수: true

    // Number: 스마트 캐스트가 가능한 숫자 변수형
    var test:Number = 12.2  // Float형으로 캐스트
    test = 12  // Int형으로 캐스트

    // is 키워드: 자료형 검사
    if (test is Int) println(test)
    else if (test !is Int) println("Mot a Int")

    // Any: 자료형이 정해지지 않은 경우, 언제든 필요한 자료형으로 스마트 캐스팅
    var test2:Any = 1
    test2 = "cute dyong"
    println("test2: $test2, type: ${test2.javaClass}")
}