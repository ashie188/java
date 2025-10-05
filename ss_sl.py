def ss_st(l1):
    R1=[]
    if len(l1)==0:
        return "list is empty"
    else:
        for x in l1:
            if type(x)==int or type(x)== float or type(x)== bool:
                R1.append(x)
            elif type(x)==list or type(x)==tuple or type(x)==dict:
                for i in type(x):
                    if type(i)==int or type(i)== float or type(i)== bool:
                     R1.append(i)
                     return R1
                    

    k=R1[0]
    l=R1[0]
    for j in R1:
        if k> R[j]:
            temp=k
            k=R[j]
            R[j]=temp
    for j in R1:
        if l>R1[j] and l>k:
            temp=l
            l=R1[j]
            R1[j]=temp
    

m=R1[0]
n=R1[0]
for j in R1:
        if m< R[j]:
            temp=m
            m=R[j]
            R[j]=temp
for j in R1:
        if n<R1[j] and n<m:
            temp=n
            n=R1[j]
            R1[j]=temp
 

print(f"list is R1",R1)
print(f"second smallest number is ",l)
print(f"second largest number is ",n)



def new (R1):
    if len(R1)==0:
        return "R1 is empty"
    elif len(R1)==1:
         return "list has only single element"
    elif len(R1)==2 and  R1[0]==R[1]:
        print(f"second smallest and second largest number is",R1[0])
    else:ss_st(list)
    list=(1,2.0,3,[1,2.0,3],(1,2))
       
            