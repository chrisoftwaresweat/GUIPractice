# 🖼️ JAVA GUI PRACTICE

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Completed-success)
![Level](https://img.shields.io/badge/Level-Beginner%20GUI-blue)
![Type](https://img.shields.io/badge/Type-Desktop%20Application-lightgrey)
![Concept](https://img.shields.io/badge/Concept-JFrame%20%7C%20Inheritance%20%7C%20Swing-yellow)

---

## 📌 Overview

This project is one of my early Java GUI practice exercises using the Java Swing framework.

The goal of this project is to understand how graphical user interfaces are created in Java by working with:

- JFrame
- Swing components
- Window customization
- Inheritance
- Object-oriented design

The program demonstrates two approaches to creating a window:

1. Creating a JFrame directly inside the `Main` class.
2. Creating a custom frame class by extending `JFrame`.

The project ultimately uses the second approach because it is cleaner and follows better OOP practices.

---

## 🎯 My Goal

- 🧠 Learn Java Swing fundamentals
- 🖼️ Understand how JFrame works
- 🏗️ Practice class inheritance
- 📚 Improve OOP structure in GUI applications
- 🚀 Build a foundation for future Java desktop projects

---

# ✨ Features

- 🖥️ Creates a custom GUI window
- 🦖 Uses a custom application icon (`rex.jpg`)
- 🎨 Custom dark gray background
- 🔒 Fixed window size
- 📌 Custom window title
- 🚫 Disabled resizing
- ❌ Proper application exit handling
- 🏗️ Demonstrates inheritance using `extends JFrame`

---

## 🧠 Concepts Used

### 🔹 JFrame

```java
public class ExtendJFrame extends JFrame
```

Allows the class to inherit all JFrame functionality.

### 🔹 Inheritance

```java
public class ExtendJFrame extends JFrame
```

Instead of creating a JFrame object manually every time, the class becomes a customized JFrame.

### 🔹 Constructor

```java
ExtendJFrame() {
    // GUI setup
}
```

The constructor automatically configures the frame whenever an object is created.

### 🔹 Object Creation

```java
new ExtendJFrame();
```

Creates and displays the custom frame.

### 🔹 ImageIcon

```java
ImageIcon image = new ImageIcon("rex.jpg");
```

Loads a custom image to be used as the application icon.

---

## ⚙️ How It Works

1. Program starts from `Main.java`
2. A new `ExtendJFrame` object is created
3. The constructor runs automatically
4. The window is configured:
   - Size
   - Title
   - Icon
   - Background color
   - Close operation
5. The customized frame becomes visible

---

## 🖥️ Window Configuration

```java
this.setSize(550, 550);
this.setTitle("JFrame Practice");
this.setResizable(false);
this.getContentPane().setBackground(Color.DARK_GRAY);
```

Current settings:

| Property | Value |
|-----------|---------|
| Width | 550 px |
| Height | 550 px |
| Title | JFrame Practice |
| Resizable | No |
| Background | Dark Gray |
| Icon | rex.jpg |

---

## 📂 Project Structure

```text
JAVA GUI PRACTICE
│
├── Main.java
├── ExtendJFrame.java
├── rex.jpg
└── README.md
```

### Main.java

Responsible for:

- Program entry point
- Creating the custom frame object
- Demonstrating the traditional JFrame approach (commented)

### ExtendJFrame.java

Responsible for:

- Extending JFrame
- Configuring the window
- Setting the icon
- Applying custom settings

---

## 🚀 How to Run

Compile the files:

```bash
javac Main.java
javac ExtendJFrame.java
```

Run the application:

```bash
java Main
```

Make sure `rex.jpg` is located in the same directory as the compiled files.

---

## 📸 Expected Output

A desktop window with:

- Custom icon (`rex.jpg`)
- Title: **JFrame Practice**
- Dark gray background
- Fixed size of **550 × 550**
- Non-resizable window

---

## 🔄 Learning Progress

This project helped me understand:

- How Swing applications start
- How JFrame works internally
- The difference between composition and inheritance
- How constructors initialize GUI components
- Basic desktop application structure in Java

---

## 👨‍💻 Author

### Christian A. Gulfan

Aspiring Software Developer 🚀

Currently learning:

- Java Fundamentals
- Object-Oriented Programming
- Data Structures & Algorithms
- Java Swing GUI Development

---

## 💡 Insight

A GUI is simply a collection of objects working together. By extending `JFrame`, we can transform a plain window into a reusable custom component, making larger applications easier to organize and maintain.

---

## 💬 Quote

> "Every complex GUI starts with a single JFrame." 🖥️🚀
