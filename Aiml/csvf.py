f=open(r'C:\Users\USER\Desktop\Aiml\Paid Students (1).csv','r')
s=f.readlines()
d=[]
for i in s:
    d.append(i.split(','))
f.close()
k={}
##for i in d[1:]:
##    if i[5]  not in k:
##        k[i[5]]={}
##        if i[3] not in k[i[5]]:
##            k[i[5]][i[3]]=1
##        else:
##            k[i[5]][i[3]]+=1
##    else:
##        if i[3] not in k[i[5]]:
##            k[i[5]][i[3]]=1
##        else:
##            k[i[5]][i[3]]+=1        
##print(k)


##for i in d[1:]:
##    f=i[2].index('@')
##    if i[2][f+1:] not in k:
##        k[i[2][f+1:]]=1
##    else:
##        k[i[2][f+1:]]+=1
##print(k)



