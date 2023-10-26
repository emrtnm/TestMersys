Feature: Grade Levels Functionality
  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Parameters, @GradeLevel, @Education, @Smoke, @Regression
  Scenario Outline: Grade Levels Management
    And Click on the element in the LeftNav
      | setup         |
      | parameters    |
      | gradeLevels   |

    And Click on the element in the DialogContent
      | addBtn |

    And User sends the keys into the DialogBox
      | nameInput | <name> |

    And Enter shortname "<shortname>" and "<order>"

    And Click on the element in the DialogContent
      | saveBtn |

    Then Success message should be display

    And Click on the last edit button
    And Enter shortname "<editName>" and "<editShortName>"

    And Click on the element in the DialogContent
      | saveBtn |

    Then Success message should be displayed

    And Click on the element in Dialog for deleting
      | lastDeleteBtn   |
      | actionDeleteBtn |
    Then Success message should be display

    Examples:
      | name     | shortname      | order | editName | editShortName |
      | TS_G5     | tsg5          | 8     | Test_TS_G5 | test_tsg5   |