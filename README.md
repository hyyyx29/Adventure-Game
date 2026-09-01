# EchoQuest 🎙️

A text adventure game in Java **with full audio narration** — every room speaks its description aloud as you explore, and one of the gatekeepers even quizzes you on musical notes.

## Worlds

Two playable worlds ship with the game:

- **CrowtherGame** — an homage to the original *Colossal Cave Adventure*, fully voice-narrated with 130+ audio clips
- **SmallGame** — a compact world, great for a quick tour

## Trolls 🧌

Some passages are guarded by trolls you must beat to pass:

- **NoteTroll** 🎵 synthesizes a musical tone (C, E or G) with the Java sound API — name the note to pass
- **GameTroll** 🎲 challenges you to a guessing game

## How to play

```bash
javac -encoding UTF-8 Main.java
java Main
```

Enter a world name when prompted (`CrowtherGame` or `SmallGame`), then explore:

```
> LOOK          describe the current room (and hear it!)
> TAKE KEYS     pick something up
> INVENTORY     see what you carry
> IN / OUT / NORTH / SOUTH ...   move around
> HELP          full instructions
> QUIT          give up
```

Audio narration is on by default; to play silently, flip the flag in `Main.java` to `new AdventureGame(false)`.

## Credits

The core engine is inspired by classic adventure-game assignments by Eric Roberts and John Estell and adapted from an educational codebase; the Trolls system, audio narration wiring, and gameplay extensions are my own work.
