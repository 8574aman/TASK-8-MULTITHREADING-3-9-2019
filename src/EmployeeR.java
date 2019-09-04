
public class EmployeeR implements Runnable{
	private int empNo;
	private String eName;
	private int salary;
	
	public EmployeeR(int empNo, String eName, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculateOtherSal();
	}
	
	public void calculateOtherSal()
	{
			double HRA=(0.1*salary);
			double DA=(0.25*salary);
			double CA=(0.1*salary);
			System.out.println("For Employee "+this.geteName()+": HRA= "+HRA+" CA= "+CA);
			System.out.println("For Employee "+this.geteName()+ " DA= "+DA);
			System.out.println("For Employee "+this.geteName()+" CA= "+CA);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeR e1 = new EmployeeR(101, "ross", 10000);
		EmployeeR e2 = new EmployeeR(102, "joey", 20000);
		EmployeeR e3 = new EmployeeR(103, "pheobe", 15000);
		EmployeeR e4 = new EmployeeR(104, "rachel", 25000);
		EmployeeR e5 = new EmployeeR(105, "chandler", 5000);

		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		Thread t4 = new Thread(e4);
		Thread t5 = new Thread(e5);

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
