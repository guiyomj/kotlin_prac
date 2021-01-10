package ch2

fun main() {
    var a = 10
    var b = 10
    var result1 = ++a
    var result2 = b++

    println("a = $a, b = $b")
    println("result1 = $result1, result2 = $result2")

    /* 비트 연산 ex) 3.shl(bits)
    * 1. shl(bits): shift left
    * 2. shr(bits): shift right
    * 3. ushl(bits): unsigned shift left
    * 4. ushr(bits): unsigned shift right
    * 5. and(bits), or(bits), xor(bits), inv()
    */

    val x = 4
    val y = 0b00001010 // 5
    val z = 0x0f  // 15

    println("x shl 2 -> ${x.shl(2)}")  // 16
    println("x inv -> ${x.inv()}")  // -5
}