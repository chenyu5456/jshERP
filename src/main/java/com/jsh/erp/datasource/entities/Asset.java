package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Asset {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.assetnameID
     *
     * @mbggenerated
     */
    private Long assetnameid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.location
     *
     * @mbggenerated
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.labels
     *
     * @mbggenerated
     */
    private String labels;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.userID
     *
     * @mbggenerated
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.purchasedate
     *
     * @mbggenerated
     */
    private Date purchasedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.periodofvalidity
     *
     * @mbggenerated
     */
    private Date periodofvalidity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.warrantydate
     *
     * @mbggenerated
     */
    private Date warrantydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.assetnum
     *
     * @mbggenerated
     */
    private String assetnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.serialnum
     *
     * @mbggenerated
     */
    private String serialnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.supplier
     *
     * @mbggenerated
     */
    private Long supplier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.creator
     *
     * @mbggenerated
     */
    private Long creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.updator
     *
     * @mbggenerated
     */
    private Long updator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_asset.addMonth
     *
     * @mbggenerated
     */
    private String addmonth;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.id
     *
     * @return the value of jsh_asset.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.id
     *
     * @param id the value for jsh_asset.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.assetnameID
     *
     * @return the value of jsh_asset.assetnameID
     *
     * @mbggenerated
     */
    public Long getAssetnameid() {
        return assetnameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.assetnameID
     *
     * @param assetnameid the value for jsh_asset.assetnameID
     *
     * @mbggenerated
     */
    public void setAssetnameid(Long assetnameid) {
        this.assetnameid = assetnameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.location
     *
     * @return the value of jsh_asset.location
     *
     * @mbggenerated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.location
     *
     * @param location the value for jsh_asset.location
     *
     * @mbggenerated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.labels
     *
     * @return the value of jsh_asset.labels
     *
     * @mbggenerated
     */
    public String getLabels() {
        return labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.labels
     *
     * @param labels the value for jsh_asset.labels
     *
     * @mbggenerated
     */
    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.status
     *
     * @return the value of jsh_asset.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.status
     *
     * @param status the value for jsh_asset.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.userID
     *
     * @return the value of jsh_asset.userID
     *
     * @mbggenerated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.userID
     *
     * @param userid the value for jsh_asset.userID
     *
     * @mbggenerated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.price
     *
     * @return the value of jsh_asset.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.price
     *
     * @param price the value for jsh_asset.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.purchasedate
     *
     * @return the value of jsh_asset.purchasedate
     *
     * @mbggenerated
     */
    public Date getPurchasedate() {
        return purchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.purchasedate
     *
     * @param purchasedate the value for jsh_asset.purchasedate
     *
     * @mbggenerated
     */
    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.periodofvalidity
     *
     * @return the value of jsh_asset.periodofvalidity
     *
     * @mbggenerated
     */
    public Date getPeriodofvalidity() {
        return periodofvalidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.periodofvalidity
     *
     * @param periodofvalidity the value for jsh_asset.periodofvalidity
     *
     * @mbggenerated
     */
    public void setPeriodofvalidity(Date periodofvalidity) {
        this.periodofvalidity = periodofvalidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.warrantydate
     *
     * @return the value of jsh_asset.warrantydate
     *
     * @mbggenerated
     */
    public Date getWarrantydate() {
        return warrantydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.warrantydate
     *
     * @param warrantydate the value for jsh_asset.warrantydate
     *
     * @mbggenerated
     */
    public void setWarrantydate(Date warrantydate) {
        this.warrantydate = warrantydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.assetnum
     *
     * @return the value of jsh_asset.assetnum
     *
     * @mbggenerated
     */
    public String getAssetnum() {
        return assetnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.assetnum
     *
     * @param assetnum the value for jsh_asset.assetnum
     *
     * @mbggenerated
     */
    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.serialnum
     *
     * @return the value of jsh_asset.serialnum
     *
     * @mbggenerated
     */
    public String getSerialnum() {
        return serialnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.serialnum
     *
     * @param serialnum the value for jsh_asset.serialnum
     *
     * @mbggenerated
     */
    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum == null ? null : serialnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.supplier
     *
     * @return the value of jsh_asset.supplier
     *
     * @mbggenerated
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.supplier
     *
     * @param supplier the value for jsh_asset.supplier
     *
     * @mbggenerated
     */
    public void setSupplier(Long supplier) {
        this.supplier = supplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.createtime
     *
     * @return the value of jsh_asset.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.createtime
     *
     * @param createtime the value for jsh_asset.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.creator
     *
     * @return the value of jsh_asset.creator
     *
     * @mbggenerated
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.creator
     *
     * @param creator the value for jsh_asset.creator
     *
     * @mbggenerated
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.updatetime
     *
     * @return the value of jsh_asset.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.updatetime
     *
     * @param updatetime the value for jsh_asset.updatetime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.updator
     *
     * @return the value of jsh_asset.updator
     *
     * @mbggenerated
     */
    public Long getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.updator
     *
     * @param updator the value for jsh_asset.updator
     *
     * @mbggenerated
     */
    public void setUpdator(Long updator) {
        this.updator = updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.tenant_id
     *
     * @return the value of jsh_asset.tenant_id
     *
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.tenant_id
     *
     * @param tenantId the value for jsh_asset.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.description
     *
     * @return the value of jsh_asset.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.description
     *
     * @param description the value for jsh_asset.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_asset.addMonth
     *
     * @return the value of jsh_asset.addMonth
     *
     * @mbggenerated
     */
    public String getAddmonth() {
        return addmonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_asset.addMonth
     *
     * @param addmonth the value for jsh_asset.addMonth
     *
     * @mbggenerated
     */
    public void setAddmonth(String addmonth) {
        this.addmonth = addmonth == null ? null : addmonth.trim();
    }
}