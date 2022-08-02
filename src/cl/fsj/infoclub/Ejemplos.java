package cl.fsj.infoclub;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplos {
	
	public static void main(String[] args) {
		
		//List: Una lista es una colección ordenada, a veces llamada secuencia, que contiene elementos en su interior.
		//La plataforma Java contiene dos implementaciones de Lista de propósito general: ArrayList, que suele ser la implementación con mejor rendimiento; y LinkedList, que ofrece un mejor rendimiento en determinadas circunstancias.
		
		

		
		//EJEMPLO ARRAYLIST
		
		//Para crear una ArrayList<>() hay que importar su implementación desde “util.java.ArrayList”
		
		//Para incorporar elementos a la lista, debemos ocupar el método void add()
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Scala");
		list.add("Kotplin"); //lenguaje de programacion de android
		System.out.println(list); //[Java, Scala, Kotlin]
		System.out.println("**************");
		
		//EJEMPLO2
		
		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("Santiago");
		ciudades.add("Iquique");
		ciudades.add("Arica");
		ciudades.add("Concepcion");
		ciudades.add("La serena");
		ciudades.add("Puerto Montt");
		System.out.println(ciudades); //impime CIUDADES porque es el nombre del elemento creado en el array que contiene todos los datos ingresados
		System.out.println("**************");
		//LOS ELEMENTOS DE LA LISTA TIENEN UN POSICION Y SE LE LLAMA INDICE, INDICE QUE COMIENZA DESDE EL 0 (CERO)
		//SE PUEDE ACCEDER A LOS VALORES PASANDO EL INDICE COMO PARAMETRO DEL METODO GET.
		// EJEMPLO: System.out.println(list.get(0)); //JAVA
		
		//Incorporación de más ciudades desde una colección distinta llamada otrasCiudades
		
		ArrayList<String> otrasCiudades = new ArrayList();
		otrasCiudades.add("Rancagua");
		otrasCiudades.add("Punta Arenas");
		ciudades.addAll(otrasCiudades); //agrega al ya creado ArrayList nuevos elementos de otra coleccion 
		System.out.println(ciudades); //
		System.out.println("***********");
		
		/*//PARA OBTENER UN ELEMENTO EN BASE A SU POSICION, hacemos uso del metodo get()
		System.out.println(list.get(0));
		System.out.println(list.get(4)); //estos ejemplos me van a imprimir el elemento que está en esa posicion indicada en los ()
		System.out.println("************");*/
		
		//para remover un elemento especifico desde un ArrayList utilizamos el metodo remove()
		//ejemplo, si queres eliminar Santiago ciuades.remove(4) System.out.println(ciudades);
		
		//si queremos MODIFICAR un elemento de la lista en base a su indice utilizamos el metodo set()
		//ejemplo ciuades.set(2, "Talca"); esto posiciona el elemento "2" y le cambia el nombre 
		
		//PARA ENCONTRAR LA CANTIDAD EXACTA DE ELEMENTOS que contiene la lista utilizamos el metodo size() este método devuelve la cantidad de elementos al interior de la lista
		//ejemplo System.out.println(ciudades.size()); imprime [7] que contando desde 0, serían las ciudades en la lista 
		
		//METODOS DE BUSQUEDA
		// List tambien proporciona métodos para buscar elementos y los devuelve en base a su posicion númerica, trabaja con dos metodos indexOf Y lastIndexOf()
		
		//para buscar en base a su contenido, usamos el metodo indexOf() System.out.println(ciuades.ondexOf("Santiago")); imprime [0] su posicion 
		
		//METODOS DE ITERACION
		
		//listIterator()
		//debemos importar el java.util.ListIterator;
		
		//DEVUELVE LA LISTA ORDENADA TAL CUAL LLEGA
		
		List<String> ciudades1 = new ArrayList<>();
		ciudades1.add("Santiago");
		ciudades1.add("Iquique");
		ciudades1.add("Arica");
		ciudades1.add("Concepcion");
		ciudades1.add("La Serena");
		ciudades1.add("Puerto Montt");
		
		ListIterator<String> ciudades1Iterator = ciudades1.listIterator();
		System.out.println(ciudades1Iterator.hasNext());// HASNEXT imprime en orden correlativo
		System.out.println("************");
		
		//Impresión en pantalla: TRUE
		//El true es el equivalente a la lista recorrida y ordenada
		//[Santiago, Iquique, Arica, Concepción, La Serena, Puerto Montt]
		
		// DEVUELVE LA LISTA ORDENADA AL REVES 
		
		List<String> ciudades2 = new ArrayList<>();
		ciudades2.add("Santiago");
		ciudades2.add("Iquique");
		ciudades2.add("Arica");
		ciudades2.add("Concepcion");
		ciudades2.add("La Serena");
		ciudades2.add("Puerto Montt");
		
		ListIterator ciudades2Iterator = ciudades2.listIterator();
		System.out.println(ciudades2Iterator.hasPrevious()); // HASPREVIOUS IMPRIME LA LISTA AL REVES 
		System.out.println("**********");
		
		//impresion en patalla [false] El false es equivalente a la lista recorrida pero ordenada de manera inversa
		//[Puerto Montt,La Serena, Concepción, Arica, Iquique, Santiago]
		
		
		
		
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
		nicknames.add("rolando90"); //ESTE ELEMENTO SE REPITE, AL IMPRIMIR No se muestra 
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
		
		//TreeSet almacena sus elementos en un árbol rojo-negro, es decir, ordena sus elementos en función de sus valores. Es sustancialmente más lento que HashSet.
		
			Set<String> nicknames1 = new TreeSet<>(); 
			
		nicknames1.add("Ducksito");
		nicknames1.add("rolando90");
		nicknames1.add("polypleti");
		nicknames1.add("Java");
		nicknames1.add("gonzaleslillo");
		nicknames1.add("edgamer63");
		nicknames1.add("silvia2015");
		nicknames1.add("sebaoteiza");
		nicknames1.add("callita");
		nicknames1.add("giornobanana");
		nicknames1.add("lucianosesc");
		nicknames1.add("felicity");
		nicknames1.add("kernelweb");
		nicknames1.add("cr111");
		nicknames1.add("kesillox");
		nicknames1.add("rolando90"); //
		System.out.println(nicknames1);
		System.out.println("***********");
		//IMPRIME EN ORDEN ALFABEICO, DE MENOR A MAYOR Y COMO TIENE QUE ORDENAR, TIENDE A SER MÁS LENTA SU EJECUCION
		//TAMPOCO SE REPITEN LOS NOMBRES REPETIDOS 

		
		//*********QUEUE
		
		// mantener los elementos a punto de ser procesados y proporciona varias operaciones 
		/* La colección Queue se utiliza para mantener los elementos a punto de ser procesados y
		proporciona varias operaciones como la inserción, eliminación, etc. Es una lista ordenada de
		objetos con su uso limitado para insertar elementos al final de la lista y eliminar elementos
		desde el principio de lista, es decir, sigue el principio “Primero en entrar, primero en salir”*/
		
		//Al ser una interfaz, la cola necesita una clase concreta para la 	declaración y las clases más comunes son PriorityQueue y LinkedList
	
		
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
		nicknames.add("sebaoteiza");
		nicknames.add("sebaoteiza");
		System.out.println(nicknames);
		System.out.println("*************");
	
		// nos debería imprimir la cola completa según orden de ingreso
		//no es un SET por ende si puede imprimir los elementos repetidos 
		//SI YO LE PIDO ELIMINAR UN ELEMENTO, va a eliminar el primero de la lista , ELIMINAR EL PRIMER DE LA LISTA
		
		
		
		
		
		
		
		
		//Si queremos borrar una colección completa de la lista, debemos usar el método removeAll().
		
		
	}
		
		
		
		
		
	}


