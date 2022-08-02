package cl.fsj.infoclub;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Collection {

	public static void main(String[] args) { // todo se trabaja dentro del metodo

	/*	DecimalFormat df = new DecimalFormat("#.000");

		ArrayList<Double> decimales = new ArrayList<Double>();
		// el arraylist ordena por orden de ingreso, en el arraylist puedo pedir que ordene de otra forma y que lo haga de muchas formas (menor a mayor ejemplo)
		

		decimales.add(32.4);
		decimales.add(Double.parseDouble(df.format(Math.random())));
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);

		System.out.println("Estos son los decimales de la lista decimales: " + decimales);
		System.out.println("*************************");
		
		
		ArrayList<Double> deci = new ArrayList<>();
		
		deci.add((double) (Math.round((Math.random()*10)*1000.0)/10)); 
		
		deci.add(Math.random()*10);

		System.out.println(deci);
		System.out.println("**************************");		
		decimales.addAll(deci);
		System.out.println("**************************");
		System.out.println(decimales);
		System.out.println(decimales.size());
		
		
		
		System.out.println(decimales.indexOf(32.4));
		System.out.println(decimales.indexOf(32.34));
		System.out.println(decimales.indexOf(32.4456));//-1
		System.out.println(decimales.lastIndexOf(32.3400));*/
		
				
		
				//********SET****************
		
				//los SET no permite repetir elementos en la lista 
				//ingresan desordenados en el print
				//como no permite que se repitan los elemtos, imprime el primero que encuentra y los demás los ignora
				//cuando no neceistamos un orden podemos utilziar el SET, a diferencia de LIST que trabaja todo ordenado
				//cuando queremos contabilizar solo un elemento, se utiliza solo en ocaciones que permite optimizacion 
				//si quisiera contabilizar cuantos tipos de autos tengo en una lista de autos, de modelos de autos, una lista de 1000 años pero solo nesito los modelos de autos no más, eso me va a entregar un solo modelo, uno de todos los modelos, puedo tener 500 suzuki pero solo me contará uno
				//UTILIADES ESPECIFICAS, no son de uso cotidiano como el ArrayList
				
				/*//Set<String> nicknames = new HashSet<>();
				nicknames.add("Ducksito");
				nicknames.add("rolando90");
				nicknames.add("polypleti");
				nicknames.add("Java");
				nicknames.add("gonzaleslillo");
				nicknames.add("edgamer63");
				nicknames.add("silvia2015");
				nicknames.add("sebaoteiza");
				nicknames.add("callita");
				nicknames.add("giornobanana");
				nicknames.add("lucianosesc");
				nicknames.add("felicity");
				nicknames.add("kernelweb");
				nicknames.add("cr111");
				nicknames.add("kesillox");
				nicknames.add("rolando90"); //ESTE ELEMENTO SE REPITE, AL IMPRIMIR N
				System.out.println(nicknames);*/
		
		
				//******LinkedHashSet ******
		
				//ordena elementos segun el orden de incersion
				//se implementa como una tabla, se muestra según se ingreso 
				
				/*Set<String> nicknames = new LinkedHashSet<>(); 
				nicknames.add("Ducksito");
				nicknames.add("rolando90");
				nicknames.add("polypleti");
				nicknames.add("Java");
				nicknames.add("gonzaleslillo");
				nicknames.add("edgamer63");
				nicknames.add("silvia2015");
				nicknames.add("sebaoteiza");
				nicknames.add("callita");
				nicknames.add("giornobanana");
				nicknames.add("lucianosesc");
				nicknames.add("felicity");
				nicknames.add("kernelweb");
				nicknames.add("cr111");
				nicknames.add("kesillox");
				nicknames.add("rolando90"); //
				System.out.println(nicknames);*/
				
				//al imprimir imprime segun el orden de ingreso
				//sigue siengo un Hashset, por ende tampoco imprime los elementos repetidos
		
		
				//**************TreeSet*********
		
				//TreeSet almacena sus elementos en un árbol rojo-negro, es decir, ordena	sus elementos en función de sus valores. Es sustancialmente más lento que HashSet.
				
				/*	Set<String> nicknames = new TreeSet<>(); 
				nicknames.add("Ducksito");
				nicknames.add("rolando90");
				nicknames.add("polypleti");
				nicknames.add("Java");
				nicknames.add("gonzaleslillo");
				nicknames.add("edgamer63");
				nicknames.add("silvia2015");
				nicknames.add("sebaoteiza");
				nicknames.add("callita");
				nicknames.add("giornobanana");
				nicknames.add("lucianosesc");
				nicknames.add("felicity");
				nicknames.add("kernelweb");
				nicknames.add("cr111");
				nicknames.add("kesillox");
				nicknames.add("rolando90"); //
				System.out.println(nicknames);*/
				//IMPRIME EN ORDEN ALFABEICO, DE MENOR A MAYOR Y COMO TIENE QUE ORDENAR, TIENDE A SER MÁS LENTA SU EJECUCION
				//TAMPOCO SE REPITEN LOS NOMBRES REPETIDOS 

		
				//*********QUEUE
		
				// mantener los elementos a punto de ser procesados y proporciona varias operaciones 
				
				Queue <String> nicknames = new LinkedList<>(); 
				
				nicknames.add("Ducksito");
				nicknames.add("rolando90");
				nicknames.add("polypleti");
				nicknames.add("Java");
				nicknames.add("gonzaleslillo");
				nicknames.add("edgamer63");
				nicknames.add("silvia2015");
				nicknames.add("sebaoteiza");
				nicknames.add("callita");
				nicknames.add("giornobanana");
				nicknames.add("lucianosesc");
				nicknames.add("felicity");
				nicknames.add("kernelweb");
				nicknames.add("cr111");
				nicknames.add("kesillox");
				nicknames.add("rolando90"); //
				
				System.out.println(nicknames);
				
				// nos debería imprimir la cola completa según orden de ingreso
				//no es un SET por ende si puede imprimir los elementos repetidos 
				//SI YO LE PIDO ELIMINAR UN ELEMENTO, va a eliminar el primero de la lista , ELIMINAR EL PRIMER DE LA LISTA
				
	}
}
