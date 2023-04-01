import java.util.Scanner;
public class ReverseString
{
    Scanner input = new Scanner(System.in);
    String kelime;
    int i = 0;
    char[] harf;
    
    void enterWord() {
        System.out.print("Kelime giriniz : ");
        kelime = input.nextLine();
        System.out.println("Kelimenin uzunluğu : " + kelime.length());
        
        harf = new char[kelime.length()];
        
        for(char c : kelime.toCharArray()){
            harf[i] = c;
            i++;
        }
        
        System.out.print("\nYazılan kelime : " + String.valueOf(harf) + "\n");
    }
    
    void reverseWord() {
        System.out.print("Kelimenin tersi : ");
        for(int j = kelime.length()-1; j>=0; j--){
            System.out.print(harf[j]);
        }
    }
    
	public static void main(String[] args) {
        ReverseString dene = new ReverseString();
        dene.enterWord();
        dene.reverseWord();
        
	}
}