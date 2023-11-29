
Feature: login in to the application


  Scenario Outline: login in to the application with data table
  
    Given open browser
    And I open login page
    When I enter my username "<username>"
    And I enter my password  "<password>"
    Then I should be loggin in 

    Examples: 
      | username  | password | 
      | anika |     anika123 | 
      | firoza |     firoza123 | 
      | kamrun |     kamrun123 | 
