Feature: User fom Wales is able to enter details and gets result 

Scenario: User from Wales visits NHS chceker tool link, enters his details and checks results

Given User is on the start page
When User select country as Wales
And User enters his details
Then User gets results of whether will get help with his NHS cost or not