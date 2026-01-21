package com.Priyanka;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;

import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat=new Tomcat();

        // Adds a context (web app) at the root path (“” means the root)
        Context context=tomcat.addContext("",null);
        // Registers a servlet named "servlet1"
        Tomcat.addServlet(context, "servlet1",new HelloServlet());//(context,any name, actual object)
        // Maps URL "/hello" to the servlet named "servlet1"
        context.addServletMappingDecoded("/hello","servlet1");//(url,any name used above)

        tomcat.start();
        tomcat.getServer().await();
    }
}
