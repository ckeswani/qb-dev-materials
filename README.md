# Materials for developer interviews for Quickbase

## Requirements
This is a java project containing two classes that provide access to data related to human population from two
different sources. One class, `DBManagerImpl`, provides access to a SQL database.  The other class, `ConcreteStatService
 .java`, returns a `List<Pair<String, Integer>>` containing country population data.

The assignment is to implement a solution that consumes these two data sources and returns the combined list of
countries and their populations. In the event of duplicate population data for a given country, the data from
`DBManagerImpl` should be used.

When you examine the code in `src/main/java`, you'll find that there's a `Main` class with a `main()` method in it.
This `main()` method should execute your implementation and print its results to the console in a human readable format.

How you demonstrate the correctness of your implementation is up to you.

## Building and Running the code

You may import and run the projejct within the IDE of your choice or run the following gradle command to generate and
a jar to execute.

From the root dir execute `gradle jar` and then from within the build directory, `java -jar
build/libs/dev-interview-materials.jar`.
