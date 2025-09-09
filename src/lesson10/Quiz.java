package lesson10;


import java.util.Scanner;

// question class
class Question{

    // variables
    int id ;
    String q ;
    String opt1 ;
    String opt2 ;
    String opt3 ;
    String opt4 ;
    String ans ;

    // methods
    @Override
    public String toString() {
        return id + "> " + q + "\na. " + opt1 + "\nb. " + opt2 + "\nc. " + opt3 + "\nd. " + opt4 ;
    }
}

class QuizService{

    // variables
    final private Question[] questions ;
    private int score = 0 ;
    Scanner input = new Scanner(System.in) ;

    // constructor
    public QuizService(Question[] questions) {
        this.questions = questions ;
    }

    // methods
    public void playQuiz(){
        for(Question q : questions){
            System.out.println(q);


            String choice ;
            System.out.println("(a/b/c/d): ");
            choice = input.nextLine() ;
            if (choice.equals(q.ans)){
                System.out.println("correct!!");
                score++ ;
            }
            else {
                System.out.println("wrong..");
            }
        }
    }
    public void showScore(){
        System.out.println("your score : " + score);
    }
}

public class Quiz {
    public static void main(String[] args) {

        // creating an array of questions
        Question[] quizQuestions = new Question[5] ;

        // Q1
        quizQuestions[0] = new Question();
        quizQuestions[0].id = 1 ;
        quizQuestions[0].q = "Which keyword is used to inherit a class in Java?";
        quizQuestions[0].opt1 = "extends";
        quizQuestions[0].opt2 = "implements";
        quizQuestions[0].opt3 = "inherits";
        quizQuestions[0].opt4 = "instanceof";
        quizQuestions[0].ans = "a" ;

        // Q2
        quizQuestions[1] = new Question();
        quizQuestions[1].id = 2 ;
        quizQuestions[1].q = "Which method is the entry point of any Java program?";
        quizQuestions[1].opt1 = "start()";
        quizQuestions[1].opt2 = "main()";
        quizQuestions[1].opt3 = "run()";
        quizQuestions[1].opt4 = "execute()";
        quizQuestions[1].ans = "b" ;

        // Q3
        quizQuestions[2] = new Question();
        quizQuestions[2].id = 3 ;
        quizQuestions[2].q = "Which of these is not a Java access modifier?";
        quizQuestions[2].opt1 = "public";
        quizQuestions[2].opt2 = "protected";
        quizQuestions[2].opt3 = "private";
        quizQuestions[2].opt4 = "friendly";
        quizQuestions[2].ans = "d" ;

        // Q4
        quizQuestions[3] = new Question();
        quizQuestions[3].id = 4 ;
        quizQuestions[3].q = "Which of these is used to handle exceptions in Java?";
        quizQuestions[3].opt1 = "goto";
        quizQuestions[3].opt2 = "try-catch";
        quizQuestions[3].opt3 = "finalize";
        quizQuestions[3].opt4 = "throwable";
        quizQuestions[3].ans = "b" ;

        // Q5
        quizQuestions[4] = new Question();
        quizQuestions[4].id = 5 ;
        quizQuestions[4].q = "Which collection class allows duplicate elements?";
        quizQuestions[4].opt1 = "HashSet";
        quizQuestions[4].opt2 = "TreeSet";
        quizQuestions[4].opt3 = "ArrayList";
        quizQuestions[4].opt4 = "None of the above";
        quizQuestions[4].ans = "c" ;

        // creating a quiz service
        QuizService service = new QuizService(quizQuestions) ;

        // starting the quiz
        service.playQuiz();

        // showing the result
        service.showScore();
    }
}

