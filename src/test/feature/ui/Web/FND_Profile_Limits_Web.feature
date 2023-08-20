 @FNDWebRegression @FND_Profile_Limits
Feature: Profile limits Web

@ChangeTempLimitsPositive	@RT
Scenario Outline: Change Temporary Limits Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I can navigate to the Profile limits page
And I can view all the Profile Limit Types under Settings - Profile Limits link in my web login
And I can select Limit Type as Temporary for the transaction type"<TransType>","<LimitType>","<LimitAmount>"
And I can click the Update button or the Cancel button for limits"<Action>"
And I can view the Successfully updated message"<Action>"

Examples:
|NedID		|Password         |TransType	               |LimitType	    |LimitAmount    |Action	|
|webtest3	|Test11!@!!	      |Transfer limit		       |Temporary       |<120100>   	|Update	|
|webtest3	|Test11!@!!	      |Transfer limit		       |Temporary       |<129000>  		|Cancel	|
|webtest3	|Test11!@!!	      |Transfer limit	           |Temporary	    |<125000>	   	|Update	|
|webtest3	|Test11!@!!	      |Payment limit		       |Temporary       |<120100>      	|Update	|
|webtest3	|Test11!@!!	      |Payment limit		       |Temporary       |<129000>  		|Cancel	|
|webtest3	|Test11!@!!	      |Payment limit	           |Temporary	    |<125000> 		|Update	|
|webtest3	|Test11!@!!	      |Lotto limit	               |Temporary	    |<500>     	 	|Update	|
|webtest3	|Test11!@!!	      |Lotto limit	               |Temporary	    |<300> 			|Cancel |
|webtest3	|Test11!@!!	      |Lotto limit	               |Temporary	    |<400>     	  	|Update |
|webtest3	|Test11!@!!	      |Instant payment limit       |Temporary	    |<35300>		|Update	|
|webtest3	|Test11!@!!	      |Instant payment limit       |Temporary	    |<35400>	  	|Cancel |
|webtest3	|Test11!@!!	      |Instant payment limit       |Temporary	    |<35400>	   	|Update |
|webtest3	|Test11!@!!	      |Send iMali limit	           |Temporary	    |<1800>			|Update	|
|webtest3	|Test11!@!!	      |Send iMali limit	           |Temporary	    |<1500>	       	|Cancel	|
|webtest3	|Test11!@!!	      |Send iMali limit	           |Temporary	    |<1500>			|Update	|
|webtest3	|Test11!@!!	      |Prepaid limit	           |Temporary	    |<500>	      	|Update |
|webtest3	|Test11!@!!	      |Prepaid limit	           |Temporary	    |<300>			|Cancel |
|webtest3	|Test11!@!!	      |Prepaid limit	           |Temporary	    |<800>	   		|Update |

@ChangePermLimitsPositive	@RT
Scenario Outline: Change Permanent Limits Positive
Given I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And I can navigate to the Profile limits page
And I can view all the Profile Limit Types under Settings - Profile Limits link in my web login
And I can select Limit Type as Permanent for the transaction type"<TransType>","<LimitType>","<LimitAmount>"
And I can click the Update button or the Cancel button for limits"<Action>"
And I can view the Successfully updated message"<Action>"

Examples:
|NedID		|Password         |TransType	               |LimitType	    |LimitAmount            |Action	|
|webtest3	|Test11!@!!	      |Transfer limit		       |Permanent       |<120100>       		|Update	|
|webtest3	|Test11!@!!	      |Transfer limit		       |Permanent        |<129000>       		|Cancel	|
|webtest3	|Test11!@!!	      |Transfer limit	           |Permanent 	    |<125000>	    		|Update	|
|webtest3	|Test11!@!!	      |Payment limit		       |Permanent       |<120100>       		|Update	|
|webtest3	|Test11!@!!	      |Payment limit		       |Permanent       |<129000>       		|Cancel	|
|webtest3	|Test11!@!!	      |Payment limit	           |Permanent 	    |<126000>	    		|Update	|
|webtest3	|Test11!@!!	      |Lotto limit	               |Permanent 	    |<500>     	    		|Update	|
|webtest3	|Test11!@!!	      |Lotto limit	               |Permanent 	    |<300>     	    		|Cancel |
|webtest3	|Test11!@!!	      |Lotto limit	               |Permanent 	    |<400>     	    		|Update |
|webtest3	|Test11!@!!	      |Instant payment limit       |Permanent 	    |<35300>	    		|Update	|
|webtest3	|Test11!@!!	      |Instant payment limit       |Permanent 	    |<35400>	    		|Cancel |
|webtest3	|Test11!@!!	      |Instant payment limit       |Permanent 	    |<35400>	    		|Update |
|webtest3	|Test11!@!!	      |Send iMali limit	           |Permanent 	    |<1800>	        		|Update	|
|webtest3	|Test11!@!!	      |Send iMali limit	           |Permanent 	    |<1500>	       			|Cancel	|
|webtest3	|Test11!@!!	      |Send iMali limit	           |Permanent 	    |<1500>	       		    |Update	|
|webtest3	|Test11!@!!	      |Prepaid limit	           |Permanent 	    |<500>	       		    |Update |
|webtest3	|Test11!@!!	      |Prepaid limit	           |Permanent 	    |<300>	        		|Cancel |
|webtest3	|Test11!@!!	      |Prepaid limit	           |Permanent 	    |<800>	        		|Update |



