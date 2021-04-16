The code demos of this module are provided in Maven and Gradle projects.

To import the projects in Eclipse:
1. File -> Import
2. Existing Maven Project or Gradle project (if you don't find these options, install the maven or gradle plugins from Help -> Install New Software)
3. Navigate to the project's directory
4. Select the pom.xml (or build.gradle) file and click Finish

To import the projects in IntelliJ IDEA:
1. In the Welcome to IntelliJ IDEA window, choose the option Open
3. Navigate to the project's directory
2. Select the pom.xml (or build.gradle) file and click Ok
3. Choose the option Open as Project


Some helpful links:

To download the Console Launcher JAR:
https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/

Alternative command prompt for Windows:
https://conemu.github.io/

Inclusion/Exclusion docs for the Maven Surefire plugin:
http://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html

Documentation for the JaCoCo Maven plugin:
http://www.eclemma.org/jacoco/trunk/doc/maven.html

Documentation for the check task of the JaCoCo Maven plugin:
http://www.eclemma.org/jacoco/trunk/doc/check-mojo.html

Documentation for the JaCoCo Gradle plugin:
https://docs.gradle.org/current/userguide/jacoco_plugin.html

To execute the JaCoCo Gradle plugin with JUnit 5 (until it's fixed):
https://stackoverflow.com/questions/39362955/gradle-jacoco-and-junit5