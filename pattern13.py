def one():
    for i in range(0, 4):
        for j in range(0, 4):
            if i==1 and j==2:
                print("+ ",end="")
            elif i==2 and j==1:
                print("+ ",end="")
            elif i==2 and j==3:
                 print("+ ",end="")
            if i==3 and j==2:
                 print("+ ",end="")

            else:
                 print("  ",end="")
            
            
        print()  
one()

print("\n")





def two():
 for i in range(1,6):
   for j in range(1,6):
     if i==1 and j==3:
        print("+ ",end="")
     
     elif i==2 and j==2:
        print("+ ",end="")
     elif i==2 and j==4:
        print("+ ",end="")
     elif i==3 and j==1:
        print("+ ",end="")
     elif i==3 and j==5:
        print("+ ",end="")
     elif i==4 and j==2:
        print("+ ",end="")
     elif i==4 and j==4:
        print("+ ",end="")
     elif i==5 and j==3:
        print("+ ",end="")
     else:
        print("  ",end="")
    
   print()


two()

print("\n")



def three():
 for i in range(1,8):
   for j in range(1,8):
     if i==1 and j==4:
        print("+ ",end="")
     elif i==2 and j==3:
         print("+ ",end="")
     elif i==2 and j==5:
         print("+ ",end="")
     elif i==3 and j==2:
        print("+ ",end="")
     elif i==3 and j==6:
         print("+ ",end="")
     elif i==4 and j==1:
         print("+ ",end="")
     elif i==4 and j==7:
          print("+ ",end="")
     elif i==5 and j==2:
          print("+ ",end="")
     elif i==5 and j==6:
          print("+ ",end="")
     elif i==6 and j==3:
          print("+ ",end="")
     elif i==6 and j==5:
          print("+ ",end="")
     elif i==7 and j==4:
          print("+ ",end="")
     
     else:
          print("  ",end="")
   print()
three()





