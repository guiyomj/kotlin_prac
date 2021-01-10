// 변수 선언은 var(가변형)과 val(불변형)으로 나뉨
// 코틀린에서는 참조형 변수만 사용(변수=객체), 맨 앞자리 대문자 必 ↔ 자바: 기본형 변수
// 변수 or 함수명: 카멜 표기법, 클래스명 or 인터페이스: 쌍봉 낙타(파스칼 표기법)

package ch2

fun main() {
    var username:String = "mjkim"
    val count:Int = 3 // 값이 자명한 경우 자료형 생략 가능 but 자료형 지정 안하고 선언만 하는 경우 사용 불가
    username = "aaa"
    println("username: ${username}, count: $count")
}