def frequency_sort(text):
 l=[]
 for i in range(len(text)):
  l.append(i.count)
 
 for i in l:
  a=l[i]
  for j in l:
   if j>i and a<l[j]:
    temp=a
    a=l[j]
    l[j]=a
 
 for k in l:
  print(l[k])

frequency_sort("sggsietnanded")
