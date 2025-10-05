def to_roman(value):
    num = [1, 4, 5, 9, 10, 40, 50, 90,
        100, 400, 500, 900, 1000]
    sym = ["I", "IV", "V", "IX", "X", "XL",
        "L", "XC", "C", "CD", "D", "CM", "M"]
    i = 12
    output = ""

    if type(value) == str:
        if value.startswith("0b"):
            value = int(value, 2)
        elif value.startswith("0x"):
            value = int(value, 16)
        elif value.startswith("0o"):
            value = int(value, 8)


    while value:
        div = value // num[i]
        value %= num[i]

        while div:
            output += sym[i]
            div -= 1
        i -= 1
    return output

print(to_roman("0xddd"))