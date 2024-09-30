import pandas as pd
data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\iris.csv")
##print(data.head())
data.dropna(inplace=True)
x=data.iloc[:,:-1].values
y=data.iloc[:,-1].values
##print(data.shape)
##print(x.shape)
##print(y.shape)
from sklearn.model_selection import train_test_split
xtrain,xtest,ytrain,ytest=train_test_split(x,y,test_size=0.20,random_state=0)

##Decision-Tree
##from sklearn.tree import DecisionTreeClassifier
##model= DecisionTreeClassifier(criterion='entropy')

##Random-forest
##from sklearn.ensemble import RandomForestClassifier
##model= RandomForestClassifier()

##Logistic Regression
from sklearn.linear_model import LogisticRegression
model=LogisticRegression()

##Support Vector
##from sklearn.svm import SVC
##model=SVC()

##Naive-bayes
##from sklearn.naive_bayes import GaussianNB
##model=GaussianNB()

model.fit(xtrain,ytrain)
ypred=model.predict(xtest)
from sklearn.metrics import accuracy_score
print(accuracy_score(ytest,ypred)*100)


