
public class StudentDemo {

		public static void main(String[] args) {
			
			double[] scores1 = {75.0, 88.0, 91.0, 100.0};
			
			
			Student student1 = new Student("Reese", 1.7, "Computer Science", 50, scores1);
			Student student2 = new Student("Illiana", 3.8, "Chemistry", 90, scores1);
			Student student3 = new Student("Illiana", 3.8, "Chemistry", 90, scores1);

			
			Student[] student_list = { student1, student2, student3};
			for(Student s: student_list ) {
				System.out.println();
			}
			
			System.out.println(student1.getName());
			System.out.println(student1.getGPA());
			System.out.println(student1.getMajor());
			
			student1.determineYear();
			System.out.println(student1.getYear());
			
			
			student1.register();
			
			System.out.println();student1.computeAvgScores();
			
			//student1.setMajor("Math");
			//System.out.println(student1.getMajor());
			//System.out.println();
			//student1.printStudent();
			
			//student1.checkForProbation();
			
			//System.out.println(student2.getMajor());
			//student2.printStudent();
			
			
			
		}
		
		
}
