package bus;
import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {

	public static void main(String[] args) {
		ArrayList<bus> buses=new ArrayList<bus>();  //ArrayList-Collection
		ArrayList<booking> bookings=new ArrayList<booking>();
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,35));
		buses.add(new bus(3,true,23));
		
		int useropt=1;
		Scanner scanner=new Scanner(System.in);    
		
		for(bus b:buses) {             //for each loop
			b.displaybusinfo();
		}
		while(useropt==1) {
		System.out.println("enter 1 to book and 2 to exit");
		useropt=scanner.nextInt();
		if(useropt ==1) {
			booking book=new booking();
			if(book.isAvailable(bookings,buses)) {
				bookings.add(book);
				System.out.println("confirm");
			}else
				System.out.println("sorry");
			
		}

	}
	}
}


