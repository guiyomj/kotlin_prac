package ch5

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'
    /*
    if (score >= 90.0) grade = 'A'
    //else if (score >= 80 && score <= 89.9) grade = 'B'
    else if (score in 80.0..89.9) grade = 'B'  // 범위 연산자 사용, 반대는 !in
    else if (score >= 70 && score <= 79.9) grade = 'C'
    */

    // when 구문: 인자가 있는 경우와 없는 경우가 있음
    /*
    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        else -> grade = 'F'
    }
     */

    when {
        score in 90.0..100.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        else -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}