package ch5

fun main() {
    var total = 0

    // for 문: 거꾸로 사용하고 싶을 경우엔 .. 대신 'downTo' 사용, 단계 사용은 'step'
    for (num in 1..100 step 2) total += num  // 홀수 합
    for (num in 0..99 step 2) total += num  // 짝수 합
    println("total: $total")

    // while 문
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) {
        factorial *= number
        --number
    }
    println("Factorial: $factorial")

    // do-while 문: 최소 1번 실행
    do {
        println("Enter the number: ")
        val input = readLine()!!.toInt()
        //for (i in 0..(input-1)) {
        for (i in 0 until input) {  // input-1까지 사용할 경우엔 until 사용
            for(j in 0..(input-1)) {
                print((i+j) % input + 1)
            }
            println()
        }
    } while (input != 0)
}