/*
               File: wpavdest_impl
        Description: Gestión de Registro del servicio
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: April 14, 2025 10:11:20.5
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

public final  class wpavdest_impl extends GXDataArea
{
   public wpavdest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpavdest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpavdest_impl.class ));
   }

   public wpavdest_impl( int remoteHandle ,
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
      cmbavCnciasid = new HTMLChoice();
      cmbavPmctprid = new HTMLChoice();
      cmbavTdc = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCNCDIRNOM_F2") == 0 )
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
            gxsgvvcncdirnom_f21XA0( A194CNCDIRNOM) ;
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
            nRC_GXsfl_17 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_17_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_17_idx = httpContext.GetNextPar( ) ;
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
            A7520CNDSPRNDC = GXutil.lval( httpContext.GetNextPar( )) ;
            A7518CNDSPRCIA = GXutil.lval( httpContext.GetNextPar( )) ;
            AV31CNCIASID = GXutil.lval( httpContext.GetNextPar( )) ;
            A7519CNDSPRTDC = httpContext.GetNextPar( ) ;
            AV76tdc = httpContext.GetNextPar( ) ;
            AV75ndc = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A7521CNDSPRPRID = httpContext.GetNextPar( ) ;
            n7521CNDSPRPRID = false ;
            AV60PMCTPRID = httpContext.GetNextPar( ) ;
            A46CNCDIRID = GXutil.lval( httpContext.GetNextPar( )) ;
            A7522CNDSPRCON = GXutil.lval( httpContext.GetNextPar( )) ;
            n7522CNDSPRCON = false ;
            AV24CNCDIRID = GXutil.lval( httpContext.GetNextPar( )) ;
            A7927CNDSPREST = httpContext.GetNextPar( ) ;
            n7927CNDSPREST = false ;
            A9293CNDSPRTREST = httpContext.GetNextPar( ) ;
            n9293CNDSPRTREST = false ;
            AV45consultar = GXutil.strtobool( httpContext.GetNextPar( )) ;
            A7566CNDSPRTRN = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n7566CNDSPRTRN = false ;
            A7523CNDSPRFCON = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n7523CNDSPRFCON = false ;
            A7524CNDSPRFOLCON = httpContext.GetNextPar( ) ;
            n7524CNDSPRFOLCON = false ;
            A7526CNDSPRMNTANT = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7526CNDSPRMNTANT = false ;
            A7527CNDSPRMON = httpContext.GetNextPar( ) ;
            n7527CNDSPRMON = false ;
            A7528CNDSPRFITR = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n7528CNDSPRFITR = false ;
            A7529CNDSPRFFTR = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n7529CNDSPRFFTR = false ;
            A7533CNDSPRMNTCON = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7533CNDSPRMNTCON = false ;
            A7536CNDSPRIMPBAS = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7536CNDSPRIMPBAS = false ;
            A7530CNDSPRRESCON = httpContext.GetNextPar( ) ;
            n7530CNDSPRRESCON = false ;
            AV44CNUSERID = httpContext.GetNextPar( ) ;
            A14386CNDSPRURS = httpContext.GetNextPar( ) ;
            n14386CNDSPRURS = false ;
            A20CNTDOCID = httpContext.GetNextPar( ) ;
            AV86CNDSPRTDC = httpContext.GetNextPar( ) ;
            A21CNTDOCDSC = httpContext.GetNextPar( ) ;
            n21CNTDOCDSC = false ;
            A7792AVDSPRLIN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A7789AVDSPRCIA = GXutil.lval( httpContext.GetNextPar( )) ;
            A8255AVDSPRDOC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV87CNDSPRNDC = GXutil.lval( httpContext.GetNextPar( )) ;
            A7800AVDSPREST = httpContext.GetNextPar( ) ;
            n7800AVDSPREST = false ;
            A7862AVDSPRCAN = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7862AVDSPRCAN = false ;
            A7795AVDSPRIMP = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7795AVDSPRIMP = false ;
            A7545CNDSPRTRIMP = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n7545CNDSPRTRIMP = false ;
            A7601CNDSPRTRNDC = GXutil.lval( httpContext.GetNextPar( )) ;
            n7601CNDSPRTRNDC = false ;
            A7550CNDSPRTRALC = httpContext.GetNextPar( ) ;
            n7550CNDSPRTRALC = false ;
            A171PMCTPRID = httpContext.GetNextPar( ) ;
            AV88CNDSPRPRID = httpContext.GetNextPar( ) ;
            A6299PMCTPREJ = GXutil.lval( httpContext.GetNextPar( )) ;
            n6299PMCTPREJ = false ;
            A194CNCDIRNOM = httpContext.GetNextPar( ) ;
            n194CNCDIRNOM = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( A7520CNDSPRNDC, A7518CNDSPRCIA, AV31CNCIASID, A7519CNDSPRTDC, AV76tdc, AV75ndc, A7521CNDSPRPRID, AV60PMCTPRID, A46CNCDIRID, A7522CNDSPRCON, AV24CNCDIRID, A7927CNDSPREST, A9293CNDSPRTREST, AV45consultar, A7566CNDSPRTRN, A7523CNDSPRFCON, A7524CNDSPRFOLCON, A7526CNDSPRMNTANT, A7527CNDSPRMON, A7528CNDSPRFITR, A7529CNDSPRFFTR, A7533CNDSPRMNTCON, A7536CNDSPRIMPBAS, A7530CNDSPRRESCON, AV44CNUSERID, A14386CNDSPRURS, A20CNTDOCID, AV86CNDSPRTDC, A21CNTDOCDSC, A7792AVDSPRLIN, A7789AVDSPRCIA, A8255AVDSPRDOC, AV87CNDSPRNDC, A7800AVDSPREST, A7862AVDSPRCAN, A7795AVDSPRIMP, A7545CNDSPRTRIMP, A7601CNDSPRTRNDC, A7550CNDSPRTRALC, A171PMCTPRID, AV88CNDSPRPRID, A6299PMCTPREJ, A194CNCDIRNOM) ;
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
      pa1XA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1XA2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?202541410112028", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("calendar-en.js", "?"+httpContext.getBuildNumber( 129648), false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "background-color: black;" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.kdsproyectos.wpavdest") +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(4), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRNDC", GXutil.ltrim( localUtil.ntoc( A7520CNDSPRNDC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRCIA", GXutil.ltrim( localUtil.ntoc( A7518CNDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTDC", GXutil.rtrim( A7519CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRPRID", GXutil.rtrim( A7521CNDSPRPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRID", GXutil.ltrim( localUtil.ntoc( A46CNCDIRID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRCON", GXutil.ltrim( localUtil.ntoc( A7522CNDSPRCON, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPREST", GXutil.rtrim( A7927CNDSPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTREST", GXutil.rtrim( A9293CNDSPRTREST));
      com.kdsproyectos.GxWebStd.gx_boolean_hidden_field( httpContext, "vCONSULTAR", AV45consultar);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTRN", localUtil.dtoc( A7566CNDSPRTRN, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRFCON", localUtil.dtoc( A7523CNDSPRFCON, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRFOLCON", GXutil.rtrim( A7524CNDSPRFOLCON));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRMNTANT", GXutil.ltrim( localUtil.ntoc( A7526CNDSPRMNTANT, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRMON", GXutil.rtrim( A7527CNDSPRMON));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRFITR", localUtil.dtoc( A7528CNDSPRFITR, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRFFTR", localUtil.dtoc( A7529CNDSPRFFTR, 0, "/"));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRMNTCON", GXutil.ltrim( localUtil.ntoc( A7533CNDSPRMNTCON, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRIMPBAS", GXutil.ltrim( localUtil.ntoc( A7536CNDSPRIMPBAS, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRRESCON", GXutil.rtrim( A7530CNDSPRRESCON));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV44CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRURS", GXutil.rtrim( A14386CNDSPRURS));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTDOCID", GXutil.rtrim( A20CNTDOCID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTDOCDSC", GXutil.rtrim( A21CNTDOCDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRLIN", GXutil.ltrim( localUtil.ntoc( A7792AVDSPRLIN, (byte)(7), (byte)(3), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRCIA", GXutil.ltrim( localUtil.ntoc( A7789AVDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRDOC", GXutil.ltrim( localUtil.ntoc( A8255AVDSPRDOC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPREST", GXutil.rtrim( A7800AVDSPREST));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRCAN", GXutil.ltrim( localUtil.ntoc( A7862AVDSPRCAN, (byte)(17), (byte)(6), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "AVDSPRIMP", GXutil.ltrim( localUtil.ntoc( A7795AVDSPRIMP, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTRIMP", GXutil.ltrim( localUtil.ntoc( A7545CNDSPRTRIMP, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTRNDC", GXutil.ltrim( localUtil.ntoc( A7601CNDSPRTRNDC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTRALC", A7550CNDSPRTRALC);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTPRID", GXutil.rtrim( A171PMCTPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRPRID", GXutil.rtrim( AV88CNDSPRPRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "PMCTPREJ", GXutil.ltrim( localUtil.ntoc( A6299PMCTPREJ, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRNOM", GXutil.rtrim( A194CNCDIRNOM));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNTPDRID", GXutil.rtrim( A382CNTPDRID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNCDIRCON", GXutil.ltrim( localUtil.ntoc( A7563CNCDIRCON, (byte)(1), (byte)(0), ".", "")));
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
         we1XA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1XA2( ) ;
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
      return formatLink("com.kdsproyectos.wpavdest")  ;
   }

   public String getPgmname( )
   {
      return "wpavdest" ;
   }

   public String getPgmdesc( )
   {
      return "Gestión de Registro del servicio" ;
   }

   public void wb1XA0( )
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
         httpContext.writeText( "<p>") ;
         wb_table1_3_1XA2( true) ;
      }
      else
      {
         wb_table1_3_1XA2( false) ;
      }
      return  ;
   }

   public void wb_table1_3_1XA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_38_1XA2( true) ;
      }
      else
      {
         wb_table2_38_1XA2( false) ;
      }
      return  ;
   }

   public void wb_table2_38_1XA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</p>") ;
      }
      if ( wbEnd == 17 )
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

   public void start1XA2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 16_0_1-129648", (short)(0)) ;
         Form.getMeta().addItem("description", "Gestión de Registro del servicio", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1XA0( ) ;
   }

   public void ws1XA2( )
   {
      start1XA2( ) ;
      evt1XA2( ) ;
   }

   public void evt1XA2( )
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
                        else if ( GXutil.strcmp(sEvt, "VCNCIASID.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111XA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCNCDIRNOM_F2.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121XA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONSULTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'consultar' */
                           e131XA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'AGREGARAVANCE2'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'AGREGARAVANCE2'") == 0 ) )
                        {
                           nGXsfl_17_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           AV62REC2 = httpContext.cgiGet( edtavRec2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRec2_Internalname, AV62REC2);
                           AV92alta = httpContext.cgiGet( edtavAlta_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAlta_Internalname, AV92alta);
                           AV93CNTDOCDSC = httpContext.cgiGet( edtavCntdocdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCntdocdsc_Internalname, AV93CNTDOCDSC);
                           AV58PMCTPRDSC = httpContext.cgiGet( edtavPmctprdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavPmctprdsc_Internalname, AV58PMCTPRDSC);
                           AV86CNDSPRTDC = httpContext.cgiGet( edtavCndsprtdc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtdc_Internalname, AV86CNDSPRTDC);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRNDC");
                              GX_FocusControl = edtavCndsprndc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV87CNDSPRNDC = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprndc_Internalname, GXutil.ltrim( GXutil.str( AV87CNDSPRNDC, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV87CNDSPRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprndc_Internalname, GXutil.ltrim( GXutil.str( AV87CNDSPRNDC, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
                           }
                           AV90CNCDIRNOM = httpContext.cgiGet( edtavCncdirnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_Internalname, AV90CNCDIRNOM);
                           AV79CNDSPRFOLCON = httpContext.cgiGet( edtavCndsprfolcon_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfolcon_Internalname, AV79CNDSPRFOLCON);
                           AV84CNDSPRALCTR = httpContext.cgiGet( edtavCndspralctr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndspralctr_Internalname, AV84CNDSPRALCTR);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCndsprfcon_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFCON");
                              GX_FocusControl = edtavCndsprfcon_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV78CNDSPRFCON = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfcon_Internalname, localUtil.format(AV78CNDSPRFCON, "99/99/99"));
                           }
                           else
                           {
                              AV78CNDSPRFCON = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCndsprfcon_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfcon_Internalname, localUtil.format(AV78CNDSPRFCON, "99/99/99"));
                           }
                           AV81CNDSPRMON = httpContext.cgiGet( edtavCndsprmon_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprmon_Internalname, AV81CNDSPRMON);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRIMPBAS");
                              GX_FocusControl = edtavCndsprimpbas_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV94CNDSPRIMPBAS = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprimpbas_Internalname, GXutil.ltrim( GXutil.str( AV94CNDSPRIMPBAS, 15, 2)));
                           }
                           else
                           {
                              AV94CNDSPRIMPBAS = localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprimpbas_Internalname, GXutil.ltrim( GXutil.str( AV94CNDSPRIMPBAS, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOACUMULADO");
                              GX_FocusControl = edtavMontoacumulado_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV107MONTOACUMULADO = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
                           }
                           else
                           {
                              AV107MONTOACUMULADO = localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTO");
                              GX_FocusControl = edtavMonto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV106MONTO = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
                           }
                           else
                           {
                              AV106MONTO = localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOPENDIENTE");
                              GX_FocusControl = edtavMontopendiente_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV109montopendiente = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
                           }
                           else
                           {
                              AV109montopendiente = localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCndsprfitr_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFITR");
                              GX_FocusControl = edtavCndsprfitr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV82CNDSPRFITR = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfitr_Internalname, localUtil.format(AV82CNDSPRFITR, "99/99/99"));
                           }
                           else
                           {
                              AV82CNDSPRFITR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCndsprfitr_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfitr_Internalname, localUtil.format(AV82CNDSPRFITR, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCndsprfftr_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFFTR");
                              GX_FocusControl = edtavCndsprfftr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV83CNDSPRFFTR = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfftr_Internalname, localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
                           }
                           else
                           {
                              AV83CNDSPRFFTR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCndsprfftr_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfftr_Internalname, localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
                           }
                           AV120CNCDIRNOM_RES = httpContext.cgiGet( edtavCncdirnom_res_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_res_Internalname, AV120CNCDIRNOM_RES);
                           AV115CNDSPRRESCON = httpContext.cgiGet( edtavCndsprrescon_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCndsprrescon_Internalname, AV115CNDSPRRESCON);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRNDC");
                              GX_FocusControl = edtavCndsprtrndc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV114CNDSPRTRNDC = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
                           }
                           else
                           {
                              AV114CNDSPRTRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
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
                                 e141XA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e151XA2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'AGREGARAVANCE2'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'agregarAvance2' */
                                 e161XA2 ();
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
                                       e171XA2 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1XA2( )
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

   public void pa1XA2( )
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
            GX_FocusControl = cmbavCnciasid.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvcncdirnom_f21XA0( String A194CNCDIRNOM )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      httpContext.GX_webresponse.addString("[[");
      gxsgvvcncdirnom_f2_data1XA0( A194CNCDIRNOM) ;
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

   protected void gxsgvvcncdirnom_f2_data1XA0( String A194CNCDIRNOM )
   {
      l194CNCDIRNOM = GXutil.padr( GXutil.rtrim( A194CNCDIRNOM), 250, "%") ;
      n194CNCDIRNOM = false ;
      /* Using cursor H01XA2 */
      pr_default.execute(0, new Object[] {l194CNCDIRNOM});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01XA2_A194CNCDIRNOM[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01XA2_A194CNCDIRNOM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgrid1_newrow( )
   {
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_17_idx+1)) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid1Container));
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( long A7520CNDSPRNDC ,
                                  long A7518CNDSPRCIA ,
                                  long AV31CNCIASID ,
                                  String A7519CNDSPRTDC ,
                                  String AV76tdc ,
                                  short AV75ndc ,
                                  String A7521CNDSPRPRID ,
                                  String AV60PMCTPRID ,
                                  long A46CNCDIRID ,
                                  long A7522CNDSPRCON ,
                                  long AV24CNCDIRID ,
                                  String A7927CNDSPREST ,
                                  String A9293CNDSPRTREST ,
                                  boolean AV45consultar ,
                                  java.util.Date A7566CNDSPRTRN ,
                                  java.util.Date A7523CNDSPRFCON ,
                                  String A7524CNDSPRFOLCON ,
                                  java.math.BigDecimal A7526CNDSPRMNTANT ,
                                  String A7527CNDSPRMON ,
                                  java.util.Date A7528CNDSPRFITR ,
                                  java.util.Date A7529CNDSPRFFTR ,
                                  java.math.BigDecimal A7533CNDSPRMNTCON ,
                                  java.math.BigDecimal A7536CNDSPRIMPBAS ,
                                  String A7530CNDSPRRESCON ,
                                  String AV44CNUSERID ,
                                  String A14386CNDSPRURS ,
                                  String A20CNTDOCID ,
                                  String AV86CNDSPRTDC ,
                                  String A21CNTDOCDSC ,
                                  java.math.BigDecimal A7792AVDSPRLIN ,
                                  long A7789AVDSPRCIA ,
                                  long A8255AVDSPRDOC ,
                                  long AV87CNDSPRNDC ,
                                  String A7800AVDSPREST ,
                                  java.math.BigDecimal A7862AVDSPRCAN ,
                                  java.math.BigDecimal A7795AVDSPRIMP ,
                                  java.math.BigDecimal A7545CNDSPRTRIMP ,
                                  long A7601CNDSPRTRNDC ,
                                  String A7550CNDSPRTRALC ,
                                  String A171PMCTPRID ,
                                  String AV88CNDSPRPRID ,
                                  long A6299PMCTPREJ ,
                                  String A194CNCDIRNOM )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf1XA2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTDC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTDC", GXutil.rtrim( AV86CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRNDC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRNDC", GXutil.ltrim( localUtil.ntoc( AV87CNDSPRNDC, (byte)(10), (byte)(0), ".", "")));
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
      if ( cmbavCnciasid.getItemCount() > 0 )
      {
         AV31CNCIASID = GXutil.lval( cmbavCnciasid.getValidValue(GXutil.trim( GXutil.str( AV31CNCIASID, 10, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCnciasid.setValue( GXutil.trim( GXutil.str( AV31CNCIASID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCnciasid.getInternalname(), "Values", cmbavCnciasid.ToJavascriptSource(), true);
      }
      if ( cmbavPmctprid.getItemCount() > 0 )
      {
         AV60PMCTPRID = cmbavPmctprid.getValidValue(AV60PMCTPRID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60PMCTPRID", AV60PMCTPRID);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPmctprid.setValue( GXutil.rtrim( AV60PMCTPRID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPmctprid.getInternalname(), "Values", cmbavPmctprid.ToJavascriptSource(), true);
      }
      if ( cmbavTdc.getItemCount() > 0 )
      {
         AV76tdc = cmbavTdc.getValidValue(AV76tdc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76tdc", AV76tdc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTdc.setValue( GXutil.rtrim( AV76tdc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTdc.getInternalname(), "Values", cmbavTdc.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1XA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV123Pgmname = "wpavdest" ;
      Gx_err = (short)(0) ;
      edtavRec2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRec2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavRec2_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavAlta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlta_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlta_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCntdocdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntdocdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntdocdsc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavPmctprdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmctprdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPmctprdsc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprtdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtdc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtdc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprndc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfolcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfolcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfolcon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndspralctr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndspralctr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndspralctr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfcon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprmon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprimpbas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprimpbas_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprimpbas_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMontoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontoacumulado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontoacumulado_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMonto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMonto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMonto_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMontopendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontopendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontopendiente_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfitr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfitr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfitr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfftr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfftr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfftr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirnom_res_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_res_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_res_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprrescon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprrescon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprrescon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprtrndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrndc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirid_Enabled, 5, 0)), true);
   }

   public void rf1XA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(17) ;
      nGXsfl_17_idx = (short)(1) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "KDSResponsiveTable");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Titlefont", GXutil.rtrim( subGrid1_Titlefont));
      Grid1Container.AddObjectProperty("Linesfont", GXutil.rtrim( subGrid1_Linesfont));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_172( ) ;
         e151XA2 ();
         wbEnd = (short)(17) ;
         wb1XA0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XA2( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV44CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRTDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
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

   public void strup1XA0( )
   {
      /* Before Start, stand alone formulas. */
      AV123Pgmname = "wpavdest" ;
      Gx_err = (short)(0) ;
      edtavRec2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRec2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavRec2_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavAlta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlta_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlta_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCntdocdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCntdocdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCntdocdsc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavPmctprdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmctprdsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPmctprdsc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprtdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtdc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtdc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprndc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfolcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfolcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfolcon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndspralctr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndspralctr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndspralctr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfcon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfcon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprmon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprmon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprmon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprimpbas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprimpbas_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprimpbas_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMontoacumulado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontoacumulado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontoacumulado_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMonto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMonto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMonto_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavMontopendiente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMontopendiente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMontopendiente_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfitr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfitr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfitr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprfftr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprfftr_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprfftr_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirnom_res_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirnom_res_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirnom_res_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprrescon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprrescon_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprrescon_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCndsprtrndc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCndsprtrndc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCndsprtrndc_Enabled, 5, 0)), !bGXsfl_17_Refreshing);
      edtavCncdirid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCncdirid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCncdirid_Enabled, 5, 0)), true);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141XA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         cmbavCnciasid.setName( cmbavCnciasid.getInternalname() );
         cmbavCnciasid.setValue( httpContext.cgiGet( cmbavCnciasid.getInternalname()) );
         AV31CNCIASID = GXutil.lval( httpContext.cgiGet( cmbavCnciasid.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
         cmbavPmctprid.setName( cmbavPmctprid.getInternalname() );
         cmbavPmctprid.setValue( httpContext.cgiGet( cmbavPmctprid.getInternalname()) );
         AV60PMCTPRID = httpContext.cgiGet( cmbavPmctprid.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60PMCTPRID", AV60PMCTPRID);
         cmbavTdc.setName( cmbavTdc.getInternalname() );
         cmbavTdc.setValue( httpContext.cgiGet( cmbavTdc.getInternalname()) );
         AV76tdc = httpContext.cgiGet( cmbavTdc.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76tdc", AV76tdc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNdc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNdc_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNDC");
            GX_FocusControl = edtavNdc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75ndc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75ndc", GXutil.ltrim( GXutil.str( AV75ndc, 4, 0)));
         }
         else
         {
            AV75ndc = (short)(localUtil.ctol( httpContext.cgiGet( edtavNdc_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75ndc", GXutil.ltrim( GXutil.str( AV75ndc, 4, 0)));
         }
         AV28CNCDIRNOM_F2 = httpContext.cgiGet( edtavCncdirnom_f2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28CNCDIRNOM_F2", AV28CNCDIRNOM_F2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCncdirid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCncdirid_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNCDIRID");
            GX_FocusControl = edtavCncdirid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24CNCDIRID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CNCDIRID", GXutil.ltrim( GXutil.str( AV24CNCDIRID, 10, 0)));
         }
         else
         {
            AV24CNCDIRID = localUtil.ctol( httpContext.cgiGet( edtavCncdirid_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CNCDIRID", GXutil.ltrim( GXutil.str( AV24CNCDIRID, 10, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_17 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_17"), ".", ",")) ;
         AV44CNUSERID = httpContext.cgiGet( "vCNUSERID") ;
         /* Read subfile selected row values. */
         nGXsfl_17_idx = (short)(localUtil.cton( httpContext.cgiGet( subGrid1_Internalname+"_ROW"), ".", ",")) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         if ( nGXsfl_17_idx > 0 )
         {
            AV62REC2 = httpContext.cgiGet( edtavRec2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavRec2_Internalname, AV62REC2);
            AV92alta = httpContext.cgiGet( edtavAlta_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavAlta_Internalname, AV92alta);
            AV93CNTDOCDSC = httpContext.cgiGet( edtavCntdocdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCntdocdsc_Internalname, AV93CNTDOCDSC);
            AV58PMCTPRDSC = httpContext.cgiGet( edtavPmctprdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPmctprdsc_Internalname, AV58PMCTPRDSC);
            AV86CNDSPRTDC = httpContext.cgiGet( edtavCndsprtdc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtdc_Internalname, AV86CNDSPRTDC);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRNDC");
               GX_FocusControl = edtavCndsprndc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV87CNDSPRNDC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprndc_Internalname, GXutil.ltrim( GXutil.str( AV87CNDSPRNDC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
            }
            else
            {
               AV87CNDSPRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprndc_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprndc_Internalname, GXutil.ltrim( GXutil.str( AV87CNDSPRNDC, 10, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
            }
            AV90CNCDIRNOM = httpContext.cgiGet( edtavCncdirnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_Internalname, AV90CNCDIRNOM);
            AV79CNDSPRFOLCON = httpContext.cgiGet( edtavCndsprfolcon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfolcon_Internalname, AV79CNDSPRFOLCON);
            AV84CNDSPRALCTR = httpContext.cgiGet( edtavCndspralctr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCndspralctr_Internalname, AV84CNDSPRALCTR);
            if ( localUtil.vcdate( httpContext.cgiGet( edtavCndsprfcon_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFCON");
               GX_FocusControl = edtavCndsprfcon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV78CNDSPRFCON = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfcon_Internalname, localUtil.format(AV78CNDSPRFCON, "99/99/99"));
            }
            else
            {
               AV78CNDSPRFCON = localUtil.ctod( httpContext.cgiGet( edtavCndsprfcon_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfcon_Internalname, localUtil.format(AV78CNDSPRFCON, "99/99/99"));
            }
            AV81CNDSPRMON = httpContext.cgiGet( edtavCndsprmon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCndsprmon_Internalname, AV81CNDSPRMON);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRIMPBAS");
               GX_FocusControl = edtavCndsprimpbas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV94CNDSPRIMPBAS = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprimpbas_Internalname, GXutil.ltrim( GXutil.str( AV94CNDSPRIMPBAS, 15, 2)));
            }
            else
            {
               AV94CNDSPRIMPBAS = localUtil.ctond( httpContext.cgiGet( edtavCndsprimpbas_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprimpbas_Internalname, GXutil.ltrim( GXutil.str( AV94CNDSPRIMPBAS, 15, 2)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOACUMULADO");
               GX_FocusControl = edtavMontoacumulado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV107MONTOACUMULADO = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
            }
            else
            {
               AV107MONTOACUMULADO = localUtil.ctond( httpContext.cgiGet( edtavMontoacumulado_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTO");
               GX_FocusControl = edtavMonto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV106MONTO = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
            }
            else
            {
               AV106MONTO = localUtil.ctond( httpContext.cgiGet( edtavMonto_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMONTOPENDIENTE");
               GX_FocusControl = edtavMontopendiente_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV109montopendiente = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
            }
            else
            {
               AV109montopendiente = localUtil.ctond( httpContext.cgiGet( edtavMontopendiente_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtavCndsprfitr_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFITR");
               GX_FocusControl = edtavCndsprfitr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV82CNDSPRFITR = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfitr_Internalname, localUtil.format(AV82CNDSPRFITR, "99/99/99"));
            }
            else
            {
               AV82CNDSPRFITR = localUtil.ctod( httpContext.cgiGet( edtavCndsprfitr_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfitr_Internalname, localUtil.format(AV82CNDSPRFITR, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtavCndsprfftr_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCNDSPRFFTR");
               GX_FocusControl = edtavCndsprfftr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV83CNDSPRFFTR = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfftr_Internalname, localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
            }
            else
            {
               AV83CNDSPRFFTR = localUtil.ctod( httpContext.cgiGet( edtavCndsprfftr_Internalname), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfftr_Internalname, localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
            }
            AV120CNCDIRNOM_RES = httpContext.cgiGet( edtavCncdirnom_res_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_res_Internalname, AV120CNCDIRNOM_RES);
            AV115CNDSPRRESCON = httpContext.cgiGet( edtavCndsprrescon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCndsprrescon_Internalname, AV115CNDSPRRESCON);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNDSPRTRNDC");
               GX_FocusControl = edtavCndsprtrndc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV114CNDSPRTRNDC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
            }
            else
            {
               AV114CNDSPRTRNDC = localUtil.ctol( httpContext.cgiGet( edtavCndsprtrndc_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
            }
         }
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
      e141XA2 ();
      if (returnInSub) return;
   }

   public void e141XA2( )
   {
      /* Start Routine */
      lblTxtsalir2_Caption = "<i class=\"KDSButton\">exit_to_app</i>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtsalir2_Internalname, "Caption", lblTxtsalir2_Caption, true);
      lblTxtbuscar_Caption = "<i class=\"KDSButton\">search</i>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtbuscar_Internalname, "Caption", lblTxtbuscar_Caption, true);
      AV44CNUSERID = AV50KDSSESSION.getValue("CNUSERID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CNUSERID", AV44CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      lblTxtscript_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxtscript_Visible, 5, 0)), true);
      GXv_char1[0] = AV98Accesso ;
      GXv_char2[0] = AV99CNESDSOP ;
      new com.kdsproyectos.validausmnd(remoteHandle, context).execute( AV44CNUSERID, AV123Pgmname, GXv_char1, GXv_char2) ;
      wpavdest_impl.this.AV98Accesso = GXv_char1[0] ;
      wpavdest_impl.this.AV99CNESDSOP = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CNUSERID", AV44CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      Form.setCaption( AV99CNESDSOP );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      if ( GXutil.strcmp(AV98Accesso, "S") == 0 )
      {
         if ( GXutil.strcmp(AV44CNUSERID, "") == 0 )
         {
            callWebObject(formatLink("com.kdsproyectos.wpiniciosesion") );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      else
      {
         /* Execute user subroutine: 'CERRAR' */
         S112 ();
         if (returnInSub) return;
      }
      AV45consultar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45consultar", AV45consultar);
      /* Execute user subroutine: 'CONSULTARCOMPANIAS' */
      S122 ();
      if (returnInSub) return;
   }

   public void S122( )
   {
      /* 'CONSULTARCOMPANIAS' Routine */
      cmbavCnciasid.removeAllItems();
      cmbavCnciasid.addItem("0", "Seleccione", (short)(0));
      /* Using cursor H01XA3 */
      pr_default.execute(1, new Object[] {AV44CNUSERID});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A248SSUSRID = H01XA3_A248SSUSRID[0] ;
         A9CNCIASDSC = H01XA3_A9CNCIASDSC[0] ;
         n9CNCIASDSC = H01XA3_n9CNCIASDSC[0] ;
         A289SSUSRCIAS = H01XA3_A289SSUSRCIAS[0] ;
         A9CNCIASDSC = H01XA3_A9CNCIASDSC[0] ;
         n9CNCIASDSC = H01XA3_n9CNCIASDSC[0] ;
         cmbavCnciasid.addItem(GXutil.trim( GXutil.str( A289SSUSRCIAS, 10, 0)), A9CNCIASDSC, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      GXv_int3[0] = 0 ;
      GXv_int4[0] = AV100iniCNCIASID ;
      GXv_objcol_int5[0] = AV101arrCNCIASID ;
      new com.kdsproyectos.pusrciaper(remoteHandle, context).execute( AV44CNUSERID, GXv_int3, GXv_int4, GXv_objcol_int5) ;
      wpavdest_impl.this.AV100iniCNCIASID = GXv_int4[0] ;
      AV101arrCNCIASID = GXv_objcol_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44CNUSERID", AV44CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      AV31CNCIASID = AV100iniCNCIASID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      if ( AV101arrCNCIASID.size() == 1 )
      {
         cmbavCnciasid.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCnciasid.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavCnciasid.getEnabled(), 5, 0)), true);
      }
      /* Execute user subroutine: 'CONSULTARPROYECTOS' */
      S182 ();
      if (returnInSub) return;
   }

   public void e111XA2( )
   {
      /* Cnciasid_Isvalid Routine */
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV67SistemaErp ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV31CNCIASID, "InterfazERP", "AutorizarOC", "CSM", (short)(1), GXv_decimal6, GXv_char2) ;
      wpavdest_impl.this.AV67SistemaErp = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV66GenerarImpacto ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV31CNCIASID, "InterfazERP", "AutorizarOC", "CSM", (short)(2), GXv_decimal6, GXv_char2) ;
      wpavdest_impl.this.AV66GenerarImpacto = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV72EstatusR ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV31CNCIASID, "InterfazERP", "AutorizarOC", "CSM", (short)(3), GXv_decimal6, GXv_char2) ;
      wpavdest_impl.this.AV72EstatusR = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
      GXv_char2[0] = AV71fEstatusR ;
      new com.kdsproyectos.conglosis01(remoteHandle, context).execute( AV31CNCIASID, "InterfazERP", "AutorizarOC", "CSM", (short)(6), GXv_decimal6, GXv_char2) ;
      wpavdest_impl.this.AV71fEstatusR = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
   }

   public void S182( )
   {
      /* 'CONSULTARPROYECTOS' Routine */
      cmbavPmctprid.removeAllItems();
      cmbavPmctprid.addItem("", "Seleccione", (short)(0));
      /* Using cursor H01XA4 */
      pr_default.execute(2, new Object[] {AV44CNUSERID});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5940CNUSERID = H01XA4_A5940CNUSERID[0] ;
         A171PMCTPRID = H01XA4_A171PMCTPRID[0] ;
         A172PMCTPRDSC = H01XA4_A172PMCTPRDSC[0] ;
         n172PMCTPRDSC = H01XA4_n172PMCTPRDSC[0] ;
         A172PMCTPRDSC = H01XA4_A172PMCTPRDSC[0] ;
         n172PMCTPRDSC = H01XA4_n172PMCTPRDSC[0] ;
         cmbavPmctprid.addItem(A171PMCTPRID, A172PMCTPRDSC, (short)(0));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   private void e151XA2( )
   {
      /* Grid1_Load Routine */
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV76tdc ,
                                           new Short(AV75ndc) ,
                                           AV60PMCTPRID ,
                                           new Long(A46CNCDIRID) ,
                                           A7519CNDSPRTDC ,
                                           new Long(A7520CNDSPRNDC) ,
                                           A7521CNDSPRPRID ,
                                           new Long(A7522CNDSPRCON) ,
                                           new Long(AV24CNCDIRID) ,
                                           A9293CNDSPRTREST ,
                                           new Boolean(AV45consultar) ,
                                           new Long(A7518CNDSPRCIA) ,
                                           new Long(AV31CNCIASID) ,
                                           A7927CNDSPREST } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      } ) ;
      /* Using cursor H01XA5 */
      pr_default.execute(3, new Object[] {new Boolean(AV45consultar), new Long(AV31CNCIASID), AV76tdc, new Short(AV75ndc), AV60PMCTPRID, new Long(AV24CNCDIRID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A7518CNDSPRCIA = H01XA5_A7518CNDSPRCIA[0] ;
         A7927CNDSPREST = H01XA5_A7927CNDSPREST[0] ;
         n7927CNDSPREST = H01XA5_n7927CNDSPREST[0] ;
         A9293CNDSPRTREST = H01XA5_A9293CNDSPRTREST[0] ;
         n9293CNDSPRTREST = H01XA5_n9293CNDSPRTREST[0] ;
         A7522CNDSPRCON = H01XA5_A7522CNDSPRCON[0] ;
         n7522CNDSPRCON = H01XA5_n7522CNDSPRCON[0] ;
         A7521CNDSPRPRID = H01XA5_A7521CNDSPRPRID[0] ;
         n7521CNDSPRPRID = H01XA5_n7521CNDSPRPRID[0] ;
         A7520CNDSPRNDC = H01XA5_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H01XA5_A7519CNDSPRTDC[0] ;
         A7566CNDSPRTRN = H01XA5_A7566CNDSPRTRN[0] ;
         n7566CNDSPRTRN = H01XA5_n7566CNDSPRTRN[0] ;
         A7523CNDSPRFCON = H01XA5_A7523CNDSPRFCON[0] ;
         n7523CNDSPRFCON = H01XA5_n7523CNDSPRFCON[0] ;
         A7524CNDSPRFOLCON = H01XA5_A7524CNDSPRFOLCON[0] ;
         n7524CNDSPRFOLCON = H01XA5_n7524CNDSPRFOLCON[0] ;
         A7526CNDSPRMNTANT = H01XA5_A7526CNDSPRMNTANT[0] ;
         n7526CNDSPRMNTANT = H01XA5_n7526CNDSPRMNTANT[0] ;
         A7527CNDSPRMON = H01XA5_A7527CNDSPRMON[0] ;
         n7527CNDSPRMON = H01XA5_n7527CNDSPRMON[0] ;
         A7528CNDSPRFITR = H01XA5_A7528CNDSPRFITR[0] ;
         n7528CNDSPRFITR = H01XA5_n7528CNDSPRFITR[0] ;
         A7529CNDSPRFFTR = H01XA5_A7529CNDSPRFFTR[0] ;
         n7529CNDSPRFFTR = H01XA5_n7529CNDSPRFFTR[0] ;
         A7533CNDSPRMNTCON = H01XA5_A7533CNDSPRMNTCON[0] ;
         n7533CNDSPRMNTCON = H01XA5_n7533CNDSPRMNTCON[0] ;
         A7536CNDSPRIMPBAS = H01XA5_A7536CNDSPRIMPBAS[0] ;
         n7536CNDSPRIMPBAS = H01XA5_n7536CNDSPRIMPBAS[0] ;
         A7530CNDSPRRESCON = H01XA5_A7530CNDSPRRESCON[0] ;
         n7530CNDSPRRESCON = H01XA5_n7530CNDSPRRESCON[0] ;
         A14386CNDSPRURS = H01XA5_A14386CNDSPRURS[0] ;
         n14386CNDSPRURS = H01XA5_n14386CNDSPRURS[0] ;
         A7927CNDSPREST = H01XA5_A7927CNDSPREST[0] ;
         n7927CNDSPREST = H01XA5_n7927CNDSPREST[0] ;
         A7522CNDSPRCON = H01XA5_A7522CNDSPRCON[0] ;
         n7522CNDSPRCON = H01XA5_n7522CNDSPRCON[0] ;
         A7521CNDSPRPRID = H01XA5_A7521CNDSPRPRID[0] ;
         n7521CNDSPRPRID = H01XA5_n7521CNDSPRPRID[0] ;
         A7566CNDSPRTRN = H01XA5_A7566CNDSPRTRN[0] ;
         n7566CNDSPRTRN = H01XA5_n7566CNDSPRTRN[0] ;
         A7523CNDSPRFCON = H01XA5_A7523CNDSPRFCON[0] ;
         n7523CNDSPRFCON = H01XA5_n7523CNDSPRFCON[0] ;
         A7524CNDSPRFOLCON = H01XA5_A7524CNDSPRFOLCON[0] ;
         n7524CNDSPRFOLCON = H01XA5_n7524CNDSPRFOLCON[0] ;
         A7526CNDSPRMNTANT = H01XA5_A7526CNDSPRMNTANT[0] ;
         n7526CNDSPRMNTANT = H01XA5_n7526CNDSPRMNTANT[0] ;
         A7527CNDSPRMON = H01XA5_A7527CNDSPRMON[0] ;
         n7527CNDSPRMON = H01XA5_n7527CNDSPRMON[0] ;
         A7528CNDSPRFITR = H01XA5_A7528CNDSPRFITR[0] ;
         n7528CNDSPRFITR = H01XA5_n7528CNDSPRFITR[0] ;
         A7529CNDSPRFFTR = H01XA5_A7529CNDSPRFFTR[0] ;
         n7529CNDSPRFFTR = H01XA5_n7529CNDSPRFFTR[0] ;
         A7533CNDSPRMNTCON = H01XA5_A7533CNDSPRMNTCON[0] ;
         n7533CNDSPRMNTCON = H01XA5_n7533CNDSPRMNTCON[0] ;
         A7536CNDSPRIMPBAS = H01XA5_A7536CNDSPRIMPBAS[0] ;
         n7536CNDSPRIMPBAS = H01XA5_n7536CNDSPRIMPBAS[0] ;
         A7530CNDSPRRESCON = H01XA5_A7530CNDSPRRESCON[0] ;
         n7530CNDSPRRESCON = H01XA5_n7530CNDSPRRESCON[0] ;
         A14386CNDSPRURS = H01XA5_A14386CNDSPRURS[0] ;
         n14386CNDSPRURS = H01XA5_n14386CNDSPRURS[0] ;
         AV97archivos = httpContext.convertURL( context.getHttpContext().getImagePath( "239e6af9-4e29-4812-8748-b1ea1317ece6", "", context.getHttpContext().getTheme( ))) ;
         AV88CNDSPRPRID = A7521CNDSPRPRID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88CNDSPRPRID", AV88CNDSPRPRID);
         AV89CNDSPRCON = A7522CNDSPRCON ;
         GXv_char2[0] = AV58PMCTPRDSC ;
         GXv_char1[0] = "" ;
         new com.kdsproyectos.kds0003(remoteHandle, context).execute( AV88CNDSPRPRID, GXv_char2, GXv_char1) ;
         wpavdest_impl.this.AV58PMCTPRDSC = GXv_char2[0] ;
         GXv_char2[0] = AV90CNCDIRNOM ;
         new com.kdsproyectos.pcncdir(remoteHandle, context).execute( AV89CNDSPRCON, GXv_char2) ;
         wpavdest_impl.this.AV90CNCDIRNOM = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_Internalname, AV90CNCDIRNOM);
         AV62REC2 = "<i class=\"KDSButton\">add_circle</i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRec2_Internalname, AV62REC2);
         AV92alta = "<span class=\"material-icons\"> manage_search</span>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavAlta_Internalname, AV92alta);
         AV86CNDSPRTDC = A7519CNDSPRTDC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtdc_Internalname, AV86CNDSPRTDC);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
         /* Execute user subroutine: 'DOCUMENTO' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         AV87CNDSPRNDC = A7520CNDSPRNDC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprndc_Internalname, GXutil.ltrim( GXutil.str( AV87CNDSPRNDC, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRNDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")));
         AV77CNDSPRTRN = A7566CNDSPRTRN ;
         AV78CNDSPRFCON = A7523CNDSPRFCON ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfcon_Internalname, localUtil.format(AV78CNDSPRFCON, "99/99/99"));
         AV79CNDSPRFOLCON = A7524CNDSPRFOLCON ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfolcon_Internalname, AV79CNDSPRFOLCON);
         AV80CNDSPRMNTANT = A7526CNDSPRMNTANT ;
         AV81CNDSPRMON = A7527CNDSPRMON ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprmon_Internalname, AV81CNDSPRMON);
         AV82CNDSPRFITR = A7528CNDSPRFITR ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfitr_Internalname, localUtil.format(AV82CNDSPRFITR, "99/99/99"));
         AV83CNDSPRFFTR = A7529CNDSPRFFTR ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprfftr_Internalname, localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
         AV85CNDSPRMNTCON = A7533CNDSPRMNTCON ;
         AV94CNDSPRIMPBAS = A7536CNDSPRIMPBAS ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprimpbas_Internalname, GXutil.ltrim( GXutil.str( AV94CNDSPRIMPBAS, 15, 2)));
         AV115CNDSPRRESCON = A7530CNDSPRRESCON ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprrescon_Internalname, AV115CNDSPRRESCON);
         /* Execute user subroutine: 'MONTOREGISTRADO' */
         S145 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'ALCANCETRABAJO' */
         S155 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'RESPONSABLE' */
         S165 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         if ( new com.kdsproyectos.kds0026(remoteHandle, context).executeUdp( AV44CNUSERID, A7521CNDSPRPRID) == 1 )
         {
            if ( GXutil.strcmp(A14386CNDSPRURS, "S") != 0 )
            {
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(17) ;
               }
               sendrow_172( ) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
               {
                  httpContext.doAjaxLoad(17, Grid1Row);
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /*  Sending Event outputs  */
   }

   public void S165( )
   {
      /* 'RESPONSABLE' Routine */
      AV120CNCDIRNOM_RES = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_res_Internalname, AV120CNCDIRNOM_RES);
      /* Using cursor H01XA6 */
      pr_default.execute(4, new Object[] {AV88CNDSPRPRID});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A171PMCTPRID = H01XA6_A171PMCTPRID[0] ;
         A6299PMCTPREJ = H01XA6_A6299PMCTPREJ[0] ;
         n6299PMCTPREJ = H01XA6_n6299PMCTPREJ[0] ;
         AV119PMCTPREJ = A6299PMCTPREJ ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119PMCTPREJ", GXutil.ltrim( GXutil.str( AV119PMCTPREJ, 10, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Using cursor H01XA7 */
      pr_default.execute(5, new Object[] {new Long(AV119PMCTPREJ)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A46CNCDIRID = H01XA7_A46CNCDIRID[0] ;
         A194CNCDIRNOM = H01XA7_A194CNCDIRNOM[0] ;
         n194CNCDIRNOM = H01XA7_n194CNCDIRNOM[0] ;
         AV120CNCDIRNOM_RES = A194CNCDIRNOM ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCncdirnom_res_Internalname, AV120CNCDIRNOM_RES);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S145( )
   {
      /* 'MONTOREGISTRADO' Routine */
      AV109montopendiente = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
      AV107MONTOACUMULADO = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
      AV106MONTO = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
      AV105CANTTOT = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H01XA8 */
      pr_default.execute(6, new Object[] {new Long(AV31CNCIASID), new Long(AV87CNDSPRNDC), AV86CNDSPRTDC});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A7789AVDSPRCIA = H01XA8_A7789AVDSPRCIA[0] ;
         A8255AVDSPRDOC = H01XA8_A8255AVDSPRDOC[0] ;
         A20CNTDOCID = H01XA8_A20CNTDOCID[0] ;
         A7800AVDSPREST = H01XA8_A7800AVDSPREST[0] ;
         n7800AVDSPREST = H01XA8_n7800AVDSPREST[0] ;
         A7862AVDSPRCAN = H01XA8_A7862AVDSPRCAN[0] ;
         n7862AVDSPRCAN = H01XA8_n7862AVDSPRCAN[0] ;
         A7795AVDSPRIMP = H01XA8_A7795AVDSPRIMP[0] ;
         n7795AVDSPRIMP = H01XA8_n7795AVDSPRIMP[0] ;
         A7792AVDSPRLIN = H01XA8_A7792AVDSPRLIN[0] ;
         AV102AVDSPRCAN = A7862AVDSPRCAN ;
         AV103AVDSPRIMP = A7795AVDSPRIMP ;
         AV104AVDSPREST = A7800AVDSPREST ;
         AV105CANTTOT = AV105CANTTOT.add(AV102AVDSPRCAN) ;
         AV106MONTO = AV106MONTO.add(AV103AVDSPRIMP) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMonto_Internalname, GXutil.ltrim( GXutil.str( AV106MONTO, 15, 2)));
         if ( GXutil.strcmp(A7800AVDSPREST, "Autorizado") == 0 )
         {
            AV107MONTOACUMULADO = AV107MONTOACUMULADO.add(AV103AVDSPRIMP) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMontoacumulado_Internalname, GXutil.ltrim( GXutil.str( AV107MONTOACUMULADO, 15, 2)));
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV111CNDSPRTRIMP = DecimalUtil.doubleToDec(0) ;
      AV114CNDSPRTRNDC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
      /* Using cursor H01XA9 */
      pr_default.execute(7, new Object[] {new Long(AV31CNCIASID), AV86CNDSPRTDC, new Long(AV87CNDSPRNDC)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A7520CNDSPRNDC = H01XA9_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H01XA9_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H01XA9_A7518CNDSPRCIA[0] ;
         A7545CNDSPRTRIMP = H01XA9_A7545CNDSPRTRIMP[0] ;
         n7545CNDSPRTRIMP = H01XA9_n7545CNDSPRTRIMP[0] ;
         A7601CNDSPRTRNDC = H01XA9_A7601CNDSPRTRNDC[0] ;
         n7601CNDSPRTRNDC = H01XA9_n7601CNDSPRTRNDC[0] ;
         AV111CNDSPRTRIMP = A7545CNDSPRTRIMP ;
         AV114CNDSPRTRNDC = A7601CNDSPRTRNDC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtrndc_Internalname, GXutil.ltrim( GXutil.str( AV114CNDSPRTRNDC, 10, 0)));
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV109montopendiente = AV111CNDSPRTRIMP.subtract(AV106MONTO) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMontopendiente_Internalname, GXutil.ltrim( GXutil.str( AV109montopendiente, 15, 2)));
   }

   public void S155( )
   {
      /* 'ALCANCETRABAJO' Routine */
      AV84CNDSPRALCTR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCndspralctr_Internalname, AV84CNDSPRALCTR);
      /* Using cursor H01XA10 */
      pr_default.execute(8, new Object[] {new Long(AV31CNCIASID), AV86CNDSPRTDC, new Long(AV87CNDSPRNDC)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A7520CNDSPRNDC = H01XA10_A7520CNDSPRNDC[0] ;
         A7519CNDSPRTDC = H01XA10_A7519CNDSPRTDC[0] ;
         A7518CNDSPRCIA = H01XA10_A7518CNDSPRCIA[0] ;
         A7550CNDSPRTRALC = H01XA10_A7550CNDSPRTRALC[0] ;
         n7550CNDSPRTRALC = H01XA10_n7550CNDSPRTRALC[0] ;
         AV84CNDSPRALCTR = A7550CNDSPRTRALC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCndspralctr_Internalname, AV84CNDSPRALCTR);
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S192( )
   {
      /* 'CONSULTARTIPOA' Routine */
      AV49INTPALID = "" ;
      /* Using cursor H01XA11 */
      pr_default.execute(9, new Object[] {new Long(AV19ACMVOIPRID)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A281INPRODID = H01XA11_A281INPRODID[0] ;
         A1148INTPALID = H01XA11_A1148INTPALID[0] ;
         n1148INTPALID = H01XA11_n1148INTPALID[0] ;
         AV49INTPALID = A1148INTPALID ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void e131XA2( )
   {
      /* 'consultar' Routine */
      AV45consultar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45consultar", AV45consultar);
      gxgrgrid1_refresh( A7520CNDSPRNDC, A7518CNDSPRCIA, AV31CNCIASID, A7519CNDSPRTDC, AV76tdc, AV75ndc, A7521CNDSPRPRID, AV60PMCTPRID, A46CNCDIRID, A7522CNDSPRCON, AV24CNCDIRID, A7927CNDSPREST, A9293CNDSPRTREST, AV45consultar, A7566CNDSPRTRN, A7523CNDSPRFCON, A7524CNDSPRFOLCON, A7526CNDSPRMNTANT, A7527CNDSPRMON, A7528CNDSPRFITR, A7529CNDSPRFFTR, A7533CNDSPRMNTCON, A7536CNDSPRIMPBAS, A7530CNDSPRRESCON, AV44CNUSERID, A14386CNDSPRURS, A20CNTDOCID, AV86CNDSPRTDC, A21CNTDOCDSC, A7792AVDSPRLIN, A7789AVDSPRCIA, A8255AVDSPRDOC, AV87CNDSPRNDC, A7800AVDSPREST, A7862AVDSPRCAN, A7795AVDSPRIMP, A7545CNDSPRTRIMP, A7601CNDSPRTRNDC, A7550CNDSPRTRALC, A171PMCTPRID, AV88CNDSPRPRID, A6299PMCTPREJ, A194CNCDIRNOM) ;
      /*  Sending Event outputs  */
   }

   public void e161XA2( )
   {
      /* 'agregarAvance2' Routine */
      AV50KDSSESSION.setValue("CNDSPRCIA", GXutil.str( AV31CNCIASID, 10, 0));
      AV50KDSSESSION.setValue("CNDSPRNDC", GXutil.str( AV87CNDSPRNDC, 10, 0));
      AV50KDSSESSION.setValue("CNUSERID", AV44CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "AV44CNUSERID", AV44CNUSERID);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNUSERID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44CNUSERID, ""))));
      AV50KDSSESSION.setValue("CNDSPRTDC", AV86CNDSPRTDC);
      httpContext.ajax_rsp_assign_attri("", false, edtavCndsprtdc_Internalname, AV86CNDSPRTDC);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCNDSPRTDC"+"_"+sGXsfl_17_idx, getSecureSignedToken( sGXsfl_17_idx, GXutil.rtrim( localUtil.format( AV86CNDSPRTDC, ""))));
      lblTxtscript_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.wpregavacs") +"\",\"_blank\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtscript_Internalname, "Caption", lblTxtscript_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e121XA2( )
   {
      /* Cncdirnom_f2_Isvalid Routine */
      /* Execute user subroutine: 'PROVEEDOR' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S172( )
   {
      /* 'PROVEEDOR' Routine */
      if ( GXutil.strcmp(AV28CNCDIRNOM_F2, "") != 0 )
      {
         AV133GXLvl227 = (byte)(0) ;
         /* Using cursor H01XA12 */
         pr_default.execute(10, new Object[] {AV28CNCDIRNOM_F2});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A7563CNCDIRCON = H01XA12_A7563CNCDIRCON[0] ;
            n7563CNCDIRCON = H01XA12_n7563CNCDIRCON[0] ;
            A382CNTPDRID = H01XA12_A382CNTPDRID[0] ;
            n382CNTPDRID = H01XA12_n382CNTPDRID[0] ;
            A194CNCDIRNOM = H01XA12_A194CNCDIRNOM[0] ;
            n194CNCDIRNOM = H01XA12_n194CNCDIRNOM[0] ;
            A46CNCDIRID = H01XA12_A46CNCDIRID[0] ;
            AV133GXLvl227 = (byte)(1) ;
            AV24CNCDIRID = A46CNCDIRID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CNCDIRID", GXutil.ltrim( GXutil.str( AV24CNCDIRID, 10, 0)));
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( AV133GXLvl227 == 0 )
         {
            AV24CNCDIRID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CNCDIRID", GXutil.ltrim( GXutil.str( AV24CNCDIRID, 10, 0)));
         }
      }
      else
      {
         AV24CNCDIRID = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24CNCDIRID", GXutil.ltrim( GXutil.str( AV24CNCDIRID, 10, 0)));
      }
   }

   public void S112( )
   {
      /* 'CERRAR' Routine */
      lblTxtsalir_Caption = "<script>window.open(\""+formatLink("com.kdsproyectos.wpavdest") +"\",\"_self\").close();</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtsalir_Internalname, "Caption", lblTxtsalir_Caption, true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e171XA2 ();
      if (returnInSub) return;
   }

   public void e171XA2( )
   {
      /* Enter Routine */
      AV45consultar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45consultar", AV45consultar);
      gxgrgrid1_refresh( A7520CNDSPRNDC, A7518CNDSPRCIA, AV31CNCIASID, A7519CNDSPRTDC, AV76tdc, AV75ndc, A7521CNDSPRPRID, AV60PMCTPRID, A46CNCDIRID, A7522CNDSPRCON, AV24CNCDIRID, A7927CNDSPREST, A9293CNDSPRTREST, AV45consultar, A7566CNDSPRTRN, A7523CNDSPRFCON, A7524CNDSPRFOLCON, A7526CNDSPRMNTANT, A7527CNDSPRMON, A7528CNDSPRFITR, A7529CNDSPRFFTR, A7533CNDSPRMNTCON, A7536CNDSPRIMPBAS, A7530CNDSPRRESCON, AV44CNUSERID, A14386CNDSPRURS, A20CNTDOCID, AV86CNDSPRTDC, A21CNTDOCDSC, A7792AVDSPRLIN, A7789AVDSPRCIA, A8255AVDSPRDOC, AV87CNDSPRNDC, A7800AVDSPREST, A7862AVDSPRCAN, A7795AVDSPRIMP, A7545CNDSPRTRIMP, A7601CNDSPRTRNDC, A7550CNDSPRTRALC, A171PMCTPRID, AV88CNDSPRPRID, A6299PMCTPREJ, A194CNCDIRNOM) ;
      /*  Sending Event outputs  */
   }

   public void S135( )
   {
      /* 'DOCUMENTO' Routine */
      /* Using cursor H01XA13 */
      pr_default.execute(11, new Object[] {AV86CNDSPRTDC});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A20CNTDOCID = H01XA13_A20CNTDOCID[0] ;
         A21CNTDOCDSC = H01XA13_A21CNTDOCDSC[0] ;
         n21CNTDOCDSC = H01XA13_n21CNTDOCDSC[0] ;
         AV93CNTDOCDSC = A21CNTDOCDSC ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCntdocdsc_Internalname, AV93CNTDOCDSC);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void wb_table2_38_1XA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblKdsfilterleft_Internalname, tblKdsfilterleft_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-left;text-align:-moz-left;text-align:-webkit-left;height:40px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblKdsaplicarcriterios2_Internalname, "Criterios de selección", "", "", lblKdsaplicarcriterios2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-left;text-align:-moz-left;text-align:-webkit-left;vertical-align:top")+"\" class='KDSFilterLeftContent'>") ;
         wb_table3_44_1XA2( true) ;
      }
      else
      {
         wb_table3_44_1XA2( false) ;
      }
      return  ;
   }

   public void wb_table3_44_1XA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucMensaje.setProperty("Title", Mensaje_Title);
         ucMensaje.render(context, "gxui.message", Mensaje_Internalname, "MENSAJEContainer");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtscript_Internalname, lblTxtscript_Caption, "", "", lblTxtscript_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblTxtscript_Visible, 1, (short)(1), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_38_1XA2e( true) ;
      }
      else
      {
         wb_table2_38_1XA2e( false) ;
      }
   }

   public void wb_table3_44_1XA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 380, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblKdsfilterlist_Internalname, tblKdsfilterlist_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "Compañia", "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-left;text-align:-moz-left;text-align:-webkit-left")+"\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCnciasid, cmbavCnciasid.getInternalname(), GXutil.trim( GXutil.str( AV31CNCIASID, 10, 0)), 1, cmbavCnciasid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavCnciasid.getEnabled(), 1, (short)(0), 358, "px", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,50);\"", "", true, "HLP_wpavdest.htm");
         cmbavCnciasid.setValue( GXutil.trim( GXutil.str( AV31CNCIASID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCnciasid.getInternalname(), "Values", cmbavCnciasid.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "Proyecto", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:25px")+"\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPmctprid, cmbavPmctprid.getInternalname(), GXutil.rtrim( AV60PMCTPRID), 1, cmbavPmctprid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, 1, 0, (short)(0), 358, "px", 0, "", "font-family:'Microsoft Sans Serif'; font-size:9.0pt; font-weight:normal; font-style:normal;", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,56);\"", "", true, "HLP_wpavdest.htm");
         cmbavPmctprid.setValue( GXutil.rtrim( AV60PMCTPRID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPmctprid.getInternalname(), "Values", cmbavPmctprid.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:16px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "Tipo de Documento", "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         /* ComboBox */
         com.kdsproyectos.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTdc, cmbavTdc.getInternalname(), GXutil.rtrim( AV76tdc), 1, cmbavTdc.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, 1, 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,62);\"", "", true, "HLP_wpavdest.htm");
         cmbavTdc.setValue( GXutil.rtrim( AV76tdc) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTdc.getInternalname(), "Values", cmbavTdc.ToJavascriptSource(), true);
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "No de Documento", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:23px")+"\">") ;
         httpContext.writeText( "&nbsp;") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavNdc_Internalname, GXutil.ltrim( localUtil.ntoc( AV75ndc, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75ndc), "ZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNdc_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "number", "1", 80, "px", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:24px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "Contratista", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "height:17px")+"\">") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.kdsproyectos.GxWebStd.gx_html_textarea( httpContext, edtavCncdirnom_f2_Internalname, GXutil.rtrim( AV28CNCDIRNOM_F2), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,74);\"", (short)(0), 1, edtavCncdirnom_f2_Enabled, 0, 358, "px", 4, "row", StyleString, ClassString, "", "", "250", 1, 0, "", "", (byte)(0), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_17_idx + "',0)\"" ;
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCncdirid_Internalname, GXutil.ltrim( localUtil.ntoc( AV24CNCDIRID, (byte)(10), (byte)(0), ".", "")), ((edtavCncdirid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CNCDIRID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV24CNCDIRID), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCncdirid_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCncdirid_Enabled, 0, "number", "1", 358, "px", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;height:80px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblKdsaplicarcriterios_Internalname, "Aplicar criterios de selección", "", "", lblKdsaplicarcriterios_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "font-family:'Arial'; font-size:12.0pt; font-weight:bold; font-style:normal;", "KDSAplicarCriterios", 5, "", 1, 1, (short)(0), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_44_1XA2e( true) ;
      }
      else
      {
         wb_table3_44_1XA2e( false) ;
      }
   }

   public void wb_table1_3_1XA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1250, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblKdstablacontenido_Internalname, tblKdstablacontenido_Internalname, "", "mpHolder", 0, "center", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center;vertical-align:top")+"\">") ;
         wb_table4_6_1XA2( true) ;
      }
      else
      {
         wb_table4_6_1XA2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1XA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_3_1XA2e( true) ;
      }
      else
      {
         wb_table1_3_1XA2e( false) ;
      }
   }

   public void wb_table4_6_1XA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "", 0, "center", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         wb_table5_9_1XA2( true) ;
      }
      else
      {
         wb_table5_9_1XA2( false) ;
      }
      return  ;
   }

   public void wb_table5_9_1XA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"17\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1300, 10, 0)) + "px" + ";" ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 35, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 35, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Registro Avance") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 160, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Proyecto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 40, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Contrato de Servicio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Contratista") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Folio del contrato") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 410, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Alcance ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 98, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Fecha de contrato") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 44, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Moneda") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 118, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Monto del contrato") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 118, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Avance Autorizado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 118, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Avance Registrado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 118, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Monto Pendiente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 66, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Fecha Inicial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Fecha Final") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 180, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 180, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:8.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Requisición") ;
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
            Grid1Container.AddObjectProperty("Titlefont", GXutil.rtrim( subGrid1_Titlefont));
            Grid1Container.AddObjectProperty("Linesfont", GXutil.rtrim( subGrid1_Linesfont));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV62REC2);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRec2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV92alta);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlta_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV93CNTDOCDSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCntdocdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV58PMCTPRDSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPmctprdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV86CNDSPRTDC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtdc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV87CNDSPRNDC, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprndc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV90CNCDIRNOM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCncdirnom_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV79CNDSPRFOLCON));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprfolcon_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV84CNDSPRALCTR);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndspralctr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV78CNDSPRFCON, "99/99/99"));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprfcon_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV81CNDSPRMON));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprmon_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV94CNDSPRIMPBAS, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprimpbas_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV107MONTOACUMULADO, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMontoacumulado_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV106MONTO, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMonto_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV109montopendiente, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMontopendiente_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV82CNDSPRFITR, "99/99/99"));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprfitr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(AV83CNDSPRFFTR, "99/99/99"));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprfftr_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV120CNCDIRNOM_RES));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCncdirnom_res_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV115CNDSPRRESCON));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprrescon_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV114CNDSPRTRNDC, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCndsprtrndc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (short)(nGXsfl_17_idx-1) ;
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_6_1XA2e( true) ;
      }
      else
      {
         wb_table4_6_1XA2e( false) ;
      }
   }

   public void wb_table5_9_1XA2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-left;text-align:-moz-left;text-align:-webkit-left;width:400px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtsalir_Internalname, lblTxtsalir_Caption, "", "", lblTxtsalir_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_wpavdest.htm");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtbuscar_Internalname, lblTxtbuscar_Caption, "", "", lblTxtbuscar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'CONSULTAR\\'."+"'", "", "", 5, "Consultar", 1, 1, (short)(1), "HLP_wpavdest.htm");
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtsalir2_Internalname, lblTxtsalir2_Caption, "", "", lblTxtsalir2_Jsonclick, "'"+""+"'"+",false,"+"'"+"e181xa1_client"+"'", "", "", 7, "Salir", 1, 1, (short)(1), "HLP_wpavdest.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_9_1XA2e( true) ;
      }
      else
      {
         wb_table5_9_1XA2e( false) ;
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
      pa1XA2( ) ;
      ws1XA2( ) ;
      we1XA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202541410112359", true, true);
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
      httpContext.AddJavascriptSource("wpavdest.js", "?202541410112360", false, true);
      httpContext.AddJavascriptSource("Shared/ext/ext-all.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("gxui/gxui-all.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      edtavRec2_Internalname = "vREC2_"+sGXsfl_17_idx ;
      edtavAlta_Internalname = "vALTA_"+sGXsfl_17_idx ;
      edtavCntdocdsc_Internalname = "vCNTDOCDSC_"+sGXsfl_17_idx ;
      edtavPmctprdsc_Internalname = "vPMCTPRDSC_"+sGXsfl_17_idx ;
      edtavCndsprtdc_Internalname = "vCNDSPRTDC_"+sGXsfl_17_idx ;
      edtavCndsprndc_Internalname = "vCNDSPRNDC_"+sGXsfl_17_idx ;
      edtavCncdirnom_Internalname = "vCNCDIRNOM_"+sGXsfl_17_idx ;
      edtavCndsprfolcon_Internalname = "vCNDSPRFOLCON_"+sGXsfl_17_idx ;
      edtavCndspralctr_Internalname = "vCNDSPRALCTR_"+sGXsfl_17_idx ;
      edtavCndsprfcon_Internalname = "vCNDSPRFCON_"+sGXsfl_17_idx ;
      edtavCndsprmon_Internalname = "vCNDSPRMON_"+sGXsfl_17_idx ;
      edtavCndsprimpbas_Internalname = "vCNDSPRIMPBAS_"+sGXsfl_17_idx ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO_"+sGXsfl_17_idx ;
      edtavMonto_Internalname = "vMONTO_"+sGXsfl_17_idx ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE_"+sGXsfl_17_idx ;
      edtavCndsprfitr_Internalname = "vCNDSPRFITR_"+sGXsfl_17_idx ;
      edtavCndsprfftr_Internalname = "vCNDSPRFFTR_"+sGXsfl_17_idx ;
      edtavCncdirnom_res_Internalname = "vCNCDIRNOM_RES_"+sGXsfl_17_idx ;
      edtavCndsprrescon_Internalname = "vCNDSPRRESCON_"+sGXsfl_17_idx ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtavRec2_Internalname = "vREC2_"+sGXsfl_17_fel_idx ;
      edtavAlta_Internalname = "vALTA_"+sGXsfl_17_fel_idx ;
      edtavCntdocdsc_Internalname = "vCNTDOCDSC_"+sGXsfl_17_fel_idx ;
      edtavPmctprdsc_Internalname = "vPMCTPRDSC_"+sGXsfl_17_fel_idx ;
      edtavCndsprtdc_Internalname = "vCNDSPRTDC_"+sGXsfl_17_fel_idx ;
      edtavCndsprndc_Internalname = "vCNDSPRNDC_"+sGXsfl_17_fel_idx ;
      edtavCncdirnom_Internalname = "vCNCDIRNOM_"+sGXsfl_17_fel_idx ;
      edtavCndsprfolcon_Internalname = "vCNDSPRFOLCON_"+sGXsfl_17_fel_idx ;
      edtavCndspralctr_Internalname = "vCNDSPRALCTR_"+sGXsfl_17_fel_idx ;
      edtavCndsprfcon_Internalname = "vCNDSPRFCON_"+sGXsfl_17_fel_idx ;
      edtavCndsprmon_Internalname = "vCNDSPRMON_"+sGXsfl_17_fel_idx ;
      edtavCndsprimpbas_Internalname = "vCNDSPRIMPBAS_"+sGXsfl_17_fel_idx ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO_"+sGXsfl_17_fel_idx ;
      edtavMonto_Internalname = "vMONTO_"+sGXsfl_17_fel_idx ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE_"+sGXsfl_17_fel_idx ;
      edtavCndsprfitr_Internalname = "vCNDSPRFITR_"+sGXsfl_17_fel_idx ;
      edtavCndsprfftr_Internalname = "vCNDSPRFFTR_"+sGXsfl_17_fel_idx ;
      edtavCncdirnom_res_Internalname = "vCNCDIRNOM_RES_"+sGXsfl_17_fel_idx ;
      edtavCndsprrescon_Internalname = "vCNDSPRRESCON_"+sGXsfl_17_fel_idx ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb1XA0( ) ;
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
         if ( ((int)(((nGXsfl_17_idx-1)/ (double) (1)) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavRec2_Enabled!=0)&&(edtavRec2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRec2_Internalname,AV62REC2,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRec2_Enabled!=0)&&(edtavRec2_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,18);\"" : " "),"'"+""+"'"+",false,"+"'"+"E\\'AGREGARAVANCE2\\'."+sGXsfl_17_idx+"'","","","Generar registro de avance","",edtavRec2_Jsonclick,new Integer(5),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavRec2_Enabled),new Integer(0),"text","",new Integer(35),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(1),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavAlta_Enabled!=0)&&(edtavAlta_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlta_Internalname,AV92alta,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAlta_Enabled!=0)&&(edtavAlta_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,19);\"" : " "),"'"+""+"'"+",false,"+"'"+"e191xa2_client"+"'","","","Registros Avance","",edtavAlta_Jsonclick,new Integer(7),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavAlta_Enabled),new Integer(0),"text","",new Integer(35),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(1),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCntdocdsc_Enabled!=0)&&(edtavCntdocdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 20,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCntdocdsc_Internalname,GXutil.rtrim( AV93CNTDOCDSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCntdocdsc_Enabled!=0)&&(edtavCntdocdsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,20);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCntdocdsc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavCntdocdsc_Enabled),new Integer(0),"text","",new Integer(160),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavPmctprdsc_Enabled!=0)&&(edtavPmctprdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPmctprdsc_Internalname,GXutil.rtrim( AV58PMCTPRDSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavPmctprdsc_Enabled!=0)&&(edtavPmctprdsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,21);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPmctprdsc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavPmctprdsc_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtdc_Enabled!=0)&&(edtavCndsprtdc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 22,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtdc_Internalname,GXutil.rtrim( AV86CNDSPRTDC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprtdc_Enabled!=0)&&(edtavCndsprtdc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,22);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtdc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavCndsprtdc_Enabled),new Integer(0),"text","",new Integer(40),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprndc_Enabled!=0)&&(edtavCndsprndc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 23,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprndc_Internalname,GXutil.ltrim( localUtil.ntoc( AV87CNDSPRNDC, (byte)(10), (byte)(0), ".", "")),((edtavCndsprndc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV87CNDSPRNDC), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprndc_Enabled!=0)&&(edtavCndsprndc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,23);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprndc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprndc_Enabled),new Integer(0),"number","1",new Integer(60),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCncdirnom_Enabled!=0)&&(edtavCncdirnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 24,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCncdirnom_Internalname,GXutil.rtrim( AV90CNCDIRNOM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCncdirnom_Enabled!=0)&&(edtavCncdirnom_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,24);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCncdirnom_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCncdirnom_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(250),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprfolcon_Enabled!=0)&&(edtavCndsprfolcon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 25,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprfolcon_Internalname,GXutil.rtrim( AV79CNDSPRFOLCON),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprfolcon_Enabled!=0)&&(edtavCndsprfolcon_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprfolcon_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprfolcon_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndspralctr_Enabled!=0)&&(edtavCndspralctr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 26,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndspralctr_Internalname,AV84CNDSPRALCTR,AV84CNDSPRALCTR,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndspralctr_Enabled!=0)&&(edtavCndspralctr_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,26);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndspralctr_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndspralctr_Enabled),new Integer(0),"text","",new Integer(410),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprfcon_Enabled!=0)&&(edtavCndsprfcon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 27,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprfcon_Internalname,localUtil.format(AV78CNDSPRFCON, "99/99/99"),localUtil.format( AV78CNDSPRFCON, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCndsprfcon_Enabled!=0)&&(edtavCndsprfcon_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,27);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprfcon_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprfcon_Enabled),new Integer(0),"text","",new Integer(98),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprmon_Enabled!=0)&&(edtavCndsprmon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 28,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprmon_Internalname,GXutil.rtrim( AV81CNDSPRMON),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprmon_Enabled!=0)&&(edtavCndsprmon_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,28);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprmon_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprmon_Enabled),new Integer(0),"text","",new Integer(44),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprimpbas_Enabled!=0)&&(edtavCndsprimpbas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 29,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprimpbas_Internalname,GXutil.ltrim( localUtil.ntoc( AV94CNDSPRIMPBAS, (byte)(18), (byte)(2), ".", "")),((edtavCndsprimpbas_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV94CNDSPRIMPBAS, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV94CNDSPRIMPBAS, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprimpbas_Enabled!=0)&&(edtavCndsprimpbas_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,29);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprimpbas_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprimpbas_Enabled),new Integer(0),"text","",new Integer(118),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavMontoacumulado_Enabled!=0)&&(edtavMontoacumulado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 30,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMontoacumulado_Internalname,GXutil.ltrim( localUtil.ntoc( AV107MONTOACUMULADO, (byte)(18), (byte)(2), ".", "")),((edtavMontoacumulado_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV107MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV107MONTOACUMULADO, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMontoacumulado_Enabled!=0)&&(edtavMontoacumulado_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,30);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMontoacumulado_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(-1),new Integer(edtavMontoacumulado_Enabled),new Integer(0),"text","",new Integer(118),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavMonto_Enabled!=0)&&(edtavMonto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 31,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMonto_Internalname,GXutil.ltrim( localUtil.ntoc( AV106MONTO, (byte)(18), (byte)(2), ".", "")),((edtavMonto_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV106MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV106MONTO, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMonto_Enabled!=0)&&(edtavMonto_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,31);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMonto_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(-1),new Integer(edtavMonto_Enabled),new Integer(0),"text","",new Integer(118),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavMontopendiente_Enabled!=0)&&(edtavMontopendiente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 32,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMontopendiente_Internalname,GXutil.ltrim( localUtil.ntoc( AV109montopendiente, (byte)(18), (byte)(2), ".", "")),((edtavMontopendiente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV109montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV109montopendiente, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavMontopendiente_Enabled!=0)&&(edtavMontopendiente_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,32);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMontopendiente_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(-1),new Integer(edtavMontopendiente_Enabled),new Integer(0),"text","",new Integer(118),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprfitr_Enabled!=0)&&(edtavCndsprfitr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 33,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprfitr_Internalname,localUtil.format(AV82CNDSPRFITR, "99/99/99"),localUtil.format( AV82CNDSPRFITR, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCndsprfitr_Enabled!=0)&&(edtavCndsprfitr_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,33);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprfitr_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprfitr_Enabled),new Integer(0),"text","",new Integer(66),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprfftr_Enabled!=0)&&(edtavCndsprfftr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 34,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprfftr_Internalname,localUtil.format(AV83CNDSPRFFTR, "99/99/99"),localUtil.format( AV83CNDSPRFFTR, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'eng',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCndsprfftr_Enabled!=0)&&(edtavCndsprfftr_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,34);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprfftr_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprfftr_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","center",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCncdirnom_res_Enabled!=0)&&(edtavCncdirnom_res_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCncdirnom_res_Internalname,GXutil.rtrim( AV120CNCDIRNOM_RES),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCncdirnom_res_Enabled!=0)&&(edtavCncdirnom_res_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,35);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCncdirnom_res_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(-1),new Integer(edtavCncdirnom_res_Enabled),new Integer(0),"text","",new Integer(180),"px",new Integer(17),"px",new Integer(250),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprrescon_Enabled!=0)&&(edtavCndsprrescon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprrescon_Internalname,GXutil.rtrim( AV115CNDSPRRESCON),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCndsprrescon_Enabled!=0)&&(edtavCndsprrescon_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,36);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprrescon_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(0),new Integer(edtavCndsprrescon_Enabled),new Integer(0),"text","",new Integer(180),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCndsprtrndc_Enabled!=0)&&(edtavCndsprtrndc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCndsprtrndc_Internalname,GXutil.ltrim( localUtil.ntoc( AV114CNDSPRTRNDC, (byte)(10), (byte)(0), ".", "")),((edtavCndsprtrndc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV114CNDSPRTRNDC), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV114CNDSPRTRNDC), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavCndsprtrndc_Enabled!=0)&&(edtavCndsprtrndc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,37);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCndsprtrndc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:8.0pt; font-weight:normal; font-style:normal; color:#000000;",ROClassString,"","",new Integer(-1),new Integer(edtavCndsprtrndc_Enabled),new Integer(0),"number","1",new Integer(80),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(17),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      send_integrity_lvl_hashes1XA2( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_17_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_17_idx+1)) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_17_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      /* End function sendrow_172 */
   }

   public void init_default_properties( )
   {
      lblTxtsalir_Internalname = "TXTSALIR" ;
      lblTxtbuscar_Internalname = "TXTBUSCAR" ;
      lblTxtsalir2_Internalname = "TXTSALIR2" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      tblTable6_Internalname = "TABLE6" ;
      edtavRec2_Internalname = "vREC2" ;
      edtavAlta_Internalname = "vALTA" ;
      edtavCntdocdsc_Internalname = "vCNTDOCDSC" ;
      edtavPmctprdsc_Internalname = "vPMCTPRDSC" ;
      edtavCndsprtdc_Internalname = "vCNDSPRTDC" ;
      edtavCndsprndc_Internalname = "vCNDSPRNDC" ;
      edtavCncdirnom_Internalname = "vCNCDIRNOM" ;
      edtavCndsprfolcon_Internalname = "vCNDSPRFOLCON" ;
      edtavCndspralctr_Internalname = "vCNDSPRALCTR" ;
      edtavCndsprfcon_Internalname = "vCNDSPRFCON" ;
      edtavCndsprmon_Internalname = "vCNDSPRMON" ;
      edtavCndsprimpbas_Internalname = "vCNDSPRIMPBAS" ;
      edtavMontoacumulado_Internalname = "vMONTOACUMULADO" ;
      edtavMonto_Internalname = "vMONTO" ;
      edtavMontopendiente_Internalname = "vMONTOPENDIENTE" ;
      edtavCndsprfitr_Internalname = "vCNDSPRFITR" ;
      edtavCndsprfftr_Internalname = "vCNDSPRFFTR" ;
      edtavCncdirnom_res_Internalname = "vCNCDIRNOM_RES" ;
      edtavCndsprrescon_Internalname = "vCNDSPRRESCON" ;
      edtavCndsprtrndc_Internalname = "vCNDSPRTRNDC" ;
      tblTable1_Internalname = "TABLE1" ;
      tblKdstablacontenido_Internalname = "KDSTABLACONTENIDO" ;
      lblKdsaplicarcriterios2_Internalname = "KDSAPLICARCRITERIOS2" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      cmbavCnciasid.setInternalname( "vCNCIASID" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbavPmctprid.setInternalname( "vPMCTPRID" );
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      cmbavTdc.setInternalname( "vTDC" );
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavNdc_Internalname = "vNDC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavCncdirnom_f2_Internalname = "vCNCDIRNOM_F2" ;
      edtavCncdirid_Internalname = "vCNCDIRID" ;
      lblKdsaplicarcriterios_Internalname = "KDSAPLICARCRITERIOS" ;
      tblKdsfilterlist_Internalname = "KDSFILTERLIST" ;
      Mensaje_Internalname = "MENSAJE" ;
      lblTxtscript_Internalname = "TXTSCRIPT" ;
      tblKdsfilterleft_Internalname = "KDSFILTERLEFT" ;
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
      edtavCndsprtrndc_Jsonclick = "" ;
      edtavCndsprtrndc_Visible = -1 ;
      edtavCndsprrescon_Jsonclick = "" ;
      edtavCndsprrescon_Visible = 0 ;
      edtavCncdirnom_res_Jsonclick = "" ;
      edtavCncdirnom_res_Visible = -1 ;
      edtavCndsprfftr_Jsonclick = "" ;
      edtavCndsprfftr_Visible = -1 ;
      edtavCndsprfitr_Jsonclick = "" ;
      edtavCndsprfitr_Visible = -1 ;
      edtavMontopendiente_Jsonclick = "" ;
      edtavMontopendiente_Visible = -1 ;
      edtavMonto_Jsonclick = "" ;
      edtavMonto_Visible = -1 ;
      edtavMontoacumulado_Jsonclick = "" ;
      edtavMontoacumulado_Visible = -1 ;
      edtavCndsprimpbas_Jsonclick = "" ;
      edtavCndsprimpbas_Visible = -1 ;
      edtavCndsprmon_Jsonclick = "" ;
      edtavCndsprmon_Visible = -1 ;
      edtavCndsprfcon_Jsonclick = "" ;
      edtavCndsprfcon_Visible = -1 ;
      edtavCndspralctr_Jsonclick = "" ;
      edtavCndspralctr_Visible = -1 ;
      edtavCndsprfolcon_Jsonclick = "" ;
      edtavCndsprfolcon_Visible = -1 ;
      edtavCncdirnom_Jsonclick = "" ;
      edtavCncdirnom_Visible = -1 ;
      edtavCndsprndc_Jsonclick = "" ;
      edtavCndsprndc_Visible = -1 ;
      edtavCndsprtdc_Jsonclick = "" ;
      edtavCndsprtdc_Visible = 0 ;
      edtavPmctprdsc_Jsonclick = "" ;
      edtavPmctprdsc_Visible = -1 ;
      edtavCntdocdsc_Jsonclick = "" ;
      edtavCntdocdsc_Visible = 0 ;
      edtavAlta_Jsonclick = "" ;
      edtavAlta_Visible = -1 ;
      edtavRec2_Jsonclick = "" ;
      edtavRec2_Visible = -1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Hoveringcolor = (int)(0x00C0C0) ;
      subGrid1_Allowhovering = (byte)(-1) ;
      subGrid1_Selectioncolor = (int)(0x80FFFF) ;
      subGrid1_Allowselection = (byte)(1) ;
      edtavCndsprtrndc_Enabled = 1 ;
      edtavCndsprrescon_Enabled = 1 ;
      edtavCncdirnom_res_Enabled = 1 ;
      edtavCndsprfftr_Enabled = 1 ;
      edtavCndsprfitr_Enabled = 1 ;
      edtavMontopendiente_Enabled = 1 ;
      edtavMonto_Enabled = 1 ;
      edtavMontoacumulado_Enabled = 1 ;
      edtavCndsprimpbas_Enabled = 1 ;
      edtavCndsprmon_Enabled = 1 ;
      edtavCndsprfcon_Enabled = 1 ;
      edtavCndspralctr_Enabled = 1 ;
      edtavCndsprfolcon_Enabled = 1 ;
      edtavCncdirnom_Enabled = 1 ;
      edtavCndsprndc_Enabled = 1 ;
      edtavCndsprtdc_Enabled = 1 ;
      edtavPmctprdsc_Enabled = 1 ;
      edtavCntdocdsc_Enabled = 1 ;
      edtavAlta_Enabled = 1 ;
      edtavRec2_Enabled = 1 ;
      subGrid1_Header = "" ;
      subGrid1_Class = "KDSResponsiveTable" ;
      edtavCncdirid_Jsonclick = "" ;
      edtavCncdirid_Enabled = 1 ;
      edtavCncdirnom_f2_Enabled = 1 ;
      edtavNdc_Jsonclick = "" ;
      cmbavTdc.setJsonclick( "" );
      cmbavPmctprid.setJsonclick( "" );
      cmbavCnciasid.setJsonclick( "" );
      lblTxtscript_Visible = 1 ;
      Mensaje_Title = "Title" ;
      lblTxtsalir_Caption = "." ;
      lblTxtscript_Caption = "txtScript" ;
      cmbavCnciasid.setEnabled( 1 );
      lblTxtbuscar_Caption = "Buscar" ;
      lblTxtsalir2_Caption = "Salir" ;
      subGrid1_Width = 1300 ;
      subGrid1_Linesfont = "font-family:Arial;font-size:8pt;" ;
      subGrid1_Titlefont = "font-family:Arial;font-size:8pt;font-weight:bold;" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Gestión de Registro del servicio" );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavCnciasid.setName( "vCNCIASID" );
      cmbavCnciasid.setWebtags( "" );
      if ( cmbavCnciasid.getItemCount() > 0 )
      {
         AV31CNCIASID = GXutil.lval( cmbavCnciasid.getValidValue(GXutil.trim( GXutil.str( AV31CNCIASID, 10, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CNCIASID", GXutil.ltrim( GXutil.str( AV31CNCIASID, 10, 0)));
      }
      cmbavPmctprid.setName( "vPMCTPRID" );
      cmbavPmctprid.setWebtags( "" );
      cmbavPmctprid.addItem("", "Seleccione", (short)(0));
      if ( cmbavPmctprid.getItemCount() > 0 )
      {
         AV60PMCTPRID = cmbavPmctprid.getValidValue(AV60PMCTPRID) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60PMCTPRID", AV60PMCTPRID);
      }
      cmbavTdc.setName( "vTDC" );
      cmbavTdc.setWebtags( "" );
      cmbavTdc.addItem("", "Seleccione", (short)(0));
      cmbavTdc.addItem("OT", "Orden de servicio", (short)(0));
      if ( cmbavTdc.getItemCount() > 0 )
      {
         AV76tdc = cmbavTdc.getValidValue(AV76tdc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76tdc", AV76tdc);
      }
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'cmbavTdc'},{av:'AV76tdc',fld:'vTDC',pic:''},{av:'AV75ndc',fld:'vNDC',pic:'ZZZ9'},{av:'A7521CNDSPRPRID',fld:'CNDSPRPRID',pic:''},{av:'cmbavPmctprid'},{av:'AV60PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7522CNDSPRCON',fld:'CNDSPRCON',pic:'ZZZZZZZZZ9'},{av:'AV24CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7927CNDSPREST',fld:'CNDSPREST',pic:''},{av:'A9293CNDSPRTREST',fld:'CNDSPRTREST',pic:''},{av:'AV45consultar',fld:'vCONSULTAR',pic:''},{av:'A7566CNDSPRTRN',fld:'CNDSPRTRN',pic:''},{av:'A7523CNDSPRFCON',fld:'CNDSPRFCON',pic:''},{av:'A7524CNDSPRFOLCON',fld:'CNDSPRFOLCON',pic:''},{av:'A7526CNDSPRMNTANT',fld:'CNDSPRMNTANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7527CNDSPRMON',fld:'CNDSPRMON',pic:''},{av:'A7528CNDSPRFITR',fld:'CNDSPRFITR',pic:''},{av:'A7529CNDSPRFFTR',fld:'CNDSPRFFTR',pic:''},{av:'A7533CNDSPRMNTCON',fld:'CNDSPRMNTCON',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7536CNDSPRIMPBAS',fld:'CNDSPRIMPBAS',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7530CNDSPRRESCON',fld:'CNDSPRRESCON',pic:''},{av:'A14386CNDSPRURS',fld:'CNDSPRURS',pic:''},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'A21CNTDOCDSC',fld:'CNTDOCDSC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A7862AVDSPRCAN',fld:'AVDSPRCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A7795AVDSPRIMP',fld:'AVDSPRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7545CNDSPRTRIMP',fld:'CNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7601CNDSPRTRNDC',fld:'CNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'A7550CNDSPRTRALC',fld:'CNDSPRTRALC',pic:''},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV88CNDSPRPRID',fld:'vCNDSPRPRID',pic:''},{av:'A6299PMCTPREJ',fld:'PMCTPREJ',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VCNCIASID.ISVALID","{handler:'e111XA2',iparms:[{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VCNCIASID.ISVALID",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e151XA2',iparms:[{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'cmbavTdc'},{av:'AV76tdc',fld:'vTDC',pic:''},{av:'AV75ndc',fld:'vNDC',pic:'ZZZ9'},{av:'A7521CNDSPRPRID',fld:'CNDSPRPRID',pic:''},{av:'cmbavPmctprid'},{av:'AV60PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7522CNDSPRCON',fld:'CNDSPRCON',pic:'ZZZZZZZZZ9'},{av:'AV24CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7927CNDSPREST',fld:'CNDSPREST',pic:''},{av:'A9293CNDSPRTREST',fld:'CNDSPRTREST',pic:''},{av:'AV45consultar',fld:'vCONSULTAR',pic:''},{av:'A7566CNDSPRTRN',fld:'CNDSPRTRN',pic:''},{av:'A7523CNDSPRFCON',fld:'CNDSPRFCON',pic:''},{av:'A7524CNDSPRFOLCON',fld:'CNDSPRFOLCON',pic:''},{av:'A7526CNDSPRMNTANT',fld:'CNDSPRMNTANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7527CNDSPRMON',fld:'CNDSPRMON',pic:''},{av:'A7528CNDSPRFITR',fld:'CNDSPRFITR',pic:''},{av:'A7529CNDSPRFFTR',fld:'CNDSPRFFTR',pic:''},{av:'A7533CNDSPRMNTCON',fld:'CNDSPRMNTCON',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7536CNDSPRIMPBAS',fld:'CNDSPRIMPBAS',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7530CNDSPRRESCON',fld:'CNDSPRRESCON',pic:''},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'A14386CNDSPRURS',fld:'CNDSPRURS',pic:''},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'A21CNTDOCDSC',fld:'CNTDOCDSC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A7862AVDSPRCAN',fld:'AVDSPRCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A7795AVDSPRIMP',fld:'AVDSPRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7545CNDSPRTRIMP',fld:'CNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7601CNDSPRTRNDC',fld:'CNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'A7550CNDSPRTRALC',fld:'CNDSPRTRALC',pic:''},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV88CNDSPRPRID',fld:'vCNDSPRPRID',pic:''},{av:'A6299PMCTPREJ',fld:'PMCTPREJ',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV88CNDSPRPRID',fld:'vCNDSPRPRID',pic:''},{av:'AV58PMCTPRDSC',fld:'vPMCTPRDSC',pic:''},{av:'AV90CNCDIRNOM',fld:'vCNCDIRNOM',pic:''},{av:'AV62REC2',fld:'vREC2',pic:''},{av:'AV92alta',fld:'vALTA',pic:''},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV78CNDSPRFCON',fld:'vCNDSPRFCON',pic:''},{av:'AV79CNDSPRFOLCON',fld:'vCNDSPRFOLCON',pic:''},{av:'AV81CNDSPRMON',fld:'vCNDSPRMON',pic:''},{av:'AV82CNDSPRFITR',fld:'vCNDSPRFITR',pic:''},{av:'AV83CNDSPRFFTR',fld:'vCNDSPRFFTR',pic:''},{av:'AV94CNDSPRIMPBAS',fld:'vCNDSPRIMPBAS',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV115CNDSPRRESCON',fld:'vCNDSPRRESCON',pic:''},{av:'AV93CNTDOCDSC',fld:'vCNTDOCDSC',pic:''},{av:'AV109montopendiente',fld:'vMONTOPENDIENTE',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV107MONTOACUMULADO',fld:'vMONTOACUMULADO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV106MONTO',fld:'vMONTO',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV114CNDSPRTRNDC',fld:'vCNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'AV84CNDSPRALCTR',fld:'vCNDSPRALCTR',pic:''},{av:'AV120CNCDIRNOM_RES',fld:'vCNCDIRNOM_RES',pic:''},{av:'AV119PMCTPREJ',fld:'vPMCTPREJ',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'CONSULTAR'","{handler:'e131XA2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'cmbavTdc'},{av:'AV76tdc',fld:'vTDC',pic:''},{av:'AV75ndc',fld:'vNDC',pic:'ZZZ9'},{av:'A7521CNDSPRPRID',fld:'CNDSPRPRID',pic:''},{av:'cmbavPmctprid'},{av:'AV60PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7522CNDSPRCON',fld:'CNDSPRCON',pic:'ZZZZZZZZZ9'},{av:'AV24CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7927CNDSPREST',fld:'CNDSPREST',pic:''},{av:'A9293CNDSPRTREST',fld:'CNDSPRTREST',pic:''},{av:'AV45consultar',fld:'vCONSULTAR',pic:''},{av:'A7566CNDSPRTRN',fld:'CNDSPRTRN',pic:''},{av:'A7523CNDSPRFCON',fld:'CNDSPRFCON',pic:''},{av:'A7524CNDSPRFOLCON',fld:'CNDSPRFOLCON',pic:''},{av:'A7526CNDSPRMNTANT',fld:'CNDSPRMNTANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7527CNDSPRMON',fld:'CNDSPRMON',pic:''},{av:'A7528CNDSPRFITR',fld:'CNDSPRFITR',pic:''},{av:'A7529CNDSPRFFTR',fld:'CNDSPRFFTR',pic:''},{av:'A7533CNDSPRMNTCON',fld:'CNDSPRMNTCON',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7536CNDSPRIMPBAS',fld:'CNDSPRIMPBAS',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7530CNDSPRRESCON',fld:'CNDSPRRESCON',pic:''},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'A14386CNDSPRURS',fld:'CNDSPRURS',pic:''},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'A21CNTDOCDSC',fld:'CNTDOCDSC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A7862AVDSPRCAN',fld:'AVDSPRCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A7795AVDSPRIMP',fld:'AVDSPRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7545CNDSPRTRIMP',fld:'CNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7601CNDSPRTRNDC',fld:'CNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'A7550CNDSPRTRALC',fld:'CNDSPRTRALC',pic:''},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV88CNDSPRPRID',fld:'vCNDSPRPRID',pic:''},{av:'A6299PMCTPREJ',fld:'PMCTPREJ',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''}]");
      setEventMetadata("'CONSULTAR'",",oparms:[{av:'AV45consultar',fld:'vCONSULTAR',pic:''}]}");
      setEventMetadata("'AGREGARINS'","{handler:'e191XA2',iparms:[{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true}]");
      setEventMetadata("'AGREGARINS'",",oparms:[]}");
      setEventMetadata("'AGREGARAVANCE2'","{handler:'e161XA2',iparms:[{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true}]");
      setEventMetadata("'AGREGARAVANCE2'",",oparms:[{av:'lblTxtscript_Caption',ctrl:'TXTSCRIPT',prop:'Caption'}]}");
      setEventMetadata("VCNCDIRNOM_F2.ISVALID","{handler:'e121XA2',iparms:[{av:'AV28CNCDIRNOM_F2',fld:'vCNCDIRNOM_F2',pic:''},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''},{av:'A382CNTPDRID',fld:'CNTPDRID',pic:''},{av:'A7563CNCDIRCON',fld:'CNCDIRCON',pic:'9'},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VCNCDIRNOM_F2.ISVALID",",oparms:[{av:'AV24CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'SALIR'","{handler:'e181XA1',iparms:[]");
      setEventMetadata("'SALIR'",",oparms:[{av:'lblTxtsalir_Caption',ctrl:'TXTSALIR',prop:'Caption'}]}");
      setEventMetadata("ENTER","{handler:'e171XA2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'cmbavCnciasid'},{av:'AV31CNCIASID',fld:'vCNCIASID',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'cmbavTdc'},{av:'AV76tdc',fld:'vTDC',pic:''},{av:'AV75ndc',fld:'vNDC',pic:'ZZZ9'},{av:'A7521CNDSPRPRID',fld:'CNDSPRPRID',pic:''},{av:'cmbavPmctprid'},{av:'AV60PMCTPRID',fld:'vPMCTPRID',pic:''},{av:'A46CNCDIRID',fld:'CNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7522CNDSPRCON',fld:'CNDSPRCON',pic:'ZZZZZZZZZ9'},{av:'AV24CNCDIRID',fld:'vCNCDIRID',pic:'ZZZZZZZZZ9'},{av:'A7927CNDSPREST',fld:'CNDSPREST',pic:''},{av:'A9293CNDSPRTREST',fld:'CNDSPRTREST',pic:''},{av:'AV45consultar',fld:'vCONSULTAR',pic:''},{av:'A7566CNDSPRTRN',fld:'CNDSPRTRN',pic:''},{av:'A7523CNDSPRFCON',fld:'CNDSPRFCON',pic:''},{av:'A7524CNDSPRFOLCON',fld:'CNDSPRFOLCON',pic:''},{av:'A7526CNDSPRMNTANT',fld:'CNDSPRMNTANT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7527CNDSPRMON',fld:'CNDSPRMON',pic:''},{av:'A7528CNDSPRFITR',fld:'CNDSPRFITR',pic:''},{av:'A7529CNDSPRFFTR',fld:'CNDSPRFFTR',pic:''},{av:'A7533CNDSPRMNTCON',fld:'CNDSPRMNTCON',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7536CNDSPRIMPBAS',fld:'CNDSPRIMPBAS',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7530CNDSPRRESCON',fld:'CNDSPRRESCON',pic:''},{av:'AV44CNUSERID',fld:'vCNUSERID',pic:'',hsh:true},{av:'A14386CNDSPRURS',fld:'CNDSPRURS',pic:''},{av:'A20CNTDOCID',fld:'CNTDOCID',pic:''},{av:'AV86CNDSPRTDC',fld:'vCNDSPRTDC',pic:'',hsh:true},{av:'A21CNTDOCDSC',fld:'CNTDOCDSC',pic:''},{av:'A7792AVDSPRLIN',fld:'AVDSPRLIN',pic:'ZZ9.999'},{av:'A7789AVDSPRCIA',fld:'AVDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A8255AVDSPRDOC',fld:'AVDSPRDOC',pic:'ZZZZZZZZZ9'},{av:'AV87CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9',hsh:true},{av:'A7800AVDSPREST',fld:'AVDSPREST',pic:''},{av:'A7862AVDSPRCAN',fld:'AVDSPRCAN',pic:'Z,ZZZ,ZZZ,ZZ9.999999'},{av:'A7795AVDSPRIMP',fld:'AVDSPRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7545CNDSPRTRIMP',fld:'CNDSPRTRIMP',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A7601CNDSPRTRNDC',fld:'CNDSPRTRNDC',pic:'ZZZZZZZZZ9'},{av:'A7550CNDSPRTRALC',fld:'CNDSPRTRALC',pic:''},{av:'A171PMCTPRID',fld:'PMCTPRID',pic:''},{av:'AV88CNDSPRPRID',fld:'vCNDSPRPRID',pic:''},{av:'A6299PMCTPREJ',fld:'PMCTPREJ',pic:'ZZZZZZZZZ9'},{av:'A194CNCDIRNOM',fld:'CNCDIRNOM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV45consultar',fld:'vCONSULTAR',pic:''}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A194CNCDIRNOM = "" ;
      A7519CNDSPRTDC = "" ;
      AV76tdc = "" ;
      A7521CNDSPRPRID = "" ;
      AV60PMCTPRID = "" ;
      A7927CNDSPREST = "" ;
      A9293CNDSPRTREST = "" ;
      A7566CNDSPRTRN = GXutil.nullDate() ;
      A7523CNDSPRFCON = GXutil.nullDate() ;
      A7524CNDSPRFOLCON = "" ;
      A7526CNDSPRMNTANT = DecimalUtil.ZERO ;
      A7527CNDSPRMON = "" ;
      A7528CNDSPRFITR = GXutil.nullDate() ;
      A7529CNDSPRFFTR = GXutil.nullDate() ;
      A7533CNDSPRMNTCON = DecimalUtil.ZERO ;
      A7536CNDSPRIMPBAS = DecimalUtil.ZERO ;
      A7530CNDSPRRESCON = "" ;
      AV44CNUSERID = "" ;
      A14386CNDSPRURS = "" ;
      A20CNTDOCID = "" ;
      AV86CNDSPRTDC = "" ;
      A21CNTDOCDSC = "" ;
      A7792AVDSPRLIN = DecimalUtil.ZERO ;
      A7800AVDSPREST = "" ;
      A7862AVDSPRCAN = DecimalUtil.ZERO ;
      A7795AVDSPRIMP = DecimalUtil.ZERO ;
      A7545CNDSPRTRIMP = DecimalUtil.ZERO ;
      A7550CNDSPRTRALC = "" ;
      A171PMCTPRID = "" ;
      AV88CNDSPRPRID = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A382CNTPDRID = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV62REC2 = "" ;
      AV92alta = "" ;
      AV93CNTDOCDSC = "" ;
      AV58PMCTPRDSC = "" ;
      AV90CNCDIRNOM = "" ;
      AV79CNDSPRFOLCON = "" ;
      AV84CNDSPRALCTR = "" ;
      AV78CNDSPRFCON = GXutil.nullDate() ;
      AV81CNDSPRMON = "" ;
      AV94CNDSPRIMPBAS = DecimalUtil.ZERO ;
      AV107MONTOACUMULADO = DecimalUtil.ZERO ;
      AV106MONTO = DecimalUtil.ZERO ;
      AV109montopendiente = DecimalUtil.ZERO ;
      AV82CNDSPRFITR = GXutil.nullDate() ;
      AV83CNDSPRFFTR = GXutil.nullDate() ;
      AV120CNCDIRNOM_RES = "" ;
      AV115CNDSPRRESCON = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l194CNCDIRNOM = "" ;
      H01XA2_A194CNCDIRNOM = new String[] {""} ;
      H01XA2_n194CNCDIRNOM = new boolean[] {false} ;
      AV123Pgmname = "" ;
      AV28CNCDIRNOM_F2 = "" ;
      AV50KDSSESSION = httpContext.getWebSession();
      AV98Accesso = "" ;
      AV99CNESDSOP = "" ;
      H01XA3_A248SSUSRID = new String[] {""} ;
      H01XA3_A9CNCIASDSC = new String[] {""} ;
      H01XA3_n9CNCIASDSC = new boolean[] {false} ;
      H01XA3_A289SSUSRCIAS = new long[1] ;
      A248SSUSRID = "" ;
      A9CNCIASDSC = "" ;
      GXv_int3 = new long [1] ;
      GXv_int4 = new long [1] ;
      AV101arrCNCIASID = new GXSimpleCollection<Long>(Long.class, "internal", "");
      GXv_objcol_int5 = new GXSimpleCollection [1] ;
      AV67SistemaErp = "" ;
      AV66GenerarImpacto = "" ;
      AV72EstatusR = "" ;
      GXv_decimal6 = new java.math.BigDecimal [1] ;
      AV71fEstatusR = "" ;
      H01XA4_A5940CNUSERID = new String[] {""} ;
      H01XA4_A171PMCTPRID = new String[] {""} ;
      H01XA4_A172PMCTPRDSC = new String[] {""} ;
      H01XA4_n172PMCTPRDSC = new boolean[] {false} ;
      A5940CNUSERID = "" ;
      A172PMCTPRDSC = "" ;
      H01XA5_A7540CNDSPRTRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA5_A7518CNDSPRCIA = new long[1] ;
      H01XA5_A7927CNDSPREST = new String[] {""} ;
      H01XA5_n7927CNDSPREST = new boolean[] {false} ;
      H01XA5_A9293CNDSPRTREST = new String[] {""} ;
      H01XA5_n9293CNDSPRTREST = new boolean[] {false} ;
      H01XA5_A7522CNDSPRCON = new long[1] ;
      H01XA5_n7522CNDSPRCON = new boolean[] {false} ;
      H01XA5_A7521CNDSPRPRID = new String[] {""} ;
      H01XA5_n7521CNDSPRPRID = new boolean[] {false} ;
      H01XA5_A7520CNDSPRNDC = new long[1] ;
      H01XA5_A7519CNDSPRTDC = new String[] {""} ;
      H01XA5_A7566CNDSPRTRN = new java.util.Date[] {GXutil.nullDate()} ;
      H01XA5_n7566CNDSPRTRN = new boolean[] {false} ;
      H01XA5_A7523CNDSPRFCON = new java.util.Date[] {GXutil.nullDate()} ;
      H01XA5_n7523CNDSPRFCON = new boolean[] {false} ;
      H01XA5_A7524CNDSPRFOLCON = new String[] {""} ;
      H01XA5_n7524CNDSPRFOLCON = new boolean[] {false} ;
      H01XA5_A7526CNDSPRMNTANT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA5_n7526CNDSPRMNTANT = new boolean[] {false} ;
      H01XA5_A7527CNDSPRMON = new String[] {""} ;
      H01XA5_n7527CNDSPRMON = new boolean[] {false} ;
      H01XA5_A7528CNDSPRFITR = new java.util.Date[] {GXutil.nullDate()} ;
      H01XA5_n7528CNDSPRFITR = new boolean[] {false} ;
      H01XA5_A7529CNDSPRFFTR = new java.util.Date[] {GXutil.nullDate()} ;
      H01XA5_n7529CNDSPRFFTR = new boolean[] {false} ;
      H01XA5_A7533CNDSPRMNTCON = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA5_n7533CNDSPRMNTCON = new boolean[] {false} ;
      H01XA5_A7536CNDSPRIMPBAS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA5_n7536CNDSPRIMPBAS = new boolean[] {false} ;
      H01XA5_A7530CNDSPRRESCON = new String[] {""} ;
      H01XA5_n7530CNDSPRRESCON = new boolean[] {false} ;
      H01XA5_A14386CNDSPRURS = new String[] {""} ;
      H01XA5_n14386CNDSPRURS = new boolean[] {false} ;
      AV97archivos = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      AV77CNDSPRTRN = GXutil.nullDate() ;
      AV80CNDSPRMNTANT = DecimalUtil.ZERO ;
      AV85CNDSPRMNTCON = DecimalUtil.ZERO ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      H01XA6_A171PMCTPRID = new String[] {""} ;
      H01XA6_A6299PMCTPREJ = new long[1] ;
      H01XA6_n6299PMCTPREJ = new boolean[] {false} ;
      H01XA7_A46CNCDIRID = new long[1] ;
      H01XA7_A194CNCDIRNOM = new String[] {""} ;
      H01XA7_n194CNCDIRNOM = new boolean[] {false} ;
      AV105CANTTOT = DecimalUtil.ZERO ;
      H01XA8_A7791AVDSPRTDC = new String[] {""} ;
      H01XA8_A7790AVDSPRNDC = new long[1] ;
      H01XA8_A7789AVDSPRCIA = new long[1] ;
      H01XA8_A8255AVDSPRDOC = new long[1] ;
      H01XA8_A20CNTDOCID = new String[] {""} ;
      H01XA8_A7800AVDSPREST = new String[] {""} ;
      H01XA8_n7800AVDSPREST = new boolean[] {false} ;
      H01XA8_A7862AVDSPRCAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA8_n7862AVDSPRCAN = new boolean[] {false} ;
      H01XA8_A7795AVDSPRIMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA8_n7795AVDSPRIMP = new boolean[] {false} ;
      H01XA8_A7792AVDSPRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV102AVDSPRCAN = DecimalUtil.ZERO ;
      AV103AVDSPRIMP = DecimalUtil.ZERO ;
      AV104AVDSPREST = "" ;
      AV111CNDSPRTRIMP = DecimalUtil.ZERO ;
      H01XA9_A7540CNDSPRTRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA9_A7520CNDSPRNDC = new long[1] ;
      H01XA9_A7519CNDSPRTDC = new String[] {""} ;
      H01XA9_A7518CNDSPRCIA = new long[1] ;
      H01XA9_A7545CNDSPRTRIMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA9_n7545CNDSPRTRIMP = new boolean[] {false} ;
      H01XA9_A7601CNDSPRTRNDC = new long[1] ;
      H01XA9_n7601CNDSPRTRNDC = new boolean[] {false} ;
      H01XA10_A7540CNDSPRTRLIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XA10_A7520CNDSPRNDC = new long[1] ;
      H01XA10_A7519CNDSPRTDC = new String[] {""} ;
      H01XA10_A7518CNDSPRCIA = new long[1] ;
      H01XA10_A7550CNDSPRTRALC = new String[] {""} ;
      H01XA10_n7550CNDSPRTRALC = new boolean[] {false} ;
      AV49INTPALID = "" ;
      H01XA11_A281INPRODID = new long[1] ;
      H01XA11_A1148INTPALID = new String[] {""} ;
      H01XA11_n1148INTPALID = new boolean[] {false} ;
      A1148INTPALID = "" ;
      H01XA12_A7563CNCDIRCON = new byte[1] ;
      H01XA12_n7563CNCDIRCON = new boolean[] {false} ;
      H01XA12_A382CNTPDRID = new String[] {""} ;
      H01XA12_n382CNTPDRID = new boolean[] {false} ;
      H01XA12_A194CNCDIRNOM = new String[] {""} ;
      H01XA12_n194CNCDIRNOM = new boolean[] {false} ;
      H01XA12_A46CNCDIRID = new long[1] ;
      H01XA13_A20CNTDOCID = new String[] {""} ;
      H01XA13_A21CNTDOCDSC = new String[] {""} ;
      H01XA13_n21CNTDOCDSC = new boolean[] {false} ;
      lblKdsaplicarcriterios2_Jsonclick = "" ;
      ucMensaje = new com.genexus.webpanels.GXUserControl();
      lblTxtscript_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblKdsaplicarcriterios_Jsonclick = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTxtsalir_Jsonclick = "" ;
      lblTxtbuscar_Jsonclick = "" ;
      lblTxtsalir2_Jsonclick = "" ;
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.wpavdest__default(),
         new Object[] {
             new Object[] {
            H01XA2_A194CNCDIRNOM, H01XA2_n194CNCDIRNOM
            }
            , new Object[] {
            H01XA3_A248SSUSRID, H01XA3_A9CNCIASDSC, H01XA3_n9CNCIASDSC, H01XA3_A289SSUSRCIAS
            }
            , new Object[] {
            H01XA4_A5940CNUSERID, H01XA4_A171PMCTPRID, H01XA4_A172PMCTPRDSC, H01XA4_n172PMCTPRDSC
            }
            , new Object[] {
            H01XA5_A7540CNDSPRTRLIN, H01XA5_A7518CNDSPRCIA, H01XA5_A7927CNDSPREST, H01XA5_n7927CNDSPREST, H01XA5_A9293CNDSPRTREST, H01XA5_n9293CNDSPRTREST, H01XA5_A7522CNDSPRCON, H01XA5_n7522CNDSPRCON, H01XA5_A7521CNDSPRPRID, H01XA5_n7521CNDSPRPRID,
            H01XA5_A7520CNDSPRNDC, H01XA5_A7519CNDSPRTDC, H01XA5_A7566CNDSPRTRN, H01XA5_n7566CNDSPRTRN, H01XA5_A7523CNDSPRFCON, H01XA5_n7523CNDSPRFCON, H01XA5_A7524CNDSPRFOLCON, H01XA5_n7524CNDSPRFOLCON, H01XA5_A7526CNDSPRMNTANT, H01XA5_n7526CNDSPRMNTANT,
            H01XA5_A7527CNDSPRMON, H01XA5_n7527CNDSPRMON, H01XA5_A7528CNDSPRFITR, H01XA5_n7528CNDSPRFITR, H01XA5_A7529CNDSPRFFTR, H01XA5_n7529CNDSPRFFTR, H01XA5_A7533CNDSPRMNTCON, H01XA5_n7533CNDSPRMNTCON, H01XA5_A7536CNDSPRIMPBAS, H01XA5_n7536CNDSPRIMPBAS,
            H01XA5_A7530CNDSPRRESCON, H01XA5_n7530CNDSPRRESCON, H01XA5_A14386CNDSPRURS, H01XA5_n14386CNDSPRURS
            }
            , new Object[] {
            H01XA6_A171PMCTPRID, H01XA6_A6299PMCTPREJ, H01XA6_n6299PMCTPREJ
            }
            , new Object[] {
            H01XA7_A46CNCDIRID, H01XA7_A194CNCDIRNOM, H01XA7_n194CNCDIRNOM
            }
            , new Object[] {
            H01XA8_A7791AVDSPRTDC, H01XA8_A7790AVDSPRNDC, H01XA8_A7789AVDSPRCIA, H01XA8_A8255AVDSPRDOC, H01XA8_A20CNTDOCID, H01XA8_A7800AVDSPREST, H01XA8_n7800AVDSPREST, H01XA8_A7862AVDSPRCAN, H01XA8_n7862AVDSPRCAN, H01XA8_A7795AVDSPRIMP,
            H01XA8_n7795AVDSPRIMP, H01XA8_A7792AVDSPRLIN
            }
            , new Object[] {
            H01XA9_A7540CNDSPRTRLIN, H01XA9_A7520CNDSPRNDC, H01XA9_A7519CNDSPRTDC, H01XA9_A7518CNDSPRCIA, H01XA9_A7545CNDSPRTRIMP, H01XA9_n7545CNDSPRTRIMP, H01XA9_A7601CNDSPRTRNDC, H01XA9_n7601CNDSPRTRNDC
            }
            , new Object[] {
            H01XA10_A7540CNDSPRTRLIN, H01XA10_A7520CNDSPRNDC, H01XA10_A7519CNDSPRTDC, H01XA10_A7518CNDSPRCIA, H01XA10_A7550CNDSPRTRALC, H01XA10_n7550CNDSPRTRALC
            }
            , new Object[] {
            H01XA11_A281INPRODID, H01XA11_A1148INTPALID, H01XA11_n1148INTPALID
            }
            , new Object[] {
            H01XA12_A7563CNCDIRCON, H01XA12_n7563CNCDIRCON, H01XA12_A382CNTPDRID, H01XA12_n382CNTPDRID, H01XA12_A194CNCDIRNOM, H01XA12_n194CNCDIRNOM, H01XA12_A46CNCDIRID
            }
            , new Object[] {
            H01XA13_A20CNTDOCID, H01XA13_A21CNTDOCDSC, H01XA13_n21CNTDOCDSC
            }
         }
      );
      AV123Pgmname = "wpavdest" ;
      /* GeneXus formulas. */
      AV123Pgmname = "wpavdest" ;
      Gx_err = (short)(0) ;
      edtavRec2_Enabled = 0 ;
      edtavAlta_Enabled = 0 ;
      edtavCntdocdsc_Enabled = 0 ;
      edtavPmctprdsc_Enabled = 0 ;
      edtavCndsprtdc_Enabled = 0 ;
      edtavCndsprndc_Enabled = 0 ;
      edtavCncdirnom_Enabled = 0 ;
      edtavCndsprfolcon_Enabled = 0 ;
      edtavCndspralctr_Enabled = 0 ;
      edtavCndsprfcon_Enabled = 0 ;
      edtavCndsprmon_Enabled = 0 ;
      edtavCndsprimpbas_Enabled = 0 ;
      edtavMontoacumulado_Enabled = 0 ;
      edtavMonto_Enabled = 0 ;
      edtavMontopendiente_Enabled = 0 ;
      edtavCndsprfitr_Enabled = 0 ;
      edtavCndsprfftr_Enabled = 0 ;
      edtavCncdirnom_res_Enabled = 0 ;
      edtavCndsprrescon_Enabled = 0 ;
      edtavCndsprtrndc_Enabled = 0 ;
      edtavCncdirid_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A7563CNCDIRCON ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GRID1_nEOF ;
   private byte AV133GXLvl227 ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_17 ;
   private short nGXsfl_17_idx=1 ;
   private short AV75ndc ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int edtavRec2_Enabled ;
   private int edtavAlta_Enabled ;
   private int edtavCntdocdsc_Enabled ;
   private int edtavPmctprdsc_Enabled ;
   private int edtavCndsprtdc_Enabled ;
   private int edtavCndsprndc_Enabled ;
   private int edtavCncdirnom_Enabled ;
   private int edtavCndsprfolcon_Enabled ;
   private int edtavCndspralctr_Enabled ;
   private int edtavCndsprfcon_Enabled ;
   private int edtavCndsprmon_Enabled ;
   private int edtavCndsprimpbas_Enabled ;
   private int edtavMontoacumulado_Enabled ;
   private int edtavMonto_Enabled ;
   private int edtavMontopendiente_Enabled ;
   private int edtavCndsprfitr_Enabled ;
   private int edtavCndsprfftr_Enabled ;
   private int edtavCncdirnom_res_Enabled ;
   private int edtavCndsprrescon_Enabled ;
   private int edtavCndsprtrndc_Enabled ;
   private int edtavCncdirid_Enabled ;
   private int subGrid1_Width ;
   private int lblTxtscript_Visible ;
   private int edtavCncdirnom_f2_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavRec2_Visible ;
   private int edtavAlta_Visible ;
   private int edtavCntdocdsc_Visible ;
   private int edtavPmctprdsc_Visible ;
   private int edtavCndsprtdc_Visible ;
   private int edtavCndsprndc_Visible ;
   private int edtavCncdirnom_Visible ;
   private int edtavCndsprfolcon_Visible ;
   private int edtavCndspralctr_Visible ;
   private int edtavCndsprfcon_Visible ;
   private int edtavCndsprmon_Visible ;
   private int edtavCndsprimpbas_Visible ;
   private int edtavMontoacumulado_Visible ;
   private int edtavMonto_Visible ;
   private int edtavMontopendiente_Visible ;
   private int edtavCndsprfitr_Visible ;
   private int edtavCndsprfftr_Visible ;
   private int edtavCncdirnom_res_Visible ;
   private int edtavCndsprrescon_Visible ;
   private int edtavCndsprtrndc_Visible ;
   private long A7520CNDSPRNDC ;
   private long A7518CNDSPRCIA ;
   private long AV31CNCIASID ;
   private long A46CNCDIRID ;
   private long A7522CNDSPRCON ;
   private long AV24CNCDIRID ;
   private long A7789AVDSPRCIA ;
   private long A8255AVDSPRDOC ;
   private long AV87CNDSPRNDC ;
   private long A7601CNDSPRTRNDC ;
   private long A6299PMCTPREJ ;
   private long AV114CNDSPRTRNDC ;
   private long GRID1_nCurrentRecord ;
   private long A289SSUSRCIAS ;
   private long GXv_int3[] ;
   private long AV100iniCNCIASID ;
   private long GXv_int4[] ;
   private long AV89CNDSPRCON ;
   private long AV119PMCTPREJ ;
   private long AV19ACMVOIPRID ;
   private long A281INPRODID ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A7526CNDSPRMNTANT ;
   private java.math.BigDecimal A7533CNDSPRMNTCON ;
   private java.math.BigDecimal A7536CNDSPRIMPBAS ;
   private java.math.BigDecimal A7792AVDSPRLIN ;
   private java.math.BigDecimal A7862AVDSPRCAN ;
   private java.math.BigDecimal A7795AVDSPRIMP ;
   private java.math.BigDecimal A7545CNDSPRTRIMP ;
   private java.math.BigDecimal AV94CNDSPRIMPBAS ;
   private java.math.BigDecimal AV107MONTOACUMULADO ;
   private java.math.BigDecimal AV106MONTO ;
   private java.math.BigDecimal AV109montopendiente ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV80CNDSPRMNTANT ;
   private java.math.BigDecimal AV85CNDSPRMNTCON ;
   private java.math.BigDecimal AV105CANTTOT ;
   private java.math.BigDecimal AV102AVDSPRCAN ;
   private java.math.BigDecimal AV103AVDSPRIMP ;
   private java.math.BigDecimal AV111CNDSPRTRIMP ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A194CNCDIRNOM ;
   private String sGXsfl_17_idx="0001" ;
   private String A7519CNDSPRTDC ;
   private String AV76tdc ;
   private String A7521CNDSPRPRID ;
   private String AV60PMCTPRID ;
   private String A7927CNDSPREST ;
   private String A9293CNDSPRTREST ;
   private String A7524CNDSPRFOLCON ;
   private String A7527CNDSPRMON ;
   private String A7530CNDSPRRESCON ;
   private String AV44CNUSERID ;
   private String A14386CNDSPRURS ;
   private String A20CNTDOCID ;
   private String AV86CNDSPRTDC ;
   private String A21CNTDOCDSC ;
   private String A7800AVDSPREST ;
   private String A171PMCTPRID ;
   private String AV88CNDSPRPRID ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A382CNTPDRID ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavRec2_Internalname ;
   private String edtavAlta_Internalname ;
   private String AV93CNTDOCDSC ;
   private String edtavCntdocdsc_Internalname ;
   private String AV58PMCTPRDSC ;
   private String edtavPmctprdsc_Internalname ;
   private String edtavCndsprtdc_Internalname ;
   private String edtavCndsprndc_Internalname ;
   private String AV90CNCDIRNOM ;
   private String edtavCncdirnom_Internalname ;
   private String AV79CNDSPRFOLCON ;
   private String edtavCndsprfolcon_Internalname ;
   private String edtavCndspralctr_Internalname ;
   private String edtavCndsprfcon_Internalname ;
   private String AV81CNDSPRMON ;
   private String edtavCndsprmon_Internalname ;
   private String edtavCndsprimpbas_Internalname ;
   private String edtavMontoacumulado_Internalname ;
   private String edtavMonto_Internalname ;
   private String edtavMontopendiente_Internalname ;
   private String edtavCndsprfitr_Internalname ;
   private String edtavCndsprfftr_Internalname ;
   private String AV120CNCDIRNOM_RES ;
   private String edtavCncdirnom_res_Internalname ;
   private String AV115CNDSPRRESCON ;
   private String edtavCndsprrescon_Internalname ;
   private String edtavCndsprtrndc_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l194CNCDIRNOM ;
   private String AV123Pgmname ;
   private String edtavCncdirid_Internalname ;
   private String subGrid1_Titlefont ;
   private String subGrid1_Linesfont ;
   private String edtavNdc_Internalname ;
   private String AV28CNCDIRNOM_F2 ;
   private String edtavCncdirnom_f2_Internalname ;
   private String subGrid1_Internalname ;
   private String lblTxtsalir2_Caption ;
   private String lblTxtsalir2_Internalname ;
   private String lblTxtbuscar_Caption ;
   private String lblTxtbuscar_Internalname ;
   private String lblTxtscript_Internalname ;
   private String AV98Accesso ;
   private String AV99CNESDSOP ;
   private String A248SSUSRID ;
   private String A9CNCIASDSC ;
   private String AV67SistemaErp ;
   private String AV66GenerarImpacto ;
   private String AV72EstatusR ;
   private String AV71fEstatusR ;
   private String A5940CNUSERID ;
   private String A172PMCTPRDSC ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV104AVDSPREST ;
   private String AV49INTPALID ;
   private String A1148INTPALID ;
   private String lblTxtscript_Caption ;
   private String lblTxtsalir_Caption ;
   private String lblTxtsalir_Internalname ;
   private String tblKdsfilterleft_Internalname ;
   private String lblKdsaplicarcriterios2_Internalname ;
   private String lblKdsaplicarcriterios2_Jsonclick ;
   private String Mensaje_Title ;
   private String Mensaje_Internalname ;
   private String lblTxtscript_Jsonclick ;
   private String tblKdsfilterlist_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String TempTags ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavNdc_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String edtavCncdirid_Jsonclick ;
   private String lblKdsaplicarcriterios_Internalname ;
   private String lblKdsaplicarcriterios_Jsonclick ;
   private String tblKdstablacontenido_Internalname ;
   private String tblTable1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String tblTable6_Internalname ;
   private String lblTxtsalir_Jsonclick ;
   private String lblTxtbuscar_Jsonclick ;
   private String lblTxtsalir2_Jsonclick ;
   private String Innewwindow1_Internalname ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavRec2_Jsonclick ;
   private String edtavAlta_Jsonclick ;
   private String edtavCntdocdsc_Jsonclick ;
   private String edtavPmctprdsc_Jsonclick ;
   private String edtavCndsprtdc_Jsonclick ;
   private String edtavCndsprndc_Jsonclick ;
   private String edtavCncdirnom_Jsonclick ;
   private String edtavCndsprfolcon_Jsonclick ;
   private String edtavCndspralctr_Jsonclick ;
   private String edtavCndsprfcon_Jsonclick ;
   private String edtavCndsprmon_Jsonclick ;
   private String edtavCndsprimpbas_Jsonclick ;
   private String edtavMontoacumulado_Jsonclick ;
   private String edtavMonto_Jsonclick ;
   private String edtavMontopendiente_Jsonclick ;
   private String edtavCndsprfitr_Jsonclick ;
   private String edtavCndsprfftr_Jsonclick ;
   private String edtavCncdirnom_res_Jsonclick ;
   private String edtavCndsprrescon_Jsonclick ;
   private String edtavCndsprtrndc_Jsonclick ;
   private java.util.Date A7566CNDSPRTRN ;
   private java.util.Date A7523CNDSPRFCON ;
   private java.util.Date A7528CNDSPRFITR ;
   private java.util.Date A7529CNDSPRFFTR ;
   private java.util.Date AV78CNDSPRFCON ;
   private java.util.Date AV82CNDSPRFITR ;
   private java.util.Date AV83CNDSPRFFTR ;
   private java.util.Date AV77CNDSPRTRN ;
   private boolean entryPointCalled ;
   private boolean n194CNCDIRNOM ;
   private boolean n7521CNDSPRPRID ;
   private boolean n7522CNDSPRCON ;
   private boolean n7927CNDSPREST ;
   private boolean n9293CNDSPRTREST ;
   private boolean AV45consultar ;
   private boolean n7566CNDSPRTRN ;
   private boolean n7523CNDSPRFCON ;
   private boolean n7524CNDSPRFOLCON ;
   private boolean n7526CNDSPRMNTANT ;
   private boolean n7527CNDSPRMON ;
   private boolean n7528CNDSPRFITR ;
   private boolean n7529CNDSPRFFTR ;
   private boolean n7533CNDSPRMNTCON ;
   private boolean n7536CNDSPRIMPBAS ;
   private boolean n7530CNDSPRRESCON ;
   private boolean n14386CNDSPRURS ;
   private boolean n21CNTDOCDSC ;
   private boolean n7800AVDSPREST ;
   private boolean n7862AVDSPRCAN ;
   private boolean n7795AVDSPRIMP ;
   private boolean n7545CNDSPRTRIMP ;
   private boolean n7601CNDSPRTRNDC ;
   private boolean n7550CNDSPRTRALC ;
   private boolean n6299PMCTPREJ ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n9CNCIASDSC ;
   private boolean n172PMCTPRDSC ;
   private boolean n1148INTPALID ;
   private boolean n7563CNCDIRCON ;
   private boolean n382CNTPDRID ;
   private String A7550CNDSPRTRALC ;
   private String AV84CNDSPRALCTR ;
   private String AV62REC2 ;
   private String AV92alta ;
   private String AV97archivos ;
   private GXSimpleCollection<Long> AV101arrCNCIASID ;
   private GXSimpleCollection<Long> GXv_objcol_int5[] ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV50KDSSESSION ;
   private com.genexus.webpanels.GXUserControl ucMensaje ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private HTMLChoice cmbavCnciasid ;
   private HTMLChoice cmbavPmctprid ;
   private HTMLChoice cmbavTdc ;
   private IDataStoreProvider pr_default ;
   private String[] H01XA2_A194CNCDIRNOM ;
   private boolean[] H01XA2_n194CNCDIRNOM ;
   private String[] H01XA3_A248SSUSRID ;
   private String[] H01XA3_A9CNCIASDSC ;
   private boolean[] H01XA3_n9CNCIASDSC ;
   private long[] H01XA3_A289SSUSRCIAS ;
   private String[] H01XA4_A5940CNUSERID ;
   private String[] H01XA4_A171PMCTPRID ;
   private String[] H01XA4_A172PMCTPRDSC ;
   private boolean[] H01XA4_n172PMCTPRDSC ;
   private java.math.BigDecimal[] H01XA5_A7540CNDSPRTRLIN ;
   private long[] H01XA5_A7518CNDSPRCIA ;
   private String[] H01XA5_A7927CNDSPREST ;
   private boolean[] H01XA5_n7927CNDSPREST ;
   private String[] H01XA5_A9293CNDSPRTREST ;
   private boolean[] H01XA5_n9293CNDSPRTREST ;
   private long[] H01XA5_A7522CNDSPRCON ;
   private boolean[] H01XA5_n7522CNDSPRCON ;
   private String[] H01XA5_A7521CNDSPRPRID ;
   private boolean[] H01XA5_n7521CNDSPRPRID ;
   private long[] H01XA5_A7520CNDSPRNDC ;
   private String[] H01XA5_A7519CNDSPRTDC ;
   private java.util.Date[] H01XA5_A7566CNDSPRTRN ;
   private boolean[] H01XA5_n7566CNDSPRTRN ;
   private java.util.Date[] H01XA5_A7523CNDSPRFCON ;
   private boolean[] H01XA5_n7523CNDSPRFCON ;
   private String[] H01XA5_A7524CNDSPRFOLCON ;
   private boolean[] H01XA5_n7524CNDSPRFOLCON ;
   private java.math.BigDecimal[] H01XA5_A7526CNDSPRMNTANT ;
   private boolean[] H01XA5_n7526CNDSPRMNTANT ;
   private String[] H01XA5_A7527CNDSPRMON ;
   private boolean[] H01XA5_n7527CNDSPRMON ;
   private java.util.Date[] H01XA5_A7528CNDSPRFITR ;
   private boolean[] H01XA5_n7528CNDSPRFITR ;
   private java.util.Date[] H01XA5_A7529CNDSPRFFTR ;
   private boolean[] H01XA5_n7529CNDSPRFFTR ;
   private java.math.BigDecimal[] H01XA5_A7533CNDSPRMNTCON ;
   private boolean[] H01XA5_n7533CNDSPRMNTCON ;
   private java.math.BigDecimal[] H01XA5_A7536CNDSPRIMPBAS ;
   private boolean[] H01XA5_n7536CNDSPRIMPBAS ;
   private String[] H01XA5_A7530CNDSPRRESCON ;
   private boolean[] H01XA5_n7530CNDSPRRESCON ;
   private String[] H01XA5_A14386CNDSPRURS ;
   private boolean[] H01XA5_n14386CNDSPRURS ;
   private String[] H01XA6_A171PMCTPRID ;
   private long[] H01XA6_A6299PMCTPREJ ;
   private boolean[] H01XA6_n6299PMCTPREJ ;
   private long[] H01XA7_A46CNCDIRID ;
   private String[] H01XA7_A194CNCDIRNOM ;
   private boolean[] H01XA7_n194CNCDIRNOM ;
   private String[] H01XA8_A7791AVDSPRTDC ;
   private long[] H01XA8_A7790AVDSPRNDC ;
   private long[] H01XA8_A7789AVDSPRCIA ;
   private long[] H01XA8_A8255AVDSPRDOC ;
   private String[] H01XA8_A20CNTDOCID ;
   private String[] H01XA8_A7800AVDSPREST ;
   private boolean[] H01XA8_n7800AVDSPREST ;
   private java.math.BigDecimal[] H01XA8_A7862AVDSPRCAN ;
   private boolean[] H01XA8_n7862AVDSPRCAN ;
   private java.math.BigDecimal[] H01XA8_A7795AVDSPRIMP ;
   private boolean[] H01XA8_n7795AVDSPRIMP ;
   private java.math.BigDecimal[] H01XA8_A7792AVDSPRLIN ;
   private java.math.BigDecimal[] H01XA9_A7540CNDSPRTRLIN ;
   private long[] H01XA9_A7520CNDSPRNDC ;
   private String[] H01XA9_A7519CNDSPRTDC ;
   private long[] H01XA9_A7518CNDSPRCIA ;
   private java.math.BigDecimal[] H01XA9_A7545CNDSPRTRIMP ;
   private boolean[] H01XA9_n7545CNDSPRTRIMP ;
   private long[] H01XA9_A7601CNDSPRTRNDC ;
   private boolean[] H01XA9_n7601CNDSPRTRNDC ;
   private java.math.BigDecimal[] H01XA10_A7540CNDSPRTRLIN ;
   private long[] H01XA10_A7520CNDSPRNDC ;
   private String[] H01XA10_A7519CNDSPRTDC ;
   private long[] H01XA10_A7518CNDSPRCIA ;
   private String[] H01XA10_A7550CNDSPRTRALC ;
   private boolean[] H01XA10_n7550CNDSPRTRALC ;
   private long[] H01XA11_A281INPRODID ;
   private String[] H01XA11_A1148INTPALID ;
   private boolean[] H01XA11_n1148INTPALID ;
   private byte[] H01XA12_A7563CNCDIRCON ;
   private boolean[] H01XA12_n7563CNCDIRCON ;
   private String[] H01XA12_A382CNTPDRID ;
   private boolean[] H01XA12_n382CNTPDRID ;
   private String[] H01XA12_A194CNCDIRNOM ;
   private boolean[] H01XA12_n194CNCDIRNOM ;
   private long[] H01XA12_A46CNCDIRID ;
   private String[] H01XA13_A20CNTDOCID ;
   private String[] H01XA13_A21CNTDOCDSC ;
   private boolean[] H01XA13_n21CNTDOCDSC ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpavdest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV76tdc ,
                                          short AV75ndc ,
                                          String AV60PMCTPRID ,
                                          long A46CNCDIRID ,
                                          String A7519CNDSPRTDC ,
                                          long A7520CNDSPRNDC ,
                                          String A7521CNDSPRPRID ,
                                          long A7522CNDSPRCON ,
                                          long AV24CNCDIRID ,
                                          String A9293CNDSPRTREST ,
                                          boolean AV45consultar ,
                                          long A7518CNDSPRCIA ,
                                          long AV31CNCIASID ,
                                          String A7927CNDSPREST )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int7 ;
      GXv_int7 = new byte [6] ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      scmdbuf = "SELECT T1.CNDSPRTRLIN, T1.CNDSPRCIA, T2.CNDSPREST, T1.CNDSPRTREST, T2.CNDSPRCON," ;
      scmdbuf = scmdbuf + " T2.CNDSPRPRID, T1.CNDSPRNDC, T1.CNDSPRTDC, T2.CNDSPRTRN, T2.CNDSPRFCON, T2.CNDSPRFOLCON," ;
      scmdbuf = scmdbuf + " T2.CNDSPRMNTANT, T2.CNDSPRMON, T2.CNDSPRFITR, T2.CNDSPRFFTR, T2.CNDSPRMNTCON, T2.CNDSPRIMPBAS," ;
      scmdbuf = scmdbuf + " T2.CNDSPRRESCON, T2.CNDSPRURS FROM (CNDSPRTR T1 INNER JOIN CNDSPR T2 ON T2.CNDSPRCIA" ;
      scmdbuf = scmdbuf + " = T1.CNDSPRCIA AND T2.CNDSPRTDC = T1.CNDSPRTDC AND T2.CNDSPRNDC = T1.CNDSPRNDC)" ;
      scmdbuf = scmdbuf + " WHERE (T1.CNDSPRTREST <> ( 'RECHAZO'))" ;
      scmdbuf = scmdbuf + " and (? = TRUE)" ;
      scmdbuf = scmdbuf + " and (T1.CNDSPRCIA = ?)" ;
      scmdbuf = scmdbuf + " and (T2.CNDSPREST = ( 'AUTORIZADO'))" ;
      if ( ! (GXutil.strcmp("", AV76tdc)==0) )
      {
         sWhereString = sWhereString + " and (T1.CNDSPRTDC = ( ?))" ;
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (0==AV75ndc) )
      {
         sWhereString = sWhereString + " and (T1.CNDSPRNDC = ?)" ;
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60PMCTPRID)==0) )
      {
         sWhereString = sWhereString + " and (T2.CNDSPRPRID = ( ?))" ;
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( A46CNCDIRID != 0 )
      {
         sWhereString = sWhereString + " and (T2.CNDSPRCON = ?)" ;
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.CNDSPRNDC" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 3 :
                  return conditional_H01XA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XA2", "SELECT DISTINCT CNCDIRNOM FROM CNCDIR WHERE (UPPER(CNCDIRNOM) like '%' || UPPER(?)) AND (CNTPDRID = ( 'PR')) ORDER BY CNCDIRNOM  LIMIT 10",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H01XA3", "SELECT T1.SSUSRID, T2.CNCIASDSC, T1.SSUSRCIAS AS SSUSRCIAS FROM (SSUSRI1 T1 INNER JOIN CNCIAS T2 ON T2.CNCIASID = T1.SSUSRCIAS) WHERE T1.SSUSRID = ( ?) ORDER BY T1.SSUSRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA4", "SELECT T1.CNUSERID, T1.PMCTPRID, T2.PMCTPRDSC FROM (SSUSPR T1 INNER JOIN PMCTPR T2 ON T2.PMCTPRID = T1.PMCTPRID) WHERE T1.CNUSERID = ( ?) ORDER BY T2.PMCTPRDSC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA6", "SELECT PMCTPRID, PMCTPREJ FROM PMCTPR WHERE PMCTPRID = ( ?) ORDER BY PMCTPRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H01XA7", "SELECT CNCDIRID, CNCDIRNOM FROM CNCDIR WHERE CNCDIRID = ? ORDER BY CNCDIRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H01XA8", "SELECT AVDSPRTDC, AVDSPRNDC, AVDSPRCIA, AVDSPRDOC, CNTDOCID, AVDSPREST, AVDSPRCAN, AVDSPRIMP, AVDSPRLIN FROM AVDSPR WHERE (AVDSPREST <> ( 'Cancelado')) AND (AVDSPREST <> ( 'Rechazado')) AND (AVDSPRCIA = ?) AND (AVDSPRDOC = ?) AND (CNTDOCID = ( ?)) ORDER BY AVDSPRLIN ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA9", "SELECT CNDSPRTRLIN, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRTRIMP, CNDSPRTRNDC FROM CNDSPRTR WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA10", "SELECT CNDSPRTRLIN, CNDSPRNDC, CNDSPRTDC, CNDSPRCIA, CNDSPRTRALC FROM CNDSPRTR WHERE CNDSPRCIA = ? and CNDSPRTDC = ( ?) and CNDSPRNDC = ? ORDER BY CNDSPRCIA, CNDSPRTDC, CNDSPRNDC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA11", "SELECT INPRODID, INTPALID FROM INPROD WHERE INPRODID = ? ORDER BY INPRODID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H01XA12", "SELECT CNCDIRCON, CNTPDRID, CNCDIRNOM, CNCDIRID FROM CNCDIR WHERE (CNTPDRID = ( 'PR')) AND (CNCDIRNOM = ( ?)) AND (CNCDIRCON = 1) ORDER BY CNTPDRID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H01XA13", "SELECT CNTDOCID, CNTDOCDSC FROM CNTDOC WHERE CNTDOCID = ( ?) ORDER BY CNTDOCID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 60) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 10) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 200) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 10) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((String[]) buf[11])[0] = rslt.getString(8, 3) ;
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 50) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(17,2) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 200) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 250) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 3) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 10) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,3) ;
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 3) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 250) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 30) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
            case 0 :
               stmt.setString(1, (String)parms[0], 250);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBoolean(sIdx, ((Boolean) parms[6]).booleanValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 250);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

