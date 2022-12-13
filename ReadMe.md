# Bommenspel

In deze oefening ga je een leuk spel maken om samen met je vrienden te spelen.
Het doel van het spel is om niet te ontploffen. Als je wel ontploft, dan ben je af.

## Speluitleg

In dit spel is er een bom die we niet moeten laten ontploffen. 
Het is de bedoeling dat de spelers om de beurt op een toets van het keypad drukken.

![Keypad](./resources/numbers.png)
(keypad)

Wanneer een speler de toets indrukt, zal de bom wel of niet ontploffen.
Als de bom wel ontploft, heb je verloren en is het spel afgelopen.
Als de bom niet ontploft, mag je verder spelen totdat de bom wel ontploft.

## Randvoorwaarden

Het spel moet voldoen aan de volgende voorwaarden:
- 1 Scanner
- 1 Random
- 2 int (bomb en input)
- 1 for-loop óf 1 while-loop 
- 1 if/else-statement óf 1 switch-statement

## Stappenplan

Het

- Als eerst clonen we dit project, zodat we de `src` map, de `Main` class en de `Util` class in ons eigen project hebben.
- In de Main class maken we een `main` method. (Hiervoor kunnen we het livetemplate `psvm` gebruiken.)
- Vervolgens moeten we een manier vinden om de input van de gebruiker in te lezen. 
 Hiervoor maken we een nieuw `Scanner` object met als argument/parameter `System.in`.
- We maken een nieuw `Random` object, net zoals we dat met Scanner hebben gedaan. 
 Dit object heeft geen argument/parameter nodig.
- Vervolgens maken we een `int bomb` die als waarde (=) een random int heeft. 
 (Gebruik hiervoor de `nextInt(9)` methode met als argument '9', omdat we 9 nummers op ons keypad hebben.) Dit wordt de random toegewezen locatie van de toets die de bom laat ontploffen.
- We maken ook een `int input` die we als waarde `-1` geven.
- Nu maken we een for-loop óf een while-loop. (Slechts één keuze is goed.)
 De loop blijft loopen zolang `input != bomb`.
- In de loop printen we als eerst de String `"\nKies een nummer van het keypad om in te drukken"` 
 (`"\n"` betekent "new line")
- Daarna zeggen we `input = scanner.nextInt()`
- Als laatste maken we een if/else-statement óf een switch-statement. (Slechts één keuze is goed.)
  - Als `input == bomb`, dan doen we `Util.printExplosion();`,
  - Als `input != bomb`, dan doen we `Util.printBomb();`.

## Bonus
In plaats van een keypad met nummer 0 t/m 9, kunnen we ook een keypad met 9 kleuren maken.

![kleuren](./resources/colors.jpg)
(kleuren keypad)

Probeer het spel aan te passen, zodat het kleuren accepteert in plaats van nummers.

Hints: 
- Gebruik `scanner.nextLine()` om String waardes van de gebruiker te vragen.
- Maak een String array met de waardes `{"groen", "oker", "blauw", "rood", "paars", "aqua", "wit", "geel", "roze"}`.
- Gebruik voor je loop `input != colors[bomb-1]` om te bepalen of je nog moet blijven loopen of niet.


## Uitwerkingen
De uitwerkingen staan in de "answers" branch.
De uitwerkingen van de bonus-opdracht staan in de "bonus" branch.
Weet je niet meer hoe je van branch wisselt? Kijk dan in de leerlijnhandleiding.
