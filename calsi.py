import sys
from PyQt5.QtWidgets import QApplication, QWidget, QVBoxLayout, QGridLayout, QLineEdit, QPushButton
from PyQt5.QtGui import QFont
from PyQt5.QtCore import Qt

class Calculator(QWidget):
    def __init__(self):
        super().__init__()

        self.initUI()

    def initUI(self):
        self.setWindowTitle('Calculator')
        self.setGeometry(100, 100, 300, 400)  # Set window size

        self.setStyleSheet("background-color: blue;")  # Set background color to blue

        self.layout = QVBoxLayout()
        self.setLayout(self.layout)

        self.display = QLineEdit()
        self.display.setFont(QFont('Arial', 24))  # Set font for the display
        self.display.setAlignment(Qt.AlignRight)  # Align text to the right
        self.display.setReadOnly(True)  # Make the display read-only
        self.layout.addWidget(self.display)

        self.gridLayout = QGridLayout()
        self.layout.addLayout(self.gridLayout)

        buttons = [
            ('7', 0, 0), ('8', 0, 1), ('9', 0, 2), ('/', 0, 3),
            ('4', 1, 0), ('5', 1, 1), ('6', 1, 2), ('*', 1, 3),
            ('1', 2, 0), ('2', 2, 1), ('3', 2, 2), ('-', 2, 3),
            ('0', 3, 0), ('.', 3, 1), ('=', 3, 2), ('+', 3, 3),
        ]

        for text, row, col in buttons:
            button = QPushButton(text)
            button.setFont(QFont('Arial', 20))  # Set font for buttons
            button.setStyleSheet("background-color: white;")  # Set button background color
            button.clicked.connect(self.on_button_clicked)
            self.gridLayout.addWidget(button, row, col)

    def on_button_clicked(self):
        button = self.sender()
        text = button.text()

        if text == '=':
            try:
                result = str(eval(self.display.text()))
                self.display.setText(result)
            except Exception as e:
                self.display.setText('Error')
        else:
            current_text = self.display.text()
            new_text = current_text + text
            self.display.setText(new_text)

if __name__ == '__main__':
    app = QApplication(sys.argv)
    calculator = Calculator()
    calculator.show()
    sys.exit(app.exec_())
