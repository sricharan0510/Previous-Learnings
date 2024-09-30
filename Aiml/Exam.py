import pandas as pd
import numpy as np
data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\iris.csv")
data.dropna(inplace=True)
x=data.iloc[:,:-1].values
y=data.iloc[:,-1].values
from sklearn.model_selection import train_test_split
xtrain,xtest,ytrain,ytest=train_test_split(x,y,test_size=0.20,random_state=1)
from sklearn.linear_model import LogisticRegression
model=LogisticRegression()
model.fit(xtrain,ytrain)
ypred=model.predict(xtest)
from sklearn.metrics import accuracy_score
print(accuracy_score(ytest,ypred)*100)


