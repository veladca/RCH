/*
               File: wcomppg
        Description: Seguimiento de Cuentas por Pagar
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: April 14, 2025 22:21:0.6
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.wcomppg")
public final  class wcomppg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcomppg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcomppg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimiento de Cuentas por Pagar";
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

