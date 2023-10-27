Feature: School Setup Department Functionality

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke, @Regression, @School, @Departments
  Scenario Outline: School departments progress
    Given Click on the elements in LefNav
      | setup                   |
      | schoolSetup             |
      | schoolSetup_Departments |

    And Click on the elements in Dialog
      | addBtn |

    And The admin user sending the departments information in Dialog
      | nameInput | <nameInputInfo> |
      | codeInput | <codeInputInfo> |

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And Click on the edit button in the DialogContent

    Then The admin user sending new departments information in Dialog
      | nameInput | <e_nameInputInfo> |
      | codeInput | <e_codeInputInfo> |

    And Click on the save element in Dialog
      | edit_saveButton |

    Then Success message should be displayed

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | nameInputInfo     | codeInputInfo | e_nameInputInfo   | e_codeInputInfo |
      | A-Mobile Engineer | WBSASDAD      | A-MOBILE Enginner | MBSAAD4         |