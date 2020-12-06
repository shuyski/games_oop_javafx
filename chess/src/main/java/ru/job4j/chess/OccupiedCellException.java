package ru.job4j.chess;

public class OccupiedCellException extends Exception {
    public OccupiedCellException() {
    }

    public OccupiedCellException(String mess) {
        System.out.println(mess);
    }
}
