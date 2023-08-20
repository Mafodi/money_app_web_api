@FNDWeb @FNDWebRegression @FND_GetInTouch
Feature: Get In Touch


  @GetInTouchView_YourBanker
  Scenario Outline: User views his Banker Details
  Given User logged into online banking
  When  User navigates to Get in touch page
  And   User_can_view_the_details_of_the_banker_viz_Banker_Picture_Banker_Name_Bankers_Phone_number_Bankers_email_address()
  Then  User_should_be_able_to_click_on_the_highlighted_email_address

   Examples:
   |NedID		|Password	|
   |webtest2	|Testing2@	|

  @Log_Complaint
  Scenario Outline: Logging a Complaint
  Given User logged into online banking
  When User navigates to Get in touch page
  And I can click the relevant feedback icon"<FeedbackType>"
  And I can capture the description in the text box"<FeedbackDescription>"
  Then I can view a thank you message, after I click the submit Feedback button

  Examples:
  |NedID	|Password	|FeedbackType	|FeedbackDescription   		                        |
  |webtest3	|Testing4$	|   Complaint	|Your Green Bag App Is Not Working properly for me.	|

  @Log_Query
  Scenario Outline: Logging a Query
  Given User logged into online banking
  When User navigates to Get in touch page
  And I can click the relevant feedback icon"<FeedbackType>"
  And I can capture the description in the text box"<FeedbackDescription>"
  Then I can view a thank you message, after I click the submit Feedback button

    Examples:
  |NedID		|Password	    |FeedbackType	|FeedbackDescription		    	|
  |webtest3	    |Testing4$	    |Query			|How can I increase my overdraft?	|

  @LogCompliment
  Scenario Outline: Logging a Compliment
  Given User logged into online banking
  When User navigates to Get in touch page
  And I can click the relevant feedback icon"<FeedbackType>"
  And I can capture the description in the text box"<FeedbackDescription>"
  Then I can view a thank you message, after I click the submit Feedback button

   Examples:
  |NedID		|Password	    |FeedbackType	|FeedbackDescription	                                                   |
  |webtest3	    |Testing4$	    |Compliment		|Really well done Because Your Bank provided services quickly              |
  |webtest2     |Testing2@	    |Compliment		|I am happy with your Web and Mobile Applications as they are user friendly|