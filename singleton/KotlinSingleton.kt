package dev.radis.kotlindesignpatterns.patterns.singleton

object MySingleClass {
    const val someValue: Int = 1001

    fun customDoubleString(input: String): String {
        return "$input [|] $input"
    }
}

class KotlinUsage {
    val thisValue = MySingleClass.someValue
    // output -> 1001

    val thisStringValue = MySingleClass.customDoubleString(input = "myString")
    // output -> myString [|] myString
}