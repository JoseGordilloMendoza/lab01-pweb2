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
	System.out.print("\n\tOperaciones: \nSuma:0\nResta:1\nMultiplicacion:2\nDivision:3\nModulo/resto:4\n");
	    //interaccion y eleccion de usuario
	int opc=sc.nextInt();
	if(opc==0){
		System.out.println("El resultado de la suma es: "+add(numero1,numero2));
	}
	else if(opc==1){
		System.out.println("El resultado de la resta es: "+sub(numero1,numero2));
	}
	    else if(opc==2){
		System.out.println("El resultado de la multiplicacion es: "+mul(numero1,numero2));
	}
	    else if(opc==3){
		System.out.println("El resultado de la division es: "+ div(numero1,numero2));
	}
	    else if(opc==4){
		System.out.println("El resultado del modulo es: "+mod(numero1,numero2));
	}
	    else
		 System.out.println("Elige una opcion valida");   
        
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
    public String mod(int num1, int num2){
        if (num2==0)
            return "La operacion no se puede realizar, no hay division sobre 0";
        else
            return num1%num2;
    }
}
 
