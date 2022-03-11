@vip
Feature: Homepage

  Background:

    Given User is on the Contact page

  Scenario Outline: User checks the item of the home page

    When User navigates to Contacts Page
    Then User should see following titles on Contacts Page
      | Click to add/remove shortcut |
      | Calendar                     |
      | Mail                         |
      | Contacts                     |
      | To-Do                        |
      | FUSE                         |
      | Charlie Adams                |
      | adams.charlie@mail.com       |
      | APPLICATIONS                 |
      | Sample                       |
      | Contacts                     |
      | CUSTOM FUNCTION              |
      | Customize                    |
      | Documentation                |
      | Changelog                    |

    And User should see "<Page Heading>" "<Page URL>" "<Page Title>" is as expected

    Examples:
      | Page Heading | Page URL                                                       | Page Title                                    |
      | Contacts     | https://mohammedzakaria2.github.io/contacts-list/apps/contacts | Fuse Angular - Material Design Admin Template |

  Scenario: User checks language item works properly

    When User clicks the language buttom
    Then User should see following languages options
      | English |
      | Turkish |

  Scenario: User checks the three line icon works properly

    When User clicks the three line icon
    Then User should see following options
      | Today           |
      | Events          |
      | Notes           |
      | Quick Settings  |
      | Notifications   |
      | Cloud Sync      |
      | Retro Thrusters |

  Scenario: User checks the customize feature works properly

    When User clicks customize button
    Then User checks the default color of Contacts
    And User can change the color to Yellow and check the Contacts color is Yellow





