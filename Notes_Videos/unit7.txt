/*

An ArrayList object is a mutable object that contains object references.

ArrayList objects are mutable in size (length). 

The framework behind ArrayList is the Arrays class, which can also be used to call methods
for regular Array objects.

import java.util.ArrayList;

ArrayList arr = new ArrayList() // default

ArrayList<datatype> varName = new ArrayList<datatype>(length)

datatype can be any type of non-primitive data (for example, Strings)
Wrapper classes can be used to store primitive types as objects.

.size() returns the number of elements in the list 

.add(obj) appends the object obj at the end of the list

.add(i, obj) appends the object obj at index i and shifts the objects at positions 
i to end, one index to the right. the size of the list increases by 1

.remove(i) is the exact opposite of adding an object at index i

.set(i, obj) replaces the object at index i with the new obj, and it also returns 
the object that is used for replacing

.get(i) returns the object at index i

putting a general ArrayList as a parameter in a method will yield in a compiler warning
if the method tries to do an operation with an unsupported type of the argument array.

it still compiles but doesn't run.

to traverse an ArrayList while removing elements, you MUST start from the top of the array
to the 0th index in order to not skip elements and/or have an out of bounds error

in an enhanced for loop, ArrayList objects can not be modified

personal information should be removed as soon as they're rendered useless.
doing this explicitly is the recommended practice.

storing information in partially anonymized formats is also a good practice.
example: hashcodes -> still useful for verification, but can't identify a person

*/