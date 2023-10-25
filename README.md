# set_oblig3


I denne oppgaven så begynte jeg med å lage en yml fil ved å følge instruksjonene på denne nettsiden: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven


Instruksjonene her forteller deg hvordan du kan lage en yml fil ved å bruke en ferdigstilt mal for java og maven. Denne vil kjøre når man pusher endringer inn i repositoryet. 


Når jeg først la til denne yml filen fikk jeg med en gang noen feilemeldinger om at yml filen ikke fant pom.xml filen. jeg gjorde derfor endringer til yml filen slik at run: under build build with maven pekte på selve filepathen til pom.xml filen: - name: Build with Maven
      run: mvn -B package --file SET_Oblig_2_Robin_Enerhaugen/SET_Oblig_2/pom.xml

Jeg måtte deretter fjerne optional: update dependency graph ettersom dette forårsakte en feilmelding jeg ikke fikk rettet opp i uten og fjerne den. 
deretter så måtte jeg legge til en ny job som het run test for å få en tabb i actions siden som viste alle testene mine. Jeg la deretter til filepathen til test mappen slik at den kunne kjøres.- name: Run Tests
      run: mvn test --file SET_Oblig_2_Robin_Enerhaugen/SET_Oblig_2/pom.xml

Til slutt så jeg at dette ikke var nok, ettersom run tests tabben ikke gjorde noen meningsfulle handlinger. jeg fant dermed ut at jeg må legge til en plugin i pom.xml filen. 
<plugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version> 
            </plugin>
        </plugins>
        
Jeg la til en bevisst feil i en av testene for å bekrefte at alt fungerte som det skulle. testen returnerte da en feil, og når jeg rettet opp i den, så fungerte alt som det skulle. 
