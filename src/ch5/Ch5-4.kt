package ch5

import ch4.a
import java.lang.Exception

fun main() {
    // 예외처리: try ~ catch ~ (finally)
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e:Exception) {
        println("Exception message: ${e.message}")  // 예외처리 메시지 출력
        println(e.printStackTrace())  // 예외처리가 발생한 위치 출력
    } finally {
        println("Finally")
    }
}

fun checkAmount(amount:Int) {
    if (amount < 1000) throw Exception("잔고가 ${amount}으로 1000 이하입니다.")  // 의도적인 예외 발생
}