import java.util.regex.Pattern;

public class EmailSamplesValidation {
    public void email1(String value){
        if(Pattern.matches("^([a-z0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+" Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+" Email is Invalid");
        }
    }
    public void email2(String value){
        if(Pattern.matches("^([a-z-0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+ " Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+" Email is Invalid");
        }
    }

    public void email3(String value){
        if(Pattern.matches("^([a-z.0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+ "Email is Invalid");
        }
    }

    public void email4(String value){
        if(Pattern.matches("^([a-z0-9]+)@([a-z]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+ "Email is Invalid");
        }
    }

    public void email5(String value){
        if(Pattern.matches("^([a-z.0-9]+)@([a-z]+).([a-z]{2,8}).([a-z]{2,3})$",value)){
            System.out.println(value + "--->>> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "--->>> This "+ "Email is Invalid");
        }
    }

    public void email6(String value){
        if(Pattern.matches("^([a-z]+)@([0-9]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+ "Email is Invalid");
        }
    }

    public void email7(String value){
        if(Pattern.matches("^([a-z]+)@([a-z0-9]+).([a-z]{2,8}).([a-z]{2,4})$",value)){
            System.out.println(value + "---> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+ "Email is Invalid");
        }
    }

    public void email8(String value){
        if(Pattern.matches("^([a-z+0-9]+)@([a-z0-9]+).([a-z]{2,8})$",value)){
            System.out.println(value + "---> This "+ "Email is Valid");
        }
        else {
            System.out.println(value + "---> This "+ "Email is Invalid");
        }
    }




    public static void main(String[] args) {

        EmailSamplesValidation emailsample = new EmailSamplesValidation();

        emailsample.email1("abc@yahoo.com");
        emailsample.email2("abc-100@yahoo.com");
        emailsample.email3("abc.100@yahoo.com");
        emailsample.email4("abc111@abc.com");
        emailsample.email5("abc.100@abc.com.au");
        emailsample.email6("abc@1.com");
        emailsample.email7("abc@gmail.com.com");
        emailsample.email8("abc+100@gmail.com");
    }
}
