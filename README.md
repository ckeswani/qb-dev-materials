# Materials for developer interviews for Quickbase

## Requirements
This is a boilerplate java project with two disparate data sources.  One is a sql database and the other is simply a service interface that returns a map.  Your job is to build a service that merges and removes duplicates from the datastream.  How to demonstrate the correctness of your implementation is up to you.  When you examine the boilerplate, you'll see that there's a Main class that demonstrates connecting to the database and one that demonstrates reading from the static service.
## Building/Running the code

From the root dir,
`
gradle jar

java -jar build/libs/dev-interview-materials.jar
`
