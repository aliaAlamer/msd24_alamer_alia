# exercise 4

this file documents describes the test cases that were done for the Calculator. Every arithmetic operation has been tested with 3-4 different test cases.

## Test cases

### Addition

| Method | Description | Input | Expected Result |
|--------|-------------|-------|-----------------|
| testAddValues | test normal addtion | 2, 2 | 4 |
| testAddNegativNum | test addition with negativ number | 2, -4 | -2 |
| testAddWithZero | test addition with 0 | 2, 0 | 2 |

### Subtraction

| Method | Description | Input | Expected Result |
|--------|-------------|-------|-----------------|
| testSubValues | test normal subtraction | 4, 2 | 2 |
| testSubNegativeNum | test subtraction with negativ number | 2, -4 | 6 |
| testSubWithZero | test subtraction with 0 | 0, 2 | -2 |

### Multiplication

| Method | Description | Input | Expected Result |
|--------|-------------|-------|-----------------|
| testMultiplyValues | test normal multiplication | 2, 2 | 4 |
| testMultiplyNegativeNum | test multiplication with negativ number | 2, -2 | -4 |
| testMultiplyWithZero | test multiplication with 0 | 2, 0 | 0 |

### Division

| Method | Description | Input | Expected Result |
|--------|-------------|-------|-----------------|
| testDivValues | test normal division | 4, 2 | 2 |
| testDivNegativeNum | test division with negativ number | 4, -2 | -2 |
| testDivWithZero | test division with 0 | 0, 2 | 0 |
| exceptionTest | test division by 0 | 4, 0 | throw ArithmeticException |

- I tested the exception because i wanted to know how it works. i didn't know how to do it so i looked it up on stackoverflow:
  - [testing exception](https://stackoverflow.com/questions/40268446/junit-5-how-to-assert-an-exception-is-thrown)

### Testcoverage

![testcoverage](resources/images/ex4_1.png)
