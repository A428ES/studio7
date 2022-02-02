import java.util.*;

public class TrueFalse extends Question{

    public TrueFalse(String question, ArrayList<String> answers, ArrayList<String> options) {
        super(question, answers, options);
    }

    public void getAnswerInput(){
        Scanner input = new Scanner(System.in);
        this.addAnswer(input.nextLine());
    }


    public void displayOptions(){
        System.out.println("Please enter your answer as True or False");
    }
}
