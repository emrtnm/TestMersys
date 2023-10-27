Feature: Nationalities

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke, @Regression
  Scenario Outline: Editing Nationalities

    And Click on the element in the LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in the DialogContent
      | addBtn |

    And The admin click on the edit element Dialog sends the keys into the DialogBox
      | countryName | <country> |

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <country> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the edit button in the DialogContent

    Then The admin user sending new locations information in Dialog
      | countryName | <country_x> |

    And Click on the save element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchNameInput | <country_x> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | country   | country_x |
      | Argentina | Turkiyem  |
