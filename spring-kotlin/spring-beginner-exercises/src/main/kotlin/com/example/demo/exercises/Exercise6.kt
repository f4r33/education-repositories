package com.example.demo

/**
 * Exercise: Task Management Controller
 *
 * Objective: Create a TaskController class that will manage a list of tasks through a RESTful API. Each task will simply be a string representing the task's description. You will implement endpoints to perform CRUD operations on this list.
 * Requirements:
 *
 *     List of Tasks: Internally manage a mutable list of strings (tasks) within your controller. This list will be manipulated by the various endpoints.
 *
 *     GET Endpoint: Create an endpoint to retrieve all tasks.
 *         Path: /tasks
 *         Method: GET
 *         Expected Result: Returns the entire list of tasks in JSON format.
 *
 *     POST Endpoint: Create an endpoint to add a new task to the list.
 *         Path: /tasks
 *         Method: POST
 *         Request Body: Accept a string value representing the new task.
 *         Expected Result: Adds the new task to the list and returns the updated list in JSON format.
 *
 *     PUT Endpoint: Create an endpoint to update an existing task.
 *         Path: /tasks/{index}
 *         Method: PUT
 *         Path Variable: index - The index of the task in the list to be updated.
 *         Request Body: Accept a string value representing the updated task description.
 *         Expected Result: Updates the task at the specified index with the new value. If the index is out of bounds, return a "404 NOT FOUND" status.
 *
 *     DELETE Endpoint: Create an endpoint to delete a task.
 *         Path: /tasks/{index}
 *         Method: DELETE
 *         Path Variable: index - The index of the task in the list to be deleted.
 *         Expected Result: Removes the task at the specified index from the list. If the index is out of bounds, return a "404 NOT FOUND" status.
 *
 * Guidance for Implementation:
 *
 *     Controller Annotation: Use the @RestController annotation to define your controller class.
 *     Request Mapping: Use the @RequestMapping annotation at the class level to define the base path for all endpoints.
 *     HTTP Methods: Use the @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping annotations for your endpoints to correspond with the required HTTP methods.
 *     Path Variables: Utilize @PathVariable to capture the index parameter for PUT and DELETE operations.
 *     Request Body: Use @RequestBody to capture the new task description for POST and PUT operations.
 *     Response Handling: Consider using ResponseEntity to customize HTTP responses, especially for handling out-of-bounds indices in PUT and DELETE operations.
 */