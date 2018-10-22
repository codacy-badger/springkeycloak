### Spring Demo Aplikacija sa Red Hat [Keycloak](https://www.keycloak.org/about.html) kontrolom identiteta i pristupa

###### Jednostavna Spring Boot Aplikacija za autentifikaciju korisnika

---

Vec konfigurisan realm mozete importovati koriscenjem **realm-export.json** fajla. Uputstvo za importovanje se nalazi ispod.

#### 0 [Preuzmi KeyCloak Standalone Server](https://www.keycloak.org/downloads.html)
Na windows masinama se porece `bin\standalone.bat` a na linux `./bin/standalone`, kada se pokrene, posetite http://localhost:8080 i kreirajte admin nalog.

#### 1 Kreacija Realma

![Realm Creation](https://i.imgur.com/HKCaRT3.png)

#### 2 Kliknete na select file i izaberete realm-export.json da bi ste importovali

![Realm Creation](https://i.imgur.com/JcNpx2A.png)

#### 3 Dodavanje korisnika

![Dodavanje korisnika](https://i.imgur.com/2cBndQB.png)

#### 4 Dodavanje korisnika

![Dodavnnje korsinika](https://i.imgur.com/HoKgEpU.png)

#### 5 Promena lozinke korisniku

![Promena lozinke](https://i.imgur.com/mNAxdFQ.png)

#### 6 Dodeljivanje uloge studenta novom korisniku

![Dodavanje uloge](https://i.imgur.com/Fl5bhbJ.png)


#### 7 http://localhost:9090

![pocetna](https://i.imgur.com/U6OgvJv.png)

#### 8 Login

![login](https://i.imgur.com/oucD6oG.png)


#### 9 Prikaz liste studenata

![lista](https://i.imgur.com/DZxL9GU.png)
