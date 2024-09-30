import csv
import matplotlib.pyplot as plt
in_apple = []
with open(r'C:\Users\USER\Desktop\Aiml\spotify-2023.csv','r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    for row in csv_reader:
        try:
            apple = int(row['in_apple_playlists'])
            in_apple.append(apple)
        except ValueError:
            pass
plt.hist(in_apple,color='green',alpha=0.5,bins=20)
plt.ylabel('Apple Playlist')
plt.xlabel('Year')
plt.title('Bar Graph of songs in Apple playlists')
plt.savefig(r'C:\Users\USER\Desktop\Aiml\bar.pdf')
plt.show()
