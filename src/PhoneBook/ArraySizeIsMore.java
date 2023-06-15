package PhoneBook;

public class ArraySizeIsMore extends Exception{
    public ArraySizeIsMore(String message) {
        super(message);
    }
    public ArraySizeIsMore(int size) {
        this(String.format("Количество элементов больше %d",size));
    }

}

