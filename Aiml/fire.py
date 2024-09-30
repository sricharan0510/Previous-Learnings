import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\fires.csv")
##print(data.shape)
data.drop([122,123,124,168],axis=0,inplace=True)
##print(data.shape)
x=data.iloc[:,:-1].values
y=data.iloc[:,-1].values
from sklearn.model_selection import train_test_split
xtrain,xtest,ytrain,ytest=train_test_split(x,y,test_size=0.20,random_state=0)
from sklearn.tree import DecisionTreeClassifier
model= DecisionTreeClassifier(criterion='entropy')
model.fit(xtrain,ytrain)
ypred=model.predict(xtest)
from sklearn.metrics import accuracy_score
print(accuracy_score(ytest,ypred)*100)
print(model.predict([[7,7,2012,38,43,13,0.5,85,13,35.4,4.1,13.7,5.2]]))
sample=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\fireTest.csv")
p=model.predict(sample)
sample['status']=p
sample.to_csv(r"C:\Users\USER\Desktop\Aiml\firePred.csv")

