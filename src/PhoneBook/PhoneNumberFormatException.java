package PhoneBook;

public class PhoneNumberFormatException extends Exception{
    public PhoneNumberFormatException() {
        super("В номере телефона не цифра");
    }
}
