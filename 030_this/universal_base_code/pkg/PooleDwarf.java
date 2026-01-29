/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public class PooleDwarf {
    private String name;
    private int age;

    public PooleDwarf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PooleDwarf() {
        this.name = "Unknown";
        this.age = 0;
    }

    public boolean isSameName(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}


