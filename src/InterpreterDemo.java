// Task 3
public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");

        Expression isJavaOrPython = new OrExpression(isJava, isPython);

        Expression isJavaAndPython = new AndExpression(isJava, isPython);

        System.out.println("Does context contain Java or Python?");
        System.out.println(isJavaOrPython.interpret("I love Java"));
        System.out.println(isJavaOrPython.interpret("I love Python"));
        System.out.println(isJavaOrPython.interpret("I love C++"));

        System.out.println("Does context contain both Java and Python?");
        System.out.println(isJavaAndPython.interpret("I love Java and Python"));
        System.out.println(isJavaAndPython.interpret("I love Java"));
        System.out.println(isJavaAndPython.interpret("I love Python"));
    }
}