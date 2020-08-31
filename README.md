![Java CI](https://github.com/xtermi2/java15/workflows/Java%20CI/badge.svg)

# Java 15 Features

-   [JEP 339:	Edwards-Curve Digital Signature Algorithm (EdDSA)](https://openjdk.java.net/jeps/339)
    -   see example `EdDSAHelper.java`
-   [JEP 360:	Sealed Classes (Preview)](https://openjdk.java.net/jeps/360)
    -   see example `Option.java` or `Shape.java`
-   [JEP 371:	Hidden Classes](https://openjdk.java.net/jeps/371)
    -   only relevant for frameworks. They cannot be used directly by the bytecode of other classes, they are intended for use by the framework itself that generate classes at run time and use them indirectly, via reflection. 
-   [JEP 372:	Remove the Nashorn JavaScript Engine](https://openjdk.java.net/jeps/372)
    -   Java 11 deprecated the Nashorn JavaScript Engine, now it's removed.
-   [JEP 373:	Reimplement the Legacy DatagramSocket API](https://openjdk.java.net/jeps/373)
    -   Replace the underlying implementations of the java.net.DatagramSocket and java.net.MulticastSocket APIs with simpler and more modern implementations that are easy to maintain and debug.
-   [JEP 374:	Disable and Deprecate Biased Locking](https://openjdk.java.net/jeps/374)
    -   Disable biased locking by default, and deprecate all related command-line options. Biased locking is an optimization technique used in the HotSpot Virtual Machine to reduce the overhead of uncontended locking.
-   [JEP 375:	Pattern Matching for instanceof (Second Preview)](https://openjdk.java.net/jeps/375)
    -   see example `InstanceOfPatternMatching.java`
-   [JEP 377:	ZGC: A Scalable Low-Latency Garbage Collector](https://openjdk.java.net/jeps/377)
    -   Change the Z Garbage Collector from an experimental feature into a product feature.
-   [JEP 378:	Text Blocks](https://openjdk.java.net/jeps/378)
    -   Text Blocks are now out of Preview! See example `TextBlock.java`
-   [JEP 379:	Shenandoah: A Low-Pause-Time Garbage Collector](https://openjdk.java.net/jeps/379)
    -   Change the Shenandoah garbage collector from an experimental feature into a product feature. 
-   [JEP 381:	Remove the Solaris and SPARC Ports](https://openjdk.java.net/jeps/381)
    -   Remove the source code and build support for the Solaris/SPARC, Solaris/x64, and Linux/SPARC ports.
-   [JEP 383:	Foreign-Memory Access API (Second Incubator)](https://openjdk.java.net/jeps/383)
    -   Introduce an API to allow Java programs to safely and efficiently access foreign memory outside of the Java heap.
-   [JEP 384:	Records (Second Preview)](https://openjdk.java.net/jeps/384)
    -   TODO
-   [JEP 385:	Deprecate RMI Activation for Removal](https://openjdk.java.net/jeps/385)
    -   TODO