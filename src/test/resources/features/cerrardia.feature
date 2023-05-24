Feature: MaxTime
  As a worker
  I want to use Maxtime
  to register my day worked

  Scenario Outline: Register day worked
    Given before of sing in Maxtime "<user>" and "<password>"
    When is selected the option register day
    And Get in the values
    Then Close the day

    Examples:
      | user       | password |
      | fmartinezh | Tt1463pn |



