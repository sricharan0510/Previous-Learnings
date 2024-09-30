f1=open(r'C:\Users\USER\Desktop\Aiml\Paid Students (1).csv','r')
s1=f1.readlines()
d1=[]
for i in s1:
    d1.append(i.split(','))
f1.close()
f2=open(r'C:\Users\USER\Desktop\Aiml\Registered Students.csv','r')
s2=f2.readlines()
d2=[]
for i in s2:
    d2.append(i.split(','))
f2.close()
ts=[]
for i in d1[1:]:
    ts.append(i[1])
tm=[]
for j in d2[1:]:
    tm.append(j[1])
c=0
for k in d1:
    if k[1] in tm:
        c+=1
print(c)
