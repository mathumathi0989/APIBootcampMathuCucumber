Feature: CRUD REQUEST 

Scenario: CRUD operations for users
    When I send a GET request to the "/users" endpoint
    Then the user details should be returned
  
 #    Given I have the necessary data to create a user with "<user_first_name>", "<user_last_name>", "<user_contact_number>", "<user_email_id>", and user address "<plotNumber>", "<street>", "<city>", "<state>", "<country>", "<zipCode>"
  #   When I send a POST request to the "/createusers" endpoint
   #  Then the user should be created and the userID should be stored

 #    When I send a GET request to the "/user/{userID}" endpoint
 #    Then the user details should be returned

  #   Given I have the necessary data to update the user with "<updatedFirstname>", "<updatedLastname>", "<updatedContactNumber>", "<updatedEmailid>", and user address "<updatedAddress>", "<updatedStreet>", "<updatedCity>", "<updatedState>", "<updatedCountry>", "<updatedZipCode>"
 #    When I send a PUT request to the "/updateuser/{userID}" endpoint
 #    Then the user should be updated

 #    When I send a DELETE request to the "/deleteuser/{userID}" endpoint
 #    Then the user should be deleted

 #  Examples:
 #    | user_first_name | user_last_name | user_contact_number | user_email_id   | plotNumber     | street   | city    | state   | country  | zipCode | updatedFirstname | updatedLastname | updatedContactNumber | updatedEmailid        | updatedAddress | updatedStreet | updatedCity | updatedState | updatedCountry | updatedZipCode |
  #   | John      | Doe      | 1234567890    | john.doe@example.com  							|   pl-2732 | Anytown | Anystate | USA      | 12345   | Jane             | Doe             | 0987654321            | jane.doe@example.com  | pl-2732   | Othertown   | Otherstate   | USA            | 54321          |
  #   | Alice     | Smith    | 5555555555    | alice.smith@example.com						|  pl-2132 | Sometown| Somestate| USA      | 67890   | Alicia           | Smith           | 5555555556            | alicia.smith@example.com| bl-2732| Thistown    | Thisstate    | USA            | 98765          |
 #    | Bob       | Brown    | 4444444444    | bob.brown@example.com						 | pl-1432| Everytown| Everystate| USA     | 23456   | Robert           | Brown           | 4444444445            | robert.brown@example.com | pl-2752| Thattown    | Thatstate    | USA            | 87654          |
  #   | Carol     | Johnson  | 3333333333    | carol.johnson@example.com				|  pl-0832 | Anycity | Anyprovince| USA    | 34567   | Caroline         | Johnson         | 3333333334            | caroline.johnson@example.com |pf-2731| Citytown   | Cityprovince | USA            | 76543          |
  #   | Dave      | Wilson   | 2222222222    | dave.wilson@example.com 						| pl-9232  | Metropolis| Metrostreet| USA  | 45678   | David            | Wilson          | 2222222223            | david.wilson@example.com | pf-2730| Bigcity    | Bigstate    | USA            | 65432          |

