import java.util.Scanner;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

public class Ex2 {
    public static void main (String[] args) {
        String name = inputName();
        System.out.println("Привет,"+ name +"");
    }
    public static String inputName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Представьтесь: ");
        String name = in.nextLine(); 
        in.close();
        return name;
    }
}