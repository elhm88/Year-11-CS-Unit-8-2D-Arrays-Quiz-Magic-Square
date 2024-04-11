# Year-11-CS-Unit-8-2D-Arrays-Quiz-Magic-Square

Ensure that you read all instructions carefully. Do not include any additional methods that are not specified in this quiz description. Think carefully about your solution before writing any code. Use meaningful variable names and proper indentation - take pride in your work! 

<b>Task</b>: In the MagicSquare class you will implement <b>five</b> methods.
* <b>checkSum</b>: This method takes a 2D array of integers and returns the sum of the first row of the 2D array. 
* <b>magicRows</b>: This method takes a 2D array of integers and a checkSum and returns a boolean value depending on whether the sum of each row in the 2D array is equal to checkSum or not.
* <b>magicColumns</b>: This method takes a 2D array of integers and a checkSum and returns a boolean value depending on whether the sum of each column in the 2D array is equal to checkSum or not.
* <b>magicDiagonals</b>: This method takes a 2D array of integers and a checkSum and returns a boolean value depending on whether the sum of each of the main two diagonals in the 2D array is equal to checkSum or not.
* <b>isMagic</b>: This method takes a 2D array of integers and returns a boolean value depending on whether the 2D array is magic or not. 

<b>Description</b>: A magic square is one such that every row, every column, and both main diagonals add to the same value.  

| 0,0 | 0,1 | 0,2 |
|-----|-----|-----|
| **1,0** | **1,1** | **1,2** |
| **2,0** | **2,1** | **2,2** |

| 2 | 7 | 6 |
|---|---|---|
| **9** | **5** | **1** |
| **4** | **3** | **8** |

The sum of each row and each column and the main two diagonals all add to the value 15.

Row 1: [2,7,6] → 2 + 7 + 6 = 15

Row 2: [9,5,1] → 9 + 5 + 1 = 15

Row 3: [4,3,8] → 4 + 3 + 8 = 15

Column 1: [2,9,4] → 2 + 9 + 4 = 15

Column 2: [7,5,3] → 7 + 5 + 3 = 15

Column 3: [6,1,8] → 6 + 1 + 8 = 15

Main diagonal 1: [2,5,8] → 2 + 5 + 8 = 15

Main diagonal 2: [6,5,4] → 6 + 5 + 4 = 15

<br>

int[][] array2d = { {2,7,6}, {9,5,1}, {4,3,8} };

<b>checkSum</b>(array2d); → returns <b>15</b>

<b>magicRows</b>(array2d, checkSum(array2d)); → returns <b>true</b>

<b>magicColumns</b>(array2d, checkSum(array2d)); → returns <b>true</b>

<b>magicDiagonals</b>(array2d, checkSum(array2d)); → returns <b>true</b>

<b>isMagic</b>(array2d); → returns <b>true</b>

<br>

Note that you solution must work for a 2D array of any size n x n.

Note also that the 2D array will be a square. That is, it will have the same number of rows as columns, and all rows will be of the same length.

<i>Good luck, have fun! </i> =)
