
public class Validator {
	public String CheckValid(String pass) {
		if(pass == "password") {
			return "case insensitive";
		}
		else {
			if(pass.length()<8) {
				return "It has to be at least 8 charaacters long";
			}
			else {
				return "Valid";
			}
		}
	}
}
