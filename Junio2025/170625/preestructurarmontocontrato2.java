/*
               File: PReestructurarMontoContrato2
        Description: PReestructurar Monto Contrato2
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 17, 2025 14:16:4.78
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preestructurarmontocontrato2 extends GXProcedure
{
   public preestructurarmontocontrato2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preestructurarmontocontrato2.class ), "" );
   }

   public preestructurarmontocontrato2( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long[] aP0 ,
                           String[] aP1 )
   {
      preestructurarmontocontrato2.this.AV10CNDSPRCIA = aP0[0];
      this.aP0 = aP0;
      preestructurarmontocontrato2.this.AV11CNDSPRTDC = aP1[0];
      this.aP1 = aP1;
      preestructurarmontocontrato2.this.AV8CNDSPRNDC = aP2[0];
      this.aP2 = aP2;
      preestructurarmontocontrato2.this.aP2 = new long[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 )
   {
      preestructurarmontocontrato2.this.AV10CNDSPRCIA = aP0[0];
      this.aP0 = aP0;
      preestructurarmontocontrato2.this.AV11CNDSPRTDC = aP1[0];
      this.aP1 = aP1;
      preestructurarmontocontrato2.this.AV8CNDSPRNDC = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13CONTRATO_TOTAL = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02SG2 */
      pr_default.execute(0, new Object[] {new Long(AV10CNDSPRCIA), AV11CNDSPRTDC, new Long(AV8CNDSPRNDC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7518CNDSPRCIA = P02SG2_A7518CNDSPRCIA[0] ;
         A7519CNDSPRTDC = P02SG2_A7519CNDSPRTDC[0] ;
         A7520CNDSPRNDC = P02SG2_A7520CNDSPRNDC[0] ;
         A18159CNDSPRSUBCONTIP = P02SG2_A18159CNDSPRSUBCONTIP[0] ;
         n18159CNDSPRSUBCONTIP = P02SG2_n18159CNDSPRSUBCONTIP[0] ;
         A18148CNDSPRSUBCONPERT = P02SG2_A18148CNDSPRSUBCONPERT[0] ;
         n18148CNDSPRSUBCONPERT = P02SG2_n18148CNDSPRSUBCONPERT[0] ;
         A18158CNDSPRSUBCONTOT = P02SG2_A18158CNDSPRSUBCONTOT[0] ;
         n18158CNDSPRSUBCONTOT = P02SG2_n18158CNDSPRSUBCONTOT[0] ;
         A18150CNDSPRSUBCONPERTN3 = P02SG2_A18150CNDSPRSUBCONPERTN3[0] ;
         n18150CNDSPRSUBCONPERTN3 = P02SG2_n18150CNDSPRSUBCONPERTN3[0] ;
         A18149CNDSPRSUBCONPERTN2 = P02SG2_A18149CNDSPRSUBCONPERTN2[0] ;
         n18149CNDSPRSUBCONPERTN2 = P02SG2_n18149CNDSPRSUBCONPERTN2[0] ;
         A18146CNDSPRSUBCONID = P02SG2_A18146CNDSPRSUBCONID[0] ;
         AV14CONCEPTO_TOTAL = DecimalUtil.doubleToDec(0) ;
         AV12CNDSPRSUBCONPERT = A18148CNDSPRSUBCONPERT ;
         /* Execute user subroutine: 'SUBCONCEPTOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A18158CNDSPRSUBCONTOT = AV14CONCEPTO_TOTAL ;
         n18158CNDSPRSUBCONTOT = false ;
         /* Using cursor P02SG3 */
         pr_default.execute(1, new Object[] {new Boolean(n18158CNDSPRSUBCONTOT), A18158CNDSPRSUBCONTOT, new Long(A7518CNDSPRCIA), A7519CNDSPRTDC, new Long(A7520CNDSPRNDC), new Long(A18146CNDSPRSUBCONID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("CNDSPRSUBCON") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P02SG4 */
      pr_default.execute(2, new Object[] {new Boolean(n18158CNDSPRSUBCONTOT), AV13CONTRATO_TOTAL, new Long(AV10CNDSPRCIA), AV11CNDSPRTDC, new Long(AV8CNDSPRNDC)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("CNDSPRSUBCON") ;
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'SUBCONCEPTOS' Routine */
      /* Optimized group. */
      /* Using cursor P02SG5 */
      pr_default.execute(3, new Object[] {new Long(AV12CNDSPRSUBCONPERT), new Long(AV10CNDSPRCIA), AV11CNDSPRTDC, new Long(AV8CNDSPRNDC)});
      c18158CNDSPRSUBCONTOT = P02SG5_A18158CNDSPRSUBCONTOT[0] ;
      n18158CNDSPRSUBCONTOT = P02SG5_n18158CNDSPRSUBCONTOT[0] ;
      pr_default.close(3);
      AV14CONCEPTO_TOTAL = AV14CONCEPTO_TOTAL.add(c18158CNDSPRSUBCONTOT) ;
      /* End optimized group. */
      AV13CONTRATO_TOTAL = AV13CONTRATO_TOTAL.add(AV14CONCEPTO_TOTAL) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = preestructurarmontocontrato2.this.AV10CNDSPRCIA;
      this.aP1[0] = preestructurarmontocontrato2.this.AV11CNDSPRTDC;
      this.aP2[0] = preestructurarmontocontrato2.this.AV8CNDSPRNDC;
      Application.commitDataStores(context, remoteHandle, pr_default, "preestructurarmontocontrato2");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13CONTRATO_TOTAL = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02SG2_A7518CNDSPRCIA = new long[1] ;
      P02SG2_A7519CNDSPRTDC = new String[] {""} ;
      P02SG2_A7520CNDSPRNDC = new long[1] ;
      P02SG2_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      P02SG2_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      P02SG2_A18148CNDSPRSUBCONPERT = new long[1] ;
      P02SG2_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      P02SG2_A18158CNDSPRSUBCONTOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02SG2_n18158CNDSPRSUBCONTOT = new boolean[] {false} ;
      P02SG2_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      P02SG2_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      P02SG2_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      P02SG2_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      P02SG2_A18146CNDSPRSUBCONID = new long[1] ;
      A7519CNDSPRTDC = "" ;
      A18159CNDSPRSUBCONTIP = "" ;
      A18158CNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      AV14CONCEPTO_TOTAL = DecimalUtil.ZERO ;
      c18158CNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      P02SG5_A18158CNDSPRSUBCONTOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02SG5_n18158CNDSPRSUBCONTOT = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.preestructurarmontocontrato2__default(),
         new Object[] {
             new Object[] {
            P02SG2_A7518CNDSPRCIA, P02SG2_A7519CNDSPRTDC, P02SG2_A7520CNDSPRNDC, P02SG2_A18159CNDSPRSUBCONTIP, P02SG2_n18159CNDSPRSUBCONTIP, P02SG2_A18148CNDSPRSUBCONPERT, P02SG2_n18148CNDSPRSUBCONPERT, P02SG2_A18158CNDSPRSUBCONTOT, P02SG2_n18158CNDSPRSUBCONTOT, P02SG2_A18150CNDSPRSUBCONPERTN3,
            P02SG2_n18150CNDSPRSUBCONPERTN3, P02SG2_A18149CNDSPRSUBCONPERTN2, P02SG2_n18149CNDSPRSUBCONPERTN2, P02SG2_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02SG5_A18158CNDSPRSUBCONTOT, P02SG5_n18158CNDSPRSUBCONTOT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10CNDSPRCIA ;
   private long AV8CNDSPRNDC ;
   private long A7518CNDSPRCIA ;
   private long A7520CNDSPRNDC ;
   private long A18148CNDSPRSUBCONPERT ;
   private long A18150CNDSPRSUBCONPERTN3 ;
   private long A18149CNDSPRSUBCONPERTN2 ;
   private long A18146CNDSPRSUBCONID ;
   private long AV12CNDSPRSUBCONPERT ;
   private java.math.BigDecimal AV13CONTRATO_TOTAL ;
   private java.math.BigDecimal A18158CNDSPRSUBCONTOT ;
   private java.math.BigDecimal AV14CONCEPTO_TOTAL ;
   private java.math.BigDecimal c18158CNDSPRSUBCONTOT ;
   private String AV11CNDSPRTDC ;
   private String scmdbuf ;
   private String A7519CNDSPRTDC ;
   private String A18159CNDSPRSUBCONTIP ;
   private boolean n18159CNDSPRSUBCONTIP ;
   private boolean n18148CNDSPRSUBCONPERT ;
   private boolean n18158CNDSPRSUBCONTOT ;
   private boolean n18150CNDSPRSUBCONPERTN3 ;
   private boolean n18149CNDSPRSUBCONPERTN2 ;
   private boolean returnInSub ;
   private long[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P02SG2_A7518CNDSPRCIA ;
   private String[] P02SG2_A7519CNDSPRTDC ;
   private long[] P02SG2_A7520CNDSPRNDC ;
   private String[] P02SG2_A18159CNDSPRSUBCONTIP ;
   private boolean[] P02SG2_n18159CNDSPRSUBCONTIP ;
   private long[] P02SG2_A18148CNDSPRSUBCONPERT ;
   private boolean[] P02SG2_n18148CNDSPRSUBCONPERT ;
   private java.math.BigDecimal[] P02SG2_A18158CNDSPRSUBCONTOT ;
   private boolean[] P02SG2_n18158CNDSPRSUBCONTOT ;
   private long[] P02SG2_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] P02SG2_n18150CNDSPRSUBCONPERTN3 ;
   private long[] P02SG2_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] P02SG2_n18149CNDSPRSUBCONPERTN2 ;
   private long[] P02SG2_A18146CNDSPRSUBCONID ;
   private java.math.BigDecimal[] P02SG5_A18158CNDSPRSUBCONTOT ;
   private boolean[] P02SG5_n18158CNDSPRSUBCONTOT ;
}

final  class preestructurarmontocontrato2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SG2", "SELECT CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONTIP, CNDSPRSUBCONPERT, CNDSPRSUBCONTOT, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRSUBCONPERT > 0) AND (CNDSPRSUBCONPERT > 0) AND (CNDSPRCIA = ?) AND (CNDSPRTDC = ( ?)) AND (CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) ORDER BY CNDSPRSUBCONPERT, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERTN3  FOR UPDATE OF CNDSPRSUBCON",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P02SG3", "SAVEPOINT gxupdate;UPDATE CNDSPRSUBCON SET CNDSPRSUBCONTOT=?  WHERE CNDSPRCIA = ? AND CNDSPRTDC = ? AND CNDSPRNDC = ? AND CNDSPRSUBCONID = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P02SG4", "UPDATE CNDSPRSUBCON SET CNDSPRSUBCONTOT=?  WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONPERT = 0)", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P02SG5", "SELECT SUM(CNDSPRSUBCONTOT) FROM CNDSPRSUBCON WHERE (CNDSPRSUBCONPERT = ?) AND (CNDSPRCIA = ?) AND (CNDSPRTDC = ( ?)) AND (CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'SC')) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setLong(5, ((Number) parms[5]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

