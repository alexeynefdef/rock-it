package core.model;

import java.util.List;

public enum Note {

    C("C",List.of("C","D","E","F","G","A","B","C"),List.of("C","D","Eb","F","G","Ab","Bb","C")),
    C_SHARP("C#",List.of("C#","D#","E#","F#","G#","A#","B#","C#"),List.of("C#","D#","E","F#","G#","A","B","C#")),
    D_FLAT("Db",List.of("Db","Eb","F","Gb","Ab","Bb","C","Db"),List.of("Db","Eb","Fb","Gb","Ab","A","Cb","Db")),
    D("D",List.of("D","E","F#","G","A","B","C#","D"),List.of("D","E","F","G","A","Bb","C","D")),
    E_FLAT("Eb",List.of("Eb","F","G","Ab","Bb","C","D","Eb"),List.of("Eb","F","Gb","Ab","Bb","Cb","Db","Eb")),
    E("E",List.of("E","F#","G#","A","B","C#","D#","E"),List.of("E","F#","G","A","B","C","D","E")),
    F("F",List.of("F","G","A","Bb","C","D","E","F"),List.of("F","G","Ab","Bb","C","Db","Eb","F")),
    F_SHARP("F#",List.of("F#","G#","A#","B","C#","D#","E#","F#"),List.of("F#","G#","A","B","C#","D","E","F#")),
    G_FLAT("Gb",List.of("Gb","Ab","Bb","Cb","Db","Eb","F","Gb"),List.of("Gb","Ab","A","Cb","Db","D","Fb","Gb")),
    G("G",List.of("G","A","B","C","D","E","F#","G"),List.of("G","A","Bb","C","D","Eb","F","G")),
    A_FLAT("Ab",List.of("Ab","Bb","C","Db","Eb","F","G","Ab"),List.of("Ab","Bb","Cb","Db","Eb","Fb","Gb","Ab")),
    A("A",List.of("A","B","C#","D","E","F#","G#","A"),List.of("A","B","C","D","E","F","G","A")),
    B_FLAT("Bb",List.of("Bb","C","D","Eb","F","G","A","Bb"),List.of("Bb","C","Db","Eb","F","Gb","Ab","Bb")),
    B("B",List.of("B","C#","D#","E","F#","G#","A#","B"),List.of("B","C#","D","E","F#","G","A","B")),
    C_FLAT("Cb",List.of("Cb","Db","Eb","Fb","Gb","Ab","Bb","Cb"),List.of("Cb","Db","D","Fb","Gb","G","A","Cb"));


    private final String note;
    private final List<String> majorScale;
    private final List<String> naturalMinorScale;
    //private final List<String> melodicMinorScale;
    //private final List<String> harmonicMinorScale;
    //TODO: Add other scales (dorian, lydian etc.)

    Note(String note, List<String> majorScale, List<String> naturalMinorScale) {
        this.note = note;
        this.majorScale = majorScale;
        this.naturalMinorScale = naturalMinorScale;
    }

    public String getNote() {
        return note;
    }

    public List<String> getMajorScale() {
        return majorScale;
    }

    public List<String> getNaturalMinorScale() {
        return naturalMinorScale;
    }
}
