Feature: Individual cover for all ages.

  Scenario Outline: Capture individual cover for all ages.
    Given a consultant is logged in to single GUI, captures '<username>' clicks next button , captures '<password>' and clicks sign in button.
    And a consultant starts an individual cover.
    And  a consultant enters all the necessary required member details '<MainMemberTitle>','<MainMemberName>','<MainMemberSurname>','<MainMemberCellNumber>','<EmailAddress>','<MainMemberSouthAfricanCitizen>','<IdNumber>','<MonthlyIncome>','<MonthlyIncome>','<Occupation>','<Education>','<PostalAddress>','<Suburb>','<Town>','<PostalCode>','<MedicalCondition>'
    And a consultant enters required payer details  '<PayerTitle>','<PayerName>','<PayerSurname>','<Relationship>','<DebitDay>','<FirstDebitDay>','<BankName>', '<BranchCode>', '<AccountType>', '<AccountNumber>','<IdNumber>','<PayerEmail>','<AccountNmber>','<IsEmployee>','<MobileNumber>','<PayerIdNumer>'
#    And a consultant enters  required spouse details '<SpouseTitle>','<SpouseName>','<spouseSurname>','<SpouseGender>','<EnterIDNumber>' and save spouse information.
#    And a consultant enters child required child details '<childName>', '<childSurName>','<childGender>','<childIDnumber>','<ChildIsStudent>' and saves Child information.
    And  a consultant enters required beneficiary details '<BeneficiaryTitle>', '<BeneficiaryName>', '<BeneficiarySurname>','<Allocation>','<RelationshipII>','<DateOfBirth>', '<BeneficiaryIdNum>' and Save Beneficiary Information.
    And  a consultant enters FICA declarations '<acceptFICAdecl>', '<acceptFicaDeclaration2>' and save.
    And a consultant selects to convert product '<ConvertProductTo>' and save
    And a consultant selects desired rewards.
    And  a consultant confirms captured information on summary page.
    Then a correct policy number should be generated for te client.


    # Files


    Examples:
      | username                | password    | MainMemberTitle | MainMemberName | MainMemberSurname | MainMemberCellNumber | EmailAddress      | MainMemberSouthAfricanCitizen | IdNumber      | MonthlyIncome | Occupation | Education | PostalAddress  | PayerTitle | PayerName | PayerSurname | Relationship | DebitDay | FirstDebitDay | BankName         | BranchCode | AccountType     | AccountNumber | BeneficiaryTitle | BeneficiaryName | Allocation | RelationshipII | childName | childSurName | childGender | childIDnumber | ChildIsStudent | SpouseTitle | SpouseName | spouseSurname | SpouseGender | EnterIDNumber | Suburb    | Town         | PostalCode | MedicalCondition | PayerEmail      | AccountNmber | IsEmployee | MobileNumber | PayerIdNumer  | BeneficiarySurname | BeneficiaryIdNum | DateOfBirth | acceptFICAdecl | acceptFicaDeclaration2 |
      | kmolale@clientele.co.za | Keba@2023   | Mr              | Kgotso         | Simo              | 0620134321           | kgotsos@gmail.com | Yes                           | 9310256805882 | Up to 3,000   | Clerk      | Matric    | 78 Hill Street | Mr         | Kgotso    | Simo         | Cousin       | 25       | 25 Oct 2023   | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | Mr               | Kgomo           | 100        | Sister         | Katlego   | Somi         | Female      | 1810116693285 | No             | Mr          | Kilo       | Loto          | Male         | 9010227213667 | Claremont | Johannesburg | 2092       | Operations       | lebos@gmail.com | 1234         | No         | 0620134321   | 8410239995387 | Simo               | 8510245965454    | 1985-10-24  | No            | No                      |

