import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    public Checkbox(String question, ArrayList<String> answers, ArrayList<String> options) {
        super(question, answers, options);
    }

    public void getAnswerInput(){
        System.out.println("This question may contain more than one correct answer. Once you have made your selections, enter 0 to submit the question.");
        Scanner input = new Scanner(System.in);
        String userInput;

        for(int i = 0;i<this.getOptions().size();i++){
            System.out.println("Please enter your answer(0 to finish question):");
            userInput = input.nextLine();

            if(userInput.equals("0")){
                break;
            }

            this.addAnswer(userInput);
        }

    }


    public void displayOptions(){
        for(int i = 0;i<this.getOptions().size();i++){
            System.out.println("Option " + (i+1) + ": " + this.getOptions().get(i));
        }
    }
}
