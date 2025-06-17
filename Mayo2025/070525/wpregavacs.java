/*
               File: wpRegAvaCS
        Description: Registro de avance
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 7, 2025 11:30:50.76
       Program type: Main program
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.wpregavacs")
public final  class wpregavacs extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.kdsproyectos.GXcfg.class);
      com.kdsproyectos.wpregavacs_impl pgm = new com.kdsproyectos.wpregavacs_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpregavacs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpregavacs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Registro de avance";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

