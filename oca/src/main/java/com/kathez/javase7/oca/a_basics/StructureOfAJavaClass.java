/*package statement.
 *
 * If the package declaration is missing,then this class becomes part of a 
 * default package which doesn't have a name.
 * 
 * If package statement is present, it must be the first statement in class definition.
 * 
 * If present, the package statement must appear exactly once in a class.
 * Multiple package declarations will not compile
 */
package com.kathez.javase7.oca.a_basics;

/*import statements
 * 
 *The import statements must follow the package statement,if package statement is present
 * 
 * If package statement is not present in a class, then import statements
 * can be the first statement
 * 
 */
import java.util.List;

/*
 * The following statement won't compile because the class
 * defined in a default package cannot be imported in other
 * packages
 */
//import ClassInDefaultPackage;

/**
 * The structure of a java class
 * 
 * Package statement import statements Comments class declaration variables
 * comments constructors methods nested classes (Not covered in OCA) nested
 * interfaces (Not covered in OCA) enum (Not covered in OCA)
 * 
 * @author Balaji
 * 
 */
public class StructureOfAJavaClass { // This is a class declaration

	/**
	 * This is a instance variable. Used to define the state of the object. Each
	 * object has its own copy of the instance variable
	 * 
	 * The properties of an object is defined using instance variables
	 */
	private List instanceVariable;

	/*
	 * The following statement won't compile beacuse the class definde in a
	 * default package cannot be imported in other packages
	 */
	// private ClassInDefaultPackage classInDefaultPackage;

	/**
	 * This is a constructor
	 * 
	 * Used to create and initialize an object of this class
	 */
	public StructureOfAJavaClass() {
		super();
	}

	/**
	 * This is a method This is the instance method, used to manipulate the
	 * instance variables
	 * 
	 * The behaviour of an object is defined by methods
	 */
	public void method() {
		int a = 10; // Local variable. Scope of this variable is inside this method only. It is not accessible outside
	}

	/*
	 * This is example for multi-line comment. Starts with /* and ends with
	 * *[forward_slash]
	 * 
	 * These subsequent * marks are optional. They are used for aesthetic
	 * purpose
	 * 
	 * Multi-line comments can contain any special characters including unicode
	 * chars
	 */

	private String endOfLineComment;
	// Example for end of line comment. starts with // and up to end of the line
	// it is considered as a comment

	/**
	 * A static variable is a single copy of the class variable which is
	 * accessed by all copies of the objects of the class.
	 * 
	 * Normally these are accessed using class instead of instance
	 * ex.StructureOfAJavaClass.classVariable
	 * 
	 * static is a non-access modifier
	 */
	public static String classVariable;

	/**
	 * A class method is a static method used to manipulate the static variables
	 * 
	 * Normally these are called using class instead of instance
	 * ex.StructureOfAJavaClass.classMethod()
	 */
	public static void classMethod() {

	}
}
/* Comments can appear anywhere in the code */