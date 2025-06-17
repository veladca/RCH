/*
               File: pCNDSPRSUBCONCAN
        Description: p CNDSPRSUBCONCAN
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 13, 2025 15:3:14.39
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcndsprsubconcan extends GXProcedure
{
   public pcndsprsubconcan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcndsprsubconcan.class ), "" );
   }

   public pcndsprsubconcan( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           String[] aP2 ,
                                           long[] aP3 ,
                                           long[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pcndsprsubconcan.this.AV16CNUSERID = aP0[0];
      this.aP0 = aP0;
      pcndsprsubconcan.this.AV8CNDSPRCIA = aP1[0];
      this.aP1 = aP1;
      pcndsprsubconcan.this.AV9CNDSPRTDC = aP2[0];
      this.aP2 = aP2;
      pcndsprsubconcan.this.AV10CNDSPRNDC = aP3[0];
      this.aP3 = aP3;
      pcndsprsubconcan.this.AV11CNDSPRSUBCONID = aP4[0];
      this.aP4 = aP4;
      pcndsprsubconcan.this.AV12CNDSPRSUBCONCAN = aP5[0];
      this.aP5 = aP5;
      pcndsprsubconcan.this.AV13CNDSPRSUBCONPREUNI = aP6[0];
      this.aP6 = aP6;
      pcndsprsubconcan.this.AV14CNDSPRSUBCONCAN_N = aP7[0];
      this.aP7 = aP7;
      pcndsprsubconcan.this.AV15CNDSPRSUBCONPREUNI_N = aP8[0];
      this.aP8 = aP8;
      pcndsprsubconcan.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 ,
                        long[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 ,
                             long[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pcndsprsubconcan.this.AV16CNUSERID = aP0[0];
      this.aP0 = aP0;
      pcndsprsubconcan.this.AV8CNDSPRCIA = aP1[0];
      this.aP1 = aP1;
      pcndsprsubconcan.this.AV9CNDSPRTDC = aP2[0];
      this.aP2 = aP2;
      pcndsprsubconcan.this.AV10CNDSPRNDC = aP3[0];
      this.aP3 = aP3;
      pcndsprsubconcan.this.AV11CNDSPRSUBCONID = aP4[0];
      this.aP4 = aP4;
      pcndsprsubconcan.this.AV12CNDSPRSUBCONCAN = aP5[0];
      this.aP5 = aP5;
      pcndsprsubconcan.this.AV13CNDSPRSUBCONPREUNI = aP6[0];
      this.aP6 = aP6;
      pcndsprsubconcan.this.AV14CNDSPRSUBCONCAN_N = aP7[0];
      this.aP7 = aP7;
      pcndsprsubconcan.this.AV15CNDSPRSUBCONPREUNI_N = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02SC2 */
      pr_default.execute(0, new Object[] {AV14CNDSPRSUBCONCAN_N, AV15CNDSPRSUBCONPREUNI_N, new Boolean(n18155CNDSPRSUBCONPREUNI), AV15CNDSPRSUBCONPREUNI_N, new Boolean(n18157CNDSPRSUBCONCAN), AV14CNDSPRSUBCONCAN_N, new Long(AV8CNDSPRCIA), AV9CNDSPRTDC, new Long(AV10CNDSPRNDC), new Long(AV11CNDSPRSUBCONID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("CNDSPRSUBCON") ;
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcndsprsubconcan.this.AV16CNUSERID;
      this.aP1[0] = pcndsprsubconcan.this.AV8CNDSPRCIA;
      this.aP2[0] = pcndsprsubconcan.this.AV9CNDSPRTDC;
      this.aP3[0] = pcndsprsubconcan.this.AV10CNDSPRNDC;
      this.aP4[0] = pcndsprsubconcan.this.AV11CNDSPRSUBCONID;
      this.aP5[0] = pcndsprsubconcan.this.AV12CNDSPRSUBCONCAN;
      this.aP6[0] = pcndsprsubconcan.this.AV13CNDSPRSUBCONPREUNI;
      this.aP7[0] = pcndsprsubconcan.this.AV14CNDSPRSUBCONCAN_N;
      this.aP8[0] = pcndsprsubconcan.this.AV15CNDSPRSUBCONPREUNI_N;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcndsprsubconcan");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A18155CNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      A18157CNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.pcndsprsubconcan__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8CNDSPRCIA ;
   private long AV10CNDSPRNDC ;
   private long AV11CNDSPRSUBCONID ;
   private java.math.BigDecimal AV12CNDSPRSUBCONCAN ;
   private java.math.BigDecimal AV13CNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal AV14CNDSPRSUBCONCAN_N ;
   private java.math.BigDecimal AV15CNDSPRSUBCONPREUNI_N ;
   private java.math.BigDecimal A18155CNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal A18157CNDSPRSUBCONCAN ;
   private String AV16CNUSERID ;
   private String AV9CNDSPRTDC ;
   private boolean n18155CNDSPRSUBCONPREUNI ;
   private boolean n18157CNDSPRSUBCONCAN ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private long[] aP3 ;
   private long[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
}

final  class pcndsprsubconcan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02SC2", "UPDATE CNDSPRSUBCON SET CNDSPRSUBCONTOT=? * CAST(? AS NUMERIC(25,10)), CNDSPRSUBCONPREUNI=?, CNDSPRSUBCONCAN=?  WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? and CNDSPRSUBCONID = ?", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setLong(5, ((Number) parms[6]).longValue());
               stmt.setString(6, (String)parms[7], 3);
               stmt.setLong(7, ((Number) parms[8]).longValue());
               stmt.setLong(8, ((Number) parms[9]).longValue());
               return;
      }
   }

}

