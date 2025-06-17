/*
               File: PDFSATV3
        Description: PDF SAT
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 12, 2025 15:5:20.50
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

@javax.servlet.annotation.WebServlet(value ="/servlet/com.kdsproyectos.apdfsatv3")
public final  class apdfsatv3 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apdfsatv3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apdfsatv3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PDF SAT";
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

