package euclidean_alogorithm

import kotlin.math.abs

/*
    유클리드 함수
    a, b의 최대 공약수 구하는 함수
    a>b,  if a,b == 0 return = 0
    r 이 0이 아닐 때까지 a%b 를 한다
 */

fun gcd(a: Long, b:Long) :Long {
    // a나 b가 0이면 0
    if (a*b ==0L) return 0L

    // a,b 의 절대값
    var aVar = abs(a)
    var bVar = abs(b)

    // 0이 아닐때까지 나머지 계산
    while (bVar != 0L) {
        var r : Long = aVar % bVar
        // 더 작은 값을 aVar에
        aVar = bVar
        // 나머지를 bVar에
        bVar = r
    }

    // 0이 아닌 제일 작은 값
    return aVar
}

fun gcd(a: Long, b: Long, vararg others: Long) : Long {
    var result = gcd(a, b)
    for(n in others) {
        result = gcd(n, result)
    }

    return result
}


fun main() {
    val a = -3 * 11L
    val b = 2 * 11L
    val c = -5L * 11
    val d = 7L * 11

    println(gcd(a, b, c, d))
}