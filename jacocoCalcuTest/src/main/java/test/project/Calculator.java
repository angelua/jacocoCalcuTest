package test.project;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!\n" );
        System.out.println( "This is the Jacoco Calcu Test\n" );
//        double sumado=0, restado=0, dividido=0, multiplicado=0;
//        sumado=sumar(0, 0);
//        restado=sumar(0, 0);
//        dividido=sumar(0, 0);
//        multiplicado=sumar(0, 0);
    }
    
    public double sumar(double sumando, double restando){
    	 double result = 0;
    	try {
    		result = sumando+restando;
    		 System.out.println("La suma del primer numero: "+
    				 sumando+" y del segundo numero: "+
    				 restando+ " es: " + result+"\n");
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error al intentar sumar, sepa disculpar la molestia");
			e.printStackTrace();
		}
    	return result;
    }
    
    public  double restar(double sumando, double restando){
    	double result =0;
    	try {
    		result=sumando-restando;
    		System.out.println("La resta del primer numero: "+
   				 sumando+" y del segundo numero: "+
   				 restando+ " es: " + result +"\n");
		} catch (Exception e) {

			System.out.println("Ha ocurrido un error al intentar restar, sepa disculpar la molestia");
			e.printStackTrace();
		}
    	return result;
    }
    public double multiplicar(double sumando, double multiple){
    	double result = 0;
    	try {
    		result = sumando*multiple;
    		System.out.println("La multiplicacion del primer numero: "+
      				 sumando+" y del segundo numero: "+
      				multiple+ " es: " + result +"\n");
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error al intentar multiplicar, sepa disculpar la molestia");
			e.printStackTrace();
		}
    	return result;
    }
    public double dividir(double dividendo, double divisor){
    	double result = 0;
    	if(divisor==0){
    		System.out.println("No se puede dividir por 0 mi hermano");
    	} else {
    		try {
        		result = dividendo/divisor;
        		System.out.println("La división del primer numero: "+
        				dividendo+" y del segundo numero: "+
        				divisor+ " es: " + result +"\n");
    		} catch (Exception e) {
    			System.out.println("Ha ocurrido un error al intentar dividir, sepa disculpar la molestia");
    		
    		}
        }
    	return result;
    } 
}
