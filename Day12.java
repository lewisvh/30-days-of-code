class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
      super(firstName, lastName, id);
      this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
      int total = 0;
      char grade;
      for(int i = 0; i<this.testScores.length; i++){
        total += this.testScores[i];
      }
      total = (total/this.testScores.length);
      
      if(total>=90 && total<=100)
        grade = 'O';
      else if(total<90 && total>=80)
        grade = 'E';
      else if(total<80 && total>=70)
        grade = 'A';
      else if(total<70 && total>=55)
        grade = 'P';
      else if(total<55 && total>=40)
        grade = 'D';
      else
        grade = 'T';
      
      return grade;
    }
}