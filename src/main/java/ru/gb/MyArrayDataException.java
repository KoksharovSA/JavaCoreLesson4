package ru.gb;

public class MyArrayDataException extends MyArraySizeException{
    private final Point point;
    public MyArrayDataException(String message, Point point) {
        super(message + "; Координаты: (" + point.getI() + ";" + point.getI() + ")");
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
