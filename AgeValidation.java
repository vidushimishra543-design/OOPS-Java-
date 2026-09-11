public class AgeValidation(){
    public static void main(String[] args){
        Scanner sc = new scanner(System.in);
        int age = sc.nextInt();
        try{
        ageCheck(age);
        }
        catch(InvalidAgeException e){
            System.ot.println(e);
        } 
    }
    static void ageCheck(int a) throws InvalidAgeException
    {
        if(a<18) throw new InvalidAgeException("Age is invalid");
        System.out.println("Eligible for voting");
        
    }
    void ageCheck(int a){
        if(a<18) throw new InvalidAgeException("Age is invalid");   
    }
}
class InvalidAgeException extends Exception //checked exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
