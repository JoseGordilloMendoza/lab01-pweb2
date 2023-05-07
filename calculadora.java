import java.util.*;
public class calculadora{
    public static void main(String [] args){
        //CODIGO BASE DEL PROGRAMA
        Scanner sc=new Scanner(System.in);
        System.out.println("\t.:Calculadora:.\t");
        System.out.print("Primer numero: ");
        int numero1=sc.nextInt();
        System.out.print("Segundo numero: ");
        int numero2=sc.nextInt();
        }
    
    //Creamos el metodo para sumar dos numeros
    public int add(int num1, int num2){
        return num1 + num2;
        }
    
    //Creamos el metodo resta de dos numeros
    public int sub(int num1, int num2){
        return num1 - num2;
        }
    //Creamos el metodo muiltiplicacion  de dos numeros
    public int mul(int num1, int num2){
        return num1 * num2;
        }
	//Creamos el metodo para dividir dos numeros
	public String div(int num1, int num2){
		if (num2 !=  0)
			return ""+num1 / num2;
		else
			return "La operacion no se puede realizar, no hay division sobre 0";
	}

    //Creamos el metodo para obtener el modulo entre dos numeros
    public int mod(int num1, int num2){
        if (num2==0)
            return num1%num2;
        else
            return -1;
    }
}
 
