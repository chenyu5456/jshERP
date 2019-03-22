package com.jsh.erp.datasource.entities;

public class InOutItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_inoutitem.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_inoutitem.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_inoutitem.Type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_inoutitem.Remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_inoutitem.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_inoutitem.Id
     *
     * @return the value of jsh_inoutitem.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_inoutitem.Id
     *
     * @param id the value for jsh_inoutitem.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_inoutitem.Name
     *
     * @return the value of jsh_inoutitem.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_inoutitem.Name
     *
     * @param name the value for jsh_inoutitem.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_inoutitem.Type
     *
     * @return the value of jsh_inoutitem.Type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_inoutitem.Type
     *
     * @param type the value for jsh_inoutitem.Type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_inoutitem.Remark
     *
     * @return the value of jsh_inoutitem.Remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_inoutitem.Remark
     *
     * @param remark the value for jsh_inoutitem.Remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_inoutitem.tenant_id
     *
     * @return the value of jsh_inoutitem.tenant_id
     *
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_inoutitem.tenant_id
     *
     * @param tenantId the value for jsh_inoutitem.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}