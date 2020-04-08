// https://play.kotlinlang.org/koans/Introduction/Named%20arguments/Task.kt

fun joinOptions(options: Collection<String>) = options.joinToString(
    separator = ", ",
    prefix = "[",
    postfix = "]"
)
