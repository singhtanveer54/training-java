package com.revature.app; //This line of code is specifying what package this class belong to
// It belongs to the com.revature.app package

import com.revature.model.Reimbursement;

public class Main {

	// The main method can create by shortcut ctrl+space
	public static void main(String[] args) {
		
		//shortcut for sysyem.out.println is sysout then ctrl+space
		System.out.println("Hi there");
		Reimbursement reimbursement1 = new Reimbursement();
		reimbursement1.approved = true;
		reimbursement1.description = "this is pretty cool";
		reimbursement1.submitter = "Tanveer";
		reimbursement1.amount = 100.58;

		
		
		System.out.println(reimbursement1.approved);
		System.out.println(reimbursement1.description);
		System.out.println(reimbursement1.submitter);
		System.out.println(reimbursement1.amount);
	}
}
