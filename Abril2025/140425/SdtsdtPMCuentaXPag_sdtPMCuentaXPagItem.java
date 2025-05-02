/*
               File: SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem
        Description: sdtPMCuentaXPag
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: April 17, 2025 14:2:37.39
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.kdsproyectos.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem( )
   {
      this(  new ModelContext(SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem.class));
   }

   public SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem( ModelContext context )
   {
      super( context, "SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem");
   }

   public SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem");
   }

   public SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem( StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMEmpresa") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMTipoDoc") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMUsrcap") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMNumDoc") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMProvId") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMLayAsoc") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc = (byte)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMFolioFac") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMProyId") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMUuid") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMPDFDoc") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMontp") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonAmort") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMEstatus") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMUngId") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMFechFac") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = GXutil.nullDate() ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(0) ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMFechVen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = GXutil.nullDate() ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(0) ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMoneId") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonEx") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonEp") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonPgE") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonNa") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonNg") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonEg") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMIva") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMIVAID") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMFechRev") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = GXutil.nullDate() ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(0) ;
                  gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMComentarios") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonNp") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonPgN") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMReten") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMPoliz") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz = (byte)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMOrdenD") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend = (byte)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMTipoDocOc") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMNumDocOC") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ = (long)(getnumericvalue(oReader)) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMCTA1") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMCTA2") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMCTA3") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonIvaN") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMMonIvaE") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMCuentadeCargo") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMObsPoliza") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMPRANT") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMCuentaPR02") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TPMMonEx") )
            {
               gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "sdtPMCuentaXPag.sdtPMCuentaXPagItem" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("PMEmpresa", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMTipoDoc", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMUsrcap", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMNumDoc", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMProvId", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMLayAsoc", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMFolioFac", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMProyId", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMUuid", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMPDFDoc", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMontp", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp, 17, 6)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonAmort", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort, 15, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMEstatus", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMUngId", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac) && ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N == 1 ) )
      {
         oWriter.writeElement("PMFechFac", "");
         if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
         {
            oWriter.writeAttribute("xmlns", "KDSProyectos");
         }
      }
      else
      {
         if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac) )
         {
            oWriter.writeStartElement("PMFechFac");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("PMFechFac", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
            {
               oWriter.writeAttribute("xmlns", "KDSProyectos");
            }
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven) && ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N == 1 ) )
      {
         oWriter.writeElement("PMFechVen", "");
         if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
         {
            oWriter.writeAttribute("xmlns", "KDSProyectos");
         }
      }
      else
      {
         if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven) )
         {
            oWriter.writeStartElement("PMFechVen");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("PMFechVen", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
            {
               oWriter.writeAttribute("xmlns", "KDSProyectos");
            }
         }
      }
      oWriter.writeElement("PMMoneId", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonEx", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonEp", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonPgE", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonNa", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonNg", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonEg", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMIva", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMIVAID", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev) && ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N == 1 ) )
      {
         oWriter.writeElement("PMFechRev", "");
         if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
         {
            oWriter.writeAttribute("xmlns", "KDSProyectos");
         }
      }
      else
      {
         if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev) )
         {
            oWriter.writeStartElement("PMFechRev");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("PMFechRev", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
            {
               oWriter.writeAttribute("xmlns", "KDSProyectos");
            }
         }
      }
      oWriter.writeElement("PMComentarios", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonNp", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonPgN", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMReten", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMPoliz", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMOrdenD", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMTipoDocOc", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMNumDocOC", GXutil.trim( GXutil.str( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMCTA1", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMCTA2", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMCTA3", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonIvaN", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMMonIvaE", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMCuentadeCargo", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMObsPoliza", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMPRANT", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("PMCuentaPR02", GXutil.rtrim( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeElement("TPMMonEx", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex, 17, 2)));
      if ( GXutil.strcmp(sNameSpace, "KDSProyectos") != 0 )
      {
         oWriter.writeAttribute("xmlns", "KDSProyectos");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( com.genexus.xml.XMLReader oReader )
   {
      if ( GXutil.notNumeric( oReader.getValue()) )
      {
         formatError = true ;
      }
      return GXutil.lval( oReader.getValue()) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("PMEmpresa", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa, false);
      AddObjectProperty("PMTipoDoc", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc, false);
      AddObjectProperty("PMUsrcap", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap, false);
      AddObjectProperty("PMNumDoc", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc, false);
      AddObjectProperty("PMProvId", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid, false);
      AddObjectProperty("PMLayAsoc", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc, false);
      AddObjectProperty("PMFolioFac", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac, false);
      AddObjectProperty("PMProyId", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid, false);
      AddObjectProperty("PMUuid", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid, false);
      AddObjectProperty("PMPDFDoc", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc, false);
      AddObjectProperty("PMMontp", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp, 17, 6)), false);
      AddObjectProperty("PMMonAmort", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort, false);
      AddObjectProperty("PMEstatus", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus, false);
      AddObjectProperty("PMUngId", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PMFechFac", sDateCnv, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PMFechVen", sDateCnv, false);
      AddObjectProperty("PMMoneId", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid, false);
      AddObjectProperty("PMMonEx", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex, 17, 2)), false);
      AddObjectProperty("PMMonEp", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep, 17, 2)), false);
      AddObjectProperty("PMMonPgE", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge, 17, 2)), false);
      AddObjectProperty("PMMonNa", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna, 17, 2)), false);
      AddObjectProperty("PMMonNg", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng, 17, 2)), false);
      AddObjectProperty("PMMonEg", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg, 17, 2)), false);
      AddObjectProperty("PMIva", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva, 17, 2)), false);
      AddObjectProperty("PMIVAID", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PMFechRev", sDateCnv, false);
      AddObjectProperty("PMComentarios", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios, false);
      AddObjectProperty("PMMonNp", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp, 17, 2)), false);
      AddObjectProperty("PMMonPgN", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn, 17, 2)), false);
      AddObjectProperty("PMReten", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten, 17, 2)), false);
      AddObjectProperty("PMPoliz", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz, false);
      AddObjectProperty("PMOrdenD", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend, false);
      AddObjectProperty("PMTipoDocOc", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ, false);
      AddObjectProperty("PMNumDocOC", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ, false);
      AddObjectProperty("PMCTA1", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1, false);
      AddObjectProperty("PMCTA2", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2, false);
      AddObjectProperty("PMCTA3", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3, false);
      AddObjectProperty("PMMonIvaN", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan, 17, 2)), false);
      AddObjectProperty("PMMonIvaE", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae, 17, 2)), false);
      AddObjectProperty("PMCuentadeCargo", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo, false);
      AddObjectProperty("PMObsPoliza", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza, false);
      AddObjectProperty("PMPRANT", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant, false);
      AddObjectProperty("PMCuentaPR02", gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02, false);
      AddObjectProperty("TPMMonEx", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex, 17, 2)), false);
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc = value ;
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap = value ;
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc = value ;
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid = value ;
   }

   public byte getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid = value ;
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid = value ;
   }

   public java.util.Date getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = value ;
   }

   public java.util.Date getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid = value ;
   }

   public java.util.Date getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten = value ;
   }

   public byte getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz = value ;
   }

   public byte getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ = value ;
   }

   public long getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant = value ;
   }

   public String getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex ;
   }

   public void setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = GXutil.nullDate() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(1) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = GXutil.nullDate() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(1) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = GXutil.nullDate() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(1) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant = DecimalUtil.ZERO ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public com.kdsproyectos.SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem Clone( )
   {
      return (com.kdsproyectos.SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem)(clone()) ;
   }

   public void setStruct( com.kdsproyectos.StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem struct )
   {
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa(struct.getPmempresa());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc(struct.getPmtipodoc());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap(struct.getPmusrcap());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc(struct.getPmnumdoc());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid(struct.getPmprovid());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc(struct.getPmlayasoc());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac(struct.getPmfoliofac());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid(struct.getPmproyid());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid(struct.getPmuuid());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc(struct.getPmpdfdoc());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp(struct.getPmmontp());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort(struct.getPmmonamort());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus(struct.getPmestatus());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid(struct.getPmungid());
      if ( struct.gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N == 0 )
      {
         setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac(struct.getPmfechfac());
      }
      if ( struct.gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N == 0 )
      {
         setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven(struct.getPmfechven());
      }
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid(struct.getPmmoneid());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex(struct.getPmmonex());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep(struct.getPmmonep());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge(struct.getPmmonpge());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna(struct.getPmmonna());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng(struct.getPmmonng());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg(struct.getPmmoneg());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva(struct.getPmiva());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid(struct.getPmivaid());
      if ( struct.gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N == 0 )
      {
         setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev(struct.getPmfechrev());
      }
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios(struct.getPmcomentarios());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp(struct.getPmmonnp());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn(struct.getPmmonpgn());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten(struct.getPmreten());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz(struct.getPmpoliz());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend(struct.getPmordend());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ(struct.getPmtipodococ());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ(struct.getPmnumdococ());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1(struct.getPmcta1());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2(struct.getPmcta2());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3(struct.getPmcta3());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan(struct.getPmmonivan());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae(struct.getPmmonivae());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo(struct.getPmcuentadecargo());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza(struct.getPmobspoliza());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant(struct.getPmprant());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02(struct.getPmcuentapr02());
      setgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex(struct.getTpmmonex());
   }

   public com.kdsproyectos.StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem getStruct( )
   {
      com.kdsproyectos.StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem struct = new com.kdsproyectos.StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem ();
      struct.setPmempresa(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa());
      struct.setPmtipodoc(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc());
      struct.setPmusrcap(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap());
      struct.setPmnumdoc(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc());
      struct.setPmprovid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid());
      struct.setPmlayasoc(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc());
      struct.setPmfoliofac(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac());
      struct.setPmproyid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid());
      struct.setPmuuid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid());
      struct.setPmpdfdoc(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc());
      struct.setPmmontp(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp());
      struct.setPmmonamort(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort());
      struct.setPmestatus(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus());
      struct.setPmungid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid());
      if ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N == 0 )
      {
         struct.setPmfechfac(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac());
      }
      if ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N == 0 )
      {
         struct.setPmfechven(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven());
      }
      struct.setPmmoneid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid());
      struct.setPmmonex(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex());
      struct.setPmmonep(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep());
      struct.setPmmonpge(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge());
      struct.setPmmonna(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna());
      struct.setPmmonng(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng());
      struct.setPmmoneg(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg());
      struct.setPmiva(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva());
      struct.setPmivaid(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid());
      if ( gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N == 0 )
      {
         struct.setPmfechrev(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev());
      }
      struct.setPmcomentarios(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios());
      struct.setPmmonnp(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp());
      struct.setPmmonpgn(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn());
      struct.setPmreten(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten());
      struct.setPmpoliz(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz());
      struct.setPmordend(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend());
      struct.setPmtipodococ(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ());
      struct.setPmnumdococ(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ());
      struct.setPmcta1(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1());
      struct.setPmcta2(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2());
      struct.setPmcta3(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3());
      struct.setPmmonivan(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan());
      struct.setPmmonivae(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae());
      struct.setPmcuentadecargo(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo());
      struct.setPmobspoliza(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza());
      struct.setPmprant(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant());
      struct.setPmcuentapr02(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02());
      struct.setTpmmonex(getgxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex());
      return struct ;
   }

   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza ;
}

