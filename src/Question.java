import java.util.*;

public abstract class Question {
    private String questionText;
    private ArrayList<String> quizAnswers = new ArrayList<>();
    private ArrayList<String> quizOptions = new ArrayList<>();
    private ArrayList<String> userAnswers = new ArrayList<>();

    public Question(String question, ArrayList<String> answers, ArrayList<String> options){
        this.questionText = question;
        this.quizAnswers = answers;
        this.quizOptions = options;
    }

    public ArrayList<String> getAnswers(){
        return this.quizAnswers;
    }

    public ArrayList<String> getOptions(){
        return this.quizOptions;
    }

    public void addAnswer(String answer){
        this.userAnswers.add(answer);
    }

    public void printQuestion(){
        System.out.println(this.questionText);
    }

    public boolean evaluateQuestion(){
        int correctAnswers = 0;

        for(int i = 0;i<this.getAnswers().size();i++){
            if(userAnswers.indexOf((getAnswers().get(i))) != -1){
                correctAnswers++;
            }
        }

        if(correctAnswers == getAnswers().size()){
            return true;
        } else {
            return false;
        }
    }

    public abstract void getAnswerInput();

    public abstract void displayOptions();
}
