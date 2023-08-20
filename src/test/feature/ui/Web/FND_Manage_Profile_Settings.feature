@FNDWeb @FND_ProfileSettings
Feature: Profile Settings

@UpdatePreferredNameThoughSettings
Scenario Outline: Update Preferred Name Though settings
Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
And     I can navigate to the Profile details page
And     I can view a clickable Edit link
And     I can enter preferred name"<PreferredName>"
And     I can click the Update button or the Cancel button"<Action>"
Then    I can view the Success message if click on Update button"<Action>" otherwise no changes have been made

Examples:
|NedID		|Password         |PreferredName	  |Action	|
|Test@5799  |Test11@!@        |Johnny Cash		  |Update	|
|Test@5799	|Test11@!@        |Johnny		  	  |Update	|
|Test@5799	|Test11@!@	      |Stefanus Gerhardus Marius Nicolaas |Cancel	|


@ManageContactDetailsThoughSettings
  Scenario Outline: Manage Contact details Though settings
  Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
  And     I can navigate to the Profile details page
    And 	User can able to click on contact details Edit button to change his contact details
    And 	User modifies his contact details"<Email>","<Alter Cell Phone Number>","<Home Contact Number>","<Work Contact Number>"
    And     User Clicks on consent for Nedbank to update your personal details.
    And     User Clicks on the Save Changes button
    And     User can view the Successfully updated message


  Examples:
  |NedID		        |Password      |Email                  |Alter Cell Phone Number  |Home Contact Number|Work Contact Number  |
  |Kenneth2020	        |Testing23@!@  |JOMAR01@DOT.NET        |+27887423413             |0824233621        |0832376750            |
  |Kenneth2020	        |Testing23@!@  |JOMAR01@VODACOM.NET    |+27997410353             |0824502349        |0824503300           |

#  @ManageResidentialAddressThoughSettings
#  Scenario Outline: Manage Residential Address Though settings
#    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#  And     I can navigate to the Profile details page
#    And 	User can able to click on Residential address Edit button to change his address details
#    And 	User modifies his Residential address"<AddressLine1>","<AddressLine2>","<Province>","<City>","<Suburb>",
#    And     User Clicks on consent for Nedbank to update your personal details.
#    And     User Clicks on the Save Changes button
#    And     User can view the Successfully updated message
#
#    Examples:
#    |NedID		        |Password     |AddressLine1    |AddressLine2        |Province       |    City    |Suburb        |
#    |Kenneth2020	    |Testing23@!@     |4323 SUNRER    |Davidsn Street, |Gauteng         |Midrand     |Halfway House |
#    |Kenneth2020	    |Testing23@!@     |428 SUNBIE RT      |Davidson Street, |KwaZulu-Natal   |  Durban    |KwaMashu      |
#    |nedbankdigital47	|Testing2019!     |436 SUNBIR|Davidson Street,    |Gauteng         |  SANDTON    | Sandton       |


