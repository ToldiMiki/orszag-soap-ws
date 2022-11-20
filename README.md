# orszag-soap-ws
ország-adatokat szolgáltató szerver, SOAP WS protokolon 

Toldi SOAP Web Service on-premise server:
    XML séma:   src/main/resources/countries.xsd
    SOAP példa: http://localhost:8080/ws     <-- request.xml 
    WSDL:       http://localhost:8080/ws/countries.wsdl   


Toldi SOAP Web Service AZURE server:
    XML séma:   src/main/resources/countries.xsd
    SOAP példa: https://toldi-soapws.azurewebsites.net:443/ws     <-- request.xml 
    WSDL:       https://toldi-soapws.azurewebsites.net:443/ws/countries.wsdl   


Toldi SOAP Web Service webMethods server:
    XML séma:   src/main/resources/countries.xsd
    SOAP példa: https://env324825.int-aws-de.webmethods.io/integration/ws/development/flf22cc4a7bbd3b6320794d4/soapAPIs/CountriesPortSoap11     <-- request.xml 
    WSDL:       https://env324825.int-aws-de.webmethods.io/integration/ws/development/flf22cc4a7bbd3b6320794d4/soapAPIs?wsdl 
