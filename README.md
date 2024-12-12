# Kotlin removeIf() Behavior with Mutable Collections

This example highlights a subtle difference in the behavior of the `removeIf()` function when used with `MutableList` and `MutableSet` in Kotlin.  While both remove elements based on a predicate, the order of removal and concurrent modification might lead to unexpected results.

The code in `removeIfBug.kt` demonstrates how `removeIf()` on a `MutableList` correctly removes elements, while the same operation on a `MutableSet` can behave unexpectedly (though generally as intended for Sets).

The `removeIfSolution.kt` provides a more robust approach that can mitigate potential unexpected behaviors.