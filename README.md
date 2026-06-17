# 🎵 Java Music Shop - OOP Demonstration Project

A Java-based Object-Oriented Programming (OOP) project that simulates a Music Shop by modeling different musical instruments and their behaviors. This project demonstrates core OOP principles such as **Abstraction, Encapsulation, Inheritance, Polymorphism, and Interfaces** through a real-world example.

---

## 📌 Project Overview

The Music Shop application manages different musical instruments and their functionalities. Each instrument can perform actions such as playing, tuning, cleaning, inspecting, and adjusting pitch based on its capabilities.

The project is designed to strengthen understanding of Java OOP concepts through practical implementation.

---

## 🚀 Features

* 🎸 Create and manage different musical instruments
* 🎹 Support for Guitar and Piano instruments
* 🎵 Play instruments using polymorphism
* 🔧 Tune instruments through interfaces
* 🧹 Clean and inspect maintainable instruments
* 🎚️ Adjust instrument pitch dynamically
* 📋 Display detailed instrument information

---

## 🏗️ Object-Oriented Concepts Implemented

### 1. Abstraction

Implemented using the abstract `Instrument` class.

```java
abstract class Instrument {
    abstract String play();
}
```

### 2. Encapsulation

Private fields with controlled access through getters.

```java
private String name;
```

### 3. Inheritance

`StringedInstrument` inherits from `Instrument`.

```java
class StringedInstrument extends Instrument
```

### 4. Polymorphism

Using an array of `Instrument` references.

```java
Instrument[] instruments = new Instrument[3];
```

### 5. Interfaces

Implemented using:

* `Tunable`
* `Maintainable`

```java
class Guitar extends StringedInstrument
        implements Tunable, Maintainable
```

---

## 📂 Project Structure

```text
MusicShop
│
├── Instrument (Abstract Class)
│
├── Tunable (Interface)
├── Maintainable (Interface)
│
├── StringedInstrument
│    └── Guitar
│
├── Piano
│
└── MusicShop (Main Class)
```

---

## 🎼 Supported Instruments

### 🎸 Guitar

Features:

* Play guitar
* Tune guitar
* Adjust pitch
* Clean instrument
* Inspect instrument

### 🎹 Piano

Features:

* Play piano
* Tune piano
* Adjust pitch
* Clean piano
* Inspect piano

---

## 💻 Sample Output

```text
Playing the guitar of type electric with 6 strings

Instrument: Martin
Year of the instrument: 2020
Number of Strings: 6
Type: electric

Working with Martin
Tuning the guitar electric
Increasing the pitch of the guitar
Cleaning the guitar electric
Inspecting the guitar electric
=================================
```

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming
* Interfaces
* Inheritance
* Polymorphism
* Abstraction
* Encapsulation

---

## 🎯 Learning Outcomes

This project helped in understanding:

* Designing abstract classes
* Implementing multiple interfaces
* Constructor chaining using `super()`
* Method overriding
* Runtime polymorphism
* Type checking with `instanceof`
* Real-world object modeling

---

## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/your-username/java-music-shop-oop.git
```

### Navigate to Project

```bash
cd java-music-shop-oop
```

### Compile

```bash
javac MusicShop.java
```

### Run

```bash
java MusicShop
```

---

## 📚 Future Enhancements

* Add Drum instruments
* Add Violin instruments
* Store instruments using ArrayList
* Add user interaction using Scanner
* Implement inventory management
* Add file handling for persistent storage
* Create a GUI version using Java Swing or JavaFX

---

## 👨‍💻 Author

**Codex**

Computer Science Student | Java Developer | Spring Boot Learner

Passionate about building scalable software solutions and mastering backend development with Java technologies.

---

⭐ If you found this project useful, consider giving it a star!
