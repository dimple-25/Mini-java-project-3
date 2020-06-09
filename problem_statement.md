Problem statement:

A vector consists of three components in three space. We will use the coordinates x, y and z to describe a vector. The usual notation for displaying a vector is to put a line over the top or bold face it. We will use the bold face notation for this discussion.

A = Axi + Ayj + Azk

where the A is vector, Ax, Ay and Az are the components in the x, y and z directions and finally i, j, and k are vectors that point in the x, y and z directions and have a magnitude of 1.

There are several operations that can be defined for vectors. They are:

•	addition of two vectors displayed as A + B
•	dot product sometimes shown as A dot B where the dot would normally be a period in the middle of the line.
•	cross product sometimes shown as A X B.
•	multiplication by a scalar (a non-vector value that has only magnitude.) A * c where c is the scalar.
•	equality and not equal represented by == and !=.
•	the print function called Print should display the value of a vector in the form Ax i + Ayj + Azk.

The following are the definitions for each of these operations:
 
Addition: A + B = (Ax + Bx )i + (Ay + By )j + (Az + Bz )k.
Dot product: A * B = Ax*Bx + Ay*By + Az*Bz where we will use the * for the dot product - notice this is a scalar.
Cross product: A X B = i*(Ay*Bz-Az*By) - j*(Ax*Bz - Az*Bx) + k*(Ax*By - Ay*Bx) where we will use the X for the cross product
Scalar multiplication: A * c = c * A = (Ax * c)i + (Ay * c)j + (Az * c)k
Equality: A == B this should be true only if Ax = Bx , Ay = By and Az = Bz

You are to write a class called Vector which contains all these functionalities. Finally write a main program that will exercise all the operations.

