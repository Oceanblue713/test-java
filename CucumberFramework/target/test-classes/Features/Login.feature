Feature: Login into account

Scenario Outline: Login to account with credentials
    Given user navigates to "<url>"
    When user clicks on the login portal buton
    And user enters the "<username>" username
    And user enter the "<password>"
    When user clicks on the login button
    Then the user should be presented with the following prompt alert "<message>"

    Examples:
    | 				url													| 			username			 | 		password		|				 message				 |
    |http://www.webdriveruniversity.com/  |  webdriver           |  webdriver     |   validation failed    |
    |http://www.webdriveruniversity.com/  |  webdriver           |  webdriver123  |   validation successed |
