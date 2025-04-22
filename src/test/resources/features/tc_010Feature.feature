Feature: Generate 'Exit Slip' and Store in History

  Scenario: Validate generation of 'Exit Slip' and storage in history
    Given the document upload and processing is completed
    When the system generates the 'Exit Slip'
    Then the system should save the original documents in request history
    And the system should save the extracted data in request history