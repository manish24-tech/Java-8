package com.practice.javascript;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Nashorn Javascript Engine : responsible to execute javascript code into java class via interface of javax.script package
 * create Nashorn javascript in 4 steps :
 * 1. create js file at src/resources 
 * 2. Create Nashorn script engine
 * 3. Read Nashorn file
 * 4. Create Invocable object to access scripts
 * 5. call scripts 
 * execute Nashorn javascript in 2 way : 
 * 1. jss command line tool
 * 2. jdk itself   
 * @author manish.luste
 *
 */
public class Developer {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {

		 // 1. Create Nashorn script engine  
        ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");  
        
        // 2. Read Nashorn file
        String filePath = ClassLoader.getSystemClassLoader().getResource("js/java8.js").getPath();
		se.eval(new FileReader(filePath));
		
		// 3. Create Invocable object to access scripts
        Invocable invocable = (Invocable)se;  

        // 3.1 call function without parameter  
		invocable.invokeFunction("printMessage");
		
        // 3.2 calling a function with an argument   
		invocable.invokeFunction("sum",1,2);
		 
	}
}
