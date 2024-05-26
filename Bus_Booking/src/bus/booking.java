package bus;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
	String passengername;
	int busno;
	Date date;
	
	booking(){
		Scanner scanner=new Scanner(System.in);
				System.out.println("Enter your name: ");
				passengername = scanner.next();
				System.out.println("Enter your busno: ");
				busno = scanner.nextInt();
				System.out.println("Enter date dd-mm-yyyy: ");
				String dateinput=scanner.next();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
				try {
					date = dateformat.parse(dateinput);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public boolean isAvailable(ArrayList<booking> bookings,ArrayList<bus> buses) {
		int capacity =0;
		for(bus b:buses) {
			if(b.getBusno()==busno)
				capacity=b.getCapacity();
		}
		
		int booked=0;
		for(booking c:bookings) {
			if(c.busno==busno && c.date.equals(date))
				booked++;
		}
		return booked<capacity?true:false;
	}
	
	

}
