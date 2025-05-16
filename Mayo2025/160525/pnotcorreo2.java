/*
               File: PNotCorreo2
        Description: PNot Correo2
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 16, 2025 10:5:2.69
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnotcorreo2 extends GXProcedure
{
   public pnotcorreo2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnotcorreo2.class ), "" );
   }

   public pnotcorreo2( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( String[] aP0 ,
                            String aP1 ,
                            String aP2 ,
                            String aP3 ,
                            String aP4 )
   {
      pnotcorreo2.this.AV16nombreEnvia = aP0[0];
      this.aP0 = aP0;
      pnotcorreo2.this.AV11CNCDIREM = aP1;
      pnotcorreo2.this.AV20nom = aP2;
      pnotcorreo2.this.AV19CuerpoCorreo = aP3;
      pnotcorreo2.this.AV18Asunto = aP4;
      pnotcorreo2.this.aP5 = aP5;
      pnotcorreo2.this.aP5 = new short[] {0};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      pnotcorreo2.this.AV16nombreEnvia = aP0[0];
      this.aP0 = aP0;
      pnotcorreo2.this.AV11CNCDIREM = aP1;
      pnotcorreo2.this.AV20nom = aP2;
      pnotcorreo2.this.AV19CuerpoCorreo = aP3;
      pnotcorreo2.this.AV18Asunto = aP4;
      pnotcorreo2.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV24ServidorSMTP ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "KDSProyectos", "EMAIL", "CSM", (short)(1), GXv_decimal1, GXv_char2) ;
      pnotcorreo2.this.AV24ServidorSMTP = GXv_char2[0] ;
      GXv_decimal1[0] = DecimalUtil.doubleToDec(AV25puerto) ;
      GXv_char2[0] = "" ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "KDSProyectos", "EMAIL", "CSM", (short)(2), GXv_decimal1, GXv_char2) ;
      pnotcorreo2.this.AV25puerto = (int)(DecimalUtil.decToDouble(GXv_decimal1[0])) ;
      GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV26correoEnvia ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "KDSProyectos", "EMAIL", "CSM", (short)(3), GXv_decimal1, GXv_char2) ;
      pnotcorreo2.this.AV26correoEnvia = GXv_char2[0] ;
      GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV27contrasenaEnvia ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "KDSProyectos", "EMAIL", "CSM", (short)(4), GXv_decimal1, GXv_char2) ;
      pnotcorreo2.this.AV27contrasenaEnvia = GXv_char2[0] ;
      AV10ENVIO.getTo().removeAllItems();
      AV9DIRTO.setAddress( GXutil.trim( AV11CNCDIREM) );
      AV9DIRTO.setName( GXutil.trim( AV20nom) );
      AV10ENVIO.getTo().add(AV9DIRTO);
      AV10ENVIO.setSubject( GXutil.trim( AV18Asunto) );
      AV10ENVIO.setHtmltext( GXutil.trim( AV19CuerpoCorreo) );
      AV21menssmtp.setHost( GXutil.trim( AV24ServidorSMTP) );
      AV21menssmtp.setPort( AV25puerto );
      AV21menssmtp.setSecure( (short)(1) );
      AV21menssmtp.getSender().setName( GXutil.trim( AV16nombreEnvia) );
      AV21menssmtp.getSender().setAddress( GXutil.trim( AV26correoEnvia) );
      AV21menssmtp.setAuthentication( (short)(1) );
      AV21menssmtp.setUserName( GXutil.trim( AV26correoEnvia) );
      AV21menssmtp.setPassword( GXutil.trim( AV27contrasenaEnvia) );
      AV21menssmtp.login();
      AV22errrcode = AV21menssmtp.getErrCode() ;
      if ( ( AV22errrcode == 0 ) || ( AV22errrcode == 1 ) )
      {
         AV21menssmtp.send(AV10ENVIO);
         AV21menssmtp.logout();
         AV23enviocorreo = (short)(1) ;
      }
      else
      {
         AV23enviocorreo = AV22errrcode ;
      }
      AV10ENVIO = new com.genexus.internet.GXMailMessage() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnotcorreo2.this.AV16nombreEnvia;
      this.aP5[0] = pnotcorreo2.this.AV23enviocorreo;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24ServidorSMTP = "" ;
      AV26correoEnvia = "" ;
      GXv_decimal1 = new java.math.BigDecimal [1] ;
      AV27contrasenaEnvia = "" ;
      GXv_char2 = new String [1] ;
      AV10ENVIO = new com.genexus.internet.GXMailMessage();
      AV9DIRTO = new com.genexus.internet.MailRecipient();
      AV21menssmtp = new com.genexus.internet.GXSMTPSession();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV23enviocorreo ;
   private short AV22errrcode ;
   private short Gx_err ;
   private int AV25puerto ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private String AV16nombreEnvia ;
   private String AV11CNCDIREM ;
   private String AV20nom ;
   private String AV18Asunto ;
   private String AV24ServidorSMTP ;
   private String AV26correoEnvia ;
   private String AV27contrasenaEnvia ;
   private String GXv_char2[] ;
   private String AV19CuerpoCorreo ;
   private com.genexus.internet.MailRecipient AV9DIRTO ;
   private com.genexus.internet.GXSMTPSession AV21menssmtp ;
   private String[] aP0 ;
   private short[] aP5 ;
   private com.genexus.internet.GXMailMessage AV10ENVIO ;
}

