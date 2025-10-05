let displayValue = '';
let pendingValue = '';
let currentOperator = '';

function appendNumber(number) {
  displayValue += number;
  updateDisplay();
}

function appendOperator(operator) {
  if (displayValue !== '') {
    if (pendingValue !== '') {
      calculateResult();
    }
    currentOperator = operator;
    pendingValue = displayValue;
    displayValue = '';
    updateDisplay();
  }
}

function calculateResult() {
  if (pendingValue !== '' && displayValue !== '') {
    let result;
    const num1 = parseFloat(pendingValue);
    const num2 = parseFloat(displayValue);
    switch (currentOperator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 !== 0) {
          result = num1 / num2;
        } else {
          result = 'Error';
        }
        break;
    }
    displayValue = result.toString();
    pendingValue = '';
    currentOperator = '';
    updateDisplay();
  }
}

function clearDisplay() {
  displayValue = '';
  pendingValue = '';
  currentOperator = '';
  updateDisplay();
}

function updateDisplay() {
  document.getElementById('display').value = displayValue;
}
