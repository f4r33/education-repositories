package exercises

/**
 * Exercise: Concurrent Tasks
 *
 * Objective: Launch multiple coroutines to perform different tasks concurrently, and understand how they execute.
 *
 * Requirements:
 *     Multiple Coroutines: Launch at least three coroutines performing different logging tasks with varying delays (e.g., 1 sec, 2 sec, 3 sec).
 *     Task Description: Each coroutine should log its start time and completion time.
 *     Synchronization: Use 'join' to wait for all coroutines to finish before the program exits.
 *     Expected Output: Observe and understand the overlapping execution of coroutines.
 *
 * Guidance for Implementation:
 *     Time Measurement: Use 'System.currentTimeMillis()' to log the time.
 *     Launch and Join: Use 'launch' for each task and 'join' to synchronize their completion.
 */
