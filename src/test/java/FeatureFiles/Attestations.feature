Feature: Human Resources feature

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

    @HR, @Smoke, @Regression
  Scenario Outline: User adds, edits and deletes data in the Attestations functionality

    And Click on the element in the LeftNav
      | humanResources |
      | dropSetup      |
      | attestations   |

    And Click on the element in the DialogContent
      | addBtn |

    And User sends the keys into the DialogBox
      | nameInput | <name> |

    And Click on the element in the DialogContent
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <name> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the edit button in the DialogContent

    And User sends the keys into the DialogBox
      | nameInput | <editName> |

    And Click on the element in the DialogContent
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <editName> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the element in the DialogContent for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | name | editName |
      | Hope | Hopeful  |
