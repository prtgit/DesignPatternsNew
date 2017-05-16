This is an example of Prototype design pattern, which lets specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

To create a prototype, 'cloneable' interface of Java is used most of the time. Here also we are using the interface to allow our 'prototypefactory' class to clone some object.  

'PrototypeCloneable' is an interface similar to cloneable.

We are considering two cloneable classes here - 'Movie' and 'Show'. In main method, creation of original object its clone creation is implemented. 

Fill in the blanks in such way that the resulting code would be an implementation of Prototype design pattern. 

After completion, the output should look as follows:

Creating movie object..
Current Movie : Inception
Cloning Movie object..
Current Movie : The Dark Knight
------------------
Creating show object..
Current Show: F.R.I.E.N.D.S
Cloning Show object..
Current Show: Sherlock 