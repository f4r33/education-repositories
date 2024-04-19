package exercises

/**
 * Exercise: Using Async for Parallel Computation
 *
 * Objective: Utilize the 'async' coroutine builder to execute two computational tasks in parallel, and then combine their results.
 *
 * Requirements:
 *     Async Tasks: Create two async tasks that compute values. For example, one could calculate the sum of numbers and the other could multiply them.
 *     Parallel Execution: Both tasks should run in parallel and not sequentially.
 *     Result Combination: After both tasks complete, combine their results (e.g., sum their outputs) and print the combined result.
 *     Expected Output: The combined result of both computations should be displayed, demonstrating that they were executed in parallel.
 *
 * Guidance for Implementation:
 *     Coroutine Scope: Use 'runBlocking' to provide a scope for the coroutines.
 *     Defining Tasks: Define each task in an 'async' block, which should return a result.
 *     Waiting for Results: Use 'await' on both 'async' computations to retrieve their results once they are complete.
 *     Computation Examples: Consider simple computations like calculating the factorial of a number or summing a list of numbers to keep the focus on learning 'async'.
 */
