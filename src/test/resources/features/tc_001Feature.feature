Feature: Validate document upload mode selection

  Scenario: Validate selection of document upload mode
    Given the user is on the document upload page
    When the user selects the option 'cargar documentos'
    Then the system shows options for 'carga única' and 'carga múltiple'
    When the user chooses 'carga en un solo archivo'
    Then a single file upload box is enabled
    When the user chooses 'cargar documentos por separado'
    Then multiple file upload boxes are displayed for each required document