import matplotlib.pyplot as plt
a = [ 1,2,3,4 ]
b = [ 5,6,3,8 ]
#plt.plot(a,b,c='orange',linestyle='dashed',linewidth=1)
#plt.scatter(a,b,c='black',marker='*')
plt.bar(a,b,color='r')
plt.barh(a,b,color='r')
plt.title('Sample graph')
plt.xlabel('x-axis')
plt.ylabel('y-axis')
#plt.savefig(r'C:\Users\USER\Desktop\Aiml\abc.png')
plt.show()
