/*
               File: prompSubCon
        Description: Subconceptos
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 17, 2025 14:16:4.97
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.prompsubcon")
public final  class prompsubcon extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prompsubcon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prompsubcon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Subconceptos";
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

