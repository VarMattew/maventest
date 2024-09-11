# Második labor megvalósítása MAVEN segítségével

### Mi az a Maven?

A Maven egy népszerű, nyílt forráskódú eszköz a Java projektek építéséhez, kezeléséhez és automatizálásához. A Maven segítségével könnyedén definiálhatod a projekted függőségeit, beállíthatod a fordítási és csomagolási folyamatot, valamint futtathatsz teszteket és más feladatokat.

### Mit csinál a Maven?

- Függőségkezelés: A Maven automatikusan letölti és kezeli a projektedhez szükséges külső könyvtárakat (függőségeket) a Maven központi repository-ból vagy más forrásokból.
- Build automatizálás: A Maven szabványosítja a Java projektek build folyamatát, így könnyen fordíthatod, tesztelheted és csomagolhatod a projektedet egyetlen paranccsal.
- Projektjelentések: A Maven képes különböző jelentéseket generálni a projektedről, például a függőségekről, a teszteredményekről és a kódminőségről.
- Bővíthetőség: A Maven számos bővítménnyel rendelkezik, amelyekkel további funkciókat adhatsz hozzá a build folyamathoz, például kódgenerálást, dokumentációkészítést vagy telepítést.

## Gyakori parancsok:

- `mvn clean`: Törli a korábban lefordított és csomagolt fájlokat (target könyvtár).
- `mvn compile`: Lefordítja a Java forráskódokat.
- `mvn test`: Lefuttatja a projektedben definiált unit teszteket.
- `mvn package`: Létrehozza a projekted csomagolt verzióját (pl. JAR).
- `mvn install`: Telepíti a csomagolt projektet a helyi Maven repository-ba, így más projektek is felhasználhatják függőségként.
- `mvn deploy`: Telepíti a csomagolt projektet egy távoli Maven repository-ba, így mások is hozzáférhetnek.

## Példa Maven használatára:

1. Hozz létre egy `pom.xml` fájlt a projekted gyökérkönyvtárában.
2. Definiáld a projekted metaadatait (név, verzió, stb.) és függőségeit a `pom.xml` fájlban.
3. Nyiss egy terminált, és navigálj a projekted gyökérkönyvtárába.
4. Futtass Maven parancsokat a build folyamat vezérléséhez (pl. `mvn clean install`).

## Könyvtárhierarchia

### Gyökérkönyvtár

- `pom.xml`: A projekt fő konfigurációs fájlja, amely tartalmazza a projekt metaadatait és a build beállításait.
- `README.md` (vagy más formátum): A projekt leírása, használati útmutató, stb.
- `LICENSE`: A projekt licencfájlja.

### `src` könyvtár

- `src/main/java`: A fő Java forráskódok helye, a szokásos csomagstruktúrában.
- `src/main/resources`: Nem Java erőforrások, mint például konfigurációs fájlok, képek, stb.
- `src/test/java`: A tesztek forráskódjai, a szokásos csomagstruktúrában.
- `src/test/resources`: A tesztekhez szükséges erőforrások.

### `target` könyvtár

Ez a könyvtár a Maven által generált fájlokat tartalmazza (fordított osztályok, csomagolt archívumok, stb.). A Maven automatikusan létrehozza, és általában nem kell manuálisan módosítani.

### Példa:
```
my-project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── app/
│   │   │           └── App.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── apptest/
│       │           └── AppTest.java
│       └── resources/
└── target/
```

## További információk:

Maven hivatalos weboldala: https://maven.apache.org/

Maven dokumentáció: https://maven.apache.org/guides/