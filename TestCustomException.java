package _Custom_Exception;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class TestCustomException {
    static void validate(int age)throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is not valid for vote. ");
        }else{
            System.out.println("Welcome.. Age is valid for vote.");
        }
    }
    public static void main(String[] args) {
        try{
            validate(20);
        }catch(InvalidAgeException ex){
            System.out.println("Caught custom exception");
        }
    }
}
