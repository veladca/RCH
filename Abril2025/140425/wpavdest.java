/*
               File: wpavdest
        Description: Gestión de Registro del servicio
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: April 14, 2025 10:11:20.5
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.wpavdest")
public final  class wpavdest extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(com.kdsproyectos.GXcfg.class);
      com.kdsproyectos.wpavdest_impl pgm = new com.kdsproyectos.wpavdest_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpavdest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpavdest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Gestión de Registro del servicio";
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

