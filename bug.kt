```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map.entries.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three}

    val map2 = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map2.removeIf { it.key % 2 == 0 }
    println(map2) //Output: {1=one, 3=three}
}
```