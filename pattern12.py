def print_pattern(n):
    if(n<3):
        print("Plese Enter a Greater than ",n," Input !!")
    for i in range(2*n-2):
        for j in range(2*n): 
            if (j + i == n and i < n) or \
               (j - i == n) or \
               (i - j == n - 2 and (i > n - 1 and i <= 2*n - 3)) or \
               (i + j == 3*n - 2 and (i > n - 1 and i <= 2*n - 3)):
                print("* ", end="") 
            elif i == n - 1 and j == n:
                print(n, " ", end="") 
            else:
                print("   ", end="") 
        print()


    for i in range(n):  
        for j in range(2*n - 1):  
            print(" * ", end="") 
        print() 

num = int(input("Enter a number :"))        
print_pattern(num)  
