Feature: Testing amazon website and sorting items by tv and getting the second most expensive one and validate it
  @amazon
  Scenario: Sort Tvs by prices and get the second biggest one
  #Given user navigates the amazon website
  And user clicks on the hamburger menu
  And user clicks on Tv,Applicances,Electronics button
  Then user clicks on Televisions
  And user scrolls down on the page and clicks on Samsung brand
  Then user clicks on Featured button and  sort of  the prices with high to low clicks
  And user sorts of the prices and clicks on the seconf biggest one
  When user sees the second biggest one validates the describtion with  "About this item" word