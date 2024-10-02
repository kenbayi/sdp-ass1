> [!NOTE]
> Application is as simple and easy to understand as possible, if you need it, at the end of the documentation there is a tree of the src directory.
# Welcome to Cinema management application
## This application implements 5 simple design patterns
1. Singleton
   - The Singleton pattern ensures that only one instance of a class exists across the entire application.
2. Factory method
   - The Factory Method pattern allows creating objects without specifying the exact class to instantiate.
3. Abstract Factory
   - The Abstract Factory pattern creates families of related objects without specifying their concrete classes.
4. Builder Pattern
   - The Builder pattern is used to construct complex objects step by step.
5. Prototype 
   - The Prototype pattern allows creating object clones, which can then be modified independently.

### Tree of src directory
```bash
 src
    ├── Main.java
    ├── builders
    │   ├── TicketBooking.java
    │   └── TicketBookingBuilder.java
    ├── config
    │   └── CinemaConfig.java
    ├── factories
    │   ├── movie
    │   │   ├── MovieFactory.java
    │   │   └── RegularMovieFactory.java
    │   └── ui
    │       ├── DarkThemeFactory.java
    │       └── UIFactory.java
    ├── models
    │   ├── movies
    │   │   ├── Movie.java
    │   │   └── RegularMovie.java
    │   └── ui
    │       ├── Button.java
    │       └── DarkThemeButton.java
    └── prototypes
        ├── MovieSchedule.java
        └── StandardSchedule.java
```
