package core.model;
status
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @Test
    public void testGetNote1() {
        assertEquals(Note.A.getNote(),"A");
    }

    @Test
    void testGetNote2() {
        assertNotEquals(Note.D.getNote(),"B");
    }

    @Test
    void testGetNote3() {
        assertEquals(Note.B_FLAT.getNote(),"Bb");
    }

    @Test
    void getMajorScale() {
        List<String> ebToTest = List.of("Eb","F","G","Ab","Bb","C","D","Eb");
        assertEquals(Note.E_FLAT.getMajorScale(),ebToTest);
    }

    @Test
    void getNaturalMinorScale() {
        List<String> fMinToTest = List.of("F","G","Ab","Bb","C","Db","Eb","F");
        assertEquals(Note.F.getNaturalMinorScale(),fMinToTest);
    }
}
