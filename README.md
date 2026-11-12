# Java Lab Programs — 3rd Semester

A collection of Java programs developed for third-semester laboratory work and practice. The repository is organised by lab so that individual exercises are easy to locate, compile, and run.

## Repository structure

```text
.
├── 1BF25CS059_AYUSH_IYER/
│   ├── Lab 1/       # 36 Java programs (Program1.java–Program36.java)
│   ├── Lab 2/       # 1 Java program
│   ├── Lab 3/       # 10 Java demonstrations
│   ├── Lab4/        # 6 Java programs
│   └── Lab 5/
│       ├── Q4_Account_Transaction_Report/
│       │   └── src/
│       │       ├── Main.java
│       │       ├── transaction/Account.java
│       │       └── reports/TransactionReport.java
│       └── Q4_Account_Transaction_Report_Updated/
│           └── src/
│               ├── Main.java
│               ├── transaction/Account.java
│               └── reports/TransactionReport.java
├── Hello.java       # Standalone example
├── area.java        # Circle-area example
├── .gitignore
└── README.md
```

## Lab index

| Lab | Contents |
| --- | --- |
| [Lab 1](./1BF25CS059_AYUSH_IYER/Lab%201/) | `Program1.java` – `Program36.java` (36 programs) |
| [Lab 2](./1BF25CS059_AYUSH_IYER/Lab%202/) | `Program1.java` (1 program) |
| [Lab 3](./1BF25CS059_AYUSH_IYER/Lab%203/) | 10 Java demonstrations covering constructors, objects, static members, stacks, and related concepts |
| [Lab 4](./1BF25CS059_AYUSH_IYER/Lab4/) | `Program1.java` – `Program6.java` (6 programs) |
| [Lab 5](./1BF25CS059_AYUSH_IYER/Lab%205/) | Q4 Account Transaction Report — original package-based version and updated shared-array version |

**Total: 53 programs across Labs 1–4**, plus the two Q4 Lab 5 implementations and the standalone `Hello.java` and `area.java` examples.

## Lab 5 — Q4 Account Transaction Report

Two implementations are included:

1. **Original version:** Uses the `transaction` and `reports` packages. The report displays the account number and current balance.
2. **Updated version:** Maintains transaction records in a shared `static` array in the `Account` class. The report copies the populated entries and displays them in array format using `Arrays.toString()`. Deposits, successful withdrawals, and failed withdrawals are recorded.

### Compile and run the original version

Run from the repository root:

```bash
cd "1BF25CS059_AYUSH_IYER/Lab 5/Q4_Account_Transaction_Report"
javac -d out src/transaction/Account.java src/reports/TransactionReport.java src/Main.java
java -cp out Main
```

### Compile and run the updated array version

Run from the repository root:

```bash
cd "1BF25CS059_AYUSH_IYER/Lab 5/Q4_Account_Transaction_Report_Updated"
javac -d out src/transaction/Account.java src/reports/TransactionReport.java src/Main.java
java -cp out Main
```

## Requirements

- Java Development Kit (JDK) installed.
- `java` and `javac` available on your `PATH`.

Verify your installation:

```bash
java -version
javac -version
```

## Compile and run other lab programs

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

- Source files are organised by laboratory and exercise.
- Compiled `.class` files and build output are excluded from version control through `.gitignore`.
- Commit history is grouped by lab and exercise to make changes easier to follow.

---

Maintained by [Ayush Iyer](https://github.com/Ayush-Iyer1611).
