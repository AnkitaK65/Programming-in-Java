// Topic: How to Compile and Run Java Programs

package org.AnkitaK65.Unit1;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Running Java program with package!");
    }
}

/*
Notes:
1. JVM (Java Virtual Machine):
    - The engine that runs Java programs.
    - Converts Java bytecode (.class) into machine code.
    - Example: JVM runs the program on your computer.

2. JRE (Java Runtime Environment):
    - Contains JVM + basic Java libraries.
    - Lets you **run** Java programs only.
    - Example: If you only want to run a program, JRE is enough.

3. JDK (Java Development Kit):
    - Contains JRE + compiler (javac) + other tools.
    - Lets you write, compile, and run Java programs.
    - Example: For programmers, JDK is required.


INSTALLING JDK:
1. Download JDK 17 (LTS) from:
    - Oracle JDK: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
    - OpenJDK / Temurin: https://adoptium.net/

2. Install normally (Next → Next → Finish)

3. Verify installation in Terminal / Command Prompt:
    - Check Java version:  java -version
    - Check Compiler:      javac -version

If both commands work → JDK installed successfully ✅

RUNNING A SIMPLE JAVA FILE (NO PACKAGE):
1️. Open terminal → navigate to folder:
    cd /Users/YourName/Desktop/JavaPrograms

2️. Compile the file:
    javac SimpleExample.java
    → Creates SimpleExample.class

3️. Run the program:
    java SimpleExample
    Output: Hello Students! Running a simple Java file.

=> check test.java in Project root Directory


PART-D : RUNNING A JAVA FILE WITH PACKAGE
Compile
cd ProjectFolder
javac org/AnkitaK65/Unit1/Example3.java

Run:
java org.AnkitaK65.Unit1.Example3


PART-E : RUNNING JAVA IN VS CODE

Required Extensions:
- Java Extension Pack
- Language Support for Java
- Debugger for Java

Run options:
1. Right-click inside code → Run Java
2. Click ▶ Run button (top-right)

VS Code automatically:
- Compiles program
- Runs program
- Shows output in terminal
*/