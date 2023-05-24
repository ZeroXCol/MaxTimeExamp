Feature: MaxTime
  As a worker
  I want to use Maxtime
  to register my day worked

  Scenario: Register day worked
    Given before of sing in Maxtime
    When is selecte the option register day
    And Get in the values
    Then Close the day
