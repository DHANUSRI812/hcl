class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = "admin";
        for(int i = 0; i < 3; i++) {
            String pass = sc.nextLine();
            if(pass.equals(correct)) {
                System.out.println("Login Granted");
                return;
            }
        }
        System.out.println("Blocked");
    }
}