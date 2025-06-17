/*
               File: PDFSATV3
        Description: Stub for PDFSATV3
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 12, 2025 15:5:22.55
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdfsatv3 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.kdsproyectos.GXcfg.class);
      pdfsatv3 pgm = new pdfsatv3 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      long aP0 = 0;
      String aP1 = "";
      long aP2 = 0;

      try
      {
         aP0 = (long) GXutil.val( args[0], ".");
         aP1 = (String) args[1];
         aP2 = (long) GXutil.val( args[2], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public pdfsatv3( )
   {
      super( -1 , new ModelContext( pdfsatv3.class ), "" );
      Application.init(com.kdsproyectos.GXcfg.class);
   }

   public pdfsatv3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdfsatv3.class ), "" );
   }

   public pdfsatv3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        long aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             long aP2 )
   {
      pdfsatv3.this.AV2FACTXMLCIA = aP0;
      pdfsatv3.this.AV3FACTXMLSER = aP1;
      pdfsatv3.this.AV4FACTXMLFOL = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV2FACTXMLCIA ;
   private long AV4FACTXMLFOL ;
   private String AV3FACTXMLSER ;
}

