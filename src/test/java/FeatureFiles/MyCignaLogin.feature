Feature: MyCigna Login Functionality

Scenario Outline: MyCigna Login flow

Given launch the mycigna url
When click onMycign link
Then enter "<username>" and "<password>"
Then click on login button
Then click on popup
Then hover on logout flow
Then clikc on logout link
Then click on close browser

Examples:
| username       | password  |
| prashanthi1985 | D1@donuru |
