class GradeSwitch {
    public static void main(String[] args) {
        int marks = 85;
        char grade;
        switch (marks / 10) {
            case 9:
                grade = 'O';
                break;
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}