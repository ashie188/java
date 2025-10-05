def string_to_int(s):
 num = 0
 for char in s:
     num = num * 10 + (ord(char) - ord('0'))
 return num

def new():

 str1="2156"
 str2="1062"
 
a=string_to_int("2156")
b=string_to_int("1062")

i=1
while(i<=4):
  
  if(len(str1)-i>= len(str2)-i):
   c=len(str1)-i-len(str2)-i
  else:
   len(str1)-i= 10+ len(str1)-i
   len(str1)-(i+1)= len(str1)-(i+1)-1
   c=len(str1)-i-len(str2)-i
   
   i +=1

   str3=str(c)
   str4=str3[::-1]
   
   return str4
    
   
print("substration is; " ,new())

   
