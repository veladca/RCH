/*
               File: wautreq
        Description:
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 16, 2025 15:52:10.28
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.wautreq")
public final  class wautreq extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wautreq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wautreq_impl(context).cleanup();
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

