Feature:Login

Scenario:Succesful Login with Login Credentials.
        Given user launch Chrome browser
        When user opens Url "https://demo.nopcommerce.com/login"
        And User enters Email as "omkardoke51@gmail.com" & Password as "Omkar@0808"
        And click on login
        Then Page title should be "Dashboard/ nopCommerce administration"
        When user click on Logout link
        Then Page title should be "Your store. Login"
        And close Browser
