import pandas as pd
import numpy as np
import matplotli.pyplot as plt

a=[i for i in 'abcdefghijklmn']
data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\boston.csv",names=a)
#print(data.head())

x=np.array(data.iloc[:,:-1])

