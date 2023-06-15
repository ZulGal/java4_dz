package PhoneBook;

public class ArraySizeIsLess extends Exception{
    public ArraySizeIsLess(String message) {
        super(message);
    }

    public ArraySizeIsLess(int size) {
        this(String.format("Количество элементов меньше %d",size));
    }


}
