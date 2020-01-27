package coreJavaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class JavaConcepts {

	
	/* Time Complexity for collection 
	
	1. ArrayList - it uses random access interface so retrieving is fast and modification is slow.
	
	get() - O(1)
	remove()- O(n)
	add() - O(1)
	
	2. ArrayLinkedList - it uses doubly linked list implementation so retrieving takes time to iterate the element but modification 
	is faster as shifting happens fast.it has nodes which contains data and reference of next node.
	
	get() - O(n)
	remove() - O(1)
	add()- O(1)
	
	3. Map : it has constant O(1) - hashmap/linkedhashmap
	
	4. Set : it has constant O(1) - set/linkedhashset as it interally uses hashmap 
	
	5. TreeSet/ TreeMap - OLog(n)
	
	*/
	
	public static void main(String args[]) {
		// get all substrings from given string
		 String str = "welcometojava";
		    int k = 3;
		       List<String> subStringList = new LinkedList<String>();
		        for(int i =0; i<str.length(); i++) {
		        	for(int j =i+1; j<str.length() +1; j++) {
		        	    subStringList.add(str.substring(i, j));
		        	}
		    
		        }
		    
		   // subStringList.forEach(i-> System.out.println(i));
		    
		    
		    // get substring of 3 length from given string
		       Set<String> subStrSt = new HashSet<String>();
		    
		    
		        for(int i =0; i<str.length(); i++) {
		          for(int j =i+1; j <str.length() +1; j++) {
		                    subStrSt.add(str.substring(i, j));
		          }

		        }
		    
		    subStrSt = subStrSt.stream().filter(i-> i.length()==k).collect(Collectors.toSet());
		    
		    subStrSt.forEach( System.out::println);
		    
		    List<String> ls = new LinkedList<String>(subStrSt);
            Collections.sort(ls);
           String smallest = ls.get(0);
            String largest = ls.get(ls.size()-1);
            
            System.out.println("smallest string is '" + smallest + "' and largest string is '" +largest + "'");
		    
		    // get the highest occurrence character and their count from count.
		    
		    
            
            // sorting by cgpa , if cgpa same then sort by name and name same then sort by id

     		Scanner in = new Scanner(System.in);
     		int testCases = Integer.parseInt(in.nextLine());
     		
     		List<Student> studentList = new ArrayList<Student>();
     		JavaConcepts jc = new JavaConcepts();
     		while(testCases>0){
     			int id = in.nextInt();
     			String fname = in.next();
     			double cgpa = in.nextDouble();
     		
     			Student st =  jc.new Student(id, fname, cgpa);
     			studentList.add(st);
     			
     			testCases--;
     		}

     Collections.sort(studentList, jc.new CgpaComparator());
         //  java.util.Collections.sort(studentList, new FnameComparator());
         // java.util.Collections.sort(studentList, new IdComparator());
     	// java.util.Collections.sort(studentList, Collections.reverseOrder(new CgpaComparator()));
           	for(Student st: studentList){
     			System.out.println(st.getFname());
     		}
     	}
           
		        
	
	
	
	 class Student{
     	private int id;
     	private String fname;
     	private double cgpa;
     	public Student(int id, String fname, double cgpa) {
     		
     		this.id = id;
     		this.fname = fname;
     		this.cgpa = cgpa;
     	}
     	public int getId() {
     		return id;
     	}
     	public String getFname() {
     		return fname;
     	}
     	public double getCgpa() {
     		return cgpa;
     	}
     }

 
      class FnameComparator implements Comparator {
         public int compare(Object o1, Object o2) {
                Student st1 = (Student) o1;
                Student st2 = (Student) o2;

               return st1.getFname().compareTo(st2.getFname());
         }
     }

      class IdComparator implements Comparator {
         public int compare(Object o1, Object o2) {
                Student st1 = (Student) o1;
                Student st2 = (Student) o2;

             if(st1.getId()>st2.getId()){
                 return 1;
             }else if(st1.getId()<st2.getId()){
                 return -1;
             }else {
                 return 0;
             }
         }
     }

      class CgpaComparator implements Comparator {
         public int compare(Object o1, Object o2) {
                Student st1 = (Student) o1;
                Student st2 = (Student) o2;

             if(st1.getCgpa()<st2.getCgpa()){
                 return 1;
             }else if(st1.getCgpa()>st2.getCgpa()){
                 return -1;
             }else {
                     if( st1.getFname().compareTo(st2.getFname()) == 0){
                          if(st1.getId()> st2.getId()) {
                         return 1;
                     }else if(st1.getId()< st2.getId()) {
                         return -1;
                     } else {
                         return 0;
                     }
                     } else {
                        return st1.getFname().compareTo(st2.getFname());
                     }
             }
         }
     }
}


