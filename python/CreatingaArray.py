
# Python program to demonstrate

# Adding Elements to a Array

# accessing of element from list


# importing array module
import array as arr

# array with int type

a = arr.array('i', [1, 2, 3])


print ("Array before insertion : ", end =" ")
for i in range (0, 3):
	print (a[i], end =" ")
print()

# inserting array using
# insert() function
a.insert(1, 4)

print ("Array after insertion : ", end =" ")
for i in (a):
	print (i, end =" ")
print()

a = arr.array('i', [1, 2, 3, 4, 5, 6])

# accessing element of array
print("Access element is: ", a[0])

# accessing element of array
print("Access element is: ", a[3])


# array with float type
b = arr.array('d', [2.5, 3.2, 3.3])

print ("Array before insertion : ", end =" ")
for i in range (0, 3):
	print (b[i], end =" ")
print()

# adding an element using append()
b.append(4.4)

print ("Array after insertion : ", end =" ")
for i in (b):
	print (i, end =" ")
print()

# accessing element of array
print("Access element is: ", b[1])

# accessing element of array
print("Access element is: ", b[2])


