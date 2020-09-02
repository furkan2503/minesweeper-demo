package no.kristiania.minesweeper;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsEmptyMineField(){
        assertArrayEquals(new String[] {"000", "000"}, displayMineField(new String[] {"...", "..."}));
    }

    private String[] displayMineField(String[] input) {
        return new String[0];
    }
}
