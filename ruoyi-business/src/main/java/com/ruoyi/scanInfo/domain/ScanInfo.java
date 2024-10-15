package com.ruoyi.scanInfo.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 随申码对象 sh_scan_info
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
public class ScanInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 扫码时间 */
    private Date scanTime;

    /** 国籍 */
    private String isForeigner;

    /** 标志 */
    private String tag;

    /** 系统来源 */
    private String systemSource;

    /** 公司名 */
    private String companyName;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 身份标识 */
    private String card;

    /** 性别 */
    @Excel(name = "性别")
    private Long gender;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birth;

    /** 地区代码 */
    @Excel(name = "地区代码")
    private String regionCode;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 扫码颜色 */
    private String color;

    /** 扫码方法 */
    private String scanMethod;

    /** 扫码经度 */
    @Excel(name = "扫码经度")
    private String scanLatitude;

    /** 扫码纬度 */
    @Excel(name = "扫码纬度")
    private String scanLongitude;

    /** 软删除 */
    private Boolean deleted;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setScanTime(Date scanTime) 
    {
        this.scanTime = scanTime;
    }

    public Date getScanTime() 
    {
        return scanTime;
    }
    public void setIsForeigner(String isForeigner) 
    {
        this.isForeigner = isForeigner;
    }

    public String getIsForeigner() 
    {
        return isForeigner;
    }
    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }
    public void setSystemSource(String systemSource) 
    {
        this.systemSource = systemSource;
    }

    public String getSystemSource() 
    {
        return systemSource;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCard(String card) 
    {
        this.card = card;
    }

    public String getCard() 
    {
        return card;
    }
    public void setGender(Long gender) 
    {
        this.gender = gender;
    }

    public Long getGender() 
    {
        return gender;
    }
    public void setBirth(Date birth) 
    {
        this.birth = birth;
    }

    public Date getBirth() 
    {
        return birth;
    }
    public void setRegionCode(String regionCode) 
    {
        this.regionCode = regionCode;
    }

    public String getRegionCode() 
    {
        return regionCode;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
    public void setScanMethod(String scanMethod) 
    {
        this.scanMethod = scanMethod;
    }

    public String getScanMethod() 
    {
        return scanMethod;
    }
    public void setScanLatitude(String scanLatitude) 
    {
        this.scanLatitude = scanLatitude;
    }

    public String getScanLatitude() 
    {
        return scanLatitude;
    }
    public void setScanLongitude(String scanLongitude) 
    {
        this.scanLongitude = scanLongitude;
    }

    public String getScanLongitude() 
    {
        return scanLongitude;
    }
    public void setDeleted(Boolean deleted) 
    {
        this.deleted = deleted;
    }

    public Boolean getDeleted() 
    {
        return deleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("scanTime", getScanTime())
            .append("isForeigner", getIsForeigner())
            .append("tag", getTag())
            .append("systemSource", getSystemSource())
            .append("companyName", getCompanyName())
            .append("name", getName())
            .append("card", getCard())
            .append("gender", getGender())
            .append("birth", getBirth())
            .append("regionCode", getRegionCode())
            .append("phone", getPhone())
            .append("color", getColor())
            .append("scanMethod", getScanMethod())
            .append("scanLatitude", getScanLatitude())
            .append("scanLongitude", getScanLongitude())
            .append("deleted", getDeleted())
            .toString();
    }
}
