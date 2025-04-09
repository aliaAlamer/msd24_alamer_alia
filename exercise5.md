# Logging mit Log4J - Übung 5

## 1. Warum werden Logging-Bibliotheken verwendet?

Logging-Bibliotheken wie Log4J werden verwendet für:

**Fehlerdiagnose**  

- Zeigt genau wo/wann Fehler auftreten  
- Speichert den Fehlerkontext (Variablenwerte, Stacktraces)  

**Systemüberwachung**  

- Protokolliert wichtige Ereignisse (z.B. "Benutzer X hat Y gemacht")  
- Zeigt Systemzustand während des Betriebs  

**Sicherheitsaudits**  

- Dokumentiert wer was wann gemacht hat  
- Wichtig für Compliance (z.B. bei Bankanwendungen)  

**Entwicklerunterstützung**  

- Unterschiedliche Detaillevel für Entwicklung/Produktion
- Filterbare Ausgaben

## 2. Loglevel in Log4J

Log4J hat 6 Level:

| Level | Verwendung |
|-------|------------|
| **TRACE** | Noch detailliertere Infos als DEBUG, oft sehr umfangreich. |
| **DEBUG** | Detaillierte Informationen zur Fehlersuche (nur bei Entwicklung nützlich). |
| **INFO** | Allgemeine Informationen über den Programmablauf. |
| **WARN** | Warnung vor einem möglichen Problem. |
| **ERROR** | Fehler, der zwar nicht zum Absturz führt, aber behoben werden muss. |
| **FATAL** | Schwerwiegender Fehler, der zum Absturz führt. |

## log4j Konfigurationsmöglichkeiten (einfach erklärt)

**log4j** ist ein Tool zum Erstellen von Logs (Protokollen). Es ist sehr flexibel und bietet folgende Einstellungsmöglichkeiten:  

### 1. **Log-Level**

Steuert, welche Nachrichten geloggt werden:  
  
- `ERROR` (nur Fehler)  
- `WARN` (Warnungen + Fehler)  
- `INFO` (Infos + Warnungen + Fehler)  
- `DEBUG` (Details für Entwickler)  
- `TRACE` (sehr detailliert)  

### 2. **Ausgabeorte (Appender)**

Legt fest, **wohin** die Logs geschrieben werden:  

- **Konsole** (Bildschirmausgabe)  
- **Dateien** (z. B. `app.log`, mit Rotation)  
- **Datenbanken** (z. B. MySQL)  
- **E-Mails** (bei kritischen Fehlern)  

### 3. **Formatierung (Layout)**

Bestimmt das **Aussehen** der Logs, z. B.:

- `%d{Datum}` → `2024-01-01 12:00:00`  
- `%c{Klasse}` → `com.example.Main`  
- `%m{Nachricht}` → `Fehler aufgetreten!`  

### 4. **Filter**

Erlaubt gezieltes Filtern, z. B.:  

- Nur Logs von einer bestimmten Klasse  
- Keine Debug-Nachrichten in Produktion  

### 5. **Konfigurationsdateien**

Einstellungen werden meist in folgenden Dateien definiert:  

- `log4j2.xml` (XML-Format)
- `log4j2.properties` (Key-Value-Format)  
