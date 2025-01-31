# EcommerceCart_Application
Developed a RESTful API using Java, Spring Boot, and MySQL for an e-commerce cart system. Designed entity classes, implemented CRUD operations with Spring JPA, applied exception handling, and used DTOs for data transfer. Performed unit testing to ensure reliability and maintainability.

About the project 
1. Entity Package 
Defines core database models.

 Product – Represents available products.
 CartItems – Stores items added to the cart.
 ShoppingCart – Manages cart-related operations.
 Order – Handles order placement and tracking.

2. Repository Package 
Handles database operations using Spring JPA.

ProductRepository, CartItemsRepository, ShoppingCartRepository, OrderRepository

3. Service Package
Contains business logic for the application.

ProductService – Manages product-related operations.
CartService – Handles cart item management.
OrderService – Processes order placement.

4. Controller Package 
Exposes RESTful endpoints for client interaction.

ProductController
CartController
OrderController
ShoppingCartController

5. DTO Package
Used for structured data transfer between layers.

6. Exception Handling Package
Manages custom exceptions and global error handling.

7. Testing (JUnit & Mockito)
Performed unit testing to ensure functionality and reliability.
