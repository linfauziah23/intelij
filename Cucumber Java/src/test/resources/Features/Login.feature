Feature: Login

  Scenario: User want to login using correct credential
    Given User open secondhand web "https://secondhand-store.herokuapp.com/"
    When User click button Login in Dashboard Page
    And User redirect to Login Page
    And User input value of email with 'almas.testing@gmail.com'
    And User input value of password with '12345678'
    And User click button of Masuk on Login page