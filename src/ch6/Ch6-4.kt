package ch6

import java.io.File

// also() 함수: T를 block에 전달 -> block은 T 자체 반환(let과 달리 값을 변경하지 않음 but 내부에서 값을 변경할 수는 있음)

fun main() {
    data class Person(var name:String, var skills:String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "success"
    }

    println(person)
    println("a: $a")

    val b = person.also {
        it.skills = "Java"
        "success"  // 반환 X
    }
    println(person)
    println("b: $b")
}

fun makeDir(path:String):File {
    val result = File(path)
    result.mkdir()
    return result
}

fun makeDir2(path:String):File = path.let { File(it).also { it.mkdir() } }