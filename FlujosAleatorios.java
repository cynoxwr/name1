package flujosAleatorios;

public class FlujosAleatorios 
{

	public static void main(String[] args) 
	{	//FLUJO PREDETERMINADO
		//En este caso, 4 pasos
		
		for (int c=0;c<4;c++)
			//c=0; valor inicial
			//Mientras c sea c<4 volvemos a ejecutar todo lo que hay en
	//el for
			//c++ es: c = c + 1: lo que se hace al llegar al fin del for
			//Va a dar los valores de c: 0, 1, 2 y 3 => será 4 pasos
		{//Comienzo for
			System.out.print(c+"\t");
		}//Fin for
		System.out.println();
		
		for (int c=0;c<7; c++)//7 veces
		{	System.out.print("Hola ");
		}
		
		System.out.println();
		//FLUJO INDETERMINADO
		/*Calcula un número aleatorio entre 0 y 20,
		 * ambos inclusive, hasta que salga un número
		 * mayor que 15
		 */
		int max=20;
		int ale=0;
		System.out.print("while: ");
		//Condición de salida: ale>15
		while(!(ale>15))
		{
			ale = (int)(Math.random()*(max+1));
		//Número aleatorio entre 0 y 20, incluidos ambos
			System.out.print(ale+" ");
		}
		
		System.out.println();
		//Condición de salida: ale>15
		System.out.print("do while: ");
		do
		{
			ale = (int)(Math.random()*(max+1));
		//Número aleatorio entre 0 y 20, incluidos ambos
			System.out.print(ale+" ");
		}while(!(ale>15));
		

		//Diferencia entre while (mientras) y do while 
		//(hacer mientras)
		System.out.println();
		System.out.print("do while: ");
		int i = 80;
		do
		{
			i = (int)(Math.random()*(max+1));
		//Número aleatorio entre 0 y 20, incluidos ambos
			System.out.print(i+" ");
			
		}while(!(i>15));//Repetir mientras no sea > 15
		
		System.out.println();
		System.out.print("while: ");
		i=80;
		while(!(i>15))
		{
			i = (int)(Math.random()*(max+1));
		//Número aleatorio entre 0 y 20, incluidos ambos
			System.out.print(i+" ");
			
		}//Repetir mientras no sea > 15
		
		/*do while: ejecuta - comprueba - ejecuta - comprueba...*/
		/*while: comprueba - ejecuta - comprueba - ejecuta...*/
		
		/*
		for: es un flujo determinado, por tanto el número de pasos es siempre el mismo.
		Mostrar el mensaje "DAM1" contando 1, 2, 3, 4, 5, 6 (6 veces):
		*/
		System.out.println();
		for (int c=1; c<=6; c++)
		{ System.out.print("DAM1 ");
		}
		/*c=1 es el primer valor de la variable contadora.
		 c<=6 es condición de permanencia, es decir, mientras 
	se cumpla, se siguen ejecutando los comandos del for
		 c++ es la operación para variar el contador 
	tras ejecutar cada paso del for
		*/
		
		
	}
}
