public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        private  String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }

        private int getStudentId() {
                return studentId;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        private int getNumberOfCredits() {
              return numberOfCredits;
        }
        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        private double getGpa() {
                return gpa;
        }
        public void setGpa(int gpa) {
                this.gpa = gpa;
        }

}
