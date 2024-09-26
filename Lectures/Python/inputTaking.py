name = input("Enter name: ")
print(name, type(name))
#Output
#Enter name: Routh
#Routh <class 'str'>

a, b = tuple(map(int, input("Enter the values: ").split()))
print(a, b, type(a), type(b))
#Output
#Enter the values: 12 32
#12 32 <class 'int'> <class 'int'>

lstint = list(map(int, input("Enter the values: ").split()))
print(lstint)
#Output
#Enter the values: 12 43
#[12, 43]

lstint = input("Enter the values: ").split()
print(lstint)
#Output
#Enter the values: 32 34
#['32', '34']