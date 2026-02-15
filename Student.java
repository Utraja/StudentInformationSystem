

public class Student {
        private String name;
        private int age;
        private double grade;
        private String studentId;
        private String contact;

        public Student(String name, int age, double grade, String studentId, String contact) {
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.studentId = studentId;
            this.contact = contact;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public void display() {
            System.out.printf("%-10s %-15s %-5d %-7.2f %-20s\n",
                    studentId, name, age, grade, contact);
        }
    }

