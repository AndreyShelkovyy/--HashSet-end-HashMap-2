import java.util.Scanner;

public class Main {
    //заводим статическое поле с текстом
    protected static String text = "Lorem ipsum dolor sit amet, consectetur " +
            "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore " +
            "magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
            "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
            "mollit anim id est laborum.";

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово для поиска (для выхода end):");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            WordsChecker wordsChecker = new WordsChecker(text);
                        System.out.println("Есть ли в тексте слово:" + (wordsChecker.hasWord(input) ? "да" : "нет"));
            
        }



//        System.out.println("Есть ли в тексте слово Lorem? " + (wordsChecker.hasWord("Lorem") ? "да" : "нет"));
//        System.out.println("Есть ли в тексте слово Воробей? " + (wordsChecker.hasWord("Воробей") ? "да" : "нет"));
    }


}