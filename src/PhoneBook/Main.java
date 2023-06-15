package PhoneBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    /*
    Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
    Фамилия Имя Отчество датарождения номертелефона пол

    Форматы данных:
    фамилия, имя, отчество - строки
    датарождения - строка формата dd.mm.yyyy
    номертелефона - целое беззнаковое число без форматирования
    пол - символ латиницей f или m.

    Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
    бросить исключение, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
    чем требуется.

    Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
    Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
    Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
    пользователю выведено сообщение с информацией, что именно неверно.

    Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну
    строку должны записаться полученные данные, вида <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

    Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
    Не забудьте закрыть соединение с файлом.
    Иванов Иван Иванович 01.01.2000 9008007001 m
    Петров Петр Петрович 02.01.2001 8007006001 m
    Иванов Сергей Петрович 03.01.2002 7006005001 m
    Сидорова Мария Петровна 04.01.2003 5006004001 f
     //        String str = "Ivanov Ivan Ivanovich 01.01.2000 9008007001 f";
         */
    public static void main(String[] args) {
        int size = 6;
        String[] arr = new String[size];
        int sizeOfBirthday = 3;
        String[] birthdayElements = new String [sizeOfBirthday];
        int sizeOfDDMM = 2;
        int sizeOfYYYY = 4;
        String str="";
        try {
            System.out.println("Введите через пробел:Фамилия Имя Отчество датарождения номертелефона пол");
            str = inputString();
        } catch (EmptyStringException e) {
            System.err.println(e.getMessage());
        }
        try {
            arr = getElements(str, size);
        } catch (ArraySizeIsLess | ArraySizeIsMore e) {
            System.err.println(e.getMessage());
        }


        try {
            birthdayElements = parseBirthday(arr[3],sizeOfBirthday);
//            for (String word : birthdayElements) {
//                System.out.println(word);
//            }
        } catch (BirthdaySizeIsLess | BirthdaySizeIsMore e) {
            System.err.println(e.getMessage());
        }

        try {
            getBirthdayDD(birthdayElements[0], sizeOfDDMM);
        } catch (BirthdayDDLengthIsLess | BirthdayDDLengthIsMore e) {
            System.err.println(e.getMessage());
        }

        try {
            getBirthdayMM(birthdayElements[1], sizeOfDDMM);
        } catch (BirthdayMMLengthIsLess | BirthdayMMLengthIsMore e) {
            System.err.println(e.getMessage());
        }
        try {
            getBirthdayYYYY(birthdayElements[2], sizeOfYYYY);
        } catch (BirthdayYYYYLengthIsLess | BirthdayYYYYLengthIsMore e) {
            System.err.println(e.getMessage());
        }


        try {
            getPhoneNumberFormat(arr[4]);
        } catch (PhoneNumberFormatException e) {
            System.err.println(e.getMessage());
        }
        try {
            getGender(arr[5]);
        } catch (GenderFormatException e) {
            System.err.println(e.getMessage());
        }

        Person person = new Person(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);

        String pathFile = person.surname.concat(".txt");

        try(FileWriter writer = new FileWriter(new File(pathFile),true);) {
            writer.write(String.valueOf(person));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public static String inputString() throws EmptyStringException{
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        if (str.length() ==0) {
            throw new EmptyStringException();
        }
        scanner.close();
        return str;
    }
    public static String[] getElements(String str, int size) throws ArraySizeIsLess, ArraySizeIsMore {
        String[] words = str.split(" ");
        if (words.length < size) {
            throw new ArraySizeIsLess(size);
        }
        if (words.length > size) {
            throw new ArraySizeIsMore(size);
        }
        return words;
    }

    public static String[] parseBirthday(String str,int size) throws BirthdaySizeIsLess, BirthdaySizeIsMore {

        String[] words = str.split("\\.");
        if (words.length < size) {
            throw new BirthdaySizeIsLess(size);
        }
        if (words.length > size) {
            throw new BirthdaySizeIsMore(size);
        }
        return(words);

    }

    public static boolean isNumber(String str) {
        return str.matches("\\d+");
    }

    public static void getBirthdayNumberFormat(String str) throws BirthdayNumberFormatException {
        if (!isNumber(str)){
            throw new BirthdayNumberFormatException();
        }
    }

    public static void getBirthdayDD(String str,int size) throws BirthdayDDLengthIsLess, BirthdayDDLengthIsMore {
        if (str.length() < size) {
            throw new BirthdayDDLengthIsLess(size);
        }
        if (str.length()> size) {
            throw new BirthdayDDLengthIsMore(size);
        }
    }
    public static void getBirthdayMM(String str,int size) throws BirthdayMMLengthIsLess, BirthdayMMLengthIsMore {
        if (str.length() < size) {
            throw new BirthdayMMLengthIsLess(size);
        }
        if (str.length()> size) {
            throw new BirthdayMMLengthIsMore(size);
        }
    }
    public static void getBirthdayYYYY(String str,int size) throws BirthdayYYYYLengthIsLess, BirthdayYYYYLengthIsMore {
        if (str.length() < size) {
            throw new BirthdayYYYYLengthIsLess(size);
        }
        if (str.length()> size) {
            throw new BirthdayYYYYLengthIsMore(size);
        }
    }
    public static void getPhoneNumberFormat(String str) throws PhoneNumberFormatException {
        if (!isNumber(str)){
            throw new PhoneNumberFormatException();
        }
    }

    public static void getGender(String str) throws GenderFormatException {
        if ((!(str.equals("f")))&& (!(str.equals("m")))){
            throw new GenderFormatException();
        }
    }



}






