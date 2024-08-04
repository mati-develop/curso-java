package Arrays;

public class Length {
    public static void main(String[] args) {

        // Create an array with 3 elements
        int[] numbers = { 1, 2, 3, 5, 6, 10, 22 };
        int lengthNumbers = numbers.length;

        System.out.println("LENGHT: " + lengthNumbers);

        // Calculate the average age of the company
        int[] employeesAges = { 20, 30, 40, 25, 43, 50, 36, 45, 70, 54 };
        int employeesAgesLength = employeesAges.length;
        System.out.println("CANTIDAD EMPLEADOS: " + employeesAgesLength);

        // Sum all the ages of the employees
        int acc = 0;
        for(int i = 0; i < employeesAgesLength; i++) {
            acc = acc + employeesAges[i]; // 0+20 | 20+30 | 50+40 = 90
        }
        System.out.println("PROMEDIO EDAD: " + acc/employeesAgesLength);
    }
}