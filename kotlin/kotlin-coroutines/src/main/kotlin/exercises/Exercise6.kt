package exercises

/**
 * Exercise: Coroutine Exploration Lab
 *
 * Objective: Create a Kotlin application to experiment with various coroutine behaviors, including their creation, suspension,
 * and interaction, in order to understand how coroutines work under different conditions.
 *
 * Requirements:
 *     Basic Coroutine Launch: Launch simple coroutines that print messages to understand basic launching and execution.
 *     Delay and Suspend: Incorporate 'delay' to simulate asynchronous tasks and understand the non-blocking nature of coroutines.
 *     Coroutine Contexts: Use different coroutine contexts to launch coroutines and observe their execution behavior.
 *     Exception Handling: Introduce error handling within coroutines to understand how exceptions can be managed.
 *     Coroutine Interaction: Implement simple producer-consumer logic using coroutines to understand interaction and communication.
 *
 * Tasks to Implement:
 *     1. Basic Coroutine: Launch a coroutine that prints "Hello from Coroutine" after a delay.
 *     2. Context Switching: Launch coroutines in different contexts (e.g., Default, IO, Unconfined) and observe the thread names in logs.
 *     3. Error Handling: Launch a coroutine that throws an exception and handle it gracefully to prevent the application from crashing.
 *
 * Guidance for Implementation:
 *     Coroutine Scope: Use 'runBlocking' for the main coroutine and explore 'GlobalScope' for launching others.
 *     Delay and Suspend: Use the 'delay' function to simulate operations that take time.
 *     Contexts: Experiment with 'Dispatchers.Default', 'Dispatchers.IO', and 'Dispatchers.Unconfined'.
 *     Exception Handling: Use try-catch within coroutines and explore 'CoroutineExceptionHandler'.
 *
 * Expected Learning Outcome:
 *     Understand how coroutines execute in parallel or sequentially depending on their context and structure.
 *     Learn how coroutines handle asynchronous operations without blocking the main thread.
 *     Gain insights into how exceptions are handled within coroutines.
 */
