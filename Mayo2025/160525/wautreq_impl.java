/*
               File: wautreq_impl
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

public final  class wautreq_impl extends GXDataArea
{
   public wautreq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wautreq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wautreq_impl.class ));
   }

   public wautreq_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavCnciasid = new HTMLChoice();
      cmbavAutorizartod = new HTMLChoice();
      cmbavAutorizar = new HTMLChoice();
      cmbavAcrcpactcg = new HTMLChoice();
      dynavAcrcoiacd = new HTMLChoice();
      dynavCgunngid = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
         gxfirstwebparm_bkp = gxfirstwebparm ;
         gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            dyncall( httpContext.GetNextPar( )) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCNCIASID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvcnciasid2I2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vACRCOIACD") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvacrcoiacd2I2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCGUNNGID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvcgunngid2I2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_83 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_83_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_83_idx = httpContext.GetNextPar( ) ;
            cmbavAcrcpactcg.setEnabled( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavAcrcpactcg.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
            edtavAcrcpaqty_Enabled = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaqty_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaqty_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV193CGUNNGID = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            cmbavAcrcpactcg.setEnabled( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavAcrcpactcg.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
            edtavAcrcpaqty_Enabled = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaqty_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaqty_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV193CGUNNGID = httpContext.GetNextPar( ) ;
            AV99ACRCOININKIT_AUX = GXutil.lval( httpContext.GetNextPar( )) ;
            A272ACRCPALIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A269ACRCPACIA = GXutil.lval( httpContext.GetNextPar( )) ;
            AV11ACRCPACIA = GXutil.lval( httpContext.GetNextPar( )) ;
            A270ACRCPATDC = httpContext.GetNextPar( ) ;
            AV17ACRCPATDC = httpContext.GetNextPar( ) ;
            A271ACRCPADOC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV12ACRCPADOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A2380ACRCPAEST = httpContext.GetNextPar( ) ;
            n2380ACRCPAEST = false ;
            AV175ValImportanteUrgente = httpContext.GetNextPar( ) ;
            AV98ACRCOININKIT = GXutil.lval( httpContext.GetNextPar( )) ;
            A328ACRCPAPRID = GXutil.lval( httpContext.GetNextPar( )) ;
            n328ACRCPAPRID = false ;
            A329ACRCPAQTY = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n329ACRCPAQTY = false ;
            A330ACRCPAUM = httpContext.GetNextPar( ) ;
            n330ACRCPAUM = false ;
            A331ACRCPAFREQ = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n331ACRCPAFREQ = false ;
            A326ACRCPAUSSOL = httpContext.GetNextPar( ) ;
            n326ACRCPAUSSOL = false ;
            AV59ACRCPAQTYR = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV60ACRCPAQTYOC = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A817ACRCPACNRQPDIAS = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n817ACRCPACNRQPDIAS = false ;
            A3902ACRCPAOBS = httpContext.GetNextPar( ) ;
            n3902ACRCPAOBS = false ;
            A10945ACRCPAPRECOT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n10945ACRCPAPRECOT = false ;
            A10946ACRCPAPREPRO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n10946ACRCPAPREPRO = false ;
            AV138Homologado = httpContext.GetNextPar( ) ;
            AV63ACRCPAULPCM = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV61ACRCPAQTYRC = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV62ACRCPAQTYP = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV64ACRCPAVACMEST = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV65ACRCPACNRQPDIAS = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV13ACRCPAFREQ = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            Gx_date = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV15ACRCPAPRID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV190AutorizarTod = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV115Propietario = httpContext.GetNextPar( ) ;
            AV6CNUSERID = httpContext.GetNextPar( ) ;
            A383PMPRCNBASE = GXutil.lval( httpContext.GetNextPar( )) ;
            A384PMPRCNPERT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A394PMPRCNPERTN2 = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A395PMPRCNPERTN3 = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A396PMPRCNPERTN4 = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A397PMPRCNPERTN5 = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A171PMCTPRID = httpContext.GetNextPar( ) ;
            n171PMCTPRID = false ;
            AV45PMCTPRID = httpContext.GetNextPar( ) ;
            A381PMCTCGCLASE = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n381PMCTCGCLASE = false ;
            A379PMAGCCID = httpContext.GetNextPar( ) ;
            A348PMCTCGID = httpContext.GetNextPar( ) ;
            A349PMCTCGDSC = httpContext.GetNextPar( ) ;
            n349PMCTCGDSC = false ;
            A5939CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            A20CNTDOCID = httpContext.GetNextPar( ) ;
            A266ACRCOIDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A267ACRCOILIN = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV14ACRCPALIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A8585ACRCOIURG = httpContext.GetNextPar( ) ;
            n8585ACRCOIURG = false ;
            A8586ACRCOIIMP = httpContext.GetNextPar( ) ;
            n8586ACRCOIIMP = false ;
            A325ACRCOIFRE2 = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n325ACRCOIFRE2 = false ;
            A893ACRCOININKIT = GXutil.lval( httpContext.GetNextPar( )) ;
            n893ACRCOININKIT = false ;
            AV126ACRCOIDIAS = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV127ACRCOIRFINI = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV128ACRCOIRFFIN = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV129ACRCOIRPER = httpContext.GetNextPar( ) ;
            A322ACRCOIUB4 = httpContext.GetNextPar( ) ;
            n322ACRCOIUB4 = false ;
            A1366ACRCOIA2D = httpContext.GetNextPar( ) ;
            n1366ACRCOIA2D = false ;
            AV188PermiteCambioCtaCgo = httpContext.GetNextPar( ) ;
            A268ACRCOIPRID = GXutil.lval( httpContext.GetNextPar( )) ;
            n268ACRCOIPRID = false ;
            A3INPR01DSC = httpContext.GetNextPar( ) ;
            n3INPR01DSC = false ;
            A2INPR02DSC = httpContext.GetNextPar( ) ;
            n2INPR02DSC = false ;
            A5682ACRCOIS001 = httpContext.GetNextPar( ) ;
            n5682ACRCOIS001 = false ;
            A6988ACRCOIDIAS = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n6988ACRCOIDIAS = false ;
            A8447ACRCOIRFINI = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n8447ACRCOIRFINI = false ;
            A8448ACRCOIRFFIN = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n8448ACRCOIRFFIN = false ;
            A8557ACRCOIRPER = httpContext.GetNextPar( ) ;
            n8557ACRCOIRPER = false ;
            A710INPR07ID = httpContext.GetNextPar( ) ;
            n710INPR07ID = false ;
            A10967SUBFAMID = httpContext.GetNextPar( ) ;
            A10968SUBFAMDSC = httpContext.GetNextPar( ) ;
            n10968SUBFAMDSC = false ;
            AV108TipoPresupuesto = httpContext.GetNextPar( ) ;
            AV78Comprometido = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV105ComprometidoM = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A362PMTPOPID = httpContext.GetNextPar( ) ;
            n362PMTPOPID = false ;
            A415PMCRPREST = httpContext.GetNextPar( ) ;
            n415PMCRPREST = false ;
            A359PMCRPRMN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n359PMCRPRMN = false ;
            AV80Presupuestado = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV104presupuestadoM = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A412PMCRPRCIA = GXutil.lval( httpContext.GetNextPar( )) ;
            A370PMCRPRPROD = GXutil.lval( httpContext.GetNextPar( )) ;
            n370PMCRPRPROD = false ;
            AV146PMCRPREST = httpContext.GetNextPar( ) ;
            A355PMCRPRQTY = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n355PMCRPRQTY = false ;
            A351PMCRPRTDC = httpContext.GetNextPar( ) ;
            A208ACMVOIFDO2 = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n208ACMVOIFDO2 = false ;
            A43ACMVOIDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A142ACMVOIPRID = GXutil.lval( httpContext.GetNextPar( )) ;
            n142ACMVOIPRID = false ;
            A139ACACSGID = httpContext.GetNextPar( ) ;
            n139ACACSGID = false ;
            A150ACMVOIPRE = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n150ACMVOIPRE = false ;
            A162ACMVOIUB1 = httpContext.GetNextPar( ) ;
            n162ACMVOIUB1 = false ;
            A7704EXPINSPROD = GXutil.lval( httpContext.GetNextPar( )) ;
            A7705EXPINSPROY = httpContext.GetNextPar( ) ;
            AV141ACMVOIUB1 = httpContext.GetNextPar( ) ;
            A7710EXPINSCAN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7710EXPINSCAN = false ;
            A889PMRCKTDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A890PMRCKTIDKIT = GXutil.lval( httpContext.GetNextPar( )) ;
            A891PMRCKTQTYREQ = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n891PMRCKTQTYREQ = false ;
            AV56ACRCOIDSC4 = httpContext.GetNextPar( ) ;
            A756ACRCOIDSC4 = httpContext.GetNextPar( ) ;
            n756ACRCOIDSC4 = false ;
            AV234ACRCOICONSER = httpContext.GetNextPar( ) ;
            A323ACRCOIALM = httpContext.GetNextPar( ) ;
            n323ACRCOIALM = false ;
            A10943ACRCOIPRECOT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n10943ACRCOIPRECOT = false ;
            A281INPRODID = GXutil.lval( httpContext.GetNextPar( )) ;
            A712INPR09ID = httpContext.GetNextPar( ) ;
            n712INPR09ID = false ;
            AV125PERIODODSC = httpContext.GetNextPar( ) ;
            A5881PERIODOID = httpContext.GetNextPar( ) ;
            A5882PERIODODSC = httpContext.GetNextPar( ) ;
            AV81ACRCPACTCG = httpContext.GetNextPar( ) ;
            A350PMPRCNPRES = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n350PMPRCNPRES = false ;
            A6204PMPRCNMANIO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV109PACRCPAFREQ = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            A6205PMPRCNMMES = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A6208PMPRCNMPERTN3 = httpContext.GetNextPar( ) ;
            AV110PMPRCNMPERTN3 = httpContext.GetNextPar( ) ;
            A6209PMPRCNMPERTN4 = httpContext.GetNextPar( ) ;
            AV111PMPRCNMPERTN4 = httpContext.GetNextPar( ) ;
            A6213PMPRCNMPRES = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n6213PMPRCNMPRES = false ;
            AV23CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV163OmitirEnvioCorreo = httpContext.GetNextPar( ) ;
            AV245EnviarCorreoOC = httpContext.GetNextPar( ) ;
            AV201generarValeAutomatico = httpContext.GetNextPar( ) ;
            AV22CNCIASDSC = httpContext.GetNextPar( ) ;
            AV121Proyecto = httpContext.GetNextPar( ) ;
            AV120UsuarioSol = httpContext.GetNextPar( ) ;
            AV221ServidorSMTP = httpContext.GetNextPar( ) ;
            AV223correoEnvia = httpContext.GetNextPar( ) ;
            AV224contrasenaEnvia = httpContext.GetNextPar( ) ;
            AV222puerto = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV192ACRCOIACD, AV193CGUNNGID, AV99ACRCOININKIT_AUX, A272ACRCPALIN, A269ACRCPACIA, AV11ACRCPACIA, A270ACRCPATDC, AV17ACRCPATDC, A271ACRCPADOC, AV12ACRCPADOC, A2380ACRCPAEST, AV175ValImportanteUrgente, AV98ACRCOININKIT, A328ACRCPAPRID, A329ACRCPAQTY, A330ACRCPAUM, A331ACRCPAFREQ, A326ACRCPAUSSOL, AV59ACRCPAQTYR, AV60ACRCPAQTYOC, A817ACRCPACNRQPDIAS, A3902ACRCPAOBS, A10945ACRCPAPRECOT, A10946ACRCPAPREPRO, AV138Homologado, AV63ACRCPAULPCM, AV61ACRCPAQTYRC, AV62ACRCPAQTYP, AV64ACRCPAVACMEST, AV65ACRCPACNRQPDIAS, AV13ACRCPAFREQ, Gx_date, AV15ACRCPAPRID, AV190AutorizarTod, AV115Propietario, AV6CNUSERID, A383PMPRCNBASE, A384PMPRCNPERT, A394PMPRCNPERTN2, A395PMPRCNPERTN3, A396PMPRCNPERTN4, A397PMPRCNPERTN5, A171PMCTPRID, AV45PMCTPRID, A381PMCTCGCLASE, A379PMAGCCID, A348PMCTCGID, A349PMCTCGDSC, A5939CNCIASID, A20CNTDOCID, A266ACRCOIDOC, A267ACRCOILIN, AV14ACRCPALIN, A8585ACRCOIURG, A8586ACRCOIIMP, A325ACRCOIFRE2, A893ACRCOININKIT, AV126ACRCOIDIAS, AV127ACRCOIRFINI, AV128ACRCOIRFFIN, AV129ACRCOIRPER, A322ACRCOIUB4, A1366ACRCOIA2D, AV188PermiteCambioCtaCgo, A268ACRCOIPRID, A3INPR01DSC, A2INPR02DSC, A5682ACRCOIS001, A6988ACRCOIDIAS, A8447ACRCOIRFINI, A8448ACRCOIRFFIN, A8557ACRCOIRPER, A710INPR07ID, A10967SUBFAMID, A10968SUBFAMDSC, AV108TipoPresupuesto, AV78Comprometido, AV105ComprometidoM, A362PMTPOPID, A415PMCRPREST, A359PMCRPRMN, AV80Presupuestado, AV104presupuestadoM, A412PMCRPRCIA, A370PMCRPRPROD, AV146PMCRPREST, A355PMCRPRQTY, A351PMCRPRTDC, A208ACMVOIFDO2, A43ACMVOIDOC, A142ACMVOIPRID, A139ACACSGID, A150ACMVOIPRE, A162ACMVOIUB1, A7704EXPINSPROD, A7705EXPINSPROY, AV141ACMVOIUB1, A7710EXPINSCAN, A889PMRCKTDOC, A890PMRCKTIDKIT, A891PMRCKTQTYREQ, AV56ACRCOIDSC4, A756ACRCOIDSC4, AV234ACRCOICONSER, A323ACRCOIALM, A10943ACRCOIPRECOT, A281INPRODID, A712INPR09ID, AV125PERIODODSC, A5881PERIODOID, A5882PERIODODSC, AV81ACRCPACTCG, A350PMPRCNPRES, A6204PMPRCNMANIO, AV109PACRCPAFREQ, A6205PMPRCNMMES, A6208PMPRCNMPERTN3, AV110PMPRCNMPERTN3, A6209PMPRCNMPERTN4, AV111PMPRCNMPERTN4, A6213PMPRCNMPRES, AV23CNCIASID, AV163OmitirEnvioCorreo, AV245EnviarCorreoOC, AV201generarValeAutomatico, AV22CNCIASDSC, AV121Proyecto, AV120UsuarioSol, AV221ServidorSMTP, AV223correoEnvia, AV224contrasenaEnvia, AV222puerto) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "wautreq" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV121Proyecto, "")) ;
            com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wautreq:[SendSecurityCheck value for]"+"UsuarioSol:"+GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")));
            GXutil.writeLogln("wautreq:[SendSecurityCheck value for]"+"Proyecto:"+GXutil.rtrim( localUtil.format( AV121Proyecto, "")));
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else
         {
            if ( ! httpContext.IsValidAjaxCall( false) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = gxfirstwebparm_bkp ;
         }
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV24CNESMNID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CNESMNID", AV24CNESMNID);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11ACRCPACIA = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
               AV17ACRCPATDC = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
               AV12ACRCPADOC = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
               AV45PMCTPRID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
            }
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.kdsproyectos.mpmaterial_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa2I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2I2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      com.kdsproyectos.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?202551615521064", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      httpContext.AddJavascriptSource("KDSControls/KDSStylesDatatables/KDSStylesDatatablesRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "background-color: white;" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.kdsproyectos.wautreq") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24CNESMNID)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11ACRCPACIA,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17ACRCPATDC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12ACRCPADOC,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV45PMCTPRID))+"\">") ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:none\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROYECTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Proyecto, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "wautreq" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV121Proyecto, "")) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wautreq:[SendSecurityCheck value for]"+"UsuarioSol:"+GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")));
      GXutil.writeLogln("wautreq:[SendSecurityCheck value for]"+"Proyecto:"+GXutil.rtrim( localUtil.format( AV121Proyecto, "")));
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_83", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_83, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMCTPRID", GXutil.rtrim( AV45PMCTPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPATDC", GXutil.rtrim( AV17ACRCPATDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPACIA", GXutil.ltrim( localUtil.ntoc( AV11ACRCPACIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPALIN", GXutil.ltrim( localUtil.ntoc( A272ACRCPALIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPACIA", GXutil.ltrim( localUtil.ntoc( A269ACRCPACIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPATDC", GXutil.rtrim( A270ACRCPATDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPADOC", GXutil.ltrim( localUtil.ntoc( A271ACRCPADOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAEST", GXutil.rtrim( A2380ACRCPAEST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALIMPORTANTEURGENTE", GXutil.rtrim( AV175ValImportanteUrgente));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALIMPORTANTEURGENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175ValImportanteUrgente, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOININKIT", GXutil.ltrim( localUtil.ntoc( AV98ACRCOININKIT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAPRID", GXutil.ltrim( localUtil.ntoc( A328ACRCPAPRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAQTY", GXutil.ltrim( localUtil.ntoc( A329ACRCPAQTY, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAUM", GXutil.rtrim( A330ACRCPAUM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAFREQ", localUtil.dtoc( A331ACRCPAFREQ, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAUSSOL", GXutil.rtrim( A326ACRCPAUSSOL));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAQTYOC", GXutil.ltrim( localUtil.ntoc( AV60ACRCPAQTYOC, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPACNRQPDIAS", GXutil.ltrim( localUtil.ntoc( A817ACRCPACNRQPDIAS, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAOBS", A3902ACRCPAOBS);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAPRECOT", GXutil.ltrim( localUtil.ntoc( A10945ACRCPAPRECOT, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAPREPRO", GXutil.ltrim( localUtil.ntoc( A10946ACRCPAPREPRO, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vHOMOLOGADO", GXutil.rtrim( AV138Homologado));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHOMOLOGADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138Homologado, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAULPCM", GXutil.ltrim( localUtil.ntoc( AV63ACRCPAULPCM, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAQTYRC", GXutil.ltrim( localUtil.ntoc( AV61ACRCPAQTYRC, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAQTYP", GXutil.ltrim( localUtil.ntoc( AV62ACRCPAQTYP, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAVACMEST", GXutil.ltrim( localUtil.ntoc( AV64ACRCPAVACMEST, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPACNRQPDIAS", GXutil.ltrim( localUtil.ntoc( AV65ACRCPACNRQPDIAS, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPROPIETARIO", GXutil.rtrim( AV115Propietario));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPIETARIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Propietario, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV6CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNBASE", GXutil.ltrim( localUtil.ntoc( A383PMPRCNBASE, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPERT", GXutil.ltrim( localUtil.ntoc( A384PMPRCNPERT, (byte)(10), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPERTN2", GXutil.ltrim( localUtil.ntoc( A394PMPRCNPERTN2, (byte)(10), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPERTN3", GXutil.ltrim( localUtil.ntoc( A395PMPRCNPERTN3, (byte)(10), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPERTN4", GXutil.ltrim( localUtil.ntoc( A396PMPRCNPERTN4, (byte)(10), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPERTN5", GXutil.ltrim( localUtil.ntoc( A397PMPRCNPERTN5, (byte)(10), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTPRID", GXutil.rtrim( A171PMCTPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTCGCLASE", GXutil.ltrim( localUtil.ntoc( A381PMCTCGCLASE, (byte)(1), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMAGCCID", GXutil.rtrim( A379PMAGCCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTCGID", GXutil.rtrim( A348PMCTCGID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTCGDSC", GXutil.rtrim( A349PMCTCGDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCIASID", GXutil.ltrim( localUtil.ntoc( A5939CNCIASID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTDOCID", GXutil.rtrim( A20CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIDOC", GXutil.ltrim( localUtil.ntoc( A266ACRCOIDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOILIN", GXutil.ltrim( localUtil.ntoc( A267ACRCOILIN, (byte)(7), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIURG", GXutil.rtrim( A8585ACRCOIURG));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIIMP", GXutil.rtrim( A8586ACRCOIIMP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIFRE2", localUtil.dtoc( A325ACRCOIFRE2, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOININKIT", GXutil.ltrim( localUtil.ntoc( A893ACRCOININKIT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIRFINI", localUtil.dtoc( AV127ACRCOIRFINI, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIRFFIN", localUtil.dtoc( AV128ACRCOIRFFIN, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIRPER", GXutil.rtrim( AV129ACRCOIRPER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIUB4", GXutil.rtrim( A322ACRCOIUB4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIA2D", GXutil.rtrim( A1366ACRCOIA2D));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPERMITECAMBIOCTACGO", GXutil.rtrim( AV188PermiteCambioCtaCgo));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPERMITECAMBIOCTACGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188PermiteCambioCtaCgo, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIPRID", GXutil.ltrim( localUtil.ntoc( A268ACRCOIPRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR01DSC", GXutil.rtrim( A3INPR01DSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR02DSC", GXutil.rtrim( A2INPR02DSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIS001", GXutil.rtrim( A5682ACRCOIS001));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIDIAS", GXutil.ltrim( localUtil.ntoc( A6988ACRCOIDIAS, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIRFINI", localUtil.dtoc( A8447ACRCOIRFINI, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIRFFIN", localUtil.dtoc( A8448ACRCOIRFFIN, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIRPER", GXutil.rtrim( A8557ACRCOIRPER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR07ID", GXutil.rtrim( A710INPR07ID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "SUBFAMID", GXutil.rtrim( A10967SUBFAMID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "SUBFAMDSC", GXutil.rtrim( A10968SUBFAMDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vTIPOPRESUPUESTO", GXutil.rtrim( AV108TipoPresupuesto));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRESUPUESTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108TipoPresupuesto, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMTPOPID", GXutil.rtrim( A362PMTPOPID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPREST", GXutil.rtrim( A415PMCRPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPRMN", GXutil.ltrim( localUtil.ntoc( A359PMCRPRMN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPRCIA", GXutil.ltrim( localUtil.ntoc( A412PMCRPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPRPROD", GXutil.ltrim( localUtil.ntoc( A370PMCRPRPROD, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMCRPREST", GXutil.rtrim( AV146PMCRPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCRPREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146PMCRPREST, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPRQTY", GXutil.ltrim( localUtil.ntoc( A355PMCRPRQTY, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCRPRTDC", GXutil.rtrim( A351PMCRPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMVOIFDO2", localUtil.dtoc( A208ACMVOIFDO2, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMVOIDOC", GXutil.ltrim( localUtil.ntoc( A43ACMVOIDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMVOIPRID", GXutil.ltrim( localUtil.ntoc( A142ACMVOIPRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACACSGID", GXutil.rtrim( A139ACACSGID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMVOIPRE", GXutil.ltrim( localUtil.ntoc( A150ACMVOIPRE, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMVOIUB1", GXutil.rtrim( A162ACMVOIUB1));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "EXPINSPROD", GXutil.ltrim( localUtil.ntoc( A7704EXPINSPROD, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "EXPINSPROY", GXutil.rtrim( A7705EXPINSPROY));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMVOIUB1", GXutil.rtrim( AV141ACMVOIUB1));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "EXPINSCAN", GXutil.ltrim( localUtil.ntoc( A7710EXPINSCAN, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMRCKTDOC", GXutil.ltrim( localUtil.ntoc( A889PMRCKTDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMRCKTIDKIT", GXutil.ltrim( localUtil.ntoc( A890PMRCKTIDKIT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMRCKTQTYREQ", GXutil.ltrim( localUtil.ntoc( A891PMRCKTQTYREQ, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIDSC4", A756ACRCOIDSC4);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOICONSER", GXutil.rtrim( AV234ACRCOICONSER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOICONSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234ACRCOICONSER, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIALM", GXutil.rtrim( A323ACRCOIALM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIPRECOT", GXutil.ltrim( localUtil.ntoc( A10943ACRCOIPRECOT, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPRODID", GXutil.ltrim( localUtil.ntoc( A281INPRODID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR09ID", GXutil.rtrim( A712INPR09ID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PERIODOID", GXutil.rtrim( A5881PERIODOID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PERIODODSC", GXutil.rtrim( A5882PERIODODSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNPRES", GXutil.ltrim( localUtil.ntoc( A350PMPRCNPRES, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNMANIO", GXutil.ltrim( localUtil.ntoc( A6204PMPRCNMANIO, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPACRCPAFREQ", localUtil.dtoc( AV109PACRCPAFREQ, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPACRCPAFREQ", getSecureSignedToken( "", AV109PACRCPAFREQ));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNMMES", GXutil.ltrim( localUtil.ntoc( A6205PMPRCNMMES, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNMPERTN3", GXutil.rtrim( A6208PMPRCNMPERTN3));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPRCNMPERTN3", GXutil.rtrim( AV110PMPRCNMPERTN3));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMPRCNMPERTN3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110PMPRCNMPERTN3, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNMPERTN4", GXutil.rtrim( A6209PMPRCNMPERTN4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPRCNMPERTN4", GXutil.rtrim( AV111PMPRCNMPERTN4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMPRCNMPERTN4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111PMPRCNMPERTN4, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMPRCNMPRES", GXutil.ltrim( localUtil.ntoc( A6213PMPRCNMPRES, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCONTINUAR", GXutil.rtrim( AV101continuar));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vENVIARCORREO", GXutil.ltrim( localUtil.ntoc( AV70ENVIARCORREO, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vOMITIRENVIOCORREO", GXutil.rtrim( AV163OmitirEnvioCorreo));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMITIRENVIOCORREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV163OmitirEnvioCorreo, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vENVIARCORREOOC", GXutil.rtrim( AV245EnviarCorreoOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENVIARCORREOOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245EnviarCorreoOC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGENERARVALEAUTOMATICO", GXutil.rtrim( AV201generarValeAutomatico));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGENERARVALEAUTOMATICO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201generarValeAutomatico, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIQTP", GXutil.ltrim( localUtil.ntoc( A316ACRCOIQTP, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vNIVSG", GXutil.ltrim( localUtil.ntoc( AV71NIVSG, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTPRDSC", GXutil.rtrim( A172PMCTPRDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2CIA", GXutil.ltrim( localUtil.ntoc( A2505ACRCPAL2CIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2TDC", GXutil.rtrim( A2506ACRCPAL2TDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2DOC", GXutil.ltrim( localUtil.ntoc( A2507ACRCPAL2DOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2LIN", GXutil.ltrim( localUtil.ntoc( A2508ACRCPAL2LIN, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2NIV", GXutil.ltrim( localUtil.ntoc( A2509ACRCPAL2NIV, (byte)(2), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCPAL2USR", GXutil.rtrim( A2510ACRCPAL2USR));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNUSERID", GXutil.rtrim( A5940CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIREM", GXutil.rtrim( A205CNCDIREM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNUSERDSC", GXutil.rtrim( A190CNUSERDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCIASDSC", GXutil.rtrim( AV22CNCIASDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCIASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22CNCIASDSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERDSC2", GXutil.rtrim( AV93CNUSERDSC2));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR02ID", GXutil.rtrim( A279INPR02ID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPR02CMID", GXutil.ltrim( localUtil.ntoc( A886INPR02CMID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRID", GXutil.ltrim( localUtil.ntoc( A46CNCDIRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRNOM", GXutil.rtrim( A194CNCDIRNOM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vEXISTEINV", GXutil.rtrim( AV232existeInv));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIALID", GXutil.rtrim( AV214ACRCOIALID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIUSRREC", GXutil.ltrim( localUtil.ntoc( AV227ACRCOIUSRREC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGEDEVAID_REGISTRADO", GXutil.ltrim( localUtil.ntoc( AV196GEDEVAID_registrado, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGEDEVATIPO", GXutil.rtrim( AV202GEDEVATIPO));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGEDEVADIAS", GXutil.ltrim( localUtil.ntoc( AV203GEDEVADIAS, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACACTLID", GXutil.rtrim( A135ACACTLID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INTPALID", GXutil.rtrim( A1148INTPALID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INPRODCPNAC", GXutil.ltrim( localUtil.ntoc( A7804INPRODCPNAC, (byte)(18), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIALID", GXutil.rtrim( A306ACRCOIALID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIQTO", GXutil.ltrim( localUtil.ntoc( A314ACRCOIQTO, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vEXPINSTIP", GXutil.rtrim( AV206EXPINSTIP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "INUMBAID", GXutil.rtrim( A282INUMBAID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACRCOIUNGD", GXutil.rtrim( A954ACRCOIUNGD));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNTDOCDSC", GXutil.rtrim( AV195CNTDOCDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "GEDEVADOC", GXutil.rtrim( A7410GEDEVADOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "GEDEVAID", GXutil.ltrim( localUtil.ntoc( A7411GEDEVAID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "GEDEVACOD", GXutil.rtrim( A7418GEDEVACOD));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERDSC", GXutil.rtrim( AV75CNUSERDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCODIGOBARRA", GXutil.rtrim( AV199codigobarra));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vSERVIDORSMTP", GXutil.rtrim( AV221ServidorSMTP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERVIDORSMTP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221ServidorSMTP, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCORREOENVIA", GXutil.rtrim( AV223correoEnvia));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCORREOENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223correoEnvia, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCONTRASENAENVIA", GXutil.rtrim( AV224contrasenaEnvia));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTRASENAENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224contrasenaEnvia, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPUERTO", GXutil.ltrim( localUtil.ntoc( AV222puerto, (byte)(5), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPUERTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV222puerto), "ZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNESMNID", GXutil.rtrim( AV24CNESMNID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPACTCG_Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAcrcpactcg.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAQTY_Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaqty_Enabled, (byte)(5), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.kdsproyectos.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we2I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2I2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.kdsproyectos.wautreq") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24CNESMNID)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11ACRCPACIA,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17ACRCPATDC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12ACRCPADOC,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV45PMCTPRID)) ;
   }

   public String getPgmname( )
   {
      return "wautreq" ;
   }

   public String getPgmdesc( )
   {
      return "" ;
   }

   public void wb2I0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.kdsproyectos.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         wb_table1_2_2I2( true) ;
      }
      else
      {
         wb_table1_2_2I2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucKdsstylesdatatables1.render(context, "kdsstylesdatatables", Kdsstylesdatatables1_Internalname, "KDSSTYLESDATATABLES1Container");
      }
      if ( wbEnd == 83 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 16_0_1-129648", (short)(0)) ;
         Form.getMeta().addItem("description", "", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2I0( ) ;
   }

   public void ws2I2( )
   {
      start2I2( ) ;
      evt2I2( ) ;
   }

   public void evt2I2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e112I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'SALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Salir' */
                           e122I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VAUTORIZARTOD.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "'MENU'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "'ACTUALIZARCANTIDAD'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 21), "'GUARDAOBSERVACIONES'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "'ACTUALIZACTACGO'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_83_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_832( ) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
                              GX_FocusControl = edtavAcrcpalin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14ACRCPALIN = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
                           }
                           else
                           {
                              AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
                              GX_FocusControl = edtavAcrcpafreq_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV13ACRCPAFREQ = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpafreq_Internalname, localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAFREQ"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV13ACRCPAFREQ));
                           }
                           else
                           {
                              AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpafreq_Internalname, localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAFREQ"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV13ACRCPAFREQ));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
                              GX_FocusControl = edtavAcrcpaprid_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV15ACRCPAPRID = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
                           }
                           AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInprodi2_p_Internalname, AV39INPRODI2_P);
                           AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInproddsc_Internalname, AV37INPRODDSC);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vINPRODDSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV37INPRODDSC, ""))));
                           AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidsc4_Internalname, AV56ACRCOIDSC4);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDSC4"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV56ACRCOIDSC4));
                           AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaum_Internalname, AV18ACRCPAUM);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
                              GX_FocusControl = edtavAcrcpaqty_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16ACRCPAQTY = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
                           }
                           else
                           {
                              AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
                           }
                           cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
                           cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
                           AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
                           AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiobsaut_Internalname, AV8ACRCOIOBSAUT);
                           AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaobs_Internalname, AV103ACRCPAOBS);
                           cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
                           cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
                           AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
                           dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
                           dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
                           AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, dynavAcrcoiacd.getInternalname(), GXutil.ltrim( GXutil.str( AV192ACRCOIACD, 4, 0)));
                           dynavCgunngid.setName( dynavCgunngid.getInternalname() );
                           dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
                           AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri("", false, dynavCgunngid.getInternalname(), AV193CGUNNGID);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
                              GX_FocusControl = edtavAcrcoiprecot_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiprecot_Internalname, GXutil.ltrim( GXutil.str( AV231ACRCOIPRECOT, 15, 4)));
                           }
                           else
                           {
                              AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiprecot_Internalname, GXutil.ltrim( GXutil.str( AV231ACRCOIPRECOT, 15, 4)));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
                              GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV99ACRCOININKIT_AUX = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoininkit_aux_Internalname, GXutil.ltrim( GXutil.str( AV99ACRCOININKIT_AUX, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoininkit_aux_Internalname, GXutil.ltrim( GXutil.str( AV99ACRCOININKIT_AUX, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
                              GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV177auxACRCPAQTY = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAuxacrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV177auxACRCPAQTY, 17, 6)));
                           }
                           else
                           {
                              AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAuxacrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV177auxACRCPAQTY, 17, 6)));
                           }
                           AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInpr01dsc_g_Internalname, AV165INPR01DSC_G);
                           AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInpr02dsc_g_Internalname, AV166INPR02DSC_G);
                           AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInalmndsc_Internalname, AV162INALMNDSC);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
                              GX_FocusControl = edtavAcrcoidias_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV126ACRCOIDIAS = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidias_Internalname, GXutil.ltrim( GXutil.str( AV126ACRCOIDIAS, 4, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDIAS"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
                           }
                           else
                           {
                              AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidias_Internalname, GXutil.ltrim( GXutil.str( AV126ACRCOIDIAS, 4, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDIAS"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
                           }
                           AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPeriododsc_Internalname, AV125PERIODODSC);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPERIODODSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV125PERIODODSC, ""))));
                           AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSubfamdsc_Internalname, AV167subfamdsc);
                           AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavQuestion_Internalname, AV159Question);
                           AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPermite_Internalname, AV117permite);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
                              GX_FocusControl = edtavPresupuestado_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV80Presupuestado = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestado_Internalname, GXutil.ltrim( GXutil.str( AV80Presupuestado, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestado_Internalname, GXutil.ltrim( GXutil.str( AV80Presupuestado, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
                              GX_FocusControl = edtavComprometido_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV78Comprometido = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavComprometido_Internalname, GXutil.ltrim( GXutil.str( AV78Comprometido, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavComprometido_Internalname, GXutil.ltrim( GXutil.str( AV78Comprometido, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
                              GX_FocusControl = edtavDisponible_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79Disponible = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDisponible_Internalname, GXutil.ltrim( GXutil.str( AV79Disponible, 15, 2)));
                           }
                           else
                           {
                              AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDisponible_Internalname, GXutil.ltrim( GXutil.str( AV79Disponible, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
                              GX_FocusControl = edtavPresupuestadom_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV104presupuestadoM = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestadom_Internalname, GXutil.ltrim( GXutil.str( AV104presupuestadoM, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestadom_Internalname, GXutil.ltrim( GXutil.str( AV104presupuestadoM, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
                              GX_FocusControl = edtavComprometidom_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV105ComprometidoM = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavComprometidom_Internalname, GXutil.ltrim( GXutil.str( AV105ComprometidoM, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavComprometidom_Internalname, GXutil.ltrim( GXutil.str( AV105ComprometidoM, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
                              GX_FocusControl = edtavDisponiblem_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV106DisponibleM = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDisponiblem_Internalname, GXutil.ltrim( GXutil.str( AV106DisponibleM, 15, 2)));
                           }
                           else
                           {
                              AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDisponiblem_Internalname, GXutil.ltrim( GXutil.str( AV106DisponibleM, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
                              GX_FocusControl = edtavAcrcpaprepro_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprepro_Internalname, GXutil.ltrim( GXutil.str( AV143ACRCPAPREPRO, 15, 4)));
                           }
                           else
                           {
                              AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprepro_Internalname, GXutil.ltrim( GXutil.str( AV143ACRCPAPREPRO, 15, 4)));
                           }
                           AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPrecio_Internalname, AV169precio);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
                              GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59ACRCPAQTYR = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqtyr_Internalname, GXutil.ltrim( GXutil.str( AV59ACRCPAQTYR, 17, 6)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
                           }
                           else
                           {
                              AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqtyr_Internalname, GXutil.ltrim( GXutil.str( AV59ACRCPAQTYR, 17, 6)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e142I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'MENU'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Menu' */
                                 e152I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e162I2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e172I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ACTUALIZARCANTIDAD'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'ActualizarCantidad' */
                                 e182I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'GUARDAOBSERVACIONES'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'GuardaObservaciones' */
                                 e192I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ACTUALIZACTACGO'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'ActualizaCtaCgo' */
                                 e202I2 ();
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2I2( )
   {
      if ( ! com.kdsproyectos.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.kdsproyectos.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa2I2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = dynavCnciasid.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvcnciasid2I2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxdlvvcnciasid_data2I2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString("]");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("]");
   }

   public void gxvvcnciasid_html2I2( )
   {
      long gxdynajaxvalue ;
      gxdlvvcnciasid_data2I2( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavCnciasid.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavCnciasid.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 10, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvcnciasid_data2I2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( 0, 9, 0)));
      gxdynajaxctrldescr.add("Seleccione");
      /* Using cursor H002I2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H002I2_A5939CNCIASID[0], (byte)(10), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H002I2_A9CNCIASDSC[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlvvacrcoiacd2I2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxdlvvacrcoiacd_data2I2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString("]");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("]");
   }

   public void gxvvacrcoiacd_html2I2( )
   {
      long gxdynajaxvalue ;
      gxdlvvacrcoiacd_data2I2( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavAcrcoiacd.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavAcrcoiacd.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvacrcoiacd_data2I2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( 0, 9, 0)));
      gxdynajaxctrldescr.add("");
      /* Using cursor H002I3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H002I3_A16970CATCARID[0], (byte)(10), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H002I3_A16971CATCARDSC[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxdlvvcgunngid2I2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxdlvvcgunngid_data2I2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString("]");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("]");
   }

   public void gxvvcgunngid_html2I2( )
   {
      String gxdynajaxvalue ;
      gxdlvvcgunngid_data2I2( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavCgunngid.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCgunngid.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvcgunngid_data2I2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add("");
      /* Using cursor H002I4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H002I4_A93CGUNNGID[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H002I4_A336CGUNNGDSC[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxnrgrid1_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_832( ) ;
      while ( nGXsfl_83_idx <= nRC_GXsfl_83 )
      {
         sendrow_832( ) ;
         nGXsfl_83_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_idx+1)) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid1Container));
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( short AV192ACRCOIACD ,
                                  String AV193CGUNNGID ,
                                  long AV99ACRCOININKIT_AUX ,
                                  java.math.BigDecimal A272ACRCPALIN ,
                                  long A269ACRCPACIA ,
                                  long AV11ACRCPACIA ,
                                  String A270ACRCPATDC ,
                                  String AV17ACRCPATDC ,
                                  long A271ACRCPADOC ,
                                  long AV12ACRCPADOC ,
                                  String A2380ACRCPAEST ,
                                  String AV175ValImportanteUrgente ,
                                  long AV98ACRCOININKIT ,
                                  long A328ACRCPAPRID ,
                                  java.math.BigDecimal A329ACRCPAQTY ,
                                  String A330ACRCPAUM ,
                                  java.util.Date A331ACRCPAFREQ ,
                                  String A326ACRCPAUSSOL ,
                                  java.math.BigDecimal AV59ACRCPAQTYR ,
                                  java.math.BigDecimal AV60ACRCPAQTYOC ,
                                  java.math.BigDecimal A817ACRCPACNRQPDIAS ,
                                  String A3902ACRCPAOBS ,
                                  java.math.BigDecimal A10945ACRCPAPRECOT ,
                                  java.math.BigDecimal A10946ACRCPAPREPRO ,
                                  String AV138Homologado ,
                                  java.math.BigDecimal AV63ACRCPAULPCM ,
                                  java.math.BigDecimal AV61ACRCPAQTYRC ,
                                  java.math.BigDecimal AV62ACRCPAQTYP ,
                                  java.math.BigDecimal AV64ACRCPAVACMEST ,
                                  java.math.BigDecimal AV65ACRCPACNRQPDIAS ,
                                  java.util.Date AV13ACRCPAFREQ ,
                                  java.util.Date Gx_date ,
                                  long AV15ACRCPAPRID ,
                                  short AV190AutorizarTod ,
                                  String AV115Propietario ,
                                  String AV6CNUSERID ,
                                  long A383PMPRCNBASE ,
                                  java.math.BigDecimal A384PMPRCNPERT ,
                                  java.math.BigDecimal A394PMPRCNPERTN2 ,
                                  java.math.BigDecimal A395PMPRCNPERTN3 ,
                                  java.math.BigDecimal A396PMPRCNPERTN4 ,
                                  java.math.BigDecimal A397PMPRCNPERTN5 ,
                                  String A171PMCTPRID ,
                                  String AV45PMCTPRID ,
                                  byte A381PMCTCGCLASE ,
                                  String A379PMAGCCID ,
                                  String A348PMCTCGID ,
                                  String A349PMCTCGDSC ,
                                  long A5939CNCIASID ,
                                  String A20CNTDOCID ,
                                  long A266ACRCOIDOC ,
                                  int A267ACRCOILIN ,
                                  java.math.BigDecimal AV14ACRCPALIN ,
                                  String A8585ACRCOIURG ,
                                  String A8586ACRCOIIMP ,
                                  java.util.Date A325ACRCOIFRE2 ,
                                  long A893ACRCOININKIT ,
                                  short AV126ACRCOIDIAS ,
                                  java.util.Date AV127ACRCOIRFINI ,
                                  java.util.Date AV128ACRCOIRFFIN ,
                                  String AV129ACRCOIRPER ,
                                  String A322ACRCOIUB4 ,
                                  String A1366ACRCOIA2D ,
                                  String AV188PermiteCambioCtaCgo ,
                                  long A268ACRCOIPRID ,
                                  String A3INPR01DSC ,
                                  String A2INPR02DSC ,
                                  String A5682ACRCOIS001 ,
                                  short A6988ACRCOIDIAS ,
                                  java.util.Date A8447ACRCOIRFINI ,
                                  java.util.Date A8448ACRCOIRFFIN ,
                                  String A8557ACRCOIRPER ,
                                  String A710INPR07ID ,
                                  String A10967SUBFAMID ,
                                  String A10968SUBFAMDSC ,
                                  String AV108TipoPresupuesto ,
                                  java.math.BigDecimal AV78Comprometido ,
                                  java.math.BigDecimal AV105ComprometidoM ,
                                  String A362PMTPOPID ,
                                  String A415PMCRPREST ,
                                  java.math.BigDecimal A359PMCRPRMN ,
                                  java.math.BigDecimal AV80Presupuestado ,
                                  java.math.BigDecimal AV104presupuestadoM ,
                                  long A412PMCRPRCIA ,
                                  long A370PMCRPRPROD ,
                                  String AV146PMCRPREST ,
                                  java.math.BigDecimal A355PMCRPRQTY ,
                                  String A351PMCRPRTDC ,
                                  java.util.Date A208ACMVOIFDO2 ,
                                  long A43ACMVOIDOC ,
                                  long A142ACMVOIPRID ,
                                  String A139ACACSGID ,
                                  java.math.BigDecimal A150ACMVOIPRE ,
                                  String A162ACMVOIUB1 ,
                                  long A7704EXPINSPROD ,
                                  String A7705EXPINSPROY ,
                                  String AV141ACMVOIUB1 ,
                                  java.math.BigDecimal A7710EXPINSCAN ,
                                  long A889PMRCKTDOC ,
                                  long A890PMRCKTIDKIT ,
                                  java.math.BigDecimal A891PMRCKTQTYREQ ,
                                  String AV56ACRCOIDSC4 ,
                                  String A756ACRCOIDSC4 ,
                                  String AV234ACRCOICONSER ,
                                  String A323ACRCOIALM ,
                                  java.math.BigDecimal A10943ACRCOIPRECOT ,
                                  long A281INPRODID ,
                                  String A712INPR09ID ,
                                  String AV125PERIODODSC ,
                                  String A5881PERIODOID ,
                                  String A5882PERIODODSC ,
                                  String AV81ACRCPACTCG ,
                                  java.math.BigDecimal A350PMPRCNPRES ,
                                  short A6204PMPRCNMANIO ,
                                  java.util.Date AV109PACRCPAFREQ ,
                                  short A6205PMPRCNMMES ,
                                  String A6208PMPRCNMPERTN3 ,
                                  String AV110PMPRCNMPERTN3 ,
                                  String A6209PMPRCNMPERTN4 ,
                                  String AV111PMPRCNMPERTN4 ,
                                  java.math.BigDecimal A6213PMPRCNMPRES ,
                                  long AV23CNCIASID ,
                                  String AV163OmitirEnvioCorreo ,
                                  String AV245EnviarCorreoOC ,
                                  String AV201generarValeAutomatico ,
                                  String AV22CNCIASDSC ,
                                  String AV121Proyecto ,
                                  String AV120UsuarioSol ,
                                  String AV221ServidorSMTP ,
                                  String AV223correoEnvia ,
                                  String AV224contrasenaEnvia ,
                                  int AV222puerto )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf2I2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOININKIT_AUX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOININKIT_AUX", GXutil.ltrim( localUtil.ntoc( AV99ACRCOININKIT_AUX, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAQTYR", getSecureSignedToken( "", localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAQTYR", GXutil.ltrim( localUtil.ntoc( AV59ACRCPAQTYR, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAFREQ", getSecureSignedToken( "", AV13ACRCPAFREQ));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAFREQ", localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAPRID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPAPRID", GXutil.ltrim( localUtil.ntoc( AV15ACRCPAPRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOIDIAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIDIAS", GXutil.ltrim( localUtil.ntoc( AV126ACRCOIDIAS, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOMPROMETIDO", getSecureSignedToken( "", localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCOMPROMETIDO", GXutil.ltrim( localUtil.ntoc( AV78Comprometido, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOMPROMETIDOM", getSecureSignedToken( "", localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCOMPROMETIDOM", GXutil.ltrim( localUtil.ntoc( AV105ComprometidoM, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRESUPUESTADO", getSecureSignedToken( "", localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPRESUPUESTADO", GXutil.ltrim( localUtil.ntoc( AV80Presupuestado, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRESUPUESTADOM", getSecureSignedToken( "", localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPRESUPUESTADOM", GXutil.ltrim( localUtil.ntoc( AV104presupuestadoM, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOIDSC4", getSecureSignedToken( "", AV56ACRCOIDSC4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOIDSC4", AV56ACRCOIDSC4);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPERIODODSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125PERIODODSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPERIODODSC", GXutil.rtrim( AV125PERIODODSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINPRODDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37INPRODDSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vINPRODDSC", AV37INPRODDSC);
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxvvcnciasid_html2I2( ) ;
         gxvvacrcoiacd_html2I2( ) ;
         gxvvcgunngid_html2I2( ) ;
         dynload_actions( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( dynavCnciasid.getItemCount() > 0 )
      {
         AV23CNCIASID = GXutil.lval( dynavCnciasid.getValidValue(GXutil.trim( GXutil.str( AV23CNCIASID, 10, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CNCIASID", GXutil.ltrim( GXutil.str( AV23CNCIASID, 10, 0)));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavCnciasid.setValue( GXutil.trim( GXutil.str( AV23CNCIASID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCnciasid.getInternalname(), "Values", dynavCnciasid.ToJavascriptSource(), true);
      }
      if ( cmbavAutorizartod.getItemCount() > 0 )
      {
         AV190AutorizarTod = (short)(GXutil.lval( cmbavAutorizartod.getValidValue(GXutil.trim( GXutil.str( AV190AutorizarTod, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV190AutorizarTod", GXutil.ltrim( GXutil.str( AV190AutorizarTod, 4, 0)));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAutorizartod.setValue( GXutil.trim( GXutil.str( AV190AutorizarTod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAutorizartod.getInternalname(), "Values", cmbavAutorizartod.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      dynavCnciasid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCnciasid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCnciasid.getEnabled(), 5, 0)), true);
      edtavUsuariosol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsuariosol_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsuariosol_Enabled, 5, 0)), true);
      edtavProyecto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProyecto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavProyecto_Enabled, 5, 0)), true);
      edtavAcrcpacom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpacom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpacom_Enabled, 5, 0)), true);
      edtavAcrcoifdoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoifdoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoifdoc_Enabled, 5, 0)), true);
      edtavLeinalmndsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLeinalmndsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavLeinalmndsc_Enabled, 5, 0)), true);
      edtavAcrcpalin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpalin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpalin_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpafreq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpafreq_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpafreq_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaprid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaprid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaprid_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInprodi2_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInprodi2_p_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInprodi2_p_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInproddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInproddsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInproddsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoidsc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoidsc4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoidsc4_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaum_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      dynavAcrcoiacd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavAcrcoiacd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavAcrcoiacd.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
      dynavCgunngid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCgunngid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCgunngid.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoiprecot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoiprecot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoiprecot_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoininkit_aux_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoininkit_aux_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoininkit_aux_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAuxacrcpaqty_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAuxacrcpaqty_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAuxacrcpaqty_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInpr01dsc_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInpr01dsc_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInpr01dsc_g_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInpr02dsc_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInpr02dsc_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInpr02dsc_g_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInalmndsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInalmndsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInalmndsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoidias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoidias_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoidias_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPeriododsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPeriododsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPeriododsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavSubfamdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubfamdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubfamdsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavQuestion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavQuestion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavQuestion_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPermite_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPermite_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPermite_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPresupuestado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPresupuestado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPresupuestado_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavComprometido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComprometido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavComprometido_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavDisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisponible_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDisponible_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPresupuestadom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPresupuestadom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPresupuestadom_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavComprometidom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComprometidom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavComprometidom_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavDisponiblem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisponiblem_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDisponiblem_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaprepro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaprepro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaprepro_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPrecio_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaqtyr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaqtyr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaqtyr_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
   }

   public void rf2I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(83) ;
      nGXsfl_83_idx = (short)(1) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_832( ) ;
      bGXsfl_83_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "dataTable");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_832( ) ;
         e172I2 ();
         wbEnd = (short)(83) ;
         wb2I0( ) ;
      }
      bGXsfl_83_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2I2( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCPACIA", GXutil.ltrim( localUtil.ntoc( AV11ACRCPACIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALIMPORTANTEURGENTE", GXutil.rtrim( AV175ValImportanteUrgente));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALIMPORTANTEURGENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175ValImportanteUrgente, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vHOMOLOGADO", GXutil.rtrim( AV138Homologado));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHOMOLOGADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138Homologado, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAFREQ"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV13ACRCPAFREQ));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPROPIETARIO", GXutil.rtrim( AV115Propietario));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROPIETARIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Propietario, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOIDIAS"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPERMITECAMBIOCTACGO", GXutil.rtrim( AV188PermiteCambioCtaCgo));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPERMITECAMBIOCTACGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188PermiteCambioCtaCgo, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vTIPOPRESUPUESTO", GXutil.rtrim( AV108TipoPresupuesto));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRESUPUESTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108TipoPresupuesto, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOMPROMETIDO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOMPROMETIDOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRESUPUESTADO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRESUPUESTADOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMCRPREST", GXutil.rtrim( AV146PMCRPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCRPREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146PMCRPREST, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOIDSC4"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV56ACRCOIDSC4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACRCOICONSER", GXutil.rtrim( AV234ACRCOICONSER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACRCOICONSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234ACRCOICONSER, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPERIODODSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV125PERIODODSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPACRCPAFREQ", localUtil.dtoc( AV109PACRCPAFREQ, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPACRCPAFREQ", getSecureSignedToken( "", AV109PACRCPAFREQ));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPRCNMPERTN3", GXutil.rtrim( AV110PMPRCNMPERTN3));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMPRCNMPERTN3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110PMPRCNMPERTN3, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPRCNMPERTN4", GXutil.rtrim( AV111PMPRCNMPERTN4));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMPRCNMPERTN4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111PMPRCNMPERTN4, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vOMITIRENVIOCORREO", GXutil.rtrim( AV163OmitirEnvioCorreo));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMITIRENVIOCORREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV163OmitirEnvioCorreo, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vENVIARCORREOOC", GXutil.rtrim( AV245EnviarCorreoOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vENVIARCORREOOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245EnviarCorreoOC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGENERARVALEAUTOMATICO", GXutil.rtrim( AV201generarValeAutomatico));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGENERARVALEAUTOMATICO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201generarValeAutomatico, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCIASDSC", GXutil.rtrim( AV22CNCIASDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCIASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22CNCIASDSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROYECTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Proyecto, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vSERVIDORSMTP", GXutil.rtrim( AV221ServidorSMTP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERVIDORSMTP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221ServidorSMTP, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCORREOENVIA", GXutil.rtrim( AV223correoEnvia));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCORREOENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223correoEnvia, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCONTRASENAENVIA", GXutil.rtrim( AV224contrasenaEnvia));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTRASENAENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224contrasenaEnvia, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPUERTO", GXutil.ltrim( localUtil.ntoc( AV222puerto, (byte)(5), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPUERTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV222puerto), "ZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINPRODDSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV37INPRODDSC, ""))));
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup2I0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      dynavCnciasid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCnciasid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCnciasid.getEnabled(), 5, 0)), true);
      edtavUsuariosol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsuariosol_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavUsuariosol_Enabled, 5, 0)), true);
      edtavProyecto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProyecto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavProyecto_Enabled, 5, 0)), true);
      edtavAcrcpacom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpacom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpacom_Enabled, 5, 0)), true);
      edtavAcrcoifdoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoifdoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoifdoc_Enabled, 5, 0)), true);
      edtavLeinalmndsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLeinalmndsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavLeinalmndsc_Enabled, 5, 0)), true);
      edtavAcrcpalin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpalin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpalin_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpafreq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpafreq_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpafreq_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaprid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaprid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaprid_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInprodi2_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInprodi2_p_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInprodi2_p_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInproddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInproddsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInproddsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoidsc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoidsc4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoidsc4_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaum_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      dynavAcrcoiacd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavAcrcoiacd.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavAcrcoiacd.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
      dynavCgunngid.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCgunngid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCgunngid.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoiprecot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoiprecot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoiprecot_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoininkit_aux_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoininkit_aux_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoininkit_aux_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAuxacrcpaqty_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAuxacrcpaqty_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAuxacrcpaqty_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInpr01dsc_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInpr01dsc_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInpr01dsc_g_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInpr02dsc_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInpr02dsc_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInpr02dsc_g_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavInalmndsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInalmndsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInalmndsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcoidias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoidias_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcoidias_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPeriododsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPeriododsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPeriododsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavSubfamdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubfamdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubfamdsc_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavQuestion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavQuestion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavQuestion_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPermite_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPermite_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPermite_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPresupuestado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPresupuestado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPresupuestado_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavComprometido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComprometido_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavComprometido_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavDisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisponible_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDisponible_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPresupuestadom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPresupuestadom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPresupuestadom_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavComprometidom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComprometidom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavComprometidom_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavDisponiblem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisponiblem_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDisponiblem_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaprepro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaprepro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaprepro_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecio_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPrecio_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavAcrcpaqtyr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaqtyr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaqtyr_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      gxvvcnciasid_html2I2( ) ;
      gxvvacrcoiacd_html2I2( ) ;
      gxvvcgunngid_html2I2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV12ACRCPADOC = localUtil.ctol( httpContext.cgiGet( edtavAcrcpadoc_Internalname), ".", ",") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
         dynavCnciasid.setName( dynavCnciasid.getInternalname() );
         dynavCnciasid.setValue( httpContext.cgiGet( dynavCnciasid.getInternalname()) );
         AV23CNCIASID = GXutil.lval( httpContext.cgiGet( dynavCnciasid.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CNCIASID", GXutil.ltrim( GXutil.str( AV23CNCIASID, 10, 0)));
         AV120UsuarioSol = httpContext.cgiGet( edtavUsuariosol_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120UsuarioSol", AV120UsuarioSol);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
         AV121Proyecto = httpContext.cgiGet( edtavProyecto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121Proyecto", AV121Proyecto);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPROYECTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Proyecto, ""))));
         AV124ACRCPACOM = httpContext.cgiGet( edtavAcrcpacom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124ACRCPACOM", AV124ACRCPACOM);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavF1_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vF1");
            GX_FocusControl = edtavF1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29F1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29F1", localUtil.format(AV29F1, "99/99/99"));
         }
         else
         {
            AV29F1 = localUtil.ctod( httpContext.cgiGet( edtavF1_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29F1", localUtil.format(AV29F1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAcrcoifdoc_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCOIFDOC");
            GX_FocusControl = edtavAcrcoifdoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV118ACRCOIFDOC = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118ACRCOIFDOC", localUtil.format(AV118ACRCOIFDOC, "99/99/99"));
         }
         else
         {
            AV118ACRCOIFDOC = localUtil.ctod( httpContext.cgiGet( edtavAcrcoifdoc_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118ACRCOIFDOC", localUtil.format(AV118ACRCOIFDOC, "99/99/99"));
         }
         cmbavAutorizartod.setName( cmbavAutorizartod.getInternalname() );
         cmbavAutorizartod.setValue( httpContext.cgiGet( cmbavAutorizartod.getInternalname()) );
         AV190AutorizarTod = (short)(GXutil.lval( httpContext.cgiGet( cmbavAutorizartod.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV190AutorizarTod", GXutil.ltrim( GXutil.str( AV190AutorizarTod, 4, 0)));
         AV230leINALMNDSC = httpContext.cgiGet( edtavLeinalmndsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV230leINALMNDSC", AV230leINALMNDSC);
         AV233dscTrabajoRealizar = httpContext.cgiGet( edtavDsctrabajorealizar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV233dscTrabajoRealizar", AV233dscTrabajoRealizar);
         /* Read saved values. */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         AV17ACRCPATDC = httpContext.cgiGet( "vACRCPATDC") ;
         AV11ACRCPACIA = localUtil.ctol( httpContext.cgiGet( "vACRCPACIA"), ".", ",") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "wautreq" ;
         AV120UsuarioSol = httpContext.cgiGet( edtavUsuariosol_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120UsuarioSol", AV120UsuarioSol);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")) ;
         AV121Proyecto = httpContext.cgiGet( edtavProyecto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121Proyecto", AV121Proyecto);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPROYECTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Proyecto, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV121Proyecto, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GXutil.writeLogln("wautreq:[SecurityCheckFailed value for]"+"UsuarioSol:"+GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")));
            GXutil.writeLogln("wautreq:[SecurityCheckFailed value for]"+"Proyecto:"+GXutil.rtrim( localUtil.format( AV121Proyecto, "")));
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e142I2 ();
      if (returnInSub) return;
   }

   public void e142I2( )
   {
      /* Start Routine */
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Guardar", GXv_char2) ;
      wautreq_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtguardar_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtguardar_Internalname, "Caption", lblTxtguardar_Caption, true);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Regresar", GXv_char2) ;
      wautreq_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtregresar_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtregresar_Internalname, "Caption", lblTxtregresar_Caption, true);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Detalle Presupuesto", GXv_char2) ;
      wautreq_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtlista_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtlista_Internalname, "Caption", lblTxtlista_Caption, true);
      cmbavAcrcpactcg.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavAcrcpactcg.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
      AV146PMCRPREST = "AUTORIZADO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146PMCRPREST", AV146PMCRPREST);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCRPREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV146PMCRPREST, ""))));
      edtavAcrcpaqty_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcrcpaqty_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcrcpaqty_Enabled, 5, 0)), !bGXsfl_83_Refreshing);
      edtavF1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavF1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavF1_Enabled, 5, 0)), true);
      AV6CNUSERID = AV48session.getValue("CNUSERID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
      if ( GXutil.strcmp(AV6CNUSERID, "") == 0 )
      {
         callWebObject(formatLink("com.kdsproyectos.wpiniciosesion") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV115Propietario = AV48session.getValue("PropietarioReq") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Propietario", AV115Propietario);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPROPIETARIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Propietario, ""))));
      AV48session.remove("PropietarioReq");
      if ( GXutil.strcmp(AV115Propietario, "S") == 0 )
      {
      }
      else if ( GXutil.strcmp(AV115Propietario, "N") == 0 )
      {
      }
      else
      {
         AV115Propietario = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Propietario", AV115Propietario);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPROPIETARIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV115Propietario, ""))));
      }
      if ( ( AV11ACRCPACIA == 0 ) && ( GXutil.strcmp(AV17ACRCPATDC, "") == 0 ) && ( AV12ACRCPADOC == 0 ) && ( GXutil.strcmp(AV48session.getValue("PARMBANAUTTDC"), "REQ") == 0 ) )
      {
         AV11ACRCPACIA = GXutil.lval( AV48session.getValue("PARMBANAUTCIA")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
         AV12ACRCPADOC = GXutil.lval( AV48session.getValue("PARMBANAUTNDC")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
         AV17ACRCPATDC = AV48session.getValue("PARMBANAUTTDC") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
         /* Using cursor H002I5 */
         pr_default.execute(3, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A266ACRCOIDOC = H002I5_A266ACRCOIDOC[0] ;
            A20CNTDOCID = H002I5_A20CNTDOCID[0] ;
            A5939CNCIASID = H002I5_A5939CNCIASID[0] ;
            A933ACRCOIFDOC = H002I5_A933ACRCOIFDOC[0] ;
            n933ACRCOIFDOC = H002I5_n933ACRCOIFDOC[0] ;
            A311ACRCOIFREQ = H002I5_A311ACRCOIFREQ[0] ;
            n311ACRCOIFREQ = H002I5_n311ACRCOIFREQ[0] ;
            A6136ACRCOIAR = H002I5_A6136ACRCOIAR[0] ;
            n6136ACRCOIAR = H002I5_n6136ACRCOIAR[0] ;
            A6137ACRCOICST = H002I5_A6137ACRCOICST[0] ;
            n6137ACRCOICST = H002I5_n6137ACRCOICST[0] ;
            A171PMCTPRID = H002I5_A171PMCTPRID[0] ;
            n171PMCTPRID = H002I5_n171PMCTPRID[0] ;
            A932ACRCOISOL = H002I5_A932ACRCOISOL[0] ;
            n932ACRCOISOL = H002I5_n932ACRCOISOL[0] ;
            A16927ACRCOIACD = H002I5_A16927ACRCOIACD[0] ;
            n16927ACRCOIACD = H002I5_n16927ACRCOIACD[0] ;
            A954ACRCOIUNGD = H002I5_A954ACRCOIUNGD[0] ;
            n954ACRCOIUNGD = H002I5_n954ACRCOIUNGD[0] ;
            A719ACRCOICOM = H002I5_A719ACRCOICOM[0] ;
            n719ACRCOICOM = H002I5_n719ACRCOICOM[0] ;
            A306ACRCOIALID = H002I5_A306ACRCOIALID[0] ;
            n306ACRCOIALID = H002I5_n306ACRCOIALID[0] ;
            A17149ACRCOIUSRREC = H002I5_A17149ACRCOIUSRREC[0] ;
            n17149ACRCOIUSRREC = H002I5_n17149ACRCOIUSRREC[0] ;
            A312ACRCOIUSR = H002I5_A312ACRCOIUSR[0] ;
            n312ACRCOIUSR = H002I5_n312ACRCOIUSR[0] ;
            A310ACRCOIBCT = H002I5_A310ACRCOIBCT[0] ;
            n310ACRCOIBCT = H002I5_n310ACRCOIBCT[0] ;
            A18140ACRCOICONSER = H002I5_A18140ACRCOICONSER[0] ;
            n18140ACRCOICONSER = H002I5_n18140ACRCOICONSER[0] ;
            A933ACRCOIFDOC = H002I5_A933ACRCOIFDOC[0] ;
            n933ACRCOIFDOC = H002I5_n933ACRCOIFDOC[0] ;
            A311ACRCOIFREQ = H002I5_A311ACRCOIFREQ[0] ;
            n311ACRCOIFREQ = H002I5_n311ACRCOIFREQ[0] ;
            A6136ACRCOIAR = H002I5_A6136ACRCOIAR[0] ;
            n6136ACRCOIAR = H002I5_n6136ACRCOIAR[0] ;
            A6137ACRCOICST = H002I5_A6137ACRCOICST[0] ;
            n6137ACRCOICST = H002I5_n6137ACRCOICST[0] ;
            A171PMCTPRID = H002I5_A171PMCTPRID[0] ;
            n171PMCTPRID = H002I5_n171PMCTPRID[0] ;
            A932ACRCOISOL = H002I5_A932ACRCOISOL[0] ;
            n932ACRCOISOL = H002I5_n932ACRCOISOL[0] ;
            A16927ACRCOIACD = H002I5_A16927ACRCOIACD[0] ;
            n16927ACRCOIACD = H002I5_n16927ACRCOIACD[0] ;
            A719ACRCOICOM = H002I5_A719ACRCOICOM[0] ;
            n719ACRCOICOM = H002I5_n719ACRCOICOM[0] ;
            A306ACRCOIALID = H002I5_A306ACRCOIALID[0] ;
            n306ACRCOIALID = H002I5_n306ACRCOIALID[0] ;
            A17149ACRCOIUSRREC = H002I5_A17149ACRCOIUSRREC[0] ;
            n17149ACRCOIUSRREC = H002I5_n17149ACRCOIUSRREC[0] ;
            A312ACRCOIUSR = H002I5_A312ACRCOIUSR[0] ;
            n312ACRCOIUSR = H002I5_n312ACRCOIUSR[0] ;
            A310ACRCOIBCT = H002I5_A310ACRCOIBCT[0] ;
            n310ACRCOIBCT = H002I5_n310ACRCOIBCT[0] ;
            A18140ACRCOICONSER = H002I5_A18140ACRCOICONSER[0] ;
            n18140ACRCOICONSER = H002I5_n18140ACRCOICONSER[0] ;
            AV118ACRCOIFDOC = A933ACRCOIFDOC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118ACRCOIFDOC", localUtil.format(AV118ACRCOIFDOC, "99/99/99"));
            AV109PACRCPAFREQ = A311ACRCOIFREQ ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109PACRCPAFREQ", localUtil.format(AV109PACRCPAFREQ, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPACRCPAFREQ", getSecureSignedToken( "", AV109PACRCPAFREQ));
            AV110PMPRCNMPERTN3 = A6136ACRCOIAR ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110PMPRCNMPERTN3", AV110PMPRCNMPERTN3);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMPRCNMPERTN3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110PMPRCNMPERTN3, ""))));
            AV111PMPRCNMPERTN4 = A6137ACRCOICST ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111PMPRCNMPERTN4", AV111PMPRCNMPERTN4);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMPRCNMPERTN4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111PMPRCNMPERTN4, ""))));
            AV45PMCTPRID = A171PMCTPRID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
            AV119ACRCOISOL = A932ACRCOISOL ;
            AV192ACRCOIACD = A16927ACRCOIACD ;
            httpContext.ajax_rsp_assign_attri("", false, dynavAcrcoiacd.getInternalname(), GXutil.ltrim( GXutil.str( AV192ACRCOIACD, 4, 0)));
            AV193CGUNNGID = A954ACRCOIUNGD ;
            httpContext.ajax_rsp_assign_attri("", false, dynavCgunngid.getInternalname(), AV193CGUNNGID);
            GXv_char2[0] = AV120UsuarioSol ;
            new com.kdsproyectos.pcncdir(remoteHandle, context).execute( AV119ACRCOISOL, GXv_char2) ;
            wautreq_impl.this.AV120UsuarioSol = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120UsuarioSol", AV120UsuarioSol);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
            AV124ACRCPACOM = A719ACRCOICOM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124ACRCPACOM", AV124ACRCPACOM);
            AV29F1 = A311ACRCOIFREQ ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29F1", localUtil.format(AV29F1, "99/99/99"));
            AV214ACRCOIALID = A306ACRCOIALID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV214ACRCOIALID", AV214ACRCOIALID);
            GXt_char1 = AV230leINALMNDSC ;
            GXv_char2[0] = GXt_char1 ;
            new com.kdsproyectos.in0003(remoteHandle, context).execute( AV214ACRCOIALID, GXv_char2) ;
            wautreq_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV214ACRCOIALID", AV214ACRCOIALID);
            AV230leINALMNDSC = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV230leINALMNDSC", AV230leINALMNDSC);
            AV227ACRCOIUSRREC = A17149ACRCOIUSRREC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV227ACRCOIUSRREC", GXutil.ltrim( GXutil.str( AV227ACRCOIUSRREC, 10, 0)));
            AV10ACRCOIUSR = A312ACRCOIUSR ;
            AV201generarValeAutomatico = A310ACRCOIBCT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV201generarValeAutomatico", AV201generarValeAutomatico);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGENERARVALEAUTOMATICO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201generarValeAutomatico, ""))));
            AV234ACRCOICONSER = A18140ACRCOICONSER ;
            httpContext.ajax_rsp_assign_attri("", false, "AV234ACRCOICONSER", AV234ACRCOICONSER);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOICONSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234ACRCOICONSER, ""))));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      else
      {
         /* Using cursor H002I6 */
         pr_default.execute(4, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A266ACRCOIDOC = H002I6_A266ACRCOIDOC[0] ;
            A20CNTDOCID = H002I6_A20CNTDOCID[0] ;
            A5939CNCIASID = H002I6_A5939CNCIASID[0] ;
            A311ACRCOIFREQ = H002I6_A311ACRCOIFREQ[0] ;
            n311ACRCOIFREQ = H002I6_n311ACRCOIFREQ[0] ;
            A6136ACRCOIAR = H002I6_A6136ACRCOIAR[0] ;
            n6136ACRCOIAR = H002I6_n6136ACRCOIAR[0] ;
            A6137ACRCOICST = H002I6_A6137ACRCOICST[0] ;
            n6137ACRCOICST = H002I6_n6137ACRCOICST[0] ;
            A932ACRCOISOL = H002I6_A932ACRCOISOL[0] ;
            n932ACRCOISOL = H002I6_n932ACRCOISOL[0] ;
            A306ACRCOIALID = H002I6_A306ACRCOIALID[0] ;
            n306ACRCOIALID = H002I6_n306ACRCOIALID[0] ;
            A719ACRCOICOM = H002I6_A719ACRCOICOM[0] ;
            n719ACRCOICOM = H002I6_n719ACRCOICOM[0] ;
            A17149ACRCOIUSRREC = H002I6_A17149ACRCOIUSRREC[0] ;
            n17149ACRCOIUSRREC = H002I6_n17149ACRCOIUSRREC[0] ;
            A312ACRCOIUSR = H002I6_A312ACRCOIUSR[0] ;
            n312ACRCOIUSR = H002I6_n312ACRCOIUSR[0] ;
            A310ACRCOIBCT = H002I6_A310ACRCOIBCT[0] ;
            n310ACRCOIBCT = H002I6_n310ACRCOIBCT[0] ;
            A18140ACRCOICONSER = H002I6_A18140ACRCOICONSER[0] ;
            n18140ACRCOICONSER = H002I6_n18140ACRCOICONSER[0] ;
            AV109PACRCPAFREQ = A311ACRCOIFREQ ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109PACRCPAFREQ", localUtil.format(AV109PACRCPAFREQ, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPACRCPAFREQ", getSecureSignedToken( "", AV109PACRCPAFREQ));
            AV110PMPRCNMPERTN3 = A6136ACRCOIAR ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110PMPRCNMPERTN3", AV110PMPRCNMPERTN3);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMPRCNMPERTN3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110PMPRCNMPERTN3, ""))));
            AV111PMPRCNMPERTN4 = A6137ACRCOICST ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111PMPRCNMPERTN4", AV111PMPRCNMPERTN4);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMPRCNMPERTN4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111PMPRCNMPERTN4, ""))));
            AV119ACRCOISOL = A932ACRCOISOL ;
            AV214ACRCOIALID = A306ACRCOIALID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV214ACRCOIALID", AV214ACRCOIALID);
            GXt_char1 = AV230leINALMNDSC ;
            GXv_char2[0] = GXt_char1 ;
            new com.kdsproyectos.in0003(remoteHandle, context).execute( AV214ACRCOIALID, GXv_char2) ;
            wautreq_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV214ACRCOIALID", AV214ACRCOIALID);
            AV230leINALMNDSC = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV230leINALMNDSC", AV230leINALMNDSC);
            GXv_char2[0] = AV120UsuarioSol ;
            new com.kdsproyectos.pcncdir(remoteHandle, context).execute( AV119ACRCOISOL, GXv_char2) ;
            wautreq_impl.this.AV120UsuarioSol = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120UsuarioSol", AV120UsuarioSol);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vUSUARIOSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120UsuarioSol, ""))));
            AV124ACRCPACOM = A719ACRCOICOM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124ACRCPACOM", AV124ACRCPACOM);
            AV29F1 = A311ACRCOIFREQ ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29F1", localUtil.format(AV29F1, "99/99/99"));
            AV227ACRCOIUSRREC = A17149ACRCOIUSRREC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV227ACRCOIUSRREC", GXutil.ltrim( GXutil.str( AV227ACRCOIUSRREC, 10, 0)));
            AV10ACRCOIUSR = A312ACRCOIUSR ;
            AV201generarValeAutomatico = A310ACRCOIBCT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV201generarValeAutomatico", AV201generarValeAutomatico);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGENERARVALEAUTOMATICO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201generarValeAutomatico, ""))));
            AV234ACRCOICONSER = A18140ACRCOICONSER ;
            httpContext.ajax_rsp_assign_attri("", false, "AV234ACRCOICONSER", AV234ACRCOICONSER);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOICONSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234ACRCOICONSER, ""))));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      AV23CNCIASID = AV11ACRCPACIA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CNCIASID", GXutil.ltrim( GXutil.str( AV23CNCIASID, 10, 0)));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV131Usuario ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "USRAUTO", "CSM", (short)(1), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV131Usuario = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV108TipoPresupuesto ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "AUTREQ", "CSM", (short)(1), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV108TipoPresupuesto = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV108TipoPresupuesto", AV108TipoPresupuesto);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPOPRESUPUESTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108TipoPresupuesto, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV188PermiteCambioCtaCgo ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "AUTREQ", "CSM", (short)(3), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV188PermiteCambioCtaCgo = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV188PermiteCambioCtaCgo", AV188PermiteCambioCtaCgo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPERMITECAMBIOCTACGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188PermiteCambioCtaCgo, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV138Homologado ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "GRAL", "CSM", (short)(1), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV138Homologado = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV138Homologado", AV138Homologado);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vHOMOLOGADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV138Homologado, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV163OmitirEnvioCorreo ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "GRAL", "CSM", (short)(2), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV163OmitirEnvioCorreo = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV163OmitirEnvioCorreo", AV163OmitirEnvioCorreo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vOMITIRENVIOCORREO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV163OmitirEnvioCorreo, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV245EnviarCorreoOC ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "RCH", "CSM", (short)(1), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV245EnviarCorreoOC = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV245EnviarCorreoOC", AV245EnviarCorreoOC);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vENVIARCORREOOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245EnviarCorreoOC, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV175ValImportanteUrgente ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "REQUISICION", "CSM", (short)(3), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV175ValImportanteUrgente = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV175ValImportanteUrgente", AV175ValImportanteUrgente);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALIMPORTANTEURGENTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175ValImportanteUrgente, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV221ServidorSMTP ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "EMAIL", "CSM", (short)(1), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV221ServidorSMTP = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV221ServidorSMTP", AV221ServidorSMTP);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSERVIDORSMTP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221ServidorSMTP, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(AV222puerto) ;
      GXv_char2[0] = "" ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "EMAIL", "CSM", (short)(2), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV222puerto = (int)(DecimalUtil.decToDouble(GXv_decimal3[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV222puerto", GXutil.ltrim( GXutil.str( AV222puerto, 5, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPUERTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV222puerto), "ZZZZ9")));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV223correoEnvia ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "EMAIL", "CSM", (short)(3), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV223correoEnvia = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV223correoEnvia", AV223correoEnvia);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCORREOENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223correoEnvia, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV224contrasenaEnvia ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "EMAIL", "CSM", (short)(4), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV224contrasenaEnvia = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV224contrasenaEnvia", AV224contrasenaEnvia);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCONTRASENAENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224contrasenaEnvia, ""))));
      GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV225ManejarFEoNom ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV11ACRCPACIA, "KDSProyectos", "SURTIR", "CSM", (short)(2), GXv_decimal3, GXv_char2) ;
      wautreq_impl.this.AV225ManejarFEoNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      /* Using cursor H002I7 */
      pr_default.execute(5, new Object[] {new Long(AV11ACRCPACIA)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A5939CNCIASID = H002I7_A5939CNCIASID[0] ;
         A9CNCIASDSC = H002I7_A9CNCIASDSC[0] ;
         n9CNCIASDSC = H002I7_n9CNCIASDSC[0] ;
         AV22CNCIASDSC = A9CNCIASDSC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CNCIASDSC", AV22CNCIASDSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22CNCIASDSC, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      AV5CNESDSOP = "Autorización de Requisiciones" ;
      AV32img = httpContext.convertURL( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( ))) ;
      /* Execute user subroutine: 'BOTON' */
      S112 ();
      if (returnInSub) return;
      GXv_char2[0] = AV121Proyecto ;
      new com.kdsproyectos.kcon002(remoteHandle, context).execute( AV45PMCTPRID, GXv_char2) ;
      wautreq_impl.this.AV121Proyecto = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
      httpContext.ajax_rsp_assign_attri("", false, "AV121Proyecto", AV121Proyecto);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPROYECTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Proyecto, ""))));
      /* Execute user subroutine: 'AGREGAR STILOS CSS' */
      S122 ();
      if (returnInSub) return;
      GXv_char2[0] = "ESP" ;
      new com.kdsproyectos.pcntxtglort(remoteHandle, context).execute( GXv_char2, AV191PTX) ;
      lblTextblock38_Caption = AV191PTX[2-1] ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock38_Internalname, "Caption", lblTextblock38_Caption, true);
      edtavDsctrabajorealizar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDsctrabajorealizar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDsctrabajorealizar_Enabled, 5, 0)), true);
      edtavDsctrabajorealizar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDsctrabajorealizar_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDsctrabajorealizar_Visible, 5, 0)), true);
      lblTextblock32_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock32_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock32_Visible, 5, 0)), true);
      if ( GXutil.strcmp(AV234ACRCOICONSER, "S") == 0 )
      {
         edtavDsctrabajorealizar_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavDsctrabajorealizar_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDsctrabajorealizar_Visible, 5, 0)), true);
         lblTextblock32_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock32_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock32_Visible, 5, 0)), true);
      }
   }

   public void S122( )
   {
      /* 'AGREGAR STILOS CSS' Routine */
      lblTxtstyle_Caption = "<style>"+".SiUrgente{"+"				border: 2px solid black;"+"				background-color: rgb(250, 102, 102);"+"				min-width:150px;"+"				border: 2px solid black;"+"				border-radius: 10px;"+"				color: white;"+"				padding: 2px 30px;"+"				font-size: 16px;"+"				margin: 5px;"+"}"+".NoUrgente{"+"				border: 2px solid black;"+"				background-color: rgb(91, 173, 40);"+"				min-width:150px;"+"				border: 2px solid black;"+"				border-radius: 10px;"+"				color: white;"+"				padding: 2px 30px;"+"				font-size: 16px;"+"				margin: 5px;"+"}"+".SiImportante{"+"				border: 2px solid black;"+"				background-color: rgb(91, 173, 40);"+"				min-width:150px;"+"				border: 2px solid black;"+"				border-radius: 10px;"+"				color: white;"+"				padding: 2px 30px;"+"				font-size: 16px;"+"				margin: 5px;"+"}"+".NoImportante{"+"				border: 2px solid black;"+"				background-color: rgb(250, 199, 45);"+"				min-width:150px;"+"				border: 2px solid black;"+"				border-radius: 10px;"+"				color: white;"+"				padding: 2px 30px;"+"				font-size: 16px;"+"				margin: 5px;"+"}"+".TableImportante{"+"		background-color: rgb(55, 183, 20);"+"		padding: 2px;"+"		padding-left: 5px;"+"		padding-right: 5px;"+"		border-radius: 5px;"+"		margin: 1px;"+"		margin-right: 5px;"+"		min-width: 90px;"+"		margin-bottom: 3px;"+"		display: flex;"+"		flex-flow: row;"+"		justify-content: center;"+"		font-size: 10pt;"+"}"+".TableNoImportante{"+"		background-color: rgb(250, 199, 45);"+"		padding: 2px;"+"		padding-left: 5px;"+"		padding-right: 5px;"+"		border-radius: 5px;"+"		margin: 1px;"+"		margin-right: 5px;"+"		min-width: 90px;"+"		margin-bottom: 3px;"+"		display: flex;"+"		flex-flow: row;"+"		justify-content: center;"+"		font-size: 10pt;"+"}"+".TableUrgente{"+"		background-color: rgb(250, 102, 102);"+"		padding: 2px;"+"		padding-left: 5px;"+"		padding-right: 5px;"+"		border-radius: 5px;"+"		margin: 1px;"+"		min-width: 90px;"+"		margin-bottom: 3px;"+"		display: flex;"+"		flex-flow: row;"+"		justify-content: center;"+"		font-size: 10pt;"+"}"+".TableNoUrgente{"+"		background-color: rgb(55, 183, 20);"+"		padding: 2px;"+"		padding-left: 5px;"+"		padding-right: 5px;"+"		border-radius: 5px;"+"		margin: 1px;"+"		min-width: 90px;"+"		margin-bottom: 3px;"+"		display: flex;"+"		flex-flow: row;"+"		justify-content: center;"+"		font-size: 10pt;"+"}"+".card{"+"background-color: #fff;"+" border-radius: 5px;"+"padding: 10px;"+" box-shadow: 1px 1px 5px #AAA;"+" margin-right:20px;"+"margin-top:10px;"+" }"+" 		#FILEUPLOAD1Container .btn-primary, #FILEUPLOAD1Container .btn-warning {"+"		display: none;"+"	}"+"</style>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtstyle_Internalname, "Caption", lblTxtstyle_Caption, true);
   }

   public void S112( )
   {
      /* 'BOTON' Routine */
      AV49style = " <style>" + ".boton3d{" + " border:0;" + " color: #ffffff;" + "font-size: 12px;" + "font-family:sans-serif;" + "text-align: center;" + "text-decoration: none;" + "display: inline-block;" + "width:100px;" + " padding: 10px 2px;" + "background: -moz-linear-gradient(center top ,  #67C3E1 0%,  #008CBA 100%) repeat scroll 0 0 transparent;" + "background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #67C3E1), color-stop(100%, #008CBA));" + "-moz-border-radius: 5px;" + "-webkit-border-radius: 5px;" + " -moz-box-shadow: 0px 3px 0 #0E82A9;" + "-webkit-box-shadow: 0px 3px 0 #0E82A9;" + "}" + ".boton3d:hover{" + " color: #fff;" + "font-size: 12px;" + "font-family:sans-serif;" + "text-align: center;" + "text-decoration: none;" + "display: inline-block;" + "width:100px;" + " padding: 10px 2px;" + "vertical-align:middle;" + "background: -moz-linear-gradient(center top ,  #033757 0%,  #02273E 100%) repeat scroll 0 0 transparent;" + "background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #033757), color-stop(100%, #02273E));" + "-moz-border-radius: 5px;" + "-webkit-border-radius: 5px;" + " -moz-box-shadow: 0px 3px 0 #032236;" + "-webkit-box-shadow: 0px 3px 0 #032236;" + "}" + "img {" + "vertical-align:middle;" + "}" + " </style>" + "<div class=\"boton3d\" >" ;
   }

   public void e152I2( )
   {
      /* 'Menu' Routine */
      httpContext.setWebReturnParms(new Object[] {new Long(AV11ACRCPACIA),AV17ACRCPATDC,new Long(AV12ACRCPADOC),AV45PMCTPRID});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11ACRCPACIA","AV17ACRCPATDC","AV12ACRCPADOC","AV45PMCTPRID"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e162I2 ();
      if (returnInSub) return;
   }

   public void e162I2( )
   {
      /* Enter Routine */
      httpContext.doAjaxRefresh();
   }

   private void e172I2( )
   {
      /* Grid1_Load Routine */
      edtavAcrcpaqty_Enabled = 1 ;
      AV99ACRCOININKIT_AUX = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoininkit_aux_Internalname, GXutil.ltrim( GXutil.str( AV99ACRCOININKIT_AUX, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
      /* Execute user subroutine: 'COMBO CUENTA DE CARGO' */
      S132 ();
      if (returnInSub) return;
      /* Using cursor H002I8 */
      pr_default.execute(6, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2380ACRCPAEST = H002I8_A2380ACRCPAEST[0] ;
         n2380ACRCPAEST = H002I8_n2380ACRCPAEST[0] ;
         A271ACRCPADOC = H002I8_A271ACRCPADOC[0] ;
         A270ACRCPATDC = H002I8_A270ACRCPATDC[0] ;
         A269ACRCPACIA = H002I8_A269ACRCPACIA[0] ;
         A328ACRCPAPRID = H002I8_A328ACRCPAPRID[0] ;
         n328ACRCPAPRID = H002I8_n328ACRCPAPRID[0] ;
         A329ACRCPAQTY = H002I8_A329ACRCPAQTY[0] ;
         n329ACRCPAQTY = H002I8_n329ACRCPAQTY[0] ;
         A330ACRCPAUM = H002I8_A330ACRCPAUM[0] ;
         n330ACRCPAUM = H002I8_n330ACRCPAUM[0] ;
         A331ACRCPAFREQ = H002I8_A331ACRCPAFREQ[0] ;
         n331ACRCPAFREQ = H002I8_n331ACRCPAFREQ[0] ;
         A326ACRCPAUSSOL = H002I8_A326ACRCPAUSSOL[0] ;
         n326ACRCPAUSSOL = H002I8_n326ACRCPAUSSOL[0] ;
         A817ACRCPACNRQPDIAS = H002I8_A817ACRCPACNRQPDIAS[0] ;
         n817ACRCPACNRQPDIAS = H002I8_n817ACRCPACNRQPDIAS[0] ;
         A3902ACRCPAOBS = H002I8_A3902ACRCPAOBS[0] ;
         n3902ACRCPAOBS = H002I8_n3902ACRCPAOBS[0] ;
         A10945ACRCPAPRECOT = H002I8_A10945ACRCPAPRECOT[0] ;
         n10945ACRCPAPRECOT = H002I8_n10945ACRCPAPRECOT[0] ;
         A10946ACRCPAPREPRO = H002I8_A10946ACRCPAPREPRO[0] ;
         n10946ACRCPAPREPRO = H002I8_n10946ACRCPAPREPRO[0] ;
         A272ACRCPALIN = H002I8_A272ACRCPALIN[0] ;
         A326ACRCPAUSSOL = H002I8_A326ACRCPAUSSOL[0] ;
         n326ACRCPAUSSOL = H002I8_n326ACRCPAUSSOL[0] ;
         AV14ACRCPALIN = A272ACRCPALIN ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
         if ( GXutil.strcmp(AV175ValImportanteUrgente, "S") == 0 )
         {
            /* Execute user subroutine: 'OBTENCION DE IMPORTANCIA / URGENCIA' */
            S146 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
         }
         else
         {
         }
         /* Execute user subroutine: 'VALIDA KIT' */
         S156 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CUENTA DE CARGO' */
         S166 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( AV98ACRCOININKIT == 0 )
         {
            AV99ACRCOININKIT_AUX = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoininkit_aux_Internalname, GXutil.ltrim( GXutil.str( AV99ACRCOININKIT_AUX, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
            AV15ACRCPAPRID = A328ACRCPAPRID ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
            AV16ACRCPAQTY = A329ACRCPAQTY ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
            AV177auxACRCPAQTY = A329ACRCPAQTY ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAuxacrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV177auxACRCPAQTY, 17, 6)));
            AV18ACRCPAUM = A330ACRCPAUM ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaum_Internalname, AV18ACRCPAUM);
            AV13ACRCPAFREQ = A331ACRCPAFREQ ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpafreq_Internalname, localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAFREQ"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV13ACRCPAFREQ));
            /* Execute user subroutine: 'DETALLE' */
            S176 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV19ACRCPAUSSOL = A326ACRCPAUSSOL ;
            AV144G1ACRCPAQTY = A329ACRCPAQTY ;
            /* Execute user subroutine: 'RECUPERACANTIDADOCEMP' */
            S186 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV145cantSinINOC = AV59ACRCPAQTYR.subtract(AV60ACRCPAQTYOC) ;
            AV65ACRCPACNRQPDIAS = A817ACRCPACNRQPDIAS ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65ACRCPACNRQPDIAS", GXutil.ltrim( GXutil.str( AV65ACRCPACNRQPDIAS, 17, 6)));
            AV103ACRCPAOBS = A3902ACRCPAOBS ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaobs_Internalname, AV103ACRCPAOBS);
            AV156g1ACRCPAPRECOT = A10945ACRCPAPRECOT ;
            AV157g1ACRCPAPREPRO = A10946ACRCPAPREPRO ;
            AV142ACRCPAPRECOT = A10945ACRCPAPRECOT.multiply(A329ACRCPAQTY) ;
            AV143ACRCPAPREPRO = A10946ACRCPAPREPRO.multiply(A329ACRCPAQTY) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprepro_Internalname, GXutil.ltrim( GXutil.str( AV143ACRCPAPREPRO, 15, 4)));
            if ( GXutil.strcmp(AV138Homologado, "N") == 0 )
            {
               /* Execute user subroutine: 'CONSIGUE ULTIMO PRECIO CIA' */
               S196 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'CONSIGUE ULTIMO PRECIO GENERAL' */
               S206 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
            }
            /* Execute user subroutine: 'OBTENER PRESUPUESTADO' */
            S216 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            AV64ACRCPAVACMEST = A329ACRCPAQTY.multiply(AV63ACRCPAULPCM) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64ACRCPAVACMEST", GXutil.ltrim( GXutil.str( AV64ACRCPAVACMEST, 15, 2)));
            AV169precio = localUtil.format( AV64ACRCPAVACMEST, "$ ZZZ,ZZZ,ZZZ,ZZ9.99") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPrecio_Internalname, AV169precio);
         }
         else
         {
            if ( AV99ACRCOININKIT_AUX != AV98ACRCOININKIT )
            {
               /* Execute user subroutine: 'REVISA KIT GRID1' */
               S226 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
               AV13ACRCPAFREQ = A331ACRCPAFREQ ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpafreq_Internalname, localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAFREQ"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV13ACRCPAFREQ));
               /* Execute user subroutine: 'DETALLE' */
               S176 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqtyr_Internalname, GXutil.ltrim( GXutil.str( AV59ACRCPAQTYR, 17, 6)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
               AV60ACRCPAQTYOC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60ACRCPAQTYOC", GXutil.ltrim( GXutil.str( AV60ACRCPAQTYOC, 17, 6)));
               AV61ACRCPAQTYRC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61ACRCPAQTYRC", GXutil.ltrim( GXutil.str( AV61ACRCPAQTYRC, 17, 6)));
               AV62ACRCPAQTYP = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62ACRCPAQTYP", GXutil.ltrim( GXutil.str( AV62ACRCPAQTYP, 17, 6)));
               AV63ACRCPAULPCM = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63ACRCPAULPCM", GXutil.ltrim( GXutil.str( AV63ACRCPAULPCM, 15, 2)));
               AV64ACRCPAVACMEST = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64ACRCPAVACMEST", GXutil.ltrim( GXutil.str( AV64ACRCPAVACMEST, 15, 2)));
               AV169precio = "0" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrecio_Internalname, AV169precio);
               AV65ACRCPACNRQPDIAS = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65ACRCPACNRQPDIAS", GXutil.ltrim( GXutil.str( AV65ACRCPACNRQPDIAS, 17, 6)));
            }
         }
         AV160Guardar = "<i class=\"KDSButton\">save</i>" ;
         AV159Question = "<i class=\"KDSButton\">question_answer</i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavQuestion_Internalname, AV159Question);
         AV158Renovar = "<i class=\"KDSButton\">autorenew</i>" ;
         AV189Renovar1 = "<i class=\"KDSButton\">autorenew</i>" ;
         AV41num = (short)(GXutil.ddiff(AV13ACRCPAFREQ,Gx_date)) ;
         GXv_char2[0] = AV39INPRODI2_P ;
         GXv_char4[0] = AV37INPRODDSC ;
         new com.kdsproyectos.pinprod(remoteHandle, context).execute( AV15ACRCPAPRID, GXv_char2, GXv_char4) ;
         wautreq_impl.this.AV39INPRODI2_P = GXv_char2[0] ;
         wautreq_impl.this.AV37INPRODDSC = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavInprodi2_p_Internalname, AV39INPRODI2_P);
         httpContext.ajax_rsp_assign_attri("", false, edtavInproddsc_Internalname, AV37INPRODDSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vINPRODDSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV37INPRODDSC, ""))));
         /* Execute user subroutine: 'RECUPERA ACRCOIDSC4' */
         S236 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( AV41num > 0 )
         {
            AV26color = "#01A9DB" ;
         }
         else
         {
            AV26color = "#DF0101" ;
         }
         if ( AV190AutorizarTod != 0 )
         {
            AV20Autorizar = (byte)(AV190AutorizarTod) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
         }
         if ( GXutil.strcmp(AV115Propietario, "S") == 0 )
         {
            AV68visible = (short)(1) ;
         }
         else
         {
            GXv_int5[0] = AV68visible ;
            new com.kdsproyectos.previsanivelesreq(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, (long)(DecimalUtil.decToDouble(AV14ACRCPALIN)), AV6CNUSERID, GXv_int5) ;
            wautreq_impl.this.AV68visible = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
            httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
            httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
         }
         /* Execute user subroutine: 'CHECAPERMITE' */
         S246 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( AV68visible == 1 )
         {
            if ( AV98ACRCOININKIT == 0 )
            {
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(83) ;
               }
               sendrow_832( ) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_83_Refreshing )
               {
                  httpContext.doAjaxLoad(83, Grid1Row);
               }
            }
            else
            {
               if ( AV99ACRCOININKIT_AUX != AV98ACRCOININKIT )
               {
                  AV99ACRCOININKIT_AUX = AV98ACRCOININKIT ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoininkit_aux_Internalname, GXutil.ltrim( GXutil.str( AV99ACRCOININKIT_AUX, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOININKIT_AUX"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")));
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(83) ;
                  }
                  sendrow_832( ) ;
                  if ( isFullAjaxMode( ) && ! bGXsfl_83_Refreshing )
                  {
                     httpContext.doAjaxLoad(83, Grid1Row);
                  }
               }
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /*  Sending Event outputs  */
      cmbavAutorizar.setValue( GXutil.trim( GXutil.str( AV20Autorizar, 1, 0)) );
      cmbavAcrcpactcg.setValue( GXutil.rtrim( AV81ACRCPACTCG) );
   }

   public void e112I2( )
   {
      /* 'Confirmar' Routine */
      AV53FLAG = (short)(0) ;
      /* Execute user subroutine: 'VALIDALINEAS' */
      S252 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV101continuar, "S") == 0 )
      {
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         nGXsfl_83_fel_idx = (short)(0) ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
               GX_FocusControl = edtavAcrcpalin_Internalname ;
               wbErr = true ;
               AV14ACRCPALIN = DecimalUtil.ZERO ;
            }
            else
            {
               AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
               GX_FocusControl = edtavAcrcpafreq_Internalname ;
               wbErr = true ;
               AV13ACRCPAFREQ = GXutil.nullDate() ;
            }
            else
            {
               AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
               GX_FocusControl = edtavAcrcpaprid_Internalname ;
               wbErr = true ;
               AV15ACRCPAPRID = 0 ;
            }
            else
            {
               AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
            }
            AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
            AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
            AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
            AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
               GX_FocusControl = edtavAcrcpaqty_Internalname ;
               wbErr = true ;
               AV16ACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
            }
            cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
            cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
            AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
            AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
            AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
            cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
            cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
            AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
            dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
            dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
            dynavCgunngid.setName( dynavCgunngid.getInternalname() );
            dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
            AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
               GX_FocusControl = edtavAcrcoiprecot_Internalname ;
               wbErr = true ;
               AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
               GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
               wbErr = true ;
               AV99ACRCOININKIT_AUX = 0 ;
            }
            else
            {
               AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
               GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
               wbErr = true ;
               AV177auxACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
            }
            AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
            AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
            AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
               GX_FocusControl = edtavAcrcoidias_Internalname ;
               wbErr = true ;
               AV126ACRCOIDIAS = (short)(0) ;
            }
            else
            {
               AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
            }
            AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
            AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
            AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
            AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
               GX_FocusControl = edtavPresupuestado_Internalname ;
               wbErr = true ;
               AV80Presupuestado = DecimalUtil.ZERO ;
            }
            else
            {
               AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
               GX_FocusControl = edtavComprometido_Internalname ;
               wbErr = true ;
               AV78Comprometido = DecimalUtil.ZERO ;
            }
            else
            {
               AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               wbErr = true ;
               AV79Disponible = DecimalUtil.ZERO ;
            }
            else
            {
               AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
               GX_FocusControl = edtavPresupuestadom_Internalname ;
               wbErr = true ;
               AV104presupuestadoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
               GX_FocusControl = edtavComprometidom_Internalname ;
               wbErr = true ;
               AV105ComprometidoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
               GX_FocusControl = edtavDisponiblem_Internalname ;
               wbErr = true ;
               AV106DisponibleM = DecimalUtil.ZERO ;
            }
            else
            {
               AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
               GX_FocusControl = edtavAcrcpaprepro_Internalname ;
               wbErr = true ;
               AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
            }
            else
            {
               AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
            }
            AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
               GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
               wbErr = true ;
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
            }
            else
            {
               AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
            }
            if ( AV20Autorizar != 0 )
            {
               if ( ( AV20Autorizar == 2 ) && ( ( GXutil.strcmp(AV8ACRCOIOBSAUT, "") == 0 ) && ( AV190AutorizarTod == 0 ) ) )
               {
                  edtavAcrcoiobsaut_Backcolor = GXutil.getColor( 255, 138, 138) ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoiobsaut_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavAcrcoiobsaut_Backcolor, 9, 0)), !bGXsfl_83_Refreshing);
                  Gx_msg = "La línea " + GXutil.trim( GXutil.str( AV14ACRCPALIN, 7, 3)) + " a cancelar no cuenta con algún comentario, verifique." ;
                  this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",Gx_msg});
               }
               else
               {
                  if ( AV99ACRCOININKIT_AUX == 0 )
                  {
                     AV176cadena = "Documento: " + GXutil.trim( GXutil.str( AV11ACRCPACIA, 10, 0)) + "-" + GXutil.trim( AV17ACRCPATDC) + "-" + GXutil.trim( GXutil.str( AV12ACRCPADOC, 10, 0)) + ", lin: " + GXutil.trim( GXutil.str( AV14ACRCPALIN, 7, 3)) + ", Usuario: " + GXutil.trim( AV6CNUSERID) + ", Cantidad: " + GXutil.trim( GXutil.str( AV16ACRCPAQTY, 17, 6)) ;
                     new com.kdsproyectos.generatxt(remoteHandle, context).execute( "AutorizaREQWEB", AV176cadena) ;
                     if ( GXutil.strcmp(AV115Propietario, "S") == 0 )
                     {
                        GXv_int5[0] = AV70ENVIARCORREO ;
                        GXv_int6[0] = AV71NIVSG ;
                        new com.kdsproyectos.pautorizareqown(remoteHandle, context).execute( AV6CNUSERID, AV12ACRCPADOC, AV11ACRCPACIA, AV17ACRCPATDC, AV14ACRCPALIN, AV20Autorizar, AV8ACRCOIOBSAUT, AV45PMCTPRID, AV15ACRCPAPRID, AV16ACRCPAQTY, GXv_int5, GXv_int6) ;
                        wautreq_impl.this.AV70ENVIARCORREO = GXv_int5[0] ;
                        wautreq_impl.this.AV71NIVSG = GXv_int6[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
                        httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
                        httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiobsaut_Internalname, AV8ACRCOIOBSAUT);
                        httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_fel_idx, getSecureSignedToken( sGXsfl_83_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV70ENVIARCORREO", GXutil.ltrim( GXutil.str( AV70ENVIARCORREO, 4, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV71NIVSG", GXutil.ltrim( GXutil.str( AV71NIVSG, 4, 0)));
                     }
                     else
                     {
                        GXv_int6[0] = AV70ENVIARCORREO ;
                        GXv_int5[0] = AV71NIVSG ;
                        new com.kdsproyectos.pautorizareq(remoteHandle, context).execute( AV6CNUSERID, AV12ACRCPADOC, AV11ACRCPACIA, AV17ACRCPATDC, AV14ACRCPALIN, AV20Autorizar, AV8ACRCOIOBSAUT, AV45PMCTPRID, AV15ACRCPAPRID, AV16ACRCPAQTY, GXv_int6, GXv_int5) ;
                        wautreq_impl.this.AV70ENVIARCORREO = GXv_int6[0] ;
                        wautreq_impl.this.AV71NIVSG = GXv_int5[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
                        httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
                        httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiobsaut_Internalname, AV8ACRCOIOBSAUT);
                        httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_fel_idx, getSecureSignedToken( sGXsfl_83_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV70ENVIARCORREO", GXutil.ltrim( GXutil.str( AV70ENVIARCORREO, 4, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV71NIVSG", GXutil.ltrim( GXutil.str( AV71NIVSG, 4, 0)));
                     }
                  }
                  else
                  {
                     /* Execute user subroutine: 'AUTORIZAREQKIT' */
                     S262 ();
                     if (returnInSub) return;
                  }
               }
            }
            if ( AV70ENVIARCORREO == 1 )
            {
               AV53FLAG = (short)(1) ;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = (short)(1) ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = (short)(1) ;
         if ( AV20Autorizar == 2 )
         {
            new com.kdsproyectos.acrcoi06(remoteHandle, context).execute( AV12ACRCPADOC, AV11ACRCPACIA, AV17ACRCPATDC) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
         }
         if ( GXutil.strcmp(AV163OmitirEnvioCorreo, "S") != 0 )
         {
            /* Execute user subroutine: 'ENVIA CORREO SIGUIENTE NIVEL' */
            S272 ();
            if (returnInSub) return;
         }
         if ( GXutil.strcmp(AV245EnviarCorreoOC, "S") == 0 )
         {
            /* Execute user subroutine: 'ENVIARCORREOOC' */
            S282 ();
            if (returnInSub) return;
         }
         if ( ( AV20Autorizar != 0 ) && ( AV53FLAG == 1 ) )
         {
            if ( GXutil.strcmp(AV163OmitirEnvioCorreo, "S") != 0 )
            {
               new com.kdsproyectos.penviacorreorequi(remoteHandle, context).execute( AV6CNUSERID, AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV20Autorizar) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
               httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
               httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
               httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
            }
            if ( GXutil.strcmp(AV201generarValeAutomatico, "S") == 0 )
            {
               /* Execute user subroutine: 'CIERRA VALE' */
               S292 ();
               if (returnInSub) return;
            }
         }
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Proceso realizado exitosamente."});
         gxgrgrid1_refresh( AV192ACRCOIACD, AV193CGUNNGID, AV99ACRCOININKIT_AUX, A272ACRCPALIN, A269ACRCPACIA, AV11ACRCPACIA, A270ACRCPATDC, AV17ACRCPATDC, A271ACRCPADOC, AV12ACRCPADOC, A2380ACRCPAEST, AV175ValImportanteUrgente, AV98ACRCOININKIT, A328ACRCPAPRID, A329ACRCPAQTY, A330ACRCPAUM, A331ACRCPAFREQ, A326ACRCPAUSSOL, AV59ACRCPAQTYR, AV60ACRCPAQTYOC, A817ACRCPACNRQPDIAS, A3902ACRCPAOBS, A10945ACRCPAPRECOT, A10946ACRCPAPREPRO, AV138Homologado, AV63ACRCPAULPCM, AV61ACRCPAQTYRC, AV62ACRCPAQTYP, AV64ACRCPAVACMEST, AV65ACRCPACNRQPDIAS, AV13ACRCPAFREQ, Gx_date, AV15ACRCPAPRID, AV190AutorizarTod, AV115Propietario, AV6CNUSERID, A383PMPRCNBASE, A384PMPRCNPERT, A394PMPRCNPERTN2, A395PMPRCNPERTN3, A396PMPRCNPERTN4, A397PMPRCNPERTN5, A171PMCTPRID, AV45PMCTPRID, A381PMCTCGCLASE, A379PMAGCCID, A348PMCTCGID, A349PMCTCGDSC, A5939CNCIASID, A20CNTDOCID, A266ACRCOIDOC, A267ACRCOILIN, AV14ACRCPALIN, A8585ACRCOIURG, A8586ACRCOIIMP, A325ACRCOIFRE2, A893ACRCOININKIT, AV126ACRCOIDIAS, AV127ACRCOIRFINI, AV128ACRCOIRFFIN, AV129ACRCOIRPER, A322ACRCOIUB4, A1366ACRCOIA2D, AV188PermiteCambioCtaCgo, A268ACRCOIPRID, A3INPR01DSC, A2INPR02DSC, A5682ACRCOIS001, A6988ACRCOIDIAS, A8447ACRCOIRFINI, A8448ACRCOIRFFIN, A8557ACRCOIRPER, A710INPR07ID, A10967SUBFAMID, A10968SUBFAMDSC, AV108TipoPresupuesto, AV78Comprometido, AV105ComprometidoM, A362PMTPOPID, A415PMCRPREST, A359PMCRPRMN, AV80Presupuestado, AV104presupuestadoM, A412PMCRPRCIA, A370PMCRPRPROD, AV146PMCRPREST, A355PMCRPRQTY, A351PMCRPRTDC, A208ACMVOIFDO2, A43ACMVOIDOC, A142ACMVOIPRID, A139ACACSGID, A150ACMVOIPRE, A162ACMVOIUB1, A7704EXPINSPROD, A7705EXPINSPROY, AV141ACMVOIUB1, A7710EXPINSCAN, A889PMRCKTDOC, A890PMRCKTIDKIT, A891PMRCKTQTYREQ, AV56ACRCOIDSC4, A756ACRCOIDSC4, AV234ACRCOICONSER, A323ACRCOIALM, A10943ACRCOIPRECOT, A281INPRODID, A712INPR09ID, AV125PERIODODSC, A5881PERIODOID, A5882PERIODODSC, AV81ACRCPACTCG, A350PMPRCNPRES, A6204PMPRCNMANIO, AV109PACRCPAFREQ, A6205PMPRCNMMES, A6208PMPRCNMPERTN3, AV110PMPRCNMPERTN3, A6209PMPRCNMPERTN4, AV111PMPRCNMPERTN4, A6213PMPRCNMPRES, AV23CNCIASID, AV163OmitirEnvioCorreo, AV245EnviarCorreoOC, AV201generarValeAutomatico, AV22CNCIASDSC, AV121Proyecto, AV120UsuarioSol, AV221ServidorSMTP, AV223correoEnvia, AV224contrasenaEnvia, AV222puerto) ;
         AV48session.setValue("Salir", "S");
         httpContext.setWebReturnParms(new Object[] {new Long(AV11ACRCPACIA),AV17ACRCPATDC,new Long(AV12ACRCPADOC),AV45PMCTPRID});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV11ACRCPACIA","AV17ACRCPATDC","AV12ACRCPADOC","AV45PMCTPRID"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e132I2( )
   {
      /* Autorizartod_Click Routine */
      gxgrgrid1_refresh( AV192ACRCOIACD, AV193CGUNNGID, AV99ACRCOININKIT_AUX, A272ACRCPALIN, A269ACRCPACIA, AV11ACRCPACIA, A270ACRCPATDC, AV17ACRCPATDC, A271ACRCPADOC, AV12ACRCPADOC, A2380ACRCPAEST, AV175ValImportanteUrgente, AV98ACRCOININKIT, A328ACRCPAPRID, A329ACRCPAQTY, A330ACRCPAUM, A331ACRCPAFREQ, A326ACRCPAUSSOL, AV59ACRCPAQTYR, AV60ACRCPAQTYOC, A817ACRCPACNRQPDIAS, A3902ACRCPAOBS, A10945ACRCPAPRECOT, A10946ACRCPAPREPRO, AV138Homologado, AV63ACRCPAULPCM, AV61ACRCPAQTYRC, AV62ACRCPAQTYP, AV64ACRCPAVACMEST, AV65ACRCPACNRQPDIAS, AV13ACRCPAFREQ, Gx_date, AV15ACRCPAPRID, AV190AutorizarTod, AV115Propietario, AV6CNUSERID, A383PMPRCNBASE, A384PMPRCNPERT, A394PMPRCNPERTN2, A395PMPRCNPERTN3, A396PMPRCNPERTN4, A397PMPRCNPERTN5, A171PMCTPRID, AV45PMCTPRID, A381PMCTCGCLASE, A379PMAGCCID, A348PMCTCGID, A349PMCTCGDSC, A5939CNCIASID, A20CNTDOCID, A266ACRCOIDOC, A267ACRCOILIN, AV14ACRCPALIN, A8585ACRCOIURG, A8586ACRCOIIMP, A325ACRCOIFRE2, A893ACRCOININKIT, AV126ACRCOIDIAS, AV127ACRCOIRFINI, AV128ACRCOIRFFIN, AV129ACRCOIRPER, A322ACRCOIUB4, A1366ACRCOIA2D, AV188PermiteCambioCtaCgo, A268ACRCOIPRID, A3INPR01DSC, A2INPR02DSC, A5682ACRCOIS001, A6988ACRCOIDIAS, A8447ACRCOIRFINI, A8448ACRCOIRFFIN, A8557ACRCOIRPER, A710INPR07ID, A10967SUBFAMID, A10968SUBFAMDSC, AV108TipoPresupuesto, AV78Comprometido, AV105ComprometidoM, A362PMTPOPID, A415PMCRPREST, A359PMCRPRMN, AV80Presupuestado, AV104presupuestadoM, A412PMCRPRCIA, A370PMCRPRPROD, AV146PMCRPREST, A355PMCRPRQTY, A351PMCRPRTDC, A208ACMVOIFDO2, A43ACMVOIDOC, A142ACMVOIPRID, A139ACACSGID, A150ACMVOIPRE, A162ACMVOIUB1, A7704EXPINSPROD, A7705EXPINSPROY, AV141ACMVOIUB1, A7710EXPINSCAN, A889PMRCKTDOC, A890PMRCKTIDKIT, A891PMRCKTQTYREQ, AV56ACRCOIDSC4, A756ACRCOIDSC4, AV234ACRCOICONSER, A323ACRCOIALM, A10943ACRCOIPRECOT, A281INPRODID, A712INPR09ID, AV125PERIODODSC, A5881PERIODOID, A5882PERIODODSC, AV81ACRCPACTCG, A350PMPRCNPRES, A6204PMPRCNMANIO, AV109PACRCPAFREQ, A6205PMPRCNMMES, A6208PMPRCNMPERTN3, AV110PMPRCNMPERTN3, A6209PMPRCNMPERTN4, AV111PMPRCNMPERTN4, A6213PMPRCNMPRES, AV23CNCIASID, AV163OmitirEnvioCorreo, AV245EnviarCorreoOC, AV201generarValeAutomatico, AV22CNCIASDSC, AV121Proyecto, AV120UsuarioSol, AV221ServidorSMTP, AV223correoEnvia, AV224contrasenaEnvia, AV222puerto) ;
   }

   public void S176( )
   {
      /* 'DETALLE' Routine */
      AV67SCRIPT = "<style>" + "div {" + "font-size: 12px;" + "color:#08298A;" + "}" + "</style>" + "<body>" + "<div> &#9673; </div>" ;
      AV66SCRIPT2 = "<style>" + ".red {" + "font-size: 12px;" + "color:#FF0000;" + "}" + "</style>" + "<body>" + "<div class=\"red\"> &#9673; </div>" ;
   }

   public void S166( )
   {
      /* 'CUENTA DE CARGO' Routine */
      AV126ACRCOIDIAS = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidias_Internalname, GXutil.ltrim( GXutil.str( AV126ACRCOIDIAS, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDIAS"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
      AV127ACRCOIRFINI = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127ACRCOIRFINI", localUtil.format(AV127ACRCOIRFINI, "99/99/99"));
      AV128ACRCOIRFFIN = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128ACRCOIRFFIN", localUtil.format(AV128ACRCOIRFFIN, "99/99/99"));
      AV129ACRCOIRPER = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129ACRCOIRPER", AV129ACRCOIRPER);
      /* Using cursor H002I9 */
      pr_default.execute(7, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV14ACRCPALIN});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A281INPRODID = H002I9_A281INPRODID[0] ;
         A1INPR01ID = H002I9_A1INPR01ID[0] ;
         n1INPR01ID = H002I9_n1INPR01ID[0] ;
         A279INPR02ID = H002I9_A279INPR02ID[0] ;
         n279INPR02ID = H002I9_n279INPR02ID[0] ;
         A710INPR07ID = H002I9_A710INPR07ID[0] ;
         n710INPR07ID = H002I9_n710INPR07ID[0] ;
         A267ACRCOILIN = H002I9_A267ACRCOILIN[0] ;
         A266ACRCOIDOC = H002I9_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I9_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I9_A5939CNCIASID[0] ;
         A322ACRCOIUB4 = H002I9_A322ACRCOIUB4[0] ;
         n322ACRCOIUB4 = H002I9_n322ACRCOIUB4[0] ;
         A1366ACRCOIA2D = H002I9_A1366ACRCOIA2D[0] ;
         n1366ACRCOIA2D = H002I9_n1366ACRCOIA2D[0] ;
         A268ACRCOIPRID = H002I9_A268ACRCOIPRID[0] ;
         n268ACRCOIPRID = H002I9_n268ACRCOIPRID[0] ;
         A5682ACRCOIS001 = H002I9_A5682ACRCOIS001[0] ;
         n5682ACRCOIS001 = H002I9_n5682ACRCOIS001[0] ;
         A6988ACRCOIDIAS = H002I9_A6988ACRCOIDIAS[0] ;
         n6988ACRCOIDIAS = H002I9_n6988ACRCOIDIAS[0] ;
         A8447ACRCOIRFINI = H002I9_A8447ACRCOIRFINI[0] ;
         n8447ACRCOIRFINI = H002I9_n8447ACRCOIRFINI[0] ;
         A8448ACRCOIRFFIN = H002I9_A8448ACRCOIRFFIN[0] ;
         n8448ACRCOIRFFIN = H002I9_n8448ACRCOIRFFIN[0] ;
         A8557ACRCOIRPER = H002I9_A8557ACRCOIRPER[0] ;
         n8557ACRCOIRPER = H002I9_n8557ACRCOIRPER[0] ;
         AV81ACRCPACTCG = A322ACRCOIUB4 ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
         if ( GXutil.strcmp(A1366ACRCOIA2D, "S") == 0 )
         {
            AV42PMCTCGDSC = "Provee el CLiente" ;
         }
         else
         {
            GXt_char1 = AV42PMCTCGDSC ;
            GXv_char4[0] = GXt_char1 ;
            new com.kdsproyectos.pmctcg03(remoteHandle, context).execute( AV81ACRCPACTCG, GXv_char4) ;
            wautreq_impl.this.GXt_char1 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
            AV42PMCTCGDSC = GXt_char1 ;
            if ( GXutil.strcmp(AV188PermiteCambioCtaCgo, "S") == 0 )
            {
               cmbavAcrcpactcg.setEnabled( 1 );
               httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavAcrcpactcg.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
            }
            else
            {
               cmbavAcrcpactcg.setEnabled( 0 );
               httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavAcrcpactcg.getEnabled(), 5, 0)), !bGXsfl_83_Refreshing);
            }
         }
         AV170acrcoiprid = A268ACRCOIPRID ;
         AV165INPR01DSC_G = A3INPR01DSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInpr01dsc_g_Internalname, AV165INPR01DSC_G);
         AV166INPR02DSC_G = A2INPR02DSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInpr02dsc_g_Internalname, AV166INPR02DSC_G);
         AV168ACRCOIS001 = A5682ACRCOIS001 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV168ACRCOIS001", AV168ACRCOIS001);
         AV126ACRCOIDIAS = A6988ACRCOIDIAS ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidias_Internalname, GXutil.ltrim( GXutil.str( AV126ACRCOIDIAS, 4, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDIAS"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")));
         AV127ACRCOIRFINI = A8447ACRCOIRFINI ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127ACRCOIRFINI", localUtil.format(AV127ACRCOIRFINI, "99/99/99"));
         AV128ACRCOIRFFIN = A8448ACRCOIRFFIN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128ACRCOIRFFIN", localUtil.format(AV128ACRCOIRFFIN, "99/99/99"));
         AV129ACRCOIRPER = A8557ACRCOIRPER ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129ACRCOIRPER", AV129ACRCOIRPER);
         if ( GXutil.strcmp(A710INPR07ID, "AF") == 0 )
         {
            AV206EXPINSTIP = "EQH" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV206EXPINSTIP", AV206EXPINSTIP);
         }
         else
         {
            AV206EXPINSTIP = "CON" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV206EXPINSTIP", AV206EXPINSTIP);
         }
         AV165INPR01DSC_G = A3INPR01DSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInpr01dsc_g_Internalname, AV165INPR01DSC_G);
         AV166INPR02DSC_G = A2INPR02DSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInpr02dsc_g_Internalname, AV166INPR02DSC_G);
         /* Execute user subroutine: 'PERIODO' */
         S307 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            returnInSub = true;
            if (true) return;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      AV165INPR01DSC_G = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavInpr01dsc_g_Internalname, AV165INPR01DSC_G);
      AV166INPR02DSC_G = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavInpr02dsc_g_Internalname, AV166INPR02DSC_G);
      AV256GXLvl621 = (byte)(0) ;
      /* Using cursor H002I10 */
      pr_default.execute(8, new Object[] {AV168ACRCOIS001});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A10967SUBFAMID = H002I10_A10967SUBFAMID[0] ;
         A10968SUBFAMDSC = H002I10_A10968SUBFAMDSC[0] ;
         n10968SUBFAMDSC = H002I10_n10968SUBFAMDSC[0] ;
         AV256GXLvl621 = (byte)(1) ;
         AV167subfamdsc = A10968SUBFAMDSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSubfamdsc_Internalname, AV167subfamdsc);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      if ( AV256GXLvl621 == 0 )
      {
         AV167subfamdsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSubfamdsc_Internalname, AV167subfamdsc);
      }
      if ( GXutil.strcmp(AV108TipoPresupuesto, "Ambos") == 0 )
      {
         /* Execute user subroutine: 'PRESUPUESTADOGRAL' */
         S312 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'PRESUPUESTADOMENSUAL' */
         S322 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV108TipoPresupuesto, "Mensual") == 0 )
      {
         /* Execute user subroutine: 'PRESUPUESTADOMENSUAL' */
         S322 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV108TipoPresupuesto, "General") == 0 )
      {
         /* Execute user subroutine: 'PRESUPUESTADOGRAL' */
         S312 ();
         if (returnInSub) return;
      }
      else
      {
      }
      AV83Comprometido1 = DecimalUtil.doubleToDec(0) ;
      AV78Comprometido = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavComprometido_Internalname, GXutil.ltrim( GXutil.str( AV78Comprometido, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      AV105ComprometidoM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavComprometidom_Internalname, GXutil.ltrim( GXutil.str( AV105ComprometidoM, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      /* Optimized group. */
      /* Using cursor H002I11 */
      pr_default.execute(9, new Object[] {AV45PMCTPRID, AV81ACRCPACTCG});
      c359PMCRPRMN = H002I11_A359PMCRPRMN[0] ;
      n359PMCRPRMN = H002I11_n359PMCRPRMN[0] ;
      c359PMCRPRMN = H002I11_A359PMCRPRMN[0] ;
      n359PMCRPRMN = H002I11_n359PMCRPRMN[0] ;
      pr_default.close(9);
      AV78Comprometido = AV78Comprometido.add(c359PMCRPRMN) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavComprometido_Internalname, GXutil.ltrim( GXutil.str( AV78Comprometido, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      AV105ComprometidoM = AV105ComprometidoM.add(c359PMCRPRMN) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavComprometidom_Internalname, GXutil.ltrim( GXutil.str( AV105ComprometidoM, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCOMPROMETIDOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      /* End optimized group. */
      AV79Disponible = AV80Presupuestado.subtract(AV78Comprometido) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDisponible_Internalname, GXutil.ltrim( GXutil.str( AV79Disponible, 15, 2)));
      AV106DisponibleM = AV104presupuestadoM.subtract(AV105ComprometidoM) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDisponiblem_Internalname, GXutil.ltrim( GXutil.str( AV106DisponibleM, 15, 2)));
   }

   public void S307( )
   {
      /* 'PERIODO' Routine */
      AV125PERIODODSC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPeriododsc_Internalname, AV125PERIODODSC);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPERIODODSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV125PERIODODSC, ""))));
      /* Using cursor H002I12 */
      pr_default.execute(10, new Object[] {AV129ACRCOIRPER});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A5881PERIODOID = H002I12_A5881PERIODOID[0] ;
         A5882PERIODODSC = H002I12_A5882PERIODODSC[0] ;
         AV125PERIODODSC = A5882PERIODODSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPeriododsc_Internalname, AV125PERIODODSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPERIODODSC"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, GXutil.rtrim( localUtil.format( AV125PERIODODSC, ""))));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S272( )
   {
      /* 'ENVIA CORREO SIGUIENTE NIVEL' Routine */
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
      nGXsfl_83_fel_idx = (short)(0) ;
      while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
      {
         nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
         sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_832( ) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
            GX_FocusControl = edtavAcrcpalin_Internalname ;
            wbErr = true ;
            AV14ACRCPALIN = DecimalUtil.ZERO ;
         }
         else
         {
            AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
            GX_FocusControl = edtavAcrcpafreq_Internalname ;
            wbErr = true ;
            AV13ACRCPAFREQ = GXutil.nullDate() ;
         }
         else
         {
            AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
            GX_FocusControl = edtavAcrcpaprid_Internalname ;
            wbErr = true ;
            AV15ACRCPAPRID = 0 ;
         }
         else
         {
            AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
         }
         AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
         AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
         AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
         AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
            GX_FocusControl = edtavAcrcpaqty_Internalname ;
            wbErr = true ;
            AV16ACRCPAQTY = DecimalUtil.ZERO ;
         }
         else
         {
            AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
         }
         cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
         cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
         AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
         AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
         AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
         cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
         cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
         AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
         dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
         dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
         AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
         dynavCgunngid.setName( dynavCgunngid.getInternalname() );
         dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
         AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
            GX_FocusControl = edtavAcrcoiprecot_Internalname ;
            wbErr = true ;
            AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
         }
         else
         {
            AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
            GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
            wbErr = true ;
            AV99ACRCOININKIT_AUX = 0 ;
         }
         else
         {
            AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
            GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
            wbErr = true ;
            AV177auxACRCPAQTY = DecimalUtil.ZERO ;
         }
         else
         {
            AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
         }
         AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
         AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
         AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
            GX_FocusControl = edtavAcrcoidias_Internalname ;
            wbErr = true ;
            AV126ACRCOIDIAS = (short)(0) ;
         }
         else
         {
            AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
         }
         AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
         AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
         AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
         AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
            GX_FocusControl = edtavPresupuestado_Internalname ;
            wbErr = true ;
            AV80Presupuestado = DecimalUtil.ZERO ;
         }
         else
         {
            AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
            GX_FocusControl = edtavComprometido_Internalname ;
            wbErr = true ;
            AV78Comprometido = DecimalUtil.ZERO ;
         }
         else
         {
            AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
            GX_FocusControl = edtavDisponible_Internalname ;
            wbErr = true ;
            AV79Disponible = DecimalUtil.ZERO ;
         }
         else
         {
            AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
            GX_FocusControl = edtavPresupuestadom_Internalname ;
            wbErr = true ;
            AV104presupuestadoM = DecimalUtil.ZERO ;
         }
         else
         {
            AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
            GX_FocusControl = edtavComprometidom_Internalname ;
            wbErr = true ;
            AV105ComprometidoM = DecimalUtil.ZERO ;
         }
         else
         {
            AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
            GX_FocusControl = edtavDisponiblem_Internalname ;
            wbErr = true ;
            AV106DisponibleM = DecimalUtil.ZERO ;
         }
         else
         {
            AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
            GX_FocusControl = edtavAcrcpaprepro_Internalname ;
            wbErr = true ;
            AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
         }
         else
         {
            AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
         }
         AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
            GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
            wbErr = true ;
            AV59ACRCPAQTYR = DecimalUtil.ZERO ;
         }
         else
         {
            AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
         }
         if ( AV20Autorizar == 1 )
         {
            if ( AV71NIVSG != 0 )
            {
               AV91Autn = (short)(AV71NIVSG-1) ;
               /* Using cursor H002I13 */
               pr_default.execute(11, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC)});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A171PMCTPRID = H002I13_A171PMCTPRID[0] ;
                  n171PMCTPRID = H002I13_n171PMCTPRID[0] ;
                  A271ACRCPADOC = H002I13_A271ACRCPADOC[0] ;
                  A270ACRCPATDC = H002I13_A270ACRCPATDC[0] ;
                  A269ACRCPACIA = H002I13_A269ACRCPACIA[0] ;
                  A172PMCTPRDSC = H002I13_A172PMCTPRDSC[0] ;
                  n172PMCTPRDSC = H002I13_n172PMCTPRDSC[0] ;
                  A172PMCTPRDSC = H002I13_A172PMCTPRDSC[0] ;
                  n172PMCTPRDSC = H002I13_n172PMCTPRDSC[0] ;
                  AV44PMCTPRDSC = A172PMCTPRDSC ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(11);
               /* Using cursor H002I14 */
               pr_default.execute(12, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV14ACRCPALIN, new Short(AV71NIVSG)});
               while ( (pr_default.getStatus(12) != 101) )
               {
                  A2509ACRCPAL2NIV = H002I14_A2509ACRCPAL2NIV[0] ;
                  A2508ACRCPAL2LIN = H002I14_A2508ACRCPAL2LIN[0] ;
                  A2507ACRCPAL2DOC = H002I14_A2507ACRCPAL2DOC[0] ;
                  A2506ACRCPAL2TDC = H002I14_A2506ACRCPAL2TDC[0] ;
                  A2505ACRCPAL2CIA = H002I14_A2505ACRCPAL2CIA[0] ;
                  A2510ACRCPAL2USR = H002I14_A2510ACRCPAL2USR[0] ;
                  AV73ACRCPAL2USR = A2510ACRCPAL2USR ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV73ACRCPAL2USR", AV73ACRCPAL2USR);
                  /* Using cursor H002I15 */
                  pr_default.execute(13, new Object[] {AV73ACRCPAL2USR});
                  while ( (pr_default.getStatus(13) != 101) )
                  {
                     A46CNCDIRID = H002I15_A46CNCDIRID[0] ;
                     n46CNCDIRID = H002I15_n46CNCDIRID[0] ;
                     A5940CNUSERID = H002I15_A5940CNUSERID[0] ;
                     A205CNCDIREM = H002I15_A205CNCDIREM[0] ;
                     n205CNCDIREM = H002I15_n205CNCDIREM[0] ;
                     A190CNUSERDSC = H002I15_A190CNUSERDSC[0] ;
                     n190CNUSERDSC = H002I15_n190CNUSERDSC[0] ;
                     A205CNCDIREM = H002I15_A205CNCDIREM[0] ;
                     n205CNCDIREM = H002I15_n205CNCDIREM[0] ;
                     AV74CNCDIREM = A205CNCDIREM ;
                     AV75CNUSERDSC = A190CNUSERDSC ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV75CNUSERDSC", AV75CNUSERDSC);
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(13);
                  AV77Asunto = "Pendiente de Autorizar la requisición Número " + GXutil.trim( GXutil.str( AV12ACRCPADOC, 10, 0)) + " de " + AV22CNCIASDSC ;
                  AV76CuerpoCorreo = " <p style=\"font-family: Calibri, Candara, Segoe, \"Segoe UI\", Optima, Arial, sans-serif; font-size:15pt; \"> " + "<font color = \"#0000FF\"> Hola " + AV75CNUSERDSC + "</font>" + " <br> <br>" + "Te informamos que se ha autorizado la Requisición Número  " + GXutil.trim( GXutil.str( AV12ACRCPADOC, 10, 0)) + " con los siguentes datos: " + " <br> " + "<div style = \"padding-left: 30px;\">  <strong> Empresa: </strong>" + AV22CNCIASDSC + " <br>" + "<strong> Proyecto: </strong> " + AV44PMCTPRDSC + " <br>" + "<strong> Nivel Autorizado: </strong> " + GXutil.trim( GXutil.str( AV91Autn, 4, 0)) + " <br>" + "<strong> Liberó: </strong> " + GXutil.trim( AV93CNUSERDSC2) + "</div>" + " <br> " + "Ahora esta pendiente de que tu hagas el proceso de autorización Nivel" + GXutil.trim( GXutil.str( AV71NIVSG, 4, 0)) + ", recuerda que puedes hacerlo desde tu equipo móvil o desde el portal sysKDS." + "</p>" ;
                  GXv_char4[0] = "Notificaciones automaticas sysKDS" ;
                  GXv_int6[0] = (short)(0) ;
                  new com.kdsproyectos.pnotcorreo(remoteHandle, context).execute( GXv_char4, AV74CNCDIREM, AV75CNUSERDSC, AV76CuerpoCorreo, AV77Asunto, GXv_int6) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75CNUSERDSC", AV75CNUSERDSC);
                  pr_default.readNext(12);
               }
               pr_default.close(12);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_83_fel_idx == 0 )
      {
         nGXsfl_83_idx = (short)(1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      nGXsfl_83_fel_idx = (short)(1) ;
   }

   public void S282( )
   {
      /* 'ENVIARCORREOOC' Routine */
      AV235INPRODID.clear();
      AV36INPR02ID.clear();
      AV239CCNCDIRID.clear();
      AV242CACRCPALIN.clear();
      if ( AV71NIVSG == 0 )
      {
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         nGXsfl_83_fel_idx = (short)(0) ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
               GX_FocusControl = edtavAcrcpalin_Internalname ;
               wbErr = true ;
               AV14ACRCPALIN = DecimalUtil.ZERO ;
            }
            else
            {
               AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
               GX_FocusControl = edtavAcrcpafreq_Internalname ;
               wbErr = true ;
               AV13ACRCPAFREQ = GXutil.nullDate() ;
            }
            else
            {
               AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
               GX_FocusControl = edtavAcrcpaprid_Internalname ;
               wbErr = true ;
               AV15ACRCPAPRID = 0 ;
            }
            else
            {
               AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
            }
            AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
            AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
            AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
            AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
               GX_FocusControl = edtavAcrcpaqty_Internalname ;
               wbErr = true ;
               AV16ACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
            }
            cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
            cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
            AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
            AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
            AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
            cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
            cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
            AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
            dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
            dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
            dynavCgunngid.setName( dynavCgunngid.getInternalname() );
            dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
            AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
               GX_FocusControl = edtavAcrcoiprecot_Internalname ;
               wbErr = true ;
               AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
               GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
               wbErr = true ;
               AV99ACRCOININKIT_AUX = 0 ;
            }
            else
            {
               AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
               GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
               wbErr = true ;
               AV177auxACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
            }
            AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
            AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
            AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
               GX_FocusControl = edtavAcrcoidias_Internalname ;
               wbErr = true ;
               AV126ACRCOIDIAS = (short)(0) ;
            }
            else
            {
               AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
            }
            AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
            AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
            AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
            AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
               GX_FocusControl = edtavPresupuestado_Internalname ;
               wbErr = true ;
               AV80Presupuestado = DecimalUtil.ZERO ;
            }
            else
            {
               AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
               GX_FocusControl = edtavComprometido_Internalname ;
               wbErr = true ;
               AV78Comprometido = DecimalUtil.ZERO ;
            }
            else
            {
               AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               wbErr = true ;
               AV79Disponible = DecimalUtil.ZERO ;
            }
            else
            {
               AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
               GX_FocusControl = edtavPresupuestadom_Internalname ;
               wbErr = true ;
               AV104presupuestadoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
               GX_FocusControl = edtavComprometidom_Internalname ;
               wbErr = true ;
               AV105ComprometidoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
               GX_FocusControl = edtavDisponiblem_Internalname ;
               wbErr = true ;
               AV106DisponibleM = DecimalUtil.ZERO ;
            }
            else
            {
               AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
               GX_FocusControl = edtavAcrcpaprepro_Internalname ;
               wbErr = true ;
               AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
            }
            else
            {
               AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
            }
            AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
               GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
               wbErr = true ;
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
            }
            else
            {
               AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
            }
            if ( AV20Autorizar == 1 )
            {
               AV235INPRODID.add((long)(AV15ACRCPAPRID), 0);
               AV242CACRCPALIN.add(AV14ACRCPALIN, 0);
            }
            /* End For Each Line */
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = (short)(1) ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = (short)(1) ;
         pr_default.dynParam(14, new Object[]{ new Object[]{
                                              new Long(A281INPRODID) ,
                                              AV235INPRODID } ,
                                              new int[]{
                                              TypeConstants.LONG
                                              }
         } ) ;
         /* Using cursor H002I16 */
         pr_default.execute(14);
         while ( (pr_default.getStatus(14) != 101) )
         {
            brk2I14 = false ;
            A281INPRODID = H002I16_A281INPRODID[0] ;
            A279INPR02ID = H002I16_A279INPR02ID[0] ;
            n279INPR02ID = H002I16_n279INPR02ID[0] ;
            while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(H002I16_A279INPR02ID[0], A279INPR02ID) == 0 ) )
            {
               brk2I14 = false ;
               A281INPRODID = H002I16_A281INPRODID[0] ;
               if ( (AV235INPRODID.indexof(A281INPRODID)>0) )
               {
                  AV236AINPRODID = A281INPRODID ;
               }
               brk2I14 = true ;
               pr_default.readNext(14);
            }
            AV36INPR02ID.add(A279INPR02ID, 0);
            if ( ! brk2I14 )
            {
               brk2I14 = true ;
               pr_default.readNext(14);
            }
         }
         pr_default.close(14);
         pr_default.dynParam(15, new Object[]{ new Object[]{
                                              A279INPR02ID ,
                                              AV36INPR02ID } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         /* Using cursor H002I17 */
         pr_default.execute(15);
         while ( (pr_default.getStatus(15) != 101) )
         {
            brk2I16 = false ;
            A279INPR02ID = H002I17_A279INPR02ID[0] ;
            n279INPR02ID = H002I17_n279INPR02ID[0] ;
            A886INPR02CMID = H002I17_A886INPR02CMID[0] ;
            n886INPR02CMID = H002I17_n886INPR02CMID[0] ;
            while ( (pr_default.getStatus(15) != 101) && ( H002I17_A886INPR02CMID[0] == A886INPR02CMID ) )
            {
               brk2I16 = false ;
               A279INPR02ID = H002I17_A279INPR02ID[0] ;
               n279INPR02ID = H002I17_n279INPR02ID[0] ;
               if ( (AV36INPR02ID.indexof(GXutil.rtrim( A279INPR02ID))>0) )
               {
                  AV238AINPR02ID = A279INPR02ID ;
               }
               brk2I16 = true ;
               pr_default.readNext(15);
            }
            AV239CCNCDIRID.add((long)(A886INPR02CMID), 0);
            if ( ! brk2I16 )
            {
               brk2I16 = true ;
               pr_default.readNext(15);
            }
         }
         pr_default.close(15);
         pr_default.dynParam(16, new Object[]{ new Object[]{
                                              new Long(A46CNCDIRID) ,
                                              AV239CCNCDIRID } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.BOOLEAN
                                              }
         } ) ;
         /* Using cursor H002I18 */
         pr_default.execute(16);
         while ( (pr_default.getStatus(16) != 101) )
         {
            A46CNCDIRID = H002I18_A46CNCDIRID[0] ;
            n46CNCDIRID = H002I18_n46CNCDIRID[0] ;
            A194CNCDIRNOM = H002I18_A194CNCDIRNOM[0] ;
            n194CNCDIRNOM = H002I18_n194CNCDIRNOM[0] ;
            A205CNCDIREM = H002I18_A205CNCDIREM[0] ;
            n205CNCDIREM = H002I18_n205CNCDIREM[0] ;
            AV240ACNCDIRNOM = A194CNCDIRNOM ;
            AV74CNCDIREM = A205CNCDIREM ;
            AV77Asunto = "Autorización de requisición número " + GXutil.trim( GXutil.str( AV12ACRCPADOC, 10, 0)) ;
            AV76CuerpoCorreo = " <p style=\"font-family: Calibri, Candara, Segoe, \"Segoe UI\", Optima, Arial, sans-serif; font-size:15pt; \"> " + "<font color = \"#0000FF\"> Hola " + GXutil.trim( AV240ACNCDIRNOM) + "</font>" + " <br> <br>" + "Te informamos que la requisición ha sido revisada y está lista para Generar Orden de Compra: <br>" + "Requisición: " + GXutil.trim( GXutil.str( AV12ACRCPADOC, 10, 0)) + " <br>" ;
            AV243cadenaLineas = "" ;
            AV269GXV1 = 1 ;
            while ( AV269GXV1 <= AV242CACRCPALIN.size() )
            {
               AV244variable = AV242CACRCPALIN.elementAt(-1+AV269GXV1) ;
               if ( GXutil.strcmp(AV243cadenaLineas, "") == 0 )
               {
                  AV243cadenaLineas = "Líneas: " + GXutil.trim( GXutil.str( AV244variable, 7, 3)) ;
               }
               else
               {
                  AV243cadenaLineas = AV243cadenaLineas + ", " + GXutil.trim( GXutil.str( AV244variable, 7, 3)) ;
               }
               AV269GXV1 = (int)(AV269GXV1+1) ;
            }
            AV76CuerpoCorreo = AV76CuerpoCorreo + GXutil.trim( AV243cadenaLineas) + " <br> <br>" ;
            AV76CuerpoCorreo = AV76CuerpoCorreo + "<div style = \"padding-left: 30px;\">" + "<strong> Empresa: </strong>" + GXutil.trim( AV22CNCIASDSC) + " <br>" + "<strong> Proyecto: </strong> " + GXutil.trim( AV121Proyecto) + " <br>" + "<strong> Solicitante: </strong> " + GXutil.trim( AV120UsuarioSol) + " <br> </div>" ;
            GXv_char4[0] = "Notificaciones automaticas sysKDS" ;
            GXv_int6[0] = (short)(0) ;
            new com.kdsproyectos.pnotcorreo2(remoteHandle, context).execute( GXv_char4, GXutil.trim( AV74CNCDIREM), GXutil.trim( AV240ACNCDIRNOM), GXutil.trim( AV76CuerpoCorreo), GXutil.trim( AV77Asunto), GXv_int6) ;
            pr_default.readNext(16);
         }
         pr_default.close(16);
      }
   }

   public void S226( )
   {
      /* 'REVISA KIT GRID1' Routine */
      /* Using cursor H002I19 */
      pr_default.execute(17, new Object[] {new Long(AV98ACRCOININKIT), new Long(AV12ACRCPADOC)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A890PMRCKTIDKIT = H002I19_A890PMRCKTIDKIT[0] ;
         A889PMRCKTDOC = H002I19_A889PMRCKTDOC[0] ;
         A891PMRCKTQTYREQ = H002I19_A891PMRCKTQTYREQ[0] ;
         n891PMRCKTQTYREQ = H002I19_n891PMRCKTQTYREQ[0] ;
         AV16ACRCPAQTY = A891PMRCKTQTYREQ ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
         AV177auxACRCPAQTY = A891PMRCKTQTYREQ ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAuxacrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV177auxACRCPAQTY, 17, 6)));
         AV18ACRCPAUM = "KIT" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaum_Internalname, AV18ACRCPAUM);
         AV15ACRCPAPRID = A890PMRCKTIDKIT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaprid_Internalname, GXutil.ltrim( GXutil.str( AV15ACRCPAPRID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAPRID"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")));
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   public void S156( )
   {
      /* 'VALIDA KIT' Routine */
      AV271GXLvl825 = (byte)(0) ;
      /* Using cursor H002I20 */
      pr_default.execute(18, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV14ACRCPALIN});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A267ACRCOILIN = H002I20_A267ACRCOILIN[0] ;
         A266ACRCOIDOC = H002I20_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I20_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I20_A5939CNCIASID[0] ;
         A893ACRCOININKIT = H002I20_A893ACRCOININKIT[0] ;
         n893ACRCOININKIT = H002I20_n893ACRCOININKIT[0] ;
         AV271GXLvl825 = (byte)(1) ;
         AV98ACRCOININKIT = A893ACRCOININKIT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98ACRCOININKIT", GXutil.ltrim( GXutil.str( AV98ACRCOININKIT, 10, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
      if ( AV271GXLvl825 == 0 )
      {
         AV98ACRCOININKIT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98ACRCOININKIT", GXutil.ltrim( GXutil.str( AV98ACRCOININKIT, 10, 0)));
      }
   }

   public void S236( )
   {
      /* 'RECUPERA ACRCOIDSC4' Routine */
      AV56ACRCOIDSC4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidsc4_Internalname, AV56ACRCOIDSC4);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDSC4"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV56ACRCOIDSC4));
      /* Using cursor H002I21 */
      pr_default.execute(19, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV14ACRCPALIN});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A267ACRCOILIN = H002I21_A267ACRCOILIN[0] ;
         A266ACRCOIDOC = H002I21_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I21_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I21_A5939CNCIASID[0] ;
         A756ACRCOIDSC4 = H002I21_A756ACRCOIDSC4[0] ;
         n756ACRCOIDSC4 = H002I21_n756ACRCOIDSC4[0] ;
         A323ACRCOIALM = H002I21_A323ACRCOIALM[0] ;
         n323ACRCOIALM = H002I21_n323ACRCOIALM[0] ;
         A10943ACRCOIPRECOT = H002I21_A10943ACRCOIPRECOT[0] ;
         n10943ACRCOIPRECOT = H002I21_n10943ACRCOIPRECOT[0] ;
         AV56ACRCOIDSC4 = A756ACRCOIDSC4 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoidsc4_Internalname, AV56ACRCOIDSC4);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCOIDSC4"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, AV56ACRCOIDSC4));
         if ( GXutil.strcmp(AV234ACRCOICONSER, "S") == 0 )
         {
            AV233dscTrabajoRealizar = AV56ACRCOIDSC4 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV233dscTrabajoRealizar", AV233dscTrabajoRealizar);
         }
         AV161ACRCOIALM = A323ACRCOIALM ;
         GXt_char1 = AV162INALMNDSC ;
         GXv_char4[0] = GXt_char1 ;
         new com.kdsproyectos.in0003(remoteHandle, context).execute( AV161ACRCOIALM, GXv_char4) ;
         wautreq_impl.this.GXt_char1 = GXv_char4[0] ;
         AV162INALMNDSC = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInalmndsc_Internalname, AV162INALMNDSC);
         AV231ACRCOIPRECOT = A10943ACRCOIPRECOT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiprecot_Internalname, GXutil.ltrim( GXutil.str( AV231ACRCOIPRECOT, 15, 4)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S262( )
   {
      /* 'AUTORIZAREQKIT' Routine */
      /* Using cursor H002I22 */
      pr_default.execute(20, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), new Long(AV99ACRCOININKIT_AUX)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A139ACACSGID = H002I22_A139ACACSGID[0] ;
         n139ACACSGID = H002I22_n139ACACSGID[0] ;
         A893ACRCOININKIT = H002I22_A893ACRCOININKIT[0] ;
         n893ACRCOININKIT = H002I22_n893ACRCOININKIT[0] ;
         A266ACRCOIDOC = H002I22_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I22_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I22_A5939CNCIASID[0] ;
         A267ACRCOILIN = H002I22_A267ACRCOILIN[0] ;
         A268ACRCOIPRID = H002I22_A268ACRCOIPRID[0] ;
         n268ACRCOIPRID = H002I22_n268ACRCOIPRID[0] ;
         A316ACRCOIQTP = H002I22_A316ACRCOIQTP[0] ;
         n316ACRCOIQTP = H002I22_n316ACRCOIQTP[0] ;
         if ( GXutil.strcmp(AV115Propietario, "S") == 0 )
         {
            GXv_int6[0] = AV70ENVIARCORREO ;
            GXv_int5[0] = AV71NIVSG ;
            new com.kdsproyectos.pautorizareqown(remoteHandle, context).execute( AV6CNUSERID, A266ACRCOIDOC, A5939CNCIASID, A20CNTDOCID, DecimalUtil.doubleToDec(A267ACRCOILIN), AV20Autorizar, AV8ACRCOIOBSAUT, AV45PMCTPRID, A268ACRCOIPRID, A316ACRCOIQTP, GXv_int6, GXv_int5) ;
            wautreq_impl.this.AV70ENVIARCORREO = GXv_int6[0] ;
            wautreq_impl.this.AV71NIVSG = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
            httpContext.ajax_rsp_assign_attri("", false, "A266ACRCOIDOC", GXutil.ltrim( GXutil.str( A266ACRCOIDOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A5939CNCIASID", GXutil.ltrim( GXutil.str( A5939CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A20CNTDOCID", A20CNTDOCID);
            httpContext.ajax_rsp_assign_attri("", false, "A267ACRCOILIN", GXutil.ltrim( GXutil.str( A267ACRCOILIN, 7, 0)));
            httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiobsaut_Internalname, AV8ACRCOIOBSAUT);
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
            httpContext.ajax_rsp_assign_attri("", false, "A268ACRCOIPRID", GXutil.ltrim( GXutil.str( A268ACRCOIPRID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A316ACRCOIQTP", GXutil.ltrim( GXutil.str( A316ACRCOIQTP, 17, 6)));
            httpContext.ajax_rsp_assign_attri("", false, "AV70ENVIARCORREO", GXutil.ltrim( GXutil.str( AV70ENVIARCORREO, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV71NIVSG", GXutil.ltrim( GXutil.str( AV71NIVSG, 4, 0)));
         }
         else
         {
            GXv_int6[0] = AV70ENVIARCORREO ;
            GXv_int5[0] = AV71NIVSG ;
            new com.kdsproyectos.pautorizareq(remoteHandle, context).execute( AV6CNUSERID, A266ACRCOIDOC, A5939CNCIASID, A20CNTDOCID, DecimalUtil.doubleToDec(A267ACRCOILIN), AV20Autorizar, AV8ACRCOIOBSAUT, AV45PMCTPRID, A268ACRCOIPRID, A316ACRCOIQTP, GXv_int6, GXv_int5) ;
            wautreq_impl.this.AV70ENVIARCORREO = GXv_int6[0] ;
            wautreq_impl.this.AV71NIVSG = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
            httpContext.ajax_rsp_assign_attri("", false, "A266ACRCOIDOC", GXutil.ltrim( GXutil.str( A266ACRCOIDOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A5939CNCIASID", GXutil.ltrim( GXutil.str( A5939CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A20CNTDOCID", A20CNTDOCID);
            httpContext.ajax_rsp_assign_attri("", false, "A267ACRCOILIN", GXutil.ltrim( GXutil.str( A267ACRCOILIN, 7, 0)));
            httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcoiobsaut_Internalname, AV8ACRCOIOBSAUT);
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
            httpContext.ajax_rsp_assign_attri("", false, "A268ACRCOIPRID", GXutil.ltrim( GXutil.str( A268ACRCOIPRID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A316ACRCOIQTP", GXutil.ltrim( GXutil.str( A316ACRCOIQTP, 17, 6)));
            httpContext.ajax_rsp_assign_attri("", false, "AV70ENVIARCORREO", GXutil.ltrim( GXutil.str( AV70ENVIARCORREO, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV71NIVSG", GXutil.ltrim( GXutil.str( AV71NIVSG, 4, 0)));
         }
         pr_default.readNext(20);
      }
      pr_default.close(20);
   }

   public void S252( )
   {
      /* 'VALIDALINEAS' Routine */
      AV100existe = "N" ;
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
      nGXsfl_83_fel_idx = (short)(0) ;
      while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
      {
         nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
         sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_832( ) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
            GX_FocusControl = edtavAcrcpalin_Internalname ;
            wbErr = true ;
            AV14ACRCPALIN = DecimalUtil.ZERO ;
         }
         else
         {
            AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
            GX_FocusControl = edtavAcrcpafreq_Internalname ;
            wbErr = true ;
            AV13ACRCPAFREQ = GXutil.nullDate() ;
         }
         else
         {
            AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
            GX_FocusControl = edtavAcrcpaprid_Internalname ;
            wbErr = true ;
            AV15ACRCPAPRID = 0 ;
         }
         else
         {
            AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
         }
         AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
         AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
         AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
         AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
            GX_FocusControl = edtavAcrcpaqty_Internalname ;
            wbErr = true ;
            AV16ACRCPAQTY = DecimalUtil.ZERO ;
         }
         else
         {
            AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
         }
         cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
         cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
         AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
         AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
         AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
         cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
         cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
         AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
         dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
         dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
         AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
         dynavCgunngid.setName( dynavCgunngid.getInternalname() );
         dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
         AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
            GX_FocusControl = edtavAcrcoiprecot_Internalname ;
            wbErr = true ;
            AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
         }
         else
         {
            AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
            GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
            wbErr = true ;
            AV99ACRCOININKIT_AUX = 0 ;
         }
         else
         {
            AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
            GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
            wbErr = true ;
            AV177auxACRCPAQTY = DecimalUtil.ZERO ;
         }
         else
         {
            AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
         }
         AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
         AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
         AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
            GX_FocusControl = edtavAcrcoidias_Internalname ;
            wbErr = true ;
            AV126ACRCOIDIAS = (short)(0) ;
         }
         else
         {
            AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
         }
         AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
         AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
         AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
         AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
            GX_FocusControl = edtavPresupuestado_Internalname ;
            wbErr = true ;
            AV80Presupuestado = DecimalUtil.ZERO ;
         }
         else
         {
            AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
            GX_FocusControl = edtavComprometido_Internalname ;
            wbErr = true ;
            AV78Comprometido = DecimalUtil.ZERO ;
         }
         else
         {
            AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
            GX_FocusControl = edtavDisponible_Internalname ;
            wbErr = true ;
            AV79Disponible = DecimalUtil.ZERO ;
         }
         else
         {
            AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
            GX_FocusControl = edtavPresupuestadom_Internalname ;
            wbErr = true ;
            AV104presupuestadoM = DecimalUtil.ZERO ;
         }
         else
         {
            AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
            GX_FocusControl = edtavComprometidom_Internalname ;
            wbErr = true ;
            AV105ComprometidoM = DecimalUtil.ZERO ;
         }
         else
         {
            AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
            GX_FocusControl = edtavDisponiblem_Internalname ;
            wbErr = true ;
            AV106DisponibleM = DecimalUtil.ZERO ;
         }
         else
         {
            AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
            GX_FocusControl = edtavAcrcpaprepro_Internalname ;
            wbErr = true ;
            AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
         }
         else
         {
            AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
         }
         AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
            GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
            wbErr = true ;
            AV59ACRCPAQTYR = DecimalUtil.ZERO ;
         }
         else
         {
            AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
         }
         if ( AV20Autorizar != 0 )
         {
            AV100existe = "S" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_83_fel_idx == 0 )
      {
         nGXsfl_83_idx = (short)(1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      nGXsfl_83_fel_idx = (short)(1) ;
      if ( GXutil.strcmp(AV100existe, "S") == 0 )
      {
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         nGXsfl_83_fel_idx = (short)(0) ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
               GX_FocusControl = edtavAcrcpalin_Internalname ;
               wbErr = true ;
               AV14ACRCPALIN = DecimalUtil.ZERO ;
            }
            else
            {
               AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
               GX_FocusControl = edtavAcrcpafreq_Internalname ;
               wbErr = true ;
               AV13ACRCPAFREQ = GXutil.nullDate() ;
            }
            else
            {
               AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
               GX_FocusControl = edtavAcrcpaprid_Internalname ;
               wbErr = true ;
               AV15ACRCPAPRID = 0 ;
            }
            else
            {
               AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
            }
            AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
            AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
            AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
            AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
               GX_FocusControl = edtavAcrcpaqty_Internalname ;
               wbErr = true ;
               AV16ACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
            }
            cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
            cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
            AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
            AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
            AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
            cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
            cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
            AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
            dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
            dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
            dynavCgunngid.setName( dynavCgunngid.getInternalname() );
            dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
            AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
               GX_FocusControl = edtavAcrcoiprecot_Internalname ;
               wbErr = true ;
               AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
               GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
               wbErr = true ;
               AV99ACRCOININKIT_AUX = 0 ;
            }
            else
            {
               AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
               GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
               wbErr = true ;
               AV177auxACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
            }
            AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
            AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
            AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
               GX_FocusControl = edtavAcrcoidias_Internalname ;
               wbErr = true ;
               AV126ACRCOIDIAS = (short)(0) ;
            }
            else
            {
               AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
            }
            AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
            AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
            AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
            AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
               GX_FocusControl = edtavPresupuestado_Internalname ;
               wbErr = true ;
               AV80Presupuestado = DecimalUtil.ZERO ;
            }
            else
            {
               AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
               GX_FocusControl = edtavComprometido_Internalname ;
               wbErr = true ;
               AV78Comprometido = DecimalUtil.ZERO ;
            }
            else
            {
               AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               wbErr = true ;
               AV79Disponible = DecimalUtil.ZERO ;
            }
            else
            {
               AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
               GX_FocusControl = edtavPresupuestadom_Internalname ;
               wbErr = true ;
               AV104presupuestadoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
               GX_FocusControl = edtavComprometidom_Internalname ;
               wbErr = true ;
               AV105ComprometidoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
               GX_FocusControl = edtavDisponiblem_Internalname ;
               wbErr = true ;
               AV106DisponibleM = DecimalUtil.ZERO ;
            }
            else
            {
               AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
               GX_FocusControl = edtavAcrcpaprepro_Internalname ;
               wbErr = true ;
               AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
            }
            else
            {
               AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
            }
            AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
               GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
               wbErr = true ;
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
            }
            else
            {
               AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
            }
            if ( AV16ACRCPAQTY.doubleValue() > 0 )
            {
               new com.kdsproyectos.acrcpa02(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV16ACRCPAQTY) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
               httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
               new com.kdsproyectos.acrcpa01(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV103ACRCPAOBS) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
               httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
               httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaobs_Internalname, AV103ACRCPAOBS);
               if ( GXutil.strcmp(AV188PermiteCambioCtaCgo, "S") == 0 )
               {
                  new com.kdsproyectos.acrcoi08(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV81ACRCPACTCG) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
                  httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
                  httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
               }
            }
            /* End For Each Line */
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = (short)(1) ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = (short)(1) ;
         AV101continuar = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101continuar", AV101continuar);
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         nGXsfl_83_fel_idx = (short)(0) ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
               GX_FocusControl = edtavAcrcpalin_Internalname ;
               wbErr = true ;
               AV14ACRCPALIN = DecimalUtil.ZERO ;
            }
            else
            {
               AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
               GX_FocusControl = edtavAcrcpafreq_Internalname ;
               wbErr = true ;
               AV13ACRCPAFREQ = GXutil.nullDate() ;
            }
            else
            {
               AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
               GX_FocusControl = edtavAcrcpaprid_Internalname ;
               wbErr = true ;
               AV15ACRCPAPRID = 0 ;
            }
            else
            {
               AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
            }
            AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
            AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
            AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
            AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
               GX_FocusControl = edtavAcrcpaqty_Internalname ;
               wbErr = true ;
               AV16ACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
            }
            cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
            cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
            AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
            AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
            AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
            cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
            cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
            AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
            dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
            dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
            dynavCgunngid.setName( dynavCgunngid.getInternalname() );
            dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
            AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
               GX_FocusControl = edtavAcrcoiprecot_Internalname ;
               wbErr = true ;
               AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
               GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
               wbErr = true ;
               AV99ACRCOININKIT_AUX = 0 ;
            }
            else
            {
               AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
               GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
               wbErr = true ;
               AV177auxACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
            }
            AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
            AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
            AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
               GX_FocusControl = edtavAcrcoidias_Internalname ;
               wbErr = true ;
               AV126ACRCOIDIAS = (short)(0) ;
            }
            else
            {
               AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
            }
            AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
            AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
            AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
            AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
               GX_FocusControl = edtavPresupuestado_Internalname ;
               wbErr = true ;
               AV80Presupuestado = DecimalUtil.ZERO ;
            }
            else
            {
               AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
               GX_FocusControl = edtavComprometido_Internalname ;
               wbErr = true ;
               AV78Comprometido = DecimalUtil.ZERO ;
            }
            else
            {
               AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               wbErr = true ;
               AV79Disponible = DecimalUtil.ZERO ;
            }
            else
            {
               AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
               GX_FocusControl = edtavPresupuestadom_Internalname ;
               wbErr = true ;
               AV104presupuestadoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
               GX_FocusControl = edtavComprometidom_Internalname ;
               wbErr = true ;
               AV105ComprometidoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
               GX_FocusControl = edtavDisponiblem_Internalname ;
               wbErr = true ;
               AV106DisponibleM = DecimalUtil.ZERO ;
            }
            else
            {
               AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
               GX_FocusControl = edtavAcrcpaprepro_Internalname ;
               wbErr = true ;
               AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
            }
            else
            {
               AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
            }
            AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
               GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
               wbErr = true ;
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
            }
            else
            {
               AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
            }
            if ( ( AV20Autorizar == 2 ) && ( ( GXutil.strcmp(AV8ACRCOIOBSAUT, "") == 0 ) && ( AV190AutorizarTod == 0 ) ) )
            {
               edtavAcrcoiobsaut_Backcolor = GXutil.getColor( 255, 138, 138) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavAcrcoiobsaut_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavAcrcoiobsaut_Backcolor, 9, 0)), !bGXsfl_83_Refreshing);
               Gx_msg = "La línea " + GXutil.trim( GXutil.str( AV14ACRCPALIN, 7, 3)) + " a cancelar no cuenta con algún comentario, verifique." ;
               this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",Gx_msg});
               AV101continuar = "N" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV101continuar", AV101continuar);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = (short)(1) ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = (short)(1) ;
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_83 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), ".", ",")) ;
         nGXsfl_83_fel_idx = (short)(0) ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1)) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPALIN");
               GX_FocusControl = edtavAcrcpalin_Internalname ;
               wbErr = true ;
               AV14ACRCPALIN = DecimalUtil.ZERO ;
            }
            else
            {
               AV14ACRCPALIN = localUtil.ctond( httpContext.cgiGet( edtavAcrcpalin_Internalname)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavAcrcpafreq_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACRCPAFREQ");
               GX_FocusControl = edtavAcrcpafreq_Internalname ;
               wbErr = true ;
               AV13ACRCPAFREQ = GXutil.nullDate() ;
            }
            else
            {
               AV13ACRCPAFREQ = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAcrcpafreq_Internalname), 0)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPRID");
               GX_FocusControl = edtavAcrcpaprid_Internalname ;
               wbErr = true ;
               AV15ACRCPAPRID = 0 ;
            }
            else
            {
               AV15ACRCPAPRID = localUtil.ctol( httpContext.cgiGet( edtavAcrcpaprid_Internalname), ".", ",") ;
            }
            AV39INPRODI2_P = httpContext.cgiGet( edtavInprodi2_p_Internalname) ;
            AV37INPRODDSC = httpContext.cgiGet( edtavInproddsc_Internalname) ;
            AV56ACRCOIDSC4 = httpContext.cgiGet( edtavAcrcoidsc4_Internalname) ;
            AV18ACRCPAUM = httpContext.cgiGet( edtavAcrcpaum_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTY");
               GX_FocusControl = edtavAcrcpaqty_Internalname ;
               wbErr = true ;
               AV16ACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV16ACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqty_Internalname)) ;
            }
            cmbavAutorizar.setName( cmbavAutorizar.getInternalname() );
            cmbavAutorizar.setValue( httpContext.cgiGet( cmbavAutorizar.getInternalname()) );
            AV20Autorizar = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAutorizar.getInternalname()))) ;
            AV8ACRCOIOBSAUT = httpContext.cgiGet( edtavAcrcoiobsaut_Internalname) ;
            AV103ACRCPAOBS = httpContext.cgiGet( edtavAcrcpaobs_Internalname) ;
            cmbavAcrcpactcg.setName( cmbavAcrcpactcg.getInternalname() );
            cmbavAcrcpactcg.setValue( httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) );
            AV81ACRCPACTCG = httpContext.cgiGet( cmbavAcrcpactcg.getInternalname()) ;
            dynavAcrcoiacd.setName( dynavAcrcoiacd.getInternalname() );
            dynavAcrcoiacd.setValue( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()) );
            AV192ACRCOIACD = (short)(GXutil.lval( httpContext.cgiGet( dynavAcrcoiacd.getInternalname()))) ;
            dynavCgunngid.setName( dynavCgunngid.getInternalname() );
            dynavCgunngid.setValue( httpContext.cgiGet( dynavCgunngid.getInternalname()) );
            AV193CGUNNGID = httpContext.cgiGet( dynavCgunngid.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIPRECOT");
               GX_FocusControl = edtavAcrcoiprecot_Internalname ;
               wbErr = true ;
               AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV231ACRCOIPRECOT = localUtil.ctond( httpContext.cgiGet( edtavAcrcoiprecot_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOININKIT_AUX");
               GX_FocusControl = edtavAcrcoininkit_aux_Internalname ;
               wbErr = true ;
               AV99ACRCOININKIT_AUX = 0 ;
            }
            else
            {
               AV99ACRCOININKIT_AUX = localUtil.ctol( httpContext.cgiGet( edtavAcrcoininkit_aux_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUXACRCPAQTY");
               GX_FocusControl = edtavAuxacrcpaqty_Internalname ;
               wbErr = true ;
               AV177auxACRCPAQTY = DecimalUtil.ZERO ;
            }
            else
            {
               AV177auxACRCPAQTY = localUtil.ctond( httpContext.cgiGet( edtavAuxacrcpaqty_Internalname)) ;
            }
            AV165INPR01DSC_G = httpContext.cgiGet( edtavInpr01dsc_g_Internalname) ;
            AV166INPR02DSC_G = httpContext.cgiGet( edtavInpr02dsc_g_Internalname) ;
            AV162INALMNDSC = httpContext.cgiGet( edtavInalmndsc_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCOIDIAS");
               GX_FocusControl = edtavAcrcoidias_Internalname ;
               wbErr = true ;
               AV126ACRCOIDIAS = (short)(0) ;
            }
            else
            {
               AV126ACRCOIDIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavAcrcoidias_Internalname), ".", ",")) ;
            }
            AV125PERIODODSC = httpContext.cgiGet( edtavPeriododsc_Internalname) ;
            AV167subfamdsc = httpContext.cgiGet( edtavSubfamdsc_Internalname) ;
            AV159Question = httpContext.cgiGet( edtavQuestion_Internalname) ;
            AV117permite = httpContext.cgiGet( edtavPermite_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADO");
               GX_FocusControl = edtavPresupuestado_Internalname ;
               wbErr = true ;
               AV80Presupuestado = DecimalUtil.ZERO ;
            }
            else
            {
               AV80Presupuestado = localUtil.ctond( httpContext.cgiGet( edtavPresupuestado_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDO");
               GX_FocusControl = edtavComprometido_Internalname ;
               wbErr = true ;
               AV78Comprometido = DecimalUtil.ZERO ;
            }
            else
            {
               AV78Comprometido = localUtil.ctond( httpContext.cgiGet( edtavComprometido_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               wbErr = true ;
               AV79Disponible = DecimalUtil.ZERO ;
            }
            else
            {
               AV79Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRESUPUESTADOM");
               GX_FocusControl = edtavPresupuestadom_Internalname ;
               wbErr = true ;
               AV104presupuestadoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV104presupuestadoM = localUtil.ctond( httpContext.cgiGet( edtavPresupuestadom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPROMETIDOM");
               GX_FocusControl = edtavComprometidom_Internalname ;
               wbErr = true ;
               AV105ComprometidoM = DecimalUtil.ZERO ;
            }
            else
            {
               AV105ComprometidoM = localUtil.ctond( httpContext.cgiGet( edtavComprometidom_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLEM");
               GX_FocusControl = edtavDisponiblem_Internalname ;
               wbErr = true ;
               AV106DisponibleM = DecimalUtil.ZERO ;
            }
            else
            {
               AV106DisponibleM = localUtil.ctond( httpContext.cgiGet( edtavDisponiblem_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAPREPRO");
               GX_FocusControl = edtavAcrcpaprepro_Internalname ;
               wbErr = true ;
               AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
            }
            else
            {
               AV143ACRCPAPREPRO = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaprepro_Internalname)) ;
            }
            AV169precio = httpContext.cgiGet( edtavPrecio_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACRCPAQTYR");
               GX_FocusControl = edtavAcrcpaqtyr_Internalname ;
               wbErr = true ;
               AV59ACRCPAQTYR = DecimalUtil.ZERO ;
            }
            else
            {
               AV59ACRCPAQTYR = localUtil.ctond( httpContext.cgiGet( edtavAcrcpaqtyr_Internalname)) ;
            }
            if ( ( AV20Autorizar != 0 ) && ( AV16ACRCPAQTY.doubleValue() <= 0 ) )
            {
               Gx_msg = "La línea " + GXutil.trim( GXutil.str( AV14ACRCPALIN, 7, 3)) + " no se ha asignado una cantidad correcta, verifique." ;
               this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",Gx_msg});
               AV101continuar = "N" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV101continuar", AV101continuar);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = (short)(1) ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = (short)(1) ;
      }
      else
      {
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Indique se Autorizara o Cancelara al menos una línea, verifique."});
         AV101continuar = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101continuar", AV101continuar);
      }
   }

   public void S312( )
   {
      /* 'PRESUPUESTADOGRAL' Routine */
      /* Using cursor H002I23 */
      pr_default.execute(21, new Object[] {AV45PMCTPRID, AV81ACRCPACTCG});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A348PMCTCGID = H002I23_A348PMCTCGID[0] ;
         A171PMCTPRID = H002I23_A171PMCTPRID[0] ;
         n171PMCTPRID = H002I23_n171PMCTPRID[0] ;
         A350PMPRCNPRES = H002I23_A350PMPRCNPRES[0] ;
         n350PMPRCNPRES = H002I23_n350PMPRCNPRES[0] ;
         AV80Presupuestado = A350PMPRCNPRES ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestado_Internalname, GXutil.ltrim( GXutil.str( AV80Presupuestado, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADO"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         pr_default.readNext(21);
      }
      pr_default.close(21);
   }

   public void S322( )
   {
      /* 'PRESUPUESTADOMENSUAL' Routine */
      AV104presupuestadoM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestadom_Internalname, GXutil.ltrim( GXutil.str( AV104presupuestadoM, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      /* Optimized group. */
      pr_default.dynParam(22, new Object[]{ new Object[]{
                                           AV110PMPRCNMPERTN3 ,
                                           A6208PMPRCNMPERTN3 ,
                                           AV81ACRCPACTCG ,
                                           AV45PMCTPRID ,
                                           AV111PMPRCNMPERTN4 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      /* Using cursor H002I24 */
      pr_default.execute(22, new Object[] {AV81ACRCPACTCG, AV109PACRCPAFREQ, AV109PACRCPAFREQ, AV45PMCTPRID, AV111PMPRCNMPERTN4, AV110PMPRCNMPERTN3});
      c6213PMPRCNMPRES = H002I24_A6213PMPRCNMPRES[0] ;
      n6213PMPRCNMPRES = H002I24_n6213PMPRCNMPRES[0] ;
      pr_default.close(22);
      AV104presupuestadoM = AV104presupuestadoM.add(c6213PMPRCNMPRES) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPresupuestadom_Internalname, GXutil.ltrim( GXutil.str( AV104presupuestadoM, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRESUPUESTADOM"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      /* End optimized group. */
   }

   public void e122I2( )
   {
      /* 'Salir' Routine */
      AV48session.setValue("Salir", "S");
      httpContext.setWebReturnParms(new Object[] {new Long(AV11ACRCPACIA),AV17ACRCPATDC,new Long(AV12ACRCPADOC),AV45PMCTPRID});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11ACRCPACIA","AV17ACRCPATDC","AV12ACRCPADOC","AV45PMCTPRID"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S246( )
   {
      /* 'CHECAPERMITE' Routine */
      /* Using cursor H002I25 */
      pr_default.execute(23, new Object[] {new Long(AV15ACRCPAPRID)});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A281INPRODID = H002I25_A281INPRODID[0] ;
         A712INPR09ID = H002I25_A712INPR09ID[0] ;
         n712INPR09ID = H002I25_n712INPR09ID[0] ;
         if ( GXutil.strcmp(A712INPR09ID, "VAL") == 0 )
         {
            AV117permite = "Si" ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPermite_Internalname, AV117permite);
         }
         else
         {
            AV117permite = "No" ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPermite_Internalname, AV117permite);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   public void S206( )
   {
      /* 'CONSIGUE ULTIMO PRECIO GENERAL' Routine */
      AV281GXLvl973 = (byte)(0) ;
      /* Using cursor H002I26 */
      pr_default.execute(24, new Object[] {new Long(AV15ACRCPAPRID)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A142ACMVOIPRID = H002I26_A142ACMVOIPRID[0] ;
         n142ACMVOIPRID = H002I26_n142ACMVOIPRID[0] ;
         A139ACACSGID = H002I26_A139ACACSGID[0] ;
         n139ACACSGID = H002I26_n139ACACSGID[0] ;
         A43ACMVOIDOC = H002I26_A43ACMVOIDOC[0] ;
         A20CNTDOCID = H002I26_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I26_A5939CNCIASID[0] ;
         A150ACMVOIPRE = H002I26_A150ACMVOIPRE[0] ;
         n150ACMVOIPRE = H002I26_n150ACMVOIPRE[0] ;
         A162ACMVOIUB1 = H002I26_A162ACMVOIUB1[0] ;
         n162ACMVOIUB1 = H002I26_n162ACMVOIUB1[0] ;
         A208ACMVOIFDO2 = H002I26_A208ACMVOIFDO2[0] ;
         n208ACMVOIFDO2 = H002I26_n208ACMVOIFDO2[0] ;
         AV281GXLvl973 = (byte)(1) ;
         AV63ACRCPAULPCM = A150ACMVOIPRE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ACRCPAULPCM", GXutil.ltrim( GXutil.str( AV63ACRCPAULPCM, 15, 2)));
         AV164UltimoPrecio = GXutil.str( AV63ACRCPAULPCM, 15, 2) ;
         AV141ACMVOIUB1 = A162ACMVOIUB1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141ACMVOIUB1", AV141ACMVOIUB1);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(24);
      }
      pr_default.close(24);
      if ( AV281GXLvl973 == 0 )
      {
         AV63ACRCPAULPCM = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ACRCPAULPCM", GXutil.ltrim( GXutil.str( AV63ACRCPAULPCM, 15, 2)));
         AV164UltimoPrecio = GXutil.str( AV63ACRCPAULPCM, 15, 2) ;
      }
   }

   public void S196( )
   {
      /* 'CONSIGUE ULTIMO PRECIO CIA' Routine */
      AV282GXLvl990 = (byte)(0) ;
      /* Using cursor H002I27 */
      pr_default.execute(25, new Object[] {new Long(AV11ACRCPACIA), new Long(AV15ACRCPAPRID)});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A5939CNCIASID = H002I27_A5939CNCIASID[0] ;
         A142ACMVOIPRID = H002I27_A142ACMVOIPRID[0] ;
         n142ACMVOIPRID = H002I27_n142ACMVOIPRID[0] ;
         A139ACACSGID = H002I27_A139ACACSGID[0] ;
         n139ACACSGID = H002I27_n139ACACSGID[0] ;
         A43ACMVOIDOC = H002I27_A43ACMVOIDOC[0] ;
         A20CNTDOCID = H002I27_A20CNTDOCID[0] ;
         A150ACMVOIPRE = H002I27_A150ACMVOIPRE[0] ;
         n150ACMVOIPRE = H002I27_n150ACMVOIPRE[0] ;
         A162ACMVOIUB1 = H002I27_A162ACMVOIUB1[0] ;
         n162ACMVOIUB1 = H002I27_n162ACMVOIUB1[0] ;
         A208ACMVOIFDO2 = H002I27_A208ACMVOIFDO2[0] ;
         n208ACMVOIFDO2 = H002I27_n208ACMVOIFDO2[0] ;
         AV282GXLvl990 = (byte)(1) ;
         AV63ACRCPAULPCM = A150ACMVOIPRE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ACRCPAULPCM", GXutil.ltrim( GXutil.str( AV63ACRCPAULPCM, 15, 2)));
         AV164UltimoPrecio = GXutil.str( AV63ACRCPAULPCM, 15, 2) ;
         AV141ACMVOIUB1 = A162ACMVOIUB1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141ACMVOIUB1", AV141ACMVOIUB1);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(25);
      }
      pr_default.close(25);
      if ( AV282GXLvl990 == 0 )
      {
         AV63ACRCPAULPCM = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ACRCPAULPCM", GXutil.ltrim( GXutil.str( AV63ACRCPAULPCM, 15, 2)));
         AV164UltimoPrecio = GXutil.str( AV63ACRCPAULPCM, 15, 2) ;
      }
   }

   public void S216( )
   {
      /* 'OBTENER PRESUPUESTADO' Routine */
      AV283GXLvl1007 = (byte)(0) ;
      /* Using cursor H002I28 */
      pr_default.execute(26, new Object[] {new Long(AV15ACRCPAPRID), AV141ACMVOIUB1});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A7705EXPINSPROY = H002I28_A7705EXPINSPROY[0] ;
         A7704EXPINSPROD = H002I28_A7704EXPINSPROD[0] ;
         A7710EXPINSCAN = H002I28_A7710EXPINSCAN[0] ;
         n7710EXPINSCAN = H002I28_n7710EXPINSCAN[0] ;
         AV283GXLvl1007 = (byte)(1) ;
         AV62ACRCPAQTYP = A7710EXPINSCAN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62ACRCPAQTYP", GXutil.ltrim( GXutil.str( AV62ACRCPAQTYP, 17, 6)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
      if ( AV283GXLvl1007 == 0 )
      {
         AV62ACRCPAQTYP = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62ACRCPAQTYP", GXutil.ltrim( GXutil.str( AV62ACRCPAQTYP, 17, 6)));
      }
   }

   public void S186( )
   {
      /* 'RECUPERACANTIDADOCEMP' Routine */
      AV60ACRCPAQTYOC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60ACRCPAQTYOC", GXutil.ltrim( GXutil.str( AV60ACRCPAQTYOC, 17, 6)));
      AV59ACRCPAQTYR = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqtyr_Internalname, GXutil.ltrim( GXutil.str( AV59ACRCPAQTYR, 17, 6)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
      AV61ACRCPAQTYRC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61ACRCPAQTYRC", GXutil.ltrim( GXutil.str( AV61ACRCPAQTYRC, 17, 6)));
      pr_default.dynParam(27, new Object[]{ new Object[]{
                                           AV138Homologado ,
                                           new Long(A412PMCRPRCIA) ,
                                           new Long(AV11ACRCPACIA) ,
                                           new Long(A370PMCRPRPROD) ,
                                           new Long(AV15ACRCPAPRID) ,
                                           A415PMCRPREST ,
                                           AV146PMCRPREST ,
                                           AV45PMCTPRID ,
                                           A171PMCTPRID } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      } ) ;
      /* Using cursor H002I29 */
      pr_default.execute(27, new Object[] {AV45PMCTPRID, new Long(AV15ACRCPAPRID), AV146PMCRPREST, new Long(AV11ACRCPACIA)});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A415PMCRPREST = H002I29_A415PMCRPREST[0] ;
         n415PMCRPREST = H002I29_n415PMCRPREST[0] ;
         A370PMCRPRPROD = H002I29_A370PMCRPRPROD[0] ;
         n370PMCRPRPROD = H002I29_n370PMCRPRPROD[0] ;
         A171PMCTPRID = H002I29_A171PMCTPRID[0] ;
         n171PMCTPRID = H002I29_n171PMCTPRID[0] ;
         A412PMCRPRCIA = H002I29_A412PMCRPRCIA[0] ;
         A362PMTPOPID = H002I29_A362PMTPOPID[0] ;
         n362PMTPOPID = H002I29_n362PMTPOPID[0] ;
         A355PMCRPRQTY = H002I29_A355PMCRPRQTY[0] ;
         n355PMCRPRQTY = H002I29_n355PMCRPRQTY[0] ;
         A351PMCRPRTDC = H002I29_A351PMCRPRTDC[0] ;
         if ( GXutil.strcmp(A362PMTPOPID, "REQ") == 0 )
         {
            AV59ACRCPAQTYR = AV59ACRCPAQTYR.add(A355PMCRPRQTY) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqtyr_Internalname, GXutil.ltrim( GXutil.str( AV59ACRCPAQTYR, 17, 6)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPAQTYR"+"_"+sGXsfl_83_idx, getSecureSignedToken( sGXsfl_83_idx, localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")));
         }
         else if ( GXutil.strcmp(A362PMTPOPID, "OC") == 0 )
         {
            if ( GXutil.strcmp(A351PMCRPRTDC, "OMP") == 0 )
            {
               AV60ACRCPAQTYOC = AV60ACRCPAQTYOC.add(A355PMCRPRQTY) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60ACRCPAQTYOC", GXutil.ltrim( GXutil.str( AV60ACRCPAQTYOC, 17, 6)));
            }
         }
         else if ( GXutil.strcmp(A362PMTPOPID, "REC") == 0 )
         {
            AV61ACRCPAQTYRC = AV61ACRCPAQTYRC.add(A355PMCRPRQTY) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61ACRCPAQTYRC", GXutil.ltrim( GXutil.str( AV61ACRCPAQTYRC, 17, 6)));
         }
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   public void e182I2( )
   {
      /* 'ActualizarCantidad' Routine */
      new com.kdsproyectos.acrcpa02(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV16ACRCPAQTY) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
      httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaqty_Internalname, GXutil.ltrim( GXutil.str( AV16ACRCPAQTY, 17, 6)));
      this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Cantidad Requisitada Actualizada"});
      gxgrgrid1_refresh( AV192ACRCOIACD, AV193CGUNNGID, AV99ACRCOININKIT_AUX, A272ACRCPALIN, A269ACRCPACIA, AV11ACRCPACIA, A270ACRCPATDC, AV17ACRCPATDC, A271ACRCPADOC, AV12ACRCPADOC, A2380ACRCPAEST, AV175ValImportanteUrgente, AV98ACRCOININKIT, A328ACRCPAPRID, A329ACRCPAQTY, A330ACRCPAUM, A331ACRCPAFREQ, A326ACRCPAUSSOL, AV59ACRCPAQTYR, AV60ACRCPAQTYOC, A817ACRCPACNRQPDIAS, A3902ACRCPAOBS, A10945ACRCPAPRECOT, A10946ACRCPAPREPRO, AV138Homologado, AV63ACRCPAULPCM, AV61ACRCPAQTYRC, AV62ACRCPAQTYP, AV64ACRCPAVACMEST, AV65ACRCPACNRQPDIAS, AV13ACRCPAFREQ, Gx_date, AV15ACRCPAPRID, AV190AutorizarTod, AV115Propietario, AV6CNUSERID, A383PMPRCNBASE, A384PMPRCNPERT, A394PMPRCNPERTN2, A395PMPRCNPERTN3, A396PMPRCNPERTN4, A397PMPRCNPERTN5, A171PMCTPRID, AV45PMCTPRID, A381PMCTCGCLASE, A379PMAGCCID, A348PMCTCGID, A349PMCTCGDSC, A5939CNCIASID, A20CNTDOCID, A266ACRCOIDOC, A267ACRCOILIN, AV14ACRCPALIN, A8585ACRCOIURG, A8586ACRCOIIMP, A325ACRCOIFRE2, A893ACRCOININKIT, AV126ACRCOIDIAS, AV127ACRCOIRFINI, AV128ACRCOIRFFIN, AV129ACRCOIRPER, A322ACRCOIUB4, A1366ACRCOIA2D, AV188PermiteCambioCtaCgo, A268ACRCOIPRID, A3INPR01DSC, A2INPR02DSC, A5682ACRCOIS001, A6988ACRCOIDIAS, A8447ACRCOIRFINI, A8448ACRCOIRFFIN, A8557ACRCOIRPER, A710INPR07ID, A10967SUBFAMID, A10968SUBFAMDSC, AV108TipoPresupuesto, AV78Comprometido, AV105ComprometidoM, A362PMTPOPID, A415PMCRPREST, A359PMCRPRMN, AV80Presupuestado, AV104presupuestadoM, A412PMCRPRCIA, A370PMCRPRPROD, AV146PMCRPREST, A355PMCRPRQTY, A351PMCRPRTDC, A208ACMVOIFDO2, A43ACMVOIDOC, A142ACMVOIPRID, A139ACACSGID, A150ACMVOIPRE, A162ACMVOIUB1, A7704EXPINSPROD, A7705EXPINSPROY, AV141ACMVOIUB1, A7710EXPINSCAN, A889PMRCKTDOC, A890PMRCKTIDKIT, A891PMRCKTQTYREQ, AV56ACRCOIDSC4, A756ACRCOIDSC4, AV234ACRCOICONSER, A323ACRCOIALM, A10943ACRCOIPRECOT, A281INPRODID, A712INPR09ID, AV125PERIODODSC, A5881PERIODOID, A5882PERIODODSC, AV81ACRCPACTCG, A350PMPRCNPRES, A6204PMPRCNMANIO, AV109PACRCPAFREQ, A6205PMPRCNMMES, A6208PMPRCNMPERTN3, AV110PMPRCNMPERTN3, A6209PMPRCNMPERTN4, AV111PMPRCNMPERTN4, A6213PMPRCNMPRES, AV23CNCIASID, AV163OmitirEnvioCorreo, AV245EnviarCorreoOC, AV201generarValeAutomatico, AV22CNCIASDSC, AV121Proyecto, AV120UsuarioSol, AV221ServidorSMTP, AV223correoEnvia, AV224contrasenaEnvia, AV222puerto) ;
   }

   public void e192I2( )
   {
      /* 'GuardaObservaciones' Routine */
      new com.kdsproyectos.acrcpa01(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV103ACRCPAOBS) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
      httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpaobs_Internalname, AV103ACRCPAOBS);
      this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Proceso Terminado."});
   }

   public void S146( )
   {
      /* 'OBTENCION DE IMPORTANCIA / URGENCIA' Routine */
      /* Using cursor H002I30 */
      pr_default.execute(28, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV14ACRCPALIN});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A267ACRCOILIN = H002I30_A267ACRCOILIN[0] ;
         A266ACRCOIDOC = H002I30_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I30_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I30_A5939CNCIASID[0] ;
         A8585ACRCOIURG = H002I30_A8585ACRCOIURG[0] ;
         n8585ACRCOIURG = H002I30_n8585ACRCOIURG[0] ;
         A8586ACRCOIIMP = H002I30_A8586ACRCOIIMP[0] ;
         n8586ACRCOIIMP = H002I30_n8586ACRCOIIMP[0] ;
         A325ACRCOIFRE2 = H002I30_A325ACRCOIFRE2[0] ;
         n325ACRCOIFRE2 = H002I30_n325ACRCOIFRE2[0] ;
         AV171TEM_ACRCOIURG = A8585ACRCOIURG ;
         AV172TEM_ACRCOIIMP = A8586ACRCOIIMP ;
         AV174TEM_ACRCOIFRE2 = A325ACRCOIFRE2 ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(28);
      if ( (GXutil.strcmp("", AV171TEM_ACRCOIURG)==0) )
      {
      }
      else
      {
         if ( GXutil.strcmp(AV171TEM_ACRCOIURG, "SI") == 0 )
         {
         }
         else
         {
         }
      }
      if ( (GXutil.strcmp("", AV172TEM_ACRCOIIMP)==0) )
      {
      }
      else
      {
         if ( GXutil.strcmp(AV172TEM_ACRCOIIMP, "SI") == 0 )
         {
         }
         else
         {
         }
      }
   }

   public void S132( )
   {
      /* 'COMBO CUENTA DE CARGO' Routine */
      cmbavAcrcpactcg.removeAllItems();
      cmbavAcrcpactcg.addItem("CLIINS", "Provee Cliente", (short)(0));
      /* Using cursor H002I31 */
      pr_default.execute(29, new Object[] {AV45PMCTPRID});
      while ( (pr_default.getStatus(29) != 101) )
      {
         A379PMAGCCID = H002I31_A379PMAGCCID[0] ;
         A381PMCTCGCLASE = H002I31_A381PMCTCGCLASE[0] ;
         n381PMCTCGCLASE = H002I31_n381PMCTCGCLASE[0] ;
         A171PMCTPRID = H002I31_A171PMCTPRID[0] ;
         n171PMCTPRID = H002I31_n171PMCTPRID[0] ;
         A348PMCTCGID = H002I31_A348PMCTCGID[0] ;
         A349PMCTCGDSC = H002I31_A349PMCTCGDSC[0] ;
         n349PMCTCGDSC = H002I31_n349PMCTCGDSC[0] ;
         A397PMPRCNPERTN5 = H002I31_A397PMPRCNPERTN5[0] ;
         A396PMPRCNPERTN4 = H002I31_A396PMPRCNPERTN4[0] ;
         A395PMPRCNPERTN3 = H002I31_A395PMPRCNPERTN3[0] ;
         A394PMPRCNPERTN2 = H002I31_A394PMPRCNPERTN2[0] ;
         A384PMPRCNPERT = H002I31_A384PMPRCNPERT[0] ;
         A383PMPRCNBASE = H002I31_A383PMPRCNBASE[0] ;
         A379PMAGCCID = H002I31_A379PMAGCCID[0] ;
         A381PMCTCGCLASE = H002I31_A381PMCTCGCLASE[0] ;
         n381PMCTCGCLASE = H002I31_n381PMCTCGCLASE[0] ;
         A349PMCTCGDSC = H002I31_A349PMCTCGDSC[0] ;
         n349PMCTCGDSC = H002I31_n349PMCTCGDSC[0] ;
         AV178PMCTCGID_C = A348PMCTCGID ;
         AV186PMCTCGDSC_C = A349PMCTCGDSC ;
         if ( ( A383PMPRCNBASE != 0 ) && ( A384PMPRCNPERT.doubleValue() == 0 ) && ( A394PMPRCNPERTN2.doubleValue() == 0 ) && ( A395PMPRCNPERTN3.doubleValue() == 0 ) && ( A396PMPRCNPERTN4.doubleValue() == 0 ) && ( A397PMPRCNPERTN5.doubleValue() == 0 ) )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = DecimalUtil.doubleToDec(0) ;
            AV181PMPRCNPERTN2 = DecimalUtil.doubleToDec(0) ;
            AV182PMPRCNPERTN3 = DecimalUtil.doubleToDec(0) ;
            AV183PMPRCNPERTN4 = DecimalUtil.doubleToDec(0) ;
         }
         if ( ( A384PMPRCNPERT.doubleValue() != 0 ) && ( A394PMPRCNPERTN2.doubleValue() == 0 ) && ( A395PMPRCNPERTN3.doubleValue() == 0 ) && ( A396PMPRCNPERTN4.doubleValue() == 0 ) && ( A397PMPRCNPERTN5.doubleValue() == 0 ) )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = DecimalUtil.doubleToDec(0) ;
            AV181PMPRCNPERTN2 = DecimalUtil.doubleToDec(0) ;
            AV182PMPRCNPERTN3 = DecimalUtil.doubleToDec(0) ;
            AV183PMPRCNPERTN4 = DecimalUtil.doubleToDec(0) ;
         }
         if ( ( A394PMPRCNPERTN2.doubleValue() != 0 ) && ( A395PMPRCNPERTN3.doubleValue() == 0 ) && ( A396PMPRCNPERTN4.doubleValue() == 0 ) && ( A397PMPRCNPERTN5.doubleValue() == 0 ) )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = A384PMPRCNPERT ;
            AV181PMPRCNPERTN2 = DecimalUtil.doubleToDec(0) ;
            AV182PMPRCNPERTN3 = DecimalUtil.doubleToDec(0) ;
            AV183PMPRCNPERTN4 = DecimalUtil.doubleToDec(0) ;
         }
         if ( ( A395PMPRCNPERTN3.doubleValue() != 0 ) && ( A396PMPRCNPERTN4.doubleValue() == 0 ) && ( A397PMPRCNPERTN5.doubleValue() == 0 ) )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = A384PMPRCNPERT ;
            AV181PMPRCNPERTN2 = A394PMPRCNPERTN2 ;
            AV182PMPRCNPERTN3 = DecimalUtil.doubleToDec(0) ;
            AV183PMPRCNPERTN4 = DecimalUtil.doubleToDec(0) ;
         }
         if ( ( A396PMPRCNPERTN4.doubleValue() != 0 ) && ( A397PMPRCNPERTN5.doubleValue() == 0 ) )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = A384PMPRCNPERT ;
            AV181PMPRCNPERTN2 = A394PMPRCNPERTN2 ;
            AV182PMPRCNPERTN3 = A395PMPRCNPERTN3 ;
            AV183PMPRCNPERTN4 = DecimalUtil.doubleToDec(0) ;
         }
         if ( A397PMPRCNPERTN5.doubleValue() != 0 )
         {
            AV179PMPRCNBASE = A383PMPRCNBASE ;
            AV180PMPRCNPERT = A384PMPRCNPERT ;
            AV181PMPRCNPERTN2 = A394PMPRCNPERTN2 ;
            AV182PMPRCNPERTN3 = A395PMPRCNPERTN3 ;
            AV183PMPRCNPERTN4 = A396PMPRCNPERTN4 ;
         }
         cmbavAcrcpactcg.addItem(AV178PMCTCGID_C, AV186PMCTCGDSC_C, (short)(0));
         pr_default.readNext(29);
      }
      pr_default.close(29);
   }

   public void e202I2( )
   {
      /* 'ActualizaCtaCgo' Routine */
      new com.kdsproyectos.acrcoi08(remoteHandle, context).execute( AV11ACRCPACIA, AV17ACRCPATDC, AV12ACRCPADOC, AV14ACRCPALIN, AV81ACRCPACTCG) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
      httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
      httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
      gxgrgrid1_refresh( AV192ACRCOIACD, AV193CGUNNGID, AV99ACRCOININKIT_AUX, A272ACRCPALIN, A269ACRCPACIA, AV11ACRCPACIA, A270ACRCPATDC, AV17ACRCPATDC, A271ACRCPADOC, AV12ACRCPADOC, A2380ACRCPAEST, AV175ValImportanteUrgente, AV98ACRCOININKIT, A328ACRCPAPRID, A329ACRCPAQTY, A330ACRCPAUM, A331ACRCPAFREQ, A326ACRCPAUSSOL, AV59ACRCPAQTYR, AV60ACRCPAQTYOC, A817ACRCPACNRQPDIAS, A3902ACRCPAOBS, A10945ACRCPAPRECOT, A10946ACRCPAPREPRO, AV138Homologado, AV63ACRCPAULPCM, AV61ACRCPAQTYRC, AV62ACRCPAQTYP, AV64ACRCPAVACMEST, AV65ACRCPACNRQPDIAS, AV13ACRCPAFREQ, Gx_date, AV15ACRCPAPRID, AV190AutorizarTod, AV115Propietario, AV6CNUSERID, A383PMPRCNBASE, A384PMPRCNPERT, A394PMPRCNPERTN2, A395PMPRCNPERTN3, A396PMPRCNPERTN4, A397PMPRCNPERTN5, A171PMCTPRID, AV45PMCTPRID, A381PMCTCGCLASE, A379PMAGCCID, A348PMCTCGID, A349PMCTCGDSC, A5939CNCIASID, A20CNTDOCID, A266ACRCOIDOC, A267ACRCOILIN, AV14ACRCPALIN, A8585ACRCOIURG, A8586ACRCOIIMP, A325ACRCOIFRE2, A893ACRCOININKIT, AV126ACRCOIDIAS, AV127ACRCOIRFINI, AV128ACRCOIRFFIN, AV129ACRCOIRPER, A322ACRCOIUB4, A1366ACRCOIA2D, AV188PermiteCambioCtaCgo, A268ACRCOIPRID, A3INPR01DSC, A2INPR02DSC, A5682ACRCOIS001, A6988ACRCOIDIAS, A8447ACRCOIRFINI, A8448ACRCOIRFFIN, A8557ACRCOIRPER, A710INPR07ID, A10967SUBFAMID, A10968SUBFAMDSC, AV108TipoPresupuesto, AV78Comprometido, AV105ComprometidoM, A362PMTPOPID, A415PMCRPREST, A359PMCRPRMN, AV80Presupuestado, AV104presupuestadoM, A412PMCRPRCIA, A370PMCRPRPROD, AV146PMCRPREST, A355PMCRPRQTY, A351PMCRPRTDC, A208ACMVOIFDO2, A43ACMVOIDOC, A142ACMVOIPRID, A139ACACSGID, A150ACMVOIPRE, A162ACMVOIUB1, A7704EXPINSPROD, A7705EXPINSPROY, AV141ACMVOIUB1, A7710EXPINSCAN, A889PMRCKTDOC, A890PMRCKTIDKIT, A891PMRCKTQTYREQ, AV56ACRCOIDSC4, A756ACRCOIDSC4, AV234ACRCOICONSER, A323ACRCOIALM, A10943ACRCOIPRECOT, A281INPRODID, A712INPR09ID, AV125PERIODODSC, A5881PERIODOID, A5882PERIODODSC, AV81ACRCPACTCG, A350PMPRCNPRES, A6204PMPRCNMANIO, AV109PACRCPAFREQ, A6205PMPRCNMMES, A6208PMPRCNMPERTN3, AV110PMPRCNMPERTN3, A6209PMPRCNMPERTN4, AV111PMPRCNMPERTN4, A6213PMPRCNMPRES, AV23CNCIASID, AV163OmitirEnvioCorreo, AV245EnviarCorreoOC, AV201generarValeAutomatico, AV22CNCIASDSC, AV121Proyecto, AV120UsuarioSol, AV221ServidorSMTP, AV223correoEnvia, AV224contrasenaEnvia, AV222puerto) ;
   }

   public void S292( )
   {
      /* 'CIERRA VALE' Routine */
      AV194CNTDOCID = "VAL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV194CNTDOCID", AV194CNTDOCID);
      /* Execute user subroutine: 'REVISAINVENTARIABLES' */
      S332 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV232existeInv, "S") == 0 )
      {
         GXv_char4[0] = AV45PMCTPRID ;
         GXv_char2[0] = AV214ACRCOIALID ;
         GXv_char7[0] = "" ;
         GXv_int8[0] = (int)(AV227ACRCOIUSRREC) ;
         GXv_int9[0] = 0 ;
         GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV6CNUSERID ;
         GXv_char11[0] = "CABREQ" ;
         GXv_int12[0] = AV196GEDEVAID_registrado ;
         GXv_char13[0] = AV17ACRCPATDC ;
         GXv_int14[0] = AV12ACRCPADOC ;
         GXv_char15[0] = "" ;
         GXv_int6[0] = (short)(0) ;
         GXv_char16[0] = "" ;
         new com.kdsproyectos.pptgedeva(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_char7, GXv_int8, GXv_int9, GXv_decimal3, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_char15, GXv_int6, AV194CNTDOCID, GXv_char16, "", "", DecimalUtil.doubleToDec(0), 0, 0, 0, "", "", "", (short)(0), "") ;
         wautreq_impl.this.AV45PMCTPRID = GXv_char4[0] ;
         wautreq_impl.this.AV214ACRCOIALID = GXv_char2[0] ;
         wautreq_impl.this.AV227ACRCOIUSRREC = GXv_int8[0] ;
         wautreq_impl.this.AV6CNUSERID = GXv_char10[0] ;
         wautreq_impl.this.AV196GEDEVAID_registrado = GXv_int12[0] ;
         wautreq_impl.this.AV17ACRCPATDC = GXv_char13[0] ;
         wautreq_impl.this.AV12ACRCPADOC = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
         httpContext.ajax_rsp_assign_attri("", false, "AV214ACRCOIALID", AV214ACRCOIALID);
         httpContext.ajax_rsp_assign_attri("", false, "AV227ACRCOIUSRREC", GXutil.ltrim( GXutil.str( AV227ACRCOIUSRREC, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
         httpContext.ajax_rsp_assign_attri("", false, "AV196GEDEVAID_registrado", GXutil.ltrim( GXutil.str( AV196GEDEVAID_registrado, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
         httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV194CNTDOCID", AV194CNTDOCID);
         /* Using cursor H002I32 */
         pr_default.execute(30, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC)});
         while ( (pr_default.getStatus(30) != 101) )
         {
            A281INPRODID = H002I32_A281INPRODID[0] ;
            A1148INTPALID = H002I32_A1148INTPALID[0] ;
            n1148INTPALID = H002I32_n1148INTPALID[0] ;
            A139ACACSGID = H002I32_A139ACACSGID[0] ;
            n139ACACSGID = H002I32_n139ACACSGID[0] ;
            A135ACACTLID = H002I32_A135ACACTLID[0] ;
            n135ACACTLID = H002I32_n135ACACTLID[0] ;
            A266ACRCOIDOC = H002I32_A266ACRCOIDOC[0] ;
            A20CNTDOCID = H002I32_A20CNTDOCID[0] ;
            A5939CNCIASID = H002I32_A5939CNCIASID[0] ;
            A267ACRCOILIN = H002I32_A267ACRCOILIN[0] ;
            A7804INPRODCPNAC = H002I32_A7804INPRODCPNAC[0] ;
            n7804INPRODCPNAC = H002I32_n7804INPRODCPNAC[0] ;
            A306ACRCOIALID = H002I32_A306ACRCOIALID[0] ;
            n306ACRCOIALID = H002I32_n306ACRCOIALID[0] ;
            A322ACRCOIUB4 = H002I32_A322ACRCOIUB4[0] ;
            n322ACRCOIUB4 = H002I32_n322ACRCOIUB4[0] ;
            A268ACRCOIPRID = H002I32_A268ACRCOIPRID[0] ;
            n268ACRCOIPRID = H002I32_n268ACRCOIPRID[0] ;
            A314ACRCOIQTO = H002I32_A314ACRCOIQTO[0] ;
            n314ACRCOIQTO = H002I32_n314ACRCOIQTO[0] ;
            A282INUMBAID = H002I32_A282INUMBAID[0] ;
            n282INUMBAID = H002I32_n282INUMBAID[0] ;
            A756ACRCOIDSC4 = H002I32_A756ACRCOIDSC4[0] ;
            n756ACRCOIDSC4 = H002I32_n756ACRCOIDSC4[0] ;
            A954ACRCOIUNGD = H002I32_A954ACRCOIUNGD[0] ;
            n954ACRCOIUNGD = H002I32_n954ACRCOIUNGD[0] ;
            A306ACRCOIALID = H002I32_A306ACRCOIALID[0] ;
            n306ACRCOIALID = H002I32_n306ACRCOIALID[0] ;
            A1148INTPALID = H002I32_A1148INTPALID[0] ;
            n1148INTPALID = H002I32_n1148INTPALID[0] ;
            A7804INPRODCPNAC = H002I32_A7804INPRODCPNAC[0] ;
            n7804INPRODCPNAC = H002I32_n7804INPRODCPNAC[0] ;
            A282INUMBAID = H002I32_A282INUMBAID[0] ;
            n282INUMBAID = H002I32_n282INUMBAID[0] ;
            AV14ACRCPALIN = DecimalUtil.doubleToDec(A267ACRCOILIN) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAcrcpalin_Internalname, GXutil.ltrim( GXutil.str( AV14ACRCPALIN, 7, 3)));
            AV210INPRODCPNAC = A7804INPRODCPNAC ;
            GXv_char16[0] = AV45PMCTPRID ;
            GXv_char15[0] = A306ACRCOIALID ;
            GXv_char13[0] = A322ACRCOIUB4 ;
            GXv_int8[0] = (int)(AV227ACRCOIUSRREC) ;
            GXv_int14[0] = A268ACRCOIPRID ;
            GXv_decimal3[0] = A314ACRCOIQTO ;
            GXv_char11[0] = AV6CNUSERID ;
            GXv_char10[0] = "DETREQ" ;
            GXv_int12[0] = AV196GEDEVAID_registrado ;
            GXv_char7[0] = AV17ACRCPATDC ;
            GXv_int9[0] = AV12ACRCPADOC ;
            GXv_char4[0] = AV206EXPINSTIP ;
            GXv_int6[0] = (short)(0) ;
            GXv_char2[0] = "" ;
            new com.kdsproyectos.pptgedeva(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_char13, GXv_int8, GXv_int14, GXv_decimal3, GXv_char11, GXv_char10, GXv_int12, GXv_char7, GXv_int9, GXv_char4, GXv_int6, AV194CNTDOCID, GXv_char2, A282INUMBAID, "", DecimalUtil.doubleToDec(0), 0, 0, 0, A756ACRCOIDSC4, "", A954ACRCOIUNGD, (short)(A267ACRCOILIN), "N") ;
            wautreq_impl.this.AV45PMCTPRID = GXv_char16[0] ;
            wautreq_impl.this.A306ACRCOIALID = GXv_char15[0] ;
            wautreq_impl.this.A322ACRCOIUB4 = GXv_char13[0] ;
            wautreq_impl.this.AV227ACRCOIUSRREC = GXv_int8[0] ;
            wautreq_impl.this.A268ACRCOIPRID = GXv_int14[0] ;
            wautreq_impl.this.A314ACRCOIQTO = GXv_decimal3[0] ;
            wautreq_impl.this.AV6CNUSERID = GXv_char11[0] ;
            wautreq_impl.this.AV196GEDEVAID_registrado = GXv_int12[0] ;
            wautreq_impl.this.AV17ACRCPATDC = GXv_char7[0] ;
            wautreq_impl.this.AV12ACRCPADOC = GXv_int9[0] ;
            wautreq_impl.this.AV206EXPINSTIP = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
            httpContext.ajax_rsp_assign_attri("", false, "A306ACRCOIALID", A306ACRCOIALID);
            httpContext.ajax_rsp_assign_attri("", false, "A322ACRCOIUB4", A322ACRCOIUB4);
            httpContext.ajax_rsp_assign_attri("", false, "AV227ACRCOIUSRREC", GXutil.ltrim( GXutil.str( AV227ACRCOIUSRREC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A268ACRCOIPRID", GXutil.ltrim( GXutil.str( A268ACRCOIPRID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A314ACRCOIQTO", GXutil.ltrim( GXutil.str( A314ACRCOIQTO, 17, 6)));
            httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
            httpContext.ajax_rsp_assign_attri("", false, "AV196GEDEVAID_registrado", GXutil.ltrim( GXutil.str( AV196GEDEVAID_registrado, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
            httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV206EXPINSTIP", AV206EXPINSTIP);
            httpContext.ajax_rsp_assign_attri("", false, "AV194CNTDOCID", AV194CNTDOCID);
            httpContext.ajax_rsp_assign_attri("", false, "A282INUMBAID", A282INUMBAID);
            httpContext.ajax_rsp_assign_attri("", false, "A756ACRCOIDSC4", A756ACRCOIDSC4);
            httpContext.ajax_rsp_assign_attri("", false, "A954ACRCOIUNGD", A954ACRCOIUNGD);
            httpContext.ajax_rsp_assign_attri("", false, "A267ACRCOILIN", GXutil.ltrim( GXutil.str( A267ACRCOILIN, 7, 0)));
            pr_default.readNext(30);
         }
         pr_default.close(30);
         GXv_char16[0] = AV194CNTDOCID ;
         GXv_char15[0] = AV195CNTDOCDSC ;
         GXv_char13[0] = "" ;
         GXv_char11[0] = "" ;
         new com.kdsproyectos.ac058(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_char13, GXv_char11) ;
         wautreq_impl.this.AV194CNTDOCID = GXv_char16[0] ;
         wautreq_impl.this.AV195CNTDOCDSC = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV194CNTDOCID", AV194CNTDOCID);
         httpContext.ajax_rsp_assign_attri("", false, "AV195CNTDOCDSC", AV195CNTDOCDSC);
         AV197MensajeMostrar = "Se registró el " + GXutil.trim( AV195CNTDOCDSC) + " No. " + GXutil.trim( GXutil.str( AV196GEDEVAID_registrado, 10, 0)) ;
         AV226nombre = GXutil.trim( AV194CNTDOCID) + " " + GXutil.trim( GXutil.str( AV196GEDEVAID_registrado, 10, 0)) + ".pdf" ;
         /* Window Datatype Object Property */
         AV57Window.setUrl( formatLink("com.kdsproyectos.apppsurtirvale") + "?" + GXutil.URLEncode(GXutil.rtrim(AV194CNTDOCID)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV196GEDEVAID_registrado,10,0))) );
         AV57Window.setReturnParms(new Object[] {});
         AV57Window.setAutoresize( 0 );
         AV57Window.setHeight( 600 );
         AV57Window.setWidth( 860 );
         httpContext.newWindow(AV57Window);
         AV198txtMensaje = AV197MensajeMostrar ;
         /* Using cursor H002I33 */
         pr_default.execute(31, new Object[] {AV194CNTDOCID, new Long(AV196GEDEVAID_registrado)});
         while ( (pr_default.getStatus(31) != 101) )
         {
            A7411GEDEVAID = H002I33_A7411GEDEVAID[0] ;
            A7410GEDEVADOC = H002I33_A7410GEDEVADOC[0] ;
            A7418GEDEVACOD = H002I33_A7418GEDEVACOD[0] ;
            n7418GEDEVACOD = H002I33_n7418GEDEVACOD[0] ;
            AV199codigobarra = "*" + GXutil.trim( A7418GEDEVACOD) + "*" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199codigobarra", AV199codigobarra);
            AV200codigobarra2 = GXutil.trim( A7418GEDEVACOD) ;
            pr_default.readNext(31);
         }
         pr_default.close(31);
         if ( GXutil.strcmp(AV163OmitirEnvioCorreo, "S") != 0 )
         {
            /* Execute user subroutine: 'ENVIACORREO' */
            S342 ();
            if (returnInSub) return;
         }
      }
   }

   public void S332( )
   {
      /* 'REVISAINVENTARIABLES' Routine */
      AV232existeInv = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV232existeInv", AV232existeInv);
      AV228INTPALID = "I" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV228INTPALID", AV228INTPALID);
      /* Using cursor H002I34 */
      pr_default.execute(32, new Object[] {new Long(AV11ACRCPACIA), AV17ACRCPATDC, new Long(AV12ACRCPADOC), AV228INTPALID});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A268ACRCOIPRID = H002I34_A268ACRCOIPRID[0] ;
         n268ACRCOIPRID = H002I34_n268ACRCOIPRID[0] ;
         A281INPRODID = H002I34_A281INPRODID[0] ;
         A1148INTPALID = H002I34_A1148INTPALID[0] ;
         n1148INTPALID = H002I34_n1148INTPALID[0] ;
         A139ACACSGID = H002I34_A139ACACSGID[0] ;
         n139ACACSGID = H002I34_n139ACACSGID[0] ;
         A135ACACTLID = H002I34_A135ACACTLID[0] ;
         n135ACACTLID = H002I34_n135ACACTLID[0] ;
         A266ACRCOIDOC = H002I34_A266ACRCOIDOC[0] ;
         A20CNTDOCID = H002I34_A20CNTDOCID[0] ;
         A5939CNCIASID = H002I34_A5939CNCIASID[0] ;
         A1148INTPALID = H002I34_A1148INTPALID[0] ;
         n1148INTPALID = H002I34_n1148INTPALID[0] ;
         AV232existeInv = "S" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV232existeInv", AV232existeInv);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(32);
      }
      pr_default.close(32);
   }

   public void S342( )
   {
      /* 'ENVIACORREO' Routine */
      AV77Asunto = "Generación de " + GXutil.trim( AV195CNTDOCDSC) + " N° " + GXutil.trim( GXutil.str( AV196GEDEVAID_registrado, 10, 0)) ;
      AV220cuerpo = "" + "	<!DOCTYPE html> " + "	<html lang=\"es\"> " + "	<head> " + "		<meta charset=\"utf-8\"> " + "		<title>Notificaciones de generación de vale</title> " + "		<style> " + "			.im { " + "				color: #000000; " + "			} " + "		</style> " + "	</head> " + "	<body> " + "  <table class=\"contenedor_principal\" style=\"font-family: arial;width: 100%;\"> " + "    <tbody> " + "      <tr> " + "        <td class=\"cabecero\" style=\"background-color: dodgerblue;color: white;padding: 10px;text-align: center;\"> " + "          <strong>KDS</strong> Notificaciones KDS " + "        </td> " + "      </tr> " + "      <tr> " + "        <td> " + "          <table class=\"contenido\" style=\"width: 600px;margin: auto;padding:5px;font-size: 18px;\"> " + "            <tbody> " + "              <tr> " + "                <td> " + "                  <p>Hola, <strong>" + GXutil.trim( AV75CNUSERDSC) + "</strong></p> " + "                  <p>Te informamos que haz generado el " + GXutil.trim( AV195CNTDOCDSC) + " No. " + GXutil.str( AV196GEDEVAID_registrado, 10, 0) + " <b>" + "                </td> " + "				</tr> " + "					<tr> " + "					  <td> " + "						<div style='text-align: center;'> " + "							<!-- insert your custom barcode setting your data in the GET parameter \"data\" -->" + "							<img alt='Barcode Generator TEC-IT' " + "							src='https://barcode.tec-it.com/barcode.ashx?data=" + GXutil.trim( AV199codigobarra) + "&code=Code39'/> " + "						</div> " + "					</td> " + "                </tr> " + "              <tr> " + "                <td> " + "                  <table class=\"tarjeta_actividad\" style=\"background-color: rgb(250,250,250);width: 100%;\"> " + "                    <tbody> " + "                      <tr> " + "                        <td class=\"contenido_actividad\" style=\"padding: 15px;\"> " + "                          <p><strong>Fecha de elaboración: </strong> " + localUtil.dtoc( Gx_date, 3, "/") + " </p> " + "                        </td> " + "                      </tr> " + "                    </tbody> " + "                  </table> " + "                </td> " + "              </tr> " + "				<tr> " + "					<td><p>Pasar al almacén a solicitar el surtido del " + GXutil.trim( AV195CNTDOCDSC) + "</p></td> " + "				</tr> " + "            </tbody> " + "          </table> " + "        </td> " + "      </tr> " + "    </tbody> " + "  </table> " + "	</body> " + "	</html> " ;
      GXv_int14[0] = 0 ;
      GXv_char16[0] = AV75CNUSERDSC ;
      GXv_char15[0] = AV211CNUSERIDMOB ;
      GXv_char13[0] = "" ;
      GXv_char11[0] = AV74CNCDIREM ;
      new com.kdsproyectos.kcon062(remoteHandle, context).execute( AV6CNUSERID, GXv_int14, GXv_char16, GXv_char15, GXv_char13, GXv_char11) ;
      wautreq_impl.this.AV75CNUSERDSC = GXv_char16[0] ;
      wautreq_impl.this.AV211CNUSERIDMOB = GXv_char15[0] ;
      wautreq_impl.this.AV74CNCDIREM = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "AV75CNUSERDSC", AV75CNUSERDSC);
      if ( ! (GXutil.strcmp("", AV74CNCDIREM)==0) )
      {
         AV212PDMEMNOTNOME = "Notificaciones de Vale" ;
         new com.kdsproyectos.enviarcorreo(remoteHandle, context).execute( AV221ServidorSMTP, AV223correoEnvia, AV212PDMEMNOTNOME, AV224contrasenaEnvia, AV74CNCDIREM, AV6CNUSERID, AV220cuerpo, AV77Asunto, AV222puerto) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV221ServidorSMTP", AV221ServidorSMTP);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSERVIDORSMTP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV221ServidorSMTP, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV223correoEnvia", AV223correoEnvia);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCORREOENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV223correoEnvia, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV224contrasenaEnvia", AV224contrasenaEnvia);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCONTRASENAENVIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV224contrasenaEnvia, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
         httpContext.ajax_rsp_assign_attri("", false, "AV222puerto", GXutil.ltrim( GXutil.str( AV222puerto, 5, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPUERTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV222puerto), "ZZZZ9")));
         new com.kdsproyectos.pnotapp(remoteHandle, context).execute( "KDSADMIN", "", AV6CNUSERID, AV211CNUSERIDMOB, AV212PDMEMNOTNOME, AV77Asunto, "NOR", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6CNUSERID", AV6CNUSERID);
      }
   }

   public void wb_table1_2_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xFFFFFF)) + ";" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 600, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1150, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblKdstablacontenido_Internalname, tblKdstablacontenido_Internalname, "", "mpHolder", 0, "center", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;height:40px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTitulopantalla_Internalname, "Autorización Requisiciones", "", "", lblTitulopantalla_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:16.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtguardar_Internalname, lblTxtguardar_Caption, "", "", lblTxtguardar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", "", "TextBlock", 5, "Guardar", 1, 1, (short)(1), "HLP_wautreq.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtlista_Internalname, lblTxtlista_Caption, "", "", lblTxtlista_Jsonclick, "'"+""+"'"+",false,"+"'"+"e212i1_client"+"'", "", "TextBlock", 7, "", 1, 1, (short)(1), "HLP_wautreq.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtregresar_Internalname, lblTxtregresar_Caption, "", "", lblTxtregresar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SALIR\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_wautreq.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtstyle_Internalname, lblTxtstyle_Caption, "", "", lblTxtstyle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         wb_table2_14_2I2( true) ;
      }
      else
      {
         wb_table2_14_2I2( false) ;
      }
      return  ;
   }

   public void wb_table2_14_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2I2e( true) ;
      }
      else
      {
         wb_table1_2_2I2e( false) ;
      }
   }

   public void wb_table2_14_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xFFFFFF)) + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1150, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "center", "", 1, 1, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "Datos Generales", "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#808080;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_20_2I2( true) ;
      }
      else
      {
         wb_table3_20_2I2( false) ;
      }
      return  ;
   }

   public void wb_table3_20_2I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;vertical-align:top")+"\">") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 1150, "px", 430, "px", "scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"83\">") ;
            sStyleString = "" ;
            com.kdsproyectos.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "dataTable", 0, "", "", 1, 2, sStyleString, "", "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Linea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha requerida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Insumo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 250, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Complemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 50, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "UM") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Requisitada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Autorizar") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 180, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cometarios") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 200, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones para autorización") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Etapa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 200, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cargo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Precio cotizado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "ACRCOININKIT") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Clasificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "INPR02 DSC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "INALMNDSC") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Días de asignación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Question") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "permite") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Presupuestado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Comprometido") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Disponible") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "presupuestado M") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Comprometido M") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Disponible M") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Precio propuesto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "precio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Requerida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Header", subGrid1_Header);
            Grid1Container.AddObjectProperty("Class", "dataTable");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14ACRCPALIN, (byte)(7), (byte)(3), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpalin_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV13ACRCPAFREQ, "99/99/99"));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpafreq_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15ACRCPAPRID, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaprid_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV39INPRODI2_P));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInprodi2_p_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV37INPRODDSC);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInproddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV56ACRCOIDSC4);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcoidsc4_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV18ACRCPAUM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaum_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16ACRCPAQTY, (byte)(18), (byte)(6), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaqty_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20Autorizar, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV8ACRCOIOBSAUT));
            Grid1Column.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavAcrcoiobsaut_Backcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV103ACRCPAOBS);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV81ACRCPACTCG));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavAcrcpactcg.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV192ACRCOIACD, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynavAcrcoiacd.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV193CGUNNGID));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( dynavCgunngid.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV231ACRCOIPRECOT, (byte)(18), (byte)(4), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcoiprecot_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV99ACRCOININKIT_AUX, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcoininkit_aux_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV177auxACRCPAQTY, (byte)(20), (byte)(6), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAuxacrcpaqty_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV165INPR01DSC_G));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInpr01dsc_g_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV166INPR02DSC_G));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInpr02dsc_g_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV162INALMNDSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInalmndsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV126ACRCOIDIAS, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcoidias_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV125PERIODODSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPeriododsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV167subfamdsc));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSubfamdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV159Question);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavQuestion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV117permite));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPermite_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80Presupuestado, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPresupuestado_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV78Comprometido, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavComprometido_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79Disponible, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDisponible_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV104presupuestadoM, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPresupuestadom_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV105ComprometidoM, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavComprometidom_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV106DisponibleM, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDisponiblem_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV143ACRCPAPREPRO, (byte)(18), (byte)(4), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaprepro_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV169precio));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecio_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59ACRCPAQTYR, (byte)(20), (byte)(6), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcrcpaqtyr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 83 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_83 = (short)(nGXsfl_83_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.kdsproyectos.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_14_2I2e( true) ;
      }
      else
      {
         wb_table2_14_2I2e( false) ;
      }
   }

   public void wb_table3_20_2I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 800, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable16_Internalname, tblTable16_Internalname, "", "card", 0, "center", "", 1, 4, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "N° Requisición", "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcrcpadoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV12ACRCPADOC, (byte)(10), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV12ACRCPADOC), "ZZZZZZZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcrcpadoc_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, 0, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, "Compañía", "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, dynavCnciasid, dynavCnciasid.getInternalname(), GXutil.trim( GXutil.str( AV23CNCIASID, 10, 0)), 1, dynavCnciasid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavCnciasid.getEnabled(), 0, (short)(0), 300, "px", 0, "", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,29);\"", "", true, "HLP_wautreq.htm");
         dynavCnciasid.setValue( GXutil.trim( GXutil.str( AV23CNCIASID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCnciasid.getInternalname(), "Values", dynavCnciasid.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "Solicita", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavUsuariosol_Internalname, GXutil.rtrim( AV120UsuarioSol), GXutil.rtrim( localUtil.format( AV120UsuarioSol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsuariosol_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, edtavUsuariosol_Enabled, 0, "text", "", 247, "px", 22, "px", 250, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, lblTextblock38_Caption, "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavProyecto_Internalname, GXutil.rtrim( AV121Proyecto), GXutil.rtrim( localUtil.format( AV121Proyecto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProyecto_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, edtavProyecto_Enabled, 0, "text", "", 243, "px", 24, "px", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "Justificación", "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
         ClassString = "Attribute" ;
         StyleString = "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavAcrcpacom_Internalname, AV124ACRCPACOM, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,43);\"", (short)(0), 1, edtavAcrcpacom_Enabled, 0, 362, "px", 44, "px", StyleString, ClassString, "", "", "2097152", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "Fecha requerida", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavF1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavF1_Internalname, localUtil.format(AV29F1, "99/99/99"), localUtil.format( AV29F1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavF1_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, edtavF1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wautreq.htm");
         com.kdsproyectos.GxWebStd.gx_bitmap( httpContext, edtavF1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavF1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_wautreq.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "Fecha de elaboración", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAcrcoifdoc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcrcoifdoc_Internalname, localUtil.format(AV118ACRCOIFDOC, "99/99/99"), localUtil.format( AV118ACRCOIFDOC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcrcoifdoc_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, edtavAcrcoifdoc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wautreq.htm");
         com.kdsproyectos.GxWebStd.gx_bitmap( httpContext, edtavAcrcoifdoc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAcrcoifdoc_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_wautreq.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "Autorizar Todos", "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#2323FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAutorizartod, cmbavAutorizartod.getInternalname(), GXutil.trim( GXutil.str( AV190AutorizarTod, 4, 0)), 1, cmbavAutorizartod.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVAUTORIZARTOD.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 0, "em", 0, "", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,59);\"", "", true, "HLP_wautreq.htm");
         cmbavAutorizartod.setValue( GXutil.trim( GXutil.str( AV190AutorizarTod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAutorizartod.getInternalname(), "Values", cmbavAutorizartod.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, "Lugar de Entrega", "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavLeinalmndsc_Internalname, GXutil.rtrim( AV230leINALMNDSC), GXutil.rtrim( localUtil.format( AV230leINALMNDSC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLeinalmndsc_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;", "", "", "", 1, edtavLeinalmndsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "Descripción de trabajo a realizar", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", lblTextblock32_Visible, 1, (short)(0), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavDsctrabajorealizar_Internalname, AV233dscTrabajoRealizar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,70);\"", (short)(0), edtavDsctrabajorealizar_Visible, edtavDsctrabajorealizar_Enabled, 1, 500, "px", 10, "row", StyleString, ClassString, "", "", "2097152", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtlinks_Internalname, lblTxtlinks_Caption, "", "", lblTxtlinks_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_wautreq.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucMensaje.setProperty("Title", Mensaje_Title);
         ucMensaje.render(context, "gxui.message", Mensaje_Internalname, "MENSAJEContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_20_2I2e( true) ;
      }
      else
      {
         wb_table3_20_2I2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV24CNESMNID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CNESMNID", AV24CNESMNID);
      AV11ACRCPACIA = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ACRCPACIA", GXutil.ltrim( GXutil.str( AV11ACRCPACIA, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACRCPACIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ACRCPACIA), "ZZZZZZZZZ9")));
      AV17ACRCPATDC = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ACRCPATDC", AV17ACRCPATDC);
      AV12ACRCPADOC = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ACRCPADOC", GXutil.ltrim( GXutil.str( AV12ACRCPADOC, 10, 0)));
      AV45PMCTPRID = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PMCTPRID", AV45PMCTPRID);
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa2I2( ) ;
      ws2I2( ) ;
      we2I2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("Shared/ext/resources/css/ext-all.css", "");
      httpContext.AddStyleSheetFile("gxui/gxui-all.css", "");
      httpContext.AddStyleSheetFile("KDSControls/KDSStylesDatatables/custom_datatables_style.min.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202551615521694", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("wautreq.js", "?202551615521695", false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      httpContext.AddJavascriptSource("KDSControls/KDSStylesDatatables/KDSStylesDatatablesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_832( )
   {
      edtavAcrcpalin_Internalname = "vACRCPALIN_"+sGXsfl_83_idx ;
      edtavAcrcpafreq_Internalname = "vACRCPAFREQ_"+sGXsfl_83_idx ;
      edtavAcrcpaprid_Internalname = "vACRCPAPRID_"+sGXsfl_83_idx ;
      edtavInprodi2_p_Internalname = "vINPRODI2_P_"+sGXsfl_83_idx ;
      edtavInproddsc_Internalname = "vINPRODDSC_"+sGXsfl_83_idx ;
      edtavAcrcoidsc4_Internalname = "vACRCOIDSC4_"+sGXsfl_83_idx ;
      edtavAcrcpaum_Internalname = "vACRCPAUM_"+sGXsfl_83_idx ;
      edtavAcrcpaqty_Internalname = "vACRCPAQTY_"+sGXsfl_83_idx ;
      cmbavAutorizar.setInternalname( "vAUTORIZAR_"+sGXsfl_83_idx );
      edtavAcrcoiobsaut_Internalname = "vACRCOIOBSAUT_"+sGXsfl_83_idx ;
      edtavAcrcpaobs_Internalname = "vACRCPAOBS_"+sGXsfl_83_idx ;
      cmbavAcrcpactcg.setInternalname( "vACRCPACTCG_"+sGXsfl_83_idx );
      dynavAcrcoiacd.setInternalname( "vACRCOIACD_"+sGXsfl_83_idx );
      dynavCgunngid.setInternalname( "vCGUNNGID_"+sGXsfl_83_idx );
      edtavAcrcoiprecot_Internalname = "vACRCOIPRECOT_"+sGXsfl_83_idx ;
      edtavAcrcoininkit_aux_Internalname = "vACRCOININKIT_AUX_"+sGXsfl_83_idx ;
      edtavAuxacrcpaqty_Internalname = "vAUXACRCPAQTY_"+sGXsfl_83_idx ;
      edtavInpr01dsc_g_Internalname = "vINPR01DSC_G_"+sGXsfl_83_idx ;
      edtavInpr02dsc_g_Internalname = "vINPR02DSC_G_"+sGXsfl_83_idx ;
      edtavInalmndsc_Internalname = "vINALMNDSC_"+sGXsfl_83_idx ;
      edtavAcrcoidias_Internalname = "vACRCOIDIAS_"+sGXsfl_83_idx ;
      edtavPeriododsc_Internalname = "vPERIODODSC_"+sGXsfl_83_idx ;
      edtavSubfamdsc_Internalname = "vSUBFAMDSC_"+sGXsfl_83_idx ;
      edtavQuestion_Internalname = "vQUESTION_"+sGXsfl_83_idx ;
      edtavPermite_Internalname = "vPERMITE_"+sGXsfl_83_idx ;
      edtavPresupuestado_Internalname = "vPRESUPUESTADO_"+sGXsfl_83_idx ;
      edtavComprometido_Internalname = "vCOMPROMETIDO_"+sGXsfl_83_idx ;
      edtavDisponible_Internalname = "vDISPONIBLE_"+sGXsfl_83_idx ;
      edtavPresupuestadom_Internalname = "vPRESUPUESTADOM_"+sGXsfl_83_idx ;
      edtavComprometidom_Internalname = "vCOMPROMETIDOM_"+sGXsfl_83_idx ;
      edtavDisponiblem_Internalname = "vDISPONIBLEM_"+sGXsfl_83_idx ;
      edtavAcrcpaprepro_Internalname = "vACRCPAPREPRO_"+sGXsfl_83_idx ;
      edtavPrecio_Internalname = "vPRECIO_"+sGXsfl_83_idx ;
      edtavAcrcpaqtyr_Internalname = "vACRCPAQTYR_"+sGXsfl_83_idx ;
   }

   public void subsflControlProps_fel_832( )
   {
      edtavAcrcpalin_Internalname = "vACRCPALIN_"+sGXsfl_83_fel_idx ;
      edtavAcrcpafreq_Internalname = "vACRCPAFREQ_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaprid_Internalname = "vACRCPAPRID_"+sGXsfl_83_fel_idx ;
      edtavInprodi2_p_Internalname = "vINPRODI2_P_"+sGXsfl_83_fel_idx ;
      edtavInproddsc_Internalname = "vINPRODDSC_"+sGXsfl_83_fel_idx ;
      edtavAcrcoidsc4_Internalname = "vACRCOIDSC4_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaum_Internalname = "vACRCPAUM_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaqty_Internalname = "vACRCPAQTY_"+sGXsfl_83_fel_idx ;
      cmbavAutorizar.setInternalname( "vAUTORIZAR_"+sGXsfl_83_fel_idx );
      edtavAcrcoiobsaut_Internalname = "vACRCOIOBSAUT_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaobs_Internalname = "vACRCPAOBS_"+sGXsfl_83_fel_idx ;
      cmbavAcrcpactcg.setInternalname( "vACRCPACTCG_"+sGXsfl_83_fel_idx );
      dynavAcrcoiacd.setInternalname( "vACRCOIACD_"+sGXsfl_83_fel_idx );
      dynavCgunngid.setInternalname( "vCGUNNGID_"+sGXsfl_83_fel_idx );
      edtavAcrcoiprecot_Internalname = "vACRCOIPRECOT_"+sGXsfl_83_fel_idx ;
      edtavAcrcoininkit_aux_Internalname = "vACRCOININKIT_AUX_"+sGXsfl_83_fel_idx ;
      edtavAuxacrcpaqty_Internalname = "vAUXACRCPAQTY_"+sGXsfl_83_fel_idx ;
      edtavInpr01dsc_g_Internalname = "vINPR01DSC_G_"+sGXsfl_83_fel_idx ;
      edtavInpr02dsc_g_Internalname = "vINPR02DSC_G_"+sGXsfl_83_fel_idx ;
      edtavInalmndsc_Internalname = "vINALMNDSC_"+sGXsfl_83_fel_idx ;
      edtavAcrcoidias_Internalname = "vACRCOIDIAS_"+sGXsfl_83_fel_idx ;
      edtavPeriododsc_Internalname = "vPERIODODSC_"+sGXsfl_83_fel_idx ;
      edtavSubfamdsc_Internalname = "vSUBFAMDSC_"+sGXsfl_83_fel_idx ;
      edtavQuestion_Internalname = "vQUESTION_"+sGXsfl_83_fel_idx ;
      edtavPermite_Internalname = "vPERMITE_"+sGXsfl_83_fel_idx ;
      edtavPresupuestado_Internalname = "vPRESUPUESTADO_"+sGXsfl_83_fel_idx ;
      edtavComprometido_Internalname = "vCOMPROMETIDO_"+sGXsfl_83_fel_idx ;
      edtavDisponible_Internalname = "vDISPONIBLE_"+sGXsfl_83_fel_idx ;
      edtavPresupuestadom_Internalname = "vPRESUPUESTADOM_"+sGXsfl_83_fel_idx ;
      edtavComprometidom_Internalname = "vCOMPROMETIDOM_"+sGXsfl_83_fel_idx ;
      edtavDisponiblem_Internalname = "vDISPONIBLEM_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaprepro_Internalname = "vACRCPAPREPRO_"+sGXsfl_83_fel_idx ;
      edtavPrecio_Internalname = "vPRECIO_"+sGXsfl_83_fel_idx ;
      edtavAcrcpaqtyr_Internalname = "vACRCPAQTYR_"+sGXsfl_83_fel_idx ;
   }

   public void sendrow_832( )
   {
      subsflControlProps_832( ) ;
      wb2I0( ) ;
      Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_83_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+subGrid1_Linesclass+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_83_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpalin_Enabled!=0)&&(edtavAcrcpalin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpalin_Internalname,GXutil.ltrim( localUtil.ntoc( AV14ACRCPALIN, (byte)(7), (byte)(3), ".", "")),((edtavAcrcpalin_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV14ACRCPALIN, "ZZ9")) : localUtil.format( AV14ACRCPALIN, "ZZ9")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','3');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpalin_Enabled!=0)&&(edtavAcrcpalin_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,84);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpalin_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcpalin_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpafreq_Enabled!=0)&&(edtavAcrcpafreq_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpafreq_Internalname,localUtil.format(AV13ACRCPAFREQ, "99/99/99"),localUtil.format( AV13ACRCPAFREQ, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpafreq_Enabled!=0)&&(edtavAcrcpafreq_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpafreq_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcpafreq_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaprid_Enabled!=0)&&(edtavAcrcpaprid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaprid_Internalname,GXutil.ltrim( localUtil.ntoc( AV15ACRCPAPRID, (byte)(10), (byte)(0), ".", "")),((edtavAcrcpaprid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV15ACRCPAPRID), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaprid_Enabled!=0)&&(edtavAcrcpaprid_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,86);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaprid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcpaprid_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInprodi2_p_Enabled!=0)&&(edtavInprodi2_p_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 87,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInprodi2_p_Internalname,GXutil.rtrim( AV39INPRODI2_P),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInprodi2_p_Enabled!=0)&&(edtavInprodi2_p_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,87);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInprodi2_p_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavInprodi2_p_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInproddsc_Enabled!=0)&&(edtavInproddsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 88,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInproddsc_Internalname,AV37INPRODDSC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInproddsc_Enabled!=0)&&(edtavInproddsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,88);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInproddsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavInproddsc_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcoidsc4_Enabled!=0)&&(edtavAcrcoidsc4_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcoidsc4_Internalname,AV56ACRCOIDSC4,AV56ACRCOIDSC4,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAcrcoidsc4_Enabled!=0)&&(edtavAcrcoidsc4_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,89);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcoidsc4_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAcrcoidsc4_Enabled),new Integer(0),"text","",new Integer(250),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaum_Enabled!=0)&&(edtavAcrcpaum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaum_Internalname,GXutil.rtrim( AV18ACRCPAUM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaum_Enabled!=0)&&(edtavAcrcpaum_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,90);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaum_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAcrcpaum_Enabled),new Integer(0),"text","",new Integer(50),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaqty_Enabled!=0)&&(edtavAcrcpaqty_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 91,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaqty_Internalname,GXutil.ltrim( localUtil.ntoc( AV16ACRCPAQTY, (byte)(18), (byte)(6), ".", "")),GXutil.ltrim( localUtil.format( AV16ACRCPAQTY, "Z,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','6');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaqty_Enabled!=0)&&(edtavAcrcpaqty_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,91);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaqty_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAcrcpaqty_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      TempTags = " " + ((cmbavAutorizar.getEnabled()!=0)&&(cmbavAutorizar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 92,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      if ( ( cmbavAutorizar.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "vAUTORIZAR_" + sGXsfl_83_idx ;
         cmbavAutorizar.setName( GXCCtl );
         cmbavAutorizar.setWebtags( "" );
         cmbavAutorizar.addItem(GXutil.trim( GXutil.str( 0, 1, 0)), "Seleccione", (short)(0));
         cmbavAutorizar.addItem("1", "Si", (short)(0));
         cmbavAutorizar.addItem("2", "No", (short)(0));
         if ( cmbavAutorizar.getItemCount() > 0 )
         {
            AV20Autorizar = (byte)(GXutil.lval( cmbavAutorizar.getValidValue(GXutil.trim( GXutil.str( AV20Autorizar, 1, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAutorizar,cmbavAutorizar.getInternalname(),GXutil.trim( GXutil.str( AV20Autorizar, 1, 0)),new Integer(1),cmbavAutorizar.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(-1),new Integer(1),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAutorizar.getEnabled()!=0)&&(cmbavAutorizar.getVisible()!=0) ? " onblur=\""+";gx.evt.onblur(this,92);\"" : " "),"",new Boolean(true)});
      cmbavAutorizar.setValue( GXutil.trim( GXutil.str( AV20Autorizar, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAutorizar.getInternalname(), "Values", cmbavAutorizar.ToJavascriptSource(), !bGXsfl_83_Refreshing);
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavAcrcoiobsaut_Backcolor)+">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcoiobsaut_Enabled!=0)&&(edtavAcrcoiobsaut_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcoiobsaut_Internalname,GXutil.rtrim( AV8ACRCOIOBSAUT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAcrcoiobsaut_Enabled!=0)&&(edtavAcrcoiobsaut_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,93);\"" : " "),"'"+""+"'"+",false,"+"'"+"e222i2_client"+"'","","","","",edtavAcrcoiobsaut_Jsonclick,new Integer(7),"Attribute",((edtavAcrcoiobsaut_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavAcrcoiobsaut_Backcolor)+";"),ROClassString,"","",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(180),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaobs_Enabled!=0)&&(edtavAcrcpaobs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaobs_Internalname,AV103ACRCPAOBS,AV103ACRCPAOBS,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaobs_Enabled!=0)&&(edtavAcrcpaobs_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,94);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaobs_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(200),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      TempTags = " " + ((cmbavAcrcpactcg.getEnabled()!=0)&&(cmbavAcrcpactcg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      GXCCtl = "vACRCPACTCG_" + sGXsfl_83_idx ;
      cmbavAcrcpactcg.setName( GXCCtl );
      cmbavAcrcpactcg.setWebtags( "" );
      cmbavAcrcpactcg.addItem("", "", (short)(0));
      if ( cmbavAcrcpactcg.getItemCount() > 0 )
      {
         AV81ACRCPACTCG = cmbavAcrcpactcg.getValidValue(AV81ACRCPACTCG) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAcrcpactcg,cmbavAcrcpactcg.getInternalname(),GXutil.rtrim( AV81ACRCPACTCG),new Integer(1),cmbavAcrcpactcg.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbavAcrcpactcg.getEnabled()),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAcrcpactcg.getEnabled()!=0)&&(cmbavAcrcpactcg.getVisible()!=0) ? " onblur=\""+";gx.evt.onblur(this,95);\"" : " "),"",new Boolean(true)});
      cmbavAcrcpactcg.setValue( GXutil.rtrim( AV81ACRCPACTCG) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAcrcpactcg.getInternalname(), "Values", cmbavAcrcpactcg.ToJavascriptSource(), !bGXsfl_83_Refreshing);
      gxvvacrcoiacd_html2I2( ) ;
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      TempTags = " " + ((dynavAcrcoiacd.getEnabled()!=0)&&(dynavAcrcoiacd.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 96,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      if ( ( dynavAcrcoiacd.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "vACRCOIACD_" + sGXsfl_83_idx ;
         dynavAcrcoiacd.setName( GXCCtl );
         dynavAcrcoiacd.setWebtags( "" );
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynavAcrcoiacd,dynavAcrcoiacd.getInternalname(),GXutil.trim( GXutil.str( AV192ACRCOIACD, 4, 0)),new Integer(1),dynavAcrcoiacd.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(0),new Integer(dynavAcrcoiacd.getEnabled()),new Integer(0),new Integer(0),new Integer(200),"px",new Integer(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((dynavAcrcoiacd.getEnabled()!=0)&&(dynavAcrcoiacd.getVisible()!=0) ? " onblur=\""+";gx.evt.onblur(this,96);\"" : " "),"",new Boolean(true)});
      dynavAcrcoiacd.setValue( GXutil.trim( GXutil.str( AV192ACRCOIACD, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavAcrcoiacd.getInternalname(), "Values", dynavAcrcoiacd.ToJavascriptSource(), !bGXsfl_83_Refreshing);
      gxvvcgunngid_html2I2( ) ;
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      TempTags = " " + ((dynavCgunngid.getEnabled()!=0)&&(dynavCgunngid.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      if ( ( dynavCgunngid.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "vCGUNNGID_" + sGXsfl_83_idx ;
         dynavCgunngid.setName( GXCCtl );
         dynavCgunngid.setWebtags( "" );
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {dynavCgunngid,dynavCgunngid.getInternalname(),GXutil.rtrim( AV193CGUNNGID),new Integer(1),dynavCgunngid.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(dynavCgunngid.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((dynavCgunngid.getEnabled()!=0)&&(dynavCgunngid.getVisible()!=0) ? " onblur=\""+";gx.evt.onblur(this,97);\"" : " "),"",new Boolean(true)});
      dynavCgunngid.setValue( GXutil.rtrim( AV193CGUNNGID) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCgunngid.getInternalname(), "Values", dynavCgunngid.ToJavascriptSource(), !bGXsfl_83_Refreshing);
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcoiprecot_Enabled!=0)&&(edtavAcrcoiprecot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 98,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcoiprecot_Internalname,GXutil.ltrim( localUtil.ntoc( AV231ACRCOIPRECOT, (byte)(18), (byte)(4), ".", "")),((edtavAcrcoiprecot_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV231ACRCOIPRECOT, "Z,ZZZ,ZZZ,ZZ9.9999")) : localUtil.format( AV231ACRCOIPRECOT, "Z,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcoiprecot_Enabled!=0)&&(edtavAcrcoiprecot_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,98);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcoiprecot_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAcrcoiprecot_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcoininkit_aux_Enabled!=0)&&(edtavAcrcoininkit_aux_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcoininkit_aux_Internalname,GXutil.ltrim( localUtil.ntoc( AV99ACRCOININKIT_AUX, (byte)(10), (byte)(0), ".", "")),((edtavAcrcoininkit_aux_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV99ACRCOININKIT_AUX), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcoininkit_aux_Enabled!=0)&&(edtavAcrcoininkit_aux_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,99);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcoininkit_aux_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcoininkit_aux_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAuxacrcpaqty_Enabled!=0)&&(edtavAuxacrcpaqty_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAuxacrcpaqty_Internalname,GXutil.ltrim( localUtil.ntoc( AV177auxACRCPAQTY, (byte)(20), (byte)(6), ".", "")),((edtavAuxacrcpaqty_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV177auxACRCPAQTY, "Z,ZZZ,ZZZ,ZZ9.999999")) : localUtil.format( AV177auxACRCPAQTY, "Z,ZZZ,ZZZ,ZZ9.999999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','6');"+";gx.evt.onchange(this, event)\" "+((edtavAuxacrcpaqty_Enabled!=0)&&(edtavAuxacrcpaqty_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAuxacrcpaqty_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAuxacrcpaqty_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInpr01dsc_g_Enabled!=0)&&(edtavInpr01dsc_g_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInpr01dsc_g_Internalname,GXutil.rtrim( AV165INPR01DSC_G),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInpr01dsc_g_Enabled!=0)&&(edtavInpr01dsc_g_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInpr01dsc_g_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavInpr01dsc_g_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInpr02dsc_g_Enabled!=0)&&(edtavInpr02dsc_g_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInpr02dsc_g_Internalname,GXutil.rtrim( AV166INPR02DSC_G),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInpr02dsc_g_Enabled!=0)&&(edtavInpr02dsc_g_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInpr02dsc_g_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavInpr02dsc_g_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInalmndsc_Enabled!=0)&&(edtavInalmndsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInalmndsc_Internalname,GXutil.rtrim( AV162INALMNDSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInalmndsc_Enabled!=0)&&(edtavInalmndsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,103);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInalmndsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavInalmndsc_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(60),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcoidias_Enabled!=0)&&(edtavAcrcoidias_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcoidias_Internalname,GXutil.ltrim( localUtil.ntoc( AV126ACRCOIDIAS, (byte)(4), (byte)(0), ".", "")),((edtavAcrcoidias_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV126ACRCOIDIAS), "ZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcoidias_Enabled!=0)&&(edtavAcrcoidias_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcoidias_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcoidias_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPeriododsc_Enabled!=0)&&(edtavPeriododsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPeriododsc_Internalname,GXutil.rtrim( AV125PERIODODSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPeriododsc_Enabled!=0)&&(edtavPeriododsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,105);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPeriododsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavPeriododsc_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavSubfamdsc_Enabled!=0)&&(edtavSubfamdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSubfamdsc_Internalname,GXutil.rtrim( AV167subfamdsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSubfamdsc_Enabled!=0)&&(edtavSubfamdsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,106);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSubfamdsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavSubfamdsc_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(300),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavQuestion_Enabled!=0)&&(edtavQuestion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavQuestion_Internalname,AV159Question,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavQuestion_Enabled!=0)&&(edtavQuestion_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavQuestion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavQuestion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(1),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPermite_Enabled!=0)&&(edtavPermite_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPermite_Internalname,GXutil.rtrim( AV117permite),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPermite_Enabled!=0)&&(edtavPermite_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPermite_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavPermite_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPresupuestado_Enabled!=0)&&(edtavPresupuestado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPresupuestado_Internalname,GXutil.ltrim( localUtil.ntoc( AV80Presupuestado, (byte)(18), (byte)(2), ".", "")),((edtavPresupuestado_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV80Presupuestado, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavPresupuestado_Enabled!=0)&&(edtavPresupuestado_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,109);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPresupuestado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavPresupuestado_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavComprometido_Enabled!=0)&&(edtavComprometido_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavComprometido_Internalname,GXutil.ltrim( localUtil.ntoc( AV78Comprometido, (byte)(18), (byte)(2), ".", "")),((edtavComprometido_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV78Comprometido, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavComprometido_Enabled!=0)&&(edtavComprometido_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavComprometido_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavComprometido_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavDisponible_Enabled!=0)&&(edtavDisponible_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDisponible_Internalname,GXutil.ltrim( localUtil.ntoc( AV79Disponible, (byte)(18), (byte)(2), ".", "")),((edtavDisponible_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV79Disponible, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV79Disponible, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavDisponible_Enabled!=0)&&(edtavDisponible_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDisponible_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavDisponible_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPresupuestadom_Enabled!=0)&&(edtavPresupuestadom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPresupuestadom_Internalname,GXutil.ltrim( localUtil.ntoc( AV104presupuestadoM, (byte)(18), (byte)(2), ".", "")),((edtavPresupuestadom_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV104presupuestadoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavPresupuestadom_Enabled!=0)&&(edtavPresupuestadom_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPresupuestadom_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavPresupuestadom_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavComprometidom_Enabled!=0)&&(edtavComprometidom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavComprometidom_Internalname,GXutil.ltrim( localUtil.ntoc( AV105ComprometidoM, (byte)(18), (byte)(2), ".", "")),((edtavComprometidom_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV105ComprometidoM, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavComprometidom_Enabled!=0)&&(edtavComprometidom_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavComprometidom_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavComprometidom_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavDisponiblem_Enabled!=0)&&(edtavDisponiblem_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDisponiblem_Internalname,GXutil.ltrim( localUtil.ntoc( AV106DisponibleM, (byte)(18), (byte)(2), ".", "")),((edtavDisponiblem_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV106DisponibleM, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV106DisponibleM, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavDisponiblem_Enabled!=0)&&(edtavDisponiblem_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDisponiblem_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavDisponiblem_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaprepro_Enabled!=0)&&(edtavAcrcpaprepro_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaprepro_Internalname,GXutil.ltrim( localUtil.ntoc( AV143ACRCPAPREPRO, (byte)(18), (byte)(4), ".", "")),((edtavAcrcpaprepro_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV143ACRCPAPREPRO, "Z,ZZZ,ZZZ,ZZ9.9999")) : localUtil.format( AV143ACRCPAPREPRO, "Z,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaprepro_Enabled!=0)&&(edtavAcrcpaprepro_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,115);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaprepro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcpaprepro_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPrecio_Enabled!=0)&&(edtavPrecio_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecio_Internalname,GXutil.rtrim( AV169precio),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPrecio_Enabled!=0)&&(edtavPrecio_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,116);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecio_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavPrecio_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAcrcpaqtyr_Enabled!=0)&&(edtavAcrcpaqtyr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcrcpaqtyr_Internalname,GXutil.ltrim( localUtil.ntoc( AV59ACRCPAQTYR, (byte)(20), (byte)(6), ".", "")),((edtavAcrcpaqtyr_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")) : localUtil.format( AV59ACRCPAQTYR, "Z,ZZZ,ZZZ,ZZ9.999999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','6');"+";gx.evt.onchange(this, event)\" "+((edtavAcrcpaqtyr_Enabled!=0)&&(edtavAcrcpaqtyr_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,117);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcrcpaqtyr_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavAcrcpaqtyr_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(83),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      send_integrity_lvl_hashes2I2( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_83_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_83_idx+1)) ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_83_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_832( ) ;
      /* End function sendrow_832 */
   }

   public void init_default_properties( )
   {
      lblTitulopantalla_Internalname = "TITULOPANTALLA" ;
      lblTxtguardar_Internalname = "TXTGUARDAR" ;
      lblTxtlista_Internalname = "TXTLISTA" ;
      lblTxtregresar_Internalname = "TXTREGRESAR" ;
      lblTxtstyle_Internalname = "TXTSTYLE" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtavAcrcpadoc_Internalname = "vACRCPADOC" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      dynavCnciasid.setInternalname( "vCNCIASID" );
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtavUsuariosol_Internalname = "vUSUARIOSOL" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtavProyecto_Internalname = "vPROYECTO" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtavAcrcpacom_Internalname = "vACRCPACOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtavF1_Internalname = "vF1" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtavAcrcoifdoc_Internalname = "vACRCOIFDOC" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      cmbavAutorizartod.setInternalname( "vAUTORIZARTOD" );
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtavLeinalmndsc_Internalname = "vLEINALMNDSC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtavDsctrabajorealizar_Internalname = "vDSCTRABAJOREALIZAR" ;
      lblTxtlinks_Internalname = "TXTLINKS" ;
      Mensaje_Internalname = "MENSAJE" ;
      tblTable16_Internalname = "TABLE16" ;
      edtavAcrcpalin_Internalname = "vACRCPALIN" ;
      edtavAcrcpafreq_Internalname = "vACRCPAFREQ" ;
      edtavAcrcpaprid_Internalname = "vACRCPAPRID" ;
      edtavInprodi2_p_Internalname = "vINPRODI2_P" ;
      edtavInproddsc_Internalname = "vINPRODDSC" ;
      edtavAcrcoidsc4_Internalname = "vACRCOIDSC4" ;
      edtavAcrcpaum_Internalname = "vACRCPAUM" ;
      edtavAcrcpaqty_Internalname = "vACRCPAQTY" ;
      cmbavAutorizar.setInternalname( "vAUTORIZAR" );
      edtavAcrcoiobsaut_Internalname = "vACRCOIOBSAUT" ;
      edtavAcrcpaobs_Internalname = "vACRCPAOBS" ;
      cmbavAcrcpactcg.setInternalname( "vACRCPACTCG" );
      dynavAcrcoiacd.setInternalname( "vACRCOIACD" );
      dynavCgunngid.setInternalname( "vCGUNNGID" );
      edtavAcrcoiprecot_Internalname = "vACRCOIPRECOT" ;
      edtavAcrcoininkit_aux_Internalname = "vACRCOININKIT_AUX" ;
      edtavAuxacrcpaqty_Internalname = "vAUXACRCPAQTY" ;
      edtavInpr01dsc_g_Internalname = "vINPR01DSC_G" ;
      edtavInpr02dsc_g_Internalname = "vINPR02DSC_G" ;
      edtavInalmndsc_Internalname = "vINALMNDSC" ;
      edtavAcrcoidias_Internalname = "vACRCOIDIAS" ;
      edtavPeriododsc_Internalname = "vPERIODODSC" ;
      edtavSubfamdsc_Internalname = "vSUBFAMDSC" ;
      edtavQuestion_Internalname = "vQUESTION" ;
      edtavPermite_Internalname = "vPERMITE" ;
      edtavPresupuestado_Internalname = "vPRESUPUESTADO" ;
      edtavComprometido_Internalname = "vCOMPROMETIDO" ;
      edtavDisponible_Internalname = "vDISPONIBLE" ;
      edtavPresupuestadom_Internalname = "vPRESUPUESTADOM" ;
      edtavComprometidom_Internalname = "vCOMPROMETIDOM" ;
      edtavDisponiblem_Internalname = "vDISPONIBLEM" ;
      edtavAcrcpaprepro_Internalname = "vACRCPAPREPRO" ;
      edtavPrecio_Internalname = "vPRECIO" ;
      edtavAcrcpaqtyr_Internalname = "vACRCPAQTYR" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable1_Internalname = "TABLE1" ;
      tblKdstablacontenido_Internalname = "KDSTABLACONTENIDO" ;
      Kdsstylesdatatables1_Internalname = "KDSSTYLESDATATABLES1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      httpContext.setDefaultTheme("KDSTheme");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavAcrcpaqtyr_Jsonclick = "" ;
      edtavAcrcpaqtyr_Visible = 0 ;
      edtavPrecio_Jsonclick = "" ;
      edtavPrecio_Visible = 0 ;
      edtavAcrcpaprepro_Jsonclick = "" ;
      edtavAcrcpaprepro_Visible = 0 ;
      edtavDisponiblem_Jsonclick = "" ;
      edtavDisponiblem_Visible = 0 ;
      edtavComprometidom_Jsonclick = "" ;
      edtavComprometidom_Visible = 0 ;
      edtavPresupuestadom_Jsonclick = "" ;
      edtavPresupuestadom_Visible = 0 ;
      edtavDisponible_Jsonclick = "" ;
      edtavDisponible_Visible = 0 ;
      edtavComprometido_Jsonclick = "" ;
      edtavComprometido_Visible = 0 ;
      edtavPresupuestado_Jsonclick = "" ;
      edtavPresupuestado_Visible = 0 ;
      edtavPermite_Jsonclick = "" ;
      edtavPermite_Visible = 0 ;
      edtavQuestion_Jsonclick = "" ;
      edtavQuestion_Visible = 0 ;
      edtavSubfamdsc_Jsonclick = "" ;
      edtavSubfamdsc_Visible = 0 ;
      edtavPeriododsc_Jsonclick = "" ;
      edtavPeriododsc_Visible = 0 ;
      edtavAcrcoidias_Jsonclick = "" ;
      edtavAcrcoidias_Visible = 0 ;
      edtavInalmndsc_Jsonclick = "" ;
      edtavInalmndsc_Visible = 0 ;
      edtavInpr02dsc_g_Jsonclick = "" ;
      edtavInpr02dsc_g_Visible = 0 ;
      edtavInpr01dsc_g_Jsonclick = "" ;
      edtavInpr01dsc_g_Visible = 0 ;
      edtavAuxacrcpaqty_Jsonclick = "" ;
      edtavAuxacrcpaqty_Visible = 0 ;
      edtavAcrcoininkit_aux_Jsonclick = "" ;
      edtavAcrcoininkit_aux_Visible = 0 ;
      edtavAcrcoiprecot_Jsonclick = "" ;
      edtavAcrcoiprecot_Visible = -1 ;
      dynavCgunngid.setJsonclick( "" );
      dynavCgunngid.setVisible( -1 );
      dynavAcrcoiacd.setJsonclick( "" );
      dynavAcrcoiacd.setVisible( 0 );
      cmbavAcrcpactcg.setJsonclick( "" );
      cmbavAcrcpactcg.setVisible( -1 );
      edtavAcrcpaobs_Jsonclick = "" ;
      edtavAcrcpaobs_Visible = -1 ;
      edtavAcrcpaobs_Enabled = 1 ;
      edtavAcrcoiobsaut_Jsonclick = "" ;
      edtavAcrcoiobsaut_Visible = -1 ;
      edtavAcrcoiobsaut_Enabled = 1 ;
      cmbavAutorizar.setJsonclick( "" );
      cmbavAutorizar.setVisible( -1 );
      cmbavAutorizar.setEnabled( 1 );
      edtavAcrcpaqty_Jsonclick = "" ;
      edtavAcrcpaqty_Visible = -1 ;
      edtavAcrcpaum_Jsonclick = "" ;
      edtavAcrcpaum_Visible = -1 ;
      edtavAcrcoidsc4_Jsonclick = "" ;
      edtavAcrcoidsc4_Visible = -1 ;
      edtavInproddsc_Jsonclick = "" ;
      edtavInproddsc_Visible = -1 ;
      edtavInprodi2_p_Jsonclick = "" ;
      edtavInprodi2_p_Visible = -1 ;
      edtavAcrcpaprid_Jsonclick = "" ;
      edtavAcrcpaprid_Visible = 0 ;
      edtavAcrcpafreq_Jsonclick = "" ;
      edtavAcrcpafreq_Visible = 0 ;
      edtavAcrcpalin_Jsonclick = "" ;
      edtavAcrcpalin_Visible = 0 ;
      Mensaje_Title = "Title" ;
      lblTxtlinks_Caption = "<div name=\"txtSalir\">" ;
      lblTextblock32_Visible = 1 ;
      edtavLeinalmndsc_Jsonclick = "" ;
      edtavLeinalmndsc_Enabled = 1 ;
      cmbavAutorizartod.setJsonclick( "" );
      edtavAcrcoifdoc_Jsonclick = "" ;
      edtavAcrcoifdoc_Enabled = 1 ;
      edtavF1_Jsonclick = "" ;
      edtavAcrcpacom_Enabled = 1 ;
      edtavProyecto_Jsonclick = "" ;
      edtavProyecto_Enabled = 1 ;
      edtavUsuariosol_Jsonclick = "" ;
      edtavUsuariosol_Enabled = 1 ;
      dynavCnciasid.setJsonclick( "" );
      dynavCnciasid.setEnabled( 1 );
      edtavAcrcpadoc_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavAcrcpaqtyr_Enabled = 1 ;
      edtavPrecio_Enabled = 1 ;
      edtavAcrcpaprepro_Enabled = 1 ;
      edtavDisponiblem_Enabled = 1 ;
      edtavComprometidom_Enabled = 1 ;
      edtavPresupuestadom_Enabled = 1 ;
      edtavDisponible_Enabled = 1 ;
      edtavComprometido_Enabled = 1 ;
      edtavPresupuestado_Enabled = 1 ;
      edtavPermite_Enabled = 1 ;
      edtavQuestion_Enabled = 1 ;
      edtavSubfamdsc_Enabled = 1 ;
      edtavPeriododsc_Enabled = 1 ;
      edtavAcrcoidias_Enabled = 1 ;
      edtavInalmndsc_Enabled = 1 ;
      edtavInpr02dsc_g_Enabled = 1 ;
      edtavInpr01dsc_g_Enabled = 1 ;
      edtavAuxacrcpaqty_Enabled = 1 ;
      edtavAcrcoininkit_aux_Enabled = 1 ;
      edtavAcrcoiprecot_Enabled = 1 ;
      dynavCgunngid.setEnabled( 1 );
      dynavAcrcoiacd.setEnabled( 1 );
      edtavAcrcpaum_Enabled = 1 ;
      edtavAcrcoidsc4_Enabled = 1 ;
      edtavInproddsc_Enabled = 1 ;
      edtavInprodi2_p_Enabled = 1 ;
      edtavAcrcpaprid_Enabled = 1 ;
      edtavAcrcpafreq_Enabled = 1 ;
      edtavAcrcpalin_Enabled = 1 ;
      subGrid1_Header = "" ;
      subGrid1_Class = "dataTable" ;
      edtavAcrcoiobsaut_Backcolor = -1 ;
      lblTxtstyle_Caption = "txtStyle" ;
      edtavDsctrabajorealizar_Visible = 1 ;
      edtavDsctrabajorealizar_Enabled = 1 ;
      lblTextblock38_Caption = "Proyecto" ;
      edtavF1_Enabled = 1 ;
      lblTxtlista_Caption = "Lista" ;
      lblTxtregresar_Caption = "Regresar" ;
      lblTxtguardar_Caption = "Guardar" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "" );
      edtavAcrcpaqty_Enabled = 1 ;
      cmbavAcrcpactcg.setEnabled( 1 );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      dynavCnciasid.setName( "vCNCIASID" );
      dynavCnciasid.setWebtags( "" );
      cmbavAutorizartod.setName( "vAUTORIZARTOD" );
      cmbavAutorizartod.setWebtags( "" );
      cmbavAutorizartod.addItem("0", "Seleccione", (short)(0));
      cmbavAutorizartod.addItem("1", "Si", (short)(0));
      cmbavAutorizartod.addItem("2", "No", (short)(0));
      if ( cmbavAutorizartod.getItemCount() > 0 )
      {
         AV190AutorizarTod = (short)(GXutil.lval( cmbavAutorizartod.getValidValue(GXutil.trim( GXutil.str( AV190AutorizarTod, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV190AutorizarTod", GXutil.ltrim( GXutil.str( AV190AutorizarTod, 4, 0)));
      }
      GXCCtl = "vAUTORIZAR_" + sGXsfl_83_idx ;
      cmbavAutorizar.setName( GXCCtl );
      cmbavAutorizar.setWebtags( "" );
      cmbavAutorizar.addItem(GXutil.trim( GXutil.str( 0, 1, 0)), "Seleccione", (short)(0));
      cmbavAutorizar.addItem("1", "Si", (short)(0));
      cmbavAutorizar.addItem("2", "No", (short)(0));
      if ( cmbavAutorizar.getItemCount() > 0 )
      {
         AV20Autorizar = (byte)(GXutil.lval( cmbavAutorizar.getValidValue(GXutil.trim( GXutil.str( AV20Autorizar, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAutorizar.getInternalname(), GXutil.str( AV20Autorizar, 1, 0));
      }
      GXCCtl = "vACRCPACTCG_" + sGXsfl_83_idx ;
      cmbavAcrcpactcg.setName( GXCCtl );
      cmbavAcrcpactcg.setWebtags( "" );
      cmbavAcrcpactcg.addItem("", "", (short)(0));
      if ( cmbavAcrcpactcg.getItemCount() > 0 )
      {
         AV81ACRCPACTCG = cmbavAcrcpactcg.getValidValue(AV81ACRCPACTCG) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAcrcpactcg.getInternalname(), AV81ACRCPACTCG);
      }
      GXCCtl = "vACRCOIACD_" + sGXsfl_83_idx ;
      dynavAcrcoiacd.setName( GXCCtl );
      dynavAcrcoiacd.setWebtags( "" );
      GXCCtl = "vCGUNNGID_" + sGXsfl_83_idx ;
      dynavCgunngid.setName( GXCCtl );
      dynavCgunngid.setWebtags( "" );
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'MENU'","{handler:'e152I2',iparms:[{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'MENU'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e162I2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e172I2',iparms:[{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'cmbavAcrcpactcg'},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV16ACRCPAQTY',fld:'vACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV177auxACRCPAQTY',fld:'vAUXACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV18ACRCPAUM',fld:'vACRCPAUM',pic:''},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV103ACRCPAOBS',fld:'vACRCPAOBS',pic:''},{av:'AV143ACRCPAPREPRO',fld:'vACRCPAPREPRO',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV169precio',fld:'vPRECIO',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV159Question',fld:'vQUESTION',pic:''},{av:'AV37INPRODDSC',fld:'vINPRODDSC',pic:'',hsh:true},{av:'AV39INPRODI2_P',fld:'vINPRODI2_P',pic:''},{av:'cmbavAutorizar'},{av:'AV20Autorizar',fld:'vAUTORIZAR',pic:'9'},{av:'cmbavAcrcpactcg'},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'AV165INPR01DSC_G',fld:'vINPR01DSC_G',pic:''},{av:'AV166INPR02DSC_G',fld:'vINPR02DSC_G',pic:''},{av:'AV168ACRCOIS001',fld:'vACRCOIS001',pic:''},{av:'AV206EXPINSTIP',fld:'vEXPINSTIP',pic:''},{av:'AV167subfamdsc',fld:'vSUBFAMDSC',pic:''},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV79Disponible',fld:'vDISPONIBLE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV106DisponibleM',fld:'vDISPONIBLEM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'AV233dscTrabajoRealizar',fld:'vDSCTRABAJOREALIZAR',pic:''},{av:'AV162INALMNDSC',fld:'vINALMNDSC',pic:''},{av:'AV231ACRCOIPRECOT',fld:'vACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV117permite',fld:'vPERMITE',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e112I2',iparms:[{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',grid:83,pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',grid:83,pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',grid:83,pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',grid:83,pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',grid:83,pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',grid:83,pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',grid:83,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',grid:83,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',grid:83,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',grid:83,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',grid:83,pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',grid:83,pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',grid:83,pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'AV101continuar',fld:'vCONTINUAR',pic:''},{av:'AV20Autorizar',fld:'vAUTORIZAR',grid:83,pic:'9'},{av:'AV8ACRCOIOBSAUT',fld:'vACRCOIOBSAUT',grid:83,pic:''},{av:'AV16ACRCPAQTY',fld:'vACRCPAQTY',grid:83,pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV70ENVIARCORREO',fld:'vENVIARCORREO',pic:'ZZZ9'},{av:'AV103ACRCPAOBS',fld:'vACRCPAOBS',grid:83,pic:''},{av:'A316ACRCOIQTP',fld:'ACRCOIQTP',pic:'ZZZZZZZZZ9.999999'},{av:'AV71NIVSG',fld:'vNIVSG',pic:'ZZZ9'},{av:'A172PMCTPRDSC',fld:'PMCTPRDSC',pic:''},{av:'A2505ACRCPAL2CIA',fld:'ACRCPAL2CIA',pic:'ZZZZZZZZZ9'},{av:'A2506ACRCPAL2TDC',fld:'ACRCPAL2TDC',pic:''},{av:'A2507ACRCPAL2DOC',fld:'ACRCPAL2DOC',pic:'ZZZZZZZZZ9'},{av:'A2508ACRCPAL2LIN',fld:'ACRCPAL2LIN',pic:'ZZZZZZZZZ9'},{av:'A2509ACRCPAL2NIV',fld:'ACRCPAL2NIV',pic:'Z9'},{av:'A2510ACRCPAL2USR',fld:'ACRCPAL2USR',pic:''},{av:'A5940CNUSERID',fld:'CNUSERID',pic:''},{av:'A205CNCDIREM',fld:'CNCDIREM',pic:''},{av:'A190CNUSERDSC',fld:'CNUSERDSC',pic:''},{av:'AV93CNUSERDSC2',fld:'vCNUSERDSC2',pic:''},{av:'A279INPR02ID',fld:'INPR02ID',pic:''},{av:'A886INPR02CMID',fld:'INPR02CMID',pic:'ZZZZZZZZZ9'},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''},{av:'AV232existeInv',fld:'vEXISTEINV',pic:''},{av:'AV214ACRCOIALID',fld:'vACRCOIALID',pic:''},{av:'AV227ACRCOIUSRREC',fld:'vACRCOIUSRREC',pic:'ZZZZZZZZZ9'},{av:'AV196GEDEVAID_registrado',fld:'vGEDEVAID_REGISTRADO',pic:'ZZZZZZZZZ9'},{av:'AV202GEDEVATIPO',fld:'vGEDEVATIPO',pic:''},{av:'AV203GEDEVADIAS',fld:'vGEDEVADIAS',pic:'ZZZ9'},{av:'A135ACACTLID',fld:'ACACTLID',pic:''},{av:'A1148INTPALID',fld:'INTPALID',pic:''},{av:'A7804INPRODCPNAC',fld:'INPRODCPNAC',pic:'ZZZZZZZZZZ9.999999'},{av:'A306ACRCOIALID',fld:'ACRCOIALID',pic:''},{av:'A314ACRCOIQTO',fld:'ACRCOIQTO',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV206EXPINSTIP',fld:'vEXPINSTIP',pic:''},{av:'A282INUMBAID',fld:'INUMBAID',pic:''},{av:'A954ACRCOIUNGD',fld:'ACRCOIUNGD',pic:''},{av:'AV195CNTDOCDSC',fld:'vCNTDOCDSC',pic:''},{av:'A7410GEDEVADOC',fld:'GEDEVADOC',pic:''},{av:'A7411GEDEVAID',fld:'GEDEVAID',pic:'ZZZZZZZZZ9'},{av:'A7418GEDEVACOD',fld:'GEDEVACOD',pic:''},{av:'AV75CNUSERDSC',fld:'vCNUSERDSC',pic:''},{av:'AV199codigobarra',fld:'vCODIGOBARRA',pic:''},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',grid:83,pic:'ZZZ9'},{av:'GRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_83',ctrl:'GRID1',grid:83,prop:'GridRC'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',grid:83,pic:''}]");
      setEventMetadata("'CONFIRMAR'",",oparms:[{av:'edtavAcrcoiobsaut_Backcolor',ctrl:'vACRCOIOBSAUT',prop:'Backcolor'},{av:'AV71NIVSG',fld:'vNIVSG',pic:'ZZZ9'},{av:'AV70ENVIARCORREO',fld:'vENVIARCORREO',pic:'ZZZ9'},{av:'AV101continuar',fld:'vCONTINUAR',pic:''},{av:'AV73ACRCPAL2USR',fld:'vACRCPAL2USR',pic:''},{av:'AV75CNUSERDSC',fld:'vCNUSERDSC',pic:''},{av:'AV194CNTDOCID',fld:'vCNTDOCID',pic:''},{av:'AV203GEDEVADIAS',fld:'vGEDEVADIAS',pic:'ZZZ9'},{av:'AV202GEDEVATIPO',fld:'vGEDEVATIPO',pic:''},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'AV196GEDEVAID_registrado',fld:'vGEDEVAID_REGISTRADO',pic:'ZZZZZZZZZ9'},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'AV227ACRCOIUSRREC',fld:'vACRCOIUSRREC',pic:'ZZZZZZZZZ9'},{av:'AV214ACRCOIALID',fld:'vACRCOIALID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'AV206EXPINSTIP',fld:'vEXPINSTIP',pic:''},{av:'A314ACRCOIQTO',fld:'ACRCOIQTO',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A306ACRCOIALID',fld:'ACRCOIALID',pic:''},{av:'AV195CNTDOCDSC',fld:'vCNTDOCDSC',pic:''},{av:'AV199codigobarra',fld:'vCODIGOBARRA',pic:''},{av:'AV232existeInv',fld:'vEXISTEINV',pic:''},{av:'AV228INTPALID',fld:'vINTPALID',pic:''},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("VAUTORIZARTOD.CLICK","{handler:'e132I2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("VAUTORIZARTOD.CLICK",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("VACRCOIOBSAUT.CLICK","{handler:'e222I2',iparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("VACRCOIOBSAUT.CLICK",",oparms:[{av:'edtavAcrcoiobsaut_Backcolor',ctrl:'vACRCOIOBSAUT',prop:'Backcolor'},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'SALIR'","{handler:'e122I2',iparms:[{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'SALIR'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'DETALLEPRESUPUESTO'","{handler:'e212I1',iparms:[{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'DETALLEPRESUPUESTO'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'ACTUALIZARCANTIDAD'","{handler:'e182I2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'AV16ACRCPAQTY',fld:'vACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'ACTUALIZARCANTIDAD'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'GUARDAOBSERVACIONES'","{handler:'e192I2',iparms:[{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'AV103ACRCPAOBS',fld:'vACRCPAOBS',pic:''},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'GUARDAOBSERVACIONES'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
      setEventMetadata("'ACTUALIZACTACGO'","{handler:'e202I2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'cmbavAcrcpactcg'},{av:'edtavAcrcpaqty_Enabled',ctrl:'vACRCPAQTY',prop:'Enabled'},{av:'AV99ACRCOININKIT_AUX',fld:'vACRCOININKIT_AUX',pic:'ZZZZZZZZZ9',hsh:true},{av:'A272ACRCPALIN',fld:'ACRCPALIN',pic:'ZZ9.999'},{av:'A269ACRCPACIA',fld:'ACRCPACIA',pic:'ZZZZZZZZZ9'},{av:'AV11ACRCPACIA',fld:'vACRCPACIA',pic:'ZZZZZZZZZ9',hsh:true},{av:'A270ACRCPATDC',fld:'ACRCPATDC',pic:''},{av:'AV17ACRCPATDC',fld:'vACRCPATDC',pic:''},{av:'A271ACRCPADOC',fld:'ACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'AV12ACRCPADOC',fld:'vACRCPADOC',pic:'ZZZZZZZZZ9'},{av:'A2380ACRCPAEST',fld:'ACRCPAEST',pic:''},{av:'AV175ValImportanteUrgente',fld:'vVALIMPORTANTEURGENTE',pic:'',hsh:true},{av:'AV98ACRCOININKIT',fld:'vACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'A328ACRCPAPRID',fld:'ACRCPAPRID',pic:'ZZZZZZZZZ9'},{av:'A329ACRCPAQTY',fld:'ACRCPAQTY',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A330ACRCPAUM',fld:'ACRCPAUM',pic:''},{av:'A331ACRCPAFREQ',fld:'ACRCPAFREQ',pic:''},{av:'A326ACRCPAUSSOL',fld:'ACRCPAUSSOL',pic:''},{av:'AV59ACRCPAQTYR',fld:'vACRCPAQTYR',pic:'Z,ZZZ,ZZZ,ZZ9.999999',hsh:true},{av:'AV60ACRCPAQTYOC',fld:'vACRCPAQTYOC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A817ACRCPACNRQPDIAS',fld:'ACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A3902ACRCPAOBS',fld:'ACRCPAOBS',pic:''},{av:'A10945ACRCPAPRECOT',fld:'ACRCPAPRECOT',pic:'ZZZZZZZZZ9.9999'},{av:'A10946ACRCPAPREPRO',fld:'ACRCPAPREPRO',pic:'ZZZZZZZZZ9.9999'},{av:'AV138Homologado',fld:'vHOMOLOGADO',pic:'',hsh:true},{av:'AV63ACRCPAULPCM',fld:'vACRCPAULPCM',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV61ACRCPAQTYRC',fld:'vACRCPAQTYRC',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV62ACRCPAQTYP',fld:'vACRCPAQTYP',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV64ACRCPAVACMEST',fld:'vACRCPAVACMEST',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV65ACRCPACNRQPDIAS',fld:'vACRCPACNRQPDIAS',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'AV13ACRCPAFREQ',fld:'vACRCPAFREQ',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'AV15ACRCPAPRID',fld:'vACRCPAPRID',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAutorizartod'},{av:'AV190AutorizarTod',fld:'vAUTORIZARTOD',pic:'ZZZ9'},{av:'AV115Propietario',fld:'vPROPIETARIO',pic:'',hsh:true},{av:'AV6CNUSERID',fld:'vCNUSERID',pic:''},{av:'A383PMPRCNBASE',fld:'PMPRCNBASE',pic:'ZZZZZZZZZ9'},{av:'A384PMPRCNPERT',fld:'PMPRCNPERT',pic:'ZZZZZ9.999'},{av:'A394PMPRCNPERTN2',fld:'PMPRCNPERTN2',pic:'ZZZZZ9.999'},{av:'A395PMPRCNPERTN3',fld:'PMPRCNPERTN3',pic:'ZZZZZ9.999'},{av:'A396PMPRCNPERTN4',fld:'PMPRCNPERTN4',pic:'ZZZZZ9.999'},{av:'A397PMPRCNPERTN5',fld:'PMPRCNPERTN5',pic:'ZZZZZ9.999'},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV45PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A381PMCTCGCLASE',fld:'PMCTCGCLASE',pic:'9'},{av:'A379PMAGCCID',fld:'PMAGCCID',pic:''},{av:'A348PMCTCGID',fld:'PMCTCGID',pic:''},{av:'A349PMCTCGDSC',fld:'PMCTCGDSC',pic:''},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A266ACRCOIDOC',fld:'ACRCOIDOC',pic:'ZZZZZZZZZ9'},{av:'A267ACRCOILIN',fld:'ACRCOILIN',pic:'ZZZZZZ9'},{av:'AV14ACRCPALIN',fld:'vACRCPALIN',pic:'ZZ9'},{av:'A8585ACRCOIURG',fld:'ACRCOIURG',pic:''},{av:'A8586ACRCOIIMP',fld:'ACRCOIIMP',pic:''},{av:'A325ACRCOIFRE2',fld:'ACRCOIFRE2',pic:''},{av:'A893ACRCOININKIT',fld:'ACRCOININKIT',pic:'ZZZZZZZZZ9'},{av:'AV126ACRCOIDIAS',fld:'vACRCOIDIAS',pic:'ZZZ9',hsh:true},{av:'AV127ACRCOIRFINI',fld:'vACRCOIRFINI',pic:''},{av:'AV128ACRCOIRFFIN',fld:'vACRCOIRFFIN',pic:''},{av:'AV129ACRCOIRPER',fld:'vACRCOIRPER',pic:''},{av:'A322ACRCOIUB4',fld:'ACRCOIUB4',pic:''},{av:'A1366ACRCOIA2D',fld:'ACRCOIA2D',pic:''},{av:'AV188PermiteCambioCtaCgo',fld:'vPERMITECAMBIOCTACGO',pic:'',hsh:true},{av:'A268ACRCOIPRID',fld:'ACRCOIPRID',pic:'ZZZZZZZZZ9'},{av:'A3INPR01DSC',fld:'INPR01DSC',pic:''},{av:'A2INPR02DSC',fld:'INPR02DSC',pic:''},{av:'A5682ACRCOIS001',fld:'ACRCOIS001',pic:''},{av:'A6988ACRCOIDIAS',fld:'ACRCOIDIAS',pic:'ZZZ9'},{av:'A8447ACRCOIRFINI',fld:'ACRCOIRFINI',pic:''},{av:'A8448ACRCOIRFFIN',fld:'ACRCOIRFFIN',pic:''},{av:'A8557ACRCOIRPER',fld:'ACRCOIRPER',pic:''},{av:'A710INPR07ID',fld:'INPR07ID',pic:''},{av:'A10967SUBFAMID',fld:'SUBFAMID',pic:''},{av:'A10968SUBFAMDSC',fld:'SUBFAMDSC',pic:''},{av:'AV108TipoPresupuesto',fld:'vTIPOPRESUPUESTO',pic:'',hsh:true},{av:'AV78Comprometido',fld:'vCOMPROMETIDO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV105ComprometidoM',fld:'vCOMPROMETIDOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A362PMTPOPID',fld:'PMTPOPID',pic:''},{av:'A415PMCRPREST',fld:'PMCRPREST',pic:''},{av:'A359PMCRPRMN',fld:'PMCRPRMN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV80Presupuestado',fld:'vPRESUPUESTADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV104presupuestadoM',fld:'vPRESUPUESTADOM',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'A412PMCRPRCIA',fld:'PMCRPRCIA',pic:'ZZZZZZZZZ9'},{av:'A370PMCRPRPROD',fld:'PMCRPRPROD',pic:'ZZZZZZZZZ9'},{av:'AV146PMCRPREST',fld:'vPMCRPREST',pic:'',hsh:true},{av:'A355PMCRPRQTY',fld:'PMCRPRQTY',pic:'ZZZZZZZZZZZ9.9999'},{av:'A351PMCRPRTDC',fld:'PMCRPRTDC',pic:''},{av:'A208ACMVOIFDO2',fld:'ACMVOIFDO2',pic:''},{av:'A43ACMVOIDOC',fld:'ACMVOIDOC',pic:'ZZZZZZZZZ9'},{av:'A142ACMVOIPRID',fld:'ACMVOIPRID',pic:'ZZZZZZZZZ9'},{av:'A139ACACSGID',fld:'ACACSGID',pic:''},{av:'A150ACMVOIPRE',fld:'ACMVOIPRE',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A162ACMVOIUB1',fld:'ACMVOIUB1',pic:''},{av:'A7704EXPINSPROD',fld:'EXPINSPROD',pic:'ZZZZZZZZZ9'},{av:'A7705EXPINSPROY',fld:'EXPINSPROY',pic:''},{av:'AV141ACMVOIUB1',fld:'vACMVOIUB1',pic:''},{av:'A7710EXPINSCAN',fld:'EXPINSCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A889PMRCKTDOC',fld:'PMRCKTDOC',pic:'ZZZZZZZZZ9'},{av:'A890PMRCKTIDKIT',fld:'PMRCKTIDKIT',pic:'ZZZZZZZZZ9'},{av:'A891PMRCKTQTYREQ',fld:'PMRCKTQTYREQ',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV56ACRCOIDSC4',fld:'vACRCOIDSC4',pic:'',hsh:true},{av:'A756ACRCOIDSC4',fld:'ACRCOIDSC4',pic:''},{av:'AV234ACRCOICONSER',fld:'vACRCOICONSER',pic:'',hsh:true},{av:'A323ACRCOIALM',fld:'ACRCOIALM',pic:''},{av:'A10943ACRCOIPRECOT',fld:'ACRCOIPRECOT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A281INPRODID',fld:'INPRODID',pic:'ZZZZZZZZZ9'},{av:'A712INPR09ID',fld:'INPR09ID',pic:''},{av:'AV125PERIODODSC',fld:'vPERIODODSC',pic:'',hsh:true},{av:'A5881PERIODOID',fld:'PERIODOID',pic:''},{av:'A5882PERIODODSC',fld:'PERIODODSC',pic:''},{av:'AV81ACRCPACTCG',fld:'vACRCPACTCG',pic:''},{av:'A350PMPRCNPRES',fld:'PMPRCNPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A6204PMPRCNMANIO',fld:'PMPRCNMANIO',pic:'ZZZ9'},{av:'AV109PACRCPAFREQ',fld:'vPACRCPAFREQ',pic:'',hsh:true},{av:'A6205PMPRCNMMES',fld:'PMPRCNMMES',pic:'ZZZ9'},{av:'A6208PMPRCNMPERTN3',fld:'PMPRCNMPERTN3',pic:''},{av:'AV110PMPRCNMPERTN3',fld:'vPMPRCNMPERTN3',pic:'',hsh:true},{av:'A6209PMPRCNMPERTN4',fld:'PMPRCNMPERTN4',pic:''},{av:'AV111PMPRCNMPERTN4',fld:'vPMPRCNMPERTN4',pic:'',hsh:true},{av:'A6213PMPRCNMPRES',fld:'PMPRCNMPRES',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV163OmitirEnvioCorreo',fld:'vOMITIRENVIOCORREO',pic:'',hsh:true},{av:'AV245EnviarCorreoOC',fld:'vENVIARCORREOOC',pic:'',hsh:true},{av:'AV201generarValeAutomatico',fld:'vGENERARVALEAUTOMATICO',pic:'',hsh:true},{av:'AV22CNCIASDSC',fld:'vCNCIASDSC',pic:'',hsh:true},{av:'AV121Proyecto',fld:'vPROYECTO',pic:'',hsh:true},{av:'AV120UsuarioSol',fld:'vUSUARIOSOL',pic:'',hsh:true},{av:'AV221ServidorSMTP',fld:'vSERVIDORSMTP',pic:'',hsh:true},{av:'AV223correoEnvia',fld:'vCORREOENVIA',pic:'',hsh:true},{av:'AV224contrasenaEnvia',fld:'vCONTRASENAENVIA',pic:'',hsh:true},{av:'AV222puerto',fld:'vPUERTO',pic:'ZZZZ9',hsh:true},{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]");
      setEventMetadata("'ACTUALIZACTACGO'",",oparms:[{av:'dynavCnciasid'},{av:'AV23CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'dynavAcrcoiacd'},{av:'AV192ACRCOIACD',fld:'vACRCOIACD',pic:'ZZZ9'},{av:'dynavCgunngid'},{av:'AV193CGUNNGID',fld:'vCGUNNGID',pic:''}]}");
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
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV24CNESMNID = "" ;
      wcpOAV17ACRCPATDC = "" ;
      wcpOAV45PMCTPRID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV193CGUNNGID = "" ;
      A272ACRCPALIN = DecimalUtil.ZERO ;
      A270ACRCPATDC = "" ;
      A2380ACRCPAEST = "" ;
      AV175ValImportanteUrgente = "" ;
      A329ACRCPAQTY = DecimalUtil.ZERO ;
      A330ACRCPAUM = "" ;
      A331ACRCPAFREQ = GXutil.nullDate() ;
      A326ACRCPAUSSOL = "" ;
      AV59ACRCPAQTYR = DecimalUtil.ZERO ;
      AV60ACRCPAQTYOC = DecimalUtil.ZERO ;
      A817ACRCPACNRQPDIAS = DecimalUtil.ZERO ;
      A3902ACRCPAOBS = "" ;
      A10945ACRCPAPRECOT = DecimalUtil.ZERO ;
      A10946ACRCPAPREPRO = DecimalUtil.ZERO ;
      AV138Homologado = "" ;
      AV63ACRCPAULPCM = DecimalUtil.ZERO ;
      AV61ACRCPAQTYRC = DecimalUtil.ZERO ;
      AV62ACRCPAQTYP = DecimalUtil.ZERO ;
      AV64ACRCPAVACMEST = DecimalUtil.ZERO ;
      AV65ACRCPACNRQPDIAS = DecimalUtil.ZERO ;
      AV13ACRCPAFREQ = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      AV115Propietario = "" ;
      AV6CNUSERID = "" ;
      A384PMPRCNPERT = DecimalUtil.ZERO ;
      A394PMPRCNPERTN2 = DecimalUtil.ZERO ;
      A395PMPRCNPERTN3 = DecimalUtil.ZERO ;
      A396PMPRCNPERTN4 = DecimalUtil.ZERO ;
      A397PMPRCNPERTN5 = DecimalUtil.ZERO ;
      A171PMCTPRID = "" ;
      A379PMAGCCID = "" ;
      A348PMCTCGID = "" ;
      A349PMCTCGDSC = "" ;
      A20CNTDOCID = "" ;
      AV14ACRCPALIN = DecimalUtil.ZERO ;
      A8585ACRCOIURG = "" ;
      A8586ACRCOIIMP = "" ;
      A325ACRCOIFRE2 = GXutil.nullDate() ;
      AV127ACRCOIRFINI = GXutil.nullDate() ;
      AV128ACRCOIRFFIN = GXutil.nullDate() ;
      AV129ACRCOIRPER = "" ;
      A322ACRCOIUB4 = "" ;
      A1366ACRCOIA2D = "" ;
      AV188PermiteCambioCtaCgo = "" ;
      A3INPR01DSC = "" ;
      A2INPR02DSC = "" ;
      A5682ACRCOIS001 = "" ;
      A8447ACRCOIRFINI = GXutil.nullDate() ;
      A8448ACRCOIRFFIN = GXutil.nullDate() ;
      A8557ACRCOIRPER = "" ;
      A710INPR07ID = "" ;
      A10967SUBFAMID = "" ;
      A10968SUBFAMDSC = "" ;
      AV108TipoPresupuesto = "" ;
      AV78Comprometido = DecimalUtil.ZERO ;
      AV105ComprometidoM = DecimalUtil.ZERO ;
      A362PMTPOPID = "" ;
      A415PMCRPREST = "" ;
      A359PMCRPRMN = DecimalUtil.ZERO ;
      AV80Presupuestado = DecimalUtil.ZERO ;
      AV104presupuestadoM = DecimalUtil.ZERO ;
      AV146PMCRPREST = "" ;
      A355PMCRPRQTY = DecimalUtil.ZERO ;
      A351PMCRPRTDC = "" ;
      A208ACMVOIFDO2 = GXutil.nullDate() ;
      A139ACACSGID = "" ;
      A150ACMVOIPRE = DecimalUtil.ZERO ;
      A162ACMVOIUB1 = "" ;
      A7705EXPINSPROY = "" ;
      AV141ACMVOIUB1 = "" ;
      A7710EXPINSCAN = DecimalUtil.ZERO ;
      A891PMRCKTQTYREQ = DecimalUtil.ZERO ;
      AV56ACRCOIDSC4 = "" ;
      A756ACRCOIDSC4 = "" ;
      AV234ACRCOICONSER = "" ;
      A323ACRCOIALM = "" ;
      A10943ACRCOIPRECOT = DecimalUtil.ZERO ;
      A712INPR09ID = "" ;
      AV125PERIODODSC = "" ;
      A5881PERIODOID = "" ;
      A5882PERIODODSC = "" ;
      AV81ACRCPACTCG = "" ;
      A350PMPRCNPRES = DecimalUtil.ZERO ;
      AV109PACRCPAFREQ = GXutil.nullDate() ;
      A6208PMPRCNMPERTN3 = "" ;
      AV110PMPRCNMPERTN3 = "" ;
      A6209PMPRCNMPERTN4 = "" ;
      AV111PMPRCNMPERTN4 = "" ;
      A6213PMPRCNMPRES = DecimalUtil.ZERO ;
      AV163OmitirEnvioCorreo = "" ;
      AV245EnviarCorreoOC = "" ;
      AV201generarValeAutomatico = "" ;
      AV22CNCIASDSC = "" ;
      AV121Proyecto = "" ;
      AV120UsuarioSol = "" ;
      AV221ServidorSMTP = "" ;
      AV223correoEnvia = "" ;
      AV224contrasenaEnvia = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV24CNESMNID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV101continuar = "" ;
      A316ACRCOIQTP = DecimalUtil.ZERO ;
      A172PMCTPRDSC = "" ;
      A2506ACRCPAL2TDC = "" ;
      A2510ACRCPAL2USR = "" ;
      A5940CNUSERID = "" ;
      A205CNCDIREM = "" ;
      A190CNUSERDSC = "" ;
      AV93CNUSERDSC2 = "" ;
      A279INPR02ID = "" ;
      A194CNCDIRNOM = "" ;
      AV232existeInv = "" ;
      AV214ACRCOIALID = "" ;
      AV202GEDEVATIPO = "" ;
      A135ACACTLID = "" ;
      A1148INTPALID = "" ;
      A7804INPRODCPNAC = DecimalUtil.ZERO ;
      A306ACRCOIALID = "" ;
      A314ACRCOIQTO = DecimalUtil.ZERO ;
      AV206EXPINSTIP = "" ;
      A282INUMBAID = "" ;
      A954ACRCOIUNGD = "" ;
      AV195CNTDOCDSC = "" ;
      A7410GEDEVADOC = "" ;
      A7418GEDEVACOD = "" ;
      AV75CNUSERDSC = "" ;
      AV199codigobarra = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucKdsstylesdatatables1 = new com.genexus.webpanels.GXUserControl();
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV39INPRODI2_P = "" ;
      AV37INPRODDSC = "" ;
      AV18ACRCPAUM = "" ;
      AV16ACRCPAQTY = DecimalUtil.ZERO ;
      AV8ACRCOIOBSAUT = "" ;
      AV103ACRCPAOBS = "" ;
      AV231ACRCOIPRECOT = DecimalUtil.ZERO ;
      AV177auxACRCPAQTY = DecimalUtil.ZERO ;
      AV165INPR01DSC_G = "" ;
      AV166INPR02DSC_G = "" ;
      AV162INALMNDSC = "" ;
      AV167subfamdsc = "" ;
      AV159Question = "" ;
      AV117permite = "" ;
      AV79Disponible = DecimalUtil.ZERO ;
      AV106DisponibleM = DecimalUtil.ZERO ;
      AV143ACRCPAPREPRO = DecimalUtil.ZERO ;
      AV169precio = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H002I2_A5939CNCIASID = new long[1] ;
      H002I2_A9CNCIASDSC = new String[] {""} ;
      H002I2_n9CNCIASDSC = new boolean[] {false} ;
      H002I3_A16970CATCARID = new long[1] ;
      H002I3_A16971CATCARDSC = new String[] {""} ;
      H002I3_n16971CATCARDSC = new boolean[] {false} ;
      H002I4_A93CGUNNGID = new String[] {""} ;
      H002I4_A336CGUNNGDSC = new String[] {""} ;
      H002I4_n336CGUNNGDSC = new boolean[] {false} ;
      AV124ACRCPACOM = "" ;
      AV29F1 = GXutil.nullDate() ;
      AV118ACRCOIFDOC = GXutil.nullDate() ;
      AV230leINALMNDSC = "" ;
      AV233dscTrabajoRealizar = "" ;
      hsh = "" ;
      AV48session = httpContext.getWebSession();
      H002I5_A267ACRCOILIN = new int[1] ;
      H002I5_A266ACRCOIDOC = new long[1] ;
      H002I5_A20CNTDOCID = new String[] {""} ;
      H002I5_A5939CNCIASID = new long[1] ;
      H002I5_A933ACRCOIFDOC = new java.util.Date[] {GXutil.nullDate()} ;
      H002I5_n933ACRCOIFDOC = new boolean[] {false} ;
      H002I5_A311ACRCOIFREQ = new java.util.Date[] {GXutil.nullDate()} ;
      H002I5_n311ACRCOIFREQ = new boolean[] {false} ;
      H002I5_A6136ACRCOIAR = new String[] {""} ;
      H002I5_n6136ACRCOIAR = new boolean[] {false} ;
      H002I5_A6137ACRCOICST = new String[] {""} ;
      H002I5_n6137ACRCOICST = new boolean[] {false} ;
      H002I5_A171PMCTPRID = new String[] {""} ;
      H002I5_n171PMCTPRID = new boolean[] {false} ;
      H002I5_A932ACRCOISOL = new long[1] ;
      H002I5_n932ACRCOISOL = new boolean[] {false} ;
      H002I5_A16927ACRCOIACD = new short[1] ;
      H002I5_n16927ACRCOIACD = new boolean[] {false} ;
      H002I5_A954ACRCOIUNGD = new String[] {""} ;
      H002I5_n954ACRCOIUNGD = new boolean[] {false} ;
      H002I5_A719ACRCOICOM = new String[] {""} ;
      H002I5_n719ACRCOICOM = new boolean[] {false} ;
      H002I5_A306ACRCOIALID = new String[] {""} ;
      H002I5_n306ACRCOIALID = new boolean[] {false} ;
      H002I5_A17149ACRCOIUSRREC = new long[1] ;
      H002I5_n17149ACRCOIUSRREC = new boolean[] {false} ;
      H002I5_A312ACRCOIUSR = new String[] {""} ;
      H002I5_n312ACRCOIUSR = new boolean[] {false} ;
      H002I5_A310ACRCOIBCT = new String[] {""} ;
      H002I5_n310ACRCOIBCT = new boolean[] {false} ;
      H002I5_A18140ACRCOICONSER = new String[] {""} ;
      H002I5_n18140ACRCOICONSER = new boolean[] {false} ;
      A933ACRCOIFDOC = GXutil.nullDate() ;
      A311ACRCOIFREQ = GXutil.nullDate() ;
      A6136ACRCOIAR = "" ;
      A6137ACRCOICST = "" ;
      A719ACRCOICOM = "" ;
      A312ACRCOIUSR = "" ;
      A310ACRCOIBCT = "" ;
      A18140ACRCOICONSER = "" ;
      AV10ACRCOIUSR = "" ;
      H002I6_A266ACRCOIDOC = new long[1] ;
      H002I6_A20CNTDOCID = new String[] {""} ;
      H002I6_A5939CNCIASID = new long[1] ;
      H002I6_A311ACRCOIFREQ = new java.util.Date[] {GXutil.nullDate()} ;
      H002I6_n311ACRCOIFREQ = new boolean[] {false} ;
      H002I6_A6136ACRCOIAR = new String[] {""} ;
      H002I6_n6136ACRCOIAR = new boolean[] {false} ;
      H002I6_A6137ACRCOICST = new String[] {""} ;
      H002I6_n6137ACRCOICST = new boolean[] {false} ;
      H002I6_A932ACRCOISOL = new long[1] ;
      H002I6_n932ACRCOISOL = new boolean[] {false} ;
      H002I6_A306ACRCOIALID = new String[] {""} ;
      H002I6_n306ACRCOIALID = new boolean[] {false} ;
      H002I6_A719ACRCOICOM = new String[] {""} ;
      H002I6_n719ACRCOICOM = new boolean[] {false} ;
      H002I6_A17149ACRCOIUSRREC = new long[1] ;
      H002I6_n17149ACRCOIUSRREC = new boolean[] {false} ;
      H002I6_A312ACRCOIUSR = new String[] {""} ;
      H002I6_n312ACRCOIUSR = new boolean[] {false} ;
      H002I6_A310ACRCOIBCT = new String[] {""} ;
      H002I6_n310ACRCOIBCT = new boolean[] {false} ;
      H002I6_A18140ACRCOICONSER = new String[] {""} ;
      H002I6_n18140ACRCOICONSER = new boolean[] {false} ;
      AV131Usuario = "" ;
      AV225ManejarFEoNom = "" ;
      H002I7_A5939CNCIASID = new long[1] ;
      H002I7_A9CNCIASDSC = new String[] {""} ;
      H002I7_n9CNCIASDSC = new boolean[] {false} ;
      A9CNCIASDSC = "" ;
      AV5CNESDSOP = "" ;
      AV32img = "" ;
      AV191PTX = new String [1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV191PTX[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV49style = "" ;
      H002I8_A2380ACRCPAEST = new String[] {""} ;
      H002I8_n2380ACRCPAEST = new boolean[] {false} ;
      H002I8_A271ACRCPADOC = new long[1] ;
      H002I8_A270ACRCPATDC = new String[] {""} ;
      H002I8_A269ACRCPACIA = new long[1] ;
      H002I8_A328ACRCPAPRID = new long[1] ;
      H002I8_n328ACRCPAPRID = new boolean[] {false} ;
      H002I8_A329ACRCPAQTY = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I8_n329ACRCPAQTY = new boolean[] {false} ;
      H002I8_A330ACRCPAUM = new String[] {""} ;
      H002I8_n330ACRCPAUM = new boolean[] {false} ;
      H002I8_A331ACRCPAFREQ = new java.util.Date[] {GXutil.nullDate()} ;
      H002I8_n331ACRCPAFREQ = new boolean[] {false} ;
      H002I8_A326ACRCPAUSSOL = new String[] {""} ;
      H002I8_n326ACRCPAUSSOL = new boolean[] {false} ;
      H002I8_A817ACRCPACNRQPDIAS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I8_n817ACRCPACNRQPDIAS = new boolean[] {false} ;
      H002I8_A3902ACRCPAOBS = new String[] {""} ;
      H002I8_n3902ACRCPAOBS = new boolean[] {false} ;
      H002I8_A10945ACRCPAPRECOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I8_n10945ACRCPAPRECOT = new boolean[] {false} ;
      H002I8_A10946ACRCPAPREPRO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I8_n10946ACRCPAPREPRO = new boolean[] {false} ;
      H002I8_A272ACRCPALIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV19ACRCPAUSSOL = "" ;
      AV144G1ACRCPAQTY = DecimalUtil.ZERO ;
      AV145cantSinINOC = DecimalUtil.ZERO ;
      AV156g1ACRCPAPRECOT = DecimalUtil.ZERO ;
      AV157g1ACRCPAPREPRO = DecimalUtil.ZERO ;
      AV142ACRCPAPRECOT = DecimalUtil.ZERO ;
      AV160Guardar = "" ;
      AV158Renovar = "" ;
      AV189Renovar1 = "" ;
      AV26color = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV176cadena = "" ;
      AV67SCRIPT = "" ;
      AV66SCRIPT2 = "" ;
      H002I9_A281INPRODID = new long[1] ;
      H002I9_A1INPR01ID = new String[] {""} ;
      H002I9_n1INPR01ID = new boolean[] {false} ;
      H002I9_A279INPR02ID = new String[] {""} ;
      H002I9_n279INPR02ID = new boolean[] {false} ;
      H002I9_A710INPR07ID = new String[] {""} ;
      H002I9_n710INPR07ID = new boolean[] {false} ;
      H002I9_A267ACRCOILIN = new int[1] ;
      H002I9_A266ACRCOIDOC = new long[1] ;
      H002I9_A20CNTDOCID = new String[] {""} ;
      H002I9_A5939CNCIASID = new long[1] ;
      H002I9_A322ACRCOIUB4 = new String[] {""} ;
      H002I9_n322ACRCOIUB4 = new boolean[] {false} ;
      H002I9_A1366ACRCOIA2D = new String[] {""} ;
      H002I9_n1366ACRCOIA2D = new boolean[] {false} ;
      H002I9_A268ACRCOIPRID = new long[1] ;
      H002I9_n268ACRCOIPRID = new boolean[] {false} ;
      H002I9_A5682ACRCOIS001 = new String[] {""} ;
      H002I9_n5682ACRCOIS001 = new boolean[] {false} ;
      H002I9_A6988ACRCOIDIAS = new short[1] ;
      H002I9_n6988ACRCOIDIAS = new boolean[] {false} ;
      H002I9_A8447ACRCOIRFINI = new java.util.Date[] {GXutil.nullDate()} ;
      H002I9_n8447ACRCOIRFINI = new boolean[] {false} ;
      H002I9_A8448ACRCOIRFFIN = new java.util.Date[] {GXutil.nullDate()} ;
      H002I9_n8448ACRCOIRFFIN = new boolean[] {false} ;
      H002I9_A8557ACRCOIRPER = new String[] {""} ;
      H002I9_n8557ACRCOIRPER = new boolean[] {false} ;
      A1INPR01ID = "" ;
      AV42PMCTCGDSC = "" ;
      AV168ACRCOIS001 = "" ;
      H002I10_A10967SUBFAMID = new String[] {""} ;
      H002I10_A10968SUBFAMDSC = new String[] {""} ;
      H002I10_n10968SUBFAMDSC = new boolean[] {false} ;
      AV83Comprometido1 = DecimalUtil.ZERO ;
      c359PMCRPRMN = DecimalUtil.ZERO ;
      H002I11_A359PMCRPRMN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I11_n359PMCRPRMN = new boolean[] {false} ;
      H002I12_A5881PERIODOID = new String[] {""} ;
      H002I12_A5882PERIODODSC = new String[] {""} ;
      H002I13_A171PMCTPRID = new String[] {""} ;
      H002I13_n171PMCTPRID = new boolean[] {false} ;
      H002I13_A271ACRCPADOC = new long[1] ;
      H002I13_A270ACRCPATDC = new String[] {""} ;
      H002I13_A269ACRCPACIA = new long[1] ;
      H002I13_A172PMCTPRDSC = new String[] {""} ;
      H002I13_n172PMCTPRDSC = new boolean[] {false} ;
      AV44PMCTPRDSC = "" ;
      H002I14_A2509ACRCPAL2NIV = new byte[1] ;
      H002I14_A2508ACRCPAL2LIN = new long[1] ;
      H002I14_A2507ACRCPAL2DOC = new long[1] ;
      H002I14_A2506ACRCPAL2TDC = new String[] {""} ;
      H002I14_A2505ACRCPAL2CIA = new long[1] ;
      H002I14_A2510ACRCPAL2USR = new String[] {""} ;
      AV73ACRCPAL2USR = "" ;
      H002I15_A46CNCDIRID = new long[1] ;
      H002I15_n46CNCDIRID = new boolean[] {false} ;
      H002I15_A5940CNUSERID = new String[] {""} ;
      H002I15_A205CNCDIREM = new String[] {""} ;
      H002I15_n205CNCDIREM = new boolean[] {false} ;
      H002I15_A190CNUSERDSC = new String[] {""} ;
      H002I15_n190CNUSERDSC = new boolean[] {false} ;
      AV74CNCDIREM = "" ;
      AV77Asunto = "" ;
      AV76CuerpoCorreo = "" ;
      AV235INPRODID = new GXSimpleCollection<Long>(Long.class, "internal", "");
      AV36INPR02ID = new GXSimpleCollection<String>(String.class, "internal", "");
      AV239CCNCDIRID = new GXSimpleCollection<Long>(Long.class, "internal", "");
      AV242CACRCPALIN = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
      H002I16_A281INPRODID = new long[1] ;
      H002I16_A279INPR02ID = new String[] {""} ;
      H002I16_n279INPR02ID = new boolean[] {false} ;
      H002I17_A279INPR02ID = new String[] {""} ;
      H002I17_n279INPR02ID = new boolean[] {false} ;
      H002I17_A886INPR02CMID = new long[1] ;
      H002I17_n886INPR02CMID = new boolean[] {false} ;
      AV238AINPR02ID = "" ;
      H002I18_A46CNCDIRID = new long[1] ;
      H002I18_n46CNCDIRID = new boolean[] {false} ;
      H002I18_A194CNCDIRNOM = new String[] {""} ;
      H002I18_n194CNCDIRNOM = new boolean[] {false} ;
      H002I18_A205CNCDIREM = new String[] {""} ;
      H002I18_n205CNCDIREM = new boolean[] {false} ;
      AV240ACNCDIRNOM = "" ;
      AV243cadenaLineas = "" ;
      AV244variable = DecimalUtil.ZERO ;
      H002I19_A887PMRCKTCIA = new long[1] ;
      H002I19_A888PMRCKTTDC = new String[] {""} ;
      H002I19_A890PMRCKTIDKIT = new long[1] ;
      H002I19_A889PMRCKTDOC = new long[1] ;
      H002I19_A891PMRCKTQTYREQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I19_n891PMRCKTQTYREQ = new boolean[] {false} ;
      H002I20_A267ACRCOILIN = new int[1] ;
      H002I20_A266ACRCOIDOC = new long[1] ;
      H002I20_A20CNTDOCID = new String[] {""} ;
      H002I20_A5939CNCIASID = new long[1] ;
      H002I20_A893ACRCOININKIT = new long[1] ;
      H002I20_n893ACRCOININKIT = new boolean[] {false} ;
      H002I21_A267ACRCOILIN = new int[1] ;
      H002I21_A266ACRCOIDOC = new long[1] ;
      H002I21_A20CNTDOCID = new String[] {""} ;
      H002I21_A5939CNCIASID = new long[1] ;
      H002I21_A756ACRCOIDSC4 = new String[] {""} ;
      H002I21_n756ACRCOIDSC4 = new boolean[] {false} ;
      H002I21_A323ACRCOIALM = new String[] {""} ;
      H002I21_n323ACRCOIALM = new boolean[] {false} ;
      H002I21_A10943ACRCOIPRECOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I21_n10943ACRCOIPRECOT = new boolean[] {false} ;
      AV161ACRCOIALM = "" ;
      GXt_char1 = "" ;
      H002I22_A139ACACSGID = new String[] {""} ;
      H002I22_n139ACACSGID = new boolean[] {false} ;
      H002I22_A893ACRCOININKIT = new long[1] ;
      H002I22_n893ACRCOININKIT = new boolean[] {false} ;
      H002I22_A266ACRCOIDOC = new long[1] ;
      H002I22_A20CNTDOCID = new String[] {""} ;
      H002I22_A5939CNCIASID = new long[1] ;
      H002I22_A267ACRCOILIN = new int[1] ;
      H002I22_A268ACRCOIPRID = new long[1] ;
      H002I22_n268ACRCOIPRID = new boolean[] {false} ;
      H002I22_A316ACRCOIQTP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I22_n316ACRCOIQTP = new boolean[] {false} ;
      GXv_int5 = new short [1] ;
      AV100existe = "" ;
      H002I23_A411PMPRCNCIA = new long[1] ;
      H002I23_A383PMPRCNBASE = new long[1] ;
      H002I23_A384PMPRCNPERT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_A394PMPRCNPERTN2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_A395PMPRCNPERTN3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_A396PMPRCNPERTN4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_A397PMPRCNPERTN5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_A348PMCTCGID = new String[] {""} ;
      H002I23_A171PMCTPRID = new String[] {""} ;
      H002I23_n171PMCTPRID = new boolean[] {false} ;
      H002I23_A350PMPRCNPRES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I23_n350PMPRCNPRES = new boolean[] {false} ;
      c6213PMPRCNMPRES = DecimalUtil.ZERO ;
      H002I24_A6213PMPRCNMPRES = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I24_n6213PMPRCNMPRES = new boolean[] {false} ;
      H002I25_A281INPRODID = new long[1] ;
      H002I25_A712INPR09ID = new String[] {""} ;
      H002I25_n712INPR09ID = new boolean[] {false} ;
      H002I26_A141ACMVOILIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I26_A142ACMVOIPRID = new long[1] ;
      H002I26_n142ACMVOIPRID = new boolean[] {false} ;
      H002I26_A139ACACSGID = new String[] {""} ;
      H002I26_n139ACACSGID = new boolean[] {false} ;
      H002I26_A43ACMVOIDOC = new long[1] ;
      H002I26_A20CNTDOCID = new String[] {""} ;
      H002I26_A5939CNCIASID = new long[1] ;
      H002I26_A150ACMVOIPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I26_n150ACMVOIPRE = new boolean[] {false} ;
      H002I26_A162ACMVOIUB1 = new String[] {""} ;
      H002I26_n162ACMVOIUB1 = new boolean[] {false} ;
      H002I26_A208ACMVOIFDO2 = new java.util.Date[] {GXutil.nullDate()} ;
      H002I26_n208ACMVOIFDO2 = new boolean[] {false} ;
      AV164UltimoPrecio = "" ;
      H002I27_A141ACMVOILIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I27_A5939CNCIASID = new long[1] ;
      H002I27_A142ACMVOIPRID = new long[1] ;
      H002I27_n142ACMVOIPRID = new boolean[] {false} ;
      H002I27_A139ACACSGID = new String[] {""} ;
      H002I27_n139ACACSGID = new boolean[] {false} ;
      H002I27_A43ACMVOIDOC = new long[1] ;
      H002I27_A20CNTDOCID = new String[] {""} ;
      H002I27_A150ACMVOIPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I27_n150ACMVOIPRE = new boolean[] {false} ;
      H002I27_A162ACMVOIUB1 = new String[] {""} ;
      H002I27_n162ACMVOIUB1 = new boolean[] {false} ;
      H002I27_A208ACMVOIFDO2 = new java.util.Date[] {GXutil.nullDate()} ;
      H002I27_n208ACMVOIFDO2 = new boolean[] {false} ;
      H002I28_A7705EXPINSPROY = new String[] {""} ;
      H002I28_A7704EXPINSPROD = new long[1] ;
      H002I28_A7710EXPINSCAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I28_n7710EXPINSCAN = new boolean[] {false} ;
      H002I29_A419PMRLINLIN = new long[1] ;
      H002I29_A352PMCRPRNDC = new long[1] ;
      H002I29_A353PMCRPRLIN = new long[1] ;
      H002I29_A415PMCRPREST = new String[] {""} ;
      H002I29_n415PMCRPREST = new boolean[] {false} ;
      H002I29_A370PMCRPRPROD = new long[1] ;
      H002I29_n370PMCRPRPROD = new boolean[] {false} ;
      H002I29_A171PMCTPRID = new String[] {""} ;
      H002I29_n171PMCTPRID = new boolean[] {false} ;
      H002I29_A412PMCRPRCIA = new long[1] ;
      H002I29_A362PMTPOPID = new String[] {""} ;
      H002I29_n362PMTPOPID = new boolean[] {false} ;
      H002I29_A355PMCRPRQTY = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I29_n355PMCRPRQTY = new boolean[] {false} ;
      H002I29_A351PMCRPRTDC = new String[] {""} ;
      H002I30_A267ACRCOILIN = new int[1] ;
      H002I30_A266ACRCOIDOC = new long[1] ;
      H002I30_A20CNTDOCID = new String[] {""} ;
      H002I30_A5939CNCIASID = new long[1] ;
      H002I30_A8585ACRCOIURG = new String[] {""} ;
      H002I30_n8585ACRCOIURG = new boolean[] {false} ;
      H002I30_A8586ACRCOIIMP = new String[] {""} ;
      H002I30_n8586ACRCOIIMP = new boolean[] {false} ;
      H002I30_A325ACRCOIFRE2 = new java.util.Date[] {GXutil.nullDate()} ;
      H002I30_n325ACRCOIFRE2 = new boolean[] {false} ;
      AV171TEM_ACRCOIURG = "" ;
      AV172TEM_ACRCOIIMP = "" ;
      AV174TEM_ACRCOIFRE2 = GXutil.nullDate() ;
      H002I31_A411PMPRCNCIA = new long[1] ;
      H002I31_A379PMAGCCID = new String[] {""} ;
      H002I31_A381PMCTCGCLASE = new byte[1] ;
      H002I31_n381PMCTCGCLASE = new boolean[] {false} ;
      H002I31_A171PMCTPRID = new String[] {""} ;
      H002I31_n171PMCTPRID = new boolean[] {false} ;
      H002I31_A348PMCTCGID = new String[] {""} ;
      H002I31_A349PMCTCGDSC = new String[] {""} ;
      H002I31_n349PMCTCGDSC = new boolean[] {false} ;
      H002I31_A397PMPRCNPERTN5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I31_A396PMPRCNPERTN4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I31_A395PMPRCNPERTN3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I31_A394PMPRCNPERTN2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I31_A384PMPRCNPERT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I31_A383PMPRCNBASE = new long[1] ;
      AV178PMCTCGID_C = "" ;
      AV186PMCTCGDSC_C = "" ;
      AV180PMPRCNPERT = DecimalUtil.ZERO ;
      AV181PMPRCNPERTN2 = DecimalUtil.ZERO ;
      AV182PMPRCNPERTN3 = DecimalUtil.ZERO ;
      AV183PMPRCNPERTN4 = DecimalUtil.ZERO ;
      AV194CNTDOCID = "" ;
      H002I32_A281INPRODID = new long[1] ;
      H002I32_A1148INTPALID = new String[] {""} ;
      H002I32_n1148INTPALID = new boolean[] {false} ;
      H002I32_A139ACACSGID = new String[] {""} ;
      H002I32_n139ACACSGID = new boolean[] {false} ;
      H002I32_A135ACACTLID = new String[] {""} ;
      H002I32_n135ACACTLID = new boolean[] {false} ;
      H002I32_A266ACRCOIDOC = new long[1] ;
      H002I32_A20CNTDOCID = new String[] {""} ;
      H002I32_A5939CNCIASID = new long[1] ;
      H002I32_A267ACRCOILIN = new int[1] ;
      H002I32_A7804INPRODCPNAC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I32_n7804INPRODCPNAC = new boolean[] {false} ;
      H002I32_A306ACRCOIALID = new String[] {""} ;
      H002I32_n306ACRCOIALID = new boolean[] {false} ;
      H002I32_A322ACRCOIUB4 = new String[] {""} ;
      H002I32_n322ACRCOIUB4 = new boolean[] {false} ;
      H002I32_A268ACRCOIPRID = new long[1] ;
      H002I32_n268ACRCOIPRID = new boolean[] {false} ;
      H002I32_A314ACRCOIQTO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002I32_n314ACRCOIQTO = new boolean[] {false} ;
      H002I32_A282INUMBAID = new String[] {""} ;
      H002I32_n282INUMBAID = new boolean[] {false} ;
      H002I32_A756ACRCOIDSC4 = new String[] {""} ;
      H002I32_n756ACRCOIDSC4 = new boolean[] {false} ;
      H002I32_A954ACRCOIUNGD = new String[] {""} ;
      H002I32_n954ACRCOIUNGD = new boolean[] {false} ;
      AV210INPRODCPNAC = DecimalUtil.ZERO ;
      GXv_int8 = new int [1] ;
      GXv_decimal3 = new java.math.BigDecimal [1] ;
      GXv_char10 = new String [1] ;
      GXv_int12 = new long [1] ;
      GXv_char7 = new String [1] ;
      GXv_int9 = new long [1] ;
      GXv_char4 = new String [1] ;
      GXv_int6 = new short [1] ;
      GXv_char2 = new String [1] ;
      AV197MensajeMostrar = "" ;
      AV226nombre = "" ;
      AV57Window = new com.genexus.webpanels.GXWindow();
      AV198txtMensaje = "" ;
      H002I33_A7408GEDEVAPR = new String[] {""} ;
      H002I33_A7595DESTFINID = new long[1] ;
      H002I33_A8560GEDEVACIA = new long[1] ;
      H002I33_A7411GEDEVAID = new long[1] ;
      H002I33_A7410GEDEVADOC = new String[] {""} ;
      H002I33_A7418GEDEVACOD = new String[] {""} ;
      H002I33_n7418GEDEVACOD = new boolean[] {false} ;
      AV200codigobarra2 = "" ;
      AV228INTPALID = "" ;
      H002I34_A267ACRCOILIN = new int[1] ;
      H002I34_A268ACRCOIPRID = new long[1] ;
      H002I34_n268ACRCOIPRID = new boolean[] {false} ;
      H002I34_A281INPRODID = new long[1] ;
      H002I34_A1148INTPALID = new String[] {""} ;
      H002I34_n1148INTPALID = new boolean[] {false} ;
      H002I34_A139ACACSGID = new String[] {""} ;
      H002I34_n139ACACSGID = new boolean[] {false} ;
      H002I34_A135ACACTLID = new String[] {""} ;
      H002I34_n135ACACTLID = new boolean[] {false} ;
      H002I34_A266ACRCOIDOC = new long[1] ;
      H002I34_A20CNTDOCID = new String[] {""} ;
      H002I34_A5939CNCIASID = new long[1] ;
      AV220cuerpo = "" ;
      GXv_int14 = new long [1] ;
      GXv_char16 = new String [1] ;
      AV211CNUSERIDMOB = "" ;
      GXv_char15 = new String [1] ;
      GXv_char13 = new String [1] ;
      GXv_char11 = new String [1] ;
      AV212PDMEMNOTNOME = "" ;
      lblTitulopantalla_Jsonclick = "" ;
      lblTxtguardar_Jsonclick = "" ;
      lblTxtlista_Jsonclick = "" ;
      lblTxtregresar_Jsonclick = "" ;
      lblTxtstyle_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock12_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTxtlinks_Jsonclick = "" ;
      ucMensaje = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      GXCCtl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.wautreq__default(),
         new Object[] {
             new Object[] {
            H002I2_A5939CNCIASID, H002I2_A9CNCIASDSC, H002I2_n9CNCIASDSC
            }
            , new Object[] {
            H002I3_A16970CATCARID, H002I3_A16971CATCARDSC, H002I3_n16971CATCARDSC
            }
            , new Object[] {
            H002I4_A93CGUNNGID, H002I4_A336CGUNNGDSC, H002I4_n336CGUNNGDSC
            }
            , new Object[] {
            H002I5_A267ACRCOILIN, H002I5_A266ACRCOIDOC, H002I5_A20CNTDOCID, H002I5_A5939CNCIASID, H002I5_A933ACRCOIFDOC, H002I5_n933ACRCOIFDOC, H002I5_A311ACRCOIFREQ, H002I5_n311ACRCOIFREQ, H002I5_A6136ACRCOIAR, H002I5_n6136ACRCOIAR,
            H002I5_A6137ACRCOICST, H002I5_n6137ACRCOICST, H002I5_A171PMCTPRID, H002I5_n171PMCTPRID, H002I5_A932ACRCOISOL, H002I5_n932ACRCOISOL, H002I5_A16927ACRCOIACD, H002I5_n16927ACRCOIACD, H002I5_A954ACRCOIUNGD, H002I5_n954ACRCOIUNGD,
            H002I5_A719ACRCOICOM, H002I5_n719ACRCOICOM, H002I5_A306ACRCOIALID, H002I5_n306ACRCOIALID, H002I5_A17149ACRCOIUSRREC, H002I5_n17149ACRCOIUSRREC, H002I5_A312ACRCOIUSR, H002I5_n312ACRCOIUSR, H002I5_A310ACRCOIBCT, H002I5_n310ACRCOIBCT,
            H002I5_A18140ACRCOICONSER, H002I5_n18140ACRCOICONSER
            }
            , new Object[] {
            H002I6_A266ACRCOIDOC, H002I6_A20CNTDOCID, H002I6_A5939CNCIASID, H002I6_A311ACRCOIFREQ, H002I6_n311ACRCOIFREQ, H002I6_A6136ACRCOIAR, H002I6_n6136ACRCOIAR, H002I6_A6137ACRCOICST, H002I6_n6137ACRCOICST, H002I6_A932ACRCOISOL,
            H002I6_n932ACRCOISOL, H002I6_A306ACRCOIALID, H002I6_n306ACRCOIALID, H002I6_A719ACRCOICOM, H002I6_n719ACRCOICOM, H002I6_A17149ACRCOIUSRREC, H002I6_n17149ACRCOIUSRREC, H002I6_A312ACRCOIUSR, H002I6_n312ACRCOIUSR, H002I6_A310ACRCOIBCT,
            H002I6_n310ACRCOIBCT, H002I6_A18140ACRCOICONSER, H002I6_n18140ACRCOICONSER
            }
            , new Object[] {
            H002I7_A5939CNCIASID, H002I7_A9CNCIASDSC, H002I7_n9CNCIASDSC
            }
            , new Object[] {
            H002I8_A2380ACRCPAEST, H002I8_n2380ACRCPAEST, H002I8_A271ACRCPADOC, H002I8_A270ACRCPATDC, H002I8_A269ACRCPACIA, H002I8_A328ACRCPAPRID, H002I8_n328ACRCPAPRID, H002I8_A329ACRCPAQTY, H002I8_n329ACRCPAQTY, H002I8_A330ACRCPAUM,
            H002I8_n330ACRCPAUM, H002I8_A331ACRCPAFREQ, H002I8_n331ACRCPAFREQ, H002I8_A326ACRCPAUSSOL, H002I8_n326ACRCPAUSSOL, H002I8_A817ACRCPACNRQPDIAS, H002I8_n817ACRCPACNRQPDIAS, H002I8_A3902ACRCPAOBS, H002I8_n3902ACRCPAOBS, H002I8_A10945ACRCPAPRECOT,
            H002I8_n10945ACRCPAPRECOT, H002I8_A10946ACRCPAPREPRO, H002I8_n10946ACRCPAPREPRO, H002I8_A272ACRCPALIN
            }
            , new Object[] {
            H002I9_A281INPRODID, H002I9_A1INPR01ID, H002I9_n1INPR01ID, H002I9_A279INPR02ID, H002I9_n279INPR02ID, H002I9_A710INPR07ID, H002I9_n710INPR07ID, H002I9_A267ACRCOILIN, H002I9_A266ACRCOIDOC, H002I9_A20CNTDOCID,
            H002I9_A5939CNCIASID, H002I9_A322ACRCOIUB4, H002I9_n322ACRCOIUB4, H002I9_A1366ACRCOIA2D, H002I9_n1366ACRCOIA2D, H002I9_A268ACRCOIPRID, H002I9_n268ACRCOIPRID, H002I9_A5682ACRCOIS001, H002I9_n5682ACRCOIS001, H002I9_A6988ACRCOIDIAS,
            H002I9_n6988ACRCOIDIAS, H002I9_A8447ACRCOIRFINI, H002I9_n8447ACRCOIRFINI, H002I9_A8448ACRCOIRFFIN, H002I9_n8448ACRCOIRFFIN, H002I9_A8557ACRCOIRPER, H002I9_n8557ACRCOIRPER
            }
            , new Object[] {
            H002I10_A10967SUBFAMID, H002I10_A10968SUBFAMDSC, H002I10_n10968SUBFAMDSC
            }
            , new Object[] {
            H002I11_A359PMCRPRMN, H002I11_n359PMCRPRMN
            }
            , new Object[] {
            H002I12_A5881PERIODOID, H002I12_A5882PERIODODSC
            }
            , new Object[] {
            H002I13_A171PMCTPRID, H002I13_n171PMCTPRID, H002I13_A271ACRCPADOC, H002I13_A270ACRCPATDC, H002I13_A269ACRCPACIA, H002I13_A172PMCTPRDSC, H002I13_n172PMCTPRDSC
            }
            , new Object[] {
            H002I14_A2509ACRCPAL2NIV, H002I14_A2508ACRCPAL2LIN, H002I14_A2507ACRCPAL2DOC, H002I14_A2506ACRCPAL2TDC, H002I14_A2505ACRCPAL2CIA, H002I14_A2510ACRCPAL2USR
            }
            , new Object[] {
            H002I15_A46CNCDIRID, H002I15_n46CNCDIRID, H002I15_A5940CNUSERID, H002I15_A205CNCDIREM, H002I15_n205CNCDIREM, H002I15_A190CNUSERDSC, H002I15_n190CNUSERDSC
            }
            , new Object[] {
            H002I16_A281INPRODID, H002I16_A279INPR02ID, H002I16_n279INPR02ID
            }
            , new Object[] {
            H002I17_A279INPR02ID, H002I17_A886INPR02CMID, H002I17_n886INPR02CMID
            }
            , new Object[] {
            H002I18_A46CNCDIRID, H002I18_A194CNCDIRNOM, H002I18_n194CNCDIRNOM, H002I18_A205CNCDIREM, H002I18_n205CNCDIREM
            }
            , new Object[] {
            H002I19_A887PMRCKTCIA, H002I19_A888PMRCKTTDC, H002I19_A890PMRCKTIDKIT, H002I19_A889PMRCKTDOC, H002I19_A891PMRCKTQTYREQ, H002I19_n891PMRCKTQTYREQ
            }
            , new Object[] {
            H002I20_A267ACRCOILIN, H002I20_A266ACRCOIDOC, H002I20_A20CNTDOCID, H002I20_A5939CNCIASID, H002I20_A893ACRCOININKIT, H002I20_n893ACRCOININKIT
            }
            , new Object[] {
            H002I21_A267ACRCOILIN, H002I21_A266ACRCOIDOC, H002I21_A20CNTDOCID, H002I21_A5939CNCIASID, H002I21_A756ACRCOIDSC4, H002I21_n756ACRCOIDSC4, H002I21_A323ACRCOIALM, H002I21_n323ACRCOIALM, H002I21_A10943ACRCOIPRECOT, H002I21_n10943ACRCOIPRECOT
            }
            , new Object[] {
            H002I22_A139ACACSGID, H002I22_n139ACACSGID, H002I22_A893ACRCOININKIT, H002I22_n893ACRCOININKIT, H002I22_A266ACRCOIDOC, H002I22_A20CNTDOCID, H002I22_A5939CNCIASID, H002I22_A267ACRCOILIN, H002I22_A268ACRCOIPRID, H002I22_n268ACRCOIPRID,
            H002I22_A316ACRCOIQTP, H002I22_n316ACRCOIQTP
            }
            , new Object[] {
            H002I23_A411PMPRCNCIA, H002I23_A383PMPRCNBASE, H002I23_A384PMPRCNPERT, H002I23_A394PMPRCNPERTN2, H002I23_A395PMPRCNPERTN3, H002I23_A396PMPRCNPERTN4, H002I23_A397PMPRCNPERTN5, H002I23_A348PMCTCGID, H002I23_A171PMCTPRID, H002I23_A350PMPRCNPRES,
            H002I23_n350PMPRCNPRES
            }
            , new Object[] {
            H002I24_A6213PMPRCNMPRES, H002I24_n6213PMPRCNMPRES
            }
            , new Object[] {
            H002I25_A281INPRODID, H002I25_A712INPR09ID, H002I25_n712INPR09ID
            }
            , new Object[] {
            H002I26_A141ACMVOILIN, H002I26_A142ACMVOIPRID, H002I26_n142ACMVOIPRID, H002I26_A139ACACSGID, H002I26_A43ACMVOIDOC, H002I26_A20CNTDOCID, H002I26_A5939CNCIASID, H002I26_A150ACMVOIPRE, H002I26_n150ACMVOIPRE, H002I26_A162ACMVOIUB1,
            H002I26_n162ACMVOIUB1, H002I26_A208ACMVOIFDO2, H002I26_n208ACMVOIFDO2
            }
            , new Object[] {
            H002I27_A141ACMVOILIN, H002I27_A5939CNCIASID, H002I27_A142ACMVOIPRID, H002I27_n142ACMVOIPRID, H002I27_A139ACACSGID, H002I27_A43ACMVOIDOC, H002I27_A20CNTDOCID, H002I27_A150ACMVOIPRE, H002I27_n150ACMVOIPRE, H002I27_A162ACMVOIUB1,
            H002I27_n162ACMVOIUB1, H002I27_A208ACMVOIFDO2, H002I27_n208ACMVOIFDO2
            }
            , new Object[] {
            H002I28_A7705EXPINSPROY, H002I28_A7704EXPINSPROD, H002I28_A7710EXPINSCAN, H002I28_n7710EXPINSCAN
            }
            , new Object[] {
            H002I29_A419PMRLINLIN, H002I29_A352PMCRPRNDC, H002I29_A353PMCRPRLIN, H002I29_A415PMCRPREST, H002I29_n415PMCRPREST, H002I29_A370PMCRPRPROD, H002I29_n370PMCRPRPROD, H002I29_A171PMCTPRID, H002I29_A412PMCRPRCIA, H002I29_A362PMTPOPID,
            H002I29_n362PMTPOPID, H002I29_A355PMCRPRQTY, H002I29_n355PMCRPRQTY, H002I29_A351PMCRPRTDC
            }
            , new Object[] {
            H002I30_A267ACRCOILIN, H002I30_A266ACRCOIDOC, H002I30_A20CNTDOCID, H002I30_A5939CNCIASID, H002I30_A8585ACRCOIURG, H002I30_n8585ACRCOIURG, H002I30_A8586ACRCOIIMP, H002I30_n8586ACRCOIIMP, H002I30_A325ACRCOIFRE2, H002I30_n325ACRCOIFRE2
            }
            , new Object[] {
            H002I31_A411PMPRCNCIA, H002I31_A379PMAGCCID, H002I31_A381PMCTCGCLASE, H002I31_n381PMCTCGCLASE, H002I31_A171PMCTPRID, H002I31_A348PMCTCGID, H002I31_A349PMCTCGDSC, H002I31_n349PMCTCGDSC, H002I31_A397PMPRCNPERTN5, H002I31_A396PMPRCNPERTN4,
            H002I31_A395PMPRCNPERTN3, H002I31_A394PMPRCNPERTN2, H002I31_A384PMPRCNPERT, H002I31_A383PMPRCNBASE
            }
            , new Object[] {
            H002I32_A281INPRODID, H002I32_A1148INTPALID, H002I32_n1148INTPALID, H002I32_A139ACACSGID, H002I32_n139ACACSGID, H002I32_A135ACACTLID, H002I32_n135ACACTLID, H002I32_A266ACRCOIDOC, H002I32_A20CNTDOCID, H002I32_A5939CNCIASID,
            H002I32_A267ACRCOILIN, H002I32_A7804INPRODCPNAC, H002I32_n7804INPRODCPNAC, H002I32_A306ACRCOIALID, H002I32_n306ACRCOIALID, H002I32_A322ACRCOIUB4, H002I32_n322ACRCOIUB4, H002I32_A268ACRCOIPRID, H002I32_n268ACRCOIPRID, H002I32_A314ACRCOIQTO,
            H002I32_n314ACRCOIQTO, H002I32_A282INUMBAID, H002I32_n282INUMBAID, H002I32_A756ACRCOIDSC4, H002I32_n756ACRCOIDSC4, H002I32_A954ACRCOIUNGD, H002I32_n954ACRCOIUNGD
            }
            , new Object[] {
            H002I33_A7408GEDEVAPR, H002I33_A7595DESTFINID, H002I33_A8560GEDEVACIA, H002I33_A7411GEDEVAID, H002I33_A7410GEDEVADOC, H002I33_A7418GEDEVACOD, H002I33_n7418GEDEVACOD
            }
            , new Object[] {
            H002I34_A267ACRCOILIN, H002I34_A268ACRCOIPRID, H002I34_n268ACRCOIPRID, H002I34_A281INPRODID, H002I34_A1148INTPALID, H002I34_n1148INTPALID, H002I34_A139ACACSGID, H002I34_n139ACACSGID, H002I34_A135ACACTLID, H002I34_n135ACACTLID,
            H002I34_A266ACRCOIDOC, H002I34_A20CNTDOCID, H002I34_A5939CNCIASID
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      dynavCnciasid.setEnabled( 0 );
      edtavUsuariosol_Enabled = 0 ;
      edtavProyecto_Enabled = 0 ;
      edtavAcrcpacom_Enabled = 0 ;
      edtavAcrcoifdoc_Enabled = 0 ;
      edtavLeinalmndsc_Enabled = 0 ;
      edtavAcrcpalin_Enabled = 0 ;
      edtavAcrcpafreq_Enabled = 0 ;
      edtavAcrcpaprid_Enabled = 0 ;
      edtavInprodi2_p_Enabled = 0 ;
      edtavInproddsc_Enabled = 0 ;
      edtavAcrcoidsc4_Enabled = 0 ;
      edtavAcrcpaum_Enabled = 0 ;
      dynavAcrcoiacd.setEnabled( 0 );
      dynavCgunngid.setEnabled( 0 );
      edtavAcrcoiprecot_Enabled = 0 ;
      edtavAcrcoininkit_aux_Enabled = 0 ;
      edtavAuxacrcpaqty_Enabled = 0 ;
      edtavInpr01dsc_g_Enabled = 0 ;
      edtavInpr02dsc_g_Enabled = 0 ;
      edtavInalmndsc_Enabled = 0 ;
      edtavAcrcoidias_Enabled = 0 ;
      edtavPeriododsc_Enabled = 0 ;
      edtavSubfamdsc_Enabled = 0 ;
      edtavQuestion_Enabled = 0 ;
      edtavPermite_Enabled = 0 ;
      edtavPresupuestado_Enabled = 0 ;
      edtavComprometido_Enabled = 0 ;
      edtavDisponible_Enabled = 0 ;
      edtavPresupuestadom_Enabled = 0 ;
      edtavComprometidom_Enabled = 0 ;
      edtavDisponiblem_Enabled = 0 ;
      edtavAcrcpaprepro_Enabled = 0 ;
      edtavPrecio_Enabled = 0 ;
      edtavAcrcpaqtyr_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte A381PMCTCGCLASE ;
   private byte gxajaxcallmode ;
   private byte A2509ACRCPAL2NIV ;
   private byte AV20Autorizar ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GRID1_nEOF ;
   private byte AV256GXLvl621 ;
   private byte AV271GXLvl825 ;
   private byte AV281GXLvl973 ;
   private byte AV282GXLvl990 ;
   private byte AV283GXLvl1007 ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_83 ;
   private short nGXsfl_83_idx=1 ;
   private short AV192ACRCOIACD ;
   private short AV190AutorizarTod ;
   private short AV126ACRCOIDIAS ;
   private short A6988ACRCOIDIAS ;
   private short A6204PMPRCNMANIO ;
   private short A6205PMPRCNMMES ;
   private short AV70ENVIARCORREO ;
   private short AV71NIVSG ;
   private short AV203GEDEVADIAS ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A16927ACRCOIACD ;
   private short AV41num ;
   private short AV68visible ;
   private short AV53FLAG ;
   private short nGXsfl_83_fel_idx=1 ;
   private short AV91Autn ;
   private short GXv_int5[] ;
   private short GXv_int6[] ;
   private int edtavAcrcpaqty_Enabled ;
   private int A267ACRCOILIN ;
   private int AV222puerto ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int edtavUsuariosol_Enabled ;
   private int edtavProyecto_Enabled ;
   private int edtavAcrcpacom_Enabled ;
   private int edtavAcrcoifdoc_Enabled ;
   private int edtavLeinalmndsc_Enabled ;
   private int edtavAcrcpalin_Enabled ;
   private int edtavAcrcpafreq_Enabled ;
   private int edtavAcrcpaprid_Enabled ;
   private int edtavInprodi2_p_Enabled ;
   private int edtavInproddsc_Enabled ;
   private int edtavAcrcoidsc4_Enabled ;
   private int edtavAcrcpaum_Enabled ;
   private int edtavAcrcoiprecot_Enabled ;
   private int edtavAcrcoininkit_aux_Enabled ;
   private int edtavAuxacrcpaqty_Enabled ;
   private int edtavInpr01dsc_g_Enabled ;
   private int edtavInpr02dsc_g_Enabled ;
   private int edtavInalmndsc_Enabled ;
   private int edtavAcrcoidias_Enabled ;
   private int edtavPeriododsc_Enabled ;
   private int edtavSubfamdsc_Enabled ;
   private int edtavQuestion_Enabled ;
   private int edtavPermite_Enabled ;
   private int edtavPresupuestado_Enabled ;
   private int edtavComprometido_Enabled ;
   private int edtavDisponible_Enabled ;
   private int edtavPresupuestadom_Enabled ;
   private int edtavComprometidom_Enabled ;
   private int edtavDisponiblem_Enabled ;
   private int edtavAcrcpaprepro_Enabled ;
   private int edtavPrecio_Enabled ;
   private int edtavAcrcpaqtyr_Enabled ;
   private int edtavF1_Enabled ;
   private int edtavDsctrabajorealizar_Enabled ;
   private int edtavDsctrabajorealizar_Visible ;
   private int lblTextblock32_Visible ;
   private int edtavAcrcoiobsaut_Backcolor ;
   private int AV269GXV1 ;
   private int GXv_int8[] ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavAcrcpalin_Visible ;
   private int edtavAcrcpafreq_Visible ;
   private int edtavAcrcpaprid_Visible ;
   private int edtavInprodi2_p_Visible ;
   private int edtavInproddsc_Visible ;
   private int edtavAcrcoidsc4_Visible ;
   private int edtavAcrcpaum_Visible ;
   private int edtavAcrcpaqty_Visible ;
   private int edtavAcrcoiobsaut_Enabled ;
   private int edtavAcrcoiobsaut_Visible ;
   private int edtavAcrcpaobs_Enabled ;
   private int edtavAcrcpaobs_Visible ;
   private int edtavAcrcoiprecot_Visible ;
   private int edtavAcrcoininkit_aux_Visible ;
   private int edtavAuxacrcpaqty_Visible ;
   private int edtavInpr01dsc_g_Visible ;
   private int edtavInpr02dsc_g_Visible ;
   private int edtavInalmndsc_Visible ;
   private int edtavAcrcoidias_Visible ;
   private int edtavPeriododsc_Visible ;
   private int edtavSubfamdsc_Visible ;
   private int edtavQuestion_Visible ;
   private int edtavPermite_Visible ;
   private int edtavPresupuestado_Visible ;
   private int edtavComprometido_Visible ;
   private int edtavDisponible_Visible ;
   private int edtavPresupuestadom_Visible ;
   private int edtavComprometidom_Visible ;
   private int edtavDisponiblem_Visible ;
   private int edtavAcrcpaprepro_Visible ;
   private int edtavPrecio_Visible ;
   private int edtavAcrcpaqtyr_Visible ;
   private int GX_I ;
   private long wcpOAV11ACRCPACIA ;
   private long wcpOAV12ACRCPADOC ;
   private long AV99ACRCOININKIT_AUX ;
   private long A269ACRCPACIA ;
   private long AV11ACRCPACIA ;
   private long A271ACRCPADOC ;
   private long AV12ACRCPADOC ;
   private long AV98ACRCOININKIT ;
   private long A328ACRCPAPRID ;
   private long AV15ACRCPAPRID ;
   private long A383PMPRCNBASE ;
   private long A5939CNCIASID ;
   private long A266ACRCOIDOC ;
   private long A893ACRCOININKIT ;
   private long A268ACRCOIPRID ;
   private long A412PMCRPRCIA ;
   private long A370PMCRPRPROD ;
   private long A43ACMVOIDOC ;
   private long A142ACMVOIPRID ;
   private long A7704EXPINSPROD ;
   private long A889PMRCKTDOC ;
   private long A890PMRCKTIDKIT ;
   private long A281INPRODID ;
   private long AV23CNCIASID ;
   private long A2505ACRCPAL2CIA ;
   private long A2507ACRCPAL2DOC ;
   private long A2508ACRCPAL2LIN ;
   private long A886INPR02CMID ;
   private long A46CNCDIRID ;
   private long AV227ACRCOIUSRREC ;
   private long AV196GEDEVAID_registrado ;
   private long A7411GEDEVAID ;
   private long GRID1_nCurrentRecord ;
   private long A932ACRCOISOL ;
   private long A17149ACRCOIUSRREC ;
   private long AV119ACRCOISOL ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV170acrcoiprid ;
   private long AV236AINPRODID ;
   private long AV179PMPRCNBASE ;
   private long GXv_int12[] ;
   private long GXv_int9[] ;
   private long GXv_int14[] ;
   private java.math.BigDecimal A272ACRCPALIN ;
   private java.math.BigDecimal A329ACRCPAQTY ;
   private java.math.BigDecimal AV59ACRCPAQTYR ;
   private java.math.BigDecimal AV60ACRCPAQTYOC ;
   private java.math.BigDecimal A817ACRCPACNRQPDIAS ;
   private java.math.BigDecimal A10945ACRCPAPRECOT ;
   private java.math.BigDecimal A10946ACRCPAPREPRO ;
   private java.math.BigDecimal AV63ACRCPAULPCM ;
   private java.math.BigDecimal AV61ACRCPAQTYRC ;
   private java.math.BigDecimal AV62ACRCPAQTYP ;
   private java.math.BigDecimal AV64ACRCPAVACMEST ;
   private java.math.BigDecimal AV65ACRCPACNRQPDIAS ;
   private java.math.BigDecimal A384PMPRCNPERT ;
   private java.math.BigDecimal A394PMPRCNPERTN2 ;
   private java.math.BigDecimal A395PMPRCNPERTN3 ;
   private java.math.BigDecimal A396PMPRCNPERTN4 ;
   private java.math.BigDecimal A397PMPRCNPERTN5 ;
   private java.math.BigDecimal AV14ACRCPALIN ;
   private java.math.BigDecimal AV78Comprometido ;
   private java.math.BigDecimal AV105ComprometidoM ;
   private java.math.BigDecimal A359PMCRPRMN ;
   private java.math.BigDecimal AV80Presupuestado ;
   private java.math.BigDecimal AV104presupuestadoM ;
   private java.math.BigDecimal A355PMCRPRQTY ;
   private java.math.BigDecimal A150ACMVOIPRE ;
   private java.math.BigDecimal A7710EXPINSCAN ;
   private java.math.BigDecimal A891PMRCKTQTYREQ ;
   private java.math.BigDecimal A10943ACRCOIPRECOT ;
   private java.math.BigDecimal A350PMPRCNPRES ;
   private java.math.BigDecimal A6213PMPRCNMPRES ;
   private java.math.BigDecimal A316ACRCOIQTP ;
   private java.math.BigDecimal A7804INPRODCPNAC ;
   private java.math.BigDecimal A314ACRCOIQTO ;
   private java.math.BigDecimal AV16ACRCPAQTY ;
   private java.math.BigDecimal AV231ACRCOIPRECOT ;
   private java.math.BigDecimal AV177auxACRCPAQTY ;
   private java.math.BigDecimal AV79Disponible ;
   private java.math.BigDecimal AV106DisponibleM ;
   private java.math.BigDecimal AV143ACRCPAPREPRO ;
   private java.math.BigDecimal AV144G1ACRCPAQTY ;
   private java.math.BigDecimal AV145cantSinINOC ;
   private java.math.BigDecimal AV156g1ACRCPAPRECOT ;
   private java.math.BigDecimal AV157g1ACRCPAPREPRO ;
   private java.math.BigDecimal AV142ACRCPAPRECOT ;
   private java.math.BigDecimal AV83Comprometido1 ;
   private java.math.BigDecimal c359PMCRPRMN ;
   private java.math.BigDecimal AV244variable ;
   private java.math.BigDecimal c6213PMPRCNMPRES ;
   private java.math.BigDecimal AV180PMPRCNPERT ;
   private java.math.BigDecimal AV181PMPRCNPERTN2 ;
   private java.math.BigDecimal AV182PMPRCNPERTN3 ;
   private java.math.BigDecimal AV183PMPRCNPERTN4 ;
   private java.math.BigDecimal AV210INPRODCPNAC ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String wcpOAV24CNESMNID ;
   private String wcpOAV17ACRCPATDC ;
   private String wcpOAV45PMCTPRID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_83_idx="0001" ;
   private String edtavAcrcpaqty_Internalname ;
   private String AV193CGUNNGID ;
   private String A270ACRCPATDC ;
   private String AV17ACRCPATDC ;
   private String A2380ACRCPAEST ;
   private String AV175ValImportanteUrgente ;
   private String A330ACRCPAUM ;
   private String A326ACRCPAUSSOL ;
   private String AV138Homologado ;
   private String AV115Propietario ;
   private String AV6CNUSERID ;
   private String A171PMCTPRID ;
   private String AV45PMCTPRID ;
   private String A379PMAGCCID ;
   private String A348PMCTCGID ;
   private String A349PMCTCGDSC ;
   private String A20CNTDOCID ;
   private String A8585ACRCOIURG ;
   private String A8586ACRCOIIMP ;
   private String AV129ACRCOIRPER ;
   private String A322ACRCOIUB4 ;
   private String A1366ACRCOIA2D ;
   private String AV188PermiteCambioCtaCgo ;
   private String A3INPR01DSC ;
   private String A2INPR02DSC ;
   private String A5682ACRCOIS001 ;
   private String A8557ACRCOIRPER ;
   private String A710INPR07ID ;
   private String A10967SUBFAMID ;
   private String A10968SUBFAMDSC ;
   private String AV108TipoPresupuesto ;
   private String A362PMTPOPID ;
   private String A415PMCRPREST ;
   private String AV146PMCRPREST ;
   private String A351PMCRPRTDC ;
   private String A139ACACSGID ;
   private String A162ACMVOIUB1 ;
   private String A7705EXPINSPROY ;
   private String AV141ACMVOIUB1 ;
   private String AV234ACRCOICONSER ;
   private String A323ACRCOIALM ;
   private String A712INPR09ID ;
   private String AV125PERIODODSC ;
   private String A5881PERIODOID ;
   private String A5882PERIODODSC ;
   private String AV81ACRCPACTCG ;
   private String A6208PMPRCNMPERTN3 ;
   private String AV110PMPRCNMPERTN3 ;
   private String A6209PMPRCNMPERTN4 ;
   private String AV111PMPRCNMPERTN4 ;
   private String AV163OmitirEnvioCorreo ;
   private String AV245EnviarCorreoOC ;
   private String AV201generarValeAutomatico ;
   private String AV22CNCIASDSC ;
   private String AV121Proyecto ;
   private String AV120UsuarioSol ;
   private String AV221ServidorSMTP ;
   private String AV223correoEnvia ;
   private String AV224contrasenaEnvia ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String AV24CNESMNID ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV101continuar ;
   private String A172PMCTPRDSC ;
   private String A2506ACRCPAL2TDC ;
   private String A2510ACRCPAL2USR ;
   private String A5940CNUSERID ;
   private String A205CNCDIREM ;
   private String A190CNUSERDSC ;
   private String AV93CNUSERDSC2 ;
   private String A279INPR02ID ;
   private String A194CNCDIRNOM ;
   private String AV232existeInv ;
   private String AV214ACRCOIALID ;
   private String AV202GEDEVATIPO ;
   private String A135ACACTLID ;
   private String A1148INTPALID ;
   private String A306ACRCOIALID ;
   private String AV206EXPINSTIP ;
   private String A282INUMBAID ;
   private String A954ACRCOIUNGD ;
   private String AV195CNTDOCDSC ;
   private String A7410GEDEVADOC ;
   private String A7418GEDEVACOD ;
   private String AV75CNUSERDSC ;
   private String AV199codigobarra ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String Kdsstylesdatatables1_Internalname ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavAcrcpalin_Internalname ;
   private String edtavAcrcpafreq_Internalname ;
   private String edtavAcrcpaprid_Internalname ;
   private String AV39INPRODI2_P ;
   private String edtavInprodi2_p_Internalname ;
   private String edtavInproddsc_Internalname ;
   private String edtavAcrcoidsc4_Internalname ;
   private String AV18ACRCPAUM ;
   private String edtavAcrcpaum_Internalname ;
   private String AV8ACRCOIOBSAUT ;
   private String edtavAcrcoiobsaut_Internalname ;
   private String edtavAcrcpaobs_Internalname ;
   private String edtavAcrcoiprecot_Internalname ;
   private String edtavAcrcoininkit_aux_Internalname ;
   private String edtavAuxacrcpaqty_Internalname ;
   private String AV165INPR01DSC_G ;
   private String edtavInpr01dsc_g_Internalname ;
   private String AV166INPR02DSC_G ;
   private String edtavInpr02dsc_g_Internalname ;
   private String AV162INALMNDSC ;
   private String edtavInalmndsc_Internalname ;
   private String edtavAcrcoidias_Internalname ;
   private String edtavPeriododsc_Internalname ;
   private String AV167subfamdsc ;
   private String edtavSubfamdsc_Internalname ;
   private String edtavQuestion_Internalname ;
   private String AV117permite ;
   private String edtavPermite_Internalname ;
   private String edtavPresupuestado_Internalname ;
   private String edtavComprometido_Internalname ;
   private String edtavDisponible_Internalname ;
   private String edtavPresupuestadom_Internalname ;
   private String edtavComprometidom_Internalname ;
   private String edtavDisponiblem_Internalname ;
   private String edtavAcrcpaprepro_Internalname ;
   private String AV169precio ;
   private String edtavPrecio_Internalname ;
   private String edtavAcrcpaqtyr_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavUsuariosol_Internalname ;
   private String edtavProyecto_Internalname ;
   private String edtavAcrcpacom_Internalname ;
   private String edtavAcrcoifdoc_Internalname ;
   private String edtavLeinalmndsc_Internalname ;
   private String edtavAcrcpadoc_Internalname ;
   private String edtavF1_Internalname ;
   private String AV230leINALMNDSC ;
   private String edtavDsctrabajorealizar_Internalname ;
   private String hsh ;
   private String lblTxtguardar_Caption ;
   private String lblTxtguardar_Internalname ;
   private String lblTxtregresar_Caption ;
   private String lblTxtregresar_Internalname ;
   private String lblTxtlista_Caption ;
   private String lblTxtlista_Internalname ;
   private String A6136ACRCOIAR ;
   private String A6137ACRCOICST ;
   private String A312ACRCOIUSR ;
   private String A310ACRCOIBCT ;
   private String A18140ACRCOICONSER ;
   private String AV10ACRCOIUSR ;
   private String AV131Usuario ;
   private String AV225ManejarFEoNom ;
   private String A9CNCIASDSC ;
   private String AV5CNESDSOP ;
   private String AV191PTX[] ;
   private String lblTextblock38_Caption ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTxtstyle_Caption ;
   private String lblTxtstyle_Internalname ;
   private String AV19ACRCPAUSSOL ;
   private String AV26color ;
   private String sGXsfl_83_fel_idx="0001" ;
   private String Gx_msg ;
   private String AV176cadena ;
   private String A1INPR01ID ;
   private String AV42PMCTCGDSC ;
   private String AV168ACRCOIS001 ;
   private String AV44PMCTPRDSC ;
   private String AV73ACRCPAL2USR ;
   private String AV74CNCDIREM ;
   private String AV238AINPR02ID ;
   private String AV240ACNCDIRNOM ;
   private String AV161ACRCOIALM ;
   private String GXt_char1 ;
   private String AV100existe ;
   private String AV164UltimoPrecio ;
   private String AV171TEM_ACRCOIURG ;
   private String AV172TEM_ACRCOIIMP ;
   private String AV178PMCTCGID_C ;
   private String AV186PMCTCGDSC_C ;
   private String AV194CNTDOCID ;
   private String GXv_char10[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV197MensajeMostrar ;
   private String AV226nombre ;
   private String AV198txtMensaje ;
   private String AV200codigobarra2 ;
   private String AV228INTPALID ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String AV212PDMEMNOTNOME ;
   private String tblKdstablacontenido_Internalname ;
   private String lblTitulopantalla_Internalname ;
   private String lblTitulopantalla_Jsonclick ;
   private String lblTxtguardar_Jsonclick ;
   private String lblTxtlista_Jsonclick ;
   private String lblTxtregresar_Jsonclick ;
   private String lblTxtstyle_Jsonclick ;
   private String tblTable1_Internalname ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String tblTable16_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtavAcrcpadoc_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String TempTags ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtavUsuariosol_Jsonclick ;
   private String lblTextblock38_Jsonclick ;
   private String edtavProyecto_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtavF1_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtavAcrcoifdoc_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtavLeinalmndsc_Jsonclick ;
   private String lblTextblock32_Jsonclick ;
   private String lblTxtlinks_Internalname ;
   private String lblTxtlinks_Caption ;
   private String lblTxtlinks_Jsonclick ;
   private String Mensaje_Title ;
   private String Mensaje_Internalname ;
   private String ROClassString ;
   private String edtavAcrcpalin_Jsonclick ;
   private String edtavAcrcpafreq_Jsonclick ;
   private String edtavAcrcpaprid_Jsonclick ;
   private String edtavInprodi2_p_Jsonclick ;
   private String edtavInproddsc_Jsonclick ;
   private String edtavAcrcoidsc4_Jsonclick ;
   private String edtavAcrcpaum_Jsonclick ;
   private String edtavAcrcpaqty_Jsonclick ;
   private String GXCCtl ;
   private String edtavAcrcoiobsaut_Jsonclick ;
   private String edtavAcrcpaobs_Jsonclick ;
   private String edtavAcrcoiprecot_Jsonclick ;
   private String edtavAcrcoininkit_aux_Jsonclick ;
   private String edtavAuxacrcpaqty_Jsonclick ;
   private String edtavInpr01dsc_g_Jsonclick ;
   private String edtavInpr02dsc_g_Jsonclick ;
   private String edtavInalmndsc_Jsonclick ;
   private String edtavAcrcoidias_Jsonclick ;
   private String edtavPeriododsc_Jsonclick ;
   private String edtavSubfamdsc_Jsonclick ;
   private String edtavQuestion_Jsonclick ;
   private String edtavPermite_Jsonclick ;
   private String edtavPresupuestado_Jsonclick ;
   private String edtavComprometido_Jsonclick ;
   private String edtavDisponible_Jsonclick ;
   private String edtavPresupuestadom_Jsonclick ;
   private String edtavComprometidom_Jsonclick ;
   private String edtavDisponiblem_Jsonclick ;
   private String edtavAcrcpaprepro_Jsonclick ;
   private String edtavPrecio_Jsonclick ;
   private String edtavAcrcpaqtyr_Jsonclick ;
   private java.util.Date A331ACRCPAFREQ ;
   private java.util.Date AV13ACRCPAFREQ ;
   private java.util.Date Gx_date ;
   private java.util.Date A325ACRCOIFRE2 ;
   private java.util.Date AV127ACRCOIRFINI ;
   private java.util.Date AV128ACRCOIRFFIN ;
   private java.util.Date A8447ACRCOIRFINI ;
   private java.util.Date A8448ACRCOIRFFIN ;
   private java.util.Date A208ACMVOIFDO2 ;
   private java.util.Date AV109PACRCPAFREQ ;
   private java.util.Date AV29F1 ;
   private java.util.Date AV118ACRCOIFDOC ;
   private java.util.Date A933ACRCOIFDOC ;
   private java.util.Date A311ACRCOIFREQ ;
   private java.util.Date AV174TEM_ACRCOIFRE2 ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_83_Refreshing=false ;
   private boolean n2380ACRCPAEST ;
   private boolean n328ACRCPAPRID ;
   private boolean n329ACRCPAQTY ;
   private boolean n330ACRCPAUM ;
   private boolean n331ACRCPAFREQ ;
   private boolean n326ACRCPAUSSOL ;
   private boolean n817ACRCPACNRQPDIAS ;
   private boolean n3902ACRCPAOBS ;
   private boolean n10945ACRCPAPRECOT ;
   private boolean n10946ACRCPAPREPRO ;
   private boolean n171PMCTPRID ;
   private boolean n381PMCTCGCLASE ;
   private boolean n349PMCTCGDSC ;
   private boolean n8585ACRCOIURG ;
   private boolean n8586ACRCOIIMP ;
   private boolean n325ACRCOIFRE2 ;
   private boolean n893ACRCOININKIT ;
   private boolean n322ACRCOIUB4 ;
   private boolean n1366ACRCOIA2D ;
   private boolean n268ACRCOIPRID ;
   private boolean n3INPR01DSC ;
   private boolean n2INPR02DSC ;
   private boolean n5682ACRCOIS001 ;
   private boolean n6988ACRCOIDIAS ;
   private boolean n8447ACRCOIRFINI ;
   private boolean n8448ACRCOIRFFIN ;
   private boolean n8557ACRCOIRPER ;
   private boolean n710INPR07ID ;
   private boolean n10968SUBFAMDSC ;
   private boolean n362PMTPOPID ;
   private boolean n415PMCRPREST ;
   private boolean n359PMCRPRMN ;
   private boolean n370PMCRPRPROD ;
   private boolean n355PMCRPRQTY ;
   private boolean n208ACMVOIFDO2 ;
   private boolean n142ACMVOIPRID ;
   private boolean n139ACACSGID ;
   private boolean n150ACMVOIPRE ;
   private boolean n162ACMVOIUB1 ;
   private boolean n7710EXPINSCAN ;
   private boolean n891PMRCKTQTYREQ ;
   private boolean n756ACRCOIDSC4 ;
   private boolean n323ACRCOIALM ;
   private boolean n10943ACRCOIPRECOT ;
   private boolean n712INPR09ID ;
   private boolean n350PMPRCNPRES ;
   private boolean n6213PMPRCNMPRES ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n933ACRCOIFDOC ;
   private boolean n311ACRCOIFREQ ;
   private boolean n6136ACRCOIAR ;
   private boolean n6137ACRCOICST ;
   private boolean n932ACRCOISOL ;
   private boolean n16927ACRCOIACD ;
   private boolean n954ACRCOIUNGD ;
   private boolean n719ACRCOICOM ;
   private boolean n306ACRCOIALID ;
   private boolean n17149ACRCOIUSRREC ;
   private boolean n312ACRCOIUSR ;
   private boolean n310ACRCOIBCT ;
   private boolean n18140ACRCOICONSER ;
   private boolean n9CNCIASDSC ;
   private boolean n1INPR01ID ;
   private boolean n279INPR02ID ;
   private boolean n172PMCTPRDSC ;
   private boolean n46CNCDIRID ;
   private boolean n205CNCDIREM ;
   private boolean n190CNUSERDSC ;
   private boolean brk2I14 ;
   private boolean brk2I16 ;
   private boolean n886INPR02CMID ;
   private boolean n194CNCDIRNOM ;
   private boolean n316ACRCOIQTP ;
   private boolean n1148INTPALID ;
   private boolean n135ACACTLID ;
   private boolean n7804INPRODCPNAC ;
   private boolean n314ACRCOIQTO ;
   private boolean n282INUMBAID ;
   private boolean n7418GEDEVACOD ;
   private String A3902ACRCPAOBS ;
   private String AV56ACRCOIDSC4 ;
   private String A756ACRCOIDSC4 ;
   private String AV103ACRCPAOBS ;
   private String AV124ACRCPACOM ;
   private String AV233dscTrabajoRealizar ;
   private String A719ACRCOICOM ;
   private String AV49style ;
   private String AV67SCRIPT ;
   private String AV66SCRIPT2 ;
   private String AV77Asunto ;
   private String AV76CuerpoCorreo ;
   private String AV37INPRODDSC ;
   private String AV159Question ;
   private String AV160Guardar ;
   private String AV158Renovar ;
   private String AV189Renovar1 ;
   private String AV243cadenaLineas ;
   private String AV220cuerpo ;
   private String AV211CNUSERIDMOB ;
   private String AV32img ;
   private GXSimpleCollection<Long> AV235INPRODID ;
   private GXSimpleCollection<Long> AV239CCNCDIRID ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWindow AV57Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV48session ;
   private com.genexus.webpanels.GXUserControl ucKdsstylesdatatables1 ;
   private com.genexus.webpanels.GXUserControl ucMensaje ;
   private HTMLChoice dynavCnciasid ;
   private HTMLChoice cmbavAutorizartod ;
   private HTMLChoice cmbavAutorizar ;
   private HTMLChoice cmbavAcrcpactcg ;
   private HTMLChoice dynavAcrcoiacd ;
   private HTMLChoice dynavCgunngid ;
   private IDataStoreProvider pr_default ;
   private long[] H002I2_A5939CNCIASID ;
   private String[] H002I2_A9CNCIASDSC ;
   private boolean[] H002I2_n9CNCIASDSC ;
   private long[] H002I3_A16970CATCARID ;
   private String[] H002I3_A16971CATCARDSC ;
   private boolean[] H002I3_n16971CATCARDSC ;
   private String[] H002I4_A93CGUNNGID ;
   private String[] H002I4_A336CGUNNGDSC ;
   private boolean[] H002I4_n336CGUNNGDSC ;
   private int[] H002I5_A267ACRCOILIN ;
   private long[] H002I5_A266ACRCOIDOC ;
   private String[] H002I5_A20CNTDOCID ;
   private long[] H002I5_A5939CNCIASID ;
   private java.util.Date[] H002I5_A933ACRCOIFDOC ;
   private boolean[] H002I5_n933ACRCOIFDOC ;
   private java.util.Date[] H002I5_A311ACRCOIFREQ ;
   private boolean[] H002I5_n311ACRCOIFREQ ;
   private String[] H002I5_A6136ACRCOIAR ;
   private boolean[] H002I5_n6136ACRCOIAR ;
   private String[] H002I5_A6137ACRCOICST ;
   private boolean[] H002I5_n6137ACRCOICST ;
   private String[] H002I5_A171PMCTPRID ;
   private boolean[] H002I5_n171PMCTPRID ;
   private long[] H002I5_A932ACRCOISOL ;
   private boolean[] H002I5_n932ACRCOISOL ;
   private short[] H002I5_A16927ACRCOIACD ;
   private boolean[] H002I5_n16927ACRCOIACD ;
   private String[] H002I5_A954ACRCOIUNGD ;
   private boolean[] H002I5_n954ACRCOIUNGD ;
   private String[] H002I5_A719ACRCOICOM ;
   private boolean[] H002I5_n719ACRCOICOM ;
   private String[] H002I5_A306ACRCOIALID ;
   private boolean[] H002I5_n306ACRCOIALID ;
   private long[] H002I5_A17149ACRCOIUSRREC ;
   private boolean[] H002I5_n17149ACRCOIUSRREC ;
   private String[] H002I5_A312ACRCOIUSR ;
   private boolean[] H002I5_n312ACRCOIUSR ;
   private String[] H002I5_A310ACRCOIBCT ;
   private boolean[] H002I5_n310ACRCOIBCT ;
   private String[] H002I5_A18140ACRCOICONSER ;
   private boolean[] H002I5_n18140ACRCOICONSER ;
   private long[] H002I6_A266ACRCOIDOC ;
   private String[] H002I6_A20CNTDOCID ;
   private long[] H002I6_A5939CNCIASID ;
   private java.util.Date[] H002I6_A311ACRCOIFREQ ;
   private boolean[] H002I6_n311ACRCOIFREQ ;
   private String[] H002I6_A6136ACRCOIAR ;
   private boolean[] H002I6_n6136ACRCOIAR ;
   private String[] H002I6_A6137ACRCOICST ;
   private boolean[] H002I6_n6137ACRCOICST ;
   private long[] H002I6_A932ACRCOISOL ;
   private boolean[] H002I6_n932ACRCOISOL ;
   private String[] H002I6_A306ACRCOIALID ;
   private boolean[] H002I6_n306ACRCOIALID ;
   private String[] H002I6_A719ACRCOICOM ;
   private boolean[] H002I6_n719ACRCOICOM ;
   private long[] H002I6_A17149ACRCOIUSRREC ;
   private boolean[] H002I6_n17149ACRCOIUSRREC ;
   private String[] H002I6_A312ACRCOIUSR ;
   private boolean[] H002I6_n312ACRCOIUSR ;
   private String[] H002I6_A310ACRCOIBCT ;
   private boolean[] H002I6_n310ACRCOIBCT ;
   private String[] H002I6_A18140ACRCOICONSER ;
   private boolean[] H002I6_n18140ACRCOICONSER ;
   private long[] H002I7_A5939CNCIASID ;
   private String[] H002I7_A9CNCIASDSC ;
   private boolean[] H002I7_n9CNCIASDSC ;
   private String[] H002I8_A2380ACRCPAEST ;
   private boolean[] H002I8_n2380ACRCPAEST ;
   private long[] H002I8_A271ACRCPADOC ;
   private String[] H002I8_A270ACRCPATDC ;
   private long[] H002I8_A269ACRCPACIA ;
   private long[] H002I8_A328ACRCPAPRID ;
   private boolean[] H002I8_n328ACRCPAPRID ;
   private java.math.BigDecimal[] H002I8_A329ACRCPAQTY ;
   private boolean[] H002I8_n329ACRCPAQTY ;
   private String[] H002I8_A330ACRCPAUM ;
   private boolean[] H002I8_n330ACRCPAUM ;
   private java.util.Date[] H002I8_A331ACRCPAFREQ ;
   private boolean[] H002I8_n331ACRCPAFREQ ;
   private String[] H002I8_A326ACRCPAUSSOL ;
   private boolean[] H002I8_n326ACRCPAUSSOL ;
   private java.math.BigDecimal[] H002I8_A817ACRCPACNRQPDIAS ;
   private boolean[] H002I8_n817ACRCPACNRQPDIAS ;
   private String[] H002I8_A3902ACRCPAOBS ;
   private boolean[] H002I8_n3902ACRCPAOBS ;
   private java.math.BigDecimal[] H002I8_A10945ACRCPAPRECOT ;
   private boolean[] H002I8_n10945ACRCPAPRECOT ;
   private java.math.BigDecimal[] H002I8_A10946ACRCPAPREPRO ;
   private boolean[] H002I8_n10946ACRCPAPREPRO ;
   private java.math.BigDecimal[] H002I8_A272ACRCPALIN ;
   private long[] H002I9_A281INPRODID ;
   private String[] H002I9_A1INPR01ID ;
   private boolean[] H002I9_n1INPR01ID ;
   private String[] H002I9_A279INPR02ID ;
   private boolean[] H002I9_n279INPR02ID ;
   private String[] H002I9_A710INPR07ID ;
   private boolean[] H002I9_n710INPR07ID ;
   private int[] H002I9_A267ACRCOILIN ;
   private long[] H002I9_A266ACRCOIDOC ;
   private String[] H002I9_A20CNTDOCID ;
   private long[] H002I9_A5939CNCIASID ;
   private String[] H002I9_A322ACRCOIUB4 ;
   private boolean[] H002I9_n322ACRCOIUB4 ;
   private String[] H002I9_A1366ACRCOIA2D ;
   private boolean[] H002I9_n1366ACRCOIA2D ;
   private long[] H002I9_A268ACRCOIPRID ;
   private boolean[] H002I9_n268ACRCOIPRID ;
   private String[] H002I9_A5682ACRCOIS001 ;
   private boolean[] H002I9_n5682ACRCOIS001 ;
   private short[] H002I9_A6988ACRCOIDIAS ;
   private boolean[] H002I9_n6988ACRCOIDIAS ;
   private java.util.Date[] H002I9_A8447ACRCOIRFINI ;
   private boolean[] H002I9_n8447ACRCOIRFINI ;
   private java.util.Date[] H002I9_A8448ACRCOIRFFIN ;
   private boolean[] H002I9_n8448ACRCOIRFFIN ;
   private String[] H002I9_A8557ACRCOIRPER ;
   private boolean[] H002I9_n8557ACRCOIRPER ;
   private String[] H002I10_A10967SUBFAMID ;
   private String[] H002I10_A10968SUBFAMDSC ;
   private boolean[] H002I10_n10968SUBFAMDSC ;
   private java.math.BigDecimal[] H002I11_A359PMCRPRMN ;
   private boolean[] H002I11_n359PMCRPRMN ;
   private String[] H002I12_A5881PERIODOID ;
   private String[] H002I12_A5882PERIODODSC ;
   private String[] H002I13_A171PMCTPRID ;
   private boolean[] H002I13_n171PMCTPRID ;
   private long[] H002I13_A271ACRCPADOC ;
   private String[] H002I13_A270ACRCPATDC ;
   private long[] H002I13_A269ACRCPACIA ;
   private String[] H002I13_A172PMCTPRDSC ;
   private boolean[] H002I13_n172PMCTPRDSC ;
   private byte[] H002I14_A2509ACRCPAL2NIV ;
   private long[] H002I14_A2508ACRCPAL2LIN ;
   private long[] H002I14_A2507ACRCPAL2DOC ;
   private String[] H002I14_A2506ACRCPAL2TDC ;
   private long[] H002I14_A2505ACRCPAL2CIA ;
   private String[] H002I14_A2510ACRCPAL2USR ;
   private long[] H002I15_A46CNCDIRID ;
   private boolean[] H002I15_n46CNCDIRID ;
   private String[] H002I15_A5940CNUSERID ;
   private String[] H002I15_A205CNCDIREM ;
   private boolean[] H002I15_n205CNCDIREM ;
   private String[] H002I15_A190CNUSERDSC ;
   private boolean[] H002I15_n190CNUSERDSC ;
   private long[] H002I16_A281INPRODID ;
   private String[] H002I16_A279INPR02ID ;
   private boolean[] H002I16_n279INPR02ID ;
   private String[] H002I17_A279INPR02ID ;
   private boolean[] H002I17_n279INPR02ID ;
   private long[] H002I17_A886INPR02CMID ;
   private boolean[] H002I17_n886INPR02CMID ;
   private long[] H002I18_A46CNCDIRID ;
   private boolean[] H002I18_n46CNCDIRID ;
   private String[] H002I18_A194CNCDIRNOM ;
   private boolean[] H002I18_n194CNCDIRNOM ;
   private String[] H002I18_A205CNCDIREM ;
   private boolean[] H002I18_n205CNCDIREM ;
   private long[] H002I19_A887PMRCKTCIA ;
   private String[] H002I19_A888PMRCKTTDC ;
   private long[] H002I19_A890PMRCKTIDKIT ;
   private long[] H002I19_A889PMRCKTDOC ;
   private java.math.BigDecimal[] H002I19_A891PMRCKTQTYREQ ;
   private boolean[] H002I19_n891PMRCKTQTYREQ ;
   private int[] H002I20_A267ACRCOILIN ;
   private long[] H002I20_A266ACRCOIDOC ;
   private String[] H002I20_A20CNTDOCID ;
   private long[] H002I20_A5939CNCIASID ;
   private long[] H002I20_A893ACRCOININKIT ;
   private boolean[] H002I20_n893ACRCOININKIT ;
   private int[] H002I21_A267ACRCOILIN ;
   private long[] H002I21_A266ACRCOIDOC ;
   private String[] H002I21_A20CNTDOCID ;
   private long[] H002I21_A5939CNCIASID ;
   private String[] H002I21_A756ACRCOIDSC4 ;
   private boolean[] H002I21_n756ACRCOIDSC4 ;
   private String[] H002I21_A323ACRCOIALM ;
   private boolean[] H002I21_n323ACRCOIALM ;
   private java.math.BigDecimal[] H002I21_A10943ACRCOIPRECOT ;
   private boolean[] H002I21_n10943ACRCOIPRECOT ;
   private String[] H002I22_A139ACACSGID ;
   private boolean[] H002I22_n139ACACSGID ;
   private long[] H002I22_A893ACRCOININKIT ;
   private boolean[] H002I22_n893ACRCOININKIT ;
   private long[] H002I22_A266ACRCOIDOC ;
   private String[] H002I22_A20CNTDOCID ;
   private long[] H002I22_A5939CNCIASID ;
   private int[] H002I22_A267ACRCOILIN ;
   private long[] H002I22_A268ACRCOIPRID ;
   private boolean[] H002I22_n268ACRCOIPRID ;
   private java.math.BigDecimal[] H002I22_A316ACRCOIQTP ;
   private boolean[] H002I22_n316ACRCOIQTP ;
   private long[] H002I23_A411PMPRCNCIA ;
   private long[] H002I23_A383PMPRCNBASE ;
   private java.math.BigDecimal[] H002I23_A384PMPRCNPERT ;
   private java.math.BigDecimal[] H002I23_A394PMPRCNPERTN2 ;
   private java.math.BigDecimal[] H002I23_A395PMPRCNPERTN3 ;
   private java.math.BigDecimal[] H002I23_A396PMPRCNPERTN4 ;
   private java.math.BigDecimal[] H002I23_A397PMPRCNPERTN5 ;
   private String[] H002I23_A348PMCTCGID ;
   private String[] H002I23_A171PMCTPRID ;
   private boolean[] H002I23_n171PMCTPRID ;
   private java.math.BigDecimal[] H002I23_A350PMPRCNPRES ;
   private boolean[] H002I23_n350PMPRCNPRES ;
   private java.math.BigDecimal[] H002I24_A6213PMPRCNMPRES ;
   private boolean[] H002I24_n6213PMPRCNMPRES ;
   private long[] H002I25_A281INPRODID ;
   private String[] H002I25_A712INPR09ID ;
   private boolean[] H002I25_n712INPR09ID ;
   private java.math.BigDecimal[] H002I26_A141ACMVOILIN ;
   private long[] H002I26_A142ACMVOIPRID ;
   private boolean[] H002I26_n142ACMVOIPRID ;
   private String[] H002I26_A139ACACSGID ;
   private boolean[] H002I26_n139ACACSGID ;
   private long[] H002I26_A43ACMVOIDOC ;
   private String[] H002I26_A20CNTDOCID ;
   private long[] H002I26_A5939CNCIASID ;
   private java.math.BigDecimal[] H002I26_A150ACMVOIPRE ;
   private boolean[] H002I26_n150ACMVOIPRE ;
   private String[] H002I26_A162ACMVOIUB1 ;
   private boolean[] H002I26_n162ACMVOIUB1 ;
   private java.util.Date[] H002I26_A208ACMVOIFDO2 ;
   private boolean[] H002I26_n208ACMVOIFDO2 ;
   private java.math.BigDecimal[] H002I27_A141ACMVOILIN ;
   private long[] H002I27_A5939CNCIASID ;
   private long[] H002I27_A142ACMVOIPRID ;
   private boolean[] H002I27_n142ACMVOIPRID ;
   private String[] H002I27_A139ACACSGID ;
   private boolean[] H002I27_n139ACACSGID ;
   private long[] H002I27_A43ACMVOIDOC ;
   private String[] H002I27_A20CNTDOCID ;
   private java.math.BigDecimal[] H002I27_A150ACMVOIPRE ;
   private boolean[] H002I27_n150ACMVOIPRE ;
   private String[] H002I27_A162ACMVOIUB1 ;
   private boolean[] H002I27_n162ACMVOIUB1 ;
   private java.util.Date[] H002I27_A208ACMVOIFDO2 ;
   private boolean[] H002I27_n208ACMVOIFDO2 ;
   private String[] H002I28_A7705EXPINSPROY ;
   private long[] H002I28_A7704EXPINSPROD ;
   private java.math.BigDecimal[] H002I28_A7710EXPINSCAN ;
   private boolean[] H002I28_n7710EXPINSCAN ;
   private long[] H002I29_A419PMRLINLIN ;
   private long[] H002I29_A352PMCRPRNDC ;
   private long[] H002I29_A353PMCRPRLIN ;
   private String[] H002I29_A415PMCRPREST ;
   private boolean[] H002I29_n415PMCRPREST ;
   private long[] H002I29_A370PMCRPRPROD ;
   private boolean[] H002I29_n370PMCRPRPROD ;
   private String[] H002I29_A171PMCTPRID ;
   private boolean[] H002I29_n171PMCTPRID ;
   private long[] H002I29_A412PMCRPRCIA ;
   private String[] H002I29_A362PMTPOPID ;
   private boolean[] H002I29_n362PMTPOPID ;
   private java.math.BigDecimal[] H002I29_A355PMCRPRQTY ;
   private boolean[] H002I29_n355PMCRPRQTY ;
   private String[] H002I29_A351PMCRPRTDC ;
   private int[] H002I30_A267ACRCOILIN ;
   private long[] H002I30_A266ACRCOIDOC ;
   private String[] H002I30_A20CNTDOCID ;
   private long[] H002I30_A5939CNCIASID ;
   private String[] H002I30_A8585ACRCOIURG ;
   private boolean[] H002I30_n8585ACRCOIURG ;
   private String[] H002I30_A8586ACRCOIIMP ;
   private boolean[] H002I30_n8586ACRCOIIMP ;
   private java.util.Date[] H002I30_A325ACRCOIFRE2 ;
   private boolean[] H002I30_n325ACRCOIFRE2 ;
   private long[] H002I31_A411PMPRCNCIA ;
   private String[] H002I31_A379PMAGCCID ;
   private byte[] H002I31_A381PMCTCGCLASE ;
   private boolean[] H002I31_n381PMCTCGCLASE ;
   private String[] H002I31_A171PMCTPRID ;
   private boolean[] H002I31_n171PMCTPRID ;
   private String[] H002I31_A348PMCTCGID ;
   private String[] H002I31_A349PMCTCGDSC ;
   private boolean[] H002I31_n349PMCTCGDSC ;
   private java.math.BigDecimal[] H002I31_A397PMPRCNPERTN5 ;
   private java.math.BigDecimal[] H002I31_A396PMPRCNPERTN4 ;
   private java.math.BigDecimal[] H002I31_A395PMPRCNPERTN3 ;
   private java.math.BigDecimal[] H002I31_A394PMPRCNPERTN2 ;
   private java.math.BigDecimal[] H002I31_A384PMPRCNPERT ;
   private long[] H002I31_A383PMPRCNBASE ;
   private long[] H002I32_A281INPRODID ;
   private String[] H002I32_A1148INTPALID ;
   private boolean[] H002I32_n1148INTPALID ;
   private String[] H002I32_A139ACACSGID ;
   private boolean[] H002I32_n139ACACSGID ;
   private String[] H002I32_A135ACACTLID ;
   private boolean[] H002I32_n135ACACTLID ;
   private long[] H002I32_A266ACRCOIDOC ;
   private String[] H002I32_A20CNTDOCID ;
   private long[] H002I32_A5939CNCIASID ;
   private int[] H002I32_A267ACRCOILIN ;
   private java.math.BigDecimal[] H002I32_A7804INPRODCPNAC ;
   private boolean[] H002I32_n7804INPRODCPNAC ;
   private String[] H002I32_A306ACRCOIALID ;
   private boolean[] H002I32_n306ACRCOIALID ;
   private String[] H002I32_A322ACRCOIUB4 ;
   private boolean[] H002I32_n322ACRCOIUB4 ;
   private long[] H002I32_A268ACRCOIPRID ;
   private boolean[] H002I32_n268ACRCOIPRID ;
   private java.math.BigDecimal[] H002I32_A314ACRCOIQTO ;
   private boolean[] H002I32_n314ACRCOIQTO ;
   private String[] H002I32_A282INUMBAID ;
   private boolean[] H002I32_n282INUMBAID ;
   private String[] H002I32_A756ACRCOIDSC4 ;
   private boolean[] H002I32_n756ACRCOIDSC4 ;
   private String[] H002I32_A954ACRCOIUNGD ;
   private boolean[] H002I32_n954ACRCOIUNGD ;
   private String[] H002I33_A7408GEDEVAPR ;
   private long[] H002I33_A7595DESTFINID ;
   private long[] H002I33_A8560GEDEVACIA ;
   private long[] H002I33_A7411GEDEVAID ;
   private String[] H002I33_A7410GEDEVADOC ;
   private String[] H002I33_A7418GEDEVACOD ;
   private boolean[] H002I33_n7418GEDEVACOD ;
   private int[] H002I34_A267ACRCOILIN ;
   private long[] H002I34_A268ACRCOIPRID ;
   private boolean[] H002I34_n268ACRCOIPRID ;
   private long[] H002I34_A281INPRODID ;
   private String[] H002I34_A1148INTPALID ;
   private boolean[] H002I34_n1148INTPALID ;
   private String[] H002I34_A139ACACSGID ;
   private boolean[] H002I34_n139ACACSGID ;
   private String[] H002I34_A135ACACTLID ;
   private boolean[] H002I34_n135ACACTLID ;
   private long[] H002I34_A266ACRCOIDOC ;
   private String[] H002I34_A20CNTDOCID ;
   private long[] H002I34_A5939CNCIASID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<java.math.BigDecimal> AV242CACRCPALIN ;
   private GXSimpleCollection<String> AV36INPR02ID ;
}

final  class wautreq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002I16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           long A281INPRODID ,
                                           GXSimpleCollection<Long> AV235INPRODID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object17 ;
      GXv_Object17 = new Object [2] ;
      scmdbuf = "SELECT INPRODID, INPR02ID FROM INPROD" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("postgresql", AV235INPRODID, "INPRODID IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY INPR02ID" ;
      GXv_Object17[0] = scmdbuf ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H002I17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           String A279INPR02ID ,
                                           GXSimpleCollection<String> AV36INPR02ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object20 ;
      GXv_Object20 = new Object [2] ;
      scmdbuf = "SELECT INPR02ID, INPR02CMID FROM INPR02" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("postgresql", AV36INPR02ID, "INPR02ID IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY INPR02CMID" ;
      GXv_Object20[0] = scmdbuf ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H002I18( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           long A46CNCDIRID ,
                                           GXSimpleCollection<Long> AV239CCNCDIRID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object23 ;
      GXv_Object23 = new Object [2] ;
      scmdbuf = "SELECT CNCDIRID, CNCDIRNOM, CNCDIREM FROM CNCDIR" ;
      scmdbuf = scmdbuf + " WHERE (" + GXutil.toValueList("postgresql", AV239CCNCDIRID, "CNCDIRID IN (", ")") + ")" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY CNCDIRID" ;
      GXv_Object23[0] = scmdbuf ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H002I24( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           String AV110PMPRCNMPERTN3 ,
                                           String A6208PMPRCNMPERTN3 ,
                                           String AV81ACRCPACTCG ,
                                           String AV45PMCTPRID ,
                                           String AV111PMPRCNMPERTN4 )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int26 ;
      GXv_int26 = new byte [6] ;
      Object[] GXv_Object27 ;
      GXv_Object27 = new Object [2] ;
      scmdbuf = "SELECT SUM(PMPRCNMPRES) FROM PMPRCNM" ;
      scmdbuf = scmdbuf + " WHERE (PMCTCGID = ( ?))" ;
      scmdbuf = scmdbuf + " and (PMPRCNMANIO = date_part('year', ?))" ;
      scmdbuf = scmdbuf + " and (PMPRCNMMES = date_part('month', ?))" ;
      scmdbuf = scmdbuf + " and (PMCTPRID = ( ?))" ;
      scmdbuf = scmdbuf + " and (PMPRCNMPERTN4 = ( ?))" ;
      if ( ! (GXutil.strcmp("", AV110PMPRCNMPERTN3)==0) )
      {
         sWhereString = sWhereString + " and (PMPRCNMPERTN3 = ( ?))" ;
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H002I29( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           String AV138Homologado ,
                                           long A412PMCRPRCIA ,
                                           long AV11ACRCPACIA ,
                                           long A370PMCRPRPROD ,
                                           long AV15ACRCPAPRID ,
                                           String A415PMCRPREST ,
                                           String AV146PMCRPREST ,
                                           String AV45PMCTPRID ,
                                           String A171PMCTPRID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int28 ;
      GXv_int28 = new byte [4] ;
      Object[] GXv_Object29 ;
      GXv_Object29 = new Object [2] ;
      scmdbuf = "SELECT PMRLINLIN, PMCRPRNDC, PMCRPRLIN, PMCRPREST, PMCRPRPROD, PMCTPRID, PMCRPRCIA," ;
      scmdbuf = scmdbuf + " PMTPOPID, PMCRPRQTY, PMCRPRTDC FROM PMCRPR" ;
      scmdbuf = scmdbuf + " WHERE (PMCTPRID = ( ?))" ;
      scmdbuf = scmdbuf + " and (PMCRPRPROD = ?)" ;
      scmdbuf = scmdbuf + " and (PMCRPREST = ( ?))" ;
      if ( GXutil.strcmp(AV138Homologado, "N") == 0 )
      {
         sWhereString = sWhereString + " and (PMCRPRCIA = ?)" ;
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY PMCTPRID" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 14 :
                  return conditional_H002I16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (GXSimpleCollection<Long>)dynConstraints[1] );
            case 15 :
                  return conditional_H002I17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] );
            case 16 :
                  return conditional_H002I18(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (GXSimpleCollection<Long>)dynConstraints[1] );
            case 22 :
                  return conditional_H002I24(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 27 :
                  return conditional_H002I29(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002I2", "SELECT CNCIASID, CNCIASDSC FROM CNCIAS ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H002I3", "SELECT CATCARID, CATCARDSC FROM CATCAR ORDER BY CATCARDSC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H002I4", "SELECT CGUNNGID, CGUNNGDSC FROM CGUNNG ORDER BY CGUNNGDSC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H002I5", "SELECT T1.ACRCOILIN, T1.ACRCOIDOC, T1.CNTDOCID, T1.CNCIASID, T2.ACRCOIFDOC, T2.ACRCOIFREQ, T2.ACRCOIAR, T2.ACRCOICST, T2.PMCTPRID, T2.ACRCOISOL, T2.ACRCOIACD, T1.ACRCOIUNGD, T2.ACRCOICOM, T2.ACRCOIALID, T2.ACRCOIUSRREC, T2.ACRCOIUSR, T2.ACRCOIBCT, T2.ACRCOICONSER FROM (ACRCOI1 T1 INNER JOIN ACRCOI T2 ON T2.CNCIASID = T1.CNCIASID AND T2.CNTDOCID = T1.CNTDOCID AND T2.ACRCOIDOC = T1.ACRCOIDOC) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.ACRCOIDOC = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.ACRCOIDOC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I6", "SELECT ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOIFREQ, ACRCOIAR, ACRCOICST, ACRCOISOL, ACRCOIALID, ACRCOICOM, ACRCOIUSRREC, ACRCOIUSR, ACRCOIBCT, ACRCOICONSER FROM ACRCOI WHERE CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ? ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I7", "SELECT CNCIASID, CNCIASDSC FROM CNCIAS WHERE CNCIASID = ? ORDER BY CNCIASID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I8", "SELECT T1.ACRCPAEST, T1.ACRCPADOC, T1.ACRCPATDC, T1.ACRCPACIA, T1.ACRCPAPRID, T1.ACRCPAQTY, T1.ACRCPAUM, T1.ACRCPAFREQ, T2.ACRCPAUSSOL, T1.ACRCPACNRQPDIAS, T1.ACRCPAOBS, T1.ACRCPAPRECOT, T1.ACRCPAPREPRO, T1.ACRCPALIN FROM (ACRCPA T1 INNER JOIN ACRCPA1 T2 ON T2.ACRCPACIA = T1.ACRCPACIA AND T2.ACRCPATDC = T1.ACRCPATDC AND T2.ACRCPADOC = T1.ACRCPADOC) WHERE (T1.ACRCPACIA = ? and T1.ACRCPATDC = ( ?) and T1.ACRCPADOC = ?) AND (T1.ACRCPAEST = ( 'AUTORIZADO')) ORDER BY T1.ACRCPACIA, T1.ACRCPATDC, T1.ACRCPADOC, T1.ACRCPALIN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I9", "SELECT T2.INPRODID, T2.INPR01ID, T2.INPR02ID, T2.INPR07ID, T1.ACRCOILIN, T1.ACRCOIDOC, T1.CNTDOCID, T1.CNCIASID, T1.ACRCOIUB4, T1.ACRCOIA2D, T1.ACRCOIPRID, T1.ACRCOIS001, T1.ACRCOIDIAS, T1.ACRCOIRFINI, T1.ACRCOIRFFIN, T1.ACRCOIRPER FROM (ACRCOI1 T1 LEFT JOIN INPROD T2 ON T2.INPRODID = T1.ACRCOIPRID) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.ACRCOIDOC = ? and T1.ACRCOILIN = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.ACRCOIDOC, T1.ACRCOILIN  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I10", "SELECT SUBFAMID, SUBFAMDSC FROM SUBFAM WHERE SUBFAMID = ( ?) ORDER BY SUBFAMID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I11", "SELECT SUM(PMCRPRMN) FROM PMCRPR WHERE (PMCTPRID = ( ?)) AND (PMCTCGID = ( ?)) AND (PMTPOPID = ( 'OC')) AND (PMCRPREST = ( 'AUTORIZADO')) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H002I12", "SELECT PERIODOID, PERIODODSC FROM PERIODO WHERE PERIODOID = ( ?) ORDER BY PERIODOID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I13", "SELECT T1.PMCTPRID, T1.ACRCPADOC, T1.ACRCPATDC, T1.ACRCPACIA, T2.PMCTPRDSC FROM (ACRCPA1 T1 LEFT JOIN PMCTPR T2 ON T2.PMCTPRID = T1.PMCTPRID) WHERE T1.ACRCPACIA = ? and T1.ACRCPATDC = ( ?) and T1.ACRCPADOC = ? ORDER BY T1.ACRCPACIA, T1.ACRCPATDC, T1.ACRCPADOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I14", "SELECT ACRCPAL2NIV, ACRCPAL2LIN, ACRCPAL2DOC, ACRCPAL2TDC, ACRCPAL2CIA, ACRCPAL2USR FROM ACRCPAL2 WHERE ACRCPAL2CIA = ? and ACRCPAL2TDC = ( ?) and ACRCPAL2DOC = ? and ACRCPAL2LIN = ? and ACRCPAL2NIV = ? ORDER BY ACRCPAL2CIA, ACRCPAL2TDC, ACRCPAL2DOC, ACRCPAL2LIN, ACRCPAL2NIV ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I15", "SELECT T1.CNCDIRID, T1.CNUSERID, T2.CNCDIREM, T1.CNUSERDSC FROM (CNUSER T1 LEFT JOIN CNCDIR T2 ON T2.CNCDIRID = T1.CNCDIRID) WHERE T1.CNUSERID = ( ?) ORDER BY T1.CNUSERID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I18", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I19", "SELECT PMRCKTCIA, PMRCKTTDC, PMRCKTIDKIT, PMRCKTDOC, PMRCKTQTYREQ FROM PMRCKT WHERE (PMRCKTIDKIT = ?) AND (PMRCKTDOC = ?) ORDER BY PMRCKTIDKIT ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I20", "SELECT ACRCOILIN, ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOININKIT FROM ACRCOI1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ? and ACRCOILIN = ? ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC, ACRCOILIN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I21", "SELECT ACRCOILIN, ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOIDSC4, ACRCOIALM, ACRCOIPRECOT FROM ACRCOI1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ? and ACRCOILIN = ? ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC, ACRCOILIN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I22", "SELECT ACACSGID, ACRCOININKIT, ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOILIN, ACRCOIPRID, ACRCOIQTP FROM ACRCOI1 WHERE (CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ?) AND (ACRCOININKIT = ?) AND (ACACSGID = ( 'IMP.REQ.')) ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I23", "SELECT PMPRCNCIA, PMPRCNBASE, PMPRCNPERT, PMPRCNPERTN2, PMPRCNPERTN3, PMPRCNPERTN4, PMPRCNPERTN5, PMCTCGID, PMCTPRID, PMPRCNPRES FROM PMPRCN WHERE (PMCTPRID = ( ?)) AND (PMCTCGID = ( ?)) ORDER BY PMCTPRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H002I25", "SELECT INPRODID, INPR09ID FROM INPROD WHERE INPRODID = ? ORDER BY INPRODID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I26", "SELECT ACMVOILIN, ACMVOIPRID, ACACSGID, ACMVOIDOC, CNTDOCID, CNCIASID, ACMVOIPRE, ACMVOIUB1, ACMVOIFDO2 FROM ACMVOR1 WHERE (CNCIASID <> 0) AND (CNTDOCID <> ( '')) AND (ACMVOIDOC <> 0) AND (ACACSGID = ( 'OC.RECEP') or ACACSGID = ( 'REC.OC.')) AND (ACMVOIPRID = ?) ORDER BY ACMVOIFDO2 DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I27", "SELECT ACMVOILIN, CNCIASID, ACMVOIPRID, ACACSGID, ACMVOIDOC, CNTDOCID, ACMVOIPRE, ACMVOIUB1, ACMVOIFDO2 FROM ACMVOR1 WHERE (CNTDOCID <> ( '')) AND (ACMVOIDOC <> 0) AND (ACACSGID = ( 'OC.RECEP') or ACACSGID = ( 'REC.OC.')) AND (CNCIASID = ?) AND (ACMVOIPRID = ?) ORDER BY ACMVOIFDO2 DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I28", "SELECT EXPINSPROY, EXPINSPROD, EXPINSCAN FROM EXPINS WHERE EXPINSPROD = ? and EXPINSPROY = ( ?) ORDER BY EXPINSPROD, EXPINSPROY ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I29", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I30", "SELECT ACRCOILIN, ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOIURG, ACRCOIIMP, ACRCOIFRE2 FROM ACRCOI1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ? and ACRCOILIN = ? ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC, ACRCOILIN  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H002I31", "SELECT T1.PMPRCNCIA, T2.PMAGCCID, T2.PMCTCGCLASE, T1.PMCTPRID, T1.PMCTCGID, T2.PMCTCGDSC, T1.PMPRCNPERTN5, T1.PMPRCNPERTN4, T1.PMPRCNPERTN3, T1.PMPRCNPERTN2, T1.PMPRCNPERT, T1.PMPRCNBASE FROM (PMPRCN T1 INNER JOIN PMCTCG T2 ON T2.PMCTCGID = T1.PMCTCGID) WHERE (T1.PMCTPRID = ( ?)) AND (T2.PMAGCCID <> ( 'VIA')) AND (T2.PMCTCGCLASE = 0) ORDER BY T1.PMCTPRID, T1.PMPRCNBASE, T1.PMPRCNPERT, T1.PMPRCNPERTN2, T1.PMPRCNPERTN3, T1.PMPRCNPERTN4, T1.PMPRCNPERTN5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I32", "SELECT T3.INPRODID, T3.INTPALID, T1.ACACSGID, T1.ACACTLID, T1.ACRCOIDOC, T1.CNTDOCID, T1.CNCIASID, T1.ACRCOILIN, T3.INPRODCPNAC, T2.ACRCOIALID, T1.ACRCOIUB4, T1.ACRCOIPRID, T1.ACRCOIQTO, T3.INUMBAID, T1.ACRCOIDSC4, T1.ACRCOIUNGD FROM ((ACRCOI1 T1 INNER JOIN ACRCOI T2 ON T2.CNCIASID = T1.CNCIASID AND T2.CNTDOCID = T1.CNTDOCID AND T2.ACRCOIDOC = T1.ACRCOIDOC) LEFT JOIN INPROD T3 ON T3.INPRODID = T1.ACRCOIPRID) WHERE (T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.ACRCOIDOC = ?) AND (T3.INTPALID IN ('I','J')) AND (T1.ACACTLID = ( 'COM.ASIG.')) AND (T1.ACACSGID = ( 'CNV.COT.')) ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.ACRCOIDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I33", "SELECT GEDEVAPR, DESTFINID, GEDEVACIA, GEDEVAID, GEDEVADOC, GEDEVACOD FROM GEDEVA WHERE (GEDEVADOC = ( ?)) AND (GEDEVAID = ?) ORDER BY GEDEVADOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002I34", "SELECT T1.ACRCOILIN, T1.ACRCOIPRID, T2.INPRODID, T2.INTPALID, T1.ACACSGID, T1.ACACTLID, T1.ACRCOIDOC, T1.CNTDOCID, T1.CNCIASID FROM (ACRCOI1 T1 LEFT JOIN INPROD T2 ON T2.INPRODID = T1.ACRCOIPRID) WHERE (T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.ACRCOIDOC = ?) AND (T1.ACACTLID = ( 'COM.ASIG.')) AND (T1.ACACSGID = ( 'CNV.COT.')) AND (T2.INTPALID = ( ?)) ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.ACRCOIDOC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 60) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 15) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getLongVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 10) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 15) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getLongVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 60) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,6) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getLongVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,4) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,4) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,3) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5) ;
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((String[]) buf[9])[0] = rslt.getString(7, 3) ;
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
               ((String[]) buf[11])[0] = rslt.getString(9, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 10) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 300) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 100) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 200) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 3) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 10) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 240) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 250) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 240) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 15) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getString(4, 3) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((int[]) buf[7])[0] = rslt.getInt(6) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3) ;
               ((String[]) buf[7])[0] = rslt.getString(8, 10) ;
               ((String[]) buf[8])[0] = rslt.getString(9, 10) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 3) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getString(6, 3) ;
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,6) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 27 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 20) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((String[]) buf[9])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,4) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3) ;
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 10) ;
               ((String[]) buf[6])[0] = rslt.getString(6, 2000) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3) ;
               ((long[]) buf[13])[0] = rslt.getLong(12) ;
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
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((String[]) buf[8])[0] = rslt.getString(6, 3) ;
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((int[]) buf[10])[0] = rslt.getInt(8) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,6) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 15) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,6) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 10) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getLongVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 3) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 60) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((String[]) buf[11])[0] = rslt.getString(8, 3) ;
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 20 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 22 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 15);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 15);
               }
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 27 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 10);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               return;
            case 28 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 30 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 32 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
      }
   }

}

