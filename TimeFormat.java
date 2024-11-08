// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 

		String timeInput = args[0];
		System.out.println(timeInput);

		//split the string into hours and minutes using String.split()
		String[] timeParts = timeInput.split(":");

		int hours = Integer.parseInt(timeParts[0]);
		int minutes = Integer.parseInt(timeParts[1]);

		String suffix;
//am/pm values:
		if (hours>=12){
			 suffix = "PM";
			}else{
				suffix = "AM";
			}

//converting 24 hour time by (-12)
		if (hours>12){
			hours = hours - 12;
		} else{
			hours = hours;
		}

// adding a 0 infront of minutes<10
			String strMinutes = String.valueOf(minutes);
			strMinutes = "0" + strMinutes;

		if (minutes>=10){
			System.out.println(hours + ":" + minutes + suffix);
		}else{
			System.out.println(hours + ":" + strMinutes + suffix);
		}
	}
}





		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		//int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
	
