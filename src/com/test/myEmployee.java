package com.test;

public class myEmployee implements Comparable {

	Integer empID;
	String empName;
	
	myEmployee(Integer empID, String empName){
		
		this.empID=empID;
		this.empName=empName;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		
		Integer empID1 = this.empID;
		
		myEmployee e = (myEmployee) obj;
		
		Integer empID2 = e.empID;
		
		
		  if(empID1<empID2) return 1;
		  
		  else if (empID1>empID2) return -1;
		  
		  else return 0;
		 					
		
		//empID1.compareTo(empID2);
		
		//return 0;
	}
	
	public String toString() {
		
		return empID+"--"+empName;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * myEmployee myE= new myEmployee(100, "trupti"); System.out.println(myE); }
	 */
	
}
