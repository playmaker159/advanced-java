import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnno {
    String str();
    int val();
}
class Demo {
    @CustomAnno(str = "Meow", val = 10)

    public static void myMeth(){
        Demo object = new Demo();
        try{
            CustomAnno m = object.getClass().getMethod("myMeth").getAnnotation(CustomAnno.class);
            System.out.println("String: " + m.str() + " Value: " + m.val());

        }catch(Exception e){
            System.out.println("No such method");
        }
    }
    public static void main(String args[]){
        myMeth();
    }
    
}