public class EmployeeTest {
	
	/**
	 * @author Sersi
	 * @param args
	 */

	/**
	 * Classe Test de Employee
	 */
	
   public static void main(String[] args) {
      Employee mal = 
         new Employee("Nathan Fillion", 25000.0);
      System.out.println("mal's salary: " + 
         mal.getSalary());
      mal.raiseSalary(10);
      System.out.println("mal's salary: " + 
         mal.getSalary());
      mal.raiseSalary(10);
      System.out.println("mal's salary: " + 
         mal.getSalary());
      mal.setSalary(40000.0);
      System.out.println("mal's salary: " + 
         mal.getSalary());

      Employee zoe = 
         new Employee("Gina Torres", 15000.0);
      System.out.println("zoe's salary: " + 
         zoe.getSalary());
      zoe.raiseSalary(5);
      System.out.println("mal's salary: " + 
         zoe.getSalary());
      zoe.raiseSalary(5);
      System.out.println("mal's salary: " + 
         zoe.getSalary());

      Employee river = 
         new Employee("Summer Glau", 22222.22);
      System.out.println("river's salary: " + 
         river.getSalary());
      System.out.println(river);

      Employee jayne = 
         new Employee("Adam Baldwin", 27000.0);
      System.out.println(jayne);
   }
}