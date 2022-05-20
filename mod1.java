
// Read at ownRisk

//By Adithya Pai


class module1AnutShell {

    /* Chapter 1 Enums */

    /* An Enumuration in the simplest form is a list of constant values */

    /* Syntax */

    /*
     * 
     * enum EnumVariableName{
     * EnumVariable1,
     * EnumVariable2,
     * EnumVariable3,
     * EnumVariable4,
     * EnumVariable5;
     * 
     * }
     * 
     */

    /* Eg: */

    enum days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;

    }

    /* Syntax with constructor */

    /*
     * 
     * enum EnumVariableName{
     * EnumVariable1,
     * EnumVariable2,
     * EnumVariable3,
     * EnumVariable4,
     * EnumVariable5;
     * 
     * privat final int value;
     * 
     * EnumVariableName(int value){
     * this.value = value;
     * }
     * 
     * 
     * }
     * 
     */

    /* Eg: */

    public enum Days {
        Monday(1),
        Tuesday(2),
        Wednesday(3),
        Thursday(4),
        Friday(5),
        Saturday(6),
        Sunday(7);

        private final int value;

        Days(int value) { // Constructor
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /*
     * Enum functions
     * 
     * 1. values() : returns a list of all the values in the enum
     * 2. valueOf() : returns the enum value for the given string
     * 3. ordinal() : returns the index of the enum value
     * 4. compareTo() : compares the enum values returns -1, 0, 1
     * 5. equals() : compares the enum values returns true or false
     * 
     */

    public static void main(String[] args) {
        /* creating an enum object */
        /* EnumName varibleName = EnumName.CONSTANT; */
        Days day = Days.Monday;

        System.out.println("Day is : " + day); // prints Monday

        /* EnumName.CONSTANT.ordinal() */
        System.out.println("Day ordinal is : " + day.ordinal()); // prints 0

        /* EnumName.CONSTANT.valueOf("CONSTANT") */

        System.out.println("Day value is : " + Days.valueOf("Monday")); // prints Monday

        /* EnumName.CONSTANT.compareTo(EnumName.CONSTANT) */

        System.out.println("Day compare is : " + day.compareTo(Days.Monday)); // prints 0

        /* EnumName.CONSTANT.equals(EnumName.CONSTANT) */

        System.out.println("Day equals is : " + day.equals(Days.Monday)); // prints true
        System.out.println("Day equals is : " + day.equals(Days.Thursday)); // prints false

        for (Days d : Days.values())
            System.out.println(d); // prints all the values in the enum

        System.out.println("Day value is : " + day.getValue()); // prints 1

        /* Enums with if */

        if (day == Days.Monday) {
            System.out.println("Day is Monday");
        } else {
            System.out.println("Kal Sun day hai : ) ");
        }

        /* enums with switch */

        switch (day) {
            case Monday:
                System.out.println("Day is Monday");
                break;
            case Tuesday:
                System.out.println("Day is Tuesday");
                break;
            case Wednesday:
                System.out.println("Day is Wednesday");
                break;
            case Thursday:
                System.out.println("Day is Thursday");
                break;
            case Friday:
                System.out.println("Day is Friday");
                break;
            case Saturday:
                System.out.println("Day is Saturday");
                break;
            case Sunday:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is not a day");
                break;
        }

        Days day2 = Days.Sunday;
        if (day2 == day) {
            System.out.println("Same day");
        } else {
            System.out.println("Different day");
        }

    }
}



// Programs




/* Develop a Java program to find
sum, maximum and minimum of three numbers using values() method. */


enum numbs{ 
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10);
    private final int value;
    
    numbs(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(numbs n : numbs.values()){
            sum += n.getValue();
            if(n.getValue() > max)
                max = n.getValue();
            if(n.getValue() < min)
                min = n.getValue();
            
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
} 


/* Sum of two numbers with enum */

enum Two{
ten(10), seven(7);
private final int value;
 Two(int value){
    this.value = value;
}
int getValue(){
    return value;
}

public static void main(String args[]){
    int sum = 0;
    Two t[] = Two.values();
    for (Two s : t){
        sum += s.getValue();
    }
    System.out.println("Sum is " + sum);

}
}


/* Avg of 3 nos */

enum Avg{
ten(10), seven(7), six(6);
private final int value;
 Avg(int value){
    this.value = value;
}
int getValue(){
    return value;
}

public static void main(String args[]){
    int sum = 0;
    Avg t[] = Avg.values();
    for (Avg s : t){
        sum += s.getValue();
    }
    System.out.println("Sum is " + sum);
    System.out.println("Avg is "+ sum/3);

}
}