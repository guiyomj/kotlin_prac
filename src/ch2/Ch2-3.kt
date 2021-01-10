package ch2

fun main() {
    println("Byte: ${Byte.MIN_VALUE} ~ ${Byte.MAX_VALUE}")
    println("Int: ${Int.MIN_VALUE} ~ ${Int.MAX_VALUE}")
    println("Short: ${Short.MIN_VALUE} ~ ${Short.MAX_VALUE}")
    println("Long: ${Long.MIN_VALUE} ~ ${Long.MAX_VALUE}")
    println("Float: ${Float.MIN_VALUE} ~ ${Float.MAX_VALUE}")
    println("Double: ${Double.MIN_VALUE} ~ ${Double.MAX_VALUE}")

    // var로 선언된 변수는 변경 가능 but 메모리 공간(String Pool)에 선언된 문자열은 변경되지 않고 남아있음
    var str1:String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 == str2 ${str1 === str2}")
    println("str1 == str2 ${str1 === str3}")  // 같은 메모리 공간에 선언된 문자열을 참조하므로
}