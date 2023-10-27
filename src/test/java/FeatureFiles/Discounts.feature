Feature: Discounts

  Background:
    Given Enter username and password
    And I click login button
    When I should login successfully

  @Smoke, @Regression
  Scenario Outline: Editing Discounts

    And Click on the element in the LeftNav
      | setup         |
      | parameters    |
      | discounts     |

    And Click on the element in the DialogContent
      | addBtn |

    And The admin click on the edit element Dialog sends the keys into the DialogBox
      | priority    | <priority>    |
      | description | <description> |
      | integration | <int code>    |

    And Click on the element in the DialogContent
      | saveClose |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchDescInput | <description> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the edit button in the DialogContent

    Then The admin user sending new locations information in Dialog
      | priority    | <priority_x>    |
      | description | <description_x> |
      | integration | <int cod_x>     |

    And Click on the element in Dialog
      | saveClose |

    Then Success message should be displayed

    And User sends the keys into the DialogBox
      | searchDescInput | <description_x> |

    And Click on the element in the DialogContent
      | searchBtn |

    And Click on the element in Dialog for deleting
      | deleteBtn       |
      | actionDeleteBtn |

    Then Success message should be displayed

    Examples:
      | priority | description | int code | priority_x | description_x | int cod_x |
      | 1589     | icardi      | 95123    | 45782     | mauro        | 65214    |


