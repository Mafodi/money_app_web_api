Feature: Calculation Check 
Description: Calculation Check

@PL_CalculationCheck
Scenario Outline: Calculation check for your offer screen and review screen
And User clicks on allow and ignore Update
#And User clicks on continue button
And User clicks on next button
And User clicks on New Login button
And User clicks on BusinessProfile button
Then User enters username and password"<UserName>""<Password>"
And User clicks on t&c checkbox
Then User clicks on login button
#And User declines pin creation
#And User clicks on ok snackbar
And User clicks on more option
And User clicks on notification tab
And User clicks on foryou tab
And User clicks on PLOffer

|PLOffer                                                                                                                                                                               |
|Test MNTHLY Pass:Personal loan. 10% interest rate. Loan up to R50 000.00. Money in your account with a few simple clicks. |

And User clicks on iminterested button on campaign screen
And User scrolls letsgetstarted screen to bottom
And User clicks on all checkbox
And User clicks on confirm button
And User scrolls Your information screen to bottom
And User clicks confirm button on YourInformation screen
And User checks the "<upper>" and "<lower>" limit
And User checks the heading"<upperterms>""<Fixedinterestrate>"
And User checks default amount value,default slider value,default terms value"<upper>" "<upperslider>""<upperterms>"
And User checks defaultmonthlyrepayment "<defaultmonthlyrepayment>"
#And User enters amount manually "<manualamount>"
And User clicks on the terms tab
And User clicks on back button on terms screen
And User clicks on the terms tab
And User checks all the terms are displayed"<allterms>"
And User selects a different "<terms>"
And User checks the heading"<terms>""<Fixedinterestrate>"
And User scrolls your offer screen to bottom
And User clicks on recaculate monthly payment button
And User checks NewMonthlyRepayment"<newmonthlyrepayment>"
And User scrolls your offer screen to bottom
And User clicks confirm button on YourOffer screen
And User checks the calculations on review screen"<Creditlifeinsurance>""<Servicefee>""<Baserepayment>""<Totalmonthlyrepayment>""<Amountwillpay>""<FixedinterestrateReview>""<Numberofinstalments>""<Initiationfee>""<Creditcostmultiple>""<Totalloanamount>""<Totalyoupay>"


Examples:
|UserName  |Password    |upper          |upperslider |lower        |upperterms|allterms                   |defaultmonthlyrepayment|manualamount|terms|newmonthlyrepayment|Creditlifeinsurance|Servicefee|Baserepayment|Totalmonthlyrepayment|Amountwillpay|Fixedinterestrate|FixedinterestrateReview  |Numberofinstalments|Initiationfee|Creditcostmultiple|Totalloanamount|Totalyoupay|
|ghostod11 |Testing123* |Max R50 000.00 |R50 000.00  |Min R2 000.00|12        |6,12                       |R4 742.53              |29000       |6    |R5 381.92          |R75.51             |R69.00    |R5 237.41    |R5 381.92 pm         |R29 000.00   |10%              |10.00%                   |6                  |R1 207.50     |1.11             |R30 207.50     |R32 291.52 |
#|ghostacc83|Testing123* |Get a loan of up to R172 700.00 at a great rate just for you. Get the money in your Nedbank account when you need it, with a few simple clicks. Flexible repayment terms. T&Cs apply.|Max R172 700.00|R172 700.00 |Min R3 500.00|72        |24,36,48,60,72             |R5 748.03              |27000       |36   |R1 356.28          |R98.72             |R69.00    |R1 188.56    |R1 356.28 pm         |R27 000.00   |27.50%           |27.50%                   |36                 |R1 207.50     |1.81             |R28 207.50     |R48 826.08 |
#|ghostacc74|Testing123* |Get a loan of up to R134 300.00 at a great rate just for you. Get the money in your Nedbank account when you need it, with a few simple clicks. Flexible repayment terms. T&Cs apply.|Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.47              |27000       |48   |R1 099.95          |R70.51             |R69.00    |R960.44      |R1 099.95 pm         |R27 000.00   |25.20%           |25.20%                   |48                 |R1 207.50     |1.96             |R28 207.50     |R52 797.60 |

