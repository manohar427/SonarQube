How to Start SonarQube:
------------------------
PS F:\Softwares_Inst\sonarqube-6.7.3\sonarqube-6.7.3\bin\windows-x86-64> .\StartSonar.bat

Sonar-maven link:-
-----------------------
https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Maven


Generate the Sonar report and publish in upload in to Sonar Qube
------------------------------------------------------------------
D:\Training\Practice\SonarQube\jenkin-sonar-test> mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install
 D:\Training\Practice\SonarQube\jenkin-sonar-test> mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar