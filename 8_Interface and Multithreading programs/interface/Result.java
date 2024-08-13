
package abc;


 class Result extends Test implements Sports 
 {
    private double total;
    
    public void displayDetails()
    {
        total=m1+m2+score;
        
        getRoll();
        getMarks();
        getScore();
        
        System.out.println("Total Marks are "+total);
    }
    //It overrides the getScore() of interface Sports
    public void getScore()
    {
        System.out.println("Sports Score"+score);
    }
 }
