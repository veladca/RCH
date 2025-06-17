/*
               File: wpregavacs_impl
        Description: Registro de avance
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 7, 2025 11:30:50.76
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

public final  class wpregavacs_impl extends GXDataArea
{
   public wpregavacs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpregavacs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpregavacs_impl.class ));
   }

   public wpregavacs_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_203 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_203_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_203_idx = httpContext.GetNextPar( ) ;
            AV110caCNDSPRSUBCONDSC = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
         {
            AV110caCNDSPRSUBCONDSC = httpContext.GetNextPar( ) ;
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV97SDTRegAvaSCItem);
            AV46CNDSPRTRLIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV38AVDSPRMON_ASI = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV127AVDSPR3CAN_ASI = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A7789AVDSPRCIA = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8CNDSPRCIA = GXutil.lval( httpContext.GetNextPar( )) ;
            A8255AVDSPRDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9CNDSPRNDC = GXutil.lval( httpContext.GetNextPar( )) ;
            A20CNTDOCID = httpContext.GetNextPar( ) ;
            AV10CNDSPRTDC = httpContext.GetNextPar( ) ;
            A7792AVDSPRLIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A8239AVDSPRSPID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV52gCNDSPRSUBCONID = GXutil.lval( httpContext.GetNextPar( )) ;
            A7800AVDSPREST = httpContext.GetNextPar( ) ;
            n7800AVDSPREST = false ;
            A8240AVDSPRMON = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A18201AVDSPR3CAN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n18201AVDSPR3CAN = false ;
            AV12PMCTPRDSC = httpContext.GetNextPar( ) ;
            AV18PMCTPRID = httpContext.GetNextPar( ) ;
            AV15CNCDIRNOM_G = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid2_refresh( AV110caCNDSPRSUBCONDSC, AV97SDTRegAvaSCItem, AV46CNDSPRTRLIN, AV38AVDSPRMON_ASI, AV127AVDSPR3CAN_ASI, A7789AVDSPRCIA, AV8CNDSPRCIA, A8255AVDSPRDOC, AV9CNDSPRNDC, A20CNTDOCID, AV10CNDSPRTDC, A7792AVDSPRLIN, A8239AVDSPRSPID, AV52gCNDSPRSUBCONID, A7800AVDSPREST, A8240AVDSPRMON, A18201AVDSPR3CAN, AV12PMCTPRDSC, AV18PMCTPRID, AV15CNCDIRNOM_G) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "wpRegAvaCS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")) ;
            com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"PMCTPRDSC:"+GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")));
            GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"CNCDIRNOM_G:"+GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")));
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_62 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_62_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_62_idx = httpContext.GetNextPar( ) ;
            edtavCapcant_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCapcant_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCapcant_Visible, 5, 0)), !bGXsfl_62_Refreshing);
            AV29CNDSPRTRCANT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV31CNDSPRTRIMP = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV72MONTO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV133MONTOACUMULADO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV75cantpendiente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV76montopendiente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
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
            edtavCapcant_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCapcant_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCapcant_Visible, 5, 0)), !bGXsfl_62_Refreshing);
            AV29CNDSPRTRCANT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV31CNDSPRTRIMP = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV72MONTO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV133MONTOACUMULADO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV75cantpendiente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV76montopendiente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV96SDTRegAvaSC);
            AV46CNDSPRTRLIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV12PMCTPRDSC = httpContext.GetNextPar( ) ;
            AV18PMCTPRID = httpContext.GetNextPar( ) ;
            AV15CNCDIRNOM_G = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV29CNDSPRTRCANT, AV31CNDSPRTRIMP, AV72MONTO, AV133MONTOACUMULADO, AV75cantpendiente, AV76montopendiente, AV96SDTRegAvaSC, AV46CNDSPRTRLIN, AV12PMCTPRDSC, AV18PMCTPRID, AV15CNCDIRNOM_G) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "wpRegAvaCS" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")) ;
            com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"PMCTPRDSC:"+GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")));
            GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"CNCDIRNOM_G:"+GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")));
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
      pa49G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start49G2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2025571130510", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      httpContext.AddJavascriptSource("JsMsgBox/JsMsgBoxRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.kdsproyectos.wpregavacs") +"\">") ;
         com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:none\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCTPRDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCDIRNOM_G", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "wpRegAvaCS" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"PMCTPRDSC:"+GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")));
      GXutil.writeLogln("wpregavacs:[SendSecurityCheck value for]"+"CNCDIRNOM_G:"+GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")));
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTREGAVASC", AV96SDTRegAvaSC);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTREGAVASC", AV96SDTRegAvaSC);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTREGAVASCITEM", AV97SDTRegAvaSCItem);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTREGAVASCITEM", AV97SDTRegAvaSCItem);
      }
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTRLIN", GXutil.ltrim( localUtil.ntoc( AV46CNDSPRTRLIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRLIN", getSecureSignedToken( "", localUtil.format( AV46CNDSPRTRLIN, "ZZ9.999")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vAVDSPRMON_ASI", GXutil.ltrim( localUtil.ntoc( AV38AVDSPRMON_ASI, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vAVDSPR3CAN_ASI", GXutil.ltrim( localUtil.ntoc( AV127AVDSPR3CAN_ASI, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRCIA", GXutil.ltrim( localUtil.ntoc( A7789AVDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRCIA", GXutil.ltrim( localUtil.ntoc( AV8CNDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRDOC", GXutil.ltrim( localUtil.ntoc( A8255AVDSPRDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTDOCID", GXutil.rtrim( A20CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTDC", GXutil.rtrim( AV10CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRLIN", GXutil.ltrim( localUtil.ntoc( A7792AVDSPRLIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRSPID", GXutil.ltrim( localUtil.ntoc( A8239AVDSPRSPID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPREST", GXutil.rtrim( A7800AVDSPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRMON", GXutil.ltrim( localUtil.ntoc( A8240AVDSPRMON, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPR3CAN", GXutil.ltrim( localUtil.ntoc( A18201AVDSPR3CAN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_boolean_hidden_field( httpContext, "vCONTINUAR", AV64continuar);
      com.kdsproyectos.GxWebStd.gx_boolean_hidden_field( httpContext, "vFALTAPERIODO", AV132faltaPeriodo);
      com.kdsproyectos.GxWebStd.gx_boolean_hidden_field( httpContext, "vMONTOMAYOR", AV78montomayor);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCSCAPMONT", GXutil.ltrim( localUtil.ntoc( AV116csCAPMONT, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCAPMONT_AUX", GXutil.ltrim( localUtil.ntoc( AV65CAPMONT_AUX, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vTIPOMENSAJE", GXutil.rtrim( AV68TipoMensaje));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMENSAJEFINAL", AV70mensajeFinal);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vBANDAUT", GXutil.ltrim( localUtil.ntoc( AV138BANDAUT, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTDC_GEN", GXutil.rtrim( AV82CNDSPRTDC_GEN));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV5CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "NIVAUTAVNIV", GXutil.ltrim( localUtil.ntoc( A7884NIVAUTAVNIV, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "NIVAUTAVPRY", GXutil.rtrim( A8263NIVAUTAVPRY));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMCTPRID", GXutil.rtrim( AV18PMCTPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCTPRID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PMCTPRID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "NIVAUTAVTDC", GXutil.rtrim( A7883NIVAUTAVTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "NIVAUTAVUSR", GXutil.rtrim( A7886NIVAUTAVUSR));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vAUXCNDSPRSUBCONID", GXutil.ltrim( localUtil.ntoc( AV94auxCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vAUXAVDSPRMON", GXutil.ltrim( localUtil.ntoc( AV95auxAVDSPRMON, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vDGENERADOS", GXutil.rtrim( AV80dGenerados));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRCIA", GXutil.ltrim( localUtil.ntoc( A7518CNDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTDC", GXutil.rtrim( A7519CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRNDC", GXutil.ltrim( localUtil.ntoc( A7520CNDSPRNDC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTRALC", A7550CNDSPRTRALC);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGXV10", GXutil.ltrim( localUtil.ntoc( AV177GXV10, (byte)(8), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGXV9", GXutil.ltrim( localUtil.ntoc( AV176GXV9, (byte)(8), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "JSMSGBOX1_Width", GXutil.rtrim( Jsmsgbox1_Width));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "JSMSGBOX1_Height", GXutil.rtrim( Jsmsgbox1_Height));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "JSMSGBOX1_Texto", GXutil.rtrim( Jsmsgbox1_Texto));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "JSMSGBOX1_Botones", GXutil.rtrim( Jsmsgbox1_Botones));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "JSMSGBOX1_Texto_boton_ok", GXutil.rtrim( Jsmsgbox1_Texto_boton_ok));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCAPCANT_Visible", GXutil.ltrim( localUtil.ntoc( edtavCapcant_Visible, (byte)(5), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we49G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt49G2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.kdsproyectos.wpregavacs")  ;
   }

   public String getPgmname( )
   {
      return "wpRegAvaCS" ;
   }

   public String getPgmdesc( )
   {
      return "Registro de avance" ;
   }

   public void wb49G0( )
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
         wb_table1_2_49G2( true) ;
      }
      else
      {
         wb_table1_2_49G2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_49G2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      if ( wbEnd == 62 )
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
      if ( wbEnd == 203 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid2Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
               if ( ! isAjaxCallMode( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start49G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 16_0_1-129648", (short)(0)) ;
         Form.getMeta().addItem("description", "Registro de avance", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup49G0( ) ;
   }

   public void ws49G2( )
   {
      start49G2( ) ;
      evt49G2( ) ;
   }

   public void evt49G2( )
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
                        else if ( GXutil.strcmp(sEvt, "JSMSGBOX1.ONCLICKOK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1149G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "TXTGUARDAR.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1249G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.CONTINUA") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1349G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'EXPORTAREXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'ExportarExcel' */
                           e1449G2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 31), "VAVDSPR3CAN.CONTROLVALUECHANGED") == 0 ) )
                        {
                           nGXsfl_62_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_622( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRNDC");
                              GX_FocusControl = edtavCndsprtrndc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23CNDSPRTRNDC = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV23CNDSPRTRNDC, 10, 0)));
                           }
                           else
                           {
                              AV23CNDSPRTRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV23CNDSPRTRNDC, 10, 0)));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",") > 9999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRLINR");
                              GX_FocusControl = edtavCndsprtrlinr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24CNDSPRTRLINR = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrlinr_Internalname, GXutil.ltrim( GXutil.str( AV24CNDSPRTRLINR, 7, 0)));
                           }
                           else
                           {
                              AV24CNDSPRTRLINR = (int)(localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrlinr_Internalname, GXutil.ltrim( GXutil.str( AV24CNDSPRTRLINR, 7, 0)));
                           }
                           AV25CNDSPRTRFIT_C = httpContext.cgiGet( edtavCndsprtrfit_c_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrfit_c_Internalname, AV25CNDSPRTRFIT_C);
                           AV26CNDSPRTRFFT_C = httpContext.cgiGet( edtavCndsprtrfft_c_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrfft_c_Internalname, AV26CNDSPRTRFFT_C);
                           AV27CNDSPRTRALC = httpContext.cgiGet( edtavCndsprtralc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtralc_Internalname, AV27CNDSPRTRALC);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRPUN");
                              GX_FocusControl = edtavCndsprtrpun_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28CNDSPRTRPUN = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrpun_Internalname, GXutil.ltrim( GXutil.str( AV28CNDSPRTRPUN, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRPUN"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV28CNDSPRTRPUN = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrpun_Internalname, GXutil.ltrim( GXutil.str( AV28CNDSPRTRPUN, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRPUN"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)), DecimalUtil.stringToDec("999999999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRCANT");
                              GX_FocusControl = edtavCndsprtrcant_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV29CNDSPRTRCANT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrcant_Internalname, GXutil.ltrim( GXutil.str( AV29CNDSPRTRCANT, 17, 4)));
                           }
                           else
                           {
                              AV29CNDSPRTRCANT = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrcant_Internalname, GXutil.ltrim( GXutil.str( AV29CNDSPRTRCANT, 17, 4)));
                           }
                           AV30CNDSPRTRUM = httpContext.cgiGet( edtavCndsprtrum_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrum_Internalname, AV30CNDSPRTRUM);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRIMP");
                              GX_FocusControl = edtavCndsprtrimp_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV31CNDSPRTRIMP = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrimp_Internalname, GXutil.ltrim( GXutil.str( AV31CNDSPRTRIMP, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRIMP"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV31CNDSPRTRIMP = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrimp_Internalname, GXutil.ltrim( GXutil.str( AV31CNDSPRTRIMP, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRIMP"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           AV32CNDSPRTRMON = httpContext.cgiGet( edtavCndsprtrmon_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrmon_Internalname, AV32CNDSPRTRMON);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOACUMULADO");
                              GX_FocusControl = edtavMontoacumulado_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV133MONTOACUMULADO = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV133MONTOACUMULADO, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOACUMULADO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV133MONTOACUMULADO = localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV133MONTOACUMULADO, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOACUMULADO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTO");
                              GX_FocusControl = edtavMonto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV72MONTO = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV72MONTO, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV72MONTO = localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV72MONTO, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOPENDIENTE");
                              GX_FocusControl = edtavMontopendiente_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76montopendiente = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV76montopendiente, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOPENDIENTE"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV76montopendiente = localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV76montopendiente, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOPENDIENTE"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           AV84AVDSPROBS = httpContext.cgiGet( edtavAvdsprobs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprobs_Internalname, AV84AVDSPROBS);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAPMONT");
                              GX_FocusControl = edtavCapmont_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34CAPMONT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCapmont_Internalname, GXutil.ltrim( GXutil.str( AV34CAPMONT, 15, 2)));
                           }
                           else
                           {
                              AV34CAPMONT = localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCapmont_Internalname, GXutil.ltrim( GXutil.str( AV34CAPMONT, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTPENDIENTE");
                              GX_FocusControl = edtavCantpendiente_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV75cantpendiente = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantpendiente_Internalname, GXutil.ltrim( GXutil.str( AV75cantpendiente, 15, 2)));
                           }
                           else
                           {
                              AV75cantpendiente = localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantpendiente_Internalname, GXutil.ltrim( GXutil.str( AV75cantpendiente, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAPCANT");
                              GX_FocusControl = edtavCapcant_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV83CAPCANT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCapcant_Internalname, GXutil.ltrim( GXutil.str( AV83CAPCANT, 17, 6)));
                           }
                           else
                           {
                              AV83CAPCANT = localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCapcant_Internalname, GXutil.ltrim( GXutil.str( AV83CAPCANT, 17, 6)));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavFi_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFI");
                              GX_FocusControl = edtavFi_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV130FI = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFi_Internalname, localUtil.format(AV130FI, "99/99/99"));
                           }
                           else
                           {
                              AV130FI = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFi_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFi_Internalname, localUtil.format(AV130FI, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavFf_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFF");
                              GX_FocusControl = edtavFf_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV131FF = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFf_Internalname, localUtil.format(AV131FF, "99/99/99"));
                           }
                           else
                           {
                              AV131FF = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFf_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFf_Internalname, localUtil.format(AV131FF, "99/99/99"));
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
                                 e1549G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1649G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
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
                              sEvtType = GXutil.right( sEvt, 4) ;
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                              if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 31), "VAVDSPR3CAN.CONTROLVALUECHANGED") == 0 ) )
                              {
                                 nGXsfl_203_idx = (short)(GXutil.lval( sEvtType)) ;
                                 sGXsfl_203_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_203_idx, 4, 0)), (short)(4), "0") + sGXsfl_62_idx ;
                                 subsflControlProps_20310( ) ;
                                 AV54gCNDSPRSUBCONCLA = httpContext.cgiGet( edtavGcndsprsubconcla_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcla_Internalname, AV54gCNDSPRSUBCONCLA);
                                 AV110caCNDSPRSUBCONDSC = httpContext.cgiGet( edtavCacndsprsubcondsc_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
                                 AV51gCNDSPRSUBCONDSC = httpContext.cgiGet( edtavGcndsprsubcondsc_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcondsc_Internalname, AV51gCNDSPRSUBCONDSC);
                                 AV56gCNDSPRSUBCONUNIMED = httpContext.cgiGet( edtavGcndsprsubconunimed_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconunimed_Internalname, AV56gCNDSPRSUBCONUNIMED);
                                 AV57gCNDSPRSUBCONCAN = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV57gCNDSPRSUBCONCAN, 15, 2)));
                                 AV55gCNDSPRSUBCONPREUNI = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV55gCNDSPRSUBCONPREUNI, 15, 2)));
                                 httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPREUNI"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                                 AV58gCNDSPRSUBCONTOT = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontot_Internalname, GXutil.ltrim( GXutil.str( AV58gCNDSPRSUBCONTOT, 15, 2)));
                                 AV63AVDSPR3CAN = localUtil.ctond( httpContext.cgiGet( edtavAvdspr3can_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavAvdspr3can_Internalname, GXutil.ltrim( GXutil.str( AV63AVDSPR3CAN, 15, 2)));
                                 AV39AVDSPRMON = localUtil.ctond( httpContext.cgiGet( edtavAvdsprmon_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV39AVDSPRMON, 17, 2)));
                                 AV126gscaAVDSPR3CAN = httpContext.cgiGet( edtavGscaavdspr3can_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdspr3can_Internalname, AV126gscaAVDSPR3CAN);
                                 AV117gscaAVDSPRMON = httpContext.cgiGet( edtavGscaavdsprmon_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdsprmon_Internalname, AV117gscaAVDSPRMON);
                                 AV128gscpAVDSPR3CAN = localUtil.ctond( httpContext.cgiGet( edtavGscpavdspr3can_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGscpavdspr3can_Internalname, GXutil.ltrim( GXutil.str( AV128gscpAVDSPR3CAN, 15, 2)));
                                 httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGSCPAVDSPR3CAN"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                                 AV129gscpAVDSPRMON = localUtil.ctond( httpContext.cgiGet( edtavGscpavdsprmon_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGscpavdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV129gscpAVDSPRMON, 17, 2)));
                                 AV59gCNDSPRSUBCONTIP = httpContext.cgiGet( edtavGcndsprsubcontip_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontip_Internalname, AV59gCNDSPRSUBCONTIP);
                                 AV60gCNDSPRSUBCONFECINI = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavGcndsprsubconfecini_Internalname), 0)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconfecini_Internalname, localUtil.format(AV60gCNDSPRSUBCONFECINI, "99/99/99"));
                                 AV61gCNDSPRSUBCONFECFIN = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavGcndsprsubconfecfin_Internalname), 0)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconfecfin_Internalname, localUtil.format(AV61gCNDSPRSUBCONFECFIN, "99/99/99"));
                                 AV62gCNDSPRSUBCONRES = httpContext.cgiGet( edtavGcndsprsubconres_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconres_Internalname, AV62gCNDSPRSUBCONRES);
                                 AV37CNDSPRTRLIN_S = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrlin_s_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrlin_s_Internalname, GXutil.ltrim( GXutil.str( AV37CNDSPRTRLIN_S, 7, 3)));
                                 AV52gCNDSPRSUBCONID = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV52gCNDSPRSUBCONID, 10, 0)));
                                 httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONID"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")));
                                 sEvtType = GXutil.right( sEvt, 1) ;
                                 if ( GXutil.strcmp(sEvtType, ".") == 0 )
                                 {
                                    sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                    if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                                    {
                                       httpContext.wbHandled = (byte)(1) ;
                                       dynload_actions( ) ;
                                       e1749G10 ();
                                    }
                                    else if ( GXutil.strcmp(sEvt, "VAVDSPR3CAN.CONTROLVALUECHANGED") == 0 )
                                    {
                                       httpContext.wbHandled = (byte)(1) ;
                                       dynload_actions( ) ;
                                       e1849G2 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we49G2( )
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

   public void pa49G2( )
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
            GX_FocusControl = edtavCntdocdsc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_622( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_622( ) ;
         nGXsfl_62_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_62_idx+1)) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid1Container));
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_20310( ) ;
      while ( nGXsfl_203_idx <= nRC_GXsfl_203 )
      {
         sendrow_20310( ) ;
         nGXsfl_203_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_203_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_203_idx+1)) ;
         sGXsfl_203_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_203_idx, 4, 0)), (short)(4), "0") + sGXsfl_62_idx ;
         subsflControlProps_20310( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid2Container));
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid2_refresh( String AV110caCNDSPRSUBCONDSC ,
                                  com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem AV97SDTRegAvaSCItem ,
                                  java.math.BigDecimal AV46CNDSPRTRLIN ,
                                  java.math.BigDecimal AV38AVDSPRMON_ASI ,
                                  java.math.BigDecimal AV127AVDSPR3CAN_ASI ,
                                  long A7789AVDSPRCIA ,
                                  long AV8CNDSPRCIA ,
                                  long A8255AVDSPRDOC ,
                                  long AV9CNDSPRNDC ,
                                  String A20CNTDOCID ,
                                  String AV10CNDSPRTDC ,
                                  java.math.BigDecimal A7792AVDSPRLIN ,
                                  long A8239AVDSPRSPID ,
                                  long AV52gCNDSPRSUBCONID ,
                                  String A7800AVDSPREST ,
                                  java.math.BigDecimal A8240AVDSPRMON ,
                                  java.math.BigDecimal A18201AVDSPR3CAN ,
                                  String AV12PMCTPRDSC ,
                                  String AV18PMCTPRID ,
                                  String AV15CNCDIRNOM_G )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID2_nCurrentRecord = 0 ;
      rf49G10( ) ;
      /* End function gxgrGrid2_refresh */
   }

   public void gxgrgrid1_refresh( java.math.BigDecimal AV29CNDSPRTRCANT ,
                                  java.math.BigDecimal AV31CNDSPRTRIMP ,
                                  java.math.BigDecimal AV72MONTO ,
                                  java.math.BigDecimal AV133MONTOACUMULADO ,
                                  java.math.BigDecimal AV75cantpendiente ,
                                  java.math.BigDecimal AV76montopendiente ,
                                  GXBaseCollection<com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem> AV96SDTRegAvaSC ,
                                  java.math.BigDecimal AV46CNDSPRTRLIN ,
                                  String AV12PMCTPRDSC ,
                                  String AV18PMCTPRID ,
                                  String AV15CNCDIRNOM_G )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf49G2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRPUN", getSecureSignedToken( "", localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTRPUN", GXutil.ltrim( localUtil.ntoc( AV28CNDSPRTRPUN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRIMP", getSecureSignedToken( "", localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTRIMP", GXutil.ltrim( localUtil.ntoc( AV31CNDSPRTRIMP, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTOACUMULADO", getSecureSignedToken( "", localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMONTOACUMULADO", GXutil.ltrim( localUtil.ntoc( AV133MONTOACUMULADO, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTO", getSecureSignedToken( "", localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMONTO", GXutil.ltrim( localUtil.ntoc( AV72MONTO, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTOPENDIENTE", getSecureSignedToken( "", localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMONTOPENDIENTE", GXutil.ltrim( localUtil.ntoc( AV76montopendiente, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONID", GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGSCPAVDSPR3CAN", getSecureSignedToken( "", localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGSCPAVDSPR3CAN", GXutil.ltrim( localUtil.ntoc( AV128gscpAVDSPR3CAN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPREUNI", getSecureSignedToken( "", localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPREUNI", GXutil.ltrim( localUtil.ntoc( AV55gCNDSPRSUBCONPREUNI, (byte)(15), (byte)(2), ".", "")));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf49G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCntdocdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntdocdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntdocdsc_Enabled, 5, 0)), true);
      edtavCndsprndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprndc_Enabled, 5, 0)), true);
      edtavPmctprdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmctprdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPmctprdsc_Enabled, 5, 0)), true);
      edtavCndsprrescon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprrescon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprrescon_Enabled, 5, 0)), true);
      edtavCncdirnom_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_g_Enabled, 5, 0)), true);
      edtavCncdirnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_Enabled, 5, 0)), true);
      edtavCndsprcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprcon_Enabled, 5, 0)), true);
      edtavCndsprtrndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrndc_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrlinr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrlinr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrlinr_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrfit_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrfit_c_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrfit_c_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrfft_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrfft_c_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrfft_c_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtralc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtralc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtralc_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrpun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrpun_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrpun_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrcant_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrcant_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrum_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrimp_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrimp_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrmon_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMontoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontoacumulado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontoacumulado_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMonto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMonto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMonto_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMontopendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontopendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontopendiente_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCapmont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCapmont_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCapmont_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCantpendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantpendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCantpendiente_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavGcndsprsubconcla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcla_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavCacndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCacndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCacndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconunimed_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconunimed_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcontot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontot_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavAvdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAvdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAvdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscaavdspr3can_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscaavdspr3can_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscaavdspr3can_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscaavdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscaavdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscaavdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscpavdspr3can_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscpavdspr3can_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscpavdspr3can_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscpavdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscpavdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscpavdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcontip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontip_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconfecini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconfecini_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconfecini_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconfecfin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconfecfin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconfecfin_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconres_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconres_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavCndsprtrlin_s_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrlin_s_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrlin_s_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconid_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
   }

   public void rf49G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(62) ;
      nGXsfl_62_idx = (short)(1) ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 1280, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_622( ) ;
         e1649G2 ();
         wbEnd = (short)(62) ;
         wb49G0( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes49G2( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTRLIN", GXutil.ltrim( localUtil.ntoc( AV46CNDSPRTRLIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRLIN", getSecureSignedToken( "", localUtil.format( AV46CNDSPRTRLIN, "ZZ9.999")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCTPRDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMCTPRID", GXutil.rtrim( AV18PMCTPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMCTPRID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PMCTPRID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRPUN"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCDIRNOM_G", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTRIMP"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTOACUMULADO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMONTOPENDIENTE"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
   }

   public void rf49G10( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(203) ;
      nGXsfl_203_idx = (short)(1) ;
      sGXsfl_203_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_203_idx, 4, 0)), (short)(4), "0") + sGXsfl_62_idx ;
      subsflControlProps_20310( ) ;
      bGXsfl_203_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "KDSResponsiveTable");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid2_Width, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_20310( ) ;
         e1749G10 ();
         wbEnd = (short)(203) ;
         wb49G0( ) ;
      }
      bGXsfl_203_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes49G10( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONID"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGSCPAVDSPR3CAN"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPREUNI"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
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

   public int subgrid2_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public void strup49G0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCntdocdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntdocdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntdocdsc_Enabled, 5, 0)), true);
      edtavCndsprndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprndc_Enabled, 5, 0)), true);
      edtavPmctprdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmctprdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPmctprdsc_Enabled, 5, 0)), true);
      edtavCndsprrescon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprrescon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprrescon_Enabled, 5, 0)), true);
      edtavCncdirnom_g_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_g_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_g_Enabled, 5, 0)), true);
      edtavCncdirnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_Enabled, 5, 0)), true);
      edtavCndsprcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprcon_Enabled, 5, 0)), true);
      edtavCndsprtrndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrndc_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrlinr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrlinr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrlinr_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrfit_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrfit_c_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrfit_c_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrfft_c_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrfft_c_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrfft_c_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtralc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtralc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtralc_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrpun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrpun_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrpun_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrcant_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrcant_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrum_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrum_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrimp_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrimp_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprtrmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrmon_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMontoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontoacumulado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontoacumulado_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMonto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMonto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMonto_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavMontopendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontopendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontopendiente_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCapmont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCapmont_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCapmont_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCantpendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantpendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCantpendiente_Enabled, 5, 0)), !bGXsfl_62_Refreshing);
      edtavGcndsprsubconcla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcla_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavCacndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCacndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCacndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconunimed_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconunimed_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcontot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontot_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavAvdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAvdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAvdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscaavdspr3can_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscaavdspr3can_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscaavdspr3can_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscaavdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscaavdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscaavdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscpavdspr3can_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscpavdspr3can_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscpavdspr3can_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGscpavdsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGscpavdsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGscpavdsprmon_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubcontip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontip_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconfecini_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconfecini_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconfecini_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconfecfin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconfecfin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconfecfin_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconres_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconres_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavCndsprtrlin_s_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrlin_s_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrlin_s_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      edtavGcndsprsubconid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconid_Enabled, 5, 0)), !bGXsfl_203_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1549G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTREGAVASCITEM"), AV97SDTRegAvaSCItem);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTREGAVASC"), AV96SDTRegAvaSC);
         /* Read variables values. */
         AV11cntdocdsc = httpContext.cgiGet( edtavCntdocdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cntdocdsc", AV11cntdocdsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRNDC");
            GX_FocusControl = edtavCndsprndc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9CNDSPRNDC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CNDSPRNDC", GXutil.ltrim( GXutil.str( AV9CNDSPRNDC, 10, 0)));
         }
         else
         {
            AV9CNDSPRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CNDSPRNDC", GXutil.ltrim( GXutil.str( AV9CNDSPRNDC, 10, 0)));
         }
         AV12PMCTPRDSC = httpContext.cgiGet( edtavPmctprdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12PMCTPRDSC", AV12PMCTPRDSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCTPRDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, ""))));
         AV22CNDSPRRESCON = httpContext.cgiGet( edtavCndsprrescon_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CNDSPRRESCON", AV22CNDSPRRESCON);
         AV15CNCDIRNOM_G = httpContext.cgiGet( edtavCncdirnom_g_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15CNCDIRNOM_G", AV15CNCDIRNOM_G);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCDIRNOM_G", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, ""))));
         AV16CNCDIRNOM = httpContext.cgiGet( edtavCncdirnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CNCDIRNOM", AV16CNCDIRNOM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprcon_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprcon_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRCON");
            GX_FocusControl = edtavCndsprcon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53CNDSPRCON = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53CNDSPRCON", GXutil.ltrim( GXutil.str( AV53CNDSPRCON, 10, 0)));
         }
         else
         {
            AV53CNDSPRCON = localUtil.ctol( httpContext.cgiGet( edtavCndsprcon_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53CNDSPRCON", GXutil.ltrim( GXutil.str( AV53CNDSPRCON, 10, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDetcndsprsubconid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDetcndsprsubconid_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDETCNDSPRSUBCONID");
            GX_FocusControl = edtavDetcndsprsubconid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV123DETCNDSPRSUBCONID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123DETCNDSPRSUBCONID", GXutil.ltrim( GXutil.str( AV123DETCNDSPRSUBCONID, 10, 0)));
         }
         else
         {
            AV123DETCNDSPRSUBCONID = localUtil.ctol( httpContext.cgiGet( edtavDetcndsprsubconid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123DETCNDSPRSUBCONID", GXutil.ltrim( GXutil.str( AV123DETCNDSPRSUBCONID, 10, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDetcndsprtrlin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDetcndsprtrlin_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDETCNDSPRTRLIN");
            GX_FocusControl = edtavDetcndsprtrlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV122DETCNDSPRTRLIN = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122DETCNDSPRTRLIN", GXutil.ltrim( GXutil.str( AV122DETCNDSPRTRLIN, 7, 3)));
         }
         else
         {
            AV122DETCNDSPRTRLIN = localUtil.ctond( httpContext.cgiGet( edtavDetcndsprtrlin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122DETCNDSPRTRLIN", GXutil.ltrim( GXutil.str( AV122DETCNDSPRTRLIN, 7, 3)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDetavdsprmon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDetavdsprmon_Internalname)), DecimalUtil.stringToDec("99999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDETAVDSPRMON");
            GX_FocusControl = edtavDetavdsprmon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV124DETAVDSPRMON = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124DETAVDSPRMON", GXutil.ltrim( GXutil.str( AV124DETAVDSPRMON, 17, 2)));
         }
         else
         {
            AV124DETAVDSPRMON = localUtil.ctond( httpContext.cgiGet( edtavDetavdsprmon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124DETAVDSPRMON", GXutil.ltrim( GXutil.str( AV124DETAVDSPRMON, 17, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_62 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), ".", ",")) ;
         AV177GXV10 = (int)(localUtil.ctol( httpContext.cgiGet( "vGXV10"), ".", ",")) ;
         AV176GXV9 = (int)(localUtil.ctol( httpContext.cgiGet( "vGXV9"), ".", ",")) ;
         AV5CNUSERID = httpContext.cgiGet( "vCNUSERID") ;
         AV10CNDSPRTDC = httpContext.cgiGet( "vCNDSPRTDC") ;
         AV8CNDSPRCIA = localUtil.ctol( httpContext.cgiGet( "vCNDSPRCIA"), ".", ",") ;
         Jsmsgbox1_Width = httpContext.cgiGet( "JSMSGBOX1_Width") ;
         Jsmsgbox1_Height = httpContext.cgiGet( "JSMSGBOX1_Height") ;
         Jsmsgbox1_Texto = httpContext.cgiGet( "JSMSGBOX1_Texto") ;
         Jsmsgbox1_Botones = httpContext.cgiGet( "JSMSGBOX1_Botones") ;
         Jsmsgbox1_Texto_boton_ok = httpContext.cgiGet( "JSMSGBOX1_Texto_boton_ok") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "wpRegAvaCS" ;
         AV12PMCTPRDSC = httpContext.cgiGet( edtavPmctprdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12PMCTPRDSC", AV12PMCTPRDSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCTPRDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")) ;
         AV15CNCDIRNOM_G = httpContext.cgiGet( edtavCncdirnom_g_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15CNCDIRNOM_G", AV15CNCDIRNOM_G);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCDIRNOM_G", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GXutil.writeLogln("wpregavacs:[SecurityCheckFailed value for]"+"PMCTPRDSC:"+GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")));
            GXutil.writeLogln("wpregavacs:[SecurityCheckFailed value for]"+"CNCDIRNOM_G:"+GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, "")));
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
      e1549G2 ();
      if (returnInSub) return;
   }

   public void e1549G2( )
   {
      /* Start Routine */
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Guardar", GXv_char2) ;
      wpregavacs_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtguardar_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtguardar_Internalname, "Caption", lblTxtguardar_Caption, true);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Salir", GXv_char2) ;
      wpregavacs_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtsalir_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtsalir_Internalname, "Caption", lblTxtsalir_Caption, true);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Descargar Excel", GXv_char2) ;
      wpregavacs_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtexportar_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtexportar_Internalname, "Caption", lblTxtexportar_Caption, true);
      AV8CNDSPRCIA = GXutil.lval( AV6session.getValue("CNDSPRCIA")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CNDSPRCIA", GXutil.ltrim( GXutil.str( AV8CNDSPRCIA, 10, 0)));
      AV9CNDSPRNDC = GXutil.lval( AV6session.getValue("CNDSPRNDC")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CNDSPRNDC", GXutil.ltrim( GXutil.str( AV9CNDSPRNDC, 10, 0)));
      AV10CNDSPRTDC = AV6session.getValue("CNDSPRTDC") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CNDSPRTDC", AV10CNDSPRTDC);
      AV5CNUSERID = AV6session.getValue("CNUSERID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CNUSERID", AV5CNUSERID);
      AV118MENREGAVA = AV6session.getValue("MENREGAVA") ;
      AV6session.remove("CNDSPRCIA");
      AV6session.remove("CNDSPRNDC");
      AV6session.remove("CNDSPRTDC");
      AV6session.remove("MENREGAVA");
      lblTxtscript_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxtscript_Visible, 5, 0)), true);
      lblTxtestilos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtestilos_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxtestilos_Visible, 5, 0)), true);
      tblTable6_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable6_Visible, 5, 0)), !bGXsfl_62_Refreshing);
      lblTxtcantidad4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtcantidad4_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxtcantidad4_Visible, 5, 0)), !bGXsfl_62_Refreshing);
      edtavCndsprcon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprcon_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCndsprcon_Visible, 5, 0)), true);
      edtavCapcant_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCapcant_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCapcant_Visible, 5, 0)), !bGXsfl_62_Refreshing);
      lblTxtabrirdet_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtabrirdet_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxtabrirdet_Visible, 5, 0)), true);
      edtavDetcndsprsubconid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetcndsprsubconid_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDetcndsprsubconid_Visible, 5, 0)), true);
      edtavDetcndsprtrlin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetcndsprtrlin_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDetcndsprtrlin_Visible, 5, 0)), true);
      edtavDetavdsprmon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetavdsprmon_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDetavdsprmon_Visible, 5, 0)), true);
      AV82CNDSPRTDC_GEN = "DES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CNDSPRTDC_GEN", AV82CNDSPRTDC_GEN);
      AV122DETCNDSPRTRLIN = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122DETCNDSPRTRLIN", GXutil.ltrim( GXutil.str( AV122DETCNDSPRTRLIN, 7, 3)));
      AV123DETCNDSPRSUBCONID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123DETCNDSPRSUBCONID", GXutil.ltrim( GXutil.str( AV123DETCNDSPRSUBCONID, 10, 0)));
      AV124DETAVDSPRMON = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124DETAVDSPRMON", GXutil.ltrim( GXutil.str( AV124DETAVDSPRMON, 17, 2)));
      /* Using cursor H049G2 */
      pr_default.execute(0, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7520CNDSPRNDC = H049G2_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H049G2_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H049G2_A7518CNDSPRCIA[0] ;
         A7521CNDSPRPRID = H049G2_A7521CNDSPRPRID[0] ;
         n7521CNDSPRPRID = H049G2_n7521CNDSPRPRID[0] ;
         A7522CNDSPRCON = H049G2_A7522CNDSPRCON[0] ;
         n7522CNDSPRCON = H049G2_n7522CNDSPRCON[0] ;
         A7527CNDSPRMON = H049G2_A7527CNDSPRMON[0] ;
         n7527CNDSPRMON = H049G2_n7527CNDSPRMON[0] ;
         A7641CNDSPRTCMB = H049G2_A7641CNDSPRTCMB[0] ;
         n7641CNDSPRTCMB = H049G2_n7641CNDSPRTCMB[0] ;
         A7530CNDSPRRESCON = H049G2_A7530CNDSPRRESCON[0] ;
         n7530CNDSPRRESCON = H049G2_n7530CNDSPRRESCON[0] ;
         AV18PMCTPRID = A7521CNDSPRPRID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PMCTPRID", AV18PMCTPRID);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCTPRID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PMCTPRID, ""))));
         AV53CNDSPRCON = A7522CNDSPRCON ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53CNDSPRCON", GXutil.ltrim( GXutil.str( AV53CNDSPRCON, 10, 0)));
         GXv_char2[0] = AV15CNCDIRNOM_G ;
         new com.kdsproyectos.pcncdir(remoteHandle, context).execute( AV53CNDSPRCON, GXv_char2) ;
         wpregavacs_impl.this.AV15CNCDIRNOM_G = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53CNDSPRCON", GXutil.ltrim( GXutil.str( AV53CNDSPRCON, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV15CNCDIRNOM_G", AV15CNCDIRNOM_G);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCDIRNOM_G", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CNCDIRNOM_G, ""))));
         GXv_char2[0] = AV12PMCTPRDSC ;
         GXv_char3[0] = AV19PMCTPRUNNG ;
         new com.kdsproyectos.kds0003(remoteHandle, context).execute( AV18PMCTPRID, GXv_char2, GXv_char3) ;
         wpregavacs_impl.this.AV12PMCTPRDSC = GXv_char2[0] ;
         wpregavacs_impl.this.AV19PMCTPRUNNG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PMCTPRID", AV18PMCTPRID);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCTPRID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18PMCTPRID, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV12PMCTPRDSC", AV12PMCTPRDSC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPMCTPRDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, ""))));
         AV20CNDSPRMON = A7527CNDSPRMON ;
         AV21CNDSPRTCMB = A7641CNDSPRTCMB ;
         AV22CNDSPRRESCON = A7530CNDSPRRESCON ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CNDSPRRESCON", AV22CNDSPRRESCON);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H049G3 */
      pr_default.execute(1, new Object[] {AV10CNDSPRTDC});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A20CNTDOCID = H049G3_A20CNTDOCID[0] ;
         A21CNTDOCDSC = H049G3_A21CNTDOCDSC[0] ;
         n21CNTDOCDSC = H049G3_n21CNTDOCDSC[0] ;
         AV11cntdocdsc = A21CNTDOCDSC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cntdocdsc", AV11cntdocdsc);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor H049G4 */
      pr_default.execute(2, new Object[] {AV18PMCTPRID});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A171PMCTPRID = H049G4_A171PMCTPRID[0] ;
         A6299PMCTPREJ = H049G4_A6299PMCTPREJ[0] ;
         n6299PMCTPREJ = H049G4_n6299PMCTPREJ[0] ;
         AV93PMCTPREJ = A6299PMCTPREJ ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93PMCTPREJ", GXutil.ltrim( GXutil.str( AV93PMCTPREJ, 10, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor H049G5 */
      pr_default.execute(3, new Object[] {new Long(AV93PMCTPREJ)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A46CNCDIRID = H049G5_A46CNCDIRID[0] ;
         A194CNCDIRNOM = H049G5_A194CNCDIRNOM[0] ;
         n194CNCDIRNOM = H049G5_n194CNCDIRNOM[0] ;
         AV16CNCDIRNOM = A194CNCDIRNOM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CNCDIRNOM", AV16CNCDIRNOM);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Execute user subroutine: 'ESTILOS' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CARGAR ESTRUCTURA' */
      S122 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV118MENREGAVA)==0) )
      {
         this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Registro de avance",AV118MENREGAVA});
      }
   }

   public void S192( )
   {
      /* 'REVISA CADENA' Routine */
      AV138BANDAUT = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138BANDAUT", GXutil.ltrim( GXutil.str( AV138BANDAUT, 4, 0)));
      /* Using cursor H049G6 */
      pr_default.execute(4, new Object[] {AV18PMCTPRID});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A7886NIVAUTAVUSR = H049G6_A7886NIVAUTAVUSR[0] ;
         A7883NIVAUTAVTDC = H049G6_A7883NIVAUTAVTDC[0] ;
         A8263NIVAUTAVPRY = H049G6_A8263NIVAUTAVPRY[0] ;
         A7884NIVAUTAVNIV = H049G6_A7884NIVAUTAVNIV[0] ;
         AV138BANDAUT = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138BANDAUT", GXutil.ltrim( GXutil.str( AV138BANDAUT, 4, 0)));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S142( )
   {
      /* 'EXIT' Routine */
      lblTxtscript_Caption = "<script>window.close(\""+formatLink("com.kdsproyectos.wpregavacs") +"\",\"Pagina Nueva\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Caption", lblTxtscript_Caption, true);
   }

   public void S112( )
   {
      /* 'ESTILOS' Routine */
      lblTxtestilos_Caption = ""+"	<style>	"+"	td.gx-tab-padding-fix-1 TH "+"	{ text-align: center; position: sticky;  position: -webkit-sticky;  background: #efefef; top:0; z-index:20; color: black;}	"+"	.detalle { "+"	   text-decoration-line: underline ! Important; "+"	   text-align: center;"+"	   font-family: Arial;	"+"	   font-weight: bold;	"+"	   font-size:9.0pt; "+"	   font-style:normal; "+"	   color:#4169E1; "+"    cursor: pointer; "+"  	}"+"	</style>	" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtestilos_Internalname, "Caption", lblTxtestilos_Caption, true);
   }

   public void S122( )
   {
      /* 'CARGAR ESTRUCTURA' Routine */
      AV96SDTRegAvaSC.clear();
      GXv_char3[0] = "&CNDSPRCIA:" + GXutil.trim( GXutil.str( AV8CNDSPRCIA, 10, 0)) + " &CNDSPRTDC:" + GXutil.trim( AV10CNDSPRTDC) + " &CNDSPRNDC:" + GXutil.trim( GXutil.str( AV9CNDSPRNDC, 10, 0)) ;
      new com.kdsproyectos.pdasmsg(remoteHandle, context).execute( GXv_char3) ;
      /* Using cursor H049G7 */
      pr_default.execute(5, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A7520CNDSPRNDC = H049G7_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H049G7_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H049G7_A7518CNDSPRCIA[0] ;
         A7540CNDSPRTRLIN = H049G7_A7540CNDSPRTRLIN[0] ;
         A7541CNDSPRTRACT = H049G7_A7541CNDSPRTRACT[0] ;
         n7541CNDSPRTRACT = H049G7_n7541CNDSPRTRACT[0] ;
         A7542CNDSPRTRUM = H049G7_A7542CNDSPRTRUM[0] ;
         n7542CNDSPRTRUM = H049G7_n7542CNDSPRTRUM[0] ;
         A7543CNDSPRTRCANT = H049G7_A7543CNDSPRTRCANT[0] ;
         n7543CNDSPRTRCANT = H049G7_n7543CNDSPRTRCANT[0] ;
         A7544CNDSPRTRPUN = H049G7_A7544CNDSPRTRPUN[0] ;
         n7544CNDSPRTRPUN = H049G7_n7544CNDSPRTRPUN[0] ;
         A7545CNDSPRTRIMP = H049G7_A7545CNDSPRTRIMP[0] ;
         n7545CNDSPRTRIMP = H049G7_n7545CNDSPRTRIMP[0] ;
         A7546CNDSPRTRMON = H049G7_A7546CNDSPRTRMON[0] ;
         n7546CNDSPRTRMON = H049G7_n7546CNDSPRTRMON[0] ;
         A7547CNDSPRTRFIT = H049G7_A7547CNDSPRTRFIT[0] ;
         n7547CNDSPRTRFIT = H049G7_n7547CNDSPRTRFIT[0] ;
         A7548CNDSPRTRFFT = H049G7_A7548CNDSPRTRFFT[0] ;
         n7548CNDSPRTRFFT = H049G7_n7548CNDSPRTRFFT[0] ;
         A7549CNDSPRTRRES = H049G7_A7549CNDSPRTRRES[0] ;
         n7549CNDSPRTRRES = H049G7_n7549CNDSPRTRRES[0] ;
         A7550CNDSPRTRALC = H049G7_A7550CNDSPRTRALC[0] ;
         n7550CNDSPRTRALC = H049G7_n7550CNDSPRTRALC[0] ;
         A7551CNDSPRTROBS = H049G7_A7551CNDSPRTROBS[0] ;
         n7551CNDSPRTROBS = H049G7_n7551CNDSPRTROBS[0] ;
         A7600CNDSPRTRTDC = H049G7_A7600CNDSPRTRTDC[0] ;
         n7600CNDSPRTRTDC = H049G7_n7600CNDSPRTRTDC[0] ;
         A7601CNDSPRTRNDC = H049G7_A7601CNDSPRTRNDC[0] ;
         n7601CNDSPRTRNDC = H049G7_n7601CNDSPRTRNDC[0] ;
         A7602CNDSPRTRLINR = H049G7_A7602CNDSPRTRLINR[0] ;
         n7602CNDSPRTRLINR = H049G7_n7602CNDSPRTRLINR[0] ;
         AV97SDTRegAvaSCItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)new com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem(remoteHandle, context);
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlin( A7540CNDSPRTRLIN );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtract( A7541CNDSPRTRACT );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrum( A7542CNDSPRTRUM );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrcant( A7543CNDSPRTRCANT );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrpun( A7544CNDSPRTRPUN );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrimp( A7545CNDSPRTRIMP );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrmon( A7546CNDSPRTRMON );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrfit( A7547CNDSPRTRFIT );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrfft( A7548CNDSPRTRFFT );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrres( A7549CNDSPRTRRES );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtralc( A7550CNDSPRTRALC );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrobs( A7551CNDSPRTROBS );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrtdc( A7600CNDSPRTRTDC );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrndc( A7601CNDSPRTRNDC );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlinr( A7602CNDSPRTRLINR );
         AV46CNDSPRTRLIN = A7540CNDSPRTRLIN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46CNDSPRTRLIN", GXutil.ltrim( GXutil.str( AV46CNDSPRTRLIN, 7, 3)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRLIN", getSecureSignedToken( "", localUtil.format( AV46CNDSPRTRLIN, "ZZ9.999")));
         AV29CNDSPRTRCANT = A7543CNDSPRTRCANT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrcant_Internalname, GXutil.ltrim( GXutil.str( AV29CNDSPRTRCANT, 17, 4)));
         AV31CNDSPRTRIMP = A7545CNDSPRTRIMP ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrimp_Internalname, GXutil.ltrim( GXutil.str( AV31CNDSPRTRIMP, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRIMP"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         /* Execute user subroutine: 'MONTOREGISTRADO' */
         S208 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cantpendiente( AV75cantpendiente );
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Montopendiente( AV76montopendiente );
         /* Execute user subroutine: 'CARGAR SC' */
         S218 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         AV96SDTRegAvaSC.add(AV97SDTRegAvaSCItem.Clone(), 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S218( )
   {
      /* 'CARGAR SC' Routine */
      AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().clear();
      /* Using cursor H049G8 */
      pr_default.execute(6, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A18159CNDSPRSUBCONTIP = H049G8_A18159CNDSPRSUBCONTIP[0] ;
         n18159CNDSPRSUBCONTIP = H049G8_n18159CNDSPRSUBCONTIP[0] ;
         A7520CNDSPRNDC = H049G8_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H049G8_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H049G8_A7518CNDSPRCIA[0] ;
         A18153CNDSPRSUBCONCLA = H049G8_A18153CNDSPRSUBCONCLA[0] ;
         n18153CNDSPRSUBCONCLA = H049G8_n18153CNDSPRSUBCONCLA[0] ;
         A18154CNDSPRSUBCONDSC = H049G8_A18154CNDSPRSUBCONDSC[0] ;
         n18154CNDSPRSUBCONDSC = H049G8_n18154CNDSPRSUBCONDSC[0] ;
         A18155CNDSPRSUBCONPREUNI = H049G8_A18155CNDSPRSUBCONPREUNI[0] ;
         n18155CNDSPRSUBCONPREUNI = H049G8_n18155CNDSPRSUBCONPREUNI[0] ;
         A18156CNDSPRSUBCONUNIMED = H049G8_A18156CNDSPRSUBCONUNIMED[0] ;
         n18156CNDSPRSUBCONUNIMED = H049G8_n18156CNDSPRSUBCONUNIMED[0] ;
         A18157CNDSPRSUBCONCAN = H049G8_A18157CNDSPRSUBCONCAN[0] ;
         n18157CNDSPRSUBCONCAN = H049G8_n18157CNDSPRSUBCONCAN[0] ;
         A18158CNDSPRSUBCONTOT = H049G8_A18158CNDSPRSUBCONTOT[0] ;
         n18158CNDSPRSUBCONTOT = H049G8_n18158CNDSPRSUBCONTOT[0] ;
         A18185CNDSPRSUBCONFECINI = H049G8_A18185CNDSPRSUBCONFECINI[0] ;
         n18185CNDSPRSUBCONFECINI = H049G8_n18185CNDSPRSUBCONFECINI[0] ;
         A18186CNDSPRSUBCONFECFIN = H049G8_A18186CNDSPRSUBCONFECFIN[0] ;
         n18186CNDSPRSUBCONFECFIN = H049G8_n18186CNDSPRSUBCONFECFIN[0] ;
         A18187CNDSPRSUBCONRES = H049G8_A18187CNDSPRSUBCONRES[0] ;
         n18187CNDSPRSUBCONRES = H049G8_n18187CNDSPRSUBCONRES[0] ;
         A18147CNDSPRSUBCONBASE = H049G8_A18147CNDSPRSUBCONBASE[0] ;
         n18147CNDSPRSUBCONBASE = H049G8_n18147CNDSPRSUBCONBASE[0] ;
         A18148CNDSPRSUBCONPERT = H049G8_A18148CNDSPRSUBCONPERT[0] ;
         n18148CNDSPRSUBCONPERT = H049G8_n18148CNDSPRSUBCONPERT[0] ;
         A18149CNDSPRSUBCONPERTN2 = H049G8_A18149CNDSPRSUBCONPERTN2[0] ;
         n18149CNDSPRSUBCONPERTN2 = H049G8_n18149CNDSPRSUBCONPERTN2[0] ;
         A18150CNDSPRSUBCONPERTN3 = H049G8_A18150CNDSPRSUBCONPERTN3[0] ;
         n18150CNDSPRSUBCONPERTN3 = H049G8_n18150CNDSPRSUBCONPERTN3[0] ;
         A18151CNDSPRSUBCONPERTN4 = H049G8_A18151CNDSPRSUBCONPERTN4[0] ;
         n18151CNDSPRSUBCONPERTN4 = H049G8_n18151CNDSPRSUBCONPERTN4[0] ;
         A18152CNDSPRSUBCONPERTN5 = H049G8_A18152CNDSPRSUBCONPERTN5[0] ;
         n18152CNDSPRSUBCONPERTN5 = H049G8_n18152CNDSPRSUBCONPERTN5[0] ;
         A18146CNDSPRSUBCONID = H049G8_A18146CNDSPRSUBCONID[0] ;
         AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)new com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem(remoteHandle, context);
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconid( A18146CNDSPRSUBCONID );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcla( A18153CNDSPRSUBCONCLA );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcondsc( A18154CNDSPRSUBCONDSC );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconpreuni( A18155CNDSPRSUBCONPREUNI );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconunimed( A18156CNDSPRSUBCONUNIMED );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcan( A18157CNDSPRSUBCONCAN );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontot( A18158CNDSPRSUBCONTOT );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontip( A18159CNDSPRSUBCONTIP );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconfecini( A18185CNDSPRSUBCONFECINI );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconfecfin( A18186CNDSPRSUBCONFECFIN );
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconres( A18187CNDSPRSUBCONRES );
         AV103CNDSPRSUBCONBASE = A18147CNDSPRSUBCONBASE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103CNDSPRSUBCONBASE", GXutil.ltrim( GXutil.str( AV103CNDSPRSUBCONBASE, 10, 0)));
         AV105CNDSPRSUBCONPERT = A18148CNDSPRSUBCONPERT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105CNDSPRSUBCONPERT", GXutil.ltrim( GXutil.str( AV105CNDSPRSUBCONPERT, 10, 0)));
         AV106CNDSPRSUBCONPERTN2 = A18149CNDSPRSUBCONPERTN2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106CNDSPRSUBCONPERTN2", GXutil.ltrim( GXutil.str( AV106CNDSPRSUBCONPERTN2, 10, 0)));
         AV107CNDSPRSUBCONPERTN3 = A18150CNDSPRSUBCONPERTN3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107CNDSPRSUBCONPERTN3", GXutil.ltrim( GXutil.str( AV107CNDSPRSUBCONPERTN3, 10, 0)));
         AV104CNDSPRSUBCONPERTN4 = A18151CNDSPRSUBCONPERTN4 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104CNDSPRSUBCONPERTN4", GXutil.ltrim( GXutil.str( AV104CNDSPRSUBCONPERTN4, 10, 0)));
         AV108CNDSPRSUBCONPERTN5 = A18152CNDSPRSUBCONPERTN5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108CNDSPRSUBCONPERTN5", GXutil.ltrim( GXutil.str( AV108CNDSPRSUBCONPERTN5, 10, 0)));
         /* Execute user subroutine: 'CONSULTAR CONCEPTO AGRUPADOR' */
         S229 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cacndsprsubcondsc( AV110caCNDSPRSUBCONDSC );
         AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().add(AV99SubConItem.Clone(), 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   private void e1649G2( )
   {
      /* Grid1_Load Routine */
      tblTable6_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable6_Visible, 5, 0)), !bGXsfl_62_Refreshing);
      edtavAvdspr3can_Enabled = 1 ;
      AV159GXV1 = 1 ;
      while ( AV159GXV1 <= AV96SDTRegAvaSC.size() )
      {
         AV97SDTRegAvaSCItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)AV96SDTRegAvaSC.elementAt(-1+AV159GXV1));
         AV46CNDSPRTRLIN = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlin() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46CNDSPRTRLIN", GXutil.ltrim( GXutil.str( AV46CNDSPRTRLIN, 7, 3)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRLIN", getSecureSignedToken( "", localUtil.format( AV46CNDSPRTRLIN, "ZZ9.999")));
         AV42CNDSPRTRACT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtract() ;
         AV30CNDSPRTRUM = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrum() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrum_Internalname, AV30CNDSPRTRUM);
         AV29CNDSPRTRCANT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrcant() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrcant_Internalname, GXutil.ltrim( GXutil.str( AV29CNDSPRTRCANT, 17, 4)));
         AV28CNDSPRTRPUN = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrpun() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrpun_Internalname, GXutil.ltrim( GXutil.str( AV28CNDSPRTRPUN, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRPUN"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         AV31CNDSPRTRIMP = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrimp() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrimp_Internalname, GXutil.ltrim( GXutil.str( AV31CNDSPRTRIMP, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTRIMP"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         AV32CNDSPRTRMON = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrmon() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrmon_Internalname, AV32CNDSPRTRMON);
         AV43CNDSPRTRFIT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrfit() ;
         AV25CNDSPRTRFIT_C = localUtil.format( AV43CNDSPRTRFIT, "99/99/99") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrfit_c_Internalname, AV25CNDSPRTRFIT_C);
         AV44CNDSPRTRFFT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrfft() ;
         AV26CNDSPRTRFFT_C = localUtil.format( AV44CNDSPRTRFFT, "99/99/99") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrfft_c_Internalname, AV26CNDSPRTRFFT_C);
         AV13CNDSPRTRRES = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrres() ;
         AV27CNDSPRTRALC = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtralc() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtralc_Internalname, AV27CNDSPRTRALC);
         AV48CNDSPRTROBS = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrobs() ;
         AV49CNDSPRTRTDC = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrtdc() ;
         AV23CNDSPRTRNDC = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrndc() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV23CNDSPRTRNDC, 10, 0)));
         AV24CNDSPRTRLINR = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlinr() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrlinr_Internalname, GXutil.ltrim( GXutil.str( AV24CNDSPRTRLINR, 7, 0)));
         AV75cantpendiente = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cantpendiente() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCantpendiente_Internalname, GXutil.ltrim( GXutil.str( AV75cantpendiente, 15, 2)));
         AV76montopendiente = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Montopendiente() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV76montopendiente, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOPENDIENTE"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         AV34CAPMONT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCapmont_Internalname, GXutil.ltrim( GXutil.str( AV34CAPMONT, 15, 2)));
         AV83CAPCANT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCapcant_Internalname, GXutil.ltrim( GXutil.str( AV83CAPCANT, 17, 6)));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(62) ;
         }
         sendrow_622( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
         {
            httpContext.doAjaxLoad(62, Grid1Row);
         }
         AV159GXV1 = (int)(AV159GXV1+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97SDTRegAvaSCItem", AV97SDTRegAvaSCItem);
   }

   public void S1310( )
   {
      /* 'CONSULTARMONTOASIGNADO' Routine */
      AV38AVDSPRMON_ASI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AVDSPRMON_ASI", GXutil.ltrim( GXutil.str( AV38AVDSPRMON_ASI, 17, 2)));
      AV127AVDSPR3CAN_ASI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127AVDSPR3CAN_ASI", GXutil.ltrim( GXutil.str( AV127AVDSPR3CAN_ASI, 15, 2)));
      /* Optimized group. */
      /* Using cursor H049G9 */
      pr_default.execute(7, new Object[] {AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV8CNDSPRCIA), AV46CNDSPRTRLIN, new Long(AV52gCNDSPRSUBCONID)});
      c8240AVDSPRMON = H049G9_A8240AVDSPRMON[0] ;
      c18201AVDSPR3CAN = H049G9_A18201AVDSPR3CAN[0] ;
      n18201AVDSPR3CAN = H049G9_n18201AVDSPR3CAN[0] ;
      pr_default.close(7);
      AV38AVDSPRMON_ASI = AV38AVDSPRMON_ASI.add(c8240AVDSPRMON) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AVDSPRMON_ASI", GXutil.ltrim( GXutil.str( AV38AVDSPRMON_ASI, 17, 2)));
      AV127AVDSPR3CAN_ASI = AV127AVDSPR3CAN_ASI.add(c18201AVDSPR3CAN) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127AVDSPR3CAN_ASI", GXutil.ltrim( GXutil.str( AV127AVDSPR3CAN_ASI, 15, 2)));
      /* End optimized group. */
   }

   public void S208( )
   {
      /* 'MONTOREGISTRADO' Routine */
      AV71CANTTOT = DecimalUtil.ZERO ;
      AV72MONTO = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV72MONTO, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      AV133MONTOACUMULADO = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV133MONTOACUMULADO, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOACUMULADO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      /* Using cursor H049G10 */
      pr_default.execute(8, new Object[] {new Long(AV8CNDSPRCIA), new Long(AV9CNDSPRNDC), AV10CNDSPRTDC, AV46CNDSPRTRLIN});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A7800AVDSPREST = H049G10_A7800AVDSPREST[0] ;
         n7800AVDSPREST = H049G10_n7800AVDSPREST[0] ;
         A7792AVDSPRLIN = H049G10_A7792AVDSPRLIN[0] ;
         A20CNTDOCID = H049G10_A20CNTDOCID[0] ;
         A8255AVDSPRDOC = H049G10_A8255AVDSPRDOC[0] ;
         A7789AVDSPRCIA = H049G10_A7789AVDSPRCIA[0] ;
         A7862AVDSPRCAN = H049G10_A7862AVDSPRCAN[0] ;
         n7862AVDSPRCAN = H049G10_n7862AVDSPRCAN[0] ;
         A7795AVDSPRIMP = H049G10_A7795AVDSPRIMP[0] ;
         n7795AVDSPRIMP = H049G10_n7795AVDSPRIMP[0] ;
         AV73AVDSPRCAN = A7862AVDSPRCAN ;
         AV74AVDSPRIMP = A7795AVDSPRIMP ;
         AV87AVDSPREST = A7800AVDSPREST ;
         AV71CANTTOT = AV71CANTTOT.add(AV73AVDSPRCAN) ;
         AV72MONTO = AV72MONTO.add(AV74AVDSPRIMP) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV72MONTO, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         if ( GXutil.strcmp(A7800AVDSPREST, "Autorizado") == 0 )
         {
            AV133MONTOACUMULADO = AV133MONTOACUMULADO.add(AV74AVDSPRIMP) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV133MONTOACUMULADO, 15, 2)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOACUMULADO"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV75cantpendiente = AV29CNDSPRTRCANT.subtract(AV71CANTTOT) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCantpendiente_Internalname, GXutil.ltrim( GXutil.str( AV75cantpendiente, 15, 2)));
      AV76montopendiente = AV31CNDSPRTRIMP.subtract(AV72MONTO) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV76montopendiente, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMONTOPENDIENTE"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
   }

   public void e1249G2( )
   {
      /* Txtguardar_Click Routine */
      /* Execute user subroutine: 'VALIDARCAPTURA' */
      S152 ();
      if (returnInSub) return;
      if ( AV64continuar )
      {
         AV68TipoMensaje = "ConfirmaMonto" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68TipoMensaje", AV68TipoMensaje);
         /* Execute user subroutine: 'MENSAJE CONFIRMACION' */
         S162 ();
         if (returnInSub) return;
         this.executeUsercontrolMethod("", false, "JSMSGBOX1Container", "Ejecutar", "", new Object[] {});
      }
      else
      {
         if ( AV132faltaPeriodo )
         {
            this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","Seleccione el periodo del servicio, verifique."});
         }
         else
         {
            if ( AV78montomayor )
            {
               this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","El monto capturado es mayor de lo necesario para liquidar los cargos, verifique."});
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116csCAPMONT)==0) )
               {
                  this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","El monto del registro de avance es 0, verifique."});
               }
               else
               {
                  this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","La suma de los montos de los Conceptos debe ser igual al monto del registro del servicio, verifique."});
               }
            }
         }
         if ( GXutil.strcmp(AV84AVDSPROBS, "") == 0 )
         {
            this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","Capture las observaciones por favor, verifique."});
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97SDTRegAvaSCItem", AV97SDTRegAvaSCItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SubConItem", AV99SubConItem);
   }

   public void S152( )
   {
      /* 'VALIDARCAPTURA' Routine */
      AV64continuar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
      AV132faltaPeriodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132faltaPeriodo", AV132faltaPeriodo);
      AV116csCAPMONT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116csCAPMONT", GXutil.ltrim( GXutil.str( AV116csCAPMONT, 15, 2)));
      AV136observaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV136observaciones", AV136observaciones);
      AV163GXV3 = 1 ;
      while ( AV163GXV3 <= AV96SDTRegAvaSC.size() )
      {
         AV97SDTRegAvaSCItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)AV96SDTRegAvaSC.elementAt(-1+AV163GXV3));
         if ( ( AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont().doubleValue() > 0 ) && ( AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant().doubleValue() > 0 ) )
         {
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Fi()) && ! GXutil.dateCompare(GXutil.nullDate(), AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Ff()) )
            {
               AV65CAPMONT_AUX = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65CAPMONT_AUX", GXutil.ltrim( GXutil.str( AV65CAPMONT_AUX, 15, 2)));
               AV66numreg = 0 ;
               AV164GXV4 = 1 ;
               while ( AV164GXV4 <= AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().size() )
               {
                  AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().elementAt(-1+AV164GXV4));
                  AV65CAPMONT_AUX = AV65CAPMONT_AUX.add((AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon())) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV65CAPMONT_AUX", GXutil.ltrim( GXutil.str( AV65CAPMONT_AUX, 15, 2)));
                  AV66numreg = (long)(AV66numreg+1) ;
                  AV164GXV4 = (int)(AV164GXV4+1) ;
               }
               AV116csCAPMONT = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV116csCAPMONT", GXutil.ltrim( GXutil.str( AV116csCAPMONT, 15, 2)));
               if ( ( AV66numreg > 0 ) && ( DecimalUtil.compareTo(GXutil.roundDecimal( AV65CAPMONT_AUX, 2), GXutil.roundDecimal( AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont(), 2)) != 0 ) )
               {
                  AV64continuar = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
                  if (true) break;
               }
               AV78montomayor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV78montomayor", AV78montomayor);
               AV77diferencia = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Montopendiente().subtract(AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont()) ;
               if ( AV77diferencia.doubleValue() < 0 )
               {
                  AV64continuar = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
                  AV78montomayor = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV78montomayor", AV78montomayor);
                  if (true) break;
               }
               if (true) break;
            }
            else
            {
               AV64continuar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
               AV132faltaPeriodo = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV132faltaPeriodo", AV132faltaPeriodo);
            }
         }
         AV163GXV3 = (int)(AV163GXV3+1) ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116csCAPMONT)==0) )
      {
         AV64continuar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
      }
      if ( GXutil.strcmp(AV84AVDSPROBS, "") == 0 )
      {
         AV64continuar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64continuar", AV64continuar);
      }
   }

   public void S162( )
   {
      /* 'MENSAJE CONFIRMACION' Routine */
      if ( GXutil.strcmp(AV68TipoMensaje, "ConfirmaMonto") == 0 )
      {
         Jsmsgbox1_Texto = GXutil.trim( AV70mensajeFinal)+"<p style=\"font-family: arial; font-size: 18px;\"> ¿Desea continuar con el registro del avance por el monto de "+localUtil.format( AV116csCAPMONT, "$ ZZZ,ZZZ,ZZZ,ZZ9.99")+"?</p>" ;
         ucJsmsgbox1.sendProperty(context, "", false, Jsmsgbox1_Internalname, "Texto", Jsmsgbox1_Texto);
      }
   }

   public void e1149G2( )
   {
      /* Jsmsgbox1_Onclickok Routine */
      if ( GXutil.strcmp(AV68TipoMensaje, "ConfirmaMonto") == 0 )
      {
         /* Execute user subroutine: 'GUARDAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97SDTRegAvaSCItem", AV97SDTRegAvaSCItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SubConItem", AV99SubConItem);
   }

   public void S172( )
   {
      /* 'GUARDAR' Routine */
      AV79pMensaje = false ;
      AV80dGenerados = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80dGenerados", AV80dGenerados);
      /* Execute user subroutine: 'REVISA CADENA' */
      S192 ();
      if (returnInSub) return;
      if ( AV138BANDAUT == 1 )
      {
         AV165GXV5 = 1 ;
         while ( AV165GXV5 <= AV96SDTRegAvaSC.size() )
         {
            AV97SDTRegAvaSCItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)AV96SDTRegAvaSC.elementAt(-1+AV165GXV5));
            if ( ( AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont().doubleValue() != 0 ) && ( AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant().doubleValue() != 0 ) )
            {
               AV81CNDSPRNDC_GEN = 0 ;
               AV35AVDSPRPORAVOBR_C = DecimalUtil.ZERO ;
               AV67AVDSPRUM_C = "SER" ;
               AV85ano_proc = (short)(0) ;
               AV86Mes_proc = (byte)(0) ;
               AV17ultimoRegistroDelServicio = false ;
               GXv_int4[0] = AV8CNDSPRCIA ;
               GXv_int5[0] = AV81CNDSPRNDC_GEN ;
               GXv_char3[0] = AV82CNDSPRTDC_GEN ;
               GXv_char2[0] = AV10CNDSPRTDC ;
               GXv_int6[0] = AV9CNDSPRNDC ;
               GXv_decimal7[0] = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlin() ;
               GXv_decimal8[0] = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant() ;
               GXv_decimal9[0] = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont() ;
               GXv_char10[0] = AV5CNUSERID ;
               GXv_char11[0] = AV84AVDSPROBS ;
               GXv_decimal12[0] = AV35AVDSPRPORAVOBR_C ;
               GXv_char13[0] = AV67AVDSPRUM_C ;
               GXv_int14[0] = AV85ano_proc ;
               GXv_int15[0] = AV86Mes_proc ;
               GXv_char16[0] = AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrmon() ;
               GXv_boolean17[0] = AV17ultimoRegistroDelServicio ;
               GXv_date18[0] = AV130FI ;
               GXv_date19[0] = AV131FF ;
               new com.kdsproyectos.pavdspr_fg(remoteHandle, context).execute( GXv_int4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_char10, GXv_char11, GXv_decimal12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_boolean17, GXv_date18, GXv_date19) ;
               wpregavacs_impl.this.AV8CNDSPRCIA = GXv_int4[0] ;
               wpregavacs_impl.this.AV81CNDSPRNDC_GEN = GXv_int5[0] ;
               wpregavacs_impl.this.AV82CNDSPRTDC_GEN = GXv_char3[0] ;
               wpregavacs_impl.this.AV10CNDSPRTDC = GXv_char2[0] ;
               wpregavacs_impl.this.AV9CNDSPRNDC = GXv_int6[0] ;
               AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlin( GXv_decimal7[0] );
               AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant( GXv_decimal8[0] );
               AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont( GXv_decimal9[0] );
               wpregavacs_impl.this.AV5CNUSERID = GXv_char10[0] ;
               wpregavacs_impl.this.AV84AVDSPROBS = GXv_char11[0] ;
               wpregavacs_impl.this.AV35AVDSPRPORAVOBR_C = GXv_decimal12[0] ;
               wpregavacs_impl.this.AV67AVDSPRUM_C = GXv_char13[0] ;
               wpregavacs_impl.this.AV85ano_proc = GXv_int14[0] ;
               wpregavacs_impl.this.AV86Mes_proc = GXv_int15[0] ;
               AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrmon( GXv_char16[0] );
               wpregavacs_impl.this.AV17ultimoRegistroDelServicio = GXv_boolean17[0] ;
               wpregavacs_impl.this.AV130FI = GXv_date18[0] ;
               wpregavacs_impl.this.AV131FF = GXv_date19[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8CNDSPRCIA", GXutil.ltrim( GXutil.str( AV8CNDSPRCIA, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV82CNDSPRTDC_GEN", AV82CNDSPRTDC_GEN);
               httpContext.ajax_rsp_assign_attri("", false, "AV10CNDSPRTDC", AV10CNDSPRTDC);
               httpContext.ajax_rsp_assign_attri("", false, "AV9CNDSPRNDC", GXutil.ltrim( GXutil.str( AV9CNDSPRNDC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV5CNUSERID", AV5CNUSERID);
               httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprobs_Internalname, AV84AVDSPROBS);
               httpContext.ajax_rsp_assign_attri("", false, edtavFi_Internalname, localUtil.format(AV130FI, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, edtavFf_Internalname, localUtil.format(AV131FF, "99/99/99"));
               AV79pMensaje = true ;
               if ( GXutil.strcmp(AV80dGenerados, "") != 0 )
               {
                  AV80dGenerados = AV80dGenerados + "," ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV80dGenerados", AV80dGenerados);
               }
               AV80dGenerados = AV80dGenerados + GXutil.trim( GXutil.str( AV81CNDSPRNDC_GEN, 10, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80dGenerados", AV80dGenerados);
               AV166GXV6 = 1 ;
               while ( AV166GXV6 <= AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().size() )
               {
                  AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().elementAt(-1+AV166GXV6));
                  new com.kdsproyectos.pavdsprsc(remoteHandle, context).execute( AV8CNDSPRCIA, AV81CNDSPRNDC_GEN, AV82CNDSPRTDC_GEN, AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Cndsprtrlin(), AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconid(), AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon(), AV5CNUSERID, AV10CNDSPRTDC, AV9CNDSPRNDC, AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdspr3can(), AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconpreuni(), AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconunimed()) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8CNDSPRCIA", GXutil.ltrim( GXutil.str( AV8CNDSPRCIA, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "AV82CNDSPRTDC_GEN", AV82CNDSPRTDC_GEN);
                  httpContext.ajax_rsp_assign_attri("", false, "AV5CNUSERID", AV5CNUSERID);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10CNDSPRTDC", AV10CNDSPRTDC);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9CNDSPRNDC", GXutil.ltrim( GXutil.str( AV9CNDSPRNDC, 10, 0)));
                  AV166GXV6 = (int)(AV166GXV6+1) ;
               }
            }
            AV165GXV5 = (int)(AV165GXV5+1) ;
         }
         this.executeExternalObjectMethod("", false, "GlobalEvents", "Continua", new Object[] {}, true);
         if ( AV79pMensaje )
         {
         }
      }
      else
      {
         AV139mensaje = "No hay cadena de autorización para el proyecto " + GXutil.trim( AV12PMCTPRDSC) ;
         this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Registro de avance",AV139mensaje});
      }
   }

   public void S232( )
   {
      /* 'DATOS CONTRATISTA' Routine */
      /* Using cursor H049G11 */
      pr_default.execute(9, new Object[] {new Long(AV53CNDSPRCON)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A46CNCDIRID = H049G11_A46CNCDIRID[0] ;
         A2882CNCDIRESTIMP = H049G11_A2882CNCDIRESTIMP[0] ;
         n2882CNCDIRESTIMP = H049G11_n2882CNCDIRESTIMP[0] ;
         AV92EstructImpId = A2882CNCDIRESTIMP ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void e1849G2( )
   {
      /* Avdspr3can_Controlvaluechanged Routine */
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63AVDSPR3CAN)==0) && ( DecimalUtil.compareTo(AV63AVDSPR3CAN, AV128gscpAVDSPR3CAN) > 0 ) )
      {
         this.executeUsercontrolMethod("", false, "MSJContainer", "ShowMessage", "", new Object[] {"Notificación","La cantidad debe ser menor o igual a la cantidad pendiente, verifique."});
         AV63AVDSPR3CAN = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAvdspr3can_Internalname, GXutil.ltrim( GXutil.str( AV63AVDSPR3CAN, 15, 2)));
      }
      else
      {
         if ( AV63AVDSPR3CAN.doubleValue() > 0 )
         {
            AV39AVDSPRMON = GXutil.roundDecimal( AV55gCNDSPRSUBCONPREUNI.multiply(AV63AVDSPR3CAN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV39AVDSPRMON, 17, 2)));
         }
         else
         {
            AV39AVDSPRMON = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV39AVDSPRMON, 17, 2)));
         }
         AV94auxCNDSPRSUBCONID = AV52gCNDSPRSUBCONID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94auxCNDSPRSUBCONID", GXutil.ltrim( GXutil.str( AV94auxCNDSPRSUBCONID, 10, 0)));
         AV95auxAVDSPRMON = AV39AVDSPRMON ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95auxAVDSPRMON", GXutil.ltrim( GXutil.str( AV95auxAVDSPRMON, 17, 2)));
         /* Execute user subroutine: 'MONTOTOTAL' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV97SDTRegAvaSCItem", AV97SDTRegAvaSCItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SubConItem", AV99SubConItem);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV96SDTRegAvaSC", AV96SDTRegAvaSC);
   }

   public void S182( )
   {
      /* 'MONTOTOTAL' Routine */
      AV168GXV7 = 1 ;
      while ( AV168GXV7 <= AV96SDTRegAvaSC.size() )
      {
         AV97SDTRegAvaSCItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem)AV96SDTRegAvaSC.elementAt(-1+AV168GXV7));
         AV102auxCAPMONT = DecimalUtil.ZERO ;
         AV134auxCAPCANT = DecimalUtil.ZERO ;
         AV169GXV8 = 1 ;
         while ( AV169GXV8 <= AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().size() )
         {
            AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().elementAt(-1+AV169GXV8));
            if ( AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconid() == AV94auxCNDSPRSUBCONID )
            {
               AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon( AV95auxAVDSPRMON );
               AV99SubConItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdspr3can( AV63AVDSPR3CAN );
               AV102auxCAPMONT = AV102auxCAPMONT.add(AV95auxAVDSPRMON) ;
            }
            else
            {
               AV102auxCAPMONT = AV102auxCAPMONT.add((AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon())) ;
            }
            AV169GXV8 = (int)(AV169GXV8+1) ;
         }
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capmont( AV102auxCAPMONT );
         AV134auxCAPCANT = AV102auxCAPMONT.divide(AV28CNDSPRTRPUN, 18, java.math.BigDecimal.ROUND_DOWN) ;
         AV97SDTRegAvaSCItem.setgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Capcant( AV134auxCAPCANT );
         AV168GXV7 = (int)(AV168GXV7+1) ;
      }
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_62 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), ".", ",")) ;
      nGXsfl_62_fel_idx = (short)(0) ;
      while ( nGXsfl_62_fel_idx < nRC_GXsfl_62 )
      {
         nGXsfl_62_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_62_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_62_fel_idx+1)) ;
         sGXsfl_62_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_622( ) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRNDC");
            GX_FocusControl = edtavCndsprtrndc_Internalname ;
            wbErr = true ;
            AV23CNDSPRTRNDC = 0 ;
         }
         else
         {
            AV23CNDSPRTRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",") > 9999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRLINR");
            GX_FocusControl = edtavCndsprtrlinr_Internalname ;
            wbErr = true ;
            AV24CNDSPRTRLINR = 0 ;
         }
         else
         {
            AV24CNDSPRTRLINR = (int)(localUtil.ctol( httpContext.cgiGet( edtavCndsprtrlinr_Internalname), ".", ",")) ;
         }
         AV25CNDSPRTRFIT_C = httpContext.cgiGet( edtavCndsprtrfit_c_Internalname) ;
         AV26CNDSPRTRFFT_C = httpContext.cgiGet( edtavCndsprtrfft_c_Internalname) ;
         AV27CNDSPRTRALC = httpContext.cgiGet( edtavCndsprtralc_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRPUN");
            GX_FocusControl = edtavCndsprtrpun_Internalname ;
            wbErr = true ;
            AV28CNDSPRTRPUN = DecimalUtil.ZERO ;
         }
         else
         {
            AV28CNDSPRTRPUN = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrpun_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)), DecimalUtil.stringToDec("999999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRCANT");
            GX_FocusControl = edtavCndsprtrcant_Internalname ;
            wbErr = true ;
            AV29CNDSPRTRCANT = DecimalUtil.ZERO ;
         }
         else
         {
            AV29CNDSPRTRCANT = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrcant_Internalname)) ;
         }
         AV30CNDSPRTRUM = httpContext.cgiGet( edtavCndsprtrum_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRIMP");
            GX_FocusControl = edtavCndsprtrimp_Internalname ;
            wbErr = true ;
            AV31CNDSPRTRIMP = DecimalUtil.ZERO ;
         }
         else
         {
            AV31CNDSPRTRIMP = localUtil.ctond( httpContext.cgiGet( edtavCndsprtrimp_Internalname)) ;
         }
         AV32CNDSPRTRMON = httpContext.cgiGet( edtavCndsprtrmon_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOACUMULADO");
            GX_FocusControl = edtavMontoacumulado_Internalname ;
            wbErr = true ;
            AV133MONTOACUMULADO = DecimalUtil.ZERO ;
         }
         else
         {
            AV133MONTOACUMULADO = localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTO");
            GX_FocusControl = edtavMonto_Internalname ;
            wbErr = true ;
            AV72MONTO = DecimalUtil.ZERO ;
         }
         else
         {
            AV72MONTO = localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOPENDIENTE");
            GX_FocusControl = edtavMontopendiente_Internalname ;
            wbErr = true ;
            AV76montopendiente = DecimalUtil.ZERO ;
         }
         else
         {
            AV76montopendiente = localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)) ;
         }
         AV84AVDSPROBS = httpContext.cgiGet( edtavAvdsprobs_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAPMONT");
            GX_FocusControl = edtavCapmont_Internalname ;
            wbErr = true ;
            AV34CAPMONT = DecimalUtil.ZERO ;
         }
         else
         {
            AV34CAPMONT = localUtil.ctond( httpContext.cgiGet( edtavCapmont_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTPENDIENTE");
            GX_FocusControl = edtavCantpendiente_Internalname ;
            wbErr = true ;
            AV75cantpendiente = DecimalUtil.ZERO ;
         }
         else
         {
            AV75cantpendiente = localUtil.ctond( httpContext.cgiGet( edtavCantpendiente_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)), DecimalUtil.stringToDec("9999999999.999999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAPCANT");
            GX_FocusControl = edtavCapcant_Internalname ;
            wbErr = true ;
            AV83CAPCANT = DecimalUtil.ZERO ;
         }
         else
         {
            AV83CAPCANT = localUtil.ctond( httpContext.cgiGet( edtavCapcant_Internalname)) ;
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFi_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFI");
            GX_FocusControl = edtavFi_Internalname ;
            wbErr = true ;
            AV130FI = GXutil.nullDate() ;
         }
         else
         {
            AV130FI = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFi_Internalname), 0)) ;
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFf_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFF");
            GX_FocusControl = edtavFf_Internalname ;
            wbErr = true ;
            AV131FF = GXutil.nullDate() ;
         }
         else
         {
            AV131FF = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFf_Internalname), 0)) ;
         }
         AV34CAPMONT = AV102auxCAPMONT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCapmont_Internalname, GXutil.ltrim( GXutil.str( AV34CAPMONT, 15, 2)));
         AV83CAPCANT = AV134auxCAPCANT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCapcant_Internalname, GXutil.ltrim( GXutil.str( AV83CAPCANT, 17, 6)));
         /* End For Each Line */
      }
      if ( nGXsfl_62_fel_idx == 0 )
      {
         nGXsfl_62_idx = (short)(1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      nGXsfl_62_fel_idx = (short)(1) ;
   }

   public void S229( )
   {
      /* 'CONSULTAR CONCEPTO AGRUPADOR' Routine */
      AV109agrupadorEncontrado = false ;
      AV110caCNDSPRSUBCONDSC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
      if ( AV108CNDSPRSUBCONPERTN5 > 0 )
      {
         AV171GXLvl552 = (byte)(0) ;
         /* Using cursor H049G12 */
         pr_default.execute(10, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV103CNDSPRSUBCONBASE), new Long(AV105CNDSPRSUBCONPERT), new Long(AV106CNDSPRSUBCONPERTN2), new Long(AV107CNDSPRSUBCONPERTN3), new Long(AV104CNDSPRSUBCONPERTN4)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A18152CNDSPRSUBCONPERTN5 = H049G12_A18152CNDSPRSUBCONPERTN5[0] ;
            n18152CNDSPRSUBCONPERTN5 = H049G12_n18152CNDSPRSUBCONPERTN5[0] ;
            A18151CNDSPRSUBCONPERTN4 = H049G12_A18151CNDSPRSUBCONPERTN4[0] ;
            n18151CNDSPRSUBCONPERTN4 = H049G12_n18151CNDSPRSUBCONPERTN4[0] ;
            A18150CNDSPRSUBCONPERTN3 = H049G12_A18150CNDSPRSUBCONPERTN3[0] ;
            n18150CNDSPRSUBCONPERTN3 = H049G12_n18150CNDSPRSUBCONPERTN3[0] ;
            A18149CNDSPRSUBCONPERTN2 = H049G12_A18149CNDSPRSUBCONPERTN2[0] ;
            n18149CNDSPRSUBCONPERTN2 = H049G12_n18149CNDSPRSUBCONPERTN2[0] ;
            A18148CNDSPRSUBCONPERT = H049G12_A18148CNDSPRSUBCONPERT[0] ;
            n18148CNDSPRSUBCONPERT = H049G12_n18148CNDSPRSUBCONPERT[0] ;
            A18147CNDSPRSUBCONBASE = H049G12_A18147CNDSPRSUBCONBASE[0] ;
            n18147CNDSPRSUBCONBASE = H049G12_n18147CNDSPRSUBCONBASE[0] ;
            A18159CNDSPRSUBCONTIP = H049G12_A18159CNDSPRSUBCONTIP[0] ;
            n18159CNDSPRSUBCONTIP = H049G12_n18159CNDSPRSUBCONTIP[0] ;
            A7520CNDSPRNDC = H049G12_A7520CNDSPRNDC[0] ;
            A7519CNDSPRTDC = H049G12_A7519CNDSPRTDC[0] ;
            A7518CNDSPRCIA = H049G12_A7518CNDSPRCIA[0] ;
            A18154CNDSPRSUBCONDSC = H049G12_A18154CNDSPRSUBCONDSC[0] ;
            n18154CNDSPRSUBCONDSC = H049G12_n18154CNDSPRSUBCONDSC[0] ;
            A18146CNDSPRSUBCONID = H049G12_A18146CNDSPRSUBCONID[0] ;
            AV171GXLvl552 = (byte)(1) ;
            AV110caCNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
            AV109agrupadorEncontrado = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( AV171GXLvl552 == 0 )
         {
            AV109agrupadorEncontrado = false ;
         }
      }
      if ( ! AV109agrupadorEncontrado && ( AV104CNDSPRSUBCONPERTN4 > 0 ) )
      {
         AV172GXLvl573 = (byte)(0) ;
         /* Using cursor H049G13 */
         pr_default.execute(11, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV103CNDSPRSUBCONBASE), new Long(AV105CNDSPRSUBCONPERT), new Long(AV106CNDSPRSUBCONPERTN2), new Long(AV107CNDSPRSUBCONPERTN3)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A18152CNDSPRSUBCONPERTN5 = H049G13_A18152CNDSPRSUBCONPERTN5[0] ;
            n18152CNDSPRSUBCONPERTN5 = H049G13_n18152CNDSPRSUBCONPERTN5[0] ;
            A18151CNDSPRSUBCONPERTN4 = H049G13_A18151CNDSPRSUBCONPERTN4[0] ;
            n18151CNDSPRSUBCONPERTN4 = H049G13_n18151CNDSPRSUBCONPERTN4[0] ;
            A18150CNDSPRSUBCONPERTN3 = H049G13_A18150CNDSPRSUBCONPERTN3[0] ;
            n18150CNDSPRSUBCONPERTN3 = H049G13_n18150CNDSPRSUBCONPERTN3[0] ;
            A18149CNDSPRSUBCONPERTN2 = H049G13_A18149CNDSPRSUBCONPERTN2[0] ;
            n18149CNDSPRSUBCONPERTN2 = H049G13_n18149CNDSPRSUBCONPERTN2[0] ;
            A18148CNDSPRSUBCONPERT = H049G13_A18148CNDSPRSUBCONPERT[0] ;
            n18148CNDSPRSUBCONPERT = H049G13_n18148CNDSPRSUBCONPERT[0] ;
            A18147CNDSPRSUBCONBASE = H049G13_A18147CNDSPRSUBCONBASE[0] ;
            n18147CNDSPRSUBCONBASE = H049G13_n18147CNDSPRSUBCONBASE[0] ;
            A18159CNDSPRSUBCONTIP = H049G13_A18159CNDSPRSUBCONTIP[0] ;
            n18159CNDSPRSUBCONTIP = H049G13_n18159CNDSPRSUBCONTIP[0] ;
            A7520CNDSPRNDC = H049G13_A7520CNDSPRNDC[0] ;
            A7519CNDSPRTDC = H049G13_A7519CNDSPRTDC[0] ;
            A7518CNDSPRCIA = H049G13_A7518CNDSPRCIA[0] ;
            A18154CNDSPRSUBCONDSC = H049G13_A18154CNDSPRSUBCONDSC[0] ;
            n18154CNDSPRSUBCONDSC = H049G13_n18154CNDSPRSUBCONDSC[0] ;
            A18146CNDSPRSUBCONID = H049G13_A18146CNDSPRSUBCONID[0] ;
            AV172GXLvl573 = (byte)(1) ;
            AV110caCNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
            AV109agrupadorEncontrado = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( AV172GXLvl573 == 0 )
         {
            AV109agrupadorEncontrado = false ;
         }
      }
      if ( ! AV109agrupadorEncontrado && ( AV107CNDSPRSUBCONPERTN3 > 0 ) )
      {
         AV173GXLvl594 = (byte)(0) ;
         /* Using cursor H049G14 */
         pr_default.execute(12, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV103CNDSPRSUBCONBASE), new Long(AV105CNDSPRSUBCONPERT), new Long(AV106CNDSPRSUBCONPERTN2)});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A18152CNDSPRSUBCONPERTN5 = H049G14_A18152CNDSPRSUBCONPERTN5[0] ;
            n18152CNDSPRSUBCONPERTN5 = H049G14_n18152CNDSPRSUBCONPERTN5[0] ;
            A18151CNDSPRSUBCONPERTN4 = H049G14_A18151CNDSPRSUBCONPERTN4[0] ;
            n18151CNDSPRSUBCONPERTN4 = H049G14_n18151CNDSPRSUBCONPERTN4[0] ;
            A18150CNDSPRSUBCONPERTN3 = H049G14_A18150CNDSPRSUBCONPERTN3[0] ;
            n18150CNDSPRSUBCONPERTN3 = H049G14_n18150CNDSPRSUBCONPERTN3[0] ;
            A18149CNDSPRSUBCONPERTN2 = H049G14_A18149CNDSPRSUBCONPERTN2[0] ;
            n18149CNDSPRSUBCONPERTN2 = H049G14_n18149CNDSPRSUBCONPERTN2[0] ;
            A18148CNDSPRSUBCONPERT = H049G14_A18148CNDSPRSUBCONPERT[0] ;
            n18148CNDSPRSUBCONPERT = H049G14_n18148CNDSPRSUBCONPERT[0] ;
            A18147CNDSPRSUBCONBASE = H049G14_A18147CNDSPRSUBCONBASE[0] ;
            n18147CNDSPRSUBCONBASE = H049G14_n18147CNDSPRSUBCONBASE[0] ;
            A18159CNDSPRSUBCONTIP = H049G14_A18159CNDSPRSUBCONTIP[0] ;
            n18159CNDSPRSUBCONTIP = H049G14_n18159CNDSPRSUBCONTIP[0] ;
            A7520CNDSPRNDC = H049G14_A7520CNDSPRNDC[0] ;
            A7519CNDSPRTDC = H049G14_A7519CNDSPRTDC[0] ;
            A7518CNDSPRCIA = H049G14_A7518CNDSPRCIA[0] ;
            A18154CNDSPRSUBCONDSC = H049G14_A18154CNDSPRSUBCONDSC[0] ;
            n18154CNDSPRSUBCONDSC = H049G14_n18154CNDSPRSUBCONDSC[0] ;
            A18146CNDSPRSUBCONID = H049G14_A18146CNDSPRSUBCONID[0] ;
            AV173GXLvl594 = (byte)(1) ;
            AV110caCNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
            AV109agrupadorEncontrado = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         if ( AV173GXLvl594 == 0 )
         {
            AV109agrupadorEncontrado = false ;
         }
      }
      if ( ! AV109agrupadorEncontrado && ( AV106CNDSPRSUBCONPERTN2 > 0 ) )
      {
         AV174GXLvl615 = (byte)(0) ;
         /* Using cursor H049G15 */
         pr_default.execute(13, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV103CNDSPRSUBCONBASE), new Long(AV105CNDSPRSUBCONPERT)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A18152CNDSPRSUBCONPERTN5 = H049G15_A18152CNDSPRSUBCONPERTN5[0] ;
            n18152CNDSPRSUBCONPERTN5 = H049G15_n18152CNDSPRSUBCONPERTN5[0] ;
            A18151CNDSPRSUBCONPERTN4 = H049G15_A18151CNDSPRSUBCONPERTN4[0] ;
            n18151CNDSPRSUBCONPERTN4 = H049G15_n18151CNDSPRSUBCONPERTN4[0] ;
            A18150CNDSPRSUBCONPERTN3 = H049G15_A18150CNDSPRSUBCONPERTN3[0] ;
            n18150CNDSPRSUBCONPERTN3 = H049G15_n18150CNDSPRSUBCONPERTN3[0] ;
            A18149CNDSPRSUBCONPERTN2 = H049G15_A18149CNDSPRSUBCONPERTN2[0] ;
            n18149CNDSPRSUBCONPERTN2 = H049G15_n18149CNDSPRSUBCONPERTN2[0] ;
            A18148CNDSPRSUBCONPERT = H049G15_A18148CNDSPRSUBCONPERT[0] ;
            n18148CNDSPRSUBCONPERT = H049G15_n18148CNDSPRSUBCONPERT[0] ;
            A18147CNDSPRSUBCONBASE = H049G15_A18147CNDSPRSUBCONBASE[0] ;
            n18147CNDSPRSUBCONBASE = H049G15_n18147CNDSPRSUBCONBASE[0] ;
            A18159CNDSPRSUBCONTIP = H049G15_A18159CNDSPRSUBCONTIP[0] ;
            n18159CNDSPRSUBCONTIP = H049G15_n18159CNDSPRSUBCONTIP[0] ;
            A7520CNDSPRNDC = H049G15_A7520CNDSPRNDC[0] ;
            A7519CNDSPRTDC = H049G15_A7519CNDSPRTDC[0] ;
            A7518CNDSPRCIA = H049G15_A7518CNDSPRCIA[0] ;
            A18154CNDSPRSUBCONDSC = H049G15_A18154CNDSPRSUBCONDSC[0] ;
            n18154CNDSPRSUBCONDSC = H049G15_n18154CNDSPRSUBCONDSC[0] ;
            A18146CNDSPRSUBCONID = H049G15_A18146CNDSPRSUBCONID[0] ;
            AV174GXLvl615 = (byte)(1) ;
            AV110caCNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
            AV109agrupadorEncontrado = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(13);
         }
         pr_default.close(13);
         if ( AV174GXLvl615 == 0 )
         {
            AV109agrupadorEncontrado = false ;
         }
      }
      if ( ! AV109agrupadorEncontrado && ( AV105CNDSPRSUBCONPERT > 0 ) )
      {
         AV175GXLvl636 = (byte)(0) ;
         /* Using cursor H049G16 */
         pr_default.execute(14, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV103CNDSPRSUBCONBASE)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A18152CNDSPRSUBCONPERTN5 = H049G16_A18152CNDSPRSUBCONPERTN5[0] ;
            n18152CNDSPRSUBCONPERTN5 = H049G16_n18152CNDSPRSUBCONPERTN5[0] ;
            A18151CNDSPRSUBCONPERTN4 = H049G16_A18151CNDSPRSUBCONPERTN4[0] ;
            n18151CNDSPRSUBCONPERTN4 = H049G16_n18151CNDSPRSUBCONPERTN4[0] ;
            A18150CNDSPRSUBCONPERTN3 = H049G16_A18150CNDSPRSUBCONPERTN3[0] ;
            n18150CNDSPRSUBCONPERTN3 = H049G16_n18150CNDSPRSUBCONPERTN3[0] ;
            A18149CNDSPRSUBCONPERTN2 = H049G16_A18149CNDSPRSUBCONPERTN2[0] ;
            n18149CNDSPRSUBCONPERTN2 = H049G16_n18149CNDSPRSUBCONPERTN2[0] ;
            A18148CNDSPRSUBCONPERT = H049G16_A18148CNDSPRSUBCONPERT[0] ;
            n18148CNDSPRSUBCONPERT = H049G16_n18148CNDSPRSUBCONPERT[0] ;
            A18147CNDSPRSUBCONBASE = H049G16_A18147CNDSPRSUBCONBASE[0] ;
            n18147CNDSPRSUBCONBASE = H049G16_n18147CNDSPRSUBCONBASE[0] ;
            A18159CNDSPRSUBCONTIP = H049G16_A18159CNDSPRSUBCONTIP[0] ;
            n18159CNDSPRSUBCONTIP = H049G16_n18159CNDSPRSUBCONTIP[0] ;
            A7520CNDSPRNDC = H049G16_A7520CNDSPRNDC[0] ;
            A7519CNDSPRTDC = H049G16_A7519CNDSPRTDC[0] ;
            A7518CNDSPRCIA = H049G16_A7518CNDSPRCIA[0] ;
            A18154CNDSPRSUBCONDSC = H049G16_A18154CNDSPRSUBCONDSC[0] ;
            n18154CNDSPRSUBCONDSC = H049G16_n18154CNDSPRSUBCONDSC[0] ;
            A18146CNDSPRSUBCONID = H049G16_A18146CNDSPRSUBCONID[0] ;
            AV175GXLvl636 = (byte)(1) ;
            AV110caCNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
            AV109agrupadorEncontrado = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(14);
         }
         pr_default.close(14);
         if ( AV175GXLvl636 == 0 )
         {
            AV109agrupadorEncontrado = false ;
         }
      }
   }

   public void e1349G2( )
   {
      /* GlobalEvents_Continua Routine */
      AV6session.setValue("CNDSPRCIA", GXutil.str( AV8CNDSPRCIA, 10, 0));
      AV6session.setValue("CNDSPRNDC", GXutil.str( AV9CNDSPRNDC, 10, 0));
      AV6session.setValue("CNDSPRTDC", AV10CNDSPRTDC);
      httpContext.ajax_rsp_assign_attri("", false, "AV10CNDSPRTDC", AV10CNDSPRTDC);
      AV6session.setValue("MENREGAVA", "Registro de avance generado: "+AV80dGenerados);
      lblTxtscript_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.wpregavacs") +"\",\"_self\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Caption", lblTxtscript_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e1449G2( )
   {
      /* 'ExportarExcel' Routine */
      AV141nombreArchivo = "RegistroDeAvance.xlsx" ;
      GXt_char1 = AV140rutaArchivo ;
      GXv_char16[0] = GXt_char1 ;
      new com.kdsproyectos.recuperarutaarch(remoteHandle, context).execute( GXv_char16) ;
      wpregavacs_impl.this.GXt_char1 = GXv_char16[0] ;
      AV140rutaArchivo = GXt_char1 ;
      AV142Path = GXutil.trim( AV140rutaArchivo) + "\\reportesExcel\\" ;
      AV143Ruta = GXutil.trim( AV142Path) + GXutil.trim( AV141nombreArchivo) ;
      AV144ExcelDocument.setTemplate( GXutil.trim( AV140rutaArchivo)+"\\excel\\PlantillaRegistroDeAvance.xlsx" );
      AV144ExcelDocument.Open(AV143Ruta);
      AV144ExcelDocument.Cells(8, 2, 1, 1).setNumber( AV9CNDSPRNDC );
      AV144ExcelDocument.Cells(9, 2, 1, 1).setText( GXutil.trim( AV12PMCTPRDSC) );
      AV144ExcelDocument.Cells(10, 2, 1, 1).setText( GXutil.trim( AV15CNCDIRNOM_G) );
      AV149CNDSPRALCTR = "" ;
      /* Using cursor H049G17 */
      pr_default.execute(15, new Object[] {new Long(AV8CNDSPRCIA), AV10CNDSPRTDC, new Long(AV9CNDSPRNDC)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A7520CNDSPRNDC = H049G17_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H049G17_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H049G17_A7518CNDSPRCIA[0] ;
         A7550CNDSPRTRALC = H049G17_A7550CNDSPRTRALC[0] ;
         n7550CNDSPRTRALC = H049G17_n7550CNDSPRTRALC[0] ;
         AV149CNDSPRALCTR = A7550CNDSPRTRALC ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
      AV144ExcelDocument.Cells(11, 2, 1, 1).setText( GXutil.trim( AV149CNDSPRALCTR) );
      AV144ExcelDocument.Cells(8, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV31CNDSPRTRIMP)) );
      AV144ExcelDocument.Cells(9, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV133MONTOACUMULADO)) );
      AV144ExcelDocument.Cells(10, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72MONTO)) );
      AV144ExcelDocument.Cells(11, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76montopendiente)) );
      AV145renglon = 14 ;
      AV179GXV11 = 1 ;
      while ( AV179GXV11 <= AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().size() )
      {
         AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().elementAt(-1+AV179GXV11));
         AV144ExcelDocument.Cells((int)(AV145renglon), 1, 1, 1).setText( GXutil.trim( AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcla()) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 2, 1, 1).setText( GXutil.trim( AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cacndsprsubcondsc()) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 3, 1, 1).setText( GXutil.trim( AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcondsc()) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 4, 1, 1).setText( GXutil.trim( AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconunimed()) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcan())) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconpreuni())) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontot())) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdspr3can())) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon())) );
         AV146AAVDSPRMON_ASI = DecimalUtil.ZERO ;
         AV147AAVDSPR3CAN_ASI = DecimalUtil.ZERO ;
         /* Optimized group. */
         /* Using cursor H049G18 */
         pr_default.execute(16, new Object[] {AV10CNDSPRTDC, new Long(AV9CNDSPRNDC), new Long(AV8CNDSPRCIA), AV46CNDSPRTRLIN, new Long(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconid())});
         c8240AVDSPRMON = H049G18_A8240AVDSPRMON[0] ;
         c18201AVDSPR3CAN = H049G18_A18201AVDSPR3CAN[0] ;
         n18201AVDSPR3CAN = H049G18_n18201AVDSPR3CAN[0] ;
         pr_default.close(16);
         AV146AAVDSPRMON_ASI = AV146AAVDSPRMON_ASI.add(c8240AVDSPRMON) ;
         AV147AAVDSPR3CAN_ASI = AV147AAVDSPR3CAN_ASI.add(c18201AVDSPR3CAN) ;
         /* End optimized group. */
         AV144ExcelDocument.Cells((int)(AV145renglon), 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV147AAVDSPR3CAN_ASI)) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV146AAVDSPRMON_ASI)) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcan().subtract(AV147AAVDSPR3CAN_ASI))) );
         AV144ExcelDocument.Cells((int)(AV145renglon), 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontot().subtract(AV146AAVDSPRMON_ASI))) );
         AV145renglon = (long)(AV145renglon+1) ;
         AV179GXV11 = (int)(AV179GXV11+1) ;
      }
      AV144ExcelDocument.Save();
      AV144ExcelDocument.Show();
      AV144ExcelDocument.Close();
      AV148AbrirRutaArchivo = "../reportesExcel/" + GXutil.trim( AV141nombreArchivo) ;
      lblTxtscript_Caption = "<script>window.open(\""+GXutil.trim( AV148AbrirRutaArchivo)+"\",\"Pagina Nueva\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Caption", lblTxtscript_Caption, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SubConItem", AV99SubConItem);
   }

   private void e1749G10( )
   {
      /* Grid2_Load Routine */
      AV160GXV2 = 1 ;
      while ( AV160GXV2 <= AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().size() )
      {
         AV99SubConItem = (com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)((com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem)AV97SDTRegAvaSCItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_Subcon().elementAt(-1+AV160GXV2));
         AV52gCNDSPRSUBCONID = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconid() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV52gCNDSPRSUBCONID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONID"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")));
         AV54gCNDSPRSUBCONCLA = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcla() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcla_Internalname, AV54gCNDSPRSUBCONCLA);
         AV51gCNDSPRSUBCONDSC = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcondsc() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcondsc_Internalname, AV51gCNDSPRSUBCONDSC);
         AV55gCNDSPRSUBCONPREUNI = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconpreuni() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV55gCNDSPRSUBCONPREUNI, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPREUNI"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         AV56gCNDSPRSUBCONUNIMED = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconunimed() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconunimed_Internalname, AV56gCNDSPRSUBCONUNIMED);
         AV57gCNDSPRSUBCONCAN = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconcan() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV57gCNDSPRSUBCONCAN, 15, 2)));
         AV58gCNDSPRSUBCONTOT = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontot() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontot_Internalname, GXutil.ltrim( GXutil.str( AV58gCNDSPRSUBCONTOT, 15, 2)));
         AV59gCNDSPRSUBCONTIP = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubcontip() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontip_Internalname, AV59gCNDSPRSUBCONTIP);
         AV60gCNDSPRSUBCONFECINI = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconfecini() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconfecini_Internalname, localUtil.format(AV60gCNDSPRSUBCONFECINI, "99/99/99"));
         AV61gCNDSPRSUBCONFECFIN = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconfecfin() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconfecfin_Internalname, localUtil.format(AV61gCNDSPRSUBCONFECFIN, "99/99/99"));
         AV62gCNDSPRSUBCONRES = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cndsprsubconres() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconres_Internalname, AV62gCNDSPRSUBCONRES);
         AV39AVDSPRMON = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdsprmon() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAvdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV39AVDSPRMON, 17, 2)));
         AV63AVDSPR3CAN = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Avdspr3can() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAvdspr3can_Internalname, GXutil.ltrim( GXutil.str( AV63AVDSPR3CAN, 15, 2)));
         edtavAvdspr3can_Enabled = 1 ;
         AV37CNDSPRTRLIN_S = AV46CNDSPRTRLIN ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrlin_s_Internalname, GXutil.ltrim( GXutil.str( AV37CNDSPRTRLIN_S, 7, 3)));
         /* Execute user subroutine: 'CONSULTARMONTOASIGNADO' */
         S1310 ();
         if (returnInSub) return;
         AV117gscaAVDSPRMON = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdsprmon_Internalname, AV117gscaAVDSPRMON);
         edtavGscaavdsprmon_Class = " detalle" ;
         AV120AbrirDetalle = "onclick='" ;
         AV120AbrirDetalle = AV120AbrirDetalle + "$(\"#vDETCNDSPRTRLIN\").val(\"" + GXutil.trim( GXutil.str( AV37CNDSPRTRLIN_S, 7, 3)) + "\");" ;
         AV120AbrirDetalle = AV120AbrirDetalle + "$(\"#vDETCNDSPRSUBCONID\").val(\"" + GXutil.trim( GXutil.str( AV52gCNDSPRSUBCONID, 10, 0)) + "\");" ;
         AV120AbrirDetalle = AV120AbrirDetalle + "$(\"#vDETAVDSPRMON\").val(\"" + GXutil.trim( GXutil.str( AV38AVDSPRMON_ASI, 17, 2)) + "\");" ;
         AV120AbrirDetalle = AV120AbrirDetalle + "$(\"#TXTABRIRDET\").click();" ;
         AV120AbrirDetalle = AV120AbrirDetalle + "'" ;
         AV117gscaAVDSPRMON = "<div " + GXutil.trim( AV120AbrirDetalle) + ">" + localUtil.format( AV38AVDSPRMON_ASI, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99") + " </div> " ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdsprmon_Internalname, AV117gscaAVDSPRMON);
         AV126gscaAVDSPR3CAN = "" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdspr3can_Internalname, AV126gscaAVDSPR3CAN);
         edtavGscaavdspr3can_Class = " detalle" ;
         AV126gscaAVDSPR3CAN = "<div " + GXutil.trim( AV120AbrirDetalle) + ">" + localUtil.format( AV127AVDSPR3CAN_ASI, "ZZZ,ZZZ,ZZZ,ZZ9.99") + " </div> " ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscaavdspr3can_Internalname, AV126gscaAVDSPR3CAN);
         AV128gscpAVDSPR3CAN = AV57gCNDSPRSUBCONCAN.subtract(AV127AVDSPR3CAN_ASI) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscpavdspr3can_Internalname, GXutil.ltrim( GXutil.str( AV128gscpAVDSPR3CAN, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGSCPAVDSPR3CAN"+"_"+sGXsfl_203_idx, getSecureSignedToken( sGXsfl_203_idx, localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         AV129gscpAVDSPRMON = AV58gCNDSPRSUBCONTOT.subtract(AV38AVDSPRMON_ASI) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGscpavdsprmon_Internalname, GXutil.ltrim( GXutil.str( AV129gscpAVDSPRMON, 17, 2)));
         AV110caCNDSPRSUBCONDSC = AV99SubConItem.getgxTv_SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem_Cacndsprsubcondsc() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCacndsprsubcondsc_Internalname, AV110caCNDSPRSUBCONDSC);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(203) ;
         }
         sendrow_20310( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_203_Refreshing )
         {
            httpContext.doAjaxLoad(203, Grid2Row);
         }
         AV160GXV2 = (int)(AV160GXV2+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SubConItem", AV99SubConItem);
   }

   public void wb_table1_2_49G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1300, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblKdstablacontenido_Internalname, tblKdstablacontenido_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtguardar_Internalname, lblTxtguardar_Caption, "", "", lblTxtguardar_Jsonclick, "'"+""+"'"+",false,"+"'"+"ETXTGUARDAR.CLICK."+"'", "", "TextBlock", 5, "Guardar", 1, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtexportar_Internalname, lblTxtexportar_Caption, "", "", lblTxtexportar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'EXPORTAREXCEL\\'."+"'", "", "TextBlock", 5, "Exportar a Excel", 1, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtsalir_Internalname, lblTxtsalir_Caption, "", "", lblTxtsalir_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1949g1_client"+"'", "", "", 7, "Salir", 1, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_12_49G2( true) ;
      }
      else
      {
         wb_table2_12_49G2( false) ;
      }
      return  ;
   }

   public void wb_table2_12_49G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 1330, "px", 0, "px", "scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"62\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1280, 10, 0)) + "px" + ";" ;
            com.kdsproyectos.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "none", "", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Header", subGrid1_Header);
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 1280, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock21_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23CNDSPRTRNDC, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrndc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock22_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24CNDSPRTRLINR, (byte)(7), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrlinr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock31_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV25CNDSPRTRFIT_C));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrfit_c_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock30_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV26CNDSPRTRFFT_C));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrfft_c_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock5_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV27CNDSPRTRALC);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtralc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28CNDSPRTRPUN, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrpun_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV29CNDSPRTRCANT, (byte)(20), (byte)(4), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrcant_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV30CNDSPRTRUM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrum_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock24_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31CNDSPRTRIMP, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrimp_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV32CNDSPRTRMON));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrmon_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock25_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV133MONTOACUMULADO, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMontoacumulado_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock26_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV72MONTO, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMonto_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock19_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76montopendiente, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMontopendiente_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock23_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV84AVDSPROBS));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxtcantidad6_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34CAPMONT, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCapmont_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75cantpendiente, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantpendiente_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxtcantidad4_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV83CAPCANT, (byte)(17), (byte)(6), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCapcant_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock1_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV130FI, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock2_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV131FF, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTextblock33_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (short)(nGXsfl_62_idx-1) ;
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtscript_Internalname, lblTxtscript_Caption, "", "", lblTxtscript_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblTxtscript_Visible, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtestilos_Internalname, lblTxtestilos_Caption, "", "", lblTxtestilos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblTxtestilos_Visible, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucMsj.setProperty("Title", Msj_Title);
         ucMsj.render(context, "gxui.message", Msj_Internalname, "MSJContainer");
         /* User Defined Control */
         ucJsmsgbox1.setProperty("Width", Jsmsgbox1_Width);
         ucJsmsgbox1.setProperty("Height", Jsmsgbox1_Height);
         ucJsmsgbox1.setProperty("Botones", Jsmsgbox1_Botones);
         ucJsmsgbox1.setProperty("Texto_Boton_OK", Jsmsgbox1_Texto_boton_ok);
         ucJsmsgbox1.render(context, "jsmsgbox", Jsmsgbox1_Internalname, "JSMSGBOX1Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_49G2e( true) ;
      }
      else
      {
         wb_table1_2_49G2e( false) ;
      }
   }

   public void wb_table2_12_49G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "KDSCard", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right")+"\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCntdocdsc_Internalname, GXutil.rtrim( AV11cntdocdsc), GXutil.rtrim( localUtil.format( AV11cntdocdsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCntdocdsc_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;", "", "", "", 1, edtavCntdocdsc_Enabled, 0, "text", "", 160, "px", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCndsprndc_Internalname, GXutil.ltrim( localUtil.ntoc( AV9CNDSPRNDC, (byte)(10), (byte)(0), ".", "")), ((edtavCndsprndc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9CNDSPRNDC), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9CNDSPRNDC), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCndsprndc_Jsonclick, 0, "Attribute", "color:#000000;", "", "", "", 1, edtavCndsprndc_Enabled, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "Proyecto", "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavPmctprdsc_Internalname, GXutil.rtrim( AV12PMCTPRDSC), GXutil.rtrim( localUtil.format( AV12PMCTPRDSC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmctprdsc_Jsonclick, 0, "Attribute", "color:#000000;", "", "", "", 1, edtavPmctprdsc_Enabled, 0, "text", "", 266, "px", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "Usuario responsable", "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "color:#000000;" ;
         ClassString = "Attribute" ;
         StyleString = "color:#000000;" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavCndsprrescon_Internalname, GXutil.rtrim( AV22CNDSPRRESCON), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,26);\"", (short)(0), 1, edtavCndsprrescon_Enabled, 0, 200, "px", 3, "row", StyleString, ClassString, "", "", "200", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "Proveedor", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavCncdirnom_g_Internalname, GXutil.rtrim( AV15CNCDIRNOM_G), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,35);\"", (short)(0), 1, edtavCncdirnom_g_Enabled, 0, 230, "px", 4, "row", StyleString, ClassString, "", "", "250", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "Responsable contrato", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavCncdirnom_Internalname, GXutil.rtrim( AV16CNCDIRNOM), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,39);\"", (short)(0), 1, edtavCncdirnom_Enabled, 0, 260, "px", 4, "row", StyleString, ClassString, "", "", "250", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCndsprcon_Internalname, GXutil.ltrim( localUtil.ntoc( AV53CNDSPRCON, (byte)(10), (byte)(0), ".", "")), ((edtavCndsprcon_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53CNDSPRCON), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV53CNDSPRCON), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCndsprcon_Jsonclick, 0, "Attribute", "", "", "", "", edtavCndsprcon_Visible, edtavCndsprcon_Enabled, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtabrirdet_Internalname, "TXTABRIRDET", "", "", lblTxtabrirdet_Jsonclick, "'"+""+"'"+",false,"+"'"+"e2049g1_client"+"'", "", "TextBlock", 7, "", lblTxtabrirdet_Visible, 1, (short)(1), "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavDetcndsprsubconid_Internalname, GXutil.ltrim( localUtil.ntoc( AV123DETCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV123DETCNDSPRSUBCONID), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDetcndsprsubconid_Jsonclick, 0, "Attribute", "", "", "", "", edtavDetcndsprsubconid_Visible, 1, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavDetcndsprtrlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV122DETCNDSPRTRLIN, (byte)(7), (byte)(3), ".", "")), GXutil.ltrim( localUtil.format( AV122DETCNDSPRTRLIN, "ZZ9.999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDetcndsprtrlin_Jsonclick, 0, "Attribute", "", "", "", "", edtavDetcndsprtrlin_Visible, 1, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavDetavdsprmon_Internalname, GXutil.ltrim( localUtil.ntoc( AV124DETAVDSPRMON, (byte)(21), (byte)(2), ".", "")), GXutil.ltrim( localUtil.format( AV124DETAVDSPRMON, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDetavdsprmon_Jsonclick, 0, "Attribute", "", "", "", "", edtavDetavdsprmon_Visible, 1, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpRegAvaCS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_12_49G2e( true) ;
      }
      else
      {
         wb_table2_12_49G2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa49G2( ) ;
      ws49G2( ) ;
      we49G2( ) ;
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
      httpContext.AddStyleSheetFile("JsMsgBox/css/estilo.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025571130554", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 129648), false, true);
         httpContext.AddJavascriptSource("wpregavacs.js", "?2025571130554", false, true);
         httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
         httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
         httpContext.AddJavascriptSource("JsMsgBox/JsMsgBoxRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_20310( )
   {
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA_"+sGXsfl_203_idx ;
      edtavCacndsprsubcondsc_Internalname = "vCACNDSPRSUBCONDSC_"+sGXsfl_203_idx ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC_"+sGXsfl_203_idx ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED_"+sGXsfl_203_idx ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN_"+sGXsfl_203_idx ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI_"+sGXsfl_203_idx ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT_"+sGXsfl_203_idx ;
      edtavAvdspr3can_Internalname = "vAVDSPR3CAN_"+sGXsfl_203_idx ;
      edtavAvdsprmon_Internalname = "vAVDSPRMON_"+sGXsfl_203_idx ;
      edtavGscaavdspr3can_Internalname = "vGSCAAVDSPR3CAN_"+sGXsfl_203_idx ;
      edtavGscaavdsprmon_Internalname = "vGSCAAVDSPRMON_"+sGXsfl_203_idx ;
      edtavGscpavdspr3can_Internalname = "vGSCPAVDSPR3CAN_"+sGXsfl_203_idx ;
      edtavGscpavdsprmon_Internalname = "vGSCPAVDSPRMON_"+sGXsfl_203_idx ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP_"+sGXsfl_203_idx ;
      edtavGcndsprsubconfecini_Internalname = "vGCNDSPRSUBCONFECINI_"+sGXsfl_203_idx ;
      edtavGcndsprsubconfecfin_Internalname = "vGCNDSPRSUBCONFECFIN_"+sGXsfl_203_idx ;
      edtavGcndsprsubconres_Internalname = "vGCNDSPRSUBCONRES_"+sGXsfl_203_idx ;
      edtavCndsprtrlin_s_Internalname = "vCNDSPRTRLIN_S_"+sGXsfl_203_idx ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID_"+sGXsfl_203_idx ;
   }

   public void subsflControlProps_fel_20310( )
   {
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA_"+sGXsfl_203_fel_idx ;
      edtavCacndsprsubcondsc_Internalname = "vCACNDSPRSUBCONDSC_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT_"+sGXsfl_203_fel_idx ;
      edtavAvdspr3can_Internalname = "vAVDSPR3CAN_"+sGXsfl_203_fel_idx ;
      edtavAvdsprmon_Internalname = "vAVDSPRMON_"+sGXsfl_203_fel_idx ;
      edtavGscaavdspr3can_Internalname = "vGSCAAVDSPR3CAN_"+sGXsfl_203_fel_idx ;
      edtavGscaavdsprmon_Internalname = "vGSCAAVDSPRMON_"+sGXsfl_203_fel_idx ;
      edtavGscpavdspr3can_Internalname = "vGSCPAVDSPR3CAN_"+sGXsfl_203_fel_idx ;
      edtavGscpavdsprmon_Internalname = "vGSCPAVDSPRMON_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconfecini_Internalname = "vGCNDSPRSUBCONFECINI_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconfecfin_Internalname = "vGCNDSPRSUBCONFECFIN_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconres_Internalname = "vGCNDSPRSUBCONRES_"+sGXsfl_203_fel_idx ;
      edtavCndsprtrlin_s_Internalname = "vCNDSPRTRLIN_S_"+sGXsfl_203_fel_idx ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID_"+sGXsfl_203_fel_idx ;
   }

   public void sendrow_20310( )
   {
      subsflControlProps_20310( ) ;
      wb49G0( ) ;
      Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_203_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
      }
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+subGrid2_Linesclass+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_203_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconcla_Internalname,GXutil.rtrim( AV54gCNDSPRSUBCONCLA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconcla_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconcla_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(500),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCacndsprsubcondsc_Internalname,GXutil.rtrim( AV110caCNDSPRSUBCONDSC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCacndsprsubcondsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavCacndsprsubcondsc_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcondsc_Internalname,GXutil.rtrim( AV51gCNDSPRSUBCONDSC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcondsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubcondsc_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconunimed_Internalname,GXutil.rtrim( AV56gCNDSPRSUBCONUNIMED),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconunimed_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconunimed_Enabled),new Integer(0),"text","",new Integer(50),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconcan_Internalname,GXutil.ltrim( localUtil.ntoc( AV57gCNDSPRSUBCONCAN, (byte)(18), (byte)(2), ".", "")),((edtavGcndsprsubconcan_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV57gCNDSPRSUBCONCAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV57gCNDSPRSUBCONCAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconcan_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconcan_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpreuni_Internalname,GXutil.ltrim( localUtil.ntoc( AV55gCNDSPRSUBCONPREUNI, (byte)(18), (byte)(2), ".", "")),((edtavGcndsprsubconpreuni_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV55gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpreuni_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconpreuni_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcontot_Internalname,GXutil.ltrim( localUtil.ntoc( AV58gCNDSPRSUBCONTOT, (byte)(18), (byte)(2), ".", "")),((edtavGcndsprsubcontot_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV58gCNDSPRSUBCONTOT, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV58gCNDSPRSUBCONTOT, "ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcontot_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubcontot_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAvdspr3can_Enabled!=0)&&(edtavAvdspr3can_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 211,'',false,'"+sGXsfl_203_idx+"',203)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAvdspr3can_Internalname,GXutil.ltrim( localUtil.ntoc( AV63AVDSPR3CAN, (byte)(18), (byte)(2), ".", "")),GXutil.ltrim( localUtil.format( AV63AVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavAvdspr3can_Enabled!=0)&&(edtavAvdspr3can_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,211);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAvdspr3can_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAvdspr3can_Enabled),new Integer(1),"text","",new Integer(90),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAvdsprmon_Internalname,GXutil.ltrim( localUtil.ntoc( AV39AVDSPRMON, (byte)(21), (byte)(2), ".", "")),((edtavAvdsprmon_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV39AVDSPRMON, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV39AVDSPRMON, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAvdsprmon_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavAvdsprmon_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(21),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = edtavGscaavdspr3can_Class ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGscaavdspr3can_Internalname,AV126gscaAVDSPR3CAN,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGscaavdspr3can_Jsonclick,new Integer(0),edtavGscaavdspr3can_Class,"",ROClassString,"","",new Integer(-1),new Integer(edtavGscaavdspr3can_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(1000),new Integer(0),new Integer(1),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","right",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = edtavGscaavdsprmon_Class ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGscaavdsprmon_Internalname,AV117gscaAVDSPRMON,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGscaavdsprmon_Jsonclick,new Integer(0),edtavGscaavdsprmon_Class,"",ROClassString,"","",new Integer(-1),new Integer(edtavGscaavdsprmon_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(1000),new Integer(0),new Integer(1),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGscpavdspr3can_Internalname,GXutil.ltrim( localUtil.ntoc( AV128gscpAVDSPR3CAN, (byte)(18), (byte)(2), ".", "")),((edtavGscpavdspr3can_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV128gscpAVDSPR3CAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGscpavdspr3can_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGscpavdspr3can_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGscpavdsprmon_Internalname,GXutil.ltrim( localUtil.ntoc( AV129gscpAVDSPRMON, (byte)(21), (byte)(2), ".", "")),((edtavGscpavdsprmon_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV129gscpAVDSPRMON, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV129gscpAVDSPRMON, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGscpavdsprmon_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavGscpavdsprmon_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(21),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcontip_Internalname,GXutil.rtrim( AV59gCNDSPRSUBCONTIP),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcontip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubcontip_Enabled),new Integer(0),"text","",new Integer(70),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconfecini_Internalname,localUtil.format(AV60gCNDSPRSUBCONFECINI, "99/99/99"),localUtil.format( AV60gCNDSPRSUBCONFECINI, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconfecini_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconfecini_Enabled),new Integer(0),"text","",new Integer(78),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconfecfin_Internalname,localUtil.format(AV61gCNDSPRSUBCONFECFIN, "99/99/99"),localUtil.format( AV61gCNDSPRSUBCONFECFIN, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconfecfin_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconfecfin_Enabled),new Integer(0),"text","",new Integer(69),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconres_Internalname,GXutil.rtrim( AV62gCNDSPRSUBCONRES),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconres_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconres_Enabled),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(false),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrlin_s_Internalname,GXutil.ltrim( localUtil.ntoc( AV37CNDSPRTRLIN_S, (byte)(7), (byte)(3), ".", "")),((edtavCndsprtrlin_s_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV37CNDSPRTRLIN_S, "ZZ9.999")) : localUtil.format( AV37CNDSPRTRLIN_S, "ZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrlin_s_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavCndsprtrlin_s_Enabled),new Integer(0),"text","",new Integer(66),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconid_Internalname,GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONID), "ZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconid_Enabled),new Integer(0),"number","1",new Integer(98),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(203),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right",new Boolean(false)});
      send_integrity_lvl_hashes49G10( ) ;
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_203_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_203_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_203_idx+1)) ;
      sGXsfl_203_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_203_idx, 4, 0)), (short)(4), "0") + sGXsfl_62_idx ;
      subsflControlProps_20310( ) ;
      /* End function sendrow_20310 */
   }

   public void subsflControlProps_622( )
   {
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_62_idx ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC_"+sGXsfl_62_idx ;
      lblTextblock22_Internalname = "TEXTBLOCK22_"+sGXsfl_62_idx ;
      edtavCndsprtrlinr_Internalname = "vCNDSPRTRLINR_"+sGXsfl_62_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_62_idx ;
      edtavCndsprtrfit_c_Internalname = "vCNDSPRTRFIT_C_"+sGXsfl_62_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_62_idx ;
      edtavCndsprtrfft_c_Internalname = "vCNDSPRTRFFT_C_"+sGXsfl_62_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_62_idx ;
      edtavCndsprtralc_Internalname = "vCNDSPRTRALC_"+sGXsfl_62_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_62_idx ;
      edtavCndsprtrpun_Internalname = "vCNDSPRTRPUN_"+sGXsfl_62_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_62_idx ;
      edtavCndsprtrcant_Internalname = "vCNDSPRTRCANT_"+sGXsfl_62_idx ;
      edtavCndsprtrum_Internalname = "vCNDSPRTRUM_"+sGXsfl_62_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_62_idx ;
      edtavCndsprtrimp_Internalname = "vCNDSPRTRIMP_"+sGXsfl_62_idx ;
      edtavCndsprtrmon_Internalname = "vCNDSPRTRMON_"+sGXsfl_62_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_62_idx ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO_"+sGXsfl_62_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_62_idx ;
      edtavMonto_Internalname = "vMONTO_"+sGXsfl_62_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_62_idx ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE_"+sGXsfl_62_idx ;
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_62_idx ;
      edtavAvdsprobs_Internalname = "vAVDSPROBS_"+sGXsfl_62_idx ;
      lblTxtcantidad6_Internalname = "TXTCANTIDAD6_"+sGXsfl_62_idx ;
      edtavCapmont_Internalname = "vCAPMONT_"+sGXsfl_62_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_62_idx ;
      edtavCantpendiente_Internalname = "vCANTPENDIENTE_"+sGXsfl_62_idx ;
      lblTxtcantidad4_Internalname = "TXTCANTIDAD4_"+sGXsfl_62_idx ;
      edtavCapcant_Internalname = "vCAPCANT_"+sGXsfl_62_idx ;
      lblTextblock1_Internalname = "TEXTBLOCK1_"+sGXsfl_62_idx ;
      edtavFi_Internalname = "vFI_"+sGXsfl_62_idx ;
      lblTextblock2_Internalname = "TEXTBLOCK2_"+sGXsfl_62_idx ;
      edtavFf_Internalname = "vFF_"+sGXsfl_62_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_62_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC_"+sGXsfl_62_fel_idx ;
      lblTextblock22_Internalname = "TEXTBLOCK22_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrlinr_Internalname = "vCNDSPRTRLINR_"+sGXsfl_62_fel_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrfit_c_Internalname = "vCNDSPRTRFIT_C_"+sGXsfl_62_fel_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrfft_c_Internalname = "vCNDSPRTRFFT_C_"+sGXsfl_62_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_62_fel_idx ;
      edtavCndsprtralc_Internalname = "vCNDSPRTRALC_"+sGXsfl_62_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrpun_Internalname = "vCNDSPRTRPUN_"+sGXsfl_62_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrcant_Internalname = "vCNDSPRTRCANT_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrum_Internalname = "vCNDSPRTRUM_"+sGXsfl_62_fel_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrimp_Internalname = "vCNDSPRTRIMP_"+sGXsfl_62_fel_idx ;
      edtavCndsprtrmon_Internalname = "vCNDSPRTRMON_"+sGXsfl_62_fel_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_62_fel_idx ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO_"+sGXsfl_62_fel_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_62_fel_idx ;
      edtavMonto_Internalname = "vMONTO_"+sGXsfl_62_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_62_fel_idx ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE_"+sGXsfl_62_fel_idx ;
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_62_fel_idx ;
      edtavAvdsprobs_Internalname = "vAVDSPROBS_"+sGXsfl_62_fel_idx ;
      lblTxtcantidad6_Internalname = "TXTCANTIDAD6_"+sGXsfl_62_fel_idx ;
      edtavCapmont_Internalname = "vCAPMONT_"+sGXsfl_62_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_62_fel_idx ;
      edtavCantpendiente_Internalname = "vCANTPENDIENTE_"+sGXsfl_62_fel_idx ;
      lblTxtcantidad4_Internalname = "TXTCANTIDAD4_"+sGXsfl_62_fel_idx ;
      edtavCapcant_Internalname = "vCAPCANT_"+sGXsfl_62_fel_idx ;
      lblTextblock1_Internalname = "TEXTBLOCK1_"+sGXsfl_62_fel_idx ;
      edtavFi_Internalname = "vFI_"+sGXsfl_62_fel_idx ;
      lblTextblock2_Internalname = "TEXTBLOCK2_"+sGXsfl_62_fel_idx ;
      edtavFf_Internalname = "vFF_"+sGXsfl_62_fel_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_62_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb49G0( ) ;
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
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_62_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_62_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_62_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_62_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable5_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"KDSCard","","","","","","",new Integer(1),new Integer(2),"",new Integer(1270),"","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable2_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"KDSCard","","","","","","",new Integer(1),new Integer(2),"",new Integer(1250),"","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable12_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"",new Integer(130),"","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock21_Internalname,"No Requisición","","",lblTextblock21_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrndc_Enabled!=0)&&(edtavCndsprtrndc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrndc_Internalname,GXutil.ltrim( localUtil.ntoc( AV23CNDSPRTRNDC, (byte)(10), (byte)(0), ".", "")),((edtavCndsprtrndc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23CNDSPRTRNDC), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV23CNDSPRTRNDC), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrndc_Enabled!=0)&&(edtavCndsprtrndc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrndc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal; color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrndc_Enabled),new Integer(0),"number","1",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock22_Internalname,"Linea requisición","","",lblTextblock22_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrlinr_Enabled!=0)&&(edtavCndsprtrlinr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 83,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrlinr_Internalname,GXutil.ltrim( localUtil.ntoc( AV24CNDSPRTRLINR, (byte)(7), (byte)(0), ".", "")),((edtavCndsprtrlinr_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CNDSPRTRLINR), "ZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV24CNDSPRTRLINR), "ZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrlinr_Enabled!=0)&&(edtavCndsprtrlinr_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,83);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrlinr_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal; color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrlinr_Enabled),new Integer(0),"number","1",new Integer(7),"chr",new Integer(1),"row",new Integer(7),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"",new Integer(500),"","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock31_Internalname,"Fecha Inicial del contrato","","",lblTextblock31_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      sendrow_62230( ) ;
   }

   public void sendrow_62230( )
   {
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrfit_c_Enabled!=0)&&(edtavCndsprtrfit_c_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrfit_c_Internalname,GXutil.rtrim( AV25CNDSPRTRFIT_C),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrfit_c_Enabled!=0)&&(edtavCndsprtrfit_c_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,90);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrfit_c_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrfit_c_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(1),"row",new Integer(8),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock30_Internalname,"Fecha Final del contrato","","",lblTextblock30_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrfft_c_Enabled!=0)&&(edtavCndsprtrfft_c_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrfft_c_Internalname,GXutil.rtrim( AV26CNDSPRTRFFT_C),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrfft_c_Enabled!=0)&&(edtavCndsprtrfft_c_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,95);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrfft_c_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrfft_c_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(1),"row",new Integer(8),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,"Alcance","","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Multiple line edit */
      TempTags = " " + ((edtavCndsprtralc_Enabled!=0)&&(edtavCndsprtralc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "color:#696969;" ;
      ClassString = "Attribute" ;
      StyleString = "color:#696969;" ;
      Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtralc_Internalname,AV27CNDSPRTRALC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtralc_Enabled!=0)&&(edtavCndsprtralc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,100);\"" : " "),new Integer(0),new Integer(1),new Integer(edtavCndsprtralc_Enabled),new Integer(0),new Integer(260),"px",new Integer(2),"row",StyleString,ClassString,"","","2097152",new Integer(1),new Integer(0),"","",new Integer(-1),new Boolean(true),"","'"+""+"'"+",false,"+"'"+""+"'",new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable4_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"",new Integer(100),"","px","%",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,"Precio Unitario","","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrpun_Enabled!=0)&&(edtavCndsprtrpun_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrpun_Internalname,GXutil.ltrim( localUtil.ntoc( AV28CNDSPRTRPUN, (byte)(18), (byte)(2), ".", "")),((edtavCndsprtrpun_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV28CNDSPRTRPUN, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrpun_Enabled!=0)&&(edtavCndsprtrpun_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrpun_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrpun_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,"Cantidad ","","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrcant_Enabled!=0)&&(edtavCndsprtrcant_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV29CNDSPRTRCANT, (byte)(20), (byte)(4), ".", "")),((edtavCndsprtrcant_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV29CNDSPRTRCANT, "ZZZ,ZZZ,ZZZ,ZZ9.9999")) : localUtil.format( AV29CNDSPRTRCANT, "ZZZ,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrcant_Enabled!=0)&&(edtavCndsprtrcant_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrcant_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrcant_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrum_Enabled!=0)&&(edtavCndsprtrum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrum_Internalname,GXutil.rtrim( AV30CNDSPRTRUM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrum_Enabled!=0)&&(edtavCndsprtrum_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrum_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrum_Enabled),new Integer(0),"text","",new Integer(3),"chr",new Integer(1),"row",new Integer(3),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock24_Internalname,"Monto original","","",lblTextblock24_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      sendrow_62260( ) ;
   }

   public void sendrow_62260( )
   {
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrimp_Enabled!=0)&&(edtavCndsprtrimp_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrimp_Internalname,GXutil.ltrim( localUtil.ntoc( AV31CNDSPRTRIMP, (byte)(18), (byte)(2), ".", "")),((edtavCndsprtrimp_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV31CNDSPRTRIMP, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrimp_Enabled!=0)&&(edtavCndsprtrimp_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,118);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrimp_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrimp_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrmon_Enabled!=0)&&(edtavCndsprtrmon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrmon_Internalname,GXutil.rtrim( AV32CNDSPRTRMON),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrmon_Enabled!=0)&&(edtavCndsprtrmon_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,119);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrmon_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCndsprtrmon_Enabled),new Integer(0),"text","",new Integer(3),"chr",new Integer(1),"row",new Integer(3),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock25_Internalname,"Avance Autorizado","","",lblTextblock25_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavMontoacumulado_Enabled!=0)&&(edtavMontoacumulado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 124,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMontoacumulado_Internalname,GXutil.ltrim( localUtil.ntoc( AV133MONTOACUMULADO, (byte)(18), (byte)(2), ".", "")),((edtavMontoacumulado_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV133MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMontoacumulado_Enabled!=0)&&(edtavMontoacumulado_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,124);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMontoacumulado_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavMontoacumulado_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock26_Internalname,"Avance Registrado","","",lblTextblock26_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavMonto_Enabled!=0)&&(edtavMonto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 129,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMonto_Internalname,GXutil.ltrim( localUtil.ntoc( AV72MONTO, (byte)(18), (byte)(2), ".", "")),((edtavMonto_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV72MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMonto_Enabled!=0)&&(edtavMonto_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,129);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMonto_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavMonto_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,"Monto pendiente","","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavMontopendiente_Enabled!=0)&&(edtavMontopendiente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 134,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMontopendiente_Internalname,GXutil.ltrim( localUtil.ntoc( AV76montopendiente, (byte)(18), (byte)(2), ".", "")),((edtavMontopendiente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV76montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMontopendiente_Enabled!=0)&&(edtavMontopendiente_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,134);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMontopendiente_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavMontopendiente_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable7_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock23_Internalname,"Observaciones","","",lblTextblock23_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Multiple line edit */
      TempTags = " " + ((edtavAvdsprobs_Enabled!=0)&&(edtavAvdsprobs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 142,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtavAvdsprobs_Internalname,GXutil.rtrim( AV84AVDSPROBS),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAvdsprobs_Enabled!=0)&&(edtavAvdsprobs_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,142);\"" : " "),new Integer(0),new Integer(1),new Integer(1),new Integer(0),new Integer(211),"px",new Integer(36),"px",StyleString,ClassString,"","","300",new Integer(1),new Integer(0),"","",new Integer(-1),new Boolean(true),"","'"+""+"'"+",false,"+"'"+""+"'",new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      sendrow_62290( ) ;
   }

   public void sendrow_62290( )
   {
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable15_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxtcantidad6_Internalname,"Monto regristo de avance","","",lblTxtcantidad6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal; color:#4169E1;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCapmont_Enabled!=0)&&(edtavCapmont_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 153,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCapmont_Internalname,GXutil.ltrim( localUtil.ntoc( AV34CAPMONT, (byte)(18), (byte)(2), ".", "")),((edtavCapmont_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV34CAPMONT, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV34CAPMONT, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCapmont_Enabled!=0)&&(edtavCapmont_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,153);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCapmont_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal;",ROClassString,"","",new Integer(1),new Integer(edtavCapmont_Enabled),new Integer(0),"text","",new Integer(120),"px",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable6_Internalname+"_"+sGXsfl_62_idx,new Integer(tblTable6_Visible),"Table","","","","","","",new Integer(1),new Integer(2),"",new Integer(100),"","px","%",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,"Cantidad ","","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      sendrow_622120( ) ;
   }

   public void sendrow_622120( )
   {
      /* Single line edit */
      TempTags = " " + ((edtavCantpendiente_Enabled!=0)&&(edtavCantpendiente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 166,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantpendiente_Internalname,GXutil.ltrim( localUtil.ntoc( AV75cantpendiente, (byte)(18), (byte)(2), ".", "")),((edtavCantpendiente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV75cantpendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV75cantpendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCantpendiente_Enabled!=0)&&(edtavCantpendiente_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,166);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCantpendiente_Jsonclick,new Integer(0),"Attribute","color:#696969;",ROClassString,"","",new Integer(1),new Integer(edtavCantpendiente_Enabled),new Integer(0),"text","",new Integer(18),"chr",new Integer(1),"row",new Integer(18),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxtcantidad4_Internalname,"Cantidad","","",lblTxtcantidad4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#4169E1;","TextBlock",new Integer(0),"",new Integer(lblTxtcantidad4_Visible),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavCapcant_Enabled!=0)&&(edtavCapcant_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 171,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCapcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV83CAPCANT, (byte)(17), (byte)(6), ".", "")),GXutil.ltrim( localUtil.format( AV83CAPCANT, "ZZZZZZZZZ9.999999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','6');"+";gx.evt.onchange(this, event)\" "+((edtavCapcant_Enabled!=0)&&(edtavCapcant_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,171);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCapcant_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(edtavCapcant_Visible),new Integer(1),new Integer(0),"text","",new Integer(120),"px",new Integer(1),"row",new Integer(17),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable16_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"Table","","","","","","",new Integer(1),new Integer(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock1_Internalname,"Periodo del Servicio","","",lblTextblock1_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavFi_Enabled!=0)&&(edtavFi_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 180,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFi_Internalname,localUtil.format(AV130FI, "99/99/99"),localUtil.format( AV130FI, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavFi_Enabled!=0)&&(edtavFi_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,180);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFi_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(8),"chr",new Integer(1),"row",new Integer(8),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock2_Internalname,"al","","",lblTextblock2_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " " + ((edtavFf_Enabled!=0)&&(edtavFf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 184,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFf_Internalname,localUtil.format(AV131FF, "99/99/99"),localUtil.format( AV131FF, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavFf_Enabled!=0)&&(edtavFf_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,184);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFf_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(8),"chr",new Integer(1),"row",new Integer(8),new Integer(0),new Integer(0),new Integer(62),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      sendrow_622150( ) ;
   }

   public void sendrow_622150( )
   {
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable9_Internalname+"_"+sGXsfl_62_idx,new Integer(1),"KDSCard","","","","","","",new Integer(1),new Integer(2),"",new Integer(1270),"","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock33_Internalname,"Subconceptos","","",lblTextblock33_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","font-family:'Arial'; font-size:10.0pt; font-weight:bold; font-style:normal;","TextBlock",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      Grid2Container.SetWrapped(nGXWrapped);
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"203\">") ;
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1248, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "KDSResponsiveTable", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            subGrid2_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid2_Class) > 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Title" ;
            }
         }
         else
         {
            subGrid2_Titlebackstyle = (byte)(1) ;
            if ( subGrid2_Backcolorstyle == 1 )
            {
               subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Clave") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Concepto agrupador") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Concepto") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 50, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Unidad de medida") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Cantidad original") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Precio unitario") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Monto original") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 90, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Cantidad de avance") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Monto de avance") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+edtavGscaavdspr3can_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Cantidad acumulada") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+edtavGscaavdsprmon_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Monto acumulado") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Cantidad pendiente") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "Monto pendiente") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 70, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Tipo") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 78, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Fecha inicial") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 69, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Fecha final") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Responsable") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 66, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Línea") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 98, 4, 0))+"px"+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "Subconcepto Id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid2Container.AddObjectProperty("GridName", "Grid2");
      }
      else
      {
         Grid2Container.AddObjectProperty("GridName", "Grid2");
         Grid2Container.AddObjectProperty("Header", subGrid2_Header);
         Grid2Container.AddObjectProperty("Class", "KDSResponsiveTable");
         Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid2_Width, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("CmpContext", "");
         Grid2Container.AddObjectProperty("InMasterPage", "false");
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV54gCNDSPRSUBCONCLA));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconcla_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV110caCNDSPRSUBCONDSC));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCacndsprsubcondsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV51gCNDSPRSUBCONDSC));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcondsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV56gCNDSPRSUBCONUNIMED));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57gCNDSPRSUBCONCAN, (byte)(18), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconcan_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55gCNDSPRSUBCONPREUNI, (byte)(18), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpreuni_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58gCNDSPRSUBCONTOT, (byte)(18), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcontot_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63AVDSPR3CAN, (byte)(18), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAvdspr3can_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39AVDSPRMON, (byte)(21), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAvdsprmon_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", AV126gscaAVDSPR3CAN);
         Grid2Column.AddObjectProperty("Class", GXutil.rtrim( edtavGscaavdspr3can_Class));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGscaavdspr3can_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", AV117gscaAVDSPRMON);
         Grid2Column.AddObjectProperty("Class", GXutil.rtrim( edtavGscaavdsprmon_Class));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGscaavdsprmon_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV128gscpAVDSPR3CAN, (byte)(18), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGscpavdspr3can_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV129gscpAVDSPRMON, (byte)(21), (byte)(2), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGscpavdsprmon_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV59gCNDSPRSUBCONTIP));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcontip_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", localUtil.format(AV60gCNDSPRSUBCONFECINI, "99/99/99"));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconfecini_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", localUtil.format(AV61gCNDSPRSUBCONFECFIN, "99/99/99"));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconfecfin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV62gCNDSPRSUBCONRES));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconres_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37CNDSPRTRLIN_S, (byte)(7), (byte)(3), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrlin_s_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
         Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid2Container.AddColumnProperties(Grid2Column);
         Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
      rf49G10( ) ;
      nRC_GXsfl_203 = (short)(nGXsfl_203_idx-1) ;
      send_integrity_footer_hashes( ) ;
      GXCCtl = "nRC_GXsfl_203_" + sGXsfl_62_idx ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_203, (byte)(4), (byte)(0), ".", "")));
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "</table>") ;
      }
      else
      {
         if ( ! isAjaxCallMode( ) )
         {
            com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_62_idx, Grid2Container.ToJavascriptSource());
         }
         if ( isAjaxCallMode( ) )
         {
            Grid1Row.AddGrid("Grid2", Grid2Container);
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_62_idx, Grid2Container.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_62_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
         }
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("table");
      }
      /* End of table */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      send_integrity_lvl_hashes49G2( ) ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_62_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_62_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_62_idx+1)) ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_62_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      /* End function sendrow_622 */
   }

   public void init_default_properties( )
   {
      lblTxtguardar_Internalname = "TXTGUARDAR" ;
      lblTxtexportar_Internalname = "TXTEXPORTAR" ;
      lblTxtsalir_Internalname = "TXTSALIR" ;
      edtavCntdocdsc_Internalname = "vCNTDOCDSC" ;
      edtavCndsprndc_Internalname = "vCNDSPRNDC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtavPmctprdsc_Internalname = "vPMCTPRDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtavCndsprrescon_Internalname = "vCNDSPRRESCON" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavCncdirnom_g_Internalname = "vCNCDIRNOM_G" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavCncdirnom_Internalname = "vCNCDIRNOM" ;
      edtavCndsprcon_Internalname = "vCNDSPRCON" ;
      lblTxtabrirdet_Internalname = "TXTABRIRDET" ;
      edtavDetcndsprsubconid_Internalname = "vDETCNDSPRSUBCONID" ;
      edtavDetcndsprtrlin_Internalname = "vDETCNDSPRTRLIN" ;
      edtavDetavdsprmon_Internalname = "vDETAVDSPRMON" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtavCndsprtrlinr_Internalname = "vCNDSPRTRLINR" ;
      tblTable12_Internalname = "TABLE12" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtavCndsprtrfit_c_Internalname = "vCNDSPRTRFIT_C" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtavCndsprtrfft_c_Internalname = "vCNDSPRTRFFT_C" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavCndsprtralc_Internalname = "vCNDSPRTRALC" ;
      tblTable3_Internalname = "TABLE3" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCndsprtrpun_Internalname = "vCNDSPRTRPUN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtavCndsprtrcant_Internalname = "vCNDSPRTRCANT" ;
      edtavCndsprtrum_Internalname = "vCNDSPRTRUM" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtavCndsprtrimp_Internalname = "vCNDSPRTRIMP" ;
      edtavCndsprtrmon_Internalname = "vCNDSPRTRMON" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtavMonto_Internalname = "vMONTO" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE" ;
      tblTable4_Internalname = "TABLE4" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtavAvdsprobs_Internalname = "vAVDSPROBS" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTxtcantidad6_Internalname = "TXTCANTIDAD6" ;
      edtavCapmont_Internalname = "vCAPMONT" ;
      tblTable15_Internalname = "TABLE15" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtavCantpendiente_Internalname = "vCANTPENDIENTE" ;
      lblTxtcantidad4_Internalname = "TXTCANTIDAD4" ;
      edtavCapcant_Internalname = "vCAPCANT" ;
      tblTable6_Internalname = "TABLE6" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavFi_Internalname = "vFI" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavFf_Internalname = "vFF" ;
      tblTable16_Internalname = "TABLE16" ;
      tblTable2_Internalname = "TABLE2" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA" ;
      edtavCacndsprsubcondsc_Internalname = "vCACNDSPRSUBCONDSC" ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC" ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED" ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN" ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI" ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT" ;
      edtavAvdspr3can_Internalname = "vAVDSPR3CAN" ;
      edtavAvdsprmon_Internalname = "vAVDSPRMON" ;
      edtavGscaavdspr3can_Internalname = "vGSCAAVDSPR3CAN" ;
      edtavGscaavdsprmon_Internalname = "vGSCAAVDSPRMON" ;
      edtavGscpavdspr3can_Internalname = "vGSCPAVDSPR3CAN" ;
      edtavGscpavdsprmon_Internalname = "vGSCPAVDSPRMON" ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP" ;
      edtavGcndsprsubconfecini_Internalname = "vGCNDSPRSUBCONFECINI" ;
      edtavGcndsprsubconfecfin_Internalname = "vGCNDSPRSUBCONFECFIN" ;
      edtavGcndsprsubconres_Internalname = "vGCNDSPRSUBCONRES" ;
      edtavCndsprtrlin_s_Internalname = "vCNDSPRTRLIN_S" ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable5_Internalname = "TABLE5" ;
      divSection1_Internalname = "SECTION1" ;
      lblTxtscript_Internalname = "TXTSCRIPT" ;
      lblTxtestilos_Internalname = "TXTESTILOS" ;
      Msj_Internalname = "MSJ" ;
      Jsmsgbox1_Internalname = "JSMSGBOX1" ;
      tblKdstablacontenido_Internalname = "KDSTABLACONTENIDO" ;
      Form.setInternalname( "FORM" );
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      edtavFf_Jsonclick = "" ;
      edtavFf_Visible = 1 ;
      edtavFf_Enabled = 1 ;
      edtavFi_Jsonclick = "" ;
      edtavFi_Visible = 1 ;
      edtavFi_Enabled = 1 ;
      edtavCapcant_Jsonclick = "" ;
      edtavCapcant_Enabled = 1 ;
      lblTxtcantidad4_Visible = 1 ;
      edtavCantpendiente_Jsonclick = "" ;
      edtavCantpendiente_Visible = 1 ;
      edtavCapmont_Jsonclick = "" ;
      edtavCapmont_Visible = 1 ;
      edtavAvdsprobs_Visible = 1 ;
      edtavAvdsprobs_Enabled = 1 ;
      edtavMontopendiente_Jsonclick = "" ;
      edtavMontopendiente_Visible = 1 ;
      edtavMonto_Jsonclick = "" ;
      edtavMonto_Visible = 1 ;
      edtavMontoacumulado_Jsonclick = "" ;
      edtavMontoacumulado_Visible = 1 ;
      edtavCndsprtrmon_Jsonclick = "" ;
      edtavCndsprtrmon_Visible = 1 ;
      edtavCndsprtrimp_Jsonclick = "" ;
      edtavCndsprtrimp_Visible = 1 ;
      edtavCndsprtrum_Jsonclick = "" ;
      edtavCndsprtrum_Visible = 1 ;
      edtavCndsprtrcant_Jsonclick = "" ;
      edtavCndsprtrcant_Visible = 1 ;
      edtavCndsprtrpun_Jsonclick = "" ;
      edtavCndsprtrpun_Visible = 1 ;
      edtavCndsprtralc_Visible = 1 ;
      edtavCndsprtrfft_c_Jsonclick = "" ;
      edtavCndsprtrfft_c_Visible = 1 ;
      edtavCndsprtrfit_c_Jsonclick = "" ;
      edtavCndsprtrfit_c_Visible = 1 ;
      edtavCndsprtrlinr_Jsonclick = "" ;
      edtavCndsprtrlinr_Visible = 1 ;
      edtavCndsprtrndc_Jsonclick = "" ;
      edtavCndsprtrndc_Visible = 1 ;
      subGrid1_Class = "FreeStyleGrid" ;
      edtavGcndsprsubconid_Jsonclick = "" ;
      edtavGcndsprsubconid_Enabled = 0 ;
      edtavCndsprtrlin_s_Jsonclick = "" ;
      edtavCndsprtrlin_s_Enabled = 0 ;
      edtavGcndsprsubconres_Jsonclick = "" ;
      edtavGcndsprsubconres_Enabled = 0 ;
      edtavGcndsprsubconfecfin_Jsonclick = "" ;
      edtavGcndsprsubconfecfin_Enabled = 0 ;
      edtavGcndsprsubconfecini_Jsonclick = "" ;
      edtavGcndsprsubconfecini_Enabled = 0 ;
      edtavGcndsprsubcontip_Jsonclick = "" ;
      edtavGcndsprsubcontip_Enabled = 0 ;
      edtavGscpavdsprmon_Jsonclick = "" ;
      edtavGscpavdsprmon_Enabled = 0 ;
      edtavGscpavdspr3can_Jsonclick = "" ;
      edtavGscpavdspr3can_Enabled = 0 ;
      edtavGscaavdsprmon_Jsonclick = "" ;
      edtavGscaavdsprmon_Class = "Attribute" ;
      edtavGscaavdsprmon_Enabled = 0 ;
      edtavGscaavdspr3can_Jsonclick = "" ;
      edtavGscaavdspr3can_Class = "Attribute" ;
      edtavGscaavdspr3can_Enabled = 0 ;
      edtavAvdsprmon_Jsonclick = "" ;
      edtavAvdsprmon_Enabled = 0 ;
      edtavAvdspr3can_Jsonclick = "" ;
      edtavAvdspr3can_Visible = -1 ;
      edtavAvdspr3can_Enabled = 0 ;
      edtavGcndsprsubcontot_Jsonclick = "" ;
      edtavGcndsprsubcontot_Enabled = 0 ;
      edtavGcndsprsubconpreuni_Jsonclick = "" ;
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      edtavGcndsprsubconcan_Jsonclick = "" ;
      edtavGcndsprsubconcan_Enabled = 0 ;
      edtavGcndsprsubconunimed_Jsonclick = "" ;
      edtavGcndsprsubconunimed_Enabled = 0 ;
      edtavGcndsprsubcondsc_Jsonclick = "" ;
      edtavGcndsprsubcondsc_Enabled = 0 ;
      edtavCacndsprsubcondsc_Jsonclick = "" ;
      edtavCacndsprsubcondsc_Enabled = 0 ;
      edtavGcndsprsubconcla_Jsonclick = "" ;
      edtavGcndsprsubconcla_Enabled = 0 ;
      subGrid2_Class = "KDSResponsiveTable" ;
      edtavDetavdsprmon_Jsonclick = "" ;
      edtavDetcndsprtrlin_Jsonclick = "" ;
      edtavDetcndsprsubconid_Jsonclick = "" ;
      lblTxtabrirdet_Visible = 1 ;
      edtavCndsprcon_Jsonclick = "" ;
      edtavCndsprcon_Enabled = 1 ;
      edtavCncdirnom_Enabled = 1 ;
      edtavCncdirnom_g_Enabled = 1 ;
      edtavCndsprrescon_Enabled = 1 ;
      edtavPmctprdsc_Jsonclick = "" ;
      edtavPmctprdsc_Enabled = 1 ;
      edtavCndsprndc_Jsonclick = "" ;
      edtavCndsprndc_Enabled = 1 ;
      edtavCntdocdsc_Jsonclick = "" ;
      edtavCntdocdsc_Enabled = 1 ;
      Msj_Title = "Title" ;
      lblTxtestilos_Visible = 1 ;
      lblTxtscript_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock33_Caption = "Subconceptos" ;
      lblTextblock2_Caption = "al" ;
      lblTextblock1_Caption = "Periodo del Servicio" ;
      lblTxtcantidad4_Caption = "Cantidad" ;
      edtavCantpendiente_Enabled = 1 ;
      edtavCapmont_Enabled = 1 ;
      lblTxtcantidad6_Caption = "Monto regristo de avance" ;
      lblTextblock23_Caption = "Observaciones" ;
      edtavMontopendiente_Enabled = 1 ;
      lblTextblock19_Caption = "Monto pendiente" ;
      edtavMonto_Enabled = 1 ;
      lblTextblock26_Caption = "Avance Registrado" ;
      edtavMontoacumulado_Enabled = 1 ;
      lblTextblock25_Caption = "Avance Autorizado" ;
      edtavCndsprtrmon_Enabled = 1 ;
      edtavCndsprtrimp_Enabled = 1 ;
      lblTextblock24_Caption = "Monto original" ;
      edtavCndsprtrum_Enabled = 1 ;
      edtavCndsprtrcant_Enabled = 1 ;
      lblTextblock14_Caption = "Cantidad " ;
      edtavCndsprtrpun_Enabled = 1 ;
      lblTextblock17_Caption = "Precio Unitario" ;
      edtavCndsprtralc_Enabled = 1 ;
      lblTextblock5_Caption = "Alcance" ;
      edtavCndsprtrfft_c_Enabled = 1 ;
      lblTextblock30_Caption = "Fecha Final del contrato" ;
      edtavCndsprtrfit_c_Enabled = 1 ;
      lblTextblock31_Caption = "Fecha Inicial del contrato" ;
      edtavCndsprtrlinr_Enabled = 1 ;
      lblTextblock22_Caption = "Linea requisición" ;
      edtavCndsprtrndc_Enabled = 1 ;
      lblTextblock21_Caption = "No Requisición" ;
      lblTxtestilos_Caption = "txtEstilos" ;
      lblTxtscript_Caption = "txtScript" ;
      edtavDetavdsprmon_Visible = 1 ;
      edtavDetcndsprtrlin_Visible = 1 ;
      edtavDetcndsprsubconid_Visible = 1 ;
      edtavCndsprcon_Visible = 1 ;
      tblTable6_Visible = 1 ;
      lblTxtexportar_Caption = "Exportar a Excel" ;
      lblTxtsalir_Caption = "Salir" ;
      lblTxtguardar_Caption = "Guardar" ;
      subGrid2_Width = 1248 ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid1_Width = 1280 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Jsmsgbox1_Texto_boton_ok = "Continuar" ;
      Jsmsgbox1_Botones = "2" ;
      Jsmsgbox1_Texto = "" ;
      Jsmsgbox1_Height = "200px" ;
      Jsmsgbox1_Width = "500px" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Registro de avance" );
      edtavCapcant_Visible = 1 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'edtavCapcant_Visible',ctrl:'vCAPCANT',prop:'Visible'},{av:'AV29CNDSPRTRCANT',fld:'vCNDSPRTRCANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV31CNDSPRTRIMP',fld:'vCNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV72MONTO',fld:'vMONTO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV133MONTOACUMULADO',fld:'vMONTOACUMULADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV75cantpendiente',fld:'vCANTPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV76montopendiente',fld:'vMONTOPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''},{av:'GRID2_nFirstRecordOnPage'},{av:'GRID2_nEOF'},{av:'AV110caCNDSPRSUBCONDSC',fld:'vCACNDSPRSUBCONDSC',pic:''},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV38AVDSPRMON_ASI',fld:'vAVDSPRMON_ASI',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV127AVDSPR3CAN_ASI',fld:'vAVDSPR3CAN_ASI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A8239AVDSPRSPID',fld:'AVDSPRSPID',pic:'ZZZZZZZZZ9'},{av:'AV52gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A8240AVDSPRMON',fld:'AVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18201AVDSPR3CAN',fld:'AVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV46CNDSPRTRLIN',fld:'vCNDSPRTRLIN',pic:'ZZ9.999',hsh:true},{av:'AV12PMCTPRDSC',fld:'vPMCTPRDSC',pic:'',hsh:true},{av:'AV18PMCTPRID',fld:'vPMCTPRID',pic:'',hsh:true},{av:'AV15CNCDIRNOM_G',fld:'vCNCDIRNOM_G',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e1649G2',iparms:[{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'tblTable6_Visible',ctrl:'TABLE6',prop:'Visible'},{av:'edtavAvdspr3can_Enabled',ctrl:'vAVDSPR3CAN',prop:'Enabled'},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV46CNDSPRTRLIN',fld:'vCNDSPRTRLIN',pic:'ZZ9.999',hsh:true},{av:'AV30CNDSPRTRUM',fld:'vCNDSPRTRUM',pic:''},{av:'AV29CNDSPRTRCANT',fld:'vCNDSPRTRCANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV28CNDSPRTRPUN',fld:'vCNDSPRTRPUN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV31CNDSPRTRIMP',fld:'vCNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV32CNDSPRTRMON',fld:'vCNDSPRTRMON',pic:''},{av:'AV25CNDSPRTRFIT_C',fld:'vCNDSPRTRFIT_C',pic:''},{av:'AV26CNDSPRTRFFT_C',fld:'vCNDSPRTRFFT_C',pic:''},{av:'AV27CNDSPRTRALC',fld:'vCNDSPRTRALC',pic:''},{av:'AV23CNDSPRTRNDC',fld:'vCNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'AV24CNDSPRTRLINR',fld:'vCNDSPRTRLINR',pic:'ZZZZZZ9'},{av:'AV75cantpendiente',fld:'vCANTPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV76montopendiente',fld:'vMONTOPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV34CAPMONT',fld:'vCAPMONT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV83CAPCANT',fld:'vCAPCANT',pic:'ZZZZZZZZZ9.999999'}]}");
      setEventMetadata("GRID2.LOAD","{handler:'e1749G10',iparms:[{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV46CNDSPRTRLIN',fld:'vCNDSPRTRLIN',pic:'ZZ9.999',hsh:true},{av:'AV38AVDSPRMON_ASI',fld:'vAVDSPRMON_ASI',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV127AVDSPR3CAN_ASI',fld:'vAVDSPR3CAN_ASI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A8239AVDSPRSPID',fld:'AVDSPRSPID',pic:'ZZZZZZZZZ9'},{av:'AV52gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A8240AVDSPRMON',fld:'AVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18201AVDSPR3CAN',fld:'AVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("GRID2.LOAD",",oparms:[{av:'AV99SubConItem',fld:'vSUBCONITEM',pic:''},{av:'AV52gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54gCNDSPRSUBCONCLA',fld:'vGCNDSPRSUBCONCLA',pic:''},{av:'AV51gCNDSPRSUBCONDSC',fld:'vGCNDSPRSUBCONDSC',pic:''},{av:'AV55gCNDSPRSUBCONPREUNI',fld:'vGCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV56gCNDSPRSUBCONUNIMED',fld:'vGCNDSPRSUBCONUNIMED',pic:''},{av:'AV57gCNDSPRSUBCONCAN',fld:'vGCNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV58gCNDSPRSUBCONTOT',fld:'vGCNDSPRSUBCONTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV59gCNDSPRSUBCONTIP',fld:'vGCNDSPRSUBCONTIP',pic:''},{av:'AV60gCNDSPRSUBCONFECINI',fld:'vGCNDSPRSUBCONFECINI',pic:''},{av:'AV61gCNDSPRSUBCONFECFIN',fld:'vGCNDSPRSUBCONFECFIN',pic:''},{av:'AV62gCNDSPRSUBCONRES',fld:'vGCNDSPRSUBCONRES',pic:''},{av:'AV39AVDSPRMON',fld:'vAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV63AVDSPR3CAN',fld:'vAVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'edtavAvdspr3can_Enabled',ctrl:'vAVDSPR3CAN',prop:'Enabled'},{av:'AV37CNDSPRTRLIN_S',fld:'vCNDSPRTRLIN_S',pic:'ZZ9.999'},{av:'AV117gscaAVDSPRMON',fld:'vGSCAAVDSPRMON',pic:''},{av:'edtavGscaavdsprmon_Class',ctrl:'vGSCAAVDSPRMON',prop:'Class'},{av:'AV126gscaAVDSPR3CAN',fld:'vGSCAAVDSPR3CAN',pic:''},{av:'edtavGscaavdspr3can_Class',ctrl:'vGSCAAVDSPR3CAN',prop:'Class'},{av:'AV128gscpAVDSPR3CAN',fld:'vGSCPAVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV129gscpAVDSPRMON',fld:'vGSCPAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV110caCNDSPRSUBCONDSC',fld:'vCACNDSPRSUBCONDSC',pic:''},{av:'AV38AVDSPRMON_ASI',fld:'vAVDSPRMON_ASI',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV127AVDSPR3CAN_ASI',fld:'vAVDSPR3CAN_ASI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'}]}");
      setEventMetadata("TXTSALIR.CLICK","{handler:'e1949G1',iparms:[]");
      setEventMetadata("TXTSALIR.CLICK",",oparms:[{av:'lblTxtscript_Caption',ctrl:'TXTSCRIPT',prop:'Caption'}]}");
      setEventMetadata("TXTGUARDAR.CLICK","{handler:'e1249G2',iparms:[{av:'AV64continuar',fld:'vCONTINUAR',pic:''},{av:'AV132faltaPeriodo',fld:'vFALTAPERIODO',pic:''},{av:'AV78montomayor',fld:'vMONTOMAYOR',pic:''},{av:'AV116csCAPMONT',fld:'vCSCAPMONT',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV84AVDSPROBS',fld:'vAVDSPROBS',pic:''},{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''},{av:'AV65CAPMONT_AUX',fld:'vCAPMONT_AUX',pic:'ZZZZZZZZZZZ9.99'},{av:'AV68TipoMensaje',fld:'vTIPOMENSAJE',pic:''},{av:'AV70mensajeFinal',fld:'vMENSAJEFINAL',pic:''}]");
      setEventMetadata("TXTGUARDAR.CLICK",",oparms:[{av:'AV68TipoMensaje',fld:'vTIPOMENSAJE',pic:''},{av:'AV64continuar',fld:'vCONTINUAR',pic:''},{av:'AV132faltaPeriodo',fld:'vFALTAPERIODO',pic:''},{av:'AV116csCAPMONT',fld:'vCSCAPMONT',pic:'$ ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV136observaciones',fld:'vOBSERVACIONES',pic:''},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV65CAPMONT_AUX',fld:'vCAPMONT_AUX',pic:'ZZZZZZZZZZZ9.99'},{av:'AV99SubConItem',fld:'vSUBCONITEM',pic:''},{av:'AV78montomayor',fld:'vMONTOMAYOR',pic:''},{av:'Jsmsgbox1_Texto',ctrl:'JSMSGBOX1',prop:'Texto'}]}");
      setEventMetadata("JSMSGBOX1.ONCLICKOK","{handler:'e1149G2',iparms:[{av:'AV68TipoMensaje',fld:'vTIPOMENSAJE',pic:''},{av:'AV138BANDAUT',fld:'vBANDAUT',pic:'ZZZ9'},{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''},{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV82CNDSPRTDC_GEN',fld:'vCNDSPRTDC_GEN',pic:''},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV5CNUSERID',fld:'vCNUSERID',pic:''},{av:'AV84AVDSPROBS',fld:'vAVDSPROBS',pic:''},{av:'AV130FI',fld:'vFI',pic:''},{av:'AV131FF',fld:'vFF',pic:''},{av:'AV12PMCTPRDSC',fld:'vPMCTPRDSC',pic:'',hsh:true},{av:'A7884NIVAUTAVNIV',fld:'NIVAUTAVNIV',pic:'ZZZ9'},{av:'A8263NIVAUTAVPRY',fld:'NIVAUTAVPRY',pic:''},{av:'AV18PMCTPRID',fld:'vPMCTPRID',pic:'',hsh:true},{av:'A7883NIVAUTAVTDC',fld:'NIVAUTAVTDC',pic:''},{av:'A7886NIVAUTAVUSR',fld:'NIVAUTAVUSR',pic:''}]");
      setEventMetadata("JSMSGBOX1.ONCLICKOK",",oparms:[{av:'AV80dGenerados',fld:'vDGENERADOS',pic:''},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV131FF',fld:'vFF',pic:''},{av:'AV130FI',fld:'vFI',pic:''},{av:'AV84AVDSPROBS',fld:'vAVDSPROBS',pic:''},{av:'AV5CNUSERID',fld:'vCNUSERID',pic:''},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV82CNDSPRTDC_GEN',fld:'vCNDSPRTDC_GEN',pic:''},{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV99SubConItem',fld:'vSUBCONITEM',pic:''},{av:'AV138BANDAUT',fld:'vBANDAUT',pic:'ZZZ9'}]}");
      setEventMetadata("TXTABRIRDET.CLICK","{handler:'e2049G1',iparms:[{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV122DETCNDSPRTRLIN',fld:'vDETCNDSPRTRLIN',pic:'ZZ9.999'},{av:'AV123DETCNDSPRSUBCONID',fld:'vDETCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV124DETAVDSPRMON',fld:'vDETAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV5CNUSERID',fld:'vCNUSERID',pic:''}]");
      setEventMetadata("TXTABRIRDET.CLICK",",oparms:[]}");
      setEventMetadata("VAVDSPR3CAN.CONTROLVALUECHANGED","{handler:'e1849G2',iparms:[{av:'AV63AVDSPR3CAN',fld:'vAVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV128gscpAVDSPR3CAN',fld:'vGSCPAVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV55gCNDSPRSUBCONPREUNI',fld:'vGCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV52gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''},{av:'AV94auxCNDSPRSUBCONID',fld:'vAUXCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV95auxAVDSPRMON',fld:'vAUXAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV28CNDSPRTRPUN',fld:'vCNDSPRTRPUN',grid:62,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'GRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID1',grid:62,prop:'GridRC'}]");
      setEventMetadata("VAVDSPR3CAN.CONTROLVALUECHANGED",",oparms:[{av:'AV63AVDSPR3CAN',fld:'vAVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV39AVDSPRMON',fld:'vAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV94auxCNDSPRSUBCONID',fld:'vAUXCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV95auxAVDSPRMON',fld:'vAUXAVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'AV99SubConItem',fld:'vSUBCONITEM',pic:''},{av:'AV96SDTRegAvaSC',fld:'vSDTREGAVASC',pic:''},{av:'AV34CAPMONT',fld:'vCAPMONT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV83CAPCANT',fld:'vCAPCANT',pic:'ZZZZZZZZZ9.999999'}]}");
      setEventMetadata("GLOBALEVENTS.CONTINUA","{handler:'e1349G2',iparms:[{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV80dGenerados',fld:'vDGENERADOS',pic:''}]");
      setEventMetadata("GLOBALEVENTS.CONTINUA",",oparms:[{av:'lblTxtscript_Caption',ctrl:'TXTSCRIPT',prop:'Caption'}]}");
      setEventMetadata("'EXPORTAREXCEL'","{handler:'e1449G2',iparms:[{av:'AV9CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV12PMCTPRDSC',fld:'vPMCTPRDSC',pic:'',hsh:true},{av:'AV15CNCDIRNOM_G',fld:'vCNCDIRNOM_G',pic:'',hsh:true},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV8CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'AV10CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A7550CNDSPRTRALC',fld:'CNDSPRTRALC',pic:''},{av:'AV31CNDSPRTRIMP',fld:'vCNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV133MONTOACUMULADO',fld:'vMONTOACUMULADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV72MONTO',fld:'vMONTO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV76montopendiente',fld:'vMONTOPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV97SDTRegAvaSCItem',fld:'vSDTREGAVASCITEM',pic:''},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'AV46CNDSPRTRLIN',fld:'vCNDSPRTRLIN',pic:'ZZ9.999',hsh:true},{av:'A8239AVDSPRSPID',fld:'AVDSPRSPID',pic:'ZZZZZZZZZ9'},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A8240AVDSPRMON',fld:'AVDSPRMON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18201AVDSPR3CAN',fld:'AVDSPR3CAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("'EXPORTAREXCEL'",",oparms:[{av:'AV99SubConItem',fld:'vSUBCONITEM',pic:''},{av:'lblTxtscript_Caption',ctrl:'TXTSCRIPT',prop:'Caption'}]}");
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
      AV144ExcelDocument.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV110caCNDSPRSUBCONDSC = "" ;
      AV97SDTRegAvaSCItem = new com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem(remoteHandle, context);
      AV46CNDSPRTRLIN = DecimalUtil.ZERO ;
      AV38AVDSPRMON_ASI = DecimalUtil.ZERO ;
      AV127AVDSPR3CAN_ASI = DecimalUtil.ZERO ;
      A20CNTDOCID = "" ;
      AV10CNDSPRTDC = "" ;
      A7792AVDSPRLIN = DecimalUtil.ZERO ;
      A7800AVDSPREST = "" ;
      A8240AVDSPRMON = DecimalUtil.ZERO ;
      A18201AVDSPR3CAN = DecimalUtil.ZERO ;
      AV12PMCTPRDSC = "" ;
      AV18PMCTPRID = "" ;
      AV15CNCDIRNOM_G = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV29CNDSPRTRCANT = DecimalUtil.ZERO ;
      AV31CNDSPRTRIMP = DecimalUtil.ZERO ;
      AV72MONTO = DecimalUtil.ZERO ;
      AV133MONTOACUMULADO = DecimalUtil.ZERO ;
      AV75cantpendiente = DecimalUtil.ZERO ;
      AV76montopendiente = DecimalUtil.ZERO ;
      AV96SDTRegAvaSC = new GXBaseCollection<com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem>(com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem.class, "SDTRegAvaSCItem", "KDSProyectos", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV116csCAPMONT = DecimalUtil.ZERO ;
      AV65CAPMONT_AUX = DecimalUtil.ZERO ;
      AV68TipoMensaje = "" ;
      AV70mensajeFinal = "" ;
      AV82CNDSPRTDC_GEN = "" ;
      AV5CNUSERID = "" ;
      A8263NIVAUTAVPRY = "" ;
      A7883NIVAUTAVTDC = "" ;
      A7886NIVAUTAVUSR = "" ;
      AV95auxAVDSPRMON = DecimalUtil.ZERO ;
      AV80dGenerados = "" ;
      A7519CNDSPRTDC = "" ;
      A7550CNDSPRTRALC = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25CNDSPRTRFIT_C = "" ;
      AV26CNDSPRTRFFT_C = "" ;
      AV27CNDSPRTRALC = "" ;
      AV28CNDSPRTRPUN = DecimalUtil.ZERO ;
      AV30CNDSPRTRUM = "" ;
      AV32CNDSPRTRMON = "" ;
      AV84AVDSPROBS = "" ;
      AV34CAPMONT = DecimalUtil.ZERO ;
      AV83CAPCANT = DecimalUtil.ZERO ;
      AV130FI = GXutil.nullDate() ;
      AV131FF = GXutil.nullDate() ;
      AV54gCNDSPRSUBCONCLA = "" ;
      AV51gCNDSPRSUBCONDSC = "" ;
      AV56gCNDSPRSUBCONUNIMED = "" ;
      AV57gCNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      AV55gCNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      AV58gCNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      AV63AVDSPR3CAN = DecimalUtil.ZERO ;
      AV39AVDSPRMON = DecimalUtil.ZERO ;
      AV126gscaAVDSPR3CAN = "" ;
      AV117gscaAVDSPRMON = "" ;
      AV128gscpAVDSPR3CAN = DecimalUtil.ZERO ;
      AV129gscpAVDSPRMON = DecimalUtil.ZERO ;
      AV59gCNDSPRSUBCONTIP = "" ;
      AV60gCNDSPRSUBCONFECINI = GXutil.nullDate() ;
      AV61gCNDSPRSUBCONFECFIN = GXutil.nullDate() ;
      AV62gCNDSPRSUBCONRES = "" ;
      AV37CNDSPRTRLIN_S = DecimalUtil.ZERO ;
      AV11cntdocdsc = "" ;
      AV22CNDSPRRESCON = "" ;
      AV16CNCDIRNOM = "" ;
      AV122DETCNDSPRTRLIN = DecimalUtil.ZERO ;
      AV124DETAVDSPRMON = DecimalUtil.ZERO ;
      hsh = "" ;
      AV6session = httpContext.getWebSession();
      AV118MENREGAVA = "" ;
      scmdbuf = "" ;
      H049G2_A7520CNDSPRNDC = new long[1] ;
      H049G2_A7519CNDSPRTDC = new String[] {""} ;
      H049G2_A7518CNDSPRCIA = new long[1] ;
      H049G2_A7521CNDSPRPRID = new String[] {""} ;
      H049G2_n7521CNDSPRPRID = new boolean[] {false} ;
      H049G2_A7522CNDSPRCON = new long[1] ;
      H049G2_n7522CNDSPRCON = new boolean[] {false} ;
      H049G2_A7527CNDSPRMON = new String[] {""} ;
      H049G2_n7527CNDSPRMON = new boolean[] {false} ;
      H049G2_A7641CNDSPRTCMB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G2_n7641CNDSPRTCMB = new boolean[] {false} ;
      H049G2_A7530CNDSPRRESCON = new String[] {""} ;
      H049G2_n7530CNDSPRRESCON = new boolean[] {false} ;
      A7521CNDSPRPRID = "" ;
      A7527CNDSPRMON = "" ;
      A7641CNDSPRTCMB = DecimalUtil.ZERO ;
      A7530CNDSPRRESCON = "" ;
      AV19PMCTPRUNNG = "" ;
      AV20CNDSPRMON = "" ;
      AV21CNDSPRTCMB = DecimalUtil.ZERO ;
      H049G3_A20CNTDOCID = new String[] {""} ;
      H049G3_A21CNTDOCDSC = new String[] {""} ;
      H049G3_n21CNTDOCDSC = new boolean[] {false} ;
      A21CNTDOCDSC = "" ;
      H049G4_A171PMCTPRID = new String[] {""} ;
      H049G4_A6299PMCTPREJ = new long[1] ;
      H049G4_n6299PMCTPREJ = new boolean[] {false} ;
      A171PMCTPRID = "" ;
      H049G5_A46CNCDIRID = new long[1] ;
      H049G5_A194CNCDIRNOM = new String[] {""} ;
      H049G5_n194CNCDIRNOM = new boolean[] {false} ;
      A194CNCDIRNOM = "" ;
      H049G6_A7886NIVAUTAVUSR = new String[] {""} ;
      H049G6_A7883NIVAUTAVTDC = new String[] {""} ;
      H049G6_A8263NIVAUTAVPRY = new String[] {""} ;
      H049G6_A7884NIVAUTAVNIV = new short[1] ;
      H049G7_A7520CNDSPRNDC = new long[1] ;
      H049G7_A7519CNDSPRTDC = new String[] {""} ;
      H049G7_A7518CNDSPRCIA = new long[1] ;
      H049G7_A7540CNDSPRTRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G7_A7541CNDSPRTRACT = new long[1] ;
      H049G7_n7541CNDSPRTRACT = new boolean[] {false} ;
      H049G7_A7542CNDSPRTRUM = new String[] {""} ;
      H049G7_n7542CNDSPRTRUM = new boolean[] {false} ;
      H049G7_A7543CNDSPRTRCANT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G7_n7543CNDSPRTRCANT = new boolean[] {false} ;
      H049G7_A7544CNDSPRTRPUN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G7_n7544CNDSPRTRPUN = new boolean[] {false} ;
      H049G7_A7545CNDSPRTRIMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G7_n7545CNDSPRTRIMP = new boolean[] {false} ;
      H049G7_A7546CNDSPRTRMON = new String[] {""} ;
      H049G7_n7546CNDSPRTRMON = new boolean[] {false} ;
      H049G7_A7547CNDSPRTRFIT = new java.util.Date[] {GXutil.nullDate()} ;
      H049G7_n7547CNDSPRTRFIT = new boolean[] {false} ;
      H049G7_A7548CNDSPRTRFFT = new java.util.Date[] {GXutil.nullDate()} ;
      H049G7_n7548CNDSPRTRFFT = new boolean[] {false} ;
      H049G7_A7549CNDSPRTRRES = new String[] {""} ;
      H049G7_n7549CNDSPRTRRES = new boolean[] {false} ;
      H049G7_A7550CNDSPRTRALC = new String[] {""} ;
      H049G7_n7550CNDSPRTRALC = new boolean[] {false} ;
      H049G7_A7551CNDSPRTROBS = new String[] {""} ;
      H049G7_n7551CNDSPRTROBS = new boolean[] {false} ;
      H049G7_A7600CNDSPRTRTDC = new String[] {""} ;
      H049G7_n7600CNDSPRTRTDC = new boolean[] {false} ;
      H049G7_A7601CNDSPRTRNDC = new long[1] ;
      H049G7_n7601CNDSPRTRNDC = new boolean[] {false} ;
      H049G7_A7602CNDSPRTRLINR = new int[1] ;
      H049G7_n7602CNDSPRTRLINR = new boolean[] {false} ;
      A7540CNDSPRTRLIN = DecimalUtil.ZERO ;
      A7542CNDSPRTRUM = "" ;
      A7543CNDSPRTRCANT = DecimalUtil.ZERO ;
      A7544CNDSPRTRPUN = DecimalUtil.ZERO ;
      A7545CNDSPRTRIMP = DecimalUtil.ZERO ;
      A7546CNDSPRTRMON = "" ;
      A7547CNDSPRTRFIT = GXutil.nullDate() ;
      A7548CNDSPRTRFFT = GXutil.nullDate() ;
      A7549CNDSPRTRRES = "" ;
      A7551CNDSPRTROBS = "" ;
      A7600CNDSPRTRTDC = "" ;
      A18154CNDSPRSUBCONDSC = "" ;
      H049G8_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G8_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G8_A7520CNDSPRNDC = new long[1] ;
      H049G8_A7519CNDSPRTDC = new String[] {""} ;
      H049G8_A7518CNDSPRCIA = new long[1] ;
      H049G8_A18153CNDSPRSUBCONCLA = new String[] {""} ;
      H049G8_n18153CNDSPRSUBCONCLA = new boolean[] {false} ;
      H049G8_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G8_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G8_A18155CNDSPRSUBCONPREUNI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G8_n18155CNDSPRSUBCONPREUNI = new boolean[] {false} ;
      H049G8_A18156CNDSPRSUBCONUNIMED = new String[] {""} ;
      H049G8_n18156CNDSPRSUBCONUNIMED = new boolean[] {false} ;
      H049G8_A18157CNDSPRSUBCONCAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G8_n18157CNDSPRSUBCONCAN = new boolean[] {false} ;
      H049G8_A18158CNDSPRSUBCONTOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G8_n18158CNDSPRSUBCONTOT = new boolean[] {false} ;
      H049G8_A18185CNDSPRSUBCONFECINI = new java.util.Date[] {GXutil.nullDate()} ;
      H049G8_n18185CNDSPRSUBCONFECINI = new boolean[] {false} ;
      H049G8_A18186CNDSPRSUBCONFECFIN = new java.util.Date[] {GXutil.nullDate()} ;
      H049G8_n18186CNDSPRSUBCONFECFIN = new boolean[] {false} ;
      H049G8_A18187CNDSPRSUBCONRES = new String[] {""} ;
      H049G8_n18187CNDSPRSUBCONRES = new boolean[] {false} ;
      H049G8_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G8_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G8_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G8_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G8_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G8_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G8_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G8_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G8_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G8_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G8_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G8_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G8_A18146CNDSPRSUBCONID = new long[1] ;
      A18159CNDSPRSUBCONTIP = "" ;
      A18153CNDSPRSUBCONCLA = "" ;
      A18155CNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      A18156CNDSPRSUBCONUNIMED = "" ;
      A18157CNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      A18158CNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      A18185CNDSPRSUBCONFECINI = GXutil.nullDate() ;
      A18186CNDSPRSUBCONFECFIN = GXutil.nullDate() ;
      A18187CNDSPRSUBCONRES = "" ;
      AV99SubConItem = new com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem(remoteHandle, context);
      AV43CNDSPRTRFIT = GXutil.nullDate() ;
      AV44CNDSPRTRFFT = GXutil.nullDate() ;
      AV13CNDSPRTRRES = "" ;
      AV48CNDSPRTROBS = "" ;
      AV49CNDSPRTRTDC = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      c8240AVDSPRMON = DecimalUtil.ZERO ;
      c18201AVDSPR3CAN = DecimalUtil.ZERO ;
      H049G9_A8240AVDSPRMON = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G9_A18201AVDSPR3CAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G9_n18201AVDSPR3CAN = new boolean[] {false} ;
      AV71CANTTOT = DecimalUtil.ZERO ;
      H049G10_A7791AVDSPRTDC = new String[] {""} ;
      H049G10_A7790AVDSPRNDC = new long[1] ;
      H049G10_A7800AVDSPREST = new String[] {""} ;
      H049G10_n7800AVDSPREST = new boolean[] {false} ;
      H049G10_A7792AVDSPRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G10_A20CNTDOCID = new String[] {""} ;
      H049G10_A8255AVDSPRDOC = new long[1] ;
      H049G10_A7789AVDSPRCIA = new long[1] ;
      H049G10_A7862AVDSPRCAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G10_n7862AVDSPRCAN = new boolean[] {false} ;
      H049G10_A7795AVDSPRIMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G10_n7795AVDSPRIMP = new boolean[] {false} ;
      A7862AVDSPRCAN = DecimalUtil.ZERO ;
      A7795AVDSPRIMP = DecimalUtil.ZERO ;
      AV73AVDSPRCAN = DecimalUtil.ZERO ;
      AV74AVDSPRIMP = DecimalUtil.ZERO ;
      AV87AVDSPREST = "" ;
      AV77diferencia = DecimalUtil.ZERO ;
      ucJsmsgbox1 = new com.genexus.webpanels.GXUserControl();
      AV35AVDSPRPORAVOBR_C = DecimalUtil.ZERO ;
      AV67AVDSPRUM_C = "" ;
      GXv_int4 = new long [1] ;
      GXv_int5 = new long [1] ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_decimal7 = new java.math.BigDecimal [1] ;
      GXv_decimal8 = new java.math.BigDecimal [1] ;
      GXv_decimal9 = new java.math.BigDecimal [1] ;
      GXv_char10 = new String [1] ;
      GXv_char11 = new String [1] ;
      GXv_decimal12 = new java.math.BigDecimal [1] ;
      GXv_char13 = new String [1] ;
      GXv_int14 = new short [1] ;
      GXv_int15 = new byte [1] ;
      GXv_boolean17 = new boolean [1] ;
      GXv_date18 = new java.util.Date [1] ;
      GXv_date19 = new java.util.Date [1] ;
      AV139mensaje = "" ;
      H049G11_A46CNCDIRID = new long[1] ;
      H049G11_A2882CNCDIRESTIMP = new String[] {""} ;
      H049G11_n2882CNCDIRESTIMP = new boolean[] {false} ;
      A2882CNCDIRESTIMP = "" ;
      AV92EstructImpId = "" ;
      AV102auxCAPMONT = DecimalUtil.ZERO ;
      AV134auxCAPCANT = DecimalUtil.ZERO ;
      H049G12_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G12_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G12_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G12_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G12_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G12_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G12_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G12_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G12_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G12_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G12_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G12_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G12_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G12_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G12_A7520CNDSPRNDC = new long[1] ;
      H049G12_A7519CNDSPRTDC = new String[] {""} ;
      H049G12_A7518CNDSPRCIA = new long[1] ;
      H049G12_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G12_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G12_A18146CNDSPRSUBCONID = new long[1] ;
      H049G13_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G13_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G13_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G13_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G13_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G13_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G13_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G13_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G13_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G13_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G13_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G13_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G13_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G13_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G13_A7520CNDSPRNDC = new long[1] ;
      H049G13_A7519CNDSPRTDC = new String[] {""} ;
      H049G13_A7518CNDSPRCIA = new long[1] ;
      H049G13_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G13_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G13_A18146CNDSPRSUBCONID = new long[1] ;
      H049G14_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G14_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G14_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G14_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G14_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G14_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G14_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G14_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G14_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G14_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G14_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G14_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G14_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G14_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G14_A7520CNDSPRNDC = new long[1] ;
      H049G14_A7519CNDSPRTDC = new String[] {""} ;
      H049G14_A7518CNDSPRCIA = new long[1] ;
      H049G14_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G14_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G14_A18146CNDSPRSUBCONID = new long[1] ;
      H049G15_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G15_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G15_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G15_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G15_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G15_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G15_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G15_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G15_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G15_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G15_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G15_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G15_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G15_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G15_A7520CNDSPRNDC = new long[1] ;
      H049G15_A7519CNDSPRTDC = new String[] {""} ;
      H049G15_A7518CNDSPRCIA = new long[1] ;
      H049G15_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G15_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G15_A18146CNDSPRSUBCONID = new long[1] ;
      H049G16_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H049G16_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H049G16_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H049G16_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H049G16_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H049G16_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H049G16_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H049G16_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H049G16_A18148CNDSPRSUBCONPERT = new long[1] ;
      H049G16_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H049G16_A18147CNDSPRSUBCONBASE = new long[1] ;
      H049G16_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      H049G16_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H049G16_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H049G16_A7520CNDSPRNDC = new long[1] ;
      H049G16_A7519CNDSPRTDC = new String[] {""} ;
      H049G16_A7518CNDSPRCIA = new long[1] ;
      H049G16_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H049G16_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H049G16_A18146CNDSPRSUBCONID = new long[1] ;
      AV141nombreArchivo = "" ;
      AV140rutaArchivo = "" ;
      GXt_char1 = "" ;
      GXv_char16 = new String [1] ;
      AV142Path = "" ;
      AV143Ruta = "" ;
      AV144ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV149CNDSPRALCTR = "" ;
      H049G17_A7540CNDSPRTRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G17_A7520CNDSPRNDC = new long[1] ;
      H049G17_A7519CNDSPRTDC = new String[] {""} ;
      H049G17_A7518CNDSPRCIA = new long[1] ;
      H049G17_A7550CNDSPRTRALC = new String[] {""} ;
      H049G17_n7550CNDSPRTRALC = new boolean[] {false} ;
      AV146AAVDSPRMON_ASI = DecimalUtil.ZERO ;
      AV147AAVDSPR3CAN_ASI = DecimalUtil.ZERO ;
      H049G18_A8240AVDSPRMON = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G18_A18201AVDSPR3CAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H049G18_n18201AVDSPR3CAN = new boolean[] {false} ;
      AV148AbrirRutaArchivo = "" ;
      AV120AbrirDetalle = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      lblTxtguardar_Jsonclick = "" ;
      lblTxtexportar_Jsonclick = "" ;
      lblTxtsalir_Jsonclick = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTxtscript_Jsonclick = "" ;
      lblTxtestilos_Jsonclick = "" ;
      ucMsj = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTxtabrirdet_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid2_Linesclass = "" ;
      ROClassString = "" ;
      subGrid1_Linesclass = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTxtcantidad6_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTxtcantidad4_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXCCtl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.wpregavacs__default(),
         new Object[] {
             new Object[] {
            H049G2_A7520CNDSPRNDC, H049G2_A7519CNDSPRTDC, H049G2_A7518CNDSPRCIA, H049G2_A7521CNDSPRPRID, H049G2_n7521CNDSPRPRID, H049G2_A7522CNDSPRCON, H049G2_n7522CNDSPRCON, H049G2_A7527CNDSPRMON, H049G2_n7527CNDSPRMON, H049G2_A7641CNDSPRTCMB,
            H049G2_n7641CNDSPRTCMB, H049G2_A7530CNDSPRRESCON, H049G2_n7530CNDSPRRESCON
            }
            , new Object[] {
            H049G3_A20CNTDOCID, H049G3_A21CNTDOCDSC, H049G3_n21CNTDOCDSC
            }
            , new Object[] {
            H049G4_A171PMCTPRID, H049G4_A6299PMCTPREJ, H049G4_n6299PMCTPREJ
            }
            , new Object[] {
            H049G5_A46CNCDIRID, H049G5_A194CNCDIRNOM, H049G5_n194CNCDIRNOM
            }
            , new Object[] {
            H049G6_A7886NIVAUTAVUSR, H049G6_A7883NIVAUTAVTDC, H049G6_A8263NIVAUTAVPRY, H049G6_A7884NIVAUTAVNIV
            }
            , new Object[] {
            H049G7_A7520CNDSPRNDC, H049G7_A7519CNDSPRTDC, H049G7_A7518CNDSPRCIA, H049G7_A7540CNDSPRTRLIN, H049G7_A7541CNDSPRTRACT, H049G7_n7541CNDSPRTRACT, H049G7_A7542CNDSPRTRUM, H049G7_n7542CNDSPRTRUM, H049G7_A7543CNDSPRTRCANT, H049G7_n7543CNDSPRTRCANT,
            H049G7_A7544CNDSPRTRPUN, H049G7_n7544CNDSPRTRPUN, H049G7_A7545CNDSPRTRIMP, H049G7_n7545CNDSPRTRIMP, H049G7_A7546CNDSPRTRMON, H049G7_n7546CNDSPRTRMON, H049G7_A7547CNDSPRTRFIT, H049G7_n7547CNDSPRTRFIT, H049G7_A7548CNDSPRTRFFT, H049G7_n7548CNDSPRTRFFT,
            H049G7_A7549CNDSPRTRRES, H049G7_n7549CNDSPRTRRES, H049G7_A7550CNDSPRTRALC, H049G7_n7550CNDSPRTRALC, H049G7_A7551CNDSPRTROBS, H049G7_n7551CNDSPRTROBS, H049G7_A7600CNDSPRTRTDC, H049G7_n7600CNDSPRTRTDC, H049G7_A7601CNDSPRTRNDC, H049G7_n7601CNDSPRTRNDC,
            H049G7_A7602CNDSPRTRLINR, H049G7_n7602CNDSPRTRLINR
            }
            , new Object[] {
            H049G8_A18159CNDSPRSUBCONTIP, H049G8_n18159CNDSPRSUBCONTIP, H049G8_A7520CNDSPRNDC, H049G8_A7519CNDSPRTDC, H049G8_A7518CNDSPRCIA, H049G8_A18153CNDSPRSUBCONCLA, H049G8_n18153CNDSPRSUBCONCLA, H049G8_A18154CNDSPRSUBCONDSC, H049G8_n18154CNDSPRSUBCONDSC, H049G8_A18155CNDSPRSUBCONPREUNI,
            H049G8_n18155CNDSPRSUBCONPREUNI, H049G8_A18156CNDSPRSUBCONUNIMED, H049G8_n18156CNDSPRSUBCONUNIMED, H049G8_A18157CNDSPRSUBCONCAN, H049G8_n18157CNDSPRSUBCONCAN, H049G8_A18158CNDSPRSUBCONTOT, H049G8_n18158CNDSPRSUBCONTOT, H049G8_A18185CNDSPRSUBCONFECINI, H049G8_n18185CNDSPRSUBCONFECINI, H049G8_A18186CNDSPRSUBCONFECFIN,
            H049G8_n18186CNDSPRSUBCONFECFIN, H049G8_A18187CNDSPRSUBCONRES, H049G8_n18187CNDSPRSUBCONRES, H049G8_A18147CNDSPRSUBCONBASE, H049G8_n18147CNDSPRSUBCONBASE, H049G8_A18148CNDSPRSUBCONPERT, H049G8_n18148CNDSPRSUBCONPERT, H049G8_A18149CNDSPRSUBCONPERTN2, H049G8_n18149CNDSPRSUBCONPERTN2, H049G8_A18150CNDSPRSUBCONPERTN3,
            H049G8_n18150CNDSPRSUBCONPERTN3, H049G8_A18151CNDSPRSUBCONPERTN4, H049G8_n18151CNDSPRSUBCONPERTN4, H049G8_A18152CNDSPRSUBCONPERTN5, H049G8_n18152CNDSPRSUBCONPERTN5, H049G8_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G9_A8240AVDSPRMON, H049G9_A18201AVDSPR3CAN, H049G9_n18201AVDSPR3CAN
            }
            , new Object[] {
            H049G10_A7791AVDSPRTDC, H049G10_A7790AVDSPRNDC, H049G10_A7800AVDSPREST, H049G10_n7800AVDSPREST, H049G10_A7792AVDSPRLIN, H049G10_A20CNTDOCID, H049G10_A8255AVDSPRDOC, H049G10_A7789AVDSPRCIA, H049G10_A7862AVDSPRCAN, H049G10_n7862AVDSPRCAN,
            H049G10_A7795AVDSPRIMP, H049G10_n7795AVDSPRIMP
            }
            , new Object[] {
            H049G11_A46CNCDIRID, H049G11_A2882CNCDIRESTIMP, H049G11_n2882CNCDIRESTIMP
            }
            , new Object[] {
            H049G12_A18152CNDSPRSUBCONPERTN5, H049G12_n18152CNDSPRSUBCONPERTN5, H049G12_A18151CNDSPRSUBCONPERTN4, H049G12_n18151CNDSPRSUBCONPERTN4, H049G12_A18150CNDSPRSUBCONPERTN3, H049G12_n18150CNDSPRSUBCONPERTN3, H049G12_A18149CNDSPRSUBCONPERTN2, H049G12_n18149CNDSPRSUBCONPERTN2, H049G12_A18148CNDSPRSUBCONPERT, H049G12_n18148CNDSPRSUBCONPERT,
            H049G12_A18147CNDSPRSUBCONBASE, H049G12_n18147CNDSPRSUBCONBASE, H049G12_A18159CNDSPRSUBCONTIP, H049G12_n18159CNDSPRSUBCONTIP, H049G12_A7520CNDSPRNDC, H049G12_A7519CNDSPRTDC, H049G12_A7518CNDSPRCIA, H049G12_A18154CNDSPRSUBCONDSC, H049G12_n18154CNDSPRSUBCONDSC, H049G12_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G13_A18152CNDSPRSUBCONPERTN5, H049G13_n18152CNDSPRSUBCONPERTN5, H049G13_A18151CNDSPRSUBCONPERTN4, H049G13_n18151CNDSPRSUBCONPERTN4, H049G13_A18150CNDSPRSUBCONPERTN3, H049G13_n18150CNDSPRSUBCONPERTN3, H049G13_A18149CNDSPRSUBCONPERTN2, H049G13_n18149CNDSPRSUBCONPERTN2, H049G13_A18148CNDSPRSUBCONPERT, H049G13_n18148CNDSPRSUBCONPERT,
            H049G13_A18147CNDSPRSUBCONBASE, H049G13_n18147CNDSPRSUBCONBASE, H049G13_A18159CNDSPRSUBCONTIP, H049G13_n18159CNDSPRSUBCONTIP, H049G13_A7520CNDSPRNDC, H049G13_A7519CNDSPRTDC, H049G13_A7518CNDSPRCIA, H049G13_A18154CNDSPRSUBCONDSC, H049G13_n18154CNDSPRSUBCONDSC, H049G13_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G14_A18152CNDSPRSUBCONPERTN5, H049G14_n18152CNDSPRSUBCONPERTN5, H049G14_A18151CNDSPRSUBCONPERTN4, H049G14_n18151CNDSPRSUBCONPERTN4, H049G14_A18150CNDSPRSUBCONPERTN3, H049G14_n18150CNDSPRSUBCONPERTN3, H049G14_A18149CNDSPRSUBCONPERTN2, H049G14_n18149CNDSPRSUBCONPERTN2, H049G14_A18148CNDSPRSUBCONPERT, H049G14_n18148CNDSPRSUBCONPERT,
            H049G14_A18147CNDSPRSUBCONBASE, H049G14_n18147CNDSPRSUBCONBASE, H049G14_A18159CNDSPRSUBCONTIP, H049G14_n18159CNDSPRSUBCONTIP, H049G14_A7520CNDSPRNDC, H049G14_A7519CNDSPRTDC, H049G14_A7518CNDSPRCIA, H049G14_A18154CNDSPRSUBCONDSC, H049G14_n18154CNDSPRSUBCONDSC, H049G14_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G15_A18152CNDSPRSUBCONPERTN5, H049G15_n18152CNDSPRSUBCONPERTN5, H049G15_A18151CNDSPRSUBCONPERTN4, H049G15_n18151CNDSPRSUBCONPERTN4, H049G15_A18150CNDSPRSUBCONPERTN3, H049G15_n18150CNDSPRSUBCONPERTN3, H049G15_A18149CNDSPRSUBCONPERTN2, H049G15_n18149CNDSPRSUBCONPERTN2, H049G15_A18148CNDSPRSUBCONPERT, H049G15_n18148CNDSPRSUBCONPERT,
            H049G15_A18147CNDSPRSUBCONBASE, H049G15_n18147CNDSPRSUBCONBASE, H049G15_A18159CNDSPRSUBCONTIP, H049G15_n18159CNDSPRSUBCONTIP, H049G15_A7520CNDSPRNDC, H049G15_A7519CNDSPRTDC, H049G15_A7518CNDSPRCIA, H049G15_A18154CNDSPRSUBCONDSC, H049G15_n18154CNDSPRSUBCONDSC, H049G15_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G16_A18152CNDSPRSUBCONPERTN5, H049G16_n18152CNDSPRSUBCONPERTN5, H049G16_A18151CNDSPRSUBCONPERTN4, H049G16_n18151CNDSPRSUBCONPERTN4, H049G16_A18150CNDSPRSUBCONPERTN3, H049G16_n18150CNDSPRSUBCONPERTN3, H049G16_A18149CNDSPRSUBCONPERTN2, H049G16_n18149CNDSPRSUBCONPERTN2, H049G16_A18148CNDSPRSUBCONPERT, H049G16_n18148CNDSPRSUBCONPERT,
            H049G16_A18147CNDSPRSUBCONBASE, H049G16_n18147CNDSPRSUBCONBASE, H049G16_A18159CNDSPRSUBCONTIP, H049G16_n18159CNDSPRSUBCONTIP, H049G16_A7520CNDSPRNDC, H049G16_A7519CNDSPRTDC, H049G16_A7518CNDSPRCIA, H049G16_A18154CNDSPRSUBCONDSC, H049G16_n18154CNDSPRSUBCONDSC, H049G16_A18146CNDSPRSUBCONID
            }
            , new Object[] {
            H049G17_A7540CNDSPRTRLIN, H049G17_A7520CNDSPRNDC, H049G17_A7519CNDSPRTDC, H049G17_A7518CNDSPRCIA, H049G17_A7550CNDSPRTRALC, H049G17_n7550CNDSPRTRALC
            }
            , new Object[] {
            H049G18_A8240AVDSPRMON, H049G18_A18201AVDSPR3CAN, H049G18_n18201AVDSPR3CAN
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCntdocdsc_Enabled = 0 ;
      edtavCndsprndc_Enabled = 0 ;
      edtavPmctprdsc_Enabled = 0 ;
      edtavCndsprrescon_Enabled = 0 ;
      edtavCncdirnom_g_Enabled = 0 ;
      edtavCncdirnom_Enabled = 0 ;
      edtavCndsprcon_Enabled = 0 ;
      edtavCndsprtrndc_Enabled = 0 ;
      edtavCndsprtrlinr_Enabled = 0 ;
      edtavCndsprtrfit_c_Enabled = 0 ;
      edtavCndsprtrfft_c_Enabled = 0 ;
      edtavCndsprtralc_Enabled = 0 ;
      edtavCndsprtrpun_Enabled = 0 ;
      edtavCndsprtrcant_Enabled = 0 ;
      edtavCndsprtrum_Enabled = 0 ;
      edtavCndsprtrimp_Enabled = 0 ;
      edtavCndsprtrmon_Enabled = 0 ;
      edtavMontoacumulado_Enabled = 0 ;
      edtavMonto_Enabled = 0 ;
      edtavMontopendiente_Enabled = 0 ;
      edtavCapmont_Enabled = 0 ;
      edtavCantpendiente_Enabled = 0 ;
      edtavGcndsprsubconcla_Enabled = 0 ;
      edtavCacndsprsubcondsc_Enabled = 0 ;
      edtavGcndsprsubcondsc_Enabled = 0 ;
      edtavGcndsprsubconunimed_Enabled = 0 ;
      edtavGcndsprsubconcan_Enabled = 0 ;
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      edtavGcndsprsubcontot_Enabled = 0 ;
      edtavAvdsprmon_Enabled = 0 ;
      edtavGscaavdspr3can_Enabled = 0 ;
      edtavGscaavdsprmon_Enabled = 0 ;
      edtavGscpavdspr3can_Enabled = 0 ;
      edtavGscpavdsprmon_Enabled = 0 ;
      edtavGcndsprsubcontip_Enabled = 0 ;
      edtavGcndsprsubconfecini_Enabled = 0 ;
      edtavGcndsprsubconfecfin_Enabled = 0 ;
      edtavGcndsprsubconres_Enabled = 0 ;
      edtavCndsprtrlin_s_Enabled = 0 ;
      edtavGcndsprsubconid_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte AV86Mes_proc ;
   private byte GXv_int15[] ;
   private byte AV171GXLvl552 ;
   private byte AV172GXLvl573 ;
   private byte AV173GXLvl594 ;
   private byte AV174GXLvl615 ;
   private byte AV175GXLvl636 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Backstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private short nRC_GXsfl_203 ;
   private short nGXsfl_203_idx=1 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRC_GXsfl_62 ;
   private short nGXsfl_62_idx=1 ;
   private short AV138BANDAUT ;
   private short A7884NIVAUTAVNIV ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short subGrid1_Borderwidth ;
   private short AV85ano_proc ;
   private short GXv_int14[] ;
   private short nGXsfl_62_fel_idx=1 ;
   private int edtavCapcant_Visible ;
   private int AV177GXV10 ;
   private int AV176GXV9 ;
   private int AV24CNDSPRTRLINR ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int edtavCntdocdsc_Enabled ;
   private int edtavCndsprndc_Enabled ;
   private int edtavPmctprdsc_Enabled ;
   private int edtavCndsprrescon_Enabled ;
   private int edtavCncdirnom_g_Enabled ;
   private int edtavCncdirnom_Enabled ;
   private int edtavCndsprcon_Enabled ;
   private int edtavCndsprtrndc_Enabled ;
   private int edtavCndsprtrlinr_Enabled ;
   private int edtavCndsprtrfit_c_Enabled ;
   private int edtavCndsprtrfft_c_Enabled ;
   private int edtavCndsprtralc_Enabled ;
   private int edtavCndsprtrpun_Enabled ;
   private int edtavCndsprtrcant_Enabled ;
   private int edtavCndsprtrum_Enabled ;
   private int edtavCndsprtrimp_Enabled ;
   private int edtavCndsprtrmon_Enabled ;
   private int edtavMontoacumulado_Enabled ;
   private int edtavMonto_Enabled ;
   private int edtavMontopendiente_Enabled ;
   private int edtavCapmont_Enabled ;
   private int edtavCantpendiente_Enabled ;
   private int edtavGcndsprsubconcla_Enabled ;
   private int edtavCacndsprsubcondsc_Enabled ;
   private int edtavGcndsprsubcondsc_Enabled ;
   private int edtavGcndsprsubconunimed_Enabled ;
   private int edtavGcndsprsubconcan_Enabled ;
   private int edtavGcndsprsubconpreuni_Enabled ;
   private int edtavGcndsprsubcontot_Enabled ;
   private int edtavAvdsprmon_Enabled ;
   private int edtavGscaavdspr3can_Enabled ;
   private int edtavGscaavdsprmon_Enabled ;
   private int edtavGscpavdspr3can_Enabled ;
   private int edtavGscpavdsprmon_Enabled ;
   private int edtavGcndsprsubcontip_Enabled ;
   private int edtavGcndsprsubconfecini_Enabled ;
   private int edtavGcndsprsubconfecfin_Enabled ;
   private int edtavGcndsprsubconres_Enabled ;
   private int edtavCndsprtrlin_s_Enabled ;
   private int edtavGcndsprsubconid_Enabled ;
   private int subGrid1_Width ;
   private int subGrid2_Width ;
   private int lblTxtscript_Visible ;
   private int lblTxtestilos_Visible ;
   private int tblTable6_Visible ;
   private int lblTxtcantidad4_Visible ;
   private int edtavCndsprcon_Visible ;
   private int lblTxtabrirdet_Visible ;
   private int edtavDetcndsprsubconid_Visible ;
   private int edtavDetcndsprtrlin_Visible ;
   private int edtavDetavdsprmon_Visible ;
   private int A7602CNDSPRTRLINR ;
   private int edtavAvdspr3can_Enabled ;
   private int AV159GXV1 ;
   private int AV163GXV3 ;
   private int AV164GXV4 ;
   private int AV165GXV5 ;
   private int AV166GXV6 ;
   private int AV168GXV7 ;
   private int AV169GXV8 ;
   private int AV179GXV11 ;
   private int AV160GXV2 ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavAvdspr3can_Visible ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCndsprtrndc_Visible ;
   private int edtavCndsprtrlinr_Visible ;
   private int edtavCndsprtrfit_c_Visible ;
   private int edtavCndsprtrfft_c_Visible ;
   private int edtavCndsprtralc_Visible ;
   private int edtavCndsprtrpun_Visible ;
   private int edtavCndsprtrcant_Visible ;
   private int edtavCndsprtrum_Visible ;
   private int edtavCndsprtrimp_Visible ;
   private int edtavCndsprtrmon_Visible ;
   private int edtavMontoacumulado_Visible ;
   private int edtavMonto_Visible ;
   private int edtavMontopendiente_Visible ;
   private int edtavAvdsprobs_Enabled ;
   private int edtavAvdsprobs_Visible ;
   private int edtavCapmont_Visible ;
   private int edtavCantpendiente_Visible ;
   private int edtavCapcant_Enabled ;
   private int edtavFi_Enabled ;
   private int edtavFi_Visible ;
   private int edtavFf_Enabled ;
   private int edtavFf_Visible ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private long A7789AVDSPRCIA ;
   private long AV8CNDSPRCIA ;
   private long A8255AVDSPRDOC ;
   private long AV9CNDSPRNDC ;
   private long A8239AVDSPRSPID ;
   private long AV52gCNDSPRSUBCONID ;
   private long AV94auxCNDSPRSUBCONID ;
   private long A7518CNDSPRCIA ;
   private long A7520CNDSPRNDC ;
   private long AV23CNDSPRTRNDC ;
   private long GRID2_nCurrentRecord ;
   private long GRID1_nCurrentRecord ;
   private long AV53CNDSPRCON ;
   private long AV123DETCNDSPRSUBCONID ;
   private long A7522CNDSPRCON ;
   private long A6299PMCTPREJ ;
   private long AV93PMCTPREJ ;
   private long A46CNCDIRID ;
   private long A7541CNDSPRTRACT ;
   private long A7601CNDSPRTRNDC ;
   private long A18147CNDSPRSUBCONBASE ;
   private long A18148CNDSPRSUBCONPERT ;
   private long A18149CNDSPRSUBCONPERTN2 ;
   private long A18150CNDSPRSUBCONPERTN3 ;
   private long A18151CNDSPRSUBCONPERTN4 ;
   private long A18152CNDSPRSUBCONPERTN5 ;
   private long A18146CNDSPRSUBCONID ;
   private long AV103CNDSPRSUBCONBASE ;
   private long AV105CNDSPRSUBCONPERT ;
   private long AV106CNDSPRSUBCONPERTN2 ;
   private long AV107CNDSPRSUBCONPERTN3 ;
   private long AV104CNDSPRSUBCONPERTN4 ;
   private long AV108CNDSPRSUBCONPERTN5 ;
   private long AV42CNDSPRTRACT ;
   private long AV66numreg ;
   private long AV81CNDSPRNDC_GEN ;
   private long GXv_int4[] ;
   private long GXv_int5[] ;
   private long GXv_int6[] ;
   private long AV145renglon ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private java.math.BigDecimal AV46CNDSPRTRLIN ;
   private java.math.BigDecimal AV38AVDSPRMON_ASI ;
   private java.math.BigDecimal AV127AVDSPR3CAN_ASI ;
   private java.math.BigDecimal A7792AVDSPRLIN ;
   private java.math.BigDecimal A8240AVDSPRMON ;
   private java.math.BigDecimal A18201AVDSPR3CAN ;
   private java.math.BigDecimal AV29CNDSPRTRCANT ;
   private java.math.BigDecimal AV31CNDSPRTRIMP ;
   private java.math.BigDecimal AV72MONTO ;
   private java.math.BigDecimal AV133MONTOACUMULADO ;
   private java.math.BigDecimal AV75cantpendiente ;
   private java.math.BigDecimal AV76montopendiente ;
   private java.math.BigDecimal AV116csCAPMONT ;
   private java.math.BigDecimal AV65CAPMONT_AUX ;
   private java.math.BigDecimal AV95auxAVDSPRMON ;
   private java.math.BigDecimal AV28CNDSPRTRPUN ;
   private java.math.BigDecimal AV34CAPMONT ;
   private java.math.BigDecimal AV83CAPCANT ;
   private java.math.BigDecimal AV57gCNDSPRSUBCONCAN ;
   private java.math.BigDecimal AV55gCNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal AV58gCNDSPRSUBCONTOT ;
   private java.math.BigDecimal AV63AVDSPR3CAN ;
   private java.math.BigDecimal AV39AVDSPRMON ;
   private java.math.BigDecimal AV128gscpAVDSPR3CAN ;
   private java.math.BigDecimal AV129gscpAVDSPRMON ;
   private java.math.BigDecimal AV37CNDSPRTRLIN_S ;
   private java.math.BigDecimal AV122DETCNDSPRTRLIN ;
   private java.math.BigDecimal AV124DETAVDSPRMON ;
   private java.math.BigDecimal A7641CNDSPRTCMB ;
   private java.math.BigDecimal AV21CNDSPRTCMB ;
   private java.math.BigDecimal A7540CNDSPRTRLIN ;
   private java.math.BigDecimal A7543CNDSPRTRCANT ;
   private java.math.BigDecimal A7544CNDSPRTRPUN ;
   private java.math.BigDecimal A7545CNDSPRTRIMP ;
   private java.math.BigDecimal A18155CNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal A18157CNDSPRSUBCONCAN ;
   private java.math.BigDecimal A18158CNDSPRSUBCONTOT ;
   private java.math.BigDecimal c8240AVDSPRMON ;
   private java.math.BigDecimal c18201AVDSPR3CAN ;
   private java.math.BigDecimal AV71CANTTOT ;
   private java.math.BigDecimal A7862AVDSPRCAN ;
   private java.math.BigDecimal A7795AVDSPRIMP ;
   private java.math.BigDecimal AV73AVDSPRCAN ;
   private java.math.BigDecimal AV74AVDSPRIMP ;
   private java.math.BigDecimal AV77diferencia ;
   private java.math.BigDecimal AV35AVDSPRPORAVOBR_C ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV102auxCAPMONT ;
   private java.math.BigDecimal AV134auxCAPCANT ;
   private java.math.BigDecimal AV146AAVDSPRMON_ASI ;
   private java.math.BigDecimal AV147AAVDSPR3CAN_ASI ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_203_idx="0001" ;
   private String AV110caCNDSPRSUBCONDSC ;
   private String A20CNTDOCID ;
   private String AV10CNDSPRTDC ;
   private String A7800AVDSPREST ;
   private String AV12PMCTPRDSC ;
   private String AV18PMCTPRID ;
   private String AV15CNCDIRNOM_G ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sGXsfl_62_idx="0001" ;
   private String edtavCapcant_Internalname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV68TipoMensaje ;
   private String AV82CNDSPRTDC_GEN ;
   private String AV5CNUSERID ;
   private String A8263NIVAUTAVPRY ;
   private String A7883NIVAUTAVTDC ;
   private String A7886NIVAUTAVUSR ;
   private String AV80dGenerados ;
   private String A7519CNDSPRTDC ;
   private String Jsmsgbox1_Width ;
   private String Jsmsgbox1_Height ;
   private String Jsmsgbox1_Texto ;
   private String Jsmsgbox1_Botones ;
   private String Jsmsgbox1_Texto_boton_ok ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCndsprtrndc_Internalname ;
   private String edtavCndsprtrlinr_Internalname ;
   private String AV25CNDSPRTRFIT_C ;
   private String edtavCndsprtrfit_c_Internalname ;
   private String AV26CNDSPRTRFFT_C ;
   private String edtavCndsprtrfft_c_Internalname ;
   private String edtavCndsprtralc_Internalname ;
   private String edtavCndsprtrpun_Internalname ;
   private String edtavCndsprtrcant_Internalname ;
   private String AV30CNDSPRTRUM ;
   private String edtavCndsprtrum_Internalname ;
   private String edtavCndsprtrimp_Internalname ;
   private String AV32CNDSPRTRMON ;
   private String edtavCndsprtrmon_Internalname ;
   private String edtavMontoacumulado_Internalname ;
   private String edtavMonto_Internalname ;
   private String edtavMontopendiente_Internalname ;
   private String AV84AVDSPROBS ;
   private String edtavAvdsprobs_Internalname ;
   private String edtavCapmont_Internalname ;
   private String edtavCantpendiente_Internalname ;
   private String edtavFi_Internalname ;
   private String edtavFf_Internalname ;
   private String AV54gCNDSPRSUBCONCLA ;
   private String edtavGcndsprsubconcla_Internalname ;
   private String edtavCacndsprsubcondsc_Internalname ;
   private String AV51gCNDSPRSUBCONDSC ;
   private String edtavGcndsprsubcondsc_Internalname ;
   private String AV56gCNDSPRSUBCONUNIMED ;
   private String edtavGcndsprsubconunimed_Internalname ;
   private String edtavGcndsprsubconcan_Internalname ;
   private String edtavGcndsprsubconpreuni_Internalname ;
   private String edtavGcndsprsubcontot_Internalname ;
   private String edtavAvdspr3can_Internalname ;
   private String edtavAvdsprmon_Internalname ;
   private String edtavGscaavdspr3can_Internalname ;
   private String edtavGscaavdsprmon_Internalname ;
   private String edtavGscpavdspr3can_Internalname ;
   private String edtavGscpavdsprmon_Internalname ;
   private String AV59gCNDSPRSUBCONTIP ;
   private String edtavGcndsprsubcontip_Internalname ;
   private String edtavGcndsprsubconfecini_Internalname ;
   private String edtavGcndsprsubconfecfin_Internalname ;
   private String AV62gCNDSPRSUBCONRES ;
   private String edtavGcndsprsubconres_Internalname ;
   private String edtavCndsprtrlin_s_Internalname ;
   private String edtavGcndsprsubconid_Internalname ;
   private String edtavCntdocdsc_Internalname ;
   private String edtavCndsprndc_Internalname ;
   private String edtavPmctprdsc_Internalname ;
   private String edtavCndsprrescon_Internalname ;
   private String edtavCncdirnom_g_Internalname ;
   private String edtavCncdirnom_Internalname ;
   private String edtavCndsprcon_Internalname ;
   private String AV11cntdocdsc ;
   private String AV22CNDSPRRESCON ;
   private String AV16CNCDIRNOM ;
   private String edtavDetcndsprsubconid_Internalname ;
   private String edtavDetcndsprtrlin_Internalname ;
   private String edtavDetavdsprmon_Internalname ;
   private String hsh ;
   private String lblTxtguardar_Caption ;
   private String lblTxtguardar_Internalname ;
   private String lblTxtsalir_Caption ;
   private String lblTxtsalir_Internalname ;
   private String lblTxtexportar_Caption ;
   private String lblTxtexportar_Internalname ;
   private String AV118MENREGAVA ;
   private String lblTxtscript_Internalname ;
   private String lblTxtestilos_Internalname ;
   private String tblTable6_Internalname ;
   private String lblTxtcantidad4_Internalname ;
   private String lblTxtabrirdet_Internalname ;
   private String scmdbuf ;
   private String A7521CNDSPRPRID ;
   private String A7527CNDSPRMON ;
   private String A7530CNDSPRRESCON ;
   private String AV19PMCTPRUNNG ;
   private String AV20CNDSPRMON ;
   private String A21CNTDOCDSC ;
   private String A171PMCTPRID ;
   private String A194CNCDIRNOM ;
   private String lblTxtscript_Caption ;
   private String lblTxtestilos_Caption ;
   private String A7542CNDSPRTRUM ;
   private String A7546CNDSPRTRMON ;
   private String A7549CNDSPRTRRES ;
   private String A7600CNDSPRTRTDC ;
   private String A18154CNDSPRSUBCONDSC ;
   private String A18159CNDSPRSUBCONTIP ;
   private String A18153CNDSPRSUBCONCLA ;
   private String A18156CNDSPRSUBCONUNIMED ;
   private String A18187CNDSPRSUBCONRES ;
   private String AV13CNDSPRTRRES ;
   private String AV49CNDSPRTRTDC ;
   private String AV87AVDSPREST ;
   private String Jsmsgbox1_Internalname ;
   private String AV67AVDSPRUM_C ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String A2882CNCDIRESTIMP ;
   private String AV92EstructImpId ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String AV140rutaArchivo ;
   private String GXt_char1 ;
   private String GXv_char16[] ;
   private String AV142Path ;
   private String AV143Ruta ;
   private String AV148AbrirRutaArchivo ;
   private String edtavGscaavdsprmon_Class ;
   private String edtavGscaavdspr3can_Class ;
   private String tblKdstablacontenido_Internalname ;
   private String lblTxtguardar_Jsonclick ;
   private String lblTxtexportar_Jsonclick ;
   private String lblTxtsalir_Jsonclick ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Header ;
   private String lblTextblock21_Caption ;
   private String lblTextblock22_Caption ;
   private String lblTextblock31_Caption ;
   private String lblTextblock30_Caption ;
   private String lblTextblock5_Caption ;
   private String lblTextblock17_Caption ;
   private String lblTextblock14_Caption ;
   private String lblTextblock24_Caption ;
   private String lblTextblock25_Caption ;
   private String lblTextblock26_Caption ;
   private String lblTextblock19_Caption ;
   private String lblTextblock23_Caption ;
   private String lblTxtcantidad6_Caption ;
   private String lblTxtcantidad4_Caption ;
   private String lblTextblock1_Caption ;
   private String lblTextblock2_Caption ;
   private String lblTextblock33_Caption ;
   private String lblTxtscript_Jsonclick ;
   private String lblTxtestilos_Jsonclick ;
   private String Msj_Title ;
   private String Msj_Internalname ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String edtavCntdocdsc_Jsonclick ;
   private String edtavCndsprndc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtavPmctprdsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavCndsprcon_Jsonclick ;
   private String lblTxtabrirdet_Jsonclick ;
   private String edtavDetcndsprsubconid_Jsonclick ;
   private String edtavDetcndsprtrlin_Jsonclick ;
   private String edtavDetavdsprmon_Jsonclick ;
   private String sGXsfl_203_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String ROClassString ;
   private String edtavGcndsprsubconcla_Jsonclick ;
   private String edtavCacndsprsubcondsc_Jsonclick ;
   private String edtavGcndsprsubcondsc_Jsonclick ;
   private String edtavGcndsprsubconunimed_Jsonclick ;
   private String edtavGcndsprsubconcan_Jsonclick ;
   private String edtavGcndsprsubconpreuni_Jsonclick ;
   private String edtavGcndsprsubcontot_Jsonclick ;
   private String edtavAvdspr3can_Jsonclick ;
   private String edtavAvdsprmon_Jsonclick ;
   private String edtavGscaavdspr3can_Jsonclick ;
   private String edtavGscaavdsprmon_Jsonclick ;
   private String edtavGscpavdspr3can_Jsonclick ;
   private String edtavGscpavdsprmon_Jsonclick ;
   private String edtavGcndsprsubcontip_Jsonclick ;
   private String edtavGcndsprsubconfecini_Jsonclick ;
   private String edtavGcndsprsubconfecfin_Jsonclick ;
   private String edtavGcndsprsubconres_Jsonclick ;
   private String edtavCndsprtrlin_s_Jsonclick ;
   private String edtavGcndsprsubconid_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock23_Internalname ;
   private String lblTxtcantidad6_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock33_Internalname ;
   private String subGrid2_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable5_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable12_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtavCndsprtrndc_Jsonclick ;
   private String lblTextblock22_Jsonclick ;
   private String edtavCndsprtrlinr_Jsonclick ;
   private String tblTable3_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtavCndsprtrfit_c_Jsonclick ;
   private String lblTextblock30_Jsonclick ;
   private String edtavCndsprtrfft_c_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavCndsprtrpun_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtavCndsprtrcant_Jsonclick ;
   private String edtavCndsprtrum_Jsonclick ;
   private String lblTextblock24_Jsonclick ;
   private String edtavCndsprtrimp_Jsonclick ;
   private String edtavCndsprtrmon_Jsonclick ;
   private String lblTextblock25_Jsonclick ;
   private String edtavMontoacumulado_Jsonclick ;
   private String lblTextblock26_Jsonclick ;
   private String edtavMonto_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtavMontopendiente_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String tblTable15_Internalname ;
   private String lblTxtcantidad6_Jsonclick ;
   private String edtavCapmont_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtavCantpendiente_Jsonclick ;
   private String lblTxtcantidad4_Jsonclick ;
   private String edtavCapcant_Jsonclick ;
   private String tblTable16_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavFi_Jsonclick ;
   private String lblTextblock2_Jsonclick ;
   private String edtavFf_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String subGrid2_Header ;
   private String GXCCtl ;
   private java.util.Date AV130FI ;
   private java.util.Date AV131FF ;
   private java.util.Date AV60gCNDSPRSUBCONFECINI ;
   private java.util.Date AV61gCNDSPRSUBCONFECFIN ;
   private java.util.Date A7547CNDSPRTRFIT ;
   private java.util.Date A7548CNDSPRTRFFT ;
   private java.util.Date A18185CNDSPRSUBCONFECINI ;
   private java.util.Date A18186CNDSPRSUBCONFECFIN ;
   private java.util.Date AV43CNDSPRTRFIT ;
   private java.util.Date AV44CNDSPRTRFFT ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date GXv_date19[] ;
   private boolean entryPointCalled ;
   private boolean n7800AVDSPREST ;
   private boolean n18201AVDSPR3CAN ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean AV64continuar ;
   private boolean AV132faltaPeriodo ;
   private boolean AV78montomayor ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_203_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n7521CNDSPRPRID ;
   private boolean n7522CNDSPRCON ;
   private boolean n7527CNDSPRMON ;
   private boolean n7641CNDSPRTCMB ;
   private boolean n7530CNDSPRRESCON ;
   private boolean n21CNTDOCDSC ;
   private boolean n6299PMCTPREJ ;
   private boolean n194CNCDIRNOM ;
   private boolean n7541CNDSPRTRACT ;
   private boolean n7542CNDSPRTRUM ;
   private boolean n7543CNDSPRTRCANT ;
   private boolean n7544CNDSPRTRPUN ;
   private boolean n7545CNDSPRTRIMP ;
   private boolean n7546CNDSPRTRMON ;
   private boolean n7547CNDSPRTRFIT ;
   private boolean n7548CNDSPRTRFFT ;
   private boolean n7549CNDSPRTRRES ;
   private boolean n7550CNDSPRTRALC ;
   private boolean n7551CNDSPRTROBS ;
   private boolean n7600CNDSPRTRTDC ;
   private boolean n7601CNDSPRTRNDC ;
   private boolean n7602CNDSPRTRLINR ;
   private boolean n18159CNDSPRSUBCONTIP ;
   private boolean n18153CNDSPRSUBCONCLA ;
   private boolean n18154CNDSPRSUBCONDSC ;
   private boolean n18155CNDSPRSUBCONPREUNI ;
   private boolean n18156CNDSPRSUBCONUNIMED ;
   private boolean n18157CNDSPRSUBCONCAN ;
   private boolean n18158CNDSPRSUBCONTOT ;
   private boolean n18185CNDSPRSUBCONFECINI ;
   private boolean n18186CNDSPRSUBCONFECFIN ;
   private boolean n18187CNDSPRSUBCONRES ;
   private boolean n18147CNDSPRSUBCONBASE ;
   private boolean n18148CNDSPRSUBCONPERT ;
   private boolean n18149CNDSPRSUBCONPERTN2 ;
   private boolean n18150CNDSPRSUBCONPERTN3 ;
   private boolean n18151CNDSPRSUBCONPERTN4 ;
   private boolean n18152CNDSPRSUBCONPERTN5 ;
   private boolean n7862AVDSPRCAN ;
   private boolean n7795AVDSPRIMP ;
   private boolean AV136observaciones ;
   private boolean AV79pMensaje ;
   private boolean AV17ultimoRegistroDelServicio ;
   private boolean GXv_boolean17[] ;
   private boolean n2882CNCDIRESTIMP ;
   private boolean AV109agrupadorEncontrado ;
   private String A7550CNDSPRTRALC ;
   private String AV27CNDSPRTRALC ;
   private String A7551CNDSPRTROBS ;
   private String AV48CNDSPRTROBS ;
   private String AV139mensaje ;
   private String AV149CNDSPRALCTR ;
   private String AV70mensajeFinal ;
   private String AV126gscaAVDSPR3CAN ;
   private String AV117gscaAVDSPRMON ;
   private String AV141nombreArchivo ;
   private String AV120AbrirDetalle ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.gxoffice.ExcelDoc AV144ExcelDocument ;
   private com.genexus.webpanels.WebSession AV6session ;
   private com.genexus.webpanels.GXUserControl ucJsmsgbox1 ;
   private com.genexus.webpanels.GXUserControl ucMsj ;
   private IDataStoreProvider pr_default ;
   private long[] H049G2_A7520CNDSPRNDC ;
   private String[] H049G2_A7519CNDSPRTDC ;
   private long[] H049G2_A7518CNDSPRCIA ;
   private String[] H049G2_A7521CNDSPRPRID ;
   private boolean[] H049G2_n7521CNDSPRPRID ;
   private long[] H049G2_A7522CNDSPRCON ;
   private boolean[] H049G2_n7522CNDSPRCON ;
   private String[] H049G2_A7527CNDSPRMON ;
   private boolean[] H049G2_n7527CNDSPRMON ;
   private java.math.BigDecimal[] H049G2_A7641CNDSPRTCMB ;
   private boolean[] H049G2_n7641CNDSPRTCMB ;
   private String[] H049G2_A7530CNDSPRRESCON ;
   private boolean[] H049G2_n7530CNDSPRRESCON ;
   private String[] H049G3_A20CNTDOCID ;
   private String[] H049G3_A21CNTDOCDSC ;
   private boolean[] H049G3_n21CNTDOCDSC ;
   private String[] H049G4_A171PMCTPRID ;
   private long[] H049G4_A6299PMCTPREJ ;
   private boolean[] H049G4_n6299PMCTPREJ ;
   private long[] H049G5_A46CNCDIRID ;
   private String[] H049G5_A194CNCDIRNOM ;
   private boolean[] H049G5_n194CNCDIRNOM ;
   private String[] H049G6_A7886NIVAUTAVUSR ;
   private String[] H049G6_A7883NIVAUTAVTDC ;
   private String[] H049G6_A8263NIVAUTAVPRY ;
   private short[] H049G6_A7884NIVAUTAVNIV ;
   private long[] H049G7_A7520CNDSPRNDC ;
   private String[] H049G7_A7519CNDSPRTDC ;
   private long[] H049G7_A7518CNDSPRCIA ;
   private java.math.BigDecimal[] H049G7_A7540CNDSPRTRLIN ;
   private long[] H049G7_A7541CNDSPRTRACT ;
   private boolean[] H049G7_n7541CNDSPRTRACT ;
   private String[] H049G7_A7542CNDSPRTRUM ;
   private boolean[] H049G7_n7542CNDSPRTRUM ;
   private java.math.BigDecimal[] H049G7_A7543CNDSPRTRCANT ;
   private boolean[] H049G7_n7543CNDSPRTRCANT ;
   private java.math.BigDecimal[] H049G7_A7544CNDSPRTRPUN ;
   private boolean[] H049G7_n7544CNDSPRTRPUN ;
   private java.math.BigDecimal[] H049G7_A7545CNDSPRTRIMP ;
   private boolean[] H049G7_n7545CNDSPRTRIMP ;
   private String[] H049G7_A7546CNDSPRTRMON ;
   private boolean[] H049G7_n7546CNDSPRTRMON ;
   private java.util.Date[] H049G7_A7547CNDSPRTRFIT ;
   private boolean[] H049G7_n7547CNDSPRTRFIT ;
   private java.util.Date[] H049G7_A7548CNDSPRTRFFT ;
   private boolean[] H049G7_n7548CNDSPRTRFFT ;
   private String[] H049G7_A7549CNDSPRTRRES ;
   private boolean[] H049G7_n7549CNDSPRTRRES ;
   private String[] H049G7_A7550CNDSPRTRALC ;
   private boolean[] H049G7_n7550CNDSPRTRALC ;
   private String[] H049G7_A7551CNDSPRTROBS ;
   private boolean[] H049G7_n7551CNDSPRTROBS ;
   private String[] H049G7_A7600CNDSPRTRTDC ;
   private boolean[] H049G7_n7600CNDSPRTRTDC ;
   private long[] H049G7_A7601CNDSPRTRNDC ;
   private boolean[] H049G7_n7601CNDSPRTRNDC ;
   private int[] H049G7_A7602CNDSPRTRLINR ;
   private boolean[] H049G7_n7602CNDSPRTRLINR ;
   private String[] H049G8_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G8_n18159CNDSPRSUBCONTIP ;
   private long[] H049G8_A7520CNDSPRNDC ;
   private String[] H049G8_A7519CNDSPRTDC ;
   private long[] H049G8_A7518CNDSPRCIA ;
   private String[] H049G8_A18153CNDSPRSUBCONCLA ;
   private boolean[] H049G8_n18153CNDSPRSUBCONCLA ;
   private String[] H049G8_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G8_n18154CNDSPRSUBCONDSC ;
   private java.math.BigDecimal[] H049G8_A18155CNDSPRSUBCONPREUNI ;
   private boolean[] H049G8_n18155CNDSPRSUBCONPREUNI ;
   private String[] H049G8_A18156CNDSPRSUBCONUNIMED ;
   private boolean[] H049G8_n18156CNDSPRSUBCONUNIMED ;
   private java.math.BigDecimal[] H049G8_A18157CNDSPRSUBCONCAN ;
   private boolean[] H049G8_n18157CNDSPRSUBCONCAN ;
   private java.math.BigDecimal[] H049G8_A18158CNDSPRSUBCONTOT ;
   private boolean[] H049G8_n18158CNDSPRSUBCONTOT ;
   private java.util.Date[] H049G8_A18185CNDSPRSUBCONFECINI ;
   private boolean[] H049G8_n18185CNDSPRSUBCONFECINI ;
   private java.util.Date[] H049G8_A18186CNDSPRSUBCONFECFIN ;
   private boolean[] H049G8_n18186CNDSPRSUBCONFECFIN ;
   private String[] H049G8_A18187CNDSPRSUBCONRES ;
   private boolean[] H049G8_n18187CNDSPRSUBCONRES ;
   private long[] H049G8_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G8_n18147CNDSPRSUBCONBASE ;
   private long[] H049G8_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G8_n18148CNDSPRSUBCONPERT ;
   private long[] H049G8_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G8_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G8_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G8_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G8_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G8_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G8_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G8_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G8_A18146CNDSPRSUBCONID ;
   private java.math.BigDecimal[] H049G9_A8240AVDSPRMON ;
   private java.math.BigDecimal[] H049G9_A18201AVDSPR3CAN ;
   private boolean[] H049G9_n18201AVDSPR3CAN ;
   private String[] H049G10_A7791AVDSPRTDC ;
   private long[] H049G10_A7790AVDSPRNDC ;
   private String[] H049G10_A7800AVDSPREST ;
   private boolean[] H049G10_n7800AVDSPREST ;
   private java.math.BigDecimal[] H049G10_A7792AVDSPRLIN ;
   private String[] H049G10_A20CNTDOCID ;
   private long[] H049G10_A8255AVDSPRDOC ;
   private long[] H049G10_A7789AVDSPRCIA ;
   private java.math.BigDecimal[] H049G10_A7862AVDSPRCAN ;
   private boolean[] H049G10_n7862AVDSPRCAN ;
   private java.math.BigDecimal[] H049G10_A7795AVDSPRIMP ;
   private boolean[] H049G10_n7795AVDSPRIMP ;
   private long[] H049G11_A46CNCDIRID ;
   private String[] H049G11_A2882CNCDIRESTIMP ;
   private boolean[] H049G11_n2882CNCDIRESTIMP ;
   private long[] H049G12_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G12_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G12_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G12_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G12_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G12_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G12_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G12_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G12_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G12_n18148CNDSPRSUBCONPERT ;
   private long[] H049G12_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G12_n18147CNDSPRSUBCONBASE ;
   private String[] H049G12_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G12_n18159CNDSPRSUBCONTIP ;
   private long[] H049G12_A7520CNDSPRNDC ;
   private String[] H049G12_A7519CNDSPRTDC ;
   private long[] H049G12_A7518CNDSPRCIA ;
   private String[] H049G12_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G12_n18154CNDSPRSUBCONDSC ;
   private long[] H049G12_A18146CNDSPRSUBCONID ;
   private long[] H049G13_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G13_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G13_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G13_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G13_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G13_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G13_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G13_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G13_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G13_n18148CNDSPRSUBCONPERT ;
   private long[] H049G13_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G13_n18147CNDSPRSUBCONBASE ;
   private String[] H049G13_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G13_n18159CNDSPRSUBCONTIP ;
   private long[] H049G13_A7520CNDSPRNDC ;
   private String[] H049G13_A7519CNDSPRTDC ;
   private long[] H049G13_A7518CNDSPRCIA ;
   private String[] H049G13_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G13_n18154CNDSPRSUBCONDSC ;
   private long[] H049G13_A18146CNDSPRSUBCONID ;
   private long[] H049G14_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G14_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G14_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G14_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G14_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G14_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G14_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G14_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G14_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G14_n18148CNDSPRSUBCONPERT ;
   private long[] H049G14_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G14_n18147CNDSPRSUBCONBASE ;
   private String[] H049G14_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G14_n18159CNDSPRSUBCONTIP ;
   private long[] H049G14_A7520CNDSPRNDC ;
   private String[] H049G14_A7519CNDSPRTDC ;
   private long[] H049G14_A7518CNDSPRCIA ;
   private String[] H049G14_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G14_n18154CNDSPRSUBCONDSC ;
   private long[] H049G14_A18146CNDSPRSUBCONID ;
   private long[] H049G15_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G15_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G15_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G15_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G15_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G15_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G15_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G15_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G15_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G15_n18148CNDSPRSUBCONPERT ;
   private long[] H049G15_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G15_n18147CNDSPRSUBCONBASE ;
   private String[] H049G15_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G15_n18159CNDSPRSUBCONTIP ;
   private long[] H049G15_A7520CNDSPRNDC ;
   private String[] H049G15_A7519CNDSPRTDC ;
   private long[] H049G15_A7518CNDSPRCIA ;
   private String[] H049G15_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G15_n18154CNDSPRSUBCONDSC ;
   private long[] H049G15_A18146CNDSPRSUBCONID ;
   private long[] H049G16_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H049G16_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H049G16_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H049G16_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H049G16_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H049G16_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H049G16_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H049G16_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H049G16_A18148CNDSPRSUBCONPERT ;
   private boolean[] H049G16_n18148CNDSPRSUBCONPERT ;
   private long[] H049G16_A18147CNDSPRSUBCONBASE ;
   private boolean[] H049G16_n18147CNDSPRSUBCONBASE ;
   private String[] H049G16_A18159CNDSPRSUBCONTIP ;
   private boolean[] H049G16_n18159CNDSPRSUBCONTIP ;
   private long[] H049G16_A7520CNDSPRNDC ;
   private String[] H049G16_A7519CNDSPRTDC ;
   private long[] H049G16_A7518CNDSPRCIA ;
   private String[] H049G16_A18154CNDSPRSUBCONDSC ;
   private boolean[] H049G16_n18154CNDSPRSUBCONDSC ;
   private long[] H049G16_A18146CNDSPRSUBCONID ;
   private java.math.BigDecimal[] H049G17_A7540CNDSPRTRLIN ;
   private long[] H049G17_A7520CNDSPRNDC ;
   private String[] H049G17_A7519CNDSPRTDC ;
   private long[] H049G17_A7518CNDSPRCIA ;
   private String[] H049G17_A7550CNDSPRTRALC ;
   private boolean[] H049G17_n7550CNDSPRTRALC ;
   private java.math.BigDecimal[] H049G18_A8240AVDSPRMON ;
   private java.math.BigDecimal[] H049G18_A18201AVDSPR3CAN ;
   private boolean[] H049G18_n18201AVDSPR3CAN ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem> AV96SDTRegAvaSC ;
   private com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem AV97SDTRegAvaSCItem ;
   private com.kdsproyectos.SdtSDTRegAvaSC_SDTRegAvaSCItem_SubConItem AV99SubConItem ;
}

final  class wpregavacs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H049G2", "SELECT CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRPRID, CNDSPRCON, CNDSPRMON, CNDSPRTCMB, CNDSPRRESCON FROM CNDSPR WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G3", "SELECT CNTDOCID, CNTDOCDSC FROM CNTDOC WHERE CNTDOCID = ( ?) ORDER BY CNTDOCID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G4", "SELECT PMCTPRID, PMCTPREJ FROM PMCTPR WHERE PMCTPRID = ( ?) ORDER BY PMCTPRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G5", "SELECT CNCDIRID, CNCDIRNOM FROM CNCDIR WHERE CNCDIRID = ? ORDER BY CNCDIRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G6", "SELECT NIVAUTAVUSR, NIVAUTAVTDC, NIVAUTAVPRY, NIVAUTAVNIV FROM NIVAUTAV1 WHERE (NIVAUTAVPRY = ( ?) and NIVAUTAVTDC = ( 'DES')) AND (NIVAUTAVUSR <> ( '')) ORDER BY NIVAUTAVPRY, NIVAUTAVTDC, NIVAUTAVNIV  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G7", "SELECT CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRTRLIN, CNDSPRTRACT, CNDSPRTRUM, CNDSPRTRCANT, CNDSPRTRPUN, CNDSPRTRIMP, CNDSPRTRMON, CNDSPRTRFIT, CNDSPRTRFFT, CNDSPRTRRES, CNDSPRTRALC, CNDSPRTROBS, CNDSPRTRTDC, CNDSPRTRNDC, CNDSPRTRLINR FROM CNDSPRTR WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H049G8", "SELECT CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONCLA, CNDSPRSUBCONDSC, CNDSPRSUBCONPREUNI, CNDSPRSUBCONUNIMED, CNDSPRSUBCONCAN, CNDSPRSUBCONTOT, CNDSPRSUBCONFECINI, CNDSPRSUBCONFECFIN, CNDSPRSUBCONRES, CNDSPRSUBCONBASE, CNDSPRSUBCONPERT, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN5, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'SC')) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H049G9", "SELECT SUM(T1.AVDSPRMON), SUM(T1.AVDSPR3CAN) FROM (AVDSPR3 T1 INNER JOIN AVDSPR T2 ON T2.AVDSPRCIA = T1.AVDSPRCIA AND T2.AVDSPRTDC = T1.AVDSPRTDC AND T2.AVDSPRNDC = T1.AVDSPRNDC AND T2.CNTDOCID = ? AND T2.AVDSPRDOC = ? AND T2.AVDSPRLIN = T1.AVDSPRLIN) WHERE (T1.AVDSPRCIA = ?) AND (T2.AVDSPREST <> ( 'Cancelado')) AND (T2.AVDSPREST <> ( 'Rechazado')) AND (T1.AVDSPRLIN = ?) AND (T1.AVDSPRSPID = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H049G10", "SELECT AVDSPRTDC, AVDSPRNDC, AVDSPREST, AVDSPRLIN, CNTDOCID, AVDSPRDOC, AVDSPRCIA, AVDSPRCAN, AVDSPRIMP FROM AVDSPR WHERE (AVDSPRCIA = ?) AND (AVDSPREST <> ( 'Cancelado')) AND (AVDSPREST <> ( 'Rechazado')) AND (AVDSPRDOC = ?) AND (CNTDOCID = ( ?)) AND (AVDSPRLIN = ?) ORDER BY AVDSPRCIA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H049G11", "SELECT CNCDIRID, CNCDIRESTIMP FROM CNCDIR WHERE CNCDIRID = ? ORDER BY CNCDIRID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G12", "SELECT CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE, CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONDSC, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONBASE = ?) AND (CNDSPRSUBCONPERT = ?) AND (CNDSPRSUBCONPERTN2 = ?) AND (CNDSPRSUBCONPERTN3 = ?) AND (CNDSPRSUBCONPERTN4 = ?) AND (CNDSPRSUBCONPERTN5 = 0) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G13", "SELECT CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE, CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONDSC, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONBASE = ?) AND (CNDSPRSUBCONPERT = ?) AND (CNDSPRSUBCONPERTN2 = ?) AND (CNDSPRSUBCONPERTN3 = ?) AND (CNDSPRSUBCONPERTN4 = 0) AND (CNDSPRSUBCONPERTN5 = 0) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G14", "SELECT CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE, CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONDSC, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONBASE = ?) AND (CNDSPRSUBCONPERT = ?) AND (CNDSPRSUBCONPERTN2 = ?) AND (CNDSPRSUBCONPERTN3 = 0) AND (CNDSPRSUBCONPERTN4 = 0) AND (CNDSPRSUBCONPERTN5 = 0) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G15", "SELECT CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE, CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONDSC, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONBASE = ?) AND (CNDSPRSUBCONPERT = ?) AND (CNDSPRSUBCONPERTN2 = 0) AND (CNDSPRSUBCONPERTN3 = 0) AND (CNDSPRSUBCONPERTN4 = 0) AND (CNDSPRSUBCONPERTN5 = 0) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G16", "SELECT CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE, CNDSPRSUBCONTIP, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRSUBCONDSC, CNDSPRSUBCONID FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ?) AND (CNDSPRSUBCONTIP = ( 'CA')) AND (CNDSPRSUBCONBASE = ?) AND (CNDSPRSUBCONPERT = 0) AND (CNDSPRSUBCONPERTN2 = 0) AND (CNDSPRSUBCONPERTN3 = 0) AND (CNDSPRSUBCONPERTN4 = 0) AND (CNDSPRSUBCONPERTN5 = 0) ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H049G17", "SELECT CNDSPRTRLIN, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRTRALC FROM CNDSPRTR WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H049G18", "SELECT SUM(T1.AVDSPRMON), SUM(T1.AVDSPR3CAN) FROM (AVDSPR3 T1 INNER JOIN AVDSPR T2 ON T2.AVDSPRCIA = T1.AVDSPRCIA AND T2.AVDSPRTDC = T1.AVDSPRTDC AND T2.AVDSPRNDC = T1.AVDSPRNDC AND T2.CNTDOCID = ? AND T2.AVDSPRDOC = ? AND T2.AVDSPRLIN = T1.AVDSPRLIN) WHERE (T1.AVDSPRCIA = ?) AND (T2.AVDSPREST <> ( 'Cancelado')) AND (T2.AVDSPREST <> ( 'Rechazado')) AND (T1.AVDSPRLIN = ?) AND (T1.AVDSPRSPID = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[7])[0] = rslt.getString(6, 3) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 200) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 30) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 10) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 120) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getLongVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getLongVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 3) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 500) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 5000) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 200) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((long[]) buf[29])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((long[]) buf[31])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(20) ;
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 3) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((long[]) buf[7])[0] = rslt.getLong(7) ;
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getString(9, 3) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getString(11, 5000) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getString(9, 3) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getString(11, 5000) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getString(9, 3) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getString(11, 5000) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getString(9, 3) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getString(11, 5000) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((String[]) buf[15])[0] = rslt.getString(9, 3) ;
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((String[]) buf[17])[0] = rslt.getString(11, 5000) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(12) ;
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
      }
   }

}

