ATM Interface 🏧

Overview:

The application simulates basic ATM operations, allowing users to manage their bank account through a simple menu-driven system.

Features:

->Withdraw money from the account
->Deposit money into the account
->Check current account balance
->Validation for insufficient balance during withdrawal
->User-friendly console interaction
->Continuous operation until the user exits

🧱 Project Structure:

->BankAccount class:
Stores account balance.
Handles deposit, withdrawal, and balance checking.

->ATM class:
Displays ATM menu.
Accepts user choices.
Connects with BankAccount.

->ATMInterface class:
Contains the main() method
Starts the ATM application

Technologies Used:

Java ,
Java Standard Libraries (java.util.Scanner) & CONSOLE(Terminal).

📚 Concepts Used:

.Classes and Objects
.Encapsulation
.Methods
.Conditional statements (if-else)
.Looping (while)
.Switch case

How the System Works:

*The system starts with a predefined account balance.
*The ATM displays a menu with the following options:
Withdraw/Deposit/Check Balance/Exit.

*Based on the user’s choice:
-Withdrawal checks for sufficient balance before processing.
-Deposit adds the entered amount to the account.
-Balance inquiry displays the current balance.
-The ATM continues running until the user selects the exit option.
-Appropriate messages are displayed for successful and unsuccessful transactions.