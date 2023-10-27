Feature: Creating a Bank Account

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

    @Smoke,@Regression
    Scenario Outline: User adds, edits and deletes bank accounts data

      And Click on the element in the LeftNav
        | setup         |
        | parameters    |
        | bank_Accounts |

      And Click on the element in the DialogContent
        | addBtn |

      And The admin click on the edit element Dialog sends the keys into the DialogBox
        | nameInput       | <name>     |
        | inputIban       | <IBAN>     |
        | intCodeInput    | <int code> |

      And Click on the element in DialogBox
        | currency  |
        | currency1 |

     And Click on the element in the DialogContent
        | saveBtn |

      Then Success message should be displayed

      And User sends the keys into the DialogBox
        | searchNameInput      | <name>      |

      And Click on the search button

      And Click on the edit button in the DialogContent

      Then The admin user sending new locations information in Dialog
        | nameInput    | <e_nameInput>            |
        | intCodeInput | <e_IntegrationCodeInput> |

      And Click on the element in Dialog
        | edit_saveButton |

      Then Success message should be displayed

      And User sends the keys into the DialogBox
        | searchNameInput      | <e_nameInput> |

      And Click on the search button

      And Click on the element in Dialog for deleting
        | deleteBtn       |
        | actionDeleteBtn |

      Then Success message should be displayed

      Examples:
        | name    |IBAN       | int code  | e_nameInput| e_IntegrationCodeInput |
        | alive   |123456879  | 1234      | alicabb    | 98765                  |