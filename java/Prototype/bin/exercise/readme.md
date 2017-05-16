This is an example of Prototype design pattern, which lets specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

To create a prototype, 'cloneable' interface of Java is used most of the time. Here also we are using the interface to allow our 'prototypefactory' class to clone some object.  

'PrototypeCloneable' is an interface similar to cloneable.

We are considering one cloneable class here - 'Car'. To create a new object of a car method, the initialization values are accessed from 'CarDB' object(which is representative of a database). We want to reduce the number of database hits and for this we use cloning. 

Fill in the blanks in such way that the resulting code would be an implementation of Prototype design pattern. 

After completion, the output should look as follows:

Accessing database to fetch base values for car object
Creating car object..
Name: Focus S
Engine Capacity: 2000
Number of seats: 5
Horse Power: 5
Cruise Control: false
Automatic Climate Control: false


Cloning Car object..
Name: Focus SE
Engine Capacity: 2000
Number of seats: 5
Horse Power: 5
Cruise Control: true
Automatic Climate Control: true
