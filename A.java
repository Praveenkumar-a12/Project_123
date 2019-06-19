
public class A {

	public static void main(String[] args) {
		int dayNumber = 3;
        String day  = "";
        switch(dayNumber){
            case 1:
            day = "Monday";
            break;
            case 2:
            day = "Tuesday";
            break;
            case 3:
            day = "Wednesday";
            break;
            case 4:
            day = "Thrusday";
            break;
            case 5:
            day = "Friday";
            break;
            case 6:
            day = "Saturday";
            break;
            case 7:
            day = "Sunday";
            break;
            default :
        System.out.println("Invalid option");
    }
    System.out.println(day);

	}

}
