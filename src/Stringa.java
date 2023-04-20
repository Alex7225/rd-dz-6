package src;

public class Stringa {
    String word = "Alexx9800";

public void prnt(){

    for (int i=0; i<word.length(); i++){
        if (i == 0){
            System.out.println(word.charAt(i));}
        else {
            if (word.charAt(i-1)!=word.charAt(i)){
               System.out.println(word.charAt(i));}
            }

        }
    }
}