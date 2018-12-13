/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author Poozer
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student model  = retriveStudentFromDatabase();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("Bort");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Bort");
      student.setRollNo("22");
      return student;
   }
}
