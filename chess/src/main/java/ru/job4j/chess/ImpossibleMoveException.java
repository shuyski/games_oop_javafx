package ru.job4j.chess;

public class ImpossibleMoveException extends Exception {
    public ImpossibleMoveException(String mess) {
        System.out.println(mess);
    }
}
