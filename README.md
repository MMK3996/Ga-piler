# AUJava to C Transpiler

[![Language](https://img.shields.io/badge/Language-Java_25-orange.svg)](https://www.oracle.com/java/)
[![Parser Generator](https://img.shields.io/badge/Parser_Generator-ANTLR_4.9.2-blue.svg)](https://www.antlr.org/)
[![Target](https://img.shields.io/badge/Target-C_(GCC)-green.svg)](https://gcc.gnu.org/)

A full-featured **Source-to-Source Compiler (Transpiler)** converting programs written in **AUJava** (a rich subset of Java) into clean, standard, executable **C code**. 

Built for the **Principles of Compiler Design** course at **Amirkabir University of Technology (Tehran Polytechnic)**, under supervision of **Dr. Momtazi** (TAs: Mohammad Heidari Rad & Rezvan Afarin).

---


## 🌟 Key Features & Language Support

- **Object-Oriented Programming (OOP)**: Class declarations, instance fields, methods, constructors, and object instantiation with `new`.
- **Inheritance & Polymorphism**: Class extension (`class Child extends Parent`), inherited field resolution, and **Dynamic Method Overriding** translated into C struct function pointer tables.
- **Static Members**: `static` fields and `static` methods accessed via class name (`ClassName.field`, `ClassName.method()`), translated into top-level C global variables and functions.
- **Unordered / Forward Definitions**: Classes and methods can be referenced before their definition site in the file.
- **Three-Address Code (TAC)**: Linearization of complex arithmetic, relational, and logical expressions using temporary variables (`_t_1`, `_t_2`, ...).
- **Control Flow**: Translation of `if-else` and `while` loops to C `goto` & labels, with loop-stack tracking for `break` and `continue`.
- **Variable Scope Shadowing**: Hierarchical block scope stack allowing inner variables to shadow outer scope declarations.
- **Line & Column Error Diagnostics**: Formatted lexical, syntax, and static semantic errors reporting exact line and character column offsets.
- **Output Statements**: Mapping `System.out.println(expr)` to standard C `printf("%d\n", expr)`.

---

## 📁 Repository Directory Structure

```
compiler project/
├── grammars/
│   └── AUJava.g4             # ANTLR4 Lexer & Parser Grammar Rules
├── src/
│   └── compiler/
│       ├── Main.java         # Transpiler CLI Entry Point
│       ├── error/
│       │   └── AUJavaErrorListener.java   # Lexical, Syntax & Semantic Error Reporter
│       ├── symbol/
│       │   ├── Type.java                  # Primitive & Class Type Models
│       │   ├── Symbol.java                # Variable & Field Symbol Representation
│       │   ├── MethodSymbol.java          # Method Signature Representation
│       │   ├── ClassSymbol.java           # Class Symbol & Inheritance Model
│       │   ├── Scope.java                 # Hierarchical Block Scope Manager
│       │   └── SymbolTable.java           # Global Symbol Table
│       ├── semantic/
│       │   ├── DeclarationVisitor.java    # Pass 1: Class, Field & Method Registration
│       │   └── TypeCheckVisitor.java      # Pass 2: Type Checking & Scope Validation
│       └── codegen/
│           └── CodeGeneratorVisitor.java  # Phase 4: TAC & C Code Generator
├── bin/                      # Output directory containing compiled Java .class files
├── tests/                    # Automated Test Suite & Heavy Test Case
│   ├── Test_Comprehensive.java # Comprehensive test exercising all 275 score features
│   ├── valid/                # Valid syntax test cases
│   ├── invalid/              # Lexical & syntax error test cases
│   ├── semantic/             # Semantic error test cases
│   └── codegen/              # Code generator & GCC runtime tests
├── build.sh                  # Automation script for ANTLR, javac compilation & GCC tests
├── task.md                   # Project score roadmap & completion checklist
└── README.md                 # Complete project documentation
```

---

## ⚙️ Prerequisites & System Requirements

- **Java Development Kit (JDK)**: OpenJDK 17 or higher (tested on OpenJDK 25).
- **ANTLR 4**: ANTLR 4.9.2 runtime jar (`antlr4-runtime.jar`).
- **C Compiler**: `gcc` (GNU Compiler Collection) for compiling generated C code.
- **Bash Shell**: Linux / macOS terminal or WSL on Windows.

---

## 🚀 How to Build & Run

### Automated Build & Full Test Suite

Run the provided `build.sh` script to clean, generate ANTLR files, compile Java sources, and execute the entire test suite including GCC compilation:

```bash
chmod +x build.sh
./build.sh
```

### Manual Usage (Transpiling an AUJava File)

1. **Generate ANTLR Lexer & Parser**:
   ```bash
   antlr4 -o src/compiler grammars/AUJava.g4 -visitor -listener
   ```

2. **Compile Java Transpiler Sources**:
   ```bash
   mkdir -p bin
   javac -cp "/usr/share/java/antlr4-runtime.jar:src" -d bin src/compiler/*.java src/compiler/*/*.java
   ```

3. **Run Transpiler on AUJava File**:
   ```bash
   java -cp "bin:/usr/share/java/antlr4-runtime.jar" compiler.Main <input_file.java> [output_file.c]
   ```

4. **Compile Output C File with GCC and Execute**:
   ```bash
   gcc -Wall -Wextra output_file.c -o program
   ./program
   ```

---

## 🧪 Comprehensive Test Case (`Test_Comprehensive.java`)

A heavy test file is included at [`tests/Test_Comprehensive.java`](file:///home/mirza/compiler%20project./tests/Test_Comprehensive.java) that validates **every single feature** of the 275-point rubric in a single file:

```java
// Features tested in Test_Comprehensive.java:
// 1. Static Fields & Static Methods (Vehicle.vehicleCount, Vehicle.incrementCount())
// 2. Forward / Unordered Class References (Engine referenced inside Car before Engine definition)
// 3. OOP Inheritance & Polymorphism (Car extends Vehicle)
// 4. Dynamic Method Overriding (myCar.calculateTax() vs v.calculateTax())
// 5. Operator Precedence & TAC (1 + 2 * 3 = 7)
// 6. Logical & Relational Expressions ((score == 7) && !(score < 5))
// 7. Variable Scope Shadowing (inner boolean counter vs outer int counter)
// 8. Control Flow (while loop with break and continue)
```

### Expected Runtime Output of `Test_Comprehensive`:

```
2
300
1000
3500
250
250
7
1
99
10
1
3
4
```

---

## 📝 License & Credits

Developed for the Principles of Compiler Design course, Department of Computer Engineering, Amirkabir University of Technology (Tehran Polytechnic).
