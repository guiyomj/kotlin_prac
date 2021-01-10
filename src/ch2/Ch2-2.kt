package ch2

// 접미사(u, L, F), 접두사(0x, 0b) 등을 사용하여 변수 유추에 도움을 줌
// 언더바(_)를 사용해서 읽기 쉽게 해놔도 됨 -> 아무런 영향 X
// 자료형 유추 기본: Int, Double

fun main() {
    var num = 0.1
    for (x in 0..999) {
        num += 0.1
    }
    println("num: ${num}")  // 부동 소수점 연산의 단점: 지수부와 가수부의 제한 때문에 일어남
}