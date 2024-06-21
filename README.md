# design-patterns
**Creational Design Patterns**
1. **Factory Design Pattern** - The Factory is a creational design pattern that simplifies object creation by using a special class(factory)
to create objects for you, so you(client) don't have to use the `new` keyword directly. This makes it easier to change the
type of object being created without changing the code that uses it.

![img_3.png](img_3.png)

2. **Abstract Factory Design Pattern** - The Abstract Factory is a creational design pattern provides a way to create groups of related
objects without specifying their concrete classes.

![img_2.png](img_2.png)

3. **Builder Pattern** - Builder pattern allows you to construct complex objects in  a step-by-step manner. By using builders, directors
, and a well-defined product class you can maintain clean and moduler code, making it easy to create different variants of a product.
   
   **Components of the Builder Pattern** - 


   **Product (Desktop)**: The complex object that is being built.

   **Builder (DesktopBuilder)**: An interface or abstract class that specifies the methods for creating the parts of the Product.

   **Concrete Builders (DellDesktopBuilder, HpDesktopBuilder)**: Classes that implement the Builder interface and provide specific implementations for creating the parts of the Product.

   **Director (DesktopDirector)**: The class responsible for managing the building process. It calls the builder methods in a specific order to create the desired Product.

   **Client (BuilderApplication)**: The class that initiates the building process through the Director.

4. **Prototype Pattern** - The prototype design pattern is a creational design pattern used to create new objects by copying an existing instance. This
pattern is useful when object creation is costly or complex.

![img.png](img.png)