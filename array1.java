import java.util.*;

public class array1{

public static void update(int a[]){

	for(int i=0; i<a.length; i++){
	a[i]+=1;
}

}

public static void main(String args[]){
	int a[]={10,20,30};

	update(a);
	for(int i=0; i<a.length; i++){
	System.out.println(a[i]);
}

}}