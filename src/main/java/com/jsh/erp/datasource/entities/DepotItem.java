package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;

public class DepotItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.HeaderId
     *
     * @mbggenerated
     */
    private Long headerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.MaterialId
     *
     * @mbggenerated
     */
    private Long materialid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.MUnit
     *
     * @mbggenerated
     */
    private String munit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OperNumber
     *
     * @mbggenerated
     */
    private BigDecimal opernumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.BasicNumber
     *
     * @mbggenerated
     */
    private BigDecimal basicnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.UnitPrice
     *
     * @mbggenerated
     */
    private BigDecimal unitprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.TaxUnitPrice
     *
     * @mbggenerated
     */
    private BigDecimal taxunitprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.AllPrice
     *
     * @mbggenerated
     */
    private BigDecimal allprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.Img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.Incidentals
     *
     * @mbggenerated
     */
    private BigDecimal incidentals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.DepotId
     *
     * @mbggenerated
     */
    private Long depotid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.AnotherDepotId
     *
     * @mbggenerated
     */
    private Long anotherdepotid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.TaxRate
     *
     * @mbggenerated
     */
    private BigDecimal taxrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.TaxMoney
     *
     * @mbggenerated
     */
    private BigDecimal taxmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.TaxLastMoney
     *
     * @mbggenerated
     */
    private BigDecimal taxlastmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OtherField1
     *
     * @mbggenerated
     */
    private String otherfield1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OtherField2
     *
     * @mbggenerated
     */
    private String otherfield2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OtherField3
     *
     * @mbggenerated
     */
    private String otherfield3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OtherField4
     *
     * @mbggenerated
     */
    private String otherfield4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.OtherField5
     *
     * @mbggenerated
     */
    private String otherfield5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.MType
     *
     * @mbggenerated
     */
    private String mtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_depotitem.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.Id
     *
     * @return the value of jsh_depotitem.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.Id
     *
     * @param id the value for jsh_depotitem.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.HeaderId
     *
     * @return the value of jsh_depotitem.HeaderId
     *
     * @mbggenerated
     */
    public Long getHeaderid() {
        return headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.HeaderId
     *
     * @param headerid the value for jsh_depotitem.HeaderId
     *
     * @mbggenerated
     */
    public void setHeaderid(Long headerid) {
        this.headerid = headerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.MaterialId
     *
     * @return the value of jsh_depotitem.MaterialId
     *
     * @mbggenerated
     */
    public Long getMaterialid() {
        return materialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.MaterialId
     *
     * @param materialid the value for jsh_depotitem.MaterialId
     *
     * @mbggenerated
     */
    public void setMaterialid(Long materialid) {
        this.materialid = materialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.MUnit
     *
     * @return the value of jsh_depotitem.MUnit
     *
     * @mbggenerated
     */
    public String getMunit() {
        return munit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.MUnit
     *
     * @param munit the value for jsh_depotitem.MUnit
     *
     * @mbggenerated
     */
    public void setMunit(String munit) {
        this.munit = munit == null ? null : munit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OperNumber
     *
     * @return the value of jsh_depotitem.OperNumber
     *
     * @mbggenerated
     */
    public BigDecimal getOpernumber() {
        return opernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OperNumber
     *
     * @param opernumber the value for jsh_depotitem.OperNumber
     *
     * @mbggenerated
     */
    public void setOpernumber(BigDecimal opernumber) {
        this.opernumber = opernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.BasicNumber
     *
     * @return the value of jsh_depotitem.BasicNumber
     *
     * @mbggenerated
     */
    public BigDecimal getBasicnumber() {
        return basicnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.BasicNumber
     *
     * @param basicnumber the value for jsh_depotitem.BasicNumber
     *
     * @mbggenerated
     */
    public void setBasicnumber(BigDecimal basicnumber) {
        this.basicnumber = basicnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.UnitPrice
     *
     * @return the value of jsh_depotitem.UnitPrice
     *
     * @mbggenerated
     */
    public BigDecimal getUnitprice() {
        return unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.UnitPrice
     *
     * @param unitprice the value for jsh_depotitem.UnitPrice
     *
     * @mbggenerated
     */
    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.TaxUnitPrice
     *
     * @return the value of jsh_depotitem.TaxUnitPrice
     *
     * @mbggenerated
     */
    public BigDecimal getTaxunitprice() {
        return taxunitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.TaxUnitPrice
     *
     * @param taxunitprice the value for jsh_depotitem.TaxUnitPrice
     *
     * @mbggenerated
     */
    public void setTaxunitprice(BigDecimal taxunitprice) {
        this.taxunitprice = taxunitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.AllPrice
     *
     * @return the value of jsh_depotitem.AllPrice
     *
     * @mbggenerated
     */
    public BigDecimal getAllprice() {
        return allprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.AllPrice
     *
     * @param allprice the value for jsh_depotitem.AllPrice
     *
     * @mbggenerated
     */
    public void setAllprice(BigDecimal allprice) {
        this.allprice = allprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.Remark
     *
     * @return the value of jsh_depotitem.Remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.Remark
     *
     * @param remark the value for jsh_depotitem.Remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.Img
     *
     * @return the value of jsh_depotitem.Img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.Img
     *
     * @param img the value for jsh_depotitem.Img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.Incidentals
     *
     * @return the value of jsh_depotitem.Incidentals
     *
     * @mbggenerated
     */
    public BigDecimal getIncidentals() {
        return incidentals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.Incidentals
     *
     * @param incidentals the value for jsh_depotitem.Incidentals
     *
     * @mbggenerated
     */
    public void setIncidentals(BigDecimal incidentals) {
        this.incidentals = incidentals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.DepotId
     *
     * @return the value of jsh_depotitem.DepotId
     *
     * @mbggenerated
     */
    public Long getDepotid() {
        return depotid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.DepotId
     *
     * @param depotid the value for jsh_depotitem.DepotId
     *
     * @mbggenerated
     */
    public void setDepotid(Long depotid) {
        this.depotid = depotid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.AnotherDepotId
     *
     * @return the value of jsh_depotitem.AnotherDepotId
     *
     * @mbggenerated
     */
    public Long getAnotherdepotid() {
        return anotherdepotid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.AnotherDepotId
     *
     * @param anotherdepotid the value for jsh_depotitem.AnotherDepotId
     *
     * @mbggenerated
     */
    public void setAnotherdepotid(Long anotherdepotid) {
        this.anotherdepotid = anotherdepotid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.TaxRate
     *
     * @return the value of jsh_depotitem.TaxRate
     *
     * @mbggenerated
     */
    public BigDecimal getTaxrate() {
        return taxrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.TaxRate
     *
     * @param taxrate the value for jsh_depotitem.TaxRate
     *
     * @mbggenerated
     */
    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.TaxMoney
     *
     * @return the value of jsh_depotitem.TaxMoney
     *
     * @mbggenerated
     */
    public BigDecimal getTaxmoney() {
        return taxmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.TaxMoney
     *
     * @param taxmoney the value for jsh_depotitem.TaxMoney
     *
     * @mbggenerated
     */
    public void setTaxmoney(BigDecimal taxmoney) {
        this.taxmoney = taxmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.TaxLastMoney
     *
     * @return the value of jsh_depotitem.TaxLastMoney
     *
     * @mbggenerated
     */
    public BigDecimal getTaxlastmoney() {
        return taxlastmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.TaxLastMoney
     *
     * @param taxlastmoney the value for jsh_depotitem.TaxLastMoney
     *
     * @mbggenerated
     */
    public void setTaxlastmoney(BigDecimal taxlastmoney) {
        this.taxlastmoney = taxlastmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OtherField1
     *
     * @return the value of jsh_depotitem.OtherField1
     *
     * @mbggenerated
     */
    public String getOtherfield1() {
        return otherfield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OtherField1
     *
     * @param otherfield1 the value for jsh_depotitem.OtherField1
     *
     * @mbggenerated
     */
    public void setOtherfield1(String otherfield1) {
        this.otherfield1 = otherfield1 == null ? null : otherfield1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OtherField2
     *
     * @return the value of jsh_depotitem.OtherField2
     *
     * @mbggenerated
     */
    public String getOtherfield2() {
        return otherfield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OtherField2
     *
     * @param otherfield2 the value for jsh_depotitem.OtherField2
     *
     * @mbggenerated
     */
    public void setOtherfield2(String otherfield2) {
        this.otherfield2 = otherfield2 == null ? null : otherfield2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OtherField3
     *
     * @return the value of jsh_depotitem.OtherField3
     *
     * @mbggenerated
     */
    public String getOtherfield3() {
        return otherfield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OtherField3
     *
     * @param otherfield3 the value for jsh_depotitem.OtherField3
     *
     * @mbggenerated
     */
    public void setOtherfield3(String otherfield3) {
        this.otherfield3 = otherfield3 == null ? null : otherfield3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OtherField4
     *
     * @return the value of jsh_depotitem.OtherField4
     *
     * @mbggenerated
     */
    public String getOtherfield4() {
        return otherfield4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OtherField4
     *
     * @param otherfield4 the value for jsh_depotitem.OtherField4
     *
     * @mbggenerated
     */
    public void setOtherfield4(String otherfield4) {
        this.otherfield4 = otherfield4 == null ? null : otherfield4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.OtherField5
     *
     * @return the value of jsh_depotitem.OtherField5
     *
     * @mbggenerated
     */
    public String getOtherfield5() {
        return otherfield5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.OtherField5
     *
     * @param otherfield5 the value for jsh_depotitem.OtherField5
     *
     * @mbggenerated
     */
    public void setOtherfield5(String otherfield5) {
        this.otherfield5 = otherfield5 == null ? null : otherfield5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.MType
     *
     * @return the value of jsh_depotitem.MType
     *
     * @mbggenerated
     */
    public String getMtype() {
        return mtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.MType
     *
     * @param mtype the value for jsh_depotitem.MType
     *
     * @mbggenerated
     */
    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_depotitem.tenant_id
     *
     * @return the value of jsh_depotitem.tenant_id
     *
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_depotitem.tenant_id
     *
     * @param tenantId the value for jsh_depotitem.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}