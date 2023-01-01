Feature: Landing Page Test
	Scenario: Validate Home Screen Content
		Given User landed on landing Page
        Then Title text is "Amaninja-concept2"
        And Subtitle is "This store is password protected. Use the password to enter the store."
        And Help text is "Are you the store owner?"
        And Clickable link button is available "Log in here"

    Scenario: Validate User Login Journey
        When User landed on landing Page
        Then Entering invalid passwords show error message "Password incorrect, please try again."
        |password_1|   
        |password_2|  
        |password_3|  
        |password_4|  
        |password_5|  
        |password_6|  
        |password_7|  
        Then Correct password allows user to sign-in "Amaninja!1"

        