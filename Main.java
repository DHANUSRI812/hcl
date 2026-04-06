public class Main {
    public static void main(String[] args){
        float n=250;
        if(n>0 && n<=100){
            System.out.println("Rs: 0");
        }
        else if(n>=101 && n<=200){
            System.out.println("Rs: "+ (n * 0.8));
        }
        else if(n>=201 && n<=300){
            System.out.println("Rs: "+ (n * 1.5));
        }
        else{
            System.out.println("Rs: "+ (n * 3));
        }
    }
}
