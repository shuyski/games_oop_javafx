package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    public FigureNotFoundException(String mess) {
        System.out.println(mess);
    }
}
