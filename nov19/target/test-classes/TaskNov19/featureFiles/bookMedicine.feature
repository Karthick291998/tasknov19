
Feature: Booking medicine functionality

Background: Launch browser and website of Pharmeasy
    Given Launch the browser and website


  Scenario: Validate Booking medicine functionality with valid data
    When Select the medicine tab TC1
    And Enter valid medicine and click search button TC1
    And Choose particular product from product list TC1
    And Click AddToCart button TC1
    And Enter quantity of product and click ViewCart button TC1
    Then Check the product name and quantity in Cart page TC1

    Scenario: Validate Booking medicine functionality with invalid data
    When Select the medicine tab TC2
    And Enter valid medicine and click search button TC2
    Then Check the error message showing on the screen TC2
    
    Scenario: Validate the booking Lab Test with valid data
     When Select the Lab Test tab TC3
     And Select any Certified Lab partner TC3
     And Choose the Test type TC3
     And Enter the number of patients TC3
     And Click ViewCart button TC3
     Then Check the Test type and Patient count in Cart page TC3
     
      Scenario: Validate the booking Lab Test with invalid data
     When Select the Lab Test tab TC4
     And Select any Certified Lab partner TC4
     And Click ViewCart button with out filling Test type and patient count TC4
     Then Check the error message displayed in the page TC4
     
     Scenario: Validate Choose your location functionality
    When Select the Pincode button TC5
    And Enter the Pincode,Address and click Check button TC5
    And Select the medicine tab TC5
    And Enter valid medicine and click search button TC5
    And Choose particular product from product list TC5
    And Click AddToCart button TC5
    And Enter quantity of product and click ViewCart button TC5
    Then Check the product name and quantity in Cart page TC5
     
     
     