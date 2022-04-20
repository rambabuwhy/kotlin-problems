/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun nullcheck(str: String?): Int{
    return str?. length ?: 0
}
fun main(args: Array<String>) {
    println(nullcheck(null))
    println(nullcheck("Rambabu"))
    println("${args.joinToString()}")

}
