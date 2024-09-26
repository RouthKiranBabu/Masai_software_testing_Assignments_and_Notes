#How to Get change/modify and save into other csv file
import csv 
import os 

current_file = os.path.abspath(__file__)
current_file_directory = os.path.dirname(current_file)
lst = os.listdir(current_file_directory)

oldfile = "10_Property_stolen_and_recovered.csv"
newfile = "newfilec.csv"

if newfile not in lst:
    with open(oldfile, "r") as rf:
        drf = csv.DictReader(rf)

        with open(newfile, "w") as wf:
            fields = ['Year', 'Cases_Property_Recovered', 'Cases_Property_Stolen']
            dwf = csv.DictWriter(wf, fieldnames=fields, delimiter=',')
            
            dwf.writeheader()
            for line in drf:
                #print(line)
                del line['ï»¿Area_Name']
                del line['Group_Name']
                del line['Sub_Group_Name']
                del line['Value_of_Property_Recovered']
                del line['Value_of_Property_Stolen']
                #print(line)
                dwf.writerow(line)
else:
    with open(newfile, 'r') as rf:
        for line in rf:
            if len(line) != 0:
                print(line)
