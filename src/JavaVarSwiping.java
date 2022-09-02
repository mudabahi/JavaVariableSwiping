public class JavaVarSwiping {
    public static void main(String[] args) {


//        Initial a variable
        int a, b, c;
        a = 10;
        b = 20;


//        Before Swiping a variable
        System.out.println("Before swiping a variable "+a);
        System.out.println("Before swiping a variable "+b);

//        After Swiping
        c = a; // We store a in c variable
//        Now we change b on a and c on b

        a = b;
        b = c;

        System.out.println("After swiping a variable " + a);
        System.out.println("After swiping a variable " + b);
    }
}
