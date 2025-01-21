# Unexpected Behavior of removeIf on Mutable Collections in Kotlin

This repository demonstrates a potential issue with the `removeIf` function in Kotlin when used with mutable collections.  The `removeIf` function modifies the collection *in place*, which can lead to unexpected results if not handled carefully.

The `bug.kt` file contains code that showcases the seemingly correct usage of `removeIf` on `MutableList`, `MutableSet`, and `MutableMap`. However, concurrent modification or side effects within the `removeIf` predicate can cause problems.

The `bugSolution.kt` demonstrates a safer approach.  For instance, creating a new collection or using an iterator cautiously can help mitigate the issue.

This demonstrates a common pitfall when working with mutable collections and functions that modify them in place. Always consider the implications of in-place modification, particularly when dealing with concurrent access or side effects within the predicate.