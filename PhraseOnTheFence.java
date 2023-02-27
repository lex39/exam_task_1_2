import java.util.Scanner;

public class PhraseOnTheFence {

  public static void main(String[] args) {

    int finalCharLength = 15 / 3 * 62;
    int finalSpaceLength = 12 * 3;
    int phraseLength = finalCharLength + finalSpaceLength;

    System.out.println("Введите длину забора в сантиметрах: ");
    int input = new Scanner(System.in).nextInt();

    System.out.println((input >= phraseLength) ? "Длины забора хватит для фразы!" : "Длины забора НЕ хватит чтобы написать фразу!");
  }
}
