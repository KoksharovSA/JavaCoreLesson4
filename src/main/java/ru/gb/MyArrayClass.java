package ru.gb;

public class MyArrayClass {
    public static int sumElementsArray(String[][] arr) throws MyArraySizeException {
        int result = 0;
        if (arr.length != 4 || arr[0].length != 4) throw new MyArraySizeException("Не верный размер массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(e.getMessage(), new Point(i, j));
                }
            }
        }
        return result;
    }
}
