## working api list

```json
{
    "requests": [
        {
            "name": "all flights",
            "url": "localhost:8420/flights",
            "method": "GET"
        },
        {
            "name": "all bookings",
            "url": "localhost:8420/bookings",
            "method": "GET"
        },
        {
            "name": "all customers",
            "url": "localhost:8420/customers",
            "method": "GET"
        },
        {
            "name": "make booking",
            "url": "localhost:8420/book",
            "method": "POST",
            "body": {
                "type": "json",
                "raw": "{\n    \"flightId\": 145,\n    \"numberOfSeats\": 3,\n    \"customerId\": 146\n}"
            }
        },
        {
            "name": "register customer",
            "url": "localhost:8420/register/customer",
            "method": "POST",
            "body": {
                "type": "json",
                "raw": "{\n    \"name\" : \"Arpit\",\n    \"email\" : \"arpit.patel@addverb.com\"\n}"
            }
        }
    ]
}
```


## my head

ok when i book a flight, what would be the customer flow

go to /flights
see the available flights
    flight
        flight id
        airline name
        available seats
        departure and arrival time
        departure and arrival city

make a booking at /book/{flightId}
enter details of the customer who has request to book it
    name
    email (unique)

view bookings at /bookings


whats the functionality i am providing. 

- find out available flightg
- book a flight
    - give the flight id, number of seats, and customer details to make a booking
    - check if that flight has the number of seats user is requesting



## problem statement 

- UpInTheAir.com has come up with the requirement of developing a web application for booking flights by the customer
- The application should support the following functionalities:
  - *Searching for available Flights*
  - *Booking a Flight*
  - *View Bookings*
- You need to develop the backend APIs for the above functionalities


## pointers

- The following technologies should be used for developing this application:
  - Spring Boot/MVC
  - Hibernate/JPA
- The backend APIs should be tested using Postman to verify the working of it
