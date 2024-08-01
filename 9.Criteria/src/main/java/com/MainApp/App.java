package com.MainApp;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import com.ConnectionFactory.ConnectionFactory;
import com.Model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	 Session s = ConnectionFactory.getSession();
    	 
    	 Criteria cr =  s.createCriteria(Employee.class);
    	 
//    	 cr.setFirstResult(0);  // starting point
//    	 cr.setMaxResults(3);  // maximum record read
    	 
//    	 cr.addOrder(Order.desc("salary"));
//    	 cr.addOrder(Order.asc("id"));
    	 
//    	 cr.add(Restrictions.lt("salary",34000)); //less then
//    	 cr.add(Restrictions.between("id",102,302)); //between the range
//    	 cr.add(Restrictions.in("name","ram"));
    	 
//    	 cr.add(Restrictions.gt("id",102));
    	 
    	 
    	 
    	 List<Employee> l = cr.list();
    	 for(Employee e:l) {
    		 System.out.println(e);
    	 }
    		 
//    	 cr.setProjection(Projections.rowCount());
//    	 cr.setProjection(Projections.countDistinct("name"));
    	 
    	 
//    	 List l =cr.list();
//    	 System.out.println(l);
    }
}
