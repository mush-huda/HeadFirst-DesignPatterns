Implementation of several software design patterns.

Source Book: **Head First Design Patterns**

Some good coding practices advocated in this book:

* Favor composition over inheritence.
    * By dynamically composing object, we can add new functionality by writing new code rather than altering existing code.

* Encapsulate what varies.
    * Identify the aspects of the applications that vary. Then separate them from what stays the same.

* Program to interfaces, not implementations.

* Strive for loosely coupled designs between objects that interact.

* The Hollywood Principle: Don't call us, we will call you.
    * Allow low-level components to hook themselves into a system, but let the high-level components determine when they are needed and how.

* Dependency Inversion Principle: Depend upon abstraction. Don't depend upon concrete classes.
    * Guidelines to follow this priciples:
         * No variable should hold a reference to a concrete class. (Use a Factory instead)
         * No class should derive from a concrete class. (Derive from an interface or abstract class)
         * No method should override an implemented method of any of its base classes.

* Singletons are meant to be used in small quantities.

* Law of Demeter / Priciple of Least Knowledge:
     * Each unit should have limited knowledge about other units.
     * Each unit should only talk to its friends. Don't talk to strangers.
     * Only talk to your immediate friends.
