package com.example.demo.exercises

/**
 * Exercise: Advanced Task Management System
 *
 * Objective: Enhance the Task Management Controller by integrating a service layer. This system will manage tasks, where each task is an object with an ID, description, and status. Implement endpoints to perform CRUD operations and additional functionalities like filtering tasks based on status.
 *
 * Requirements:
 *
 *     Task Object:
 *         Attributes: id (UUID), description (String), status (Enum with values: PENDING, IN_PROGRESS, COMPLETED).
 *
 *     Task Service:
 *         Implement a TaskService interface with methods for CRUD operations and filtering tasks by status.
 *         Implement a TaskServiceImpl class that performs the logic for managing tasks. Use a List<Task> for storage.
 *
 *     Task Controller:
 *         Update the TaskController to use the TaskService for handling operations.
 *         Endpoints should include:
 *             Retrieve all tasks.
 *             Retrieve tasks filtered by status.
 *             Add a new task.
 *             Update an existing task.
 *             Delete a task.
 *
 *     Endpoints:
 *         GET /tasks: Returns all tasks.
 *         GET /tasks/status/{status}: Returns tasks filtered by status.
 *         POST /tasks: Adds a new task.
 *         PUT /tasks/{id}: Updates the task with the given ID.
 *         DELETE /tasks/{id}: Deletes the task with the given ID.
 *
 *     Guidance for Implementation:
 *         @RestController: Define your controller class.
 *         @Service: Annotate your service implementation to define it as a service.
 *         @RequestMapping: Use at the class level in your controller to define the base path.
 *         HTTP Methods: Use corresponding annotations (@GetMapping, @PostMapping, etc.) for endpoints.
 */