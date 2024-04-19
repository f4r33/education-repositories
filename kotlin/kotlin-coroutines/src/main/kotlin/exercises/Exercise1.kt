package exercises

/**
 * Exercise: Hello from Coroutine
 *
 * Objective: Write a simple program using Kotlin Coroutines to print "Hello from Coroutine" after a delay of 2 seconds,
 * followed by "Hello from Main" immediately after launching the coroutine.
 *
 * Requirements:
 *     Coroutine Launch: Use the 'launch' builder to start a new coroutine.
 *     Delay: Introduce a 2-second non-blocking delay before printing from the coroutine.
 *     Immediate Printing: Print "Hello from Main" in the main thread right after launching the coroutine.
 *     Expected Output: The main thread message should appear before the coroutine message due to the delay.
 *
 * Guidance for Implementation:
 *     Coroutine Scope: Use 'runBlocking' to run the coroutine.
 *     Delay Function: Use 'delay(timeMillis: Long)' to pause the coroutine without blocking the main thread.
 *     Launching Coroutines: Use 'launch' inside the 'runBlocking' scope to start the coroutine.
 */
