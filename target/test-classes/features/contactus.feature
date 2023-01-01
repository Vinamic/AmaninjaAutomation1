# NOTE PLEASE DO NOT CLICK ON SUBMIT BUTTON
Feature: Contact Us validation

  Scenario: Validate Input form
    Given User is logged in and on Contact us page
    Then Details should be filled in contact us form
      | name  | phoneNumber | email           | comment           |
      | Abdul | 07964859190 | salam@gmail.com | This is a comment |
      | nick  | 07438221495 | nick@gmail.com  | This is a comment |
      | bread | 07500879010 | bread@gmail.com | This is a comment |
      | horse | 07409373890 | horse@gmail.com | This is a comment |
      | cat   | 07964869190 | cat@gmail.com   | This is a comment |
      | dog   | 07346717098 | dog@gmail.com   | This is a comment |