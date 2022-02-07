_The java.util.function package provides a large array of functional interface definitions for use in lambda expressions and method references. In general it is recommended to use the more specialised form to avoid auto-boxing. For instance IntFunction<Foo> should be preferred over Function<Integer, Foo>.
This rule raises an issue when any of the following substitution is possible:

**Why the local variable should be final or effectively final if it is used in a lambda expression.**

_When a local variable is used in a lambda expression, 
the lambda makes a copy of that variable. 
This occurs because the scope of a lambda expression is only until the method is in the stack.
If the lambda does not make a copy of the variable, 
then the variable is lost after the method is removed from the stack._