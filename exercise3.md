# exercise 3

this file documents every task that will be done in this exercise.

## TASKS

### update .gitignore

add the target directory to .gitignore. it contains:

- compiled code: the main code compiled into .class files and also test code
- build artifacts: files generated during the build process
- .idea: this is a folder specific to IntelliJ IDEA and contains local IDE configurations.

    ```plaintext
    target/
    ```

### create a Calculator Class & Main Class

- this Class should be created in the package at.fhj.msd
- it should implement 4 methods that allow us to do simple mathimatical operations

```java
 public double add(double number1, double number2){ ... }

 public double minus(double number1, double number2){ ... }

 public double multiply(double number1, double number2){ ... }

 public double divide(double number1, double number2){ ... }
```

the main class has a Main method where Calculator methods are called and the results are printed in the console

- after executing the code the target/ directory appears. this folder contains
  - compiled .class files
  - build artifacts generated during the build process
- the reason why the folder existed before this execution:
At the beginnig of this exercise I executed the already existing code in Main.java (System.out.println("Hello World!")) and i guess this triggered the build process and created the target folder.

- **project structure**
![project structure](resources/images/ex3_1.png)
