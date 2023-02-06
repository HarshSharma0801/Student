public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAstudent s = new LPAstudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S923006","RON","05/11/2004",
                "Java Masterclass");
        LPAstudent recoredStudent = new LPAstudent("S923007","TOM","05/11/2004",
                "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recoredStudent);
        System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
        System.out.println(recoredStudent.name()+" is taking "+recoredStudent.classList());



    }
}
