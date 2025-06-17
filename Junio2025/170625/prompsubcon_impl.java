/*
               File: prompsubcon_impl
        Description: Subconceptos
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: June 17, 2025 14:16:4.97
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

public final  class prompsubcon_impl extends GXDataArea
{
   public prompsubcon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public prompsubcon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prompsubcon_impl.class ));
   }

   public prompsubcon_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_25 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_25_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_25_idx = httpContext.GetNextPar( ) ;
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
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9SDTIndSubCon);
            AV55Expand = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV9SDTIndSubCon, AV55Expand) ;
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
            AV13CNDSPRCIA = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CNDSPRCIA", GXutil.ltrim( GXutil.str( AV13CNDSPRCIA, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14CNDSPRTDC = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CNDSPRTDC", AV14CNDSPRTDC);
               AV15CNDSPRNDC = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15CNDSPRNDC", GXutil.ltrim( GXutil.str( AV15CNDSPRNDC, 10, 0)));
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
      pa4942( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start4942( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2025617141652", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("com.kdsproyectos.prompsubcon") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13CNDSPRCIA,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14CNDSPRTDC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15CNDSPRNDC,10,0)))+"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_25", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_25, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTINDSUBCON", AV9SDTIndSubCon);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTINDSUBCON", AV9SDTIndSubCon);
      }
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vEXPAND", AV55Expand);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNUSERID", GXutil.rtrim( AV59CNUSERID));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRCIA", GXutil.ltrim( localUtil.ntoc( AV13CNDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRTDC", GXutil.rtrim( AV14CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONBASE", GXutil.ltrim( localUtil.ntoc( A18147CNDSPRSUBCONBASE, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPERT", GXutil.ltrim( localUtil.ntoc( A18148CNDSPRSUBCONPERT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPERTN2", GXutil.ltrim( localUtil.ntoc( A18149CNDSPRSUBCONPERTN2, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPERTN3", GXutil.ltrim( localUtil.ntoc( A18150CNDSPRSUBCONPERTN3, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPERTN4", GXutil.ltrim( localUtil.ntoc( A18151CNDSPRSUBCONPERTN4, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPERTN5", GXutil.ltrim( localUtil.ntoc( A18152CNDSPRSUBCONPERTN5, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRCIA", GXutil.ltrim( localUtil.ntoc( A7518CNDSPRCIA, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRTDC", GXutil.rtrim( A7519CNDSPRTDC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRNDC", GXutil.ltrim( localUtil.ntoc( A7520CNDSPRNDC, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONID", GXutil.ltrim( localUtil.ntoc( A18146CNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONCLA", GXutil.rtrim( A18153CNDSPRSUBCONCLA));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONDSC", GXutil.rtrim( A18154CNDSPRSUBCONDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONPREUNI", GXutil.ltrim( localUtil.ntoc( A18155CNDSPRSUBCONPREUNI, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONUNIMED", GXutil.rtrim( A18156CNDSPRSUBCONUNIMED));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONCAN", GXutil.ltrim( localUtil.ntoc( A18157CNDSPRSUBCONCAN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONTOT", GXutil.ltrim( localUtil.ntoc( A18158CNDSPRSUBCONTOT, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "CNDSPRSUBCONTIP", GXutil.rtrim( A18159CNDSPRSUBCONTIP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONID", GXutil.ltrim( localUtil.ntoc( AV36CNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONCLA", GXutil.rtrim( AV19CNDSPRSUBCONCLA));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONDSC", GXutil.rtrim( AV16CNDSPRSUBCONDSC));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPREUNI", GXutil.ltrim( localUtil.ntoc( AV17CNDSPRSUBCONPREUNI, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONUNIMED", GXutil.rtrim( AV20CNDSPRSUBCONUNIMED));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONCAN", GXutil.ltrim( localUtil.ntoc( AV18CNDSPRSUBCONCAN, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONTOT", GXutil.ltrim( localUtil.ntoc( AV21CNDSPRSUBCONTOT, (byte)(15), (byte)(2), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONTIP", GXutil.rtrim( AV22CNDSPRSUBCONTIP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONBASE", GXutil.ltrim( localUtil.ntoc( AV28CNDSPRSUBCONBASE, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPERT", GXutil.ltrim( localUtil.ntoc( AV29CNDSPRSUBCONPERT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPERTN2", GXutil.ltrim( localUtil.ntoc( AV30CNDSPRSUBCONPERTN2, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPERTN3", GXutil.ltrim( localUtil.ntoc( AV31CNDSPRSUBCONPERTN3, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPERTN4", GXutil.ltrim( localUtil.ntoc( AV32CNDSPRSUBCONPERTN4, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vCNDSPRSUBCONPERTN5", GXutil.ltrim( localUtil.ntoc( AV26CNDSPRSUBCONPERTN5, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARLINEA", AV34MostrarLinea);
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vINDEXSDT", GXutil.ltrim( localUtil.ntoc( AV10IndexSDT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vABIERTO", GXutil.ltrim( localUtil.ntoc( AV33Abierto, (byte)(1), (byte)(0), ".", "")));
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
         we4942( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt4942( ) ;
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
      return formatLink("com.kdsproyectos.prompsubcon") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13CNDSPRCIA,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV14CNDSPRTDC)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15CNDSPRNDC,10,0))) ;
   }

   public String getPgmname( )
   {
      return "prompSubCon" ;
   }

   public String getPgmdesc( )
   {
      return "Subconceptos" ;
   }

   public void wb4940( )
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
         wb_table1_2_4942( true) ;
      }
      else
      {
         wb_table1_2_4942( false) ;
      }
      return  ;
   }

   public void wb_table1_2_4942e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      if ( wbEnd == 25 )
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

   public void start4942( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 16_0_1-129648", (short)(0)) ;
         Form.getMeta().addItem("description", "Subconceptos", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup4940( ) ;
   }

   public void ws4942( )
   {
      start4942( ) ;
      evt4942( ) ;
   }

   public void evt4942( )
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
                        else if ( GXutil.strcmp(sEvt, "'SALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Salir' */
                           e114942 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Actualizar' */
                           e124942 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'COLAPSAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'COLAPSAR'") == 0 ) )
                        {
                           nGXsfl_25_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_252( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSDTINDEX");
                              GX_FocusControl = edtavSdtindex_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV53SDTIndex = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavSdtindex_Internalname, GXutil.ltrim( GXutil.str( AV53SDTIndex, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSDTINDEX"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV53SDTIndex = localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavSdtindex_Internalname, GXutil.ltrim( GXutil.str( AV53SDTIndex, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSDTINDEX"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")));
                           }
                           AV57Colapsar = httpContext.cgiGet( edtavColapsar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
                           AV58dscSC = httpContext.cgiGet( edtavDscsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
                           AV41gCNDSPRSUBCONDSC = httpContext.cgiGet( edtavGcndsprsubcondsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcondsc_Internalname, AV41gCNDSPRSUBCONDSC);
                           AV40gCNDSPRSUBCONCLA = httpContext.cgiGet( edtavGcndsprsubconcla_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcla_Internalname, AV40gCNDSPRSUBCONCLA);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN_O");
                              GX_FocusControl = edtavGcndsprsubconcan_o_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV63gCNDSPRSUBCONCAN_O = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_o_Internalname, GXutil.ltrim( GXutil.str( AV63gCNDSPRSUBCONCAN_O, 15, 2)));
                           }
                           else
                           {
                              AV63gCNDSPRSUBCONCAN_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_o_Internalname, GXutil.ltrim( GXutil.str( AV63gCNDSPRSUBCONCAN_O, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN");
                              GX_FocusControl = edtavGcndsprsubconcan_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44gCNDSPRSUBCONCAN = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV44gCNDSPRSUBCONCAN, 15, 2)));
                           }
                           else
                           {
                              AV44gCNDSPRSUBCONCAN = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV44gCNDSPRSUBCONCAN, 15, 2)));
                           }
                           AV43gCNDSPRSUBCONUNIMED = httpContext.cgiGet( edtavGcndsprsubconunimed_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconunimed_Internalname, AV43gCNDSPRSUBCONUNIMED);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI_O");
                              GX_FocusControl = edtavGcndsprsubconpreuni_o_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV62gCNDSPRSUBCONPREUNI_O = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_o_Internalname, GXutil.ltrim( GXutil.str( AV62gCNDSPRSUBCONPREUNI_O, 15, 2)));
                           }
                           else
                           {
                              AV62gCNDSPRSUBCONPREUNI_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_o_Internalname, GXutil.ltrim( GXutil.str( AV62gCNDSPRSUBCONPREUNI_O, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI");
                              GX_FocusControl = edtavGcndsprsubconpreuni_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42gCNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV42gCNDSPRSUBCONPREUNI, 15, 2)));
                           }
                           else
                           {
                              AV42gCNDSPRSUBCONPREUNI = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV42gCNDSPRSUBCONPREUNI, 15, 2)));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONTOT");
                              GX_FocusControl = edtavGcndsprsubcontot_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45gCNDSPRSUBCONTOT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontot_Internalname, GXutil.ltrim( GXutil.str( AV45gCNDSPRSUBCONTOT, 15, 2)));
                           }
                           else
                           {
                              AV45gCNDSPRSUBCONTOT = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontot_Internalname, GXutil.ltrim( GXutil.str( AV45gCNDSPRSUBCONTOT, 15, 2)));
                           }
                           AV46gCNDSPRSUBCONTIP = httpContext.cgiGet( edtavGcndsprsubcontip_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontip_Internalname, AV46gCNDSPRSUBCONTIP);
                           httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONTIP"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( AV46gCNDSPRSUBCONTIP, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONID");
                              GX_FocusControl = edtavGcndsprsubconid_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV39gCNDSPRSUBCONID = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV39gCNDSPRSUBCONID, 10, 0)));
                           }
                           else
                           {
                              AV39gCNDSPRSUBCONID = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV39gCNDSPRSUBCONID, 10, 0)));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONBASE");
                              GX_FocusControl = edtavGcndsprsubconbase_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV47gCNDSPRSUBCONBASE = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconbase_Internalname, GXutil.ltrim( GXutil.str( AV47gCNDSPRSUBCONBASE, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONBASE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV47gCNDSPRSUBCONBASE = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconbase_Internalname, GXutil.ltrim( GXutil.str( AV47gCNDSPRSUBCONBASE, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONBASE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERT");
                              GX_FocusControl = edtavGcndsprsubconpert_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV48gCNDSPRSUBCONPERT = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpert_Internalname, GXutil.ltrim( GXutil.str( AV48gCNDSPRSUBCONPERT, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERT"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV48gCNDSPRSUBCONPERT = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpert_Internalname, GXutil.ltrim( GXutil.str( AV48gCNDSPRSUBCONPERT, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERT"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN2");
                              GX_FocusControl = edtavGcndsprsubconpertn2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV49gCNDSPRSUBCONPERTN2 = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn2_Internalname, GXutil.ltrim( GXutil.str( AV49gCNDSPRSUBCONPERTN2, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN2"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV49gCNDSPRSUBCONPERTN2 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn2_Internalname, GXutil.ltrim( GXutil.str( AV49gCNDSPRSUBCONPERTN2, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN2"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN3");
                              GX_FocusControl = edtavGcndsprsubconpertn3_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50gCNDSPRSUBCONPERTN3 = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn3_Internalname, GXutil.ltrim( GXutil.str( AV50gCNDSPRSUBCONPERTN3, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN3"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV50gCNDSPRSUBCONPERTN3 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn3_Internalname, GXutil.ltrim( GXutil.str( AV50gCNDSPRSUBCONPERTN3, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN3"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN4");
                              GX_FocusControl = edtavGcndsprsubconpertn4_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV51gCNDSPRSUBCONPERTN4 = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn4_Internalname, GXutil.ltrim( GXutil.str( AV51gCNDSPRSUBCONPERTN4, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN4"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV51gCNDSPRSUBCONPERTN4 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn4_Internalname, GXutil.ltrim( GXutil.str( AV51gCNDSPRSUBCONPERTN4, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN4"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN5");
                              GX_FocusControl = edtavGcndsprsubconpertn5_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV52gCNDSPRSUBCONPERTN5 = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn5_Internalname, GXutil.ltrim( GXutil.str( AV52gCNDSPRSUBCONPERTN5, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN5"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")));
                           }
                           else
                           {
                              AV52gCNDSPRSUBCONPERTN5 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn5_Internalname, GXutil.ltrim( GXutil.str( AV52gCNDSPRSUBCONPERTN5, 10, 0)));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN5"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNODO_ABIERTO");
                              GX_FocusControl = edtavNodo_abierto_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV54nodo_abierto = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNodo_abierto_Internalname, GXutil.str( AV54nodo_abierto, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vNODO_ABIERTO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")));
                           }
                           else
                           {
                              AV54nodo_abierto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNodo_abierto_Internalname, GXutil.str( AV54nodo_abierto, 1, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "gxhash_vNODO_ABIERTO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")));
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
                                 e134942 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e144942 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'COLAPSAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Colapsar' */
                                 e154942 ();
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we4942( )
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

   public void pa4942( )
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
      subsflControlProps_252( ) ;
      while ( nGXsfl_25_idx <= nRC_GXsfl_25 )
      {
         sendrow_252( ) ;
         nGXsfl_25_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      httpContext.GX_webresponse.addString(httpContext.getJSONContainerResponse( Grid1Container));
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( GXBaseCollection<com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem> AV9SDTIndSubCon ,
                                  String AV55Expand )
   {
      initialize_formulas( ) ;
      com.kdsproyectos.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf4942( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONTIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46gCNDSPRSUBCONTIP, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONTIP", GXutil.rtrim( AV46gCNDSPRSUBCONTIP));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNODO_ABIERTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vNODO_ABIERTO", GXutil.ltrim( localUtil.ntoc( AV54nodo_abierto, (byte)(1), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTINDEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vSDTINDEX", GXutil.ltrim( localUtil.ntoc( AV53SDTIndex, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN4", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPERTN4", GXutil.ltrim( localUtil.ntoc( AV51gCNDSPRSUBCONPERTN4, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONBASE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONBASE", GXutil.ltrim( localUtil.ntoc( AV47gCNDSPRSUBCONBASE, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPERT", GXutil.ltrim( localUtil.ntoc( AV48gCNDSPRSUBCONPERT, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPERTN2", GXutil.ltrim( localUtil.ntoc( AV49gCNDSPRSUBCONPERTN2, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN3", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPERTN3", GXutil.ltrim( localUtil.ntoc( AV50gCNDSPRSUBCONPERTN3, (byte)(10), (byte)(0), ".", "")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN5", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "vGCNDSPRSUBCONPERTN5", GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONPERTN5, (byte)(10), (byte)(0), ".", "")));
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
      rf4942( ) ;
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
      edtavSdtindex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtindex_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSdtindex_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavColapsar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColapsar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavColapsar_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDscsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDscsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDscsc_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcla_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcan_o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_o_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_o_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconunimed_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconunimed_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpreuni_o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_o_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_o_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcontot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontot_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcontip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontip_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconid_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconbase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconbase_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconbase_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpert_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpert_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpert_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn2_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn3_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn4_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn5_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn5_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavNodo_abierto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNodo_abierto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNodo_abierto_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
   }

   public void rf4942( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(25) ;
      nGXsfl_25_idx = (short)(1) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      bGXsfl_25_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "KDSResponsiveTable");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Titlefont", GXutil.rtrim( subGrid1_Titlefont));
      Grid1Container.AddObjectProperty("Linesfont", GXutil.rtrim( subGrid1_Linesfont));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_252( ) ;
         e144942 ();
         wbEnd = (short)(25) ;
         wb4940( ) ;
      }
      bGXsfl_25_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes4942( )
   {
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONTIP"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( AV46gCNDSPRSUBCONTIP, ""))));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNODO_ABIERTO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTINDEX"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN4"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONBASE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERT"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN2"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN3"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")));
      com.kdsproyectos.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGCNDSPRSUBCONPERTN5"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")));
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

   public void strup4940( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavSdtindex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtindex_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSdtindex_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavColapsar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColapsar_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavColapsar_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavDscsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDscsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDscsc_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcondsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcondsc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcondsc_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcla_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcla_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcan_o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_o_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_o_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconcan_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconcan_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconunimed_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconunimed_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpreuni_o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_o_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_o_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpreuni_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpreuni_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcontot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontot_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontot_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubcontip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubcontip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubcontip_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconid_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconid_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconbase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconbase_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconbase_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpert_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpert_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpert_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn2_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn3_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn3_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn4_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn4_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavGcndsprsubconpertn5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGcndsprsubconpertn5_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavGcndsprsubconpertn5_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      edtavNodo_abierto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNodo_abierto_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNodo_abierto_Enabled, 5, 0)), !bGXsfl_25_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e134942 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         nRC_GXsfl_25 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ".", ",")) ;
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
      e134942 ();
      if (returnInSub) return;
   }

   public void e134942( )
   {
      /* Start Routine */
      AV59CNUSERID = AV60KDSSESSION.getValue("CNUSERID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59CNUSERID", AV59CNUSERID);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.kdsproyectos.md_buttons(remoteHandle, context).execute( "2", "", "contained", "", "Regresar", GXv_char2) ;
      prompsubcon_impl.this.GXt_char1 = GXv_char2[0] ;
      lblTxtregresar_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtregresar_Internalname, "Caption", lblTxtregresar_Caption, true);
      /* Execute user subroutine: 'CARGA ESTRUCTURA' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'CARGA ESTRUCTURA' Routine */
      AV9SDTIndSubCon.clear();
      AV10IndexSDT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10IndexSDT", GXutil.ltrim( GXutil.str( AV10IndexSDT, 10, 0)));
      /* Using cursor H04942 */
      pr_default.execute(0, new Object[] {new Long(AV13CNDSPRCIA), AV14CNDSPRTDC, new Long(AV15CNDSPRNDC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7518CNDSPRCIA = H04942_A7518CNDSPRCIA[0] ;
         A7519CNDSPRTDC = H04942_A7519CNDSPRTDC[0] ;
         A7520CNDSPRNDC = H04942_A7520CNDSPRNDC[0] ;
         A18146CNDSPRSUBCONID = H04942_A18146CNDSPRSUBCONID[0] ;
         A18153CNDSPRSUBCONCLA = H04942_A18153CNDSPRSUBCONCLA[0] ;
         n18153CNDSPRSUBCONCLA = H04942_n18153CNDSPRSUBCONCLA[0] ;
         A18154CNDSPRSUBCONDSC = H04942_A18154CNDSPRSUBCONDSC[0] ;
         n18154CNDSPRSUBCONDSC = H04942_n18154CNDSPRSUBCONDSC[0] ;
         A18155CNDSPRSUBCONPREUNI = H04942_A18155CNDSPRSUBCONPREUNI[0] ;
         n18155CNDSPRSUBCONPREUNI = H04942_n18155CNDSPRSUBCONPREUNI[0] ;
         A18156CNDSPRSUBCONUNIMED = H04942_A18156CNDSPRSUBCONUNIMED[0] ;
         n18156CNDSPRSUBCONUNIMED = H04942_n18156CNDSPRSUBCONUNIMED[0] ;
         A18157CNDSPRSUBCONCAN = H04942_A18157CNDSPRSUBCONCAN[0] ;
         n18157CNDSPRSUBCONCAN = H04942_n18157CNDSPRSUBCONCAN[0] ;
         A18158CNDSPRSUBCONTOT = H04942_A18158CNDSPRSUBCONTOT[0] ;
         n18158CNDSPRSUBCONTOT = H04942_n18158CNDSPRSUBCONTOT[0] ;
         A18159CNDSPRSUBCONTIP = H04942_A18159CNDSPRSUBCONTIP[0] ;
         n18159CNDSPRSUBCONTIP = H04942_n18159CNDSPRSUBCONTIP[0] ;
         A18152CNDSPRSUBCONPERTN5 = H04942_A18152CNDSPRSUBCONPERTN5[0] ;
         n18152CNDSPRSUBCONPERTN5 = H04942_n18152CNDSPRSUBCONPERTN5[0] ;
         A18151CNDSPRSUBCONPERTN4 = H04942_A18151CNDSPRSUBCONPERTN4[0] ;
         n18151CNDSPRSUBCONPERTN4 = H04942_n18151CNDSPRSUBCONPERTN4[0] ;
         A18150CNDSPRSUBCONPERTN3 = H04942_A18150CNDSPRSUBCONPERTN3[0] ;
         n18150CNDSPRSUBCONPERTN3 = H04942_n18150CNDSPRSUBCONPERTN3[0] ;
         A18149CNDSPRSUBCONPERTN2 = H04942_A18149CNDSPRSUBCONPERTN2[0] ;
         n18149CNDSPRSUBCONPERTN2 = H04942_n18149CNDSPRSUBCONPERTN2[0] ;
         A18148CNDSPRSUBCONPERT = H04942_A18148CNDSPRSUBCONPERT[0] ;
         n18148CNDSPRSUBCONPERT = H04942_n18148CNDSPRSUBCONPERT[0] ;
         A18147CNDSPRSUBCONBASE = H04942_A18147CNDSPRSUBCONBASE[0] ;
         n18147CNDSPRSUBCONBASE = H04942_n18147CNDSPRSUBCONBASE[0] ;
         AV36CNDSPRSUBCONID = A18146CNDSPRSUBCONID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36CNDSPRSUBCONID", GXutil.ltrim( GXutil.str( AV36CNDSPRSUBCONID, 10, 0)));
         AV19CNDSPRSUBCONCLA = A18153CNDSPRSUBCONCLA ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19CNDSPRSUBCONCLA", AV19CNDSPRSUBCONCLA);
         AV16CNDSPRSUBCONDSC = A18154CNDSPRSUBCONDSC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CNDSPRSUBCONDSC", AV16CNDSPRSUBCONDSC);
         AV17CNDSPRSUBCONPREUNI = A18155CNDSPRSUBCONPREUNI ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17CNDSPRSUBCONPREUNI", GXutil.ltrim( GXutil.str( AV17CNDSPRSUBCONPREUNI, 15, 2)));
         AV20CNDSPRSUBCONUNIMED = A18156CNDSPRSUBCONUNIMED ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20CNDSPRSUBCONUNIMED", AV20CNDSPRSUBCONUNIMED);
         AV18CNDSPRSUBCONCAN = A18157CNDSPRSUBCONCAN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18CNDSPRSUBCONCAN", GXutil.ltrim( GXutil.str( AV18CNDSPRSUBCONCAN, 15, 2)));
         AV21CNDSPRSUBCONTOT = A18158CNDSPRSUBCONTOT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21CNDSPRSUBCONTOT", GXutil.ltrim( GXutil.str( AV21CNDSPRSUBCONTOT, 15, 2)));
         AV22CNDSPRSUBCONTIP = A18159CNDSPRSUBCONTIP ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22CNDSPRSUBCONTIP", AV22CNDSPRSUBCONTIP);
         AV28CNDSPRSUBCONBASE = A18147CNDSPRSUBCONBASE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28CNDSPRSUBCONBASE", GXutil.ltrim( GXutil.str( AV28CNDSPRSUBCONBASE, 10, 0)));
         AV29CNDSPRSUBCONPERT = A18148CNDSPRSUBCONPERT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CNDSPRSUBCONPERT", GXutil.ltrim( GXutil.str( AV29CNDSPRSUBCONPERT, 10, 0)));
         AV30CNDSPRSUBCONPERTN2 = A18149CNDSPRSUBCONPERTN2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30CNDSPRSUBCONPERTN2", GXutil.ltrim( GXutil.str( AV30CNDSPRSUBCONPERTN2, 10, 0)));
         AV31CNDSPRSUBCONPERTN3 = A18150CNDSPRSUBCONPERTN3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31CNDSPRSUBCONPERTN3", GXutil.ltrim( GXutil.str( AV31CNDSPRSUBCONPERTN3, 10, 0)));
         AV32CNDSPRSUBCONPERTN4 = A18151CNDSPRSUBCONPERTN4 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CNDSPRSUBCONPERTN4", GXutil.ltrim( GXutil.str( AV32CNDSPRSUBCONPERTN4, 10, 0)));
         AV26CNDSPRSUBCONPERTN5 = A18152CNDSPRSUBCONPERTN5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26CNDSPRSUBCONPERTN5", GXutil.ltrim( GXutil.str( AV26CNDSPRSUBCONPERTN5, 10, 0)));
         if ( ( AV28CNDSPRSUBCONBASE != 0 ) && ( AV29CNDSPRSUBCONPERT == 0 ) && ( AV30CNDSPRSUBCONPERTN2 == 0 ) && ( AV31CNDSPRSUBCONPERTN3 == 0 ) && ( AV32CNDSPRSUBCONPERTN4 == 0 ) && ( AV26CNDSPRSUBCONPERTN5 == 0 ) )
         {
            AV34MostrarLinea = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         if ( ( AV29CNDSPRSUBCONPERT != 0 ) && ( AV30CNDSPRSUBCONPERTN2 == 0 ) && ( AV31CNDSPRSUBCONPERTN3 == 0 ) && ( AV32CNDSPRSUBCONPERTN4 == 0 ) && ( AV26CNDSPRSUBCONPERTN5 == 0 ) )
         {
            AV34MostrarLinea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         if ( ( AV30CNDSPRSUBCONPERTN2 != 0 ) && ( AV31CNDSPRSUBCONPERTN3 == 0 ) && ( AV32CNDSPRSUBCONPERTN4 == 0 ) && ( AV26CNDSPRSUBCONPERTN5 == 0 ) )
         {
            AV34MostrarLinea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         if ( ( AV31CNDSPRSUBCONPERTN3 != 0 ) && ( AV32CNDSPRSUBCONPERTN4 == 0 ) && ( AV26CNDSPRSUBCONPERTN5 == 0 ) )
         {
            AV34MostrarLinea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         if ( ( AV32CNDSPRSUBCONPERTN4 != 0 ) && ( AV26CNDSPRSUBCONPERTN5 == 0 ) )
         {
            AV34MostrarLinea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         if ( AV26CNDSPRSUBCONPERTN5 != 0 )
         {
            AV34MostrarLinea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34MostrarLinea", AV34MostrarLinea);
         }
         AV10IndexSDT = (long)(AV10IndexSDT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10IndexSDT", GXutil.ltrim( GXutil.str( AV10IndexSDT, 10, 0)));
         AV33Abierto = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Abierto", GXutil.str( AV33Abierto, 1, 0));
         /* Execute user subroutine: 'LLENAR SDT' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S123( )
   {
      /* 'LLENAR SDT' Routine */
      AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)new com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem(remoteHandle, context);
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconid( AV36CNDSPRSUBCONID );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconcla( AV19CNDSPRSUBCONCLA );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcondsc( AV16CNDSPRSUBCONDSC );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpreuni( AV17CNDSPRSUBCONPREUNI );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconunimed( AV20CNDSPRSUBCONUNIMED );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconcan( AV18CNDSPRSUBCONCAN );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcontot( AV21CNDSPRSUBCONTOT );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcontip( AV22CNDSPRSUBCONTIP );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase( AV28CNDSPRSUBCONBASE );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert( AV29CNDSPRSUBCONPERT );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2( AV30CNDSPRSUBCONPERTN2 );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3( AV31CNDSPRSUBCONPERTN3 );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4( AV32CNDSPRSUBCONPERTN4 );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn5( AV26CNDSPRSUBCONPERTN5 );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( AV34MostrarLinea );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Sdtindex( AV10IndexSDT );
      AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( AV33Abierto );
      AV9SDTIndSubCon.add(AV35SDTIndSubConItem.Clone(), 0);
   }

   private void e144942( )
   {
      /* Grid1_Load Routine */
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV9SDTIndSubCon.size() )
      {
         AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV68GXV1));
         AV38mostrarDato = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar() ;
         if ( AV38mostrarDato )
         {
            AV39gCNDSPRSUBCONID = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconid() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV39gCNDSPRSUBCONID, 10, 0)));
            AV40gCNDSPRSUBCONCLA = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconcla() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcla_Internalname, AV40gCNDSPRSUBCONCLA);
            AV41gCNDSPRSUBCONDSC = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcondsc() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcondsc_Internalname, AV41gCNDSPRSUBCONDSC);
            AV42gCNDSPRSUBCONPREUNI = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpreuni() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV42gCNDSPRSUBCONPREUNI, 15, 2)));
            AV62gCNDSPRSUBCONPREUNI_O = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpreuni() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_o_Internalname, GXutil.ltrim( GXutil.str( AV62gCNDSPRSUBCONPREUNI_O, 15, 2)));
            AV43gCNDSPRSUBCONUNIMED = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconunimed() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconunimed_Internalname, AV43gCNDSPRSUBCONUNIMED);
            AV44gCNDSPRSUBCONCAN = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconcan() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV44gCNDSPRSUBCONCAN, 15, 2)));
            AV63gCNDSPRSUBCONCAN_O = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconcan() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_o_Internalname, GXutil.ltrim( GXutil.str( AV63gCNDSPRSUBCONCAN_O, 15, 2)));
            AV45gCNDSPRSUBCONTOT = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcontot() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontot_Internalname, GXutil.ltrim( GXutil.str( AV45gCNDSPRSUBCONTOT, 15, 2)));
            AV46gCNDSPRSUBCONTIP = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubcontip() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubcontip_Internalname, AV46gCNDSPRSUBCONTIP);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONTIP"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, GXutil.rtrim( localUtil.format( AV46gCNDSPRSUBCONTIP, ""))));
            AV47gCNDSPRSUBCONBASE = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconbase_Internalname, GXutil.ltrim( GXutil.str( AV47gCNDSPRSUBCONBASE, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONBASE"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")));
            AV48gCNDSPRSUBCONPERT = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpert_Internalname, GXutil.ltrim( GXutil.str( AV48gCNDSPRSUBCONPERT, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERT"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")));
            AV49gCNDSPRSUBCONPERTN2 = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn2_Internalname, GXutil.ltrim( GXutil.str( AV49gCNDSPRSUBCONPERTN2, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN2"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")));
            AV50gCNDSPRSUBCONPERTN3 = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn3_Internalname, GXutil.ltrim( GXutil.str( AV50gCNDSPRSUBCONPERTN3, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN3"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")));
            AV51gCNDSPRSUBCONPERTN4 = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn4_Internalname, GXutil.ltrim( GXutil.str( AV51gCNDSPRSUBCONPERTN4, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN4"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")));
            AV52gCNDSPRSUBCONPERTN5 = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn5() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpertn5_Internalname, GXutil.ltrim( GXutil.str( AV52gCNDSPRSUBCONPERTN5, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vGCNDSPRSUBCONPERTN5"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")));
            AV53SDTIndex = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Sdtindex() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavSdtindex_Internalname, GXutil.ltrim( GXutil.str( AV53SDTIndex, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vSDTINDEX"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")));
            AV54nodo_abierto = AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto() ;
            httpContext.ajax_rsp_assign_attri("", false, edtavNodo_abierto_Internalname, GXutil.str( AV54nodo_abierto, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vNODO_ABIERTO"+"_"+sGXsfl_25_idx, getSecureSignedToken( sGXsfl_25_idx, localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")));
            if ( GXutil.strcmp(AV46gCNDSPRSUBCONTIP, "CA") == 0 )
            {
               if ( AV54nodo_abierto == 0 )
               {
                  AV55Expand = "<i class=\"KDSGridButton\">expand_more</i>" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55Expand", AV55Expand);
               }
               else
               {
                  AV55Expand = "<i class=\"KDSGridButton\">expand_less</i>" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55Expand", AV55Expand);
               }
               edtavGcndsprsubconcan_Enabled = 0 ;
               edtavGcndsprsubconpreuni_Enabled = 0 ;
            }
            else if ( GXutil.strcmp(AV46gCNDSPRSUBCONTIP, "SA") == 0 )
            {
               if ( AV54nodo_abierto == 0 )
               {
                  AV55Expand = "<i class=\"KDSGridButton\">unfold_more</i>" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55Expand", AV55Expand);
               }
               else
               {
                  AV55Expand = "<i class=\"KDSGridButton\">unfold_less</i>" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55Expand", AV55Expand);
               }
               edtavGcndsprsubconcan_Enabled = 0 ;
               edtavGcndsprsubconpreuni_Enabled = 0 ;
            }
            else
            {
               AV55Expand = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55Expand", AV55Expand);
               edtavGcndsprsubconcan_Enabled = 1 ;
               edtavGcndsprsubconpreuni_Enabled = 1 ;
            }
            if ( AV52gCNDSPRSUBCONPERTN5 != 0 )
            {
               AV57Colapsar = "<div style=\"padding-left: 50px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 50px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            else if ( ( AV51gCNDSPRSUBCONPERTN4 != 0 ) && ( AV52gCNDSPRSUBCONPERTN5 == 0 ) )
            {
               AV57Colapsar = "<div style=\"padding-left: 40px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 40px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            else if ( ( AV50gCNDSPRSUBCONPERTN3 != 0 ) && ( AV51gCNDSPRSUBCONPERTN4 == 0 ) && ( AV52gCNDSPRSUBCONPERTN5 == 0 ) )
            {
               AV57Colapsar = "<div style=\"padding-left: 30px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 30px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            else if ( ( AV49gCNDSPRSUBCONPERTN2 != 0 ) && ( AV50gCNDSPRSUBCONPERTN3 == 0 ) && ( AV51gCNDSPRSUBCONPERTN4 == 0 ) && ( AV52gCNDSPRSUBCONPERTN5 == 0 ) )
            {
               AV57Colapsar = "<div style=\"padding-left: 20px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 20px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            else if ( ( AV48gCNDSPRSUBCONPERT != 0 ) && ( AV49gCNDSPRSUBCONPERTN2 == 0 ) && ( AV50gCNDSPRSUBCONPERTN3 == 0 ) && ( AV51gCNDSPRSUBCONPERTN4 == 0 ) && ( AV52gCNDSPRSUBCONPERTN5 == 0 ) )
            {
               AV57Colapsar = "<div style=\"padding-left: 10px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 10px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            else
            {
               AV57Colapsar = "<div style=\"padding-left: 0px; line-height: 15px;width:min-content;\">" + GXutil.trim( AV55Expand) + "</div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColapsar_Internalname, AV57Colapsar);
               AV58dscSC = "<div style=\"padding-left: 0px; line-height: 15px;\"><span>" + GXutil.trim( AV41gCNDSPRSUBCONDSC) + "</span></div>" ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDscsc_Internalname, AV58dscSC);
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(25) ;
            }
            sendrow_252( ) ;
            if ( isFullAjaxMode( ) && ! bGXsfl_25_Refreshing )
            {
               httpContext.doAjaxLoad(25, Grid1Row);
            }
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e154942( )
   {
      /* 'Colapsar' Routine */
      if ( GXutil.strcmp(AV46gCNDSPRSUBCONTIP, "") != 0 )
      {
         if ( AV54nodo_abierto == 0 )
         {
            AV69GXV2 = 1 ;
            while ( AV69GXV2 <= AV9SDTIndSubCon.size() )
            {
               AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV69GXV2));
               if ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Sdtindex() == AV53SDTIndex )
               {
                  AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(1) );
               }
               AV69GXV2 = (int)(AV69GXV2+1) ;
            }
            if ( AV51gCNDSPRSUBCONPERTN4 != 0 )
            {
               AV70GXV3 = 1 ;
               while ( AV70GXV3 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV70GXV3));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() == AV50gCNDSPRSUBCONPERTN3 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4() == AV51gCNDSPRSUBCONPERTN4 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( true );
                  }
                  AV70GXV3 = (int)(AV70GXV3+1) ;
               }
            }
            else if ( AV50gCNDSPRSUBCONPERTN3 != 0 )
            {
               AV71GXV4 = 1 ;
               while ( AV71GXV4 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV71GXV4));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() == AV50gCNDSPRSUBCONPERTN3 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn5() == 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( true );
                  }
                  AV71GXV4 = (int)(AV71GXV4+1) ;
               }
            }
            else if ( AV49gCNDSPRSUBCONPERTN2 != 0 )
            {
               AV72GXV5 = 1 ;
               while ( AV72GXV5 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV72GXV5));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4() == 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( true );
                  }
                  AV72GXV5 = (int)(AV72GXV5+1) ;
               }
            }
            else if ( AV48gCNDSPRSUBCONPERT != 0 )
            {
               AV73GXV6 = 1 ;
               while ( AV73GXV6 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV73GXV6));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() == 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( true );
                  }
                  AV73GXV6 = (int)(AV73GXV6+1) ;
               }
            }
            else if ( AV47gCNDSPRSUBCONBASE != 0 )
            {
               AV74GXV7 = 1 ;
               while ( AV74GXV7 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV74GXV7));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( true );
                  }
                  AV74GXV7 = (int)(AV74GXV7+1) ;
               }
            }
         }
         else
         {
            AV75GXV8 = 1 ;
            while ( AV75GXV8 <= AV9SDTIndSubCon.size() )
            {
               AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV75GXV8));
               if ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Sdtindex() == AV53SDTIndex )
               {
                  AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(0) );
               }
               AV75GXV8 = (int)(AV75GXV8+1) ;
            }
            if ( AV51gCNDSPRSUBCONPERTN4 != 0 )
            {
               AV76GXV9 = 1 ;
               while ( AV76GXV9 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV76GXV9));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() == AV50gCNDSPRSUBCONPERTN3 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4() == AV51gCNDSPRSUBCONPERTN4 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn5() != 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( false );
                  }
                  AV76GXV9 = (int)(AV76GXV9+1) ;
               }
            }
            else if ( AV50gCNDSPRSUBCONPERTN3 != 0 )
            {
               AV77GXV10 = 1 ;
               while ( AV77GXV10 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV77GXV10));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() == AV50gCNDSPRSUBCONPERTN3 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn4() != 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( false );
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(0) );
                  }
                  AV77GXV10 = (int)(AV77GXV10+1) ;
               }
            }
            else if ( AV49gCNDSPRSUBCONPERTN2 != 0 )
            {
               AV78GXV11 = 1 ;
               while ( AV78GXV11 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV78GXV11));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() == AV49gCNDSPRSUBCONPERTN2 ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn3() != 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( false );
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(0) );
                  }
                  AV78GXV11 = (int)(AV78GXV11+1) ;
               }
            }
            else if ( AV48gCNDSPRSUBCONPERT != 0 )
            {
               AV79GXV12 = 1 ;
               while ( AV79GXV12 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV79GXV12));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() == AV48gCNDSPRSUBCONPERT ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpertn2() != 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( false );
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(0) );
                  }
                  AV79GXV12 = (int)(AV79GXV12+1) ;
               }
            }
            else if ( AV47gCNDSPRSUBCONBASE != 0 )
            {
               AV80GXV13 = 1 ;
               while ( AV80GXV13 <= AV9SDTIndSubCon.size() )
               {
                  AV35SDTIndSubConItem = (com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)((com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem)AV9SDTIndSubCon.elementAt(-1+AV80GXV13));
                  if ( ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconbase() == AV47gCNDSPRSUBCONBASE ) && ( AV35SDTIndSubConItem.getgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Cndsprsubconpert() != 0 ) )
                  {
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Mostrar( false );
                     AV35SDTIndSubConItem.setgxTv_SdtSDTIndSubCon_SDTIndSubConItem_Abierto( (byte)(0) );
                  }
                  AV80GXV13 = (int)(AV80GXV13+1) ;
               }
            }
         }
      }
      gxgrgrid1_refresh( AV9SDTIndSubCon, AV55Expand) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SDTIndSubCon", AV9SDTIndSubCon);
   }

   public void e114942( )
   {
      /* 'Salir' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e124942( )
   {
      /* 'Actualizar' Routine */
      AV64bandera = (short)(0) ;
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_25 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ".", ",")) ;
      nGXsfl_25_fel_idx = (short)(0) ;
      while ( nGXsfl_25_fel_idx < nRC_GXsfl_25 )
      {
         nGXsfl_25_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_25_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_25_fel_idx+1)) ;
         sGXsfl_25_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_252( ) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSDTINDEX");
            GX_FocusControl = edtavSdtindex_Internalname ;
            wbErr = true ;
            AV53SDTIndex = 0 ;
         }
         else
         {
            AV53SDTIndex = localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") ;
         }
         AV57Colapsar = httpContext.cgiGet( edtavColapsar_Internalname) ;
         AV58dscSC = httpContext.cgiGet( edtavDscsc_Internalname) ;
         AV41gCNDSPRSUBCONDSC = httpContext.cgiGet( edtavGcndsprsubcondsc_Internalname) ;
         AV40gCNDSPRSUBCONCLA = httpContext.cgiGet( edtavGcndsprsubconcla_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN_O");
            GX_FocusControl = edtavGcndsprsubconcan_o_Internalname ;
            wbErr = true ;
            AV63gCNDSPRSUBCONCAN_O = DecimalUtil.ZERO ;
         }
         else
         {
            AV63gCNDSPRSUBCONCAN_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN");
            GX_FocusControl = edtavGcndsprsubconcan_Internalname ;
            wbErr = true ;
            AV44gCNDSPRSUBCONCAN = DecimalUtil.ZERO ;
         }
         else
         {
            AV44gCNDSPRSUBCONCAN = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)) ;
         }
         AV43gCNDSPRSUBCONUNIMED = httpContext.cgiGet( edtavGcndsprsubconunimed_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI_O");
            GX_FocusControl = edtavGcndsprsubconpreuni_o_Internalname ;
            wbErr = true ;
            AV62gCNDSPRSUBCONPREUNI_O = DecimalUtil.ZERO ;
         }
         else
         {
            AV62gCNDSPRSUBCONPREUNI_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI");
            GX_FocusControl = edtavGcndsprsubconpreuni_Internalname ;
            wbErr = true ;
            AV42gCNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
         }
         else
         {
            AV42gCNDSPRSUBCONPREUNI = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONTOT");
            GX_FocusControl = edtavGcndsprsubcontot_Internalname ;
            wbErr = true ;
            AV45gCNDSPRSUBCONTOT = DecimalUtil.ZERO ;
         }
         else
         {
            AV45gCNDSPRSUBCONTOT = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)) ;
         }
         AV46gCNDSPRSUBCONTIP = httpContext.cgiGet( edtavGcndsprsubcontip_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONID");
            GX_FocusControl = edtavGcndsprsubconid_Internalname ;
            wbErr = true ;
            AV39gCNDSPRSUBCONID = 0 ;
         }
         else
         {
            AV39gCNDSPRSUBCONID = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONBASE");
            GX_FocusControl = edtavGcndsprsubconbase_Internalname ;
            wbErr = true ;
            AV47gCNDSPRSUBCONBASE = 0 ;
         }
         else
         {
            AV47gCNDSPRSUBCONBASE = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERT");
            GX_FocusControl = edtavGcndsprsubconpert_Internalname ;
            wbErr = true ;
            AV48gCNDSPRSUBCONPERT = 0 ;
         }
         else
         {
            AV48gCNDSPRSUBCONPERT = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN2");
            GX_FocusControl = edtavGcndsprsubconpertn2_Internalname ;
            wbErr = true ;
            AV49gCNDSPRSUBCONPERTN2 = 0 ;
         }
         else
         {
            AV49gCNDSPRSUBCONPERTN2 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN3");
            GX_FocusControl = edtavGcndsprsubconpertn3_Internalname ;
            wbErr = true ;
            AV50gCNDSPRSUBCONPERTN3 = 0 ;
         }
         else
         {
            AV50gCNDSPRSUBCONPERTN3 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN4");
            GX_FocusControl = edtavGcndsprsubconpertn4_Internalname ;
            wbErr = true ;
            AV51gCNDSPRSUBCONPERTN4 = 0 ;
         }
         else
         {
            AV51gCNDSPRSUBCONPERTN4 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN5");
            GX_FocusControl = edtavGcndsprsubconpertn5_Internalname ;
            wbErr = true ;
            AV52gCNDSPRSUBCONPERTN5 = 0 ;
         }
         else
         {
            AV52gCNDSPRSUBCONPERTN5 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNODO_ABIERTO");
            GX_FocusControl = edtavNodo_abierto_Internalname ;
            wbErr = true ;
            AV54nodo_abierto = (byte)(0) ;
         }
         else
         {
            AV54nodo_abierto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",")) ;
         }
         if ( GXutil.strcmp(AV46gCNDSPRSUBCONTIP, "SC") == 0 )
         {
            if ( ( DecimalUtil.compareTo(AV42gCNDSPRSUBCONPREUNI, AV62gCNDSPRSUBCONPREUNI_O) != 0 ) || ( DecimalUtil.compareTo(AV44gCNDSPRSUBCONCAN, AV63gCNDSPRSUBCONCAN_O) != 0 ) )
            {
               AV64bandera = (short)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_25_fel_idx == 0 )
      {
         nGXsfl_25_idx = (short)(1) ;
         sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_252( ) ;
      }
      nGXsfl_25_fel_idx = (short)(1) ;
      if ( AV64bandera == 1 )
      {
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_25 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_25"), ".", ",")) ;
         nGXsfl_25_fel_idx = (short)(0) ;
         while ( nGXsfl_25_fel_idx < nRC_GXsfl_25 )
         {
            nGXsfl_25_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_25_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_25_fel_idx+1)) ;
            sGXsfl_25_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_252( ) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSDTINDEX");
               GX_FocusControl = edtavSdtindex_Internalname ;
               wbErr = true ;
               AV53SDTIndex = 0 ;
            }
            else
            {
               AV53SDTIndex = localUtil.ctol( httpContext.cgiGet( edtavSdtindex_Internalname), ".", ",") ;
            }
            AV57Colapsar = httpContext.cgiGet( edtavColapsar_Internalname) ;
            AV58dscSC = httpContext.cgiGet( edtavDscsc_Internalname) ;
            AV41gCNDSPRSUBCONDSC = httpContext.cgiGet( edtavGcndsprsubcondsc_Internalname) ;
            AV40gCNDSPRSUBCONCLA = httpContext.cgiGet( edtavGcndsprsubconcla_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN_O");
               GX_FocusControl = edtavGcndsprsubconcan_o_Internalname ;
               wbErr = true ;
               AV63gCNDSPRSUBCONCAN_O = DecimalUtil.ZERO ;
            }
            else
            {
               AV63gCNDSPRSUBCONCAN_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_o_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONCAN");
               GX_FocusControl = edtavGcndsprsubconcan_Internalname ;
               wbErr = true ;
               AV44gCNDSPRSUBCONCAN = DecimalUtil.ZERO ;
            }
            else
            {
               AV44gCNDSPRSUBCONCAN = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconcan_Internalname)) ;
            }
            AV43gCNDSPRSUBCONUNIMED = httpContext.cgiGet( edtavGcndsprsubconunimed_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI_O");
               GX_FocusControl = edtavGcndsprsubconpreuni_o_Internalname ;
               wbErr = true ;
               AV62gCNDSPRSUBCONPREUNI_O = DecimalUtil.ZERO ;
            }
            else
            {
               AV62gCNDSPRSUBCONPREUNI_O = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_o_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPREUNI");
               GX_FocusControl = edtavGcndsprsubconpreuni_Internalname ;
               wbErr = true ;
               AV42gCNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
            }
            else
            {
               AV42gCNDSPRSUBCONPREUNI = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubconpreuni_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)), DecimalUtil.stringToDec("999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONTOT");
               GX_FocusControl = edtavGcndsprsubcontot_Internalname ;
               wbErr = true ;
               AV45gCNDSPRSUBCONTOT = DecimalUtil.ZERO ;
            }
            else
            {
               AV45gCNDSPRSUBCONTOT = localUtil.ctond( httpContext.cgiGet( edtavGcndsprsubcontot_Internalname)) ;
            }
            AV46gCNDSPRSUBCONTIP = httpContext.cgiGet( edtavGcndsprsubcontip_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONID");
               GX_FocusControl = edtavGcndsprsubconid_Internalname ;
               wbErr = true ;
               AV39gCNDSPRSUBCONID = 0 ;
            }
            else
            {
               AV39gCNDSPRSUBCONID = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconid_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONBASE");
               GX_FocusControl = edtavGcndsprsubconbase_Internalname ;
               wbErr = true ;
               AV47gCNDSPRSUBCONBASE = 0 ;
            }
            else
            {
               AV47gCNDSPRSUBCONBASE = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconbase_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERT");
               GX_FocusControl = edtavGcndsprsubconpert_Internalname ;
               wbErr = true ;
               AV48gCNDSPRSUBCONPERT = 0 ;
            }
            else
            {
               AV48gCNDSPRSUBCONPERT = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpert_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN2");
               GX_FocusControl = edtavGcndsprsubconpertn2_Internalname ;
               wbErr = true ;
               AV49gCNDSPRSUBCONPERTN2 = 0 ;
            }
            else
            {
               AV49gCNDSPRSUBCONPERTN2 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn2_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN3");
               GX_FocusControl = edtavGcndsprsubconpertn3_Internalname ;
               wbErr = true ;
               AV50gCNDSPRSUBCONPERTN3 = 0 ;
            }
            else
            {
               AV50gCNDSPRSUBCONPERTN3 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn3_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN4");
               GX_FocusControl = edtavGcndsprsubconpertn4_Internalname ;
               wbErr = true ;
               AV51gCNDSPRSUBCONPERTN4 = 0 ;
            }
            else
            {
               AV51gCNDSPRSUBCONPERTN4 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn4_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGCNDSPRSUBCONPERTN5");
               GX_FocusControl = edtavGcndsprsubconpertn5_Internalname ;
               wbErr = true ;
               AV52gCNDSPRSUBCONPERTN5 = 0 ;
            }
            else
            {
               AV52gCNDSPRSUBCONPERTN5 = localUtil.ctol( httpContext.cgiGet( edtavGcndsprsubconpertn5_Internalname), ".", ",") ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNODO_ABIERTO");
               GX_FocusControl = edtavNodo_abierto_Internalname ;
               wbErr = true ;
               AV54nodo_abierto = (byte)(0) ;
            }
            else
            {
               AV54nodo_abierto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavNodo_abierto_Internalname), ".", ",")) ;
            }
            if ( GXutil.strcmp(AV46gCNDSPRSUBCONTIP, "SC") == 0 )
            {
               if ( ( DecimalUtil.compareTo(AV42gCNDSPRSUBCONPREUNI, AV62gCNDSPRSUBCONPREUNI_O) != 0 ) || ( DecimalUtil.compareTo(AV44gCNDSPRSUBCONCAN, AV63gCNDSPRSUBCONCAN_O) != 0 ) )
               {
                  GXv_char2[0] = AV59CNUSERID ;
                  GXv_int3[0] = AV13CNDSPRCIA ;
                  GXv_char4[0] = AV14CNDSPRTDC ;
                  GXv_int5[0] = AV15CNDSPRNDC ;
                  GXv_int6[0] = AV39gCNDSPRSUBCONID ;
                  GXv_decimal7[0] = AV63gCNDSPRSUBCONCAN_O ;
                  GXv_decimal8[0] = AV62gCNDSPRSUBCONPREUNI_O ;
                  GXv_decimal9[0] = AV44gCNDSPRSUBCONCAN ;
                  GXv_decimal10[0] = AV42gCNDSPRSUBCONPREUNI ;
                  new com.kdsproyectos.pcndsprsubconcan(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
                  prompsubcon_impl.this.AV59CNUSERID = GXv_char2[0] ;
                  prompsubcon_impl.this.AV13CNDSPRCIA = GXv_int3[0] ;
                  prompsubcon_impl.this.AV14CNDSPRTDC = GXv_char4[0] ;
                  prompsubcon_impl.this.AV15CNDSPRNDC = GXv_int5[0] ;
                  prompsubcon_impl.this.AV39gCNDSPRSUBCONID = GXv_int6[0] ;
                  prompsubcon_impl.this.AV63gCNDSPRSUBCONCAN_O = GXv_decimal7[0] ;
                  prompsubcon_impl.this.AV62gCNDSPRSUBCONPREUNI_O = GXv_decimal8[0] ;
                  prompsubcon_impl.this.AV44gCNDSPRSUBCONCAN = GXv_decimal9[0] ;
                  prompsubcon_impl.this.AV42gCNDSPRSUBCONPREUNI = GXv_decimal10[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV59CNUSERID", AV59CNUSERID);
                  httpContext.ajax_rsp_assign_attri("", false, "AV13CNDSPRCIA", GXutil.ltrim( GXutil.str( AV13CNDSPRCIA, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "AV14CNDSPRTDC", AV14CNDSPRTDC);
                  httpContext.ajax_rsp_assign_attri("", false, "AV15CNDSPRNDC", GXutil.ltrim( GXutil.str( AV15CNDSPRNDC, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconid_Internalname, GXutil.ltrim( GXutil.str( AV39gCNDSPRSUBCONID, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_o_Internalname, GXutil.ltrim( GXutil.str( AV63gCNDSPRSUBCONCAN_O, 15, 2)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_o_Internalname, GXutil.ltrim( GXutil.str( AV62gCNDSPRSUBCONPREUNI_O, 15, 2)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconcan_Internalname, GXutil.ltrim( GXutil.str( AV44gCNDSPRSUBCONCAN, 15, 2)));
                  httpContext.ajax_rsp_assign_attri("", false, edtavGcndsprsubconpreuni_Internalname, GXutil.ltrim( GXutil.str( AV42gCNDSPRSUBCONPREUNI, 15, 2)));
               }
            }
            /* End For Each Line */
         }
         if ( nGXsfl_25_fel_idx == 0 )
         {
            nGXsfl_25_idx = (short)(1) ;
            sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_252( ) ;
         }
         nGXsfl_25_fel_idx = (short)(1) ;
         GXv_int6[0] = AV13CNDSPRCIA ;
         GXv_char4[0] = AV14CNDSPRTDC ;
         GXv_int5[0] = AV15CNDSPRNDC ;
         new com.kdsproyectos.preestructurarmontocontrato2(remoteHandle, context).execute( GXv_int6, GXv_char4, GXv_int5) ;
         prompsubcon_impl.this.AV13CNDSPRCIA = GXv_int6[0] ;
         prompsubcon_impl.this.AV14CNDSPRTDC = GXv_char4[0] ;
         prompsubcon_impl.this.AV15CNDSPRNDC = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13CNDSPRCIA", GXutil.ltrim( GXutil.str( AV13CNDSPRCIA, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV14CNDSPRTDC", AV14CNDSPRTDC);
         httpContext.ajax_rsp_assign_attri("", false, "AV15CNDSPRNDC", GXutil.ltrim( GXutil.str( AV15CNDSPRNDC, 10, 0)));
         /* Execute user subroutine: 'CARGA ESTRUCTURA' */
         S112 ();
         if (returnInSub) return;
         gxgrgrid1_refresh( AV9SDTIndSubCon, AV55Expand) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9SDTIndSubCon", AV9SDTIndSubCon);
   }

   public void wb_table1_2_4942( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 38, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 900, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "mpHolder", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTxtregresar_Internalname, lblTxtregresar_Caption, "", "", lblTxtregresar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SALIR\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_prompSubCon.htm");
         httpContext.writeText( "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Guardar Cambios", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ACTUALIZAR\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_prompSubCon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         wb_table2_13_4942( true) ;
      }
      else
      {
         wb_table2_13_4942( false) ;
      }
      return  ;
   }

   public void wb_table2_13_4942e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* Div Control */
         com.kdsproyectos.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 0, "px", 440, "px", "scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"25\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "SDTIndex") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"center"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 250, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Subconcepto") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 110, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Clave") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "g CNDSPRSUBCONCAN_O") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 136, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 101, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Unidad de medida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "g CNDSPRSUBCONPREUNI_O") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 136, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Precio unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 136, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Subconcepto Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Linea Base") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nivel 2") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nivel 3") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nivel 4") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nivel 5") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "Nivel 6") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+"display:none;"+"font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal;"+"\" "+">") ;
            httpContext.writeValue( "nodo_abierto") ;
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
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53SDTIndex, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtindex_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV57Colapsar);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavColapsar_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV58dscSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDscsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV41gCNDSPRSUBCONDSC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcondsc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV40gCNDSPRSUBCONCLA));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconcla_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63gCNDSPRSUBCONCAN_O, (byte)(15), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconcan_o_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44gCNDSPRSUBCONCAN, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconcan_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43gCNDSPRSUBCONUNIMED));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62gCNDSPRSUBCONPREUNI_O, (byte)(15), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpreuni_o_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42gCNDSPRSUBCONPREUNI, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpreuni_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45gCNDSPRSUBCONTOT, (byte)(18), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcontot_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV46gCNDSPRSUBCONTIP));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubcontip_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39gCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconid_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV47gCNDSPRSUBCONBASE, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconbase_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48gCNDSPRSUBCONPERT, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpert_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49gCNDSPRSUBCONPERTN2, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpertn2_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50gCNDSPRSUBCONPERTN3, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpertn3_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51gCNDSPRSUBCONPERTN4, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpertn4_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONPERTN5, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGcndsprsubconpertn5_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54nodo_abierto, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNodo_abierto_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      if ( wbEnd == 25 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_25 = (short)(nGXsfl_25_idx-1) ;
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
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_4942e( true) ;
      }
      else
      {
         wb_table1_2_4942e( false) ;
      }
   }

   public void wb_table2_13_4942( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         com.kdsproyectos.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "width:200px")+"\">") ;
         /* Text block */
         com.kdsproyectos.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Contrato de servicio", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'Arial'; font-size:9.0pt; font-weight:bold; font-style:normal; color:#000000;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_prompSubCon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         com.kdsproyectos.GxWebStd.gx_single_line_edit( httpContext, edtavCndsprndc_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CNDSPRNDC, (byte)(10), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV15CNDSPRNDC), "ZZZZZZZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCndsprndc_Jsonclick, 0, "Attribute", "", "", "", "", 1, 0, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_prompSubCon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_13_4942e( true) ;
      }
      else
      {
         wb_table2_13_4942e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV13CNDSPRCIA = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CNDSPRCIA", GXutil.ltrim( GXutil.str( AV13CNDSPRCIA, 10, 0)));
      AV14CNDSPRTDC = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CNDSPRTDC", AV14CNDSPRTDC);
      AV15CNDSPRNDC = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CNDSPRNDC", GXutil.ltrim( GXutil.str( AV15CNDSPRNDC, 10, 0)));
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
      pa4942( ) ;
      ws4942( ) ;
      we4942( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20256171416585", true, true);
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
         httpContext.AddJavascriptSource("prompsubcon.js", "?20256171416585", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_252( )
   {
      edtavSdtindex_Internalname = "vSDTINDEX_"+sGXsfl_25_idx ;
      edtavColapsar_Internalname = "vCOLAPSAR_"+sGXsfl_25_idx ;
      edtavDscsc_Internalname = "vDSCSC_"+sGXsfl_25_idx ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC_"+sGXsfl_25_idx ;
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA_"+sGXsfl_25_idx ;
      edtavGcndsprsubconcan_o_Internalname = "vGCNDSPRSUBCONCAN_O_"+sGXsfl_25_idx ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN_"+sGXsfl_25_idx ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpreuni_o_Internalname = "vGCNDSPRSUBCONPREUNI_O_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI_"+sGXsfl_25_idx ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT_"+sGXsfl_25_idx ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP_"+sGXsfl_25_idx ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID_"+sGXsfl_25_idx ;
      edtavGcndsprsubconbase_Internalname = "vGCNDSPRSUBCONBASE_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpert_Internalname = "vGCNDSPRSUBCONPERT_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpertn2_Internalname = "vGCNDSPRSUBCONPERTN2_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpertn3_Internalname = "vGCNDSPRSUBCONPERTN3_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpertn4_Internalname = "vGCNDSPRSUBCONPERTN4_"+sGXsfl_25_idx ;
      edtavGcndsprsubconpertn5_Internalname = "vGCNDSPRSUBCONPERTN5_"+sGXsfl_25_idx ;
      edtavNodo_abierto_Internalname = "vNODO_ABIERTO_"+sGXsfl_25_idx ;
   }

   public void subsflControlProps_fel_252( )
   {
      edtavSdtindex_Internalname = "vSDTINDEX_"+sGXsfl_25_fel_idx ;
      edtavColapsar_Internalname = "vCOLAPSAR_"+sGXsfl_25_fel_idx ;
      edtavDscsc_Internalname = "vDSCSC_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconcan_o_Internalname = "vGCNDSPRSUBCONCAN_O_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpreuni_o_Internalname = "vGCNDSPRSUBCONPREUNI_O_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconbase_Internalname = "vGCNDSPRSUBCONBASE_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpert_Internalname = "vGCNDSPRSUBCONPERT_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpertn2_Internalname = "vGCNDSPRSUBCONPERTN2_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpertn3_Internalname = "vGCNDSPRSUBCONPERTN3_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpertn4_Internalname = "vGCNDSPRSUBCONPERTN4_"+sGXsfl_25_fel_idx ;
      edtavGcndsprsubconpertn5_Internalname = "vGCNDSPRSUBCONPERTN5_"+sGXsfl_25_fel_idx ;
      edtavNodo_abierto_Internalname = "vNODO_ABIERTO_"+sGXsfl_25_fel_idx ;
   }

   public void sendrow_252( )
   {
      subsflControlProps_252( ) ;
      wb4940( ) ;
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
         subGrid1_Backcolor = (int)(0x000FFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_25_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x000FFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xF5F5F5) ;
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
         httpContext.writeText( " gxrow=\""+sGXsfl_25_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavSdtindex_Enabled!=0)&&(edtavSdtindex_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 26,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtindex_Internalname,GXutil.ltrim( localUtil.ntoc( AV53SDTIndex, (byte)(10), (byte)(0), ".", "")),((edtavSdtindex_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV53SDTIndex), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavSdtindex_Enabled!=0)&&(edtavSdtindex_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,26);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtindex_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavSdtindex_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"center"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavColapsar_Enabled!=0)&&(edtavColapsar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 27,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavColapsar_Internalname,AV57Colapsar,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavColapsar_Enabled!=0)&&(edtavColapsar_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,27);\"" : " ")+" "+"colwidth=\"20\""+" ","'"+""+"'"+",false,"+"'"+"E\\'COLAPSAR\\'."+sGXsfl_25_idx+"'","","","","",edtavColapsar_Jsonclick,new Integer(5),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavColapsar_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(1),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","center",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavDscsc_Enabled!=0)&&(edtavDscsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 28,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDscsc_Internalname,GXutil.rtrim( AV58dscSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDscsc_Enabled!=0)&&(edtavDscsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,28);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDscsc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavDscsc_Enabled),new Integer(0),"text","",new Integer(250),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(1),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubcondsc_Enabled!=0)&&(edtavGcndsprsubcondsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 29,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcondsc_Internalname,GXutil.rtrim( AV41gCNDSPRSUBCONDSC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubcondsc_Enabled!=0)&&(edtavGcndsprsubcondsc_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,29);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcondsc_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubcondsc_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5000),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconcla_Enabled!=0)&&(edtavGcndsprsubconcla_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 30,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconcla_Internalname,GXutil.rtrim( AV40gCNDSPRSUBCONCLA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconcla_Enabled!=0)&&(edtavGcndsprsubconcla_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,30);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconcla_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconcla_Enabled),new Integer(0),"text","",new Integer(110),"px",new Integer(17),"px",new Integer(500),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconcan_o_Enabled!=0)&&(edtavGcndsprsubconcan_o_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 31,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconcan_o_Internalname,GXutil.ltrim( localUtil.ntoc( AV63gCNDSPRSUBCONCAN_O, (byte)(15), (byte)(2), ".", "")),((edtavGcndsprsubconcan_o_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV63gCNDSPRSUBCONCAN_O, "ZZZZZZZZZZZ9.99")) : localUtil.format( AV63gCNDSPRSUBCONCAN_O, "ZZZZZZZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconcan_o_Enabled!=0)&&(edtavGcndsprsubconcan_o_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,31);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconcan_o_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconcan_o_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconcan_Enabled!=0)&&(edtavGcndsprsubconcan_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 32,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconcan_Internalname,GXutil.ltrim( localUtil.ntoc( AV44gCNDSPRSUBCONCAN, (byte)(18), (byte)(2), ".", "")),GXutil.ltrim( localUtil.format( AV44gCNDSPRSUBCONCAN, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconcan_Enabled!=0)&&(edtavGcndsprsubconcan_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,32);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconcan_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconcan_Enabled),new Integer(1),"text","",new Integer(136),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconunimed_Enabled!=0)&&(edtavGcndsprsubconunimed_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 33,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconunimed_Internalname,GXutil.rtrim( AV43gCNDSPRSUBCONUNIMED),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconunimed_Enabled!=0)&&(edtavGcndsprsubconunimed_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,33);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconunimed_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconunimed_Enabled),new Integer(0),"text","",new Integer(101),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpreuni_o_Enabled!=0)&&(edtavGcndsprsubconpreuni_o_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 34,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpreuni_o_Internalname,GXutil.ltrim( localUtil.ntoc( AV62gCNDSPRSUBCONPREUNI_O, (byte)(15), (byte)(2), ".", "")),((edtavGcndsprsubconpreuni_o_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV62gCNDSPRSUBCONPREUNI_O, "ZZZZZZZZZZZ9.99")) : localUtil.format( AV62gCNDSPRSUBCONPREUNI_O, "ZZZZZZZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpreuni_o_Enabled!=0)&&(edtavGcndsprsubconpreuni_o_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,34);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpreuni_o_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpreuni_o_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpreuni_Enabled!=0)&&(edtavGcndsprsubconpreuni_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpreuni_Internalname,GXutil.ltrim( localUtil.ntoc( AV42gCNDSPRSUBCONPREUNI, (byte)(18), (byte)(2), ".", "")),GXutil.ltrim( localUtil.format( AV42gCNDSPRSUBCONPREUNI, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpreuni_Enabled!=0)&&(edtavGcndsprsubconpreuni_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,35);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpreuni_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubconpreuni_Enabled),new Integer(1),"text","",new Integer(136),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubcontot_Enabled!=0)&&(edtavGcndsprsubcontot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcontot_Internalname,GXutil.ltrim( localUtil.ntoc( AV45gCNDSPRSUBCONTOT, (byte)(18), (byte)(2), ".", "")),((edtavGcndsprsubcontot_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV45gCNDSPRSUBCONTOT, "ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV45gCNDSPRSUBCONTOT, "ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, ',','.','2');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubcontot_Enabled!=0)&&(edtavGcndsprsubcontot_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,36);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcontot_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(-1),new Integer(edtavGcndsprsubcontot_Enabled),new Integer(0),"text","",new Integer(136),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubcontip_Enabled!=0)&&(edtavGcndsprsubcontip_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubcontip_Internalname,GXutil.rtrim( AV46gCNDSPRSUBCONTIP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubcontip_Enabled!=0)&&(edtavGcndsprsubcontip_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,37);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubcontip_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubcontip_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconid_Enabled!=0)&&(edtavGcndsprsubconid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconid_Internalname,GXutil.ltrim( localUtil.ntoc( AV39gCNDSPRSUBCONID, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39gCNDSPRSUBCONID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV39gCNDSPRSUBCONID), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconid_Enabled!=0)&&(edtavGcndsprsubconid_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,38);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconid_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconid_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconbase_Enabled!=0)&&(edtavGcndsprsubconbase_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconbase_Internalname,GXutil.ltrim( localUtil.ntoc( AV47gCNDSPRSUBCONBASE, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconbase_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV47gCNDSPRSUBCONBASE), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconbase_Enabled!=0)&&(edtavGcndsprsubconbase_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,39);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconbase_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconbase_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpert_Enabled!=0)&&(edtavGcndsprsubconpert_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpert_Internalname,GXutil.ltrim( localUtil.ntoc( AV48gCNDSPRSUBCONPERT, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconpert_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV48gCNDSPRSUBCONPERT), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpert_Enabled!=0)&&(edtavGcndsprsubconpert_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,40);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpert_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpert_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpertn2_Enabled!=0)&&(edtavGcndsprsubconpertn2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpertn2_Internalname,GXutil.ltrim( localUtil.ntoc( AV49gCNDSPRSUBCONPERTN2, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconpertn2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV49gCNDSPRSUBCONPERTN2), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpertn2_Enabled!=0)&&(edtavGcndsprsubconpertn2_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,41);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpertn2_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpertn2_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpertn3_Enabled!=0)&&(edtavGcndsprsubconpertn3_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpertn3_Internalname,GXutil.ltrim( localUtil.ntoc( AV50gCNDSPRSUBCONPERTN3, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconpertn3_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV50gCNDSPRSUBCONPERTN3), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpertn3_Enabled!=0)&&(edtavGcndsprsubconpertn3_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,42);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpertn3_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpertn3_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpertn4_Enabled!=0)&&(edtavGcndsprsubconpertn4_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpertn4_Internalname,GXutil.ltrim( localUtil.ntoc( AV51gCNDSPRSUBCONPERTN4, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconpertn4_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV51gCNDSPRSUBCONPERTN4), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpertn4_Enabled!=0)&&(edtavGcndsprsubconpertn4_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,43);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpertn4_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpertn4_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavGcndsprsubconpertn5_Enabled!=0)&&(edtavGcndsprsubconpertn5_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGcndsprsubconpertn5_Internalname,GXutil.ltrim( localUtil.ntoc( AV52gCNDSPRSUBCONPERTN5, (byte)(10), (byte)(0), ".", "")),((edtavGcndsprsubconpertn5_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV52gCNDSPRSUBCONPERTN5), "ZZZZZZZZZ9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavGcndsprsubconpertn5_Enabled!=0)&&(edtavGcndsprsubconpertn5_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGcndsprsubconpertn5_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavGcndsprsubconpertn5_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavNodo_abierto_Enabled!=0)&&(edtavNodo_abierto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_25_idx+"',25)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNodo_abierto_Internalname,GXutil.ltrim( localUtil.ntoc( AV54nodo_abierto, (byte)(1), (byte)(0), ".", "")),((edtavNodo_abierto_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV54nodo_abierto), "9")),TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+((edtavNodo_abierto_Enabled!=0)&&(edtavNodo_abierto_Visible!=0) ? " onblur=\""+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNodo_abierto_Jsonclick,new Integer(0),"Attribute","font-family:'Arial'; font-size:9.0pt; font-weight:normal; font-style:normal;",ROClassString,"","",new Integer(0),new Integer(edtavNodo_abierto_Enabled),new Integer(0),"number","1",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(25),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      send_integrity_lvl_hashes4942( ) ;
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_25_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_25_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_25_idx+1)) ;
      sGXsfl_25_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_25_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_252( ) ;
      /* End function sendrow_252 */
   }

   public void init_default_properties( )
   {
      lblTxtregresar_Internalname = "TXTREGRESAR" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCndsprndc_Internalname = "vCNDSPRNDC" ;
      tblTable2_Internalname = "TABLE2" ;
      edtavSdtindex_Internalname = "vSDTINDEX" ;
      edtavColapsar_Internalname = "vCOLAPSAR" ;
      edtavDscsc_Internalname = "vDSCSC" ;
      edtavGcndsprsubcondsc_Internalname = "vGCNDSPRSUBCONDSC" ;
      edtavGcndsprsubconcla_Internalname = "vGCNDSPRSUBCONCLA" ;
      edtavGcndsprsubconcan_o_Internalname = "vGCNDSPRSUBCONCAN_O" ;
      edtavGcndsprsubconcan_Internalname = "vGCNDSPRSUBCONCAN" ;
      edtavGcndsprsubconunimed_Internalname = "vGCNDSPRSUBCONUNIMED" ;
      edtavGcndsprsubconpreuni_o_Internalname = "vGCNDSPRSUBCONPREUNI_O" ;
      edtavGcndsprsubconpreuni_Internalname = "vGCNDSPRSUBCONPREUNI" ;
      edtavGcndsprsubcontot_Internalname = "vGCNDSPRSUBCONTOT" ;
      edtavGcndsprsubcontip_Internalname = "vGCNDSPRSUBCONTIP" ;
      edtavGcndsprsubconid_Internalname = "vGCNDSPRSUBCONID" ;
      edtavGcndsprsubconbase_Internalname = "vGCNDSPRSUBCONBASE" ;
      edtavGcndsprsubconpert_Internalname = "vGCNDSPRSUBCONPERT" ;
      edtavGcndsprsubconpertn2_Internalname = "vGCNDSPRSUBCONPERTN2" ;
      edtavGcndsprsubconpertn3_Internalname = "vGCNDSPRSUBCONPERTN3" ;
      edtavGcndsprsubconpertn4_Internalname = "vGCNDSPRSUBCONPERTN4" ;
      edtavGcndsprsubconpertn5_Internalname = "vGCNDSPRSUBCONPERTN5" ;
      edtavNodo_abierto_Internalname = "vNODO_ABIERTO" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable1_Internalname = "TABLE1" ;
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
      edtavNodo_abierto_Jsonclick = "" ;
      edtavNodo_abierto_Visible = 0 ;
      edtavGcndsprsubconpertn5_Jsonclick = "" ;
      edtavGcndsprsubconpertn5_Visible = 0 ;
      edtavGcndsprsubconpertn4_Jsonclick = "" ;
      edtavGcndsprsubconpertn4_Visible = 0 ;
      edtavGcndsprsubconpertn3_Jsonclick = "" ;
      edtavGcndsprsubconpertn3_Visible = 0 ;
      edtavGcndsprsubconpertn2_Jsonclick = "" ;
      edtavGcndsprsubconpertn2_Visible = 0 ;
      edtavGcndsprsubconpert_Jsonclick = "" ;
      edtavGcndsprsubconpert_Visible = 0 ;
      edtavGcndsprsubconbase_Jsonclick = "" ;
      edtavGcndsprsubconbase_Visible = 0 ;
      edtavGcndsprsubconid_Jsonclick = "" ;
      edtavGcndsprsubconid_Visible = 0 ;
      edtavGcndsprsubcontip_Jsonclick = "" ;
      edtavGcndsprsubcontip_Visible = 0 ;
      edtavGcndsprsubcontot_Jsonclick = "" ;
      edtavGcndsprsubcontot_Visible = -1 ;
      edtavGcndsprsubconpreuni_Jsonclick = "" ;
      edtavGcndsprsubconpreuni_Visible = -1 ;
      edtavGcndsprsubconpreuni_o_Jsonclick = "" ;
      edtavGcndsprsubconpreuni_o_Visible = 0 ;
      edtavGcndsprsubconunimed_Jsonclick = "" ;
      edtavGcndsprsubconunimed_Visible = -1 ;
      edtavGcndsprsubconcan_Jsonclick = "" ;
      edtavGcndsprsubconcan_Visible = -1 ;
      edtavGcndsprsubconcan_o_Jsonclick = "" ;
      edtavGcndsprsubconcan_o_Visible = 0 ;
      edtavGcndsprsubconcla_Jsonclick = "" ;
      edtavGcndsprsubconcla_Visible = -1 ;
      edtavGcndsprsubcondsc_Jsonclick = "" ;
      edtavGcndsprsubcondsc_Visible = 0 ;
      edtavDscsc_Jsonclick = "" ;
      edtavDscsc_Visible = -1 ;
      edtavColapsar_Jsonclick = "" ;
      edtavColapsar_Visible = -1 ;
      edtavSdtindex_Jsonclick = "" ;
      edtavSdtindex_Visible = 0 ;
      edtavCndsprndc_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavNodo_abierto_Enabled = 1 ;
      edtavGcndsprsubconpertn5_Enabled = 1 ;
      edtavGcndsprsubconpertn4_Enabled = 1 ;
      edtavGcndsprsubconpertn3_Enabled = 1 ;
      edtavGcndsprsubconpertn2_Enabled = 1 ;
      edtavGcndsprsubconpert_Enabled = 1 ;
      edtavGcndsprsubconbase_Enabled = 1 ;
      edtavGcndsprsubconid_Enabled = 1 ;
      edtavGcndsprsubcontip_Enabled = 1 ;
      edtavGcndsprsubcontot_Enabled = 1 ;
      edtavGcndsprsubconpreuni_Enabled = 1 ;
      edtavGcndsprsubconpreuni_o_Enabled = 1 ;
      edtavGcndsprsubconunimed_Enabled = 1 ;
      edtavGcndsprsubconcan_Enabled = 1 ;
      edtavGcndsprsubconcan_o_Enabled = 1 ;
      edtavGcndsprsubconcla_Enabled = 1 ;
      edtavGcndsprsubcondsc_Enabled = 1 ;
      edtavDscsc_Enabled = 1 ;
      edtavColapsar_Enabled = 1 ;
      edtavSdtindex_Enabled = 1 ;
      subGrid1_Header = "" ;
      subGrid1_Class = "KDSResponsiveTable" ;
      lblTxtregresar_Caption = "Regresar" ;
      subGrid1_Linesfont = "font-family:Arial;font-size:9pt;" ;
      subGrid1_Titlefont = "font-family:Arial;font-size:9pt;font-weight:bold;" ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Subconceptos" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''},{av:'AV55Expand',fld:'vEXPAND',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e144942',iparms:[{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''},{av:'AV55Expand',fld:'vEXPAND',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV39gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV40gCNDSPRSUBCONCLA',fld:'vGCNDSPRSUBCONCLA',pic:''},{av:'AV41gCNDSPRSUBCONDSC',fld:'vGCNDSPRSUBCONDSC',pic:''},{av:'AV42gCNDSPRSUBCONPREUNI',fld:'vGCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV62gCNDSPRSUBCONPREUNI_O',fld:'vGCNDSPRSUBCONPREUNI_O',pic:'ZZZZZZZZZZZ9.99'},{av:'AV43gCNDSPRSUBCONUNIMED',fld:'vGCNDSPRSUBCONUNIMED',pic:''},{av:'AV44gCNDSPRSUBCONCAN',fld:'vGCNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV63gCNDSPRSUBCONCAN_O',fld:'vGCNDSPRSUBCONCAN_O',pic:'ZZZZZZZZZZZ9.99'},{av:'AV45gCNDSPRSUBCONTOT',fld:'vGCNDSPRSUBCONTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV46gCNDSPRSUBCONTIP',fld:'vGCNDSPRSUBCONTIP',pic:'',hsh:true},{av:'AV47gCNDSPRSUBCONBASE',fld:'vGCNDSPRSUBCONBASE',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48gCNDSPRSUBCONPERT',fld:'vGCNDSPRSUBCONPERT',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV49gCNDSPRSUBCONPERTN2',fld:'vGCNDSPRSUBCONPERTN2',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV50gCNDSPRSUBCONPERTN3',fld:'vGCNDSPRSUBCONPERTN3',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV51gCNDSPRSUBCONPERTN4',fld:'vGCNDSPRSUBCONPERTN4',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV52gCNDSPRSUBCONPERTN5',fld:'vGCNDSPRSUBCONPERTN5',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV53SDTIndex',fld:'vSDTINDEX',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54nodo_abierto',fld:'vNODO_ABIERTO',pic:'9',hsh:true},{av:'AV55Expand',fld:'vEXPAND',pic:''},{av:'edtavGcndsprsubconcan_Enabled',ctrl:'vGCNDSPRSUBCONCAN',prop:'Enabled'},{av:'edtavGcndsprsubconpreuni_Enabled',ctrl:'vGCNDSPRSUBCONPREUNI',prop:'Enabled'},{av:'AV57Colapsar',fld:'vCOLAPSAR',pic:''},{av:'AV58dscSC',fld:'vDSCSC',pic:''}]}");
      setEventMetadata("'COLAPSAR'","{handler:'e154942',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''},{av:'AV55Expand',fld:'vEXPAND',pic:''},{av:'AV46gCNDSPRSUBCONTIP',fld:'vGCNDSPRSUBCONTIP',pic:'',hsh:true},{av:'AV54nodo_abierto',fld:'vNODO_ABIERTO',pic:'9',hsh:true},{av:'AV53SDTIndex',fld:'vSDTINDEX',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV51gCNDSPRSUBCONPERTN4',fld:'vGCNDSPRSUBCONPERTN4',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV47gCNDSPRSUBCONBASE',fld:'vGCNDSPRSUBCONBASE',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48gCNDSPRSUBCONPERT',fld:'vGCNDSPRSUBCONPERT',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV49gCNDSPRSUBCONPERTN2',fld:'vGCNDSPRSUBCONPERTN2',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV50gCNDSPRSUBCONPERTN3',fld:'vGCNDSPRSUBCONPERTN3',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV52gCNDSPRSUBCONPERTN5',fld:'vGCNDSPRSUBCONPERTN5',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'COLAPSAR'",",oparms:[{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''}]}");
      setEventMetadata("'SALIR'","{handler:'e114942',iparms:[]");
      setEventMetadata("'SALIR'",",oparms:[]}");
      setEventMetadata("'ACTUALIZAR'","{handler:'e124942',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''},{av:'AV55Expand',fld:'vEXPAND',pic:''},{av:'AV46gCNDSPRSUBCONTIP',fld:'vGCNDSPRSUBCONTIP',grid:25,pic:'',hsh:true},{av:'nRC_GXsfl_25',ctrl:'GRID1',grid:25,prop:'GridRC'},{av:'AV42gCNDSPRSUBCONPREUNI',fld:'vGCNDSPRSUBCONPREUNI',grid:25,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV62gCNDSPRSUBCONPREUNI_O',fld:'vGCNDSPRSUBCONPREUNI_O',grid:25,pic:'ZZZZZZZZZZZ9.99'},{av:'AV44gCNDSPRSUBCONCAN',fld:'vGCNDSPRSUBCONCAN',grid:25,pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV63gCNDSPRSUBCONCAN_O',fld:'vGCNDSPRSUBCONCAN_O',grid:25,pic:'ZZZZZZZZZZZ9.99'},{av:'AV59CNUSERID',fld:'vCNUSERID',pic:''},{av:'AV13CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV14CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV15CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV39gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',grid:25,pic:'ZZZZZZZZZ9'},{av:'A18147CNDSPRSUBCONBASE',fld:'CNDSPRSUBCONBASE',pic:'ZZZZZZZZZ9'},{av:'A18148CNDSPRSUBCONPERT',fld:'CNDSPRSUBCONPERT',pic:'ZZZZZZZZZ9'},{av:'A18149CNDSPRSUBCONPERTN2',fld:'CNDSPRSUBCONPERTN2',pic:'ZZZZZZZZZ9'},{av:'A18150CNDSPRSUBCONPERTN3',fld:'CNDSPRSUBCONPERTN3',pic:'ZZZZZZZZZ9'},{av:'A18151CNDSPRSUBCONPERTN4',fld:'CNDSPRSUBCONPERTN4',pic:'ZZZZZZZZZ9'},{av:'A18152CNDSPRSUBCONPERTN5',fld:'CNDSPRSUBCONPERTN5',pic:'ZZZZZZZZZ9'},{av:'A7518CNDSPRCIA',fld:'CNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'A7519CNDSPRTDC',fld:'CNDSPRTDC',pic:''},{av:'A7520CNDSPRNDC',fld:'CNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'A18146CNDSPRSUBCONID',fld:'CNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'A18153CNDSPRSUBCONCLA',fld:'CNDSPRSUBCONCLA',pic:''},{av:'A18154CNDSPRSUBCONDSC',fld:'CNDSPRSUBCONDSC',pic:''},{av:'A18155CNDSPRSUBCONPREUNI',fld:'CNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18156CNDSPRSUBCONUNIMED',fld:'CNDSPRSUBCONUNIMED',pic:''},{av:'A18157CNDSPRSUBCONCAN',fld:'CNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18158CNDSPRSUBCONTOT',fld:'CNDSPRSUBCONTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'A18159CNDSPRSUBCONTIP',fld:'CNDSPRSUBCONTIP',pic:''},{av:'AV36CNDSPRSUBCONID',fld:'vCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV19CNDSPRSUBCONCLA',fld:'vCNDSPRSUBCONCLA',pic:''},{av:'AV16CNDSPRSUBCONDSC',fld:'vCNDSPRSUBCONDSC',pic:''},{av:'AV17CNDSPRSUBCONPREUNI',fld:'vCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV20CNDSPRSUBCONUNIMED',fld:'vCNDSPRSUBCONUNIMED',pic:''},{av:'AV18CNDSPRSUBCONCAN',fld:'vCNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV21CNDSPRSUBCONTOT',fld:'vCNDSPRSUBCONTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV22CNDSPRSUBCONTIP',fld:'vCNDSPRSUBCONTIP',pic:''},{av:'AV28CNDSPRSUBCONBASE',fld:'vCNDSPRSUBCONBASE',pic:'ZZZZZZZZZ9'},{av:'AV29CNDSPRSUBCONPERT',fld:'vCNDSPRSUBCONPERT',pic:'ZZZZZZZZZ9'},{av:'AV30CNDSPRSUBCONPERTN2',fld:'vCNDSPRSUBCONPERTN2',pic:'ZZZZZZZZZ9'},{av:'AV31CNDSPRSUBCONPERTN3',fld:'vCNDSPRSUBCONPERTN3',pic:'ZZZZZZZZZ9'},{av:'AV32CNDSPRSUBCONPERTN4',fld:'vCNDSPRSUBCONPERTN4',pic:'ZZZZZZZZZ9'},{av:'AV26CNDSPRSUBCONPERTN5',fld:'vCNDSPRSUBCONPERTN5',pic:'ZZZZZZZZZ9'},{av:'AV34MostrarLinea',fld:'vMOSTRARLINEA',pic:''},{av:'AV10IndexSDT',fld:'vINDEXSDT',pic:'ZZZZZZZZZ9'},{av:'AV33Abierto',fld:'vABIERTO',pic:'9'}]");
      setEventMetadata("'ACTUALIZAR'",",oparms:[{av:'AV42gCNDSPRSUBCONPREUNI',fld:'vGCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV44gCNDSPRSUBCONCAN',fld:'vGCNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV62gCNDSPRSUBCONPREUNI_O',fld:'vGCNDSPRSUBCONPREUNI_O',pic:'ZZZZZZZZZZZ9.99'},{av:'AV63gCNDSPRSUBCONCAN_O',fld:'vGCNDSPRSUBCONCAN_O',pic:'ZZZZZZZZZZZ9.99'},{av:'AV39gCNDSPRSUBCONID',fld:'vGCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV15CNDSPRNDC',fld:'vCNDSPRNDC',pic:'ZZZZZZZZZ9'},{av:'AV14CNDSPRTDC',fld:'vCNDSPRTDC',pic:''},{av:'AV13CNDSPRCIA',fld:'vCNDSPRCIA',pic:'ZZZZZZZZZ9'},{av:'AV59CNUSERID',fld:'vCNUSERID',pic:''},{av:'AV9SDTIndSubCon',fld:'vSDTINDSUBCON',pic:''},{av:'AV10IndexSDT',fld:'vINDEXSDT',pic:'ZZZZZZZZZ9'},{av:'AV36CNDSPRSUBCONID',fld:'vCNDSPRSUBCONID',pic:'ZZZZZZZZZ9'},{av:'AV19CNDSPRSUBCONCLA',fld:'vCNDSPRSUBCONCLA',pic:''},{av:'AV16CNDSPRSUBCONDSC',fld:'vCNDSPRSUBCONDSC',pic:''},{av:'AV17CNDSPRSUBCONPREUNI',fld:'vCNDSPRSUBCONPREUNI',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV20CNDSPRSUBCONUNIMED',fld:'vCNDSPRSUBCONUNIMED',pic:''},{av:'AV18CNDSPRSUBCONCAN',fld:'vCNDSPRSUBCONCAN',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV21CNDSPRSUBCONTOT',fld:'vCNDSPRSUBCONTOT',pic:'ZZZ,ZZZ,ZZZ,ZZ9.99'},{av:'AV22CNDSPRSUBCONTIP',fld:'vCNDSPRSUBCONTIP',pic:''},{av:'AV28CNDSPRSUBCONBASE',fld:'vCNDSPRSUBCONBASE',pic:'ZZZZZZZZZ9'},{av:'AV29CNDSPRSUBCONPERT',fld:'vCNDSPRSUBCONPERT',pic:'ZZZZZZZZZ9'},{av:'AV30CNDSPRSUBCONPERTN2',fld:'vCNDSPRSUBCONPERTN2',pic:'ZZZZZZZZZ9'},{av:'AV31CNDSPRSUBCONPERTN3',fld:'vCNDSPRSUBCONPERTN3',pic:'ZZZZZZZZZ9'},{av:'AV32CNDSPRSUBCONPERTN4',fld:'vCNDSPRSUBCONPERTN4',pic:'ZZZZZZZZZ9'},{av:'AV26CNDSPRSUBCONPERTN5',fld:'vCNDSPRSUBCONPERTN5',pic:'ZZZZZZZZZ9'},{av:'AV34MostrarLinea',fld:'vMOSTRARLINEA',pic:''},{av:'AV33Abierto',fld:'vABIERTO',pic:'9'}]}");
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
      wcpOAV14CNDSPRTDC = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9SDTIndSubCon = new GXBaseCollection<com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem>(com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem.class, "SDTIndSubConItem", "KDSProyectos", remoteHandle);
      AV55Expand = "" ;
      GXKey = "" ;
      AV14CNDSPRTDC = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV59CNUSERID = "" ;
      A7519CNDSPRTDC = "" ;
      A18153CNDSPRSUBCONCLA = "" ;
      A18154CNDSPRSUBCONDSC = "" ;
      A18155CNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      A18156CNDSPRSUBCONUNIMED = "" ;
      A18157CNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      A18158CNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      A18159CNDSPRSUBCONTIP = "" ;
      AV19CNDSPRSUBCONCLA = "" ;
      AV16CNDSPRSUBCONDSC = "" ;
      AV17CNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      AV20CNDSPRSUBCONUNIMED = "" ;
      AV18CNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      AV21CNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      AV22CNDSPRSUBCONTIP = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV57Colapsar = "" ;
      AV58dscSC = "" ;
      AV41gCNDSPRSUBCONDSC = "" ;
      AV40gCNDSPRSUBCONCLA = "" ;
      AV63gCNDSPRSUBCONCAN_O = DecimalUtil.ZERO ;
      AV44gCNDSPRSUBCONCAN = DecimalUtil.ZERO ;
      AV43gCNDSPRSUBCONUNIMED = "" ;
      AV62gCNDSPRSUBCONPREUNI_O = DecimalUtil.ZERO ;
      AV42gCNDSPRSUBCONPREUNI = DecimalUtil.ZERO ;
      AV45gCNDSPRSUBCONTOT = DecimalUtil.ZERO ;
      AV46gCNDSPRSUBCONTIP = "" ;
      AV60KDSSESSION = httpContext.getWebSession();
      GXt_char1 = "" ;
      scmdbuf = "" ;
      H04942_A7518CNDSPRCIA = new long[1] ;
      H04942_A7519CNDSPRTDC = new String[] {""} ;
      H04942_A7520CNDSPRNDC = new long[1] ;
      H04942_A18146CNDSPRSUBCONID = new long[1] ;
      H04942_A18153CNDSPRSUBCONCLA = new String[] {""} ;
      H04942_n18153CNDSPRSUBCONCLA = new boolean[] {false} ;
      H04942_A18154CNDSPRSUBCONDSC = new String[] {""} ;
      H04942_n18154CNDSPRSUBCONDSC = new boolean[] {false} ;
      H04942_A18155CNDSPRSUBCONPREUNI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H04942_n18155CNDSPRSUBCONPREUNI = new boolean[] {false} ;
      H04942_A18156CNDSPRSUBCONUNIMED = new String[] {""} ;
      H04942_n18156CNDSPRSUBCONUNIMED = new boolean[] {false} ;
      H04942_A18157CNDSPRSUBCONCAN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H04942_n18157CNDSPRSUBCONCAN = new boolean[] {false} ;
      H04942_A18158CNDSPRSUBCONTOT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H04942_n18158CNDSPRSUBCONTOT = new boolean[] {false} ;
      H04942_A18159CNDSPRSUBCONTIP = new String[] {""} ;
      H04942_n18159CNDSPRSUBCONTIP = new boolean[] {false} ;
      H04942_A18152CNDSPRSUBCONPERTN5 = new long[1] ;
      H04942_n18152CNDSPRSUBCONPERTN5 = new boolean[] {false} ;
      H04942_A18151CNDSPRSUBCONPERTN4 = new long[1] ;
      H04942_n18151CNDSPRSUBCONPERTN4 = new boolean[] {false} ;
      H04942_A18150CNDSPRSUBCONPERTN3 = new long[1] ;
      H04942_n18150CNDSPRSUBCONPERTN3 = new boolean[] {false} ;
      H04942_A18149CNDSPRSUBCONPERTN2 = new long[1] ;
      H04942_n18149CNDSPRSUBCONPERTN2 = new boolean[] {false} ;
      H04942_A18148CNDSPRSUBCONPERT = new long[1] ;
      H04942_n18148CNDSPRSUBCONPERT = new boolean[] {false} ;
      H04942_A18147CNDSPRSUBCONBASE = new long[1] ;
      H04942_n18147CNDSPRSUBCONBASE = new boolean[] {false} ;
      AV35SDTIndSubConItem = new com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem(remoteHandle, context);
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_char2 = new String [1] ;
      GXv_int3 = new long [1] ;
      GXv_decimal7 = new java.math.BigDecimal [1] ;
      GXv_decimal8 = new java.math.BigDecimal [1] ;
      GXv_decimal9 = new java.math.BigDecimal [1] ;
      GXv_decimal10 = new java.math.BigDecimal [1] ;
      GXv_int6 = new long [1] ;
      GXv_char4 = new String [1] ;
      GXv_int5 = new long [1] ;
      lblTxtregresar_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      TempTags = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.kdsproyectos.prompsubcon__default(),
         new Object[] {
             new Object[] {
            H04942_A7518CNDSPRCIA, H04942_A7519CNDSPRTDC, H04942_A7520CNDSPRNDC, H04942_A18146CNDSPRSUBCONID, H04942_A18153CNDSPRSUBCONCLA, H04942_n18153CNDSPRSUBCONCLA, H04942_A18154CNDSPRSUBCONDSC, H04942_n18154CNDSPRSUBCONDSC, H04942_A18155CNDSPRSUBCONPREUNI, H04942_n18155CNDSPRSUBCONPREUNI,
            H04942_A18156CNDSPRSUBCONUNIMED, H04942_n18156CNDSPRSUBCONUNIMED, H04942_A18157CNDSPRSUBCONCAN, H04942_n18157CNDSPRSUBCONCAN, H04942_A18158CNDSPRSUBCONTOT, H04942_n18158CNDSPRSUBCONTOT, H04942_A18159CNDSPRSUBCONTIP, H04942_n18159CNDSPRSUBCONTIP, H04942_A18152CNDSPRSUBCONPERTN5, H04942_n18152CNDSPRSUBCONPERTN5,
            H04942_A18151CNDSPRSUBCONPERTN4, H04942_n18151CNDSPRSUBCONPERTN4, H04942_A18150CNDSPRSUBCONPERTN3, H04942_n18150CNDSPRSUBCONPERTN3, H04942_A18149CNDSPRSUBCONPERTN2, H04942_n18149CNDSPRSUBCONPERTN2, H04942_A18148CNDSPRSUBCONPERT, H04942_n18148CNDSPRSUBCONPERT, H04942_A18147CNDSPRSUBCONBASE, H04942_n18147CNDSPRSUBCONBASE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtindex_Enabled = 0 ;
      edtavColapsar_Enabled = 0 ;
      edtavDscsc_Enabled = 0 ;
      edtavGcndsprsubcondsc_Enabled = 0 ;
      edtavGcndsprsubconcla_Enabled = 0 ;
      edtavGcndsprsubconcan_o_Enabled = 0 ;
      edtavGcndsprsubconcan_Enabled = 0 ;
      edtavGcndsprsubconunimed_Enabled = 0 ;
      edtavGcndsprsubconpreuni_o_Enabled = 0 ;
      edtavGcndsprsubconpreuni_Enabled = 0 ;
      edtavGcndsprsubcontot_Enabled = 0 ;
      edtavGcndsprsubcontip_Enabled = 0 ;
      edtavGcndsprsubconid_Enabled = 0 ;
      edtavGcndsprsubconbase_Enabled = 0 ;
      edtavGcndsprsubconpert_Enabled = 0 ;
      edtavGcndsprsubconpertn2_Enabled = 0 ;
      edtavGcndsprsubconpertn3_Enabled = 0 ;
      edtavGcndsprsubconpertn4_Enabled = 0 ;
      edtavGcndsprsubconpertn5_Enabled = 0 ;
      edtavNodo_abierto_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV33Abierto ;
   private byte AV54nodo_abierto ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_25 ;
   private short nGXsfl_25_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV64bandera ;
   private short nGXsfl_25_fel_idx=1 ;
   private int subGrid1_Islastpage ;
   private int edtavSdtindex_Enabled ;
   private int edtavColapsar_Enabled ;
   private int edtavDscsc_Enabled ;
   private int edtavGcndsprsubcondsc_Enabled ;
   private int edtavGcndsprsubconcla_Enabled ;
   private int edtavGcndsprsubconcan_o_Enabled ;
   private int edtavGcndsprsubconcan_Enabled ;
   private int edtavGcndsprsubconunimed_Enabled ;
   private int edtavGcndsprsubconpreuni_o_Enabled ;
   private int edtavGcndsprsubconpreuni_Enabled ;
   private int edtavGcndsprsubcontot_Enabled ;
   private int edtavGcndsprsubcontip_Enabled ;
   private int edtavGcndsprsubconid_Enabled ;
   private int edtavGcndsprsubconbase_Enabled ;
   private int edtavGcndsprsubconpert_Enabled ;
   private int edtavGcndsprsubconpertn2_Enabled ;
   private int edtavGcndsprsubconpertn3_Enabled ;
   private int edtavGcndsprsubconpertn4_Enabled ;
   private int edtavGcndsprsubconpertn5_Enabled ;
   private int edtavNodo_abierto_Enabled ;
   private int AV68GXV1 ;
   private int AV69GXV2 ;
   private int AV70GXV3 ;
   private int AV71GXV4 ;
   private int AV72GXV5 ;
   private int AV73GXV6 ;
   private int AV74GXV7 ;
   private int AV75GXV8 ;
   private int AV76GXV9 ;
   private int AV77GXV10 ;
   private int AV78GXV11 ;
   private int AV79GXV12 ;
   private int AV80GXV13 ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavSdtindex_Visible ;
   private int edtavColapsar_Visible ;
   private int edtavDscsc_Visible ;
   private int edtavGcndsprsubcondsc_Visible ;
   private int edtavGcndsprsubconcla_Visible ;
   private int edtavGcndsprsubconcan_o_Visible ;
   private int edtavGcndsprsubconcan_Visible ;
   private int edtavGcndsprsubconunimed_Visible ;
   private int edtavGcndsprsubconpreuni_o_Visible ;
   private int edtavGcndsprsubconpreuni_Visible ;
   private int edtavGcndsprsubcontot_Visible ;
   private int edtavGcndsprsubcontip_Visible ;
   private int edtavGcndsprsubconid_Visible ;
   private int edtavGcndsprsubconbase_Visible ;
   private int edtavGcndsprsubconpert_Visible ;
   private int edtavGcndsprsubconpertn2_Visible ;
   private int edtavGcndsprsubconpertn3_Visible ;
   private int edtavGcndsprsubconpertn4_Visible ;
   private int edtavGcndsprsubconpertn5_Visible ;
   private int edtavNodo_abierto_Visible ;
   private long wcpOAV13CNDSPRCIA ;
   private long wcpOAV15CNDSPRNDC ;
   private long AV13CNDSPRCIA ;
   private long AV15CNDSPRNDC ;
   private long A18147CNDSPRSUBCONBASE ;
   private long A18148CNDSPRSUBCONPERT ;
   private long A18149CNDSPRSUBCONPERTN2 ;
   private long A18150CNDSPRSUBCONPERTN3 ;
   private long A18151CNDSPRSUBCONPERTN4 ;
   private long A18152CNDSPRSUBCONPERTN5 ;
   private long A7518CNDSPRCIA ;
   private long A7520CNDSPRNDC ;
   private long A18146CNDSPRSUBCONID ;
   private long AV36CNDSPRSUBCONID ;
   private long AV28CNDSPRSUBCONBASE ;
   private long AV29CNDSPRSUBCONPERT ;
   private long AV30CNDSPRSUBCONPERTN2 ;
   private long AV31CNDSPRSUBCONPERTN3 ;
   private long AV32CNDSPRSUBCONPERTN4 ;
   private long AV26CNDSPRSUBCONPERTN5 ;
   private long AV10IndexSDT ;
   private long AV53SDTIndex ;
   private long AV39gCNDSPRSUBCONID ;
   private long AV47gCNDSPRSUBCONBASE ;
   private long AV48gCNDSPRSUBCONPERT ;
   private long AV49gCNDSPRSUBCONPERTN2 ;
   private long AV50gCNDSPRSUBCONPERTN3 ;
   private long AV51gCNDSPRSUBCONPERTN4 ;
   private long AV52gCNDSPRSUBCONPERTN5 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int3[] ;
   private long GXv_int6[] ;
   private long GXv_int5[] ;
   private java.math.BigDecimal A18155CNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal A18157CNDSPRSUBCONCAN ;
   private java.math.BigDecimal A18158CNDSPRSUBCONTOT ;
   private java.math.BigDecimal AV17CNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal AV18CNDSPRSUBCONCAN ;
   private java.math.BigDecimal AV21CNDSPRSUBCONTOT ;
   private java.math.BigDecimal AV63gCNDSPRSUBCONCAN_O ;
   private java.math.BigDecimal AV44gCNDSPRSUBCONCAN ;
   private java.math.BigDecimal AV62gCNDSPRSUBCONPREUNI_O ;
   private java.math.BigDecimal AV42gCNDSPRSUBCONPREUNI ;
   private java.math.BigDecimal AV45gCNDSPRSUBCONTOT ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV14CNDSPRTDC ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_25_idx="0001" ;
   private String GXKey ;
   private String AV14CNDSPRTDC ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV59CNUSERID ;
   private String A7519CNDSPRTDC ;
   private String A18153CNDSPRSUBCONCLA ;
   private String A18154CNDSPRSUBCONDSC ;
   private String A18156CNDSPRSUBCONUNIMED ;
   private String A18159CNDSPRSUBCONTIP ;
   private String AV19CNDSPRSUBCONCLA ;
   private String AV16CNDSPRSUBCONDSC ;
   private String AV20CNDSPRSUBCONUNIMED ;
   private String AV22CNDSPRSUBCONTIP ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sStyleString ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtindex_Internalname ;
   private String edtavColapsar_Internalname ;
   private String AV58dscSC ;
   private String edtavDscsc_Internalname ;
   private String AV41gCNDSPRSUBCONDSC ;
   private String edtavGcndsprsubcondsc_Internalname ;
   private String AV40gCNDSPRSUBCONCLA ;
   private String edtavGcndsprsubconcla_Internalname ;
   private String edtavGcndsprsubconcan_o_Internalname ;
   private String edtavGcndsprsubconcan_Internalname ;
   private String AV43gCNDSPRSUBCONUNIMED ;
   private String edtavGcndsprsubconunimed_Internalname ;
   private String edtavGcndsprsubconpreuni_o_Internalname ;
   private String edtavGcndsprsubconpreuni_Internalname ;
   private String edtavGcndsprsubcontot_Internalname ;
   private String AV46gCNDSPRSUBCONTIP ;
   private String edtavGcndsprsubcontip_Internalname ;
   private String edtavGcndsprsubconid_Internalname ;
   private String edtavGcndsprsubconbase_Internalname ;
   private String edtavGcndsprsubconpert_Internalname ;
   private String edtavGcndsprsubconpertn2_Internalname ;
   private String edtavGcndsprsubconpertn3_Internalname ;
   private String edtavGcndsprsubconpertn4_Internalname ;
   private String edtavGcndsprsubconpertn5_Internalname ;
   private String edtavNodo_abierto_Internalname ;
   private String subGrid1_Titlefont ;
   private String subGrid1_Linesfont ;
   private String lblTxtregresar_Caption ;
   private String GXt_char1 ;
   private String lblTxtregresar_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_25_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String tblTable1_Internalname ;
   private String lblTxtregresar_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String subGrid1_Header ;
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCndsprndc_Internalname ;
   private String edtavCndsprndc_Jsonclick ;
   private String TempTags ;
   private String ROClassString ;
   private String edtavSdtindex_Jsonclick ;
   private String edtavColapsar_Jsonclick ;
   private String edtavDscsc_Jsonclick ;
   private String edtavGcndsprsubcondsc_Jsonclick ;
   private String edtavGcndsprsubconcla_Jsonclick ;
   private String edtavGcndsprsubconcan_o_Jsonclick ;
   private String edtavGcndsprsubconcan_Jsonclick ;
   private String edtavGcndsprsubconunimed_Jsonclick ;
   private String edtavGcndsprsubconpreuni_o_Jsonclick ;
   private String edtavGcndsprsubconpreuni_Jsonclick ;
   private String edtavGcndsprsubcontot_Jsonclick ;
   private String edtavGcndsprsubcontip_Jsonclick ;
   private String edtavGcndsprsubconid_Jsonclick ;
   private String edtavGcndsprsubconbase_Jsonclick ;
   private String edtavGcndsprsubconpert_Jsonclick ;
   private String edtavGcndsprsubconpertn2_Jsonclick ;
   private String edtavGcndsprsubconpertn3_Jsonclick ;
   private String edtavGcndsprsubconpertn4_Jsonclick ;
   private String edtavGcndsprsubconpertn5_Jsonclick ;
   private String edtavNodo_abierto_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV34MostrarLinea ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_25_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n18153CNDSPRSUBCONCLA ;
   private boolean n18154CNDSPRSUBCONDSC ;
   private boolean n18155CNDSPRSUBCONPREUNI ;
   private boolean n18156CNDSPRSUBCONUNIMED ;
   private boolean n18157CNDSPRSUBCONCAN ;
   private boolean n18158CNDSPRSUBCONTOT ;
   private boolean n18159CNDSPRSUBCONTIP ;
   private boolean n18152CNDSPRSUBCONPERTN5 ;
   private boolean n18151CNDSPRSUBCONPERTN4 ;
   private boolean n18150CNDSPRSUBCONPERTN3 ;
   private boolean n18149CNDSPRSUBCONPERTN2 ;
   private boolean n18148CNDSPRSUBCONPERT ;
   private boolean n18147CNDSPRSUBCONBASE ;
   private boolean AV38mostrarDato ;
   private String AV55Expand ;
   private String AV57Colapsar ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV60KDSSESSION ;
   private IDataStoreProvider pr_default ;
   private long[] H04942_A7518CNDSPRCIA ;
   private String[] H04942_A7519CNDSPRTDC ;
   private long[] H04942_A7520CNDSPRNDC ;
   private long[] H04942_A18146CNDSPRSUBCONID ;
   private String[] H04942_A18153CNDSPRSUBCONCLA ;
   private boolean[] H04942_n18153CNDSPRSUBCONCLA ;
   private String[] H04942_A18154CNDSPRSUBCONDSC ;
   private boolean[] H04942_n18154CNDSPRSUBCONDSC ;
   private java.math.BigDecimal[] H04942_A18155CNDSPRSUBCONPREUNI ;
   private boolean[] H04942_n18155CNDSPRSUBCONPREUNI ;
   private String[] H04942_A18156CNDSPRSUBCONUNIMED ;
   private boolean[] H04942_n18156CNDSPRSUBCONUNIMED ;
   private java.math.BigDecimal[] H04942_A18157CNDSPRSUBCONCAN ;
   private boolean[] H04942_n18157CNDSPRSUBCONCAN ;
   private java.math.BigDecimal[] H04942_A18158CNDSPRSUBCONTOT ;
   private boolean[] H04942_n18158CNDSPRSUBCONTOT ;
   private String[] H04942_A18159CNDSPRSUBCONTIP ;
   private boolean[] H04942_n18159CNDSPRSUBCONTIP ;
   private long[] H04942_A18152CNDSPRSUBCONPERTN5 ;
   private boolean[] H04942_n18152CNDSPRSUBCONPERTN5 ;
   private long[] H04942_A18151CNDSPRSUBCONPERTN4 ;
   private boolean[] H04942_n18151CNDSPRSUBCONPERTN4 ;
   private long[] H04942_A18150CNDSPRSUBCONPERTN3 ;
   private boolean[] H04942_n18150CNDSPRSUBCONPERTN3 ;
   private long[] H04942_A18149CNDSPRSUBCONPERTN2 ;
   private boolean[] H04942_n18149CNDSPRSUBCONPERTN2 ;
   private long[] H04942_A18148CNDSPRSUBCONPERT ;
   private boolean[] H04942_n18148CNDSPRSUBCONPERT ;
   private long[] H04942_A18147CNDSPRSUBCONBASE ;
   private boolean[] H04942_n18147CNDSPRSUBCONBASE ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem> AV9SDTIndSubCon ;
   private com.kdsproyectos.SdtSDTIndSubCon_SDTIndSubConItem AV35SDTIndSubConItem ;
}

final  class prompsubcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H04942", "SELECT CNDSPRCIA, CNDSPRTDC, CNDSPRNDC, CNDSPRSUBCONID, CNDSPRSUBCONCLA, CNDSPRSUBCONDSC, CNDSPRSUBCONPREUNI, CNDSPRSUBCONUNIMED, CNDSPRSUBCONCAN, CNDSPRSUBCONTOT, CNDSPRSUBCONTIP, CNDSPRSUBCONPERTN5, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERT, CNDSPRSUBCONBASE FROM CNDSPRSUBCON WHERE (CNDSPRCIA = ?) AND (CNDSPRTDC = ( ?)) AND (CNDSPRNDC = ?) ORDER BY CNDSPRSUBCONBASE, CNDSPRSUBCONPERT, CNDSPRSUBCONPERTN2, CNDSPRSUBCONPERTN3, CNDSPRSUBCONPERTN4, CNDSPRSUBCONPERTN5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 500) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5000) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((long[]) buf[28])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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
      }
   }

}

