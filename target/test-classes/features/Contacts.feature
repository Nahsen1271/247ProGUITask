Feature: Contacts page

  Background:

    Given User is on the Contact page

  Scenario Outline: User checks information of the contacts displayed correctly

    When User clicks the "<clickName>"
    Then User should see "<name>" "<phone>" "<email>"


    Examples:
      | clickName          | name               | phone       | email                    |
      | Clementine Bauch   | Clementine Bauch   | 01463123444 | Nathan@yesenia.net       |
      | Chelsey Dietrich   | Chelsey Dietrich   | 02549541218 | Lucio_Hettinger@annie.ca |
      | Clementina DuBuque | Clementina DuBuque | 02464838041 | Rey.Padberg@karina.biz   |
      | Ervin Howell       | Ervin Howell       | 01069265931 | Shanna@melissa.tv        |


  Scenario Outline: User can create new contacts

    And User clicks on add new button
    When User types "<Name>" "<Phone>" "<Email>"
    Then User can create new contacts with "<Name>"


    Examples:
      | Name            | Phone       | Email            |
      | Bryson Summer   | 05414561237 | bryson@gmail.com |
      | Adam Babyface   | 05334561238 | adam@gmail.com   |
      | John Handsome   | 05444561238 | john@gmail.com   |
      | Henry Goodman   | 05555612378 | jack@gmail.com   |
      | Finn Hardworker | 05345612378 | anna@gmail.com   |


  Scenario Outline: User can edit some contacts

    And User hovers over "<fullName>" contacts
    And User clicks "<fullName>" edit button
    When User changes "<New Phone>" "<New Email>"
    And User clicks "<fullName>"
    Then User can edit "<New Phone>" "<New Email>"


    Examples:
      | fullName      | New Phone   | New Email              |
      | Adam Babyface | 07854561237 | adamsmith@gmail.com    |
      | Bryson Summer | 05414555557 | brysonsummer@gmail.com |
      | John Handsome | 05443322118 | johnwaterman@gmail.com |


  Scenario Outline: User can delete some contacts


    When User clicks "<Created People>" delete button and confirmation button
    Then User can delete all information related to "<Created People>"

    Examples:
      | Created People  |
      | Bryson Summer   |
      | Adam Babyface   |
      | John Handsome   |
 