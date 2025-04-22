Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Cargar archivo PDF/DOCX y verificar vista previa
    Given El usuario está en la página de subida de archivos
    When El usuario selecciona un archivo válido en formato PDF o DOCX dentro del límite de 50 MB
    Then El archivo debería cargarse exitosamente
    And La vista previa debería mostrar el nombre, tamaño y tipo del archivo