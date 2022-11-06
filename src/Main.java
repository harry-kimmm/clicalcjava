import java.util.Scanner;

class Calculator {
    public String addition(int a, int b) {
        int result = a + b;
        return a + " + " + b + " = " + result;
    }
    public String subtraction(int a, int b) {
        int result = a - b;
        return a + " - " + b + " = " + result;
    }
    public String multiplication(int a, int b) {
        int result = a * b;
        return a + " * " + b + " = " + result;
    }
    public String division(float a, float b) {
        float result = a / b;
        return a + " / " + b + " = " + result;
    }
    public String factorial(double a){
        double num = a;
        double result = 1;
        for (int i = 1; i <= num; i++){
            result = result * i;
        }

        return num + "! = " + result;
    }
    static int fibonacci(int a)
    {
        if (a <= 1)
            return a;
        return fibonacci(a - 1) + fibonacci(a - 2);
    }


    public static void main(String[] args) {
        String again = "test";
        Scanner op = new Scanner(System.in);
        Scanner firstnum = new Scanner(System.in);
        Scanner secnum = new Scanner(System.in);
        Calculator obj = new Calculator();

        while (again != "End") {
            System.out.print(
                    "Enter an operation ([1] addition, [2] subtraction, [3] multiplication, [4] division, [5] factorial, [6] fibonacci): ");
            String operation = op.nextLine();
            if (operation.equals("1") || operation.equals("2") || operation.equals("3") || operation.equals("4")) {
                System.out.print("Enter a number: ");
                int num1 = firstnum.nextInt();
                System.out.print("Enter second number: ");
                int num2 = secnum.nextInt();
                if (operation.equals("1")) {
                    System.out.println(obj.addition(num1, num2));
                }
                if (operation.equals("2")) {
                    System.out.println(obj.subtraction(num1, num2));
                }
                if (operation.equals("3")) {
                    System.out.println(obj.multiplication(num1, num2));
                }
                if (operation.equals("4")) {
                    System.out.println(obj.division(num1, num2));
                }
            }

            if (operation.equals("5") || operation.equals("6"))
            {
                System.out.print("Enter a number: ");
                double num1 = firstnum.nextInt();
                if (operation.equals("5"))
                {
                    System.out.println(obj.factorial(num1));
                }
                if (operation.equals("6")){
                    for (int i = 1; i <= num1; i ++){
                        System.out.print(fibonacci(i) + " ");
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}