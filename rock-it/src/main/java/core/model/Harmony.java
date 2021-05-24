package core.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Harmony {

    HARMONY_A1("a1", "A-b-Min", List.of("a12", "a2", "b1")),
    HARMONY_A2("a2", "E-b-Min", List.of("a1", "a3", "b2")),
    HARMONY_A3("a3", "B-b-Min", List.of("a2", "a4", "b3")),
    HARMONY_A4("a4", "F-Min", List.of("a3", "a5", "b4")),
    HARMONY_A5("a5", "C-Min", List.of("a4", "a6", "b5")),
    HARMONY_A6("a6", "G-Min", List.of("a5", "a7", "b6")),
    HARMONY_A7("a7", "D-Min", List.of("a6", "a8", "b7")),
    HARMONY_A8("a8", "A-Min", List.of("a7", "a9", "b8")),
    HARMONY_A9("a9", "E-Min", List.of("a8", "a10", "b9")),
    HARMONY_A10("a10", "B-Min", List.of("a9", "a11", "b10")),
    HARMONY_A11("a11", "F-#-Min", List.of("a10", "a12", "b11")),
    HARMONY_A12("a12", "D-b-Min", List.of("a11", "a1", "b12")),
    HARMONY_B1("b1", "B-Maj", List.of("b12", "b2", "a1")),
    HARMONY_B2("b2", "F-#-Maj", List.of("b1", "b2", "a2")),
    HARMONY_B3("b3", "D-b-Maj", List.of("b2", "b4", "a3")),
    HARMONY_B4("b4", "A-b-Maj", List.of("b3", "b5", "a4")),
    HARMONY_B5("b5", "E-b-Maj", List.of("b4", "b6", "a5")),
    HARMONY_B6("b6", "B-b-Maj", List.of("b5", "b7", "a6")),
    HARMONY_B7("b7", "F-Maj", List.of("b6", "b8", "a7")),
    HARMONY_B8("b8", "C-Maj", List.of("b7", "b9", "a8")),
    HARMONY_B9("b9", "G-Maj", List.of("b8", "b10", "a9")),
    HARMONY_B10("b10", "D-Maj", List.of("b9", "b11", "a10")),
    HARMONY_B11("b11", "A-Maj", List.of("b10", "b12", "a11")),
    HARMONY_B12("b12", "E-Maj", List.of("b11", "b1", "a12"));

    private final String id;
    private final String key;
    private final List<String> harmonieIDs;

    Harmony(String id, String key, List<String> harmonieIDs) {
        this.id = id;
        this.key = key;
        this.harmonieIDs = harmonieIDs;
    }

    public static Map<String, Harmony> initHarmoniesMap() {
        Map<String,Harmony> repo = new HashMap<>();

        repo.put(HARMONY_A1.getId(), HARMONY_A1);
        repo.put(HARMONY_A2.getId(), HARMONY_A2);
        repo.put(HARMONY_A3.getId(), HARMONY_A3);
        repo.put(HARMONY_A4.getId(), HARMONY_A4);
        repo.put(HARMONY_A5.getId(), HARMONY_A5);
        repo.put(HARMONY_A6.getId(), HARMONY_A6);
        repo.put(HARMONY_A7.getId(), HARMONY_A7);
        repo.put(HARMONY_A8.getId(), HARMONY_A8);
        repo.put(HARMONY_A9.getId(), HARMONY_A9);
        repo.put(HARMONY_A10.getId(), HARMONY_A10);
        repo.put(HARMONY_A11.getId(), HARMONY_A11);
        repo.put(HARMONY_A12.getId(), HARMONY_A12);

        repo.put(HARMONY_B1.getId(), HARMONY_B11);
        repo.put(HARMONY_B2.getId(), HARMONY_B2);
        repo.put(HARMONY_B3.getId(), HARMONY_B3);
        repo.put(HARMONY_B4.getId(), HARMONY_B4);
        repo.put(HARMONY_B5.getId(), HARMONY_B5);
        repo.put(HARMONY_B6.getId(), HARMONY_B6);
        repo.put(HARMONY_B7.getId(), HARMONY_B7);
        repo.put(HARMONY_B8.getId(), HARMONY_B8);
        repo.put(HARMONY_B9.getId(), HARMONY_B9);
        repo.put(HARMONY_B10.getId(), HARMONY_B10);
        repo.put(HARMONY_B11.getId(), HARMONY_B11);
        repo.put(HARMONY_B12.getId(), HARMONY_B12);
        return repo;
    }

    private String getId() {
        return this.id;
    }

    public String getKey() {
        return key;
    }

    public List<String> getHarmonieIDs() {
        return harmonieIDs;
    }

    /*
    public static List<Harmony> initHarmoniesList() {
        return List.of(
                HARMONY_A1,
                HARMONY_A2,
                HARMONY_A3,
                HARMONY_A4,
                 HARMONY_A5,
                 HARMONY_A6,
                 HARMONY_A7,
                 HARMONY_A8,
                 HARMONY_A9,
                HARMONY_A10,
                HARMONY_A11,
                HARMONY_A12,
                HARMONY_B1,
                HARMONY_B2,
                HARMONY_B3,
                HARMONY_B4,
                HARMONY_B5,
                HARMONY_B6,
                HARMONY_B7,
                HARMONY_B8,
                HARMONY_B9,
                HARMONY_B10,
                HARMONY_B11,
                HARMONY_B12
        );
    }
    */
}
