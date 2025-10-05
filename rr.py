def palindrome(text):
  if text == text[::-1]:
     return true
  else: return false

def count_palindrome(l1):
 if len(l1)==0:
  print("list is empty")
 elif:
  for x in l1: 
    if type(x)== str:
     if len(x) %6==3:
      if palindrome(x) is true:
        R1=R1.append(x)

 else: 
   for x in l1:
    if type(x)== int:                                   
      if len(x) %6==3: 	                               
       if palindrome(str(x)) is true:
           R1=R1.append(x)
           return len(R1)

l1=["sggsiet", sggs, [3,4,5], (3443,4),33,3443]
print(f"no. of palindrome strings and integers are: " count_palindrome(l1))



def count_palindrome1(l1):
 if len(l1)==0:
  print("list is empty")
 elif: 
  for x in l1: 
    if type(x)== str: and len(x) %6==3: and palindrome(x) is true:
    R2=R2.append(x)
       
 else: 
  for x in l1:
    if type(x)== int: and len(x) %6==3: and palindrome(str(x)) is true:
    R2=R2.append(x)
    return len(R2)

l1=["sggsiet", sggs, [3,4,5], (3443,4),33,3443]  
print(f"no. of palindrome strings and integers are: " count_palindrome1(l1))

def check_performance(approaches):
     time_taken=[]
     for approach in approaches:
        temp_time=[]
        for i in range[100]:
          start_time=time.time()
          approach()
          end_time=time.time()
          temp_time.append(end_time-start_time)
          time_taken.append(sum(temp_time)/100)
          return temp_time
