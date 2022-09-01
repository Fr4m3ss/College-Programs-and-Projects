import csv

file = open("testdata.csv","rb")
type(file)

data = csv.reader(file)

header = []
header = next(data)
header

data = [[eval(row[0]),eval(row[1]),eval(row[2]),eval(row[3]),eval(row[4]),eval(row[5]),eval(row[6]),eval(row[7]),eval(row[8]),eval(row[9]),eval(row[10]),eval(row[11]),eval(row[12]), row[13]] for row in data]
file.close()

age = []
for i in range(len(data)):
	age = age + [data[i][0]]
gender = []
for i in range(len(data)):
	gender = gender + [data[i][1]]
chestPain = []
for i in range(len(data)):
	chestPain = chestPain + [data[i][2]]
bloodPr = []
for i in range(len(data)):
	bloodPr = bloodPr + [data[i][3]]
cholesterol = []
for i in range(len(data)):
	cholesterol = cholesterol + [data[i][4]]
bloodSugar = []
for i in range(len(data)):
	bloodSugar = bloodSugar + [data[i][5]]
electroCardio = []
for i in range(len(data)):
	electroCardio = electroCardio + [data[i][6]]
maxHeartRate = []
for i in range(len(data)):
	maxHeartRate = maxHeartRate + [data[i][7]]
exerciseInducedAngina = []
for i in range(len(data)):
	exerciseInducedAngina = exerciseInducedAngina + [data[i][8]]
stDepression = []
for i in range(len(data)):
	stDepression = stDepression + [data[i][9]]
slope = []
for i in range(len(data)):
	slope = slope + [data[i][10]]
numOfVessels = []
for i in range(len(data)):
	numOfVessels = numOfVessels + [data[i][11]]
defect = []
for i in range(len(data)):
	defect = defect + [data[i][12]]
answer = []
for i in range(len(data)):
	answer = answer + [data[i][13]]


#print(header)
#print age, "\n", gender, "\n", chestPain, "\n", bloodPr, "\n", cholesterol, "\n", bloodSugar, "\n", electroCardio, "\n", maxHeartRate, "\n", exerciseInducedAngina, "\n", stDepression, "\n", slope, "\n", numOfVessels, "\n", defect

avg = 0
avg2 = 0
count = 0
count2 = 0
for i in range(len(data)):
	if(answer[i] == 'yes'):
		print age[i], ' YES'
		avg = avg + age[i]
		count = count + 1
	avg2 = avg2 + age[i]
	count2 = count2 + 1
avg = avg/count
avg2 = avg2/count2
print avg, ' ', avg2


correct = []
for i in range(len(data)):
	correct = correct + [data[i][13]]

result = []
for i in range(len(data)):
	if(age[i] >= 35 and ((chestPain[i] >= 2 and bloodPr[i] >= 135) and ((cholesterol >= 250 
	or (defect[i] == 7) or electroCardio[i] == 2) or slope[i] == 2)) or age[i] >= 60 
	and numOfVessels > 0):	
		print i+2,' ',age[i], 'yes, '
		result = result + ['yes']	
	else:
		print i+2,' ',age[i], 'no, '
		result = result + ['no']

		


out2 = open("answer.txt", "wb")
out=open("result.txt", "wb")
output=csv.writer(out)
output2=csv.writer(out2)
for ans in result:
	output.writerow(ans)
output2.writerow(correct)
out.close()
out2.close()
