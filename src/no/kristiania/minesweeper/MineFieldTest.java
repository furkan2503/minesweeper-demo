package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsEmptyMineField(){
        assertArrayEquals(new String[] {"000", "000"}, displayMinefield(new String[] {"...", "..."} ));
    }

    @Test
    void isShowCorrectNumberOfRows(){
        assertArrayEquals(
                new String[] {"000", "000", "000"},
                displayMinefield(new String[] {"...", "...", "000"} )
        );
    }
    @Test
    void isShowCorrectNumberOfColumns(){
        assertArrayEquals(
                new String[] { "0000" },
                displayMinefield(new String[] {"...."} )
        );
    }
    @Test
    void isShowsMines(){
        assertArrayEquals(
                new String[] { "***" },
                displayMinefield(new String[] {"***"} )
        );
    }

    private String[] displayMinefield(String[] input) {
        return new MineField(input).displayMinefield();
    }
    @Test
    void itsShowsHintRightOfMine() {
        assertArrayEquals(
                new String[] { "*10" },
                displayMinefield(new String[] { "*.." })
        );
    }
}
