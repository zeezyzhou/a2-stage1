
public class BetterValidator {
	int count = 0;
	boolean special = false;
	boolean digit = false;
	boolean upperlower = false;
	boolean upper = false;
	boolean lower = false;
	public int CheckValid(String pass) {
		if(pass == "password") {
			return -1;
		}
		else {
			if(pass.length()<8) {
				return 0;
			}
			
			
			
			//better validator starts from here
			else {
				
				/*
				 * this is to check if the password contains special char
				 */
				for(int i=32;i<127;i++) {
					if(i>=48&&i<=57) {
						continue;
					}
					else if(i>=65&&i<=90) {
						continue;
					}
					else if(i>=97&&i<=122) {
						continue;
					}
					else {
						for (int cur=0;cur<pass.length();cur++) {
							if(pass.charAt(cur)==i) {
								count++;
								special = true;
								break;
							}
						}
						if(special==true) {
							break;
						}
						
					}
				}
				
				/*
				 * this is to check if the password contains digit
				 */
				for(int i=48;i<58;i++) {
					for(int cur=0; cur<pass.length();cur++) {
						if(pass.charAt(cur)==i) {
							count++;
							digit=true;
							break;
						}
					}
					if(digit==true) {
						break;
					}
				}
				
				
				/*
				 * this is to check if the password contains both upper and lower char
				 */
				for(int cur=0; cur<pass.length();cur++) {
					if (pass.charAt(cur)>=65&&pass.charAt(cur)<=90) {
						upper=true;
					}
					if(pass.charAt(cur)>=97&&pass.charAt(cur)<=122) {
						lower=true;
					}
					if(upper==true&&lower==true) {
						count++;
						upperlower=true;
						break;
					}
				}
				
				return count;
				
			}
		}
	}
}
