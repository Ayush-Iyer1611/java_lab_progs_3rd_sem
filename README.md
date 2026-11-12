# Java Lab Programs — 3rd Semester

A collection of Java programs developed for third-semester laboratory work and practice. The repository is organised by lab so that individual exercises are easy to locate, compile, and run.

## Repository structure

```text
.
├── 1BF25CS059_AYUSH_IYER/
│   ├── Lab 1/       # 36 Java programs (Program1.java–Program36.java)
│   ├── Lab 2/       # 1 Java program
│   ├── Lab 3/       # 10 Java demonstrations
│   └── Lab4/        # 6 Java programs
├── Hello.java       # Standalone example
├── area.java        # Circle-area example
├── .gitignore
└── README.md
```

## Lab index

| Lab | Files | Count |
| --- | --- | ---: |
| [Lab 1](./1BF25CS059_AYUSH_IYER/Lab%201/) | `Program1.java` – `Program36.java` | 36 |
| [Lab 2](./1BF25CS059_AYUSH_IYER/Lab%202/) | `Program1.java` | 1 |
| [Lab 3](./1BF25CS059_AYUSH_IYER/Lab%203/) | `BookDemo.java`, `CommandLineDemo.java`, `ConstructorDemo.java`, `GarbageDemo.java`, `Main.java`, `PrivateDemo.java`, `ReturnObjectDemo.java`, `StackDemo.java`, `StaticDemo.java`, `ThisDemo.java` | 10 |
| [Lab 4](./1BF25CS059_AYUSH_IYER/Lab4/) | `Program1.java` – `Program6.java` | 6 |

**Total: 53 lab programs**, plus the standalone `Hello.java` and `area.java` examples.

## Requirements

- Java Development Kit (JDK) installed.
- `java` and `javac` available on your `PATH`.

Verify your installation:

```bash
java -version
javac -version
```

## Compile and run

Run commands from the repository root. Since the lab directories contain spaces, quote their paths.

For example, to compile and run a Lab 1 program:

```bash
javac "1BF25CS059_AYUSH_IYER/Lab 1/Program1.java"
java -cp "1BF25CS059_AYUSH_IYER/Lab 1" Program1
```

To compile and run a Lab 3 demonstration:

```bash
javac "1BF25CS059_AYUSH_IYER/Lab 3/BookDemo.java"
java -cp "1BF25CS059_AYUSH_IYER/Lab 3" BookDemo
```

For the standalone circle-area example:

```bash
javac area.java
java area
```

Replace the source filename and class name with the exercise you want to run. If a program depends on other source files, compile those files together as well.

## Repository conventions

- Source files are organised by laboratory.
- Compiled `.class` files and build output are excluded from version control through `.gitignore`.
- Commit history is grouped by lab to make changes easier to follow.

---

Maintained by [Ayush Iyer](https://github.com/Ayush-Iyer1611).
