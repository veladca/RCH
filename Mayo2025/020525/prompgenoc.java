/*
               File: prompgenoc
        Description:
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 2, 2025 12:36:34.6
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.prompgenoc")
public final  class prompgenoc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prompgenoc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prompgenoc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "";
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

