//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения
//MyArraySizeException и MyArrayDataException и вывести результат расчета.
package ru.gb;

public class Main {
    public static void main(String[] args) {
        String[][] test1 = {
                {"1","2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] test2 = {
                {"1","2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "error"},
                {"13", "14", "15", "16"}};
        String[][] test3 = {
                {"1","2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}};
        try {
            System.out.println(MyArrayClass.sumElementsArray(test1));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(MyArrayClass.sumElementsArray(test2));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(MyArrayClass.sumElementsArray(test3));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}