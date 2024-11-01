Feature: Simple Form
 Scenario: Verifying the all the fields are taking and submitting
  Given Enter the URL
  When Firstname, Lastname, email, Contact Number, Message
  And Click on Submit Button
  Then Successful Message will appear.