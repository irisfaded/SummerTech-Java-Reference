## General terminology
1. Parameters
    - The variables defined in the function definition
    e.x (Python) def someFunction(x, y)
    x and y are parameters.
2. Arguments
    - The values passed into a function upon function call
    e.x. (Python) someFunction(1, 2)
    1 and 2 are arguments that get passed as x and y inside someFunction

## Recursion terminology
1. Base Case
    - The conditional statement at the very beginning of the recursive function that evaluates if the recursion should be broken
2. Recursive Case
    - The condition for when the function calls itself, adjusting its parameters to move towards the base case

## OOP (Object-Oriented Programming) terminology
1. Instantiation
    - creating an object of a class
    e.x. (Java) -> Person person1 = new Person();
2. Initialization
    - Setting the initial attributes of the object
    e.x (Java) -> this.name = name;
3. Default constructor
    - Doesn't take parameters, sets an automatic default to attributes upon instantiation of a class
4. Access modifiers
    - Keywords that control access to attributes, methods, constructors, or classes
    - In Java: public and private are access modifiers
5. Method overloading
    - Creating multiple methods (functions) with the same name but with different parameters in one class
    e.x. (Java) -> public int add(int a, int b), public int add(int a, int b, int c)
    If these functions are in the same class, that is overloading. They are differentiated by the number of parameters.
