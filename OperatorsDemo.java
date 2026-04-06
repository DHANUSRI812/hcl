class OperatorsDemo {
    public static void main(String[] args) {
    int a=4;
    int b=6;
    //arithmetic operator   
    System.out.println("Addition: " + (a+b));
    System.out.println("Subtraction: " + (a-b));
    System.out.println("Multiplication: " + (a*b));
    System.out.println("Division: " + (a/b));
    System.out.println("Modulus: " + (a%b));
    System.out.println("Pre Increment: " + (a++));
    System.out.println("Post Decrement: " + (b--));  
    System.out.println("Pre Increment: " + (++a));
    System.out.println("Post Decrement: " + (--b));
    //Relational operator
    System.out.println("Greater than: " + (a>b));
    System.out.println("Less than: " + (a<b));
    System.out.println("Greater than or equal to: " + (a>=b));
    System.out.println("Equal to: " + (a==b));
    //Assignment operator
    System.out.println("Addition assignment: " + (a+=b));
    System.out.println("Subtraction assignment: " + (a-=b));
    System.out.println("Multiplication assignment: " + (a*=b));
    System.out.println("Division assignment: " + (a/=b));
    System.out.println("Modulus assignment: " + (a%=b));
    //Bitwise operator
    System.out.println("Bitwise AND: " + (a&b));
    System.out.println("Bitwise OR: " + (a|b));
    System.out.println("Bitwise XOR: " + (a^b));
    System.out.println("Bitwise NOT: " + (~a));
    System.out.println("Left shift: " + (a<<2));
    System.out.println("Right shift: " + (a>>2));
    //Logical operator
    System.out.println(a>3 && b<10);
    System.out.println(a>3 || b<10);    
    System.out.println(!(a>3 && b<10));
    System.out.println(!(a>3 || b<10));
    System.out.println(a>3 ^ b<10);
    System.out.println(a>3 ^ b>10);
    //Ternary operator
    int max = (a > b) ? a : b;
    System.out.println("Maximum value: " + max);
        }
}