## 👉 Test Cases for E-Commerce Project 👈
This document outlines representative test scenarios to verify key functionalities within the E-Commerce Management System.

## 🧪 Test Case 1: User Registration – Admin Role
Description: Register a new user with administrative privileges and validate proper user creation and security measures.

*Input:*
{
  "username": "adminuser",
  "password": "admin@1234",
  "email": "admin@example.com",
  "role": "ADMIN"
}

*Expected Output:*
- The user is successfully persisted in the database with a system-generated unique user ID.
- Password is hashed securely using BCrypt prior to storage.
- Role-based access control is enabled with the assigned ADMIN role.

## 🧪 Test Case 2: Add a New Product Category – Electronics
Description: Create a new category under electronics and confirm its successful addition.

*Input:*

{
  "name": "Electronics",
  "description": "Includes gadgets, appliances, and electronic accessories."
}

*Expected Output:*
- A new category entry is created with a unique category ID.
-The category becomes selectable for product classification.

## 🧪 Test Case 3: Insert New Product – Bluetooth Speaker
Description: Add a new electronic product to inventory and validate product entry.

*Input:*

{
  "name": "Bluetooth Speaker",
  "stockQuantity": 150,
  "price": 1499.99
}

*Expected Output:*
- Product is successfully inserted with a unique product identifier.
- Product is visible in the inventory and available for ordering.
- Associated stock quantity is accurately recorded.

## 🧪 Test Case 4: Place an Order – Existing Customer
Description: Simulate order placement by a customer and ensure data consistency between orders and order details.

*Pre-conditions:*
- A customer with *userId: 2* exists in the system.
- A product with *productId: 5* is available in stock.

*Order Input:*

{
  "orderDate": "2025-04-14",
  "totalAmount": 2999.98
}

*OrderDetails Input:*

{
  "productId": 5,
  "quantity": 2,
  "unitPrice": 1499.99
}

*Expected Output:*
- System validates the existence of both the customer and the product.
- A new order is created with a unique order ID linked to the customer.
- Related entry in the order_details table is generated with correct quantity and pricing, referencing the associated order.
