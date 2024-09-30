f=open(r'C:\Users\USER\Desktop\Aiml\Registered Students.csv','r')
s=f.readlines()
d=[]
for i in s:
    d.append(i.split(','))
f.close()
k={}
for i in d[1:]:
    if i[4]not in k:
        k[i[4]]=1
    else:
        k[i[4]]+=1
print(k)
