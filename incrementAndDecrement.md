 increment. It is used in many programming languages including Java to increase a variable by one. 
 
 Java has two opposite operations called increment (++) and decrement (--) to increase/decrease the value of a variable by one.

int n = 10;
n++; // 11
n--; // 10
The code above is actually the same as below.

int n = 10;
n += 1; // 11
n -= 1; // 10

Remember java executes code line by line 

Both increment and decrement operators have two forms which are very important when using the result in the current statement:

prefix (++n or --n) increases/decreases the value of a variable before it is used;
postfix (n++ or n--) increases/decreases the value of a variable after it is used.
The following examples demonstrate both forms of increment.

Prefix increment:

int a = 4;
int b = ++a;

System.out.println(a); // 5
System.out.println(b); // 5
In this case, the value of a has been incremented and then assigned to b. So, b is 5.

Postfix increment:

int a = 4;
int b = a++;

System.out.println(a); // 5
System.out.println(b); // 4
In Java, the postfix operator has higher precedence than the assignment operator. However, it returns the original value of a, not the incremented one.
That's why when we assign a++ to b, we actually assign 4, and then variable a is incremented. So, b is 4 and a is 5.

If that's still not clear enough for you, take a look at the code:

int a = 4;
System.out.println(a++ + a); // this is 9

