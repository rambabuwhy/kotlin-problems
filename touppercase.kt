/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(args: Array<String>) {
    val str = args.joinToString(separator = "_"){s: String -> s.uppercase()}
    println(str)
}
