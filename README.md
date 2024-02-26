# TA-CA2

Animal Class -
The animal class contains the basic attributes that the subclasses should have, namely the number of legs, the ability to speak, as well as breathe.

Monkey Class -
Monkey class, whose parent class is the animal class, has a specific number of legs. In order to utilise the getter and setter, the size attribute is added. This is because the size can vary and change, and therefore can have a getter and a setter. By applying polymorphism, the sound of the monkey is changed from the default animal sound “...” to “Hoo.” As for the getter, it simply returns the size - which will be set later on in the action class - of the monkey. On the other hand, the setter sets the size attribute. This function’s parameter is the size itself, as the newSize variable. Afterwards, the monkey’s own size will be replaced with newSize.

Dog Class and Bird Class - 
These two classes have the exact same properties and functions as the monkey class. The only difference is the sound each makes.

Action Class - 
This is the driver class which will run the code. Using the very top block of code for the monkey, it will first create a new monkey with the name Bob. The speak and breathe functions will display Bob’s sound and “Inhale. Exhale.” Afterwards, Bob’s number of legs will be displayed using Bob.legs in “System.out.println(“Monkey has “ + Bob.legs + “ legs.\n”);”. Then to incorporate the getter and setter, the size of the monkey is first set to “short”. Afterwards, using another print line, the getter will get the size of the monkey previously set, and display it.
