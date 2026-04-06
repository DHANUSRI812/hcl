class Discount{
    public static void main(String[] args){
    int n=7500;
    int b=0;
    if(n>2000){
        b=(n*10)/100;
        System.out.println(n + ": You get 10% discount of "+b);
    }else if(n>5000){
        b=(n*20)/100;
        System.out.println(n + ": You get 20% discount of "+b);
    }else{
        System.out.println(n +" No discount");
    }
}
}