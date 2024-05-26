package bus;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity;
	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	
	bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public void displaybusinfo() {
		System.out.println("Bus No: "+busno + " Ac:" +ac + " Total Capacity: " +capacity);
	}

}
