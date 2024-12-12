fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    // Safer approach for sets using toList() to copy, modify, then recreate the set
    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.toList().filter { it <= 2 }.toSet()
    println(newSet) // Output: [1, 2]
    //Or using retainAll
    val set2 = mutableSetOf<Int>(1,2,3,4,5)
    set2.retainAll {it <= 2}
    println(set2) // Output: [1, 2]    
} 