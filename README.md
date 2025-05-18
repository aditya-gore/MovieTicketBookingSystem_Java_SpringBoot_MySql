# Movie Reservation Service - Backend System

You are required to build the backend system for a movie reservation service. The service will allow users to sign up, log in, browse movies, reserve seats for specific showtimes, and manage their reservations. The system will feature user authentication, movie and showtime management, seat reservation functionality, and reporting on reservations.

---

## Goal

The goal of this project is to help you understand how to implement complex business logic — i.e., seat reservation and scheduling — while thinking about the data model, relationships, and complex queries.

---

## Requirements

We have intentionally left out the implementation details to encourage you to think about the design and implementation of the system. However, here are some requirements that you can consider:

### User Authentication and Authorization

- Users should be able to sign up and log in.
- You also need roles for users, such as **admin** and **regular user**.
- Admins should be able to manage movies and showtimes.
- Regular users should be able to reserve seats for a showtime.
- You can create the initial admin using seed data.
- Only admins should be able to:
    - Promote other users to admin
    - Manage movies
    - Access reporting, etc.

### Movie Management

- Admins should be able to:
    - Add, update, and delete movies.
- Each movie should have:
    - Title
    - Description
    - Poster image
- Movies should be categorized by **genre**.
- Movies should have **showtimes**.

### Reservation Management

- Users should be able to:
    - Get movies and their showtimes for a specific date.
    - Reserve seats for a showtime.
    - See the available seats and select the ones they want.
    - View and cancel their own reservations (only upcoming ones).
- Admins should be able to:
    - View all reservations
    - View capacity and revenue

---

## Implementation Considerations

- Think about the **data model** and relationships between entities.
- Consider how to:
    - Avoid **overbooking**
    - Handle **seat reservations**
    - Schedule **showtimes**
    - Report on **reservations**
    - Manage **authentication and authorization**

This project is quite complex and will require careful design and implementation. You can use any programming language and database of your choice. A **relational database** such as **MySQL** or **PostgreSQL** is recommended.

Once you complete this project, you will have a solid understanding of how to:

- Implement complex business logic
- Design data models and relationships
- Write and optimize complex queries

You can also extend the project with features such as:

- **Payment processing**
- **Email notifications**

## Technologies Used
* Java 17+
* Spring Boot 3.4.5 
* Spring Data JPA
* MySQL (as the database)
* Maven (for dependency management)
