UseCase10PalindromeCheckerApp
🧠 Objective

The objective of this project is to validate whether a given string is a palindrome while ignoring spaces, special characters, and case differences.

This use case introduces string preprocessing techniques before performing palindrome validation.

Example:

A man a plan a canal Panama

Output → ✅ Valid Palindrome

📌 Problem Statement

Check whether a string is a palindrome after:

Removing spaces

Ignoring special characters

Converting all characters to lowercase

🔄 Flow of the Program

Take the original input string

Normalize the string

Remove non-alphanumeric characters

Convert to lowercase

Apply palindrome checking logic

Display the result

⚙️ Running Procedure
🔹 Compile the Program
javac UseCase10PalindromeCheckerApp.java
🔹 Run the Program
java UseCase10PalindromeCheckerApp
🧩 Key Concepts Covered

String Preprocessing

Regular Expressions (replaceAll)

Case Normalization (toLowerCase)

Character Comparison using loop

Logical Palindrome Validation

🗂 Data Structure Used

String

Character indexing

💡 Example Execution
Input:
A man a plan a canal Panama
Normalized:
amanaplanacanalpanama
Output:
Is Palindrome : true
🚀 Why This Use Case is Important

This implementation demonstrates:

Real-world palindrome validation

Ignoring formatting differences

Clean input handling

Practical use of regular expressions

📂 Project Structure
UseCase10PalindromeCheckerApp/
│── UseCase10PalindromeCheckerApp.java
│── README.md
👨‍💻 DITO DILEEP

Your Name
