document.addEventListener("DOMContentLoaded", function() {
    const expenseForm = document.getElementById("expenseForm");
    const expenseText = document.getElementById("expenseText");
    const expenseAmount = document.getElementById("expenseAmount");
    const expenseList = document.getElementById("expenseList");
    const totalExpense = document.getElementById("totalExpense");
  
    let expenses = [];
  
    // Function to display expenses
    function displayExpenses() {
      expenseList.innerHTML = "";
      totalExpense.textContent = calculateTotalExpense().toFixed(2);
  
      expenses.forEach((expense, index) => {
        const div = document.createElement("div");
        div.classList.add("expense");
        div.innerHTML = `
          <span>${expense.text}</span>
          <span>$${expense.amount}</span>
          <button onclick="removeExpense(${index})">Delete</button>
        `;
        expenseList.appendChild(div);
      });
    }
  
    // Function to calculate total expense
    function calculateTotalExpense() {
      return expenses.reduce((total, expense) => total + parseFloat(expense.amount), 0);
    }
  
    // Function to add expense
    function addExpense(text, amount) {
      expenses.push({
        text: text,
        amount: parseFloat(amount)
      });
      displayExpenses();
    }
  
    // Function to remove expense
    function removeExpense(index) {
      expenses.splice(index, 1);
      displayExpenses();
    }
  
    // Event listener for form submission
    expenseForm.addEventListener("submit", function(event) {
      event.preventDefault();
      const text = expenseText.value.trim();
      const amount = expenseAmount.value.trim();
      if (text === "" || amount === "") {
        alert("Please enter both description and amount.");
        return;
      }
      addExpense(text, amount);
      expenseText.value = "";
      expenseAmount.value = "";
    });
  
    // Initial display
    displayExpenses();
  });
  