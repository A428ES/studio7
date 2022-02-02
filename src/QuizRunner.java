import java.util.*;

public class QuizRunner {
    public static void main(String[] args){
        Quiz myQuiz = new Quiz();
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Garfield", "Salem", "Cheshire", "Tom"));
        ArrayList<String> correctAns1 = new ArrayList<>(Arrays.asList("Garfield","Salem"));
        Checkbox newQuestion1 = new Checkbox( "Who is the best cat in the world?", correctAns1, possAns1);
        myQuiz.addQuestion(newQuestion1);


        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Doc", "Tillie", "Gizmo", "Benji", "Nala"));
        ArrayList<String> correctAns2 = new ArrayList<>(Arrays.asList("Tillie"));
        MultipleChoice newQuestion2 = new MultipleChoice( "Who won the Halloween Costume Contest?", correctAns2, possAns2);


        myQuiz.addQuestion(newQuestion2);

        ArrayList<String> possAns3 = new ArrayList<>(Arrays.asList("true", "false"));
        ArrayList<String> correctAns3 = new ArrayList<>(Arrays.asList("true"));
        TrueFalse newQuestion3 = new TrueFalse( "Are all dogs the best?", correctAns3, possAns3);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        System.out.println(myQuiz.gradeQuiz() * 100);
    }
}
