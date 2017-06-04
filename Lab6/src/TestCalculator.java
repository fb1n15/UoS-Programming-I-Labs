
public class TestCalculator {
	Calculator calc = new Calculator();
	
	public boolean testParser(){
		boolean temp = true;
		if (!calc.x("12 + 5").equals(17)){
			System.out.println("[FAIL] Basic parsing fails to add.");
			temp = false;
		}else
	    if(!calc.x("12 x 5").equals(60)){
	    	temp = false;
	    	System.out.println("[FAIL] Basic parsing fails to multiply.");
	    }
		if (!calc.x("12 [ 3").equals(null)){
			temp = false;
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
		}
		return temp;			
	}
	
	public boolean testAdd(){
		
	}

}
