/*
               File: prompgenoc_impl
        Description:
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: May 2, 2025 12:36:34.6
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

public final  class prompgenoc_impl extends GXDataArea
{
   public prompgenoc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public prompgenoc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prompgenoc_impl.class ));
   }

   public prompgenoc_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavInalmnid = new HTMLChoice();
      dynavCntpgoid = new HTMLChoice();
      cmbavCncmnmid = new HTMLChoice();
      dynavCntivaid = new HTMLChoice();
      chkavIncdes = UIFactory.getCheckbox(this);
      cmbavTipodes = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCNCDIRNOM") == 0 )
         {
            A194CNCDIRNOM = httpContext.GetNextPar( ) ;
            n194CNCDIRNOM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A194CNCDIRNOM", A194CNCDIRNOM);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvcncdirnom3RE0( A194CNCDIRNOM) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCNTPGOID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvcntpgoid3RE2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCNTIVAID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvcntivaid3RE2( ) ;
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
            nRC_GXsfl_145 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_145_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_145_idx = httpContext.GetNextPar( ) ;
            AV28VALCOMUMT = httpContext.GetNextPar( ) ;
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
            AV28VALCOMUMT = httpContext.GetNextPar( ) ;
            AV95VALCOMEST = httpContext.GetNextPar( ) ;
            AV117CNUSERGPO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A5939CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV16CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            A20CNTDOCID = httpContext.GetNextPar( ) ;
            AV17CNTDOCID = httpContext.GetNextPar( ) ;
            A15642VALCOMDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10VALCOMDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A15650VALCOMLIN = GXutil.lval( httpContext.GetNextPar( )) ;
            A15651VALCOMPRID = GXutil.lval( httpContext.GetNextPar( )) ;
            n15651VALCOMPRID = false ;
            A15652VALCOMUMT = httpContext.GetNextPar( ) ;
            n15652VALCOMUMT = false ;
            A15653VALCOMQTO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n15653VALCOMQTO = false ;
            A15654VALCOMPRE = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n15654VALCOMPRE = false ;
            A15964VALCOMQTOC = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n15964VALCOMQTOC = false ;
            A15665VALCOMRTDOC = httpContext.GetNextPar( ) ;
            n15665VALCOMRTDOC = false ;
            A15666VALCOMRNDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            n15666VALCOMRNDOC = false ;
            A15667VALCOMRLIN = GXutil.lval( httpContext.GetNextPar( )) ;
            n15667VALCOMRLIN = false ;
            AV6CNTPGOID = httpContext.GetNextPar( ) ;
            AV11CNTIVAID = httpContext.GetNextPar( ) ;
            AV80CNUSERID = httpContext.GetNextPar( ) ;
            AV123MostrarComplemento = httpContext.GetNextPar( ) ;
            AV125ACMROITDOC = httpContext.GetNextPar( ) ;
            AV124omitirc = httpContext.GetNextPar( ) ;
            AV156ValidarxWS = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV28VALCOMUMT, AV95VALCOMEST, AV117CNUSERGPO, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15650VALCOMLIN, A15651VALCOMPRID, A15652VALCOMUMT, A15653VALCOMQTO, A15654VALCOMPRE, A15964VALCOMQTOC, A15665VALCOMRTDOC, A15666VALCOMRNDOC, A15667VALCOMRLIN, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Sfl_3") == 0 )
         {
            nRC_GXsfl_228 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_228_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_228_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrsfl_3_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Sfl_3") == 0 )
         {
            A15965VALCOMIDA = GXutil.lval( httpContext.GetNextPar( )) ;
            A5939CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV16CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            A20CNTDOCID = httpContext.GetNextPar( ) ;
            AV17CNTDOCID = httpContext.GetNextPar( ) ;
            A15642VALCOMDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10VALCOMDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            A15966VALCOMNMA = httpContext.GetNextPar( ) ;
            n15966VALCOMNMA = false ;
            A15970VALCOMFECA = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n15970VALCOMFECA = false ;
            A15967VALCOMBLOB = httpContext.GetNextPar( ) ;
            n15967VALCOMBLOB = false ;
            A15968VALCOMTIPAR = httpContext.GetNextPar( ) ;
            n15968VALCOMTIPAR = false ;
            A15969VALCOMUSRA = httpContext.GetNextPar( ) ;
            n15969VALCOMUSRA = false ;
            AV6CNTPGOID = httpContext.GetNextPar( ) ;
            AV11CNTIVAID = httpContext.GetNextPar( ) ;
            AV80CNUSERID = httpContext.GetNextPar( ) ;
            AV123MostrarComplemento = httpContext.GetNextPar( ) ;
            AV125ACMROITDOC = httpContext.GetNextPar( ) ;
            AV124omitirc = httpContext.GetNextPar( ) ;
            AV156ValidarxWS = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrsfl_3_refresh( A15965VALCOMIDA, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15966VALCOMNMA, A15970VALCOMFECA, A15967VALCOMBLOB, A15968VALCOMTIPAR, A15969VALCOMUSRA, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            AV16CNCIASID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV17CNTDOCID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
               AV10VALCOMDOC = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
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
      pa3RE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start3RE2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20255212363525", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      httpContext.AddJavascriptSource("KDSControls/KDSStylesDatatables/KDSStylesDatatablesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.kdsproyectos.prompgenoc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17CNTDOCID)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10VALCOMDOC,10,0)))+"\">") ;
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
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_145", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_145, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_228", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_228, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV75UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV75UploadedFiles);
      }
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMEST", GXutil.rtrim( AV95VALCOMEST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCIASID", GXutil.ltrim( localUtil.ntoc( A5939CNCIASID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCIASID", GXutil.ltrim( localUtil.ntoc( AV16CNCIASID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTDOCID", GXutil.rtrim( A20CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNTDOCID", GXutil.rtrim( AV17CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMDOC", GXutil.ltrim( localUtil.ntoc( A15642VALCOMDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMLIN", GXutil.ltrim( localUtil.ntoc( A15650VALCOMLIN, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMPRID", GXutil.ltrim( localUtil.ntoc( A15651VALCOMPRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMUMT", GXutil.rtrim( A15652VALCOMUMT));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMQTO", GXutil.ltrim( localUtil.ntoc( A15653VALCOMQTO, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMPRE", GXutil.ltrim( localUtil.ntoc( A15654VALCOMPRE, (byte)(15), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMQTOC", GXutil.ltrim( localUtil.ntoc( A15964VALCOMQTOC, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMRTDOC", GXutil.rtrim( A15665VALCOMRTDOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMRNDOC", GXutil.ltrim( localUtil.ntoc( A15666VALCOMRNDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMRLIN", GXutil.ltrim( localUtil.ntoc( A15667VALCOMRLIN, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTIVAID", GXutil.rtrim( A458CNTIVAID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTIVAPRC", GXutil.ltrim( localUtil.ntoc( A993CNTIVAPRC, (byte)(11), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMIDA", GXutil.ltrim( localUtil.ntoc( A15965VALCOMIDA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV80CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMVOIPDESF", GXutil.ltrim( localUtil.ntoc( AV114ACMVOIPDESF, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCDIRID", GXutil.ltrim( localUtil.ntoc( AV13CNCDIRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMRTDOC", GXutil.rtrim( AV29VALCOMRTDOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCDIRESTIMP", GXutil.rtrim( AV223CNCDIRESTIMP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMROING", GXutil.ltrim( localUtil.ntoc( AV140ACMROING, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMROINM", GXutil.ltrim( localUtil.ntoc( AV141ACMROINM, (byte)(15), (byte)(4), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTREC", AV142sdtRec);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTREC", AV142sdtRec);
      }
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMMNFACXML", GXutil.ltrim( localUtil.ntoc( AV222PMMnFacXML, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMOSTRARCOMPLEMENTO", GXutil.rtrim( AV123MostrarComplemento));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARCOMPLEMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123MostrarComplemento, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMROITDOC", GXutil.rtrim( AV125ACMROITDOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACMROITDOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ACMROITDOC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vOMITIRC", GXutil.rtrim( AV124omitirc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMITIRC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124omitirc, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRID", GXutil.ltrim( localUtil.ntoc( A46CNCDIRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRNOM", GXutil.rtrim( A194CNCDIRNOM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRRFC", GXutil.rtrim( A199CNCDIRRFC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMPRY", GXutil.rtrim( A15643VALCOMPRY));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMMON", GXutil.rtrim( A15647VALCOMMON));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMEST", GXutil.rtrim( A15648VALCOMEST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRESTIMP", GXutil.rtrim( A2882CNCDIRESTIMP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMTCAM", GXutil.ltrim( localUtil.ntoc( A15971VALCOMTCAM, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMNOC", GXutil.ltrim( localUtil.ntoc( A15972VALCOMNOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMALME", GXutil.rtrim( A15973VALCOMALME));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMTIVA", GXutil.rtrim( A15974VALCOMTIVA));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMCPGO", GXutil.rtrim( A15975VALCOMCPGO));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMINCDTO", GXutil.rtrim( A16310VALCOMINCDTO));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMTIPDTO", GXutil.rtrim( A16311VALCOMTIPDTO));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMPORDTOF", GXutil.ltrim( localUtil.ntoc( A16314VALCOMPORDTOF, (byte)(7), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMMTODTOF", GXutil.ltrim( localUtil.ntoc( A16315VALCOMMTODTOF, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMPORDTON", GXutil.ltrim( localUtil.ntoc( A16312VALCOMPORDTON, (byte)(7), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMMTODTON", GXutil.ltrim( localUtil.ntoc( A16313VALCOMMTODTON, (byte)(17), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMROINDOC", GXutil.ltrim( localUtil.ntoc( A822ACMROINDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMROINDOC", GXutil.ltrim( localUtil.ntoc( AV121ACMROINDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMROITDOC", GXutil.rtrim( A821ACMROITDOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMROIQT", GXutil.ltrim( localUtil.ntoc( A826ACMROIQT, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMROINP", GXutil.ltrim( localUtil.ntoc( A827ACMROINP, (byte)(15), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ACMROILIN", GXutil.ltrim( localUtil.ntoc( A824ACMROILIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ESTRUCTIMPID", GXutil.rtrim( A2875EstructImpId));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vESTRUCTIMPID", GXutil.rtrim( AV225EstructImpId));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ESTRUCTIMPDSC", GXutil.rtrim( A2876EstructImpDsc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "ESTRUCTIMPTIP", GXutil.rtrim( A3366EstructImpTip));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMBLOB", A15967VALCOMBLOB);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMNMA", GXutil.rtrim( A15966VALCOMNMA));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMTIPAR", GXutil.rtrim( A15968VALCOMTIPAR));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMRUT", GXutil.rtrim( A17225VALCOMRUT));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMTIPODOC", GXutil.rtrim( AV145PMTipoDoc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMNUMDOC", GXutil.ltrim( localUtil.ntoc( AV146PMNumDoc, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPROVID", GXutil.ltrim( localUtil.ntoc( AV164PMProvid, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vBLOB", AV77BLOB);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMRUT", GXutil.rtrim( AV167VALCOMRUT));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vSTRING", GXutil.rtrim( AV173string));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV257Pgmname));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCUUID", GXutil.rtrim( AV165XMLDOCUUID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMUUID", GXutil.rtrim( A909PMUuid));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMNUMDOC", GXutil.ltrim( localUtil.ntoc( A862PMNumDoc, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMTIPODOC", GXutil.rtrim( A861PMTipoDoc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vAVANZA", GXutil.ltrim( localUtil.ntoc( AV152avanza, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCADENA", GXutil.rtrim( AV149cadena));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vBUSC", GXutil.rtrim( AV170busc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXML", AV169xml);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMEMPRESA", GXutil.ltrim( localUtil.ntoc( AV200PMEmpresa, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCIASRFC", GXutil.rtrim( A14CNCIASRFC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCFOL", GXutil.rtrim( AV172XMLDOCFOL));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCSER", GXutil.rtrim( AV171XMLDOCSER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCFFAC", localUtil.dtoc( AV178XMLDOCFFAC, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCSCFD", GXutil.rtrim( AV191XMLDOCSCFD));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCSSAT", GXutil.rtrim( AV193XMLDOCSSAT));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCNCER", GXutil.rtrim( AV192XMLDOCNCER));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCRFCR", GXutil.rtrim( AV180XMLDOCRFCR));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCRFCE", GXutil.rtrim( AV183XMLDOCRFCE));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCNME", GXutil.rtrim( AV184XMLDOCNME));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCNMR", GXutil.rtrim( AV181XMLDOCNMR));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCTOT", GXutil.ltrim( localUtil.ntoc( AV187XMLDOCTOT, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCSUB", GXutil.ltrim( localUtil.ntoc( AV189XMLDOCSUB, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCIVA", GXutil.ltrim( localUtil.ntoc( AV190XMLDOCIVA, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO", GXutil.rtrim( AV214archivo));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vTIPO", GXutil.rtrim( AV215TIPO));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCLIN", GXutil.ltrim( localUtil.ntoc( AV203XMLDOCLIN, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCPROD", AV204XMLDOCPROD);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCQTY", GXutil.ltrim( localUtil.ntoc( AV205XMLDOCQTY, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCPRE", GXutil.ltrim( localUtil.ntoc( AV206XMLDOCPRE, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCIMP", GXutil.ltrim( localUtil.ntoc( AV207XMLDOCIMP, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCRET", GXutil.rtrim( AV208XMLDOCRET));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vXMLDOCDESC", GXutil.ltrim( localUtil.ntoc( AV194XMLDOCDESC, (byte)(17), (byte)(4), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vPMPDFDOC", GXutil.ltrim( localUtil.ntoc( AV209PMPDFDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALINI", GXutil.ltrim( localUtil.ntoc( AV216valini, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV86MENSAJE);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMFECA", localUtil.dtoc( A15970VALCOMFECA, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "VALCOMUSRA", GXutil.rtrim( A15969VALCOMUSRA));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRFSP", localUtil.ttoc( A533CNCDIRFSP, 10, 8, 0, 0, "/", ":", " "));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRFBA", localUtil.ttoc( A507CNCDIRFBA, 10, 8, 0, 0, "/", ":", " "));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMPRY", GXutil.rtrim( AV14VALCOMPRY));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALIDARXWS", GXutil.rtrim( AV156ValidarxWS));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALIDARXWS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156ValidarxWS, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "FILEUPLOAD1_Autoupload", GXutil.booltostr( Fileupload1_Autoupload));
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
         we3RE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt3RE2( ) ;
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
      return formatLink("com.kdsproyectos.prompgenoc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17CNTDOCID)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10VALCOMDOC,10,0))) ;
   }

   public String getPgmname( )
   {
      return "prompgenoc" ;
   }

   public String getPgmdesc( )
   {
      return "" ;
   }

   public void wb3RE0( )
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
         wb_table1_2_3RE2( true) ;
      }
      else
      {
         wb_table1_2_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      if ( wbEnd == 145 )
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
      if ( wbEnd == 228 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Sfl_3Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Sfl_3Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Sfl_3", Sfl_3Container);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Sfl_3ContainerData", Sfl_3Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Sfl_3ContainerData"+"V", Sfl_3Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Sfl_3ContainerData"+"V"+"\" value='"+Sfl_3Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start3RE2( )
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
      strup3RE0( ) ;
   }

   public void ws3RE2( )
   {
      start3RE2( ) ;
      evt3RE2( ) ;
   }

   public void evt3RE2( )
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
                        else if ( GXutil.strcmp(sEvt, "VACMVOITCMB.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e113RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCNCMNMID.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e123RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'GENERAR OC'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Generar OC' */
                           e133RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'SUBIR ARCHIVO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Subir Archivo' */
                           e143RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REGRESAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Regresar' */
                           e153RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCNTIVAID.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e163RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCNCDIRNOM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e173RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ABRE OC'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Abre OC' */
                           e183RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'RECEPCION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Recepcion' */
                           e193RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VINCDES.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e203RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPODES.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e213RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VACMVOIPDTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e223RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VACMVOIPDES.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e233RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'VALIDAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Validar' */
                           e243RE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CLEAR FILEUPLOAD TRAY'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 33), "VCANTIDADFACT.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 28), "VPREUNIT.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_145_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1452( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMLIN");
                              GX_FocusControl = edtavValcomlin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22valcomlin = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomlin_Internalname, GXutil.ltrim( GXutil.str( AV22valcomlin, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV22valcomlin = localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomlin_Internalname, GXutil.ltrim( GXutil.str( AV22valcomlin, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMRNDOC");
                              GX_FocusControl = edtavValcomrndoc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21valcomrndoc = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomrndoc_Internalname, GXutil.ltrim( GXutil.str( AV21valcomrndoc, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV21valcomrndoc = localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomrndoc_Internalname, GXutil.ltrim( GXutil.str( AV21valcomrndoc, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMRLIN");
                              GX_FocusControl = edtavValcomrlin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23VALCOMRLIN = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomrlin_Internalname, GXutil.ltrim( GXutil.str( AV23VALCOMRLIN, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV23VALCOMRLIN = localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomrlin_Internalname, GXutil.ltrim( GXutil.str( AV23VALCOMRLIN, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
                           }
                           AV20inproddsc = httpContext.cgiGet( edtavInproddsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInproddsc_Internalname, AV20inproddsc);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMQTO");
                              GX_FocusControl = edtavValcomqto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19valcomqto = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomqto_Internalname, GXutil.ltrim( GXutil.str( AV19valcomqto, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMQTO"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           else
                           {
                              AV19valcomqto = localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomqto_Internalname, GXutil.ltrim( GXutil.str( AV19valcomqto, 15, 2)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMQTO"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADFACT");
                              GX_FocusControl = edtavCantidadfact_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24cantidadfact = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
                           }
                           else
                           {
                              AV24cantidadfact = localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
                           }
                           AV28VALCOMUMT = httpContext.cgiGet( edtavValcomumt_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomumt_Internalname, AV28VALCOMUMT);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREUNIT");
                              GX_FocusControl = edtavPreunit_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25preunit = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
                           }
                           else
                           {
                              AV25preunit = localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBTOTAL");
                              GX_FocusControl = edtavSubtotal_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26subtotal = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavSubtotal_Internalname, GXutil.ltrim( GXutil.str( AV26subtotal, 15, 2)));
                           }
                           else
                           {
                              AV26subtotal = localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavSubtotal_Internalname, GXutil.ltrim( GXutil.str( AV26subtotal, 15, 2)));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMPRID");
                              GX_FocusControl = edtavValcomprid_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27valcomprid = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomprid_Internalname, GXutil.ltrim( GXutil.str( AV27valcomprid, 10, 0)));
                           }
                           else
                           {
                              AV27valcomprid = localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomprid_Internalname, GXutil.ltrim( GXutil.str( AV27valcomprid, 10, 0)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADRET");
                              GX_FocusControl = edtavCantidadret_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV102CantidadRet = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantidadret_Internalname, GXutil.ltrim( GXutil.str( AV102CantidadRet, 15, 2)));
                           }
                           else
                           {
                              AV102CantidadRet = localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantidadret_Internalname, GXutil.ltrim( GXutil.str( AV102CantidadRet, 15, 2)));
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
                                 e253RE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e263RE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VCANTIDADFACT.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e273RE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VPREUNIT.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e283RE2 ();
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
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "SFL_3.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'ELIMINAR DOC'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'ELIMINAR DOC'") == 0 ) )
                        {
                           nGXsfl_228_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_228_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_228_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_22812( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomida_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomida_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMIDA");
                              GX_FocusControl = edtavValcomida_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85valcomida = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomida_Internalname, GXutil.ltrim( GXutil.str( AV85valcomida, 10, 0)));
                           }
                           else
                           {
                              AV85valcomida = localUtil.ctol( httpContext.cgiGet( edtavValcomida_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomida_Internalname, GXutil.ltrim( GXutil.str( AV85valcomida, 10, 0)));
                           }
                           AV68Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV68Eliminar);
                           AV82valcomnma = httpContext.cgiGet( edtavValcomnma_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomnma_Internalname, AV82valcomnma);
                           AV84cnuserdsc = httpContext.cgiGet( edtavCnuserdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCnuserdsc_Internalname, AV84cnuserdsc);
                           AV83valcomtipar = httpContext.cgiGet( edtavValcomtipar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomtipar_Internalname, AV83valcomtipar);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavValcomfeca_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vVALCOMFECA");
                              GX_FocusControl = edtavValcomfeca_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81valcomfeca = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomfeca_Internalname, localUtil.format(AV81valcomfeca, "99/99/9999"));
                           }
                           else
                           {
                              AV81valcomfeca = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavValcomfeca_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValcomfeca_Internalname, localUtil.format(AV81valcomfeca, "99/99/9999"));
                           }
                           AV79VALCOMBLOB = httpContext.cgiGet( edtavValcomblob_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "URL", httpContext.getResourceRelative(AV79VALCOMBLOB), !bGXsfl_228_Refreshing);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "SFL_3.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e293RE12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ELIMINAR DOC'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Eliminar Doc' */
                                 e303RE2 ();
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

   public void we3RE2( )
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

   public void pa3RE2( )
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
            GX_FocusControl = edtavCnusergpo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvcncdirnom3RE0( String A194CNCDIRNOM )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxsgvvcncdirnom_data3RE0( A194CNCDIRNOM) ;
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

   protected void gxsgvvcncdirnom_data3RE0( String A194CNCDIRNOM )
   {
      l194CNCDIRNOM = GXutil.padr( GXutil.rtrim( A194CNCDIRNOM), 250, "%") ;
      n194CNCDIRNOM = false ;
      /* Using cursor H03RE2 */
      pr_default.execute(0, new Object[] {l194CNCDIRNOM});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H03RE2_A194CNCDIRNOM[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H03RE2_A194CNCDIRNOM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlvvcntpgoid3RE2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxdlvvcntpgoid_data3RE2( ) ;
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

   public void gxvvcntpgoid_html3RE2( )
   {
      String gxdynajaxvalue ;
      gxdlvvcntpgoid_data3RE2( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavCntpgoid.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCntpgoid.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvcntpgoid_data3RE2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add("Seleccione");
      /* Using cursor H03RE3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H03RE3_A462CNTPGOID[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H03RE3_A2323CNTPGODSC[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxdlvvcntivaid3RE2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxdlvvcntivaid_data3RE2( ) ;
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

   public void gxvvcntivaid_html3RE2( )
   {
      String gxdynajaxvalue ;
      gxdlvvcntivaid_data3RE2( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynavCntivaid.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCntivaid.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlvvcntivaid_data3RE2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add("Seleccione");
      /* Using cursor H03RE4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H03RE4_A458CNTIVAID[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H03RE4_A992CNTIVADSC[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxnrgrid1_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1452( ) ;
      while ( nGXsfl_145_idx <= nRC_GXsfl_145 )
      {
         sendrow_1452( ) ;
         nGXsfl_145_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_idx+1)) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1452( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid1Container));
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrsfl_3_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_22812( ) ;
      while ( nGXsfl_228_idx <= nRC_GXsfl_228 )
      {
         sendrow_22812( ) ;
         nGXsfl_228_idx = (short)(((subSfl_3_Islastpage==1)&&(nGXsfl_228_idx+1>subsfl_3_recordsperpage( )) ? 1 : nGXsfl_228_idx+1)) ;
         sGXsfl_228_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_228_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_22812( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Sfl_3Container));
      /* End function gxnrSfl_3_newrow */
   }

   public void gxgrgrid1_refresh( String AV28VALCOMUMT ,
                                  String AV95VALCOMEST ,
                                  short AV117CNUSERGPO ,
                                  long A5939CNCIASID ,
                                  long AV16CNCIASID ,
                                  String A20CNTDOCID ,
                                  String AV17CNTDOCID ,
                                  long A15642VALCOMDOC ,
                                  long AV10VALCOMDOC ,
                                  long A15650VALCOMLIN ,
                                  long A15651VALCOMPRID ,
                                  String A15652VALCOMUMT ,
                                  java.math.BigDecimal A15653VALCOMQTO ,
                                  java.math.BigDecimal A15654VALCOMPRE ,
                                  java.math.BigDecimal A15964VALCOMQTOC ,
                                  String A15665VALCOMRTDOC ,
                                  long A15666VALCOMRNDOC ,
                                  long A15667VALCOMRLIN ,
                                  String AV6CNTPGOID ,
                                  String AV11CNTIVAID ,
                                  String AV80CNUSERID ,
                                  String AV123MostrarComplemento ,
                                  String AV125ACMROITDOC ,
                                  String AV124omitirc ,
                                  String AV156ValidarxWS )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf3RE2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void gxgrsfl_3_refresh( long A15965VALCOMIDA ,
                                  long A5939CNCIASID ,
                                  long AV16CNCIASID ,
                                  String A20CNTDOCID ,
                                  String AV17CNTDOCID ,
                                  long A15642VALCOMDOC ,
                                  long AV10VALCOMDOC ,
                                  String A15966VALCOMNMA ,
                                  java.util.Date A15970VALCOMFECA ,
                                  String A15967VALCOMBLOB ,
                                  String A15968VALCOMTIPAR ,
                                  String A15969VALCOMUSRA ,
                                  String AV6CNTPGOID ,
                                  String AV11CNTIVAID ,
                                  String AV80CNUSERID ,
                                  String AV123MostrarComplemento ,
                                  String AV125ACMROITDOC ,
                                  String AV124omitirc ,
                                  String AV156ValidarxWS )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      SFL_3_nCurrentRecord = 0 ;
      rf3RE12( ) ;
      /* End function gxgrSfl_3_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMLIN", GXutil.ltrim( localUtil.ntoc( AV22valcomlin, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMRNDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMRNDOC", GXutil.ltrim( localUtil.ntoc( AV21valcomrndoc, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMRLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMRLIN", GXutil.ltrim( localUtil.ntoc( AV23VALCOMRLIN, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMQTO", getSecureSignedToken( "", localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALCOMQTO", GXutil.ltrim( localUtil.ntoc( AV19valcomqto, (byte)(15), (byte)(2), ".", "")));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxvvcntpgoid_html3RE2( ) ;
         gxvvcntivaid_html3RE2( ) ;
         dynload_actions( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavInalmnid.getItemCount() > 0 )
      {
         AV154INALMNID = cmbavInalmnid.getValidValue(AV154INALMNID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavInalmnid.setValue( GXutil.rtrim( AV154INALMNID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavInalmnid.getInternalname(), "Values", cmbavInalmnid.ToJavascriptSource(), true);
      }
      if ( dynavCntpgoid.getItemCount() > 0 )
      {
         AV6CNTPGOID = dynavCntpgoid.getValidValue(AV6CNTPGOID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavCntpgoid.setValue( GXutil.rtrim( AV6CNTPGOID) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCntpgoid.getInternalname(), "Values", dynavCntpgoid.ToJavascriptSource(), true);
      }
      if ( cmbavCncmnmid.getItemCount() > 0 )
      {
         AV32CNCMNMID = cmbavCncmnmid.getValidValue(AV32CNCMNMID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCncmnmid.setValue( GXutil.rtrim( AV32CNCMNMID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCncmnmid.getInternalname(), "Values", cmbavCncmnmid.ToJavascriptSource(), true);
      }
      if ( dynavCntivaid.getItemCount() > 0 )
      {
         AV11CNTIVAID = dynavCntivaid.getValidValue(AV11CNTIVAID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynavCntivaid.setValue( GXutil.rtrim( AV11CNTIVAID) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCntivaid.getInternalname(), "Values", dynavCntivaid.ToJavascriptSource(), true);
      }
      if ( cmbavTipodes.getItemCount() > 0 )
      {
         AV108tipoDes = cmbavTipodes.getValidValue(AV108tipoDes) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipodes.setValue( GXutil.rtrim( AV108tipoDes) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Values", cmbavTipodes.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3RE2( ) ;
      rf3RE12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV257Pgmname = "prompgenoc" ;
      Gx_err = (short)(0) ;
      edtavCntivaprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntivaprc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntivaprc_Enabled, 5, 0)), true);
      edtavMtodes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMtodes_Enabled, 5, 0)), true);
      edtavValcomnoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomnoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomnoc_Enabled, 5, 0)), true);
      edtavSubtotal_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_oc_Enabled, 5, 0)), true);
      edtavIva_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIva_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavIva_oc_Enabled, 5, 0)), true);
      edtavTotal_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_oc_Enabled, 5, 0)), true);
      edtavSubtotal_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_ext_Enabled, 5, 0)), true);
      edtavIva_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIva_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavIva_ext_Enabled, 5, 0)), true);
      edtavTotal_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_ext_Enabled, 5, 0)), true);
      edtavValcomlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomlin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomlin_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomrndoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomrndoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomrndoc_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomrlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomrlin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomrlin_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavInproddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInproddsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInproddsc_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomqto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomqto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomqto_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomumt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomumt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomumt_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavSubtotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomprid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomprid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomprid_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavCantidadret_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantidadret_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCantidadret_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomida_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavEliminar_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomnma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomnma_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomnma_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavCnuserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCnuserdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCnuserdsc_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomtipar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomtipar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomtipar_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomfeca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomfeca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomfeca_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomblob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomblob_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
   }

   public void rf3RE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(145) ;
      nGXsfl_145_idx = (short)(1) ;
      sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1452( ) ;
      bGXsfl_145_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "KDSResponsiveTable");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1452( ) ;
         e263RE2 ();
         wbEnd = (short)(145) ;
         wb3RE0( ) ;
      }
      bGXsfl_145_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes3RE2( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNCIASID", GXutil.ltrim( localUtil.ntoc( AV16CNCIASID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNTDOCID", GXutil.rtrim( AV17CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV80CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOMQTO"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vMOSTRARCOMPLEMENTO", GXutil.rtrim( AV123MostrarComplemento));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARCOMPLEMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123MostrarComplemento, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vACMROITDOC", GXutil.rtrim( AV125ACMROITDOC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACMROITDOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ACMROITDOC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vOMITIRC", GXutil.rtrim( AV124omitirc));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMITIRC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124omitirc, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vVALIDARXWS", GXutil.rtrim( AV156ValidarxWS));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALIDARXWS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156ValidarxWS, ""))));
   }

   public void rf3RE12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Sfl_3Container.ClearRows();
      }
      wbStart = (short)(228) ;
      nGXsfl_228_idx = (short)(1) ;
      sGXsfl_228_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_228_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_22812( ) ;
      bGXsfl_228_Refreshing = true ;
      Sfl_3Container.AddObjectProperty("GridName", "Sfl_3");
      Sfl_3Container.AddObjectProperty("CmpContext", "");
      Sfl_3Container.AddObjectProperty("InMasterPage", "false");
      Sfl_3Container.AddObjectProperty("Class", "dataTable");
      Sfl_3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Sfl_3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Sfl_3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSfl_3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Sfl_3Container.AddObjectProperty("Titlefont", GXutil.rtrim( subSfl_3_Titlefont));
      Sfl_3Container.AddObjectProperty("Linesfont", GXutil.rtrim( subSfl_3_Linesfont));
      Sfl_3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subSfl_3_Width, (byte)(9), (byte)(0), ".", "")));
      Sfl_3Container.setPageSize( subsfl_3_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_22812( ) ;
         e293RE12 ();
         wbEnd = (short)(228) ;
         wb3RE0( ) ;
      }
      bGXsfl_228_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes3RE12( )
   {
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

   public int subsfl_3_pagecount( )
   {
      return -1 ;
   }

   public int subsfl_3_recordcount( )
   {
      return -1 ;
   }

   public int subsfl_3_recordsperpage( )
   {
      return -1 ;
   }

   public int subsfl_3_currentpage( )
   {
      return -1 ;
   }

   public void strup3RE0( )
   {
      /* Before Start, stand alone formulas. */
      AV257Pgmname = "prompgenoc" ;
      Gx_err = (short)(0) ;
      edtavCntivaprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntivaprc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntivaprc_Enabled, 5, 0)), true);
      edtavMtodes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMtodes_Enabled, 5, 0)), true);
      edtavValcomnoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomnoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomnoc_Enabled, 5, 0)), true);
      edtavSubtotal_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_oc_Enabled, 5, 0)), true);
      edtavIva_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIva_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavIva_oc_Enabled, 5, 0)), true);
      edtavTotal_oc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_oc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_oc_Enabled, 5, 0)), true);
      edtavSubtotal_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_ext_Enabled, 5, 0)), true);
      edtavIva_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIva_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavIva_ext_Enabled, 5, 0)), true);
      edtavTotal_ext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_ext_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_ext_Enabled, 5, 0)), true);
      edtavValcomlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomlin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomlin_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomrndoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomrndoc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomrndoc_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomrlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomrlin_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomrlin_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavInproddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInproddsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavInproddsc_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomqto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomqto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomqto_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomumt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomumt_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomumt_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavSubtotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubtotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSubtotal_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomprid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomprid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomprid_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavCantidadret_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantidadret_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCantidadret_Enabled, 5, 0)), !bGXsfl_145_Refreshing);
      edtavValcomida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomida_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavEliminar_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomnma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomnma_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomnma_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavCnuserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCnuserdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCnuserdsc_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomtipar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomtipar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomtipar_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomfeca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomfeca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomfeca_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      edtavValcomblob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValcomblob_Enabled, 5, 0)), !bGXsfl_228_Refreshing);
      gxvvcntpgoid_html3RE2( ) ;
      gxvvcntivaid_html3RE2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e253RE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV75UploadedFiles);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCnusergpo_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCnusergpo_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNUSERGPO");
            GX_FocusControl = edtavCnusergpo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV117CNUSERGPO = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117CNUSERGPO", GXutil.ltrim( GXutil.str( AV117CNUSERGPO, 4, 0)));
         }
         else
         {
            AV117CNUSERGPO = (short)(localUtil.ctol( httpContext.cgiGet( edtavCnusergpo_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117CNUSERGPO", GXutil.ltrim( GXutil.str( AV117CNUSERGPO, 4, 0)));
         }
         AV8cncdirnom = httpContext.cgiGet( edtavCncdirnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cncdirnom", AV8cncdirnom);
         cmbavInalmnid.setName( cmbavInalmnid.getInternalname() );
         cmbavInalmnid.setValue( httpContext.cgiGet( cmbavInalmnid.getInternalname()) );
         AV154INALMNID = httpContext.cgiGet( cmbavInalmnid.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
         dynavCntpgoid.setName( dynavCntpgoid.getInternalname() );
         dynavCntpgoid.setValue( httpContext.cgiGet( dynavCntpgoid.getInternalname()) );
         AV6CNTPGOID = httpContext.cgiGet( dynavCntpgoid.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCntpgodias_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCntpgodias_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNTPGODIAS");
            GX_FocusControl = edtavCntpgodias_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV219CNTPGODIAS = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV219CNTPGODIAS", GXutil.ltrim( GXutil.str( AV219CNTPGODIAS, 4, 0)));
         }
         else
         {
            AV219CNTPGODIAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavCntpgodias_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV219CNTPGODIAS", GXutil.ltrim( GXutil.str( AV219CNTPGODIAS, 4, 0)));
         }
         cmbavCncmnmid.setName( cmbavCncmnmid.getInternalname() );
         cmbavCncmnmid.setValue( httpContext.cgiGet( cmbavCncmnmid.getInternalname()) );
         AV32CNCMNMID = httpContext.cgiGet( cmbavCncmnmid.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
         AV18cnciasmon = httpContext.cgiGet( edtavCnciasmon_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18cnciasmon", AV18cnciasmon);
         dynavCntivaid.setName( dynavCntivaid.getInternalname() );
         dynavCntivaid.setValue( httpContext.cgiGet( dynavCntivaid.getInternalname()) );
         AV11CNTIVAID = httpContext.cgiGet( dynavCntivaid.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCntivaprc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCntivaprc_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNTIVAPRC");
            GX_FocusControl = edtavCntivaprc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12CNTIVAPRC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CNTIVAPRC", GXutil.ltrim( GXutil.str( AV12CNTIVAPRC, 11, 4)));
         }
         else
         {
            AV12CNTIVAPRC = localUtil.ctond( httpContext.cgiGet( edtavCntivaprc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CNTIVAPRC", GXutil.ltrim( GXutil.str( AV12CNTIVAPRC, 11, 4)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcmvoitcmb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcmvoitcmb_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACMVOITCMB");
            GX_FocusControl = edtavAcmvoitcmb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9ACMVOITCMB = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
         }
         else
         {
            AV9ACMVOITCMB = localUtil.ctond( httpContext.cgiGet( edtavAcmvoitcmb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
         }
         AV107incDes = ((GXutil.strcmp(httpContext.cgiGet( chkavIncdes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107incDes", AV107incDes);
         cmbavTipodes.setName( cmbavTipodes.getInternalname() );
         cmbavTipodes.setValue( httpContext.cgiGet( cmbavTipodes.getInternalname()) );
         AV108tipoDes = httpContext.cgiGet( cmbavTipodes.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdto_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACMVOIPDTO");
            GX_FocusControl = edtavAcmvoipdto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109ACMVOIPDTO = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         }
         else
         {
            AV109ACMVOIPDTO = localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdes_Internalname)), DecimalUtil.stringToDec("99999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACMVOIPDES");
            GX_FocusControl = edtavAcmvoipdes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV110ACMVOIPDES = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         }
         else
         {
            AV110ACMVOIPDES = localUtil.ctond( httpContext.cgiGet( edtavAcmvoipdes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMtodes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMtodes_Internalname)), DecimalUtil.stringToDec("99999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMTODES");
            GX_FocusControl = edtavMtodes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV120MTODES = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
         }
         else
         {
            AV120MTODES = localUtil.ctond( httpContext.cgiGet( edtavMtodes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomnoc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomnoc_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMNOC");
            GX_FocusControl = edtavValcomnoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96VALCOMNOC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96VALCOMNOC", GXutil.ltrim( GXutil.str( AV96VALCOMNOC, 10, 0)));
         }
         else
         {
            AV96VALCOMNOC = localUtil.ctol( httpContext.cgiGet( edtavValcomnoc_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96VALCOMNOC", GXutil.ltrim( GXutil.str( AV96VALCOMNOC, 10, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSubtotal_oc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSubtotal_oc_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBTOTAL_OC");
            GX_FocusControl = edtavSubtotal_oc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30subtotal_oc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
         }
         else
         {
            AV30subtotal_oc = localUtil.ctond( httpContext.cgiGet( edtavSubtotal_oc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIva_oc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIva_oc_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vIVA_OC");
            GX_FocusControl = edtavIva_oc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33iva_oc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
         }
         else
         {
            AV33iva_oc = localUtil.ctond( httpContext.cgiGet( edtavIva_oc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_oc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_oc_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_OC");
            GX_FocusControl = edtavTotal_oc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31total_oc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
         }
         else
         {
            AV31total_oc = localUtil.ctond( httpContext.cgiGet( edtavTotal_oc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSubtotal_ext_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSubtotal_ext_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBTOTAL_EXT");
            GX_FocusControl = edtavSubtotal_ext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91subtotal_ext = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
         }
         else
         {
            AV91subtotal_ext = localUtil.ctond( httpContext.cgiGet( edtavSubtotal_ext_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIva_ext_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIva_ext_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vIVA_EXT");
            GX_FocusControl = edtavIva_ext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92iva_ext = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
         }
         else
         {
            AV92iva_ext = localUtil.ctond( httpContext.cgiGet( edtavIva_ext_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_ext_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_ext_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_EXT");
            GX_FocusControl = edtavTotal_ext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93total_ext = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
         }
         else
         {
            AV93total_ext = localUtil.ctond( httpContext.cgiGet( edtavTotal_ext_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
         }
         AV129serie = httpContext.cgiGet( edtavSerie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129serie", AV129serie);
         AV130folio = httpContext.cgiGet( edtavFolio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130folio", AV130folio);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAcmroifdoc_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vACMROIFDOC");
            GX_FocusControl = edtavAcmroifdoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV128ACMROIFDOC = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128ACMROIFDOC", localUtil.format(AV128ACMROIFDOC, "99/99/99"));
         }
         else
         {
            AV128ACMROIFDOC = localUtil.ctod( httpContext.cgiGet( edtavAcmroifdoc_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128ACMROIFDOC", localUtil.format(AV128ACMROIFDOC, "99/99/99"));
         }
         AV218UUID = httpContext.cgiGet( edtavUuid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV218UUID", AV218UUID);
         AV127ACMROIOBST = httpContext.cgiGet( edtavAcmroiobst_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127ACMROIOBST", AV127ACMROIOBST);
         AV151CNCDIRRFC = httpContext.cgiGet( edtavCncdirrfc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
         AV150CNCIASRFC = httpContext.cgiGet( edtavCnciasrfc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV150CNCIASRFC", AV150CNCIASRFC);
         AV78NAME = httpContext.cgiGet( edtavName_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
         /* Read saved values. */
         nRC_GXsfl_145 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), ".", ",")) ;
         nRC_GXsfl_228 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_228"), ".", ",")) ;
         AV16CNCIASID = localUtil.ctol( httpContext.cgiGet( "vCNCIASID"), ".", ",") ;
         Fileupload1_Autoupload = GXutil.strtobool( httpContext.cgiGet( "FILEUPLOAD1_Autoupload")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e253RE2 ();
      if (returnInSub) return;
   }

   public void e253RE2( )
   {
      /* Start Routine */
      edtavCnciasrfc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCnciasrfc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCnciasrfc_Enabled, 5, 0)), true);
      edtavCncdirrfc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirrfc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirrfc_Enabled, 5, 0)), true);
      lblTextblock1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock1_Visible, 5, 0)), true);
      edtavName_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavName_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavName_Visible, 5, 0)), true);
      AV125ACMROITDOC = "EMP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125ACMROITDOC", AV125ACMROITDOC);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACMROITDOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ACMROITDOC, ""))));
      GXt_char1 = AV150CNCIASRFC ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.cncias04(remoteHandle, context).execute( AV16CNCIASID, GXv_char2) ;
      prompgenoc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      AV150CNCIASRFC = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150CNCIASRFC", AV150CNCIASRFC);
      GXt_char1 = AV18cnciasmon ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.cnciasmon01(remoteHandle, context).execute( AV16CNCIASID, GXv_char2) ;
      prompgenoc_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      AV18cnciasmon = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18cnciasmon", AV18cnciasmon);
      AV80CNUSERID = AV87WebSession.getValue("CNUSERID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
      GXv_int3[0] = 0 ;
      GXv_int4[0] = AV117CNUSERGPO ;
      GXv_int5[0] = (byte)(0) ;
      new com.kdsproyectos.cnuser09(remoteHandle, context).execute( AV80CNUSERID, GXv_int3, GXv_int4, GXv_int5) ;
      prompgenoc_impl.this.AV117CNUSERGPO = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV117CNUSERGPO", GXutil.ltrim( GXutil.str( AV117CNUSERGPO, 4, 0)));
      lblButtonrec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblButtonrec_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblButtonrec_Visible, 5, 0)), true);
      edtavCnusergpo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCnusergpo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCnusergpo_Visible, 5, 0)), true);
      if ( AV117CNUSERGPO == 0 )
      {
         lblSeg_Caption = "Registro Factura/Nota para generar Orden de Compra" ;
         httpContext.ajax_rsp_assign_prop("", false, lblSeg_Internalname, "Caption", lblSeg_Caption, true);
      }
      else
      {
         lblSeg_Caption = "Registro Factura" ;
         httpContext.ajax_rsp_assign_prop("", false, lblSeg_Internalname, "Caption", lblSeg_Caption, true);
      }
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV123MostrarComplemento ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV16CNCIASID, "KDSProyectos", "OMPINS", "CSM", (short)(2), GXv_decimal6, GXv_char2) ;
      prompgenoc_impl.this.AV123MostrarComplemento = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV123MostrarComplemento", AV123MostrarComplemento);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMOSTRARCOMPLEMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123MostrarComplemento, ""))));
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV124omitirc ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV16CNCIASID, "KDSProyectos", "GRAL", "CSM", (short)(2), GXv_decimal6, GXv_char2) ;
      prompgenoc_impl.this.AV124omitirc = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV124omitirc", AV124omitirc);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vOMITIRC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV124omitirc, ""))));
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV156ValidarxWS ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV16CNCIASID, "KDSProyectos", "WSDL", "", (short)(5), GXv_decimal6, GXv_char2) ;
      prompgenoc_impl.this.AV156ValidarxWS = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV156ValidarxWS", AV156ValidarxWS);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALIDARXWS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156ValidarxWS, ""))));
      if ( GXutil.strcmp(AV156ValidarxWS, "S") == 0 )
      {
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Validar Factura", GXv_char2) ;
         prompgenoc_impl.this.GXt_char1 = GXv_char2[0] ;
         lblTxtvalidar_Caption = GXt_char1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtvalidar_Internalname, "Caption", lblTxtvalidar_Caption, true);
         lblTextblock5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock5_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock5_Visible, 5, 0)), true);
         tblTbladjarch_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbladjarch_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbladjarch_Visible, 5, 0)), true);
      }
      else
      {
         lblTxtvalidar_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtvalidar_Internalname, "Caption", lblTxtvalidar_Caption, true);
      }
      edtavCntivaprc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntivaprc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCntivaprc_Visible, 5, 0)), true);
      /* Execute user subroutine: 'ESTILOS' */
      S112 ();
      if (returnInSub) return;
      lblTxt_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_Internalname, "Caption", lblTxt_Caption, true);
      edtavCnciasmon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCnciasmon_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCnciasmon_Visible, 5, 0)), true);
      cmbavCncmnmid.removeAllItems();
      /* Using cursor H03RE5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A50CNCMNMID = H03RE5_A50CNCMNMID[0] ;
         A207CNCMNMDSC = H03RE5_A207CNCMNMDSC[0] ;
         n207CNCMNMDSC = H03RE5_n207CNCMNMDSC[0] ;
         cmbavCncmnmid.addItem(A50CNCMNMID, A207CNCMNMDSC, (short)(0));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV107incDes = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107incDes", AV107incDes);
      AV108tipoDes = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
      edtavAcmvoipdto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Visible, 5, 0)), true);
      edtavAcmvoipdes_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Visible, 5, 0)), true);
      cmbavTipodes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipodes.getEnabled(), 5, 0)), true);
      edtavAcmvoipdto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
      edtavAcmvoipdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
      edtavMtodes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
      lblLbldescuento2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
      cmbavInalmnid.removeAllItems();
      AV155INALMNID1er = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155INALMNID1er", AV155INALMNID1er);
      cmbavInalmnid.addItem(AV155INALMNID1er, "Seleccione un almacén", (short)(0));
      /* Using cursor H03RE6 */
      pr_default.execute(4, new Object[] {AV80CNUSERID});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10645INALMNENCUSR = H03RE6_A10645INALMNENCUSR[0] ;
         n10645INALMNENCUSR = H03RE6_n10645INALMNENCUSR[0] ;
         A337INALMNDSC = H03RE6_A337INALMNDSC[0] ;
         n337INALMNDSC = H03RE6_n337INALMNDSC[0] ;
         A249INALMNID = H03RE6_A249INALMNID[0] ;
         A337INALMNDSC = H03RE6_A337INALMNDSC[0] ;
         n337INALMNDSC = H03RE6_n337INALMNDSC[0] ;
         cmbavInalmnid.addItem(A249INALMNID, A337INALMNDSC, (short)(0));
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV154INALMNID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
      /* Execute user subroutine: 'ESTATUS' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'IVA' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) == 0 )
      {
         edtavAcmvoitcmb_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoitcmb_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoitcmb_Visible, 5, 0)), true);
         lblMon1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblMon1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon1_Visible, 5, 0)), true);
         AV9ACMVOITCMB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
      }
      else
      {
         edtavAcmvoitcmb_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoitcmb_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoitcmb_Visible, 5, 0)), true);
         lblMon1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblMon1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon1_Visible, 5, 0)), true);
      }
      /* Execute user subroutine: 'RECUPERAALMACEN' */
      S142 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'ESTILOS' Routine */
      divTab1_Class = "tabcontent" ;
      httpContext.ajax_rsp_assign_prop("", false, divTab1_Internalname, "Class", divTab1_Class, true);
      divTab2_Class = "tabcontent" ;
      httpContext.ajax_rsp_assign_prop("", false, divTab2_Internalname, "Class", divTab2_Class, true);
      lblTxtregresar_Caption = "<i class=\"KDSButton\">arrow_back</i>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtregresar_Internalname, "Caption", lblTxtregresar_Caption, true);
      lblTarget_Caption = "<i class=\"KDSButton\">call_made</i>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTarget_Internalname, "Caption", lblTarget_Caption, true);
      lblPdf_Caption = "<i class=\"KDSButton\">picture_as_pdf</i>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblPdf_Internalname, "Caption", lblPdf_Caption, true);
      lblCss_Caption = ""+"	<style> "+".button {"+"background-color: #F7BF5E;"+" border: none;"+" color: white;"+" padding: 6px 13px;"+" text-align: center;"+" text-decoration: none;"+"display: inline-block;"+" font-size: 14px;"+" margin: 4px 2px;"+" cursor: pointer;"+" border-radius: 2px;"+"}"+".button:hover {"+" background-color: #F5A721;"+" border: none;"+" color: white;"+" padding: 6px 13px;"+"text-align: center;"+"text-decoration: none;"+" display: inline-block;"+" font-size: 14px;"+" margin: 4px 2px;"+" cursor: pointer;"+"border-radius: 2px;"+"}"+".buttonblue {"+"background-color: #5EA7F7;"+" border: none;"+" color: white;"+" padding: 6px 13px;"+" text-align: center;"+" text-decoration: none;"+"display: inline-block;"+" font-size: 14px;"+" margin: 4px 2px;"+" cursor: pointer;"+" border-radius: 2px;"+"}"+".buttonblue:hover {"+" background-color: #1877E1;"+" border: none;"+" color: white;"+" padding: 6px 13px;"+"text-align: center;"+"text-decoration: none;"+" display: inline-block;"+" font-size: 14px;"+" margin: 4px 2px;"+" cursor: pointer;"+"border-radius: 2px;"+"}"+"	.FileUpload .dropzone{ "+"		min-height: 325px !important; "+"	} "+"	.FileUpload .start, .FileUpload .cancel{ "+"		display: none; "+"	} "+"	.fileinput-button:after { "+"		content: \"Busque o arrastre imagenes...\"; "+"		background-color: #2081c7; "+"		display:block; "+"		padding: 5px 5px; "+"		color: white; "+"		box-shadow: 0px 0px 0px 0px black; "+"	} "+"	.fileinput-button span { "+"		display: none; "+"	} "+"	#UPLOADED_IMAGES_CELL{ "+"	    background-color: #f9f9f9; "+"	    box-shadow: inset 0px 1px 9px 0px #00000054; "+"	} "+"	#TEXTBLOCK5 a { "+"		display: block; "+"		background-color: #9fccec; "+"		width: 15px; "+"		text-decoration: none; "+"		font-size: xx-large; "+"		color: white; "+"		height: 28px; "+"		padding: 0px 15px 12px 13px; "+"		text-align: center; "+"		z-index: 1; "+"		left: 248px; "+"		top: 74px; "+"	} "+"	#TEXTBLOCK5 a:hover { "+"		background-color: grey; "+"	} "+"	#TXTLIMPIARFILEUPLOAD a { "+"		display: block; "+"		background-color: #ff00007a; "+"		width: 15px; "+"		text-decoration: none; "+"		font-size: xx-large; "+"		font-family: sans-serif; "+"		color: white; "+"		height: 28px; "+"		padding: 0px 13px 12px 14px; "+"		text-align: center; "+"		z-index: 1; "+"		left: 295px; "+"		top: 74px; "+"	} "+"	#TXTLIMPIARFILEUPLOAD a:hover { "+"		background-color: grey; "+"	} "+".tab {"+"overflow: hidden;"+" border: 1px solid #ccc;"+"background-color: #f1f1f1;"+"}"+"Label {"+"color: black;"+"font-weight: bold;"+" }"+".tab Label {"+"background-color: inherit;"+"float: left;"+"border: none;"+" outline: none;"+"cursor: pointer;"+"padding: 14px 16px;"+" transition: 0.3s;"+" font-size: 13px;"+"}"+".tab Label:hover {"+"background-color: #ddd;"+"}"+".tab Label.active {"+"background-color: #ccc;"+"}"+".tabcontent {"+" display: none;"+"padding: 6px 12px;"+"border-top: none;"+"}"+"</style>"+"</head>"+"<body>"+"<div class=\"tab\">"+"<a href=\"javascript: openCity(event,"+" 'TAB1','PEST1'"+")\" > <label class=\"tablinks\" id=\"PEST1\">Datos Vale de Compra</label></a>"+"<a href=\"javascript: openCity(event,"+" 'TAB2','PEST2'"+")\" > <label class=\"tablinks\" id=\"PEST2\">Datos de Factura / Nota de Venta</label></a>"+"</div>"+"<script>"+"function openCity(evt, DivName,TabName) {"+"var i, tabcontent, tablinks;"+"tabcontent = document.getElementsByClassName(\"tabcontent\");"+"for (i = 0; i < tabcontent.length; i++) {"+"tabcontent[i].style.display = \"none\";"+"}"+"tablinks = document.getElementsByClassName(\"tablinks\");"+"for (i = 0; i < tablinks.length; i++) {"+"tablinks[i].style.background= \"#f1f1f1\";"+"}"+" document.getElementById(DivName).style.display = \"block\";"+" document.getElementById(TabName).style.background= \"#ccc\";"+"}"+"document.getElementById(\"PEST1\").click();"+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblCss_Internalname, "Caption", lblCss_Caption, true);
      if ( AV117CNUSERGPO == 0 )
      {
         lblButtonoc_Caption = "<div class=\"button\">Cerrar Vale de Compra</div>" ;
         httpContext.ajax_rsp_assign_prop("", false, lblButtonoc_Internalname, "Caption", lblButtonoc_Caption, true);
         lblButtonrec_Caption = "<div class=\"buttonblue\">Recepción de OC</div>" ;
         httpContext.ajax_rsp_assign_prop("", false, lblButtonrec_Internalname, "Caption", lblButtonrec_Caption, true);
      }
      else
      {
         lblButtonoc_Caption = "<div class=\"button\">Registrar Venta</div>" ;
         httpContext.ajax_rsp_assign_prop("", false, lblButtonoc_Internalname, "Caption", lblButtonoc_Caption, true);
         lblButtonrec_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblButtonrec_Internalname, "Caption", lblButtonrec_Caption, true);
      }
      edtavMtodes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMtodes_Enabled, 5, 0)), true);
   }

   private void e263RE2( )
   {
      /* Grid1_Load Routine */
      if ( GXutil.strcmp(AV95VALCOMEST, "TERMINADO") == 0 )
      {
         edtavCantidadret_Visible = 1 ;
      }
      else
      {
         edtavCantidadret_Visible = 0 ;
      }
      if ( AV117CNUSERGPO == 0 )
      {
         edtavCantidadfact_Title = "Cantidad Recibida" ;
      }
      else
      {
         edtavCantidadfact_Title = "Cantidad Confirmada" ;
      }
      /* Using cursor H03RE7 */
      pr_default.execute(5, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A15642VALCOMDOC = H03RE7_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE7_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE7_A5939CNCIASID[0] ;
         A15650VALCOMLIN = H03RE7_A15650VALCOMLIN[0] ;
         A15651VALCOMPRID = H03RE7_A15651VALCOMPRID[0] ;
         n15651VALCOMPRID = H03RE7_n15651VALCOMPRID[0] ;
         A15652VALCOMUMT = H03RE7_A15652VALCOMUMT[0] ;
         n15652VALCOMUMT = H03RE7_n15652VALCOMUMT[0] ;
         A15653VALCOMQTO = H03RE7_A15653VALCOMQTO[0] ;
         n15653VALCOMQTO = H03RE7_n15653VALCOMQTO[0] ;
         A15654VALCOMPRE = H03RE7_A15654VALCOMPRE[0] ;
         n15654VALCOMPRE = H03RE7_n15654VALCOMPRE[0] ;
         A15964VALCOMQTOC = H03RE7_A15964VALCOMQTOC[0] ;
         n15964VALCOMQTOC = H03RE7_n15964VALCOMQTOC[0] ;
         A15665VALCOMRTDOC = H03RE7_A15665VALCOMRTDOC[0] ;
         n15665VALCOMRTDOC = H03RE7_n15665VALCOMRTDOC[0] ;
         A15666VALCOMRNDOC = H03RE7_A15666VALCOMRNDOC[0] ;
         n15666VALCOMRNDOC = H03RE7_n15666VALCOMRNDOC[0] ;
         A15667VALCOMRLIN = H03RE7_A15667VALCOMRLIN[0] ;
         n15667VALCOMRLIN = H03RE7_n15667VALCOMRLIN[0] ;
         AV22valcomlin = A15650VALCOMLIN ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomlin_Internalname, GXutil.ltrim( GXutil.str( AV22valcomlin, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
         AV27valcomprid = A15651VALCOMPRID ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomprid_Internalname, GXutil.ltrim( GXutil.str( AV27valcomprid, 10, 0)));
         AV28VALCOMUMT = A15652VALCOMUMT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomumt_Internalname, AV28VALCOMUMT);
         AV19valcomqto = A15653VALCOMQTO ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomqto_Internalname, GXutil.ltrim( GXutil.str( AV19valcomqto, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMQTO"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")));
         GXv_char2[0] = "" ;
         GXv_char7[0] = AV20inproddsc ;
         new com.kdsproyectos.pinprod(remoteHandle, context).execute( AV27valcomprid, GXv_char2, GXv_char7) ;
         prompgenoc_impl.this.AV20inproddsc = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomprid_Internalname, GXutil.ltrim( GXutil.str( AV27valcomprid, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, edtavInproddsc_Internalname, AV20inproddsc);
         if ( GXutil.strcmp(AV95VALCOMEST, "TERMINADO") == 0 )
         {
            edtavPreunit_Enabled = 0 ;
            edtavCantidadfact_Enabled = 0 ;
         }
         else
         {
            edtavPreunit_Enabled = 1 ;
            edtavCantidadfact_Enabled = 1 ;
         }
         AV25preunit = A15654VALCOMPRE ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
         AV24cantidadfact = A15964VALCOMQTOC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
         AV26subtotal = A15654VALCOMPRE.multiply(A15964VALCOMQTOC) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSubtotal_Internalname, GXutil.ltrim( GXutil.str( AV26subtotal, 15, 2)));
         AV29VALCOMRTDOC = A15665VALCOMRTDOC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29VALCOMRTDOC", AV29VALCOMRTDOC);
         AV21valcomrndoc = A15666VALCOMRNDOC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomrndoc_Internalname, GXutil.ltrim( GXutil.str( AV21valcomrndoc, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
         AV23VALCOMRLIN = A15667VALCOMRLIN ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomrlin_Internalname, GXutil.ltrim( GXutil.str( AV23VALCOMRLIN, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
         if ( DecimalUtil.compareTo(AV19valcomqto, AV24cantidadfact) > 0 )
         {
            AV102CantidadRet = AV19valcomqto.subtract(AV24cantidadfact) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCantidadret_Internalname, GXutil.ltrim( GXutil.str( AV102CantidadRet, 15, 2)));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(145) ;
         }
         sendrow_1452( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_145_Refreshing )
         {
            httpContext.doAjaxLoad(145, Grid1Row);
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'RECUPERAALMACEN' Routine */
      AV233AINALMNID = "" ;
      /* Using cursor H03RE8 */
      pr_default.execute(6, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A46CNCDIRID = H03RE8_A46CNCDIRID[0] ;
         n46CNCDIRID = H03RE8_n46CNCDIRID[0] ;
         A462CNTPGOID = H03RE8_A462CNTPGOID[0] ;
         n462CNTPGOID = H03RE8_n462CNTPGOID[0] ;
         A507CNCDIRFBA = H03RE8_A507CNCDIRFBA[0] ;
         n507CNCDIRFBA = H03RE8_n507CNCDIRFBA[0] ;
         A533CNCDIRFSP = H03RE8_A533CNCDIRFSP[0] ;
         n533CNCDIRFSP = H03RE8_n533CNCDIRFSP[0] ;
         A8637CNTPGOHAB = H03RE8_A8637CNTPGOHAB[0] ;
         n8637CNTPGOHAB = H03RE8_n8637CNTPGOHAB[0] ;
         A15642VALCOMDOC = H03RE8_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE8_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE8_A5939CNCIASID[0] ;
         A15665VALCOMRTDOC = H03RE8_A15665VALCOMRTDOC[0] ;
         n15665VALCOMRTDOC = H03RE8_n15665VALCOMRTDOC[0] ;
         A15666VALCOMRNDOC = H03RE8_A15666VALCOMRNDOC[0] ;
         n15666VALCOMRNDOC = H03RE8_n15666VALCOMRNDOC[0] ;
         A46CNCDIRID = H03RE8_A46CNCDIRID[0] ;
         n46CNCDIRID = H03RE8_n46CNCDIRID[0] ;
         A462CNTPGOID = H03RE8_A462CNTPGOID[0] ;
         n462CNTPGOID = H03RE8_n462CNTPGOID[0] ;
         A507CNCDIRFBA = H03RE8_A507CNCDIRFBA[0] ;
         n507CNCDIRFBA = H03RE8_n507CNCDIRFBA[0] ;
         A533CNCDIRFSP = H03RE8_A533CNCDIRFSP[0] ;
         n533CNCDIRFSP = H03RE8_n533CNCDIRFSP[0] ;
         A8637CNTPGOHAB = H03RE8_A8637CNTPGOHAB[0] ;
         n8637CNTPGOHAB = H03RE8_n8637CNTPGOHAB[0] ;
         AV231AVALCOMRTDOC = A15665VALCOMRTDOC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV231AVALCOMRTDOC", AV231AVALCOMRTDOC);
         AV232AVALCOMRNDOC = A15666VALCOMRNDOC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV232AVALCOMRNDOC", GXutil.ltrim( GXutil.str( AV232AVALCOMRNDOC, 10, 0)));
         /* Using cursor H03RE9 */
         pr_default.execute(7, new Object[] {new Long(AV16CNCIASID), AV231AVALCOMRTDOC, new Long(AV232AVALCOMRNDOC)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A266ACRCOIDOC = H03RE9_A266ACRCOIDOC[0] ;
            A20CNTDOCID = H03RE9_A20CNTDOCID[0] ;
            A5939CNCIASID = H03RE9_A5939CNCIASID[0] ;
            A323ACRCOIALM = H03RE9_A323ACRCOIALM[0] ;
            n323ACRCOIALM = H03RE9_n323ACRCOIALM[0] ;
            AV233AINALMNID = A323ACRCOIALM ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV233AINALMNID, "") != 0 )
      {
         AV154INALMNID = AV233AINALMNID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
      }
   }

   public void e113RE2( )
   {
      /* Acmvoitcmb_Controlvaluechanged Routine */
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e123RE2( )
   {
      /* Cncmnmid_Click Routine */
      if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) == 0 )
      {
         edtavAcmvoitcmb_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoitcmb_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoitcmb_Visible, 5, 0)), true);
         lblMon1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblMon1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon1_Visible, 5, 0)), true);
         AV9ACMVOITCMB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
      }
      else
      {
         edtavAcmvoitcmb_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoitcmb_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoitcmb_Visible, 5, 0)), true);
         lblMon1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblMon1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon1_Visible, 5, 0)), true);
      }
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e273RE2( )
   {
      /* Cantidadfact_Controlvaluechanged Routine */
      AV26subtotal = AV25preunit.multiply(AV24cantidadfact) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSubtotal_Internalname, GXutil.ltrim( GXutil.str( AV26subtotal, 15, 2)));
      /* Execute user subroutine: 'ACTUALIZAR' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e283RE2( )
   {
      /* Preunit_Controlvaluechanged Routine */
      AV26subtotal = AV25preunit.multiply(AV24cantidadfact) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSubtotal_Internalname, GXutil.ltrim( GXutil.str( AV26subtotal, 15, 2)));
      /* Execute user subroutine: 'ACTUALIZAR' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'ACTUALIZAR' Routine */
      new com.kdsproyectos.updvalcom1(remoteHandle, context).execute( AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, AV22valcomlin, AV25preunit, AV24cantidadfact, "", 0, 0, (short)(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, edtavValcomlin_Internalname, GXutil.ltrim( GXutil.str( AV22valcomlin, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_idx, getSecureSignedToken( sGXsfl_145_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
      httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
   }

   public void e133RE2( )
   {
      /* 'Generar OC' Routine */
      AV126ACMROIREF = GXutil.trim( AV129serie) + GXutil.trim( AV130folio) ;
      if ( GXutil.strcmp(AV154INALMNID, "") != 0 )
      {
         if ( GXutil.strcmp(AV126ACMROIREF, "") != 0 )
         {
            if ( !( GXutil.dateCompare(AV128ACMROIFDOC, GXutil.nullDate()) ) )
            {
               if ( ( AV30subtotal_oc.doubleValue() != 0 ) && ( GXutil.strcmp(AV6CNTPGOID, "") != 0 ) )
               {
                  AV152avanza = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV152avanza", GXutil.ltrim( GXutil.str( AV152avanza, 4, 0)));
                  if ( ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 ) && ( AV9ACMVOITCMB.doubleValue() == 0 ) )
                  {
                     AV152avanza = (short)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV152avanza", GXutil.ltrim( GXutil.str( AV152avanza, 4, 0)));
                  }
                  if ( AV117CNUSERGPO == 0 )
                  {
                     AV119haydoc = (short)(1) ;
                  }
                  else
                  {
                     AV119haydoc = (short)(0) ;
                     /* Using cursor H03RE10 */
                     pr_default.execute(8, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
                     while ( (pr_default.getStatus(8) != 101) )
                     {
                        A15965VALCOMIDA = H03RE10_A15965VALCOMIDA[0] ;
                        A15642VALCOMDOC = H03RE10_A15642VALCOMDOC[0] ;
                        A20CNTDOCID = H03RE10_A20CNTDOCID[0] ;
                        A5939CNCIASID = H03RE10_A5939CNCIASID[0] ;
                        AV119haydoc = (short)(1) ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                        pr_default.readNext(8);
                     }
                     pr_default.close(8);
                  }
                  if ( ( AV152avanza == 1 ) && ( AV119haydoc == 1 ) )
                  {
                     GXv_int3[0] = AV34ACMVOIDOC ;
                     new com.kdsproyectos.pconsecutivo(remoteHandle, context).execute( "OMP", AV16CNCIASID, GXv_int3) ;
                     prompgenoc_impl.this.AV34ACMVOIDOC = GXv_int3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                     if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
                     {
                        AV101SUBOC = AV91subtotal_ext ;
                     }
                     else
                     {
                        AV101SUBOC = AV30subtotal_oc ;
                     }
                     if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
                     {
                        AV113ACMVOIPDTOF = AV109ACMVOIPDTO ;
                        AV114ACMVOIPDESF = AV110ACMVOIPDES ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV114ACMVOIPDESF", GXutil.ltrim( GXutil.str( AV114ACMVOIPDESF, 17, 2)));
                        AV115ACMVOIPDTO_G = AV109ACMVOIPDTO ;
                        AV116ACMVOIPDES_G = AV110ACMVOIPDES.multiply(AV9ACMVOITCMB) ;
                     }
                     else
                     {
                        AV115ACMVOIPDTO_G = AV109ACMVOIPDTO ;
                        AV116ACMVOIPDES_G = AV110ACMVOIPDES ;
                        AV113ACMVOIPDTOF = AV109ACMVOIPDTO ;
                        if ( DecimalUtil.compareTo(AV9ACMVOITCMB, DecimalUtil.ZERO) != 0 )
                        {
                           AV114ACMVOIPDESF = AV110ACMVOIPDES.divide(AV9ACMVOITCMB, 18, java.math.BigDecimal.ROUND_DOWN) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV114ACMVOIPDESF", GXutil.ltrim( GXutil.str( AV114ACMVOIPDESF, 17, 2)));
                        }
                     }
                     new com.kdsproyectos.updvalcom(remoteHandle, context).execute( AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, AV32CNCMNMID, AV80CNUSERID, AV9ACMVOITCMB, AV34ACMVOIDOC, "", AV11CNTIVAID, AV6CNTPGOID, AV107incDes, AV108tipoDes, AV115ACMVOIPDTO_G, AV116ACMVOIPDES_G, AV113ACMVOIPDTOF, AV114ACMVOIPDESF) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                     httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
                     httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
                     httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
                     httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
                     httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
                     httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
                     httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
                     httpContext.ajax_rsp_assign_attri("", false, "AV107incDes", AV107incDes);
                     httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
                     httpContext.ajax_rsp_assign_attri("", false, "AV114ACMVOIPDESF", GXutil.ltrim( GXutil.str( AV114ACMVOIPDESF, 17, 2)));
                     AV35LINEA = DecimalUtil.doubleToDec(0) ;
                     AV230GENEROOC = "N" ;
                     /* Start For Each Line in Grid1 */
                     nRC_GXsfl_145 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), ".", ",")) ;
                     nGXsfl_145_fel_idx = (short)(0) ;
                     while ( nGXsfl_145_fel_idx < nRC_GXsfl_145 )
                     {
                        nGXsfl_145_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_fel_idx+1)) ;
                        sGXsfl_145_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_fel_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_fel_1452( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") > 9999999999L ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMLIN");
                           GX_FocusControl = edtavValcomlin_Internalname ;
                           wbErr = true ;
                           AV22valcomlin = 0 ;
                        }
                        else
                        {
                           AV22valcomlin = localUtil.ctol( httpContext.cgiGet( edtavValcomlin_Internalname), ".", ",") ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") > 9999999999L ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMRNDOC");
                           GX_FocusControl = edtavValcomrndoc_Internalname ;
                           wbErr = true ;
                           AV21valcomrndoc = 0 ;
                        }
                        else
                        {
                           AV21valcomrndoc = localUtil.ctol( httpContext.cgiGet( edtavValcomrndoc_Internalname), ".", ",") ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") > 9999999999L ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMRLIN");
                           GX_FocusControl = edtavValcomrlin_Internalname ;
                           wbErr = true ;
                           AV23VALCOMRLIN = 0 ;
                        }
                        else
                        {
                           AV23VALCOMRLIN = localUtil.ctol( httpContext.cgiGet( edtavValcomrlin_Internalname), ".", ",") ;
                        }
                        AV20inproddsc = httpContext.cgiGet( edtavInproddsc_Internalname) ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMQTO");
                           GX_FocusControl = edtavValcomqto_Internalname ;
                           wbErr = true ;
                           AV19valcomqto = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV19valcomqto = localUtil.ctond( httpContext.cgiGet( edtavValcomqto_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADFACT");
                           GX_FocusControl = edtavCantidadfact_Internalname ;
                           wbErr = true ;
                           AV24cantidadfact = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV24cantidadfact = localUtil.ctond( httpContext.cgiGet( edtavCantidadfact_Internalname)) ;
                        }
                        AV28VALCOMUMT = httpContext.cgiGet( edtavValcomumt_Internalname) ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)), DecimalUtil.stringToDec("9999999999.9999")) > 0 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPREUNIT");
                           GX_FocusControl = edtavPreunit_Internalname ;
                           wbErr = true ;
                           AV25preunit = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV25preunit = localUtil.ctond( httpContext.cgiGet( edtavPreunit_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBTOTAL");
                           GX_FocusControl = edtavSubtotal_Internalname ;
                           wbErr = true ;
                           AV26subtotal = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV26subtotal = localUtil.ctond( httpContext.cgiGet( edtavSubtotal_Internalname)) ;
                        }
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") > 9999999999L ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALCOMPRID");
                           GX_FocusControl = edtavValcomprid_Internalname ;
                           wbErr = true ;
                           AV27valcomprid = 0 ;
                        }
                        else
                        {
                           AV27valcomprid = localUtil.ctol( httpContext.cgiGet( edtavValcomprid_Internalname), ".", ",") ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADRET");
                           GX_FocusControl = edtavCantidadret_Internalname ;
                           wbErr = true ;
                           AV102CantidadRet = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           AV102CantidadRet = localUtil.ctond( httpContext.cgiGet( edtavCantidadret_Internalname)) ;
                        }
                        if ( ( AV24cantidadfact.doubleValue() != 0 ) && ( AV25preunit.doubleValue() != 0 ) )
                        {
                           AV35LINEA = AV35LINEA.add(DecimalUtil.doubleToDec(1)) ;
                           GXv_decimal6[0] = AV36acmvoilin ;
                           new com.kdsproyectos.paltaoc(remoteHandle, context).execute( AV16CNCIASID, "OMP", AV34ACMVOIDOC, AV13CNCDIRID, AV35LINEA, AV21valcomrndoc, AV29VALCOMRTDOC, DecimalUtil.doubleToDec(AV23VALCOMRLIN), AV25preunit, AV32CNCMNMID, AV9ACMVOITCMB, AV6CNTPGOID, AV24cantidadfact, AV11CNTIVAID, AV154INALMNID, AV101SUBOC, AV115ACMVOIPDTO_G, AV116ACMVOIPDES_G, AV113ACMVOIPDTOF, AV114ACMVOIPDESF, GXv_decimal6) ;
                           prompgenoc_impl.this.AV36acmvoilin = GXv_decimal6[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomrndoc_Internalname, GXutil.ltrim( GXutil.str( AV21valcomrndoc, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_fel_idx, getSecureSignedToken( sGXsfl_145_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, "AV29VALCOMRTDOC", AV29VALCOMRTDOC);
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomrlin_Internalname, GXutil.ltrim( GXutil.str( AV23VALCOMRLIN, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_fel_idx, getSecureSignedToken( sGXsfl_145_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
                           httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
                           httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
                           httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
                           httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
                           httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
                           httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
                           httpContext.ajax_rsp_assign_attri("", false, "AV114ACMVOIPDESF", GXutil.ltrim( GXutil.str( AV114ACMVOIPDESF, 17, 2)));
                           new com.kdsproyectos.updvalcom1(remoteHandle, context).execute( AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, AV22valcomlin, AV25preunit, AV24cantidadfact, "OMP", AV34ACMVOIDOC, (long)(DecimalUtil.decToDouble(AV36acmvoilin)), (short)(1)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
                           httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomlin_Internalname, GXutil.ltrim( GXutil.str( AV22valcomlin, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMLIN"+"_"+sGXsfl_145_fel_idx, getSecureSignedToken( sGXsfl_145_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, edtavPreunit_Internalname, GXutil.ltrim( GXutil.str( AV25preunit, 15, 4)));
                           httpContext.ajax_rsp_assign_attri("", false, edtavCantidadfact_Internalname, GXutil.ltrim( GXutil.str( AV24cantidadfact, 15, 4)));
                           if ( GXutil.strcmp(AV230GENEROOC, "N") == 0 )
                           {
                              new com.kdsproyectos.actualizafautoc(remoteHandle, context).execute( AV16CNCIASID, "OMP", AV34ACMVOIDOC, AV80CNUSERID) ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                              httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
                           }
                           AV230GENEROOC = "S" ;
                        }
                        if ( DecimalUtil.compareTo(AV24cantidadfact, AV19valcomqto) < 0 )
                        {
                           AV100cantidadreg = AV19valcomqto.subtract(AV24cantidadfact) ;
                           new com.kdsproyectos.pregrereq(remoteHandle, context).execute( AV16CNCIASID, AV29VALCOMRTDOC, AV21valcomrndoc, (int)(AV23VALCOMRLIN), AV100cantidadreg) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, "AV29VALCOMRTDOC", AV29VALCOMRTDOC);
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomrndoc_Internalname, GXutil.ltrim( GXutil.str( AV21valcomrndoc, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRNDOC"+"_"+sGXsfl_145_fel_idx, getSecureSignedToken( sGXsfl_145_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")));
                           httpContext.ajax_rsp_assign_attri("", false, edtavValcomrlin_Internalname, GXutil.ltrim( GXutil.str( AV23VALCOMRLIN, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMRLIN"+"_"+sGXsfl_145_fel_idx, getSecureSignedToken( sGXsfl_145_fel_idx, localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")));
                        }
                        /* End For Each Line */
                     }
                     if ( nGXsfl_145_fel_idx == 0 )
                     {
                        nGXsfl_145_idx = (short)(1) ;
                        sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1452( ) ;
                     }
                     nGXsfl_145_fel_idx = (short)(1) ;
                     /* Execute user subroutine: 'ESTATUS' */
                     S122 ();
                     if (returnInSub) return;
                     if ( AV117CNUSERGPO == 0 )
                     {
                        lblTxt_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.aracimoc2vis") + "?" + GXutil.URLEncode(GXutil.rtrim("DAS")) + "," + GXutil.URLEncode(GXutil.rtrim("WACIMOC2")) + "," + GXutil.URLEncode(GXutil.rtrim("1")) + "," + GXutil.URLEncode(GXutil.rtrim("ESP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("OMP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV34ACMVOIDOC,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("OrdendeCompra")) + "," + GXutil.URLEncode(GXutil.rtrim("PRE"))+"\", \"_blank\", \"location=no,status=no,titlebar=no,directories=no,menubar=no,toolbar=no,scrollbars=yes,resizable=no,top=50,left=300,width=1300,height=700\");</script>" ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTxt_Internalname, "Caption", lblTxt_Caption, true);
                        GXv_int3[0] = AV121ACMROINDOC ;
                        new com.kdsproyectos.pgenerarrecepcionvoc(remoteHandle, context).execute( AV80CNUSERID, AV16CNCIASID, "OMP", AV34ACMVOIDOC, (short)(1), AV128ACMROIFDOC, AV127ACMROIOBST, AV126ACMROIREF, AV154INALMNID, GXv_int3) ;
                        prompgenoc_impl.this.AV121ACMROINDOC = GXv_int3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
                        httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV128ACMROIFDOC", localUtil.format(AV128ACMROIFDOC, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "AV127ACMROIOBST", AV127ACMROIOBST);
                        httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
                        httpContext.ajax_rsp_assign_attri("", false, "AV121ACMROINDOC", GXutil.ltrim( GXutil.str( AV121ACMROINDOC, 10, 0)));
                        /* Execute user subroutine: 'DATOSRECEP' */
                        S172 ();
                        if (returnInSub) return;
                        GXt_dtime8 = GXutil.resetTime( AV128ACMROIFDOC );
                        AV220PMFechRev = GXutil.resetTime(GXutil.dtadd( GXt_dtime8, 86400*(AV219CNTPGODIAS))) ;
                        AV225EstructImpId = AV223CNCDIRESTIMP ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV225EstructImpId", AV225EstructImpId);
                        if ( GXutil.strcmp(AV225EstructImpId, "") != 0 )
                        {
                           /* Execute user subroutine: 'CALCULA RETENCION' */
                           S182 ();
                           if (returnInSub) return;
                        }
                        GXv_decimal6[0] = AV141ACMROINM ;
                        GXv_char7[0] = AV149cadena ;
                        GXv_char2[0] = AV145PMTipoDoc ;
                        GXv_int3[0] = AV146PMNumDoc ;
                        new com.kdsproyectos.paltacxpocac(remoteHandle, context).execute( AV16CNCIASID, AV80CNUSERID, AV126ACMROIREF, AV128ACMROIFDOC, AV220PMFechRev, AV220PMFechRev, AV225EstructImpId, DecimalUtil.doubleToDec(0), AV141ACMROINM, AV18cnciasmon, AV140ACMROING, GXv_decimal6, AV34ACMVOIDOC, "OMP", AV142sdtRec, GXv_char7, GXv_char2, GXv_int3, DecimalUtil.doubleToDec(0), 0, AV222PMMnFacXML) ;
                        prompgenoc_impl.this.AV141ACMROINM = GXv_decimal6[0] ;
                        prompgenoc_impl.this.AV149cadena = GXv_char7[0] ;
                        prompgenoc_impl.this.AV145PMTipoDoc = GXv_char2[0] ;
                        prompgenoc_impl.this.AV146PMNumDoc = GXv_int3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
                        httpContext.ajax_rsp_assign_attri("", false, "AV128ACMROIFDOC", localUtil.format(AV128ACMROIFDOC, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "AV225EstructImpId", AV225EstructImpId);
                        httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV18cnciasmon", AV18cnciasmon);
                        httpContext.ajax_rsp_assign_attri("", false, "AV140ACMROING", GXutil.ltrim( GXutil.str( AV140ACMROING, 15, 4)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV149cadena", AV149cadena);
                        httpContext.ajax_rsp_assign_attri("", false, "AV145PMTipoDoc", AV145PMTipoDoc);
                        httpContext.ajax_rsp_assign_attri("", false, "AV146PMNumDoc", GXutil.ltrim( GXutil.str( AV146PMNumDoc, 10, 0)));
                        httpContext.ajax_rsp_assign_attri("", false, "AV222PMMnFacXML", GXutil.ltrim( GXutil.str( AV222PMMnFacXML, 15, 2)));
                        this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Se Generó la Orden de compra N° "+GXutil.trim( GXutil.str( AV34ACMVOIDOC, 10, 0))+" con recepción N° "+GXutil.str( AV121ACMROINDOC, 10, 0)+" "+GXutil.trim( AV149cadena)});
                        /* Execute user subroutine: 'RELACIONAARCHIVOSARECEPCION' */
                        S192 ();
                        if (returnInSub) return;
                        if ( GXutil.strcmp(AV123MostrarComplemento, "S") == 0 )
                        {
                           lblTxt_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.aacreocfap") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV125ACMROITDOC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV121ACMROINDOC,10,0)))+"\", \"_blank\", \"location=no,status=no,titlebar=no,directories=no,menubar=no,toolbar=no,scrollbars=yes,resizable=no,top=50,left=300,width=1300,height=700\");</script>" ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTxt_Internalname, "Caption", lblTxt_Caption, true);
                        }
                        else
                        {
                           lblTxt_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.aacreocf1") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV125ACMROITDOC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV121ACMROINDOC,10,0)))+"\", \"_blank\", \"location=no,status=no,titlebar=no,directories=no,menubar=no,toolbar=no,scrollbars=yes,resizable=no,top=50,left=300,width=1300,height=700\");</script>" ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTxt_Internalname, "Caption", lblTxt_Caption, true);
                        }
                        if ( GXutil.strcmp(AV124omitirc, "S") != 0 )
                        {
                           new com.kdsproyectos.penviacorreorecep(remoteHandle, context).execute( AV125ACMROITDOC, AV121ACMROINDOC, AV16CNCIASID) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV125ACMROITDOC", AV125ACMROITDOC);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vACMROITDOC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV125ACMROITDOC, ""))));
                           httpContext.ajax_rsp_assign_attri("", false, "AV121ACMROINDOC", GXutil.ltrim( GXutil.str( AV121ACMROINDOC, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
                        }
                     }
                     gxgrgrid1_refresh( AV28VALCOMUMT, AV95VALCOMEST, AV117CNUSERGPO, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15650VALCOMLIN, A15651VALCOMPRID, A15652VALCOMUMT, A15653VALCOMQTO, A15654VALCOMPRE, A15964VALCOMQTOC, A15665VALCOMRTDOC, A15666VALCOMRNDOC, A15667VALCOMRLIN, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
                  }
                  else
                  {
                     if ( AV152avanza == 0 )
                     {
                        this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Ingrese un tipo de cambio."});
                     }
                     if ( AV119haydoc == 0 )
                     {
                        this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Favor de adjuntar la factura."});
                     }
                  }
               }
               else
               {
                  AV86MENSAJE = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV86MENSAJE", AV86MENSAJE);
                  if ( GXutil.strcmp(AV6CNTPGOID, "") == 0 )
                  {
                     this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Ingrese las condiciones de Pago."});
                  }
               }
            }
            else
            {
               this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Ingrese la fecha de factura."});
            }
         }
         else
         {
            this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Ingrese el N° de la factura."});
         }
      }
      else
      {
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","Indique el almacén de recepción."});
      }
      /*  Sending Event outputs  */
      cmbavInalmnid.setValue( GXutil.rtrim( AV154INALMNID) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavInalmnid.getInternalname(), "Values", cmbavInalmnid.ToJavascriptSource(), true);
      dynavCntpgoid.setValue( GXutil.rtrim( AV6CNTPGOID) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCntpgoid.getInternalname(), "Values", dynavCntpgoid.ToJavascriptSource(), true);
      cmbavTipodes.setValue( GXutil.rtrim( AV108tipoDes) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Values", cmbavTipodes.ToJavascriptSource(), true);
      dynavCntivaid.setValue( GXutil.rtrim( AV11CNTIVAID) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCntivaid.getInternalname(), "Values", dynavCntivaid.ToJavascriptSource(), true);
      cmbavCncmnmid.setValue( GXutil.rtrim( AV32CNCMNMID) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCncmnmid.getInternalname(), "Values", cmbavCncmnmid.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV142sdtRec", AV142sdtRec);
   }

   public void S182( )
   {
      /* 'CALCULA RETENCION' Routine */
      AV227timp = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H03RE11 */
      pr_default.execute(9, new Object[] {AV225EstructImpId});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2875EstructImpId = H03RE11_A2875EstructImpId[0] ;
         A2876EstructImpDsc = H03RE11_A2876EstructImpDsc[0] ;
         n2876EstructImpDsc = H03RE11_n2876EstructImpDsc[0] ;
         A3366EstructImpTip = H03RE11_A3366EstructImpTip[0] ;
         n3366EstructImpTip = H03RE11_n3366EstructImpTip[0] ;
         AV226EstructImpDsc = A2876EstructImpDsc ;
         AV224EstructImpTip = A3366EstructImpTip ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Using cursor H03RE12 */
      pr_default.execute(10, new Object[] {AV225EstructImpId});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A2875EstructImpId = H03RE12_A2875EstructImpId[0] ;
         A458CNTIVAID = H03RE12_A458CNTIVAID[0] ;
         n458CNTIVAID = H03RE12_n458CNTIVAID[0] ;
         A993CNTIVAPRC = H03RE12_A993CNTIVAPRC[0] ;
         n993CNTIVAPRC = H03RE12_n993CNTIVAPRC[0] ;
         A993CNTIVAPRC = H03RE12_A993CNTIVAPRC[0] ;
         n993CNTIVAPRC = H03RE12_n993CNTIVAPRC[0] ;
         AV228estcntivaid = A458CNTIVAID ;
         AV229estCNTIVAPRC = A993CNTIVAPRC ;
         AV227timp = AV227timp.add(((AV140ACMROING.multiply(AV229estCNTIVAPRC)).divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV224EstructImpTip, "RET") == 0 )
      {
         AV141ACMROINM = (AV140ACMROING.subtract(AV120MTODES)).add(((AV140ACMROING.subtract(AV120MTODES)).multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))))).subtract(AV227timp) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
      }
      else
      {
         AV141ACMROINM = (AV140ACMROING.subtract(AV120MTODES)).add(((AV140ACMROING.subtract(AV120MTODES)).multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))))).add(AV227timp) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
      }
   }

   public void S172( )
   {
      /* 'DATOSRECEP' Routine */
      AV142sdtRec = new GXBaseCollection<com.kdsproyectos.SdtSDTRec_SDTRecItem>(com.kdsproyectos.SdtSDTRec_SDTRecItem.class, "SDTRecItem", "KDSProyectos", remoteHandle) ;
      AV140ACMROING = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140ACMROING", GXutil.ltrim( GXutil.str( AV140ACMROING, 15, 4)));
      AV141ACMROINM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
      /* Using cursor H03RE13 */
      pr_default.execute(11, new Object[] {new Long(AV16CNCIASID), AV125ACMROITDOC, new Long(AV121ACMROINDOC)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A821ACMROITDOC = H03RE13_A821ACMROITDOC[0] ;
         A822ACMROINDOC = H03RE13_A822ACMROINDOC[0] ;
         A5939CNCIASID = H03RE13_A5939CNCIASID[0] ;
         A827ACMROINP = H03RE13_A827ACMROINP[0] ;
         n827ACMROINP = H03RE13_n827ACMROINP[0] ;
         A826ACMROIQT = H03RE13_A826ACMROIQT[0] ;
         n826ACMROIQT = H03RE13_n826ACMROIQT[0] ;
         A824ACMROILIN = H03RE13_A824ACMROILIN[0] ;
         AV141ACMROINM = AV141ACMROINM.add((A826ACMROIQT.multiply(A827ACMROINP))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
         AV140ACMROING = AV140ACMROING.add((A826ACMROIQT.multiply(A827ACMROINP))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140ACMROING", GXutil.ltrim( GXutil.str( AV140ACMROING, 15, 4)));
         AV144sdtRecitem = (com.kdsproyectos.SdtSDTRec_SDTRecItem)new com.kdsproyectos.SdtSDTRec_SDTRecItem(remoteHandle, context);
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Cia( A5939CNCIASID );
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Tdc( A821ACMROITDOC );
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Ndc( A822ACMROINDOC );
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Lin( (long)(DecimalUtil.decToDouble(A824ACMROILIN)) );
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Desc( DecimalUtil.doubleToDec(0) );
         AV144sdtRecitem.setgxTv_SdtSDTRec_SDTRecItem_Ant( DecimalUtil.doubleToDec(0) );
         AV142sdtRec.add(AV144sdtRecitem.Clone(), 0);
         pr_default.readNext(11);
      }
      pr_default.close(11);
      AV141ACMROINM = (AV140ACMROING.subtract(AV120MTODES)).add(((AV140ACMROING.subtract(AV120MTODES)).multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141ACMROINM", GXutil.ltrim( GXutil.str( AV141ACMROINM, 15, 4)));
   }

   public void e143RE2( )
   {
      /* 'Subir Archivo' Routine */
      if ( ( AV75UploadedFiles.size() > 0 ) && ( GXutil.strcmp(AV78NAME, "") != 0 ) )
      {
         AV247GXV1 = 1 ;
         while ( AV247GXV1 <= AV75UploadedFiles.size() )
         {
            AV76FileUploadData = (com.kdsproyectos.SdtFileUploadData)((com.kdsproyectos.SdtFileUploadData)AV75UploadedFiles.elementAt(-1+AV247GXV1));
            AV77BLOB = AV76FileUploadData.getgxTv_SdtFileUploadData_File() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
            new com.kdsproyectos.pvalcom2(remoteHandle, context).execute( "INS", AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, 0, AV78NAME, AV76FileUploadData.getgxTv_SdtFileUploadData_Extension(), AV77BLOB, AV76FileUploadData.getgxTv_SdtFileUploadData_File(), AV80CNUSERID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
            httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
            httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
            AV247GXV1 = (int)(AV247GXV1+1) ;
         }
         AV78NAME = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
         AV75UploadedFiles.clear();
         this.executeUsercontrolMethod("", false, "FILEUPLOAD1Container", "Clear", "", new Object[] {});
         gxgrsfl_3_refresh( A15965VALCOMIDA, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15966VALCOMNMA, A15970VALCOMFECA, A15967VALCOMBLOB, A15968VALCOMTIPAR, A15969VALCOMUSRA, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
      }
      else
      {
         if ( GXutil.strcmp(AV78NAME, "") == 0 )
         {
            AV86MENSAJE = "Ingrese un nombre del archivo<br/>" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86MENSAJE", AV86MENSAJE);
         }
         if ( AV75UploadedFiles.size() == 0 )
         {
            AV86MENSAJE = "Seleccione algún archivo<br/>" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86MENSAJE", AV86MENSAJE);
         }
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",AV86MENSAJE});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75UploadedFiles", AV75UploadedFiles);
   }

   public void e303RE2( )
   {
      /* 'Eliminar Doc' Routine */
      new com.kdsproyectos.pvalcom2(remoteHandle, context).execute( "DEL", AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, AV85valcomida, "", "", AV79VALCOMBLOB, "", AV80CNUSERID) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, edtavValcomida_Internalname, GXutil.ltrim( GXutil.str( AV85valcomida, 10, 0)));
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "URL", httpContext.getResourceRelative(AV79VALCOMBLOB), !bGXsfl_228_Refreshing);
      httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
      gxgrsfl_3_refresh( A15965VALCOMIDA, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15966VALCOMNMA, A15970VALCOMFECA, A15967VALCOMBLOB, A15968VALCOMTIPAR, A15969VALCOMUSRA, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
   }

   public void e153RE2( )
   {
      /* 'Regresar' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e163RE2( )
   {
      /* Cntivaid_Click Routine */
      /* Execute user subroutine: 'IVA' */
      S132 ();
      if (returnInSub) return;
      gxgrgrid1_refresh( AV28VALCOMUMT, AV95VALCOMEST, AV117CNUSERGPO, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15650VALCOMLIN, A15651VALCOMPRID, A15652VALCOMUMT, A15653VALCOMQTO, A15654VALCOMPRE, A15964VALCOMQTOC, A15665VALCOMRTDOC, A15666VALCOMRNDOC, A15667VALCOMRLIN, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'IVA' Routine */
      /* Using cursor H03RE14 */
      pr_default.execute(12, new Object[] {AV11CNTIVAID});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A458CNTIVAID = H03RE14_A458CNTIVAID[0] ;
         n458CNTIVAID = H03RE14_n458CNTIVAID[0] ;
         A993CNTIVAPRC = H03RE14_A993CNTIVAPRC[0] ;
         n993CNTIVAPRC = H03RE14_n993CNTIVAPRC[0] ;
         AV12CNTIVAPRC = A993CNTIVAPRC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12CNTIVAPRC", GXutil.ltrim( GXutil.str( AV12CNTIVAPRC, 11, 4)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void e173RE2( )
   {
      /* Cncdirnom_Controlvaluechanged Routine */
      if ( GXutil.strcmp(AV8cncdirnom, "") != 0 )
      {
         AV250GXLvl616 = (byte)(0) ;
         /* Using cursor H03RE15 */
         pr_default.execute(13, new Object[] {AV8cncdirnom});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A507CNCDIRFBA = H03RE15_A507CNCDIRFBA[0] ;
            n507CNCDIRFBA = H03RE15_n507CNCDIRFBA[0] ;
            A533CNCDIRFSP = H03RE15_A533CNCDIRFSP[0] ;
            n533CNCDIRFSP = H03RE15_n533CNCDIRFSP[0] ;
            A194CNCDIRNOM = H03RE15_A194CNCDIRNOM[0] ;
            n194CNCDIRNOM = H03RE15_n194CNCDIRNOM[0] ;
            A46CNCDIRID = H03RE15_A46CNCDIRID[0] ;
            n46CNCDIRID = H03RE15_n46CNCDIRID[0] ;
            A199CNCDIRRFC = H03RE15_A199CNCDIRRFC[0] ;
            n199CNCDIRRFC = H03RE15_n199CNCDIRRFC[0] ;
            A2882CNCDIRESTIMP = H03RE15_A2882CNCDIRESTIMP[0] ;
            n2882CNCDIRESTIMP = H03RE15_n2882CNCDIRESTIMP[0] ;
            AV250GXLvl616 = (byte)(1) ;
            AV13CNCDIRID = A46CNCDIRID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
            AV8cncdirnom = A194CNCDIRNOM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cncdirnom", AV8cncdirnom);
            AV151CNCDIRRFC = A199CNCDIRRFC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
            AV223CNCDIRESTIMP = A2882CNCDIRESTIMP ;
            httpContext.ajax_rsp_assign_attri("", false, "AV223CNCDIRESTIMP", AV223CNCDIRESTIMP);
            new com.kdsproyectos.actualizaprovvoc(remoteHandle, context).execute( AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, AV13CNCDIRID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
            pr_default.readNext(13);
         }
         pr_default.close(13);
         if ( AV250GXLvl616 == 0 )
         {
            /* Using cursor H03RE16 */
            pr_default.execute(14, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
            while ( (pr_default.getStatus(14) != 101) )
            {
               A15642VALCOMDOC = H03RE16_A15642VALCOMDOC[0] ;
               A20CNTDOCID = H03RE16_A20CNTDOCID[0] ;
               A5939CNCIASID = H03RE16_A5939CNCIASID[0] ;
               A46CNCDIRID = H03RE16_A46CNCDIRID[0] ;
               n46CNCDIRID = H03RE16_n46CNCDIRID[0] ;
               A194CNCDIRNOM = H03RE16_A194CNCDIRNOM[0] ;
               n194CNCDIRNOM = H03RE16_n194CNCDIRNOM[0] ;
               A199CNCDIRRFC = H03RE16_A199CNCDIRRFC[0] ;
               n199CNCDIRRFC = H03RE16_n199CNCDIRRFC[0] ;
               A2882CNCDIRESTIMP = H03RE16_A2882CNCDIRESTIMP[0] ;
               n2882CNCDIRESTIMP = H03RE16_n2882CNCDIRESTIMP[0] ;
               A194CNCDIRNOM = H03RE16_A194CNCDIRNOM[0] ;
               n194CNCDIRNOM = H03RE16_n194CNCDIRNOM[0] ;
               A199CNCDIRRFC = H03RE16_A199CNCDIRRFC[0] ;
               n199CNCDIRRFC = H03RE16_n199CNCDIRRFC[0] ;
               A2882CNCDIRESTIMP = H03RE16_A2882CNCDIRESTIMP[0] ;
               n2882CNCDIRESTIMP = H03RE16_n2882CNCDIRESTIMP[0] ;
               AV13CNCDIRID = A46CNCDIRID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
               AV8cncdirnom = A194CNCDIRNOM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8cncdirnom", AV8cncdirnom);
               AV151CNCDIRRFC = A199CNCDIRRFC ;
               httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
               AV223CNCDIRESTIMP = A2882CNCDIRESTIMP ;
               httpContext.ajax_rsp_assign_attri("", false, "AV223CNCDIRESTIMP", AV223CNCDIRESTIMP);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(14);
         }
      }
      else
      {
         /* Using cursor H03RE17 */
         pr_default.execute(15, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A15642VALCOMDOC = H03RE17_A15642VALCOMDOC[0] ;
            A20CNTDOCID = H03RE17_A20CNTDOCID[0] ;
            A5939CNCIASID = H03RE17_A5939CNCIASID[0] ;
            A46CNCDIRID = H03RE17_A46CNCDIRID[0] ;
            n46CNCDIRID = H03RE17_n46CNCDIRID[0] ;
            A194CNCDIRNOM = H03RE17_A194CNCDIRNOM[0] ;
            n194CNCDIRNOM = H03RE17_n194CNCDIRNOM[0] ;
            A199CNCDIRRFC = H03RE17_A199CNCDIRRFC[0] ;
            n199CNCDIRRFC = H03RE17_n199CNCDIRRFC[0] ;
            A194CNCDIRNOM = H03RE17_A194CNCDIRNOM[0] ;
            n194CNCDIRNOM = H03RE17_n194CNCDIRNOM[0] ;
            A199CNCDIRRFC = H03RE17_A199CNCDIRRFC[0] ;
            n199CNCDIRRFC = H03RE17_n199CNCDIRRFC[0] ;
            AV13CNCDIRID = A46CNCDIRID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
            AV8cncdirnom = A194CNCDIRNOM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cncdirnom", AV8cncdirnom);
            AV151CNCDIRRFC = A199CNCDIRRFC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ESTATUS' Routine */
      /* Using cursor H03RE18 */
      pr_default.execute(16, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A15642VALCOMDOC = H03RE18_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE18_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE18_A5939CNCIASID[0] ;
         A46CNCDIRID = H03RE18_A46CNCDIRID[0] ;
         n46CNCDIRID = H03RE18_n46CNCDIRID[0] ;
         A194CNCDIRNOM = H03RE18_A194CNCDIRNOM[0] ;
         n194CNCDIRNOM = H03RE18_n194CNCDIRNOM[0] ;
         A199CNCDIRRFC = H03RE18_A199CNCDIRRFC[0] ;
         n199CNCDIRRFC = H03RE18_n199CNCDIRRFC[0] ;
         A15643VALCOMPRY = H03RE18_A15643VALCOMPRY[0] ;
         n15643VALCOMPRY = H03RE18_n15643VALCOMPRY[0] ;
         A15647VALCOMMON = H03RE18_A15647VALCOMMON[0] ;
         n15647VALCOMMON = H03RE18_n15647VALCOMMON[0] ;
         A15648VALCOMEST = H03RE18_A15648VALCOMEST[0] ;
         n15648VALCOMEST = H03RE18_n15648VALCOMEST[0] ;
         A15652VALCOMUMT = H03RE18_A15652VALCOMUMT[0] ;
         n15652VALCOMUMT = H03RE18_n15652VALCOMUMT[0] ;
         A2882CNCDIRESTIMP = H03RE18_A2882CNCDIRESTIMP[0] ;
         n2882CNCDIRESTIMP = H03RE18_n2882CNCDIRESTIMP[0] ;
         A15971VALCOMTCAM = H03RE18_A15971VALCOMTCAM[0] ;
         n15971VALCOMTCAM = H03RE18_n15971VALCOMTCAM[0] ;
         A15972VALCOMNOC = H03RE18_A15972VALCOMNOC[0] ;
         n15972VALCOMNOC = H03RE18_n15972VALCOMNOC[0] ;
         A15973VALCOMALME = H03RE18_A15973VALCOMALME[0] ;
         n15973VALCOMALME = H03RE18_n15973VALCOMALME[0] ;
         A15974VALCOMTIVA = H03RE18_A15974VALCOMTIVA[0] ;
         n15974VALCOMTIVA = H03RE18_n15974VALCOMTIVA[0] ;
         A15975VALCOMCPGO = H03RE18_A15975VALCOMCPGO[0] ;
         n15975VALCOMCPGO = H03RE18_n15975VALCOMCPGO[0] ;
         A16310VALCOMINCDTO = H03RE18_A16310VALCOMINCDTO[0] ;
         n16310VALCOMINCDTO = H03RE18_n16310VALCOMINCDTO[0] ;
         A16311VALCOMTIPDTO = H03RE18_A16311VALCOMTIPDTO[0] ;
         n16311VALCOMTIPDTO = H03RE18_n16311VALCOMTIPDTO[0] ;
         A16314VALCOMPORDTOF = H03RE18_A16314VALCOMPORDTOF[0] ;
         n16314VALCOMPORDTOF = H03RE18_n16314VALCOMPORDTOF[0] ;
         A16315VALCOMMTODTOF = H03RE18_A16315VALCOMMTODTOF[0] ;
         n16315VALCOMMTODTOF = H03RE18_n16315VALCOMMTODTOF[0] ;
         A16312VALCOMPORDTON = H03RE18_A16312VALCOMPORDTON[0] ;
         n16312VALCOMPORDTON = H03RE18_n16312VALCOMPORDTON[0] ;
         A16313VALCOMMTODTON = H03RE18_A16313VALCOMMTODTON[0] ;
         n16313VALCOMMTODTON = H03RE18_n16313VALCOMMTODTON[0] ;
         A458CNTIVAID = H03RE18_A458CNTIVAID[0] ;
         n458CNTIVAID = H03RE18_n458CNTIVAID[0] ;
         A46CNCDIRID = H03RE18_A46CNCDIRID[0] ;
         n46CNCDIRID = H03RE18_n46CNCDIRID[0] ;
         A15643VALCOMPRY = H03RE18_A15643VALCOMPRY[0] ;
         n15643VALCOMPRY = H03RE18_n15643VALCOMPRY[0] ;
         A15647VALCOMMON = H03RE18_A15647VALCOMMON[0] ;
         n15647VALCOMMON = H03RE18_n15647VALCOMMON[0] ;
         A15648VALCOMEST = H03RE18_A15648VALCOMEST[0] ;
         n15648VALCOMEST = H03RE18_n15648VALCOMEST[0] ;
         A15971VALCOMTCAM = H03RE18_A15971VALCOMTCAM[0] ;
         n15971VALCOMTCAM = H03RE18_n15971VALCOMTCAM[0] ;
         A15972VALCOMNOC = H03RE18_A15972VALCOMNOC[0] ;
         n15972VALCOMNOC = H03RE18_n15972VALCOMNOC[0] ;
         A15973VALCOMALME = H03RE18_A15973VALCOMALME[0] ;
         n15973VALCOMALME = H03RE18_n15973VALCOMALME[0] ;
         A15974VALCOMTIVA = H03RE18_A15974VALCOMTIVA[0] ;
         n15974VALCOMTIVA = H03RE18_n15974VALCOMTIVA[0] ;
         A15975VALCOMCPGO = H03RE18_A15975VALCOMCPGO[0] ;
         n15975VALCOMCPGO = H03RE18_n15975VALCOMCPGO[0] ;
         A16310VALCOMINCDTO = H03RE18_A16310VALCOMINCDTO[0] ;
         n16310VALCOMINCDTO = H03RE18_n16310VALCOMINCDTO[0] ;
         A16311VALCOMTIPDTO = H03RE18_A16311VALCOMTIPDTO[0] ;
         n16311VALCOMTIPDTO = H03RE18_n16311VALCOMTIPDTO[0] ;
         A16314VALCOMPORDTOF = H03RE18_A16314VALCOMPORDTOF[0] ;
         n16314VALCOMPORDTOF = H03RE18_n16314VALCOMPORDTOF[0] ;
         A16315VALCOMMTODTOF = H03RE18_A16315VALCOMMTODTOF[0] ;
         n16315VALCOMMTODTOF = H03RE18_n16315VALCOMMTODTOF[0] ;
         A16312VALCOMPORDTON = H03RE18_A16312VALCOMPORDTON[0] ;
         n16312VALCOMPORDTON = H03RE18_n16312VALCOMPORDTON[0] ;
         A16313VALCOMMTODTON = H03RE18_A16313VALCOMMTODTON[0] ;
         n16313VALCOMMTODTON = H03RE18_n16313VALCOMMTODTON[0] ;
         A194CNCDIRNOM = H03RE18_A194CNCDIRNOM[0] ;
         n194CNCDIRNOM = H03RE18_n194CNCDIRNOM[0] ;
         A199CNCDIRRFC = H03RE18_A199CNCDIRRFC[0] ;
         n199CNCDIRRFC = H03RE18_n199CNCDIRRFC[0] ;
         A2882CNCDIRESTIMP = H03RE18_A2882CNCDIRESTIMP[0] ;
         n2882CNCDIRESTIMP = H03RE18_n2882CNCDIRESTIMP[0] ;
         A458CNTIVAID = H03RE18_A458CNTIVAID[0] ;
         n458CNTIVAID = H03RE18_n458CNTIVAID[0] ;
         AV13CNCDIRID = A46CNCDIRID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13CNCDIRID", GXutil.ltrim( GXutil.str( AV13CNCDIRID, 10, 0)));
         AV8cncdirnom = A194CNCDIRNOM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cncdirnom", AV8cncdirnom);
         AV151CNCDIRRFC = A199CNCDIRRFC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
         AV14VALCOMPRY = A15643VALCOMPRY ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14VALCOMPRY", AV14VALCOMPRY);
         AV15VALCOMMON = A15647VALCOMMON ;
         AV95VALCOMEST = A15648VALCOMEST ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95VALCOMEST", AV95VALCOMEST);
         AV28VALCOMUMT = A15652VALCOMUMT ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomumt_Internalname, AV28VALCOMUMT);
         AV223CNCDIRESTIMP = A2882CNCDIRESTIMP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV223CNCDIRESTIMP", AV223CNCDIRESTIMP);
         if ( GXutil.strcmp(AV95VALCOMEST, "TERMINADO") == 0 )
         {
            AV9ACMVOITCMB = A15971VALCOMTCAM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ACMVOITCMB", GXutil.ltrim( GXutil.str( AV9ACMVOITCMB, 15, 4)));
            edtavAcmvoitcmb_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoitcmb_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoitcmb_Enabled, 5, 0)), true);
            AV96VALCOMNOC = A15972VALCOMNOC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96VALCOMNOC", GXutil.ltrim( GXutil.str( AV96VALCOMNOC, 10, 0)));
            AV154INALMNID = A15973VALCOMALME ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
            edtavAcmvoipdto_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
            edtavAcmvoipdes_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
            AV11CNTIVAID = A15974VALCOMTIVA ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
            dynavCntivaid.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavCntivaid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCntivaid.getEnabled(), 5, 0)), true);
            AV6CNTPGOID = A15975VALCOMCPGO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
            dynavCntpgoid.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavCntpgoid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCntpgoid.getEnabled(), 5, 0)), true);
            lblMon8_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblMon8_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon8_Visible, 5, 0)), true);
            edtavValcomnoc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavValcomnoc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValcomnoc_Visible, 5, 0)), true);
            AV32CNCMNMID = A15647VALCOMMON ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
            cmbavCncmnmid.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavCncmnmid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCncmnmid.getEnabled(), 5, 0)), true);
            lblButtonoc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblButtonoc_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblButtonoc_Visible, 5, 0)), true);
            if ( AV117CNUSERGPO == 0 )
            {
               lblPdf_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, lblPdf_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblPdf_Visible, 5, 0)), true);
               lblTarget_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, lblTarget_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTarget_Visible, 5, 0)), true);
               lblMon8_Caption = "Orden de Compra" ;
               httpContext.ajax_rsp_assign_prop("", false, lblMon8_Internalname, "Caption", lblMon8_Caption, true);
            }
            else
            {
               lblMon8_Caption = "Totales Factura" ;
               httpContext.ajax_rsp_assign_prop("", false, lblMon8_Internalname, "Caption", lblMon8_Caption, true);
               edtavValcomnoc_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavValcomnoc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValcomnoc_Visible, 5, 0)), true);
               lblPdf_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, lblPdf_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblPdf_Visible, 5, 0)), true);
               lblTarget_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, lblTarget_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTarget_Visible, 5, 0)), true);
               lblButtonrec_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, lblButtonrec_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblButtonrec_Visible, 5, 0)), true);
            }
            chkavIncdes.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavIncdes.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( chkavIncdes.getEnabled(), 5, 0)), true);
            cmbavTipodes.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipodes.getEnabled(), 5, 0)), true);
            AV107incDes = A16310VALCOMINCDTO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107incDes", AV107incDes);
            AV108tipoDes = A16311VALCOMTIPDTO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
            if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
            {
               AV109ACMVOIPDTO = A16314VALCOMPORDTOF ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
               AV110ACMVOIPDES = A16315VALCOMMTODTOF ;
               httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
               AV120MTODES = A16315VALCOMMTODTOF ;
               httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
            }
            else
            {
               AV109ACMVOIPDTO = A16312VALCOMPORDTON ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
               AV110ACMVOIPDES = A16313VALCOMMTODTON ;
               httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
               AV120MTODES = A16313VALCOMMTODTON ;
               httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
            }
            if ( GXutil.strcmp(AV108tipoDes, "P") == 0 )
            {
               edtavAcmvoipdto_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Visible, 5, 0)), true);
               edtavAcmvoipdes_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Visible, 5, 0)), true);
               edtavMtodes_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
               lblLbldescuento2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
            }
         }
         else
         {
            lblButtonrec_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblButtonrec_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblButtonrec_Visible, 5, 0)), true);
            lblTarget_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTarget_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTarget_Visible, 5, 0)), true);
            lblPdf_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblPdf_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblPdf_Visible, 5, 0)), true);
            lblButtonoc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblButtonoc_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblButtonoc_Visible, 5, 0)), true);
            lblMon8_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblMon8_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblMon8_Visible, 5, 0)), true);
            edtavValcomnoc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavValcomnoc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValcomnoc_Visible, 5, 0)), true);
            AV11CNTIVAID = A458CNTIVAID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CNTIVAID", AV11CNTIVAID);
            AV32CNCMNMID = AV18cnciasmon ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
         }
         pr_default.readNext(16);
      }
      pr_default.close(16);
      GXt_int9 = AV219CNTPGODIAS ;
      GXv_int4[0] = GXt_int9 ;
      new com.kdsproyectos.cntpgo02(remoteHandle, context).execute( AV6CNTPGOID, GXv_int4) ;
      prompgenoc_impl.this.GXt_int9 = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CNTPGOID", AV6CNTPGOID);
      AV219CNTPGODIAS = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV219CNTPGODIAS", GXutil.ltrim( GXutil.str( AV219CNTPGODIAS, 4, 0)));
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
   }

   public void S152( )
   {
      /* 'TOTALES' Routine */
      /* Using cursor H03RE19 */
      pr_default.execute(17, new Object[] {AV11CNTIVAID});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A458CNTIVAID = H03RE19_A458CNTIVAID[0] ;
         n458CNTIVAID = H03RE19_n458CNTIVAID[0] ;
         A993CNTIVAPRC = H03RE19_A993CNTIVAPRC[0] ;
         n993CNTIVAPRC = H03RE19_n993CNTIVAPRC[0] ;
         AV12CNTIVAPRC = A993CNTIVAPRC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12CNTIVAPRC", GXutil.ltrim( GXutil.str( AV12CNTIVAPRC, 11, 4)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
      AV30subtotal_oc = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
      /* Using cursor H03RE20 */
      pr_default.execute(18, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A15642VALCOMDOC = H03RE20_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE20_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE20_A5939CNCIASID[0] ;
         A15964VALCOMQTOC = H03RE20_A15964VALCOMQTOC[0] ;
         n15964VALCOMQTOC = H03RE20_n15964VALCOMQTOC[0] ;
         A15654VALCOMPRE = H03RE20_A15654VALCOMPRE[0] ;
         n15654VALCOMPRE = H03RE20_n15654VALCOMPRE[0] ;
         AV106subtotal2 = A15654VALCOMPRE.multiply(A15964VALCOMQTOC) ;
         AV30subtotal_oc = AV30subtotal_oc.add(AV106subtotal2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
         pr_default.readNext(18);
      }
      pr_default.close(18);
      if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
      {
         AV91subtotal_ext = AV30subtotal_oc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
         AV92iva_ext = AV30subtotal_oc.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
         AV93total_ext = AV30subtotal_oc.add(AV92iva_ext) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
         AV30subtotal_oc = AV30subtotal_oc.multiply(AV9ACMVOITCMB) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
      }
      else
      {
         AV91subtotal_ext = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
         AV92iva_ext = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
         AV93total_ext = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
      }
      AV33iva_oc = AV30subtotal_oc.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
      AV31total_oc = AV30subtotal_oc.add(AV33iva_oc) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
      if ( DecimalUtil.compareTo(AV30subtotal_oc, DecimalUtil.ZERO) != 0 )
      {
         if ( ( GXutil.strcmp(AV107incDes, "S") == 0 ) && ( GXutil.strcmp(AV108tipoDes, "M") == 0 ) )
         {
            if ( DecimalUtil.compareTo(AV110ACMVOIPDES, DecimalUtil.ZERO) != 0 )
            {
               AV109ACMVOIPDTO = GXutil.truncDecimal( (AV110ACMVOIPDES.multiply(DecimalUtil.doubleToDec(100))).divide((AV30subtotal_oc), 18, java.math.BigDecimal.ROUND_DOWN), 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
               if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
               {
                  AV91subtotal_ext = AV91subtotal_ext.subtract(AV110ACMVOIPDES) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
                  if ( DecimalUtil.compareTo(AV12CNTIVAPRC, DecimalUtil.ZERO) != 0 )
                  {
                     AV92iva_ext = AV91subtotal_ext.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
                  }
                  else
                  {
                     AV92iva_ext = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
                  }
                  AV93total_ext = AV91subtotal_ext.add(AV92iva_ext) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
                  AV30subtotal_oc = AV91subtotal_ext.multiply(AV9ACMVOITCMB) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
                  AV33iva_oc = AV92iva_ext.multiply(AV9ACMVOITCMB) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                  AV31total_oc = AV30subtotal_oc.add(AV33iva_oc) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
               }
               else
               {
                  AV30subtotal_oc = AV30subtotal_oc.subtract(AV110ACMVOIPDES) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
                  if ( DecimalUtil.compareTo(AV12CNTIVAPRC, DecimalUtil.ZERO) != 0 )
                  {
                     AV33iva_oc = AV30subtotal_oc.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                  }
                  else
                  {
                     AV33iva_oc = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                  }
                  AV31total_oc = AV30subtotal_oc.add(AV33iva_oc) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
               }
            }
            else
            {
               AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
            }
         }
         else
         {
            if ( ( GXutil.strcmp(AV107incDes, "S") == 0 ) && ( GXutil.strcmp(AV108tipoDes, "P") == 0 ) )
            {
               if ( DecimalUtil.compareTo(AV109ACMVOIPDTO, DecimalUtil.ZERO) != 0 )
               {
                  AV110ACMVOIPDES = GXutil.truncDecimal( (AV30subtotal_oc.multiply((AV109ACMVOIPDTO.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN)))), 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
                  AV120MTODES = AV110ACMVOIPDES ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
                  if ( GXutil.strcmp(AV32CNCMNMID, AV18cnciasmon) != 0 )
                  {
                     AV91subtotal_ext = AV91subtotal_ext.subtract(AV110ACMVOIPDES) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV91subtotal_ext", GXutil.ltrim( GXutil.str( AV91subtotal_ext, 15, 2)));
                     if ( DecimalUtil.compareTo(AV12CNTIVAPRC, DecimalUtil.ZERO) != 0 )
                     {
                        AV92iva_ext = AV91subtotal_ext.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
                     }
                     else
                     {
                        AV92iva_ext = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV92iva_ext", GXutil.ltrim( GXutil.str( AV92iva_ext, 15, 2)));
                     }
                     AV93total_ext = AV91subtotal_ext.add(AV92iva_ext) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV93total_ext", GXutil.ltrim( GXutil.str( AV93total_ext, 15, 2)));
                     AV30subtotal_oc = AV91subtotal_ext.multiply(AV9ACMVOITCMB) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
                     AV33iva_oc = AV92iva_ext.multiply(AV9ACMVOITCMB) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                     AV31total_oc = AV30subtotal_oc.add(AV33iva_oc) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
                  }
                  else
                  {
                     AV30subtotal_oc = AV30subtotal_oc.subtract(AV110ACMVOIPDES) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV30subtotal_oc", GXutil.ltrim( GXutil.str( AV30subtotal_oc, 15, 2)));
                     if ( DecimalUtil.compareTo(AV12CNTIVAPRC, DecimalUtil.ZERO) != 0 )
                     {
                        AV33iva_oc = AV30subtotal_oc.multiply((AV12CNTIVAPRC.divide(DecimalUtil.doubleToDec(100), 18, java.math.BigDecimal.ROUND_DOWN))) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                     }
                     else
                     {
                        AV33iva_oc = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33iva_oc", GXutil.ltrim( GXutil.str( AV33iva_oc, 15, 2)));
                     }
                     AV31total_oc = AV30subtotal_oc.add(AV33iva_oc) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV31total_oc", GXutil.ltrim( GXutil.str( AV31total_oc, 15, 2)));
                  }
               }
               else
               {
                  AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
                  AV120MTODES = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
               }
            }
         }
      }
   }

   public void e183RE2( )
   {
      /* 'Abre OC' Routine */
      AV103KDSSESSION.setValue("Segoc", "S");
      AV103KDSSESSION.setValue("PMCTPRID_F", AV14VALCOMPRY);
      httpContext.ajax_rsp_assign_attri("", false, "AV14VALCOMPRY", AV14VALCOMPRY);
      AV103KDSSESSION.setValue("ACMVOIDOC", GXutil.str( AV96VALCOMNOC, 10, 0));
      AV103KDSSESSION.setValue("CNCIASID", GXutil.str( AV16CNCIASID, 10, 0));
      lblTxt_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.wpsegoc") +"\",\"_blank\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_Internalname, "Caption", lblTxt_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e193RE2( )
   {
      /* 'Recepcion' Routine */
      /* Window Datatype Object Property */
      AV105window.setUrl( formatLink("com.kdsproyectos.wpgenrecep") + "?" + GXutil.URLEncode(GXutil.rtrim(AV80CNUSERID)) + "," + GXutil.URLEncode(GXutil.rtrim("ESP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16CNCIASID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("OMP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV96VALCOMNOC,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("DAS")) + "," + GXutil.URLEncode(GXutil.rtrim("WACMROI1")) + "," + GXutil.URLEncode(GXutil.rtrim("1")) + "," + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) );
      AV105window.setReturnParms(new Object[] {"","","","",});
      AV105window.setAutoresize( 0 );
      AV105window.setHeight( 750 );
      AV105window.setWidth( 1200 );
      httpContext.newWindow(AV105window);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e203RE2( )
   {
      /* Incdes_Click Routine */
      if ( GXutil.strcmp(AV107incDes, "S") == 0 )
      {
         cmbavTipodes.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipodes.getEnabled(), 5, 0)), true);
         edtavAcmvoipdto_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
         edtavAcmvoipdes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
         edtavMtodes_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
         lblLbldescuento2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
         AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         AV120MTODES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
         AV108tipoDes = "M" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
      }
      else
      {
         cmbavTipodes.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipodes.getEnabled(), 5, 0)), true);
         edtavAcmvoipdto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
         edtavAcmvoipdes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
         edtavMtodes_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
         lblLbldescuento2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
         AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         AV120MTODES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
      }
      /* Execute user subroutine: 'VALIDATIPODES' */
      S202 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavTipodes.setValue( GXutil.rtrim( AV108tipoDes) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Values", cmbavTipodes.ToJavascriptSource(), true);
   }

   public void e213RE2( )
   {
      /* Tipodes_Isvalid Routine */
      /* Execute user subroutine: 'VALIDATIPODES' */
      S202 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S202( )
   {
      /* 'VALIDATIPODES' Routine */
      if ( GXutil.strcmp(AV108tipoDes, "M") == 0 )
      {
         edtavAcmvoipdto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
         edtavAcmvoipdto_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Visible, 5, 0)), true);
         edtavAcmvoipdes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
         edtavAcmvoipdes_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Visible, 5, 0)), true);
         edtavMtodes_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
         lblLbldescuento2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
         AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         AV120MTODES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
         if ( GXutil.strcmp(AV107incDes, "N") == 0 )
         {
            edtavAcmvoipdto_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
            AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
            edtavAcmvoipdes_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
            AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         }
      }
      else
      {
         edtavAcmvoipdto_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
         edtavAcmvoipdto_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Visible, 5, 0)), true);
         edtavAcmvoipdes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
         edtavAcmvoipdes_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Visible, 5, 0)), true);
         edtavMtodes_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
         lblLbldescuento2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
         AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
         AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
         AV120MTODES = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120MTODES", GXutil.ltrim( GXutil.str( AV120MTODES, 17, 2)));
         if ( GXutil.strcmp(AV107incDes, "N") == 0 )
         {
            edtavAcmvoipdto_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdto_Enabled, 5, 0)), true);
            AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
            edtavAcmvoipdes_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavAcmvoipdes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAcmvoipdes_Enabled, 5, 0)), true);
            AV110ACMVOIPDES = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110ACMVOIPDES", GXutil.ltrim( GXutil.str( AV110ACMVOIPDES, 17, 2)));
            edtavMtodes_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavMtodes_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavMtodes_Visible, 5, 0)), true);
            lblLbldescuento2_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblLbldescuento2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblLbldescuento2_Visible, 5, 0)), true);
         }
      }
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
   }

   public void e223RE2( )
   {
      /* Acmvoipdto_Controlvaluechanged Routine */
      if ( ( DecimalUtil.compareTo(AV109ACMVOIPDTO, DecimalUtil.ZERO) != 0 ) && ( AV109ACMVOIPDTO.doubleValue() > 100 ) )
      {
         AV109ACMVOIPDTO = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109ACMVOIPDTO", GXutil.ltrim( GXutil.str( AV109ACMVOIPDTO, 7, 2)));
      }
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e233RE2( )
   {
      /* Acmvoipdes_Controlvaluechanged Routine */
      /* Execute user subroutine: 'TOTALES' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e243RE2( )
   {
      /* 'Validar' Routine */
      if ( GXutil.strcmp(AV156ValidarxWS, "S") == 0 )
      {
         GXv_char7[0] = AV132rutaDocPDF ;
         GXv_char2[0] = AV131rutaDocXML ;
         GXv_char10[0] = AV78NAME ;
         GXv_int4[0] = AV133Respuesta ;
         GXv_char11[0] = AV134MensajeVAL ;
         GXv_SdtsdtRespMerca12[0] = AV221sdtRespMerca;
         new com.kdsproyectos.wsfacmerca(remoteHandle, context).execute( AV16CNCIASID, AV129serie, AV130folio, AV128ACMROIFDOC, AV218UUID, AV151CNCDIRRFC, AV150CNCIASRFC, GXv_char7, GXv_char2, GXv_char10, GXv_int4, GXv_char11, GXv_SdtsdtRespMerca12) ;
         prompgenoc_impl.this.AV132rutaDocPDF = GXv_char7[0] ;
         prompgenoc_impl.this.AV131rutaDocXML = GXv_char2[0] ;
         prompgenoc_impl.this.AV78NAME = GXv_char10[0] ;
         prompgenoc_impl.this.AV133Respuesta = GXv_int4[0] ;
         prompgenoc_impl.this.AV134MensajeVAL = GXv_char11[0] ;
         AV221sdtRespMerca = GXv_SdtsdtRespMerca12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV129serie", AV129serie);
         httpContext.ajax_rsp_assign_attri("", false, "AV130folio", AV130folio);
         httpContext.ajax_rsp_assign_attri("", false, "AV128ACMROIFDOC", localUtil.format(AV128ACMROIFDOC, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV218UUID", AV218UUID);
         httpContext.ajax_rsp_assign_attri("", false, "AV151CNCDIRRFC", AV151CNCDIRRFC);
         httpContext.ajax_rsp_assign_attri("", false, "AV150CNCIASRFC", AV150CNCIASRFC);
         httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
         if ( GXutil.strcmp(AV132rutaDocPDF, "") != 0 )
         {
            AV157FILE.setSource( GXutil.trim( AV132rutaDocPDF) );
            if ( AV157FILE.exists() )
            {
               AV77BLOB = GXutil.trim( AV132rutaDocPDF) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
               new com.kdsproyectos.pvalcom2(remoteHandle, context).execute( "INS", AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, 0, AV78NAME, "PDF", AV77BLOB, AV132rutaDocPDF, AV80CNUSERID) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
               httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
               httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
            }
         }
         if ( GXutil.strcmp(AV131rutaDocXML, "") != 0 )
         {
            AV157FILE.setSource( GXutil.trim( AV131rutaDocXML) );
            if ( AV157FILE.exists() )
            {
               AV77BLOB = GXutil.trim( AV131rutaDocXML) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
               new com.kdsproyectos.pvalcom2(remoteHandle, context).execute( "INS", AV16CNCIASID, AV17CNTDOCID, AV10VALCOMDOC, 0, AV78NAME, "XML", AV77BLOB, AV131rutaDocXML, AV80CNUSERID) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
               httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
               httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
               httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
            }
         }
         AV222PMMnFacXML = AV221sdtRespMerca.getgxTv_SdtsdtRespMerca_Total() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV222PMMnFacXML", GXutil.ltrim( GXutil.str( AV222PMMnFacXML, 15, 2)));
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",GXutil.trim( AV134MensajeVAL)});
         gxgrsfl_3_refresh( A15965VALCOMIDA, A5939CNCIASID, AV16CNCIASID, A20CNTDOCID, AV17CNTDOCID, A15642VALCOMDOC, AV10VALCOMDOC, A15966VALCOMNMA, A15970VALCOMFECA, A15967VALCOMBLOB, A15968VALCOMTIPAR, A15969VALCOMUSRA, AV6CNTPGOID, AV11CNTIVAID, AV80CNUSERID, AV123MostrarComplemento, AV125ACMROITDOC, AV124omitirc, AV156ValidarxWS) ;
      }
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'RELACIONAARCHIVOSARECEPCION' Routine */
      /* Using cursor H03RE21 */
      pr_default.execute(19, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A15642VALCOMDOC = H03RE21_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE21_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE21_A5939CNCIASID[0] ;
         A15968VALCOMTIPAR = H03RE21_A15968VALCOMTIPAR[0] ;
         n15968VALCOMTIPAR = H03RE21_n15968VALCOMTIPAR[0] ;
         A15967VALCOMBLOB_Filetype = A15968VALCOMTIPAR ;
         A15967VALCOMBLOB = H03RE21_A15967VALCOMBLOB[0] ;
         n15967VALCOMBLOB = H03RE21_n15967VALCOMBLOB[0] ;
         A15966VALCOMNMA = H03RE21_A15966VALCOMNMA[0] ;
         n15966VALCOMNMA = H03RE21_n15966VALCOMNMA[0] ;
         A17225VALCOMRUT = H03RE21_A17225VALCOMRUT[0] ;
         n17225VALCOMRUT = H03RE21_n17225VALCOMRUT[0] ;
         AV77BLOB = A15967VALCOMBLOB ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77BLOB", AV77BLOB);
         AV78NAME = GXutil.trim( A15966VALCOMNMA) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
         AV166tiparch = A15968VALCOMTIPAR ;
         AV167VALCOMRUT = A17225VALCOMRUT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV167VALCOMRUT", AV167VALCOMRUT);
         if ( GXutil.strcmp(AV166tiparch, "PDF") == 0 )
         {
            GXv_int3[0] = AV163PDFDOCID ;
            new com.kdsproyectos.ppdfdoc(remoteHandle, context).execute( "INS", AV16CNCIASID, AV145PMTipoDoc, AV146PMNumDoc, GXv_int3, 0, AV78NAME, AV167VALCOMRUT, "PDF", AV80CNUSERID, AV164PMProvid) ;
            prompgenoc_impl.this.AV163PDFDOCID = GXv_int3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV145PMTipoDoc", AV145PMTipoDoc);
            httpContext.ajax_rsp_assign_attri("", false, "AV146PMNumDoc", GXutil.ltrim( GXutil.str( AV146PMNumDoc, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV78NAME", AV78NAME);
            httpContext.ajax_rsp_assign_attri("", false, "AV167VALCOMRUT", AV167VALCOMRUT);
            httpContext.ajax_rsp_assign_attri("", false, "AV80CNUSERID", AV80CNUSERID);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80CNUSERID, ""))));
            new com.kdsproyectos.pactxmlpdf(remoteHandle, context).execute( "PDF", AV16CNCIASID, AV146PMNumDoc, AV145PMTipoDoc, "", AV163PDFDOCID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV146PMNumDoc", GXutil.ltrim( GXutil.str( AV146PMNumDoc, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV145PMTipoDoc", AV145PMTipoDoc);
         }
         else
         {
            /* Execute user subroutine: 'RECUPERA VALORES' */
            S2121 ();
            if ( returnInSub )
            {
               pr_default.close(19);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(19);
      }
      pr_default.close(19);
   }

   public void S2121( )
   {
      /* 'RECUPERA VALORES' Routine */
      AV157FILE.setSource( AV77BLOB );
      AV168Xmlr.open(AV167VALCOMRUT);
      AV168Xmlr.read();
      AV169xml = AV168Xmlr.readRawXML() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV169xml", AV169xml);
      AV168Xmlr.close();
      AV170busc = "erie=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV171XMLDOCSER = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171XMLDOCSER", AV171XMLDOCSER);
      AV170busc = "olio=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV172XMLDOCFOL = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV172XMLDOCFOL", AV172XMLDOCFOL);
      AV170busc = "echa=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES FECHA' */
      S232 ();
      if (returnInSub) return;
      AV174D = GXutil.substring( AV173string, 9, 2) ;
      AV175M = GXutil.substring( AV173string, 6, 2) ;
      AV176Y = GXutil.substring( AV173string, 1, 4) ;
      AV177Ret = AV174D + "/" + AV175M + "/" + AV176Y ;
      AV178XMLDOCFFAC = localUtil.ctod( AV177Ret, 3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178XMLDOCFFAC", localUtil.format(AV178XMLDOCFFAC, "99/99/99"));
      AV170busc = "eceptor" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA RFC' */
      S242 ();
      if (returnInSub) return;
      AV179rr = AV173string ;
      AV180XMLDOCRFCR = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180XMLDOCRFCR", AV180XMLDOCRFCR);
      AV170busc = "eceptor" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA NOMBRE' */
      S252 ();
      if (returnInSub) return;
      AV181XMLDOCNMR = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV181XMLDOCNMR", AV181XMLDOCNMR);
      AV170busc = "misor" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA RFC' */
      S242 ();
      if (returnInSub) return;
      AV182re = AV173string ;
      AV183XMLDOCRFCE = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV183XMLDOCRFCE", AV183XMLDOCRFCE);
      AV183XMLDOCRFCE = GXutil.strReplace( AV183XMLDOCRFCE, "amp;", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV183XMLDOCRFCE", AV183XMLDOCRFCE);
      AV170busc = "misor" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA NOMBRE' */
      S252 ();
      if (returnInSub) return;
      AV184XMLDOCNME = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV184XMLDOCNME", AV184XMLDOCNME);
      AV170busc = "Moneda=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV173string, "") == 0 )
      {
         AV170busc = "moneda=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES' */
         S222 ();
         if (returnInSub) return;
      }
      AV185XMLDOCMON = AV173string ;
      AV170busc = "<cfdi:Retenciones>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA RETENCIONES' */
      S262 ();
      if (returnInSub) return;
      AV170busc = " total=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV173string, "") == 0 )
      {
         AV170busc = " Total=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES' */
         S222 ();
         if (returnInSub) return;
      }
      AV186total = AV173string ;
      AV187XMLDOCTOT = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV187XMLDOCTOT", GXutil.ltrim( GXutil.str( AV187XMLDOCTOT, 17, 4)));
      AV170busc = "<cfdi:Complemento>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      new com.kdsproyectos.generatxt(remoteHandle, context).execute( AV257Pgmname, "antes de buscar uuid "+AV165XMLDOCUUID) ;
      /* Execute user subroutine: 'BUSCA UUID' */
      S272 ();
      if (returnInSub) return;
      AV188id = AV173string ;
      AV165XMLDOCUUID = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165XMLDOCUUID", AV165XMLDOCUUID);
      AV170busc = "ubTotal=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV189XMLDOCSUB = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV189XMLDOCSUB", GXutil.ltrim( GXutil.str( AV189XMLDOCSUB, 17, 4)));
      AV170busc = "asa=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV190XMLDOCIVA = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV190XMLDOCIVA", GXutil.ltrim( GXutil.str( AV190XMLDOCIVA, 17, 4)));
      AV170busc = "elloCFD=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV191XMLDOCSCFD = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV191XMLDOCSCFD", AV191XMLDOCSCFD);
      AV170busc = "oCertificadoSAT=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV192XMLDOCNCER = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV192XMLDOCNCER", AV192XMLDOCNCER);
      AV170busc = "elloSAT=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV193XMLDOCSSAT = AV173string ;
      httpContext.ajax_rsp_assign_attri("", false, "AV193XMLDOCSSAT", AV193XMLDOCSSAT);
      AV170busc = "escuento=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      /* Execute user subroutine: 'BUSCA POSICIONES' */
      S222 ();
      if (returnInSub) return;
      AV194XMLDOCDESC = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV194XMLDOCDESC", GXutil.ltrim( GXutil.str( AV194XMLDOCDESC, 17, 4)));
      new com.kdsproyectos.generatxt(remoteHandle, context).execute( AV257Pgmname, "antes de comparar uuid "+AV165XMLDOCUUID) ;
      if ( GXutil.strcmp(AV165XMLDOCUUID, "") != 0 )
      {
         AV195Estatus = "Vigente" ;
         /* Execute user subroutine: 'COMPARA RFC' */
         S282 ();
         if (returnInSub) return;
         AV258GXLvl1087 = (byte)(0) ;
         /* Using cursor H03RE22 */
         pr_default.execute(20, new Object[] {AV165XMLDOCUUID});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A909PMUuid = H03RE22_A909PMUuid[0] ;
            n909PMUuid = H03RE22_n909PMUuid[0] ;
            A862PMNumDoc = H03RE22_A862PMNumDoc[0] ;
            A861PMTipoDoc = H03RE22_A861PMTipoDoc[0] ;
            AV258GXLvl1087 = (byte)(1) ;
            AV196PMNumDoc2 = A862PMNumDoc ;
            AV197PMTipodoc2 = A861PMTipoDoc ;
            AV198auxCadena = "La Factura  ya esta asociado al " + AV197PMTipodoc2 + " " + GXutil.trim( GXutil.str( AV196PMNumDoc2, 10, 0)) ;
            AV199flag = (short)(1) ;
            pr_default.readNext(20);
         }
         pr_default.close(20);
         if ( AV258GXLvl1087 == 0 )
         {
            AV199flag = (short)(0) ;
         }
      }
      else
      {
         AV149cadena = "XML No válido" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149cadena", AV149cadena);
         AV199flag = (short)(1) ;
      }
      if ( AV199flag == 0 )
      {
         /* Execute user subroutine: 'VALIDA ESTRUCTURA' */
         S292 ();
         if (returnInSub) return;
         if ( AV152avanza == 1 )
         {
            /* Execute user subroutine: 'REGISTRA' */
            S302 ();
            if (returnInSub) return;
         }
      }
      else
      {
         this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación",AV149cadena});
      }
   }

   public void S282( )
   {
      /* 'COMPARA RFC' Routine */
      /* Using cursor H03RE23 */
      pr_default.execute(21, new Object[] {new Long(AV200PMEmpresa)});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A5939CNCIASID = H03RE23_A5939CNCIASID[0] ;
         A14CNCIASRFC = H03RE23_A14CNCIASRFC[0] ;
         n14CNCIASRFC = H03RE23_n14CNCIASRFC[0] ;
         AV150CNCIASRFC = A14CNCIASRFC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV150CNCIASRFC", AV150CNCIASRFC);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(21);
   }

   public void S242( )
   {
      /* 'BUSCA RFC' Routine */
      AV260Trfc = DecimalUtil.doubleToDec(GXutil.strSearch( AV169xml, AV170busc, 1)) ;
      AV170busc = "fc=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, (int)(DecimalUtil.decToDouble(AV260Trfc))) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "\"", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S312( )
   {
      /* 'BUSCA POSICIONES CONCEPTOS' Routine */
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, (int)(AV216valini)) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "\"", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S252( )
   {
      /* 'BUSCA NOMBRE' Routine */
      AV260Trfc = DecimalUtil.doubleToDec(GXutil.strSearch( AV169xml, AV170busc, 1)) ;
      AV170busc = "ombre=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, (int)(DecimalUtil.decToDouble(AV260Trfc))) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "\"", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S272( )
   {
      /* 'BUSCA UUID' Routine */
      AV261Buscid = DecimalUtil.doubleToDec(GXutil.strSearch( AV169xml, AV170busc, 1)) ;
      AV170busc = "UUID=\"" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, (int)(DecimalUtil.decToDouble(AV261Buscid))) ;
      new com.kdsproyectos.generatxt(remoteHandle, context).execute( "subir xml", "adentro de buscar uuid &vini:"+GXutil.str( AV211vini, 10, 0)+" &Buscid:"+GXutil.str( AV261Buscid, 10, 2)) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "\"", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
         new com.kdsproyectos.generatxt(remoteHandle, context).execute( "subir xml", "&vini: "+GXutil.str( AV211vini, 10, 0)+" &vfin: "+GXutil.str( AV212vfin, 10, 0)+" &pos: "+GXutil.str( AV213pos, 10, 0)) ;
         new com.kdsproyectos.generatxt(remoteHandle, context).execute( "subir xml", "&string: "+AV173string) ;
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S292( )
   {
      /* 'VALIDA ESTRUCTURA' Routine */
      AV86MENSAJE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86MENSAJE", AV86MENSAJE);
      AV152avanza = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152avanza", GXutil.ltrim( GXutil.str( AV152avanza, 4, 0)));
   }

   public void S302( )
   {
      /* 'REGISTRA' Routine */
      GXv_char11[0] = "CAB" ;
      GXv_char10[0] = AV165XMLDOCUUID ;
      GXv_char7[0] = AV172XMLDOCFOL ;
      GXv_char2[0] = AV171XMLDOCSER ;
      GXv_date13[0] = AV178XMLDOCFFAC ;
      GXv_char14[0] = AV191XMLDOCSCFD ;
      GXv_char15[0] = AV193XMLDOCSSAT ;
      GXv_char16[0] = AV192XMLDOCNCER ;
      GXv_char17[0] = AV180XMLDOCRFCR ;
      GXv_char18[0] = AV183XMLDOCRFCE ;
      GXv_char19[0] = AV184XMLDOCNME ;
      GXv_char20[0] = AV181XMLDOCNMR ;
      GXv_decimal6[0] = AV187XMLDOCTOT ;
      GXv_decimal21[0] = AV189XMLDOCSUB ;
      GXv_decimal22[0] = AV190XMLDOCIVA ;
      GXv_char23[0] = AV214archivo ;
      GXv_char24[0] = AV167VALCOMRUT ;
      GXv_char25[0] = AV215TIPO ;
      GXv_int3[0] = AV203XMLDOCLIN ;
      GXv_char26[0] = AV204XMLDOCPROD ;
      GXv_decimal27[0] = AV205XMLDOCQTY ;
      GXv_decimal28[0] = AV206XMLDOCPRE ;
      GXv_decimal29[0] = AV207XMLDOCIMP ;
      GXv_char30[0] = "" ;
      GXv_char31[0] = AV208XMLDOCRET ;
      GXv_decimal32[0] = AV194XMLDOCDESC ;
      GXv_decimal33[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal34[0] = DecimalUtil.doubleToDec(0) ;
      new com.kdsproyectos.pxmldoc(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char7, GXv_char2, GXv_date13, GXv_char14, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_decimal6, GXv_decimal21, GXv_decimal22, GXv_char23, GXv_char24, GXv_char25, GXv_int3, GXv_char26, GXv_decimal27, GXv_decimal28, GXv_decimal29, GXv_char30, GXv_char31, GXv_decimal32, GXv_decimal33, GXv_decimal34) ;
      prompgenoc_impl.this.AV165XMLDOCUUID = GXv_char10[0] ;
      prompgenoc_impl.this.AV172XMLDOCFOL = GXv_char7[0] ;
      prompgenoc_impl.this.AV171XMLDOCSER = GXv_char2[0] ;
      prompgenoc_impl.this.AV178XMLDOCFFAC = GXv_date13[0] ;
      prompgenoc_impl.this.AV191XMLDOCSCFD = GXv_char14[0] ;
      prompgenoc_impl.this.AV193XMLDOCSSAT = GXv_char15[0] ;
      prompgenoc_impl.this.AV192XMLDOCNCER = GXv_char16[0] ;
      prompgenoc_impl.this.AV180XMLDOCRFCR = GXv_char17[0] ;
      prompgenoc_impl.this.AV183XMLDOCRFCE = GXv_char18[0] ;
      prompgenoc_impl.this.AV184XMLDOCNME = GXv_char19[0] ;
      prompgenoc_impl.this.AV181XMLDOCNMR = GXv_char20[0] ;
      prompgenoc_impl.this.AV187XMLDOCTOT = GXv_decimal6[0] ;
      prompgenoc_impl.this.AV189XMLDOCSUB = GXv_decimal21[0] ;
      prompgenoc_impl.this.AV190XMLDOCIVA = GXv_decimal22[0] ;
      prompgenoc_impl.this.AV214archivo = GXv_char23[0] ;
      prompgenoc_impl.this.AV167VALCOMRUT = GXv_char24[0] ;
      prompgenoc_impl.this.AV215TIPO = GXv_char25[0] ;
      prompgenoc_impl.this.AV203XMLDOCLIN = GXv_int3[0] ;
      prompgenoc_impl.this.AV204XMLDOCPROD = GXv_char26[0] ;
      prompgenoc_impl.this.AV205XMLDOCQTY = GXv_decimal27[0] ;
      prompgenoc_impl.this.AV206XMLDOCPRE = GXv_decimal28[0] ;
      prompgenoc_impl.this.AV207XMLDOCIMP = GXv_decimal29[0] ;
      prompgenoc_impl.this.AV208XMLDOCRET = GXv_char31[0] ;
      prompgenoc_impl.this.AV194XMLDOCDESC = GXv_decimal32[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165XMLDOCUUID", AV165XMLDOCUUID);
      httpContext.ajax_rsp_assign_attri("", false, "AV172XMLDOCFOL", AV172XMLDOCFOL);
      httpContext.ajax_rsp_assign_attri("", false, "AV171XMLDOCSER", AV171XMLDOCSER);
      httpContext.ajax_rsp_assign_attri("", false, "AV178XMLDOCFFAC", localUtil.format(AV178XMLDOCFFAC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV191XMLDOCSCFD", AV191XMLDOCSCFD);
      httpContext.ajax_rsp_assign_attri("", false, "AV193XMLDOCSSAT", AV193XMLDOCSSAT);
      httpContext.ajax_rsp_assign_attri("", false, "AV192XMLDOCNCER", AV192XMLDOCNCER);
      httpContext.ajax_rsp_assign_attri("", false, "AV180XMLDOCRFCR", AV180XMLDOCRFCR);
      httpContext.ajax_rsp_assign_attri("", false, "AV183XMLDOCRFCE", AV183XMLDOCRFCE);
      httpContext.ajax_rsp_assign_attri("", false, "AV184XMLDOCNME", AV184XMLDOCNME);
      httpContext.ajax_rsp_assign_attri("", false, "AV181XMLDOCNMR", AV181XMLDOCNMR);
      httpContext.ajax_rsp_assign_attri("", false, "AV187XMLDOCTOT", GXutil.ltrim( GXutil.str( AV187XMLDOCTOT, 17, 4)));
      httpContext.ajax_rsp_assign_attri("", false, "AV189XMLDOCSUB", GXutil.ltrim( GXutil.str( AV189XMLDOCSUB, 17, 4)));
      httpContext.ajax_rsp_assign_attri("", false, "AV190XMLDOCIVA", GXutil.ltrim( GXutil.str( AV190XMLDOCIVA, 17, 4)));
      httpContext.ajax_rsp_assign_attri("", false, "AV214archivo", AV214archivo);
      httpContext.ajax_rsp_assign_attri("", false, "AV167VALCOMRUT", AV167VALCOMRUT);
      httpContext.ajax_rsp_assign_attri("", false, "AV215TIPO", AV215TIPO);
      httpContext.ajax_rsp_assign_attri("", false, "AV203XMLDOCLIN", GXutil.ltrim( GXutil.str( AV203XMLDOCLIN, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV204XMLDOCPROD", AV204XMLDOCPROD);
      httpContext.ajax_rsp_assign_attri("", false, "AV205XMLDOCQTY", GXutil.ltrim( GXutil.str( AV205XMLDOCQTY, 15, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "AV206XMLDOCPRE", GXutil.ltrim( GXutil.str( AV206XMLDOCPRE, 17, 4)));
      httpContext.ajax_rsp_assign_attri("", false, "AV207XMLDOCIMP", GXutil.ltrim( GXutil.str( AV207XMLDOCIMP, 17, 4)));
      httpContext.ajax_rsp_assign_attri("", false, "AV208XMLDOCRET", AV208XMLDOCRET);
      httpContext.ajax_rsp_assign_attri("", false, "AV194XMLDOCDESC", GXutil.ltrim( GXutil.str( AV194XMLDOCDESC, 17, 4)));
      AV216valini = GXutil.strSearch( AV169xml, "<cfdi:Conceptos>", 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV216valini", GXutil.ltrim( GXutil.str( AV216valini, 10, 0)));
      AV217valfin = GXutil.strSearch( AV169xml, "</cfdi:Conceptos>", 1) ;
      AV203XMLDOCLIN = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV203XMLDOCLIN", GXutil.ltrim( GXutil.str( AV203XMLDOCLIN, 10, 0)));
      while ( AV216valini < AV217valfin )
      {
         AV170busc = "antidad=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES CONCEPTOS' */
         S312 ();
         if (returnInSub) return;
         AV205XMLDOCQTY = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV205XMLDOCQTY", GXutil.ltrim( GXutil.str( AV205XMLDOCQTY, 15, 2)));
         AV170busc = "escripcion=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES CONCEPTOS' */
         S312 ();
         if (returnInSub) return;
         AV204XMLDOCPROD = AV173string ;
         httpContext.ajax_rsp_assign_attri("", false, "AV204XMLDOCPROD", AV204XMLDOCPROD);
         AV170busc = "alorUnitario=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES CONCEPTOS' */
         S312 ();
         if (returnInSub) return;
         AV206XMLDOCPRE = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV206XMLDOCPRE", GXutil.ltrim( GXutil.str( AV206XMLDOCPRE, 17, 4)));
         AV170busc = "mporte=\"" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV170busc", AV170busc);
         /* Execute user subroutine: 'BUSCA POSICIONES CONCEPTOS' */
         S312 ();
         if (returnInSub) return;
         AV207XMLDOCIMP = DecimalUtil.doubleToDec(GXutil.val( AV173string, ".")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV207XMLDOCIMP", GXutil.ltrim( GXutil.str( AV207XMLDOCIMP, 17, 4)));
         AV216valini = (long)(AV216valini+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV216valini", GXutil.ltrim( GXutil.str( AV216valini, 10, 0)));
         if ( AV205XMLDOCQTY.doubleValue() == 0 )
         {
            if (true) break;
         }
         AV262Val = DecimalUtil.doubleToDec(GXutil.strSearch( AV169xml, "/>", (int)(AV216valini))) ;
         AV216valini = (long)(DecimalUtil.decToDouble(AV262Val)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV216valini", GXutil.ltrim( GXutil.str( AV216valini, 10, 0)));
         AV203XMLDOCLIN = (long)(AV203XMLDOCLIN+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV203XMLDOCLIN", GXutil.ltrim( GXutil.str( AV203XMLDOCLIN, 10, 0)));
         GXv_char31[0] = "DET" ;
         GXv_char30[0] = AV165XMLDOCUUID ;
         GXv_char26[0] = AV172XMLDOCFOL ;
         GXv_char25[0] = AV171XMLDOCSER ;
         GXv_date13[0] = AV178XMLDOCFFAC ;
         GXv_char24[0] = AV191XMLDOCSCFD ;
         GXv_char23[0] = AV193XMLDOCSSAT ;
         GXv_char20[0] = AV192XMLDOCNCER ;
         GXv_char19[0] = AV180XMLDOCRFCR ;
         GXv_char18[0] = AV183XMLDOCRFCE ;
         GXv_char17[0] = AV184XMLDOCNME ;
         GXv_char16[0] = AV181XMLDOCNMR ;
         GXv_decimal34[0] = AV187XMLDOCTOT ;
         GXv_decimal33[0] = AV189XMLDOCSUB ;
         GXv_decimal32[0] = AV190XMLDOCIVA ;
         GXv_char15[0] = AV214archivo ;
         GXv_char14[0] = AV167VALCOMRUT ;
         GXv_char11[0] = AV215TIPO ;
         GXv_int3[0] = AV203XMLDOCLIN ;
         GXv_char10[0] = AV204XMLDOCPROD ;
         GXv_decimal29[0] = AV205XMLDOCQTY ;
         GXv_decimal28[0] = AV206XMLDOCPRE ;
         GXv_decimal27[0] = AV207XMLDOCIMP ;
         GXv_char7[0] = "" ;
         GXv_char2[0] = AV208XMLDOCRET ;
         GXv_decimal22[0] = AV194XMLDOCDESC ;
         GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
         new com.kdsproyectos.pxmldoc(remoteHandle, context).execute( GXv_char31, GXv_char30, GXv_char26, GXv_char25, GXv_date13, GXv_char24, GXv_char23, GXv_char20, GXv_char19, GXv_char18, GXv_char17, GXv_char16, GXv_decimal34, GXv_decimal33, GXv_decimal32, GXv_char15, GXv_char14, GXv_char11, GXv_int3, GXv_char10, GXv_decimal29, GXv_decimal28, GXv_decimal27, GXv_char7, GXv_char2, GXv_decimal22, GXv_decimal21, GXv_decimal6) ;
         prompgenoc_impl.this.AV165XMLDOCUUID = GXv_char30[0] ;
         prompgenoc_impl.this.AV172XMLDOCFOL = GXv_char26[0] ;
         prompgenoc_impl.this.AV171XMLDOCSER = GXv_char25[0] ;
         prompgenoc_impl.this.AV178XMLDOCFFAC = GXv_date13[0] ;
         prompgenoc_impl.this.AV191XMLDOCSCFD = GXv_char24[0] ;
         prompgenoc_impl.this.AV193XMLDOCSSAT = GXv_char23[0] ;
         prompgenoc_impl.this.AV192XMLDOCNCER = GXv_char20[0] ;
         prompgenoc_impl.this.AV180XMLDOCRFCR = GXv_char19[0] ;
         prompgenoc_impl.this.AV183XMLDOCRFCE = GXv_char18[0] ;
         prompgenoc_impl.this.AV184XMLDOCNME = GXv_char17[0] ;
         prompgenoc_impl.this.AV181XMLDOCNMR = GXv_char16[0] ;
         prompgenoc_impl.this.AV187XMLDOCTOT = GXv_decimal34[0] ;
         prompgenoc_impl.this.AV189XMLDOCSUB = GXv_decimal33[0] ;
         prompgenoc_impl.this.AV190XMLDOCIVA = GXv_decimal32[0] ;
         prompgenoc_impl.this.AV214archivo = GXv_char15[0] ;
         prompgenoc_impl.this.AV167VALCOMRUT = GXv_char14[0] ;
         prompgenoc_impl.this.AV215TIPO = GXv_char11[0] ;
         prompgenoc_impl.this.AV203XMLDOCLIN = GXv_int3[0] ;
         prompgenoc_impl.this.AV204XMLDOCPROD = GXv_char10[0] ;
         prompgenoc_impl.this.AV205XMLDOCQTY = GXv_decimal29[0] ;
         prompgenoc_impl.this.AV206XMLDOCPRE = GXv_decimal28[0] ;
         prompgenoc_impl.this.AV207XMLDOCIMP = GXv_decimal27[0] ;
         prompgenoc_impl.this.AV208XMLDOCRET = GXv_char2[0] ;
         prompgenoc_impl.this.AV194XMLDOCDESC = GXv_decimal22[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV165XMLDOCUUID", AV165XMLDOCUUID);
         httpContext.ajax_rsp_assign_attri("", false, "AV172XMLDOCFOL", AV172XMLDOCFOL);
         httpContext.ajax_rsp_assign_attri("", false, "AV171XMLDOCSER", AV171XMLDOCSER);
         httpContext.ajax_rsp_assign_attri("", false, "AV178XMLDOCFFAC", localUtil.format(AV178XMLDOCFFAC, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV191XMLDOCSCFD", AV191XMLDOCSCFD);
         httpContext.ajax_rsp_assign_attri("", false, "AV193XMLDOCSSAT", AV193XMLDOCSSAT);
         httpContext.ajax_rsp_assign_attri("", false, "AV192XMLDOCNCER", AV192XMLDOCNCER);
         httpContext.ajax_rsp_assign_attri("", false, "AV180XMLDOCRFCR", AV180XMLDOCRFCR);
         httpContext.ajax_rsp_assign_attri("", false, "AV183XMLDOCRFCE", AV183XMLDOCRFCE);
         httpContext.ajax_rsp_assign_attri("", false, "AV184XMLDOCNME", AV184XMLDOCNME);
         httpContext.ajax_rsp_assign_attri("", false, "AV181XMLDOCNMR", AV181XMLDOCNMR);
         httpContext.ajax_rsp_assign_attri("", false, "AV187XMLDOCTOT", GXutil.ltrim( GXutil.str( AV187XMLDOCTOT, 17, 4)));
         httpContext.ajax_rsp_assign_attri("", false, "AV189XMLDOCSUB", GXutil.ltrim( GXutil.str( AV189XMLDOCSUB, 17, 4)));
         httpContext.ajax_rsp_assign_attri("", false, "AV190XMLDOCIVA", GXutil.ltrim( GXutil.str( AV190XMLDOCIVA, 17, 4)));
         httpContext.ajax_rsp_assign_attri("", false, "AV214archivo", AV214archivo);
         httpContext.ajax_rsp_assign_attri("", false, "AV167VALCOMRUT", AV167VALCOMRUT);
         httpContext.ajax_rsp_assign_attri("", false, "AV215TIPO", AV215TIPO);
         httpContext.ajax_rsp_assign_attri("", false, "AV203XMLDOCLIN", GXutil.ltrim( GXutil.str( AV203XMLDOCLIN, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV204XMLDOCPROD", AV204XMLDOCPROD);
         httpContext.ajax_rsp_assign_attri("", false, "AV205XMLDOCQTY", GXutil.ltrim( GXutil.str( AV205XMLDOCQTY, 15, 2)));
         httpContext.ajax_rsp_assign_attri("", false, "AV206XMLDOCPRE", GXutil.ltrim( GXutil.str( AV206XMLDOCPRE, 17, 4)));
         httpContext.ajax_rsp_assign_attri("", false, "AV207XMLDOCIMP", GXutil.ltrim( GXutil.str( AV207XMLDOCIMP, 17, 4)));
         httpContext.ajax_rsp_assign_attri("", false, "AV208XMLDOCRET", AV208XMLDOCRET);
         httpContext.ajax_rsp_assign_attri("", false, "AV194XMLDOCDESC", GXutil.ltrim( GXutil.str( AV194XMLDOCDESC, 17, 4)));
      }
      new com.kdsproyectos.pactxmlpdf(remoteHandle, context).execute( "XML", AV200PMEmpresa, AV146PMNumDoc, AV145PMTipoDoc, AV165XMLDOCUUID, AV209PMPDFDOC) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146PMNumDoc", GXutil.ltrim( GXutil.str( AV146PMNumDoc, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV145PMTipoDoc", AV145PMTipoDoc);
      httpContext.ajax_rsp_assign_attri("", false, "AV165XMLDOCUUID", AV165XMLDOCUUID);
      this.executeUsercontrolMethod("", false, "MENSAJEContainer", "ShowMessage", "", new Object[] {"Notificación","XML Actualizado Correctamente."});
   }

   public void S222( )
   {
      /* 'BUSCA POSICIONES' Routine */
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, 1) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "\"", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S232( )
   {
      /* 'BUSCA POSICIONES FECHA' Routine */
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, 1) ;
      if ( AV211vini != 0 )
      {
         AV211vini = (long)(AV211vini+AV210cont) ;
         AV212vfin = GXutil.strSearch( AV169xml, "T", (int)(AV211vini)) ;
         AV213pos = (long)(AV212vfin-AV211vini) ;
         AV173string = GXutil.substring( AV169xml, (int)(AV211vini), (int)(AV213pos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
      else
      {
         AV173string = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173string", AV173string);
      }
   }

   public void S262( )
   {
      /* 'BUSCA RETENCIONES' Routine */
      AV210cont = GXutil.len( AV170busc) ;
      AV211vini = GXutil.strSearch( AV169xml, AV170busc, 1) ;
      if ( AV211vini != 0 )
      {
         AV208XMLDOCRET = "SI" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV208XMLDOCRET", AV208XMLDOCRET);
      }
      else
      {
         AV208XMLDOCRET = "NO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV208XMLDOCRET", AV208XMLDOCRET);
      }
   }

   private void e293RE12( )
   {
      /* Sfl_3_Load Routine */
      /* Using cursor H03RE24 */
      pr_default.execute(22, new Object[] {new Long(AV16CNCIASID), AV17CNTDOCID, new Long(AV10VALCOMDOC)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A15642VALCOMDOC = H03RE24_A15642VALCOMDOC[0] ;
         A20CNTDOCID = H03RE24_A20CNTDOCID[0] ;
         A5939CNCIASID = H03RE24_A5939CNCIASID[0] ;
         A15968VALCOMTIPAR = H03RE24_A15968VALCOMTIPAR[0] ;
         n15968VALCOMTIPAR = H03RE24_n15968VALCOMTIPAR[0] ;
         A15967VALCOMBLOB_Filetype = A15968VALCOMTIPAR ;
         A15966VALCOMNMA = H03RE24_A15966VALCOMNMA[0] ;
         n15966VALCOMNMA = H03RE24_n15966VALCOMNMA[0] ;
         A15970VALCOMFECA = H03RE24_A15970VALCOMFECA[0] ;
         n15970VALCOMFECA = H03RE24_n15970VALCOMFECA[0] ;
         A15967VALCOMBLOB = H03RE24_A15967VALCOMBLOB[0] ;
         n15967VALCOMBLOB = H03RE24_n15967VALCOMBLOB[0] ;
         A15969VALCOMUSRA = H03RE24_A15969VALCOMUSRA[0] ;
         n15969VALCOMUSRA = H03RE24_n15969VALCOMUSRA[0] ;
         A15965VALCOMIDA = H03RE24_A15965VALCOMIDA[0] ;
         AV85valcomida = A15965VALCOMIDA ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomida_Internalname, GXutil.ltrim( GXutil.str( AV85valcomida, 10, 0)));
         AV82valcomnma = A15966VALCOMNMA ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomnma_Internalname, AV82valcomnma);
         AV81valcomfeca = A15970VALCOMFECA ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomfeca_Internalname, localUtil.format(AV81valcomfeca, "99/99/9999"));
         AV79VALCOMBLOB = A15967VALCOMBLOB ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomblob_Internalname, AV79VALCOMBLOB);
         AV83valcomtipar = A15968VALCOMTIPAR ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValcomtipar_Internalname, AV83valcomtipar);
         GXv_char31[0] = AV84cnuserdsc ;
         new com.kdsproyectos.pcnuser(remoteHandle, context).execute( A15969VALCOMUSRA, GXv_char31) ;
         prompgenoc_impl.this.AV84cnuserdsc = GXv_char31[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15969VALCOMUSRA", A15969VALCOMUSRA);
         httpContext.ajax_rsp_assign_attri("", false, edtavCnuserdsc_Internalname, AV84cnuserdsc);
         AV68Eliminar = "<i class=\"material-icons mpMaterialIcons\">cancel</i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV68Eliminar);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(228) ;
         }
         sendrow_22812( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_228_Refreshing )
         {
            httpContext.doAjaxLoad(228, Sfl_3Row);
         }
         pr_default.readNext(22);
      }
      pr_default.close(22);
      /*  Sending Event outputs  */
   }

   public void wb_table1_2_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( (int)(0xFFFFFF)) + ";" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 580, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "mpHolder", 0, "center", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:50px")+"\">") ;
         wb_table2_5_3RE2( true) ;
      }
      else
      {
         wb_table2_5_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table2_5_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_16_3RE2( true) ;
      }
      else
      {
         wb_table3_16_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table3_16_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:19px;width:100%")+"\">") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divTab1_Internalname, 1, 100, "%", 100, "px", divTab1_Class, "left", "top", "", "", "div");
         httpContext.writeText( "<p></p>") ;
         httpContext.writeText( "<p>") ;
         wb_table4_23_3RE2( true) ;
      }
      else
      {
         wb_table4_23_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table4_23_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</p>") ;
         com.kdsproyectos.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;height:19px")+"\">") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divTab2_Internalname, 1, 100, "%", 100, "px", divTab2_Class, "left", "top", "", "", "div");
         wb_table5_160_3RE2( true) ;
      }
      else
      {
         wb_table5_160_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table5_160_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         com.kdsproyectos.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         /* User Defined Control */
         ucMensaje.setProperty("Title", Mensaje_Title);
         ucMensaje.render(context, "gxui.message", Mensaje_Internalname, "MENSAJEContainer");
         /* User Defined Control */
         ucKdsstylesdatatables1.render(context, "kdsstylesdatatables", Kdsstylesdatatables1_Internalname, "KDSSTYLESDATATABLES1Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_3RE2e( true) ;
      }
      else
      {
         wb_table1_2_3RE2e( false) ;
      }
   }

   public void wb_table5_160_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 90, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "center", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;vertical-align:top")+"\">") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top;width:1px")+"\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_164_3RE2( true) ;
      }
      else
      {
         wb_table6_164_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table6_164_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divSection5_Internalname, 1, 700, "px", 200, "px", "scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         Sfl_3Container.SetWrapped(nGXWrapped);
         if ( Sfl_3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Sfl_3Container"+"DivS\" data-gxgridid=\"228\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 480, 10, 0)) + "px" + ";" ;
            com.kdsproyectos.GxWebStd.gx_table_start( httpContext, subSfl_3_Internalname, subSfl_3_Internalname, "", "dataTable", 0, "", "", 1, 2, sStyleString, "", "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subSfl_3_Backcolorstyle == 0 )
            {
               subSfl_3_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subSfl_3_Class) > 0 )
               {
                  subSfl_3_Linesclass = subSfl_3_Class+"Title" ;
               }
            }
            else
            {
               subSfl_3_Titlebackstyle = (byte)(1) ;
               if ( subSfl_3_Backcolorstyle == 1 )
               {
                  subSfl_3_Titlebackcolor = subSfl_3_Allbackcolor ;
                  if ( GXutil.len( subSfl_3_Class) > 0 )
                  {
                     subSfl_3_Linesclass = subSfl_3_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subSfl_3_Class) > 0 )
                  {
                     subSfl_3_Linesclass = subSfl_3_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 70, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "id archivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 30, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nombre documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 200, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Fecha de registro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subSfl_3_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Archivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Sfl_3Container.AddObjectProperty("GridName", "Sfl_3");
         }
         else
         {
            Sfl_3Container.AddObjectProperty("GridName", "Sfl_3");
            Sfl_3Container.AddObjectProperty("Header", subSfl_3_Header);
            Sfl_3Container.AddObjectProperty("Class", "dataTable");
            Sfl_3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSfl_3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Titlefont", GXutil.rtrim( subSfl_3_Titlefont));
            Sfl_3Container.AddObjectProperty("Linesfont", GXutil.rtrim( subSfl_3_Linesfont));
            Sfl_3Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subSfl_3_Width, (byte)(9), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("CmpContext", "");
            Sfl_3Container.AddObjectProperty("InMasterPage", "false");
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85valcomida, (byte)(10), (byte)(0), ".", "")));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomida_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", GXutil.rtrim( AV68Eliminar));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminar_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", GXutil.rtrim( AV82valcomnma));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomnma_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", GXutil.rtrim( AV84cnuserdsc));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCnuserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", GXutil.rtrim( AV83valcomtipar));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomtipar_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", localUtil.format(AV81valcomfeca, "99/99/9999"));
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomfeca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Sfl_3Column.AddObjectProperty("Value", AV79VALCOMBLOB);
            Sfl_3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomblob_Enabled, (byte)(5), (byte)(0), ".", "")));
            Sfl_3Container.AddColumnProperties(Sfl_3Column);
            Sfl_3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subSfl_3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subSfl_3_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subSfl_3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subSfl_3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subSfl_3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subSfl_3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Sfl_3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subSfl_3_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 228 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_228 = (short)(nGXsfl_228_idx-1) ;
         if ( Sfl_3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Sfl_3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Sfl_3", Sfl_3Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Sfl_3ContainerData", Sfl_3Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "Sfl_3ContainerData"+"V", Sfl_3Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Sfl_3ContainerData"+"V"+"\" value='"+Sfl_3Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.kdsproyectos.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_160_3RE2e( true) ;
      }
      else
      {
         wb_table5_160_3RE2e( false) ;
      }
   }

   public void wb_table6_164_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "KDSCard", 0, "center", "", 1, 4, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, "Serie factura\\Nota", "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavSerie_Internalname, GXutil.rtrim( AV129serie), GXutil.rtrim( localUtil.format( AV129serie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSerie_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 250, "px", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, "Folio factura\\Nota", "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavFolio_Internalname, GXutil.rtrim( AV130folio), GXutil.rtrim( localUtil.format( AV130folio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFolio_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 250, "px", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\""+GXutil.CssPrettify( "height:30px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "Fecha factura\\Nota de venta", "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAcmroifdoc_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcmroifdoc_Internalname, localUtil.format(AV128ACMROIFDOC, "99/99/99"), localUtil.format( AV128ACMROIFDOC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcmroifdoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 250, "px", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         com.kdsproyectos.GxWebStd.gx_bitmap( httpContext, edtavAcmroifdoc_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_prompgenoc.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\""+GXutil.CssPrettify( "height:21px")+"\">") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "UUID", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavUuid_Internalname, GXutil.rtrim( AV218UUID), GXutil.rtrim( localUtil.format( AV218UUID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUuid_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 250, "px", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, "Datos de referencia/factura", "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
         ClassString = "Attribute" ;
         StyleString = "font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavAcmroiobst_Internalname, GXutil.rtrim( AV127ACMROIOBST), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,190);\"", (short)(0), 1, 1, 0, 100, "%", 2, "row", StyleString, ClassString, "", "", "120", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table7_193_3RE2( true) ;
      }
      else
      {
         wb_table7_193_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table7_193_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\" colspan=\"3\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtvalidar_Internalname, lblTxtvalidar_Caption, "", "", lblTxtvalidar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'VALIDAR\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table8_214_3RE2( true) ;
      }
      else
      {
         wb_table8_214_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table8_214_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
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
         wb_table6_164_3RE2e( true) ;
      }
      else
      {
         wb_table6_164_3RE2e( false) ;
      }
   }

   public void wb_table8_214_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbladjarch_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTbladjarch_Internalname, tblTbladjarch_Internalname, "", "KDSCard", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "width:50%")+"\">") ;
         /* User Defined Control */
         ucFileupload1.setProperty("AutoUpload", Fileupload1_Autoupload);
         ucFileupload1.setProperty("UploadedFiles", AV75UploadedFiles);
         ucFileupload1.render(context, "fileupload", Fileupload1_Internalname, "FILEUPLOAD1Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;width:25%")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "+", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SUBIR ARCHIVO\\'."+"'", "font-family:'Microsoft Sans Serif'; font-size:33.0pt; font-weight:normal; font-style:normal;", "TextBlock", 5, "", lblTextblock5_Visible, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;width:25%")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtlimpiarfileupload_Internalname, "x", "", "", lblTxtlimpiarfileupload_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'CLEAR FILEUPLOAD TRAY\\'."+"'", "font-family:'Microsoft Sans Serif'; font-size:32.0pt; font-weight:normal; font-style:normal;", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_214_3RE2e( true) ;
      }
      else
      {
         wb_table8_214_3RE2e( false) ;
      }
   }

   public void wb_table7_193_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "RFC Emisor", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCncdirrfc_Internalname, GXutil.rtrim( AV151CNCDIRRFC), GXutil.rtrim( localUtil.format( AV151CNCDIRRFC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,198);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCncdirrfc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCncdirrfc_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "RFC Receptor", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCnciasrfc_Internalname, GXutil.rtrim( AV150CNCIASRFC), GXutil.rtrim( localUtil.format( AV150CNCIASRFC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnciasrfc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCnciasrfc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Nombre del archivo", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", lblTextblock1_Visible, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavName_Internalname, GXutil.rtrim( AV78NAME), GXutil.rtrim( localUtil.format( AV78NAME, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,208);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavName_Jsonclick, 0, "Attribute", "", "", "", "", edtavName_Visible, 1, 0, "text", "", 250, "PX", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_193_3RE2e( true) ;
      }
      else
      {
         wb_table7_193_3RE2e( false) ;
      }
   }

   public void wb_table4_23_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:top")+"\">") ;
         wb_table9_26_3RE2( true) ;
      }
      else
      {
         wb_table9_26_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table9_26_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 920, "px", 400, "px", "scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"145\">") ;
            sStyleString = "" ;
            com.kdsproyectos.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "KDSResponsiveTable", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "N° Req") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Línea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 250, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Concepto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Solicitada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( edtavCantidadfact_Title) ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "UM") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Precio Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Subtotal") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Producto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((edtavCantidadret_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Retornada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Header", subGrid1_Header);
            Grid1Container.AddObjectProperty("Class", "KDSResponsiveTable");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22valcomlin, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomlin_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21valcomrndoc, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomrndoc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23VALCOMRLIN, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomrlin_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV20inproddsc);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInproddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19valcomqto, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomqto_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24cantidadfact, (byte)(18), (byte)(4), ".", "")));
            Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtavCantidadfact_Title));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantidadfact_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV28VALCOMUMT));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomumt_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25preunit, (byte)(18), (byte)(4), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPreunit_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26subtotal, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSubtotal_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27valcomprid, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcomprid_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV102CantidadRet, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantidadret_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantidadret_Visible, (byte)(5), (byte)(0), ".", "")));
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
      if ( wbEnd == 145 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_145 = (short)(nGXsfl_145_idx-1) ;
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
         wb_table4_23_3RE2e( true) ;
      }
      else
      {
         wb_table4_23_3RE2e( false) ;
      }
   }

   public void wb_table9_26_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 350, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 4, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\" colspan=\"2\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Nota: La cantidad del vale que no se coloque como compra , será liberada para poder asígnada a otro proveedor", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "width:120px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "Vale de Compra", "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavValcomdoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV10VALCOMDOC, (byte)(10), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValcomdoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, 0, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCnusergpo_Internalname, GXutil.ltrim( localUtil.ntoc( AV117CNUSERGPO, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV117CNUSERGPO), "ZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnusergpo_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnusergpo_Visible, 1, 0, "number", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "Proveedor", "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCncdirnom_Internalname, GXutil.rtrim( AV8cncdirnom), GXutil.rtrim( localUtil.format( AV8cncdirnom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCncdirnom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCncdirnom_Enabled, 0, "text", "", 250, "px", 1, "row", 250, (byte)(0), (short)(0), 0, (byte)(1), (byte)(0), (byte)(0), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "Almacén de recepción", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavInalmnid, cmbavInalmnid.getInternalname(), GXutil.rtrim( AV154INALMNID), 1, cmbavInalmnid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, 1, 0, (short)(0), 250, "px", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,45);\"", "", true, "HLP_prompgenoc.htm");
         cmbavInalmnid.setValue( GXutil.rtrim( AV154INALMNID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavInalmnid.getInternalname(), "Values", cmbavInalmnid.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:38px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "Condiciones de pago", "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, dynavCntpgoid, dynavCntpgoid.getInternalname(), GXutil.rtrim( AV6CNTPGOID), 1, dynavCntpgoid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynavCntpgoid.getEnabled(), 0, (short)(0), 250, "px", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,50);\"", "", true, "HLP_prompgenoc.htm");
         dynavCntpgoid.setValue( GXutil.rtrim( AV6CNTPGOID) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCntpgoid.getInternalname(), "Values", dynavCntpgoid.ToJavascriptSource(), true);
         httpContext.writeText( "&nbsp;") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCntpgodias_Internalname, GXutil.ltrim( localUtil.ntoc( AV219CNTPGODIAS, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV219CNTPGODIAS), "ZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCntpgodias_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "number", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "Moneda", "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCncmnmid, cmbavCncmnmid.getInternalname(), GXutil.rtrim( AV32CNCMNMID), 1, cmbavCncmnmid.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVCNCMNMID.CLICK."+"'", "char", "", 1, cmbavCncmnmid.getEnabled(), 0, (short)(0), 200, "px", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,56);\"", "", true, "HLP_prompgenoc.htm");
         cmbavCncmnmid.setValue( GXutil.rtrim( AV32CNCMNMID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCncmnmid.getInternalname(), "Values", cmbavCncmnmid.ToJavascriptSource(), true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCnciasmon_Internalname, GXutil.rtrim( AV18cnciasmon), GXutil.rtrim( localUtil.format( AV18cnciasmon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnciasmon_Jsonclick, 0, "Attribute", "", "", "", "", edtavCnciasmon_Visible, 1, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "IVA", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, dynavCntivaid, dynavCntivaid.getInternalname(), GXutil.rtrim( AV11CNTIVAID), 1, dynavCntivaid.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVCNTIVAID.CLICK."+"'", "char", "", 1, dynavCntivaid.getEnabled(), 0, (short)(0), 200, "px", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,62);\"", "", true, "HLP_prompgenoc.htm");
         dynavCntivaid.setValue( GXutil.rtrim( AV11CNTIVAID) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCntivaid.getInternalname(), "Values", dynavCntivaid.ToJavascriptSource(), true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCntivaprc_Internalname, GXutil.ltrim( localUtil.ntoc( AV12CNTIVAPRC, (byte)(11), (byte)(4), ".", "")), ((edtavCntivaprc_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV12CNTIVAPRC, "ZZZZZ9.9999")) : localUtil.format( AV12CNTIVAPRC, "ZZZZZ9.9999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCntivaprc_Jsonclick, 0, "Attribute", "", "", "", "", edtavCntivaprc_Visible, edtavCntivaprc_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon1_Internalname, "Tipo de cambio", "", "", lblMon1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", lblMon1_Visible, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcmvoitcmb_Internalname, GXutil.ltrim( localUtil.ntoc( AV9ACMVOITCMB, (byte)(15), (byte)(4), ".", "")), ((edtavAcmvoitcmb_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV9ACMVOITCMB, "ZZZZZZZZZ9.9999")) : localUtil.format( AV9ACMVOITCMB, "ZZZZZZZZZ9.9999")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcmvoitcmb_Jsonclick, 0, "Attribute", "", "", "", "", edtavAcmvoitcmb_Visible, edtavAcmvoitcmb_Enabled, 0, "text", "", 80, "px", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_74_3RE2( true) ;
      }
      else
      {
         wb_table10_74_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table10_74_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\" colspan=\"2\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         wb_table11_98_3RE2( true) ;
      }
      else
      {
         wb_table11_98_3RE2( false) ;
      }
      return  ;
   }

   public void wb_table11_98_3RE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "&nbsp; &nbsp; &nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon2_Internalname, "Subtotal Nacional", "", "", lblMon2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavSubtotal_oc_Internalname, GXutil.ltrim( localUtil.ntoc( AV30subtotal_oc, (byte)(18), (byte)(2), ".", "")), ((edtavSubtotal_oc_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV30subtotal_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV30subtotal_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSubtotal_oc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavSubtotal_oc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon3_Internalname, "IVA Nacional", "", "", lblMon3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavIva_oc_Internalname, GXutil.ltrim( localUtil.ntoc( AV33iva_oc, (byte)(18), (byte)(2), ".", "")), ((edtavIva_oc_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV33iva_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV33iva_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIva_oc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavIva_oc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon4_Internalname, "Total Nacional", "", "", lblMon4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_oc_Internalname, GXutil.ltrim( localUtil.ntoc( AV31total_oc, (byte)(18), (byte)(2), ".", "")), ((edtavTotal_oc_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV31total_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV31total_oc, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_oc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavTotal_oc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon5_Internalname, "Subtotal Extranjero", "", "", lblMon5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavSubtotal_ext_Internalname, GXutil.ltrim( localUtil.ntoc( AV91subtotal_ext, (byte)(18), (byte)(2), ".", "")), ((edtavSubtotal_ext_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV91subtotal_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV91subtotal_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSubtotal_ext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavSubtotal_ext_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon6_Internalname, "IVA Extranjero", "", "", lblMon6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavIva_ext_Internalname, GXutil.ltrim( localUtil.ntoc( AV92iva_ext, (byte)(18), (byte)(2), ".", "")), ((edtavIva_ext_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV92iva_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV92iva_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIva_ext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavIva_ext_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon7_Internalname, "Total Extranjero", "", "", lblMon7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_ext_Internalname, GXutil.ltrim( localUtil.ntoc( AV93total_ext, (byte)(18), (byte)(2), ".", "")), ((edtavTotal_ext_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV93total_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV93total_ext, "ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_ext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavTotal_ext_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblButtonoc_Internalname, lblButtonoc_Caption, "", "", lblButtonoc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'GENERAR OC\\'."+"'", "", "TextBlock", 5, "", lblButtonoc_Visible, 1, (short)(1), "HLP_prompgenoc.htm");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblButtonrec_Internalname, lblButtonrec_Caption, "", "", lblButtonrec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'RECEPCION\\'."+"'", "", "TextBlock", 5, "", lblButtonrec_Visible, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_26_3RE2e( true) ;
      }
      else
      {
         wb_table9_26_3RE2e( false) ;
      }
   }

   public void wb_table11_98_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblMon8_Internalname, lblMon8_Caption, "", "", lblMon8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:14.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", lblMon8_Visible, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavValcomnoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV96VALCOMNOC, (byte)(10), (byte)(0), ".", "")), ((edtavValcomnoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV96VALCOMNOC), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV96VALCOMNOC), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValcomnoc_Jsonclick, 0, "Attribute", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal;", "", "", "", edtavValcomnoc_Visible, edtavValcomnoc_Enabled, 0, "number", "1", 60, "PX", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblPdf_Internalname, lblPdf_Caption, "", "", lblPdf_Jsonclick, "'"+""+"'"+",false,"+"'"+"e313re1_client"+"'", "", "TextBlock", 7, "Mostrar PDF", lblPdf_Visible, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTarget_Internalname, lblTarget_Caption, "", "", lblTarget_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ABRE OC\\'."+"'", "", "TextBlock", 5, "Ir a Seguimiento de OC", lblTarget_Visible, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_98_3RE2e( true) ;
      }
      else
      {
         wb_table11_98_3RE2e( false) ;
      }
   }

   public void wb_table10_74_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTbldescuento_Internalname, tblTbldescuento_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;" ;
         com.kdsproyectos.GxWebStd.gx_checkbox_ctrl( httpContext, chkavIncdes.getInternalname(), AV107incDes, "", "", 1, chkavIncdes.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags);
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblLbincdes_Internalname, "Incluir descuento", "", "", lblLbincdes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblLbltipodescuento_Internalname, "Tipo descuento", "", "", lblLbltipodescuento_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "&nbsp;") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipodes, cmbavTipodes.getInternalname(), GXutil.rtrim( AV108tipoDes), 1, cmbavTipodes.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipodes.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,81);\"", "", true, "HLP_prompgenoc.htm");
         cmbavTipodes.setValue( GXutil.rtrim( AV108tipoDes) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipodes.getInternalname(), "Values", cmbavTipodes.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblLbldescuento_Internalname, "Descuento", "", "", lblLbldescuento_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcmvoipdto_Internalname, GXutil.ltrim( localUtil.ntoc( AV109ACMVOIPDTO, (byte)(8), (byte)(2), ".", "")), GXutil.ltrim( localUtil.format( AV109ACMVOIPDTO, "Z,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcmvoipdto_Jsonclick, 0, "Attribute", "", "", "", "", edtavAcmvoipdto_Visible, edtavAcmvoipdto_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavAcmvoipdes_Internalname, GXutil.ltrim( localUtil.ntoc( AV110ACMVOIPDES, (byte)(17), (byte)(2), ".", "")), GXutil.ltrim( localUtil.format( AV110ACMVOIPDES, "ZZZZZZZZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAcmvoipdes_Jsonclick, 0, "Attribute", "", "", "", "", edtavAcmvoipdes_Visible, edtavAcmvoipdes_Enabled, 1, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblLbldescuento2_Internalname, "Descuento Monto", "", "", lblLbldescuento2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", lblLbldescuento2_Visible, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavMtodes_Internalname, GXutil.ltrim( localUtil.ntoc( AV120MTODES, (byte)(21), (byte)(2), ".", "")), GXutil.ltrim( localUtil.format( AV120MTODES, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMtodes_Jsonclick, 0, "Attribute", "", "", "", "", edtavMtodes_Visible, edtavMtodes_Enabled, 1, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_74_3RE2e( true) ;
      }
      else
      {
         wb_table10_74_3RE2e( false) ;
      }
   }

   public void wb_table3_16_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 1, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblCss_Internalname, lblCss_Caption, "", "", lblCss_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_16_3RE2e( true) ;
      }
      else
      {
         wb_table3_16_3RE2e( false) ;
      }
   }

   public void wb_table2_5_3RE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + "Transparent;" ;
         sStyleString = sStyleString + " border-color: " + "Transparent;" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 50, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblEsqueleto_Internalname, tblEsqueleto_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr bgcolor=\"#FFFFFF\" bordercolor=\"#FFFFFF\" >") ;
         httpContext.writeText( "<td data-align=\"left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-left;text-align:-moz-left;text-align:-webkit-left;height:50px;width:150px")+"\">") ;
         httpContext.writeText( "&nbsp;&nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtregresar_Internalname, lblTxtregresar_Caption, "", "", lblTxtregresar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REGRESAR\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;height:50px;width:800px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblSeg_Internalname, lblSeg_Caption, "", "", lblSeg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:16.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompgenoc.htm");
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-right;text-align:-moz-right;text-align:-webkit-right;height:50px;width:150px")+"\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\" colspan=\"3\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;height:14px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblHtml2_Internalname, "<hr id = 'hrd1'>", "", "", lblHtml2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_prompgenoc.htm");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxt_Internalname, lblTxt_Caption, "", "", lblTxt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_prompgenoc.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_3RE2e( true) ;
      }
      else
      {
         wb_table2_5_3RE2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV16CNCIASID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CNCIASID", GXutil.ltrim( GXutil.str( AV16CNCIASID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNCIASID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CNCIASID), "ZZZZZZZZZ9")));
      AV17CNTDOCID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CNTDOCID", AV17CNTDOCID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNTDOCID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17CNTDOCID, ""))));
      AV10VALCOMDOC = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10VALCOMDOC", GXutil.ltrim( GXutil.str( AV10VALCOMDOC, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vVALCOMDOC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10VALCOMDOC), "ZZZZZZZZZ9")));
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
      pa3RE2( ) ;
      ws3RE2( ) ;
      we3RE2( ) ;
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
      httpContext.AddStyleSheetFile("FileUpload/fileupload.min.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20255212364777", true, true);
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
         httpContext.AddJavascriptSource("prompgenoc.js", "?20255212364777", false, true);
         httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
         httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
         httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
         httpContext.AddJavascriptSource("KDSControls/KDSStylesDatatables/KDSStylesDatatablesRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1452( )
   {
      edtavValcomlin_Internalname = "vVALCOMLIN_"+sGXsfl_145_idx ;
      edtavValcomrndoc_Internalname = "vVALCOMRNDOC_"+sGXsfl_145_idx ;
      edtavValcomrlin_Internalname = "vVALCOMRLIN_"+sGXsfl_145_idx ;
      edtavInproddsc_Internalname = "vINPRODDSC_"+sGXsfl_145_idx ;
      edtavValcomqto_Internalname = "vVALCOMQTO_"+sGXsfl_145_idx ;
      edtavCantidadfact_Internalname = "vCANTIDADFACT_"+sGXsfl_145_idx ;
      edtavValcomumt_Internalname = "vVALCOMUMT_"+sGXsfl_145_idx ;
      edtavPreunit_Internalname = "vPREUNIT_"+sGXsfl_145_idx ;
      edtavSubtotal_Internalname = "vSUBTOTAL_"+sGXsfl_145_idx ;
      edtavValcomprid_Internalname = "vVALCOMPRID_"+sGXsfl_145_idx ;
      edtavCantidadret_Internalname = "vCANTIDADRET_"+sGXsfl_145_idx ;
   }

   public void subsflControlProps_fel_1452( )
   {
      edtavValcomlin_Internalname = "vVALCOMLIN_"+sGXsfl_145_fel_idx ;
      edtavValcomrndoc_Internalname = "vVALCOMRNDOC_"+sGXsfl_145_fel_idx ;
      edtavValcomrlin_Internalname = "vVALCOMRLIN_"+sGXsfl_145_fel_idx ;
      edtavInproddsc_Internalname = "vINPRODDSC_"+sGXsfl_145_fel_idx ;
      edtavValcomqto_Internalname = "vVALCOMQTO_"+sGXsfl_145_fel_idx ;
      edtavCantidadfact_Internalname = "vCANTIDADFACT_"+sGXsfl_145_fel_idx ;
      edtavValcomumt_Internalname = "vVALCOMUMT_"+sGXsfl_145_fel_idx ;
      edtavPreunit_Internalname = "vPREUNIT_"+sGXsfl_145_fel_idx ;
      edtavSubtotal_Internalname = "vSUBTOTAL_"+sGXsfl_145_fel_idx ;
      edtavValcomprid_Internalname = "vVALCOMPRID_"+sGXsfl_145_fel_idx ;
      edtavCantidadret_Internalname = "vCANTIDADRET_"+sGXsfl_145_fel_idx ;
   }

   public void sendrow_1452( )
   {
      subsflControlProps_1452( ) ;
      wb3RE0( ) ;
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
         if ( ((int)(((nGXsfl_145_idx-1)/ (double) (1)) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_145_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomlin_Enabled!=0)&&(edtavValcomlin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 146,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV22valcomlin, (byte)(10), (byte)(0), ".", "")),((edtavValcomlin_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV22valcomlin), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavValcomlin_Enabled!=0)&&(edtavValcomlin_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,146);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomlin_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavValcomlin_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomrndoc_Enabled!=0)&&(edtavValcomrndoc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 147,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomrndoc_Internalname,GXutil.ltrim( localUtil.ntoc( AV21valcomrndoc, (byte)(10), (byte)(0), ".", "")),((edtavValcomrndoc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV21valcomrndoc), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavValcomrndoc_Enabled!=0)&&(edtavValcomrndoc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,147);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomrndoc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavValcomrndoc_Enabled),new Integer(0),"number","1",new Integer(60),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomrlin_Enabled!=0)&&(edtavValcomrlin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 148,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomrlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV23VALCOMRLIN, (byte)(10), (byte)(0), ".", "")),((edtavValcomrlin_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV23VALCOMRLIN), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavValcomrlin_Enabled!=0)&&(edtavValcomrlin_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,148);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomrlin_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavValcomrlin_Enabled),new Integer(0),"number","1",new Integer(60),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavInproddsc_Enabled!=0)&&(edtavInproddsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 149,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInproddsc_Internalname,AV20inproddsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInproddsc_Enabled!=0)&&(edtavInproddsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,149);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInproddsc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavInproddsc_Enabled),new Integer(0),"text","",new Integer(250),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomqto_Enabled!=0)&&(edtavValcomqto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 150,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomqto_Internalname,GXutil.ltrim( localUtil.ntoc( AV19valcomqto, (byte)(18), (byte)(2), ".", "")),((edtavValcomqto_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV19valcomqto, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavValcomqto_Enabled!=0)&&(edtavValcomqto_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,150);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomqto_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavValcomqto_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCantidadfact_Enabled!=0)&&(edtavCantidadfact_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 151,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantidadfact_Internalname,GXutil.ltrim( localUtil.ntoc( AV24cantidadfact, (byte)(18), (byte)(4), ".", "")),GXutil.ltrim( localUtil.format( AV24cantidadfact, "Z,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+((edtavCantidadfact_Enabled!=0)&&(edtavCantidadfact_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,151);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCantidadfact_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavCantidadfact_Enabled),new Integer(1),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomumt_Enabled!=0)&&(edtavValcomumt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 152,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomumt_Internalname,GXutil.rtrim( AV28VALCOMUMT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavValcomumt_Enabled!=0)&&(edtavValcomumt_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,152);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomumt_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavValcomumt_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPreunit_Enabled!=0)&&(edtavPreunit_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 153,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPreunit_Internalname,GXutil.ltrim( localUtil.ntoc( AV25preunit, (byte)(18), (byte)(4), ".", "")),GXutil.ltrim( localUtil.format( AV25preunit, "Z,ZZZ,ZZZ,ZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','4');"+";gx.evt.onchange(this, event)\" "+((edtavPreunit_Enabled!=0)&&(edtavPreunit_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,153);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPreunit_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavPreunit_Enabled),new Integer(1),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavSubtotal_Enabled!=0)&&(edtavSubtotal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 154,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSubtotal_Internalname,GXutil.ltrim( localUtil.ntoc( AV26subtotal, (byte)(18), (byte)(2), ".", "")),((edtavSubtotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV26subtotal, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV26subtotal, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavSubtotal_Enabled!=0)&&(edtavSubtotal_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,154);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSubtotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(-1),new Integer(edtavSubtotal_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomprid_Enabled!=0)&&(edtavValcomprid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 155,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomprid_Internalname,GXutil.ltrim( localUtil.ntoc( AV27valcomprid, (byte)(10), (byte)(0), ".", "")),((edtavValcomprid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27valcomprid), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV27valcomprid), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavValcomprid_Enabled!=0)&&(edtavValcomprid_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,155);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomprid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(0),new Integer(edtavValcomprid_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantidadret_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCantidadret_Enabled!=0)&&(edtavCantidadret_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 156,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantidadret_Internalname,GXutil.ltrim( localUtil.ntoc( AV102CantidadRet, (byte)(18), (byte)(2), ".", "")),((edtavCantidadret_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV102CantidadRet, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV102CantidadRet, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCantidadret_Enabled!=0)&&(edtavCantidadret_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,156);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCantidadret_Jsonclick,new Integer(0),"Attribute","",ROClassString,"","",new Integer(edtavCantidadret_Visible),new Integer(edtavCantidadret_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      send_integrity_lvl_hashes3RE2( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_145_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_idx+1)) ;
      sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1452( ) ;
      /* End function sendrow_1452 */
   }

   public void subsflControlProps_22812( )
   {
      edtavValcomida_Internalname = "vVALCOMIDA_"+sGXsfl_228_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_228_idx ;
      edtavValcomnma_Internalname = "vVALCOMNMA_"+sGXsfl_228_idx ;
      edtavCnuserdsc_Internalname = "vCNUSERDSC_"+sGXsfl_228_idx ;
      edtavValcomtipar_Internalname = "vVALCOMTIPAR_"+sGXsfl_228_idx ;
      edtavValcomfeca_Internalname = "vVALCOMFECA_"+sGXsfl_228_idx ;
      edtavValcomblob_Internalname = "vVALCOMBLOB_"+sGXsfl_228_idx ;
   }

   public void subsflControlProps_fel_22812( )
   {
      edtavValcomida_Internalname = "vVALCOMIDA_"+sGXsfl_228_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_228_fel_idx ;
      edtavValcomnma_Internalname = "vVALCOMNMA_"+sGXsfl_228_fel_idx ;
      edtavCnuserdsc_Internalname = "vCNUSERDSC_"+sGXsfl_228_fel_idx ;
      edtavValcomtipar_Internalname = "vVALCOMTIPAR_"+sGXsfl_228_fel_idx ;
      edtavValcomfeca_Internalname = "vVALCOMFECA_"+sGXsfl_228_fel_idx ;
      edtavValcomblob_Internalname = "vVALCOMBLOB_"+sGXsfl_228_fel_idx ;
   }

   public void sendrow_22812( )
   {
      subsflControlProps_22812( ) ;
      wb3RE0( ) ;
      Sfl_3Row = GXWebRow.GetNew(context,Sfl_3Container) ;
      if ( subSfl_3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subSfl_3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subSfl_3_Class, "") != 0 )
         {
            subSfl_3_Linesclass = subSfl_3_Class+"Odd" ;
         }
      }
      else if ( subSfl_3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subSfl_3_Backstyle = (byte)(0) ;
         subSfl_3_Backcolor = subSfl_3_Allbackcolor ;
         if ( GXutil.strcmp(subSfl_3_Class, "") != 0 )
         {
            subSfl_3_Linesclass = subSfl_3_Class+"Uniform" ;
         }
      }
      else if ( subSfl_3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subSfl_3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subSfl_3_Class, "") != 0 )
         {
            subSfl_3_Linesclass = subSfl_3_Class+"Odd" ;
         }
         subSfl_3_Backcolor = (int)(0x0) ;
      }
      else if ( subSfl_3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subSfl_3_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_228_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subSfl_3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subSfl_3_Class, "") != 0 )
            {
               subSfl_3_Linesclass = subSfl_3_Class+"Odd" ;
            }
         }
         else
         {
            subSfl_3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subSfl_3_Class, "") != 0 )
            {
               subSfl_3_Linesclass = subSfl_3_Class+"Even" ;
            }
         }
      }
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+subSfl_3_Linesclass+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_228_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomida_Enabled!=0)&&(edtavValcomida_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 229,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomida_Internalname,GXutil.ltrim( localUtil.ntoc( AV85valcomida, (byte)(10), (byte)(0), ".", "")),((edtavValcomida_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85valcomida), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV85valcomida), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavValcomida_Enabled!=0)&&(edtavValcomida_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,229);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomida_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavValcomida_Enabled),new Integer(0),"number","1",new Integer(70),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(228),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 230,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,GXutil.rtrim( AV68Eliminar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,230);\"" : " "),"'"+""+"'"+",false,"+"'"+"E\\'ELIMINAR DOC\\'."+sGXsfl_228_idx+"'","","","Eliminar","",edtavEliminar_Jsonclick,new Integer(5),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavEliminar_Enabled),new Integer(0),"text","",new Integer(30),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(1),new Integer(228),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomnma_Enabled!=0)&&(edtavValcomnma_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 231,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomnma_Internalname,GXutil.rtrim( AV82valcomnma),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavValcomnma_Enabled!=0)&&(edtavValcomnma_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,231);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomnma_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavValcomnma_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(228),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCnuserdsc_Enabled!=0)&&(edtavCnuserdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 232,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCnuserdsc_Internalname,GXutil.rtrim( AV84cnuserdsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCnuserdsc_Enabled!=0)&&(edtavCnuserdsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,232);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCnuserdsc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCnuserdsc_Enabled),new Integer(0),"text","",new Integer(200),"px",new Integer(17),"px",new Integer(250),new Integer(0),new Integer(0),new Integer(228),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomtipar_Enabled!=0)&&(edtavValcomtipar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 233,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomtipar_Internalname,GXutil.rtrim( AV83valcomtipar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavValcomtipar_Enabled!=0)&&(edtavValcomtipar_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,233);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomtipar_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavValcomtipar_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(228),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavValcomfeca_Enabled!=0)&&(edtavValcomfeca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 234,'',false,'"+sGXsfl_228_idx+"',228)\"" : " ") ;
      ROClassString = "Attribute" ;
      Sfl_3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcomfeca_Internalname,localUtil.format(AV81valcomfeca, "99/99/9999"),localUtil.format( AV81valcomfeca, "99/99/9999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavValcomfeca_Enabled!=0)&&(edtavValcomfeca_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,234);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValcomfeca_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavValcomfeca_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(228),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Sfl_3Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      ClassString = "Image" ;
      StyleString = "font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;" ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_228_idx + "',228)\"" ;
      edtavValcomblob_Filetype = "tmp" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "Filetype", edtavValcomblob_Filetype, !bGXsfl_228_Refreshing);
      if ( ! (GXutil.strcmp("", AV79VALCOMBLOB)==0) )
      {
         gxblobfileaux.setSource( AV79VALCOMBLOB );
         if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavValcomblob_Filetype, "tmp") != 0 ) )
         {
            gxblobfileaux.setExt(GXutil.trim( edtavValcomblob_Filetype));
         }
         if ( gxblobfileaux.getErrCode() == 0 )
         {
            AV79VALCOMBLOB = gxblobfileaux.getURI() ;
            httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "URL", httpContext.getResourceRelative(AV79VALCOMBLOB), !bGXsfl_228_Refreshing);
            edtavValcomblob_Filetype = gxblobfileaux.getExtension() ;
            httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "Filetype", edtavValcomblob_Filetype, !bGXsfl_228_Refreshing);
            gxblobfileaux.setBlobToDelete();
         }
         httpContext.ajax_rsp_assign_prop("", false, edtavValcomblob_Internalname, "URL", httpContext.getResourceRelative(AV79VALCOMBLOB), !bGXsfl_228_Refreshing);
      }
      Sfl_3Row.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtavValcomblob_Internalname,GXutil.rtrim( AV79VALCOMBLOB),httpContext.getResourceRelative(AV79VALCOMBLOB),((GXutil.strcmp("", edtavValcomblob_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavValcomblob_Filetype)==0) ? AV79VALCOMBLOB : edtavValcomblob_Filetype)) : edtavValcomblob_Contenttype),new Boolean(false),"blank",edtavValcomblob_Parameters,new Integer(1),new Integer(edtavValcomblob_Enabled),new Integer(-1),"","",new Integer(0),new Integer(1),new Integer(80),"px",new Integer(60),"px",new Integer(0),new Integer(0),new Integer(0),edtavValcomblob_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"","",""+TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,235);\"","",""});
      send_integrity_lvl_hashes3RE12( ) ;
      Sfl_3Container.AddRow(Sfl_3Row);
      nGXsfl_228_idx = (short)(((subSfl_3_Islastpage==1)&&(nGXsfl_228_idx+1>subsfl_3_recordsperpage( )) ? 1 : nGXsfl_228_idx+1)) ;
      sGXsfl_228_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_228_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_22812( ) ;
      /* End function sendrow_22812 */
   }

   public void init_default_properties( )
   {
      lblTxtregresar_Internalname = "TXTREGRESAR" ;
      lblSeg_Internalname = "SEG" ;
      lblHtml2_Internalname = "HTML2" ;
      lblTxt_Internalname = "TXT" ;
      tblEsqueleto_Internalname = "ESQUELETO" ;
      lblCss_Internalname = "CSS" ;
      tblTable2_Internalname = "TABLE2" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtavValcomdoc_Internalname = "vVALCOMDOC" ;
      edtavCnusergpo_Internalname = "vCNUSERGPO" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtavCncdirnom_Internalname = "vCNCDIRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      cmbavInalmnid.setInternalname( "vINALMNID" );
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      dynavCntpgoid.setInternalname( "vCNTPGOID" );
      edtavCntpgodias_Internalname = "vCNTPGODIAS" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      cmbavCncmnmid.setInternalname( "vCNCMNMID" );
      edtavCnciasmon_Internalname = "vCNCIASMON" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      dynavCntivaid.setInternalname( "vCNTIVAID" );
      edtavCntivaprc_Internalname = "vCNTIVAPRC" ;
      lblMon1_Internalname = "MON1" ;
      edtavAcmvoitcmb_Internalname = "vACMVOITCMB" ;
      chkavIncdes.setInternalname( "vINCDES" );
      lblLbincdes_Internalname = "LBINCDES" ;
      lblLbltipodescuento_Internalname = "LBLTIPODESCUENTO" ;
      cmbavTipodes.setInternalname( "vTIPODES" );
      lblLbldescuento_Internalname = "LBLDESCUENTO" ;
      edtavAcmvoipdto_Internalname = "vACMVOIPDTO" ;
      edtavAcmvoipdes_Internalname = "vACMVOIPDES" ;
      lblLbldescuento2_Internalname = "LBLDESCUENTO2" ;
      edtavMtodes_Internalname = "vMTODES" ;
      tblTbldescuento_Internalname = "TBLDESCUENTO" ;
      lblMon8_Internalname = "MON8" ;
      edtavValcomnoc_Internalname = "vVALCOMNOC" ;
      lblPdf_Internalname = "PDF" ;
      lblTarget_Internalname = "TARGET" ;
      tblTable4_Internalname = "TABLE4" ;
      lblMon2_Internalname = "MON2" ;
      edtavSubtotal_oc_Internalname = "vSUBTOTAL_OC" ;
      lblMon3_Internalname = "MON3" ;
      edtavIva_oc_Internalname = "vIVA_OC" ;
      lblMon4_Internalname = "MON4" ;
      edtavTotal_oc_Internalname = "vTOTAL_OC" ;
      lblMon5_Internalname = "MON5" ;
      edtavSubtotal_ext_Internalname = "vSUBTOTAL_EXT" ;
      lblMon6_Internalname = "MON6" ;
      edtavIva_ext_Internalname = "vIVA_EXT" ;
      lblMon7_Internalname = "MON7" ;
      edtavTotal_ext_Internalname = "vTOTAL_EXT" ;
      lblButtonoc_Internalname = "BUTTONOC" ;
      lblButtonrec_Internalname = "BUTTONREC" ;
      tblTable3_Internalname = "TABLE3" ;
      edtavValcomlin_Internalname = "vVALCOMLIN" ;
      edtavValcomrndoc_Internalname = "vVALCOMRNDOC" ;
      edtavValcomrlin_Internalname = "vVALCOMRLIN" ;
      edtavInproddsc_Internalname = "vINPRODDSC" ;
      edtavValcomqto_Internalname = "vVALCOMQTO" ;
      edtavCantidadfact_Internalname = "vCANTIDADFACT" ;
      edtavValcomumt_Internalname = "vVALCOMUMT" ;
      edtavPreunit_Internalname = "vPREUNIT" ;
      edtavSubtotal_Internalname = "vSUBTOTAL" ;
      edtavValcomprid_Internalname = "vVALCOMPRID" ;
      edtavCantidadret_Internalname = "vCANTIDADRET" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable7_Internalname = "TABLE7" ;
      divTab1_Internalname = "TAB1" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtavSerie_Internalname = "vSERIE" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtavFolio_Internalname = "vFOLIO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtavAcmroifdoc_Internalname = "vACMROIFDOC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtavUuid_Internalname = "vUUID" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtavAcmroiobst_Internalname = "vACMROIOBST" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavCncdirrfc_Internalname = "vCNCDIRRFC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtavCnciasrfc_Internalname = "vCNCIASRFC" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavName_Internalname = "vNAME" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxtvalidar_Internalname = "TXTVALIDAR" ;
      Fileupload1_Internalname = "FILEUPLOAD1" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      lblTxtlimpiarfileupload_Internalname = "TXTLIMPIARFILEUPLOAD" ;
      tblTbladjarch_Internalname = "TBLADJARCH" ;
      tblTable8_Internalname = "TABLE8" ;
      edtavValcomida_Internalname = "vVALCOMIDA" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      edtavValcomnma_Internalname = "vVALCOMNMA" ;
      edtavCnuserdsc_Internalname = "vCNUSERDSC" ;
      edtavValcomtipar_Internalname = "vVALCOMTIPAR" ;
      edtavValcomfeca_Internalname = "vVALCOMFECA" ;
      edtavValcomblob_Internalname = "vVALCOMBLOB" ;
      divSection5_Internalname = "SECTION5" ;
      tblTable9_Internalname = "TABLE9" ;
      divTab2_Internalname = "TAB2" ;
      Mensaje_Internalname = "MENSAJE" ;
      Kdsstylesdatatables1_Internalname = "KDSSTYLESDATATABLES1" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subSfl_3_Internalname = "SFL_3" ;
   }

   public void initialize_properties( )
   {
      httpContext.setDefaultTheme("KDSTheme");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavValcomblob_Jsonclick = "" ;
      edtavValcomblob_Parameters = "" ;
      edtavValcomblob_Contenttype = "" ;
      edtavValcomblob_Filetype = "" ;
      edtavValcomfeca_Jsonclick = "" ;
      edtavValcomfeca_Visible = -1 ;
      edtavValcomtipar_Jsonclick = "" ;
      edtavValcomtipar_Visible = -1 ;
      edtavCnuserdsc_Jsonclick = "" ;
      edtavCnuserdsc_Visible = -1 ;
      edtavValcomnma_Jsonclick = "" ;
      edtavValcomnma_Visible = -1 ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_Visible = -1 ;
      edtavValcomida_Jsonclick = "" ;
      edtavValcomida_Visible = 0 ;
      edtavCantidadret_Jsonclick = "" ;
      edtavValcomprid_Jsonclick = "" ;
      edtavValcomprid_Visible = 0 ;
      edtavSubtotal_Jsonclick = "" ;
      edtavSubtotal_Visible = -1 ;
      edtavPreunit_Jsonclick = "" ;
      edtavPreunit_Visible = -1 ;
      edtavValcomumt_Jsonclick = "" ;
      edtavValcomumt_Visible = -1 ;
      edtavCantidadfact_Jsonclick = "" ;
      edtavCantidadfact_Visible = -1 ;
      edtavValcomqto_Jsonclick = "" ;
      edtavValcomqto_Visible = -1 ;
      edtavInproddsc_Jsonclick = "" ;
      edtavInproddsc_Visible = -1 ;
      edtavValcomrlin_Jsonclick = "" ;
      edtavValcomrlin_Visible = -1 ;
      edtavValcomrndoc_Jsonclick = "" ;
      edtavValcomrndoc_Visible = -1 ;
      edtavValcomlin_Jsonclick = "" ;
      edtavValcomlin_Visible = 0 ;
      edtavMtodes_Jsonclick = "" ;
      lblLbldescuento2_Visible = 1 ;
      edtavAcmvoipdes_Jsonclick = "" ;
      edtavAcmvoipdto_Jsonclick = "" ;
      cmbavTipodes.setJsonclick( "" );
      lblTarget_Visible = 1 ;
      lblPdf_Visible = 1 ;
      edtavValcomnoc_Jsonclick = "" ;
      edtavValcomnoc_Enabled = 1 ;
      lblMon8_Visible = 1 ;
      lblButtonrec_Visible = 1 ;
      lblButtonoc_Visible = 1 ;
      edtavTotal_ext_Jsonclick = "" ;
      edtavTotal_ext_Enabled = 1 ;
      edtavIva_ext_Jsonclick = "" ;
      edtavIva_ext_Enabled = 1 ;
      edtavSubtotal_ext_Jsonclick = "" ;
      edtavSubtotal_ext_Enabled = 1 ;
      edtavTotal_oc_Jsonclick = "" ;
      edtavTotal_oc_Enabled = 1 ;
      edtavIva_oc_Jsonclick = "" ;
      edtavIva_oc_Enabled = 1 ;
      edtavSubtotal_oc_Jsonclick = "" ;
      edtavSubtotal_oc_Enabled = 1 ;
      edtavAcmvoitcmb_Jsonclick = "" ;
      lblMon1_Visible = 1 ;
      edtavCntivaprc_Jsonclick = "" ;
      edtavCntivaprc_Enabled = 1 ;
      dynavCntivaid.setJsonclick( "" );
      edtavCnciasmon_Jsonclick = "" ;
      cmbavCncmnmid.setJsonclick( "" );
      edtavCntpgodias_Jsonclick = "" ;
      dynavCntpgoid.setJsonclick( "" );
      cmbavInalmnid.setJsonclick( "" );
      edtavCncdirnom_Jsonclick = "" ;
      edtavCncdirnom_Enabled = 1 ;
      edtavCnusergpo_Jsonclick = "" ;
      edtavValcomdoc_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCantidadret_Enabled = 1 ;
      edtavValcomprid_Enabled = 1 ;
      edtavSubtotal_Enabled = 1 ;
      edtavPreunit_Enabled = 1 ;
      edtavValcomumt_Enabled = 1 ;
      edtavCantidadfact_Enabled = 1 ;
      edtavValcomqto_Enabled = 1 ;
      edtavInproddsc_Enabled = 1 ;
      edtavValcomrlin_Enabled = 1 ;
      edtavValcomrndoc_Enabled = 1 ;
      edtavValcomlin_Enabled = 1 ;
      subGrid1_Header = "" ;
      edtavCantidadret_Visible = -1 ;
      edtavCantidadfact_Title = "Cantidad Recibida" ;
      subGrid1_Class = "KDSResponsiveTable" ;
      edtavName_Jsonclick = "" ;
      lblTextblock1_Visible = 1 ;
      edtavCnciasrfc_Jsonclick = "" ;
      edtavCncdirrfc_Jsonclick = "" ;
      lblTextblock5_Visible = 1 ;
      edtavUuid_Jsonclick = "" ;
      edtavAcmroifdoc_Jsonclick = "" ;
      edtavFolio_Jsonclick = "" ;
      edtavSerie_Jsonclick = "" ;
      subSfl_3_Allowcollapsing = (byte)(0) ;
      subSfl_3_Allowselection = (byte)(0) ;
      edtavValcomblob_Enabled = 1 ;
      edtavValcomfeca_Enabled = 1 ;
      edtavValcomtipar_Enabled = 1 ;
      edtavCnuserdsc_Enabled = 1 ;
      edtavValcomnma_Enabled = 1 ;
      edtavEliminar_Enabled = 1 ;
      edtavValcomida_Enabled = 1 ;
      subSfl_3_Header = "" ;
      subSfl_3_Class = "dataTable" ;
      Mensaje_Title = "Title" ;
      chkavIncdes.setEnabled( 1 );
      lblMon8_Caption = "Orden de Compra" ;
      cmbavCncmnmid.setEnabled( 1 );
      edtavValcomnoc_Visible = 1 ;
      dynavCntpgoid.setEnabled( 1 );
      dynavCntivaid.setEnabled( 1 );
      edtavAcmvoitcmb_Enabled = 1 ;
      edtavMtodes_Enabled = 1 ;
      lblButtonrec_Caption = "ButtonRec" ;
      lblButtonoc_Caption = "ButtonOC" ;
      lblCss_Caption = "CSS" ;
      lblPdf_Caption = "PDF" ;
      lblTarget_Caption = "TARGET" ;
      lblTxtregresar_Caption = "Regresar" ;
      divTab2_Class = "Section" ;
      divTab1_Class = "Section" ;
      edtavAcmvoitcmb_Visible = 1 ;
      edtavMtodes_Visible = 1 ;
      edtavAcmvoipdes_Enabled = 1 ;
      edtavAcmvoipdto_Enabled = 1 ;
      cmbavTipodes.setEnabled( 1 );
      edtavAcmvoipdes_Visible = 1 ;
      edtavAcmvoipdto_Visible = 1 ;
      edtavCnciasmon_Visible = 1 ;
      lblTxt_Caption = "txt" ;
      edtavCntivaprc_Visible = 1 ;
      tblTbladjarch_Visible = 1 ;
      lblTxtvalidar_Caption = "Validar Factura" ;
      lblSeg_Caption = "Registro Factura/Nota para generar Orden de Compra" ;
      edtavCnusergpo_Visible = 1 ;
      edtavName_Visible = 1 ;
      edtavCncdirrfc_Enabled = 1 ;
      edtavCnciasrfc_Enabled = 1 ;
      subSfl_3_Width = 480 ;
      subSfl_3_Linesfont = "font-family:Arial;font-size:8pt;" ;
      subSfl_3_Titlefont = "font-family:Arial;font-size:8pt;font-weight:bold;" ;
      subSfl_3_Backcolorstyle = (byte)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Fileupload1_Autoupload = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "" );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavInalmnid.setName( "vINALMNID" );
      cmbavInalmnid.setWebtags( "" );
      if ( cmbavInalmnid.getItemCount() > 0 )
      {
         AV154INALMNID = cmbavInalmnid.getValidValue(AV154INALMNID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154INALMNID", AV154INALMNID);
      }
      dynavCntpgoid.setName( "vCNTPGOID" );
      dynavCntpgoid.setWebtags( "" );
      cmbavCncmnmid.setName( "vCNCMNMID" );
      cmbavCncmnmid.setWebtags( "" );
      if ( cmbavCncmnmid.getItemCount() > 0 )
      {
         AV32CNCMNMID = cmbavCncmnmid.getValidValue(AV32CNCMNMID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CNCMNMID", AV32CNCMNMID);
      }
      dynavCntivaid.setName( "vCNTIVAID" );
      dynavCntivaid.setWebtags( "" );
      chkavIncdes.setName( "vINCDES" );
      chkavIncdes.setWebtags( "" );
      chkavIncdes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavIncdes.getInternalname(), "TitleCaption", chkavIncdes.getCaption(), true);
      chkavIncdes.setCheckedValue( "N" );
      cmbavTipodes.setName( "vTIPODES" );
      cmbavTipodes.setWebtags( "" );
      cmbavTipodes.addItem("M", "Monto", (short)(0));
      cmbavTipodes.addItem("P", "Porcentaje", (short)(0));
      if ( cmbavTipodes.getItemCount() > 0 )
      {
         AV108tipoDes = cmbavTipodes.getValidValue(AV108tipoDes) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108tipoDes", AV108tipoDes);
      }
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e263RE2',iparms:[{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'edtavCantidadret_Visible',ctrl:'vCANTIDADRET',prop:'Visible'},{av:'edtavCantidadfact_Title',ctrl:'vCANTIDADFACT',prop:'Title'},{av:'AV22valcomlin',fld:'vVALCOMLIN',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV27valcomprid',fld:'vVALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV19valcomqto',fld:'vVALCOMQTO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV20inproddsc',fld:'vINPRODDSC',pic:''},{av:'edtavPreunit_Enabled',ctrl:'vPREUNIT',prop:'Enabled'},{av:'edtavCantidadfact_Enabled',ctrl:'vCANTIDADFACT',prop:'Enabled'},{av:'AV25preunit',fld:'vPREUNIT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV24cantidadfact',fld:'vCANTIDADFACT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV26subtotal',fld:'vSUBTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV29VALCOMRTDOC',fld:'vVALCOMRTDOC',pic:''},{av:'AV21valcomrndoc',fld:'vVALCOMRNDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV23VALCOMRLIN',fld:'vVALCOMRLIN',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV102CantidadRet',fld:'vCANTIDADRET',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VACMVOITCMB.CONTROLVALUECHANGED","{handler:'e113RE2',iparms:[{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VACMVOITCMB.CONTROLVALUECHANGED",",oparms:[{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VCNCMNMID.CLICK","{handler:'e123RE2',iparms:[{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VCNCMNMID.CLICK",",oparms:[{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'edtavAcmvoitcmb_Visible',ctrl:'vACMVOITCMB',prop:'Visible'},{av:'lblMon1_Visible',ctrl:'MON1',prop:'Visible'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VCANTIDADFACT.CONTROLVALUECHANGED","{handler:'e273RE2',iparms:[{av:'AV25preunit',fld:'vPREUNIT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV24cantidadfact',fld:'vCANTIDADFACT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV22valcomlin',fld:'vVALCOMLIN',pic:'ZZZZZZZZZ9',hsh:true},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VCANTIDADFACT.CONTROLVALUECHANGED",",oparms:[{av:'AV26subtotal',fld:'vSUBTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VPREUNIT.CONTROLVALUECHANGED","{handler:'e283RE2',iparms:[{av:'AV25preunit',fld:'vPREUNIT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV24cantidadfact',fld:'vCANTIDADFACT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV22valcomlin',fld:'vVALCOMLIN',pic:'ZZZZZZZZZ9',hsh:true},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VPREUNIT.CONTROLVALUECHANGED",",oparms:[{av:'AV26subtotal',fld:'vSUBTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'GENERAR OC'","{handler:'e133RE2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',grid:145,pic:''},{av:'nRC_GXsfl_145',ctrl:'GRID1',grid:145,prop:'GridRC'},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV129serie',fld:'vSERIE',pic:''},{av:'AV130folio',fld:'vFOLIO',pic:''},{av:'cmbavInalmnid'},{av:'AV154INALMNID',fld:'vINALMNID',pic:''},{av:'AV128ACMROIFDOC',fld:'vACMROIFDOC',pic:''},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV114ACMVOIPDESF',fld:'vACMVOIPDESF',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV24cantidadfact',fld:'vCANTIDADFACT',grid:145,pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV25preunit',fld:'vPREUNIT',grid:145,pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV13CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'AV21valcomrndoc',fld:'vVALCOMRNDOC',grid:145,pic:'ZZZZZZZZZ9',hsh:true},{av:'AV29VALCOMRTDOC',fld:'vVALCOMRTDOC',pic:''},{av:'AV23VALCOMRLIN',fld:'vVALCOMRLIN',grid:145,pic:'ZZZZZZZZZ9',hsh:true},{av:'AV22valcomlin',fld:'vVALCOMLIN',grid:145,pic:'ZZZZZZZZZ9',hsh:true},{av:'AV19valcomqto',fld:'vVALCOMQTO',grid:145,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99',hsh:true},{av:'AV127ACMROIOBST',fld:'vACMROIOBST',pic:''},{av:'AV219CNTPGODIAS',fld:'vCNTPGODIAS',pic:'ZZZ9'},{av:'AV223CNCDIRESTIMP',fld:'vCNCDIRESTIMP',pic:''},{av:'AV140ACMROING',fld:'vACMROING',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV141ACMROINM',fld:'vACMROINM',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV142sdtRec',fld:'vSDTREC',pic:''},{av:'AV222PMMnFacXML',fld:'vPMMNFACXML',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''},{av:'A199CNCDIRRFC',fld:'CNCDIRRFC',pic:''},{av:'A15643VALCOMPRY',fld:'VALCOMPRY',pic:''},{av:'A15647VALCOMMON',fld:'VALCOMMON',pic:''},{av:'A15648VALCOMEST',fld:'VALCOMEST',pic:''},{av:'A2882CNCDIRESTIMP',fld:'CNCDIRESTIMP',pic:''},{av:'A15971VALCOMTCAM',fld:'VALCOMTCAM',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A15972VALCOMNOC',fld:'VALCOMNOC',pic:'ZZZZZZZZZ9'},{av:'A15973VALCOMALME',fld:'VALCOMALME',pic:''},{av:'A15974VALCOMTIVA',fld:'VALCOMTIVA',pic:''},{av:'A15975VALCOMCPGO',fld:'VALCOMCPGO',pic:''},{av:'A16310VALCOMINCDTO',fld:'VALCOMINCDTO',pic:''},{av:'A16311VALCOMTIPDTO',fld:'VALCOMTIPDTO',pic:''},{av:'A16314VALCOMPORDTOF',fld:'VALCOMPORDTOF',pic:'Z,ZZ9.99'},{av:'A16315VALCOMMTODTOF',fld:'VALCOMMTODTOF',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A16312VALCOMPORDTON',fld:'VALCOMPORDTON',pic:'Z,ZZ9.99'},{av:'A16313VALCOMMTODTON',fld:'VALCOMMTODTON',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A822ACMROINDOC',fld:'ACMROINDOC',pic:'ZZZZZZZZZ9'},{av:'AV121ACMROINDOC',fld:'vACMROINDOC',pic:'ZZZZZZZZZ9'},{av:'A821ACMROITDOC',fld:'ACMROITDOC',pic:''},{av:'A826ACMROIQT',fld:'ACMROIQT',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A827ACMROINP',fld:'ACMROINP',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'A824ACMROILIN',fld:'ACMROILIN',pic:'ZZ9.999'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A2875EstructImpId',fld:'ESTRUCTIMPID',pic:''},{av:'AV225EstructImpId',fld:'vESTRUCTIMPID',pic:''},{av:'A2876EstructImpDsc',fld:'ESTRUCTIMPDSC',pic:''},{av:'A3366EstructImpTip',fld:'ESTRUCTIMPTIP',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A17225VALCOMRUT',fld:'VALCOMRUT',pic:''},{av:'AV145PMTipoDoc',fld:'vPMTIPODOC',pic:''},{av:'AV146PMNumDoc',fld:'vPMNUMDOC',pic:'ZZZZZZZZZ9'},{av:'AV164PMProvid',fld:'vPMPROVID',pic:'ZZZZZZZZZ9'},{av:'AV77BLOB',fld:'vBLOB',pic:''},{av:'AV167VALCOMRUT',fld:'vVALCOMRUT',pic:''},{av:'AV173string',fld:'vSTRING',pic:''},{av:'AV257Pgmname',fld:'vPGMNAME',pic:''},{av:'AV165XMLDOCUUID',fld:'vXMLDOCUUID',pic:''},{av:'A909PMUuid',fld:'PMUUID',pic:''},{av:'A862PMNumDoc',fld:'PMNUMDOC',pic:'ZZZZZZZZZ9'},{av:'A861PMTipoDoc',fld:'PMTIPODOC',pic:''},{av:'AV152avanza',fld:'vAVANZA',pic:'ZZZ9'},{av:'AV149cadena',fld:'vCADENA',pic:''},{av:'AV170busc',fld:'vBUSC',pic:''},{av:'AV169xml',fld:'vXML',pic:''},{av:'AV200PMEmpresa',fld:'vPMEMPRESA',pic:'ZZZZZZZZZ9'},{av:'A14CNCIASRFC',fld:'CNCIASRFC',pic:''},{av:'AV172XMLDOCFOL',fld:'vXMLDOCFOL',pic:''},{av:'AV171XMLDOCSER',fld:'vXMLDOCSER',pic:''},{av:'AV178XMLDOCFFAC',fld:'vXMLDOCFFAC',pic:''},{av:'AV191XMLDOCSCFD',fld:'vXMLDOCSCFD',pic:''},{av:'AV193XMLDOCSSAT',fld:'vXMLDOCSSAT',pic:''},{av:'AV192XMLDOCNCER',fld:'vXMLDOCNCER',pic:''},{av:'AV180XMLDOCRFCR',fld:'vXMLDOCRFCR',pic:''},{av:'AV183XMLDOCRFCE',fld:'vXMLDOCRFCE',pic:''},{av:'AV184XMLDOCNME',fld:'vXMLDOCNME',pic:''},{av:'AV181XMLDOCNMR',fld:'vXMLDOCNMR',pic:''},{av:'AV187XMLDOCTOT',fld:'vXMLDOCTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV189XMLDOCSUB',fld:'vXMLDOCSUB',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV190XMLDOCIVA',fld:'vXMLDOCIVA',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV214archivo',fld:'vARCHIVO',pic:''},{av:'AV215TIPO',fld:'vTIPO',pic:''},{av:'AV203XMLDOCLIN',fld:'vXMLDOCLIN',pic:'ZZZZZZZZZ9'},{av:'AV204XMLDOCPROD',fld:'vXMLDOCPROD',pic:''},{av:'AV205XMLDOCQTY',fld:'vXMLDOCQTY',pic:'ZZZZZZZZZZZ9.99'},{av:'AV206XMLDOCPRE',fld:'vXMLDOCPRE',pic:'ZZZZZZZZZZZ9.9999'},{av:'AV207XMLDOCIMP',fld:'vXMLDOCIMP',pic:'ZZZZZZZZZZZ9.9999'},{av:'AV208XMLDOCRET',fld:'vXMLDOCRET',pic:''},{av:'AV194XMLDOCDESC',fld:'vXMLDOCDESC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV209PMPDFDOC',fld:'vPMPDFDOC',pic:'ZZZZZZZZZ9'},{av:'AV216valini',fld:'vVALINI',pic:'ZZZZZZZZZ9'},{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'GENERAR OC'",",oparms:[{av:'AV152avanza',fld:'vAVANZA',pic:'ZZZ9'},{av:'AV114ACMVOIPDESF',fld:'vACMVOIPDESF',pic:'ZZZZZZZZZZZZZ9.99'},{av:'lblTxt_Caption',ctrl:'TXT',prop:'Caption'},{av:'AV121ACMROINDOC',fld:'vACMROINDOC',pic:'ZZZZZZZZZ9'},{av:'AV225EstructImpId',fld:'vESTRUCTIMPID',pic:''},{av:'AV146PMNumDoc',fld:'vPMNUMDOC',pic:'ZZZZZZZZZ9'},{av:'AV145PMTipoDoc',fld:'vPMTIPODOC',pic:''},{av:'AV149cadena',fld:'vCADENA',pic:''},{av:'AV141ACMROINM',fld:'vACMROINM',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV86MENSAJE',fld:'vMENSAJE',pic:''},{av:'AV13CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'AV8cncdirnom',fld:'vCNCDIRNOM',pic:''},{av:'AV151CNCDIRRFC',fld:'vCNCDIRRFC',pic:''},{av:'AV14VALCOMPRY',fld:'vVALCOMPRY',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV223CNCDIRESTIMP',fld:'vCNCDIRESTIMP',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'edtavAcmvoitcmb_Enabled',ctrl:'vACMVOITCMB',prop:'Enabled'},{av:'AV96VALCOMNOC',fld:'vVALCOMNOC',pic:'ZZZZZZZZZ9'},{av:'cmbavInalmnid'},{av:'AV154INALMNID',fld:'vINALMNID',pic:''},{av:'edtavAcmvoipdto_Enabled',ctrl:'vACMVOIPDTO',prop:'Enabled'},{av:'edtavAcmvoipdes_Enabled',ctrl:'vACMVOIPDES',prop:'Enabled'},{av:'cmbavCncmnmid'},{av:'lblButtonrec_Visible',ctrl:'BUTTONREC',prop:'Visible'},{av:'lblMon8_Caption',ctrl:'MON8',prop:'Caption'},{av:'chkavIncdes.getEnabled()',ctrl:'vINCDES',prop:'Enabled'},{av:'cmbavTipodes'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'edtavAcmvoipdto_Visible',ctrl:'vACMVOIPDTO',prop:'Visible'},{av:'edtavAcmvoipdes_Visible',ctrl:'vACMVOIPDES',prop:'Visible'},{av:'edtavMtodes_Visible',ctrl:'vMTODES',prop:'Visible'},{av:'lblLbldescuento2_Visible',ctrl:'LBLDESCUENTO2',prop:'Visible'},{av:'lblMon8_Visible',ctrl:'MON8',prop:'Visible'},{av:'edtavValcomnoc_Visible',ctrl:'vVALCOMNOC',prop:'Visible'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'lblButtonoc_Visible',ctrl:'BUTTONOC',prop:'Visible'},{av:'lblPdf_Visible',ctrl:'PDF',prop:'Visible'},{av:'lblTarget_Visible',ctrl:'TARGET',prop:'Visible'},{av:'AV219CNTPGODIAS',fld:'vCNTPGODIAS',pic:'ZZZ9'},{av:'AV142sdtRec',fld:'vSDTREC',pic:''},{av:'AV140ACMROING',fld:'vACMROING',pic:'Z,ZZZ,ZZZ,ZZ9.9999'},{av:'AV77BLOB',fld:'vBLOB',pic:''},{av:'AV78NAME',fld:'vNAME',pic:''},{av:'AV167VALCOMRUT',fld:'vVALCOMRUT',pic:''},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV169xml',fld:'vXML',pic:''},{av:'AV170busc',fld:'vBUSC',pic:''},{av:'AV171XMLDOCSER',fld:'vXMLDOCSER',pic:''},{av:'AV172XMLDOCFOL',fld:'vXMLDOCFOL',pic:''},{av:'AV178XMLDOCFFAC',fld:'vXMLDOCFFAC',pic:''},{av:'AV180XMLDOCRFCR',fld:'vXMLDOCRFCR',pic:''},{av:'AV181XMLDOCNMR',fld:'vXMLDOCNMR',pic:''},{av:'AV183XMLDOCRFCE',fld:'vXMLDOCRFCE',pic:''},{av:'AV184XMLDOCNME',fld:'vXMLDOCNME',pic:''},{av:'AV187XMLDOCTOT',fld:'vXMLDOCTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV165XMLDOCUUID',fld:'vXMLDOCUUID',pic:''},{av:'AV189XMLDOCSUB',fld:'vXMLDOCSUB',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV190XMLDOCIVA',fld:'vXMLDOCIVA',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV191XMLDOCSCFD',fld:'vXMLDOCSCFD',pic:''},{av:'AV192XMLDOCNCER',fld:'vXMLDOCNCER',pic:''},{av:'AV193XMLDOCSSAT',fld:'vXMLDOCSSAT',pic:''},{av:'AV194XMLDOCDESC',fld:'vXMLDOCDESC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.9999'},{av:'AV173string',fld:'vSTRING',pic:''},{av:'AV208XMLDOCRET',fld:'vXMLDOCRET',pic:''},{av:'AV150CNCIASRFC',fld:'vCNCIASRFC',pic:''},{av:'AV207XMLDOCIMP',fld:'vXMLDOCIMP',pic:'ZZZZZZZZZZZ9.9999'},{av:'AV206XMLDOCPRE',fld:'vXMLDOCPRE',pic:'ZZZZZZZZZZZ9.9999'},{av:'AV205XMLDOCQTY',fld:'vXMLDOCQTY',pic:'ZZZZZZZZZZZ9.99'},{av:'AV204XMLDOCPROD',fld:'vXMLDOCPROD',pic:''},{av:'AV203XMLDOCLIN',fld:'vXMLDOCLIN',pic:'ZZZZZZZZZ9'},{av:'AV215TIPO',fld:'vTIPO',pic:''},{av:'AV214archivo',fld:'vARCHIVO',pic:''},{av:'AV216valini',fld:'vVALINI',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'SUBIR ARCHIVO'","{handler:'e143RE2',iparms:[{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV75UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV78NAME',fld:'vNAME',pic:''},{av:'AV86MENSAJE',fld:'vMENSAJE',pic:''},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'SUBIR ARCHIVO'",",oparms:[{av:'AV77BLOB',fld:'vBLOB',pic:''},{av:'AV78NAME',fld:'vNAME',pic:''},{av:'AV75UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV86MENSAJE',fld:'vMENSAJE',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("SFL_3.LOAD","{handler:'e293RE12',iparms:[{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("SFL_3.LOAD",",oparms:[{av:'AV85valcomida',fld:'vVALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'AV82valcomnma',fld:'vVALCOMNMA',pic:''},{av:'AV81valcomfeca',fld:'vVALCOMFECA',pic:''},{av:'AV79VALCOMBLOB',fld:'vVALCOMBLOB',pic:''},{av:'AV83valcomtipar',fld:'vVALCOMTIPAR',pic:''},{av:'AV84cnuserdsc',fld:'vCNUSERDSC',pic:''},{av:'AV68Eliminar',fld:'vELIMINAR',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'ELIMINAR DOC'","{handler:'e303RE2',iparms:[{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV85valcomida',fld:'vVALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'AV79VALCOMBLOB',fld:'vVALCOMBLOB',pic:''},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'ELIMINAR DOC'",",oparms:[{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'REGRESAR'","{handler:'e153RE2',iparms:[{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'REGRESAR'",",oparms:[{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VCNTIVAID.CLICK","{handler:'e163RE2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VCNTIVAID.CLICK",",oparms:[{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VCNCDIRNOM.CONTROLVALUECHANGED","{handler:'e173RE2',iparms:[{av:'AV8cncdirnom',fld:'vCNCDIRNOM',pic:''},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''},{av:'A533CNCDIRFSP',fld:'CNCDIRFSP',pic:'99/99/9999 99:99:99'},{av:'A507CNCDIRFBA',fld:'CNCDIRFBA',pic:'99/99/9999 99:99:99'},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A199CNCDIRRFC',fld:'CNCDIRRFC',pic:''},{av:'A2882CNCDIRESTIMP',fld:'CNCDIRESTIMP',pic:''},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VCNCDIRNOM.CONTROLVALUECHANGED",",oparms:[{av:'AV223CNCDIRESTIMP',fld:'vCNCDIRESTIMP',pic:''},{av:'AV13CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'AV8cncdirnom',fld:'vCNCDIRNOM',pic:''},{av:'AV151CNCDIRRFC',fld:'vCNCDIRRFC',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'MOSTRAR PDF'","{handler:'e313RE1',iparms:[{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV96VALCOMNOC',fld:'vVALCOMNOC',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'MOSTRAR PDF'",",oparms:[{av:'lblTxt_Caption',ctrl:'TXT',prop:'Caption'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'ABRE OC'","{handler:'e183RE2',iparms:[{av:'AV14VALCOMPRY',fld:'vVALCOMPRY',pic:''},{av:'AV96VALCOMNOC',fld:'vVALCOMNOC',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'ABRE OC'",",oparms:[{av:'lblTxt_Caption',ctrl:'TXT',prop:'Caption'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'RECEPCION'","{handler:'e193RE2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV96VALCOMNOC',fld:'vVALCOMNOC',pic:'ZZZZZZZZZ9'},{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'RECEPCION'",",oparms:[{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VINCDES.CLICK","{handler:'e203RE2',iparms:[{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VINCDES.CLICK",",oparms:[{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'edtavAcmvoipdto_Enabled',ctrl:'vACMVOIPDTO',prop:'Enabled'},{av:'edtavAcmvoipdes_Enabled',ctrl:'vACMVOIPDES',prop:'Enabled'},{av:'edtavMtodes_Visible',ctrl:'vMTODES',prop:'Visible'},{av:'lblLbldescuento2_Visible',ctrl:'LBLDESCUENTO2',prop:'Visible'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'edtavAcmvoipdto_Visible',ctrl:'vACMVOIPDTO',prop:'Visible'},{av:'edtavAcmvoipdes_Visible',ctrl:'vACMVOIPDES',prop:'Visible'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VTIPODES.ISVALID","{handler:'e213RE2',iparms:[{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VTIPODES.ISVALID",",oparms:[{av:'edtavAcmvoipdto_Enabled',ctrl:'vACMVOIPDTO',prop:'Enabled'},{av:'edtavAcmvoipdto_Visible',ctrl:'vACMVOIPDTO',prop:'Visible'},{av:'edtavAcmvoipdes_Enabled',ctrl:'vACMVOIPDES',prop:'Enabled'},{av:'edtavAcmvoipdes_Visible',ctrl:'vACMVOIPDES',prop:'Visible'},{av:'edtavMtodes_Visible',ctrl:'vMTODES',prop:'Visible'},{av:'lblLbldescuento2_Visible',ctrl:'LBLDESCUENTO2',prop:'Visible'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VACMVOIPDTO.CONTROLVALUECHANGED","{handler:'e223RE2',iparms:[{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VACMVOIPDTO.CONTROLVALUECHANGED",",oparms:[{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("VACMVOIPDES.CONTROLVALUECHANGED","{handler:'e233RE2',iparms:[{av:'A458CNTIVAID',fld:'CNTIVAID',pic:''},{av:'A993CNTIVAPRC',fld:'CNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'cmbavCncmnmid'},{av:'AV32CNCMNMID',fld:'vCNCMNMID',pic:''},{av:'AV18cnciasmon',fld:'vCNCIASMON',pic:''},{av:'AV9ACMVOITCMB',fld:'vACMVOITCMB',pic:'ZZZZZZZZZ9.9999'},{av:'AV107incDes',fld:'vINCDES',pic:''},{av:'cmbavTipodes'},{av:'AV108tipoDes',fld:'vTIPODES',pic:''},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("VACMVOIPDES.CONTROLVALUECHANGED",",oparms:[{av:'AV12CNTIVAPRC',fld:'vCNTIVAPRC',pic:'ZZZZZ9.9999'},{av:'AV30subtotal_oc',fld:'vSUBTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV91subtotal_ext',fld:'vSUBTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV92iva_ext',fld:'vIVA_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV93total_ext',fld:'vTOTAL_EXT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV33iva_oc',fld:'vIVA_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV31total_oc',fld:'vTOTAL_OC',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV109ACMVOIPDTO',fld:'vACMVOIPDTO',pic:'Z,ZZ9.99'},{av:'AV110ACMVOIPDES',fld:'vACMVOIPDES',pic:'ZZZZZZZZZZZZZ9.99'},{av:'AV120MTODES',fld:'vMTODES',pic:'ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
      setEventMetadata("'VALIDAR'","{handler:'e243RE2',iparms:[{av:'SFL_3_nFirstRecordOnPage'},{av:'SFL_3_nEOF'},{av:'A15965VALCOMIDA',fld:'VALCOMIDA',pic:'ZZZZZZZZZ9'},{av:'A5939CNCIASID',fld:'CNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV16CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9',hsh:true},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV17CNTDOCID',fld:'vCNTDOCID',pic:'',hsh:true},{av:'A15642VALCOMDOC',fld:'VALCOMDOC',pic:'ZZZZZZZZZ9'},{av:'AV10VALCOMDOC',fld:'vVALCOMDOC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A15966VALCOMNMA',fld:'VALCOMNMA',pic:''},{av:'A15970VALCOMFECA',fld:'VALCOMFECA',pic:''},{av:'A15967VALCOMBLOB',fld:'VALCOMBLOB',pic:''},{av:'A15968VALCOMTIPAR',fld:'VALCOMTIPAR',pic:''},{av:'A15969VALCOMUSRA',fld:'VALCOMUSRA',pic:''},{av:'AV80CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV123MostrarComplemento',fld:'vMOSTRARCOMPLEMENTO',pic:'',hsh:true},{av:'AV125ACMROITDOC',fld:'vACMROITDOC',pic:'',hsh:true},{av:'AV124omitirc',fld:'vOMITIRC',pic:'',hsh:true},{av:'AV156ValidarxWS',fld:'vVALIDARXWS',pic:'',hsh:true},{av:'AV129serie',fld:'vSERIE',pic:''},{av:'AV130folio',fld:'vFOLIO',pic:''},{av:'AV128ACMROIFDOC',fld:'vACMROIFDOC',pic:''},{av:'AV218UUID',fld:'vUUID',pic:''},{av:'AV151CNCDIRRFC',fld:'vCNCDIRRFC',pic:''},{av:'AV150CNCIASRFC',fld:'vCNCIASRFC',pic:''},{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV28VALCOMUMT',fld:'vVALCOMUMT',pic:''},{av:'AV95VALCOMEST',fld:'vVALCOMEST',pic:''},{av:'AV117CNUSERGPO',fld:'vCNUSERGPO',pic:'ZZZ9'},{av:'A15650VALCOMLIN',fld:'VALCOMLIN',pic:'ZZZZZZZZZ9'},{av:'A15651VALCOMPRID',fld:'VALCOMPRID',pic:'ZZZZZZZZZ9'},{av:'A15652VALCOMUMT',fld:'VALCOMUMT',pic:''},{av:'A15653VALCOMQTO',fld:'VALCOMQTO',pic:'ZZZZZZZZZ9.999999'},{av:'A15654VALCOMPRE',fld:'VALCOMPRE',pic:'ZZZZZZZ9.999999'},{av:'A15964VALCOMQTOC',fld:'VALCOMQTOC',pic:'ZZZZZZZZZZZ9.99'},{av:'A15665VALCOMRTDOC',fld:'VALCOMRTDOC',pic:''},{av:'A15666VALCOMRNDOC',fld:'VALCOMRNDOC',pic:'ZZZZZZZZZ9'},{av:'A15667VALCOMRLIN',fld:'VALCOMRLIN',pic:'ZZZZZZZZZ9'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]");
      setEventMetadata("'VALIDAR'",",oparms:[{av:'AV78NAME',fld:'vNAME',pic:''},{av:'AV77BLOB',fld:'vBLOB',pic:''},{av:'AV222PMMnFacXML',fld:'vPMMNFACXML',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'dynavCntpgoid'},{av:'AV6CNTPGOID',fld:'vCNTPGOID',pic:''},{av:'dynavCntivaid'},{av:'AV11CNTIVAID',fld:'vCNTIVAID',pic:''}]}");
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
      wcpOAV17CNTDOCID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A194CNCDIRNOM = "" ;
      AV28VALCOMUMT = "" ;
      AV95VALCOMEST = "" ;
      A20CNTDOCID = "" ;
      A15652VALCOMUMT = "" ;
      A15653VALCOMQTO = DecimalUtil.ZERO ;
      A15654VALCOMPRE = DecimalUtil.ZERO ;
      A15964VALCOMQTOC = DecimalUtil.ZERO ;
      A15665VALCOMRTDOC = "" ;
      AV6CNTPGOID = "" ;
      AV11CNTIVAID = "" ;
      AV80CNUSERID = "" ;
      AV123MostrarComplemento = "" ;
      AV125ACMROITDOC = "" ;
      AV124omitirc = "" ;
      AV156ValidarxWS = "" ;
      GXKey = "" ;
      A15966VALCOMNMA = "" ;
      A15970VALCOMFECA = GXutil.nullDate() ;
      A15967VALCOMBLOB = "" ;
      A15968VALCOMTIPAR = "" ;
      A15969VALCOMUSRA = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV75UploadedFiles = new GXBaseCollection<com.kdsproyectos.SdtFileUploadData>(com.kdsproyectos.SdtFileUploadData.class, "FileUploadData", "KDSProyectos", remoteHandle);
      A458CNTIVAID = "" ;
      A993CNTIVAPRC = DecimalUtil.ZERO ;
      AV114ACMVOIPDESF = DecimalUtil.ZERO ;
      AV29VALCOMRTDOC = "" ;
      AV223CNCDIRESTIMP = "" ;
      AV140ACMROING = DecimalUtil.ZERO ;
      AV141ACMROINM = DecimalUtil.ZERO ;
      AV142sdtRec = new GXBaseCollection<com.kdsproyectos.SdtSDTRec_SDTRecItem>(com.kdsproyectos.SdtSDTRec_SDTRecItem.class, "SDTRecItem", "KDSProyectos", remoteHandle);
      AV222PMMnFacXML = DecimalUtil.ZERO ;
      A199CNCDIRRFC = "" ;
      A15643VALCOMPRY = "" ;
      A15647VALCOMMON = "" ;
      A15648VALCOMEST = "" ;
      A2882CNCDIRESTIMP = "" ;
      A15971VALCOMTCAM = DecimalUtil.ZERO ;
      A15973VALCOMALME = "" ;
      A15974VALCOMTIVA = "" ;
      A15975VALCOMCPGO = "" ;
      A16310VALCOMINCDTO = "" ;
      A16311VALCOMTIPDTO = "" ;
      A16314VALCOMPORDTOF = DecimalUtil.ZERO ;
      A16315VALCOMMTODTOF = DecimalUtil.ZERO ;
      A16312VALCOMPORDTON = DecimalUtil.ZERO ;
      A16313VALCOMMTODTON = DecimalUtil.ZERO ;
      A821ACMROITDOC = "" ;
      A826ACMROIQT = DecimalUtil.ZERO ;
      A827ACMROINP = DecimalUtil.ZERO ;
      A824ACMROILIN = DecimalUtil.ZERO ;
      A2875EstructImpId = "" ;
      AV225EstructImpId = "" ;
      A2876EstructImpDsc = "" ;
      A3366EstructImpTip = "" ;
      A17225VALCOMRUT = "" ;
      AV145PMTipoDoc = "" ;
      AV77BLOB = "" ;
      AV167VALCOMRUT = "" ;
      AV173string = "" ;
      AV257Pgmname = "" ;
      AV165XMLDOCUUID = "" ;
      A909PMUuid = "" ;
      A861PMTipoDoc = "" ;
      AV149cadena = "" ;
      AV170busc = "" ;
      AV169xml = "" ;
      A14CNCIASRFC = "" ;
      AV172XMLDOCFOL = "" ;
      AV171XMLDOCSER = "" ;
      AV178XMLDOCFFAC = GXutil.nullDate() ;
      AV191XMLDOCSCFD = "" ;
      AV193XMLDOCSSAT = "" ;
      AV192XMLDOCNCER = "" ;
      AV180XMLDOCRFCR = "" ;
      AV183XMLDOCRFCE = "" ;
      AV184XMLDOCNME = "" ;
      AV181XMLDOCNMR = "" ;
      AV187XMLDOCTOT = DecimalUtil.ZERO ;
      AV189XMLDOCSUB = DecimalUtil.ZERO ;
      AV190XMLDOCIVA = DecimalUtil.ZERO ;
      AV214archivo = "" ;
      AV215TIPO = "" ;
      AV204XMLDOCPROD = "" ;
      AV205XMLDOCQTY = DecimalUtil.ZERO ;
      AV206XMLDOCPRE = DecimalUtil.ZERO ;
      AV207XMLDOCIMP = DecimalUtil.ZERO ;
      AV208XMLDOCRET = "" ;
      AV194XMLDOCDESC = DecimalUtil.ZERO ;
      AV86MENSAJE = "" ;
      A533CNCDIRFSP = GXutil.resetTime( GXutil.nullDate() );
      A507CNCDIRFBA = GXutil.resetTime( GXutil.nullDate() );
      AV14VALCOMPRY = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      Sfl_3Container = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20inproddsc = "" ;
      AV19valcomqto = DecimalUtil.ZERO ;
      AV24cantidadfact = DecimalUtil.ZERO ;
      AV25preunit = DecimalUtil.ZERO ;
      AV26subtotal = DecimalUtil.ZERO ;
      AV102CantidadRet = DecimalUtil.ZERO ;
      AV68Eliminar = "" ;
      AV82valcomnma = "" ;
      AV84cnuserdsc = "" ;
      AV83valcomtipar = "" ;
      AV81valcomfeca = GXutil.nullDate() ;
      AV79VALCOMBLOB = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l194CNCDIRNOM = "" ;
      H03RE2_A194CNCDIRNOM = new String[] {""} ;
      H03RE2_n194CNCDIRNOM = new boolean[] {false} ;
      H03RE3_A462CNTPGOID = new String[] {""} ;
      H03RE3_n462CNTPGOID = new boolean[] {false} ;
      H03RE3_A2323CNTPGODSC = new String[] {""} ;
      H03RE3_n2323CNTPGODSC = new boolean[] {false} ;
      H03RE3_A8637CNTPGOHAB = new boolean[] {false} ;
      H03RE3_n8637CNTPGOHAB = new boolean[] {false} ;
      H03RE4_A458CNTIVAID = new String[] {""} ;
      H03RE4_n458CNTIVAID = new boolean[] {false} ;
      H03RE4_A992CNTIVADSC = new String[] {""} ;
      H03RE4_n992CNTIVADSC = new boolean[] {false} ;
      AV154INALMNID = "" ;
      AV32CNCMNMID = "" ;
      AV108tipoDes = "" ;
      AV8cncdirnom = "" ;
      AV18cnciasmon = "" ;
      AV12CNTIVAPRC = DecimalUtil.ZERO ;
      AV9ACMVOITCMB = DecimalUtil.ZERO ;
      AV107incDes = "" ;
      AV109ACMVOIPDTO = DecimalUtil.ZERO ;
      AV110ACMVOIPDES = DecimalUtil.ZERO ;
      AV120MTODES = DecimalUtil.ZERO ;
      AV30subtotal_oc = DecimalUtil.ZERO ;
      AV33iva_oc = DecimalUtil.ZERO ;
      AV31total_oc = DecimalUtil.ZERO ;
      AV91subtotal_ext = DecimalUtil.ZERO ;
      AV92iva_ext = DecimalUtil.ZERO ;
      AV93total_ext = DecimalUtil.ZERO ;
      AV129serie = "" ;
      AV130folio = "" ;
      AV128ACMROIFDOC = GXutil.nullDate() ;
      AV218UUID = "" ;
      AV127ACMROIOBST = "" ;
      AV151CNCDIRRFC = "" ;
      AV150CNCIASRFC = "" ;
      AV78NAME = "" ;
      AV87WebSession = httpContext.getWebSession();
      GXv_int5 = new byte [1] ;
      GXt_char1 = "" ;
      H03RE5_A50CNCMNMID = new String[] {""} ;
      H03RE5_A207CNCMNMDSC = new String[] {""} ;
      H03RE5_n207CNCMNMDSC = new boolean[] {false} ;
      A50CNCMNMID = "" ;
      A207CNCMNMDSC = "" ;
      AV155INALMNID1er = "" ;
      H03RE6_A10644INALMNENCID = new long[1] ;
      H03RE6_A10645INALMNENCUSR = new String[] {""} ;
      H03RE6_n10645INALMNENCUSR = new boolean[] {false} ;
      H03RE6_A337INALMNDSC = new String[] {""} ;
      H03RE6_n337INALMNDSC = new boolean[] {false} ;
      H03RE6_A249INALMNID = new String[] {""} ;
      A10645INALMNENCUSR = "" ;
      A337INALMNDSC = "" ;
      A249INALMNID = "" ;
      H03RE7_A15642VALCOMDOC = new long[1] ;
      H03RE7_A20CNTDOCID = new String[] {""} ;
      H03RE7_A5939CNCIASID = new long[1] ;
      H03RE7_A15650VALCOMLIN = new long[1] ;
      H03RE7_A15651VALCOMPRID = new long[1] ;
      H03RE7_n15651VALCOMPRID = new boolean[] {false} ;
      H03RE7_A15652VALCOMUMT = new String[] {""} ;
      H03RE7_n15652VALCOMUMT = new boolean[] {false} ;
      H03RE7_A15653VALCOMQTO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE7_n15653VALCOMQTO = new boolean[] {false} ;
      H03RE7_A15654VALCOMPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE7_n15654VALCOMPRE = new boolean[] {false} ;
      H03RE7_A15964VALCOMQTOC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE7_n15964VALCOMQTOC = new boolean[] {false} ;
      H03RE7_A15665VALCOMRTDOC = new String[] {""} ;
      H03RE7_n15665VALCOMRTDOC = new boolean[] {false} ;
      H03RE7_A15666VALCOMRNDOC = new long[1] ;
      H03RE7_n15666VALCOMRNDOC = new boolean[] {false} ;
      H03RE7_A15667VALCOMRLIN = new long[1] ;
      H03RE7_n15667VALCOMRLIN = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV233AINALMNID = "" ;
      H03RE8_A15650VALCOMLIN = new long[1] ;
      H03RE8_A46CNCDIRID = new long[1] ;
      H03RE8_n46CNCDIRID = new boolean[] {false} ;
      H03RE8_A462CNTPGOID = new String[] {""} ;
      H03RE8_n462CNTPGOID = new boolean[] {false} ;
      H03RE8_A507CNCDIRFBA = new java.util.Date[] {GXutil.nullDate()} ;
      H03RE8_n507CNCDIRFBA = new boolean[] {false} ;
      H03RE8_A533CNCDIRFSP = new java.util.Date[] {GXutil.nullDate()} ;
      H03RE8_n533CNCDIRFSP = new boolean[] {false} ;
      H03RE8_A8637CNTPGOHAB = new boolean[] {false} ;
      H03RE8_n8637CNTPGOHAB = new boolean[] {false} ;
      H03RE8_A15642VALCOMDOC = new long[1] ;
      H03RE8_A20CNTDOCID = new String[] {""} ;
      H03RE8_A5939CNCIASID = new long[1] ;
      H03RE8_A15665VALCOMRTDOC = new String[] {""} ;
      H03RE8_n15665VALCOMRTDOC = new boolean[] {false} ;
      H03RE8_A15666VALCOMRNDOC = new long[1] ;
      H03RE8_n15666VALCOMRNDOC = new boolean[] {false} ;
      A462CNTPGOID = "" ;
      AV231AVALCOMRTDOC = "" ;
      H03RE9_A267ACRCOILIN = new int[1] ;
      H03RE9_A266ACRCOIDOC = new long[1] ;
      H03RE9_A20CNTDOCID = new String[] {""} ;
      H03RE9_A5939CNCIASID = new long[1] ;
      H03RE9_A323ACRCOIALM = new String[] {""} ;
      H03RE9_n323ACRCOIALM = new boolean[] {false} ;
      A323ACRCOIALM = "" ;
      AV126ACMROIREF = "" ;
      H03RE10_A15965VALCOMIDA = new long[1] ;
      H03RE10_A15642VALCOMDOC = new long[1] ;
      H03RE10_A20CNTDOCID = new String[] {""} ;
      H03RE10_A5939CNCIASID = new long[1] ;
      AV101SUBOC = DecimalUtil.ZERO ;
      AV113ACMVOIPDTOF = DecimalUtil.ZERO ;
      AV115ACMVOIPDTO_G = DecimalUtil.ZERO ;
      AV116ACMVOIPDES_G = DecimalUtil.ZERO ;
      AV35LINEA = DecimalUtil.ZERO ;
      AV230GENEROOC = "" ;
      AV36acmvoilin = DecimalUtil.ZERO ;
      AV100cantidadreg = DecimalUtil.ZERO ;
      AV220PMFechRev = GXutil.nullDate() ;
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV227timp = DecimalUtil.ZERO ;
      H03RE11_A458CNTIVAID = new String[] {""} ;
      H03RE11_n458CNTIVAID = new boolean[] {false} ;
      H03RE11_A2875EstructImpId = new String[] {""} ;
      H03RE11_A2876EstructImpDsc = new String[] {""} ;
      H03RE11_n2876EstructImpDsc = new boolean[] {false} ;
      H03RE11_A3366EstructImpTip = new String[] {""} ;
      H03RE11_n3366EstructImpTip = new boolean[] {false} ;
      AV226EstructImpDsc = "" ;
      AV224EstructImpTip = "" ;
      H03RE12_A2875EstructImpId = new String[] {""} ;
      H03RE12_A458CNTIVAID = new String[] {""} ;
      H03RE12_n458CNTIVAID = new boolean[] {false} ;
      H03RE12_A993CNTIVAPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE12_n993CNTIVAPRC = new boolean[] {false} ;
      AV228estcntivaid = "" ;
      AV229estCNTIVAPRC = DecimalUtil.ZERO ;
      H03RE13_A20CNTDOCID = new String[] {""} ;
      H03RE13_A823ACMROIDOC = new long[1] ;
      H03RE13_A821ACMROITDOC = new String[] {""} ;
      H03RE13_A822ACMROINDOC = new long[1] ;
      H03RE13_A5939CNCIASID = new long[1] ;
      H03RE13_A827ACMROINP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE13_n827ACMROINP = new boolean[] {false} ;
      H03RE13_A826ACMROIQT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE13_n826ACMROIQT = new boolean[] {false} ;
      H03RE13_A824ACMROILIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV144sdtRecitem = new com.kdsproyectos.SdtSDTRec_SDTRecItem(remoteHandle, context);
      AV76FileUploadData = new com.kdsproyectos.SdtFileUploadData(remoteHandle, context);
      H03RE14_A458CNTIVAID = new String[] {""} ;
      H03RE14_n458CNTIVAID = new boolean[] {false} ;
      H03RE14_A993CNTIVAPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE14_n993CNTIVAPRC = new boolean[] {false} ;
      H03RE15_A507CNCDIRFBA = new java.util.Date[] {GXutil.nullDate()} ;
      H03RE15_n507CNCDIRFBA = new boolean[] {false} ;
      H03RE15_A533CNCDIRFSP = new java.util.Date[] {GXutil.nullDate()} ;
      H03RE15_n533CNCDIRFSP = new boolean[] {false} ;
      H03RE15_A194CNCDIRNOM = new String[] {""} ;
      H03RE15_n194CNCDIRNOM = new boolean[] {false} ;
      H03RE15_A46CNCDIRID = new long[1] ;
      H03RE15_n46CNCDIRID = new boolean[] {false} ;
      H03RE15_A199CNCDIRRFC = new String[] {""} ;
      H03RE15_n199CNCDIRRFC = new boolean[] {false} ;
      H03RE15_A2882CNCDIRESTIMP = new String[] {""} ;
      H03RE15_n2882CNCDIRESTIMP = new boolean[] {false} ;
      H03RE16_A15642VALCOMDOC = new long[1] ;
      H03RE16_A20CNTDOCID = new String[] {""} ;
      H03RE16_A5939CNCIASID = new long[1] ;
      H03RE16_A46CNCDIRID = new long[1] ;
      H03RE16_n46CNCDIRID = new boolean[] {false} ;
      H03RE16_A194CNCDIRNOM = new String[] {""} ;
      H03RE16_n194CNCDIRNOM = new boolean[] {false} ;
      H03RE16_A199CNCDIRRFC = new String[] {""} ;
      H03RE16_n199CNCDIRRFC = new boolean[] {false} ;
      H03RE16_A2882CNCDIRESTIMP = new String[] {""} ;
      H03RE16_n2882CNCDIRESTIMP = new boolean[] {false} ;
      H03RE17_A15642VALCOMDOC = new long[1] ;
      H03RE17_A20CNTDOCID = new String[] {""} ;
      H03RE17_A5939CNCIASID = new long[1] ;
      H03RE17_A46CNCDIRID = new long[1] ;
      H03RE17_n46CNCDIRID = new boolean[] {false} ;
      H03RE17_A194CNCDIRNOM = new String[] {""} ;
      H03RE17_n194CNCDIRNOM = new boolean[] {false} ;
      H03RE17_A199CNCDIRRFC = new String[] {""} ;
      H03RE17_n199CNCDIRRFC = new boolean[] {false} ;
      H03RE18_A15650VALCOMLIN = new long[1] ;
      H03RE18_A15642VALCOMDOC = new long[1] ;
      H03RE18_A20CNTDOCID = new String[] {""} ;
      H03RE18_A5939CNCIASID = new long[1] ;
      H03RE18_A46CNCDIRID = new long[1] ;
      H03RE18_n46CNCDIRID = new boolean[] {false} ;
      H03RE18_A194CNCDIRNOM = new String[] {""} ;
      H03RE18_n194CNCDIRNOM = new boolean[] {false} ;
      H03RE18_A199CNCDIRRFC = new String[] {""} ;
      H03RE18_n199CNCDIRRFC = new boolean[] {false} ;
      H03RE18_A15643VALCOMPRY = new String[] {""} ;
      H03RE18_n15643VALCOMPRY = new boolean[] {false} ;
      H03RE18_A15647VALCOMMON = new String[] {""} ;
      H03RE18_n15647VALCOMMON = new boolean[] {false} ;
      H03RE18_A15648VALCOMEST = new String[] {""} ;
      H03RE18_n15648VALCOMEST = new boolean[] {false} ;
      H03RE18_A15652VALCOMUMT = new String[] {""} ;
      H03RE18_n15652VALCOMUMT = new boolean[] {false} ;
      H03RE18_A2882CNCDIRESTIMP = new String[] {""} ;
      H03RE18_n2882CNCDIRESTIMP = new boolean[] {false} ;
      H03RE18_A15971VALCOMTCAM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE18_n15971VALCOMTCAM = new boolean[] {false} ;
      H03RE18_A15972VALCOMNOC = new long[1] ;
      H03RE18_n15972VALCOMNOC = new boolean[] {false} ;
      H03RE18_A15973VALCOMALME = new String[] {""} ;
      H03RE18_n15973VALCOMALME = new boolean[] {false} ;
      H03RE18_A15974VALCOMTIVA = new String[] {""} ;
      H03RE18_n15974VALCOMTIVA = new boolean[] {false} ;
      H03RE18_A15975VALCOMCPGO = new String[] {""} ;
      H03RE18_n15975VALCOMCPGO = new boolean[] {false} ;
      H03RE18_A16310VALCOMINCDTO = new String[] {""} ;
      H03RE18_n16310VALCOMINCDTO = new boolean[] {false} ;
      H03RE18_A16311VALCOMTIPDTO = new String[] {""} ;
      H03RE18_n16311VALCOMTIPDTO = new boolean[] {false} ;
      H03RE18_A16314VALCOMPORDTOF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE18_n16314VALCOMPORDTOF = new boolean[] {false} ;
      H03RE18_A16315VALCOMMTODTOF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE18_n16315VALCOMMTODTOF = new boolean[] {false} ;
      H03RE18_A16312VALCOMPORDTON = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE18_n16312VALCOMPORDTON = new boolean[] {false} ;
      H03RE18_A16313VALCOMMTODTON = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE18_n16313VALCOMMTODTON = new boolean[] {false} ;
      H03RE18_A458CNTIVAID = new String[] {""} ;
      H03RE18_n458CNTIVAID = new boolean[] {false} ;
      AV15VALCOMMON = "" ;
      H03RE19_A458CNTIVAID = new String[] {""} ;
      H03RE19_n458CNTIVAID = new boolean[] {false} ;
      H03RE19_A993CNTIVAPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE19_n993CNTIVAPRC = new boolean[] {false} ;
      H03RE20_A15650VALCOMLIN = new long[1] ;
      H03RE20_A15642VALCOMDOC = new long[1] ;
      H03RE20_A20CNTDOCID = new String[] {""} ;
      H03RE20_A5939CNCIASID = new long[1] ;
      H03RE20_A15964VALCOMQTOC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE20_n15964VALCOMQTOC = new boolean[] {false} ;
      H03RE20_A15654VALCOMPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H03RE20_n15654VALCOMPRE = new boolean[] {false} ;
      AV106subtotal2 = DecimalUtil.ZERO ;
      AV103KDSSESSION = httpContext.getWebSession();
      AV105window = new com.genexus.webpanels.GXWindow();
      AV132rutaDocPDF = "" ;
      AV131rutaDocXML = "" ;
      GXv_int4 = new short [1] ;
      AV134MensajeVAL = "" ;
      AV221sdtRespMerca = new com.kdsproyectos.SdtsdtRespMerca(remoteHandle, context);
      GXv_SdtsdtRespMerca12 = new com.kdsproyectos.SdtsdtRespMerca [1] ;
      AV157FILE = new com.genexus.util.GXFile();
      H03RE21_A15965VALCOMIDA = new long[1] ;
      H03RE21_A15642VALCOMDOC = new long[1] ;
      H03RE21_A20CNTDOCID = new String[] {""} ;
      H03RE21_A5939CNCIASID = new long[1] ;
      H03RE21_A15968VALCOMTIPAR = new String[] {""} ;
      H03RE21_n15968VALCOMTIPAR = new boolean[] {false} ;
      H03RE21_A15967VALCOMBLOB = new String[] {""} ;
      H03RE21_n15967VALCOMBLOB = new boolean[] {false} ;
      H03RE21_A15966VALCOMNMA = new String[] {""} ;
      H03RE21_n15966VALCOMNMA = new boolean[] {false} ;
      H03RE21_A17225VALCOMRUT = new String[] {""} ;
      H03RE21_n17225VALCOMRUT = new boolean[] {false} ;
      A15967VALCOMBLOB_Filetype = "" ;
      AV166tiparch = "" ;
      AV168Xmlr = new com.genexus.xml.XMLReader();
      AV174D = "" ;
      AV175M = "" ;
      AV176Y = "" ;
      AV177Ret = "" ;
      AV179rr = "" ;
      AV182re = "" ;
      AV185XMLDOCMON = "" ;
      AV186total = "" ;
      AV188id = "" ;
      AV195Estatus = "" ;
      H03RE22_A860PMEmpresa = new long[1] ;
      H03RE22_A909PMUuid = new String[] {""} ;
      H03RE22_n909PMUuid = new boolean[] {false} ;
      H03RE22_A862PMNumDoc = new long[1] ;
      H03RE22_A861PMTipoDoc = new String[] {""} ;
      AV197PMTipodoc2 = "" ;
      AV198auxCadena = "" ;
      H03RE23_A5939CNCIASID = new long[1] ;
      H03RE23_A14CNCIASRFC = new String[] {""} ;
      H03RE23_n14CNCIASRFC = new boolean[] {false} ;
      AV260Trfc = DecimalUtil.ZERO ;
      AV261Buscid = DecimalUtil.ZERO ;
      AV262Val = DecimalUtil.ZERO ;
      GXv_char30 = new String [1] ;
      GXv_char26 = new String [1] ;
      GXv_char25 = new String [1] ;
      GXv_date13 = new java.util.Date [1] ;
      GXv_char24 = new String [1] ;
      GXv_char23 = new String [1] ;
      GXv_char20 = new String [1] ;
      GXv_char19 = new String [1] ;
      GXv_char18 = new String [1] ;
      GXv_char17 = new String [1] ;
      GXv_char16 = new String [1] ;
      GXv_decimal34 = new java.math.BigDecimal [1] ;
      GXv_decimal33 = new java.math.BigDecimal [1] ;
      GXv_decimal32 = new java.math.BigDecimal [1] ;
      GXv_char15 = new String [1] ;
      GXv_char14 = new String [1] ;
      GXv_char11 = new String [1] ;
      GXv_int3 = new long [1] ;
      GXv_char10 = new String [1] ;
      GXv_decimal29 = new java.math.BigDecimal [1] ;
      GXv_decimal28 = new java.math.BigDecimal [1] ;
      GXv_decimal27 = new java.math.BigDecimal [1] ;
      GXv_char7 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_decimal22 = new java.math.BigDecimal [1] ;
      GXv_decimal21 = new java.math.BigDecimal [1] ;
      GXv_decimal6 = new java.math.BigDecimal [1] ;
      H03RE24_A15642VALCOMDOC = new long[1] ;
      H03RE24_A20CNTDOCID = new String[] {""} ;
      H03RE24_A5939CNCIASID = new long[1] ;
      H03RE24_A15968VALCOMTIPAR = new String[] {""} ;
      H03RE24_n15968VALCOMTIPAR = new boolean[] {false} ;
      H03RE24_A15966VALCOMNMA = new String[] {""} ;
      H03RE24_n15966VALCOMNMA = new boolean[] {false} ;
      H03RE24_A15970VALCOMFECA = new java.util.Date[] {GXutil.nullDate()} ;
      H03RE24_n15970VALCOMFECA = new boolean[] {false} ;
      H03RE24_A15967VALCOMBLOB = new String[] {""} ;
      H03RE24_n15967VALCOMBLOB = new boolean[] {false} ;
      H03RE24_A15969VALCOMUSRA = new String[] {""} ;
      H03RE24_n15969VALCOMUSRA = new boolean[] {false} ;
      H03RE24_A15965VALCOMIDA = new long[1] ;
      GXv_char31 = new String [1] ;
      Sfl_3Row = new com.genexus.webpanels.GXWebRow();
      ucMensaje = new com.genexus.webpanels.GXUserControl();
      ucKdsstylesdatatables1 = new com.genexus.webpanels.GXUserControl();
      subSfl_3_Linesclass = "" ;
      Sfl_3Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock57_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxtvalidar_Jsonclick = "" ;
      ucFileupload1 = new com.genexus.webpanels.GXUserControl();
      lblTextblock5_Jsonclick = "" ;
      lblTxtlimpiarfileupload_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock2_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblMon1_Jsonclick = "" ;
      lblMon2_Jsonclick = "" ;
      lblMon3_Jsonclick = "" ;
      lblMon4_Jsonclick = "" ;
      lblMon5_Jsonclick = "" ;
      lblMon6_Jsonclick = "" ;
      lblMon7_Jsonclick = "" ;
      lblButtonoc_Jsonclick = "" ;
      lblButtonrec_Jsonclick = "" ;
      lblMon8_Jsonclick = "" ;
      lblPdf_Jsonclick = "" ;
      lblTarget_Jsonclick = "" ;
      lblLbincdes_Jsonclick = "" ;
      lblLbltipodescuento_Jsonclick = "" ;
      lblLbldescuento_Jsonclick = "" ;
      lblLbldescuento2_Jsonclick = "" ;
      lblCss_Jsonclick = "" ;
      lblTxtregresar_Jsonclick = "" ;
      lblSeg_Jsonclick = "" ;
      lblHtml2_Jsonclick = "" ;
      lblTxt_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.prompgenoc__default(),
         new Object[] {
             new Object[] {
            H03RE2_A194CNCDIRNOM, H03RE2_n194CNCDIRNOM
            }
            , new Object[] {
            H03RE3_A462CNTPGOID, H03RE3_A2323CNTPGODSC, H03RE3_n2323CNTPGODSC, H03RE3_A8637CNTPGOHAB, H03RE3_n8637CNTPGOHAB
            }
            , new Object[] {
            H03RE4_A458CNTIVAID, H03RE4_A992CNTIVADSC, H03RE4_n992CNTIVADSC
            }
            , new Object[] {
            H03RE5_A50CNCMNMID, H03RE5_A207CNCMNMDSC, H03RE5_n207CNCMNMDSC
            }
            , new Object[] {
            H03RE6_A10644INALMNENCID, H03RE6_A10645INALMNENCUSR, H03RE6_n10645INALMNENCUSR, H03RE6_A337INALMNDSC, H03RE6_n337INALMNDSC, H03RE6_A249INALMNID
            }
            , new Object[] {
            H03RE7_A15642VALCOMDOC, H03RE7_A20CNTDOCID, H03RE7_A5939CNCIASID, H03RE7_A15650VALCOMLIN, H03RE7_A15651VALCOMPRID, H03RE7_n15651VALCOMPRID, H03RE7_A15652VALCOMUMT, H03RE7_n15652VALCOMUMT, H03RE7_A15653VALCOMQTO, H03RE7_n15653VALCOMQTO,
            H03RE7_A15654VALCOMPRE, H03RE7_n15654VALCOMPRE, H03RE7_A15964VALCOMQTOC, H03RE7_n15964VALCOMQTOC, H03RE7_A15665VALCOMRTDOC, H03RE7_n15665VALCOMRTDOC, H03RE7_A15666VALCOMRNDOC, H03RE7_n15666VALCOMRNDOC, H03RE7_A15667VALCOMRLIN, H03RE7_n15667VALCOMRLIN
            }
            , new Object[] {
            H03RE8_A15650VALCOMLIN, H03RE8_A46CNCDIRID, H03RE8_n46CNCDIRID, H03RE8_A462CNTPGOID, H03RE8_n462CNTPGOID, H03RE8_A507CNCDIRFBA, H03RE8_n507CNCDIRFBA, H03RE8_A533CNCDIRFSP, H03RE8_n533CNCDIRFSP, H03RE8_A8637CNTPGOHAB,
            H03RE8_n8637CNTPGOHAB, H03RE8_A15642VALCOMDOC, H03RE8_A20CNTDOCID, H03RE8_A5939CNCIASID, H03RE8_A15665VALCOMRTDOC, H03RE8_n15665VALCOMRTDOC, H03RE8_A15666VALCOMRNDOC, H03RE8_n15666VALCOMRNDOC
            }
            , new Object[] {
            H03RE9_A267ACRCOILIN, H03RE9_A266ACRCOIDOC, H03RE9_A20CNTDOCID, H03RE9_A5939CNCIASID, H03RE9_A323ACRCOIALM, H03RE9_n323ACRCOIALM
            }
            , new Object[] {
            H03RE10_A15965VALCOMIDA, H03RE10_A15642VALCOMDOC, H03RE10_A20CNTDOCID, H03RE10_A5939CNCIASID
            }
            , new Object[] {
            H03RE11_A458CNTIVAID, H03RE11_A2875EstructImpId, H03RE11_A2876EstructImpDsc, H03RE11_n2876EstructImpDsc, H03RE11_A3366EstructImpTip, H03RE11_n3366EstructImpTip
            }
            , new Object[] {
            H03RE12_A2875EstructImpId, H03RE12_A458CNTIVAID, H03RE12_A993CNTIVAPRC, H03RE12_n993CNTIVAPRC
            }
            , new Object[] {
            H03RE13_A20CNTDOCID, H03RE13_A823ACMROIDOC, H03RE13_A821ACMROITDOC, H03RE13_A822ACMROINDOC, H03RE13_A5939CNCIASID, H03RE13_A827ACMROINP, H03RE13_n827ACMROINP, H03RE13_A826ACMROIQT, H03RE13_n826ACMROIQT, H03RE13_A824ACMROILIN
            }
            , new Object[] {
            H03RE14_A458CNTIVAID, H03RE14_A993CNTIVAPRC, H03RE14_n993CNTIVAPRC
            }
            , new Object[] {
            H03RE15_A507CNCDIRFBA, H03RE15_n507CNCDIRFBA, H03RE15_A533CNCDIRFSP, H03RE15_n533CNCDIRFSP, H03RE15_A194CNCDIRNOM, H03RE15_n194CNCDIRNOM, H03RE15_A46CNCDIRID, H03RE15_A199CNCDIRRFC, H03RE15_n199CNCDIRRFC, H03RE15_A2882CNCDIRESTIMP,
            H03RE15_n2882CNCDIRESTIMP
            }
            , new Object[] {
            H03RE16_A15642VALCOMDOC, H03RE16_A20CNTDOCID, H03RE16_A5939CNCIASID, H03RE16_A46CNCDIRID, H03RE16_n46CNCDIRID, H03RE16_A194CNCDIRNOM, H03RE16_n194CNCDIRNOM, H03RE16_A199CNCDIRRFC, H03RE16_n199CNCDIRRFC, H03RE16_A2882CNCDIRESTIMP,
            H03RE16_n2882CNCDIRESTIMP
            }
            , new Object[] {
            H03RE17_A15642VALCOMDOC, H03RE17_A20CNTDOCID, H03RE17_A5939CNCIASID, H03RE17_A46CNCDIRID, H03RE17_n46CNCDIRID, H03RE17_A194CNCDIRNOM, H03RE17_n194CNCDIRNOM, H03RE17_A199CNCDIRRFC, H03RE17_n199CNCDIRRFC
            }
            , new Object[] {
            H03RE18_A15650VALCOMLIN, H03RE18_A15642VALCOMDOC, H03RE18_A20CNTDOCID, H03RE18_A5939CNCIASID, H03RE18_A46CNCDIRID, H03RE18_n46CNCDIRID, H03RE18_A194CNCDIRNOM, H03RE18_n194CNCDIRNOM, H03RE18_A199CNCDIRRFC, H03RE18_n199CNCDIRRFC,
            H03RE18_A15643VALCOMPRY, H03RE18_n15643VALCOMPRY, H03RE18_A15647VALCOMMON, H03RE18_n15647VALCOMMON, H03RE18_A15648VALCOMEST, H03RE18_n15648VALCOMEST, H03RE18_A15652VALCOMUMT, H03RE18_n15652VALCOMUMT, H03RE18_A2882CNCDIRESTIMP, H03RE18_n2882CNCDIRESTIMP,
            H03RE18_A15971VALCOMTCAM, H03RE18_n15971VALCOMTCAM, H03RE18_A15972VALCOMNOC, H03RE18_n15972VALCOMNOC, H03RE18_A15973VALCOMALME, H03RE18_n15973VALCOMALME, H03RE18_A15974VALCOMTIVA, H03RE18_n15974VALCOMTIVA, H03RE18_A15975VALCOMCPGO, H03RE18_n15975VALCOMCPGO,
            H03RE18_A16310VALCOMINCDTO, H03RE18_n16310VALCOMINCDTO, H03RE18_A16311VALCOMTIPDTO, H03RE18_n16311VALCOMTIPDTO, H03RE18_A16314VALCOMPORDTOF, H03RE18_n16314VALCOMPORDTOF, H03RE18_A16315VALCOMMTODTOF, H03RE18_n16315VALCOMMTODTOF, H03RE18_A16312VALCOMPORDTON, H03RE18_n16312VALCOMPORDTON,
            H03RE18_A16313VALCOMMTODTON, H03RE18_n16313VALCOMMTODTON, H03RE18_A458CNTIVAID, H03RE18_n458CNTIVAID
            }
            , new Object[] {
            H03RE19_A458CNTIVAID, H03RE19_A993CNTIVAPRC, H03RE19_n993CNTIVAPRC
            }
            , new Object[] {
            H03RE20_A15650VALCOMLIN, H03RE20_A15642VALCOMDOC, H03RE20_A20CNTDOCID, H03RE20_A5939CNCIASID, H03RE20_A15964VALCOMQTOC, H03RE20_n15964VALCOMQTOC, H03RE20_A15654VALCOMPRE, H03RE20_n15654VALCOMPRE
            }
            , new Object[] {
            H03RE21_A15965VALCOMIDA, H03RE21_A15642VALCOMDOC, H03RE21_A20CNTDOCID, H03RE21_A5939CNCIASID, H03RE21_A15968VALCOMTIPAR, H03RE21_n15968VALCOMTIPAR, H03RE21_A15967VALCOMBLOB, H03RE21_n15967VALCOMBLOB, H03RE21_A15966VALCOMNMA, H03RE21_n15966VALCOMNMA,
            H03RE21_A17225VALCOMRUT, H03RE21_n17225VALCOMRUT
            }
            , new Object[] {
            H03RE22_A860PMEmpresa, H03RE22_A909PMUuid, H03RE22_n909PMUuid, H03RE22_A862PMNumDoc, H03RE22_A861PMTipoDoc
            }
            , new Object[] {
            H03RE23_A5939CNCIASID, H03RE23_A14CNCIASRFC, H03RE23_n14CNCIASRFC
            }
            , new Object[] {
            H03RE24_A15642VALCOMDOC, H03RE24_A20CNTDOCID, H03RE24_A5939CNCIASID, H03RE24_A15968VALCOMTIPAR, H03RE24_n15968VALCOMTIPAR, H03RE24_A15966VALCOMNMA, H03RE24_n15966VALCOMNMA, H03RE24_A15970VALCOMFECA, H03RE24_n15970VALCOMFECA, H03RE24_A15967VALCOMBLOB,
            H03RE24_n15967VALCOMBLOB, H03RE24_A15969VALCOMUSRA, H03RE24_n15969VALCOMUSRA, H03RE24_A15965VALCOMIDA
            }
         }
      );
      AV257Pgmname = "prompgenoc" ;
      /* GeneXus formulas. */
      AV257Pgmname = "prompgenoc" ;
      Gx_err = (short)(0) ;
      edtavCntivaprc_Enabled = 0 ;
      edtavMtodes_Enabled = 0 ;
      edtavValcomnoc_Enabled = 0 ;
      edtavSubtotal_oc_Enabled = 0 ;
      edtavIva_oc_Enabled = 0 ;
      edtavTotal_oc_Enabled = 0 ;
      edtavSubtotal_ext_Enabled = 0 ;
      edtavIva_ext_Enabled = 0 ;
      edtavTotal_ext_Enabled = 0 ;
      edtavValcomlin_Enabled = 0 ;
      edtavValcomrndoc_Enabled = 0 ;
      edtavValcomrlin_Enabled = 0 ;
      edtavInproddsc_Enabled = 0 ;
      edtavValcomqto_Enabled = 0 ;
      edtavValcomumt_Enabled = 0 ;
      edtavSubtotal_Enabled = 0 ;
      edtavValcomprid_Enabled = 0 ;
      edtavCantidadret_Enabled = 0 ;
      edtavValcomida_Enabled = 0 ;
      edtavEliminar_Enabled = 0 ;
      edtavValcomnma_Enabled = 0 ;
      edtavCnuserdsc_Enabled = 0 ;
      edtavValcomtipar_Enabled = 0 ;
      edtavValcomfeca_Enabled = 0 ;
      edtavValcomblob_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subSfl_3_Backcolorstyle ;
   private byte GXv_int5[] ;
   private byte GRID1_nEOF ;
   private byte SFL_3_nEOF ;
   private byte AV250GXLvl616 ;
   private byte AV258GXLvl1087 ;
   private byte subSfl_3_Titlebackstyle ;
   private byte subSfl_3_Allowselection ;
   private byte subSfl_3_Allowhovering ;
   private byte subSfl_3_Allowcollapsing ;
   private byte subSfl_3_Collapsed ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid1_Backstyle ;
   private byte subSfl_3_Backstyle ;
   private short nRC_GXsfl_145 ;
   private short nGXsfl_145_idx=1 ;
   private short nRC_GXsfl_228 ;
   private short AV117CNUSERGPO ;
   private short nGXsfl_228_idx=1 ;
   private short AV152avanza ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV219CNTPGODIAS ;
   private short AV119haydoc ;
   private short nGXsfl_145_fel_idx=1 ;
   private short GXt_int9 ;
   private short AV133Respuesta ;
   private short GXv_int4[] ;
   private short AV199flag ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int subSfl_3_Islastpage ;
   private int edtavCntivaprc_Enabled ;
   private int edtavMtodes_Enabled ;
   private int edtavValcomnoc_Enabled ;
   private int edtavSubtotal_oc_Enabled ;
   private int edtavIva_oc_Enabled ;
   private int edtavTotal_oc_Enabled ;
   private int edtavSubtotal_ext_Enabled ;
   private int edtavIva_ext_Enabled ;
   private int edtavTotal_ext_Enabled ;
   private int edtavValcomlin_Enabled ;
   private int edtavValcomrndoc_Enabled ;
   private int edtavValcomrlin_Enabled ;
   private int edtavInproddsc_Enabled ;
   private int edtavValcomqto_Enabled ;
   private int edtavValcomumt_Enabled ;
   private int edtavSubtotal_Enabled ;
   private int edtavValcomprid_Enabled ;
   private int edtavCantidadret_Enabled ;
   private int edtavValcomida_Enabled ;
   private int edtavEliminar_Enabled ;
   private int edtavValcomnma_Enabled ;
   private int edtavCnuserdsc_Enabled ;
   private int edtavValcomtipar_Enabled ;
   private int edtavValcomfeca_Enabled ;
   private int edtavValcomblob_Enabled ;
   private int subSfl_3_Width ;
   private int edtavCnciasrfc_Enabled ;
   private int edtavCncdirrfc_Enabled ;
   private int lblTextblock1_Visible ;
   private int edtavName_Visible ;
   private int lblButtonrec_Visible ;
   private int edtavCnusergpo_Visible ;
   private int lblTextblock5_Visible ;
   private int tblTbladjarch_Visible ;
   private int edtavCntivaprc_Visible ;
   private int edtavCnciasmon_Visible ;
   private int edtavAcmvoipdto_Visible ;
   private int edtavAcmvoipdes_Visible ;
   private int edtavAcmvoipdto_Enabled ;
   private int edtavAcmvoipdes_Enabled ;
   private int edtavMtodes_Visible ;
   private int lblLbldescuento2_Visible ;
   private int edtavAcmvoitcmb_Visible ;
   private int lblMon1_Visible ;
   private int edtavCantidadret_Visible ;
   private int edtavPreunit_Enabled ;
   private int edtavCantidadfact_Enabled ;
   private int AV247GXV1 ;
   private int edtavAcmvoitcmb_Enabled ;
   private int lblMon8_Visible ;
   private int edtavValcomnoc_Visible ;
   private int lblButtonoc_Visible ;
   private int lblPdf_Visible ;
   private int lblTarget_Visible ;
   private int subSfl_3_Titlebackcolor ;
   private int subSfl_3_Allbackcolor ;
   private int subSfl_3_Selectedindex ;
   private int subSfl_3_Selectioncolor ;
   private int subSfl_3_Hoveringcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtavCncdirnom_Enabled ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavValcomlin_Visible ;
   private int edtavValcomrndoc_Visible ;
   private int edtavValcomrlin_Visible ;
   private int edtavInproddsc_Visible ;
   private int edtavValcomqto_Visible ;
   private int edtavCantidadfact_Visible ;
   private int edtavValcomumt_Visible ;
   private int edtavPreunit_Visible ;
   private int edtavSubtotal_Visible ;
   private int edtavValcomprid_Visible ;
   private int subSfl_3_Backcolor ;
   private int edtavValcomida_Visible ;
   private int edtavEliminar_Visible ;
   private int edtavValcomnma_Visible ;
   private int edtavCnuserdsc_Visible ;
   private int edtavValcomtipar_Visible ;
   private int edtavValcomfeca_Visible ;
   private long wcpOAV16CNCIASID ;
   private long wcpOAV10VALCOMDOC ;
   private long A5939CNCIASID ;
   private long AV16CNCIASID ;
   private long A15642VALCOMDOC ;
   private long AV10VALCOMDOC ;
   private long A15650VALCOMLIN ;
   private long A15651VALCOMPRID ;
   private long A15666VALCOMRNDOC ;
   private long A15667VALCOMRLIN ;
   private long A15965VALCOMIDA ;
   private long AV13CNCDIRID ;
   private long A46CNCDIRID ;
   private long A15972VALCOMNOC ;
   private long A822ACMROINDOC ;
   private long AV121ACMROINDOC ;
   private long AV146PMNumDoc ;
   private long AV164PMProvid ;
   private long A862PMNumDoc ;
   private long AV200PMEmpresa ;
   private long AV203XMLDOCLIN ;
   private long AV209PMPDFDOC ;
   private long AV216valini ;
   private long AV22valcomlin ;
   private long AV21valcomrndoc ;
   private long AV23VALCOMRLIN ;
   private long AV27valcomprid ;
   private long AV85valcomida ;
   private long GRID1_nCurrentRecord ;
   private long SFL_3_nCurrentRecord ;
   private long AV96VALCOMNOC ;
   private long AV232AVALCOMRNDOC ;
   private long A266ACRCOIDOC ;
   private long AV34ACMVOIDOC ;
   private long GRID1_nFirstRecordOnPage ;
   private long SFL_3_nFirstRecordOnPage ;
   private long AV163PDFDOCID ;
   private long AV196PMNumDoc2 ;
   private long AV210cont ;
   private long AV211vini ;
   private long AV212vfin ;
   private long AV213pos ;
   private long AV217valfin ;
   private long GXv_int3[] ;
   private java.math.BigDecimal A15653VALCOMQTO ;
   private java.math.BigDecimal A15654VALCOMPRE ;
   private java.math.BigDecimal A15964VALCOMQTOC ;
   private java.math.BigDecimal A993CNTIVAPRC ;
   private java.math.BigDecimal AV114ACMVOIPDESF ;
   private java.math.BigDecimal AV140ACMROING ;
   private java.math.BigDecimal AV141ACMROINM ;
   private java.math.BigDecimal AV222PMMnFacXML ;
   private java.math.BigDecimal A15971VALCOMTCAM ;
   private java.math.BigDecimal A16314VALCOMPORDTOF ;
   private java.math.BigDecimal A16315VALCOMMTODTOF ;
   private java.math.BigDecimal A16312VALCOMPORDTON ;
   private java.math.BigDecimal A16313VALCOMMTODTON ;
   private java.math.BigDecimal A826ACMROIQT ;
   private java.math.BigDecimal A827ACMROINP ;
   private java.math.BigDecimal A824ACMROILIN ;
   private java.math.BigDecimal AV187XMLDOCTOT ;
   private java.math.BigDecimal AV189XMLDOCSUB ;
   private java.math.BigDecimal AV190XMLDOCIVA ;
   private java.math.BigDecimal AV205XMLDOCQTY ;
   private java.math.BigDecimal AV206XMLDOCPRE ;
   private java.math.BigDecimal AV207XMLDOCIMP ;
   private java.math.BigDecimal AV194XMLDOCDESC ;
   private java.math.BigDecimal AV19valcomqto ;
   private java.math.BigDecimal AV24cantidadfact ;
   private java.math.BigDecimal AV25preunit ;
   private java.math.BigDecimal AV26subtotal ;
   private java.math.BigDecimal AV102CantidadRet ;
   private java.math.BigDecimal AV12CNTIVAPRC ;
   private java.math.BigDecimal AV9ACMVOITCMB ;
   private java.math.BigDecimal AV109ACMVOIPDTO ;
   private java.math.BigDecimal AV110ACMVOIPDES ;
   private java.math.BigDecimal AV120MTODES ;
   private java.math.BigDecimal AV30subtotal_oc ;
   private java.math.BigDecimal AV33iva_oc ;
   private java.math.BigDecimal AV31total_oc ;
   private java.math.BigDecimal AV91subtotal_ext ;
   private java.math.BigDecimal AV92iva_ext ;
   private java.math.BigDecimal AV93total_ext ;
   private java.math.BigDecimal AV101SUBOC ;
   private java.math.BigDecimal AV113ACMVOIPDTOF ;
   private java.math.BigDecimal AV115ACMVOIPDTO_G ;
   private java.math.BigDecimal AV116ACMVOIPDES_G ;
   private java.math.BigDecimal AV35LINEA ;
   private java.math.BigDecimal AV36acmvoilin ;
   private java.math.BigDecimal AV100cantidadreg ;
   private java.math.BigDecimal AV227timp ;
   private java.math.BigDecimal AV229estCNTIVAPRC ;
   private java.math.BigDecimal AV106subtotal2 ;
   private java.math.BigDecimal AV260Trfc ;
   private java.math.BigDecimal AV261Buscid ;
   private java.math.BigDecimal AV262Val ;
   private java.math.BigDecimal GXv_decimal34[] ;
   private java.math.BigDecimal GXv_decimal33[] ;
   private java.math.BigDecimal GXv_decimal32[] ;
   private java.math.BigDecimal GXv_decimal29[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String wcpOAV17CNTDOCID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A194CNCDIRNOM ;
   private String sGXsfl_145_idx="0001" ;
   private String AV28VALCOMUMT ;
   private String AV95VALCOMEST ;
   private String A20CNTDOCID ;
   private String AV17CNTDOCID ;
   private String A15652VALCOMUMT ;
   private String A15665VALCOMRTDOC ;
   private String AV6CNTPGOID ;
   private String AV11CNTIVAID ;
   private String AV80CNUSERID ;
   private String AV123MostrarComplemento ;
   private String AV125ACMROITDOC ;
   private String AV124omitirc ;
   private String AV156ValidarxWS ;
   private String GXKey ;
   private String sGXsfl_228_idx="0001" ;
   private String A15966VALCOMNMA ;
   private String A15968VALCOMTIPAR ;
   private String A15969VALCOMUSRA ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A458CNTIVAID ;
   private String AV29VALCOMRTDOC ;
   private String AV223CNCDIRESTIMP ;
   private String A199CNCDIRRFC ;
   private String A15643VALCOMPRY ;
   private String A15647VALCOMMON ;
   private String A15648VALCOMEST ;
   private String A2882CNCDIRESTIMP ;
   private String A15973VALCOMALME ;
   private String A15974VALCOMTIVA ;
   private String A15975VALCOMCPGO ;
   private String A16310VALCOMINCDTO ;
   private String A16311VALCOMTIPDTO ;
   private String A821ACMROITDOC ;
   private String A2875EstructImpId ;
   private String AV225EstructImpId ;
   private String A2876EstructImpDsc ;
   private String A3366EstructImpTip ;
   private String A17225VALCOMRUT ;
   private String AV145PMTipoDoc ;
   private String AV167VALCOMRUT ;
   private String AV173string ;
   private String AV257Pgmname ;
   private String AV165XMLDOCUUID ;
   private String A909PMUuid ;
   private String A861PMTipoDoc ;
   private String AV149cadena ;
   private String AV170busc ;
   private String A14CNCIASRFC ;
   private String AV172XMLDOCFOL ;
   private String AV171XMLDOCSER ;
   private String AV191XMLDOCSCFD ;
   private String AV193XMLDOCSSAT ;
   private String AV192XMLDOCNCER ;
   private String AV180XMLDOCRFCR ;
   private String AV183XMLDOCRFCE ;
   private String AV184XMLDOCNME ;
   private String AV181XMLDOCNMR ;
   private String AV214archivo ;
   private String AV215TIPO ;
   private String AV208XMLDOCRET ;
   private String AV14VALCOMPRY ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavValcomlin_Internalname ;
   private String edtavValcomrndoc_Internalname ;
   private String edtavValcomrlin_Internalname ;
   private String edtavInproddsc_Internalname ;
   private String edtavValcomqto_Internalname ;
   private String edtavCantidadfact_Internalname ;
   private String edtavValcomumt_Internalname ;
   private String edtavPreunit_Internalname ;
   private String edtavSubtotal_Internalname ;
   private String edtavValcomprid_Internalname ;
   private String edtavCantidadret_Internalname ;
   private String edtavValcomida_Internalname ;
   private String AV68Eliminar ;
   private String edtavEliminar_Internalname ;
   private String AV82valcomnma ;
   private String edtavValcomnma_Internalname ;
   private String AV84cnuserdsc ;
   private String edtavCnuserdsc_Internalname ;
   private String AV83valcomtipar ;
   private String edtavValcomtipar_Internalname ;
   private String edtavValcomfeca_Internalname ;
   private String edtavValcomblob_Internalname ;
   private String edtavCnusergpo_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l194CNCDIRNOM ;
   private String AV154INALMNID ;
   private String AV32CNCMNMID ;
   private String AV108tipoDes ;
   private String edtavCntivaprc_Internalname ;
   private String edtavMtodes_Internalname ;
   private String edtavValcomnoc_Internalname ;
   private String edtavSubtotal_oc_Internalname ;
   private String edtavIva_oc_Internalname ;
   private String edtavTotal_oc_Internalname ;
   private String edtavSubtotal_ext_Internalname ;
   private String edtavIva_ext_Internalname ;
   private String edtavTotal_ext_Internalname ;
   private String subSfl_3_Titlefont ;
   private String subSfl_3_Linesfont ;
   private String AV8cncdirnom ;
   private String edtavCncdirnom_Internalname ;
   private String edtavCntpgodias_Internalname ;
   private String AV18cnciasmon ;
   private String edtavCnciasmon_Internalname ;
   private String edtavAcmvoitcmb_Internalname ;
   private String AV107incDes ;
   private String edtavAcmvoipdto_Internalname ;
   private String edtavAcmvoipdes_Internalname ;
   private String AV129serie ;
   private String edtavSerie_Internalname ;
   private String AV130folio ;
   private String edtavFolio_Internalname ;
   private String edtavAcmroifdoc_Internalname ;
   private String AV218UUID ;
   private String edtavUuid_Internalname ;
   private String AV127ACMROIOBST ;
   private String edtavAcmroiobst_Internalname ;
   private String AV151CNCDIRRFC ;
   private String edtavCncdirrfc_Internalname ;
   private String AV150CNCIASRFC ;
   private String edtavCnciasrfc_Internalname ;
   private String AV78NAME ;
   private String edtavName_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblButtonrec_Internalname ;
   private String lblSeg_Caption ;
   private String lblSeg_Internalname ;
   private String lblTxtvalidar_Caption ;
   private String GXt_char1 ;
   private String lblTxtvalidar_Internalname ;
   private String lblTextblock5_Internalname ;
   private String tblTbladjarch_Internalname ;
   private String lblTxt_Caption ;
   private String lblTxt_Internalname ;
   private String A50CNCMNMID ;
   private String A207CNCMNMDSC ;
   private String lblLbldescuento2_Internalname ;
   private String AV155INALMNID1er ;
   private String A10645INALMNENCUSR ;
   private String A337INALMNDSC ;
   private String A249INALMNID ;
   private String lblMon1_Internalname ;
   private String divTab1_Class ;
   private String divTab1_Internalname ;
   private String divTab2_Class ;
   private String divTab2_Internalname ;
   private String lblTxtregresar_Caption ;
   private String lblTxtregresar_Internalname ;
   private String lblTarget_Caption ;
   private String lblTarget_Internalname ;
   private String lblPdf_Caption ;
   private String lblPdf_Internalname ;
   private String lblCss_Caption ;
   private String lblCss_Internalname ;
   private String lblButtonoc_Caption ;
   private String lblButtonoc_Internalname ;
   private String lblButtonrec_Caption ;
   private String edtavCantidadfact_Title ;
   private String AV233AINALMNID ;
   private String A462CNTPGOID ;
   private String AV231AVALCOMRTDOC ;
   private String A323ACRCOIALM ;
   private String AV126ACMROIREF ;
   private String AV230GENEROOC ;
   private String sGXsfl_145_fel_idx="0001" ;
   private String AV226EstructImpDsc ;
   private String AV224EstructImpTip ;
   private String AV228estcntivaid ;
   private String AV15VALCOMMON ;
   private String lblMon8_Internalname ;
   private String lblMon8_Caption ;
   private String AV132rutaDocPDF ;
   private String AV131rutaDocXML ;
   private String AV134MensajeVAL ;
   private String A15967VALCOMBLOB_Filetype ;
   private String AV166tiparch ;
   private String AV174D ;
   private String AV175M ;
   private String AV176Y ;
   private String AV177Ret ;
   private String AV179rr ;
   private String AV182re ;
   private String AV185XMLDOCMON ;
   private String AV186total ;
   private String AV188id ;
   private String AV195Estatus ;
   private String AV197PMTipodoc2 ;
   private String AV198auxCadena ;
   private String GXv_char30[] ;
   private String GXv_char26[] ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String GXv_char31[] ;
   private String tblTable1_Internalname ;
   private String Mensaje_Title ;
   private String Mensaje_Internalname ;
   private String Kdsstylesdatatables1_Internalname ;
   private String tblTable9_Internalname ;
   private String divSection5_Internalname ;
   private String subSfl_3_Internalname ;
   private String subSfl_3_Class ;
   private String subSfl_3_Linesclass ;
   private String subSfl_3_Header ;
   private String tblTable8_Internalname ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String TempTags ;
   private String edtavSerie_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtavFolio_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtavAcmroifdoc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtavUuid_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxtvalidar_Jsonclick ;
   private String Fileupload1_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTxtlimpiarfileupload_Internalname ;
   private String lblTxtlimpiarfileupload_Jsonclick ;
   private String tblTable5_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtavCncdirrfc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavCnciasrfc_Jsonclick ;
   private String lblTextblock1_Jsonclick ;
   private String edtavName_Jsonclick ;
   private String tblTable7_Internalname ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String tblTable3_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtavValcomdoc_Internalname ;
   private String edtavValcomdoc_Jsonclick ;
   private String edtavCnusergpo_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtavCncdirnom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtavCntpgodias_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtavCnciasmon_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtavCntivaprc_Jsonclick ;
   private String lblMon1_Jsonclick ;
   private String edtavAcmvoitcmb_Jsonclick ;
   private String lblMon2_Internalname ;
   private String lblMon2_Jsonclick ;
   private String edtavSubtotal_oc_Jsonclick ;
   private String lblMon3_Internalname ;
   private String lblMon3_Jsonclick ;
   private String edtavIva_oc_Jsonclick ;
   private String lblMon4_Internalname ;
   private String lblMon4_Jsonclick ;
   private String edtavTotal_oc_Jsonclick ;
   private String lblMon5_Internalname ;
   private String lblMon5_Jsonclick ;
   private String edtavSubtotal_ext_Jsonclick ;
   private String lblMon6_Internalname ;
   private String lblMon6_Jsonclick ;
   private String edtavIva_ext_Jsonclick ;
   private String lblMon7_Internalname ;
   private String lblMon7_Jsonclick ;
   private String edtavTotal_ext_Jsonclick ;
   private String lblButtonoc_Jsonclick ;
   private String lblButtonrec_Jsonclick ;
   private String tblTable4_Internalname ;
   private String lblMon8_Jsonclick ;
   private String edtavValcomnoc_Jsonclick ;
   private String lblPdf_Jsonclick ;
   private String lblTarget_Jsonclick ;
   private String tblTbldescuento_Internalname ;
   private String lblLbincdes_Internalname ;
   private String lblLbincdes_Jsonclick ;
   private String lblLbltipodescuento_Internalname ;
   private String lblLbltipodescuento_Jsonclick ;
   private String lblLbldescuento_Internalname ;
   private String lblLbldescuento_Jsonclick ;
   private String edtavAcmvoipdto_Jsonclick ;
   private String edtavAcmvoipdes_Jsonclick ;
   private String lblLbldescuento2_Jsonclick ;
   private String edtavMtodes_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblCss_Jsonclick ;
   private String tblEsqueleto_Internalname ;
   private String lblTxtregresar_Jsonclick ;
   private String lblSeg_Jsonclick ;
   private String lblHtml2_Internalname ;
   private String lblHtml2_Jsonclick ;
   private String lblTxt_Jsonclick ;
   private String ROClassString ;
   private String edtavValcomlin_Jsonclick ;
   private String edtavValcomrndoc_Jsonclick ;
   private String edtavValcomrlin_Jsonclick ;
   private String edtavInproddsc_Jsonclick ;
   private String edtavValcomqto_Jsonclick ;
   private String edtavCantidadfact_Jsonclick ;
   private String edtavValcomumt_Jsonclick ;
   private String edtavPreunit_Jsonclick ;
   private String edtavSubtotal_Jsonclick ;
   private String edtavValcomprid_Jsonclick ;
   private String edtavCantidadret_Jsonclick ;
   private String sGXsfl_228_fel_idx="0001" ;
   private String edtavValcomida_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private String edtavValcomnma_Jsonclick ;
   private String edtavCnuserdsc_Jsonclick ;
   private String edtavValcomtipar_Jsonclick ;
   private String edtavValcomfeca_Jsonclick ;
   private String edtavValcomblob_Filetype ;
   private String edtavValcomblob_Contenttype ;
   private String edtavValcomblob_Parameters ;
   private String edtavValcomblob_Jsonclick ;
   private java.util.Date A533CNCDIRFSP ;
   private java.util.Date A507CNCDIRFBA ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date A15970VALCOMFECA ;
   private java.util.Date AV178XMLDOCFFAC ;
   private java.util.Date AV81valcomfeca ;
   private java.util.Date AV128ACMROIFDOC ;
   private java.util.Date AV220PMFechRev ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean n194CNCDIRNOM ;
   private boolean n15651VALCOMPRID ;
   private boolean n15652VALCOMUMT ;
   private boolean n15653VALCOMQTO ;
   private boolean n15654VALCOMPRE ;
   private boolean n15964VALCOMQTOC ;
   private boolean n15665VALCOMRTDOC ;
   private boolean n15666VALCOMRNDOC ;
   private boolean n15667VALCOMRLIN ;
   private boolean n15966VALCOMNMA ;
   private boolean n15970VALCOMFECA ;
   private boolean n15967VALCOMBLOB ;
   private boolean n15968VALCOMTIPAR ;
   private boolean n15969VALCOMUSRA ;
   private boolean toggleJsOutput ;
   private boolean Fileupload1_Autoupload ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_228_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_145_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n207CNCMNMDSC ;
   private boolean n10645INALMNENCUSR ;
   private boolean n337INALMNDSC ;
   private boolean n46CNCDIRID ;
   private boolean n462CNTPGOID ;
   private boolean n507CNCDIRFBA ;
   private boolean n533CNCDIRFSP ;
   private boolean A8637CNTPGOHAB ;
   private boolean n8637CNTPGOHAB ;
   private boolean n323ACRCOIALM ;
   private boolean n2876EstructImpDsc ;
   private boolean n3366EstructImpTip ;
   private boolean n458CNTIVAID ;
   private boolean n993CNTIVAPRC ;
   private boolean n827ACMROINP ;
   private boolean n826ACMROIQT ;
   private boolean n199CNCDIRRFC ;
   private boolean n2882CNCDIRESTIMP ;
   private boolean n15643VALCOMPRY ;
   private boolean n15647VALCOMMON ;
   private boolean n15648VALCOMEST ;
   private boolean n15971VALCOMTCAM ;
   private boolean n15972VALCOMNOC ;
   private boolean n15973VALCOMALME ;
   private boolean n15974VALCOMTIVA ;
   private boolean n15975VALCOMCPGO ;
   private boolean n16310VALCOMINCDTO ;
   private boolean n16311VALCOMTIPDTO ;
   private boolean n16314VALCOMPORDTOF ;
   private boolean n16315VALCOMMTODTOF ;
   private boolean n16312VALCOMPORDTON ;
   private boolean n16313VALCOMMTODTON ;
   private boolean n17225VALCOMRUT ;
   private boolean n909PMUuid ;
   private boolean n14CNCIASRFC ;
   private String AV169xml ;
   private String AV204XMLDOCPROD ;
   private String AV86MENSAJE ;
   private String A15967VALCOMBLOB ;
   private String AV77BLOB ;
   private String AV79VALCOMBLOB ;
   private String AV20inproddsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Sfl_3Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Sfl_3Row ;
   private com.genexus.webpanels.GXWebColumn Sfl_3Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWindow AV105window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV87WebSession ;
   private com.genexus.webpanels.GXUserControl ucMensaje ;
   private com.genexus.webpanels.GXUserControl ucKdsstylesdatatables1 ;
   private com.genexus.webpanels.GXUserControl ucFileupload1 ;
   private com.genexus.util.GXFile AV157FILE ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private HTMLChoice cmbavInalmnid ;
   private HTMLChoice dynavCntpgoid ;
   private HTMLChoice cmbavCncmnmid ;
   private HTMLChoice dynavCntivaid ;
   private ICheckbox chkavIncdes ;
   private HTMLChoice cmbavTipodes ;
   private IDataStoreProvider pr_default ;
   private String[] H03RE2_A194CNCDIRNOM ;
   private boolean[] H03RE2_n194CNCDIRNOM ;
   private String[] H03RE3_A462CNTPGOID ;
   private boolean[] H03RE3_n462CNTPGOID ;
   private String[] H03RE3_A2323CNTPGODSC ;
   private boolean[] H03RE3_n2323CNTPGODSC ;
   private boolean[] H03RE3_A8637CNTPGOHAB ;
   private boolean[] H03RE3_n8637CNTPGOHAB ;
   private String[] H03RE4_A458CNTIVAID ;
   private boolean[] H03RE4_n458CNTIVAID ;
   private String[] H03RE4_A992CNTIVADSC ;
   private boolean[] H03RE4_n992CNTIVADSC ;
   private String[] H03RE5_A50CNCMNMID ;
   private String[] H03RE5_A207CNCMNMDSC ;
   private boolean[] H03RE5_n207CNCMNMDSC ;
   private long[] H03RE6_A10644INALMNENCID ;
   private String[] H03RE6_A10645INALMNENCUSR ;
   private boolean[] H03RE6_n10645INALMNENCUSR ;
   private String[] H03RE6_A337INALMNDSC ;
   private boolean[] H03RE6_n337INALMNDSC ;
   private String[] H03RE6_A249INALMNID ;
   private long[] H03RE7_A15642VALCOMDOC ;
   private String[] H03RE7_A20CNTDOCID ;
   private long[] H03RE7_A5939CNCIASID ;
   private long[] H03RE7_A15650VALCOMLIN ;
   private long[] H03RE7_A15651VALCOMPRID ;
   private boolean[] H03RE7_n15651VALCOMPRID ;
   private String[] H03RE7_A15652VALCOMUMT ;
   private boolean[] H03RE7_n15652VALCOMUMT ;
   private java.math.BigDecimal[] H03RE7_A15653VALCOMQTO ;
   private boolean[] H03RE7_n15653VALCOMQTO ;
   private java.math.BigDecimal[] H03RE7_A15654VALCOMPRE ;
   private boolean[] H03RE7_n15654VALCOMPRE ;
   private java.math.BigDecimal[] H03RE7_A15964VALCOMQTOC ;
   private boolean[] H03RE7_n15964VALCOMQTOC ;
   private String[] H03RE7_A15665VALCOMRTDOC ;
   private boolean[] H03RE7_n15665VALCOMRTDOC ;
   private long[] H03RE7_A15666VALCOMRNDOC ;
   private boolean[] H03RE7_n15666VALCOMRNDOC ;
   private long[] H03RE7_A15667VALCOMRLIN ;
   private boolean[] H03RE7_n15667VALCOMRLIN ;
   private long[] H03RE8_A15650VALCOMLIN ;
   private long[] H03RE8_A46CNCDIRID ;
   private boolean[] H03RE8_n46CNCDIRID ;
   private String[] H03RE8_A462CNTPGOID ;
   private boolean[] H03RE8_n462CNTPGOID ;
   private java.util.Date[] H03RE8_A507CNCDIRFBA ;
   private boolean[] H03RE8_n507CNCDIRFBA ;
   private java.util.Date[] H03RE8_A533CNCDIRFSP ;
   private boolean[] H03RE8_n533CNCDIRFSP ;
   private boolean[] H03RE8_A8637CNTPGOHAB ;
   private boolean[] H03RE8_n8637CNTPGOHAB ;
   private long[] H03RE8_A15642VALCOMDOC ;
   private String[] H03RE8_A20CNTDOCID ;
   private long[] H03RE8_A5939CNCIASID ;
   private String[] H03RE8_A15665VALCOMRTDOC ;
   private boolean[] H03RE8_n15665VALCOMRTDOC ;
   private long[] H03RE8_A15666VALCOMRNDOC ;
   private boolean[] H03RE8_n15666VALCOMRNDOC ;
   private int[] H03RE9_A267ACRCOILIN ;
   private long[] H03RE9_A266ACRCOIDOC ;
   private String[] H03RE9_A20CNTDOCID ;
   private long[] H03RE9_A5939CNCIASID ;
   private String[] H03RE9_A323ACRCOIALM ;
   private boolean[] H03RE9_n323ACRCOIALM ;
   private long[] H03RE10_A15965VALCOMIDA ;
   private long[] H03RE10_A15642VALCOMDOC ;
   private String[] H03RE10_A20CNTDOCID ;
   private long[] H03RE10_A5939CNCIASID ;
   private String[] H03RE11_A458CNTIVAID ;
   private boolean[] H03RE11_n458CNTIVAID ;
   private String[] H03RE11_A2875EstructImpId ;
   private String[] H03RE11_A2876EstructImpDsc ;
   private boolean[] H03RE11_n2876EstructImpDsc ;
   private String[] H03RE11_A3366EstructImpTip ;
   private boolean[] H03RE11_n3366EstructImpTip ;
   private String[] H03RE12_A2875EstructImpId ;
   private String[] H03RE12_A458CNTIVAID ;
   private boolean[] H03RE12_n458CNTIVAID ;
   private java.math.BigDecimal[] H03RE12_A993CNTIVAPRC ;
   private boolean[] H03RE12_n993CNTIVAPRC ;
   private String[] H03RE13_A20CNTDOCID ;
   private long[] H03RE13_A823ACMROIDOC ;
   private String[] H03RE13_A821ACMROITDOC ;
   private long[] H03RE13_A822ACMROINDOC ;
   private long[] H03RE13_A5939CNCIASID ;
   private java.math.BigDecimal[] H03RE13_A827ACMROINP ;
   private boolean[] H03RE13_n827ACMROINP ;
   private java.math.BigDecimal[] H03RE13_A826ACMROIQT ;
   private boolean[] H03RE13_n826ACMROIQT ;
   private java.math.BigDecimal[] H03RE13_A824ACMROILIN ;
   private String[] H03RE14_A458CNTIVAID ;
   private boolean[] H03RE14_n458CNTIVAID ;
   private java.math.BigDecimal[] H03RE14_A993CNTIVAPRC ;
   private boolean[] H03RE14_n993CNTIVAPRC ;
   private java.util.Date[] H03RE15_A507CNCDIRFBA ;
   private boolean[] H03RE15_n507CNCDIRFBA ;
   private java.util.Date[] H03RE15_A533CNCDIRFSP ;
   private boolean[] H03RE15_n533CNCDIRFSP ;
   private String[] H03RE15_A194CNCDIRNOM ;
   private boolean[] H03RE15_n194CNCDIRNOM ;
   private long[] H03RE15_A46CNCDIRID ;
   private boolean[] H03RE15_n46CNCDIRID ;
   private String[] H03RE15_A199CNCDIRRFC ;
   private boolean[] H03RE15_n199CNCDIRRFC ;
   private String[] H03RE15_A2882CNCDIRESTIMP ;
   private boolean[] H03RE15_n2882CNCDIRESTIMP ;
   private long[] H03RE16_A15642VALCOMDOC ;
   private String[] H03RE16_A20CNTDOCID ;
   private long[] H03RE16_A5939CNCIASID ;
   private long[] H03RE16_A46CNCDIRID ;
   private boolean[] H03RE16_n46CNCDIRID ;
   private String[] H03RE16_A194CNCDIRNOM ;
   private boolean[] H03RE16_n194CNCDIRNOM ;
   private String[] H03RE16_A199CNCDIRRFC ;
   private boolean[] H03RE16_n199CNCDIRRFC ;
   private String[] H03RE16_A2882CNCDIRESTIMP ;
   private boolean[] H03RE16_n2882CNCDIRESTIMP ;
   private long[] H03RE17_A15642VALCOMDOC ;
   private String[] H03RE17_A20CNTDOCID ;
   private long[] H03RE17_A5939CNCIASID ;
   private long[] H03RE17_A46CNCDIRID ;
   private boolean[] H03RE17_n46CNCDIRID ;
   private String[] H03RE17_A194CNCDIRNOM ;
   private boolean[] H03RE17_n194CNCDIRNOM ;
   private String[] H03RE17_A199CNCDIRRFC ;
   private boolean[] H03RE17_n199CNCDIRRFC ;
   private long[] H03RE18_A15650VALCOMLIN ;
   private long[] H03RE18_A15642VALCOMDOC ;
   private String[] H03RE18_A20CNTDOCID ;
   private long[] H03RE18_A5939CNCIASID ;
   private long[] H03RE18_A46CNCDIRID ;
   private boolean[] H03RE18_n46CNCDIRID ;
   private String[] H03RE18_A194CNCDIRNOM ;
   private boolean[] H03RE18_n194CNCDIRNOM ;
   private String[] H03RE18_A199CNCDIRRFC ;
   private boolean[] H03RE18_n199CNCDIRRFC ;
   private String[] H03RE18_A15643VALCOMPRY ;
   private boolean[] H03RE18_n15643VALCOMPRY ;
   private String[] H03RE18_A15647VALCOMMON ;
   private boolean[] H03RE18_n15647VALCOMMON ;
   private String[] H03RE18_A15648VALCOMEST ;
   private boolean[] H03RE18_n15648VALCOMEST ;
   private String[] H03RE18_A15652VALCOMUMT ;
   private boolean[] H03RE18_n15652VALCOMUMT ;
   private String[] H03RE18_A2882CNCDIRESTIMP ;
   private boolean[] H03RE18_n2882CNCDIRESTIMP ;
   private java.math.BigDecimal[] H03RE18_A15971VALCOMTCAM ;
   private boolean[] H03RE18_n15971VALCOMTCAM ;
   private long[] H03RE18_A15972VALCOMNOC ;
   private boolean[] H03RE18_n15972VALCOMNOC ;
   private String[] H03RE18_A15973VALCOMALME ;
   private boolean[] H03RE18_n15973VALCOMALME ;
   private String[] H03RE18_A15974VALCOMTIVA ;
   private boolean[] H03RE18_n15974VALCOMTIVA ;
   private String[] H03RE18_A15975VALCOMCPGO ;
   private boolean[] H03RE18_n15975VALCOMCPGO ;
   private String[] H03RE18_A16310VALCOMINCDTO ;
   private boolean[] H03RE18_n16310VALCOMINCDTO ;
   private String[] H03RE18_A16311VALCOMTIPDTO ;
   private boolean[] H03RE18_n16311VALCOMTIPDTO ;
   private java.math.BigDecimal[] H03RE18_A16314VALCOMPORDTOF ;
   private boolean[] H03RE18_n16314VALCOMPORDTOF ;
   private java.math.BigDecimal[] H03RE18_A16315VALCOMMTODTOF ;
   private boolean[] H03RE18_n16315VALCOMMTODTOF ;
   private java.math.BigDecimal[] H03RE18_A16312VALCOMPORDTON ;
   private boolean[] H03RE18_n16312VALCOMPORDTON ;
   private java.math.BigDecimal[] H03RE18_A16313VALCOMMTODTON ;
   private boolean[] H03RE18_n16313VALCOMMTODTON ;
   private String[] H03RE18_A458CNTIVAID ;
   private boolean[] H03RE18_n458CNTIVAID ;
   private String[] H03RE19_A458CNTIVAID ;
   private boolean[] H03RE19_n458CNTIVAID ;
   private java.math.BigDecimal[] H03RE19_A993CNTIVAPRC ;
   private boolean[] H03RE19_n993CNTIVAPRC ;
   private long[] H03RE20_A15650VALCOMLIN ;
   private long[] H03RE20_A15642VALCOMDOC ;
   private String[] H03RE20_A20CNTDOCID ;
   private long[] H03RE20_A5939CNCIASID ;
   private java.math.BigDecimal[] H03RE20_A15964VALCOMQTOC ;
   private boolean[] H03RE20_n15964VALCOMQTOC ;
   private java.math.BigDecimal[] H03RE20_A15654VALCOMPRE ;
   private boolean[] H03RE20_n15654VALCOMPRE ;
   private long[] H03RE21_A15965VALCOMIDA ;
   private long[] H03RE21_A15642VALCOMDOC ;
   private String[] H03RE21_A20CNTDOCID ;
   private long[] H03RE21_A5939CNCIASID ;
   private String[] H03RE21_A15968VALCOMTIPAR ;
   private boolean[] H03RE21_n15968VALCOMTIPAR ;
   private String[] H03RE21_A15967VALCOMBLOB ;
   private boolean[] H03RE21_n15967VALCOMBLOB ;
   private String[] H03RE21_A15966VALCOMNMA ;
   private boolean[] H03RE21_n15966VALCOMNMA ;
   private String[] H03RE21_A17225VALCOMRUT ;
   private boolean[] H03RE21_n17225VALCOMRUT ;
   private long[] H03RE22_A860PMEmpresa ;
   private String[] H03RE22_A909PMUuid ;
   private boolean[] H03RE22_n909PMUuid ;
   private long[] H03RE22_A862PMNumDoc ;
   private String[] H03RE22_A861PMTipoDoc ;
   private long[] H03RE23_A5939CNCIASID ;
   private String[] H03RE23_A14CNCIASRFC ;
   private boolean[] H03RE23_n14CNCIASRFC ;
   private long[] H03RE24_A15642VALCOMDOC ;
   private String[] H03RE24_A20CNTDOCID ;
   private long[] H03RE24_A5939CNCIASID ;
   private String[] H03RE24_A15968VALCOMTIPAR ;
   private boolean[] H03RE24_n15968VALCOMTIPAR ;
   private String[] H03RE24_A15966VALCOMNMA ;
   private boolean[] H03RE24_n15966VALCOMNMA ;
   private java.util.Date[] H03RE24_A15970VALCOMFECA ;
   private boolean[] H03RE24_n15970VALCOMFECA ;
   private String[] H03RE24_A15967VALCOMBLOB ;
   private boolean[] H03RE24_n15967VALCOMBLOB ;
   private String[] H03RE24_A15969VALCOMUSRA ;
   private boolean[] H03RE24_n15969VALCOMUSRA ;
   private long[] H03RE24_A15965VALCOMIDA ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.xml.XMLReader AV168Xmlr ;
   private com.genexus.webpanels.WebSession AV103KDSSESSION ;
   private GXBaseCollection<com.kdsproyectos.SdtFileUploadData> AV75UploadedFiles ;
   private GXBaseCollection<com.kdsproyectos.SdtSDTRec_SDTRecItem> AV142sdtRec ;
   private com.kdsproyectos.SdtFileUploadData AV76FileUploadData ;
   private com.kdsproyectos.SdtSDTRec_SDTRecItem AV144sdtRecitem ;
   private com.kdsproyectos.SdtsdtRespMerca AV221sdtRespMerca ;
   private com.kdsproyectos.SdtsdtRespMerca GXv_SdtsdtRespMerca12[] ;
}

final  class prompgenoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H03RE2", "SELECT DISTINCT CNCDIRNOM FROM CNCDIR WHERE (UPPER(CNCDIRNOM) like '%' || UPPER(?)) AND (CNCDIRFBA = DATE '00010101') AND (CNCDIRFSP = DATE '00010101') ORDER BY CNCDIRNOM  LIMIT 10",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H03RE3", "SELECT CNTPGOID, CNTPGODSC, CNTPGOHAB FROM CNTPGO WHERE CNTPGOHAB = TRUE ORDER BY CNTPGODSC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H03RE4", "SELECT CNTIVAID, CNTIVADSC FROM CNTIVA ORDER BY CNTIVADSC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H03RE5", "SELECT CNCMNMID, CNCMNMDSC FROM CNCMNM WHERE CNCMNMID <> ( '') ORDER BY CNCMNMID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE6", "SELECT T1.INALMNENCID, T1.INALMNENCUSR, T2.INALMNDSC, T1.INALMNID FROM (INALMNENC T1 INNER JOIN INALMN T2 ON T2.INALMNID = T1.INALMNID) WHERE T1.INALMNENCUSR = ( ?) ORDER BY T1.INALMNID, T1.INALMNENCID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE7", "SELECT VALCOMDOC, CNTDOCID, CNCIASID, VALCOMLIN, VALCOMPRID, VALCOMUMT, VALCOMQTO, VALCOMPRE, VALCOMQTOC, VALCOMRTDOC, VALCOMRNDOC, VALCOMRLIN FROM VALCOM1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and VALCOMDOC = ? ORDER BY CNCIASID, CNTDOCID, VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE8", "SELECT T1.VALCOMLIN, T2.CNCDIRID, T3.CNTPGOID, T3.CNCDIRFBA, T3.CNCDIRFSP, T4.CNTPGOHAB, T1.VALCOMDOC, T1.CNTDOCID, T1.CNCIASID, T1.VALCOMRTDOC, T1.VALCOMRNDOC FROM (((VALCOM1 T1 INNER JOIN VALCOM T2 ON T2.CNCIASID = T1.CNCIASID AND T2.CNTDOCID = T1.CNTDOCID AND T2.VALCOMDOC = T1.VALCOMDOC) LEFT JOIN CNCDIR T3 ON T3.CNCDIRID = T2.CNCDIRID) LEFT JOIN CNTPGO T4 ON T4.CNTPGOID = T3.CNTPGOID) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.VALCOMDOC = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE9", "SELECT ACRCOILIN, ACRCOIDOC, CNTDOCID, CNCIASID, ACRCOIALM FROM ACRCOI1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and ACRCOIDOC = ? ORDER BY CNCIASID, CNTDOCID, ACRCOIDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE10", "SELECT VALCOMIDA, VALCOMDOC, CNTDOCID, CNCIASID FROM VALCOM2 WHERE (CNCIASID = ? and CNTDOCID = ( ?) and VALCOMDOC = ?) AND (VALCOMIDA <> 0) ORDER BY CNCIASID, CNTDOCID, VALCOMDOC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE11", "SELECT CNTIVAID, EstructImpId, EstructImpDsc, EstructImpTip FROM EstrucImp WHERE EstructImpId = ( ?) ORDER BY EstructImpId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE12", "SELECT T1.EstructImpId, T1.CNTIVAID, T2.CNTIVAPRC FROM (EstrucImp T1 INNER JOIN CNTIVA T2 ON T2.CNTIVAID = T1.CNTIVAID) WHERE T1.EstructImpId = ( ?) ORDER BY T1.EstructImpId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE13", "SELECT CNTDOCID, ACMROIDOC, ACMROITDOC, ACMROINDOC, CNCIASID, ACMROINP, ACMROIQT, ACMROILIN FROM ACMROI WHERE CNCIASID = ? and ACMROITDOC = ( ?) and ACMROINDOC = ? ORDER BY CNCIASID, ACMROITDOC, ACMROINDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE14", "SELECT CNTIVAID, CNTIVAPRC FROM CNTIVA WHERE CNTIVAID = ( ?) ORDER BY CNTIVAID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE15", "SELECT CNCDIRFBA, CNCDIRFSP, CNCDIRNOM, CNCDIRID, CNCDIRRFC, CNCDIRESTIMP FROM CNCDIR WHERE (CNCDIRFSP = DATE '00010101') AND (CNCDIRFBA = DATE '00010101') AND (CNCDIRNOM = ( ?)) ORDER BY CNCDIRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE16", "SELECT T1.VALCOMDOC, T1.CNTDOCID, T1.CNCIASID, T1.CNCDIRID, T2.CNCDIRNOM, T2.CNCDIRRFC, T2.CNCDIRESTIMP FROM (VALCOM T1 LEFT JOIN CNCDIR T2 ON T2.CNCDIRID = T1.CNCDIRID) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.VALCOMDOC = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE17", "SELECT T1.VALCOMDOC, T1.CNTDOCID, T1.CNCIASID, T1.CNCDIRID, T2.CNCDIRNOM, T2.CNCDIRRFC FROM (VALCOM T1 LEFT JOIN CNCDIR T2 ON T2.CNCDIRID = T1.CNCDIRID) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.VALCOMDOC = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE18", "SELECT T1.VALCOMLIN, T1.VALCOMDOC, T1.CNTDOCID, T1.CNCIASID, T2.CNCDIRID, T3.CNCDIRNOM, T3.CNCDIRRFC, T2.VALCOMPRY, T2.VALCOMMON, T2.VALCOMEST, T1.VALCOMUMT, T3.CNCDIRESTIMP, T2.VALCOMTCAM, T2.VALCOMNOC, T2.VALCOMALME, T2.VALCOMTIVA, T2.VALCOMCPGO, T2.VALCOMINCDTO, T2.VALCOMTIPDTO, T2.VALCOMPORDTOF, T2.VALCOMMTODTOF, T2.VALCOMPORDTON, T2.VALCOMMTODTON, T3.CNTIVAID FROM ((VALCOM1 T1 INNER JOIN VALCOM T2 ON T2.CNCIASID = T1.CNCIASID AND T2.CNTDOCID = T1.CNTDOCID AND T2.VALCOMDOC = T1.VALCOMDOC) LEFT JOIN CNCDIR T3 ON T3.CNCDIRID = T2.CNCDIRID) WHERE T1.CNCIASID = ? and T1.CNTDOCID = ( ?) and T1.VALCOMDOC = ? ORDER BY T1.CNCIASID, T1.CNTDOCID, T1.VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE19", "SELECT CNTIVAID, CNTIVAPRC FROM CNTIVA WHERE CNTIVAID = ( ?) ORDER BY CNTIVAID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE20", "SELECT VALCOMLIN, VALCOMDOC, CNTDOCID, CNCIASID, VALCOMQTOC, VALCOMPRE FROM VALCOM1 WHERE CNCIASID = ? and CNTDOCID = ( ?) and VALCOMDOC = ? ORDER BY CNCIASID, CNTDOCID, VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE21", "SELECT VALCOMIDA, VALCOMDOC, CNTDOCID, CNCIASID, VALCOMTIPAR, VALCOMBLOB, VALCOMNMA, VALCOMRUT FROM VALCOM2 WHERE CNCIASID = ? and CNTDOCID = ( ?) and VALCOMDOC = ? ORDER BY CNCIASID, CNTDOCID, VALCOMDOC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE22", "SELECT PMEmpresa, PMUuid, PMNumDoc, PMTipoDoc FROM PMCuentaXPag WHERE PMUuid = ( ?) ORDER BY PMEmpresa, PMTipoDoc, PMNumDoc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H03RE23", "SELECT CNCIASID, CNCIASRFC FROM CNCIAS WHERE CNCIASID = ? ORDER BY CNCIASID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H03RE24", "SELECT VALCOMDOC, CNTDOCID, CNCIASID, VALCOMTIPAR, VALCOMNMA, VALCOMFECA, VALCOMBLOB, VALCOMUSRA, VALCOMIDA FROM VALCOM2 WHERE CNCIASID = ? and CNTDOCID = ( ?) and VALCOMDOC = ? ORDER BY CNCIASID, CNTDOCID, VALCOMDOC, VALCOMIDA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 250) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 100) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((boolean[]) buf[3])[0] = rslt.getBoolean(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 40) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 30) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((boolean[]) buf[9])[0] = rslt.getBoolean(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7) ;
               ((String[]) buf[12])[0] = rslt.getString(8, 3) ;
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
               ((String[]) buf[14])[0] = rslt.getString(10, 3) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 15) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 60) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 8) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 250) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((String[]) buf[7])[0] = rslt.getString(5, 13) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 250) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 250) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 250) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,4) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 8) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 3) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(20,2) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(23,2) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 8) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 10) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getBLOBFile(6, rslt.getString(5, 10), "") ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 200) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 250) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 40) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 3) ;
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 20) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 200) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getBLOBFile(7, rslt.getString(4, 10), "") ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(9) ;
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
               stmt.setString(1, (String)parms[0], 250);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 250);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 18 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 50);
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

