import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

#dataset=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\data.csv")


data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\data.csv")
data['timestamp'] = pd.to_datetime(data['timestamp'], errors='coerce')
    
data['timestamp'] = pd.to_datetime(data['timestamp'],
                                   format = '%d-%m/%Y %H:%M:%S')
