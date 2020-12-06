package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import java.util.Arrays;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Cell rsl = bishop.position();
        Assert.assertEquals(Cell.A1, rsl);
    }

    @Test
    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.B5);
        Cell rsl = bishop.copy(Cell.D3).position();
        Assert.assertEquals(Cell.D3, rsl);
    }

    @Test
    public void testWay() {
    BishopBlack bishop = new BishopBlack(Cell.C1);
    Cell[] rsl = bishop.way(Cell.G5);
    Assert.assertEquals(Arrays.toString(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}), Arrays.toString(rsl));
    }

}