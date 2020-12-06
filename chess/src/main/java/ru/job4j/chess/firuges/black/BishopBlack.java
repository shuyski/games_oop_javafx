package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static java.lang.Math.abs;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position(), dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int size = abs(position().getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = (position().getX() < dest.getX()) ? 1 : -1;
        int deltaY = (position().getY() < dest.getY()) ? 1 : -1;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(position().getX() + deltaX * (index + 1), position().getY() + deltaY * (index + 1));
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return (abs(position().getX() - dest.getX())) == abs((position().getY() - dest.getY()));
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}