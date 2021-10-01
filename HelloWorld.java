import java.util.*;
public class HelloWorld{
	public static void main(String args[]){
		System.out.println("Hello World");
		System.out.println("Running this program in cmd");


		String input = "My name is khan";
		System.out.println("[a-z] " + Arrays.toString(input.split("[a-z]")));
		System.out.println("\\w " + Arrays.toString(input.split("\\w")));
		System.out.println("\\w*? " + Arrays.toString(input.split("\\w*?")));
		System.out.println("\\w+? " + Arrays.toString(input.split("\\W+")));

	}
}

/**
 * Open cmd
 * to compile the java code: javac HelloWorld.java
 * to execute the program: java HelloWorld
*/