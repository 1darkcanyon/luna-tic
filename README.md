# LUNA-TIC — Phase 1 & 2 Android App

Standalone lunar-emotional forecasting companion, spun out of the NEXUS EI engine.

## What's built (v0.1.0)

- **Moon Engine** — moon phase, illumination %, Sun-Moon-Earth gravitational
  push/pull index (0-100), days to next full moon. Pure math, no API needed.
- **Numerology Engine** — Life Path, Destiny (from name), Daily Vibration,
  with master numbers 11/22/33 preserved.
- **Tarot Engine** — full 78-card deck, deterministic daily draw (same card
  all day) + random draw function for future use.
- **Journal** — local on-device storage (SharedPreferences/JSON) tying each
  entry to that day's moon phase, gravitational index, and daily vibration —
  this is the dataset that will eventually train the personalized forecast AI.
- NEXUS dark theme (cyan/magenta/teal/gold) applied throughout.

## Not yet built (later phases)

- Solar activity / CME data (NOAA SWPC API)
- Barometric pressure + weather API integration
- Chakra cleansing prompt library
- Personalized "emotional forecast AI" synthesis layer
- `/api/luna-tic` endpoint to feed SafeGuard Pro and other NEXUS modules
- Tiered pricing / paywall

## Building from Termux

This repo has no committed Gradle wrapper jar (no network access when this
was scaffolded), so the GitHub Actions workflow installs Gradle directly
instead of using `./gradlew`. To build locally in Termux once you have
network:

```bash
pkg install gradle openjdk-17
cd luna-tic
gradle wrapper --gradle-version 8.7   # generates gradlew + wrapper jar
./gradlew assembleDebug
```

## Building via GitHub Actions (recommended for your workflow)

1. Push this repo to `1darkcanyon/luna-tic` (or whatever name you choose).
2. The workflow at `.github/workflows/build.yml` runs on every push to
   `main`/`master`, or manually via the Actions tab ("Run workflow").
3. Download the built APK from the workflow run's **Artifacts** section
   (`luna-tic-debug-apk`).

## Project structure

```
luna-tic/
├── app/
│   └── src/main/
│       ├── java/net/kaneonexus/lunatic/
│       │   ├── MainActivity.kt
│       │   ├── MoonEngine.kt
│       │   ├── NumerologyEngine.kt
│       │   ├── TarotEngine.kt
│       │   └── JournalStore.kt
│       ├── res/
│       │   ├── layout/activity_main.xml
│       │   ├── values/{colors,themes,strings}.xml
│       │   ├── drawable/ic_launcher_*.xml
│       │   └── mipmap-anydpi-v26/ic_launcher.xml
│       └── AndroidManifest.xml
└── .github/workflows/build.yml
```
