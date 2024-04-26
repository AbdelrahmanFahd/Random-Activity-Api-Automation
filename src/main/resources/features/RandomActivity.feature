Feature: Random Activity

  Scenario: Get Random Activity
    Given Call "https://www.boredapi.com/api/activity" Api
    Then Assert Status code is "200" and Response Schema have "activity" and "type" Keys

