package Application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn = (Date) sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut = (Date) sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reservation);
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = (Date) sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = (Date) sdf.parse(sc.next());
			
			Date now = new Date(number);
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Reservation: "+ reservation);
			}
			else if(!checkOut.after(checkIn)){ 
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: "+ reservation);				
			}
		}
		sc.close();
	}

}
