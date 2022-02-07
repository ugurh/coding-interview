_The java.util.function package provides a large array of functional interface definitions for use in lambda expressions and method references. In general it is recommended to use the more specialised form to avoid auto-boxing. For instance IntFunction<Foo> should be preferred over Function<Integer, Foo>.
This rule raises an issue when any of the following substitution is possible:_   
