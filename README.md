# Java To-Do List

A simple console-based To-Do List application developed in Java. The application allows users to create tasks, view their task list, and mark tasks as completed through an interactive menu.

## Features

- **Add Task:** Create a new task by entering its description.
- **View Tasks:** Display all tasks with their current completion status.
- **Mark Task as Completed:** Mark an existing task as finished.
- **Interactive Menu:** Navigate through the application using numbered options.

## Technologies Used

- Java
- ArrayList
- Scanner
- Object-Oriented Programming (OOP)

## Project Structure

```text
TodoList/
├── src/
│   ├── App.java
│   └── Task.java
└── README.md
```

## How to Run

1. Make sure you have the Java Development Kit (JDK) installed.
2. Clone this repository:

   ```bash
   git clone YOUR_REPOSITORY_URL
   ```

3. Navigate to the project directory.
4. Compile the Java files:

   ```bash
   javac App.java Task.java
   ```

5. Run the application:

   ```bash
   java App
   ```

*Note: Run the compilation commands from the directory containing `App.java` and `Task.java`. If your files are inside a `src` folder or use a package declaration, adjust the commands accordingly.*

## What I Learned

- Creating classes and objects in Java.
- Using constructors and instance variables.
- Applying encapsulation with private fields.
- Managing objects with `ArrayList`.
- Using loops and conditional statements.
- Overriding the `toString()` method.
- Handling user input with `Scanner`.

## Future Improvements

- Add the ability to delete tasks.
- Validate user input and handle invalid task numbers.
- Organize the application using a separate `TodoList` class.
- Save tasks to a file so they persist between program runs.

## Author

Developed as a Java practice project to strengthen programming and object-oriented design skills.
