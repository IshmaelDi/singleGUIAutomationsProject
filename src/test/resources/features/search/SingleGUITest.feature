Feature: Individual cover for all ages.

  Scenario Outline: Capture individual cover for all ages.
    Given a consultant is logged in to single GUI
    When a consultant starts an individual cover.
    And  a consultant enters all the necessary required member details '<MainMemberTitle>','<MainMemberName>','<MainMemberSurname>','<MainMemberCellNumber>','<EmailAddress>','<MainMemberSouthAfricanCitizen>','<IdNumber>','<MonthlyIncome>','<MonthlyIncome>','<Occupation>','<Education>','<PostalAddress>'
    And a consultant enters required payer details  '<PayerTitle>','<PayerName>','<PayerSurname>','<Relationship>','<DebitDay>','<FirstDebitDay>','<BankName>', '<BranchCode>', '<AccountType>', '<AccountNumber>'
    And  a consultant enters required beneficiary details '<BeneficiaryTitle>', '<BeneficiaryName>', '<Allocation>','<RelationshipII>' and Save Beneficiary Information.
    And  a consultant enters FICA declarations.
    And  a consultant confirms captured information on summary page.
    Then a correct policy number should be generated for te client.


    # Files


    Examples:
      | MainMemberTitle | MainMemberName| MainMemberSurname| MainMemberCellNumber| EmailAddress     | MainMemberSouthAfricanCitizen| IdNumber     | MonthlyIncome| Occupation| Education| PostalAddress | PayerTitle| PayerName| PayerSurname| Relationship| DebitDay| FirstDebitDay| BankName| BranchCode| AccountType| AccountNumber| BeneficiaryTitle| BeneficiaryName| Allocation| RelationshipII|
      | Mr              | Kgotso        | Simo             |  0620134321         | kgotsos@gmail.com| Yes                          | 9210048845735| 3000-6000    | Clerk     | Matric  | 76 HillStreet | Mr        | Leeto    |  Kgosi      | Cousin      | 25      | 25           | Capitec | 470010    |            | 1234         | Mr              | Kgomo          | AAA       | Sister        |

