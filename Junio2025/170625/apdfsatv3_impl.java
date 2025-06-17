/*
               File: apdfsatv3_impl
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

public final  class apdfsatv3_impl extends GXWebReport
{
   public apdfsatv3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV41FACTXMLCIA = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV78FACTXMLSER = httpContext.GetNextPar( ) ;
            AV52FACTXMLFOL = GXutil.lval( httpContext.GetNextPar( )) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("KDSTheme");
      M_top = -2 ;
      M_bot = 2 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 12730, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV25CONT_HOJAS = (short)(0) ;
         GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV151mostrarqr ;
         new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "", "TIMBRADO", "FACT", (short)(21), GXv_decimal1, GXv_char2) ;
         apdfsatv3_impl.this.AV151mostrarqr = GXv_char2[0] ;
         GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV152urlqr ;
         new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "", "TIMBRADO", "FACT", (short)(22), GXv_decimal1, GXv_char2) ;
         apdfsatv3_impl.this.AV152urlqr = GXv_char2[0] ;
         GXv_decimal1[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV153CPO ;
         new com.kdsproyectos.conglosis01(remoteHandle, context).execute( 1, "KDSProyectos", "GRAL", "CSM", (short)(24), GXv_decimal1, GXv_char2) ;
         apdfsatv3_impl.this.AV153CPO = GXv_char2[0] ;
         /* Using cursor P02RR2 */
         pr_default.execute(0, new Object[] {new Long(AV41FACTXMLCIA)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5939CNCIASID = P02RR2_A5939CNCIASID[0] ;
            A9CNCIASDSC = P02RR2_A9CNCIASDSC[0] ;
            n9CNCIASDSC = P02RR2_n9CNCIASDSC[0] ;
            A5147CNCIASIMGFILE = P02RR2_A5147CNCIASIMGFILE[0] ;
            n5147CNCIASIMGFILE = P02RR2_n5147CNCIASIMGFILE[0] ;
            A13CNCIASCP = P02RR2_A13CNCIASCP[0] ;
            n13CNCIASCP = P02RR2_n13CNCIASCP[0] ;
            A10CNCIASCOL = P02RR2_A10CNCIASCOL[0] ;
            n10CNCIASCOL = P02RR2_n10CNCIASCOL[0] ;
            A11CNCIASCAL = P02RR2_A11CNCIASCAL[0] ;
            n11CNCIASCAL = P02RR2_n11CNCIASCAL[0] ;
            A3018CNCIASFAX = P02RR2_A3018CNCIASFAX[0] ;
            n3018CNCIASFAX = P02RR2_n3018CNCIASFAX[0] ;
            A2417CNCIASTE1 = P02RR2_A2417CNCIASTE1[0] ;
            n2417CNCIASTE1 = P02RR2_n2417CNCIASTE1[0] ;
            A2418CNCIASTE2 = P02RR2_A2418CNCIASTE2[0] ;
            n2418CNCIASTE2 = P02RR2_n2418CNCIASTE2[0] ;
            A2419CNCIASTE3 = P02RR2_A2419CNCIASTE3[0] ;
            n2419CNCIASTE3 = P02RR2_n2419CNCIASTE3[0] ;
            AV17CNCIASDSC = A9CNCIASDSC ;
            AV91image = A5147CNCIASIMGFILE ;
            AV195Image_GXI = com.genexus.GXDbFile.getUriFromFile( "", "", A5147CNCIASIMGFILE) ;
            AV26DIRECCION = GXutil.trim( A11CNCIASCAL) + " " + GXutil.trim( A10CNCIASCOL) + " " + "C.P." + GXutil.trim( A13CNCIASCP) ;
            AV18CNCIASFAX = A3018CNCIASFAX ;
            if ( GXutil.strcmp(A2417CNCIASTE1, "") != 0 )
            {
               AV20CNCIASTE1 = A2417CNCIASTE1 ;
            }
            else
            {
               if ( GXutil.strcmp(A2418CNCIASTE2, "") != 0 )
               {
                  AV20CNCIASTE1 = A2418CNCIASTE2 ;
               }
               else
               {
                  AV20CNCIASTE1 = A2419CNCIASTE3 ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P02RR3 */
         pr_default.execute(1, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9454FACTXMLIDATR = P02RR3_A9454FACTXMLIDATR[0] ;
            A9453FACTXMLNODO = P02RR3_A9453FACTXMLNODO[0] ;
            A9385FACTXMLFOL = P02RR3_A9385FACTXMLFOL[0] ;
            A9384FACTXMLSER = P02RR3_A9384FACTXMLSER[0] ;
            A9383FACTXMLCIA = P02RR3_A9383FACTXMLCIA[0] ;
            A9455FACTXMLVALATR = P02RR3_A9455FACTXMLVALATR[0] ;
            n9455FACTXMLVALATR = P02RR3_n9455FACTXMLVALATR[0] ;
            AV129VERSION = GXutil.trim( A9455FACTXMLVALATR) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P02RR4 */
         pr_default.execute(2, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9385FACTXMLFOL = P02RR4_A9385FACTXMLFOL[0] ;
            A9384FACTXMLSER = P02RR4_A9384FACTXMLSER[0] ;
            A9383FACTXMLCIA = P02RR4_A9383FACTXMLCIA[0] ;
            A9406FACTXMLUUID = P02RR4_A9406FACTXMLUUID[0] ;
            n9406FACTXMLUUID = P02RR4_n9406FACTXMLUUID[0] ;
            A9446FACTXMLNCER = P02RR4_A9446FACTXMLNCER[0] ;
            n9446FACTXMLNCER = P02RR4_n9446FACTXMLNCER[0] ;
            A9451FACTXMLNCERS = P02RR4_A9451FACTXMLNCERS[0] ;
            n9451FACTXMLNCERS = P02RR4_n9451FACTXMLNCERS[0] ;
            A9386FACTXMLFEC = P02RR4_A9386FACTXMLFEC[0] ;
            n9386FACTXMLFEC = P02RR4_n9386FACTXMLFEC[0] ;
            A9448FACTXMLFTIM = P02RR4_A9448FACTXMLFTIM[0] ;
            n9448FACTXMLFTIM = P02RR4_n9448FACTXMLFTIM[0] ;
            A9389FACTXMLRFCE = P02RR4_A9389FACTXMLRFCE[0] ;
            n9389FACTXMLRFCE = P02RR4_n9389FACTXMLRFCE[0] ;
            A9390FACTXMLREGF = P02RR4_A9390FACTXMLREGF[0] ;
            n9390FACTXMLREGF = P02RR4_n9390FACTXMLREGF[0] ;
            A13933FACTXMLREGFR = P02RR4_A13933FACTXMLREGFR[0] ;
            n13933FACTXMLREGFR = P02RR4_n13933FACTXMLREGFR[0] ;
            A9395FACTXMLUSOC = P02RR4_A9395FACTXMLUSOC[0] ;
            n9395FACTXMLUSOC = P02RR4_n9395FACTXMLUSOC[0] ;
            A9391FACTXMLCODP = P02RR4_A9391FACTXMLCODP[0] ;
            n9391FACTXMLCODP = P02RR4_n9391FACTXMLCODP[0] ;
            A9392FACTXMLRFCR = P02RR4_A9392FACTXMLRFCR[0] ;
            n9392FACTXMLRFCR = P02RR4_n9392FACTXMLRFCR[0] ;
            A15512FACTXMLGEN = P02RR4_A15512FACTXMLGEN[0] ;
            n15512FACTXMLGEN = P02RR4_n15512FACTXMLGEN[0] ;
            A9848FACTXMLPROY = P02RR4_A9848FACTXMLPROY[0] ;
            n9848FACTXMLPROY = P02RR4_n9848FACTXMLPROY[0] ;
            A9394FACTXMLNREC = P02RR4_A9394FACTXMLNREC[0] ;
            n9394FACTXMLNREC = P02RR4_n9394FACTXMLNREC[0] ;
            A9469FACTXMLCOM = P02RR4_A9469FACTXMLCOM[0] ;
            n9469FACTXMLCOM = P02RR4_n9469FACTXMLCOM[0] ;
            A9449FACTXMLRFCPR = P02RR4_A9449FACTXMLRFCPR[0] ;
            n9449FACTXMLRFCPR = P02RR4_n9449FACTXMLRFCPR[0] ;
            A10341FACTXMLCODPR = P02RR4_A10341FACTXMLCODPR[0] ;
            n10341FACTXMLCODPR = P02RR4_n10341FACTXMLCODPR[0] ;
            A9396FACTXMLMON = P02RR4_A9396FACTXMLMON[0] ;
            n9396FACTXMLMON = P02RR4_n9396FACTXMLMON[0] ;
            A9397FACTXMLFPAG = P02RR4_A9397FACTXMLFPAG[0] ;
            n9397FACTXMLFPAG = P02RR4_n9397FACTXMLFPAG[0] ;
            A9398FACTXMLMPAG = P02RR4_A9398FACTXMLMPAG[0] ;
            n9398FACTXMLMPAG = P02RR4_n9398FACTXMLMPAG[0] ;
            A9388FACTXMLTIPC = P02RR4_A9388FACTXMLTIPC[0] ;
            n9388FACTXMLTIPC = P02RR4_n9388FACTXMLTIPC[0] ;
            A9400FACTXMLSUB = P02RR4_A9400FACTXMLSUB[0] ;
            n9400FACTXMLSUB = P02RR4_n9400FACTXMLSUB[0] ;
            A12161FACTXMLTOTAM = P02RR4_A12161FACTXMLTOTAM[0] ;
            n12161FACTXMLTOTAM = P02RR4_n12161FACTXMLTOTAM[0] ;
            A9401FACTXMLDESC = P02RR4_A9401FACTXMLDESC[0] ;
            n9401FACTXMLDESC = P02RR4_n9401FACTXMLDESC[0] ;
            A9402FACTXMLIVA = P02RR4_A9402FACTXMLIVA[0] ;
            n9402FACTXMLIVA = P02RR4_n9402FACTXMLIVA[0] ;
            A9403FACTXMLRET = P02RR4_A9403FACTXMLRET[0] ;
            n9403FACTXMLRET = P02RR4_n9403FACTXMLRET[0] ;
            A10131FACTXMLCTAC = P02RR4_A10131FACTXMLCTAC[0] ;
            n10131FACTXMLCTAC = P02RR4_n10131FACTXMLCTAC[0] ;
            A10129FACTXMLRFCB = P02RR4_A10129FACTXMLRFCB[0] ;
            n10129FACTXMLRFCB = P02RR4_n10129FACTXMLRFCB[0] ;
            A9404FACTXMLTOT = P02RR4_A9404FACTXMLTOT[0] ;
            n9404FACTXMLTOT = P02RR4_n9404FACTXMLTOT[0] ;
            A9393FACTXMLCLI = P02RR4_A9393FACTXMLCLI[0] ;
            n9393FACTXMLCLI = P02RR4_n9393FACTXMLCLI[0] ;
            A9450FACTXMLSECFD = P02RR4_A9450FACTXMLSECFD[0] ;
            n9450FACTXMLSECFD = P02RR4_n9450FACTXMLSECFD[0] ;
            A9452FACTXMLSESAT = P02RR4_A9452FACTXMLSESAT[0] ;
            n9452FACTXMLSESAT = P02RR4_n9452FACTXMLSESAT[0] ;
            A9537FACTXMLUUIDR = P02RR4_A9537FACTXMLUUIDR[0] ;
            n9537FACTXMLUUIDR = P02RR4_n9537FACTXMLUUIDR[0] ;
            A9536FACTXMLTIPREL = P02RR4_A9536FACTXMLTIPREL[0] ;
            n9536FACTXMLTIPREL = P02RR4_n9536FACTXMLTIPREL[0] ;
            A10856FACTXMLDIRE = P02RR4_A10856FACTXMLDIRE[0] ;
            n10856FACTXMLDIRE = P02RR4_n10856FACTXMLDIRE[0] ;
            A9634FACTXMLPREFAC = P02RR4_A9634FACTXMLPREFAC[0] ;
            n9634FACTXMLPREFAC = P02RR4_n9634FACTXMLPREFAC[0] ;
            A9399FACTXMLTCAM = P02RR4_A9399FACTXMLTCAM[0] ;
            n9399FACTXMLTCAM = P02RR4_n9399FACTXMLTCAM[0] ;
            A10184FACTXMLFECP = P02RR4_A10184FACTXMLFECP[0] ;
            n10184FACTXMLFECP = P02RR4_n10184FACTXMLFECP[0] ;
            AV87FACTXMLUUID = A9406FACTXMLUUID ;
            AV59FACTXMLNCER = A9446FACTXMLNCER ;
            AV60FACTXMLNCERS = A9451FACTXMLNCERS ;
            AV50FACTXMLFEC = A9386FACTXMLFEC ;
            AV54FACTXMLFTIM = A9448FACTXMLFTIM ;
            AV74FACTXMLRFCE = A9389FACTXMLRFCE ;
            AV67FACTXMLREGF = A9390FACTXMLREGF ;
            AV134FACTXMLREGFR = A13933FACTXMLREGFR ;
            AV86FACTXMLUSOC = A9395FACTXMLUSOC ;
            AV44FACTXMLCODP = A9391FACTXMLCODP ;
            AV76FACTXMLRFCR = A9392FACTXMLRFCR ;
            AV145FACTXMLGEN = A15512FACTXMLGEN ;
            AV178FACTXMLPROY = A9848FACTXMLPROY ;
            AV61FACTXMLNREC = A9394FACTXMLNREC ;
            AV144nombre = "" ;
            AV149FACTXMLCOM_G = A9469FACTXMLCOM ;
            AV75FACTXMLRFCPR = A9449FACTXMLRFCPR ;
            AV132FACTXMLCODPR = A10341FACTXMLCODPR ;
            AV58FACTXMLMON = A9396FACTXMLMON ;
            AV104SATFORPAGID = A9397FACTXMLFPAG ;
            AV106SATMETPAGID = A9398FACTXMLMPAG ;
            AV110SATTIPCOMID = A9388FACTXMLTIPC ;
            AV80factxmlsub = A9400FACTXMLSUB ;
            AV48FACTXMLDESC = A9401FACTXMLDESC.add(A12161FACTXMLTOTAM) ;
            AV57FACTXMLIVA = A9402FACTXMLIVA ;
            AV68FACTXMLRET = A9403FACTXMLRET ;
            AV46FACTXMLCTAC = A10131FACTXMLCTAC ;
            AV72FACTXMLRFCB = A10129FACTXMLRFCB ;
            AV83FACTXMLTOT = A9404FACTXMLTOT ;
            AV126totalpag = A9404FACTXMLTOT ;
            AV43FACTXMLCLI = A9393FACTXMLCLI ;
            /* Execute user subroutine: 'DATOSCLIENTE' */
            S231 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV77factxmlsecfd = A9450FACTXMLSECFD ;
            AV79factxmlsesat = A9452FACTXMLSESAT ;
            AV125total = A9404FACTXMLTOT ;
            AV88FACTXMLUUIDR = A9537FACTXMLUUIDR ;
            AV82FACTXMLTIPREL = A9536FACTXMLTIPREL ;
            AV49FACTXMLDIRE = A10856FACTXMLDIRE ;
            AV185FACTXMLPREFAC = A9634FACTXMLPREFAC ;
            AV120tipocambio = A9399FACTXMLTCAM ;
            if ( AV120tipocambio.doubleValue() <= 1 )
            {
               AV143tipocam = "" ;
               AV142titulotpc = "" ;
            }
            else
            {
               AV143tipocam = GXutil.str( AV120tipocambio, 15, 6) ;
               AV142titulotpc = "Tipo de Cambio" ;
            }
            /* Execute user subroutine: 'DESCRIPCIONES' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV110SATTIPCOMID, "P") == 0 )
            {
               AV105SATMETPAGDSC = "" ;
               AV80factxmlsub = DecimalUtil.doubleToDec(0) ;
               AV125total = DecimalUtil.doubleToDec(0) ;
               GXv_char2[0] = AV89fecpag ;
               GXv_char3[0] = "" ;
               new com.kdsproyectos.fecha_iso_8601(remoteHandle, context).execute( A10184FACTXMLFECP, GXv_char2, GXv_char3) ;
               apdfsatv3_impl.this.AV89fecpag = GXv_char2[0] ;
               AV68FACTXMLRET = DecimalUtil.doubleToDec(0) ;
               AV57FACTXMLIVA = DecimalUtil.doubleToDec(0) ;
               AV90formapago = AV103SATFORPAGDSC ;
               AV103SATFORPAGDSC = "" ;
               AV48FACTXMLDESC = DecimalUtil.doubleToDec(0) ;
               AV97monpag = A9396FACTXMLMON ;
               if ( AV120tipocambio.doubleValue() > 1 )
               {
                  AV121Tipocampag = GXutil.str( AV120tipocambio, 15, 6) ;
               }
               else
               {
                  AV121Tipocampag = "" ;
               }
            }
            AV25CONT_HOJAS = (short)(AV25CONT_HOJAS+1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( GXutil.strcmp(AV185FACTXMLPREFAC, "N") == 0 )
         {
            AV119timbre = "||1.0|" + GXutil.trim( AV87FACTXMLUUID) + "|" + GXutil.trim( AV54FACTXMLFTIM) + "|" + GXutil.trim( AV77factxmlsecfd) + "|" + GXutil.trim( AV60FACTXMLNCERS) + "||" ;
            AV189cadenaOriginal = GXutil.trim( AV119timbre) ;
            /* Execute user subroutine: 'BUSCAFE' */
            S191 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV136Fe = GXutil.trim( AV140string) ;
            if ( GXutil.strcmp(AV110SATTIPCOMID, "P") == 0 )
            {
               AV102qr = "https://verificacfdi.facturaelectronica.sat.gob.mx/default.aspx?id=" + GXutil.trim( AV87FACTXMLUUID) + "%26re=" + GXutil.trim( AV74FACTXMLRFCE) + "%26rr=" + GXutil.trim( AV76FACTXMLRFCR) + "%26tt=" + GXutil.trim( GXutil.str( AV126totalpag, 15, 2)) + "%26fe=" + GXutil.trim( AV136Fe) ;
            }
            else
            {
               AV102qr = "https://verificacfdi.facturaelectronica.sat.gob.mx/default.aspx?id=" + GXutil.trim( AV87FACTXMLUUID) + "%26re=" + GXutil.trim( AV74FACTXMLRFCE) + "%26rr=" + GXutil.trim( AV76FACTXMLRFCR) + "%26tt=" + GXutil.trim( GXutil.str( AV125total, 15, 2)) + "%26fe=" + GXutil.trim( AV136Fe) ;
            }
            AV102qr = GXutil.strReplace( AV102qr, "+", "%2B") ;
            AV102qr = GXutil.strReplace( AV102qr, "?", "%3F") ;
            AV102qr = GXutil.strReplace( AV102qr, "=", "%3D") ;
            AV102qr = GXutil.strReplace( AV102qr, ":", "%3A") ;
            AV102qr = GXutil.strReplace( AV102qr, "/", "%2F") ;
            AV102qr = GXutil.strReplace( AV102qr, "&", "%26") ;
            AV141cadena = GXutil.trim( AV152urlqr) + GXutil.trim( AV102qr) ;
            AV127url = formatLink(AV141cadena)  ;
            AV127url = GXutil.strReplace( AV127url, " ", "+") ;
            AV137qr2 = AV127url ;
            AV198Qr2_GXI = GXDbFile.pathToUrl( AV127url, context.getHttpContext()) ;
            /* Using cursor P02RR5 */
            pr_default.execute(3, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A9385FACTXMLFOL = P02RR5_A9385FACTXMLFOL[0] ;
               A9384FACTXMLSER = P02RR5_A9384FACTXMLSER[0] ;
               A9383FACTXMLCIA = P02RR5_A9383FACTXMLCIA[0] ;
               A15047FACTXMLQR = P02RR5_A15047FACTXMLQR[0] ;
               n15047FACTXMLQR = P02RR5_n15047FACTXMLQR[0] ;
               A15047FACTXMLQR = AV137qr2 ;
               n15047FACTXMLQR = false ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P02RR6 */
               pr_default.execute(4, new Object[] {new Boolean(n15047FACTXMLQR), A15047FACTXMLQR, new Long(A9383FACTXMLCIA), A9384FACTXMLSER, new Long(A9385FACTXMLFOL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("FACTXML") ;
               if (true) break;
               /* Using cursor P02RR7 */
               pr_default.execute(5, new Object[] {new Boolean(n15047FACTXMLQR), A15047FACTXMLQR, new Long(A9383FACTXMLCIA), A9384FACTXMLSER, new Long(A9385FACTXMLFOL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("FACTXML") ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            /* Using cursor P02RR8 */
            pr_default.execute(6, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A9385FACTXMLFOL = P02RR8_A9385FACTXMLFOL[0] ;
               A9384FACTXMLSER = P02RR8_A9384FACTXMLSER[0] ;
               A9383FACTXMLCIA = P02RR8_A9383FACTXMLCIA[0] ;
               A15047FACTXMLQR = P02RR8_A15047FACTXMLQR[0] ;
               n15047FACTXMLQR = P02RR8_n15047FACTXMLQR[0] ;
               AV22codigo = A15047FACTXMLQR ;
               AV201Codigo_GXI = com.genexus.GXDbFile.getUriFromFile( "", "", A15047FACTXMLQR) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
         }
         h2RR0( false, 320) ;
         getPrinter().GxDrawRect(13, Gx_line+187, 860, Gx_line+320, 1, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
         sImgUrl = ((GXutil.strcmp("", AV91image)==0) ? AV195Image_GXI : AV91image) ;
         getPrinter().GxDrawBitMap(sImgUrl, 20, Gx_line+13, 275, Gx_line+170) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("Folio Fiscal (UUID):", 547, Gx_line+213, 680, Gx_line+228, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FACTXMLUUID, "")), 547, Gx_line+227, 759, Gx_line+242, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("No. de serie certificado SAT:", 547, Gx_line+240, 721, Gx_line+255, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60FACTXMLNCERS, "")), 547, Gx_line+253, 705, Gx_line+268, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("No. certificado emisor", 547, Gx_line+267, 740, Gx_line+282, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59FACTXMLNCER, "")), 547, Gx_line+280, 737, Gx_line+295, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("Fecha de emisión:", 547, Gx_line+187, 660, Gx_line+202, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50FACTXMLFEC, "")), 693, Gx_line+187, 777, Gx_line+202, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44FACTXMLCODP, "")), 693, Gx_line+200, 736, Gx_line+217, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("Lugar de Expedición:", 547, Gx_line+200, 687, Gx_line+215, 0, 0, 0, 0) ;
         getPrinter().GxDrawText("Emisor (Beneficiario)", 13, Gx_line+187, 146, Gx_line+202, 0, 0, 0, 0) ;
         getPrinter().GxDrawText("Receptor (Ordenante del pago)", 287, Gx_line+187, 480, Gx_line+202, 0, 0, 0, 0) ;
         getPrinter().GxDrawText("Régimen Fiscal:", 13, Gx_line+227, 113, Gx_line+242, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130SATREGFISBUS, "")), 13, Gx_line+240, 246, Gx_line+255, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17CNCIASDSC, "")), 13, Gx_line+200, 213, Gx_line+216, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("RFC:", 13, Gx_line+213, 46, Gx_line+226, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74FACTXMLRFCE, "")), 47, Gx_line+213, 152, Gx_line+227, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61FACTXMLNREC, "")), 287, Gx_line+200, 500, Gx_line+213, 0+16, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("RFC:", 287, Gx_line+213, 320, Gx_line+228, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76FACTXMLRFCR, "")), 320, Gx_line+213, 425, Gx_line+226, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(300, Gx_line+13, 820, Gx_line+93, 1, 128, 128, 128, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial Black", 14, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("RECIBO ELECTRONICO DE PAGO", 327, Gx_line+13, 800, Gx_line+66, 1, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("Clave de confirmación:", 547, Gx_line+293, 667, Gx_line+308, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+320) ;
         AV183hayrel = "N" ;
         if ( GXutil.strcmp(AV185FACTXMLPREFAC, "N") == 0 )
         {
            /* Using cursor P02RR9 */
            pr_default.execute(7, new Object[] {AV78FACTXMLSER, new Long(AV52FACTXMLFOL), new Long(AV41FACTXMLCIA)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A11966FACTRELCIA = P02RR9_A11966FACTRELCIA[0] ;
               A11968FACTRELFOL = P02RR9_A11968FACTRELFOL[0] ;
               A11967FACTRELSER = P02RR9_A11967FACTRELSER[0] ;
               A11841FACTAMOUUID = P02RR9_A11841FACTAMOUUID[0] ;
               A11960FACTAMOCLI = P02RR9_A11960FACTAMOCLI[0] ;
               AV183hayrel = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         else
         {
            /* Using cursor P02RR10 */
            pr_default.execute(8, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A11869TEMRELCIA = P02RR10_A11869TEMRELCIA[0] ;
               A11982TEMRELFOLA = P02RR10_A11982TEMRELFOLA[0] ;
               n11982TEMRELFOLA = P02RR10_n11982TEMRELFOLA[0] ;
               A11983TEMRELSERA = P02RR10_A11983TEMRELSERA[0] ;
               n11983TEMRELSERA = P02RR10_n11983TEMRELSERA[0] ;
               A11870TEMRELCLI = P02RR10_A11870TEMRELCLI[0] ;
               A11871TEMRELUUID = P02RR10_A11871TEMRELUUID[0] ;
               A11872TEMPRELTIPC = P02RR10_A11872TEMPRELTIPC[0] ;
               AV183hayrel = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
         if ( GXutil.strcmp(AV183hayrel, "S") == 0 )
         {
            if ( GXutil.strcmp(AV185FACTXMLPREFAC, "S") != 0 )
            {
               /* Using cursor P02RR11 */
               pr_default.execute(9, new Object[] {AV78FACTXMLSER, new Long(AV52FACTXMLFOL), new Long(AV41FACTXMLCIA)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A11967FACTRELSER = P02RR11_A11967FACTRELSER[0] ;
                  A11968FACTRELFOL = P02RR11_A11968FACTRELFOL[0] ;
                  A11966FACTRELCIA = P02RR11_A11966FACTRELCIA[0] ;
                  A11841FACTAMOUUID = P02RR11_A11841FACTAMOUUID[0] ;
                  A18103FACTAMOTREL = P02RR11_A18103FACTAMOTREL[0] ;
                  n18103FACTAMOTREL = P02RR11_n18103FACTAMOTREL[0] ;
                  A11960FACTAMOCLI = P02RR11_A11960FACTAMOCLI[0] ;
                  AV88FACTXMLUUIDR = A11841FACTAMOUUID ;
                  AV182FACTAMOTREL = A18103FACTAMOTREL ;
                  /* Execute user subroutine: 'TIPO DE RELACIÓN' */
                  S221 ();
                  if ( returnInSub )
                  {
                     pr_default.close(9);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
            }
            else
            {
               /* Using cursor P02RR12 */
               pr_default.execute(10, new Object[] {AV78FACTXMLSER, new Long(AV52FACTXMLFOL), new Long(AV41FACTXMLCIA)});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A11983TEMRELSERA = P02RR12_A11983TEMRELSERA[0] ;
                  n11983TEMRELSERA = P02RR12_n11983TEMRELSERA[0] ;
                  A11982TEMRELFOLA = P02RR12_A11982TEMRELFOLA[0] ;
                  n11982TEMRELFOLA = P02RR12_n11982TEMRELFOLA[0] ;
                  A11869TEMRELCIA = P02RR12_A11869TEMRELCIA[0] ;
                  A11871TEMRELUUID = P02RR12_A11871TEMRELUUID[0] ;
                  A18102TEMRELTREL = P02RR12_A18102TEMRELTREL[0] ;
                  n18102TEMRELTREL = P02RR12_n18102TEMRELTREL[0] ;
                  A11870TEMRELCLI = P02RR12_A11870TEMRELCLI[0] ;
                  A11872TEMPRELTIPC = P02RR12_A11872TEMPRELTIPC[0] ;
                  AV88FACTXMLUUIDR = A11871TEMRELUUID ;
                  AV182FACTAMOTREL = A18102TEMRELTREL ;
                  /* Execute user subroutine: 'TIPO DE RELACIÓN' */
                  S221 ();
                  if ( returnInSub )
                  {
                     pr_default.close(10);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  pr_default.readNext(10);
               }
               pr_default.close(10);
            }
         }
         AV124titulocol = "Descuento" ;
         if ( GXutil.strcmp(AV110SATTIPCOMID, "P") != 0 )
         {
            /* Using cursor P02RR13 */
            pr_default.execute(11, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A9383FACTXMLCIA = P02RR13_A9383FACTXMLCIA[0] ;
               A9384FACTXMLSER = P02RR13_A9384FACTXMLSER[0] ;
               A9385FACTXMLFOL = P02RR13_A9385FACTXMLFOL[0] ;
               A9410FACTXMLCLAVE = P02RR13_A9410FACTXMLCLAVE[0] ;
               n9410FACTXMLCLAVE = P02RR13_n9410FACTXMLCLAVE[0] ;
               A9412FACTXMLQTY = P02RR13_A9412FACTXMLQTY[0] ;
               n9412FACTXMLQTY = P02RR13_n9412FACTXMLQTY[0] ;
               A9413FACTXMLUND = P02RR13_A9413FACTXMLUND[0] ;
               n9413FACTXMLUND = P02RR13_n9413FACTXMLUND[0] ;
               A9414FACTXMLUNDS = P02RR13_A9414FACTXMLUNDS[0] ;
               n9414FACTXMLUNDS = P02RR13_n9414FACTXMLUNDS[0] ;
               A9421FACTXMLIMPT = P02RR13_A9421FACTXMLIMPT[0] ;
               n9421FACTXMLIMPT = P02RR13_n9421FACTXMLIMPT[0] ;
               A9415FACTXMLPRE = P02RR13_A9415FACTXMLPRE[0] ;
               n9415FACTXMLPRE = P02RR13_n9415FACTXMLPRE[0] ;
               A12162FACTXMLBAMOR = P02RR13_A12162FACTXMLBAMOR[0] ;
               n12162FACTXMLBAMOR = P02RR13_n12162FACTXMLBAMOR[0] ;
               A11828FACTXMLAMORT = P02RR13_A11828FACTXMLAMORT[0] ;
               n11828FACTXMLAMORT = P02RR13_n11828FACTXMLAMORT[0] ;
               A9416FACTXML1DESC = P02RR13_A9416FACTXML1DESC[0] ;
               n9416FACTXML1DESC = P02RR13_n9416FACTXML1DESC[0] ;
               A9422FACTXMLIMPV = P02RR13_A9422FACTXMLIMPV[0] ;
               n9422FACTXMLIMPV = P02RR13_n9422FACTXMLIMPV[0] ;
               A9418FACTXML1IVA = P02RR13_A9418FACTXML1IVA[0] ;
               n9418FACTXML1IVA = P02RR13_n9418FACTXML1IVA[0] ;
               A9417FACTXML1SUB = P02RR13_A9417FACTXML1SUB[0] ;
               n9417FACTXML1SUB = P02RR13_n9417FACTXML1SUB[0] ;
               A9411FACTXMLPRI2 = P02RR13_A9411FACTXMLPRI2[0] ;
               n9411FACTXMLPRI2 = P02RR13_n9411FACTXMLPRI2[0] ;
               A9551FACTXMLOBS = P02RR13_A9551FACTXMLOBS[0] ;
               n9551FACTXMLOBS = P02RR13_n9551FACTXMLOBS[0] ;
               A10962FACTXMLCONS = P02RR13_A10962FACTXMLCONS[0] ;
               A9408FACTXMLPRID = P02RR13_A9408FACTXMLPRID[0] ;
               AV42FACTXMLCLAVE = A9410FACTXMLCLAVE ;
               AV66FACTXMLQTY = A9412FACTXMLQTY ;
               AV84FACTXMLUND = A9413FACTXMLUND ;
               AV85FACTXMLUNDS = A9414FACTXMLUNDS ;
               AV55FACTXMLIMPT = A9421FACTXMLIMPT ;
               AV146satobjimpid = "02" ;
               /* Execute user subroutine: 'DESCRIPCIONES SAT' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(11);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV101precio = A9415FACTXMLPRE ;
               if ( A12162FACTXMLBAMOR == 1 )
               {
                  AV36FACTXML1DESC = A9416FACTXML1DESC.add(A11828FACTXMLAMORT) ;
               }
               else
               {
                  AV36FACTXML1DESC = A9416FACTXML1DESC ;
               }
               AV56FACTXMLimpv = A9422FACTXMLIMPV ;
               AV37FACTXML1iva = A9418FACTXML1IVA ;
               AV38FACTXML1SUB = A9417FACTXML1SUB ;
               AV116subtotal = A9417FACTXML1SUB ;
               AV65FACTXMLPRI2 = A9411FACTXMLPRI2 ;
               AV128VAR_AUX = A9551FACTXMLOBS ;
               /* Execute user subroutine: 'REVISA COMENTARIOS' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(11);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(11);
            }
            pr_default.close(11);
         }
         else
         {
            h2RR0( false, 254) ;
            getPrinter().GxDrawRect(0, Gx_line+133, 860, Gx_line+146, 1, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+1, 858, Gx_line+13, 2, 169, 169, 169, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("DETALLE DEL PAGO: BANCO ORDENANTE - BENEFICIARIO", 227, Gx_line+0, 600, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Fecha de Pago:", 7, Gx_line+80, 105, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Forma de Pago:", 7, Gx_line+93, 112, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Tipo de Cambio:", 467, Gx_line+80, 587, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Monto:", 467, Gx_line+93, 520, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Número de Operación:", 467, Gx_line+107, 607, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("RFC Emisor Cuenta Ordenante:", 7, Gx_line+13, 200, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89fecpag, "")), 207, Gx_line+80, 299, Gx_line+97, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90formapago, "")), 207, Gx_line+93, 454, Gx_line+106, 0+16, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV126totalpag, "ZZZ,ZZZ,ZZZ,ZZ9.99")), 607, Gx_line+93, 699, Gx_line+110, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Nombre Banco Extranjero:", 7, Gx_line+40, 174, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Cuenta Ordenante:", 7, Gx_line+27, 127, Gx_line+42, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("RFC Emisor Cuenta:", 460, Gx_line+13, 595, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Cuenta Beneficiario:", 460, Gx_line+27, 593, Gx_line+42, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Tipocampag, "")), 607, Gx_line+80, 674, Gx_line+97, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46FACTXMLCTAC, "")), 607, Gx_line+27, 733, Gx_line+40, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72FACTXMLRFCB, "")), 607, Gx_line+13, 757, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Moneda:", 7, Gx_line+107, 57, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97monpag, "")), 207, Gx_line+107, 320, Gx_line+124, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73factxmlrfcbcli, "")), 207, Gx_line+13, 291, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47factxmlctaclie, "")), 207, Gx_line+27, 349, Gx_line+44, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11bancodsc, "")), 207, Gx_line+40, 374, Gx_line+57, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(0, Gx_line+67, 860, Gx_line+80, 1, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("INFORMACION DEL PAGO", 320, Gx_line+67, 487, Gx_line+82, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("DATOS DEL SPEI", 340, Gx_line+133, 453, Gx_line+148, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Tipo Cadena Pago:", 7, Gx_line+147, 120, Gx_line+162, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Cadena Original del Comprobante de Pago:", 7, Gx_line+173, 300, Gx_line+188, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Sello del Pago:", 7, Gx_line+213, 120, Gx_line+228, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+254) ;
            /* Using cursor P02RR14 */
            pr_default.execute(12, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A9385FACTXMLFOL = P02RR14_A9385FACTXMLFOL[0] ;
               A9384FACTXMLSER = P02RR14_A9384FACTXMLSER[0] ;
               A9383FACTXMLCIA = P02RR14_A9383FACTXMLCIA[0] ;
               A10079FACTCOMNPA = P02RR14_A10079FACTCOMNPA[0] ;
               A10080FACTCOMIDR = P02RR14_A10080FACTCOMIDR[0] ;
               A10081FACTCOMMON = P02RR14_A10081FACTCOMMON[0] ;
               n10081FACTCOMMON = P02RR14_n10081FACTCOMMON[0] ;
               A10082FACTCOMSER = P02RR14_A10082FACTCOMSER[0] ;
               n10082FACTCOMSER = P02RR14_n10082FACTCOMSER[0] ;
               A10083FACTCOMFOL = P02RR14_A10083FACTCOMFOL[0] ;
               n10083FACTCOMFOL = P02RR14_n10083FACTCOMFOL[0] ;
               A10084FACTCOMMET = P02RR14_A10084FACTCOMMET[0] ;
               n10084FACTCOMMET = P02RR14_n10084FACTCOMMET[0] ;
               A10085FACTCOMSAN = P02RR14_A10085FACTCOMSAN[0] ;
               n10085FACTCOMSAN = P02RR14_n10085FACTCOMSAN[0] ;
               A10086FACTCOMIMP = P02RR14_A10086FACTCOMIMP[0] ;
               n10086FACTCOMIMP = P02RR14_n10086FACTCOMIMP[0] ;
               A10087FACTCOMSIN = P02RR14_A10087FACTCOMSIN[0] ;
               n10087FACTCOMSIN = P02RR14_n10087FACTCOMSIN[0] ;
               A10115FACTCOMTCAM = P02RR14_A10115FACTCOMTCAM[0] ;
               n10115FACTCOMTCAM = P02RR14_n10115FACTCOMTCAM[0] ;
               AV31FACTCOMNPA = A10079FACTCOMNPA ;
               AV28FACTCOMIDR = A10080FACTCOMIDR ;
               AV30FACTCOMMON = A10081FACTCOMMON ;
               AV33FACTCOMSER = A10082FACTCOMSER ;
               AV27FACTCOMFOL = A10083FACTCOMFOL ;
               AV9FACTCOMMET = A10084FACTCOMMET ;
               /* Execute user subroutine: 'METODO DE PAGO' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(12);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV32FACTCOMSAN = A10085FACTCOMSAN ;
               AV29FACTCOMIMP = A10086FACTCOMIMP ;
               AV34FACTCOMSIN = A10087FACTCOMSIN ;
               AV35FACTCOMTCAM = A10115FACTCOMTCAM ;
               if ( AV35FACTCOMTCAM.doubleValue() > 1 )
               {
                  AV122tipocampag2 = GXutil.str( AV35FACTCOMTCAM, 15, 6) ;
               }
               else
               {
                  AV122tipocampag2 = "" ;
               }
               pr_default.readNext(12);
            }
            pr_default.close(12);
         }
         if ( GXutil.strcmp(AV149FACTXMLCOM_G, "") != 0 )
         {
            /* Execute user subroutine: 'COMENTARIOS' */
            S181 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         GXt_char4 = AV8CNCMNMID ;
         GXv_char3[0] = GXt_char4 ;
         new com.kdsproyectos.cncmnm02(remoteHandle, context).execute( AV58FACTXMLMON, GXv_char3) ;
         apdfsatv3_impl.this.GXt_char4 = GXv_char3[0] ;
         AV8CNCMNMID = GXt_char4 ;
         if ( GXutil.strcmp(AV110SATTIPCOMID, "P") != 0 )
         {
            GXv_decimal1[0] = AV83FACTXMLTOT ;
            GXv_char3[0] = AV93Letra ;
            GXv_char2[0] = AV8CNCMNMID ;
            new com.kdsproyectos.pfin081(remoteHandle, context).execute( GXv_decimal1, GXv_char3, GXv_char2) ;
            apdfsatv3_impl.this.AV83FACTXMLTOT = GXv_decimal1[0] ;
            apdfsatv3_impl.this.AV93Letra = GXv_char3[0] ;
            apdfsatv3_impl.this.AV8CNCMNMID = GXv_char2[0] ;
         }
         else
         {
            AV93Letra = "CERO XXX  00/100" ;
         }
         if ( ( AV48FACTXMLDESC.doubleValue() != 0 ) || ( GXutil.strcmp(AV110SATTIPCOMID, "P") == 0 ) )
         {
            AV123titulo = "Descuento" ;
            AV98monto = AV48FACTXMLDESC ;
            AV123titulo = "Subtotal con Descuento" ;
            AV98monto = AV80factxmlsub.subtract(AV48FACTXMLDESC) ;
         }
         AV123titulo = "Iva" ;
         AV98monto = AV57FACTXMLIVA ;
         if ( AV68FACTXMLRET.doubleValue() != 0 )
         {
            /* Using cursor P02RR15 */
            pr_default.execute(13, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(13) != 101) )
            {
               A12089FACTXMLRETBAS = P02RR15_A12089FACTXMLRETBAS[0] ;
               n12089FACTXMLRETBAS = P02RR15_n12089FACTXMLRETBAS[0] ;
               A9385FACTXMLFOL = P02RR15_A9385FACTXMLFOL[0] ;
               A9384FACTXMLSER = P02RR15_A9384FACTXMLSER[0] ;
               A9383FACTXMLCIA = P02RR15_A9383FACTXMLCIA[0] ;
               A9424FACTXMLRETID = P02RR15_A9424FACTXMLRETID[0] ;
               AV69FACTXMLRETID = A9424FACTXMLRETID ;
               /* Execute user subroutine: 'RETENCIONES' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(13);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(13);
            }
            pr_default.close(13);
            /* Using cursor P02RR16 */
            pr_default.execute(14, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL)});
            while ( (pr_default.getStatus(14) != 101) )
            {
               A12089FACTXMLRETBAS = P02RR16_A12089FACTXMLRETBAS[0] ;
               n12089FACTXMLRETBAS = P02RR16_n12089FACTXMLRETBAS[0] ;
               A9385FACTXMLFOL = P02RR16_A9385FACTXMLFOL[0] ;
               A9384FACTXMLSER = P02RR16_A9384FACTXMLSER[0] ;
               A9383FACTXMLCIA = P02RR16_A9383FACTXMLCIA[0] ;
               A9424FACTXMLRETID = P02RR16_A9424FACTXMLRETID[0] ;
               AV69FACTXMLRETID = A9424FACTXMLRETID ;
               /* Execute user subroutine: 'RETENCIONES' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(14);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(14);
            }
            pr_default.close(14);
         }
         if ( ( AV125total.doubleValue() != 0 ) || ( GXutil.strcmp(AV110SATTIPCOMID, "P") == 0 ) )
         {
            AV123titulo = "Total" ;
            AV98monto = AV125total ;
         }
         if ( GXutil.strcmp(AV110SATTIPCOMID, "I") == 0 )
         {
            /* Execute user subroutine: 'PROYECTO' */
            S211 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( GXutil.strcmp(AV185FACTXMLPREFAC, "N") == 0 )
         {
            /* Execute user subroutine: 'TIMBRE FISCAL' */
            S171 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            h2RR0( false, 415) ;
            getPrinter().GxDrawRect(1, Gx_line+1, 867, Gx_line+13, 2, 169, 169, 169, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+188, 860, Gx_line+200, 2, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+321, 860, Gx_line+337, 2, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+254, 860, Gx_line+266, 2, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Sello digital del emisor", 333, Gx_line+187, 493, Gx_line+202, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Sello digital del SAT", 347, Gx_line+253, 482, Gx_line+268, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV79factxmlsesat, 0, Gx_line+267, 860, Gx_line+320, 0+16, 0, 0, 0) ;
            getPrinter().GxDrawText(AV77factxmlsecfd, 0, Gx_line+200, 860, Gx_line+253, 0+16, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Este documento es la representación impresa de un CFDI", 0, Gx_line+400, 380, Gx_line+415, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("{{Pages}}", 773, Gx_line+400, 817, Gx_line+415, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25CONT_HOJAS), "ZZZ9")), 727, Gx_line+400, 753, Gx_line+415, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Página", 660, Gx_line+400, 718, Gx_line+415, 1, 0, 0, 0) ;
            getPrinter().GxDrawText("de", 760, Gx_line+400, 777, Gx_line+415, 1, 0, 0, 0) ;
            getPrinter().GxDrawText("Cadena Original del Timbre Fiscal Digital", 287, Gx_line+320, 534, Gx_line+335, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(AV189cadenaOriginal, 0, Gx_line+333, 860, Gx_line+400, 0+16, 0, 0, 0) ;
            sImgUrl = ((GXutil.strcmp("", AV22codigo)==0) ? AV201Codigo_GXI : AV22codigo) ;
            getPrinter().GxDrawBitMap(sImgUrl, 7, Gx_line+53, 134, Gx_line+170) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("DOCUMENTOS PAGADOS", 347, Gx_line+0, 520, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("UUID", 120, Gx_line+13, 153, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28FACTCOMIDR, "")), 0, Gx_line+27, 267, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33FACTCOMSER, "")), 273, Gx_line+27, 333, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Serie", 287, Gx_line+13, 327, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27FACTCOMFOL), "ZZZZZZZZZ9")), 340, Gx_line+27, 400, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Folio", 353, Gx_line+13, 386, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30FACTCOMMON, "")), 407, Gx_line+27, 465, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Moneda", 407, Gx_line+13, 460, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Tipo Cambio", 467, Gx_line+13, 547, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122tipocampag2, "")), 473, Gx_line+27, 531, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95METODOPAG, "")), 547, Gx_line+27, 694, Gx_line+54, 1+16, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Metodo De Pago", 567, Gx_line+13, 672, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Pagado", 720, Gx_line+13, 767, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29FACTCOMIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")), 700, Gx_line+27, 783, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34FACTCOMSIN, "ZZZ,ZZZ,ZZZ,ZZ9.99")), 787, Gx_line+27, 862, Gx_line+44, 1, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Saldo Insoluto", 780, Gx_line+13, 868, Gx_line+28, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("Tipo de Relación:", 193, Gx_line+53, 300, Gx_line+68, 0, 0, 0, 0) ;
            getPrinter().GxDrawText("CFDI Relacionado:", 193, Gx_line+80, 326, Gx_line+95, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(194, Gx_line+121, 813, Gx_line+133, 2, 255, 255, 255, 1, 245, 245, 245, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("Este documento es una representación impresa de un CFDI", 293, Gx_line+120, 686, Gx_line+135, 1, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+415) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2RR0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'RETENCIONES' Routine */
      AV70FACTXMLRETMNT = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02RR17 */
      pr_default.execute(15, new Object[] {new Long(AV41FACTXMLCIA), AV78FACTXMLSER, new Long(AV52FACTXMLFOL), AV69FACTXMLRETID});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A9424FACTXMLRETID = P02RR17_A9424FACTXMLRETID[0] ;
         A9385FACTXMLFOL = P02RR17_A9385FACTXMLFOL[0] ;
         A9384FACTXMLSER = P02RR17_A9384FACTXMLSER[0] ;
         A9383FACTXMLCIA = P02RR17_A9383FACTXMLCIA[0] ;
         A9428FACTXMLRETMNT = P02RR17_A9428FACTXMLRETMNT[0] ;
         n9428FACTXMLRETMNT = P02RR17_n9428FACTXMLRETMNT[0] ;
         A12091FACTXMLRETNOM = P02RR17_A12091FACTXMLRETNOM[0] ;
         n12091FACTXMLRETNOM = P02RR17_n12091FACTXMLRETNOM[0] ;
         A9408FACTXMLPRID = P02RR17_A9408FACTXMLPRID[0] ;
         A10962FACTXMLCONS = P02RR17_A10962FACTXMLCONS[0] ;
         AV70FACTXMLRETMNT = AV70FACTXMLRETMNT.add(A9428FACTXMLRETMNT) ;
         AV71FACTXMLRETNOM = A12091FACTXMLRETNOM ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
      AV123titulo = AV71FACTXMLRETNOM ;
      AV98monto = AV70FACTXMLRETMNT ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'DESCRIPCIONES SAT' Routine */
      /* Using cursor P02RR18 */
      pr_default.execute(16, new Object[] {AV42FACTXMLCLAVE});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A9336SATPROSERDSC = P02RR18_A9336SATPROSERDSC[0] ;
         n9336SATPROSERDSC = P02RR18_n9336SATPROSERDSC[0] ;
         A9335SATPROSERID = P02RR18_A9335SATPROSERID[0] ;
         A9481SATPROSERBUS = GXutil.trim( A9335SATPROSERID) + " " + GXutil.trim( A9336SATPROSERDSC) ;
         AV107satproserbus = A9481SATPROSERBUS ;
         AV179satproserbus2 = A9481SATPROSERBUS ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      AV147satobjimpdsc = "" ;
      /* Using cursor P02RR19 */
      pr_default.execute(17, new Object[] {AV146satobjimpid});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A13930SATOBJIMPID = P02RR19_A13930SATOBJIMPID[0] ;
         A13931SATOBJIMPDSC = P02RR19_A13931SATOBJIMPDSC[0] ;
         n13931SATOBJIMPDSC = P02RR19_n13931SATOBJIMPDSC[0] ;
         AV147satobjimpdsc = A13931SATOBJIMPDSC ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
      /* Using cursor P02RR20 */
      pr_default.execute(18, new Object[] {AV55FACTXMLIMPT});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A9343SATIMPTIPID = P02RR20_A9343SATIMPTIPID[0] ;
         A9344SATIMPTIPDSC = P02RR20_A9344SATIMPTIPDSC[0] ;
         n9344SATIMPTIPDSC = P02RR20_n9344SATIMPTIPDSC[0] ;
         AV92impuesto = GXutil.trim( A9343SATIMPTIPID) + " " + GXutil.trim( A9344SATIMPTIPDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
      /* Using cursor P02RR21 */
      pr_default.execute(19, new Object[] {AV85FACTXMLUNDS});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A9339SATUNDMEDDSC = P02RR21_A9339SATUNDMEDDSC[0] ;
         n9339SATUNDMEDDSC = P02RR21_n9339SATUNDMEDDSC[0] ;
         A9338SATUNDMEDID = P02RR21_A9338SATUNDMEDID[0] ;
         A9482SATUNDMEDBUS = GXutil.trim( A9338SATUNDMEDID) + " " + GXutil.trim( A9339SATUNDMEDDSC) ;
         AV112satundmedbus = A9482SATUNDMEDBUS ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'METODO DE PAGO' Routine */
      AV215GXLvl434 = (byte)(0) ;
      /* Using cursor P02RR22 */
      pr_default.execute(20, new Object[] {AV9FACTCOMMET});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A9332SATMETPAGID = P02RR22_A9332SATMETPAGID[0] ;
         A9333SATMETPAGDSC = P02RR22_A9333SATMETPAGDSC[0] ;
         n9333SATMETPAGDSC = P02RR22_n9333SATMETPAGDSC[0] ;
         AV215GXLvl434 = (byte)(1) ;
         AV95METODOPAG = GXutil.trim( A9332SATMETPAGID) + "-" + GXutil.trim( A9333SATMETPAGDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
      if ( AV215GXLvl434 == 0 )
      {
         AV95METODOPAG = "" ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'DESCRIPCIONES' Routine */
      /* Using cursor P02RR23 */
      pr_default.execute(21, new Object[] {AV86FACTXMLUSOC});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A9321SATUSOCOMID = P02RR23_A9321SATUSOCOMID[0] ;
         A9322SATUSOCOMDSC = P02RR23_A9322SATUSOCOMDSC[0] ;
         n9322SATUSOCOMDSC = P02RR23_n9322SATUSOCOMDSC[0] ;
         AV114SATUSOCOMID = A9321SATUSOCOMID ;
         AV113SATUSOCOMDSC = A9322SATUSOCOMDSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(21);
      /* Using cursor P02RR24 */
      pr_default.execute(22, new Object[] {new Long(AV40FACTXMLBANCLIE)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A2577BANCOID = P02RR24_A2577BANCOID[0] ;
         A2578BANCODSC = P02RR24_A2578BANCODSC[0] ;
         n2578BANCODSC = P02RR24_n2578BANCODSC[0] ;
         AV11bancodsc = A2578BANCODSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
      /* Using cursor P02RR25 */
      pr_default.execute(23, new Object[] {AV110SATTIPCOMID});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A9319SATTIPCOMID = P02RR25_A9319SATTIPCOMID[0] ;
         A9320SATTIPCOMDSC = P02RR25_A9320SATTIPCOMDSC[0] ;
         n9320SATTIPCOMDSC = P02RR25_n9320SATTIPCOMDSC[0] ;
         AV109SATTIPCOMDSC = "(" + GXutil.trim( A9319SATTIPCOMID) + ") " + GXutil.trim( A9320SATTIPCOMDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
      /* Using cursor P02RR26 */
      pr_default.execute(24, new Object[] {AV67FACTXMLREGF});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A9317SATREGFISDSC = P02RR26_A9317SATREGFISDSC[0] ;
         n9317SATREGFISDSC = P02RR26_n9317SATREGFISDSC[0] ;
         A9316SATREGFISID = P02RR26_A9316SATREGFISID[0] ;
         A13938SATREGFISBUS = GXutil.trim( A9316SATREGFISID) + " " + GXutil.trim( A9317SATREGFISDSC) ;
         AV130SATREGFISBUS = A13938SATREGFISBUS ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(24);
      if ( GXutil.strcmp(AV132FACTXMLCODPR, "") == 0 )
      {
         /* Using cursor P02RR27 */
         pr_default.execute(25, new Object[] {new Long(AV43FACTXMLCLI)});
         while ( (pr_default.getStatus(25) != 101) )
         {
            A7034CNCTEID = P02RR27_A7034CNCTEID[0] ;
            A13937CNCTECODP = P02RR27_A13937CNCTECODP[0] ;
            n13937CNCTECODP = P02RR27_n13937CNCTECODP[0] ;
            A13936CNCTEREGF = P02RR27_A13936CNCTEREGF[0] ;
            n13936CNCTEREGF = P02RR27_n13936CNCTEREGF[0] ;
            AV132FACTXMLCODPR = A13937CNCTECODP ;
            AV134FACTXMLREGFR = A13936CNCTEREGF ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(25);
      }
      /* Using cursor P02RR28 */
      pr_default.execute(26, new Object[] {AV134FACTXMLREGFR});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A9317SATREGFISDSC = P02RR28_A9317SATREGFISDSC[0] ;
         n9317SATREGFISDSC = P02RR28_n9317SATREGFISDSC[0] ;
         A9316SATREGFISID = P02RR28_A9316SATREGFISID[0] ;
         A13938SATREGFISBUS = GXutil.trim( A9316SATREGFISID) + " " + GXutil.trim( A9317SATREGFISDSC) ;
         AV131SATREGFISBUS_R = A13938SATREGFISBUS ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
      /* Using cursor P02RR29 */
      pr_default.execute(27, new Object[] {AV104SATFORPAGID});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A9329SATFORPAGID = P02RR29_A9329SATFORPAGID[0] ;
         A9330SATFORPAGDSC = P02RR29_A9330SATFORPAGDSC[0] ;
         n9330SATFORPAGDSC = P02RR29_n9330SATFORPAGDSC[0] ;
         AV103SATFORPAGDSC = "(" + GXutil.trim( A9329SATFORPAGID) + ") " + GXutil.trim( A9330SATFORPAGDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(27);
      AV223GXLvl479 = (byte)(0) ;
      /* Using cursor P02RR30 */
      pr_default.execute(28, new Object[] {AV106SATMETPAGID});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A9332SATMETPAGID = P02RR30_A9332SATMETPAGID[0] ;
         A9333SATMETPAGDSC = P02RR30_A9333SATMETPAGDSC[0] ;
         n9333SATMETPAGDSC = P02RR30_n9333SATMETPAGDSC[0] ;
         AV223GXLvl479 = (byte)(1) ;
         AV105SATMETPAGDSC = GXutil.trim( A9332SATMETPAGID) + "-" + GXutil.trim( A9333SATMETPAGDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(28);
      if ( AV223GXLvl479 == 0 )
      {
         AV105SATMETPAGDSC = "" ;
      }
      if ( GXutil.strcmp(AV49FACTXMLDIRE, "") == 0 )
      {
         /* Using cursor P02RR31 */
         pr_default.execute(29, new Object[] {new Long(AV43FACTXMLCLI)});
         while ( (pr_default.getStatus(29) != 101) )
         {
            A7034CNCTEID = P02RR31_A7034CNCTEID[0] ;
            A7039CNCTEDIR = P02RR31_A7039CNCTEDIR[0] ;
            n7039CNCTEDIR = P02RR31_n7039CNCTEDIR[0] ;
            AV21CNCTEDIR = A7039CNCTEDIR ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(29);
      }
      else
      {
         AV21CNCTEDIR = AV49FACTXMLDIRE ;
      }
      /* Using cursor P02RR32 */
      pr_default.execute(30, new Object[] {AV82FACTXMLTIPREL});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A9531SATTIPRELID = P02RR32_A9531SATTIPRELID[0] ;
         A9532SATTIPRELDSC = P02RR32_A9532SATTIPRELDSC[0] ;
         n9532SATTIPRELDSC = P02RR32_n9532SATTIPRELDSC[0] ;
         AV111SATTIPRELDSC = "(" + GXutil.trim( A9531SATTIPRELID) + ") " + GXutil.trim( A9532SATTIPRELDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(30);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'REVISA COMENTARIOS' Routine */
      AV12BAND_COM = 0 ;
      AV187LIN1 = GXutil.gxmlines( GXutil.trim( AV128VAR_AUX), (short)(56)) ;
      AV186LIN2 = GXutil.gxmlines( AV179satproserbus2, (short)(23)) ;
      AV24CONT = 1 ;
      if ( AV187LIN1 > AV186LIN2 )
      {
         AV99nlin = AV187LIN1 ;
      }
      else
      {
         AV99nlin = AV186LIN2 ;
      }
      while ( AV24CONT <= AV99nlin )
      {
         AV23complemento = GXutil.gxgetmli( AV128VAR_AUX, (short)(AV24CONT), (short)(56)) ;
         AV180complemento2 = GXutil.gxgetmli( AV179satproserbus2, (short)(AV24CONT), (short)(23)) ;
         if ( AV12BAND_COM == 0 )
         {
            AV63FACTXMLPRDSC = AV23complemento ;
            AV181PRODUCTO = AV180complemento2 ;
            AV12BAND_COM = 1 ;
         }
         else
         {
         }
         AV24CONT = (long)(AV24CONT+1) ;
      }
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'REVISA CONCEPTO SAT' Routine */
      AV12BAND_COM = 0 ;
      AV128VAR_AUX = AV107satproserbus ;
      AV99nlin = GXutil.gxmlines( GXutil.trim( AV128VAR_AUX), (short)(70)) ;
      AV24CONT = 1 ;
      while ( AV24CONT <= AV99nlin )
      {
         AV23complemento = GXutil.gxgetmli( AV128VAR_AUX, (short)(AV24CONT), (short)(70)) ;
         if ( GXutil.strcmp(AV23complemento, "") == 0 )
         {
            if (true) break;
         }
         if ( AV12BAND_COM == 0 )
         {
            AV107satproserbus = AV23complemento ;
            AV12BAND_COM = 1 ;
         }
         else
         {
         }
         AV24CONT = (long)(AV24CONT+1) ;
      }
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'TIMBRE FISCAL' Routine */
      AV12BAND_COM = 0 ;
      AV99nlin = GXutil.gxmlines( GXutil.trim( AV119timbre), (short)(140)) ;
      AV24CONT = 1 ;
      while ( AV24CONT <= AV99nlin )
      {
         AV14cadena2 = GXutil.gxgetmli( GXutil.trim( AV119timbre), (short)(AV24CONT), (short)(140)) ;
         if ( GXutil.strcmp(AV14cadena2, "") == 0 )
         {
            if (true) break;
         }
         if ( AV12BAND_COM == 0 )
         {
            AV13cadena1 = AV14cadena2 ;
            AV12BAND_COM = 1 ;
         }
         else
         {
         }
         AV24CONT = (long)(AV24CONT+1) ;
      }
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'COMENTARIOS' Routine */
      AV12BAND_COM = 0 ;
      AV99nlin = GXutil.gxmlines( GXutil.trim( AV149FACTXMLCOM_G), (short)(140)) ;
      AV24CONT = 1 ;
      while ( AV24CONT <= AV99nlin )
      {
         AV148complementocom = GXutil.gxgetmli( GXutil.trim( AV149FACTXMLCOM_G), (short)(AV24CONT), (short)(140)) ;
         if ( GXutil.strcmp(AV148complementocom, "") == 0 )
         {
            if (true) break;
         }
         if ( AV12BAND_COM == 0 )
         {
            AV45factxmlcom = AV148complementocom ;
            AV12BAND_COM = 1 ;
         }
         else
         {
         }
         AV24CONT = (long)(AV24CONT+1) ;
      }
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'BUSCAFE' Routine */
      AV139NumCaracteres = GXutil.len( AV77factxmlsecfd) ;
      AV138pos = (long)(AV139NumCaracteres-7) ;
      AV140string = GXutil.substring( AV77factxmlsecfd, (int)(AV138pos), (int)(AV139NumCaracteres)) ;
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'DIRECCIONCLIENTE' Routine */
      /* Using cursor P02RR33 */
      pr_default.execute(31, new Object[] {new Long(AV168CNCTEID)});
      while ( (pr_default.getStatus(31) != 101) )
      {
         A7034CNCTEID = P02RR33_A7034CNCTEID[0] ;
         A13937CNCTECODP = P02RR33_A13937CNCTECODP[0] ;
         n13937CNCTECODP = P02RR33_n13937CNCTECODP[0] ;
         A17973CNCTEPAIS = P02RR33_A17973CNCTEPAIS[0] ;
         n17973CNCTEPAIS = P02RR33_n17973CNCTEPAIS[0] ;
         A17974CNCTEEDO = P02RR33_A17974CNCTEEDO[0] ;
         n17974CNCTEEDO = P02RR33_n17974CNCTEEDO[0] ;
         A17975CNCTEMUN = P02RR33_A17975CNCTEMUN[0] ;
         n17975CNCTEMUN = P02RR33_n17975CNCTEMUN[0] ;
         A17976CNCTELOCAL = P02RR33_A17976CNCTELOCAL[0] ;
         n17976CNCTELOCAL = P02RR33_n17976CNCTELOCAL[0] ;
         A17977CNCTECOL = P02RR33_A17977CNCTECOL[0] ;
         n17977CNCTECOL = P02RR33_n17977CNCTECOL[0] ;
         A17978CNCTECAL = P02RR33_A17978CNCTECAL[0] ;
         n17978CNCTECAL = P02RR33_n17978CNCTECAL[0] ;
         A17979CNCTENUME = P02RR33_A17979CNCTENUME[0] ;
         n17979CNCTENUME = P02RR33_n17979CNCTENUME[0] ;
         A17980CNCTENUMI = P02RR33_A17980CNCTENUMI[0] ;
         n17980CNCTENUMI = P02RR33_n17980CNCTENUMI[0] ;
         AV163CNCTECODP = A13937CNCTECODP ;
         AV155CNCTEPAIS = A17973CNCTEPAIS ;
         AV156CNCTEEDO = A17974CNCTEEDO ;
         AV157CNCTEMUN = A17975CNCTEMUN ;
         AV158CNCTELOCAL = A17976CNCTELOCAL ;
         AV159CNCTECOL = A17977CNCTECOL ;
         AV160CNCTECAL = A17978CNCTECAL ;
         AV161CNCTENUME = A17979CNCTENUME ;
         AV162CNCTENUMI = A17980CNCTENUMI ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(31);
      /* Using cursor P02RR34 */
      pr_default.execute(32, new Object[] {AV155CNCTEPAIS});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A10242SATPAISID = P02RR34_A10242SATPAISID[0] ;
         A10243SATPAISDSC = P02RR34_A10243SATPAISDSC[0] ;
         n10243SATPAISDSC = P02RR34_n10243SATPAISDSC[0] ;
         AV154SATPAISDSC = A10243SATPAISDSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(32);
      /* Using cursor P02RR35 */
      pr_default.execute(33, new Object[] {AV156CNCTEEDO, AV155CNCTEPAIS});
      while ( (pr_default.getStatus(33) != 101) )
      {
         A10245SATESTADOID = P02RR35_A10245SATESTADOID[0] ;
         A10247SATESTADOPAIS = P02RR35_A10247SATESTADOPAIS[0] ;
         n10247SATESTADOPAIS = P02RR35_n10247SATESTADOPAIS[0] ;
         A10246SATESTADODSC = P02RR35_A10246SATESTADODSC[0] ;
         n10246SATESTADODSC = P02RR35_n10246SATESTADODSC[0] ;
         AV164SATESTADODSC = A10246SATESTADODSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(33);
      /* Using cursor P02RR36 */
      pr_default.execute(34, new Object[] {AV157CNCTEMUN, AV156CNCTEEDO});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A10249SATMUNICIPIOID = P02RR36_A10249SATMUNICIPIOID[0] ;
         A10251SATMUNICIPIOEST = P02RR36_A10251SATMUNICIPIOEST[0] ;
         A10250SATMUNICIPIODSC = P02RR36_A10250SATMUNICIPIODSC[0] ;
         n10250SATMUNICIPIODSC = P02RR36_n10250SATMUNICIPIODSC[0] ;
         AV165SATMUNICIPIODSC = A10250SATMUNICIPIODSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(34);
      /* Using cursor P02RR37 */
      pr_default.execute(35, new Object[] {AV158CNCTELOCAL, AV156CNCTEEDO});
      while ( (pr_default.getStatus(35) != 101) )
      {
         A17814SATLOCALID = P02RR37_A17814SATLOCALID[0] ;
         A10245SATESTADOID = P02RR37_A10245SATESTADOID[0] ;
         A17815SATLOCALDSC = P02RR37_A17815SATLOCALDSC[0] ;
         n17815SATLOCALDSC = P02RR37_n17815SATLOCALDSC[0] ;
         AV166SATLOCALDSC = A17815SATLOCALDSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(35);
      /* Using cursor P02RR38 */
      pr_default.execute(36, new Object[] {AV159CNCTECOL, AV163CNCTECODP});
      while ( (pr_default.getStatus(36) != 101) )
      {
         A10221SATCOLONIAID = P02RR38_A10221SATCOLONIAID[0] ;
         A10222SATCOLONIACP = P02RR38_A10222SATCOLONIACP[0] ;
         A10223SATCOLONIADSC = P02RR38_A10223SATCOLONIADSC[0] ;
         n10223SATCOLONIADSC = P02RR38_n10223SATCOLONIADSC[0] ;
         AV167SATCOLONIADSC = A10223SATCOLONIADSC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(36);
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'PROYECTO' Routine */
      /* Using cursor P02RR39 */
      pr_default.execute(37, new Object[] {AV178FACTXMLPROY});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A171PMCTPRID = P02RR39_A171PMCTPRID[0] ;
         A18212PMCTPRCMPS = P02RR39_A18212PMCTPRCMPS[0] ;
         n18212PMCTPRCMPS = P02RR39_n18212PMCTPRCMPS[0] ;
         A18213PMCTPRNPER = P02RR39_A18213PMCTPRNPER[0] ;
         n18213PMCTPRNPER = P02RR39_n18213PMCTPRNPER[0] ;
         A18214PMCTPRDOM = P02RR39_A18214PMCTPRDOM[0] ;
         n18214PMCTPRDOM = P02RR39_n18214PMCTPRDOM[0] ;
         A18215PMCTPRCOL = P02RR39_A18215PMCTPRCOL[0] ;
         n18215PMCTPRCOL = P02RR39_n18215PMCTPRCOL[0] ;
         A18216PMCTPRREFE = P02RR39_A18216PMCTPRREFE[0] ;
         n18216PMCTPRREFE = P02RR39_n18216PMCTPRREFE[0] ;
         A18217PMCTPREDO = P02RR39_A18217PMCTPREDO[0] ;
         n18217PMCTPREDO = P02RR39_n18217PMCTPREDO[0] ;
         A18218PMCTPRLOC = P02RR39_A18218PMCTPRLOC[0] ;
         n18218PMCTPRLOC = P02RR39_n18218PMCTPRLOC[0] ;
         A18219PMCTPRMUN = P02RR39_A18219PMCTPRMUN[0] ;
         n18219PMCTPRMUN = P02RR39_n18219PMCTPRMUN[0] ;
         A18220PMCTPRCODP = P02RR39_A18220PMCTPRCODP[0] ;
         n18220PMCTPRCODP = P02RR39_n18220PMCTPRCODP[0] ;
         AV169PMCTPRCMPS = A18212PMCTPRCMPS ;
         AV170PMCTPRNPER = A18213PMCTPRNPER ;
         AV171PMCTPRDOM = A18214PMCTPRDOM ;
         AV172PMCTPRCOL = A18215PMCTPRCOL ;
         AV173PMCTPRREFE = A18216PMCTPRREFE ;
         AV174PMCTPREDO = A18217PMCTPREDO ;
         AV175PMCTPRLOC = A18218PMCTPRLOC ;
         AV176PMCTPRMUN = A18219PMCTPRMUN ;
         AV177PMCTPRCODP = A18220PMCTPRCODP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(37);
      if ( GXutil.strcmp(AV169PMCTPRCMPS, "S") == 0 )
      {
      }
   }

   public void S221( ) throws ProcessInterruptedException
   {
      /* 'TIPO DE RELACIÓN' Routine */
      /* Using cursor P02RR40 */
      pr_default.execute(38, new Object[] {AV182FACTAMOTREL});
      while ( (pr_default.getStatus(38) != 101) )
      {
         A9531SATTIPRELID = P02RR40_A9531SATTIPRELID[0] ;
         A9532SATTIPRELDSC = P02RR40_A9532SATTIPRELDSC[0] ;
         n9532SATTIPRELDSC = P02RR40_n9532SATTIPRELDSC[0] ;
         AV111SATTIPRELDSC = "(" + GXutil.trim( A9531SATTIPRELID) + ") " + GXutil.trim( A9532SATTIPRELDSC) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(38);
   }

   public void S231( ) throws ProcessInterruptedException
   {
      /* 'DATOSCLIENTE' Routine */
      AV73factxmlrfcbcli = "" ;
      AV40FACTXMLBANCLIE = 0 ;
      /* Using cursor P02RR41 */
      pr_default.execute(39, new Object[] {new Long(AV43FACTXMLCLI)});
      while ( (pr_default.getStatus(39) != 101) )
      {
         A7034CNCTEID = P02RR41_A7034CNCTEID[0] ;
         A7038CNCTERFC = P02RR41_A7038CNCTERFC[0] ;
         n7038CNCTERFC = P02RR41_n7038CNCTERFC[0] ;
         A12166CNCTECTAB = P02RR41_A12166CNCTECTAB[0] ;
         n12166CNCTECTAB = P02RR41_n12166CNCTECTAB[0] ;
         AV73factxmlrfcbcli = A7038CNCTERFC ;
         AV72FACTXMLRFCB = A7038CNCTERFC ;
         AV47factxmlctaclie = A12166CNCTECTAB ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(39);
   }

   public void h2RR0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial Black", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
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

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdfsatv3");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "apdfsatv3");
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV78FACTXMLSER = "" ;
      AV151mostrarqr = "" ;
      AV152urlqr = "" ;
      AV153CPO = "" ;
      scmdbuf = "" ;
      P02RR2_A5939CNCIASID = new long[1] ;
      P02RR2_A9CNCIASDSC = new String[] {""} ;
      P02RR2_n9CNCIASDSC = new boolean[] {false} ;
      P02RR2_A5147CNCIASIMGFILE = new String[] {""} ;
      P02RR2_n5147CNCIASIMGFILE = new boolean[] {false} ;
      P02RR2_A13CNCIASCP = new String[] {""} ;
      P02RR2_n13CNCIASCP = new boolean[] {false} ;
      P02RR2_A10CNCIASCOL = new String[] {""} ;
      P02RR2_n10CNCIASCOL = new boolean[] {false} ;
      P02RR2_A11CNCIASCAL = new String[] {""} ;
      P02RR2_n11CNCIASCAL = new boolean[] {false} ;
      P02RR2_A3018CNCIASFAX = new String[] {""} ;
      P02RR2_n3018CNCIASFAX = new boolean[] {false} ;
      P02RR2_A2417CNCIASTE1 = new String[] {""} ;
      P02RR2_n2417CNCIASTE1 = new boolean[] {false} ;
      P02RR2_A2418CNCIASTE2 = new String[] {""} ;
      P02RR2_n2418CNCIASTE2 = new boolean[] {false} ;
      P02RR2_A2419CNCIASTE3 = new String[] {""} ;
      P02RR2_n2419CNCIASTE3 = new boolean[] {false} ;
      A9CNCIASDSC = "" ;
      A5147CNCIASIMGFILE = "" ;
      A13CNCIASCP = "" ;
      A10CNCIASCOL = "" ;
      A11CNCIASCAL = "" ;
      A3018CNCIASFAX = "" ;
      A2417CNCIASTE1 = "" ;
      A2418CNCIASTE2 = "" ;
      A2419CNCIASTE3 = "" ;
      AV17CNCIASDSC = "" ;
      AV91image = "" ;
      AV195Image_GXI = "" ;
      AV26DIRECCION = "" ;
      AV18CNCIASFAX = "" ;
      AV20CNCIASTE1 = "" ;
      P02RR3_A9454FACTXMLIDATR = new String[] {""} ;
      P02RR3_A9453FACTXMLNODO = new String[] {""} ;
      P02RR3_A9385FACTXMLFOL = new long[1] ;
      P02RR3_A9384FACTXMLSER = new String[] {""} ;
      P02RR3_A9383FACTXMLCIA = new long[1] ;
      P02RR3_A9455FACTXMLVALATR = new String[] {""} ;
      P02RR3_n9455FACTXMLVALATR = new boolean[] {false} ;
      A9454FACTXMLIDATR = "" ;
      A9453FACTXMLNODO = "" ;
      A9384FACTXMLSER = "" ;
      A9455FACTXMLVALATR = "" ;
      AV129VERSION = "" ;
      P02RR4_A9385FACTXMLFOL = new long[1] ;
      P02RR4_A9384FACTXMLSER = new String[] {""} ;
      P02RR4_A9383FACTXMLCIA = new long[1] ;
      P02RR4_A9406FACTXMLUUID = new String[] {""} ;
      P02RR4_n9406FACTXMLUUID = new boolean[] {false} ;
      P02RR4_A9446FACTXMLNCER = new String[] {""} ;
      P02RR4_n9446FACTXMLNCER = new boolean[] {false} ;
      P02RR4_A9451FACTXMLNCERS = new String[] {""} ;
      P02RR4_n9451FACTXMLNCERS = new boolean[] {false} ;
      P02RR4_A9386FACTXMLFEC = new String[] {""} ;
      P02RR4_n9386FACTXMLFEC = new boolean[] {false} ;
      P02RR4_A9448FACTXMLFTIM = new String[] {""} ;
      P02RR4_n9448FACTXMLFTIM = new boolean[] {false} ;
      P02RR4_A9389FACTXMLRFCE = new String[] {""} ;
      P02RR4_n9389FACTXMLRFCE = new boolean[] {false} ;
      P02RR4_A9390FACTXMLREGF = new String[] {""} ;
      P02RR4_n9390FACTXMLREGF = new boolean[] {false} ;
      P02RR4_A13933FACTXMLREGFR = new String[] {""} ;
      P02RR4_n13933FACTXMLREGFR = new boolean[] {false} ;
      P02RR4_A9395FACTXMLUSOC = new String[] {""} ;
      P02RR4_n9395FACTXMLUSOC = new boolean[] {false} ;
      P02RR4_A9391FACTXMLCODP = new String[] {""} ;
      P02RR4_n9391FACTXMLCODP = new boolean[] {false} ;
      P02RR4_A9392FACTXMLRFCR = new String[] {""} ;
      P02RR4_n9392FACTXMLRFCR = new boolean[] {false} ;
      P02RR4_A15512FACTXMLGEN = new short[1] ;
      P02RR4_n15512FACTXMLGEN = new boolean[] {false} ;
      P02RR4_A9848FACTXMLPROY = new String[] {""} ;
      P02RR4_n9848FACTXMLPROY = new boolean[] {false} ;
      P02RR4_A9394FACTXMLNREC = new String[] {""} ;
      P02RR4_n9394FACTXMLNREC = new boolean[] {false} ;
      P02RR4_A9469FACTXMLCOM = new String[] {""} ;
      P02RR4_n9469FACTXMLCOM = new boolean[] {false} ;
      P02RR4_A9449FACTXMLRFCPR = new String[] {""} ;
      P02RR4_n9449FACTXMLRFCPR = new boolean[] {false} ;
      P02RR4_A10341FACTXMLCODPR = new String[] {""} ;
      P02RR4_n10341FACTXMLCODPR = new boolean[] {false} ;
      P02RR4_A9396FACTXMLMON = new String[] {""} ;
      P02RR4_n9396FACTXMLMON = new boolean[] {false} ;
      P02RR4_A9397FACTXMLFPAG = new String[] {""} ;
      P02RR4_n9397FACTXMLFPAG = new boolean[] {false} ;
      P02RR4_A9398FACTXMLMPAG = new String[] {""} ;
      P02RR4_n9398FACTXMLMPAG = new boolean[] {false} ;
      P02RR4_A9388FACTXMLTIPC = new String[] {""} ;
      P02RR4_n9388FACTXMLTIPC = new boolean[] {false} ;
      P02RR4_A9400FACTXMLSUB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9400FACTXMLSUB = new boolean[] {false} ;
      P02RR4_A12161FACTXMLTOTAM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n12161FACTXMLTOTAM = new boolean[] {false} ;
      P02RR4_A9401FACTXMLDESC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9401FACTXMLDESC = new boolean[] {false} ;
      P02RR4_A9402FACTXMLIVA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9402FACTXMLIVA = new boolean[] {false} ;
      P02RR4_A9403FACTXMLRET = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9403FACTXMLRET = new boolean[] {false} ;
      P02RR4_A10131FACTXMLCTAC = new String[] {""} ;
      P02RR4_n10131FACTXMLCTAC = new boolean[] {false} ;
      P02RR4_A10129FACTXMLRFCB = new String[] {""} ;
      P02RR4_n10129FACTXMLRFCB = new boolean[] {false} ;
      P02RR4_A9404FACTXMLTOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9404FACTXMLTOT = new boolean[] {false} ;
      P02RR4_A9393FACTXMLCLI = new long[1] ;
      P02RR4_n9393FACTXMLCLI = new boolean[] {false} ;
      P02RR4_A9450FACTXMLSECFD = new String[] {""} ;
      P02RR4_n9450FACTXMLSECFD = new boolean[] {false} ;
      P02RR4_A9452FACTXMLSESAT = new String[] {""} ;
      P02RR4_n9452FACTXMLSESAT = new boolean[] {false} ;
      P02RR4_A9537FACTXMLUUIDR = new String[] {""} ;
      P02RR4_n9537FACTXMLUUIDR = new boolean[] {false} ;
      P02RR4_A9536FACTXMLTIPREL = new String[] {""} ;
      P02RR4_n9536FACTXMLTIPREL = new boolean[] {false} ;
      P02RR4_A10856FACTXMLDIRE = new String[] {""} ;
      P02RR4_n10856FACTXMLDIRE = new boolean[] {false} ;
      P02RR4_A9634FACTXMLPREFAC = new String[] {""} ;
      P02RR4_n9634FACTXMLPREFAC = new boolean[] {false} ;
      P02RR4_A9399FACTXMLTCAM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR4_n9399FACTXMLTCAM = new boolean[] {false} ;
      P02RR4_A10184FACTXMLFECP = new java.util.Date[] {GXutil.nullDate()} ;
      P02RR4_n10184FACTXMLFECP = new boolean[] {false} ;
      A9406FACTXMLUUID = "" ;
      A9446FACTXMLNCER = "" ;
      A9451FACTXMLNCERS = "" ;
      A9386FACTXMLFEC = "" ;
      A9448FACTXMLFTIM = "" ;
      A9389FACTXMLRFCE = "" ;
      A9390FACTXMLREGF = "" ;
      A13933FACTXMLREGFR = "" ;
      A9395FACTXMLUSOC = "" ;
      A9391FACTXMLCODP = "" ;
      A9392FACTXMLRFCR = "" ;
      A9848FACTXMLPROY = "" ;
      A9394FACTXMLNREC = "" ;
      A9469FACTXMLCOM = "" ;
      A9449FACTXMLRFCPR = "" ;
      A10341FACTXMLCODPR = "" ;
      A9396FACTXMLMON = "" ;
      A9397FACTXMLFPAG = "" ;
      A9398FACTXMLMPAG = "" ;
      A9388FACTXMLTIPC = "" ;
      A9400FACTXMLSUB = DecimalUtil.ZERO ;
      A12161FACTXMLTOTAM = DecimalUtil.ZERO ;
      A9401FACTXMLDESC = DecimalUtil.ZERO ;
      A9402FACTXMLIVA = DecimalUtil.ZERO ;
      A9403FACTXMLRET = DecimalUtil.ZERO ;
      A10131FACTXMLCTAC = "" ;
      A10129FACTXMLRFCB = "" ;
      A9404FACTXMLTOT = DecimalUtil.ZERO ;
      A9450FACTXMLSECFD = "" ;
      A9452FACTXMLSESAT = "" ;
      A9537FACTXMLUUIDR = "" ;
      A9536FACTXMLTIPREL = "" ;
      A10856FACTXMLDIRE = "" ;
      A9634FACTXMLPREFAC = "" ;
      A9399FACTXMLTCAM = DecimalUtil.ZERO ;
      A10184FACTXMLFECP = GXutil.resetTime( GXutil.nullDate() );
      AV87FACTXMLUUID = "" ;
      AV59FACTXMLNCER = "" ;
      AV60FACTXMLNCERS = "" ;
      AV50FACTXMLFEC = "" ;
      AV54FACTXMLFTIM = "" ;
      AV74FACTXMLRFCE = "" ;
      AV67FACTXMLREGF = "" ;
      AV134FACTXMLREGFR = "" ;
      AV86FACTXMLUSOC = "" ;
      AV44FACTXMLCODP = "" ;
      AV76FACTXMLRFCR = "" ;
      AV178FACTXMLPROY = "" ;
      AV61FACTXMLNREC = "" ;
      AV144nombre = "" ;
      AV149FACTXMLCOM_G = "" ;
      AV75FACTXMLRFCPR = "" ;
      AV132FACTXMLCODPR = "" ;
      AV58FACTXMLMON = "" ;
      AV104SATFORPAGID = "" ;
      AV106SATMETPAGID = "" ;
      AV110SATTIPCOMID = "" ;
      AV80factxmlsub = DecimalUtil.ZERO ;
      AV48FACTXMLDESC = DecimalUtil.ZERO ;
      AV57FACTXMLIVA = DecimalUtil.ZERO ;
      AV68FACTXMLRET = DecimalUtil.ZERO ;
      AV46FACTXMLCTAC = "" ;
      AV72FACTXMLRFCB = "" ;
      AV83FACTXMLTOT = DecimalUtil.ZERO ;
      AV126totalpag = DecimalUtil.ZERO ;
      AV77factxmlsecfd = "" ;
      AV79factxmlsesat = "" ;
      AV125total = DecimalUtil.ZERO ;
      AV88FACTXMLUUIDR = "" ;
      AV82FACTXMLTIPREL = "" ;
      AV49FACTXMLDIRE = "" ;
      AV185FACTXMLPREFAC = "" ;
      AV120tipocambio = DecimalUtil.ZERO ;
      AV143tipocam = "" ;
      AV142titulotpc = "" ;
      AV105SATMETPAGDSC = "" ;
      AV89fecpag = "" ;
      AV90formapago = "" ;
      AV103SATFORPAGDSC = "" ;
      AV97monpag = "" ;
      AV121Tipocampag = "" ;
      AV119timbre = "" ;
      AV189cadenaOriginal = "" ;
      AV136Fe = "" ;
      AV140string = "" ;
      AV102qr = "" ;
      AV141cadena = "" ;
      AV127url = "" ;
      AV137qr2 = "" ;
      AV198Qr2_GXI = "" ;
      P02RR5_A9385FACTXMLFOL = new long[1] ;
      P02RR5_A9384FACTXMLSER = new String[] {""} ;
      P02RR5_A9383FACTXMLCIA = new long[1] ;
      P02RR5_A15047FACTXMLQR = new String[] {""} ;
      P02RR5_n15047FACTXMLQR = new boolean[] {false} ;
      A15047FACTXMLQR = "" ;
      P02RR8_A9385FACTXMLFOL = new long[1] ;
      P02RR8_A9384FACTXMLSER = new String[] {""} ;
      P02RR8_A9383FACTXMLCIA = new long[1] ;
      P02RR8_A15047FACTXMLQR = new String[] {""} ;
      P02RR8_n15047FACTXMLQR = new boolean[] {false} ;
      AV22codigo = "" ;
      AV201Codigo_GXI = "" ;
      AV91image = "" ;
      sImgUrl = "" ;
      AV130SATREGFISBUS = "" ;
      AV183hayrel = "" ;
      P02RR9_A11966FACTRELCIA = new long[1] ;
      P02RR9_A11968FACTRELFOL = new long[1] ;
      P02RR9_A11967FACTRELSER = new String[] {""} ;
      P02RR9_A11841FACTAMOUUID = new String[] {""} ;
      P02RR9_A11960FACTAMOCLI = new long[1] ;
      A11967FACTRELSER = "" ;
      A11841FACTAMOUUID = "" ;
      P02RR10_A11869TEMRELCIA = new long[1] ;
      P02RR10_A11982TEMRELFOLA = new long[1] ;
      P02RR10_n11982TEMRELFOLA = new boolean[] {false} ;
      P02RR10_A11983TEMRELSERA = new String[] {""} ;
      P02RR10_n11983TEMRELSERA = new boolean[] {false} ;
      P02RR10_A11870TEMRELCLI = new long[1] ;
      P02RR10_A11871TEMRELUUID = new String[] {""} ;
      P02RR10_A11872TEMPRELTIPC = new String[] {""} ;
      A11983TEMRELSERA = "" ;
      A11871TEMRELUUID = "" ;
      A11872TEMPRELTIPC = "" ;
      P02RR11_A11967FACTRELSER = new String[] {""} ;
      P02RR11_A11968FACTRELFOL = new long[1] ;
      P02RR11_A11966FACTRELCIA = new long[1] ;
      P02RR11_A11841FACTAMOUUID = new String[] {""} ;
      P02RR11_A18103FACTAMOTREL = new String[] {""} ;
      P02RR11_n18103FACTAMOTREL = new boolean[] {false} ;
      P02RR11_A11960FACTAMOCLI = new long[1] ;
      A18103FACTAMOTREL = "" ;
      AV182FACTAMOTREL = "" ;
      P02RR12_A11983TEMRELSERA = new String[] {""} ;
      P02RR12_n11983TEMRELSERA = new boolean[] {false} ;
      P02RR12_A11982TEMRELFOLA = new long[1] ;
      P02RR12_n11982TEMRELFOLA = new boolean[] {false} ;
      P02RR12_A11869TEMRELCIA = new long[1] ;
      P02RR12_A11871TEMRELUUID = new String[] {""} ;
      P02RR12_A18102TEMRELTREL = new String[] {""} ;
      P02RR12_n18102TEMRELTREL = new boolean[] {false} ;
      P02RR12_A11870TEMRELCLI = new long[1] ;
      P02RR12_A11872TEMPRELTIPC = new String[] {""} ;
      A18102TEMRELTREL = "" ;
      AV124titulocol = "" ;
      P02RR13_A9383FACTXMLCIA = new long[1] ;
      P02RR13_A9384FACTXMLSER = new String[] {""} ;
      P02RR13_A9385FACTXMLFOL = new long[1] ;
      P02RR13_A9410FACTXMLCLAVE = new String[] {""} ;
      P02RR13_n9410FACTXMLCLAVE = new boolean[] {false} ;
      P02RR13_A9412FACTXMLQTY = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9412FACTXMLQTY = new boolean[] {false} ;
      P02RR13_A9413FACTXMLUND = new String[] {""} ;
      P02RR13_n9413FACTXMLUND = new boolean[] {false} ;
      P02RR13_A9414FACTXMLUNDS = new String[] {""} ;
      P02RR13_n9414FACTXMLUNDS = new boolean[] {false} ;
      P02RR13_A9421FACTXMLIMPT = new String[] {""} ;
      P02RR13_n9421FACTXMLIMPT = new boolean[] {false} ;
      P02RR13_A9415FACTXMLPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9415FACTXMLPRE = new boolean[] {false} ;
      P02RR13_A12162FACTXMLBAMOR = new byte[1] ;
      P02RR13_n12162FACTXMLBAMOR = new boolean[] {false} ;
      P02RR13_A11828FACTXMLAMORT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n11828FACTXMLAMORT = new boolean[] {false} ;
      P02RR13_A9416FACTXML1DESC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9416FACTXML1DESC = new boolean[] {false} ;
      P02RR13_A9422FACTXMLIMPV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9422FACTXMLIMPV = new boolean[] {false} ;
      P02RR13_A9418FACTXML1IVA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9418FACTXML1IVA = new boolean[] {false} ;
      P02RR13_A9417FACTXML1SUB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR13_n9417FACTXML1SUB = new boolean[] {false} ;
      P02RR13_A9411FACTXMLPRI2 = new String[] {""} ;
      P02RR13_n9411FACTXMLPRI2 = new boolean[] {false} ;
      P02RR13_A9551FACTXMLOBS = new String[] {""} ;
      P02RR13_n9551FACTXMLOBS = new boolean[] {false} ;
      P02RR13_A10962FACTXMLCONS = new long[1] ;
      P02RR13_A9408FACTXMLPRID = new long[1] ;
      A9410FACTXMLCLAVE = "" ;
      A9412FACTXMLQTY = DecimalUtil.ZERO ;
      A9413FACTXMLUND = "" ;
      A9414FACTXMLUNDS = "" ;
      A9421FACTXMLIMPT = "" ;
      A9415FACTXMLPRE = DecimalUtil.ZERO ;
      A11828FACTXMLAMORT = DecimalUtil.ZERO ;
      A9416FACTXML1DESC = DecimalUtil.ZERO ;
      A9422FACTXMLIMPV = DecimalUtil.ZERO ;
      A9418FACTXML1IVA = DecimalUtil.ZERO ;
      A9417FACTXML1SUB = DecimalUtil.ZERO ;
      A9411FACTXMLPRI2 = "" ;
      A9551FACTXMLOBS = "" ;
      AV42FACTXMLCLAVE = "" ;
      AV66FACTXMLQTY = DecimalUtil.ZERO ;
      AV84FACTXMLUND = "" ;
      AV85FACTXMLUNDS = "" ;
      AV55FACTXMLIMPT = "" ;
      AV146satobjimpid = "" ;
      AV101precio = DecimalUtil.ZERO ;
      AV36FACTXML1DESC = DecimalUtil.ZERO ;
      AV56FACTXMLimpv = DecimalUtil.ZERO ;
      AV37FACTXML1iva = DecimalUtil.ZERO ;
      AV38FACTXML1SUB = DecimalUtil.ZERO ;
      AV116subtotal = DecimalUtil.ZERO ;
      AV65FACTXMLPRI2 = "" ;
      AV128VAR_AUX = "" ;
      AV73factxmlrfcbcli = "" ;
      AV47factxmlctaclie = "" ;
      AV11bancodsc = "" ;
      P02RR14_A9385FACTXMLFOL = new long[1] ;
      P02RR14_A9384FACTXMLSER = new String[] {""} ;
      P02RR14_A9383FACTXMLCIA = new long[1] ;
      P02RR14_A10079FACTCOMNPA = new long[1] ;
      P02RR14_A10080FACTCOMIDR = new String[] {""} ;
      P02RR14_A10081FACTCOMMON = new String[] {""} ;
      P02RR14_n10081FACTCOMMON = new boolean[] {false} ;
      P02RR14_A10082FACTCOMSER = new String[] {""} ;
      P02RR14_n10082FACTCOMSER = new boolean[] {false} ;
      P02RR14_A10083FACTCOMFOL = new long[1] ;
      P02RR14_n10083FACTCOMFOL = new boolean[] {false} ;
      P02RR14_A10084FACTCOMMET = new String[] {""} ;
      P02RR14_n10084FACTCOMMET = new boolean[] {false} ;
      P02RR14_A10085FACTCOMSAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR14_n10085FACTCOMSAN = new boolean[] {false} ;
      P02RR14_A10086FACTCOMIMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR14_n10086FACTCOMIMP = new boolean[] {false} ;
      P02RR14_A10087FACTCOMSIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR14_n10087FACTCOMSIN = new boolean[] {false} ;
      P02RR14_A10115FACTCOMTCAM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR14_n10115FACTCOMTCAM = new boolean[] {false} ;
      A10080FACTCOMIDR = "" ;
      A10081FACTCOMMON = "" ;
      A10082FACTCOMSER = "" ;
      A10084FACTCOMMET = "" ;
      A10085FACTCOMSAN = DecimalUtil.ZERO ;
      A10086FACTCOMIMP = DecimalUtil.ZERO ;
      A10087FACTCOMSIN = DecimalUtil.ZERO ;
      A10115FACTCOMTCAM = DecimalUtil.ZERO ;
      AV28FACTCOMIDR = "" ;
      AV30FACTCOMMON = "" ;
      AV33FACTCOMSER = "" ;
      AV9FACTCOMMET = "" ;
      AV32FACTCOMSAN = DecimalUtil.ZERO ;
      AV29FACTCOMIMP = DecimalUtil.ZERO ;
      AV34FACTCOMSIN = DecimalUtil.ZERO ;
      AV35FACTCOMTCAM = DecimalUtil.ZERO ;
      AV122tipocampag2 = "" ;
      AV8CNCMNMID = "" ;
      GXt_char4 = "" ;
      GXv_decimal1 = new java.math.BigDecimal [1] ;
      AV93Letra = "" ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      AV123titulo = "" ;
      AV98monto = DecimalUtil.ZERO ;
      P02RR15_A12089FACTXMLRETBAS = new String[] {""} ;
      P02RR15_n12089FACTXMLRETBAS = new boolean[] {false} ;
      P02RR15_A9385FACTXMLFOL = new long[1] ;
      P02RR15_A9384FACTXMLSER = new String[] {""} ;
      P02RR15_A9383FACTXMLCIA = new long[1] ;
      P02RR15_A9424FACTXMLRETID = new String[] {""} ;
      A12089FACTXMLRETBAS = "" ;
      A9424FACTXMLRETID = "" ;
      AV69FACTXMLRETID = "" ;
      P02RR16_A12089FACTXMLRETBAS = new String[] {""} ;
      P02RR16_n12089FACTXMLRETBAS = new boolean[] {false} ;
      P02RR16_A9385FACTXMLFOL = new long[1] ;
      P02RR16_A9384FACTXMLSER = new String[] {""} ;
      P02RR16_A9383FACTXMLCIA = new long[1] ;
      P02RR16_A9424FACTXMLRETID = new String[] {""} ;
      AV22codigo = "" ;
      AV95METODOPAG = "" ;
      AV70FACTXMLRETMNT = DecimalUtil.ZERO ;
      P02RR17_A9424FACTXMLRETID = new String[] {""} ;
      P02RR17_A9385FACTXMLFOL = new long[1] ;
      P02RR17_A9384FACTXMLSER = new String[] {""} ;
      P02RR17_A9383FACTXMLCIA = new long[1] ;
      P02RR17_A9428FACTXMLRETMNT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RR17_n9428FACTXMLRETMNT = new boolean[] {false} ;
      P02RR17_A12091FACTXMLRETNOM = new String[] {""} ;
      P02RR17_n12091FACTXMLRETNOM = new boolean[] {false} ;
      P02RR17_A9408FACTXMLPRID = new long[1] ;
      P02RR17_A10962FACTXMLCONS = new long[1] ;
      A9428FACTXMLRETMNT = DecimalUtil.ZERO ;
      A12091FACTXMLRETNOM = "" ;
      AV71FACTXMLRETNOM = "" ;
      P02RR18_A9336SATPROSERDSC = new String[] {""} ;
      P02RR18_n9336SATPROSERDSC = new boolean[] {false} ;
      P02RR18_A9335SATPROSERID = new String[] {""} ;
      A9336SATPROSERDSC = "" ;
      A9335SATPROSERID = "" ;
      A9481SATPROSERBUS = "" ;
      AV107satproserbus = "" ;
      AV179satproserbus2 = "" ;
      AV147satobjimpdsc = "" ;
      P02RR19_A13930SATOBJIMPID = new String[] {""} ;
      P02RR19_A13931SATOBJIMPDSC = new String[] {""} ;
      P02RR19_n13931SATOBJIMPDSC = new boolean[] {false} ;
      A13930SATOBJIMPID = "" ;
      A13931SATOBJIMPDSC = "" ;
      P02RR20_A9343SATIMPTIPID = new String[] {""} ;
      P02RR20_A9344SATIMPTIPDSC = new String[] {""} ;
      P02RR20_n9344SATIMPTIPDSC = new boolean[] {false} ;
      A9343SATIMPTIPID = "" ;
      A9344SATIMPTIPDSC = "" ;
      AV92impuesto = "" ;
      P02RR21_A9339SATUNDMEDDSC = new String[] {""} ;
      P02RR21_n9339SATUNDMEDDSC = new boolean[] {false} ;
      P02RR21_A9338SATUNDMEDID = new String[] {""} ;
      A9339SATUNDMEDDSC = "" ;
      A9338SATUNDMEDID = "" ;
      A9482SATUNDMEDBUS = "" ;
      AV112satundmedbus = "" ;
      A9332SATMETPAGID = "" ;
      A9333SATMETPAGDSC = "" ;
      P02RR22_A9332SATMETPAGID = new String[] {""} ;
      P02RR22_A9333SATMETPAGDSC = new String[] {""} ;
      P02RR22_n9333SATMETPAGDSC = new boolean[] {false} ;
      A7039CNCTEDIR = "" ;
      A9531SATTIPRELID = "" ;
      A9532SATTIPRELDSC = "" ;
      P02RR23_A9321SATUSOCOMID = new String[] {""} ;
      P02RR23_A9322SATUSOCOMDSC = new String[] {""} ;
      P02RR23_n9322SATUSOCOMDSC = new boolean[] {false} ;
      A9321SATUSOCOMID = "" ;
      A9322SATUSOCOMDSC = "" ;
      AV114SATUSOCOMID = "" ;
      AV113SATUSOCOMDSC = "" ;
      P02RR24_A2577BANCOID = new long[1] ;
      P02RR24_A2578BANCODSC = new String[] {""} ;
      P02RR24_n2578BANCODSC = new boolean[] {false} ;
      A2578BANCODSC = "" ;
      P02RR25_A9319SATTIPCOMID = new String[] {""} ;
      P02RR25_A9320SATTIPCOMDSC = new String[] {""} ;
      P02RR25_n9320SATTIPCOMDSC = new boolean[] {false} ;
      A9319SATTIPCOMID = "" ;
      A9320SATTIPCOMDSC = "" ;
      AV109SATTIPCOMDSC = "" ;
      P02RR26_A9317SATREGFISDSC = new String[] {""} ;
      P02RR26_n9317SATREGFISDSC = new boolean[] {false} ;
      P02RR26_A9316SATREGFISID = new String[] {""} ;
      A9317SATREGFISDSC = "" ;
      A9316SATREGFISID = "" ;
      A13938SATREGFISBUS = "" ;
      P02RR27_A7034CNCTEID = new long[1] ;
      P02RR27_A13937CNCTECODP = new String[] {""} ;
      P02RR27_n13937CNCTECODP = new boolean[] {false} ;
      P02RR27_A13936CNCTEREGF = new String[] {""} ;
      P02RR27_n13936CNCTEREGF = new boolean[] {false} ;
      A13937CNCTECODP = "" ;
      A13936CNCTEREGF = "" ;
      P02RR28_A9317SATREGFISDSC = new String[] {""} ;
      P02RR28_n9317SATREGFISDSC = new boolean[] {false} ;
      P02RR28_A9316SATREGFISID = new String[] {""} ;
      AV131SATREGFISBUS_R = "" ;
      P02RR29_A9329SATFORPAGID = new String[] {""} ;
      P02RR29_A9330SATFORPAGDSC = new String[] {""} ;
      P02RR29_n9330SATFORPAGDSC = new boolean[] {false} ;
      A9329SATFORPAGID = "" ;
      A9330SATFORPAGDSC = "" ;
      P02RR30_A9332SATMETPAGID = new String[] {""} ;
      P02RR30_A9333SATMETPAGDSC = new String[] {""} ;
      P02RR30_n9333SATMETPAGDSC = new boolean[] {false} ;
      P02RR31_A7034CNCTEID = new long[1] ;
      P02RR31_A7039CNCTEDIR = new String[] {""} ;
      P02RR31_n7039CNCTEDIR = new boolean[] {false} ;
      AV21CNCTEDIR = "" ;
      P02RR32_A9531SATTIPRELID = new String[] {""} ;
      P02RR32_A9532SATTIPRELDSC = new String[] {""} ;
      P02RR32_n9532SATTIPRELDSC = new boolean[] {false} ;
      AV111SATTIPRELDSC = "" ;
      AV23complemento = "" ;
      AV180complemento2 = "" ;
      AV63FACTXMLPRDSC = "" ;
      AV181PRODUCTO = "" ;
      AV14cadena2 = "" ;
      AV13cadena1 = "" ;
      AV148complementocom = "" ;
      AV45factxmlcom = "" ;
      P02RR33_A7034CNCTEID = new long[1] ;
      P02RR33_A13937CNCTECODP = new String[] {""} ;
      P02RR33_n13937CNCTECODP = new boolean[] {false} ;
      P02RR33_A17973CNCTEPAIS = new String[] {""} ;
      P02RR33_n17973CNCTEPAIS = new boolean[] {false} ;
      P02RR33_A17974CNCTEEDO = new String[] {""} ;
      P02RR33_n17974CNCTEEDO = new boolean[] {false} ;
      P02RR33_A17975CNCTEMUN = new String[] {""} ;
      P02RR33_n17975CNCTEMUN = new boolean[] {false} ;
      P02RR33_A17976CNCTELOCAL = new String[] {""} ;
      P02RR33_n17976CNCTELOCAL = new boolean[] {false} ;
      P02RR33_A17977CNCTECOL = new String[] {""} ;
      P02RR33_n17977CNCTECOL = new boolean[] {false} ;
      P02RR33_A17978CNCTECAL = new String[] {""} ;
      P02RR33_n17978CNCTECAL = new boolean[] {false} ;
      P02RR33_A17979CNCTENUME = new String[] {""} ;
      P02RR33_n17979CNCTENUME = new boolean[] {false} ;
      P02RR33_A17980CNCTENUMI = new String[] {""} ;
      P02RR33_n17980CNCTENUMI = new boolean[] {false} ;
      A17973CNCTEPAIS = "" ;
      A17974CNCTEEDO = "" ;
      A17975CNCTEMUN = "" ;
      A17976CNCTELOCAL = "" ;
      A17977CNCTECOL = "" ;
      A17978CNCTECAL = "" ;
      A17979CNCTENUME = "" ;
      A17980CNCTENUMI = "" ;
      AV163CNCTECODP = "" ;
      AV155CNCTEPAIS = "" ;
      AV156CNCTEEDO = "" ;
      AV157CNCTEMUN = "" ;
      AV158CNCTELOCAL = "" ;
      AV159CNCTECOL = "" ;
      AV160CNCTECAL = "" ;
      AV161CNCTENUME = "" ;
      AV162CNCTENUMI = "" ;
      P02RR34_A10242SATPAISID = new String[] {""} ;
      P02RR34_A10243SATPAISDSC = new String[] {""} ;
      P02RR34_n10243SATPAISDSC = new boolean[] {false} ;
      A10242SATPAISID = "" ;
      A10243SATPAISDSC = "" ;
      AV154SATPAISDSC = "" ;
      P02RR35_A10245SATESTADOID = new String[] {""} ;
      P02RR35_A10247SATESTADOPAIS = new String[] {""} ;
      P02RR35_n10247SATESTADOPAIS = new boolean[] {false} ;
      P02RR35_A10246SATESTADODSC = new String[] {""} ;
      P02RR35_n10246SATESTADODSC = new boolean[] {false} ;
      A10245SATESTADOID = "" ;
      A10247SATESTADOPAIS = "" ;
      A10246SATESTADODSC = "" ;
      AV164SATESTADODSC = "" ;
      P02RR36_A10249SATMUNICIPIOID = new String[] {""} ;
      P02RR36_A10251SATMUNICIPIOEST = new String[] {""} ;
      P02RR36_A10250SATMUNICIPIODSC = new String[] {""} ;
      P02RR36_n10250SATMUNICIPIODSC = new boolean[] {false} ;
      A10249SATMUNICIPIOID = "" ;
      A10251SATMUNICIPIOEST = "" ;
      A10250SATMUNICIPIODSC = "" ;
      AV165SATMUNICIPIODSC = "" ;
      P02RR37_A17814SATLOCALID = new String[] {""} ;
      P02RR37_A10245SATESTADOID = new String[] {""} ;
      P02RR37_A17815SATLOCALDSC = new String[] {""} ;
      P02RR37_n17815SATLOCALDSC = new boolean[] {false} ;
      A17814SATLOCALID = "" ;
      A17815SATLOCALDSC = "" ;
      AV166SATLOCALDSC = "" ;
      P02RR38_A10221SATCOLONIAID = new String[] {""} ;
      P02RR38_A10222SATCOLONIACP = new String[] {""} ;
      P02RR38_A10223SATCOLONIADSC = new String[] {""} ;
      P02RR38_n10223SATCOLONIADSC = new boolean[] {false} ;
      A10221SATCOLONIAID = "" ;
      A10222SATCOLONIACP = "" ;
      A10223SATCOLONIADSC = "" ;
      AV167SATCOLONIADSC = "" ;
      P02RR39_A171PMCTPRID = new String[] {""} ;
      P02RR39_A18212PMCTPRCMPS = new String[] {""} ;
      P02RR39_n18212PMCTPRCMPS = new boolean[] {false} ;
      P02RR39_A18213PMCTPRNPER = new String[] {""} ;
      P02RR39_n18213PMCTPRNPER = new boolean[] {false} ;
      P02RR39_A18214PMCTPRDOM = new String[] {""} ;
      P02RR39_n18214PMCTPRDOM = new boolean[] {false} ;
      P02RR39_A18215PMCTPRCOL = new String[] {""} ;
      P02RR39_n18215PMCTPRCOL = new boolean[] {false} ;
      P02RR39_A18216PMCTPRREFE = new String[] {""} ;
      P02RR39_n18216PMCTPRREFE = new boolean[] {false} ;
      P02RR39_A18217PMCTPREDO = new String[] {""} ;
      P02RR39_n18217PMCTPREDO = new boolean[] {false} ;
      P02RR39_A18218PMCTPRLOC = new String[] {""} ;
      P02RR39_n18218PMCTPRLOC = new boolean[] {false} ;
      P02RR39_A18219PMCTPRMUN = new String[] {""} ;
      P02RR39_n18219PMCTPRMUN = new boolean[] {false} ;
      P02RR39_A18220PMCTPRCODP = new String[] {""} ;
      P02RR39_n18220PMCTPRCODP = new boolean[] {false} ;
      A171PMCTPRID = "" ;
      A18212PMCTPRCMPS = "" ;
      A18213PMCTPRNPER = "" ;
      A18214PMCTPRDOM = "" ;
      A18215PMCTPRCOL = "" ;
      A18216PMCTPRREFE = "" ;
      A18217PMCTPREDO = "" ;
      A18218PMCTPRLOC = "" ;
      A18219PMCTPRMUN = "" ;
      A18220PMCTPRCODP = "" ;
      AV169PMCTPRCMPS = "" ;
      AV170PMCTPRNPER = "" ;
      AV171PMCTPRDOM = "" ;
      AV172PMCTPRCOL = "" ;
      AV173PMCTPRREFE = "" ;
      AV174PMCTPREDO = "" ;
      AV175PMCTPRLOC = "" ;
      AV176PMCTPRMUN = "" ;
      AV177PMCTPRCODP = "" ;
      P02RR40_A9531SATTIPRELID = new String[] {""} ;
      P02RR40_A9532SATTIPRELDSC = new String[] {""} ;
      P02RR40_n9532SATTIPRELDSC = new boolean[] {false} ;
      P02RR41_A7034CNCTEID = new long[1] ;
      P02RR41_A7038CNCTERFC = new String[] {""} ;
      P02RR41_n7038CNCTERFC = new boolean[] {false} ;
      P02RR41_A12166CNCTECTAB = new String[] {""} ;
      P02RR41_n12166CNCTECTAB = new boolean[] {false} ;
      A7038CNCTERFC = "" ;
      A12166CNCTECTAB = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.apdfsatv3__default(),
         new Object[] {
             new Object[] {
            P02RR2_A5939CNCIASID, P02RR2_A9CNCIASDSC, P02RR2_n9CNCIASDSC, P02RR2_A5147CNCIASIMGFILE, P02RR2_n5147CNCIASIMGFILE, P02RR2_A13CNCIASCP, P02RR2_n13CNCIASCP, P02RR2_A10CNCIASCOL, P02RR2_n10CNCIASCOL, P02RR2_A11CNCIASCAL,
            P02RR2_n11CNCIASCAL, P02RR2_A3018CNCIASFAX, P02RR2_n3018CNCIASFAX, P02RR2_A2417CNCIASTE1, P02RR2_n2417CNCIASTE1, P02RR2_A2418CNCIASTE2, P02RR2_n2418CNCIASTE2, P02RR2_A2419CNCIASTE3, P02RR2_n2419CNCIASTE3
            }
            , new Object[] {
            P02RR3_A9454FACTXMLIDATR, P02RR3_A9453FACTXMLNODO, P02RR3_A9385FACTXMLFOL, P02RR3_A9384FACTXMLSER, P02RR3_A9383FACTXMLCIA, P02RR3_A9455FACTXMLVALATR, P02RR3_n9455FACTXMLVALATR
            }
            , new Object[] {
            P02RR4_A9385FACTXMLFOL, P02RR4_A9384FACTXMLSER, P02RR4_A9383FACTXMLCIA, P02RR4_A9406FACTXMLUUID, P02RR4_n9406FACTXMLUUID, P02RR4_A9446FACTXMLNCER, P02RR4_n9446FACTXMLNCER, P02RR4_A9451FACTXMLNCERS, P02RR4_n9451FACTXMLNCERS, P02RR4_A9386FACTXMLFEC,
            P02RR4_n9386FACTXMLFEC, P02RR4_A9448FACTXMLFTIM, P02RR4_n9448FACTXMLFTIM, P02RR4_A9389FACTXMLRFCE, P02RR4_n9389FACTXMLRFCE, P02RR4_A9390FACTXMLREGF, P02RR4_n9390FACTXMLREGF, P02RR4_A13933FACTXMLREGFR, P02RR4_n13933FACTXMLREGFR, P02RR4_A9395FACTXMLUSOC,
            P02RR4_n9395FACTXMLUSOC, P02RR4_A9391FACTXMLCODP, P02RR4_n9391FACTXMLCODP, P02RR4_A9392FACTXMLRFCR, P02RR4_n9392FACTXMLRFCR, P02RR4_A15512FACTXMLGEN, P02RR4_n15512FACTXMLGEN, P02RR4_A9848FACTXMLPROY, P02RR4_n9848FACTXMLPROY, P02RR4_A9394FACTXMLNREC,
            P02RR4_n9394FACTXMLNREC, P02RR4_A9469FACTXMLCOM, P02RR4_n9469FACTXMLCOM, P02RR4_A9449FACTXMLRFCPR, P02RR4_n9449FACTXMLRFCPR, P02RR4_A10341FACTXMLCODPR, P02RR4_n10341FACTXMLCODPR, P02RR4_A9396FACTXMLMON, P02RR4_n9396FACTXMLMON, P02RR4_A9397FACTXMLFPAG,
            P02RR4_n9397FACTXMLFPAG, P02RR4_A9398FACTXMLMPAG, P02RR4_n9398FACTXMLMPAG, P02RR4_A9388FACTXMLTIPC, P02RR4_n9388FACTXMLTIPC, P02RR4_A9400FACTXMLSUB, P02RR4_n9400FACTXMLSUB, P02RR4_A12161FACTXMLTOTAM, P02RR4_n12161FACTXMLTOTAM, P02RR4_A9401FACTXMLDESC,
            P02RR4_n9401FACTXMLDESC, P02RR4_A9402FACTXMLIVA, P02RR4_n9402FACTXMLIVA, P02RR4_A9403FACTXMLRET, P02RR4_n9403FACTXMLRET, P02RR4_A10131FACTXMLCTAC, P02RR4_n10131FACTXMLCTAC, P02RR4_A10129FACTXMLRFCB, P02RR4_n10129FACTXMLRFCB, P02RR4_A9404FACTXMLTOT,
            P02RR4_n9404FACTXMLTOT, P02RR4_A9393FACTXMLCLI, P02RR4_n9393FACTXMLCLI, P02RR4_A9450FACTXMLSECFD, P02RR4_n9450FACTXMLSECFD, P02RR4_A9452FACTXMLSESAT, P02RR4_n9452FACTXMLSESAT, P02RR4_A9537FACTXMLUUIDR, P02RR4_n9537FACTXMLUUIDR, P02RR4_A9536FACTXMLTIPREL,
            P02RR4_n9536FACTXMLTIPREL, P02RR4_A10856FACTXMLDIRE, P02RR4_n10856FACTXMLDIRE, P02RR4_A9634FACTXMLPREFAC, P02RR4_n9634FACTXMLPREFAC, P02RR4_A9399FACTXMLTCAM, P02RR4_n9399FACTXMLTCAM, P02RR4_A10184FACTXMLFECP, P02RR4_n10184FACTXMLFECP
            }
            , new Object[] {
            P02RR5_A9385FACTXMLFOL, P02RR5_A9384FACTXMLSER, P02RR5_A9383FACTXMLCIA, P02RR5_A15047FACTXMLQR, P02RR5_n15047FACTXMLQR
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02RR8_A9385FACTXMLFOL, P02RR8_A9384FACTXMLSER, P02RR8_A9383FACTXMLCIA, P02RR8_A15047FACTXMLQR, P02RR8_n15047FACTXMLQR
            }
            , new Object[] {
            P02RR9_A11966FACTRELCIA, P02RR9_A11968FACTRELFOL, P02RR9_A11967FACTRELSER, P02RR9_A11841FACTAMOUUID, P02RR9_A11960FACTAMOCLI
            }
            , new Object[] {
            P02RR10_A11869TEMRELCIA, P02RR10_A11982TEMRELFOLA, P02RR10_n11982TEMRELFOLA, P02RR10_A11983TEMRELSERA, P02RR10_n11983TEMRELSERA, P02RR10_A11870TEMRELCLI, P02RR10_A11871TEMRELUUID, P02RR10_A11872TEMPRELTIPC
            }
            , new Object[] {
            P02RR11_A11967FACTRELSER, P02RR11_A11968FACTRELFOL, P02RR11_A11966FACTRELCIA, P02RR11_A11841FACTAMOUUID, P02RR11_A18103FACTAMOTREL, P02RR11_n18103FACTAMOTREL, P02RR11_A11960FACTAMOCLI
            }
            , new Object[] {
            P02RR12_A11983TEMRELSERA, P02RR12_n11983TEMRELSERA, P02RR12_A11982TEMRELFOLA, P02RR12_n11982TEMRELFOLA, P02RR12_A11869TEMRELCIA, P02RR12_A11871TEMRELUUID, P02RR12_A18102TEMRELTREL, P02RR12_n18102TEMRELTREL, P02RR12_A11870TEMRELCLI, P02RR12_A11872TEMPRELTIPC
            }
            , new Object[] {
            P02RR13_A9383FACTXMLCIA, P02RR13_A9384FACTXMLSER, P02RR13_A9385FACTXMLFOL, P02RR13_A9410FACTXMLCLAVE, P02RR13_n9410FACTXMLCLAVE, P02RR13_A9412FACTXMLQTY, P02RR13_n9412FACTXMLQTY, P02RR13_A9413FACTXMLUND, P02RR13_n9413FACTXMLUND, P02RR13_A9414FACTXMLUNDS,
            P02RR13_n9414FACTXMLUNDS, P02RR13_A9421FACTXMLIMPT, P02RR13_n9421FACTXMLIMPT, P02RR13_A9415FACTXMLPRE, P02RR13_n9415FACTXMLPRE, P02RR13_A12162FACTXMLBAMOR, P02RR13_n12162FACTXMLBAMOR, P02RR13_A11828FACTXMLAMORT, P02RR13_n11828FACTXMLAMORT, P02RR13_A9416FACTXML1DESC,
            P02RR13_n9416FACTXML1DESC, P02RR13_A9422FACTXMLIMPV, P02RR13_n9422FACTXMLIMPV, P02RR13_A9418FACTXML1IVA, P02RR13_n9418FACTXML1IVA, P02RR13_A9417FACTXML1SUB, P02RR13_n9417FACTXML1SUB, P02RR13_A9411FACTXMLPRI2, P02RR13_n9411FACTXMLPRI2, P02RR13_A9551FACTXMLOBS,
            P02RR13_n9551FACTXMLOBS, P02RR13_A10962FACTXMLCONS, P02RR13_A9408FACTXMLPRID
            }
            , new Object[] {
            P02RR14_A9385FACTXMLFOL, P02RR14_A9384FACTXMLSER, P02RR14_A9383FACTXMLCIA, P02RR14_A10079FACTCOMNPA, P02RR14_A10080FACTCOMIDR, P02RR14_A10081FACTCOMMON, P02RR14_n10081FACTCOMMON, P02RR14_A10082FACTCOMSER, P02RR14_n10082FACTCOMSER, P02RR14_A10083FACTCOMFOL,
            P02RR14_n10083FACTCOMFOL, P02RR14_A10084FACTCOMMET, P02RR14_n10084FACTCOMMET, P02RR14_A10085FACTCOMSAN, P02RR14_n10085FACTCOMSAN, P02RR14_A10086FACTCOMIMP, P02RR14_n10086FACTCOMIMP, P02RR14_A10087FACTCOMSIN, P02RR14_n10087FACTCOMSIN, P02RR14_A10115FACTCOMTCAM,
            P02RR14_n10115FACTCOMTCAM
            }
            , new Object[] {
            P02RR15_A12089FACTXMLRETBAS, P02RR15_n12089FACTXMLRETBAS, P02RR15_A9385FACTXMLFOL, P02RR15_A9384FACTXMLSER, P02RR15_A9383FACTXMLCIA, P02RR15_A9424FACTXMLRETID
            }
            , new Object[] {
            P02RR16_A12089FACTXMLRETBAS, P02RR16_n12089FACTXMLRETBAS, P02RR16_A9385FACTXMLFOL, P02RR16_A9384FACTXMLSER, P02RR16_A9383FACTXMLCIA, P02RR16_A9424FACTXMLRETID
            }
            , new Object[] {
            P02RR17_A9424FACTXMLRETID, P02RR17_A9385FACTXMLFOL, P02RR17_A9384FACTXMLSER, P02RR17_A9383FACTXMLCIA, P02RR17_A9428FACTXMLRETMNT, P02RR17_n9428FACTXMLRETMNT, P02RR17_A12091FACTXMLRETNOM, P02RR17_n12091FACTXMLRETNOM, P02RR17_A9408FACTXMLPRID, P02RR17_A10962FACTXMLCONS
            }
            , new Object[] {
            P02RR18_A9336SATPROSERDSC, P02RR18_n9336SATPROSERDSC, P02RR18_A9335SATPROSERID
            }
            , new Object[] {
            P02RR19_A13930SATOBJIMPID, P02RR19_A13931SATOBJIMPDSC, P02RR19_n13931SATOBJIMPDSC
            }
            , new Object[] {
            P02RR20_A9343SATIMPTIPID, P02RR20_A9344SATIMPTIPDSC, P02RR20_n9344SATIMPTIPDSC
            }
            , new Object[] {
            P02RR21_A9339SATUNDMEDDSC, P02RR21_n9339SATUNDMEDDSC, P02RR21_A9338SATUNDMEDID
            }
            , new Object[] {
            P02RR22_A9332SATMETPAGID, P02RR22_A9333SATMETPAGDSC, P02RR22_n9333SATMETPAGDSC
            }
            , new Object[] {
            P02RR23_A9321SATUSOCOMID, P02RR23_A9322SATUSOCOMDSC, P02RR23_n9322SATUSOCOMDSC
            }
            , new Object[] {
            P02RR24_A2577BANCOID, P02RR24_A2578BANCODSC, P02RR24_n2578BANCODSC
            }
            , new Object[] {
            P02RR25_A9319SATTIPCOMID, P02RR25_A9320SATTIPCOMDSC, P02RR25_n9320SATTIPCOMDSC
            }
            , new Object[] {
            P02RR26_A9317SATREGFISDSC, P02RR26_n9317SATREGFISDSC, P02RR26_A9316SATREGFISID
            }
            , new Object[] {
            P02RR27_A7034CNCTEID, P02RR27_A13937CNCTECODP, P02RR27_n13937CNCTECODP, P02RR27_A13936CNCTEREGF, P02RR27_n13936CNCTEREGF
            }
            , new Object[] {
            P02RR28_A9317SATREGFISDSC, P02RR28_n9317SATREGFISDSC, P02RR28_A9316SATREGFISID
            }
            , new Object[] {
            P02RR29_A9329SATFORPAGID, P02RR29_A9330SATFORPAGDSC, P02RR29_n9330SATFORPAGDSC
            }
            , new Object[] {
            P02RR30_A9332SATMETPAGID, P02RR30_A9333SATMETPAGDSC, P02RR30_n9333SATMETPAGDSC
            }
            , new Object[] {
            P02RR31_A7034CNCTEID, P02RR31_A7039CNCTEDIR, P02RR31_n7039CNCTEDIR
            }
            , new Object[] {
            P02RR32_A9531SATTIPRELID, P02RR32_A9532SATTIPRELDSC, P02RR32_n9532SATTIPRELDSC
            }
            , new Object[] {
            P02RR33_A7034CNCTEID, P02RR33_A13937CNCTECODP, P02RR33_n13937CNCTECODP, P02RR33_A17973CNCTEPAIS, P02RR33_n17973CNCTEPAIS, P02RR33_A17974CNCTEEDO, P02RR33_n17974CNCTEEDO, P02RR33_A17975CNCTEMUN, P02RR33_n17975CNCTEMUN, P02RR33_A17976CNCTELOCAL,
            P02RR33_n17976CNCTELOCAL, P02RR33_A17977CNCTECOL, P02RR33_n17977CNCTECOL, P02RR33_A17978CNCTECAL, P02RR33_n17978CNCTECAL, P02RR33_A17979CNCTENUME, P02RR33_n17979CNCTENUME, P02RR33_A17980CNCTENUMI, P02RR33_n17980CNCTENUMI
            }
            , new Object[] {
            P02RR34_A10242SATPAISID, P02RR34_A10243SATPAISDSC, P02RR34_n10243SATPAISDSC
            }
            , new Object[] {
            P02RR35_A10245SATESTADOID, P02RR35_A10247SATESTADOPAIS, P02RR35_n10247SATESTADOPAIS, P02RR35_A10246SATESTADODSC, P02RR35_n10246SATESTADODSC
            }
            , new Object[] {
            P02RR36_A10249SATMUNICIPIOID, P02RR36_A10251SATMUNICIPIOEST, P02RR36_A10250SATMUNICIPIODSC, P02RR36_n10250SATMUNICIPIODSC
            }
            , new Object[] {
            P02RR37_A17814SATLOCALID, P02RR37_A10245SATESTADOID, P02RR37_A17815SATLOCALDSC, P02RR37_n17815SATLOCALDSC
            }
            , new Object[] {
            P02RR38_A10221SATCOLONIAID, P02RR38_A10222SATCOLONIACP, P02RR38_A10223SATCOLONIADSC, P02RR38_n10223SATCOLONIADSC
            }
            , new Object[] {
            P02RR39_A171PMCTPRID, P02RR39_A18212PMCTPRCMPS, P02RR39_n18212PMCTPRCMPS, P02RR39_A18213PMCTPRNPER, P02RR39_n18213PMCTPRNPER, P02RR39_A18214PMCTPRDOM, P02RR39_n18214PMCTPRDOM, P02RR39_A18215PMCTPRCOL, P02RR39_n18215PMCTPRCOL, P02RR39_A18216PMCTPRREFE,
            P02RR39_n18216PMCTPRREFE, P02RR39_A18217PMCTPREDO, P02RR39_n18217PMCTPREDO, P02RR39_A18218PMCTPRLOC, P02RR39_n18218PMCTPRLOC, P02RR39_A18219PMCTPRMUN, P02RR39_n18219PMCTPRMUN, P02RR39_A18220PMCTPRCODP, P02RR39_n18220PMCTPRCODP
            }
            , new Object[] {
            P02RR40_A9531SATTIPRELID, P02RR40_A9532SATTIPRELDSC, P02RR40_n9532SATTIPRELDSC
            }
            , new Object[] {
            P02RR41_A7034CNCTEID, P02RR41_A7038CNCTERFC, P02RR41_n7038CNCTERFC, P02RR41_A12166CNCTECTAB, P02RR41_n12166CNCTECTAB
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A12162FACTXMLBAMOR ;
   private byte AV215GXLvl434 ;
   private byte AV223GXLvl479 ;
   private short gxcookieaux ;
   private short AV25CONT_HOJAS ;
   private short A15512FACTXMLGEN ;
   private short AV145FACTXMLGEN ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private long AV41FACTXMLCIA ;
   private long AV52FACTXMLFOL ;
   private long A5939CNCIASID ;
   private long A9385FACTXMLFOL ;
   private long A9383FACTXMLCIA ;
   private long A9393FACTXMLCLI ;
   private long AV43FACTXMLCLI ;
   private long A11966FACTRELCIA ;
   private long A11968FACTRELFOL ;
   private long A11960FACTAMOCLI ;
   private long A11869TEMRELCIA ;
   private long A11982TEMRELFOLA ;
   private long A11870TEMRELCLI ;
   private long A10962FACTXMLCONS ;
   private long A9408FACTXMLPRID ;
   private long A10079FACTCOMNPA ;
   private long A10083FACTCOMFOL ;
   private long AV31FACTCOMNPA ;
   private long AV27FACTCOMFOL ;
   private long AV40FACTXMLBANCLIE ;
   private long A2577BANCOID ;
   private long A7034CNCTEID ;
   private long AV12BAND_COM ;
   private long AV187LIN1 ;
   private long AV186LIN2 ;
   private long AV24CONT ;
   private long AV99nlin ;
   private long AV139NumCaracteres ;
   private long AV138pos ;
   private long AV168CNCTEID ;
   private java.math.BigDecimal A9400FACTXMLSUB ;
   private java.math.BigDecimal A12161FACTXMLTOTAM ;
   private java.math.BigDecimal A9401FACTXMLDESC ;
   private java.math.BigDecimal A9402FACTXMLIVA ;
   private java.math.BigDecimal A9403FACTXMLRET ;
   private java.math.BigDecimal A9404FACTXMLTOT ;
   private java.math.BigDecimal A9399FACTXMLTCAM ;
   private java.math.BigDecimal AV80factxmlsub ;
   private java.math.BigDecimal AV48FACTXMLDESC ;
   private java.math.BigDecimal AV57FACTXMLIVA ;
   private java.math.BigDecimal AV68FACTXMLRET ;
   private java.math.BigDecimal AV83FACTXMLTOT ;
   private java.math.BigDecimal AV126totalpag ;
   private java.math.BigDecimal AV125total ;
   private java.math.BigDecimal AV120tipocambio ;
   private java.math.BigDecimal A9412FACTXMLQTY ;
   private java.math.BigDecimal A9415FACTXMLPRE ;
   private java.math.BigDecimal A11828FACTXMLAMORT ;
   private java.math.BigDecimal A9416FACTXML1DESC ;
   private java.math.BigDecimal A9422FACTXMLIMPV ;
   private java.math.BigDecimal A9418FACTXML1IVA ;
   private java.math.BigDecimal A9417FACTXML1SUB ;
   private java.math.BigDecimal AV66FACTXMLQTY ;
   private java.math.BigDecimal AV101precio ;
   private java.math.BigDecimal AV36FACTXML1DESC ;
   private java.math.BigDecimal AV56FACTXMLimpv ;
   private java.math.BigDecimal AV37FACTXML1iva ;
   private java.math.BigDecimal AV38FACTXML1SUB ;
   private java.math.BigDecimal AV116subtotal ;
   private java.math.BigDecimal A10085FACTCOMSAN ;
   private java.math.BigDecimal A10086FACTCOMIMP ;
   private java.math.BigDecimal A10087FACTCOMSIN ;
   private java.math.BigDecimal A10115FACTCOMTCAM ;
   private java.math.BigDecimal AV32FACTCOMSAN ;
   private java.math.BigDecimal AV29FACTCOMIMP ;
   private java.math.BigDecimal AV34FACTCOMSIN ;
   private java.math.BigDecimal AV35FACTCOMTCAM ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private java.math.BigDecimal AV98monto ;
   private java.math.BigDecimal AV70FACTXMLRETMNT ;
   private java.math.BigDecimal A9428FACTXMLRETMNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV78FACTXMLSER ;
   private String AV151mostrarqr ;
   private String AV152urlqr ;
   private String AV153CPO ;
   private String scmdbuf ;
   private String A9CNCIASDSC ;
   private String A13CNCIASCP ;
   private String A10CNCIASCOL ;
   private String A11CNCIASCAL ;
   private String A3018CNCIASFAX ;
   private String A2417CNCIASTE1 ;
   private String A2418CNCIASTE2 ;
   private String A2419CNCIASTE3 ;
   private String AV17CNCIASDSC ;
   private String AV26DIRECCION ;
   private String AV18CNCIASFAX ;
   private String AV20CNCIASTE1 ;
   private String A9454FACTXMLIDATR ;
   private String A9453FACTXMLNODO ;
   private String A9384FACTXMLSER ;
   private String AV129VERSION ;
   private String A9406FACTXMLUUID ;
   private String A9446FACTXMLNCER ;
   private String A9451FACTXMLNCERS ;
   private String A9386FACTXMLFEC ;
   private String A9448FACTXMLFTIM ;
   private String A9389FACTXMLRFCE ;
   private String A9390FACTXMLREGF ;
   private String A13933FACTXMLREGFR ;
   private String A9395FACTXMLUSOC ;
   private String A9391FACTXMLCODP ;
   private String A9392FACTXMLRFCR ;
   private String A9848FACTXMLPROY ;
   private String A9394FACTXMLNREC ;
   private String A9449FACTXMLRFCPR ;
   private String A10341FACTXMLCODPR ;
   private String A9396FACTXMLMON ;
   private String A9397FACTXMLFPAG ;
   private String A9398FACTXMLMPAG ;
   private String A9388FACTXMLTIPC ;
   private String A10131FACTXMLCTAC ;
   private String A10129FACTXMLRFCB ;
   private String A9537FACTXMLUUIDR ;
   private String A9536FACTXMLTIPREL ;
   private String A10856FACTXMLDIRE ;
   private String A9634FACTXMLPREFAC ;
   private String AV87FACTXMLUUID ;
   private String AV59FACTXMLNCER ;
   private String AV60FACTXMLNCERS ;
   private String AV50FACTXMLFEC ;
   private String AV54FACTXMLFTIM ;
   private String AV74FACTXMLRFCE ;
   private String AV67FACTXMLREGF ;
   private String AV134FACTXMLREGFR ;
   private String AV86FACTXMLUSOC ;
   private String AV44FACTXMLCODP ;
   private String AV76FACTXMLRFCR ;
   private String AV178FACTXMLPROY ;
   private String AV61FACTXMLNREC ;
   private String AV144nombre ;
   private String AV75FACTXMLRFCPR ;
   private String AV132FACTXMLCODPR ;
   private String AV58FACTXMLMON ;
   private String AV104SATFORPAGID ;
   private String AV106SATMETPAGID ;
   private String AV110SATTIPCOMID ;
   private String AV46FACTXMLCTAC ;
   private String AV72FACTXMLRFCB ;
   private String AV88FACTXMLUUIDR ;
   private String AV82FACTXMLTIPREL ;
   private String AV49FACTXMLDIRE ;
   private String AV185FACTXMLPREFAC ;
   private String AV143tipocam ;
   private String AV142titulotpc ;
   private String AV105SATMETPAGDSC ;
   private String AV89fecpag ;
   private String AV90formapago ;
   private String AV103SATFORPAGDSC ;
   private String AV97monpag ;
   private String AV121Tipocampag ;
   private String AV136Fe ;
   private String AV140string ;
   private String AV102qr ;
   private String AV141cadena ;
   private String AV127url ;
   private String sImgUrl ;
   private String AV130SATREGFISBUS ;
   private String AV183hayrel ;
   private String A11967FACTRELSER ;
   private String A11841FACTAMOUUID ;
   private String A11983TEMRELSERA ;
   private String A11871TEMRELUUID ;
   private String A11872TEMPRELTIPC ;
   private String A18103FACTAMOTREL ;
   private String AV182FACTAMOTREL ;
   private String A18102TEMRELTREL ;
   private String AV124titulocol ;
   private String A9410FACTXMLCLAVE ;
   private String A9413FACTXMLUND ;
   private String A9414FACTXMLUNDS ;
   private String A9421FACTXMLIMPT ;
   private String A9411FACTXMLPRI2 ;
   private String A9551FACTXMLOBS ;
   private String AV42FACTXMLCLAVE ;
   private String AV84FACTXMLUND ;
   private String AV85FACTXMLUNDS ;
   private String AV55FACTXMLIMPT ;
   private String AV146satobjimpid ;
   private String AV65FACTXMLPRI2 ;
   private String AV128VAR_AUX ;
   private String AV73factxmlrfcbcli ;
   private String AV47factxmlctaclie ;
   private String AV11bancodsc ;
   private String A10080FACTCOMIDR ;
   private String A10081FACTCOMMON ;
   private String A10082FACTCOMSER ;
   private String A10084FACTCOMMET ;
   private String AV28FACTCOMIDR ;
   private String AV30FACTCOMMON ;
   private String AV33FACTCOMSER ;
   private String AV9FACTCOMMET ;
   private String AV122tipocampag2 ;
   private String AV8CNCMNMID ;
   private String GXt_char4 ;
   private String AV93Letra ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV123titulo ;
   private String A12089FACTXMLRETBAS ;
   private String A9424FACTXMLRETID ;
   private String AV69FACTXMLRETID ;
   private String AV95METODOPAG ;
   private String A12091FACTXMLRETNOM ;
   private String AV71FACTXMLRETNOM ;
   private String A9336SATPROSERDSC ;
   private String A9335SATPROSERID ;
   private String A9481SATPROSERBUS ;
   private String AV107satproserbus ;
   private String AV179satproserbus2 ;
   private String AV147satobjimpdsc ;
   private String A13930SATOBJIMPID ;
   private String A13931SATOBJIMPDSC ;
   private String A9343SATIMPTIPID ;
   private String A9344SATIMPTIPDSC ;
   private String AV92impuesto ;
   private String A9339SATUNDMEDDSC ;
   private String A9338SATUNDMEDID ;
   private String A9482SATUNDMEDBUS ;
   private String AV112satundmedbus ;
   private String A9332SATMETPAGID ;
   private String A9333SATMETPAGDSC ;
   private String A7039CNCTEDIR ;
   private String A9531SATTIPRELID ;
   private String A9532SATTIPRELDSC ;
   private String A9321SATUSOCOMID ;
   private String A9322SATUSOCOMDSC ;
   private String AV114SATUSOCOMID ;
   private String AV113SATUSOCOMDSC ;
   private String A2578BANCODSC ;
   private String A9319SATTIPCOMID ;
   private String A9320SATTIPCOMDSC ;
   private String AV109SATTIPCOMDSC ;
   private String A9317SATREGFISDSC ;
   private String A9316SATREGFISID ;
   private String A13938SATREGFISBUS ;
   private String A13937CNCTECODP ;
   private String A13936CNCTEREGF ;
   private String AV131SATREGFISBUS_R ;
   private String A9329SATFORPAGID ;
   private String A9330SATFORPAGDSC ;
   private String AV21CNCTEDIR ;
   private String AV111SATTIPRELDSC ;
   private String AV23complemento ;
   private String AV180complemento2 ;
   private String AV63FACTXMLPRDSC ;
   private String AV181PRODUCTO ;
   private String AV14cadena2 ;
   private String AV13cadena1 ;
   private String AV148complementocom ;
   private String A17973CNCTEPAIS ;
   private String A17974CNCTEEDO ;
   private String A17975CNCTEMUN ;
   private String A17976CNCTELOCAL ;
   private String A17977CNCTECOL ;
   private String A17978CNCTECAL ;
   private String A17979CNCTENUME ;
   private String A17980CNCTENUMI ;
   private String AV163CNCTECODP ;
   private String AV155CNCTEPAIS ;
   private String AV156CNCTEEDO ;
   private String AV157CNCTEMUN ;
   private String AV158CNCTELOCAL ;
   private String AV159CNCTECOL ;
   private String AV160CNCTECAL ;
   private String AV161CNCTENUME ;
   private String AV162CNCTENUMI ;
   private String A10242SATPAISID ;
   private String A10243SATPAISDSC ;
   private String AV154SATPAISDSC ;
   private String A10245SATESTADOID ;
   private String A10247SATESTADOPAIS ;
   private String A10246SATESTADODSC ;
   private String AV164SATESTADODSC ;
   private String A10249SATMUNICIPIOID ;
   private String A10251SATMUNICIPIOEST ;
   private String A10250SATMUNICIPIODSC ;
   private String AV165SATMUNICIPIODSC ;
   private String A17814SATLOCALID ;
   private String A17815SATLOCALDSC ;
   private String AV166SATLOCALDSC ;
   private String A10221SATCOLONIAID ;
   private String A10222SATCOLONIACP ;
   private String A10223SATCOLONIADSC ;
   private String AV167SATCOLONIADSC ;
   private String A171PMCTPRID ;
   private String A18212PMCTPRCMPS ;
   private String A18213PMCTPRNPER ;
   private String A18214PMCTPRDOM ;
   private String A18215PMCTPRCOL ;
   private String A18216PMCTPRREFE ;
   private String A18217PMCTPREDO ;
   private String A18218PMCTPRLOC ;
   private String A18219PMCTPRMUN ;
   private String A18220PMCTPRCODP ;
   private String AV169PMCTPRCMPS ;
   private String AV170PMCTPRNPER ;
   private String AV171PMCTPRDOM ;
   private String AV172PMCTPRCOL ;
   private String AV173PMCTPRREFE ;
   private String AV174PMCTPREDO ;
   private String AV175PMCTPRLOC ;
   private String AV176PMCTPRMUN ;
   private String AV177PMCTPRCODP ;
   private String A7038CNCTERFC ;
   private String A12166CNCTECTAB ;
   private java.util.Date A10184FACTXMLFECP ;
   private boolean entryPointCalled ;
   private boolean n9CNCIASDSC ;
   private boolean n5147CNCIASIMGFILE ;
   private boolean n13CNCIASCP ;
   private boolean n10CNCIASCOL ;
   private boolean n11CNCIASCAL ;
   private boolean n3018CNCIASFAX ;
   private boolean n2417CNCIASTE1 ;
   private boolean n2418CNCIASTE2 ;
   private boolean n2419CNCIASTE3 ;
   private boolean n9455FACTXMLVALATR ;
   private boolean n9406FACTXMLUUID ;
   private boolean n9446FACTXMLNCER ;
   private boolean n9451FACTXMLNCERS ;
   private boolean n9386FACTXMLFEC ;
   private boolean n9448FACTXMLFTIM ;
   private boolean n9389FACTXMLRFCE ;
   private boolean n9390FACTXMLREGF ;
   private boolean n13933FACTXMLREGFR ;
   private boolean n9395FACTXMLUSOC ;
   private boolean n9391FACTXMLCODP ;
   private boolean n9392FACTXMLRFCR ;
   private boolean n15512FACTXMLGEN ;
   private boolean n9848FACTXMLPROY ;
   private boolean n9394FACTXMLNREC ;
   private boolean n9469FACTXMLCOM ;
   private boolean n9449FACTXMLRFCPR ;
   private boolean n10341FACTXMLCODPR ;
   private boolean n9396FACTXMLMON ;
   private boolean n9397FACTXMLFPAG ;
   private boolean n9398FACTXMLMPAG ;
   private boolean n9388FACTXMLTIPC ;
   private boolean n9400FACTXMLSUB ;
   private boolean n12161FACTXMLTOTAM ;
   private boolean n9401FACTXMLDESC ;
   private boolean n9402FACTXMLIVA ;
   private boolean n9403FACTXMLRET ;
   private boolean n10131FACTXMLCTAC ;
   private boolean n10129FACTXMLRFCB ;
   private boolean n9404FACTXMLTOT ;
   private boolean n9393FACTXMLCLI ;
   private boolean n9450FACTXMLSECFD ;
   private boolean n9452FACTXMLSESAT ;
   private boolean n9537FACTXMLUUIDR ;
   private boolean n9536FACTXMLTIPREL ;
   private boolean n10856FACTXMLDIRE ;
   private boolean n9634FACTXMLPREFAC ;
   private boolean n9399FACTXMLTCAM ;
   private boolean n10184FACTXMLFECP ;
   private boolean returnInSub ;
   private boolean n15047FACTXMLQR ;
   private boolean n11982TEMRELFOLA ;
   private boolean n11983TEMRELSERA ;
   private boolean n18103FACTAMOTREL ;
   private boolean n18102TEMRELTREL ;
   private boolean n9410FACTXMLCLAVE ;
   private boolean n9412FACTXMLQTY ;
   private boolean n9413FACTXMLUND ;
   private boolean n9414FACTXMLUNDS ;
   private boolean n9421FACTXMLIMPT ;
   private boolean n9415FACTXMLPRE ;
   private boolean n12162FACTXMLBAMOR ;
   private boolean n11828FACTXMLAMORT ;
   private boolean n9416FACTXML1DESC ;
   private boolean n9422FACTXMLIMPV ;
   private boolean n9418FACTXML1IVA ;
   private boolean n9417FACTXML1SUB ;
   private boolean n9411FACTXMLPRI2 ;
   private boolean n9551FACTXMLOBS ;
   private boolean n10081FACTCOMMON ;
   private boolean n10082FACTCOMSER ;
   private boolean n10083FACTCOMFOL ;
   private boolean n10084FACTCOMMET ;
   private boolean n10085FACTCOMSAN ;
   private boolean n10086FACTCOMIMP ;
   private boolean n10087FACTCOMSIN ;
   private boolean n10115FACTCOMTCAM ;
   private boolean n12089FACTXMLRETBAS ;
   private boolean n9428FACTXMLRETMNT ;
   private boolean n12091FACTXMLRETNOM ;
   private boolean n9336SATPROSERDSC ;
   private boolean n13931SATOBJIMPDSC ;
   private boolean n9344SATIMPTIPDSC ;
   private boolean n9339SATUNDMEDDSC ;
   private boolean n9333SATMETPAGDSC ;
   private boolean n9322SATUSOCOMDSC ;
   private boolean n2578BANCODSC ;
   private boolean n9320SATTIPCOMDSC ;
   private boolean n9317SATREGFISDSC ;
   private boolean n13937CNCTECODP ;
   private boolean n13936CNCTEREGF ;
   private boolean n9330SATFORPAGDSC ;
   private boolean n7039CNCTEDIR ;
   private boolean n9532SATTIPRELDSC ;
   private boolean n17973CNCTEPAIS ;
   private boolean n17974CNCTEEDO ;
   private boolean n17975CNCTEMUN ;
   private boolean n17976CNCTELOCAL ;
   private boolean n17977CNCTECOL ;
   private boolean n17978CNCTECAL ;
   private boolean n17979CNCTENUME ;
   private boolean n17980CNCTENUMI ;
   private boolean n10243SATPAISDSC ;
   private boolean n10247SATESTADOPAIS ;
   private boolean n10246SATESTADODSC ;
   private boolean n10250SATMUNICIPIODSC ;
   private boolean n17815SATLOCALDSC ;
   private boolean n10223SATCOLONIADSC ;
   private boolean n18212PMCTPRCMPS ;
   private boolean n18213PMCTPRNPER ;
   private boolean n18214PMCTPRDOM ;
   private boolean n18215PMCTPRCOL ;
   private boolean n18216PMCTPRREFE ;
   private boolean n18217PMCTPREDO ;
   private boolean n18218PMCTPRLOC ;
   private boolean n18219PMCTPRMUN ;
   private boolean n18220PMCTPRCODP ;
   private boolean n7038CNCTERFC ;
   private boolean n12166CNCTECTAB ;
   private String A9455FACTXMLVALATR ;
   private String A9469FACTXMLCOM ;
   private String A9450FACTXMLSECFD ;
   private String A9452FACTXMLSESAT ;
   private String AV149FACTXMLCOM_G ;
   private String AV77factxmlsecfd ;
   private String AV79factxmlsesat ;
   private String AV119timbre ;
   private String AV189cadenaOriginal ;
   private String AV45factxmlcom ;
   private String A5147CNCIASIMGFILE ;
   private String A15047FACTXMLQR ;
   private String AV195Image_GXI ;
   private String AV198Qr2_GXI ;
   private String AV201Codigo_GXI ;
   private String AV91image ;
   private String AV137qr2 ;
   private String AV22codigo ;
   private String Image ;
   private String Codigo ;
   private IDataStoreProvider pr_default ;
   private long[] P02RR2_A5939CNCIASID ;
   private String[] P02RR2_A9CNCIASDSC ;
   private boolean[] P02RR2_n9CNCIASDSC ;
   private String[] P02RR2_A5147CNCIASIMGFILE ;
   private boolean[] P02RR2_n5147CNCIASIMGFILE ;
   private String[] P02RR2_A13CNCIASCP ;
   private boolean[] P02RR2_n13CNCIASCP ;
   private String[] P02RR2_A10CNCIASCOL ;
   private boolean[] P02RR2_n10CNCIASCOL ;
   private String[] P02RR2_A11CNCIASCAL ;
   private boolean[] P02RR2_n11CNCIASCAL ;
   private String[] P02RR2_A3018CNCIASFAX ;
   private boolean[] P02RR2_n3018CNCIASFAX ;
   private String[] P02RR2_A2417CNCIASTE1 ;
   private boolean[] P02RR2_n2417CNCIASTE1 ;
   private String[] P02RR2_A2418CNCIASTE2 ;
   private boolean[] P02RR2_n2418CNCIASTE2 ;
   private String[] P02RR2_A2419CNCIASTE3 ;
   private boolean[] P02RR2_n2419CNCIASTE3 ;
   private String[] P02RR3_A9454FACTXMLIDATR ;
   private String[] P02RR3_A9453FACTXMLNODO ;
   private long[] P02RR3_A9385FACTXMLFOL ;
   private String[] P02RR3_A9384FACTXMLSER ;
   private long[] P02RR3_A9383FACTXMLCIA ;
   private String[] P02RR3_A9455FACTXMLVALATR ;
   private boolean[] P02RR3_n9455FACTXMLVALATR ;
   private long[] P02RR4_A9385FACTXMLFOL ;
   private String[] P02RR4_A9384FACTXMLSER ;
   private long[] P02RR4_A9383FACTXMLCIA ;
   private String[] P02RR4_A9406FACTXMLUUID ;
   private boolean[] P02RR4_n9406FACTXMLUUID ;
   private String[] P02RR4_A9446FACTXMLNCER ;
   private boolean[] P02RR4_n9446FACTXMLNCER ;
   private String[] P02RR4_A9451FACTXMLNCERS ;
   private boolean[] P02RR4_n9451FACTXMLNCERS ;
   private String[] P02RR4_A9386FACTXMLFEC ;
   private boolean[] P02RR4_n9386FACTXMLFEC ;
   private String[] P02RR4_A9448FACTXMLFTIM ;
   private boolean[] P02RR4_n9448FACTXMLFTIM ;
   private String[] P02RR4_A9389FACTXMLRFCE ;
   private boolean[] P02RR4_n9389FACTXMLRFCE ;
   private String[] P02RR4_A9390FACTXMLREGF ;
   private boolean[] P02RR4_n9390FACTXMLREGF ;
   private String[] P02RR4_A13933FACTXMLREGFR ;
   private boolean[] P02RR4_n13933FACTXMLREGFR ;
   private String[] P02RR4_A9395FACTXMLUSOC ;
   private boolean[] P02RR4_n9395FACTXMLUSOC ;
   private String[] P02RR4_A9391FACTXMLCODP ;
   private boolean[] P02RR4_n9391FACTXMLCODP ;
   private String[] P02RR4_A9392FACTXMLRFCR ;
   private boolean[] P02RR4_n9392FACTXMLRFCR ;
   private short[] P02RR4_A15512FACTXMLGEN ;
   private boolean[] P02RR4_n15512FACTXMLGEN ;
   private String[] P02RR4_A9848FACTXMLPROY ;
   private boolean[] P02RR4_n9848FACTXMLPROY ;
   private String[] P02RR4_A9394FACTXMLNREC ;
   private boolean[] P02RR4_n9394FACTXMLNREC ;
   private String[] P02RR4_A9469FACTXMLCOM ;
   private boolean[] P02RR4_n9469FACTXMLCOM ;
   private String[] P02RR4_A9449FACTXMLRFCPR ;
   private boolean[] P02RR4_n9449FACTXMLRFCPR ;
   private String[] P02RR4_A10341FACTXMLCODPR ;
   private boolean[] P02RR4_n10341FACTXMLCODPR ;
   private String[] P02RR4_A9396FACTXMLMON ;
   private boolean[] P02RR4_n9396FACTXMLMON ;
   private String[] P02RR4_A9397FACTXMLFPAG ;
   private boolean[] P02RR4_n9397FACTXMLFPAG ;
   private String[] P02RR4_A9398FACTXMLMPAG ;
   private boolean[] P02RR4_n9398FACTXMLMPAG ;
   private String[] P02RR4_A9388FACTXMLTIPC ;
   private boolean[] P02RR4_n9388FACTXMLTIPC ;
   private java.math.BigDecimal[] P02RR4_A9400FACTXMLSUB ;
   private boolean[] P02RR4_n9400FACTXMLSUB ;
   private java.math.BigDecimal[] P02RR4_A12161FACTXMLTOTAM ;
   private boolean[] P02RR4_n12161FACTXMLTOTAM ;
   private java.math.BigDecimal[] P02RR4_A9401FACTXMLDESC ;
   private boolean[] P02RR4_n9401FACTXMLDESC ;
   private java.math.BigDecimal[] P02RR4_A9402FACTXMLIVA ;
   private boolean[] P02RR4_n9402FACTXMLIVA ;
   private java.math.BigDecimal[] P02RR4_A9403FACTXMLRET ;
   private boolean[] P02RR4_n9403FACTXMLRET ;
   private String[] P02RR4_A10131FACTXMLCTAC ;
   private boolean[] P02RR4_n10131FACTXMLCTAC ;
   private String[] P02RR4_A10129FACTXMLRFCB ;
   private boolean[] P02RR4_n10129FACTXMLRFCB ;
   private java.math.BigDecimal[] P02RR4_A9404FACTXMLTOT ;
   private boolean[] P02RR4_n9404FACTXMLTOT ;
   private long[] P02RR4_A9393FACTXMLCLI ;
   private boolean[] P02RR4_n9393FACTXMLCLI ;
   private String[] P02RR4_A9450FACTXMLSECFD ;
   private boolean[] P02RR4_n9450FACTXMLSECFD ;
   private String[] P02RR4_A9452FACTXMLSESAT ;
   private boolean[] P02RR4_n9452FACTXMLSESAT ;
   private String[] P02RR4_A9537FACTXMLUUIDR ;
   private boolean[] P02RR4_n9537FACTXMLUUIDR ;
   private String[] P02RR4_A9536FACTXMLTIPREL ;
   private boolean[] P02RR4_n9536FACTXMLTIPREL ;
   private String[] P02RR4_A10856FACTXMLDIRE ;
   private boolean[] P02RR4_n10856FACTXMLDIRE ;
   private String[] P02RR4_A9634FACTXMLPREFAC ;
   private boolean[] P02RR4_n9634FACTXMLPREFAC ;
   private java.math.BigDecimal[] P02RR4_A9399FACTXMLTCAM ;
   private boolean[] P02RR4_n9399FACTXMLTCAM ;
   private java.util.Date[] P02RR4_A10184FACTXMLFECP ;
   private boolean[] P02RR4_n10184FACTXMLFECP ;
   private long[] P02RR5_A9385FACTXMLFOL ;
   private String[] P02RR5_A9384FACTXMLSER ;
   private long[] P02RR5_A9383FACTXMLCIA ;
   private String[] P02RR5_A15047FACTXMLQR ;
   private boolean[] P02RR5_n15047FACTXMLQR ;
   private long[] P02RR8_A9385FACTXMLFOL ;
   private String[] P02RR8_A9384FACTXMLSER ;
   private long[] P02RR8_A9383FACTXMLCIA ;
   private String[] P02RR8_A15047FACTXMLQR ;
   private boolean[] P02RR8_n15047FACTXMLQR ;
   private long[] P02RR9_A11966FACTRELCIA ;
   private long[] P02RR9_A11968FACTRELFOL ;
   private String[] P02RR9_A11967FACTRELSER ;
   private String[] P02RR9_A11841FACTAMOUUID ;
   private long[] P02RR9_A11960FACTAMOCLI ;
   private long[] P02RR10_A11869TEMRELCIA ;
   private long[] P02RR10_A11982TEMRELFOLA ;
   private boolean[] P02RR10_n11982TEMRELFOLA ;
   private String[] P02RR10_A11983TEMRELSERA ;
   private boolean[] P02RR10_n11983TEMRELSERA ;
   private long[] P02RR10_A11870TEMRELCLI ;
   private String[] P02RR10_A11871TEMRELUUID ;
   private String[] P02RR10_A11872TEMPRELTIPC ;
   private String[] P02RR11_A11967FACTRELSER ;
   private long[] P02RR11_A11968FACTRELFOL ;
   private long[] P02RR11_A11966FACTRELCIA ;
   private String[] P02RR11_A11841FACTAMOUUID ;
   private String[] P02RR11_A18103FACTAMOTREL ;
   private boolean[] P02RR11_n18103FACTAMOTREL ;
   private long[] P02RR11_A11960FACTAMOCLI ;
   private String[] P02RR12_A11983TEMRELSERA ;
   private boolean[] P02RR12_n11983TEMRELSERA ;
   private long[] P02RR12_A11982TEMRELFOLA ;
   private boolean[] P02RR12_n11982TEMRELFOLA ;
   private long[] P02RR12_A11869TEMRELCIA ;
   private String[] P02RR12_A11871TEMRELUUID ;
   private String[] P02RR12_A18102TEMRELTREL ;
   private boolean[] P02RR12_n18102TEMRELTREL ;
   private long[] P02RR12_A11870TEMRELCLI ;
   private String[] P02RR12_A11872TEMPRELTIPC ;
   private long[] P02RR13_A9383FACTXMLCIA ;
   private String[] P02RR13_A9384FACTXMLSER ;
   private long[] P02RR13_A9385FACTXMLFOL ;
   private String[] P02RR13_A9410FACTXMLCLAVE ;
   private boolean[] P02RR13_n9410FACTXMLCLAVE ;
   private java.math.BigDecimal[] P02RR13_A9412FACTXMLQTY ;
   private boolean[] P02RR13_n9412FACTXMLQTY ;
   private String[] P02RR13_A9413FACTXMLUND ;
   private boolean[] P02RR13_n9413FACTXMLUND ;
   private String[] P02RR13_A9414FACTXMLUNDS ;
   private boolean[] P02RR13_n9414FACTXMLUNDS ;
   private String[] P02RR13_A9421FACTXMLIMPT ;
   private boolean[] P02RR13_n9421FACTXMLIMPT ;
   private java.math.BigDecimal[] P02RR13_A9415FACTXMLPRE ;
   private boolean[] P02RR13_n9415FACTXMLPRE ;
   private byte[] P02RR13_A12162FACTXMLBAMOR ;
   private boolean[] P02RR13_n12162FACTXMLBAMOR ;
   private java.math.BigDecimal[] P02RR13_A11828FACTXMLAMORT ;
   private boolean[] P02RR13_n11828FACTXMLAMORT ;
   private java.math.BigDecimal[] P02RR13_A9416FACTXML1DESC ;
   private boolean[] P02RR13_n9416FACTXML1DESC ;
   private java.math.BigDecimal[] P02RR13_A9422FACTXMLIMPV ;
   private boolean[] P02RR13_n9422FACTXMLIMPV ;
   private java.math.BigDecimal[] P02RR13_A9418FACTXML1IVA ;
   private boolean[] P02RR13_n9418FACTXML1IVA ;
   private java.math.BigDecimal[] P02RR13_A9417FACTXML1SUB ;
   private boolean[] P02RR13_n9417FACTXML1SUB ;
   private String[] P02RR13_A9411FACTXMLPRI2 ;
   private boolean[] P02RR13_n9411FACTXMLPRI2 ;
   private String[] P02RR13_A9551FACTXMLOBS ;
   private boolean[] P02RR13_n9551FACTXMLOBS ;
   private long[] P02RR13_A10962FACTXMLCONS ;
   private long[] P02RR13_A9408FACTXMLPRID ;
   private long[] P02RR14_A9385FACTXMLFOL ;
   private String[] P02RR14_A9384FACTXMLSER ;
   private long[] P02RR14_A9383FACTXMLCIA ;
   private long[] P02RR14_A10079FACTCOMNPA ;
   private String[] P02RR14_A10080FACTCOMIDR ;
   private String[] P02RR14_A10081FACTCOMMON ;
   private boolean[] P02RR14_n10081FACTCOMMON ;
   private String[] P02RR14_A10082FACTCOMSER ;
   private boolean[] P02RR14_n10082FACTCOMSER ;
   private long[] P02RR14_A10083FACTCOMFOL ;
   private boolean[] P02RR14_n10083FACTCOMFOL ;
   private String[] P02RR14_A10084FACTCOMMET ;
   private boolean[] P02RR14_n10084FACTCOMMET ;
   private java.math.BigDecimal[] P02RR14_A10085FACTCOMSAN ;
   private boolean[] P02RR14_n10085FACTCOMSAN ;
   private java.math.BigDecimal[] P02RR14_A10086FACTCOMIMP ;
   private boolean[] P02RR14_n10086FACTCOMIMP ;
   private java.math.BigDecimal[] P02RR14_A10087FACTCOMSIN ;
   private boolean[] P02RR14_n10087FACTCOMSIN ;
   private java.math.BigDecimal[] P02RR14_A10115FACTCOMTCAM ;
   private boolean[] P02RR14_n10115FACTCOMTCAM ;
   private String[] P02RR15_A12089FACTXMLRETBAS ;
   private boolean[] P02RR15_n12089FACTXMLRETBAS ;
   private long[] P02RR15_A9385FACTXMLFOL ;
   private String[] P02RR15_A9384FACTXMLSER ;
   private long[] P02RR15_A9383FACTXMLCIA ;
   private String[] P02RR15_A9424FACTXMLRETID ;
   private String[] P02RR16_A12089FACTXMLRETBAS ;
   private boolean[] P02RR16_n12089FACTXMLRETBAS ;
   private long[] P02RR16_A9385FACTXMLFOL ;
   private String[] P02RR16_A9384FACTXMLSER ;
   private long[] P02RR16_A9383FACTXMLCIA ;
   private String[] P02RR16_A9424FACTXMLRETID ;
   private String[] P02RR17_A9424FACTXMLRETID ;
   private long[] P02RR17_A9385FACTXMLFOL ;
   private String[] P02RR17_A9384FACTXMLSER ;
   private long[] P02RR17_A9383FACTXMLCIA ;
   private java.math.BigDecimal[] P02RR17_A9428FACTXMLRETMNT ;
   private boolean[] P02RR17_n9428FACTXMLRETMNT ;
   private String[] P02RR17_A12091FACTXMLRETNOM ;
   private boolean[] P02RR17_n12091FACTXMLRETNOM ;
   private long[] P02RR17_A9408FACTXMLPRID ;
   private long[] P02RR17_A10962FACTXMLCONS ;
   private String[] P02RR18_A9336SATPROSERDSC ;
   private boolean[] P02RR18_n9336SATPROSERDSC ;
   private String[] P02RR18_A9335SATPROSERID ;
   private String[] P02RR19_A13930SATOBJIMPID ;
   private String[] P02RR19_A13931SATOBJIMPDSC ;
   private boolean[] P02RR19_n13931SATOBJIMPDSC ;
   private String[] P02RR20_A9343SATIMPTIPID ;
   private String[] P02RR20_A9344SATIMPTIPDSC ;
   private boolean[] P02RR20_n9344SATIMPTIPDSC ;
   private String[] P02RR21_A9339SATUNDMEDDSC ;
   private boolean[] P02RR21_n9339SATUNDMEDDSC ;
   private String[] P02RR21_A9338SATUNDMEDID ;
   private String[] P02RR22_A9332SATMETPAGID ;
   private String[] P02RR22_A9333SATMETPAGDSC ;
   private boolean[] P02RR22_n9333SATMETPAGDSC ;
   private String[] P02RR23_A9321SATUSOCOMID ;
   private String[] P02RR23_A9322SATUSOCOMDSC ;
   private boolean[] P02RR23_n9322SATUSOCOMDSC ;
   private long[] P02RR24_A2577BANCOID ;
   private String[] P02RR24_A2578BANCODSC ;
   private boolean[] P02RR24_n2578BANCODSC ;
   private String[] P02RR25_A9319SATTIPCOMID ;
   private String[] P02RR25_A9320SATTIPCOMDSC ;
   private boolean[] P02RR25_n9320SATTIPCOMDSC ;
   private String[] P02RR26_A9317SATREGFISDSC ;
   private boolean[] P02RR26_n9317SATREGFISDSC ;
   private String[] P02RR26_A9316SATREGFISID ;
   private long[] P02RR27_A7034CNCTEID ;
   private String[] P02RR27_A13937CNCTECODP ;
   private boolean[] P02RR27_n13937CNCTECODP ;
   private String[] P02RR27_A13936CNCTEREGF ;
   private boolean[] P02RR27_n13936CNCTEREGF ;
   private String[] P02RR28_A9317SATREGFISDSC ;
   private boolean[] P02RR28_n9317SATREGFISDSC ;
   private String[] P02RR28_A9316SATREGFISID ;
   private String[] P02RR29_A9329SATFORPAGID ;
   private String[] P02RR29_A9330SATFORPAGDSC ;
   private boolean[] P02RR29_n9330SATFORPAGDSC ;
   private String[] P02RR30_A9332SATMETPAGID ;
   private String[] P02RR30_A9333SATMETPAGDSC ;
   private boolean[] P02RR30_n9333SATMETPAGDSC ;
   private long[] P02RR31_A7034CNCTEID ;
   private String[] P02RR31_A7039CNCTEDIR ;
   private boolean[] P02RR31_n7039CNCTEDIR ;
   private String[] P02RR32_A9531SATTIPRELID ;
   private String[] P02RR32_A9532SATTIPRELDSC ;
   private boolean[] P02RR32_n9532SATTIPRELDSC ;
   private long[] P02RR33_A7034CNCTEID ;
   private String[] P02RR33_A13937CNCTECODP ;
   private boolean[] P02RR33_n13937CNCTECODP ;
   private String[] P02RR33_A17973CNCTEPAIS ;
   private boolean[] P02RR33_n17973CNCTEPAIS ;
   private String[] P02RR33_A17974CNCTEEDO ;
   private boolean[] P02RR33_n17974CNCTEEDO ;
   private String[] P02RR33_A17975CNCTEMUN ;
   private boolean[] P02RR33_n17975CNCTEMUN ;
   private String[] P02RR33_A17976CNCTELOCAL ;
   private boolean[] P02RR33_n17976CNCTELOCAL ;
   private String[] P02RR33_A17977CNCTECOL ;
   private boolean[] P02RR33_n17977CNCTECOL ;
   private String[] P02RR33_A17978CNCTECAL ;
   private boolean[] P02RR33_n17978CNCTECAL ;
   private String[] P02RR33_A17979CNCTENUME ;
   private boolean[] P02RR33_n17979CNCTENUME ;
   private String[] P02RR33_A17980CNCTENUMI ;
   private boolean[] P02RR33_n17980CNCTENUMI ;
   private String[] P02RR34_A10242SATPAISID ;
   private String[] P02RR34_A10243SATPAISDSC ;
   private boolean[] P02RR34_n10243SATPAISDSC ;
   private String[] P02RR35_A10245SATESTADOID ;
   private String[] P02RR35_A10247SATESTADOPAIS ;
   private boolean[] P02RR35_n10247SATESTADOPAIS ;
   private String[] P02RR35_A10246SATESTADODSC ;
   private boolean[] P02RR35_n10246SATESTADODSC ;
   private String[] P02RR36_A10249SATMUNICIPIOID ;
   private String[] P02RR36_A10251SATMUNICIPIOEST ;
   private String[] P02RR36_A10250SATMUNICIPIODSC ;
   private boolean[] P02RR36_n10250SATMUNICIPIODSC ;
   private String[] P02RR37_A17814SATLOCALID ;
   private String[] P02RR37_A10245SATESTADOID ;
   private String[] P02RR37_A17815SATLOCALDSC ;
   private boolean[] P02RR37_n17815SATLOCALDSC ;
   private String[] P02RR38_A10221SATCOLONIAID ;
   private String[] P02RR38_A10222SATCOLONIACP ;
   private String[] P02RR38_A10223SATCOLONIADSC ;
   private boolean[] P02RR38_n10223SATCOLONIADSC ;
   private String[] P02RR39_A171PMCTPRID ;
   private String[] P02RR39_A18212PMCTPRCMPS ;
   private boolean[] P02RR39_n18212PMCTPRCMPS ;
   private String[] P02RR39_A18213PMCTPRNPER ;
   private boolean[] P02RR39_n18213PMCTPRNPER ;
   private String[] P02RR39_A18214PMCTPRDOM ;
   private boolean[] P02RR39_n18214PMCTPRDOM ;
   private String[] P02RR39_A18215PMCTPRCOL ;
   private boolean[] P02RR39_n18215PMCTPRCOL ;
   private String[] P02RR39_A18216PMCTPRREFE ;
   private boolean[] P02RR39_n18216PMCTPRREFE ;
   private String[] P02RR39_A18217PMCTPREDO ;
   private boolean[] P02RR39_n18217PMCTPREDO ;
   private String[] P02RR39_A18218PMCTPRLOC ;
   private boolean[] P02RR39_n18218PMCTPRLOC ;
   private String[] P02RR39_A18219PMCTPRMUN ;
   private boolean[] P02RR39_n18219PMCTPRMUN ;
   private String[] P02RR39_A18220PMCTPRCODP ;
   private boolean[] P02RR39_n18220PMCTPRCODP ;
   private String[] P02RR40_A9531SATTIPRELID ;
   private String[] P02RR40_A9532SATTIPRELDSC ;
   private boolean[] P02RR40_n9532SATTIPRELDSC ;
   private long[] P02RR41_A7034CNCTEID ;
   private String[] P02RR41_A7038CNCTERFC ;
   private boolean[] P02RR41_n7038CNCTERFC ;
   private String[] P02RR41_A12166CNCTECTAB ;
   private boolean[] P02RR41_n12166CNCTECTAB ;
}

final  class apdfsatv3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RR2", "SELECT CNCIASID, CNCIASDSC, CNCIASIMGFILE, CNCIASCP, CNCIASCOL, CNCIASCAL, CNCIASFAX, CNCIASTE1, CNCIASTE2, CNCIASTE3 FROM CNCIAS WHERE CNCIASID = ? ORDER BY CNCIASID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR3", "SELECT FACTXMLIDATR, FACTXMLNODO, FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLVALATR FROM FACTXML3 WHERE FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ? and FACTXMLNODO = ( 'Comprobante') and FACTXMLIDATR = ( 'Version') ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL, FACTXMLNODO, FACTXMLIDATR ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR4", "SELECT FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLUUID, FACTXMLNCER, FACTXMLNCERS, FACTXMLFEC, FACTXMLFTIM, FACTXMLRFCE, FACTXMLREGF, FACTXMLREGFR, FACTXMLUSOC, FACTXMLCODP, FACTXMLRFCR, FACTXMLGEN, FACTXMLPROY, FACTXMLNREC, FACTXMLCOM, FACTXMLRFCPR, FACTXMLCODPR, FACTXMLMON, FACTXMLFPAG, FACTXMLMPAG, FACTXMLTIPC, FACTXMLSUB, FACTXMLTOTAM, FACTXMLDESC, FACTXMLIVA, FACTXMLRET, FACTXMLCTAC, FACTXMLRFCB, FACTXMLTOT, FACTXMLCLI, FACTXMLSECFD, FACTXMLSESAT, FACTXMLUUIDR, FACTXMLTIPREL, FACTXMLDIRE, FACTXMLPREFAC, FACTXMLTCAM, FACTXMLFECP FROM FACTXML WHERE FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ? ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR5", "SELECT FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLQR FROM FACTXML WHERE FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ? ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL  LIMIT 1 FOR UPDATE OF FACTXML",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P02RR6", "SAVEPOINT gxupdate;UPDATE FACTXML SET FACTXMLQR=?  WHERE FACTXMLCIA = ? AND FACTXMLSER = ? AND FACTXMLFOL = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P02RR7", "SAVEPOINT gxupdate;UPDATE FACTXML SET FACTXMLQR=?  WHERE FACTXMLCIA = ? AND FACTXMLSER = ? AND FACTXMLFOL = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P02RR8", "SELECT FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLQR FROM FACTXML WHERE FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ? ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR9", "SELECT FACTRELCIA, FACTRELFOL, FACTRELSER, FACTAMOUUID, FACTAMOCLI FROM FACTAMO1 WHERE (FACTRELSER = ( ?)) AND (FACTRELFOL = ?) AND (FACTRELCIA = ?) ORDER BY FACTAMOUUID, FACTAMOCLI, FACTRELCIA, FACTRELSER, FACTRELFOL  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR10", "SELECT TEMRELCIA, TEMRELFOLA, TEMRELSERA, TEMRELCLI, TEMRELUUID, TEMPRELTIPC FROM TEMREL WHERE (TEMRELCIA = ?) AND (TEMRELSERA = ( ?)) AND (TEMRELFOLA = ?) ORDER BY TEMRELCIA  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR11", "SELECT FACTRELSER, FACTRELFOL, FACTRELCIA, FACTAMOUUID, FACTAMOTREL, FACTAMOCLI FROM FACTAMO1 WHERE (FACTRELSER = ( ?)) AND (FACTRELFOL = ?) AND (FACTRELCIA = ?) ORDER BY FACTAMOTREL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR12", "SELECT TEMRELSERA, TEMRELFOLA, TEMRELCIA, TEMRELUUID, TEMRELTREL, TEMRELCLI, TEMPRELTIPC FROM TEMREL WHERE (TEMRELSERA = ( ?)) AND (TEMRELFOLA = ?) AND (TEMRELCIA = ?) ORDER BY TEMRELTREL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR13", "SELECT FACTXMLCIA, FACTXMLSER, FACTXMLFOL, FACTXMLCLAVE, FACTXMLQTY, FACTXMLUND, FACTXMLUNDS, FACTXMLIMPT, FACTXMLPRE, FACTXMLBAMOR, FACTXMLAMORT, FACTXML1DESC, FACTXMLIMPV, FACTXML1IVA, FACTXML1SUB, FACTXMLPRI2, FACTXMLOBS, FACTXMLCONS, FACTXMLPRID FROM FACTXML1 WHERE (FACTXMLCIA = ?) AND (FACTXMLSER = ( ?)) AND (FACTXMLFOL = ?) ORDER BY FACTXMLCONS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR14", "SELECT FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTCOMNPA, FACTCOMIDR, FACTCOMMON, FACTCOMSER, FACTCOMFOL, FACTCOMMET, FACTCOMSAN, FACTCOMIMP, FACTCOMSIN, FACTCOMTCAM FROM FACTCOM WHERE FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ? ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR15", "SELECT DISTINCT NULL AS FACTXMLRETBAS, NULL AS FACTXMLFOL, NULL AS FACTXMLSER, NULL AS FACTXMLCIA, FACTXMLRETID FROM ( SELECT FACTXMLRETBAS, FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLRETID FROM FACTXML2 WHERE (FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ?) AND (FACTXMLRETBAS = ( '')) ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL) DistinctT ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR16", "SELECT DISTINCT NULL AS FACTXMLRETBAS, NULL AS FACTXMLFOL, NULL AS FACTXMLSER, NULL AS FACTXMLCIA, FACTXMLRETID FROM ( SELECT FACTXMLRETBAS, FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLRETID FROM FACTXML2 WHERE (FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ?) AND (FACTXMLRETBAS <> ( '')) ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL) DistinctT ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR17", "SELECT FACTXMLRETID, FACTXMLFOL, FACTXMLSER, FACTXMLCIA, FACTXMLRETMNT, FACTXMLRETNOM, FACTXMLPRID, FACTXMLCONS FROM FACTXML2 WHERE (FACTXMLCIA = ? and FACTXMLSER = ( ?) and FACTXMLFOL = ?) AND (FACTXMLRETID = ( ?)) ORDER BY FACTXMLCIA, FACTXMLSER, FACTXMLFOL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P02RR18", "SELECT SATPROSERDSC, SATPROSERID FROM SATPROSER WHERE SATPROSERID = ( ?) ORDER BY SATPROSERID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR19", "SELECT SATOBJIMPID, SATOBJIMPDSC FROM SATOBJIMP WHERE SATOBJIMPID = ( ?) ORDER BY SATOBJIMPID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR20", "SELECT SATIMPTIPID, SATIMPTIPDSC FROM SATIMPTIP WHERE SATIMPTIPID = ( ?) ORDER BY SATIMPTIPID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR21", "SELECT SATUNDMEDDSC, SATUNDMEDID FROM SATUNDMED WHERE SATUNDMEDID = ( ?) ORDER BY SATUNDMEDID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR22", "SELECT SATMETPAGID, SATMETPAGDSC FROM SATMETPAG WHERE SATMETPAGID = ( ?) ORDER BY SATMETPAGID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR23", "SELECT SATUSOCOMID, SATUSOCOMDSC FROM SATUSOCOM WHERE SATUSOCOMID = ( ?) ORDER BY SATUSOCOMID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR24", "SELECT BANCOID, BANCODSC FROM BANCO WHERE BANCOID = ? ORDER BY BANCOID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR25", "SELECT SATTIPCOMID, SATTIPCOMDSC FROM SATTIPCOM WHERE SATTIPCOMID = ( ?) ORDER BY SATTIPCOMID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR26", "SELECT SATREGFISDSC, SATREGFISID FROM SATREGFIS WHERE SATREGFISID = ( ?) ORDER BY SATREGFISID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR27", "SELECT CNCTEID, CNCTECODP, CNCTEREGF FROM CNCTE WHERE CNCTEID = ? ORDER BY CNCTEID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR28", "SELECT SATREGFISDSC, SATREGFISID FROM SATREGFIS WHERE SATREGFISID = ( ?) ORDER BY SATREGFISID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR29", "SELECT SATFORPAGID, SATFORPAGDSC FROM SATFORPAG WHERE SATFORPAGID = ( ?) ORDER BY SATFORPAGID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR30", "SELECT SATMETPAGID, SATMETPAGDSC FROM SATMETPAG WHERE SATMETPAGID = ( ?) ORDER BY SATMETPAGID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR31", "SELECT CNCTEID, CNCTEDIR FROM CNCTE WHERE CNCTEID = ? ORDER BY CNCTEID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR32", "SELECT SATTIPRELID, SATTIPRELDSC FROM SATTIPREL WHERE SATTIPRELID = ( ?) ORDER BY SATTIPRELID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR33", "SELECT CNCTEID, CNCTECODP, CNCTEPAIS, CNCTEEDO, CNCTEMUN, CNCTELOCAL, CNCTECOL, CNCTECAL, CNCTENUME, CNCTENUMI FROM CNCTE WHERE CNCTEID = ? ORDER BY CNCTEID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR34", "SELECT SATPAISID, SATPAISDSC FROM SATPAIS WHERE SATPAISID = ( ?) ORDER BY SATPAISID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR35", "SELECT SATESTADOID, SATESTADOPAIS, SATESTADODSC FROM SATESTADO WHERE (SATESTADOID = ( ?)) AND (SATESTADOPAIS = ( ?)) ORDER BY SATESTADOID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR36", "SELECT SATMUNICIPIOID, SATMUNICIPIOEST, SATMUNICIPIODSC FROM SATMUNICIPIO WHERE SATMUNICIPIOID = ( ?) and SATMUNICIPIOEST = ( ?) ORDER BY SATMUNICIPIOID, SATMUNICIPIOEST ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR37", "SELECT SATLOCALID, SATESTADOID, SATLOCALDSC FROM SATLOCAL WHERE SATLOCALID = ( ?) and SATESTADOID = ( ?) ORDER BY SATLOCALID, SATESTADOID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR38", "SELECT SATCOLONIAID, SATCOLONIACP, SATCOLONIADSC FROM SATCOLONIA WHERE SATCOLONIAID = ( ?) and SATCOLONIACP = ( ?) ORDER BY SATCOLONIAID, SATCOLONIACP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR39", "SELECT PMCTPRID, PMCTPRCMPS, PMCTPRNPER, PMCTPRDOM, PMCTPRCOL, PMCTPRREFE, PMCTPREDO, PMCTPRLOC, PMCTPRMUN, PMCTPRCODP FROM PMCTPR WHERE PMCTPRID = ( ?) ORDER BY PMCTPRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR40", "SELECT SATTIPRELID, SATTIPRELDSC FROM SATTIPREL WHERE SATTIPRELID = ( ?) ORDER BY SATTIPRELID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P02RR41", "SELECT CNCTEID, CNCTERFC, CNCTECTAB FROM CNCTE WHERE CNCTEID = ? ORDER BY CNCTEID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getBLOBFile(3, "tmp", "") ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 50) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 50) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 20) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 20) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 10) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 50) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 200) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 20) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 10) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 10) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 20) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 10) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 250) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getLongVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 10) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 10) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 10) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 10) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 10) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(25,2) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(26,2) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(27,2) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(28,2) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(29,2) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 20) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(32,2) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getLongVarchar(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getLongVarchar(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 50) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 10) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 500) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(39, 1) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(40,4) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDateTime(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getBLOBFile(4, "tmp", "") ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getBLOBFile(4, "tmp", "") ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 10) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 50) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 50) ;
               ((String[]) buf[7])[0] = rslt.getString(6, 10) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 50) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getString(4, 50) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((String[]) buf[9])[0] = rslt.getString(7, 10) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,6) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,4) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 50) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 800) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((long[]) buf[31])[0] = rslt.getLong(18) ;
               ((long[]) buf[32])[0] = rslt.getLong(19) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 50) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 3) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,6) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 10) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 10) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 10) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 100) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10) ;
               return;
            case 25 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 200) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 31 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 300) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 200) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 200) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 200) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 25) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 200) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 25) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 200) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 100) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 50) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 100) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 100) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 200) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 39 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 13) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(1, (String)parms[1]);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setString(3, (String)parms[3], 10);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARBINARY );
               }
               else
               {
                  stmt.setBLOBFile(1, (String)parms[1]);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setString(3, (String)parms[3], 10);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 29 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 31 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 39 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

