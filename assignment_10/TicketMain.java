package assignment_10;

public class TicketMain {

	public static void main(String[] args) {
		// *********************************************************
		// Assignment 10
		//
		// Design and code a class for walk up, advance, and student advance ticket pricing.
		// By: Minh Ngu
		// 12/02/2019
		// *********************************************************
		
		Ticket[]tickets = new Ticket[5];
		tickets[0] = new walkUpTicket(3);
		tickets[1] = new advanceTicket(4, 9);
		tickets[2] = new advanceTicket(2, 11);
		tickets[3] = new studentAdvanceTicket(1, 13);
		tickets[4] = new studentAdvanceTicket(3, 4);
		
		{
		// Prints out number of tickets, cost of each ticket, and (# of tickets * price)
		System.out.println(tickets[0]);
		System.out.println(tickets[1]);
		System.out.println(tickets[2]);
		System.out.println(tickets[3]);
		System.out.println(tickets[4]);
		System.out.println("");
		}
	}

}