#  @ManagePostalAddressThoughSettings
#  Scenario Outline: Manage Postal Address Though settings
#    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#    And     I can navigate to the Profile details page
#    And 	User can able to click on Postal address Edit button to change his address details
#    And 	User modifies his Postal address"<PostalAddressline1>","<PostalAddressline2>","<Province>","<City>","<PostalSuburb>"
#    And     User Clicks on consent for Nedbank to update your personal details.
#    And     User Clicks on the Save Changes button
#    And     User can view the Successfully updated message
#
#
#    Examples:
#   |NedID		|Password      |PostalAddressline1   |PostalAddressline2     |Province       |City       |PostalSuburb  |
#   |Kenneth2020	|Testing23@!@  |Po Box 11533         |SANDTON STEET         |Gauteng        |Sandton    | Sandton      |
#   |Kenneth2020	|Testing23@!@  |Po Box 11234         |pinetown         |KwaZulu-Natal  |  Durban   |KwaMashu      |


  @UpdatePreferredNameThroughDashBoard
  Scenario Outline: Update Preferred Name through dashboard
    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And     I can navigate to the Profile Initial link
    And     I can click on Choose profile settling icon
    And     I can view a clickable Edit link
    And     I can enter preferred name"<PreferredName>"
    And     I can click the Update button or the Cancel button"<Action>"
    Then    I can view the Success message if click on Update button"<Action>" otherwise no changes have been made
    Examples:
      |NedID		|Password         |PreferredName	               |Action	|
      |Test@5799    |Test11@!@        |Johnny Cash		           |Update	|
      |Test@5799	|Test11@!@	      |Stefa Gerhardus Marius Nicolaas |Cancel	|
      |Test@5799	|Test11@!@        |Johnny		  	               |Update	|

  @ManageContactDetailsThroughDashBoard
  Scenario Outline: Manage Contact details through dashboard
    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
    And     I can navigate to the Profile Initial link
    And     I can click on Choose profile settling icon
    And 	User can able to click on contact details Edit button to change his contact details
    And 	User modifies his contact details"<Email>","<Alter Cell Phone Number>","<Home Contact Number>","<Work Contact Number>"
    And     User Clicks on consent for Nedbank to update your personal details.
    And     User Clicks on the Save Changes button
    And     User can view the Successfully updated message


    Examples:
      |NedID		        |Password      |Email          |Alter Cell Phone Number  |Home Contact Number|Work Contact Number  |
      |Kenneth2020	|Testing23@!@  |JOMAR01@CELL.NET        |+27893255756             |0826511621        |0835676750            |
      |Kenneth2020	|Testing23@!@  |JOMAR01@TELSA.COM       |+27807234767             |0822303762        |0824503700            |

#  @ManageResidentialAddressThroughDashBoard
#  Scenario Outline: Manage Residential Address through dashboard
#    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#    And     I can navigate to the Profile Initial link
#    And     I can click on Choose profile settling icon
#    And 	User can able to click on Residential address Edit button to change his address details
#    And 	User modifies his Residential address"<AddressLine1>","<AddressLine2>","<Province>","<City>","<Suburb>",
#    And     User Clicks on consent for Nedbank to update your personal details.
#    And     User Clicks on the Save Changes button
#    And     User can view the Successfully updated message
#
#    Examples:
#      |NedID		    |Password         |AddressLine1        |AddressLine2        |Province        |    City     |Suburb       |
#      |Kenneth2020	    |Testing23@!@     |235 SUNBIBC         |Davison Str,        |Gauteng         |Midrand     |Halfway House |
#      |Kenneth2020	    |Testing23@!@     |4395 New RNEW       |Dadson Stet,        |KwaZulu-Natal   |  Durban    |KwaMashu      |
#
#  @ManagePostalAddressThroughDashBoard
#  Scenario Outline: Manage Postal Address through dashboard
#    Given   I am logged in to Banking web app with username"<NedID>" and password"<Password>"
#    And     I can navigate to the Profile Initial link
#    And     I can click on Choose profile settling icon
#    And 	User can able to click on Postal address Edit button to change his address details
#    And 	User modifies his Postal address"<PostalAddressline1>","<PostalAddressline2>","<Province>","<City>","<PostalSuburb>"
#    And     User Clicks on consent for Nedbank to update your personal details.
#    And     User Clicks on the Save Changes button
#    And     User can view the Successfully updated message
#
#    Examples:
#      |NedID		|Password      |PostalAddressline1   |PostalAddressline2    |Province      |City       |PostalSuburb  |
#      |Kenneth2020	|Testing23@!@  |Po Box 34253         |SANDTON Ho            |Gauteng         |Sandton    | Sandton      |
#      |Kenneth2020	|Testing23@!@  |Po Box 45624         |Davi new,         |KwaZulu-Natal  |  Durban   |KwaMashu      |
