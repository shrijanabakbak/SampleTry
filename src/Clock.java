import java.util.Scanner;
import java.time.LocalTime;  

public class Clock {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Set the hour clock in 24 hr format");
		int hr = sc.nextInt();
		System.out.println("Set the min clock");
		int min = sc.nextInt();
		sc.close();
		alarm(hr , min);
			
		
	}
	public static void alarm(int hr ,int  min) {
		boolean flag = false;
		boolean on= checkAlarm(hr , min, flag);
		flag=true;
		while(on) {
			beep();
			on=checkAlarm(hr , min, flag);
		}
	}
	
	
	public static boolean checkAlarm(int hr , int min, boolean flag) {
			LocalTime now = LocalTime.now();
		boolean set = false;
		if(hr==now.getHour() && min==now.getMinute()) {
			set = true;
		}else if(flag) {
			System.out.println("Alarm off");
		}else if(hr<now.getHour() && min<now.getMinute()) {
			System.out.println("Your alarm time has not arrived");
		}else if(hr>now.getHour() && min>now.getMinute()) {
			System.out.println("Your time has been set for tomorrow");
		}
		return set;
		
	}
	
	public static void beep() {
		
		System.out.println("beep beep beep");
//		System.out.println("Hour :" + now.getHour());
//		System.out.println("Min :" + now.getMinute());
		
	}
}
