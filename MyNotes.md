# Android-Learning-Dagger-2
Just some basic Dagger 2 stuffs 

Some Annotations used by dagger for dependency injection

@Inject  -- used for Constructor, Field or Method injection
@Component -- used for creating a Component interface 
@Module -- used for annotating the class (used in case of third party libs where we dont own the class)
@Provides 
@Binds  -- if you want to bind the implementation of an interface its better use @Binds annotation Example: to bind the DieselEngine which
           which is an implementation of Engine interface. In this case its better to use @Binds over @Provides
           @Binds deal with abstract methods @Provides method has method body
           
Constructor injection is always perferred when we have access to the constructor of the class
Field injection must be done in case of Activity or Fragments (Because Android system instantiate those objects for us)
Method injection is done where the method must be called automatically by the dagger framework after instance is created 
(after constructor is completed)

Field injection and Method injection requires a inject method in component interface if there is no constructor injection dpne for that class

Order of Execution
------------------
Constructor ---> Field Injection ---> Method Injection

@Module
@Provides
 if the provides method doesn't depend on instance of the module we can make it static for optimization
