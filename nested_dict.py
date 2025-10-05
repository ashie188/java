def nested_dict :
 
 d={}
 size=int(input("enter the size of the dict: "))
 for i in size:
  key1=input("enter the key number: ")
  for j in size:
   key2=input("enter the key2: ")
   value=input("enter the student no: ")
   d.update(key,(key2,value))

   print(f"the nested dict is: {d}")



  