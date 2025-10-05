def one():
    for i in range(1,4):
        for j in range(1,4):
            if i ==2 and j==3:
                print("1 ", end="")
            elif i + j >= 4:
                print("* ", end="")
            else:
                print("  ", end="")
        for k in range(1, 4):
            if i > k:
                print("* ", end="")
        print()

one()

