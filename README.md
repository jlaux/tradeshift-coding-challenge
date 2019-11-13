# tradeshift-coding-challenge

This is the Tradeshift Triangle Coding Challenge. The objective is to write a program that will determine the type of triangle, taking in the lengths of the triangle's three sides as input, and return whether the traingle is equilateral, isosceles or scdalene.

The Triangle class extends the Polygon class. Upon creation, the Polygon class determines whether the inputs will be able to form a valid polygon. Once this has been validated, the Triangle class determines the type of Triangle based on the lengths of the edges. 

I decided to create a Polygon class so that when trying to instantiate a Triangle object, if the object was not valid, the object would not be created in the first place. This also allows for different Shape classes to be created, such as a Rectangle or Pentagon class that could inherit the Polygon class. 
