```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }.toMutableList() // Creates a new list
    println(newList) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it % 2 != 0 }.toMutableSet()
    println(newSet) // Output: [1, 3, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val newMap = map.filter { it.key % 2 != 0 }.toMutableMap()
    println(newMap) // Output: {1=one, 3=three}
}
```