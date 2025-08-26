"""1. wap to count no. of lines in a File
2. change all the no. in the file to text
3. wap to read a file line by line store into a variable
4. construct a program which accept a sequence of word separated by white space ,print the word """

""" a=open("file","r")
b=a.readlines()
print(b)
 """


""" file_path = input("Enter the file path: ")

try:
    with open(file_path, 'r') as file:
        line_count = sum(1 for line in file)
    print(f"The file has {line_count} lines.")
except FileNotFoundError:
    print(f"The file {file_path} was not found.")
except Exception as e:
    print(f"An error occurred: {e}") """


""" import datetime
print(datetime.datetime.now())
 """

""" import calendar
print(calendar.calendar(2024))
 """

""" import calendar
print(calendar.calendar(2024,12))
 """

""" def d():
    print("section d")
d() """


""" import a
def sum():
    a=20
    b=40
    c=a+b
    return c
print(sum())
 """

""" import a
def sub():
    a=20
    b=40
    c=a-b
    return c
print(sub())
 """

""" from file import multiply
print(multiply(10,20))

from file import sum
print(sum())

from file import s
print(s())

import pytz
IST=
    

 """


""" import matplotlib.pyplot as plt
x=[5,10,15,20,25]
y=[25,5,15,7,45]
plt.plot(x,y)
plt.show() """

""" import matplotlib.pyplot as plt
x=[5,10,15,20,25]
y=[25,5,15,7,45]
plt.plot(x,y,marker="o")
plt.show() """

import matplotlib.pyplot as plt
x=[13,34,45,5,25]
b=["en","aiml","cse","ec","it"]
c=["red","pink","black","green","yellow"]
e=[0.3,0,2,0.2,0.2,0.2]
plt.pie(x,labels=b,colors=c)
plt.legend(title="branch",loc="center")
plt.show()