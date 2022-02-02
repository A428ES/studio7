import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, ArrayList<String> answers, ArrayList<String> options) {
        super(question, answers, options);
    }


    public void displayOptions(){
        for(int i = 0;i<this.getOptions().size();i++){
            System.out.println("Option " + (i+1) + ": " + this.getOptions().get(i));
        }
    }

    public void getAnswerInput(){
        System.out.println("Please enter your answer: ");
        Scanner input = new Scanner(System.in);

        this.addAnswer(input.nextLine());
    }
}
