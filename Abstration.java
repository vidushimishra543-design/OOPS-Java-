public class Abstration {
    public static void main(String[] args){
        Payment obj=new UPI()
        Payment.display()
        obj.makePayement()
        Payment obj1=new UPI()
        obj1.makePayement()
    }
}

interface Payment {
    int a = 10;

    void makePayment();// this method is abstract and public

    static void display(){
        System.out.println(x: "payment successful");
    }
}

class UPI implements payment(){

    @Override //its an annotation to hint compiler 
    public void makePayment(){

        System.out.println(x:"Payment using UPI")

    }
}

class CreditCard implements payment(){

    @Override //its an annotation to hint compiler 
    public void makePayment(){

        System.out.println(x:"Payment using Credit Card")

    }
}