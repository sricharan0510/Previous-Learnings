import pandas as pd
data=pd.read_csv(r"C:\Users\USER\Desktop\Aiml\IMDB-Movie-Data.csv")
##print(data.shape)
##print(data.size)
##print(data.ndim)
##print(data.head())
##print(data.tail())
#print(data.columns)
##print(data['Revenue (Millions)'])
##print(data['Revenue (Millions)'].max())
##print(data['Revenue (Millions)'].min())
##print(data['Revenue (Millions)'].mean())
##print(data.describe())
##print(data['Year'].unique())
##print(data['Year'].value_counts())
##print(data.isna().sum())
##data.dropna(inplace=True)
##print(data.shape)
##data.drop(['Revenue (Millions)','Metascore'],
##          axis=1,
##          inplace=True)
##print(data.shape)
##data=pd.concat([data,data])
##print(data.shape)
##print(data[data['Year']==2016].count())
##print(data[(data['Year']==2016)&(data['Revenue (Millions)']>250)])
##print(data.iloc[4])
print(data.iloc[0:2,0:2])
