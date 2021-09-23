package Question1;
/*
    Question number 1
 */
public class QuestionOne {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Question number one ");
        QuestionOne questionOneObj = new QuestionOne();
        System.out.println(
                "Roots of a quadratic equation: "+questionOneObj.calculateQuadraticEquations(1,4,3)
        );
    }

    public String calculateQuadraticEquations(int a, int b, int c){
        String ans = "";
        double determinant = (b*b)-(4*a*c);
        double determinantsSquareRoot = Math.sqrt(determinant);
        double denominator = 2*a;
        double positiveRoot = (-b + determinantsSquareRoot)/denominator;
        double negativeRoot = (-b - determinantsSquareRoot)/denominator;
        if(determinant>0){
            ans = "ans 1 : "+ positiveRoot+" ans 2 : "+negativeRoot;
        }
        else if(determinant == 0){
            ans = "ans: "+positiveRoot;
        }
        else{
            ans = "solution not imaginary";
        }

        return ans;
    }
}
