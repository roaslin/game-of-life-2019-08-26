import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GameOfLifeShould {

// two-dimensional orthogonal grid of square cells,
// each cell has eight neighbors, which are the cells that are horizontally, vertically or diagonally adjacent.
// two possible states: alive or dead
// 1. Any live cell with fewer than two live neighbors dies, as if by under population.
// 2. Any live cell with two or three live neighbors lives on to the next generation.
// 3. Any live cell with more than three live neighbors dies, as if by overpopulation.
// 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

// At each step in time, the following transitions occur:

// The initial pattern constitutes the 'seed' of the system.
// The first generation is created by applying the above rules simultaneously to every cell in the seed;
// ++ 'births and deaths occur simultaneously',
// and the discrete moment at which this happens is sometimes called a 'tick'.
// Each generation is a pure function of the preceding one.


    @Test
    public void have_a_cell() {
        Cell cell = new Cell(State.ALIVE);
        assertNotNull(cell);
    }
}
