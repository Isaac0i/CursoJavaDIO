package CollectionsTraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Interrogagion {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        List<String>  answers = new ArrayList<>();
        String answer;

        System.out.println("Answer all the questions whit Yes or No");
        System.out.println("Did you call to the victim? ");
        answer = scan.nextLine();
        answers.add(answer);

        System.out.println("Was at the crime scene? ");
        answer = scan.nextLine();
        answers.add(answer);

        System.out.println("lives near the victim? ");
        answer = scan.nextLine();
        answers.add(answer);

        System.out.println("Owed money to the victim? ");
        answer = scan.nextLine();
        answers.add(answer);

        System.out.println("Had worked with th victim? ");
        answer = scan.nextLine();
        answers.add(answer);

        int afirmations = 0;
        Iterator<String> iterator = answers.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.equalsIgnoreCase("Yes")) afirmations +=1;
        }

        if(afirmations == 2){
            System.out.println("You are suspect!");
        } else if(afirmations == 3 || afirmations == 4){
            System.out.println("You are accomplice!!");
        } else if(afirmations == 5){
            System.out.println("YOU ARE THE KILLER!!!");
        }

    }
}