#|ghostcons1|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R7 324.33              |27000       |48   |R1 067.30          |R70.52             |R69.00    |R927.78      |R1 067.30 pm         |R27 000.00   |23.25%              |23.25 %                |48                |R1 207.50     |1.90              |R28 207.50     |R51 230.40 |
#|ghostcons1|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R7 324.33              |27000       |60   |R956.20            |R70.52             |R69.00    |R816.68      |R956.20 pm           |R27 000.00   |23.25%              |23.25 %                |60                |R1 207.50     |2.12              |R28 207.50     |R57 372.00 |
#|ghostcons1|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R7 324.33              |27000       |72   |R885.27            |R70.52             |R69.00    |R745.75      |R885.27 pm           |R27 000.00   |23.25%              |23.25 %                |72                |R1 207.50     |2.36              |R28 207.50     |R63 739.44 |
#|ghostcons1|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R7 324.33              |27000       |24   |R1 652.66          |R70.52             |R69.00    |R1 513.14    |R1 652.66 pm         |R27 000.00   |23.25%              |23.25 %                |24                |R1 207.50     |1.47              |R28 207.50     |R39 663.84 |
#|ghostcons1|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R7 324.33              |27999.96    |72   |R914.15            |R73.02             |R69.00    |R772.13      |R914.15 pm           |R27 999.96   |23.25%              |23.25 %                |72                |R1 207.50     |2.35              |R29 207.46     |R65 818.80 |

#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27000       |36   |R1 149.98          |R69.27             |R69.00    |R1 011.71    |R1 149.98 pm         |R27 000.00   |17.5%              |17.50 %                |36                  |R706.50     |1.53              |R27 706.50     |R41 399.28 |
#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27000       |48   |R958.71            |R69.27             |R69.00    |R820.44      |R958.71 pm           |R27 000.00   |17.5%              |17.50 %                |48                  |R706.50     |1.70              |R27 706.50     |R46 018.08 |
#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27000       |24   |R1 538.31          |R69.27             |R69.00    |R1 400.04    |R1 538.31 pm         |R27 000.00   |17.5%              |17.50 %                |24                  |R706.50     |1.37              |R27 706.50     |R36 919.44 |
#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27000       |60   |R846.21            |R69.27             |R69.00    |R707.94      |R846.21 pm           |R27 000.00   |17.5%              |17.50 %                |60                  |R706.50     |1.88              |R27 706.50     |R50 772.60 |
#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27000       |72   |R773.05            |R69.27             |R69.00    |R773.05      |R773.05 pm           |R27 000.00   |17.5%              |17.50 %                |72                  |R706.50     |2.06              |R27 706.50     |R55 659.60 |
#|ghostacc30|Testing123* |Max R250 000.00|R250 000.00 |Min R3 500.00|72        |24,36,48,60,72             |R6 427.11              |27999.96    |72   |R798.40            |R71.77             |R69.00    |R657.63      |R798.40 pm           |R27 999.96   |17.5%              |17.50 %                |72                  |R706.50     |2.05              |R28 706.46     |R57 484.80 |

#|ghostacc74|Testing123* |Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.48              |27000       |36   |R1 290.40          |R70.52             |R69.00    |R1 150.88    |R1 290.40 pm         |R27 000.00   |25.2%              |25.20 %                |36                  |R1 207.50    |1.72              |R28 207.50     |R46 454.40 |
#|ghostacc74|Testing123* |Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.48              |27000       |60   |R990.25            |R70.52             |R69.00    |R850.73      |R990.25 pm           |R27 000.00   |25.2%              |25.20 %                |60                  |R1 207.50    |2.20              |R28 207.50     |R59 415.00 |
#|ghostacc74|Testing123* |Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.48              |27000       |48   |R1 099.96          |R70.52             |R69.00    |R960.44      |R1 099.96 pm         |R27 000.00   |25.2%              |25.20 %                |48                  |R1 207.50    |1.96              |R28 207.50     |R52 798.08 |
#|ghostacc74|Testing123* |Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.48              |27000       |72   |R920.72            |R70.52             |R69.00    |R781.20      |R920.72 pm           |R27 000.00   |25.2%              |25.20 %                |72                  |R1 207.50    |2.46              |R28 207.50     |R66 291.84 |
#|ghostacc74|Testing123* |Max R134 300.00|R134 300.00 |Min R3 500.00|72        |24,36,48,60,72             |R4 153.48              |27999.96    |72   |R950.84            |R73.02             |R69.00    |R808.82      |R950.84 pm           |R27 999.96   |25.2%              |25.20 %                |72                  |R1 207.50    |2.45              |R29 207.46     |R68 460.48 |
