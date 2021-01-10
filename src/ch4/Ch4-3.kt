package ch4

// 익명함수: 함수 이름이 없는 것 ex) 람다함수
// 람다함수와의 차이점: return, break, continue 사용 가능

fun main() {
    val add: (Int,Int) -> Int = fun(x,y) = x+y  // 익명 함수를 사용한 add 선언
    val add2 = { x:Int, y:Int -> x+y }
    val result = add(10,2)

    shortFunc(3) {
        println("a: $it")
        //return  // return을 하면 out 이하 코드가 실행되지 않음
    }

    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// 인라인 함수: 함수가 호출되는 곳에 내용을 모두 복사, 함수의 분기 없이 처리(성능 증가) but 코드 사이즈가 늘어남
inline fun shortFunc(a:Int, crossinline out:(Int) -> Unit) {
    // noline 키워드: 일부 람다식 인라인 방지 키워드
    // crossinline 키워드: return시 일부 코드가 실행되지 않는 문제 방지

    // 여기 써 있는 모든 코드가 본문에 복사됨
    println("Hello")
    out(a)
    println("Goodbye")
}

// 확장 함수: 클래스의 멤버 함수를 외부에서 추가할 수 있음
// this: 확장 대상에 있는 source 객체, target: 매개변수 객체
fun String.getLongString(target: String):String = if (this.length > target.length) this else target