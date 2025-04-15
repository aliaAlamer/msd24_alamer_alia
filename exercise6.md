# Notwendige Grundlagen

- Maven-Projekt mit korrektem pom.xml.
- site.xml (oder site.json ab Maven Site Plugin 4.0) für die Site-Struktur.
- Maven Site Plugin im pom.xml konfiguriert.

## Was ist notwendig, um Maven Site Dokumentation zu generieren?

Um die Maven Site (eine HTML-Dokumentationsseite) zu generieren, benötigt man:

- Grundvorraussetzungen:
  - Ein Maven-Projekt (mit pom.xml)
  - Maven installiert (überprüfe mit mvn --version)
  - Javadoc-Kommenatre im Code (wie in der Calculator-Klasse)

- Schritte zu Generierung
  - Füge das maven-site-plugin in deine pom.xml ein (falls nicht vorhanden)
  - Führe den Befehl aus:
  `mvn site`
    - das generiert die Dokumentation im Ordner target/site/
    - öffne target/site/index.html
  - lokal anzeigen:
  `mvn site:run`
    - startet einen lokalen Webserver

## Was wird in site.xml und pom.xml konfiguriert?

a. pom.xml - Maven-Komfiguration

Hier werden Plugins und allgemeine Projekteinstellungen definiert:

- `<name>`, `<description>`
  - Name und Beschreibung des Projekts (erscheint in der Site)
- `<reporting>` oder `<build>`
  - Konfiguration der Plugins für die Dokimentation

  ```xml
  <reporting>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-project-info-reports-plugin</artifactId>
            <version>3.4.2</version>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-javadoc-plugin</artifactId>
            <version>3.5.0</version>
        </plugin>
    </plugins>

</reporting>
```

- Beispiele für Plugins:
  - maven-javadoc-plugin → Generiert Javadoc-HTML.
  - maven-surefire-report-plugin → Testberichte.
  - maven-checkstyle-plugin → Code-Qualitätsbericht.

b. site.xml – Site-Layout & Menüstruktur

Diese Datei (liegt in src/site/site.xml) steuert das Aussehen der Dokumentation:

- Menüstruktur (`<menu>`)
  - Definiert die Navigation (z. B. Links zu Javadoc, Projektinfos, etc.).

```xml
<menu name="Dokumentation">
    <item name="Javadoc" href="/apidocs/index.html"/>
    <item name="Projekt-Info" href="/project-info.html"/>
</menu>
```

- Seiteninhalte (`<body>`)
  - Kann zusätzliche Beschreibungen oder Verlinkungen enthalten.
- Themes (`<skin>`)
  - Ändert das Design
