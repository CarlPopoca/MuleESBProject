package muleesbproject;

public class ValidacionMonto {
	public static String getInformation(String monto)
	{
		System.out.println(monto);
		double cantidad = Double.parseDouble(monto);
		String output = "No";
		
		if (cantidad>=1000000)
			output = "Si";
		
		return output;
	}
	
}
