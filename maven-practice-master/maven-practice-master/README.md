# Using Maven

## Apache Maven

Apache Maven is a 'build' automation tool which can be used for Java projects.
It's a bit like a virtualenv in Python as it manages dependencies for that
project you're working on. However, it differs as it uses an XML file for
specifying the dependencies for the project, in a `pom.xml` file.  

Maven addresses two aspects of building software.

1. How the software is built
2. The dependencies specified for that project

        A dependency is something that the software you are trying to install/
        create depends upon.

An example of this in Python is Flask. Where we required the Flask framework
to build a basic website

## Apache Maven and Java

We can use Maven similarly to pipenv in Python to manage dependencies for a
project.  

The following practicals will make use of the JUnit testing suite and the 
Hibernate ORM. You don't need to know what these are at the moment, but if
you're interested have a read here.

- [JUnit][1]
- [Hibernate][2]

[1]: https://junit.org/junit5/
[2]: http://hibernate.org/orm/

## Getting Started

This section will go through some of the basic functionality of using Maven
inside of IntelliJ. This will get you started with understanding what a
`pom.xml` file is, what commands can be run to build the project and what
plugins can be used to create extra files such as coverage reports and testing
reports.  

This is an example of a `pom.xml` file. It stands for **Project Object Model**
and is fundamental unit for Maven as it contains information about a project and
configuration details used by Maven to build the project. Such configurations
can include:

- Database connection handling
- JUnit Testing
- Reporting etc...

```{.xml include=pom.xml}
```

We're going to doing a Maven driven approach for the next practicals. This means
that you'll be running unit tests against code that you have written. Don't
worry about the tests themselves, I have wrote them. We'll be covering unit
testing and test driven development in a couple of weeks. For now you're going
to navigate the Maven environment in IntelliJ and running a few commands.

**Fork the repo into your portfolio space**

1. Open IntelliJ and checkout the [`maven-practice`][3] repo on Nucode

        You might have to wait a few minutes for IntelliJ to install the
        plugins and dependencies.

2. Navigate to `src/main/HelloMaven.java`. This class doesn't really do much for
now.
3. Navigate to `src/test/HelloMavenTest.java`. This is the test class that runs
against the `HelloMaven.java` class. Again, this is a very basic example of a
unit test.
4. In the IntelliJ terminal run the following command `mvn site test`. This will
run the built tests inside of `HelloMavenTest.java` and produce output
information.
5. Right click on `target/src/surefire-report.html` and select
**Open In Browser -> Default**. You should now see some information about the
tests that have run.

        This is a bit of a tedious process for just running small tests. You
        would do this if you have quite a lot of tests.

This is an example of producing a visual output of running tests. Try running
the following commands to see what happens and fill in the `Observation` column
of the following table in the README.md file on **Nucode**.

        To edit the README.md, either do it from IntelliJ or directly from
        Nucode. You will then need to synchronise the local repo to the remote.
        Git push/pull etc

|Command|Observation|
|:---------------|:-----------------------------------------------------------|
|`mvn clean`|  |
|`mvn test`||
|`mvn`||
|`mvn verify`||
|`mvn site`||

        *Tip:* Observe any newly created files as well as the terminal log to
        see what the command is doing. 

[1]: https://junit.org/junit5/
[2]: http://hibernate.org/orm/
[3]: https://nucode.ncl.ac.uk/scomp/stage1/csc1035/practicals/part-2/maven-practice
