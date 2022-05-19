Feature: Enter to the site and make a search
  Scenario: See the principal page and search something

  Given: User into url "https://www.google.com/"
  When: Make a search
  And: click on the button
  Then: I can see the search list
