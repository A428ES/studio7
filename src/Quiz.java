import java.util.*;

public class Quiz{
    private ArrayList<Question> quizQuestions = new ArrayList<>();

    public void addQuestion(Question question){
        quizQuestions.add(question);
    }

    public void runQuiz(){
        for(int i = 0;i<quizQuestions.size();i++){
            quizQuestions.get(i).printQuestion();
            quizQuestions.get(i).displayOptions();
            quizQuestions.get(i).getAnswerInput();
        }
    }

    public double gradeQuiz(){
        double totalQuestions = quizQuestions.size();
        double correctAnswers = 0;

        for(int i = 0;i<totalQuestions;i++){
            if(quizQuestions.get(i).evaluateQuestion() == true){
                correctAnswers++;
            }
        }

        return correctAnswers/totalQuestions;
    }
}
