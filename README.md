------------------------------------------------------------------------
# graphx-scala
------------------------------------------------------------------------

This activator project describes a graphX functions
Building Application Apache GraphX with Scala

This is use to process graph using GraphX. It demonstrates:
- Evaluate what’s the most important users in the graph.
- Find all three users graph where every two users are connected.
- Find pair of users where connection in each direction between them.
- Scala-based template implementation

-----------------------------------------------------------------------
### Dependency
-----------------------------------------------------------------------
The graphx is distributed using Maven Central so it can be easily added as a library dependency in your SBT build scripts, as follows:

```
libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.6.0"
```

-----------------------------------------------------------------------
### Now Play
-----------------------------------------------------------------------
* The Github code for the project is at : [graphx-scala](https://github.com/rklick-solutions/graphx-scala)
* Clone the project into local system
* Execute `activator clean compile` to build the product
* Execute `activator run` to execute the product

-----------------------------------------------------------------------
### References
-----------------------------------------------------------------------
* [GraphX](http://spark.apache.org/docs/1.6.0/graphx-programming-guide.html)


