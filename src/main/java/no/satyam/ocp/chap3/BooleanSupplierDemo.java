package no.satyam.ocp.chap3;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

import static java.util.Arrays.*;

public class BooleanSupplierDemo {
  //interface definition
BooleanSupplier bolSupplierMember = () -> true;
  static BooleanSupplier bolSupplierStatic = () -> true;

	public static void main(String... args){
        // referring 
        BooleanSupplier supplier = new BooleanSupplierDemo().bolSupplierMember;
        System.out.println(supplier.getAsBoolean()); 
	}
}