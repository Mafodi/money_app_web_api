@regression
Feature: Web Feedback

@LogCompliment		@RT
Scenario Outline: Logging a Compliment
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password	|FeedbackType	|FeedbackDescription	|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	|Compliment		|Really_well_done		|Yes	|0827236901	|Morning	|
|webtest2	|Testing23@!@	|Compliment		|Nice_work				|		|			|			|

@smoke  @LogComplimentSmoke
Scenario Outline: Logging a Compliment
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password	|FeedbackType	|FeedbackDescription	|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	|Compliment		|Really_well_done		|Yes	|0827236901	|Morning	|

@LogQuery	@RT
Scenario Outline: Logging a Query
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password	|FeedbackType	|FeedbackDescription								|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	|Query			|How can I increase my overdraft?					|Yes	|0827236901	|All day	|
|webtest2	|Testing23@!@	|Query			|Get ideas that will benefit clients sent to them	|		|			|			|

@smoke  @LogQuerySmoke
Scenario Outline: Logging a Query
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password	|FeedbackType	|FeedbackDescription								|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	|Query			|How can I increase my overdraft?					|Yes	|0827236901	|All day	|

@LogComplaint	@RT
Scenario Outline: Logging a Complaint
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password |FeedbackType	|FeedbackDescription					|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	      |Complaint	|Enrollment issues on the blinking app	|Yes	|0827236901	|Evening	|
|webtest2	|Testing23@!@  	  |Complaint	|Nedbank won't give me an O/D increase	|		|			|			|

@smoke  @LogComplaintSmoke
Scenario Outline: Logging a Complaint
Given Pmt_I am logged in to Banking web app with username"<NedID>" and password"<Password>"
When I click the Contact Icon in the footer
And I can view content of two cards below the heading We are here to help
And I can click the relevant feedback icon"<FeedbackType>"
And I can capture the description in the text box"<FeedbackDescription>"
And I can view the text counter below the text box. The text counter starts at zero and counts up as I enter text and counts down as I delete text. The max characters is four thousand"<FeedbackDescription>"
Then I can view a thank you message, after I click the submit Feedback button

Examples:
|NedID		|Password	|FeedbackType	|FeedbackDescription					|CallBck|CellNumber	|ContactTime|
|webtest3	|Test11!@!!	|Complaint		|Enrollment issues on the blinking app	|Yes	|0827236901	|Evening	|
