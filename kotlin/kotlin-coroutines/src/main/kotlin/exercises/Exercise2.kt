package exercises

/**
 * Exercise: Data Fetching Simulation
 *
 * Objective: Simulate a data fetching operation using a suspend function that returns a mocked data after a delay.
 *
 * Requirements:
 *     Suspend Function: Create a suspend function named 'fetchData' that simulates data fetching with a delay of 3 seconds and returns "Data Loaded".
 *     Main Coroutine: From the main coroutine, call this suspend function and print the result.
 *     Expected Result: The main coroutine should wait for the data to be fetched before printing the result.
 *
 * Guidance for Implementation:
 *     Coroutine Scope: Utilize 'runBlocking' for the main execution block.
 *     Delay and Suspend: Implement the 'delay' inside the 'fetchData' suspend function to mimic a network request or data processing.
 *     Data Printing: Ensure the data fetching result is printed after the delay.
 */
