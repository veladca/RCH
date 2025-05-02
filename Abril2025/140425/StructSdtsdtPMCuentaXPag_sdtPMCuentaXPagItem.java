/*
               File: StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem
        Description: sdtPMCuentaXPag
             Author: GeneXus Java Generator version 16_0_1-129648
       Generated on: April 17, 2025 14:2:37.96
       Program type: Callable routine
          Main DBMS: PostgreSQL
*/
package com.kdsproyectos ;
import com.genexus.*;

public final  class StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem implements Cloneable, java.io.Serializable
{
   public StructSdtsdtPMCuentaXPag_sdtPMCuentaXPagItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = cal.getTime() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = cal.getTime() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = cal.getTime() ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 = "" ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(1) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(1) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public long getPmempresa( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa ;
   }

   public void setPmempresa( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa = value ;
   }

   public String getPmtipodoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc ;
   }

   public void setPmtipodoc( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodoc = value ;
   }

   public long getPmusrcap( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap ;
   }

   public void setPmusrcap( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap = value ;
   }

   public long getPmnumdoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc ;
   }

   public void setPmnumdoc( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc = value ;
   }

   public long getPmprovid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid ;
   }

   public void setPmprovid( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid = value ;
   }

   public byte getPmlayasoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc ;
   }

   public void setPmlayasoc( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc = value ;
   }

   public String getPmfoliofac( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac ;
   }

   public void setPmfoliofac( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfoliofac = value ;
   }

   public String getPmproyid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid ;
   }

   public void setPmproyid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmproyid = value ;
   }

   public String getPmuuid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid ;
   }

   public void setPmuuid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmuuid = value ;
   }

   public long getPmpdfdoc( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc ;
   }

   public void setPmpdfdoc( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc = value ;
   }

   public java.math.BigDecimal getPmmontp( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp ;
   }

   public void setPmmontp( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp = value ;
   }

   public java.math.BigDecimal getPmmonamort( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort ;
   }

   public void setPmmonamort( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort = value ;
   }

   public String getPmestatus( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus ;
   }

   public void setPmestatus( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmestatus = value ;
   }

   public String getPmungid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid ;
   }

   public void setPmungid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmungid = value ;
   }

   public java.util.Date getPmfechfac( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac ;
   }

   public void setPmfechfac( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac = value ;
   }

   public java.util.Date getPmfechven( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven ;
   }

   public void setPmfechven( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven = value ;
   }

   public String getPmmoneid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid ;
   }

   public void setPmmoneid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneid = value ;
   }

   public java.math.BigDecimal getPmmonex( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex ;
   }

   public void setPmmonex( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex = value ;
   }

   public java.math.BigDecimal getPmmonep( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep ;
   }

   public void setPmmonep( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep = value ;
   }

   public java.math.BigDecimal getPmmonpge( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge ;
   }

   public void setPmmonpge( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge = value ;
   }

   public java.math.BigDecimal getPmmonna( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna ;
   }

   public void setPmmonna( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna = value ;
   }

   public java.math.BigDecimal getPmmonng( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng ;
   }

   public void setPmmonng( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng = value ;
   }

   public java.math.BigDecimal getPmmoneg( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg ;
   }

   public void setPmmoneg( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg = value ;
   }

   public java.math.BigDecimal getPmiva( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva ;
   }

   public void setPmiva( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva = value ;
   }

   public String getPmivaid( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid ;
   }

   public void setPmivaid( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmivaid = value ;
   }

   public java.util.Date getPmfechrev( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev ;
   }

   public void setPmfechrev( java.util.Date value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N = (byte)(0) ;
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev = value ;
   }

   public String getPmcomentarios( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios ;
   }

   public void setPmcomentarios( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcomentarios = value ;
   }

   public java.math.BigDecimal getPmmonnp( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp ;
   }

   public void setPmmonnp( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp = value ;
   }

   public java.math.BigDecimal getPmmonpgn( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn ;
   }

   public void setPmmonpgn( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn = value ;
   }

   public java.math.BigDecimal getPmreten( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten ;
   }

   public void setPmreten( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten = value ;
   }

   public byte getPmpoliz( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz ;
   }

   public void setPmpoliz( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz = value ;
   }

   public byte getPmordend( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend ;
   }

   public void setPmordend( byte value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend = value ;
   }

   public String getPmtipodococ( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ ;
   }

   public void setPmtipodococ( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmtipodococ = value ;
   }

   public long getPmnumdococ( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ ;
   }

   public void setPmnumdococ( long value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ = value ;
   }

   public String getPmcta1( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 ;
   }

   public void setPmcta1( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta1 = value ;
   }

   public String getPmcta2( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 ;
   }

   public void setPmcta2( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta2 = value ;
   }

   public String getPmcta3( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 ;
   }

   public void setPmcta3( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcta3 = value ;
   }

   public java.math.BigDecimal getPmmonivan( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan ;
   }

   public void setPmmonivan( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan = value ;
   }

   public java.math.BigDecimal getPmmonivae( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae ;
   }

   public void setPmmonivae( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae = value ;
   }

   public String getPmcuentadecargo( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo ;
   }

   public void setPmcuentadecargo( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentadecargo = value ;
   }

   public String getPmobspoliza( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza ;
   }

   public void setPmobspoliza( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza = value ;
   }

   public java.math.BigDecimal getPmprant( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant ;
   }

   public void setPmprant( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant = value ;
   }

   public String getPmcuentapr02( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 ;
   }

   public void setPmcuentapr02( String value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmcuentapr02 = value ;
   }

   public java.math.BigDecimal getTpmmonex( )
   {
      return gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex ;
   }

   public void setTpmmonex( java.math.BigDecimal value )
   {
      gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex = value ;
   }

   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmlayasoc ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpoliz ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmordend ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac_N ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven_N ;
   protected byte gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev_N ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmempresa ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmusrcap ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdoc ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprovid ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmpdfdoc ;
   protected long gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmnumdococ ;
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
   protected String gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmobspoliza ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmontp ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonamort ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechfac ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechven ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonex ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonep ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpge ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonna ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonng ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmoneg ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmiva ;
   protected java.util.Date gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmfechrev ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonnp ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonpgn ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmreten ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivan ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmmonivae ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Pmprant ;
   protected java.math.BigDecimal gxTv_SdtsdtPMCuentaXPag_sdtPMCuentaXPagItem_Tpmmonex ;
}

